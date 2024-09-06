package buzau.theancients.registry;

import buzau.theancients.TheAncients;
import buzau.theancients.ui.screenHandlers.Vase.VaseScreenHandler;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class AncientsScreenHandlers {

//    public static final ScreenHandlerType<VaseScreenHandler> VASE_SH = Registry.register(Registries.SCREEN_HANDLER,
//            new Identifier(TheAncients.MOD_ID, "vase_sh"), new ScreenHandlerRegistry);

    public static final ScreenHandlerType<VaseScreenHandler> VASE_SH = ScreenHandlerRegistry.registerSimple(new Identifier(TheAncients.MOD_ID, "vase"), VaseScreenHandler::new);

    public static void registerScreenHandlers(){
        TheAncients.LOGGER.info("Registering Screen Handlers for " + TheAncients.MOD_ID);
    }
}
