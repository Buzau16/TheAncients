package buzau.theancients.items.custom;

import buzau.theancients.TheAncients;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AncientsItems {

    // Creating the items
    public static final Item RAW_ETHEREAL_ARCANE_ORE = registerItem("raw_ethereal_arcane_ore",
            new Item(new FabricItemSettings()));
    public static final Item ETHEREAL_ARCANE_INGOT = registerItem("ethereal_arcane_ingot",
            new Item(new FabricItemSettings()));


    // Creating the armours
    public static final Item ETHEREAL_ARCANE_HELMET = registerItem("ethereal_arcane_helmet",
            new ArmorItem(AncientsArmorMaterials.ETHEREAL_ARCANE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item ETHEREAL_ARCANE_CHESTPLATE = registerItem("ethereal_arcane_chestplate",
            new ArmorItem(AncientsArmorMaterials.ETHEREAL_ARCANE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item ETHEREAL_ARCANE_LEGGINGS = registerItem("ethereal_arcane_leggings",
            new ArmorItem(AncientsArmorMaterials.ETHEREAL_ARCANE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item ETHEREAL_ARCANE_BOOTS = registerItem("ethereal_arcane_boots",
            new ArmorItem(AncientsArmorMaterials.ETHEREAL_ARCANE, ArmorItem.Type.BOOTS, new FabricItemSettings()));




    // --------------------------- QOL FUNCTIONS -------------------------------------
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TheAncients.MOD_ID, name), item);
    }

    // Used in the main class for register the items
    public static void registerModItems() {
        TheAncients.LOGGER.info("Registering Mod Items for " + TheAncients.MOD_ID);
    }
}
