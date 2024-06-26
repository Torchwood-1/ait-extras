package mc.mdteam.extras;

import io.wispforest.owo.itemgroup.Icon;
import io.wispforest.owo.itemgroup.OwoItemGroup;
import io.wispforest.owo.registration.reflect.FieldRegistrationHandler;
import mc.mdteam.extras.blocks.ExtrasBlocks;
import mc.mdteam.extras.tardis.variant.DimensionalVariant;
import mc.mdteam.extras.tardis.variant.EleventhVariant;
import mc.mdteam.extras.tardis.variant.MysticalVariant;
import mdteam.ait.registry.ExteriorVariantRegistry;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AITExtras implements ModInitializer {
    public static final String MOD_ID = "ait-extras";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final OwoItemGroup EXTRAS_ITEM_GROUP = OwoItemGroup.builder(new Identifier(MOD_ID, "item_group"),
            () -> Icon.of(Items.SLIME_BALL.getDefaultStack())).build();

    @Override
    public void onInitialize() {
        FieldRegistrationHandler.register(ExtrasBlocks.class, MOD_ID, false);

        // TODO - These can be removed now as datapack support for exterior variants is available and is recommended.
        ExteriorVariantRegistry.getInstance().register(new DimensionalVariant());
        ExteriorVariantRegistry.getInstance().register(new EleventhVariant());
        ExteriorVariantRegistry.getInstance().register(new MysticalVariant());

        EXTRAS_ITEM_GROUP.initialize();
    }
}
