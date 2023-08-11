package androidx.compose.p002ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,557:1\n137#2:558\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n101#1:558\n*E\n"})
/* renamed from: androidx.compose.ui.unit.Dp */
/* compiled from: Dp.kt */
public final class C1232Dp implements Comparable<C1232Dp> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final float Hairline = m38468constructorimpl(0.0f);
    /* access modifiers changed from: private */
    public static final float Infinity = m38468constructorimpl(Float.POSITIVE_INFINITY);
    /* access modifiers changed from: private */
    public static final float Unspecified = m38468constructorimpl(Float.NaN);
    private final float value;

    private /* synthetic */ C1232Dp(float f) {
        this.value = f;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ C1232Dp m38466boximpl(float f) {
        return new C1232Dp(f);
    }

    @Stable
    /* renamed from: div-0680j_4  reason: not valid java name */
    public static final float m38469div0680j_4(float f, float f2) {
        return f / f2;
    }

    @Stable
    /* renamed from: div-u2uoSUM  reason: not valid java name */
    public static final float m38470divu2uoSUM(float f, float f2) {
        return m38468constructorimpl(f / f2);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m38472equalsimpl(float f, Object obj) {
        if ((obj instanceof C1232Dp) && Float.compare(f, ((C1232Dp) obj).m38482unboximpl()) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m38473equalsimpl0(float f, float f2) {
        if (Float.compare(f, f2) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m38474hashCodeimpl(float f) {
        return Float.hashCode(f);
    }

    @Stable
    /* renamed from: minus-5rwHm24  reason: not valid java name */
    public static final float m38475minus5rwHm24(float f, float f2) {
        return m38468constructorimpl(f - f2);
    }

    @Stable
    /* renamed from: plus-5rwHm24  reason: not valid java name */
    public static final float m38476plus5rwHm24(float f, float f2) {
        return m38468constructorimpl(f + f2);
    }

    @Stable
    /* renamed from: times-u2uoSUM  reason: not valid java name */
    public static final float m38477timesu2uoSUM(float f, float f2) {
        return m38468constructorimpl(f * f2);
    }

    @Stable
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m38479toStringimpl(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Stable
    /* renamed from: unaryMinus-D9Ej5fM  reason: not valid java name */
    public static final float m38480unaryMinusD9Ej5fM(float f) {
        return m38468constructorimpl(-f);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return m38481compareTo0680j_4(((C1232Dp) obj).m38482unboximpl());
    }

    @Stable
    /* renamed from: compareTo-0680j_4  reason: not valid java name */
    public int m38481compareTo0680j_4(float f) {
        return m38467compareTo0680j_4(this.value, f);
    }

    public boolean equals(Object obj) {
        return m38472equalsimpl(this.value, obj);
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return m38474hashCodeimpl(this.value);
    }

    @Stable
    public String toString() {
        return m38479toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ float m38482unboximpl() {
        return this.value;
    }

    @Stable
    /* renamed from: compareTo-0680j_4  reason: not valid java name */
    public static int m38467compareTo0680j_4(float f, float f2) {
        return Float.compare(f, f2);
    }

    @Stable
    /* renamed from: div-u2uoSUM  reason: not valid java name */
    public static final float m38471divu2uoSUM(float f, int i) {
        return m38468constructorimpl(f / ((float) i));
    }

    @Stable
    /* renamed from: times-u2uoSUM  reason: not valid java name */
    public static final float m38478timesu2uoSUM(float f, int i) {
        return m38468constructorimpl(f * ((float) i));
    }

    /* renamed from: androidx.compose.ui.unit.Dp$Companion */
    /* compiled from: Dp.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getHairline-D9Ej5fM  reason: not valid java name */
        public final float m38486getHairlineD9Ej5fM() {
            return C1232Dp.Hairline;
        }

        /* renamed from: getInfinity-D9Ej5fM  reason: not valid java name */
        public final float m38487getInfinityD9Ej5fM() {
            return C1232Dp.Infinity;
        }

        /* renamed from: getUnspecified-D9Ej5fM  reason: not valid java name */
        public final float m38488getUnspecifiedD9Ej5fM() {
            return C1232Dp.Unspecified;
        }

        @Stable
        /* renamed from: getHairline-D9Ej5fM$annotations  reason: not valid java name */
        public static /* synthetic */ void m38483getHairlineD9Ej5fM$annotations() {
        }

        @Stable
        /* renamed from: getInfinity-D9Ej5fM$annotations  reason: not valid java name */
        public static /* synthetic */ void m38484getInfinityD9Ej5fM$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-D9Ej5fM$annotations  reason: not valid java name */
        public static /* synthetic */ void m38485getUnspecifiedD9Ej5fM$annotations() {
        }
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static float m38468constructorimpl(float f) {
        return f;
    }
}
