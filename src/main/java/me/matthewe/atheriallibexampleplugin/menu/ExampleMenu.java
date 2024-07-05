package me.matthewe.atheriallibexampleplugin.menu;

import me.matthewe.atheriallibexampleplugin.AtherialLibExamplePlugin;
import me.matthewe.atheriallibexampleplugin.ExampleConfig;
import me.matthewedevelopment.atheriallib.config.yaml.AtherialLibItem;
import me.matthewedevelopment.atheriallib.menu.gui.AtherialMenu;
import org.bukkit.entity.Player;
import spigui.menu.SGMenu;

public class ExampleMenu  extends AtherialMenu<ExampleConfig> {
    @Override
    public void update() {


    }

    @Override
    public SGMenu generateMenu(Player player) {
        if (menu==null) {
            menu= AtherialLibItem.
        }
        return menu;
    }
}
