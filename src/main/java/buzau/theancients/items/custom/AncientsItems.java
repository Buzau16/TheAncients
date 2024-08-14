package buzau.theancients.items.custom;

import buzau.theancients.TheAncients;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AncientsItems {

    // Creating the items
    public static final Item RAW_ETHEREAL_ARCANE_ORE = registerItem("raw_ethereal_arcane_ore",
            new Item(new FabricItemSettings()));
    public static final Item ETHEREAL_ARCANE_INGOT = registerItem("ethereal_arcane_ingot",
            new Item(new FabricItemSettings()));

    // TODO: ADD A SMELTED VARIANT!

    public static final Item RAW_VOIDSTONE_ORE = registerItem("raw_voidstone_ore",
            new Item(new FabricItemSettings()));
    public static final Item VOIDSTONE_INGOT = registerItem("voidstone_ingot",
            new Item(new FabricItemSettings()));


    public static final Item ETHEREAL_ARCANE_PICKAXE = registerItem("ethereal_arcane_pickaxe",
            new PickaxeItem(AncientsToolMaterials.ETHEREAL_TOOL_MATERIAL, 1, -3f, new FabricItemSettings()));
    public static final Item ETHEREAL_ARCANE_AXE = registerItem("ethereal_arcane_axe",
            new AxeItem(AncientsToolMaterials.ETHEREAL_TOOL_MATERIAL, 4.5f, -3f, new FabricItemSettings()));
    public static final Item ETHEREAL_ARCANE_SWORD = registerItem("ethereal_arcane_sword",
            new SwordItem(AncientsToolMaterials.ETHEREAL_TOOL_MATERIAL, 2, -2.5f, new FabricItemSettings()));
    public static final Item ETHEREAL_ARCANE_SHOVEL = registerItem("ethereal_arcane_shovel",
            new ShovelItem(AncientsToolMaterials.ETHEREAL_TOOL_MATERIAL, 1.6f, -3f, new FabricItemSettings()));
    public static final Item ETHEREAL_ARCANE_HOE = registerItem("ethereal_arcane_hoe",
            new HoeItem(AncientsToolMaterials.ETHEREAL_TOOL_MATERIAL, -2, -2.5f, new FabricItemSettings()));

    public static final Item VOIDSTONE_PICKAXE = registerItem("voidstone_pickaxe",
            new PickaxeItem(AncientsToolMaterials.ETHEREAL_TOOL_MATERIAL, 1, -2.5f, new FabricItemSettings()));
    public static final Item VOIDSTONE_AXE = registerItem("voidstone_axe",
            new AxeItem(AncientsToolMaterials.ETHEREAL_TOOL_MATERIAL, 5f, -3.5f, new FabricItemSettings()));
    public static final Item VOIDSTONE_SWORD = registerItem("voidstone_sword",
            new SwordItem(AncientsToolMaterials.ETHEREAL_TOOL_MATERIAL, 3, -2.5f, new FabricItemSettings()));
    public static final Item VOIDSTONE_SHOVEL = registerItem("voidstone_shovel",
            new ShovelItem(AncientsToolMaterials.ETHEREAL_TOOL_MATERIAL, 1.6f, -3f, new FabricItemSettings()));
    public static final Item VOIDSTONE_HOE = registerItem("voidstone_hoe",
            new HoeItem(AncientsToolMaterials.ETHEREAL_TOOL_MATERIAL, -3, 0f, new FabricItemSettings()));


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
        TheAncients.LOGGER.info("Registering Items for " + TheAncients.MOD_ID);
    }
}
