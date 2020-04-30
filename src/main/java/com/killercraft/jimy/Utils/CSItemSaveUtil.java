package com.killercraft.jimy.Utils;

import com.comphenix.protocol.utility.StreamSerializer;
import org.bukkit.inventory.ItemStack;

public class CSItemSaveUtil {

    public static ItemStack getItemStack(String data) {
        StreamSerializer ss = new StreamSerializer();
        try
        {
            return ss.deserializeItemStack(data);
        }catch(Exception e){e.printStackTrace();}
        return null;
    }

    public static String toData(ItemStack item) {
        StreamSerializer ss = new StreamSerializer();
        try
        {
            return ss.serializeItemStack(item);
        }catch(Exception e){e.printStackTrace();}
        return null;
    }
}
