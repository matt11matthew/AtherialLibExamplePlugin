package me.matthewe.atheriallibexampleplugin;

import me.matthewe.atheriallibplugin.AtherialAddon;
import me.matthewe.atheriallibplugin.AtherialLibPlugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class AtherialLibExamplePlugin extends AtherialAddon {

    public AtherialLibExamplePlugin() {
        AtherialLibPlugin.registerAddon(this);
    }

    /*
    Handle plugin enable logic here
    */
    @Override
    public void onEnable() {

    }

    /*
    Handle plugin disable logic here
    */
    @Override
    public void onStop() {

    }






    /*
    DONT USE THIS
    */
    @Override
    public void onStart() {

    }
}
