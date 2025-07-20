package tweakeroo;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import malilib.registry.Registry;

public class Tweakeroo
{
    public static final Logger LOGGER = LogManager.getLogger(Reference.MOD_ID);

    public void initClient()
    {
        Registry.INITIALIZATION_DISPATCHER.registerInitializationHandler(new InitHandler());
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        if (event.getSide().isClient()) initClient();
    }
}
