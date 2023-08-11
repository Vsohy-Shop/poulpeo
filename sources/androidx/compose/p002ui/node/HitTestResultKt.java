package androidx.compose.p002ui.node;

/* renamed from: androidx.compose.ui.node.HitTestResultKt */
/* compiled from: HitTestResult.kt */
public final class HitTestResultKt {
    /* access modifiers changed from: private */
    public static final long DistanceAndInLayer(float f, boolean z) {
        long j;
        long floatToIntBits = (long) Float.floatToIntBits(f);
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        return DistanceAndInLayer.m37476constructorimpl((j & 4294967295L) | (floatToIntBits << 32));
    }
}
