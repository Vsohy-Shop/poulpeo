package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: AppBar.kt */
final class AppBarKt$AppBar$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C13089p<RowScope, Composer, Integer, C11921v> $content;
    final /* synthetic */ PaddingValues $contentPadding;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AppBarKt$AppBar$1(PaddingValues paddingValues, C13089p<? super RowScope, ? super Composer, ? super Integer, C11921v> pVar, int i) {
        super(2);
        this.$contentPadding = paddingValues;
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
                ComposerKt.traceEventStart(-1027830352, i, -1, "androidx.compose.material.AppBar.<anonymous> (AppBar.kt:519)");
            }
            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer, 6)))};
            final PaddingValues paddingValues = this.$contentPadding;
            final C13089p<RowScope, Composer, Integer, C11921v> pVar = this.$content;
            final int i2 = this.$$dirty;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, (C13088o<? super Composer, ? super Integer, C11921v>) ComposableLambdaKt.composableLambda(composer, 1296061040, true, new C13088o<Composer, Integer, C11921v>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C11921v.f18618a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer, int i) {
                    if ((i & 11) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1296061040, i, -1, "androidx.compose.material.AppBar.<anonymous>.<anonymous> (AppBar.kt:520)");
                        }
                        Modifier r12 = SizeKt.m33324height3ABfNKs(PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), paddingValues), AppBarKt.AppBarHeight);
                        Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                        C13089p<RowScope, Composer, Integer, C11921v> pVar = pVar;
                        int i2 = ((i2 >> 9) & 7168) | 432;
                        composer.startReplaceableGroup(693286680);
                        int i3 = i2 >> 3;
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer, (i3 & 112) | (i3 & 14));
                        composer.startReplaceableGroup(-1323940314);
                        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                        C13074a<ComposeUiNode> constructor = companion.getConstructor();
                        C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(r12);
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
