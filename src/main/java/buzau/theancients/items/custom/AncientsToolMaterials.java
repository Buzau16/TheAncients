package buzau.theancients.items.custom;

import buzau.theancients.registry.AncientsItems;
import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

import static buzau.theancients.registry.AncientsItems.ETHEREAL_ARCANE_INGOT;

public enum AncientsToolMaterials implements ToolMaterial {

    // MiningLevels class contains all of the mining levels for different material!
    ETHEREAL_TOOL_MATERIAL(MiningLevels.IRON, 400, 6.f, 3.f, 15,
            () -> Ingredient.ofItems(ETHEREAL_ARCANE_INGOT)),
    VOIDSTONE_TOOL_MATERIAL(MiningLevels.DIAMOND, 1600, 7.f, 4.f, 22,
            () -> Ingredient.ofItems(AncientsItems.VOIDSTONE_INGOT)); // TODO: ADD A VOIDSTONE GEM THING

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;
    private static final int[] BASE_DURABILITY = { 11, 16, 15, 13 };

    AncientsToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attckDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attckDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
