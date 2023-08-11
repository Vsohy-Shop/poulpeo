package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Immutable;

@Immutable
/* compiled from: LazyGridSpan.kt */
public final class GridItemSpan {
    private final long packedValue;

    private /* synthetic */ GridItemSpan(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ GridItemSpan m33432boximpl(long j) {
        return new GridItemSpan(j);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m33434equalsimpl(long j, Object obj) {
        if ((obj instanceof GridItemSpan) && j == ((GridItemSpan) obj).m33439unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m33435equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: getCurrentLineSpan-impl  reason: not valid java name */
    public static final int m33436getCurrentLineSpanimpl(long j) {
        return (int) j;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m33437hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m33438toStringimpl(long j) {
        return "GridItemSpan(packedValue=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m33434equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m33437hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m33438toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m33439unboximpl() {
        return this.packedValue;
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getCurrentLineSpan$annotations() {
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m33433constructorimpl(long j) {
        return j;
    }
}
