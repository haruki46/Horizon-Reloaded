package resource.horizonreloaded.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import resource.horizonreloaded.Horizonreloaded;

public class ModItems {

    //Add Item
    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));
    public static final Item TITANIUM = registerItem("titanium", new Item(new Item.Settings()));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings()));
    public static final Item RAW_TITANIUM = registerItem("raw_titanium", new Item(new Item.Settings()));
    public static final Item RAW_MITHRIL = registerItem("raw_mithril", new Item(new Item.Settings()));
    public static final Item MITHRIL = registerItem("mithril", new Item(new Item.Settings()));
    //Add Rough Gemstone
    public static final Item ROUGH_AMBER_GEMSTONE = registerItem("rough_amber_gemstone", new Item(new Item.Settings()));
    public static final Item ROUGH_AMETHYST_GEMSTONE = registerItem("rough_amethyst_gemstone", new Item(new Item.Settings()));
    public static final Item ROUGH_JADE_GEMSTONE = registerItem("rough_jade_gemstone", new Item(new Item.Settings()));
    public static final Item ROUGH_JASPER_GEMSTONE = registerItem("rough_jasper_gemstone", new Item(new Item.Settings()));
    public static final Item ROUGH_OPAL_GEMSTONE = registerItem("rough_opal_gemstone", new Item(new Item.Settings()));
    public static final Item ROUGH_RUBY_GEMSTONE = registerItem("rough_ruby_gemstone", new Item(new Item.Settings()));
    public static final Item ROUGH_SAPPHIRE_GEMSTONE = registerItem("rough_sapphire_gemstone", new Item(new Item.Settings()));
    public static final Item ROUGH_TOPAZ_GEMSTONE = registerItem("rough_topaz_gemstone", new Item(new Item.Settings()));
    //Add Fine
    public static final Item FINE_AMETHYST_GEMSTONE = registerItem("fine_amethyst_gemstone", new Item(new Item.Settings()));
    public static final Item FINE_AMBER_GEMSTONE    = registerItem("fine_amber_gemstone", new Item(new Item.Settings()));
    public static final Item FINE_JADE_GEMSTONE     = registerItem("fine_jade_gemstone", new Item(new Item.Settings()));
    public static final Item FINE_JASPER_GEMSTONE   = registerItem("fine_jasper_gemstone", new Item(new Item.Settings()));
    public static final Item FINE_OPAL_GEMSTONE     = registerItem("fine_opal_gemstone", new Item(new Item.Settings()));
    public static final Item FINE_RUBY_GEMSTONE     = registerItem("fine_ruby_gemstone", new Item(new Item.Settings()));
    public static final Item FINE_SAPPHIRE_GEMSTONE = registerItem("fine_sapphire_gemstone", new Item(new Item.Settings()));
    public static final Item FINE_TOPAZ_GEMSTONE    = registerItem("fine_topaz_gemstone", new Item(new Item.Settings()));
    //Add Flawed
    public static final Item FLAWED_AMETHYST_GEMSTONE = registerItem("flawed_amethyst_gemstone", new Item(new Item.Settings()));
    public static final Item FLAWED_AMBER_GEMSTONE    = registerItem("flawed_amber_gemstone", new Item(new Item.Settings()));
    public static final Item FLAWED_JADE_GEMSTONE     = registerItem("flawed_jade_gemstone", new Item(new Item.Settings()));
    public static final Item FLAWED_JASPER_GEMSTONE   = registerItem("flawed_jasper_gemstone", new Item(new Item.Settings()));
    public static final Item FLAWED_OPAL_GEMSTONE     = registerItem("flawed_opal_gemstone", new Item(new Item.Settings()));
    public static final Item FLAWED_RUBY_GEMSTONE     = registerItem("flawed_ruby_gemstone", new Item(new Item.Settings()));
    public static final Item FLAWED_SAPPHIRE_GEMSTONE = registerItem("flawed_sapphire_gemstone", new Item(new Item.Settings()));
    public static final Item FLAWED_TOPAZ_GEMSTONE    = registerItem("flawed_topaz_gemstone", new Item(new Item.Settings()));
    //Add FLawless
    public static final Item FLAWLESS_AMETHYST_GEMSTONE = registerItem("flawless_amethyst_gemstone", new Item(new Item.Settings()));
    public static final Item FLAWLESS_AMBER_GEMSTONE    = registerItem("flawless_amber_gemstone", new Item(new Item.Settings()));
    public static final Item FLAWLESS_JADE_GEMSTONE     = registerItem("flawless_jade_gemstone", new Item(new Item.Settings()));
    public static final Item FLAWLESS_JASPER_GEMSTONE   = registerItem("flawless_jasper_gemstone", new Item(new Item.Settings()));
    public static final Item FLAWLESS_OPAL_GEMSTONE     = registerItem("flawless_opal_gemstone", new Item(new Item.Settings()));
    public static final Item FLAWLESS_RUBY_GEMSTONE     = registerItem("flawless_ruby_gemstone", new Item(new Item.Settings()));
    public static final Item FLAWLESS_SAPPHIRE_GEMSTONE = registerItem("flawless_sapphire_gemstone", new Item(new Item.Settings()));
    public static final Item FLAWLESS_TOPAZ_GEMSTONE    = registerItem("flawless_topaz_gemstone", new Item(new Item.Settings()));
    //ADD Perfect
    public static final Item PERFECT_AMETHYST_GEMSTONE = registerItem("perfect_amethyst_gemstone", new Item(new Item.Settings()));
    public static final Item PERFECT_AMBER_GEMSTONE    = registerItem("perfect_amber_gemstone", new Item(new Item.Settings()));
    public static final Item PERFECT_JADE_GEMSTONE     = registerItem("perfect_jade_gemstone", new Item(new Item.Settings()));
    public static final Item PERFECT_JASPER_GEMSTONE   = registerItem("perfect_jasper_gemstone", new Item(new Item.Settings()));
    public static final Item PERFECT_OPAL_GEMSTONE     = registerItem("perfect_opal_gemstone", new Item(new Item.Settings()));
    public static final Item PERFECT_RUBY_GEMSTONE     = registerItem("perfect_ruby_gemstone", new Item(new Item.Settings()));
    public static final Item PERFECT_SAPPHIRE_GEMSTONE = registerItem("perfect_sapphire_gemstone", new Item(new Item.Settings()));
    public static final Item PERFECT_TOPAZ_GEMSTONE    = registerItem("perfect_topaz_gemstone", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Horizonreloaded.MOD_ID, name), item);
    }
    //Add To groups Items
    public static void registerModItems() {
        Horizonreloaded.LOGGER.info("Registering Mod Items for " + Horizonreloaded.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
           //Put Mod in Ingredients Group!

        });
    }
}