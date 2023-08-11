package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
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
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material/NavigationRailKt$NavigationRail$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,405:1\n74#2,6:406\n80#2:438\n84#2:443\n75#3:412\n76#3,11:414\n89#3:442\n76#4:413\n460#5,13:425\n473#5,3:439\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material/NavigationRailKt$NavigationRail$1\n*L\n107#1:406,6\n107#1:438\n107#1:443\n107#1:412\n107#1:414,11\n107#1:442\n107#1:413\n107#1:425,13\n107#1:439,3\n*E\n"})
/* compiled from: NavigationRail.kt */
final class NavigationRailKt$NavigationRail$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C13089p<ColumnScope, Composer, Integer, C11921v> $content;
    final /* synthetic */ C13089p<ColumnScope, Composer, Integer, C11921v> $header;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NavigationRailKt$NavigationRail$1(C13089p<? super ColumnScope, ? super Composer, ? super Integer, C11921v> pVar, int i, C13089p<? super ColumnScope, ? super Composer, ? super Integer, C11921v> pVar2) {
        super(2);
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
                ComposerKt.traceEventStart(-1571506489, i, -1, "androidx.compose.material.NavigationRail.<anonymous> (NavigationRail.kt:105)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier selectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m33270paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, (Object) null), 0.0f, NavigationRailKt.NavigationRailPadding, 1, (Object) null));
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            C13089p<ColumnScope, Composer, Integer, C11921v> pVar = this.$header;
            int i2 = this.$$dirty;
            C13089p<ColumnScope, Composer, Integer, C11921v> pVar2 = this.$content;
            composer.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
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
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composer.startReplaceableGroup(65525382);
            if (pVar != null) {
                pVar.invoke(columnScopeInstance, composer, Integer.valueOf(((i2 >> 9) & 112) | 6));
                SpacerKt.Spacer(SizeKt.m33324height3ABfNKs(companion, NavigationRailKt.HeaderPadding), composer, 6);
            }
            composer.endReplaceableGroup();
            pVar2.invoke(columnScopeInstance, composer, Integer.valueOf(((i2 >> 12) & 112) | 6));
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
