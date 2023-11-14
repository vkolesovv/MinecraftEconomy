package ru.vadim.minecrafteconomy.item.items;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import ru.vadim.minecrafteconomy.MinecraftEconomy;
import ru.vadim.minecrafteconomy.item.items.moditems.Card;
import ru.vadim.minecrafteconomy.item.tabs.TabsRegistry;

public abstract class ItemsRegistry {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MinecraftEconomy.MOD_ID);

    public static final RegistryObject<Item> CARD = ITEMS.register("card",
            () -> new Card(new Item.Properties().tab(TabsRegistry.MOD_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
