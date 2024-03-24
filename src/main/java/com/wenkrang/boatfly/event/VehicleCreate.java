package com.wenkrang.boatfly.event;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Boat;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.vehicle.VehicleCreateEvent;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.stream.Collectors;

import static com.wenkrang.boatfly.BoatFly.plugin;

public class VehicleCreate implements Listener {
    @EventHandler
    public void onVehicleCreate(VehicleCreateEvent e) {
        if (e.getVehicle() instanceof Boat && ((Boat) e.getVehicle()).getBoatType().equals(Boat.Type.OAK)) {
            Bukkit.getScheduler().runTaskLater(plugin, () -> handleCustomName((Boat) e.getVehicle()), 1);
        }
    }
    public void handleCustomName(Boat vehicle) {
        List<Player> var0 = vehicle.getNearbyEntities(6, 6, 6).stream().filter(e -> (e instanceof Player && ((Player) e).hasLineOfSight(vehicle))).map(e -> (Player) e).collect(Collectors.toList());
        if (!var0.isEmpty()) {
            String name = checkName(var0.get(0).getInventory().getItemInMainHand(), var0.get(0).getInventory().getItemInOffHand());
            if (name != null) {
                vehicle.setCustomName(name);
            }
        }
    }
    public String checkName(ItemStack main, ItemStack off) {
        if ((main.getType() != Material.OAK_BOAT && main.getType() != Material.OAK_CHEST_BOAT) || main.getItemMeta() == null || !main.getItemMeta().hasDisplayName()) {
            if ((off.getType() != Material.OAK_BOAT && off.getType() != Material.OAK_CHEST_BOAT) || off.getItemMeta() == null || !off.getItemMeta().hasDisplayName()) {
                return null;
            }
            return off.getItemMeta().getDisplayName();
        }
        return main.getItemMeta().getDisplayName();
    }
}
