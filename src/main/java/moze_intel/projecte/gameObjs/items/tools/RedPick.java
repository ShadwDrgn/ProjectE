package moze_intel.projecte.gameObjs.items.tools;

import moze_intel.projecte.gameObjs.EnumMatterType;
import moze_intel.projecte.gameObjs.ObjHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

public class RedPick extends DarkPick
{
	public RedPick(Properties props)
	{
		super(props, (byte)3, new String[] {
				"pe.redpick.mode1", "pe.redpick.mode2",
				"pe.redpick.mode3", "pe.redpick.mode4"});
		this.peToolMaterial = EnumMatterType.RED_MATTER;
		this.harvestMaterials.add(Material.IRON);
		this.harvestMaterials.add(Material.ANVIL);
		this.harvestMaterials.add(Material.ROCK);
	}
	
	@Override
	public float getDestroySpeed(@Nonnull ItemStack stack, @Nonnull BlockState state)
	{
		Block b = state.getBlock();
		if (b == ObjHandler.rmBlock || b == ObjHandler.rmFurnaceOff)
		{
			return 1200000.0F;
		}
		return super.getDestroySpeed(stack, state);
	}
}
