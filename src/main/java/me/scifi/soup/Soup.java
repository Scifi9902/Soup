package me.scifi.soup;

import lombok.Getter;
import me.scifi.soup.listener.SoupListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Soup extends JavaPlugin {

    @Getter
    private static Soup plugin;

    public void onEnable() {
        plugin = this;
        Bukkit.getServer().getPluginManager().registerEvents(new SoupListener(), this);
    }

}
