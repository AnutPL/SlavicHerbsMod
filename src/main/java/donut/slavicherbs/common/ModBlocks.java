package donut.slavicherbs.common;

import donut.slavicherbs.SlavicHerbs;
import donut.slavicherbs.common.block.*;
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
    public static Chamomile CHAMOMILE = new Chamomile();
    public static Nettle NETTLE = new Nettle();
    public static Ribleaf RIBLEAF = new Ribleaf();
    public static Sage SAGE = new Sage();
    public static Yarrow YARROW = new Yarrow();


    public static void registerBlocks(IForgeRegistry<Block> registry) {
        registry.register(DIRT_BLOCK_2);
        ForgeRegistries.ITEMS.register(new BlockItem(DIRT_BLOCK_2, new Item.Properties().group(SlavicHerbs.SLAVIC_HERBS)).setRegistryName(DIRT_BLOCK_2.getRegistryName()));

        registry.register(PLANT);
        ForgeRegistries.ITEMS.register(new BlockItem(PLANT, new Item.Properties().group(SlavicHerbs.SLAVIC_HERBS)).setRegistryName(PLANT.getRegistryName()));
        if(FMLEnvironment.dist == Dist.CLIENT) {
            RenderTypeLookup.setRenderLayer(PLANT, RenderType.getCutoutMipped());
        }

        registry.register(CHAMOMILE);
        ForgeRegistries.ITEMS.register(new BlockItem(CHAMOMILE, new Item.Properties().group(SlavicHerbs.SLAVIC_HERBS)).setRegistryName(CHAMOMILE.getRegistryName()));
        if(FMLEnvironment.dist == Dist.CLIENT) {
            RenderTypeLookup.setRenderLayer(CHAMOMILE, RenderType.getCutoutMipped());
        }

        registry.register(NETTLE);
        ForgeRegistries.ITEMS.register(new BlockItem(NETTLE, new Item.Properties().group(SlavicHerbs.SLAVIC_HERBS)).setRegistryName(NETTLE.getRegistryName()));
        if(FMLEnvironment.dist == Dist.CLIENT) {
            RenderTypeLookup.setRenderLayer(NETTLE, RenderType.getCutoutMipped());
        }

        registry.register(RIBLEAF);
        ForgeRegistries.ITEMS.register(new BlockItem(RIBLEAF, new Item.Properties().group(SlavicHerbs.SLAVIC_HERBS)).setRegistryName(RIBLEAF.getRegistryName()));
        if(FMLEnvironment.dist == Dist.CLIENT) {
            RenderTypeLookup.setRenderLayer(RIBLEAF, RenderType.getCutoutMipped());
        }

        registry.register(SAGE);
        ForgeRegistries.ITEMS.register(new BlockItem(SAGE, new Item.Properties().group(SlavicHerbs.SLAVIC_HERBS)).setRegistryName(SAGE.getRegistryName()));
        if(FMLEnvironment.dist == Dist.CLIENT) {
            RenderTypeLookup.setRenderLayer(SAGE, RenderType.getCutoutMipped());
        }

        registry.register(YARROW);
        ForgeRegistries.ITEMS.register(new BlockItem(YARROW, new Item.Properties().group(SlavicHerbs.SLAVIC_HERBS)).setRegistryName(YARROW.getRegistryName()));
        if(FMLEnvironment.dist == Dist.CLIENT) {
            RenderTypeLookup.setRenderLayer(YARROW, RenderType.getCutoutMipped());
        }
    }
}