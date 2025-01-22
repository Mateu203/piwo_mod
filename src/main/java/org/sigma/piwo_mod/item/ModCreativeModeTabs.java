package org.sigma.piwo_mod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.sigma.piwo_mod.Piwo_mod;
import org.sigma.piwo_mod.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,
            Piwo_mod.MODID);

    public static final RegistryObject<CreativeModeTab> ALCOHOLS_TAB = CREATIVE_MODE_TABS.register("alcohols_tab",
            ()-> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PIWO_A.get())).title(Component.translatable("creativetab.piwo_mod.alcohols"))
                    .displayItems((itemDisplayParameters, output) -> {
                    output.accept(ModItems.PIWO_A.get());
                    output.accept(ModBlocks.POTATO_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
