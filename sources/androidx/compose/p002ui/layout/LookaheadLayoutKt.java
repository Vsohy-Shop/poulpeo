package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.ComposedModifierKt;
import androidx.compose.p002ui.ExperimentalComposeUiApi;
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
import androidx.compose.runtime.Updater;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nLookaheadLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadLayout.kt\nandroidx/compose/ui/layout/LookaheadLayoutKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,200:1\n76#2:201\n76#2:202\n76#2:203\n25#3:204\n365#3,11:211\n1114#4,6:205\n*S KotlinDebug\n*F\n+ 1 LookaheadLayout.kt\nandroidx/compose/ui/layout/LookaheadLayoutKt\n*L\n74#1:201\n75#1:202\n76#1:203\n78#1:204\n79#1:211,11\n78#1:205,6\n*E\n"})
/* renamed from: androidx.compose.ui.layout.LookaheadLayoutKt */
/* compiled from: LookaheadLayout.kt */
public final class LookaheadLayoutKt {
    @ExperimentalComposeUiApi
    @UiComposable
    @Composable
    public static final void LookaheadLayout(C13089p<? super LookaheadLayoutScope, ? super Composer, ? super Integer, C11921v> pVar, Modifier modifier, MeasurePolicy measurePolicy, Composer composer, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        C12775o.m28639i(pVar, "content");
        C12775o.m28639i(measurePolicy, "measurePolicy");
        Composer startRestartGroup = composer.startRestartGroup(1697006219);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (startRestartGroup.changed((Object) modifier)) {
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
                ComposerKt.traceEventStart(1697006219, i3, -1, "androidx.compose.ui.layout.LookaheadLayout (LookaheadLayout.kt:67)");
            }
            Modifier materialize = ComposedModifierKt.materialize(startRestartGroup, modifier);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new LookaheadLayoutScopeImpl();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            LookaheadLayoutScopeImpl lookaheadLayoutScopeImpl = (LookaheadLayoutScopeImpl) rememberedValue;
            C13074a<LayoutNode> constructor$ui_release = LayoutNode.Companion.getConstructor$ui_release();
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
            Composer r6 = Updater.m35292constructorimpl(startRestartGroup);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Updater.m35299setimpl(r6, materialize, companion.getSetModifier());
            Updater.m35299setimpl(r6, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m35299setimpl(r6, density, companion.getSetDensity());
            Updater.m35299setimpl(r6, layoutDirection, companion.getSetLayoutDirection());
            Updater.m35299setimpl(r6, viewConfiguration, companion.getSetViewConfiguration());
            Updater.m35299setimpl(r6, lookaheadLayoutScopeImpl, LookaheadLayoutKt$LookaheadLayout$1$1.INSTANCE);
            Updater.m35296initimpl(r6, LookaheadLayoutKt$LookaheadLayout$1$2.INSTANCE);
            pVar.invoke(lookaheadLayoutScopeImpl, startRestartGroup, Integer.valueOf(((i3 << 3) & 112) | 8));
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
            endRestartGroup.updateScope(new LookaheadLayoutKt$LookaheadLayout$3(pVar, modifier2, measurePolicy, i, i2));
        }
    }
}
