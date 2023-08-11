package androidx.compose.p002ui.graphics.colorspace;

import androidx.compose.runtime.Immutable;
import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.graphics.colorspace.RenderIntent */
/* compiled from: RenderIntent.kt */
public final class RenderIntent {
    /* access modifiers changed from: private */
    public static final int Absolute = m36132constructorimpl(3);
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int Perceptual = m36132constructorimpl(0);
    /* access modifiers changed from: private */
    public static final int Relative = m36132constructorimpl(1);
    /* access modifiers changed from: private */
    public static final int Saturation = m36132constructorimpl(2);
    private final int value;

    /* renamed from: androidx.compose.ui.graphics.colorspace.RenderIntent$Companion */
    /* compiled from: RenderIntent.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getAbsolute-uksYyKA  reason: not valid java name */
        public final int m36138getAbsoluteuksYyKA() {
            return RenderIntent.Absolute;
        }

        /* renamed from: getPerceptual-uksYyKA  reason: not valid java name */
        public final int m36139getPerceptualuksYyKA() {
            return RenderIntent.Perceptual;
        }

        /* renamed from: getRelative-uksYyKA  reason: not valid java name */
        public final int m36140getRelativeuksYyKA() {
            return RenderIntent.Relative;
        }

        /* renamed from: getSaturation-uksYyKA  reason: not valid java name */
        public final int m36141getSaturationuksYyKA() {
            return RenderIntent.Saturation;
        }
    }

    private /* synthetic */ RenderIntent(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ RenderIntent m36131boximpl(int i) {
        return new RenderIntent(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m36133equalsimpl(int i, Object obj) {
        if ((obj instanceof RenderIntent) && i == ((RenderIntent) obj).m36137unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m36134equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m36135hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m36136toStringimpl(int i) {
        if (m36134equalsimpl0(i, Perceptual)) {
            return "Perceptual";
        }
        if (m36134equalsimpl0(i, Relative)) {
            return "Relative";
        }
        if (m36134equalsimpl0(i, Saturation)) {
            return ExifInterface.TAG_SATURATION;
        }
        if (m36134equalsimpl0(i, Absolute)) {
            return "Absolute";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m36133equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m36135hashCodeimpl(this.value);
    }

    public String toString() {
        return m36136toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m36137unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m36132constructorimpl(int i) {
        return i;
    }
}
