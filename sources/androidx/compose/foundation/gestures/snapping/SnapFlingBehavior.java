package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.p002ui.MotionDurationScale;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12757e0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;

@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nSnapFlingBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehavior\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt\n*L\n1#1,546:1\n1#2:547\n543#3,4:548\n543#3,4:552\n543#3,4:556\n543#3,4:560\n543#3,4:564\n543#3,4:568\n*S KotlinDebug\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehavior\n*L\n120#1:548,4\n148#1:552,4\n168#1:556,4\n185#1:560,4\n208#1:564,4\n211#1:568,4\n*E\n"})
@ExperimentalFoundationApi
/* compiled from: SnapFlingBehavior.kt */
public final class SnapFlingBehavior implements FlingBehavior {
    public static final int $stable = 0;
    private final Density density;
    private final DecayAnimationSpec<Float> highVelocityAnimationSpec;
    private final AnimationSpec<Float> lowVelocityAnimationSpec;
    private MotionDurationScale motionScaleDuration;
    private final float shortSnapVelocityThreshold;
    private final AnimationSpec<Float> snapAnimationSpec;
    private final SnapLayoutInfoProvider snapLayoutInfoProvider;
    /* access modifiers changed from: private */
    public final float velocityThreshold;

    public /* synthetic */ SnapFlingBehavior(SnapLayoutInfoProvider snapLayoutInfoProvider2, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, AnimationSpec animationSpec2, Density density2, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(snapLayoutInfoProvider2, animationSpec, decayAnimationSpec, animationSpec2, density2, f);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Float, ef.v>} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object fling(androidx.compose.foundation.gestures.ScrollScope r11, float r12, kotlin.jvm.functions.Function1<? super java.lang.Float, p336ef.C11921v> r13, p355hf.C12074d<? super androidx.compose.foundation.gestures.snapping.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1
            r0.<init>(r10, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r11 = r0.L$0
            r13 = r11
            kotlin.jvm.functions.Function1 r13 = (kotlin.jvm.functions.Function1) r13
            p336ef.C11910n.m25701b(r14)
            goto L_0x0051
        L_0x002e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0036:
            p336ef.C11910n.m25701b(r14)
            androidx.compose.ui.MotionDurationScale r14 = r10.motionScaleDuration
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1 r2 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1
            r9 = 0
            r4 = r2
            r5 = r12
            r6 = r10
            r7 = r11
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.L$0 = r13
            r0.label = r3
            java.lang.Object r14 = p466yf.C13970h.m32378g(r14, r2, r0)
            if (r14 != r1) goto L_0x0051
            return r1
        L_0x0051:
            androidx.compose.foundation.gestures.snapping.AnimationResult r14 = (androidx.compose.foundation.gestures.snapping.AnimationResult) r14
            r11 = 0
            java.lang.Float r11 = kotlin.coroutines.jvm.internal.C12735b.m28559b(r11)
            r13.invoke(r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.fling(androidx.compose.foundation.gestures.ScrollScope, float, kotlin.jvm.functions.Function1, hf.d):java.lang.Object");
    }

    private final boolean isDecayApproachPossible(float f, float f2) {
        if (Math.abs(DecayAnimationSpecKt.calculateTargetValue(this.highVelocityAnimationSpec, 0.0f, f2)) >= Math.abs(f) + this.snapLayoutInfoProvider.calculateSnapStepSize(this.density)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00d6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00d7 A[PHI: r0 
      PHI: (r0v2 java.lang.Object) = (r0v6 java.lang.Object), (r0v1 java.lang.Object) binds: [B:19:0x00d4, B:10:0x002f] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object longSnap(androidx.compose.foundation.gestures.ScrollScope r26, float r27, kotlin.jvm.functions.Function1<? super java.lang.Float, p336ef.C11921v> r28, p355hf.C12074d<? super androidx.compose.foundation.gestures.snapping.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> r29) {
        /*
            r25 = this;
            r6 = r25
            r7 = r28
            r0 = r29
            boolean r1 = r0 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$longSnap$1
            if (r1 == 0) goto L_0x0019
            r1 = r0
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$longSnap$1 r1 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$longSnap$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0019
            int r2 = r2 - r3
            r1.label = r2
            goto L_0x001e
        L_0x0019:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$longSnap$1 r1 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$longSnap$1
            r1.<init>(r6, r0)
        L_0x001e:
            r13 = r1
            java.lang.Object r0 = r13.result
            java.lang.Object r14 = p362if.C12150d.m26492c()
            int r1 = r13.label
            r8 = 2
            r2 = 1
            if (r1 == 0) goto L_0x0051
            if (r1 == r2) goto L_0x003c
            if (r1 != r8) goto L_0x0034
            p336ef.C11910n.m25701b(r0)
            goto L_0x00d7
        L_0x0034:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003c:
            java.lang.Object r1 = r13.L$3
            kotlin.jvm.internal.e0 r1 = (kotlin.jvm.internal.C12757e0) r1
            java.lang.Object r2 = r13.L$2
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            java.lang.Object r3 = r13.L$1
            androidx.compose.foundation.gestures.ScrollScope r3 = (androidx.compose.foundation.gestures.ScrollScope) r3
            java.lang.Object r4 = r13.L$0
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r4 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior) r4
            p336ef.C11910n.m25701b(r0)
            r7 = r3
            goto L_0x0099
        L_0x0051:
            p336ef.C11910n.m25701b(r0)
            androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider r0 = r6.snapLayoutInfoProvider
            androidx.compose.ui.unit.Density r1 = r6.density
            r3 = r27
            float r0 = r0.calculateApproachOffset(r1, r3)
            float r0 = java.lang.Math.abs(r0)
            float r1 = java.lang.Math.signum(r27)
            float r4 = r0 * r1
            kotlin.jvm.internal.e0 r9 = new kotlin.jvm.internal.e0
            r9.<init>()
            r9.f20408b = r4
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.C12735b.m28559b(r4)
            r7.invoke(r0)
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$longSnap$3 r5 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$longSnap$3
            r5.<init>(r9, r7)
            r13.L$0 = r6
            r10 = r26
            r13.L$1 = r10
            r13.L$2 = r7
            r13.L$3 = r9
            r13.label = r2
            r0 = r25
            r1 = r26
            r2 = r4
            r4 = r5
            r5 = r13
            java.lang.Object r0 = r0.runApproach(r1, r2, r3, r4, r5)
            if (r0 != r14) goto L_0x0095
            return r14
        L_0x0095:
            r4 = r6
            r2 = r7
            r1 = r9
            r7 = r10
        L_0x0099:
            androidx.compose.foundation.gestures.snapping.AnimationResult r0 = (androidx.compose.foundation.gestures.snapping.AnimationResult) r0
            java.lang.Object r3 = r0.component1()
            java.lang.Number r3 = (java.lang.Number) r3
            float r9 = r3.floatValue()
            androidx.compose.animation.core.AnimationState r15 = r0.component2()
            r1.f20408b = r9
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r23 = 30
            r24 = 0
            androidx.compose.animation.core.AnimationState r10 = androidx.compose.animation.core.AnimationStateKt.copy$default((androidx.compose.animation.core.AnimationState) r15, (float) r16, (float) r17, (long) r18, (long) r20, (boolean) r22, (int) r23, (java.lang.Object) r24)
            androidx.compose.animation.core.AnimationSpec<java.lang.Float> r11 = r4.snapAnimationSpec
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$longSnap$5 r12 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$longSnap$5
            r12.<init>(r1, r2)
            r0 = 0
            r13.L$0 = r0
            r13.L$1 = r0
            r13.L$2 = r0
            r13.L$3 = r0
            r13.label = r8
            r8 = r9
            java.lang.Object r0 = androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.animateSnap(r7, r8, r9, r10, r11, r12, r13)
            if (r0 != r14) goto L_0x00d7
            return r14
        L_0x00d7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.longSnap(androidx.compose.foundation.gestures.ScrollScope, float, kotlin.jvm.functions.Function1, hf.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final Object runApproach(ScrollScope scrollScope, float f, float f2, Function1<? super Float, C11921v> function1, C12074d<? super AnimationResult<Float, AnimationVector1D>> dVar) {
        ApproachAnimation approachAnimation;
        if (isDecayApproachPossible(f, f2)) {
            approachAnimation = new HighVelocityApproachAnimation(this.highVelocityAnimationSpec);
        } else {
            approachAnimation = new LowVelocityApproachAnimation(this.lowVelocityAnimationSpec, this.snapLayoutInfoProvider, this.density);
        }
        return SnapFlingBehaviorKt.approach(scrollScope, f, f2, approachAnimation, this.snapLayoutInfoProvider, this.density, function1, dVar);
    }

    /* access modifiers changed from: private */
    public final Object shortSnap(ScrollScope scrollScope, float f, Function1<? super Float, C11921v> function1, C12074d<? super AnimationResult<Float, AnimationVector1D>> dVar) {
        float findClosestOffset = SnapFlingBehaviorKt.findClosestOffset(0.0f, this.snapLayoutInfoProvider, this.density);
        C12757e0 e0Var = new C12757e0();
        e0Var.f20408b = findClosestOffset;
        return SnapFlingBehaviorKt.animateSnap(scrollScope, findClosestOffset, findClosestOffset, AnimationStateKt.AnimationState$default(0.0f, f, 0, 0, false, 28, (Object) null), this.snapAnimationSpec, new SnapFlingBehavior$shortSnap$3(e0Var, function1), dVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SnapFlingBehavior)) {
            return false;
        }
        SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) obj;
        if (!C12775o.m28634d(snapFlingBehavior.snapAnimationSpec, this.snapAnimationSpec) || !C12775o.m28634d(snapFlingBehavior.highVelocityAnimationSpec, this.highVelocityAnimationSpec) || !C12775o.m28634d(snapFlingBehavior.lowVelocityAnimationSpec, this.lowVelocityAnimationSpec) || !C12775o.m28634d(snapFlingBehavior.snapLayoutInfoProvider, this.snapLayoutInfoProvider) || !C12775o.m28634d(snapFlingBehavior.density, this.density) || !C1232Dp.m38473equalsimpl0(snapFlingBehavior.shortSnapVelocityThreshold, this.shortSnapVelocityThreshold)) {
            return false;
        }
        return true;
    }

    public final MotionDurationScale getMotionScaleDuration$foundation_release() {
        return this.motionScaleDuration;
    }

    public int hashCode() {
        return ((((((((((0 + this.snapAnimationSpec.hashCode()) * 31) + this.highVelocityAnimationSpec.hashCode()) * 31) + this.lowVelocityAnimationSpec.hashCode()) * 31) + this.snapLayoutInfoProvider.hashCode()) * 31) + this.density.hashCode()) * 31) + C1232Dp.m38474hashCodeimpl(this.shortSnapVelocityThreshold);
    }

    public Object performFling(ScrollScope scrollScope, float f, C12074d<? super Float> dVar) {
        return performFling(scrollScope, f, SnapFlingBehavior$performFling$2.INSTANCE, dVar);
    }

    public final void setMotionScaleDuration$foundation_release(MotionDurationScale motionDurationScale) {
        C12775o.m28639i(motionDurationScale, "<set-?>");
        this.motionScaleDuration = motionDurationScale;
    }

    private SnapFlingBehavior(SnapLayoutInfoProvider snapLayoutInfoProvider2, AnimationSpec<Float> animationSpec, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> animationSpec2, Density density2, float f) {
        this.snapLayoutInfoProvider = snapLayoutInfoProvider2;
        this.lowVelocityAnimationSpec = animationSpec;
        this.highVelocityAnimationSpec = decayAnimationSpec;
        this.snapAnimationSpec = animationSpec2;
        this.density = density2;
        this.shortSnapVelocityThreshold = f;
        this.velocityThreshold = density2.m38449toPx0680j_4(f);
        this.motionScaleDuration = ScrollableKt.getDefaultScrollMotionDurationScale();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object performFling(androidx.compose.foundation.gestures.ScrollScope r5, float r6, kotlin.jvm.functions.Function1<? super java.lang.Float, p336ef.C11921v> r7, p355hf.C12074d<? super java.lang.Float> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$3
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$3 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$3 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$3
            r0.<init>(r4, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            p336ef.C11910n.m25701b(r8)
            goto L_0x003d
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            p336ef.C11910n.m25701b(r8)
            r0.label = r3
            java.lang.Object r8 = r4.fling(r5, r6, r7, r0)
            if (r8 != r1) goto L_0x003d
            return r1
        L_0x003d:
            androidx.compose.foundation.gestures.snapping.AnimationResult r8 = (androidx.compose.foundation.gestures.snapping.AnimationResult) r8
            java.lang.Object r5 = r8.component1()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            androidx.compose.animation.core.AnimationState r6 = r8.component2()
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r3 = 0
        L_0x0054:
            if (r3 == 0) goto L_0x0057
            goto L_0x0061
        L_0x0057:
            java.lang.Object r5 = r6.getVelocity()
            java.lang.Number r5 = (java.lang.Number) r5
            float r7 = r5.floatValue()
        L_0x0061:
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.C12735b.m28559b(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.performFling(androidx.compose.foundation.gestures.ScrollScope, float, kotlin.jvm.functions.Function1, hf.d):java.lang.Object");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SnapFlingBehavior(SnapLayoutInfoProvider snapLayoutInfoProvider2, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, AnimationSpec animationSpec2, Density density2, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(snapLayoutInfoProvider2, animationSpec, decayAnimationSpec, animationSpec2, density2, (i & 32) != 0 ? SnapFlingBehaviorKt.getMinFlingVelocityDp() : f, (DefaultConstructorMarker) null);
    }
}
