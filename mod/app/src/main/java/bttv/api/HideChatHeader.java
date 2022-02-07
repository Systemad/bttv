package bttv.api;

import bttv.ResUtil;
import bttv.settings.Settings;
import tv.twitch.android.core.mvp.viewdelegate.BaseViewDelegate;

public class HideChatHeader extends BaseViewDelegate {
    public void show() {
        if(ResUtil.getBooleanFromSettings(Settings.HideChatHeaderEnabled)){
            super.show();
        }
    }
}
