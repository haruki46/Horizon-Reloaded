package resource.horizonreloaded.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import resource.horizonreloaded.Horizonreloaded;
import resource.horizonreloaded.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup GEMSTONE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Horizonreloaded.MOD_ID, "gemstone_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PERFECT_RUBY_GEMSTONE))
                    .displayName(Text.translatable("itemGroup.horizonreloaded.gemstone_items"))
                    .entries((displayContext, entries) -> {
                        //Amber
                        entries.add(new ItemStack(ModItems.ROUGH_AMBER_GEMSTONE));
                        entries.add(new ItemStack(ModItems.FINE_AMBER_GEMSTONE));
                        entries.add(new ItemStack(ModItems.FLAWED_AMBER_GEMSTONE));
                        entries.add(new ItemStack(ModItems.FLAWLESS_AMBER_GEMSTONE));
                        entries.add(new ItemStack(ModItems.PERFECT_AMBER_GEMSTONE));
                        //Amethyst
                        entries.add(new ItemStack(ModItems.ROUGH_AMETHYST_GEMSTONE));
                        entries.add(new ItemStack(ModItems.FINE_AMETHYST_GEMSTONE));
                        entries.add(new ItemStack(ModItems.FLAWED_AMETHYST_GEMSTONE));
                        entries.add(new ItemStack(ModItems.FLAWLESS_AMETHYST_GEMSTONE));
                        entries.add(new ItemStack(ModItems.PERFECT_AMETHYST_GEMSTONE));
                        //Jade
                        entries.add(new ItemStack(ModItems.ROUGH_JADE_GEMSTONE));
                        entries.add(new ItemStack(ModItems.FINE_JADE_GEMSTONE));
                        entries.add(new ItemStack(ModItems.FLAWED_JADE_GEMSTONE));
                        entries.add(new ItemStack(ModItems.FLAWLESS_JADE_GEMSTONE));
                        entries.add(new ItemStack(ModItems.PERFECT_JADE_GEMSTONE));
                        //Jasper
                        entries.add(new ItemStack(ModItems.ROUGH_JASPER_GEMSTONE));
                        entries.add(new ItemStack(ModItems.FINE_JASPER_GEMSTONE));
                        entries.add(new ItemStack(ModItems.FLAWED_JASPER_GEMSTONE));
                        entries.add(new ItemStack(ModItems.FLAWLESS_JASPER_GEMSTONE));
                        entries.add(new ItemStack(ModItems.PERFECT_JASPER_GEMSTONE));
                        //Opal
                        entries.add(new ItemStack(ModItems.ROUGH_OPAL_GEMSTONE));
                        entries.add(new ItemStack(ModItems.FINE_OPAL_GEMSTONE));
                        entries.add(new ItemStack(ModItems.FLAWED_OPAL_GEMSTONE));
                        entries.add(new ItemStack(ModItems.FLAWLESS_OPAL_GEMSTONE));
                        entries.add(new ItemStack(ModItems.PERFECT_OPAL_GEMSTONE));
                        //ruby
                        entries.add(new ItemStack(ModItems.ROUGH_RUBY_GEMSTONE));
                        entries.add(new ItemStack(ModItems.FINE_RUBY_GEMSTONE));
                        entries.add(new ItemStack(ModItems.FLAWED_RUBY_GEMSTONE));
                        entries.add(new ItemStack(ModItems.FLAWLESS_RUBY_GEMSTONE));
                        entries.add(new ItemStack(ModItems.PERFECT_RUBY_GEMSTONE));
                        //Sapphire
                        entries.add(new ItemStack(ModItems.ROUGH_SAPPHIRE_GEMSTONE));
                        entries.add(new ItemStack(ModItems.FINE_SAPPHIRE_GEMSTONE));
                        entries.add(new ItemStack(ModItems.FLAWED_SAPPHIRE_GEMSTONE));
                        entries.add(new ItemStack(ModItems.FLAWLESS_SAPPHIRE_GEMSTONE));
                        entries.add(new ItemStack(ModItems.PERFECT_SAPPHIRE_GEMSTONE));
                        //Topaz
                        entries.add(new ItemStack(ModItems.ROUGH_TOPAZ_GEMSTONE));
                        entries.add(new ItemStack(ModItems.FINE_TOPAZ_GEMSTONE));
                        entries.add(new ItemStack(ModItems.FLAWED_TOPAZ_GEMSTONE));
                        entries.add(new ItemStack(ModItems.FLAWLESS_TOPAZ_GEMSTONE));
                        entries.add(new ItemStack(ModItems.PERFECT_TOPAZ_GEMSTONE));
                    }).build());

    public static final ItemGroup RAW_ORE_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Horizonreloaded.MOD_ID, "raw_ore_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.RAW_TITANIUM))
                    .displayName(Text.translatable("itemGroup.horizonreloaded.raw_ore_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_PINK_GARNET);
                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.RAW_TITANIUM);
                        entries.add(ModItems.TITANIUM);
                        entries.add(ModItems.RAW_MITHRIL);
                        entries.add(ModItems.MITHRIL);
                    }).build());

    public static final ItemGroup BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Horizonreloaded.MOD_ID, "blocks_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.GEMSTONE_TABLE))
                    .displayName(Text.translatable("itemGroup.horizonreloaded.blocks_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.GEMSTONE_TABLE);
                        entries.add(ModBlocks.MITHRIL_STONE);
                        entries.add(ModBlocks.ROUGH_MITHRIL);
                        entries.add(ModBlocks.FINE_MITHRIL);
                        entries.add(ModBlocks.FLAWED_MITHRIL);
                        entries.add(ModBlocks.CONDENSED_DIRT);
                        entries.add(ModBlocks.AMBER);
                        entries.add(ModBlocks.AMETHYST);
                        entries.add(ModBlocks.JADE);
                        entries.add(ModBlocks.JASPER);
                        entries.add(ModBlocks.OPAL);
                        entries.add(ModBlocks.RUBY);
                        entries.add(ModBlocks.SAPPHIRE);
                        entries.add(ModBlocks.TOPAZ);

                    }).build());

    public static void registerItemGroups() {
        Horizonreloaded.LOGGER.info("Registering Item Groups for " + Horizonreloaded.MOD_ID);
    }
}