package androidx.compose.p002ui.text.style;

/* renamed from: androidx.compose.ui.text.style.LineBreak_androidKt */
/* compiled from: LineBreak.android.kt */
public final class LineBreak_androidKt {
    /* access modifiers changed from: private */
    public static final int packBytes(int i, int i2, int i3) {
        return i | (i2 << 8) | (i3 << 16);
    }

    /* access modifiers changed from: private */
    public static final int unpackByte1(int i) {
        return i & 255;
    }

    /* access modifiers changed from: private */
    public static final int unpackByte2(int i) {
        return (i >> 8) & 255;
    }

    /* access modifiers changed from: private */
    public static final int unpackByte3(int i) {
        return (i >> 16) & 255;
    }
}
