package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.FabPrimaryTokens;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
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
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: FloatingActionButton.kt */
final class FloatingActionButtonKt$ExtendedFloatingActionButton$5 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $icon;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $text;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FloatingActionButtonKt$ExtendedFloatingActionButton$5(boolean z, C13088o<? super Composer, ? super Integer, C11921v> oVar, int i, C13088o<? super Composer, ? super Integer, C11921v> oVar2) {
        super(2);
        this.$expanded = z;
        this.$icon = oVar;
        this.$$dirty = i;
        this.$text = oVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i) {
        float f;
        float f2;
        float f3;
        Composer composer2 = composer;
        int i2 = i;
        if ((i2 & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1172118032, i2, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:355)");
            }
            if (this.$expanded) {
                f = FloatingActionButtonKt.ExtendedFabStartIconPadding;
            } else {
                f = C1232Dp.m38468constructorimpl((float) 0);
            }
            float f4 = f;
            if (this.$expanded) {
                f2 = FloatingActionButtonKt.ExtendedFabTextPadding;
            } else {
                f2 = C1232Dp.m38468constructorimpl((float) 0);
            }
            float f5 = f2;
            Modifier.Companion companion = Modifier.Companion;
            if (this.$expanded) {
                f3 = FloatingActionButtonKt.ExtendedFabMinimumWidth;
            } else {
                f3 = FabPrimaryTokens.INSTANCE.m34917getContainerWidthD9Ej5fM();
            }
            Modifier r1 = PaddingKt.m33272paddingqDBjuR0$default(SizeKt.m33342sizeInqDBjuR0$default(companion, f3, 0.0f, 0.0f, 0.0f, 14, (Object) null), f4, 0.0f, f5, 0.0f, 10, (Object) null);
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Arrangement.Horizontal start = this.$expanded ? Arrangement.INSTANCE.getStart() : Arrangement.INSTANCE.getCenter();
            C13088o<Composer, Integer, C11921v> oVar = this.$icon;
            int i3 = this.$$dirty;
            boolean z = this.$expanded;
            C13088o<Composer, Integer, C11921v> oVar2 = this.$text;
            composer2.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, 48);
            composer2.startReplaceableGroup(-1323940314);
            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            C13074a<ComposeUiNode> constructor = companion2.getConstructor();
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
            Composer r13 = Updater.m35292constructorimpl(composer);
            Updater.m35299setimpl(r13, rowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m35299setimpl(r13, density, companion2.getSetDensity());
            Updater.m35299setimpl(r13, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m35299setimpl(r13, viewConfiguration, companion2.getSetViewConfiguration());
            composer.enableReusing();
            materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            composer2.startReplaceableGroup(-678309503);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer2.startReplaceableGroup(1368928116);
            oVar.invoke(composer2, Integer.valueOf((i3 >> 3) & 14));
            AnimatedVisibilityKt.AnimatedVisibility((RowScope) rowScopeInstance, z, (Modifier) null, FloatingActionButtonKt.ExtendedFabExpandAnimation, FloatingActionButtonKt.ExtendedFabCollapseAnimation, (String) null, (C13089p<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, C11921v>) ComposableLambdaKt.composableLambda(composer2, 176242764, true, new FloatingActionButtonKt$ExtendedFloatingActionButton$5$1$1(oVar2, i3)), composer, 1600518 | ((i3 >> 9) & 112), 18);
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
