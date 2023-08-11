package androidx.compose.p002ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.graphics.StampedPathEffectStyle */
/* compiled from: PathEffect.kt */
public final class StampedPathEffectStyle {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int Morph = m36038constructorimpl(2);
    /* access modifiers changed from: private */
    public static final int Rotate = m36038constructorimpl(1);
    /* access modifiers changed from: private */
    public static final int Translate = m36038constructorimpl(0);
    private final int value;

    /* renamed from: androidx.compose.ui.graphics.StampedPathEffectStyle$Companion */
    /* compiled from: PathEffect.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getMorph-Ypspkwk  reason: not valid java name */
        public final int m36044getMorphYpspkwk() {
            return StampedPathEffectStyle.Morph;
        }

        /* renamed from: getRotate-Ypspkwk  reason: not valid java name */
        public final int m36045getRotateYpspkwk() {
            return StampedPathEffectStyle.Rotate;
        }

        /* renamed from: getTranslate-Ypspkwk  reason: not valid java name */
        public final int m36046getTranslateYpspkwk() {
            return StampedPathEffectStyle.Translate;
        }
    }

    private /* synthetic */ StampedPathEffectStyle(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ StampedPathEffectStyle m36037boximpl(int i) {
        return new StampedPathEffectStyle(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m36039equalsimpl(int i, Object obj) {
        if ((obj instanceof StampedPathEffectStyle) && i == ((StampedPathEffectStyle) obj).m36043unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m36040equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m36041hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m36042toStringimpl(int i) {
        if (m36040equalsimpl0(i, Translate)) {
            return "Translate";
        }
        if (m36040equalsimpl0(i, Rotate)) {
            return "Rotate";
        }
        if (m36040equalsimpl0(i, Morph)) {
            return "Morph";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m36039equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m36041hashCodeimpl(this.value);
    }

    public String toString() {
        return m36042toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m36043unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m36038constructorimpl(int i) {
        return i;
    }
}
