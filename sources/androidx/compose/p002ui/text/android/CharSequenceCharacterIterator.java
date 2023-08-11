package androidx.compose.p002ui.text.android;

import java.text.CharacterIterator;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.android.CharSequenceCharacterIterator */
/* compiled from: CharSequenceCharacterIterator.kt */
public final class CharSequenceCharacterIterator implements CharacterIterator {
    private final CharSequence charSequence;
    private final int end;
    private int index;
    private final int start;

    public CharSequenceCharacterIterator(CharSequence charSequence2, int i, int i2) {
        C12775o.m28639i(charSequence2, "charSequence");
        this.charSequence = charSequence2;
        this.start = i;
        this.end = i2;
        this.index = i;
    }

    public Object clone() {
        try {
            Object clone = super.clone();
            C12775o.m28638h(clone, "{\n            @Suppress(…  super.clone()\n        }");
            return clone;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public char current() {
        int i = this.index;
        if (i == this.end) {
            return 65535;
        }
        return this.charSequence.charAt(i);
    }

    public char first() {
        this.index = this.start;
        return current();
    }

    public int getBeginIndex() {
        return this.start;
    }

    public int getEndIndex() {
        return this.end;
    }

    public int getIndex() {
        return this.index;
    }

    public char last() {
        int i = this.start;
        int i2 = this.end;
        if (i == i2) {
            this.index = i2;
            return 65535;
        }
        int i3 = i2 - 1;
        this.index = i3;
        return this.charSequence.charAt(i3);
    }

    public char next() {
        int i = this.index + 1;
        this.index = i;
        int i2 = this.end;
        if (i < i2) {
            return this.charSequence.charAt(i);
        }
        this.index = i2;
        return 65535;
    }

    public char previous() {
        int i = this.index;
        if (i <= this.start) {
            return 65535;
        }
        int i2 = i - 1;
        this.index = i2;
        return this.charSequence.charAt(i2);
    }

    public char setIndex(int i) {
        int i2 = this.start;
        boolean z = false;
        if (i <= this.end && i2 <= i) {
            z = true;
        }
        if (z) {
            this.index = i;
            return current();
        }
        throw new IllegalArgumentException("invalid position");
    }
}
