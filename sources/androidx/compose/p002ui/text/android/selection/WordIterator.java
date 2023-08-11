package androidx.compose.p002ui.text.android.selection;

import androidx.compose.p002ui.text.android.CharSequenceCharacterIterator;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.text.android.selection.WordIterator */
/* compiled from: WordIterator.kt */
public final class WordIterator {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final int WINDOW_WIDTH = 50;
    private final CharSequence charSequence;
    private final int end;
    private final BreakIterator iterator;
    private final int start;

    /* renamed from: androidx.compose.ui.text.android.selection.WordIterator$Companion */
    /* compiled from: WordIterator.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isPunctuation$ui_text_release(int i) {
            int type = Character.getType(i);
            if (type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21) {
                return true;
            }
            return false;
        }
    }

    public WordIterator(CharSequence charSequence2, int i, int i2, Locale locale) {
        boolean z;
        C12775o.m28639i(charSequence2, "charSequence");
        this.charSequence = charSequence2;
        boolean z2 = true;
        if (i < 0 || i > charSequence2.length()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if ((i2 < 0 || i2 > charSequence2.length()) ? false : z2) {
                BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
                C12775o.m28638h(wordInstance, "getWordInstance(locale)");
                this.iterator = wordInstance;
                this.start = Math.max(0, i - 50);
                this.end = Math.min(charSequence2.length(), i2 + 50);
                wordInstance.setText(new CharSequenceCharacterIterator(charSequence2, i, i2));
                return;
            }
            throw new IllegalArgumentException("input end index is outside the CharSequence".toString());
        }
        throw new IllegalArgumentException("input start index is outside the CharSequence".toString());
    }

    private final void checkOffsetIsValid(int i) {
        int i2 = this.start;
        boolean z = false;
        if (i <= this.end && i2 <= i) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(("Invalid offset: " + i + ". Valid range is [" + this.start + " , " + this.end + ']').toString());
        }
    }

    private final int getBeginning(int i, boolean z) {
        checkOffsetIsValid(i);
        if (isOnLetterOrDigit(i)) {
            if (!this.iterator.isBoundary(i) || (isAfterLetterOrDigit(i) && z)) {
                return this.iterator.preceding(i);
            }
            return i;
        } else if (isAfterLetterOrDigit(i)) {
            return this.iterator.preceding(i);
        } else {
            return -1;
        }
    }

    private final int getEnd(int i, boolean z) {
        checkOffsetIsValid(i);
        if (isAfterLetterOrDigit(i)) {
            if (!this.iterator.isBoundary(i) || (isOnLetterOrDigit(i) && z)) {
                return this.iterator.following(i);
            }
            return i;
        } else if (isOnLetterOrDigit(i)) {
            return this.iterator.following(i);
        } else {
            return -1;
        }
    }

    private final boolean isAfterLetterOrDigit(int i) {
        boolean z;
        int i2 = this.start + 1;
        if (i > this.end || i2 > i) {
            z = false;
        } else {
            z = true;
        }
        if (!z || !Character.isLetterOrDigit(Character.codePointBefore(this.charSequence, i))) {
            return false;
        }
        return true;
    }

    private final boolean isOnLetterOrDigit(int i) {
        boolean z;
        int i2 = this.start;
        if (i >= this.end || i2 > i) {
            z = false;
        } else {
            z = true;
        }
        if (!z || !Character.isLetterOrDigit(Character.codePointAt(this.charSequence, i))) {
            return false;
        }
        return true;
    }

    private final boolean isPunctuationEndBoundary(int i) {
        if (isOnPunctuation(i) || !isAfterPunctuation(i)) {
            return false;
        }
        return true;
    }

    private final boolean isPunctuationStartBoundary(int i) {
        if (!isOnPunctuation(i) || isAfterPunctuation(i)) {
            return false;
        }
        return true;
    }

    public final int getNextWordEndOnTwoWordBoundary(int i) {
        return getEnd(i, true);
    }

    public final int getPrevWordBeginningOnTwoWordsBoundary(int i) {
        return getBeginning(i, true);
    }

    public final int getPunctuationBeginning(int i) {
        checkOffsetIsValid(i);
        while (i != -1 && !isPunctuationStartBoundary(i)) {
            i = prevBoundary(i);
        }
        return i;
    }

    public final int getPunctuationEnd(int i) {
        checkOffsetIsValid(i);
        while (i != -1 && !isPunctuationEndBoundary(i)) {
            i = nextBoundary(i);
        }
        return i;
    }

    public final boolean isAfterPunctuation(int i) {
        boolean z = true;
        int i2 = this.start + 1;
        if (i > this.end || i2 > i) {
            z = false;
        }
        if (!z) {
            return false;
        }
        return Companion.isPunctuation$ui_text_release(Character.codePointBefore(this.charSequence, i));
    }

    public final boolean isOnPunctuation(int i) {
        boolean z;
        int i2 = this.start;
        if (i >= this.end || i2 > i) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        return Companion.isPunctuation$ui_text_release(Character.codePointAt(this.charSequence, i));
    }

    public final int nextBoundary(int i) {
        checkOffsetIsValid(i);
        return this.iterator.following(i);
    }

    public final int prevBoundary(int i) {
        checkOffsetIsValid(i);
        return this.iterator.preceding(i);
    }
}
