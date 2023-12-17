package mc.mdteam.extras;

import io.wispforest.owo.itemgroup.Icon;
import io.wispforest.owo.itemgroup.OwoItemGroup;
import io.wispforest.owo.registration.reflect.FieldRegistrationHandler;
import mc.mdteam.extras.blocks.ExtrasBlocks;
import mdteam.ait.AITMod;
import mdteam.ait.core.AITBlocks;
import mdteam.ait.core.AITItems;
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

        EXTRAS_ITEM_GROUP.initialize();
    }
}
