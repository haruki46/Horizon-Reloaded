package resource.horizonreloaded.block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import resource.horizonreloaded.Horizonreloaded;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;


public class ModBlocks {
    //Add Block
    public static final Block GEMSTONE_TABLE = registerBlock("gemstone_table",
            new Block(AbstractBlock.Settings.create().strength(1f,1)
            .requiresTool().sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block MITHRIL_STONE = registerBlock("mithril_stone",
            new Block(AbstractBlock.Settings.create().strength(2f,1)
                    .requiresTool().sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block ROUGH_MITHRIL = registerBlock("rough_mithril",
            new Block(AbstractBlock.Settings.create().strength(3f,1)
                    .requiresTool().sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block FINE_MITHRIL = registerBlock("fine_mithril",
            new Block(AbstractBlock.Settings.create().strength(4f,1)
                    .requiresTool().sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block FLAWED_MITHRIL = registerBlock("flawed_mithril",
            new Block(AbstractBlock.Settings.create().strength(5f,1)
                    .requiresTool().sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block CONDENSED_DIRT = registerBlock("condensed_dirt",
            new Block(AbstractBlock.Settings.create().strength(6f,1)
                    .requiresTool().sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    //Gem
    public static final Block AMBER = registerBlock("amber",
            new ExperienceDroppingBlock(UniformIntProvider.create(2,5),
                AbstractBlock.Settings.create()
                        .strength(3f)
                        .requiresTool()
                        .sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block AMETHYST = registerBlock("amethyst",
            new ExperienceDroppingBlock(UniformIntProvider.create(2,5),
                    AbstractBlock.Settings.create()
                            .strength(3f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block JADE = registerBlock("jade",
            new ExperienceDroppingBlock(UniformIntProvider.create(2,5),
                    AbstractBlock.Settings.create()
                            .strength(3f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block JASPER = registerBlock("jasper",
            new ExperienceDroppingBlock(UniformIntProvider.create(2,5),
                    AbstractBlock.Settings.create()
                            .strength(3f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block RUBY = registerBlock("ruby",
            new ExperienceDroppingBlock(UniformIntProvider.create(2,5),
                    AbstractBlock.Settings.create()
                            .strength(3f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block SAPPHIRE = registerBlock("sapphire",
            new ExperienceDroppingBlock(UniformIntProvider.create(2,5),
                    AbstractBlock.Settings.create()
                            .strength(3f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block TOPAZ = registerBlock("topaz",
            new ExperienceDroppingBlock(UniformIntProvider.create(2,5),
                    AbstractBlock.Settings.create()
                            .strength(3f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block OPAL = registerBlock("opal",
            new ExperienceDroppingBlock(UniformIntProvider.create(2,5),
                    AbstractBlock.Settings.create()
                            .strength(3f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    //Register Block

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Horizonreloaded.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Horizonreloaded.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    public static void registerModBlocks() {
        Horizonreloaded.LOGGER.info("Registering Mod Blocks for " + Horizonreloaded.MOD_ID);
    }
}
