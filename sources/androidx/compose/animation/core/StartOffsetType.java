package androidx.compose.animation.core;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: AnimationSpec.kt */
public final class StartOffsetType {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int Delay = m32926constructorimpl(-1);
    /* access modifiers changed from: private */
    public static final int FastForward = m32926constructorimpl(1);
    private final int value;

    /* compiled from: AnimationSpec.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getDelay-Eo1U57Q  reason: not valid java name */
        public final int m32932getDelayEo1U57Q() {
            return StartOffsetType.Delay;
        }

        /* renamed from: getFastForward-Eo1U57Q  reason: not valid java name */
        public final int m32933getFastForwardEo1U57Q() {
            return StartOffsetType.FastForward;
        }
    }

    private /* synthetic */ StartOffsetType(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ StartOffsetType m32925boximpl(int i) {
        return new StartOffsetType(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m32927equalsimpl(int i, Object obj) {
        if ((obj instanceof StartOffsetType) && i == ((StartOffsetType) obj).m32931unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m32928equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m32929hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m32930toStringimpl(int i) {
        return "StartOffsetType(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m32927equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m32929hashCodeimpl(this.value);
    }

    public String toString() {
        return m32930toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m32931unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    private static int m32926constructorimpl(int i) {
        return i;
    }
}
