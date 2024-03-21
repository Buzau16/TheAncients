package buzau.theancients;

import buzau.theancients.block.ModBlocks;
import buzau.theancients.items.custom.ModItems;
import buzau.theancients.items.custom.TheAncientsItemGroup;
import buzau.theancients.world.biome.surface.ModMaterialRules;
import net.fabricmc.api.ModInitializer;

import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheAncients implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "theancients";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModMaterialRules.makeRules();

		CustomPortalBuilder.beginPortal()
				.frameBlock(Blocks.REINFORCED_DEEPSLATE)
				.lightWithItem(Items.ENDER_EYE)
				.destDimID(new Identifier(TheAncients.MOD_ID, "theelderrealm"))
				.tintColor(0,49,84)
				.setPortalSearchYRange(60, 70)
				.setReturnPortalSearchYRange(60,100)
				.registerPortal();

//		CustomPortalBuilder.beginPortal()
//				.frameBlock(Blocks.DIAMOND_BLOCK)
//				.lightWithItem(Items.ENDER_EYE)
//				.destDimID(new Identifier("the_end"))
//				.tintColor(45,65,101)
//				.registerPortal();

		ModBlocks.registerBlocks();
		ModItems.registerModItems();
		TheAncientsItemGroup.registerItemGroup();
	}
}