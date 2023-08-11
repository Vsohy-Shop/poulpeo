package androidx.compose.animation.core;

import androidx.compose.p002ui.MotionDurationScale;
import androidx.compose.runtime.MonotonicFrameClockKt;
import kotlin.coroutines.jvm.internal.C12735b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12763h;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13088o;

/* compiled from: SuspendAnimation.kt */
public final class SuspendAnimationKt {
    public static final Object animate(float f, float f2, float f3, AnimationSpec<Float> animationSpec, C13088o<? super Float, ? super Float, C11921v> oVar, C12074d<? super C11921v> dVar) {
        Object animate = animate(VectorConvertersKt.getVectorConverter(C12763h.f20419a), C12735b.m28559b(f), C12735b.m28559b(f2), C12735b.m28559b(f3), animationSpec, oVar, dVar);
        return animate == C12150d.m26492c() ? animate : C11921v.f18618a;
    }

    public static /* synthetic */ Object animate$default(float f, float f2, float f3, AnimationSpec animationSpec, C13088o oVar, C12074d dVar, int i, Object obj) {
        float f4 = (i & 4) != 0 ? 0.0f : f3;
        if ((i & 8) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, (Object) null, 7, (Object) null);
        }
        return animate(f, f2, f4, animationSpec, oVar, dVar);
    }

    public static final Object animateDecay(float f, float f2, FloatDecayAnimationSpec floatDecayAnimationSpec, C13088o<? super Float, ? super Float, C11921v> oVar, C12074d<? super C11921v> dVar) {
        Object animate$default = animate$default(AnimationStateKt.AnimationState$default(f, f2, 0, 0, false, 28, (Object) null), AnimationKt.DecayAnimation(floatDecayAnimationSpec, f, f2), 0, new SuspendAnimationKt$animateDecay$2(oVar), dVar, 2, (Object) null);
        return animate$default == C12150d.m26492c() ? animate$default : C11921v.f18618a;
    }

    public static /* synthetic */ Object animateDecay$default(AnimationState animationState, DecayAnimationSpec decayAnimationSpec, boolean z, Function1 function1, C12074d dVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            function1 = SuspendAnimationKt$animateDecay$4.INSTANCE;
        }
        return animateDecay(animationState, decayAnimationSpec, z, function1, (C12074d<? super C11921v>) dVar);
    }

    public static final <T, V extends AnimationVector> Object animateTo(AnimationState<T, V> animationState, T t, AnimationSpec<T> animationSpec, boolean z, Function1<? super AnimationScope<T, V>, C11921v> function1, C12074d<? super C11921v> dVar) {
        long j;
        AnimationSpec<T> animationSpec2 = animationSpec;
        TargetBasedAnimation targetBasedAnimation = new TargetBasedAnimation(animationSpec2, animationState.getTypeConverter(), animationState.getValue(), t, animationState.getVelocityVector());
        if (z) {
            j = animationState.getLastFrameTimeNanos();
        } else {
            j = Long.MIN_VALUE;
        }
        Object animate = animate(animationState, targetBasedAnimation, j, function1, dVar);
        if (animate == C12150d.m26492c()) {
            return animate;
        }
        return C11921v.f18618a;
    }

    public static /* synthetic */ Object animateTo$default(AnimationState animationState, Object obj, AnimationSpec animationSpec, boolean z, Function1 function1, C12074d dVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, (Object) null, 7, (Object) null);
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            function1 = SuspendAnimationKt$animateTo$2.INSTANCE;
        }
        return animateTo(animationState, obj, animationSpec2, z2, function1, dVar);
    }

    /* access modifiers changed from: private */
    public static final <R, T, V extends AnimationVector> Object callWithFrameNanos(Animation<T, V> animation, Function1<? super Long, ? extends R> function1, C12074d<? super R> dVar) {
        if (animation.isInfinite()) {
            return InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(function1, dVar);
        }
        return MonotonicFrameClockKt.withFrameNanos(new SuspendAnimationKt$callWithFrameNanos$2(function1), dVar);
    }

    private static final <T, V extends AnimationVector> void doAnimationFrame(AnimationScope<T, V> animationScope, long j, long j2, Animation<T, V> animation, AnimationState<T, V> animationState, Function1<? super AnimationScope<T, V>, C11921v> function1) {
        animationScope.setLastFrameTimeNanos$animation_core_release(j);
        animationScope.setValue$animation_core_release(animation.getValueFromNanos(j2));
        animationScope.setVelocityVector$animation_core_release(animation.getVelocityVectorFromNanos(j2));
        if (animation.isFinishedFromNanos(j2)) {
            animationScope.setFinishedTimeNanos$animation_core_release(animationScope.getLastFrameTimeNanos());
            animationScope.setRunning$animation_core_release(false);
        }
        updateState(animationScope, animationState);
        function1.invoke(animationScope);
    }

    /* access modifiers changed from: private */
    public static final <T, V extends AnimationVector> void doAnimationFrameWithScale(AnimationScope<T, V> animationScope, long j, float f, Animation<T, V> animation, AnimationState<T, V> animationState, Function1<? super AnimationScope<T, V>, C11921v> function1) {
        boolean z;
        long j2;
        if (f == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            j2 = animation.getDurationNanos();
        } else {
            j2 = (long) (((float) (j - animationScope.getStartTimeNanos())) / f);
        }
        doAnimationFrame(animationScope, j, j2, animation, animationState, function1);
    }

    public static final float getDurationScale(C12079g gVar) {
        float f;
        boolean z;
        C12775o.m28639i(gVar, "<this>");
        MotionDurationScale motionDurationScale = (MotionDurationScale) gVar.get(MotionDurationScale.Key);
        if (motionDurationScale != null) {
            f = motionDurationScale.getScaleFactor();
        } else {
            f = 1.0f;
        }
        if (f >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return f;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final <T, V extends AnimationVector> void updateState(AnimationScope<T, V> animationScope, AnimationState<T, V> animationState) {
        C12775o.m28639i(animationScope, "<this>");
        C12775o.m28639i(animationState, "state");
        animationState.setValue$animation_core_release(animationScope.getValue());
        AnimationVectorsKt.copyFrom(animationState.getVelocityVector(), animationScope.getVelocityVector());
        animationState.setFinishedTimeNanos$animation_core_release(animationScope.getFinishedTimeNanos());
        animationState.setLastFrameTimeNanos$animation_core_release(animationScope.getLastFrameTimeNanos());
        animationState.setRunning$animation_core_release(animationScope.isRunning());
    }

    public static /* synthetic */ Object animate$default(TwoWayConverter twoWayConverter, Object obj, Object obj2, Object obj3, AnimationSpec animationSpec, C13088o oVar, C12074d dVar, int i, Object obj4) {
        return animate(twoWayConverter, obj, obj2, (i & 8) != 0 ? null : obj3, (i & 16) != 0 ? AnimationSpecKt.spring$default(0.0f, 0.0f, (Object) null, 7, (Object) null) : animationSpec, oVar, dVar);
    }

    public static final <T, V extends AnimationVector> Object animateDecay(AnimationState<T, V> animationState, DecayAnimationSpec<T> decayAnimationSpec, boolean z, Function1<? super AnimationScope<T, V>, C11921v> function1, C12074d<? super C11921v> dVar) {
        Object animate = animate(animationState, new DecayAnimation(decayAnimationSpec, animationState.getTypeConverter(), animationState.getValue(), animationState.getVelocityVector()), z ? animationState.getLastFrameTimeNanos() : Long.MIN_VALUE, function1, dVar);
        return animate == C12150d.m26492c() ? animate : C11921v.f18618a;
    }

    public static /* synthetic */ Object animate$default(AnimationState animationState, Animation animation, long j, Function1 function1, C12074d dVar, int i, Object obj) {
        if ((i & 2) != 0) {
            j = Long.MIN_VALUE;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            function1 = SuspendAnimationKt$animate$5.INSTANCE;
        }
        return animate(animationState, animation, j2, function1, dVar);
    }

    public static final <T, V extends AnimationVector> Object animate(TwoWayConverter<T, V> twoWayConverter, T t, T t2, T t3, AnimationSpec<T> animationSpec, C13088o<? super T, ? super T, C11921v> oVar, C12074d<? super C11921v> dVar) {
        AnimationVector animationVector;
        T t4 = t3;
        if (t4 == null || (animationVector = (AnimationVector) twoWayConverter.getConvertToVector().invoke(t4)) == null) {
            animationVector = AnimationVectorsKt.newInstance((AnimationVector) twoWayConverter.getConvertToVector().invoke(t));
        } else {
            T t5 = t;
        }
        TargetBasedAnimation targetBasedAnimation = new TargetBasedAnimation(animationSpec, twoWayConverter, t, t2, animationVector);
        AnimationState animationState = new AnimationState(twoWayConverter, t, animationVector, 0, 0, false, 56, (DefaultConstructorMarker) null);
        TwoWayConverter<T, V> twoWayConverter2 = twoWayConverter;
        Object animate$default = animate$default(animationState, targetBasedAnimation, 0, new SuspendAnimationKt$animate$3(oVar, twoWayConverter), dVar, 2, (Object) null);
        return animate$default == C12150d.m26492c() ? animate$default : C11921v.f18618a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: kotlin.jvm.internal.Ref$ObjectRef} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: kotlin.jvm.internal.Ref$ObjectRef} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ee A[Catch:{ CancellationException -> 0x0061 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0118 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, V extends androidx.compose.animation.core.AnimationVector> java.lang.Object animate(androidx.compose.animation.core.AnimationState<T, V> r25, androidx.compose.animation.core.Animation<T, V> r26, long r27, kotlin.jvm.functions.Function1<? super androidx.compose.animation.core.AnimationScope<T, V>, p336ef.C11921v> r29, p355hf.C12074d<? super p336ef.C11921v> r30) {
        /*
            r9 = r25
            r0 = r26
            r1 = r30
            boolean r2 = r1 instanceof androidx.compose.animation.core.SuspendAnimationKt$animate$4
            if (r2 == 0) goto L_0x0019
            r2 = r1
            androidx.compose.animation.core.SuspendAnimationKt$animate$4 r2 = (androidx.compose.animation.core.SuspendAnimationKt$animate$4) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0019
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001e
        L_0x0019:
            androidx.compose.animation.core.SuspendAnimationKt$animate$4 r2 = new androidx.compose.animation.core.SuspendAnimationKt$animate$4
            r2.<init>(r1)
        L_0x001e:
            r10 = r2
            java.lang.Object r1 = r10.result
            java.lang.Object r11 = p362if.C12150d.m26492c()
            int r2 = r10.label
            r12 = 2
            r13 = 1
            if (r2 == 0) goto L_0x0065
            if (r2 == r13) goto L_0x0049
            if (r2 != r12) goto L_0x0041
            java.lang.Object r0 = r10.L$3
            r2 = r0
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref$ObjectRef) r2
            java.lang.Object r0 = r10.L$2
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            java.lang.Object r3 = r10.L$1
            androidx.compose.animation.core.Animation r3 = (androidx.compose.animation.core.Animation) r3
            java.lang.Object r4 = r10.L$0
            androidx.compose.animation.core.AnimationState r4 = (androidx.compose.animation.core.AnimationState) r4
            goto L_0x005a
        L_0x0041:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0049:
            java.lang.Object r0 = r10.L$3
            r2 = r0
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref$ObjectRef) r2
            java.lang.Object r0 = r10.L$2
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            java.lang.Object r3 = r10.L$1
            androidx.compose.animation.core.Animation r3 = (androidx.compose.animation.core.Animation) r3
            java.lang.Object r4 = r10.L$0
            androidx.compose.animation.core.AnimationState r4 = (androidx.compose.animation.core.AnimationState) r4
        L_0x005a:
            p336ef.C11910n.m25701b(r1)     // Catch:{ CancellationException -> 0x0061 }
            r8 = r0
            r0 = r3
            goto L_0x00e1
        L_0x0061:
            r0 = move-exception
            r9 = r4
            goto L_0x0120
        L_0x0065:
            p336ef.C11910n.m25701b(r1)
            r1 = 0
            java.lang.Object r15 = r0.getValueFromNanos(r1)
            androidx.compose.animation.core.AnimationVector r17 = r0.getVelocityVectorFromNanos(r1)
            kotlin.jvm.internal.Ref$ObjectRef r14 = new kotlin.jvm.internal.Ref$ObjectRef
            r14.<init>()
            r1 = -9223372036854775808
            int r1 = (r27 > r1 ? 1 : (r27 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00a9
            hf.g r1 = r10.getContext()     // Catch:{ CancellationException -> 0x011e }
            float r7 = getDurationScale(r1)     // Catch:{ CancellationException -> 0x011e }
            androidx.compose.animation.core.SuspendAnimationKt$animate$6 r8 = new androidx.compose.animation.core.SuspendAnimationKt$animate$6     // Catch:{ CancellationException -> 0x011e }
            r1 = r8
            r2 = r14
            r3 = r15
            r4 = r26
            r5 = r17
            r6 = r25
            r15 = r8
            r8 = r29
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ CancellationException -> 0x011e }
            r10.L$0 = r9     // Catch:{ CancellationException -> 0x011e }
            r10.L$1 = r0     // Catch:{ CancellationException -> 0x011e }
            r8 = r29
            r10.L$2 = r8     // Catch:{ CancellationException -> 0x011e }
            r10.L$3 = r14     // Catch:{ CancellationException -> 0x011e }
            r10.label = r13     // Catch:{ CancellationException -> 0x011e }
            java.lang.Object r1 = callWithFrameNanos(r0, r15, r10)     // Catch:{ CancellationException -> 0x011e }
            if (r1 != r11) goto L_0x00df
            return r11
        L_0x00a9:
            r8 = r29
            androidx.compose.animation.core.AnimationScope r7 = new androidx.compose.animation.core.AnimationScope     // Catch:{ CancellationException -> 0x011e }
            androidx.compose.animation.core.TwoWayConverter r16 = r26.getTypeConverter()     // Catch:{ CancellationException -> 0x011e }
            java.lang.Object r20 = r26.getTargetValue()     // Catch:{ CancellationException -> 0x011e }
            r23 = 1
            androidx.compose.animation.core.SuspendAnimationKt$animate$7 r1 = new androidx.compose.animation.core.SuspendAnimationKt$animate$7     // Catch:{ CancellationException -> 0x011e }
            r1.<init>(r9)     // Catch:{ CancellationException -> 0x011e }
            r6 = r14
            r14 = r7
            r18 = r27
            r21 = r27
            r24 = r1
            r14.<init>(r15, r16, r17, r18, r20, r21, r23, r24)     // Catch:{ CancellationException -> 0x011b }
            hf.g r1 = r10.getContext()     // Catch:{ CancellationException -> 0x011b }
            float r4 = getDurationScale(r1)     // Catch:{ CancellationException -> 0x011b }
            r1 = r7
            r2 = r27
            r5 = r26
            r14 = r6
            r6 = r25
            r15 = r7
            r7 = r29
            doAnimationFrameWithScale(r1, r2, r4, r5, r6, r7)     // Catch:{ CancellationException -> 0x011e }
            r14.f20403b = r15     // Catch:{ CancellationException -> 0x011e }
        L_0x00df:
            r4 = r9
            r2 = r14
        L_0x00e1:
            T r1 = r2.f20403b     // Catch:{ CancellationException -> 0x0061 }
            kotlin.jvm.internal.C12775o.m28636f(r1)     // Catch:{ CancellationException -> 0x0061 }
            androidx.compose.animation.core.AnimationScope r1 = (androidx.compose.animation.core.AnimationScope) r1     // Catch:{ CancellationException -> 0x0061 }
            boolean r1 = r1.isRunning()     // Catch:{ CancellationException -> 0x0061 }
            if (r1 == 0) goto L_0x0118
            hf.g r1 = r10.getContext()     // Catch:{ CancellationException -> 0x0061 }
            float r1 = getDurationScale(r1)     // Catch:{ CancellationException -> 0x0061 }
            androidx.compose.animation.core.SuspendAnimationKt$animate$9 r3 = new androidx.compose.animation.core.SuspendAnimationKt$animate$9     // Catch:{ CancellationException -> 0x0061 }
            r25 = r3
            r26 = r2
            r27 = r1
            r28 = r0
            r29 = r4
            r30 = r8
            r25.<init>(r26, r27, r28, r29, r30)     // Catch:{ CancellationException -> 0x0061 }
            r10.L$0 = r4     // Catch:{ CancellationException -> 0x0061 }
            r10.L$1 = r0     // Catch:{ CancellationException -> 0x0061 }
            r10.L$2 = r8     // Catch:{ CancellationException -> 0x0061 }
            r10.L$3 = r2     // Catch:{ CancellationException -> 0x0061 }
            r10.label = r12     // Catch:{ CancellationException -> 0x0061 }
            java.lang.Object r1 = callWithFrameNanos(r0, r3, r10)     // Catch:{ CancellationException -> 0x0061 }
            if (r1 != r11) goto L_0x00e1
            return r11
        L_0x0118:
            ef.v r0 = p336ef.C11921v.f18618a
            return r0
        L_0x011b:
            r0 = move-exception
            r14 = r6
            goto L_0x011f
        L_0x011e:
            r0 = move-exception
        L_0x011f:
            r2 = r14
        L_0x0120:
            T r1 = r2.f20403b
            androidx.compose.animation.core.AnimationScope r1 = (androidx.compose.animation.core.AnimationScope) r1
            r3 = 0
            if (r1 != 0) goto L_0x0128
            goto L_0x012b
        L_0x0128:
            r1.setRunning$animation_core_release(r3)
        L_0x012b:
            T r1 = r2.f20403b
            androidx.compose.animation.core.AnimationScope r1 = (androidx.compose.animation.core.AnimationScope) r1
            if (r1 == 0) goto L_0x013e
            long r1 = r1.getLastFrameTimeNanos()
            long r4 = r9.getLastFrameTimeNanos()
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x013e
            goto L_0x013f
        L_0x013e:
            r13 = r3
        L_0x013f:
            if (r13 == 0) goto L_0x0144
            r9.setRunning$animation_core_release(r3)
        L_0x0144:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SuspendAnimationKt.animate(androidx.compose.animation.core.AnimationState, androidx.compose.animation.core.Animation, long, kotlin.jvm.functions.Function1, hf.d):java.lang.Object");
    }
}
