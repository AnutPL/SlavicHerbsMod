package donut.slavicherbs.common;

import donut.slavicherbs.SlavicHerbs;
import donut.slavicherbs.common.worldgen.YarrowFeature;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SlavicHerbs.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModWorldGen {
    public static YarrowFeature YARROW_FEATURE = new YarrowFeature();

@SubscribeEvent
    public static void registerFeatures(RegistryEvent.Register<Feature<?>> registryEvent) {
        YARROW_FEATURE.setRegistryName("yarrow_feature");
        registryEvent.getRegistry().register(YARROW_FEATURE);
        Biomes.PLAINS.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, YARROW_FEATURE.withConfiguration(YarrowFeature.DEFAULT_YARROW_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_32.configure(new FrequencyConfig(2))));
    }
}