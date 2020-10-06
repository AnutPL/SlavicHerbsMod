package donut.slavicherbs.common;

import donut.slavicherbs.SlavicHerbs;
import donut.slavicherbs.common.block.DirtBlock2;
import donut.slavicherbs.common.block.Plant;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.loading.FMLEnvironment;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
    public static DirtBlock2 DIRT_BLOCK_2 = new DirtBlock2();
    public static Plant PLANT = new Plant();
    public static void registerBlocks(IForgeRegistry<Block> registry) {
        registry.register(DIRT_BLOCK_2);
        ForgeRegistries.ITEMS.register(new BlockItem(DIRT_BLOCK_2, new Item.Properties().group(SlavicHerbs.SLAVIC_HERBS)).setRegistryName(DIRT_BLOCK_2.getRegistryName()));

        registry.register(PLANT);
        ForgeRegistries.ITEMS.register(new BlockItem(PLANT, new Item.Properties().group(SlavicHerbs.SLAVIC_HERBS)).setRegistryName(PLANT.getRegistryName()));
        if(FMLEnvironment.dist == Dist.CLIENT) {
            RenderTypeLookup.setRenderLayer(PLANT, RenderType.getCutoutMipped());
        }
    }
}