package androidx.compose.p002ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.graphics.StrokeJoin */
/* compiled from: StrokeJoin.kt */
public final class StrokeJoin {
    /* access modifiers changed from: private */
    public static final int Bevel = m36058constructorimpl(2);
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int Miter = m36058constructorimpl(0);
    /* access modifiers changed from: private */
    public static final int Round = m36058constructorimpl(1);
    private final int value;

    /* renamed from: androidx.compose.ui.graphics.StrokeJoin$Companion */
    /* compiled from: StrokeJoin.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getBevel-LxFBmk8  reason: not valid java name */
        public final int m36064getBevelLxFBmk8() {
            return StrokeJoin.Bevel;
        }

        /* renamed from: getMiter-LxFBmk8  reason: not valid java name */
        public final int m36065getMiterLxFBmk8() {
            return StrokeJoin.Miter;
        }

        /* renamed from: getRound-LxFBmk8  reason: not valid java name */
        public final int m36066getRoundLxFBmk8() {
            return StrokeJoin.Round;
        }
    }

    private /* synthetic */ StrokeJoin(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ StrokeJoin m36057boximpl(int i) {
        return new StrokeJoin(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m36059equalsimpl(int i, Object obj) {
        if ((obj instanceof StrokeJoin) && i == ((StrokeJoin) obj).m36063unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m36060equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m36061hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m36062toStringimpl(int i) {
        if (m36060equalsimpl0(i, Miter)) {
            return "Miter";
        }
        if (m36060equalsimpl0(i, Round)) {
            return "Round";
        }
        if (m36060equalsimpl0(i, Bevel)) {
            return "Bevel";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m36059equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m36061hashCodeimpl(this.value);
    }

    public String toString() {
        return m36062toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m36063unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m36058constructorimpl(int i) {
        return i;
    }
}
