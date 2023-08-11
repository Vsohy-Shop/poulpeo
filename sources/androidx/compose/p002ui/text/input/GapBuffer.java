package androidx.compose.p002ui.text.input;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nGapBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GapBuffer.kt\nandroidx/compose/ui/text/input/GapBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,338:1\n1#2:339\n*E\n"})
/* renamed from: androidx.compose.ui.text.input.GapBuffer */
/* compiled from: GapBuffer.kt */
final class GapBuffer {
    private char[] buffer;
    private int capacity;
    private int gapEnd;
    private int gapStart;

    public GapBuffer(char[] cArr, int i, int i2) {
        C12775o.m28639i(cArr, "initBuffer");
        this.capacity = cArr.length;
        this.buffer = cArr;
        this.gapStart = i;
        this.gapEnd = i2;
    }

    private final void delete(int i, int i2) {
        int i3 = this.gapStart;
        if (i < i3 && i2 <= i3) {
            int i4 = i3 - i2;
            char[] cArr = this.buffer;
            char[] unused = C12708o.m28338e(cArr, cArr, this.gapEnd - i4, i2, i3);
            this.gapStart = i;
            this.gapEnd -= i4;
        } else if (i >= i3 || i2 < i3) {
            int gapLength = i + gapLength();
            int gapLength2 = i2 + gapLength();
            int i5 = this.gapEnd;
            char[] cArr2 = this.buffer;
            char[] unused2 = C12708o.m28338e(cArr2, cArr2, this.gapStart, i5, gapLength);
            this.gapStart += gapLength - i5;
            this.gapEnd = gapLength2;
        } else {
            this.gapEnd = i2 + gapLength();
            this.gapStart = i;
        }
    }

    private final int gapLength() {
        return this.gapEnd - this.gapStart;
    }

    private final void makeSureAvailableSpace(int i) {
        if (i > gapLength()) {
            int gapLength = i - gapLength();
            int i2 = this.capacity;
            do {
                i2 *= 2;
            } while (i2 - this.capacity < gapLength);
            char[] cArr = new char[i2];
            char[] unused = C12708o.m28338e(this.buffer, cArr, 0, 0, this.gapStart);
            int i3 = this.capacity;
            int i4 = this.gapEnd;
            int i5 = i3 - i4;
            int i6 = i2 - i5;
            char[] unused2 = C12708o.m28338e(this.buffer, cArr, i6, i4, i5 + i4);
            this.buffer = cArr;
            this.capacity = i2;
            this.gapEnd = i6;
        }
    }

    public final void append(StringBuilder sb) {
        C12775o.m28639i(sb, "builder");
        sb.append(this.buffer, 0, this.gapStart);
        char[] cArr = this.buffer;
        int i = this.gapEnd;
        sb.append(cArr, i, this.capacity - i);
    }

    public final char get(int i) {
        int i2 = this.gapStart;
        if (i < i2) {
            return this.buffer[i];
        }
        return this.buffer[(i - i2) + this.gapEnd];
    }

    public final int length() {
        return this.capacity - gapLength();
    }

    public final void replace(int i, int i2, String str) {
        C12775o.m28639i(str, "text");
        makeSureAvailableSpace(str.length() - (i2 - i));
        delete(i, i2);
        GapBufferKt.toCharArray(str, this.buffer, this.gapStart);
        this.gapStart += str.length();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(sb);
        String sb2 = sb.toString();
        C12775o.m28638h(sb2, "StringBuilder().apply { append(this) }.toString()");
        return sb2;
    }
}
