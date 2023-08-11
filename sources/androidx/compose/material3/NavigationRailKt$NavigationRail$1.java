package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.material3.tokens.NavigationRailTokens;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.layout.LayoutKt;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.node.ComposeUiNode;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: NavigationRail.kt */
final class NavigationRailKt$NavigationRail$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C13089p<ColumnScope, Composer, Integer, C11921v> $content;
    final /* synthetic */ C13089p<ColumnScope, Composer, Integer, C11921v> $header;
    final /* synthetic */ WindowInsets $windowInsets;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NavigationRailKt$NavigationRail$1(WindowInsets windowInsets, C13089p<? super ColumnScope, ? super Composer, ? super Integer, C11921v> pVar, int i, C13089p<? super ColumnScope, ? super Composer, ? super Integer, C11921v> pVar2) {
        super(2);
        this.$windowInsets = windowInsets;
        this.$header = pVar;
        this.$$dirty = i;
        this.$content = pVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2092683357, i, -1, "androidx.compose.material3.NavigationRail.<anonymous> (NavigationRail.kt:112)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier selectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m33270paddingVpY3zN4$default(SizeKt.m33345widthInVpY3zN4$default(WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, (Object) null), this.$windowInsets), NavigationRailTokens.INSTANCE.m35037getContainerWidthD9Ej5fM(), 0.0f, 2, (Object) null), 0.0f, NavigationRailKt.getNavigationRailVerticalPadding(), 1, (Object) null));
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            Arrangement.HorizontalOrVertical r2 = Arrangement.INSTANCE.m33185spacedBy0680j_4(NavigationRailKt.getNavigationRailVerticalPadding());
            C13089p<ColumnScope, Composer, Integer, C11921v> pVar = this.$header;
            int i2 = this.$$dirty;
            C13089p<ColumnScope, Composer, Integer, C11921v> pVar2 = this.$content;
            composer.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(r2, centerHorizontally, composer, 54);
            composer.startReplaceableGroup(-1323940314);
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            C13074a<ComposeUiNode> constructor = companion2.getConstructor();
            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(selectableGroup);
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
            Composer r9 = Updater.m35292constructorimpl(composer);
            Updater.m35299setimpl(r9, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m35299setimpl(r9, density, companion2.getSetDensity());
            Updater.m35299setimpl(r9, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m35299setimpl(r9, viewConfiguration, companion2.getSetViewConfiguration());
            composer.enableReusing();
            materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            composer.startReplaceableGroup(-1163856341);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composer.startReplaceableGroup(-1267890579);
            composer.startReplaceableGroup(716053607);
            if (pVar != null) {
                pVar.invoke(columnScopeInstance, composer, Integer.valueOf(((i2 >> 6) & 112) | 6));
                SpacerKt.Spacer(SizeKt.m33324height3ABfNKs(companion, NavigationRailKt.NavigationRailHeaderPadding), composer, 6);
            }
            composer.endReplaceableGroup();
            pVar2.invoke(columnScopeInstance, composer, Integer.valueOf(((i2 >> 12) & 112) | 6));
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
