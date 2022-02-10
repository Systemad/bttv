package bttv.layoutsettings;

import java.util.ArrayList;
import java.util.List;

import bttv.ResUtil;
import bttv.settings.Settings;
import tv.twitch.android.shared.ui.elements.navigation.BottomNavigationDestination;
import tv.twitch.android.shared.ui.elements.navigation.BottomNavigationItem;

public class HideNavigationTabs {

    public static List<BottomNavigationItem> hideBottomNavigationTabs(List<BottomNavigationItem> items) {
        if(items == null || items.isEmpty())
            return items;

        ArrayList arrayList = new ArrayList();
        for(BottomNavigationItem item : items){
            BottomNavigationDestination navigationDestination = item.getDestination();
            if(navigationDestination.equals(BottomNavigationDestination.DISCOVER) && ResUtil.getBooleanFromSettings(Settings.HideDiscoverTabEnabled)){
                continue;
            }
            arrayList.add(item);
        }
        return arrayList;
    }
}
