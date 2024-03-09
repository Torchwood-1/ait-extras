package mc.mdteam.extras.datagen;

import mc.mdteam.extras.AITExtras;
import mc.mdteam.extras.blocks.ExtrasBlocks;
import mc.mdteam.extras.datagen.datagen_providers.ExtrasLanguageProvider;
import mc.mdteam.extras.datagen.datagen_providers.ExtrasModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ExtrasDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        generateBlockModels(pack);
        generateLanguages(pack);
    }

    public void generateLanguages(FabricDataGenerator.Pack pack) {
        generate_EN_US_Language(pack); // en_us (English US)
        generate_EN_UK_Language(pack); // en_uk (English UK)
    }

    public void generate_EN_US_Language(FabricDataGenerator.Pack pack) {
        pack.addProvider(((output, registriesFuture) -> addEnglishTranslations(output, registriesFuture, LanguageType.EN_US))); // en_us (English US)
    }

    public void generate_EN_UK_Language(FabricDataGenerator.Pack pack) {
        pack.addProvider(((output, registriesFuture) -> addEnglishTranslations(output, registriesFuture, LanguageType.EN_UK))); // en_uk (English UK)
    }

    /**
     * Adds English translations to the language file.
     *
     * @param output           The data generator output.
     * @param registriesFuture The registries future.
     * @param languageType     The language type.
     * @return The AITLanguageProvider.
     */
    public ExtrasLanguageProvider addEnglishTranslations(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture, LanguageType languageType) {
        ExtrasLanguageProvider provider = new ExtrasLanguageProvider(output, languageType);

        provider.addTranslation(AITExtras.EXTRAS_ITEM_GROUP, "AIT Extras");

        provider.addTranslation(ExtrasBlocks.HARTNELL_A, "Hartnell A");
        provider.addTranslation(ExtrasBlocks.HARTNELL_B, "Hartnell B");
        provider.addTranslation(ExtrasBlocks.HARTNELL_C, "Hartnell C");

        return provider;
    }

    public void generateBlockModels(FabricDataGenerator.Pack pack) {
        pack.addProvider(((output, registriesFuture) -> {
            ExtrasModelProvider provider = new ExtrasModelProvider(output);

            provider.registerSimpleBlock(ExtrasBlocks.HARTNELL_A);
            provider.registerSimpleBlock(ExtrasBlocks.HARTNELL_B);
            provider.registerSimpleBlock(ExtrasBlocks.HARTNELL_C);

            return provider;
        }));
    }
}
