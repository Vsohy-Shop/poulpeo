package androidx.compose.p002ui.text.style;

import androidx.compose.p002ui.text.ExperimentalTextApi;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
@ExperimentalTextApi
/* renamed from: androidx.compose.ui.text.style.TextMotion */
/* compiled from: TextMotion.android.kt */
public final class TextMotion {
    public static final int $stable = 0;
    /* access modifiers changed from: private */
    public static final TextMotion Animated;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final TextMotion Static;
    private final int linearity;
    private final boolean subpixelTextPositioning;

    /* renamed from: androidx.compose.ui.text.style.TextMotion$Companion */
    /* compiled from: TextMotion.android.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TextMotion getAnimated() {
            return TextMotion.Animated;
        }

        public final TextMotion getStatic() {
            return TextMotion.Static;
        }
    }

    static {
        Linearity.Companion companion = Linearity.Companion;
        Static = new TextMotion(companion.m38384getFontHinting4e0Vf04(), false, (DefaultConstructorMarker) null);
        Animated = new TextMotion(companion.m38385getLinear4e0Vf04(), true, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ TextMotion(int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z);
    }

    /* renamed from: copy-JdDtMQo$ui_text_release$default  reason: not valid java name */
    public static /* synthetic */ TextMotion m38374copyJdDtMQo$ui_text_release$default(TextMotion textMotion, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = textMotion.linearity;
        }
        if ((i2 & 2) != 0) {
            z = textMotion.subpixelTextPositioning;
        }
        return textMotion.m38375copyJdDtMQo$ui_text_release(i, z);
    }

    /* renamed from: copy-JdDtMQo$ui_text_release  reason: not valid java name */
    public final TextMotion m38375copyJdDtMQo$ui_text_release(int i, boolean z) {
        return new TextMotion(i, z, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextMotion)) {
            return false;
        }
        TextMotion textMotion = (TextMotion) obj;
        if (Linearity.m38380equalsimpl0(this.linearity, textMotion.linearity) && this.subpixelTextPositioning == textMotion.subpixelTextPositioning) {
            return true;
        }
        return false;
    }

    /* renamed from: getLinearity-4e0Vf04$ui_text_release  reason: not valid java name */
    public final int m38376getLinearity4e0Vf04$ui_text_release() {
        return this.linearity;
    }

    public final boolean getSubpixelTextPositioning$ui_text_release() {
        return this.subpixelTextPositioning;
    }

    public int hashCode() {
        return (Linearity.m38381hashCodeimpl(this.linearity) * 31) + Boolean.hashCode(this.subpixelTextPositioning);
    }

    public String toString() {
        if (C12775o.m28634d(this, Static)) {
            return "TextMotion.Static";
        }
        if (C12775o.m28634d(this, Animated)) {
            return "TextMotion.Animated";
        }
        return "Invalid";
    }

    private TextMotion(int i, boolean z) {
        this.linearity = i;
        this.subpixelTextPositioning = z;
    }

    /* renamed from: androidx.compose.ui.text.style.TextMotion$Linearity */
    /* compiled from: TextMotion.android.kt */
    public static final class Linearity {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final int FontHinting = m38378constructorimpl(2);
        /* access modifiers changed from: private */
        public static final int Linear = m38378constructorimpl(1);
        /* access modifiers changed from: private */
        public static final int None = m38378constructorimpl(3);
        private final int value;

        /* renamed from: androidx.compose.ui.text.style.TextMotion$Linearity$Companion */
        /* compiled from: TextMotion.android.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: getFontHinting-4e0Vf04  reason: not valid java name */
            public final int m38384getFontHinting4e0Vf04() {
                return Linearity.FontHinting;
            }

            /* renamed from: getLinear-4e0Vf04  reason: not valid java name */
            public final int m38385getLinear4e0Vf04() {
                return Linearity.Linear;
            }

            /* renamed from: getNone-4e0Vf04  reason: not valid java name */
            public final int m38386getNone4e0Vf04() {
                return Linearity.None;
            }
        }

        private /* synthetic */ Linearity(int i) {
            this.value = i;
        }

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ Linearity m38377boximpl(int i) {
            return new Linearity(i);
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m38379equalsimpl(int i, Object obj) {
            if ((obj instanceof Linearity) && i == ((Linearity) obj).m38383unboximpl()) {
                return true;
            }
            return false;
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m38380equalsimpl0(int i, int i2) {
            if (i == i2) {
                return true;
            }
            return false;
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m38381hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* renamed from: toString-impl  reason: not valid java name */
        public static String m38382toStringimpl(int i) {
            if (m38380equalsimpl0(i, Linear)) {
                return "Linearity.Linear";
            }
            if (m38380equalsimpl0(i, FontHinting)) {
                return "Linearity.FontHinting";
            }
            if (m38380equalsimpl0(i, None)) {
                return "Linearity.None";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return m38379equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m38381hashCodeimpl(this.value);
        }

        public String toString() {
            return m38382toStringimpl(this.value);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ int m38383unboximpl() {
            return this.value;
        }

        /* renamed from: constructor-impl  reason: not valid java name */
        private static int m38378constructorimpl(int i) {
            return i;
        }
    }
}
