package com.xpkitty.minigame.shop;

import org.bukkit.ChatColor;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;

public enum ShopCategories {

    PVP(ChatColor.WHITE + "Duels",Material.IRON_SWORD,ChatColor.GRAY + "Free For All PVP",new ArrayList<String>(Arrays.asList("kits"))),
    SHOVELSPLEEF(ChatColor.WHITE + "Spleef",Material.DIAMOND_SHOVEL,ChatColor.GRAY + "Your favourite minecraft minigame",new ArrayList<String>(Arrays.asList("kits"))),
    KNOCKOUT(ChatColor.WHITE + "Knockout",Material.STICK,ChatColor.GRAY + "Just knock.",new ArrayList<>());

    private final String display;
    private final String description;
    private final Material material;
    private final ArrayList<String> objectList;

    ShopCategories(String display, Material material, String description, ArrayList<String> objectList) {
        this.display = display;
        this.material = material;
        this.description = description;
        this.objectList = objectList;
    }

    public Material getMaterial() { return material; }
    public String getDisplay() { return display; }
    public String getDescription() { return description; }
    public ArrayList<String> getObjectList() { return objectList; }
    public boolean objectListContains(String object) {
        return objectList.contains(object);
    }
}
