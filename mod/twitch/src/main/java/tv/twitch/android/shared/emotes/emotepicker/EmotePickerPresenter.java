/**
 * This file is a stub, so javac does not throw errors,
 * it is not used in the patches.
 */
package tv.twitch.android.shared.emotes.emotepicker;

import java.util.List;

import kotlin.jvm.internal.BTTVDefaultConstructorMarker;
import tv.twitch.android.shared.emotes.models.EmoteMessageInput;
import tv.twitch.android.models.emotes.EmoteModel;

public final class EmotePickerPresenter {
    public static abstract class ClickedEmote {

        public ClickedEmote() {

        }

        public ClickedEmote(BTTVDefaultConstructorMarker BTTVDefaultConstructorMarker) {
            this();
        }

        public static final class Unlocked extends EmotePickerPresenter.ClickedEmote {

            public final EmoteModel getEmote() {
                return null;
            }

            public final EmoteMessageInput getEmoteMessageInput() {
                return null;
            }

            public final EmotePickerTrackingMetadata getTrackingMetadata() {
                return null;
            }

            public Unlocked(EmoteModel emote, EmoteMessageInput emoteMessageInput,
                            EmotePickerTrackingMetadata emotePickerTrackingMetadata,
                            List<EmotePickerPresenter.ClickedEmote.Unlocked> list, int i,
                            BTTVDefaultConstructorMarker BTTVDefaultConstructorMarker) {
                this(emote, emoteMessageInput, emotePickerTrackingMetadata, list);
            }

            public final List<EmotePickerPresenter.ClickedEmote.Unlocked> getModifiedEmotes() {
                return null;
            }

            public Unlocked(EmoteModel emote, EmoteMessageInput emoteMessageInput,
                            EmotePickerTrackingMetadata emotePickerTrackingMetadata,
                            List<EmotePickerPresenter.ClickedEmote.Unlocked> list) {
                super(null);
            }
        }
    }
}
