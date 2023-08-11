package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.geometry.Offset;

/* compiled from: TransformableState.kt */
public final class DefaultTransformableState$transformScope$1 implements TransformScope {
    final /* synthetic */ DefaultTransformableState this$0;

    DefaultTransformableState$transformScope$1(DefaultTransformableState defaultTransformableState) {
        this.this$0 = defaultTransformableState;
    }

    /* renamed from: transformBy-d-4ec7I  reason: not valid java name */
    public void m33042transformByd4ec7I(float f, long j, float f2) {
        this.this$0.getOnTransformation().invoke(Float.valueOf(f), Offset.m35411boximpl(j), Float.valueOf(f2));
    }
}
