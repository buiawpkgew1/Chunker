package com.hivemc.chunker.conversion.encoding.java.base.resolver.identifier;

import com.hivemc.chunker.conversion.encoding.base.resolver.identifier.state.TypeMapping;
import com.hivemc.chunker.conversion.intermediate.column.chunk.identifier.type.block.states.vanilla.types.*;

/**
 * A list of types which map how values should be converted between Bedrock and Chunker.
 */
public class JavaStateTypes {
    public static final TypeMapping<String, Age_1> AGE_1 = new TypeMapping.Builder<String, Age_1>()
            .mapping("0", Age_1._0)
            .mapping("1", Age_1._1)
            .build();
    public static final TypeMapping<String, Age_15> AGE_15 = new TypeMapping.Builder<String, Age_15>()
            .mapping("0", Age_15._0)
            .mapping("1", Age_15._1)
            .mapping("2", Age_15._2)
            .mapping("3", Age_15._3)
            .mapping("4", Age_15._4)
            .mapping("5", Age_15._5)
            .mapping("6", Age_15._6)
            .mapping("7", Age_15._7)
            .mapping("8", Age_15._8)
            .mapping("9", Age_15._9)
            .mapping("10", Age_15._10)
            .mapping("11", Age_15._11)
            .mapping("12", Age_15._12)
            .mapping("13", Age_15._13)
            .mapping("14", Age_15._14)
            .mapping("15", Age_15._15)
            .build();
    public static final TypeMapping<String, Age_2> AGE_2 = new TypeMapping.Builder<String, Age_2>()
            .mapping("0", Age_2._0)
            .mapping("1", Age_2._1)
            .mapping("2", Age_2._2)
            .build();
    public static final TypeMapping<String, Age_25> AGE_25 = new TypeMapping.Builder<String, Age_25>()
            .mapping("0", Age_25._0)
            .mapping("1", Age_25._1)
            .mapping("2", Age_25._2)
            .mapping("3", Age_25._3)
            .mapping("4", Age_25._4)
            .mapping("5", Age_25._5)
            .mapping("6", Age_25._6)
            .mapping("7", Age_25._7)
            .mapping("8", Age_25._8)
            .mapping("9", Age_25._9)
            .mapping("10", Age_25._10)
            .mapping("11", Age_25._11)
            .mapping("12", Age_25._12)
            .mapping("13", Age_25._13)
            .mapping("14", Age_25._14)
            .mapping("15", Age_25._15)
            .mapping("16", Age_25._16)
            .mapping("17", Age_25._17)
            .mapping("18", Age_25._18)
            .mapping("19", Age_25._19)
            .mapping("20", Age_25._20)
            .mapping("21", Age_25._21)
            .mapping("22", Age_25._22)
            .mapping("23", Age_25._23)
            .mapping("24", Age_25._24)
            .mapping("25", Age_25._25)
            .build();
    public static final TypeMapping<String, Age_1> AGE_2_TO_1 = new TypeMapping.Builder<String, Age_1>()
            .mapping("0", Age_1._0)
            .mapping("1", Age_1._1)
            .mapping("2", Age_1._1)
            .build();
    public static final TypeMapping<String, Age_3> AGE_3 = new TypeMapping.Builder<String, Age_3>()
            .mapping("0", Age_3._0)
            .mapping("1", Age_3._1)
            .mapping("2", Age_3._2)
            .mapping("3", Age_3._3)
            .build();
    public static final TypeMapping<String, Age_7> AGE_3_TO_7 = new TypeMapping.Builder<String, Age_7>()
            .mapping("0", Age_7._0)
            .mapping("0", Age_7._1)
            .mapping("1", Age_7._2)
            .mapping("1", Age_7._3)
            .mapping("2", Age_7._4)
            .mapping("2", Age_7._5)
            .mapping("2", Age_7._6)
            .mapping("3", Age_7._7)
            .build();
    public static final TypeMapping<String, Age_4> AGE_4 = new TypeMapping.Builder<String, Age_4>()
            .mapping("0", Age_4._0)
            .mapping("1", Age_4._1)
            .mapping("2", Age_4._2)
            .mapping("3", Age_4._3)
            .mapping("4", Age_4._4)
            .build();
    public static final TypeMapping<String, Age_5> AGE_5 = new TypeMapping.Builder<String, Age_5>()
            .mapping("0", Age_5._0)
            .mapping("1", Age_5._1)
            .mapping("2", Age_5._2)
            .mapping("3", Age_5._3)
            .mapping("4", Age_5._4)
            .mapping("5", Age_5._5)
            .build();
    public static final TypeMapping<String, Age_7> AGE_7 = new TypeMapping.Builder<String, Age_7>()
            .mapping("0", Age_7._0)
            .mapping("1", Age_7._1)
            .mapping("2", Age_7._2)
            .mapping("3", Age_7._3)
            .mapping("4", Age_7._4)
            .mapping("5", Age_7._5)
            .mapping("6", Age_7._6)
            .mapping("7", Age_7._7)
            .build();
    public static final TypeMapping<String, AttachmentType> ATTACHMENT_TYPE = new TypeMapping.Builder<String, AttachmentType>()
            .mapping("floor", AttachmentType.FLOOR)
            .mapping("wall", AttachmentType.WALL)
            .mapping("ceiling", AttachmentType.CEILING)
            .build();
    public static final TypeMapping<String, Axis> AXIS = new TypeMapping.Builder<String, Axis>()
            .mapping("x", Axis.X)
            .mapping("y", Axis.Y)
            .mapping("z", Axis.Z)
            .build();
    public static final TypeMapping<String, AxisHorizontal> AXIS_HORIZONTAL = new TypeMapping.Builder<String, AxisHorizontal>()
            .mapping("x", AxisHorizontal.X)
            .mapping("z", AxisHorizontal.Z)
            .build();
    public static final TypeMapping<String, BambooLeafSize> BAMBOO_LEAF_SIZE = new TypeMapping.Builder<String, BambooLeafSize>()
            .mapping("none", BambooLeafSize.NONE)
            .mapping("small", BambooLeafSize.SMALL)
            .mapping("large", BambooLeafSize.LARGE)
            .build();
    public static final TypeMapping<String, BedPart> BED_PART = new TypeMapping.Builder<String, BedPart>()
            .mapping("head", BedPart.HEAD)
            .mapping("foot", BedPart.FOOT)
            .build();
    public static final TypeMapping<String, BellAttachmentType> BELL_ATTACHMENT = new TypeMapping.Builder<String, BellAttachmentType>()
            .mapping("floor", BellAttachmentType.FLOOR)
            .mapping("ceiling", BellAttachmentType.CEILING)
            .mapping("single_wall", BellAttachmentType.SINGLE_WALL)
            .mapping("double_wall", BellAttachmentType.DOUBLE_WALL)
            .build();
    public static final TypeMapping<String, Bites> BITES = new TypeMapping.Builder<String, Bites>()
            .mapping("0", Bites._0)
            .mapping("1", Bites._1)
            .mapping("2", Bites._2)
            .mapping("3", Bites._3)
            .mapping("4", Bites._4)
            .mapping("5", Bites._5)
            .mapping("6", Bites._6)
            .build();
    public static final TypeMapping<String, Bool> BOOL = new TypeMapping.Builder<String, Bool>()
            .mapping("true", Bool.TRUE)
            .mapping("false", Bool.FALSE)
            .build();
    public static final TypeMapping<String, WallHeight> BOOL_TO_WALL_HEIGHT = new TypeMapping.Builder<String, WallHeight>()
            .mapping("false", WallHeight.NONE)
            .mapping("true", WallHeight.LOW)
            .mapping("true", WallHeight.TALL)
            .build();
    public static final TypeMapping<String, Candles> CANDLES = new TypeMapping.Builder<String, Candles>()
            .mapping("1", Candles._1)
            .mapping("2", Candles._2)
            .mapping("3", Candles._3)
            .mapping("4", Candles._4)
            .build();
    public static final TypeMapping<String, CauldronLevel> CAULDRON_LEVEL = new TypeMapping.Builder<String, CauldronLevel>()
            // Java only has 3 states for cauldron level
            .mapping("1", CauldronLevel._2)
            .mapping("1", CauldronLevel._1)
            .mapping("2", CauldronLevel._4)
            .mapping("2", CauldronLevel._3)
            .mapping("3", CauldronLevel._6)
            .mapping("3", CauldronLevel._5)
            .build();
    public static final TypeMapping<String, RespawnAnchorCharges> CHARGES = new TypeMapping.Builder<String, RespawnAnchorCharges>()
            .mapping("0", RespawnAnchorCharges._0)
            .mapping("1", RespawnAnchorCharges._1)
            .mapping("2", RespawnAnchorCharges._2)
            .mapping("3", RespawnAnchorCharges._3)
            .mapping("4", RespawnAnchorCharges._4)
            .build();
    public static final TypeMapping<String, ChestType> CHEST_TYPE = new TypeMapping.Builder<String, ChestType>()
            .mapping("single", ChestType.SINGLE)
            .mapping("left", ChestType.LEFT)
            .mapping("right", ChestType.RIGHT)
            .build();
    public static final TypeMapping<String, ComparatorMode> COMPARATOR_MODE = new TypeMapping.Builder<String, ComparatorMode>()
            .mapping("compare", ComparatorMode.COMPARE)
            .mapping("subtract", ComparatorMode.SUBTRACT)
            .build();
    public static final TypeMapping<String, ComposterLevel> COMPOSTER_LEVEL = new TypeMapping.Builder<String, ComposterLevel>()
            .mapping("0", ComposterLevel._0)
            .mapping("1", ComposterLevel._1)
            .mapping("2", ComposterLevel._2)
            .mapping("3", ComposterLevel._3)
            .mapping("4", ComposterLevel._4)
            .mapping("5", ComposterLevel._5)
            .mapping("6", ComposterLevel._6)
            .mapping("7", ComposterLevel._7)
            .mapping("8", ComposterLevel._8)
            .build();
    public static final TypeMapping<String, Delay> DELAY = new TypeMapping.Builder<String, Delay>()
            .mapping("1", Delay._1)
            .mapping("2", Delay._2)
            .mapping("3", Delay._3)
            .mapping("4", Delay._4)
            .build();
    public static final TypeMapping<String, Distance> DISTANCE_6 = new TypeMapping.Builder<String, Distance>()
            .mapping("1", Distance._1)
            .mapping("2", Distance._2)
            .mapping("3", Distance._3)
            .mapping("4", Distance._4)
            .mapping("5", Distance._5)
            .mapping("6", Distance._6)
            .mapping("7", Distance._7)
            .build();
    public static final TypeMapping<String, DripstoneThickness> DRIPSTONE_THICKNESS = new TypeMapping.Builder<String, DripstoneThickness>()
            .mapping("tip_merge", DripstoneThickness.TIP_MERGE)
            .mapping("tip", DripstoneThickness.TIP)
            .mapping("frustum", DripstoneThickness.FRUSTUM)
            .mapping("middle", DripstoneThickness.MIDDLE)
            .mapping("base", DripstoneThickness.BASE)
            .build();
    public static final TypeMapping<String, Dusted> DUSTED = new TypeMapping.Builder<String, Dusted>()
            .mapping("0", Dusted._0)
            .mapping("1", Dusted._1)
            .mapping("2", Dusted._2)
            .mapping("3", Dusted._3)
            .build();
    public static final TypeMapping<String, Eggs> EGGS = new TypeMapping.Builder<String, Eggs>()
            .mapping("1", Eggs._1)
            .mapping("2", Eggs._2)
            .mapping("3", Eggs._3)
            .mapping("4", Eggs._4)
            .build();
    public static final TypeMapping<String, FacingDirection> FACING_ALL = new TypeMapping.Builder<String, FacingDirection>()
            .mapping("north", FacingDirection.NORTH)
            .mapping("east", FacingDirection.EAST)
            .mapping("south", FacingDirection.SOUTH)
            .mapping("west", FacingDirection.WEST)
            .mapping("up", FacingDirection.UP)
            .mapping("down", FacingDirection.DOWN)
            .build();
    public static final TypeMapping<String, FacingDirectionHorizontal> FACING_HORIZONTAL = new TypeMapping.Builder<String, FacingDirectionHorizontal>()
            .mapping("north", FacingDirectionHorizontal.NORTH)
            .mapping("east", FacingDirectionHorizontal.EAST)
            .mapping("south", FacingDirectionHorizontal.SOUTH)
            .mapping("west", FacingDirectionHorizontal.WEST)
            .build();
    public static final TypeMapping<String, FacingDirectionHorizontalDown> FACING_HORIZONTAL_DOWN = new TypeMapping.Builder<String, FacingDirectionHorizontalDown>()
            .mapping("down", FacingDirectionHorizontalDown.DOWN)
            .mapping("north", FacingDirectionHorizontalDown.NORTH)
            .mapping("south", FacingDirectionHorizontalDown.SOUTH)
            .mapping("west", FacingDirectionHorizontalDown.WEST)
            .mapping("east", FacingDirectionHorizontalDown.EAST)
            .build();
    public static final TypeMapping<String, Orientation> FACING_TO_ORIENTATION = new TypeMapping.Builder<String, Orientation>()
            .mapping("down", Orientation.DOWN_SOUTH)
            .mapping("down", Orientation.DOWN_WEST)
            .mapping("down", Orientation.DOWN_NORTH)
            .mapping("down", Orientation.DOWN_EAST)
            .mapping("up", Orientation.UP_NORTH)
            .mapping("up", Orientation.UP_EAST)
            .mapping("up", Orientation.UP_SOUTH)
            .mapping("up", Orientation.UP_WEST)
            .mapping("west", Orientation.WEST_UP)
            .mapping("east", Orientation.EAST_UP)
            .mapping("north", Orientation.NORTH_UP)
            .mapping("south", Orientation.SOUTH_UP)
            .build();
    public static final TypeMapping<String, Flowers> FLOWERS = new TypeMapping.Builder<String, Flowers>()
            .mapping("1", Flowers._1)
            .mapping("2", Flowers._2)
            .mapping("3", Flowers._3)
            .mapping("4", Flowers._4)
            .build();
    public static final TypeMapping<String, GrindstoneAttachmentType> GRINDSTSTONE_ATTACHMENT_TYPE = new TypeMapping.Builder<String, GrindstoneAttachmentType>()
            .mapping("floor", GrindstoneAttachmentType.FLOOR)
            .mapping("wall", GrindstoneAttachmentType.WALL)
            .mapping("ceiling", GrindstoneAttachmentType.CEILING)
            // Java doesn't have multiple
            .mapping("wall", GrindstoneAttachmentType.MULTIPLE)
            .build();
    public static final TypeMapping<String, Half> HALF = new TypeMapping.Builder<String, Half>()
            .mapping("top", Half.TOP)
            .mapping("bottom", Half.BOTTOM)
            .build();
    public static final TypeMapping<String, Hatch> HATCH = new TypeMapping.Builder<String, Hatch>()
            .mapping("0", Hatch._0)
            .mapping("1", Hatch._1)
            .mapping("2", Hatch._2)
            .build();
    public static final TypeMapping<String, HingeSide> HINGE = new TypeMapping.Builder<String, HingeSide>()
            .mapping("left", HingeSide.LEFT)
            .mapping("right", HingeSide.RIGHT)
            .build();
    public static final TypeMapping<String, HoneyLevel> HONEY_LEVEL = new TypeMapping.Builder<String, HoneyLevel>()
            .mapping("0", HoneyLevel._0)
            .mapping("1", HoneyLevel._1)
            .mapping("2", HoneyLevel._2)
            .mapping("3", HoneyLevel._3)
            .mapping("4", HoneyLevel._4)
            .mapping("5", HoneyLevel._5)
            .build();
    public static final TypeMapping<String, NoteBlockInstrument> INSTRUMENT = new TypeMapping.Builder<String, NoteBlockInstrument>()
            .mapping("harp", NoteBlockInstrument.HARP)
            .mapping("basedrum", NoteBlockInstrument.BASEDRUM)
            .mapping("snare", NoteBlockInstrument.SNARE)
            .mapping("hat", NoteBlockInstrument.HAT)
            .mapping("bass", NoteBlockInstrument.BASS)
            .mapping("flute", NoteBlockInstrument.FLUTE)
            .mapping("bell", NoteBlockInstrument.BELL)
            .mapping("guitar", NoteBlockInstrument.GUITAR)
            .mapping("chime", NoteBlockInstrument.CHIME)
            .mapping("xylophone", NoteBlockInstrument.XYLOPHONE)
            .mapping("iron_xylophone", NoteBlockInstrument.IRON_XYLOPHONE)
            .mapping("cow_bell", NoteBlockInstrument.COW_BELL)
            .mapping("didgeridoo", NoteBlockInstrument.DIDGERIDOO)
            .mapping("bit", NoteBlockInstrument.BIT)
            .mapping("banjo", NoteBlockInstrument.BANJO)
            .mapping("pling", NoteBlockInstrument.PLING)
            .mapping("zombie", NoteBlockInstrument.ZOMBIE)
            .mapping("skeleton", NoteBlockInstrument.SKELETON)
            .mapping("creeper", NoteBlockInstrument.CREEPER)
            .mapping("dragon", NoteBlockInstrument.DRAGON)
            .mapping("wither_skeleton", NoteBlockInstrument.WITHER_SKELETON)
            .mapping("piglin", NoteBlockInstrument.PIGLIN)
            .mapping("custom_head", NoteBlockInstrument.CUSTOM_HEAD)
            .build();
    public static final TypeMapping<String, NoteBlockInstrument> INSTRUMENT_PRE_1_14 = new TypeMapping.Builder<String, NoteBlockInstrument>()
            .mapping("harp", NoteBlockInstrument.HARP)
            .mapping("basedrum", NoteBlockInstrument.BASEDRUM)
            .mapping("snare", NoteBlockInstrument.SNARE)
            .mapping("hat", NoteBlockInstrument.HAT)
            .mapping("bass", NoteBlockInstrument.BASS)
            .mapping("flute", NoteBlockInstrument.FLUTE)
            .mapping("bell", NoteBlockInstrument.BELL)
            .mapping("guitar", NoteBlockInstrument.GUITAR)
            .mapping("chime", NoteBlockInstrument.CHIME)
            .mapping("xylophone", NoteBlockInstrument.XYLOPHONE)
            .mapping("xylophone", NoteBlockInstrument.IRON_XYLOPHONE)
            .mapping("bell", NoteBlockInstrument.COW_BELL)
            .mapping("harp", NoteBlockInstrument.DIDGERIDOO)
            .mapping("harp", NoteBlockInstrument.BIT)
            .mapping("guitar", NoteBlockInstrument.BANJO)
            .mapping("chime", NoteBlockInstrument.PLING)
            .mapping("harp", NoteBlockInstrument.ZOMBIE)
            .mapping("harp", NoteBlockInstrument.SKELETON)
            .mapping("harp", NoteBlockInstrument.CREEPER)
            .mapping("harp", NoteBlockInstrument.DRAGON)
            .mapping("harp", NoteBlockInstrument.WITHER_SKELETON)
            .mapping("harp", NoteBlockInstrument.PIGLIN)
            .mapping("harp", NoteBlockInstrument.CUSTOM_HEAD)
            .build();
    public static final TypeMapping<String, NoteBlockInstrument> INSTRUMENT_PRE_1_19_3 = new TypeMapping.Builder<String, NoteBlockInstrument>()
            .mapping("harp", NoteBlockInstrument.HARP)
            .mapping("basedrum", NoteBlockInstrument.BASEDRUM)
            .mapping("snare", NoteBlockInstrument.SNARE)
            .mapping("hat", NoteBlockInstrument.HAT)
            .mapping("bass", NoteBlockInstrument.BASS)
            .mapping("flute", NoteBlockInstrument.FLUTE)
            .mapping("bell", NoteBlockInstrument.BELL)
            .mapping("guitar", NoteBlockInstrument.GUITAR)
            .mapping("chime", NoteBlockInstrument.CHIME)
            .mapping("xylophone", NoteBlockInstrument.XYLOPHONE)
            .mapping("iron_xylophone", NoteBlockInstrument.IRON_XYLOPHONE)
            .mapping("cow_bell", NoteBlockInstrument.COW_BELL)
            .mapping("didgeridoo", NoteBlockInstrument.DIDGERIDOO)
            .mapping("bit", NoteBlockInstrument.BIT)
            .mapping("banjo", NoteBlockInstrument.BANJO)
            .mapping("pling", NoteBlockInstrument.PLING)
            .mapping("harp", NoteBlockInstrument.ZOMBIE)
            .mapping("harp", NoteBlockInstrument.SKELETON)
            .mapping("harp", NoteBlockInstrument.CREEPER)
            .mapping("harp", NoteBlockInstrument.DRAGON)
            .mapping("harp", NoteBlockInstrument.WITHER_SKELETON)
            .mapping("harp", NoteBlockInstrument.PIGLIN)
            .mapping("harp", NoteBlockInstrument.CUSTOM_HEAD)
            .build();
    public static final TypeMapping<String, Bool> INVERSE_BOOL = new TypeMapping.Builder<String, Bool>()
            .mapping("false", Bool.TRUE)
            .mapping("true", Bool.FALSE)
            .build();
    public static final TypeMapping<String, Layers> LAYERS = new TypeMapping.Builder<String, Layers>()
            .mapping("1", Layers._1)
            .mapping("2", Layers._2)
            .mapping("3", Layers._3)
            .mapping("4", Layers._4)
            .mapping("5", Layers._5)
            .mapping("6", Layers._6)
            .mapping("7", Layers._7)
            .mapping("8", Layers._8)
            .build();
    public static final TypeMapping<String, LightLevel> LIGHT_LEVEL = new TypeMapping.Builder<String, LightLevel>()
            .mapping("0", LightLevel._0)
            .mapping("1", LightLevel._1)
            .mapping("2", LightLevel._2)
            .mapping("3", LightLevel._3)
            .mapping("4", LightLevel._4)
            .mapping("5", LightLevel._5)
            .mapping("6", LightLevel._6)
            .mapping("7", LightLevel._7)
            .mapping("8", LightLevel._8)
            .mapping("9", LightLevel._9)
            .mapping("10", LightLevel._10)
            .mapping("11", LightLevel._11)
            .mapping("12", LightLevel._12)
            .mapping("13", LightLevel._13)
            .mapping("14", LightLevel._14)
            .mapping("15", LightLevel._15)
            .build();
    public static final TypeMapping<String, LiquidLevel> LIQUID_LEVEL = new TypeMapping.Builder<String, LiquidLevel>()
            .mapping("0", LiquidLevel._0)
            .mapping("1", LiquidLevel._1)
            .mapping("2", LiquidLevel._2)
            .mapping("3", LiquidLevel._3)
            .mapping("4", LiquidLevel._4)
            .mapping("5", LiquidLevel._5)
            .mapping("6", LiquidLevel._6)
            .mapping("7", LiquidLevel._7)
            .mapping("8", LiquidLevel._8)
            .mapping("9", LiquidLevel._9)
            .mapping("10", LiquidLevel._10)
            .mapping("11", LiquidLevel._11)
            .mapping("12", LiquidLevel._12)
            .mapping("13", LiquidLevel._13)
            .mapping("14", LiquidLevel._14)
            .mapping("15", LiquidLevel._15)
            .build();
    public static final TypeMapping<String, Moisture> MOISTURE = new TypeMapping.Builder<String, Moisture>()
            .mapping("0", Moisture._0)
            .mapping("1", Moisture._1)
            .mapping("2", Moisture._2)
            .mapping("3", Moisture._3)
            .mapping("4", Moisture._4)
            .mapping("5", Moisture._5)
            .mapping("6", Moisture._6)
            .mapping("7", Moisture._7)
            .build();
    public static final TypeMapping<String, Note> NOTE = new TypeMapping.Builder<String, Note>()
            .mapping("0", Note._0)
            .mapping("1", Note._1)
            .mapping("2", Note._2)
            .mapping("3", Note._3)
            .mapping("4", Note._4)
            .mapping("5", Note._5)
            .mapping("6", Note._6)
            .mapping("7", Note._7)
            .mapping("8", Note._8)
            .mapping("9", Note._9)
            .mapping("10", Note._10)
            .mapping("11", Note._11)
            .mapping("12", Note._12)
            .mapping("13", Note._13)
            .mapping("14", Note._14)
            .mapping("15", Note._15)
            .mapping("16", Note._16)
            .mapping("17", Note._17)
            .mapping("18", Note._18)
            .mapping("19", Note._19)
            .mapping("20", Note._20)
            .mapping("21", Note._21)
            .mapping("22", Note._22)
            .mapping("23", Note._23)
            .mapping("24", Note._24)
            .build();
    public static final TypeMapping<String, Orientation> ORIENTATION = new TypeMapping.Builder<String, Orientation>()
            .mapping("down_east", Orientation.DOWN_EAST)
            .mapping("down_north", Orientation.DOWN_NORTH)
            .mapping("down_south", Orientation.DOWN_SOUTH)
            .mapping("down_west", Orientation.DOWN_WEST)
            .mapping("up_east", Orientation.UP_EAST)
            .mapping("up_north", Orientation.UP_NORTH)
            .mapping("up_south", Orientation.UP_SOUTH)
            .mapping("up_west", Orientation.UP_WEST)
            .mapping("west_up", Orientation.WEST_UP)
            .mapping("east_up", Orientation.EAST_UP)
            .mapping("north_up", Orientation.NORTH_UP)
            .mapping("south_up", Orientation.SOUTH_UP)
            .build();
    public static final TypeMapping<String, Pickles> PICKLES = new TypeMapping.Builder<String, Pickles>()
            .mapping("1", Pickles._1)
            .mapping("2", Pickles._2)
            .mapping("3", Pickles._3)
            .mapping("4", Pickles._4)
            .build();
    public static final TypeMapping<String, PistonType> PISTON_TYPE = new TypeMapping.Builder<String, PistonType>()
            .mapping("normal", PistonType.NORMAL)
            .mapping("sticky", PistonType.STICKY)
            .build();
    public static final TypeMapping<String, Power> POWER = new TypeMapping.Builder<String, Power>()
            .mapping("0", Power._0)
            .mapping("1", Power._1)
            .mapping("2", Power._2)
            .mapping("3", Power._3)
            .mapping("4", Power._4)
            .mapping("5", Power._5)
            .mapping("6", Power._6)
            .mapping("7", Power._7)
            .mapping("8", Power._8)
            .mapping("9", Power._9)
            .mapping("10", Power._10)
            .mapping("11", Power._11)
            .mapping("12", Power._12)
            .mapping("13", Power._13)
            .mapping("14", Power._14)
            .mapping("15", Power._15)
            .build();
    public static final TypeMapping<String, RailShape> RAIL_SHAPE = new TypeMapping.Builder<String, RailShape>()
            .mapping("north_south", RailShape.NORTH_SOUTH)
            .mapping("east_west", RailShape.EAST_WEST)
            .mapping("ascending_east", RailShape.ASCENDING_EAST)
            .mapping("ascending_west", RailShape.ASCENDING_WEST)
            .mapping("ascending_north", RailShape.ASCENDING_NORTH)
            .mapping("ascending_south", RailShape.ASCENDING_SOUTH)
            .mapping("south_east", RailShape.SOUTH_EAST)
            .mapping("south_west", RailShape.SOUTH_WEST)
            .mapping("north_west", RailShape.NORTH_WEST)
            .mapping("north_east", RailShape.NORTH_EAST)
            .build();
    public static final TypeMapping<String, RailShapeStraight> RAIL_SHAPE_STRAIGHT = new TypeMapping.Builder<String, RailShapeStraight>()
            .mapping("north_south", RailShapeStraight.NORTH_SOUTH)
            .mapping("east_west", RailShapeStraight.EAST_WEST)
            .mapping("ascending_east", RailShapeStraight.ASCENDING_EAST)
            .mapping("ascending_west", RailShapeStraight.ASCENDING_WEST)
            .mapping("ascending_north", RailShapeStraight.ASCENDING_NORTH)
            .mapping("ascending_south", RailShapeStraight.ASCENDING_SOUTH)
            .build();
    public static final TypeMapping<String, RedstoneConnection> REDSTONE_CONNECTION = new TypeMapping.Builder<String, RedstoneConnection>()
            .mapping("up", RedstoneConnection.UP)
            .mapping("side", RedstoneConnection.SIDE)
            .mapping("none", RedstoneConnection.NONE)
            .build();
    public static final TypeMapping<String, Rotation> ROTATION = new TypeMapping.Builder<String, Rotation>()
            .mapping("0", Rotation._0)
            .mapping("1", Rotation._1)
            .mapping("2", Rotation._2)
            .mapping("3", Rotation._3)
            .mapping("4", Rotation._4)
            .mapping("5", Rotation._5)
            .mapping("6", Rotation._6)
            .mapping("7", Rotation._7)
            .mapping("8", Rotation._8)
            .mapping("9", Rotation._9)
            .mapping("10", Rotation._10)
            .mapping("11", Rotation._11)
            .mapping("12", Rotation._12)
            .mapping("13", Rotation._13)
            .mapping("14", Rotation._14)
            .mapping("15", Rotation._15)
            .build();
    public static final TypeMapping<String, SculkSensorPhase> SCULK_SENSOR_PHASE = new TypeMapping.Builder<String, SculkSensorPhase>()
            .mapping("inactive", SculkSensorPhase.INACTIVE)
            .mapping("active", SculkSensorPhase.ACTIVE)
            .mapping("cooldown", SculkSensorPhase.COOLDOWN)
            .build();
    public static final TypeMapping<String, SlabType> SLAB_TYPE = new TypeMapping.Builder<String, SlabType>()
            .mapping("top", SlabType.TOP)
            .mapping("bottom", SlabType.BOTTOM)
            .mapping("double", SlabType.DOUBLE)
            .build();
    public static final TypeMapping<String, StabilityDistance> STABILITY_DISTANCE = new TypeMapping.Builder<String, StabilityDistance>()
            .mapping("0", StabilityDistance._0)
            .mapping("1", StabilityDistance._1)
            .mapping("2", StabilityDistance._2)
            .mapping("3", StabilityDistance._3)
            .mapping("4", StabilityDistance._4)
            .mapping("5", StabilityDistance._5)
            .mapping("6", StabilityDistance._6)
            .mapping("7", StabilityDistance._7)
            .build();
    public static final TypeMapping<String, Stage> STAGE = new TypeMapping.Builder<String, Stage>()
            .mapping("0", Stage._0)
            .mapping("1", Stage._1)
            .build();
    public static final TypeMapping<String, StairShape> STAIR_SHAPE = new TypeMapping.Builder<String, StairShape>()
            .mapping("straight", StairShape.STRAIGHT)
            .mapping("inner_left", StairShape.INNER_LEFT)
            .mapping("inner_right", StairShape.INNER_RIGHT)
            .mapping("outer_left", StairShape.OUTER_LEFT)
            .mapping("outer_right", StairShape.OUTER_RIGHT)
            .build();
    public static final TypeMapping<String, StructureBlockMode> STRUCTURE_BLOCK_MODE = new TypeMapping.Builder<String, StructureBlockMode>()
            .mapping("save", StructureBlockMode.SAVE)
            .mapping("load", StructureBlockMode.LOAD)
            .mapping("corner", StructureBlockMode.CORNER)
            .mapping("data", StructureBlockMode.DATA)

