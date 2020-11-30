package donut.slavicherbs.common;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.world.gen.feature.Feature;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class RegistryHandler {
    @SubscribeEvent
    public static void onBlockRegister(final RegistryEvent.Register<Block> blockRegistryEvent) {
        ModBlocks.registerBlocks(blockRegistryEvent.getRegistry());

    }
    @SubscribeEvent
    public static void onItemRegister(final RegistryEvent.Register<Item> itemRegistryEvent) {

    }
    @SubscribeEvent
    public static void onEntityRegister(final RegistryEvent.Register<EntityType<?>> entityRegistryEvent) {

    }
    @SubscribeEvent
    public static void onModelRegister(final ModelRegistryEvent modelRegistryEvent) {

    }
    @SubscribeEvent
    public static void onFeatureRegister(final RegistryEvent<Feature<?>> featureRegistryEvent) {
       // ModWorldGen.registerFeatures(featureRegistryEvent.);
    }

}
