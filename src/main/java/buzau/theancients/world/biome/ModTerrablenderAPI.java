package buzau.theancients.world.biome;

import buzau.theancients.TheAncients;
import buzau.theancients.world.biome.surface.ModMaterialRules;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class ModTerrablenderAPI implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized(){
        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, TheAncients.MOD_ID, ModMaterialRules.makeRules());
    }
}
