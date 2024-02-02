package mc.mdteam.extras.tardis.variant;

import mc.mdteam.extras.AITExtras;
import mdteam.ait.tardis.variant.exterior.box.PoliceBoxVariant;
import net.minecraft.util.Identifier;

public class EleventhVariant extends PoliceBoxVariant {
    public static final Identifier REFERENCE = new Identifier(AITExtras.MOD_ID, "exterior/police_box/" + "eleventh");

    public EleventhVariant() {
        super("eleventh", AITExtras.MOD_ID);
    }
}
