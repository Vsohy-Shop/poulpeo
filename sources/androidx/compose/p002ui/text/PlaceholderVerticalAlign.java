package androidx.compose.p002ui.text;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.text.PlaceholderVerticalAlign */
/* compiled from: Placeholder.kt */
public final class PlaceholderVerticalAlign {
    /* access modifiers changed from: private */
    public static final int AboveBaseline = m37901constructorimpl(1);
    /* access modifiers changed from: private */
    public static final int Bottom = m37901constructorimpl(3);
    /* access modifiers changed from: private */
    public static final int Center = m37901constructorimpl(4);
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int TextBottom = m37901constructorimpl(6);
    /* access modifiers changed from: private */
    public static final int TextCenter = m37901constructorimpl(7);
    /* access modifiers changed from: private */
    public static final int TextTop = m37901constructorimpl(5);
    /* access modifiers changed from: private */
    public static final int Top = m37901constructorimpl(2);
    private final int value;

    /* renamed from: androidx.compose.ui.text.PlaceholderVerticalAlign$Companion */
    /* compiled from: Placeholder.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getAboveBaseline-J6kI3mc  reason: not valid java name */
        public final int m37907getAboveBaselineJ6kI3mc() {
            return PlaceholderVerticalAlign.AboveBaseline;
        }

        /* renamed from: getBottom-J6kI3mc  reason: not valid java name */
        public final int m37908getBottomJ6kI3mc() {
            return PlaceholderVerticalAlign.Bottom;
        }

        /* renamed from: getCenter-J6kI3mc  reason: not valid java name */
        public final int m37909getCenterJ6kI3mc() {
            return PlaceholderVerticalAlign.Center;
        }

        /* renamed from: getTextBottom-J6kI3mc  reason: not valid java name */
        public final int m37910getTextBottomJ6kI3mc() {
            return PlaceholderVerticalAlign.TextBottom;
        }

        /* renamed from: getTextCenter-J6kI3mc  reason: not valid java name */
        public final int m37911getTextCenterJ6kI3mc() {
            return PlaceholderVerticalAlign.TextCenter;
        }

        /* renamed from: getTextTop-J6kI3mc  reason: not valid java name */
        public final int m37912getTextTopJ6kI3mc() {
            return PlaceholderVerticalAlign.TextTop;
        }

        /* renamed from: getTop-J6kI3mc  reason: not valid java name */
        public final int m37913getTopJ6kI3mc() {
            return PlaceholderVerticalAlign.Top;
        }
    }

    private /* synthetic */ PlaceholderVerticalAlign(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ PlaceholderVerticalAlign m37900boximpl(int i) {
        return new PlaceholderVerticalAlign(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m37902equalsimpl(int i, Object obj) {
        if ((obj instanceof PlaceholderVerticalAlign) && i == ((PlaceholderVerticalAlign) obj).m37906unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m37903equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m37904hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m37905toStringimpl(int i) {
        if (m37903equalsimpl0(i, AboveBaseline)) {
            return "AboveBaseline";
        }
        if (m37903equalsimpl0(i, Top)) {
            return "Top";
        }
        if (m37903equalsimpl0(i, Bottom)) {
            return "Bottom";
        }
        if (m37903equalsimpl0(i, Center)) {
            return "Center";
        }
        if (m37903equalsimpl0(i, TextTop)) {
            return "TextTop";
        }
        if (m37903equalsimpl0(i, TextBottom)) {
            return "TextBottom";
        }
        if (m37903equalsimpl0(i, TextCenter)) {
            return "TextCenter";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m37902equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m37904hashCodeimpl(this.value);
    }

    public String toString() {
        return m37905toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m37906unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m37901constructorimpl(int i) {
        return i;
    }
}
