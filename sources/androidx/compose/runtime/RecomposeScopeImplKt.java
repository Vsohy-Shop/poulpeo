package androidx.compose.runtime;

/* compiled from: RecomposeScopeImpl.kt */
public final class RecomposeScopeImplKt {
    private static final int DefaultsInScopeFlag = 2;
    private static final int DefaultsInvalidFlag = 4;
    private static final int RequiresRecomposeFlag = 8;
    private static final int RereadingFlag = 32;
    private static final int SkippedFlag = 16;
    private static final int UsedFlag = 1;
    private static final int changedHighBitMask = 613566756;
    private static final int changedLowBitMask = 306783378;
    private static final int changedMask = -920350135;

    public static final int updateChangedFlags(int i) {
        int i2 = changedLowBitMask & i;
        int i3 = changedHighBitMask & i;
        return (i & changedMask) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }
}
