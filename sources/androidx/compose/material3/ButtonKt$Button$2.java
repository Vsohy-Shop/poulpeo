package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.layout.LayoutKt;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.node.ComposeUiNode;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.compose.p002ui.text.TextStyle;
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

/* compiled from: Button.kt */
final class ButtonKt$Button$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C13089p<RowScope, Composer, Integer, C11921v> $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ PaddingValues $contentPadding;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ButtonKt$Button$2(long j, PaddingValues paddingValues, C13089p<? super RowScope, ? super Composer, ? super Integer, C11921v> pVar, int i) {
        super(2);
        this.$contentColor = j;
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
                ComposerKt.traceEventStart(956488494, i, -1, "androidx.compose.material3.Button.<anonymous> (Button.kt:143)");
            }
            ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m35661boximpl(this.$contentColor))};
            final PaddingValues paddingValues = this.$contentPadding;
            final C13089p<RowScope, Composer, Integer, C11921v> pVar = this.$content;
            final int i2 = this.$$dirty;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, (C13088o<? super Composer, ? super Integer, C11921v>) ComposableLambdaKt.composableLambda(composer, 1582292974, true, new C13088o<Composer, Integer, C11921v>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C11921v.f18618a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer, int i) {
                    if ((i & 11) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1582292974, i, -1, "androidx.compose.material3.Button.<anonymous>.<anonymous> (Button.kt:144)");
                        }
                        TextStyle labelLarge = MaterialTheme.INSTANCE.getTypography(composer, 6).getLabelLarge();
                        final PaddingValues paddingValues = paddingValues;
                        final C13089p<RowScope, Composer, Integer, C11921v> pVar = pVar;
                        final int i2 = i2;
                        TextKt.ProvideTextStyle(labelLarge, ComposableLambdaKt.composableLambda(composer, -2136309793, true, new C13088o<Composer, Integer, C11921v>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return C11921v.f18618a;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(Composer composer, int i) {
                                if ((i & 11) != 2 || !composer.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2136309793, i, -1, "androidx.compose.material3.Button.<anonymous>.<anonymous>.<anonymous> (Button.kt:145)");
                                    }
                                    Modifier.Companion companion = Modifier.Companion;
                                    ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                                    Modifier padding = PaddingKt.padding(SizeKt.m33322defaultMinSizeVpY3zN4(companion, buttonDefaults.m34276getMinWidthD9Ej5fM(), buttonDefaults.m34275getMinHeightD9Ej5fM()), paddingValues);
                                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                    Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                                    C13089p<RowScope, Composer, Integer, C11921v> pVar = pVar;
                                    int i2 = ((i2 >> 18) & 7168) | 432;
                                    composer.startReplaceableGroup(693286680);
                                    int i3 = i2 >> 3;
                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer, (i3 & 112) | (i3 & 14));
                                    composer.startReplaceableGroup(-1323940314);
                                    Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                                    C13074a<ComposeUiNode> constructor = companion2.getConstructor();
                                    C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(padding);
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
                                    Updater.m35299setimpl(r9, rowMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m35299setimpl(r9, density, companion2.getSetDensity());
                                    Updater.m35299setimpl(r9, layoutDirection, companion2.getSetLayoutDirection());
                                    Updater.m35299setimpl(r9, viewConfiguration, companion2.getSetViewConfiguration());
                                    composer.enableReusing();
                                    materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer)), composer, Integer.valueOf((i4 >> 3) & 112));
                                    composer.startReplaceableGroup(2058660585);
                                    composer.startReplaceableGroup(-678309503);
                                    if (((i4 >> 9) & 14 & 11) != 2 || !composer.getSkipping()) {
                                        pVar.invoke(RowScopeInstance.INSTANCE, composer, Integer.valueOf(((i2 >> 6) & 112) | 6));
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
                        }), composer, 48);
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
