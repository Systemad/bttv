package bttv.api.layoutsettings;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import bttv.ResUtil;
import bttv.settings.Settings;
import tv.twitch.android.shared.ui.elements.navigation.BottomNavigationItem;

public class HideNavigationTabs {
    private final static String TAG = "LBTTVHideTabs";
    public static List<BottomNavigationItem> hideBottomNavigationTabs(List<BottomNavigationItem> navigationItems){
        return bttv.layoutsettings.HideNavigationTabs.hideBottomNavigationTabs(navigationItems);
    }
}
