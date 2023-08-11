package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.Color;
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
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: ListItem.kt */
final class ListItemKt$leadingContent$1 extends C12777p implements C13089p<RowScope, Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $leadingContent;
    final /* synthetic */ boolean $topAlign;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ListItemKt$leadingContent$1(long j, boolean z, C13088o<? super Composer, ? super Integer, C11921v> oVar, int i) {
        super(3);
        this.$contentColor = j;
        this.$topAlign = z;
        this.$leadingContent = oVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return C11921v.f18618a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(final RowScope rowScope, Composer composer, int i) {
        int i2;
        C12775o.m28639i(rowScope, "$this$null");
        if ((i & 14) == 0) {
            i2 = (composer.changed((Object) rowScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1755598478, i, -1, "androidx.compose.material3.leadingContent.<anonymous> (ListItem.kt:314)");
            }
            ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m35661boximpl(this.$contentColor))};
            final boolean z = this.$topAlign;
            final C13088o<Composer, Integer, C11921v> oVar = this.$leadingContent;
            final int i3 = this.$$changed;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, (C13088o<? super Composer, ? super Integer, C11921v>) ComposableLambdaKt.composableLambda(composer, -1636714958, true, new C13088o<Composer, Integer, C11921v>() {
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
                            ComposerKt.traceEventStart(-1636714958, i2, -1, "androidx.compose.material3.leadingContent.<anonymous>.<anonymous> (ListItem.kt:316)");
                        }
                        if (z) {
                            composer2.startReplaceableGroup(377880875);
                            Modifier r2 = PaddingKt.m33272paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, ListItemKt.LeadingContentEndPadding, 0.0f, 11, (Object) null);
                            Alignment topStart = Alignment.Companion.getTopStart();
                            C13088o<Composer, Integer, C11921v> oVar = oVar;
                            int i3 = i3;
                            composer2.startReplaceableGroup(733328855);
                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(topStart, false, composer2, 6);
                            composer2.startReplaceableGroup(-1323940314);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                            C13074a<ComposeUiNode> constructor = companion.getConstructor();
                            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(r2);
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
                            Composer r13 = Updater.m35292constructorimpl(composer);
                            Updater.m35299setimpl(r13, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m35299setimpl(r13, density, companion.getSetDensity());
                            Updater.m35299setimpl(r13, layoutDirection, companion.getSetLayoutDirection());
                            Updater.m35299setimpl(r13, viewConfiguration, companion.getSetViewConfiguration());
                            composer.enableReusing();
                            materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-2137368960);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(781903379);
                            oVar.invoke(composer2, Integer.valueOf(i3 & 14));
                            composer.endReplaceableGroup();
                            composer.endReplaceableGroup();
                            composer.endReplaceableGroup();
                            composer.endNode();
                            composer.endReplaceableGroup();
                            composer.endReplaceableGroup();
                            composer.endReplaceableGroup();
                        } else {
                            composer2.startReplaceableGroup(377881084);
                            RowScope rowScope = rowScope;
                            Modifier.Companion companion2 = Modifier.Companion;
                            Alignment.Companion companion3 = Alignment.Companion;
                            Modifier r22 = PaddingKt.m33272paddingqDBjuR0$default(rowScope.align(companion2, companion3.getCenterVertically()), 0.0f, 0.0f, ListItemKt.LeadingContentEndPadding, 0.0f, 11, (Object) null);
                            C13088o<Composer, Integer, C11921v> oVar2 = oVar;
                            int i4 = i3;
                            composer2.startReplaceableGroup(733328855);
                            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(-1323940314);
                            Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                            C13074a<ComposeUiNode> constructor2 = companion4.getConstructor();
                            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf2 = LayoutKt.materializerOf(r22);
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
                            Composer r132 = Updater.m35292constructorimpl(composer);
                            Updater.m35299setimpl(r132, rememberBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
                            Updater.m35299setimpl(r132, density2, companion4.getSetDensity());
                            Updater.m35299setimpl(r132, layoutDirection2, companion4.getSetLayoutDirection());
                            Updater.m35299setimpl(r132, viewConfiguration2, companion4.getSetViewConfiguration());
                            composer.enableReusing();
                            materializerOf2.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-2137368960);
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(-1395522852);
                            oVar2.invoke(composer2, Integer.valueOf(i4 & 14));
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
            }), composer, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
