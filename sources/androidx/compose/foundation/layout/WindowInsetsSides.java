package androidx.compose.foundation.layout;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: WindowInsets.kt */
public final class WindowInsetsSides {
    /* access modifiers changed from: private */
    public static final int AllowLeftInLtr;
    /* access modifiers changed from: private */
    public static final int AllowLeftInRtl;
    /* access modifiers changed from: private */
    public static final int AllowRightInLtr;
    /* access modifiers changed from: private */
    public static final int AllowRightInRtl;
    /* access modifiers changed from: private */
    public static final int Bottom;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int End;
    /* access modifiers changed from: private */
    public static final int Horizontal;
    /* access modifiers changed from: private */
    public static final int Left;
    /* access modifiers changed from: private */
    public static final int Right;
    /* access modifiers changed from: private */
    public static final int Start;
    /* access modifiers changed from: private */
    public static final int Top;
    /* access modifiers changed from: private */
    public static final int Vertical;
    private final int value;

    /* compiled from: WindowInsets.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getAllowLeftInLtr-JoeWqyM$foundation_layout_release  reason: not valid java name */
        public final int m33376getAllowLeftInLtrJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.AllowLeftInLtr;
        }

        /* renamed from: getAllowLeftInRtl-JoeWqyM$foundation_layout_release  reason: not valid java name */
        public final int m33377getAllowLeftInRtlJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.AllowLeftInRtl;
        }

        /* renamed from: getAllowRightInLtr-JoeWqyM$foundation_layout_release  reason: not valid java name */
        public final int m33378getAllowRightInLtrJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.AllowRightInLtr;
        }

        /* renamed from: getAllowRightInRtl-JoeWqyM$foundation_layout_release  reason: not valid java name */
        public final int m33379getAllowRightInRtlJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.AllowRightInRtl;
        }

        /* renamed from: getBottom-JoeWqyM  reason: not valid java name */
        public final int m33380getBottomJoeWqyM() {
            return WindowInsetsSides.Bottom;
        }

        /* renamed from: getEnd-JoeWqyM  reason: not valid java name */
        public final int m33381getEndJoeWqyM() {
            return WindowInsetsSides.End;
        }

        /* renamed from: getHorizontal-JoeWqyM  reason: not valid java name */
        public final int m33382getHorizontalJoeWqyM() {
            return WindowInsetsSides.Horizontal;
        }

        /* renamed from: getLeft-JoeWqyM  reason: not valid java name */
        public final int m33383getLeftJoeWqyM() {
            return WindowInsetsSides.Left;
        }

        /* renamed from: getRight-JoeWqyM  reason: not valid java name */
        public final int m33384getRightJoeWqyM() {
            return WindowInsetsSides.Right;
        }

        /* renamed from: getStart-JoeWqyM  reason: not valid java name */
        public final int m33385getStartJoeWqyM() {
            return WindowInsetsSides.Start;
        }

        /* renamed from: getTop-JoeWqyM  reason: not valid java name */
        public final int m33386getTopJoeWqyM() {
            return WindowInsetsSides.Top;
        }

        /* renamed from: getVertical-JoeWqyM  reason: not valid java name */
        public final int m33387getVerticalJoeWqyM() {
            return WindowInsetsSides.Vertical;
        }
    }

    static {
        int r0 = m33367constructorimpl(8);
        AllowLeftInLtr = r0;
        int r1 = m33367constructorimpl(4);
        AllowRightInLtr = r1;
        int r2 = m33367constructorimpl(2);
        AllowLeftInRtl = r2;
        int r3 = m33367constructorimpl(1);
        AllowRightInRtl = r3;
        Start = m33372plusgK_yJZ4(r0, r3);
        End = m33372plusgK_yJZ4(r1, r2);
        int r4 = m33367constructorimpl(16);
        Top = r4;
        int r5 = m33367constructorimpl(32);
        Bottom = r5;
        int r02 = m33372plusgK_yJZ4(r0, r2);
        Left = r02;
        int r12 = m33372plusgK_yJZ4(r1, r3);
        Right = r12;
        Horizontal = m33372plusgK_yJZ4(r02, r12);
        Vertical = m33372plusgK_yJZ4(r4, r5);
    }

    private /* synthetic */ WindowInsetsSides(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ WindowInsetsSides m33366boximpl(int i) {
        return new WindowInsetsSides(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m33368equalsimpl(int i, Object obj) {
        if ((obj instanceof WindowInsetsSides) && i == ((WindowInsetsSides) obj).m33375unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m33369equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hasAny-bkgdKaI$foundation_layout_release  reason: not valid java name */
    public static final boolean m33370hasAnybkgdKaI$foundation_layout_release(int i, int i2) {
        if ((i & i2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m33371hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: plus-gK_yJZ4  reason: not valid java name */
    public static final int m33372plusgK_yJZ4(int i, int i2) {
        return m33367constructorimpl(i | i2);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m33373toStringimpl(int i) {
        return "WindowInsetsSides(" + m33374valueToStringimpl(i) + ')';
    }

    /* renamed from: valueToString-impl  reason: not valid java name */
    private static final String m33374valueToStringimpl(int i) {
        StringBuilder sb = new StringBuilder();
        int i2 = Start;
        if ((i & i2) == i2) {
            valueToString_impl$lambda$0$appendPlus(sb, "Start");
        }
        int i3 = Left;
        if ((i & i3) == i3) {
            valueToString_impl$lambda$0$appendPlus(sb, "Left");
        }
        int i4 = Top;
        if ((i & i4) == i4) {
            valueToString_impl$lambda$0$appendPlus(sb, "Top");
        }
        int i5 = End;
        if ((i & i5) == i5) {
            valueToString_impl$lambda$0$appendPlus(sb, "End");
        }
        int i6 = Right;
        if ((i & i6) == i6) {
            valueToString_impl$lambda$0$appendPlus(sb, "Right");
        }
        int i7 = Bottom;
        if ((i & i7) == i7) {
            valueToString_impl$lambda$0$appendPlus(sb, "Bottom");
        }
        String sb2 = sb.toString();
        C12775o.m28638h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    private static final void valueToString_impl$lambda$0$appendPlus(StringBuilder sb, String str) {
        boolean z;
        if (sb.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            sb.append('+');
        }
        sb.append(str);
    }

    public boolean equals(Object obj) {
        return m33368equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m33371hashCodeimpl(this.value);
    }

    public String toString() {
        return m33373toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m33375unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    private static int m33367constructorimpl(int i) {
        return i;
    }
}
