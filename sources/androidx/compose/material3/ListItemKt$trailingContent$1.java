package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
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
final class ListItemKt$trailingContent$1 extends C12777p implements C13089p<RowScope, Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ boolean $topAlign;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $trailingContent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ListItemKt$trailingContent$1(boolean z, long j, C13088o<? super Composer, ? super Integer, C11921v> oVar, int i) {
        super(3);
        this.$topAlign = z;
        this.$contentColor = j;
        this.$trailingContent = oVar;
        this.$$changed = i;
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
        int i3 = i;
        C12775o.m28639i(rowScope2, "$this$null");
        if ((i3 & 14) == 0) {
            i2 = (composer2.changed((Object) rowScope2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i2 & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1301939978, i3, -1, "androidx.compose.material3.trailingContent.<anonymous> (ListItem.kt:339)");
            }
            if (this.$topAlign) {
                composer2.startReplaceableGroup(1857837855);
                Modifier r1 = PaddingKt.m33270paddingVpY3zN4$default(Modifier.Companion, ListItemKt.TrailingHorizontalPadding, 0.0f, 2, (Object) null);
                Alignment topStart = Alignment.Companion.getTopStart();
                long j = this.$contentColor;
                C13088o<Composer, Integer, C11921v> oVar = this.$trailingContent;
                int i4 = this.$$changed;
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(topStart, false, composer2, 6);
                composer2.startReplaceableGroup(-1323940314);
                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                C13074a<ComposeUiNode> constructor = companion.getConstructor();
                C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(r1);
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
                Composer r3 = Updater.m35292constructorimpl(composer);
                Updater.m35299setimpl(r3, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m35299setimpl(r3, density, companion.getSetDensity());
                Updater.m35299setimpl(r3, layoutDirection, companion.getSetLayoutDirection());
                Updater.m35299setimpl(r3, viewConfiguration, companion.getSetViewConfiguration());
                composer.enableReusing();
                materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                composer2.startReplaceableGroup(-2137368960);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composer2.startReplaceableGroup(-1890987531);
                ListItemKt.m34478ProvideTextStyleFromToken3JVO9M(j, ListTokens.INSTANCE.getListItemTrailingSupportingTextFont(), oVar, composer, ((i4 >> 3) & 14) | 48 | ((i4 << 6) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH));
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            } else {
                composer2.startReplaceableGroup(1857838233);
                Modifier.Companion companion2 = Modifier.Companion;
                Alignment.Companion companion3 = Alignment.Companion;
                Modifier r12 = PaddingKt.m33270paddingVpY3zN4$default(rowScope2.align(companion2, companion3.getCenterVertically()), ListItemKt.TrailingHorizontalPadding, 0.0f, 2, (Object) null);
                long j2 = this.$contentColor;
                C13088o<Composer, Integer, C11921v> oVar2 = this.$trailingContent;
                int i5 = this.$$changed;
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composer2, 0);
                composer2.startReplaceableGroup(-1323940314);
                Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                C13074a<ComposeUiNode> constructor2 = companion4.getConstructor();
                C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf2 = LayoutKt.materializerOf(r12);
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
                Composer r14 = Updater.m35292constructorimpl(composer);
                Updater.m35299setimpl(r14, rememberBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
                Updater.m35299setimpl(r14, density2, companion4.getSetDensity());
                Updater.m35299setimpl(r14, layoutDirection2, companion4.getSetLayoutDirection());
                Updater.m35299setimpl(r14, viewConfiguration2, companion4.getSetViewConfiguration());
                composer.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                composer2.startReplaceableGroup(-2137368960);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                composer2.startReplaceableGroup(-471095028);
                ListItemKt.m34478ProvideTextStyleFromToken3JVO9M(j2, ListTokens.INSTANCE.getListItemTrailingSupportingTextFont(), oVar2, composer, ((i5 >> 3) & 14) | 48 | ((i5 << 6) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH));
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
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
