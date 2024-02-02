package mc.mdteam.extras.tardis.variant;

import mc.mdteam.extras.AITExtras;
import mdteam.ait.tardis.variant.exterior.box.PoliceBoxVariant;
import net.minecraft.util.Identifier;

public class DimensionalVariant extends PoliceBoxVariant {
    public static final Identifier REFERENCE = new Identifier(AITExtras.MOD_ID, "exterior/police_box/" + "dimensional");

    public DimensionalVariant() {
        super("dimensional", AITExtras.MOD_ID);
    }
}
