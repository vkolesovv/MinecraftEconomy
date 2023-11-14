package ru.vadim.minecrafteconomy.item.tabs;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import ru.vadim.minecrafteconomy.item.items.ItemsRegistry;

public abstract class TabsRegistry {
    public static final CreativeModeTab MOD_TAB = new CreativeModeTab("moditems") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemsRegistry.CARD.get());
        }
    };
}
