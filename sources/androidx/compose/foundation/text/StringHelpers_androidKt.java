package androidx.compose.foundation.text;

import androidx.emoji2.text.EmojiCompat;
import java.text.BreakIterator;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nStringHelpers.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringHelpers.android.kt\nandroidx/compose/foundation/text/StringHelpers_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,44:1\n1#2:45\n*E\n"})
/* compiled from: StringHelpers.android.kt */
public final class StringHelpers_androidKt {
    public static final int findFollowingBreak(String str, int i) {
        boolean z;
        C12775o.m28639i(str, "<this>");
        EmojiCompat emojiCompatIfLoaded = getEmojiCompatIfLoaded();
        Integer num = null;
        if (emojiCompatIfLoaded != null) {
            Integer valueOf = Integer.valueOf(emojiCompatIfLoaded.getEmojiEnd(str, i));
            if (valueOf.intValue() == -1) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i);
    }

    public static final int findPrecedingBreak(String str, int i) {
        C12775o.m28639i(str, "<this>");
        EmojiCompat emojiCompatIfLoaded = getEmojiCompatIfLoaded();
        Integer num = null;
        if (emojiCompatIfLoaded != null) {
            boolean z = false;
            Integer valueOf = Integer.valueOf(emojiCompatIfLoaded.getEmojiStart(str, Math.max(0, i - 1)));
            if (valueOf.intValue() == -1) {
                z = true;
            }
            if (!z) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    private static final EmojiCompat getEmojiCompatIfLoaded() {
        if (!EmojiCompat.isConfigured()) {
            return null;
        }
        EmojiCompat emojiCompat = EmojiCompat.get();
        boolean z = true;
        if (emojiCompat.getLoadState() != 1) {
            z = false;
        }
        if (z) {
            return emojiCompat;
        }
        return null;
    }
}
