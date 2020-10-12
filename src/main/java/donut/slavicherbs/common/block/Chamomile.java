package donut.slavicherbs.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BushBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Chamomile extends BushBlock {
    public Chamomile() {
        super(Block.Properties.create(Material.PLANTS)
                .doesNotBlockMovement()
                .sound(SoundType.PLANT)
                .hardnessAndResistance(0, 0)

        );
        setRegistryName("chamomile");

    }
}
