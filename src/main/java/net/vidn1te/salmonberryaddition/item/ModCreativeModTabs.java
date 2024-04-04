package net.vidn1te.salmonberryaddition.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.vidn1te.salmonberryaddition.SalmonberryAddition;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SalmonberryAddition.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SALMONBERRIESADDITION_TAB = CREATIVE_MODE_TABS.register("salmonberries_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SALMON_BERRY_CHEESECAKE.get()))
                    .title(Component.translatable("creativetab.salmonberryaddition_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SALMON_BERRY_CHEESECAKE.get());
                        pOutput.accept(ModItems.SALMONBERRIES_JUICE.get());



                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
