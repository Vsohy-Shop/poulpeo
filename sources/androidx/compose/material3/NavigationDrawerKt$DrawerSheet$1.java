package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
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

/* compiled from: NavigationDrawer.kt */
final class NavigationDrawerKt$DrawerSheet$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C13089p<ColumnScope, Composer, Integer, C11921v> $content;
    final /* synthetic */ WindowInsets $windowInsets;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NavigationDrawerKt$DrawerSheet$1(WindowInsets windowInsets, C13089p<? super ColumnScope, ? super Composer, ? super Integer, C11921v> pVar, int i) {
        super(2);
        this.$windowInsets = windowInsets;
        this.$content = pVar;
        this.$$dirty = i;
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
                ComposerKt.traceEventStart(959363152, i, -1, "androidx.compose.material3.DrawerSheet.<anonymous> (NavigationDrawer.kt:579)");
            }
            Modifier windowInsetsPadding = WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.m33342sizeInqDBjuR0$default(Modifier.Companion, NavigationDrawerKt.MinimumDrawerWidth, 0.0f, DrawerDefaults.INSTANCE.m34401getMaximumDrawerWidthD9Ej5fM(), 0.0f, 10, (Object) null), this.$windowInsets);
            C13089p<ColumnScope, Composer, Integer, C11921v> pVar = this.$content;
            int i2 = (this.$$dirty >> 9) & 7168;
            composer.startReplaceableGroup(-483455358);
            int i3 = i2 >> 3;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, (i3 & 112) | (i3 & 14));
            composer.startReplaceableGroup(-1323940314);
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            C13074a<ComposeUiNode> constructor = companion.getConstructor();
            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(windowInsetsPadding);
            int i4 = ((((i2 << 3) & 112) << 9) & 7168) | 6;
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
            Updater.m35299setimpl(r9, columnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m35299setimpl(r9, density, companion.getSetDensity());
            Updater.m35299setimpl(r9, layoutDirection, companion.getSetLayoutDirection());
            Updater.m35299setimpl(r9, viewConfiguration, companion.getSetViewConfiguration());
            composer.enableReusing();
            materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer)), composer, Integer.valueOf((i4 >> 3) & 112));
            composer.startReplaceableGroup(2058660585);
            composer.startReplaceableGroup(-1163856341);
            if (((i4 >> 9) & 14 & 11) != 2 || !composer.getSkipping()) {
                pVar.invoke(ColumnScopeInstance.INSTANCE, composer, Integer.valueOf(((i2 >> 6) & 112) | 6));
            } else {
                composer.skipToGroupEnd();
            }
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
