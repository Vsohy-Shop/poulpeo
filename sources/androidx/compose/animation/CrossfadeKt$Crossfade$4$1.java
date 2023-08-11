package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p002ui.layout.LayoutKt;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.node.ComposeUiNode;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12763h;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: Crossfade.kt */
final class CrossfadeKt$Crossfade$4$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ FiniteAnimationSpec<Float> $animationSpec;
    final /* synthetic */ C13089p<T, Composer, Integer, C11921v> $content;
    final /* synthetic */ T $stateForContent;
    final /* synthetic */ Transition<T> $this_Crossfade;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CrossfadeKt$Crossfade$4$1(Transition<T> transition, int i, FiniteAnimationSpec<Float> finiteAnimationSpec, T t, C13089p<? super T, ? super Composer, ? super Integer, C11921v> pVar) {
        super(2);
        this.$this_Crossfade = transition;
        this.$$dirty = i;
        this.$animationSpec = finiteAnimationSpec;
        this.$stateForContent = t;
        this.$content = pVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: invoke$lambda-1  reason: not valid java name */
    public static final float m32831invoke$lambda1(State<Float> state) {
        return state.getValue().floatValue();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    @Composable
    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            Transition<T> transition = this.$this_Crossfade;
            CrossfadeKt$Crossfade$4$1$alpha$2 crossfadeKt$Crossfade$4$1$alpha$2 = new CrossfadeKt$Crossfade$4$1$alpha$2(this.$animationSpec);
            T t = this.$stateForContent;
            int i2 = this.$$dirty & 14;
            composer.startReplaceableGroup(-1338768149);
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(C12763h.f20419a);
            int i3 = i2 & 14;
            int i4 = i2 << 3;
            int i5 = (i4 & 57344) | i3 | (i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i4 & 7168);
            composer.startReplaceableGroup(-142660079);
            T currentState = transition.getCurrentState();
            composer.startReplaceableGroup(-438678252);
            float f = 1.0f;
            float f2 = C12775o.m28634d(currentState, t) ? 1.0f : 0.0f;
            composer.endReplaceableGroup();
            Float valueOf = Float.valueOf(f2);
            T targetState = transition.getTargetState();
            composer.startReplaceableGroup(-438678252);
            if (!C12775o.m28634d(targetState, t)) {
                f = 0.0f;
            }
            composer.endReplaceableGroup();
            State<Float> createTransitionAnimation = TransitionKt.createTransitionAnimation(transition, valueOf, Float.valueOf(f), (FiniteAnimationSpec) crossfadeKt$Crossfade$4$1$alpha$2.invoke(transition.getSegment(), composer, Integer.valueOf((i5 >> 3) & 112)), vectorConverter, "FloatAnimation", composer, (i5 & 14) | (57344 & (i5 << 9)) | ((i5 << 6) & 458752));
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            Modifier.Companion companion = Modifier.Companion;
            composer.startReplaceableGroup(1157296644);
            boolean changed = composer.changed((Object) createTransitionAnimation);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new CrossfadeKt$Crossfade$4$1$1$1(createTransitionAnimation);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion, (Function1) rememberedValue);
            C13089p<T, Composer, Integer, C11921v> pVar = this.$content;
            T t2 = this.$stateForContent;
            int i6 = this.$$dirty;
            composer.startReplaceableGroup(-1990474327);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(1376089335);
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            C13074a<ComposeUiNode> constructor = companion2.getConstructor();
            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(graphicsLayer);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            composer.disableReusing();
            Composer r8 = Updater.m35292constructorimpl(composer);
            Updater.m35299setimpl(r8, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m35299setimpl(r8, density, companion2.getSetDensity());
            Updater.m35299setimpl(r8, layoutDirection, companion2.getSetLayoutDirection());
            composer.enableReusing();
            materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            composer.startReplaceableGroup(-1253629305);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer.startReplaceableGroup(-222715758);
            pVar.invoke(t2, composer, Integer.valueOf((i6 >> 9) & 112));
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            return;
        }
        composer.skipToGroupEnd();
    }
}
