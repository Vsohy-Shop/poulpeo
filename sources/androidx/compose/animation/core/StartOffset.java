package androidx.compose.animation.core;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: AnimationSpec.kt */
public final class StartOffset {
    private final long value;

    private /* synthetic */ StartOffset(long j) {
        this.value = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ StartOffset m32914boximpl(long j) {
        return new StartOffset(j);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    private static long m32916constructorimpl(long j) {
        return j;
    }

    /* renamed from: constructor-impl$default  reason: not valid java name */
    public static /* synthetic */ long m32917constructorimpl$default(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i3 & 2) != 0) {
            i2 = StartOffsetType.Companion.m32932getDelayEo1U57Q();
        }
        return m32915constructorimpl(i, i2);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m32918equalsimpl(long j, Object obj) {
        if ((obj instanceof StartOffset) && j == ((StartOffset) obj).m32924unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m32919equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: getOffsetMillis-impl  reason: not valid java name */
    public static final int m32920getOffsetMillisimpl(long j) {
        return Math.abs((int) j);
    }

    /* renamed from: getOffsetType-Eo1U57Q  reason: not valid java name */
    public static final int m32921getOffsetTypeEo1U57Q(long j) {
        boolean z;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return StartOffsetType.Companion.m32933getFastForwardEo1U57Q();
        }
        if (!z) {
            return StartOffsetType.Companion.m32932getDelayEo1U57Q();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m32922hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m32923toStringimpl(long j) {
        return "StartOffset(value=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m32918equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m32922hashCodeimpl(this.value);
    }

    public String toString() {
        return m32923toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m32924unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m32915constructorimpl(int i, int i2) {
        return m32916constructorimpl((long) (i * i2));
    }
}
