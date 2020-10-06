package donut.slavicherbs.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class DirtBlock2 extends Block {
    public DirtBlock2() {
        super(Block.Properties.create(Material.ORGANIC)
                .sound(SoundType.CROP)

        );
        setRegistryName("dirt_block_2");

    }
}
