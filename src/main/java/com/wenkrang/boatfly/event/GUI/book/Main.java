package com.wenkrang.boatfly.event.GUI.book;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class Main {
    public static void Show (Player player) {
        Inventory inventory = Bukkit.createInventory(null, 27, "飞船配方主页");
        ItemStack itemStack0 = new ItemStack(Material.LIGHT_BLUE_STAINED_GLASS_PANE);
        ItemMeta itemMeta0 = itemStack0.getItemMeta();
        itemMeta0.setDisplayName(" ");
        itemStack0.setItemMeta(itemMeta0);
        ItemStack itemStack1 = new ItemStack(Material.COMPASS);
        ItemMeta itemMeta1 = itemStack1.getItemMeta();
        itemMeta1.setDisplayName("§9§l飞机§r配方");
        ArrayList<String> lore1 = new ArrayList<>();
        lore1.add("§7这里是§7§l飞机配方§7的§7§l主页§7你可以在这里");
        lore1.add("§7查看所有§7§n飞机部件§7的配方");
        itemMeta1.setLore(lore1);
        itemStack1.setItemMeta(itemMeta1);
        ItemStack itemStack2 = new ItemStack(Material.OAK_BOAT);
        ItemMeta itemMeta2 = itemStack2.getItemMeta();
        itemMeta2.setDisplayName("§9§l飞§r船");
        itemStack2.setItemMeta(itemMeta2);
        ItemStack itemStack3 = new ItemStack(Material.BEEHIVE);
        ItemMeta itemMeta3 = itemStack3.getItemMeta();
        itemMeta3.setDisplayName("§9§l发动机§r模块");
        ArrayList<String> lore3 = new ArrayList<>();
        lore3.add("§7这是飞船的§7§l发动机模块§7,是整个飞船§7§l§n最重要§7的");
        lore3.add("§7模块，用§7§l强大的材料§7制成");
        itemMeta3.setLore(lore3);
        itemStack3.setItemMeta(itemMeta3);
        ItemStack itemStack4 = new ItemStack(Material.DISPENSER);
        ItemMeta itemMeta4 = itemStack4.getItemMeta();
        itemMeta4.setDisplayName("§c§l攻击§r模块");
        ArrayList<String> lore4 = new ArrayList<>();
        lore4.add("§7飞机的攻击模块，可以发射");
        lore4.add("§7TNT和弓箭");
        itemMeta4.setLore(lore4);
        itemStack4.setItemMeta(itemMeta4);
        inventory.setItem(0, itemStack0);
        inventory.setItem(1, itemStack1);
        inventory.setItem(2, itemStack0);
        inventory.setItem(3, itemStack0);
        inventory.setItem(4, itemStack0);
        inventory.setItem(5, itemStack0);
        inventory.setItem(6, itemStack0);
        inventory.setItem(7, itemStack0);
        inventory.setItem(8, itemStack0);
        inventory.setItem(9, itemStack2);
        inventory.setItem(10, itemStack3);
        inventory.setItem(11, itemStack4);

        player.openInventory(inventory);
    }
}
