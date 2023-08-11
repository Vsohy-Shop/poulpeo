package androidx.compose.p002ui.text.android.selection;

import androidx.compose.p002ui.text.android.InternalPlatformTextApi;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Locale;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
@InternalPlatformTextApi
/* renamed from: androidx.compose.ui.text.android.selection.WordBoundary */
/* compiled from: WordBoundary.kt */
public final class WordBoundary {
    public static final int $stable = 8;
    private final WordIterator wordIterator;

    public WordBoundary(Locale locale, CharSequence charSequence) {
        C12775o.m28639i(locale, "locale");
        C12775o.m28639i(charSequence, "text");
        this.wordIterator = new WordIterator(charSequence, 0, charSequence.length(), locale);
    }

    public final int getWordEnd(int i) {
        int i2;
        if (this.wordIterator.isAfterPunctuation(this.wordIterator.nextBoundary(i))) {
            i2 = this.wordIterator.getPunctuationEnd(i);
        } else {
            i2 = this.wordIterator.getNextWordEndOnTwoWordBoundary(i);
        }
        if (i2 == -1) {
            return i;
        }
        return i2;
    }

    public final int getWordStart(int i) {
        int i2;
        if (this.wordIterator.isOnPunctuation(this.wordIterator.prevBoundary(i))) {
            i2 = this.wordIterator.getPunctuationBeginning(i);
        } else {
            i2 = this.wordIterator.getPrevWordBeginningOnTwoWordsBoundary(i);
        }
        if (i2 == -1) {
            return i;
        }
        return i2;
    }
}
