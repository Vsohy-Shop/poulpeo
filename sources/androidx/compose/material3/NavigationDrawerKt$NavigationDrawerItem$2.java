package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.layout.LayoutKt;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.node.ComposeUiNode;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: NavigationDrawer.kt */
final class NavigationDrawerKt$NavigationDrawerItem$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $badge;
    final /* synthetic */ NavigationDrawerItemColors $colors;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $icon;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $label;
    final /* synthetic */ boolean $selected;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NavigationDrawerKt$NavigationDrawerItem$2(C13088o<? super Composer, ? super Integer, C11921v> oVar, NavigationDrawerItemColors navigationDrawerItemColors, boolean z, int i, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar3) {
        super(2);
        this.$icon = oVar;
        this.$colors = navigationDrawerItemColors;
        this.$selected = z;
        this.$$dirty = i;
        this.$badge = oVar2;
        this.$label = oVar3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i) {
        Composer composer2 = composer;
        int i2 = i;
        if ((i2 & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(191488423, i2, -1, "androidx.compose.material3.NavigationDrawerItem.<anonymous> (NavigationDrawer.kt:679)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier r3 = PaddingKt.m33272paddingqDBjuR0$default(companion, C1232Dp.m38468constructorimpl((float) 16), 0.0f, C1232Dp.m38468constructorimpl((float) 24), 0.0f, 10, (Object) null);
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            C13088o<Composer, Integer, C11921v> oVar = this.$icon;
            NavigationDrawerItemColors navigationDrawerItemColors = this.$colors;
            boolean z = this.$selected;
            int i3 = this.$$dirty;
            C13088o<Composer, Integer, C11921v> oVar2 = this.$badge;
            C13088o<Composer, Integer, C11921v> oVar3 = this.$label;
            composer2.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
            composer2.startReplaceableGroup(-1323940314);
            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            C13074a<ComposeUiNode> constructor = companion3.getConstructor();
            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(r3);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer.useNode();
            }
            composer.disableReusing();
            Composer r0 = Updater.m35292constructorimpl(composer);
            Updater.m35299setimpl(r0, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m35299setimpl(r0, density, companion3.getSetDensity());
            Updater.m35299setimpl(r0, layoutDirection, companion3.getSetLayoutDirection());
            Updater.m35299setimpl(r0, viewConfiguration, companion3.getSetViewConfiguration());
            composer.enableReusing();
            materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            composer2.startReplaceableGroup(-678309503);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer2.startReplaceableGroup(1789891011);
            composer2.startReplaceableGroup(-1538531826);
            if (oVar != null) {
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m35661boximpl(navigationDrawerItemColors.iconColor(z, composer2, ((i3 >> 3) & 14) | ((i3 >> 18) & 112)).getValue().m35681unboximpl()))}, (C13088o<? super Composer, ? super Integer, C11921v>) oVar, composer2, ((i3 >> 9) & 112) | 8);
                SpacerKt.Spacer(SizeKt.m33343width3ABfNKs(companion, C1232Dp.m38468constructorimpl((float) 12)), composer2, 6);
            }
            composer.endReplaceableGroup();
            C13088o<Composer, Integer, C11921v> oVar4 = oVar3;
            Modifier weight$default = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, (Object) null);
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
            composer2.startReplaceableGroup(-1323940314);
            Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            C13074a<ComposeUiNode> constructor2 = companion3.getConstructor();
            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf2 = LayoutKt.materializerOf(weight$default);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer.useNode();
            }
            composer.disableReusing();
            Composer r9 = Updater.m35292constructorimpl(composer);
            Updater.m35299setimpl(r9, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m35299setimpl(r9, density2, companion3.getSetDensity());
            Updater.m35299setimpl(r9, layoutDirection2, companion3.getSetLayoutDirection());
            Updater.m35299setimpl(r9, viewConfiguration2, companion3.getSetViewConfiguration());
            composer.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            composer2.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2.startReplaceableGroup(-1847258627);
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m35661boximpl(navigationDrawerItemColors.textColor(z, composer2, ((i3 >> 3) & 14) | ((i3 >> 18) & 112)).getValue().m35681unboximpl()))}, (C13088o<? super Composer, ? super Integer, C11921v>) oVar4, composer2, ((i3 << 3) & 112) | 8);
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (oVar2 != null) {
                SpacerKt.Spacer(SizeKt.m33343width3ABfNKs(companion, C1232Dp.m38468constructorimpl((float) 12)), composer2, 6);
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m35661boximpl(navigationDrawerItemColors.badgeColor(z, composer2, ((i3 >> 3) & 14) | ((i3 >> 18) & 112)).getValue().m35681unboximpl()))}, (C13088o<? super Composer, ? super Integer, C11921v>) oVar2, composer2, ((i3 >> 12) & 112) | 8);
            }
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
