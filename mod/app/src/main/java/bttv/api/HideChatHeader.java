package bttv.api;

import bttv.ResUtil;
import bttv.settings.Settings;
import tv.twitch.android.shared.chat.chatheader.ChatHeaderViewDelegate;

public class HideChatHeader extends ChatHeaderViewDelegate {
    public void show() {
        if(ResUtil.getBooleanFromSettings(Settings.HideChatHeaderEnabled)){
            super.show();
        }
    }
}
