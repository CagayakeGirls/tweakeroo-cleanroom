package tweakeroo.compat.forge;

import malilib.gui.BaseScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.client.IModGuiFactory;
import tweakeroo.gui.ConfigScreen;

import java.util.Set;

public class TweakerooGuiFactory implements IModGuiFactory
{
    @Override
    public void initialize(Minecraft minecraftInstance)
    {
    }

    @Override
    public boolean hasConfigGui()
    {
        return true;
    }

    @Override
    public GuiScreen createConfigGui(GuiScreen parent)
    {
        BaseScreen screen = ConfigScreen.create();
        screen.setParent(parent);
        return screen;
    }

    @Override
    public Set<RuntimeOptionCategoryElement> runtimeGuiCategories()
    {
        return null;
    }
}
