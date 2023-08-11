package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.adjust.sdk.Constants;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p436tf.C13522b;

@SourceDebugExtension({"SMAP\nSnapFlingBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,546:1\n543#1,4:558\n543#1,4:562\n76#2:547\n67#3,3:548\n66#3:551\n1114#4,6:552\n154#5:566\n*S KotlinDebug\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt\n*L\n356#1:558,4\n423#1:562,4\n272#1:547\n274#1:548,3\n274#1:551\n274#1:552,6\n537#1:566\n*E\n"})
/* compiled from: SnapFlingBehavior.kt */
public final class SnapFlingBehaviorKt {
    private static final boolean DEBUG = false;
    private static final float MinFlingVelocityDp = C1232Dp.m38468constructorimpl((float) Constants.MINIMAL_ERROR_STATUS_CODE);
    public static final float NoDistance = 0.0f;
    public static final float NoVelocity = 0.0f;

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object animateDecay(androidx.compose.foundation.gestures.ScrollScope r5, float r6, androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r7, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> r8, kotlin.jvm.functions.Function1<? super java.lang.Float, p336ef.C11921v> r9, p355hf.C12074d<? super androidx.compose.foundation.gestures.snapping.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            float r6 = r0.F$0
            java.lang.Object r5 = r0.L$1
            kotlin.jvm.internal.e0 r5 = (kotlin.jvm.internal.C12757e0) r5
            java.lang.Object r7 = r0.L$0
            androidx.compose.animation.core.AnimationState r7 = (androidx.compose.animation.core.AnimationState) r7
            p336ef.C11910n.m25701b(r10)
            goto L_0x006b
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003b:
            p336ef.C11910n.m25701b(r10)
            kotlin.jvm.internal.e0 r10 = new kotlin.jvm.internal.e0
            r10.<init>()
            java.lang.Object r2 = r7.getVelocity()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0054
            r2 = r3
            goto L_0x0055
        L_0x0054:
            r2 = 0
        L_0x0055:
            r2 = r2 ^ r3
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$2 r4 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$2
            r4.<init>(r6, r10, r5, r9)
            r0.L$0 = r7
            r0.L$1 = r10
            r0.F$0 = r6
            r0.label = r3
            java.lang.Object r5 = androidx.compose.animation.core.SuspendAnimationKt.animateDecay(r7, r8, (boolean) r2, r4, (p355hf.C12074d<? super p336ef.C11921v>) r0)
            if (r5 != r1) goto L_0x006a
            return r1
        L_0x006a:
            r5 = r10
        L_0x006b:
            androidx.compose.foundation.gestures.snapping.AnimationResult r8 = new androidx.compose.foundation.gestures.snapping.AnimationResult
            float r5 = r5.f20408b
            float r6 = r6 - r5
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.C12735b.m28559b(r6)
            r8.<init>(r5, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.animateDecay(androidx.compose.foundation.gestures.ScrollScope, float, androidx.compose.animation.core.AnimationState, androidx.compose.animation.core.DecayAnimationSpec, kotlin.jvm.functions.Function1, hf.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final void animateDecay$consumeDelta(AnimationScope<Float, AnimationVector1D> animationScope, ScrollScope scrollScope, Function1<? super Float, C11921v> function1, float f) {
        float scrollBy = scrollScope.scrollBy(f);
        function1.invoke(Float.valueOf(scrollBy));
        if (Math.abs(f - scrollBy) > 0.5f) {
            animationScope.cancelAnimation();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object animateSnap(androidx.compose.foundation.gestures.ScrollScope r12, float r13, float r14, androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r15, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r16, kotlin.jvm.functions.Function1<? super java.lang.Float, p336ef.C11921v> r17, p355hf.C12074d<? super androidx.compose.foundation.gestures.snapping.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> r18) {
        /*
            r0 = r18
            boolean r1 = r0 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateSnap$1
            if (r1 == 0) goto L_0x0015
            r1 = r0
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateSnap$1 r1 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateSnap$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.label = r2
            goto L_0x001a
        L_0x0015:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateSnap$1 r1 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateSnap$1
            r1.<init>(r0)
        L_0x001a:
            r7 = r1
            java.lang.Object r0 = r7.result
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r7.label
            r3 = 1
            if (r2 == 0) goto L_0x0042
            if (r2 != r3) goto L_0x003a
            float r1 = r7.F$1
            float r2 = r7.F$0
            java.lang.Object r3 = r7.L$1
            kotlin.jvm.internal.e0 r3 = (kotlin.jvm.internal.C12757e0) r3
            java.lang.Object r4 = r7.L$0
            androidx.compose.animation.core.AnimationState r4 = (androidx.compose.animation.core.AnimationState) r4
            p336ef.C11910n.m25701b(r0)
            r10 = r2
            r0 = r4
            goto L_0x008f
        L_0x003a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0042:
            p336ef.C11910n.m25701b(r0)
            kotlin.jvm.internal.e0 r0 = new kotlin.jvm.internal.e0
            r0.<init>()
            java.lang.Object r2 = r15.getVelocity()
            java.lang.Number r2 = (java.lang.Number) r2
            float r8 = r2.floatValue()
            java.lang.Float r4 = kotlin.coroutines.jvm.internal.C12735b.m28559b(r13)
            java.lang.Object r2 = r15.getVelocity()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r5 = 0
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0069
            r2 = r3
            goto L_0x006a
        L_0x0069:
            r2 = 0
        L_0x006a:
            r5 = r2 ^ 1
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateSnap$2 r6 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateSnap$2
            r2 = r12
            r9 = r14
            r10 = r17
            r6.<init>(r14, r0, r12, r10)
            r9 = r15
            r7.L$0 = r9
            r7.L$1 = r0
            r10 = r13
            r7.F$0 = r10
            r7.F$1 = r8
            r7.label = r3
            r2 = r15
            r3 = r4
            r4 = r16
            java.lang.Object r2 = androidx.compose.animation.core.SuspendAnimationKt.animateTo(r2, r3, r4, r5, r6, r7)
            if (r2 != r1) goto L_0x008c
            return r1
        L_0x008c:
            r3 = r0
            r1 = r8
            r0 = r9
        L_0x008f:
            java.lang.Object r2 = r0.getVelocity()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r2 = coerceToTarget(r2, r1)
            androidx.compose.foundation.gestures.snapping.AnimationResult r11 = new androidx.compose.foundation.gestures.snapping.AnimationResult
            float r1 = r3.f20408b
            float r10 = r10 - r1
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.C12735b.m28559b(r10)
            r1 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            r8 = 29
            r9 = 0
            androidx.compose.animation.core.AnimationState r0 = androidx.compose.animation.core.AnimationStateKt.copy$default((androidx.compose.animation.core.AnimationState) r0, (float) r1, (float) r2, (long) r3, (long) r5, (boolean) r7, (int) r8, (java.lang.Object) r9)
            r11.<init>(r10, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.animateSnap(androidx.compose.foundation.gestures.ScrollScope, float, float, androidx.compose.animation.core.AnimationState, androidx.compose.animation.core.AnimationSpec, kotlin.jvm.functions.Function1, hf.d):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: androidx.compose.ui.unit.Density} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object approach(androidx.compose.foundation.gestures.ScrollScope r7, float r8, float r9, androidx.compose.foundation.gestures.snapping.ApproachAnimation<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r10, androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider r11, androidx.compose.p002ui.unit.Density r12, kotlin.jvm.functions.Function1<? super java.lang.Float, p336ef.C11921v> r13, p355hf.C12074d<? super androidx.compose.foundation.gestures.snapping.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> r14) {
        /*
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$approach$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$approach$1 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$approach$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$approach$1 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$approach$1
            r0.<init>(r14)
        L_0x0018:
            r6 = r0
            java.lang.Object r14 = r6.result
            java.lang.Object r0 = p362if.C12150d.m26492c()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L_0x003c
            if (r1 != r2) goto L_0x0034
            java.lang.Object r7 = r6.L$1
            r12 = r7
            androidx.compose.ui.unit.Density r12 = (androidx.compose.p002ui.unit.Density) r12
            java.lang.Object r7 = r6.L$0
            r11 = r7
            androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider r11 = (androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider) r11
            p336ef.C11910n.m25701b(r14)
            goto L_0x0057
        L_0x0034:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003c:
            p336ef.C11910n.m25701b(r14)
            java.lang.Float r3 = kotlin.coroutines.jvm.internal.C12735b.m28559b(r8)
            java.lang.Float r4 = kotlin.coroutines.jvm.internal.C12735b.m28559b(r9)
            r6.L$0 = r11
            r6.L$1 = r12
            r6.label = r2
            r1 = r10
            r2 = r7
            r5 = r13
            java.lang.Object r14 = r1.approachAnimation(r2, r3, r4, r5, r6)
            if (r14 != r0) goto L_0x0057
            return r0
        L_0x0057:
            androidx.compose.foundation.gestures.snapping.AnimationResult r14 = (androidx.compose.foundation.gestures.snapping.AnimationResult) r14
            androidx.compose.animation.core.AnimationState r7 = r14.component2()
            java.lang.Object r8 = r7.getVelocity()
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            float r8 = findClosestOffset(r8, r11, r12)
            androidx.compose.foundation.gestures.snapping.AnimationResult r9 = new androidx.compose.foundation.gestures.snapping.AnimationResult
            java.lang.Float r8 = kotlin.coroutines.jvm.internal.C12735b.m28559b(r8)
            r9.<init>(r8, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.approach(androidx.compose.foundation.gestures.ScrollScope, float, float, androidx.compose.foundation.gestures.snapping.ApproachAnimation, androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider, androidx.compose.ui.unit.Density, kotlin.jvm.functions.Function1, hf.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final float coerceToTarget(float f, float f2) {
        boolean z;
        if (f2 == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return 0.0f;
        }
        if (f2 > 0.0f) {
            return C13537l.m30881h(f, f2);
        }
        return C13537l.m30876c(f, f2);
    }

    private static final <T extends Comparable<? super T>> T component1(C13522b<T> bVar) {
        C12775o.m28639i(bVar, "<this>");
        return bVar.getStart();
    }

    private static final <T extends Comparable<? super T>> T component2(C13522b<T> bVar) {
        C12775o.m28639i(bVar, "<this>");
        return bVar.getEndInclusive();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003c, code lost:
        if (java.lang.Math.abs(r5) <= java.lang.Math.abs(r6)) goto L_0x004a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final float findClosestOffset(float r4, androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider r5, androidx.compose.p002ui.unit.Density r6) {
        /*
            java.lang.String r0 = "snapLayoutInfoProvider"
            kotlin.jvm.internal.C12775o.m28639i(r5, r0)
            java.lang.String r0 = "density"
            kotlin.jvm.internal.C12775o.m28639i(r6, r0)
            tf.b r5 = r5.calculateSnappingOffsetBounds(r6)
            java.lang.Comparable r6 = component1(r5)
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            java.lang.Comparable r5 = component2(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            float r4 = java.lang.Math.signum(r4)
            r0 = 0
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x002f
            r1 = r2
            goto L_0x0030
        L_0x002f:
            r1 = r3
        L_0x0030:
            if (r1 == 0) goto L_0x003f
            float r4 = java.lang.Math.abs(r5)
            float r1 = java.lang.Math.abs(r6)
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 > 0) goto L_0x0058
            goto L_0x004a
        L_0x003f:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0047
            r1 = r2
            goto L_0x0048
        L_0x0047:
            r1 = r3
        L_0x0048:
            if (r1 == 0) goto L_0x004c
        L_0x004a:
            r6 = r5
            goto L_0x0058
        L_0x004c:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r2 = r3
        L_0x0054:
            if (r2 == 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r6 = r0
        L_0x0058:
            boolean r4 = findClosestOffset$isValidDistance(r6)
            if (r4 == 0) goto L_0x005f
            r0 = r6
        L_0x005f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.findClosestOffset(float, androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider, androidx.compose.ui.unit.Density):float");
    }

    private static final boolean findClosestOffset$isValidDistance(float f) {
        boolean z;
        boolean z2;
        if (f == Float.POSITIVE_INFINITY) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (f == Float.NEGATIVE_INFINITY) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                return true;
            }
        }
        return false;
    }

    public static final float getMinFlingVelocityDp() {
        return MinFlingVelocityDp;
    }

    @ExperimentalFoundationApi
    @Composable
    public static final SnapFlingBehavior rememberSnapFlingBehavior(SnapLayoutInfoProvider snapLayoutInfoProvider, Composer composer, int i) {
        C12775o.m28639i(snapLayoutInfoProvider, "snapLayoutInfoProvider");
        composer.startReplaceableGroup(-473984552);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-473984552, i, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (SnapFlingBehavior.kt:268)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        DecayAnimationSpec rememberSplineBasedDecay = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed((Object) snapLayoutInfoProvider) | composer.changed((Object) rememberSplineBasedDecay) | composer.changed((Object) density);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            SnapFlingBehavior snapFlingBehavior = new SnapFlingBehavior(snapLayoutInfoProvider, AnimationSpecKt.tween$default(0, 0, EasingKt.getLinearEasing(), 3, (Object) null), rememberSplineBasedDecay, AnimationSpecKt.spring$default(0.0f, 400.0f, (Object) null, 5, (Object) null), density, 0.0f, 32, (DefaultConstructorMarker) null);
            composer.updateRememberedValue(snapFlingBehavior);
            rememberedValue = snapFlingBehavior;
        }
        composer.endReplaceableGroup();
        SnapFlingBehavior snapFlingBehavior2 = (SnapFlingBehavior) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return snapFlingBehavior2;
    }

    private static final void debugLog(C13074a<String> aVar) {
    }
}
