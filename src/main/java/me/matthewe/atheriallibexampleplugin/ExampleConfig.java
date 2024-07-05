package me.matthewe.atheriallibexampleplugin;

import me.matthewedevelopment.atheriallib.config.SerializedName;
import me.matthewedevelopment.atheriallib.config.yaml.AtherialLibItem;
import me.matthewedevelopment.atheriallib.config.yaml.YamlConfig;
import org.bukkit.Material;

public class ExampleConfig  extends YamlConfig<AtherialLibExamplePlugin> {

    @SerializedName("testItem")
    public AtherialLibItem TEST_ITEM = new AtherialLibItem()
            .setLore("test")
            .setDisplayName("test")

            .setSlot(1)
            .setType(Material.STONE);

    public ExampleConfig(AtherialLibExamplePlugin plugin) {
        super("config.yml", plugin);
    }
}