package t3mods.seedsforelectroblobswizardry.t3s4ebw.common.blocks;

import java.util.Random;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import t3mods.seedsforelectroblobswizardry.t3s4ebw.MyMod;
import t3mods.seedsforelectroblobswizardry.t3s4ebw.common.items.ModItems;
import t3mods.seedsforelectroblobswizardry.t3s4ebw.util.IHasModel;

public class CrystalCrop extends BlockCrops implements IHasModel{
	
	public CrystalCrop(String name) {
		super();
		setUnlocalizedName(name);
		setRegistryName(name);
		setLightLevel(6/16f);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	protected Item getSeed()
    {
        return ModItems.MAGIC_SEED;
    }

	@Override
    protected Item getCrop()
    {

		if(ModItems.CRYSTAL_FLOWER_REF != null)
			return ModItems.CRYSTAL_FLOWER_REF;
		else
			return Items.WHEAT;
		
    }

	@Override
	public void registerModels() {
		MyMod.proxy.registerItemRender(Item.getItemFromBlock(this), 0, "inventory");
	}
	
	@Override
    public void getDrops(net.minecraft.util.NonNullList<ItemStack> drops, net.minecraft.world.IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
    {
		Random rand = world instanceof World ? ((World)world).rand : RANDOM;

        int count = quantityDropped(state, fortune, rand);
        for (int i = 0; i < count; i++)
        {
            Item item = this.getItemDropped(state, rand, fortune);
            if (item != Items.AIR)
            {
            	if(this.isMaxAge(state))
            		drops.add(new ItemStack(item, 1 + rand.nextInt(3), this.damageDropped(state)));
            	else
            		drops.add(new ItemStack(item, 1, this.damageDropped(state)));
            }
        }
    }
	
}
