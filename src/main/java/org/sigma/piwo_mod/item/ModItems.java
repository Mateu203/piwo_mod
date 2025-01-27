package org.sigma.piwo_mod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.sigma.piwo_mod.Piwo_mod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Piwo_mod.MODID);

    public static final RegistryObject<Item> PIWO_A = ITEMS.register("piwo_a",()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> PIWO_TESCO = ITEMS.register("piwo_tesco", ()-> new Item(new Item.Properties().food(ModFoodPropeties.PIWO)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
