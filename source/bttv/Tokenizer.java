package bttv;

import java.util.ArrayList;
import java.util.List;
import tv.twitch.android.models.chat.MessageToken.TextToken;
import tv.twitch.android.models.chat.MessageToken;
import tv.twitch.android.models.chat.MessageToken.EmoticonToken;

public class Tokenizer {

    public static List<MessageToken> tokenize(List<MessageToken> orig) {
        int channel = Data.currentBroadcasterId;

        // Don't add Emotes, when we dont have the chnnel's emotes (yet)
        if (!Data.channelHasEmotes(channel)) {
            return orig;
        }

        ArrayList<MessageToken> newTokens = new ArrayList<>(orig.size() + 5);

        for (MessageToken token : orig) {
            // possible issue: emotes won't work in e.g. MentionToken or BitsToken
            if (!(token instanceof TextToken)) {
                newTokens.add(token);
                continue;
            }

            TextToken text = (TextToken) token;
            String[] words = text.getText().split(" ");

            String currentText = "";
            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                Emote emote = Data.getEmote(word, channel);
                if (emote == null) {
                    currentText += word + " ";
                    continue;
                }
                // emote found
                newTokens.add(new TextToken(currentText, text.getFlags()));
                newTokens.add(new EmoticonToken(word, "BTTV-" + emote.id));
                currentText = " ";
            }

            if (currentText.length() > 0) {
                newTokens.add(new TextToken(currentText, text.getFlags()));
            }
        }

        return newTokens;
    }
}