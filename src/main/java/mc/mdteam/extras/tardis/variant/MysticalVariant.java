package mc.mdteam.extras.tardis.variant;

import mc.mdteam.extras.AITExtras;
import mdteam.ait.tardis.exterior.variant.box.PoliceBoxVariant;
import net.minecraft.util.Identifier;

public class MysticalVariant extends PoliceBoxVariant {
    public static final Identifier REFERENCE = new Identifier(AITExtras.MOD_ID, "exterior/police_box/" + "mystical");

    public MysticalVariant() {
        super("mystical", AITExtras.MOD_ID);
    }
}
