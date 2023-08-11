package androidx.compose.material.pullrefresh;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ProgressIndicatorKt;
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

/* compiled from: PullRefreshIndicator.kt */
final class PullRefreshIndicatorKt$PullRefreshIndicator$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ boolean $refreshing;
    final /* synthetic */ PullRefreshState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PullRefreshIndicatorKt$PullRefreshIndicator$1(boolean z, int i, long j, PullRefreshState pullRefreshState) {
        super(2);
        this.$refreshing = z;
        this.$$dirty = i;
        this.$contentColor = j;
        this.$state = pullRefreshState;
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
                ComposerKt.traceEventStart(-194757728, i, -1, "androidx.compose.material.pullrefresh.PullRefreshIndicator.<anonymous> (PullRefreshIndicator.kt:91)");
            }
            Boolean valueOf = Boolean.valueOf(this.$refreshing);
            TweenSpec tween$default = AnimationSpecKt.tween$default(100, 0, (Easing) null, 6, (Object) null);
            final long j = this.$contentColor;
            final int i2 = this.$$dirty;
            final PullRefreshState pullRefreshState = this.$state;
            CrossfadeKt.Crossfade(valueOf, (Modifier) null, tween$default, ComposableLambdaKt.composableLambda(composer, -2067838016, true, new C13089p<Boolean, Composer, Integer, C11921v>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke(((Boolean) obj).booleanValue(), (Composer) obj2, ((Number) obj3).intValue());
                    return C11921v.f18618a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(boolean z, Composer composer, int i) {
                    int i2;
                    boolean z2 = z;
                    Composer composer2 = composer;
                    int i3 = i;
                    if ((i3 & 14) == 0) {
                        i2 = (composer2.changed(z2) ? 4 : 2) | i3;
                    } else {
                        i2 = i3;
                    }
                    if ((i2 & 91) != 18 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2067838016, i3, -1, "androidx.compose.material.pullrefresh.PullRefreshIndicator.<anonymous>.<anonymous> (PullRefreshIndicator.kt:95)");
                        }
                        Modifier.Companion companion = Modifier.Companion;
                        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, (Object) null);
                        Alignment center = Alignment.Companion.getCenter();
                        long j = j;
                        int i4 = i2;
                        PullRefreshState pullRefreshState = pullRefreshState;
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                        composer2.startReplaceableGroup(-1323940314);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                        C13074a<ComposeUiNode> constructor = companion2.getConstructor();
                        C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(fillMaxSize$default);
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
                        Composer r4 = Updater.m35292constructorimpl(composer);
                        Updater.m35299setimpl(r4, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m35299setimpl(r4, density, companion2.getSetDensity());
                        Updater.m35299setimpl(r4, layoutDirection, companion2.getSetLayoutDirection());
                        Updater.m35299setimpl(r4, viewConfiguration, companion2.getSetViewConfiguration());
                        composer.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        float r3 = C1232Dp.m38468constructorimpl(C1232Dp.m38468constructorimpl(PullRefreshIndicatorKt.ArcRadius + PullRefreshIndicatorKt.StrokeWidth) * ((float) 2));
                        if (z2) {
                            composer2.startReplaceableGroup(-2035147561);
                            ProgressIndicatorKt.m34077CircularProgressIndicatorLxG7B9w(SizeKt.m33338size3ABfNKs(companion, r3), j, PullRefreshIndicatorKt.StrokeWidth, 0, 0, composer, ((i4 >> 9) & 112) | 390, 24);
                            composer.endReplaceableGroup();
                        } else {
                            composer2.startReplaceableGroup(-2035147307);
                            PullRefreshIndicatorKt.m34215CircularArrowIndicatoriJQMabo(pullRefreshState, j, SizeKt.m33338size3ABfNKs(companion, r3), composer, ((i4 >> 9) & 112) | 392);
                            composer.endReplaceableGroup();
                        }
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
            }), composer, (this.$$dirty & 14) | 3456, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
