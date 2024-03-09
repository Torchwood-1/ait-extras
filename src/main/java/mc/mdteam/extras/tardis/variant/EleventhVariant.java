package mc.mdteam.extras.tardis.variant;

import mc.mdteam.extras.AITExtras;
import mdteam.ait.registry.DoorRegistry;
import mdteam.ait.tardis.exterior.variant.box.PoliceBoxVariant;
import mdteam.ait.tardis.variant.door.DoorSchema;
import mdteam.ait.tardis.variant.door.PoliceBoxCoralDoorVariant;
import net.minecraft.util.Identifier;

public class EleventhVariant extends PoliceBoxVariant {
    public static final Identifier REFERENCE = new Identifier(AITExtras.MOD_ID, "exterior/police_box/" + "eleventh");

    public EleventhVariant() {
        super("eleventh", AITExtras.MOD_ID);
    }

    @Override
    public DoorSchema door() {
        return DoorRegistry.REGISTRY.get(PoliceBoxCoralDoorVariant.REFERENCE);
    }
}
