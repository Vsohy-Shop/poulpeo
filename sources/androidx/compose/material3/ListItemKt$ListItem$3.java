package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.tokens.ListTokens;
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
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: ListItem.kt */
final class ListItemKt$ListItem$3 extends C12777p implements C13089p<RowScope, Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ ListItemColors $colors;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $headlineText;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $leadingContent;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $overlineText;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $trailingContent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ListItemKt$ListItem$3(C13088o<? super Composer, ? super Integer, C11921v> oVar, ListItemColors listItemColors, int i, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar3, C13088o<? super Composer, ? super Integer, C11921v> oVar4) {
        super(3);
        this.$leadingContent = oVar;
        this.$colors = listItemColors;
        this.$$dirty = i;
        this.$trailingContent = oVar2;
        this.$overlineText = oVar3;
        this.$headlineText = oVar4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return C11921v.f18618a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(RowScope rowScope, Composer composer, int i) {
        int i2;
        RowScope rowScope2 = rowScope;
        Composer composer2 = composer;
        C12775o.m28639i(rowScope2, "$this$ListItem");
        if ((i & 14) == 0) {
            i2 = i | (composer2.changed((Object) rowScope2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1733969726, i2, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:173)");
            }
            composer2.startReplaceableGroup(1316675520);
            C13088o<Composer, Integer, C11921v> oVar = this.$leadingContent;
            if (oVar != null) {
                ListItemKt.m34483leadingContentiJQMabo(oVar, this.$colors.leadingIconColor$material3_release(true, composer2, ((this.$$dirty >> 15) & 112) | 6).getValue().m35681unboximpl(), false, composer, ((this.$$dirty >> 12) & 14) | 384).invoke(rowScope2, composer2, Integer.valueOf(i2 & 14));
            }
            composer.endReplaceableGroup();
            Modifier.Companion companion = Modifier.Companion;
            Modifier weight$default = RowScope.weight$default(rowScope, companion, 1.0f, false, 2, (Object) null);
            Alignment.Companion companion2 = Alignment.Companion;
            Modifier align = rowScope2.align(weight$default, companion2.getCenterVertically());
            ListItemColors listItemColors = this.$colors;
            int i3 = this.$$dirty;
            C13088o<Composer, Integer, C11921v> oVar2 = this.$overlineText;
            C13088o<Composer, Integer, C11921v> oVar3 = this.$headlineText;
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
            composer2.startReplaceableGroup(-1323940314);
            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            C13074a<ComposeUiNode> constructor = companion3.getConstructor();
            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(align);
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
            Composer r5 = Updater.m35292constructorimpl(composer);
            Updater.m35299setimpl(r5, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m35299setimpl(r5, density, companion3.getSetDensity());
            Updater.m35299setimpl(r5, layoutDirection, companion3.getSetLayoutDirection());
            Updater.m35299setimpl(r5, viewConfiguration, companion3.getSetViewConfiguration());
            composer.enableReusing();
            materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            composer2.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2.startReplaceableGroup(-1917170824);
            composer2.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), composer2, 0);
            composer2.startReplaceableGroup(-1323940314);
            Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            C13074a<ComposeUiNode> constructor2 = companion3.getConstructor();
            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf2 = LayoutKt.materializerOf(companion);
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
            Composer r7 = Updater.m35292constructorimpl(composer);
            Updater.m35299setimpl(r7, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m35299setimpl(r7, density2, companion3.getSetDensity());
            Updater.m35299setimpl(r7, layoutDirection2, companion3.getSetLayoutDirection());
            Updater.m35299setimpl(r7, viewConfiguration2, companion3.getSetViewConfiguration());
            composer.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            composer2.startReplaceableGroup(-1163856341);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composer2.startReplaceableGroup(562295746);
            long r1 = listItemColors.overlineColor$material3_release(composer2, (i3 >> 18) & 14).getValue().m35681unboximpl();
            ListTokens listTokens = ListTokens.INSTANCE;
            Composer composer3 = composer;
            ListItemKt.m34478ProvideTextStyleFromToken3JVO9M(r1, listTokens.getListItemOverlineFont(), oVar2, composer3, (i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | 48);
            ListItemKt.m34478ProvideTextStyleFromToken3JVO9M(listItemColors.headlineColor$material3_release(true, composer2, ((i3 >> 15) & 112) | 6).getValue().m35681unboximpl(), listTokens.getListItemLabelTextFont(), oVar3, composer3, ((i3 << 6) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | 48);
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            C13088o<Composer, Integer, C11921v> oVar4 = this.$trailingContent;
            if (oVar4 != null) {
                ListItemKt.m34484trailingContentiJQMabo(oVar4, this.$colors.trailingIconColor$material3_release(true, composer2, ((this.$$dirty >> 15) & 112) | 6).getValue().m35681unboximpl(), false, composer, ((this.$$dirty >> 15) & 14) | 384).invoke(rowScope, composer2, Integer.valueOf(i2 & 14));
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
