package org.sigma.piwo_mod.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.sigma.piwo_mod.Piwo_mod;
import org.sigma.piwo_mod.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS= DeferredRegister.create(ForgeRegistries.BLOCKS, Piwo_mod.MODID);

    public static final RegistryObject<Block> POTATO_BLOCK = registerBlock("potato_block", ()-> new Block(BlockBehaviour.Properties.of()
            .strength(4f).requiresCorrectToolForDrops()));



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name,block);
        registerBlockItem(name, toReturn);
        return toReturn;

    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block){
        ModItems.ITEMS.register(name,()-> new BlockItem(block.get(), new Item.Properties()));
    }




    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}
