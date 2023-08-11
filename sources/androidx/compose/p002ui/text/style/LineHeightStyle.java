package androidx.compose.p002ui.text.style;

import androidx.compose.p002ui.text.ExperimentalTextApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.text.style.LineHeightStyle */
/* compiled from: LineHeightStyle.kt */
public final class LineHeightStyle {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final LineHeightStyle Default = new LineHeightStyle(Alignment.Companion.m38326getProportionalPIaL0Z0(), Trim.Companion.m38337getBothEVpEnUU(), (DefaultConstructorMarker) null);
    private final float alignment;
    private final int trim;

    /* renamed from: androidx.compose.ui.text.style.LineHeightStyle$Companion */
    /* compiled from: LineHeightStyle.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LineHeightStyle getDefault() {
            return LineHeightStyle.Default;
        }
    }

    public /* synthetic */ LineHeightStyle(float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineHeightStyle)) {
            return false;
        }
        LineHeightStyle lineHeightStyle = (LineHeightStyle) obj;
        if (Alignment.m38316equalsimpl0(this.alignment, lineHeightStyle.alignment) && Trim.m38331equalsimpl0(this.trim, lineHeightStyle.trim)) {
            return true;
        }
        return false;
    }

    /* renamed from: getAlignment-PIaL0Z0  reason: not valid java name */
    public final float m38311getAlignmentPIaL0Z0() {
        return this.alignment;
    }

    /* renamed from: getTrim-EVpEnUU  reason: not valid java name */
    public final int m38312getTrimEVpEnUU() {
        return this.trim;
    }

    public int hashCode() {
        return (Alignment.m38317hashCodeimpl(this.alignment) * 31) + Trim.m38332hashCodeimpl(this.trim);
    }

    public String toString() {
        return "LineHeightStyle(alignment=" + Alignment.m38318toStringimpl(this.alignment) + ", trim=" + Trim.m38335toStringimpl(this.trim) + ')';
    }

    private LineHeightStyle(float f, int i) {
        this.alignment = f;
        this.trim = i;
    }

    /* renamed from: androidx.compose.ui.text.style.LineHeightStyle$Alignment */
    /* compiled from: LineHeightStyle.kt */
    public static final class Alignment {
        /* access modifiers changed from: private */
        public static final float Bottom = m38314constructorimpl(1.0f);
        /* access modifiers changed from: private */
        public static final float Center = m38314constructorimpl(0.5f);
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final float Proportional = m38314constructorimpl(-1.0f);
        /* access modifiers changed from: private */
        public static final float Top = m38314constructorimpl(0.0f);
        private final float topRatio;

        @ExperimentalTextApi
        private /* synthetic */ Alignment(float f) {
            this.topRatio = f;
        }

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ Alignment m38313boximpl(float f) {
            return new Alignment(f);
        }

        @ExperimentalTextApi
        /* renamed from: constructor-impl  reason: not valid java name */
        public static float m38314constructorimpl(float f) {
            boolean z;
            boolean z2;
            boolean z3 = true;
            if (0.0f > f || f > 1.0f) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                if (f == -1.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    z3 = false;
                }
            }
            if (z3) {
                return f;
            }
            throw new IllegalStateException("topRatio should be in [0..1] range or -1".toString());
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m38315equalsimpl(float f, Object obj) {
            if ((obj instanceof Alignment) && Float.compare(f, ((Alignment) obj).m38319unboximpl()) == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m38316equalsimpl0(float f, float f2) {
            if (Float.compare(f, f2) == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m38317hashCodeimpl(float f) {
            return Float.hashCode(f);
        }

        /* renamed from: toString-impl  reason: not valid java name */
        public static String m38318toStringimpl(float f) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4 = true;
            if (f == Top) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f == Center) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f == Proportional) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f != Bottom) {
                z4 = false;
            }
            if (z4) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f + ')';
        }

        public boolean equals(Object obj) {
            return m38315equalsimpl(this.topRatio, obj);
        }

        public int hashCode() {
            return m38317hashCodeimpl(this.topRatio);
        }

        public String toString() {
            return m38318toStringimpl(this.topRatio);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ float m38319unboximpl() {
            return this.topRatio;
        }

        /* renamed from: androidx.compose.ui.text.style.LineHeightStyle$Alignment$Companion */
        /* compiled from: LineHeightStyle.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: getBottom-PIaL0Z0  reason: not valid java name */
            public final float m38324getBottomPIaL0Z0() {
                return Alignment.Bottom;
            }

            /* renamed from: getCenter-PIaL0Z0  reason: not valid java name */
            public final float m38325getCenterPIaL0Z0() {
                return Alignment.Center;
            }

            /* renamed from: getProportional-PIaL0Z0  reason: not valid java name */
            public final float m38326getProportionalPIaL0Z0() {
                return Alignment.Proportional;
            }

            /* renamed from: getTop-PIaL0Z0  reason: not valid java name */
            public final float m38327getTopPIaL0Z0() {
                return Alignment.Top;
            }

            /* renamed from: getBottom-PIaL0Z0$annotations  reason: not valid java name */
            public static /* synthetic */ void m38320getBottomPIaL0Z0$annotations() {
            }

            /* renamed from: getCenter-PIaL0Z0$annotations  reason: not valid java name */
            public static /* synthetic */ void m38321getCenterPIaL0Z0$annotations() {
            }

            /* renamed from: getProportional-PIaL0Z0$annotations  reason: not valid java name */
            public static /* synthetic */ void m38322getProportionalPIaL0Z0$annotations() {
            }

            /* renamed from: getTop-PIaL0Z0$annotations  reason: not valid java name */
            public static /* synthetic */ void m38323getTopPIaL0Z0$annotations() {
            }
        }
    }

    /* renamed from: androidx.compose.ui.text.style.LineHeightStyle$Trim */
    /* compiled from: LineHeightStyle.kt */
    public static final class Trim {
        /* access modifiers changed from: private */
        public static final int Both = m38329constructorimpl(17);
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final int FirstLineTop = m38329constructorimpl(1);
        private static final int FlagTrimBottom = 16;
        private static final int FlagTrimTop = 1;
        /* access modifiers changed from: private */
        public static final int LastLineBottom = m38329constructorimpl(16);
        /* access modifiers changed from: private */
        public static final int None = m38329constructorimpl(0);
        private final int value;

        /* renamed from: androidx.compose.ui.text.style.LineHeightStyle$Trim$Companion */
        /* compiled from: LineHeightStyle.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: getBoth-EVpEnUU  reason: not valid java name */
            public final int m38337getBothEVpEnUU() {
                return Trim.Both;
            }

            /* renamed from: getFirstLineTop-EVpEnUU  reason: not valid java name */
            public final int m38338getFirstLineTopEVpEnUU() {
                return Trim.FirstLineTop;
            }

            /* renamed from: getLastLineBottom-EVpEnUU  reason: not valid java name */
            public final int m38339getLastLineBottomEVpEnUU() {
                return Trim.LastLineBottom;
            }

            /* renamed from: getNone-EVpEnUU  reason: not valid java name */
            public final int m38340getNoneEVpEnUU() {
                return Trim.None;
            }
        }

        private /* synthetic */ Trim(int i) {
            this.value = i;
        }

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ Trim m38328boximpl(int i) {
            return new Trim(i);
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m38330equalsimpl(int i, Object obj) {
            if ((obj instanceof Trim) && i == ((Trim) obj).m38336unboximpl()) {
                return true;
            }
            return false;
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m38331equalsimpl0(int i, int i2) {
            if (i == i2) {
                return true;
            }
            return false;
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m38332hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* renamed from: isTrimFirstLineTop-impl$ui_text_release  reason: not valid java name */
        public static final boolean m38333isTrimFirstLineTopimpl$ui_text_release(int i) {
            if ((i & 1) > 0) {
                return true;
            }
            return false;
        }

        /* renamed from: isTrimLastLineBottom-impl$ui_text_release  reason: not valid java name */
        public static final boolean m38334isTrimLastLineBottomimpl$ui_text_release(int i) {
            if ((i & 16) > 0) {
                return true;
            }
            return false;
        }

        /* renamed from: toString-impl  reason: not valid java name */
        public static String m38335toStringimpl(int i) {
            if (i == FirstLineTop) {
                return "LineHeightStyle.Trim.FirstLineTop";
            }
            if (i == LastLineBottom) {
                return "LineHeightStyle.Trim.LastLineBottom";
            }
            if (i == Both) {
                return "LineHeightStyle.Trim.Both";
            }
            if (i == None) {
                return "LineHeightStyle.Trim.None";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return m38330equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m38332hashCodeimpl(this.value);
        }

        public String toString() {
            return m38335toStringimpl(this.value);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ int m38336unboximpl() {
            return this.value;
        }

        /* renamed from: constructor-impl  reason: not valid java name */
        private static int m38329constructorimpl(int i) {
            return i;
        }
    }
}
