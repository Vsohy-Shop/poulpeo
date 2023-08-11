package androidx.compose.p002ui.text;

import java.text.BreakIterator;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.JvmCharHelpers_androidKt */
/* compiled from: JvmCharHelpers.android.kt */
public final class JvmCharHelpers_androidKt {
    public static final int findFollowingBreak(String str, int i) {
        C12775o.m28639i(str, "<this>");
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i);
    }

    public static final int findPrecedingBreak(String str, int i) {
        C12775o.m28639i(str, "<this>");
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }
}
