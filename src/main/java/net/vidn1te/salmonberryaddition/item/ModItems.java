package net.vidn1te.salmonberryaddition.item;

import net.minecraft.world.item.MilkBucketItem;
import net.vidn1te.salmonberryaddition.SalmonberryAddition;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SalmonberryAddition.MOD_ID);

    public static final RegistryObject<Item> SALMON_BERRY_CHEESECAKE = ITEMS.register("salmon_berry_cheesecake",
            () ->  new Item(new Item.Properties().food(ModFoods.SALMON_BERRY_CHEESECAKE)));
    public static final RegistryObject<Item> SALMONBERRIES_JUICE = ITEMS.register("salmonberries_juice",
            () ->  new ModDrinks((new Item.Properties()).food(ModFoods.SALMONBERRIES_JUICE).stacksTo(16)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
