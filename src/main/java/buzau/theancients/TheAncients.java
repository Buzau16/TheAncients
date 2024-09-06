package buzau.theancients;

import buzau.theancients.registry.*;
import net.fabricmc.api.ModInitializer;

import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheAncients implements ModInitializer {

	// TODO: Make tree leaves generate properly
	// TODO: Maybe make some other biomes
	// TODO: Play with noise settings and surface rules
	// TODO: Add mobs
	// TODO: Add structures
	// TODO: ENJOY!:)
	public static final String MOD_ID = "theancients";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		// Generate the portal for the Elder Realm Dimension
		CustomPortalBuilder.beginPortal()
				.frameBlock(Blocks.REINFORCED_DEEPSLATE)
				.lightWithItem(Items.ENDER_EYE)
				.destDimID(new Identifier(TheAncients.MOD_ID, "theelderrealm"))
				.setPortalSearchYRange(60, 70)
				.setReturnPortalSearchYRange(60,100)
				.registerPortal();

		// Registering things
		AncientsScreenHandlers.registerScreenHandlers();
		AncientsBlocks.registerBlocks();
		AncientsEntities.registerEntities();
		AncientsItems.registerModItems();
		TheAncientsItemGroup.registerItemGroup();
	}
}