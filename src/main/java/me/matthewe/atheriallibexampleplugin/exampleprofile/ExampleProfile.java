package me.matthewe.atheriallibexampleplugin.exampleprofile;

import me.matthewedevelopment.atheriallib.playerdata.AtherialProfile;
import me.matthewedevelopment.atheriallib.playerdata.PreSaveType;
import me.matthewedevelopment.atheriallib.playerdata.ProfileColumn;
import me.matthewedevelopment.atheriallib.playerdata.ProfileColumnType;
import org.bukkit.entity.Player;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ExampleProfile  extends AtherialProfile<ExampleProfile> {
    private int example;

    public ExampleProfile() {
        //MUST KEEP THIS CONSTRUCTION UNCHANGED
    }

    public ExampleProfile(UUID uuid, String username) {
        super(uuid, username); //MUST KEEP THIS CONSTRUCTION UNCHANGED
    }

    @Override
    public String getKey() {
        return "example_profile"; //table name
    }

    @Override
    public void preSave(Player player, PreSaveType preSaveType) {
        switch (preSaveType) {
            case QUIT:
                break;
            case INTERVAL:
                break;
        }
    }

    @Override
    public ExampleProfile loadDefault(Player player) {
        return this;
    }

    @Override
    public ExampleProfile loadResultFromSet(ResultSet rs) {
        try {
            this.example = rs.getInt("example");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    public List<ProfileColumn> getCustomColumns() {
        List<ProfileColumn> profileColumns = new ArrayList<>();
        profileColumns.add(new ProfileColumn("example", ProfileColumnType.INTEGER, example));
        return profileColumns;
    }
}