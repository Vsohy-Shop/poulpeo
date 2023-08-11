package androidx.compose.p002ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.graphics.ImageBitmapConfig */
/* compiled from: ImageBitmap.kt */
public final class ImageBitmapConfig {
    /* access modifiers changed from: private */
    public static final int Alpha8 = m35881constructorimpl(1);
    /* access modifiers changed from: private */
    public static final int Argb8888 = m35881constructorimpl(0);
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int F16 = m35881constructorimpl(3);
    /* access modifiers changed from: private */
    public static final int Gpu = m35881constructorimpl(4);
    /* access modifiers changed from: private */
    public static final int Rgb565 = m35881constructorimpl(2);
    private final int value;

    /* renamed from: androidx.compose.ui.graphics.ImageBitmapConfig$Companion */
    /* compiled from: ImageBitmap.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getAlpha8-_sVssgQ  reason: not valid java name */
        public final int m35887getAlpha8_sVssgQ() {
            return ImageBitmapConfig.Alpha8;
        }

        /* renamed from: getArgb8888-_sVssgQ  reason: not valid java name */
        public final int m35888getArgb8888_sVssgQ() {
            return ImageBitmapConfig.Argb8888;
        }

        /* renamed from: getF16-_sVssgQ  reason: not valid java name */
        public final int m35889getF16_sVssgQ() {
            return ImageBitmapConfig.F16;
        }

        /* renamed from: getGpu-_sVssgQ  reason: not valid java name */
        public final int m35890getGpu_sVssgQ() {
            return ImageBitmapConfig.Gpu;
        }

        /* renamed from: getRgb565-_sVssgQ  reason: not valid java name */
        public final int m35891getRgb565_sVssgQ() {
            return ImageBitmapConfig.Rgb565;
        }
    }

    private /* synthetic */ ImageBitmapConfig(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ ImageBitmapConfig m35880boximpl(int i) {
        return new ImageBitmapConfig(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m35882equalsimpl(int i, Object obj) {
        if ((obj instanceof ImageBitmapConfig) && i == ((ImageBitmapConfig) obj).m35886unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m35883equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m35884hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m35885toStringimpl(int i) {
        if (m35883equalsimpl0(i, Argb8888)) {
            return "Argb8888";
        }
        if (m35883equalsimpl0(i, Alpha8)) {
            return "Alpha8";
        }
        if (m35883equalsimpl0(i, Rgb565)) {
            return "Rgb565";
        }
        if (m35883equalsimpl0(i, F16)) {
            return "F16";
        }
        if (m35883equalsimpl0(i, Gpu)) {
            return "Gpu";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m35882equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m35884hashCodeimpl(this.value);
    }

    public String toString() {
        return m35885toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m35886unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m35881constructorimpl(int i) {
        return i;
    }
}
