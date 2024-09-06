package buzau.theancients.ui.screenHandlers.Vase;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class VaseScreen extends HandledScreen<VaseScreenHandler> {
    private static final Identifier TEXTURE = new Identifier("minecraft", "textures/gui/container/dispenser.png");

    public VaseScreen(VaseScreenHandler handler, PlayerInventory inventory, Text title){
        super(handler, inventory, title);
    }

    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;
        context.drawTexture(TEXTURE, x,y,0,0, backgroundWidth, backgroundHeight);
        //in 1.20 or above,this method is in DrawContext class.
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        renderBackground(context, mouseX, mouseY, delta);
        super.render(context, mouseX, mouseY, delta);
        drawMouseoverTooltip(context,mouseX,mouseY);

    }

    @Override
    protected void init() {
        super.init();
        super.init();
        titleX = (backgroundWidth - textRenderer.getWidth(title)) / 2;
    }
}

