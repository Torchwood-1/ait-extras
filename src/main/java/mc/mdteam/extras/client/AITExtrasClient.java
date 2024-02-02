package mc.mdteam.extras.client;

import mc.mdteam.extras.client.variant.ClientDimensionalVariant;
import mc.mdteam.extras.client.variant.ClientEleventhVariant;
import mdteam.ait.client.registry.ClientExteriorVariantRegistry;
import mdteam.ait.client.registry.exterior.ClientExteriorVariantSchema;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value = EnvType.CLIENT)
public class AITExtrasClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ClientExteriorVariantRegistry.register(new ClientDimensionalVariant());
        ClientExteriorVariantRegistry.register(new ClientEleventhVariant());
    }
}
