package com.killercraft.jimy.Runnables;

import java.util.Calendar;

import static com.killercraft.jimy.ConfigManager.CSDataUtil.*;
import static com.killercraft.jimy.CustomShop.day;

public class CSSaveDataRunnable implements Runnable{
    @Override
    public void run() {
        saveData();
        saveShops();
        day = Calendar.getInstance().get(Calendar.DAY_OF_YEAR);
        saveRefresh();
    }
}
