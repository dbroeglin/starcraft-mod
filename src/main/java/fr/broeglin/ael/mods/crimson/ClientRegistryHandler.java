package fr.broeglin.ael.mods.crimson;

import fr.broeglin.ael.mods.crimson.utils.ModItems;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientRegistryHandler {

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        CrimsonMod.logger.info("Starcraft Client: registerModels...");
        ModItems.initModels();
    }
}