            // Not supported on Java
            .mapping("save", StructureBlockMode.EXPORT)
            .mapping("save", StructureBlockMode.INVALID)
            .build();
    public static final TypeMapping<String, Tilt> TILT = new TypeMapping.Builder<String, Tilt>()
            .mapping("none", Tilt.NONE)
            .mapping("unstable", Tilt.UNSTABLE)
            .mapping("partial", Tilt.PARTIAL)
            .mapping("full", Tilt.FULL)
            .build();
    public static final TypeMapping<String, TrialSpawnerState> TRIAL_SPAWNER_STATE = new TypeMapping.Builder<String, TrialSpawnerState>()
            .mapping("inactive", TrialSpawnerState.INACTIVE)
            .mapping("waiting_for_players", TrialSpawnerState.WAITING_FOR_PLAYERS)
            .mapping("active", TrialSpawnerState.ACTIVE)
            .mapping("waiting_for_reward_ejection", TrialSpawnerState.WAITING_FOR_EJECTION)
            .mapping("ejecting_reward", TrialSpawnerState.EJECTING_REWARD)
            .mapping("cooldown", TrialSpawnerState.COOLDOWN)
            .build();
    public static final TypeMapping<String, Half> UPPER_LOWER_TO_HALF = new TypeMapping.Builder<String, Half>()
            .mapping("upper", Half.TOP)
            .mapping("lower", Half.BOTTOM)
            .build();
    public static final TypeMapping<String, VaultState> VAULT_STATE = new TypeMapping.Builder<String, VaultState>()
            .mapping("inactive", VaultState.INACTIVE)
            .mapping("active", VaultState.ACTIVE)
            .mapping("unlocking", VaultState.UNLOCKING)
            .mapping("ejecting", VaultState.EJECTING)
            .build();
    public static final TypeMapping<String, VerticalDirection> VERTICAL_DIRECTION = new TypeMapping.Builder<String, VerticalDirection>()
            .mapping("up", VerticalDirection.UP)
            .mapping("down", VerticalDirection.DOWN)
            .build();
    public static final TypeMapping<String, WallHeight> WALL_HEIGHT = new TypeMapping.Builder<String, WallHeight>()
            .mapping("none", WallHeight.NONE)
            .mapping("low", WallHeight.LOW)
            .mapping("tall", WallHeight.TALL)
            .build();

}
