package com.wenkrang.boatfly.Loader;

import com.wenkrang.boatfly.BoatFly;
import com.wenkrang.boatfly.command.bf;

import java.util.Objects;

import static org.bukkit.Bukkit.getServer;

public class LoadCommand {
    public static void run() {
        getServer().getConsoleSender().sendMessage("§9§l[*] §r正在注入命令...");
        bf var0 = new bf();
        Objects.requireNonNull(BoatFly.getPlugin(BoatFly.class).getCommand("bf")).setExecutor(var0);
        Objects.requireNonNull(BoatFly.getPlugin(BoatFly.class).getCommand("bf")).setTabCompleter(var0);
    }
}
