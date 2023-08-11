package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarKt$TopAppBar$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,547:1\n75#2,6:548\n81#2:580\n85#2:585\n75#2,6:586\n81#2:618\n85#2:623\n75#3:554\n76#3,11:556\n89#3:584\n75#3:592\n76#3,11:594\n89#3:622\n76#4:555\n76#4:593\n460#5,13:567\n473#5,3:581\n460#5,13:605\n473#5,3:619\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarKt$TopAppBar$1\n*L\n97#1:548,6\n97#1:580\n97#1:585\n105#1:586,6\n105#1:618\n105#1:623\n97#1:554\n97#1:556,11\n97#1:584\n105#1:592\n105#1:594,11\n105#1:622\n97#1:555\n105#1:593\n97#1:567,13\n97#1:581,3\n105#1:605,13\n105#1:619,3\n*E\n"})
/* compiled from: AppBar.kt */
final class AppBarKt$TopAppBar$1 extends C12777p implements C13089p<RowScope, Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C13089p<RowScope, Composer, Integer, C11921v> $actions;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $navigationIcon;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $title;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AppBarKt$TopAppBar$1(C13088o<? super Composer, ? super Integer, C11921v> oVar, int i, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13089p<? super RowScope, ? super Composer, ? super Integer, C11921v> pVar) {
        super(3);
        this.$navigationIcon = oVar;
        this.$$dirty = i;
        this.$title = oVar2;
        this.$actions = pVar;
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
        C12775o.m28639i(rowScope2, "$this$AppBar");
        if ((i3 & 14) == 0) {
            i2 = (composer2.changed((Object) rowScope2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i2 & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1484077694, i3, -1, "androidx.compose.material.TopAppBar.<anonymous> (AppBar.kt:92)");
            }
            if (this.$navigationIcon == null) {
                composer2.startReplaceableGroup(-512812651);
                SpacerKt.Spacer(AppBarKt.TitleInsetWithoutIcon, composer2, 6);
                composer.endReplaceableGroup();
            } else {
                composer2.startReplaceableGroup(-512812592);
                Modifier access$getTitleIconModifier$p = AppBarKt.TitleIconModifier;
                Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                C13088o<Composer, Integer, C11921v> oVar = this.$navigationIcon;
                int i4 = this.$$dirty;
                composer2.startReplaceableGroup(693286680);
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                composer2.startReplaceableGroup(-1323940314);
                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                C13074a<ComposeUiNode> constructor = companion.getConstructor();
                C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(access$getTitleIconModifier$p);
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
                Composer r10 = Updater.m35292constructorimpl(composer);
                Updater.m35299setimpl(r10, rowMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m35299setimpl(r10, density, companion.getSetDensity());
                Updater.m35299setimpl(r10, layoutDirection, companion.getSetLayoutDirection());
                Updater.m35299setimpl(r10, viewConfiguration, companion.getSetViewConfiguration());
                composer.enableReusing();
                materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 6)))}, (C13088o<? super Composer, ? super Integer, C11921v>) oVar, composer2, ((i4 >> 3) & 112) | 8);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            }
            Modifier weight$default = RowScope.weight$default(rowScope, SizeKt.fillMaxHeight$default(Modifier.Companion, 0.0f, 1, (Object) null), 1.0f, false, 2, (Object) null);
            Alignment.Vertical centerVertically2 = Alignment.Companion.getCenterVertically();
            C13088o<Composer, Integer, C11921v> oVar2 = this.$title;
            int i5 = this.$$dirty;
            composer2.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer2, 48);
            composer2.startReplaceableGroup(-1323940314);
            Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            C13074a<ComposeUiNode> constructor2 = companion2.getConstructor();
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
            Composer r11 = Updater.m35292constructorimpl(composer);
            Updater.m35299setimpl(r11, rowMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m35299setimpl(r11, density2, companion2.getSetDensity());
            Updater.m35299setimpl(r11, layoutDirection2, companion2.getSetLayoutDirection());
            Updater.m35299setimpl(r11, viewConfiguration2, companion2.getSetViewConfiguration());
            composer.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer2, 6).getH6(), ComposableLambdaKt.composableLambda(composer2, -2021518195, true, new AppBarKt$TopAppBar$1$2$1(oVar2, i5)), composer2, 48);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer2, 6)))};
            final C13089p<RowScope, Composer, Integer, C11921v> pVar = this.$actions;
            final int i6 = this.$$dirty;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, (C13088o<? super Composer, ? super Integer, C11921v>) ComposableLambdaKt.composableLambda(composer2, 1157662914, true, new C13088o<Composer, Integer, C11921v>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C11921v.f18618a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer, int i) {
                    if ((i & 11) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1157662914, i, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous> (AppBar.kt:116)");
                        }
                        Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.Companion, 0.0f, 1, (Object) null);
                        Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                        C13089p<RowScope, Composer, Integer, C11921v> pVar = pVar;
                        int i2 = (i6 & 7168) | 438;
                        composer.startReplaceableGroup(693286680);
                        int i3 = i2 >> 3;
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(end, centerVertically, composer, (i3 & 112) | (i3 & 14));
                        composer.startReplaceableGroup(-1323940314);
                        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                        C13074a<ComposeUiNode> constructor = companion.getConstructor();
                        C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(fillMaxHeight$default);
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
                        Composer r8 = Updater.m35292constructorimpl(composer);
                        Updater.m35299setimpl(r8, rowMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m35299setimpl(r8, density, companion.getSetDensity());
                        Updater.m35299setimpl(r8, layoutDirection, companion.getSetLayoutDirection());
                        Updater.m35299setimpl(r8, viewConfiguration, companion.getSetViewConfiguration());
                        composer.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer)), composer, Integer.valueOf((i4 >> 3) & 112));
                        composer.startReplaceableGroup(2058660585);
                        pVar.invoke(RowScopeInstance.INSTANCE, composer, Integer.valueOf(((i2 >> 6) & 112) | 6));
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
            }), composer2, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
