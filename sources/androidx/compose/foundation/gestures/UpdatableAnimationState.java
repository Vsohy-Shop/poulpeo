package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VectorizedSpringSpec;
import kotlin.jvm.internal.C12763h;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: UpdatableAnimationState.kt */
public final class UpdatableAnimationState {
    /* access modifiers changed from: private */
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    @Deprecated
    public static final VectorizedSpringSpec<AnimationVector1D> RebasableAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, (Object) null, 7, (Object) null).vectorize((TwoWayConverter) VectorConvertersKt.getVectorConverter(C12763h.f20419a));
    @Deprecated
    public static final float VisibilityThreshold = 0.01f;
    /* access modifiers changed from: private */
    @Deprecated
    public static final AnimationVector1D ZeroVector = new AnimationVector1D(0.0f);
    private boolean isRunning;
    /* access modifiers changed from: private */
    public long lastFrameTime = Long.MIN_VALUE;
    /* access modifiers changed from: private */
    public AnimationVector1D lastVelocity = ZeroVector;
    private float value;

    /* compiled from: UpdatableAnimationState.kt */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final VectorizedSpringSpec<AnimationVector1D> getRebasableAnimationSpec() {
            return UpdatableAnimationState.RebasableAnimationSpec;
        }

        public final AnimationVector1D getZeroVector() {
            return UpdatableAnimationState.ZeroVector;
        }

        public final boolean isZeroish(float f) {
            if (Math.abs(f) < 0.01f) {
                return true;
            }
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00af, code lost:
        if (r9 == false) goto L_0x0085;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008f A[Catch:{ all -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c3 A[Catch:{ all -> 0x0039 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c4 A[Catch:{ all -> 0x0039 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c7 A[Catch:{ all -> 0x0039 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object animateToZero(kotlin.jvm.functions.Function1<? super java.lang.Float, p336ef.C11921v> r13, p404of.C13074a<p336ef.C11921v> r14, p355hf.C12074d<? super p336ef.C11921v> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1 r0 = (androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1 r0 = new androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1
            r0.<init>(r12, r15)
        L_0x0018:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 0
            r4 = -9223372036854775808
            r6 = 2
            r7 = 0
            r8 = 1
            if (r2 == 0) goto L_0x0060
            if (r2 == r8) goto L_0x0044
            if (r2 != r6) goto L_0x003c
            java.lang.Object r13 = r0.L$1
            of.a r13 = (p404of.C13074a) r13
            java.lang.Object r14 = r0.L$0
            androidx.compose.foundation.gestures.UpdatableAnimationState r14 = (androidx.compose.foundation.gestures.UpdatableAnimationState) r14
            p336ef.C11910n.m25701b(r15)     // Catch:{ all -> 0x0039 }
            goto L_0x00dc
        L_0x0039:
            r13 = move-exception
            goto L_0x00ea
        L_0x003c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0044:
            float r13 = r0.F$0
            java.lang.Object r14 = r0.L$2
            of.a r14 = (p404of.C13074a) r14
            java.lang.Object r2 = r0.L$1
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            java.lang.Object r9 = r0.L$0
            androidx.compose.foundation.gestures.UpdatableAnimationState r9 = (androidx.compose.foundation.gestures.UpdatableAnimationState) r9
            p336ef.C11910n.m25701b(r15)     // Catch:{ all -> 0x005c }
            r15 = r9
            r11 = r0
            r0 = r14
            r14 = r2
            r2 = r1
            r1 = r11
            goto L_0x00a5
        L_0x005c:
            r13 = move-exception
            r14 = r9
            goto L_0x00ea
        L_0x0060:
            p336ef.C11910n.m25701b(r15)
            boolean r15 = r12.isRunning
            r15 = r15 ^ r8
            if (r15 == 0) goto L_0x00f3
            hf.g r15 = r0.getContext()
            androidx.compose.ui.MotionDurationScale$Key r2 = androidx.compose.p002ui.MotionDurationScale.Key
            hf.g$b r15 = r15.get(r2)
            androidx.compose.ui.MotionDurationScale r15 = (androidx.compose.p002ui.MotionDurationScale) r15
            if (r15 == 0) goto L_0x007b
            float r15 = r15.getScaleFactor()
            goto L_0x007d
        L_0x007b:
            r15 = 1065353216(0x3f800000, float:1.0)
        L_0x007d:
            r12.isRunning = r8
            r2 = r1
            r1 = r0
            r0 = r14
            r14 = r13
            r13 = r15
            r15 = r12
        L_0x0085:
            androidx.compose.foundation.gestures.UpdatableAnimationState$Companion r9 = Companion     // Catch:{ all -> 0x00b6 }
            float r10 = r15.value     // Catch:{ all -> 0x00b6 }
            boolean r9 = r9.isZeroish(r10)     // Catch:{ all -> 0x00b6 }
            if (r9 != 0) goto L_0x00b1
            androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$3 r9 = new androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$3     // Catch:{ all -> 0x00b6 }
            r9.<init>(r15, r13, r14)     // Catch:{ all -> 0x00b6 }
            r1.L$0 = r15     // Catch:{ all -> 0x00b6 }
            r1.L$1 = r14     // Catch:{ all -> 0x00b6 }
            r1.L$2 = r0     // Catch:{ all -> 0x00b6 }
            r1.F$0 = r13     // Catch:{ all -> 0x00b6 }
            r1.label = r8     // Catch:{ all -> 0x00b6 }
            java.lang.Object r9 = androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(r9, r1)     // Catch:{ all -> 0x00b6 }
            if (r9 != r2) goto L_0x00a5
            return r2
        L_0x00a5:
            r0.invoke()     // Catch:{ all -> 0x00b6 }
            int r9 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r9 != 0) goto L_0x00ae
            r9 = r8
            goto L_0x00af
        L_0x00ae:
            r9 = r7
        L_0x00af:
            if (r9 == 0) goto L_0x0085
        L_0x00b1:
            r13 = r0
            r11 = r15
            r15 = r14
            r14 = r11
            goto L_0x00b9
        L_0x00b6:
            r13 = move-exception
            r14 = r15
            goto L_0x00ea
        L_0x00b9:
            float r0 = r14.value     // Catch:{ all -> 0x0039 }
            float r0 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x0039 }
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x00c4
            goto L_0x00c5
        L_0x00c4:
            r8 = r7
        L_0x00c5:
            if (r8 != 0) goto L_0x00df
            androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$4 r0 = new androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$4     // Catch:{ all -> 0x0039 }
            r0.<init>(r14, r15)     // Catch:{ all -> 0x0039 }
            r1.L$0 = r14     // Catch:{ all -> 0x0039 }
            r1.L$1 = r13     // Catch:{ all -> 0x0039 }
            r15 = 0
            r1.L$2 = r15     // Catch:{ all -> 0x0039 }
            r1.label = r6     // Catch:{ all -> 0x0039 }
            java.lang.Object r15 = androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(r0, r1)     // Catch:{ all -> 0x0039 }
            if (r15 != r2) goto L_0x00dc
            return r2
        L_0x00dc:
            r13.invoke()     // Catch:{ all -> 0x0039 }
        L_0x00df:
            r14.lastFrameTime = r4
            androidx.compose.animation.core.AnimationVector1D r13 = ZeroVector
            r14.lastVelocity = r13
            r14.isRunning = r7
            ef.v r13 = p336ef.C11921v.f18618a
            return r13
        L_0x00ea:
            r14.lastFrameTime = r4
            androidx.compose.animation.core.AnimationVector1D r15 = ZeroVector
            r14.lastVelocity = r15
            r14.isRunning = r7
            throw r13
        L_0x00f3:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "Check failed."
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.UpdatableAnimationState.animateToZero(kotlin.jvm.functions.Function1, of.a, hf.d):java.lang.Object");
    }

    public final float getValue() {
        return this.value;
    }

    public final void setValue(float f) {
        this.value = f;
    }
}
