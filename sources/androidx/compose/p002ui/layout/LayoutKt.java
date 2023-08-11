package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.ComposedModifierKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.UiComposable;
import androidx.compose.p002ui.node.ComposeUiNode;
import androidx.compose.p002ui.node.LayoutNode;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,316:1\n74#1:354\n75#1,11:356\n88#1:381\n76#2:317\n76#2:318\n76#2:319\n76#2:334\n76#2:335\n76#2:336\n76#2:355\n76#2:382\n76#2:383\n76#2:384\n456#3,14:320\n286#3,10:337\n36#3:347\n456#3,14:367\n365#3,11:385\n1114#4,6:348\n*S KotlinDebug\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n*L\n167#1:354\n167#1:356,11\n167#1:381\n74#1:317\n75#1:318\n76#1:319\n120#1:334\n121#1:335\n122#1:336\n167#1:355\n210#1:382\n211#1:383\n212#1:384\n77#1:320,14\n124#1:337,10\n170#1:347\n167#1:367,14\n214#1:385,11\n170#1:348,6\n*E\n"})
/* renamed from: androidx.compose.ui.layout.LayoutKt */
/* compiled from: Layout.kt */
public final class LayoutKt {
    @Composable
    @UiComposable
    public static final void Layout(C13088o<? super Composer, ? super Integer, C11921v> oVar, Modifier modifier, MeasurePolicy measurePolicy, Composer composer, int i, int i2) {
        C12775o.m28639i(oVar, "content");
        C12775o.m28639i(measurePolicy, "measurePolicy");
        composer.startReplaceableGroup(-1323940314);
        if ((i2 & 2) != 0) {
            modifier = Modifier.Companion;
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        C13074a<ComposeUiNode> constructor = companion.getConstructor();
        C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = materializerOf(modifier);
        int i3 = ((i << 9) & 7168) | 6;
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer r3 = Updater.m35292constructorimpl(composer);
        Updater.m35299setimpl(r3, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m35299setimpl(r3, density, companion.getSetDensity());
        Updater.m35299setimpl(r3, layoutDirection, companion.getSetLayoutDirection());
        Updater.m35299setimpl(r3, viewConfiguration, companion.getSetViewConfiguration());
        materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer)), composer, Integer.valueOf((i3 >> 3) & 112));
        composer.startReplaceableGroup(2058660585);
        oVar.invoke(composer, Integer.valueOf((i3 >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
    }

    @Composable
    @UiComposable
    public static final void MultiMeasureLayout(Modifier modifier, C13088o<? super Composer, ? super Integer, C11921v> oVar, MeasurePolicy measurePolicy, Composer composer, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        C12775o.m28639i(oVar, "content");
        C12775o.m28639i(measurePolicy, "measurePolicy");
        Composer startRestartGroup = composer.startRestartGroup(1949933075);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (startRestartGroup.changed((Object) modifier)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (startRestartGroup.changedInstance(oVar)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 0) {
            if (startRestartGroup.changed((Object) measurePolicy)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (i7 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1949933075, i3, -1, "androidx.compose.ui.layout.MultiMeasureLayout (Layout.kt:203)");
            }
            Modifier materialize = ComposedModifierKt.materialize(startRestartGroup, modifier);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            C13074a<LayoutNode> constructor$ui_release = LayoutNode.Companion.getConstructor$ui_release();
            int i8 = ((i3 << 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | 6;
            startRestartGroup.startReplaceableGroup(-692256719);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor$ui_release);
            } else {
                startRestartGroup.useNode();
            }
            Composer r5 = Updater.m35292constructorimpl(startRestartGroup);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Updater.m35299setimpl(r5, materialize, companion.getSetModifier());
            Updater.m35299setimpl(r5, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m35299setimpl(r5, density, companion.getSetDensity());
            Updater.m35299setimpl(r5, layoutDirection, companion.getSetLayoutDirection());
            Updater.m35299setimpl(r5, viewConfiguration, companion.getSetViewConfiguration());
            Updater.m35296initimpl(r5, LayoutKt$MultiMeasureLayout$1$1.INSTANCE);
            oVar.invoke(startRestartGroup, Integer.valueOf((i8 >> 6) & 14));
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LayoutKt$MultiMeasureLayout$2(modifier2, oVar, measurePolicy, i, i2));
        }
    }

    public static final C13088o<Composer, Integer, C11921v> combineAsVirtualLayouts(List<? extends C13088o<? super Composer, ? super Integer, C11921v>> list) {
        C12775o.m28639i(list, "contents");
        return ComposableLambdaKt.composableLambdaInstance(-1953651383, true, new LayoutKt$combineAsVirtualLayouts$1(list));
    }

    public static final C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf(Modifier modifier) {
        C12775o.m28639i(modifier, "modifier");
        return ComposableLambdaKt.composableLambdaInstance(-1586257396, true, new LayoutKt$materializerOf$1(modifier));
    }

    @Composable
    @UiComposable
    public static final void Layout(Modifier modifier, MeasurePolicy measurePolicy, Composer composer, int i, int i2) {
        C12775o.m28639i(measurePolicy, "measurePolicy");
        composer.startReplaceableGroup(544976794);
        if ((i2 & 1) != 0) {
            modifier = Modifier.Companion;
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Modifier materialize = ComposedModifierKt.materialize(composer, modifier);
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        C13074a<ComposeUiNode> constructor = companion.getConstructor();
        composer.startReplaceableGroup(1405779621);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(new LayoutKt$Layout$$inlined$ReusableComposeNode$1(constructor));
        } else {
            composer.useNode();
        }
        Composer r2 = Updater.m35292constructorimpl(composer);
        Updater.m35299setimpl(r2, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m35299setimpl(r2, density, companion.getSetDensity());
        Updater.m35299setimpl(r2, layoutDirection, companion.getSetLayoutDirection());
        Updater.m35299setimpl(r2, viewConfiguration, companion.getSetViewConfiguration());
        Updater.m35299setimpl(r2, materialize, companion.getSetModifier());
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    @UiComposable
    public static final void Layout(List<? extends C13088o<? super Composer, ? super Integer, C11921v>> list, Modifier modifier, MultiContentMeasurePolicy multiContentMeasurePolicy, Composer composer, int i, int i2) {
        C12775o.m28639i(list, "contents");
        C12775o.m28639i(multiContentMeasurePolicy, "measurePolicy");
        composer.startReplaceableGroup(1399185516);
        if ((i2 & 2) != 0) {
            modifier = Modifier.Companion;
        }
        C13088o<Composer, Integer, C11921v> combineAsVirtualLayouts = combineAsVirtualLayouts(list);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed((Object) multiContentMeasurePolicy);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
        int i3 = i & 112;
        composer.startReplaceableGroup(-1323940314);
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        C13074a<ComposeUiNode> constructor = companion.getConstructor();
        C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = materializerOf(modifier);
        int i4 = ((i3 << 9) & 7168) | 6;
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer r3 = Updater.m35292constructorimpl(composer);
        Updater.m35299setimpl(r3, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m35299setimpl(r3, density, companion.getSetDensity());
        Updater.m35299setimpl(r3, layoutDirection, companion.getSetLayoutDirection());
        Updater.m35299setimpl(r3, viewConfiguration, companion.getSetViewConfiguration());
        materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer)), composer, Integer.valueOf((i4 >> 3) & 112));
        composer.startReplaceableGroup(2058660585);
        combineAsVirtualLayouts.invoke(composer, Integer.valueOf((i4 >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }
}
