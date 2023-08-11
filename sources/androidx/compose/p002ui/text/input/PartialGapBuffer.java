package androidx.compose.p002ui.text.input;

import androidx.compose.p002ui.text.InternalTextApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
@InternalTextApi
/* renamed from: androidx.compose.ui.text.input.PartialGapBuffer */
/* compiled from: GapBuffer.kt */
public final class PartialGapBuffer {
    public static final int $stable = 8;
    public static final int BUF_SIZE = 255;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int NOWHERE = -1;
    public static final int SURROUNDING_SIZE = 64;
    private int bufEnd = -1;
    private int bufStart = -1;
    private GapBuffer buffer;
    private String text;

    /* renamed from: androidx.compose.ui.text.input.PartialGapBuffer$Companion */
    /* compiled from: GapBuffer.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PartialGapBuffer(String str) {
        C12775o.m28639i(str, "text");
        this.text = str;
    }

    public final char get(int i) {
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer == null) {
            return this.text.charAt(i);
        }
        if (i < this.bufStart) {
            return this.text.charAt(i);
        }
        int length = gapBuffer.length();
        int i2 = this.bufStart;
        if (i < length + i2) {
            return gapBuffer.get(i - i2);
        }
        return this.text.charAt(i - ((length - this.bufEnd) + i2));
    }

    public final int getLength() {
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer == null) {
            return this.text.length();
        }
        return (this.text.length() - (this.bufEnd - this.bufStart)) + gapBuffer.length();
    }

    public final String getText() {
        return this.text;
    }

    public final void replace(int i, int i2, String str) {
        boolean z;
        C12775o.m28639i(str, "text");
        boolean z2 = true;
        if (i <= i2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i < 0) {
                z2 = false;
            }
            if (z2) {
                GapBuffer gapBuffer = this.buffer;
                if (gapBuffer == null) {
                    int max = Math.max(255, str.length() + 128);
                    char[] cArr = new char[max];
                    int min = Math.min(i, 64);
                    int min2 = Math.min(this.text.length() - i2, 64);
                    int i3 = i - min;
                    GapBuffer_jvmKt.toCharArray(this.text, cArr, 0, i3, i);
                    int i4 = max - min2;
                    int i5 = min2 + i2;
                    GapBuffer_jvmKt.toCharArray(this.text, cArr, i4, i2, i5);
                    GapBufferKt.toCharArray(str, cArr, min);
                    this.buffer = new GapBuffer(cArr, min + str.length(), i4);
                    this.bufStart = i3;
                    this.bufEnd = i5;
                    return;
                }
                int i6 = this.bufStart;
                int i7 = i - i6;
                int i8 = i2 - i6;
                if (i7 < 0 || i8 > gapBuffer.length()) {
                    this.text = toString();
                    this.buffer = null;
                    this.bufStart = -1;
                    this.bufEnd = -1;
                    replace(i, i2, str);
                    return;
                }
                gapBuffer.replace(i7, i8, str);
                return;
            }
            throw new IllegalArgumentException(("start must be non-negative, but was " + i).toString());
        }
        throw new IllegalArgumentException(("start index must be less than or equal to end index: " + i + " > " + i2).toString());
    }

    public final void setText(String str) {
        C12775o.m28639i(str, "<set-?>");
        this.text = str;
    }

    public String toString() {
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer == null) {
            return this.text;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.text, 0, this.bufStart);
        gapBuffer.append(sb);
        String str = this.text;
        sb.append(str, this.bufEnd, str.length());
        String sb2 = sb.toString();
        C12775o.m28638h(sb2, "sb.toString()");
        return sb2;
    }
}
