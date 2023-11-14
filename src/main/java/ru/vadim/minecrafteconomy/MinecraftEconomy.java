package ru.vadim.minecrafteconomy;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import ru.vadim.minecrafteconomy.item.items.ItemsRegistry;

@Mod(MinecraftEconomy.MOD_ID)
public class MinecraftEconomy
{
    public static final String MOD_ID = "minecrafteconomy";

    private static final Logger LOGGER = LogUtils.getLogger();

    public MinecraftEconomy()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemsRegistry.register(eventBus);

        eventBus.addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("Minecraft Economy mod was started");
    }
}
