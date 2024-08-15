package com.hivemc.chunker.conversion.encoding.java.v1_11.writer;

import com.hivemc.chunker.conversion.encoding.base.Converter;
import com.hivemc.chunker.conversion.encoding.java.base.resolver.JavaResolvers;
import com.hivemc.chunker.conversion.encoding.java.base.writer.JavaChunkWriter;
import com.hivemc.chunker.conversion.encoding.java.base.writer.JavaColumnWriter;
import com.hivemc.chunker.conversion.encoding.java.base.writer.JavaWorldWriter;
import com.hivemc.chunker.conversion.intermediate.column.ChunkerColumn;
import com.hivemc.chunker.conversion.intermediate.world.Dimension;

public class ColumnWriter extends JavaColumnWriter {
    public ColumnWriter(JavaWorldWriter parent, Converter converter, JavaResolvers resolvers, Dimension dimension) {
        super(parent, converter, resolvers, dimension);
    }

    @Override
    public JavaChunkWriter createChunkWriter(ChunkerColumn column) {
        return new ChunkWriter(converter, resolvers, dimension, column);
    }
}