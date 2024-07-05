package me.matthewe.atheriallibexampleplugin;

import me.matthewe.atheriallibexampleplugin.exampleprofile.ExampleProfile;
import me.matthewe.atheriallibplugin.AtherialAddon;
import me.matthewe.atheriallibplugin.AtherialLibPlugin;
import org.bukkit.plugin.java.JavaPlugin;
import spigui.menu.SGMenu;

public final class AtherialLibExamplePlugin extends AtherialAddon {
    private static AtherialLibExamplePlugin instance;
    private ExampleConfig cf;
    public AtherialLibExamplePlugin() {
        AtherialLibPlugin.registerAddon(this);
        instance=this;
    }

    public static AtherialLibExamplePlugin get() {
        return instance;
    }

    /*
    Handle plugin enable logic here
    */
    @Override
    public void onEnable() {
        cf= new ExampleConfig(this);
        cf.loadConfig();

        AtherialLibPlugin.getInstance().getProfileManager().registerProfileClass(ExampleProfile.class);
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

    public ExampleConfig getExampleConfig() {
        return cf;
    }
}
