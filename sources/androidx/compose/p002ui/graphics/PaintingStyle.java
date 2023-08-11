package androidx.compose.p002ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.graphics.PaintingStyle */
/* compiled from: PaintingStyle.kt */
public final class PaintingStyle {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int Fill = m35940constructorimpl(0);
    /* access modifiers changed from: private */
    public static final int Stroke = m35940constructorimpl(1);
    private final int value;

    /* renamed from: androidx.compose.ui.graphics.PaintingStyle$Companion */
    /* compiled from: PaintingStyle.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getFill-TiuSbCo  reason: not valid java name */
        public final int m35946getFillTiuSbCo() {
            return PaintingStyle.Fill;
        }

        /* renamed from: getStroke-TiuSbCo  reason: not valid java name */
        public final int m35947getStrokeTiuSbCo() {
            return PaintingStyle.Stroke;
        }
    }

    private /* synthetic */ PaintingStyle(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ PaintingStyle m35939boximpl(int i) {
        return new PaintingStyle(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m35941equalsimpl(int i, Object obj) {
        if ((obj instanceof PaintingStyle) && i == ((PaintingStyle) obj).m35945unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m35942equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m35943hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m35944toStringimpl(int i) {
        if (m35942equalsimpl0(i, Fill)) {
            return "Fill";
        }
        if (m35942equalsimpl0(i, Stroke)) {
            return "Stroke";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m35941equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m35943hashCodeimpl(this.value);
    }

    public String toString() {
        return m35944toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m35945unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m35940constructorimpl(int i) {
        return i;
    }
}
