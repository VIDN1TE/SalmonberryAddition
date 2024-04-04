package net.vidn1te.salmonberryaddition.item.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.vidn1te.salmonberryaddition.SalmonberryAddition;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> MILK_VALUABLES = ForgeTag("milk/milk");


        private static TagKey<Item> tag(String name) {
            return ItemTags.create((new ResourceLocation(SalmonberryAddition.MOD_ID, name)));
        }


        private static TagKey<Item> ForgeTag(String name) {
            return ItemTags.create((new ResourceLocation("forge", name)));
        }
    }
}
