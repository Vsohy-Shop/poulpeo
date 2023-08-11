package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.C12757e0;
import kotlin.jvm.internal.C12762g0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nTransformableState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformableState.kt\nandroidx/compose/foundation/gestures/TransformableStateKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,261:1\n25#2:262\n1114#3,6:263\n*S KotlinDebug\n*F\n+ 1 TransformableState.kt\nandroidx/compose/foundation/gestures/TransformableStateKt\n*L\n119#1:262\n119#1:263,6\n*E\n"})
/* compiled from: TransformableState.kt */
public final class TransformableStateKt {
    public static final TransformableState TransformableState(C13089p<? super Float, ? super Offset, ? super Float, C11921v> pVar) {
        C12775o.m28639i(pVar, "onTransformation");
        return new DefaultTransformableState(pVar);
    }

    /* renamed from: animatePanBy-ubNVwUQ  reason: not valid java name */
    public static final Object m33154animatePanByubNVwUQ(TransformableState transformableState, long j, AnimationSpec<Offset> animationSpec, C12074d<? super C11921v> dVar) {
        C12762g0 g0Var = new C12762g0();
        g0Var.f20418b = Offset.Companion.m35438getZeroF1C5BW0();
        Object transform$default = TransformableState.transform$default(transformableState, (MutatePriority) null, new TransformableStateKt$animatePanBy$2(g0Var, j, animationSpec, (C12074d<? super TransformableStateKt$animatePanBy$2>) null), dVar, 1, (Object) null);
        if (transform$default == C12150d.m26492c()) {
            return transform$default;
        }
        return C11921v.f18618a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: androidx.compose.animation.core.SpringSpec} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: androidx.compose.animation.core.SpringSpec} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: androidx.compose.animation.core.SpringSpec} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: animatePanBy-ubNVwUQ$default  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object m33155animatePanByubNVwUQ$default(androidx.compose.foundation.gestures.TransformableState r6, long r7, androidx.compose.animation.core.AnimationSpec r9, p355hf.C12074d r10, int r11, java.lang.Object r12) {
        /*
            r11 = r11 & 2
            if (r11 == 0) goto L_0x0010
            androidx.compose.animation.core.SpringSpec r9 = new androidx.compose.animation.core.SpringSpec
            r1 = 0
            r2 = 1128792064(0x43480000, float:200.0)
            r3 = 0
            r4 = 5
            r5 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5)
        L_0x0010:
            java.lang.Object r6 = m33154animatePanByubNVwUQ(r6, r7, r9, r10)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableStateKt.m33155animatePanByubNVwUQ$default(androidx.compose.foundation.gestures.TransformableState, long, androidx.compose.animation.core.AnimationSpec, hf.d, int, java.lang.Object):java.lang.Object");
    }

    public static final Object animateRotateBy(TransformableState transformableState, float f, AnimationSpec<Float> animationSpec, C12074d<? super C11921v> dVar) {
        Object transform$default = TransformableState.transform$default(transformableState, (MutatePriority) null, new TransformableStateKt$animateRotateBy$2(new C12757e0(), f, animationSpec, (C12074d<? super TransformableStateKt$animateRotateBy$2>) null), dVar, 1, (Object) null);
        if (transform$default == C12150d.m26492c()) {
            return transform$default;
        }
        return C11921v.f18618a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: androidx.compose.animation.core.SpringSpec} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: androidx.compose.animation.core.SpringSpec} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: androidx.compose.animation.core.SpringSpec} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object animateRotateBy$default(androidx.compose.foundation.gestures.TransformableState r6, float r7, androidx.compose.animation.core.AnimationSpec r8, p355hf.C12074d r9, int r10, java.lang.Object r11) {
        /*
            r10 = r10 & 2
            if (r10 == 0) goto L_0x0010
            androidx.compose.animation.core.SpringSpec r8 = new androidx.compose.animation.core.SpringSpec
            r1 = 0
            r2 = 1128792064(0x43480000, float:200.0)
            r3 = 0
            r4 = 5
            r5 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5)
        L_0x0010:
            java.lang.Object r6 = animateRotateBy(r6, r7, r8, r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableStateKt.animateRotateBy$default(androidx.compose.foundation.gestures.TransformableState, float, androidx.compose.animation.core.AnimationSpec, hf.d, int, java.lang.Object):java.lang.Object");
    }

    public static final Object animateZoomBy(TransformableState transformableState, float f, AnimationSpec<Float> animationSpec, C12074d<? super C11921v> dVar) {
        boolean z;
        if (f > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C12757e0 e0Var = new C12757e0();
            e0Var.f20408b = 1.0f;
            Object transform$default = TransformableState.transform$default(transformableState, (MutatePriority) null, new TransformableStateKt$animateZoomBy$3(e0Var, f, animationSpec, (C12074d<? super TransformableStateKt$animateZoomBy$3>) null), dVar, 1, (Object) null);
            if (transform$default == C12150d.m26492c()) {
                return transform$default;
            }
            return C11921v.f18618a;
        }
        throw new IllegalArgumentException("zoom value should be greater than 0".toString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: androidx.compose.animation.core.SpringSpec} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: androidx.compose.animation.core.SpringSpec} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: androidx.compose.animation.core.SpringSpec} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object animateZoomBy$default(androidx.compose.foundation.gestures.TransformableState r6, float r7, androidx.compose.animation.core.AnimationSpec r8, p355hf.C12074d r9, int r10, java.lang.Object r11) {
        /*
            r10 = r10 & 2
            if (r10 == 0) goto L_0x0010
            androidx.compose.animation.core.SpringSpec r8 = new androidx.compose.animation.core.SpringSpec
            r1 = 0
            r2 = 1128792064(0x43480000, float:200.0)
            r3 = 0
            r4 = 5
            r5 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5)
        L_0x0010:
            java.lang.Object r6 = animateZoomBy(r6, r7, r8, r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableStateKt.animateZoomBy$default(androidx.compose.foundation.gestures.TransformableState, float, androidx.compose.animation.core.AnimationSpec, hf.d, int, java.lang.Object):java.lang.Object");
    }

    /* renamed from: panBy-d-4ec7I  reason: not valid java name */
    public static final Object m33156panByd4ec7I(TransformableState transformableState, long j, C12074d<? super C11921v> dVar) {
        Object transform$default = TransformableState.transform$default(transformableState, (MutatePriority) null, new TransformableStateKt$panBy$2(j, (C12074d<? super TransformableStateKt$panBy$2>) null), dVar, 1, (Object) null);
        if (transform$default == C12150d.m26492c()) {
            return transform$default;
        }
        return C11921v.f18618a;
    }

    @Composable
    public static final TransformableState rememberTransformableState(C13089p<? super Float, ? super Offset, ? super Float, C11921v> pVar, Composer composer, int i) {
        C12775o.m28639i(pVar, "onTransformation");
        composer.startReplaceableGroup(1681419281);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1681419281, i, -1, "androidx.compose.foundation.gestures.rememberTransformableState (TransformableState.kt:114)");
        }
        State<T> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(pVar, composer, i & 14);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = TransformableState(new TransformableStateKt$rememberTransformableState$1$1(rememberUpdatedState));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        TransformableState transformableState = (TransformableState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return transformableState;
    }

    public static final Object rotateBy(TransformableState transformableState, float f, C12074d<? super C11921v> dVar) {
        Object transform$default = TransformableState.transform$default(transformableState, (MutatePriority) null, new TransformableStateKt$rotateBy$2(f, (C12074d<? super TransformableStateKt$rotateBy$2>) null), dVar, 1, (Object) null);
        if (transform$default == C12150d.m26492c()) {
            return transform$default;
        }
        return C11921v.f18618a;
    }

    public static final Object stopTransformation(TransformableState transformableState, MutatePriority mutatePriority, C12074d<? super C11921v> dVar) {
        Object transform = transformableState.transform(mutatePriority, new TransformableStateKt$stopTransformation$2((C12074d<? super TransformableStateKt$stopTransformation$2>) null), dVar);
        if (transform == C12150d.m26492c()) {
            return transform;
        }
        return C11921v.f18618a;
    }

    public static /* synthetic */ Object stopTransformation$default(TransformableState transformableState, MutatePriority mutatePriority, C12074d dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return stopTransformation(transformableState, mutatePriority, dVar);
    }

    public static final Object zoomBy(TransformableState transformableState, float f, C12074d<? super C11921v> dVar) {
        Object transform$default = TransformableState.transform$default(transformableState, (MutatePriority) null, new TransformableStateKt$zoomBy$2(f, (C12074d<? super TransformableStateKt$zoomBy$2>) null), dVar, 1, (Object) null);
        if (transform$default == C12150d.m26492c()) {
            return transform$default;
        }
        return C11921v.f18618a;
    }
}
