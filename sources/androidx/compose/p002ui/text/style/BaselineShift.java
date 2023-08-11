package androidx.compose.p002ui.text.style;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.text.style.BaselineShift */
/* compiled from: BaselineShift.kt */
public final class BaselineShift {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final float None = m38237constructorimpl(0.0f);
    /* access modifiers changed from: private */
    public static final float Subscript = m38237constructorimpl(-0.5f);
    /* access modifiers changed from: private */
    public static final float Superscript = m38237constructorimpl(0.5f);
    private final float multiplier;

    private /* synthetic */ BaselineShift(float f) {
        this.multiplier = f;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ BaselineShift m38236boximpl(float f) {
        return new BaselineShift(f);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m38238equalsimpl(float f, Object obj) {
        if ((obj instanceof BaselineShift) && Float.compare(f, ((BaselineShift) obj).m38242unboximpl()) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m38239equalsimpl0(float f, float f2) {
        if (Float.compare(f, f2) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m38240hashCodeimpl(float f) {
        return Float.hashCode(f);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m38241toStringimpl(float f) {
        return "BaselineShift(multiplier=" + f + ')';
    }

    public boolean equals(Object obj) {
        return m38238equalsimpl(this.multiplier, obj);
    }

    public final float getMultiplier() {
        return this.multiplier;
    }

    public int hashCode() {
        return m38240hashCodeimpl(this.multiplier);
    }

    public String toString() {
        return m38241toStringimpl(this.multiplier);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ float m38242unboximpl() {
        return this.multiplier;
    }

    /* renamed from: androidx.compose.ui.text.style.BaselineShift$Companion */
    /* compiled from: BaselineShift.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getNone-y9eOQZs  reason: not valid java name */
        public final float m38246getNoney9eOQZs() {
            return BaselineShift.None;
        }

        /* renamed from: getSubscript-y9eOQZs  reason: not valid java name */
        public final float m38247getSubscripty9eOQZs() {
            return BaselineShift.Subscript;
        }

        /* renamed from: getSuperscript-y9eOQZs  reason: not valid java name */
        public final float m38248getSuperscripty9eOQZs() {
            return BaselineShift.Superscript;
        }

        @Stable
        /* renamed from: getNone-y9eOQZs$annotations  reason: not valid java name */
        public static /* synthetic */ void m38243getNoney9eOQZs$annotations() {
        }

        @Stable
        /* renamed from: getSubscript-y9eOQZs$annotations  reason: not valid java name */
        public static /* synthetic */ void m38244getSubscripty9eOQZs$annotations() {
        }

        @Stable
        /* renamed from: getSuperscript-y9eOQZs$annotations  reason: not valid java name */
        public static /* synthetic */ void m38245getSuperscripty9eOQZs$annotations() {
        }
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static float m38237constructorimpl(float f) {
        return f;
    }
}
