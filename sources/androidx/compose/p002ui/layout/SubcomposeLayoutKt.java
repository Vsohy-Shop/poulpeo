package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.ComposedModifierKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.UiComposable;
import androidx.compose.p002ui.node.ComposeUiNode;
import androidx.compose.p002ui.node.LayoutNode;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/SubcomposeLayoutKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,774:1\n25#2:775\n251#2,10:785\n36#2:795\n1114#3,6:776\n1114#3,6:796\n76#4:782\n76#4:783\n76#4:784\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/SubcomposeLayoutKt\n*L\n76#1:775\n114#1:785,10\n132#1:795\n76#1:776,6\n132#1:796,6\n111#1:782\n112#1:783\n113#1:784\n*E\n"})
/* renamed from: androidx.compose.ui.layout.SubcomposeLayoutKt */
/* compiled from: SubcomposeLayout.kt */
public final class SubcomposeLayoutKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void SubcomposeLayout(Modifier modifier, C13088o<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> oVar, Composer composer, int i, int i2) {
        int i3;
        C12775o.m28639i(oVar, "measurePolicy");
        Composer startRestartGroup = composer.startRestartGroup(-1298353104);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed((Object) modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(oVar) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1298353104, i3, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:70)");
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SubcomposeLayoutState();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            int i5 = i3 << 3;
            SubcomposeLayout((SubcomposeLayoutState) rememberedValue, modifier, oVar, startRestartGroup, (i5 & 112) | 8 | (i5 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SubcomposeLayoutKt$SubcomposeLayout$2(modifier, oVar, i, i2));
        }
    }

    public static final SubcomposeSlotReusePolicy SubcomposeSlotReusePolicy(int i) {
        return new FixedCountSubcomposeSlotReusePolicy(i);
    }

    @Composable
    @UiComposable
    public static final void SubcomposeLayout(SubcomposeLayoutState subcomposeLayoutState, Modifier modifier, C13088o<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> oVar, Composer composer, int i, int i2) {
        C12775o.m28639i(subcomposeLayoutState, "state");
        C12775o.m28639i(oVar, "measurePolicy");
        Composer startRestartGroup = composer.startRestartGroup(-511989831);
        if ((i2 & 2) != 0) {
            modifier = Modifier.Companion;
        }
        Modifier modifier2 = modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-511989831, i, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:103)");
        }
        CompositionContext rememberCompositionContext = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
        Modifier materialize = ComposedModifierKt.materialize(startRestartGroup, modifier2);
        Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        C13074a<LayoutNode> constructor$ui_release = LayoutNode.Companion.getConstructor$ui_release();
        startRestartGroup.startReplaceableGroup(1886828752);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(new SubcomposeLayoutKt$SubcomposeLayout$$inlined$ComposeNode$1(constructor$ui_release));
        } else {
            startRestartGroup.useNode();
        }
        Composer r6 = Updater.m35292constructorimpl(startRestartGroup);
        Updater.m35299setimpl(r6, subcomposeLayoutState, subcomposeLayoutState.getSetRoot$ui_release());
        Updater.m35299setimpl(r6, rememberCompositionContext, subcomposeLayoutState.getSetCompositionContext$ui_release());
        Updater.m35299setimpl(r6, oVar, subcomposeLayoutState.getSetMeasurePolicy$ui_release());
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Updater.m35299setimpl(r6, density, companion.getSetDensity());
        Updater.m35299setimpl(r6, layoutDirection, companion.getSetLayoutDirection());
        Updater.m35299setimpl(r6, viewConfiguration, companion.getSetViewConfiguration());
        Updater.m35299setimpl(r6, materialize, companion.getSetModifier());
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(-607848778);
        if (!startRestartGroup.getSkipping()) {
            EffectsKt.SideEffect(new SubcomposeLayoutKt$SubcomposeLayout$4(subcomposeLayoutState), startRestartGroup, 0);
        }
        startRestartGroup.endReplaceableGroup();
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(subcomposeLayoutState, startRestartGroup, 8);
        C11921v vVar = C11921v.f18618a;
        startRestartGroup.startReplaceableGroup(1157296644);
        boolean changed = startRestartGroup.changed((Object) rememberUpdatedState);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new SubcomposeLayoutKt$SubcomposeLayout$5$1(rememberUpdatedState);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        EffectsKt.DisposableEffect((Object) vVar, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) (Function1) rememberedValue, startRestartGroup, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SubcomposeLayoutKt$SubcomposeLayout$6(subcomposeLayoutState, modifier2, oVar, i, i2));
        }
    }
}
