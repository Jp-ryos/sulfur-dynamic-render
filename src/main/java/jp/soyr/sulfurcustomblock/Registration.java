package jp.soyr.sulfurcustomblock;

import jp.soyr.sulfurcustomblock.blocks.SulfurOre;
import jp.soyr.sulfurcustomblock.items.SulfurPowder;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static jp.soyr.sulfurcustomblock.SulfurCustomBlock.MODID;

public class Registration {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MODID);

    public static final RegistryObject<SulfurOre> SULFUR_ORE = BLOCKS.register("sulfur_ore", SulfurOre::new);
    public static final RegistryObject<SulfurPowder> SULFUR_POWDER = ITEMS.register("sulfur_powder", SulfurPowder::new);

}
