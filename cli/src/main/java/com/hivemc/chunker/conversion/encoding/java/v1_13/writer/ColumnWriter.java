package com.hivemc.chunker.conversion.encoding.java.v1_13.writer;

import com.hivemc.chunker.conversion.encoding.base.Converter;
import com.hivemc.chunker.conversion.encoding.java.base.resolver.JavaResolvers;
import com.hivemc.chunker.conversion.encoding.java.base.writer.JavaChunkWriter;
import com.hivemc.chunker.conversion.encoding.java.base.writer.JavaWorldWriter;
import com.hivemc.chunker.conversion.intermediate.column.ChunkerColumn;
import com.hivemc.chunker.conversion.intermediate.column.biome.ChunkerBiome;
import com.hivemc.chunker.conversion.intermediate.world.Dimension;
import com.hivemc.chunker.nbt.tags.TagWithName;
import com.hivemc.chunker.nbt.tags.array.IntArrayTag;
import com.hivemc.chunker.nbt.tags.collection.CompoundTag;

public class ColumnWriter extends com.hivemc.chunker.conversion.encoding.java.v1_11.writer.ColumnWriter {
    public ColumnWriter(JavaWorldWriter parent, Converter converter, JavaResolvers resolvers, Dimension dimension) {
        super(parent, converter, resolvers, dimension);
    }

    @Override
    protected void preProcessColumn(ChunkerColumn column, CompoundTag columnNBT) {
        // Call parent
        super.preProcessColumn(column, columnNBT);

        // Add a Status tag
        writeColumnStatus(column, columnNBT);
    }

    protected void writeColumnStatus(ChunkerColumn column, CompoundTag columnNBT) {
        columnNBT.put("Status", "decorated");
    }

    @Override
    protected TagWithName<?> writeHeightMap(ChunkerColumn column) {
        // HeightMap isn't written as it changed
        return null;
    }

    @Override
    protected TagWithName<?> writeBiomes(ChunkerColumn column) {
        if (column.getBiomes() == null) return null; // Skip if not present

        // Written as columns
        ChunkerBiome[] columnBiomes = column.getBiomes().asColumn(resolvers.getFallbackBiome(dimension));

        // Loop through each biome and convert it to an int
        int[] biomes = new int[columnBiomes.length];
        for (int i = 0; i < biomes.length; i++) {
            biomes[i] = resolvers.writeBiomeID(columnBiomes[i], dimension);
        }

        return new TagWithName<>("Biomes", new IntArrayTag(biomes));
    }

    @Override
    public JavaChunkWriter createChunkWriter(ChunkerColumn column) {
        return new ChunkWriter(converter, resolvers, dimension, column);
    }
}
