package bttv.layoutsettings;

import android.util.Log;

import bttv.Res;
import bttv.ResUtil;
import bttv.settings.Settings;
import tv.twitch.android.core.mvp.viewdelegate.BaseViewDelegate;

public class HideChatHeader extends BaseViewDelegate {
    public void show() {
        Log.d("LBTTVHide", "Hide chat header runs");
        Log.d("LBTTVHide", "Status" + ResUtil.getBooleanFromSettings(Settings.HideChatHeaderEnabled));
        if(ResUtil.getBooleanFromSettings(Settings.HideChatHeaderEnabled)){
            Log.d("LBTTVHide", "Status" + ResUtil.getBooleanFromSettings(Settings.HideChatHeaderEnabled));
            super.show();
        }
    }
}
