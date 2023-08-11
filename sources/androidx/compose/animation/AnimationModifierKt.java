package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p002ui.ComposedModifierKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.platform.InspectableValueKt;
import androidx.compose.p002ui.unit.IntSize;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: AnimationModifier.kt */
public final class AnimationModifierKt {
    public static final Modifier animateContentSize(Modifier modifier, FiniteAnimationSpec<IntSize> finiteAnimationSpec, C13088o<? super IntSize, ? super IntSize, C11921v> oVar) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(finiteAnimationSpec, "animationSpec");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new C0327x5f44a391(finiteAnimationSpec, oVar);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, function1, new AnimationModifierKt$animateContentSize$2(oVar, finiteAnimationSpec));
    }

    public static /* synthetic */ Modifier animateContentSize$default(Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, C13088o oVar, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, (Object) null, 7, (Object) null);
        }
        if ((i & 2) != 0) {
            oVar = null;
        }
        return animateContentSize(modifier, finiteAnimationSpec, oVar);
    }
}
