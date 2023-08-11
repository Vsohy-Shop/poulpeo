package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
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
import androidx.compose.p002ui.text.TextStyle;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: Chip.kt */
final class ChipKt$Chip$3 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ ChipColors $colors;
    final /* synthetic */ C13089p<RowScope, Composer, Integer, C11921v> $content;
    final /* synthetic */ State<Color> $contentColor$delegate;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $leadingIcon;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ChipKt$Chip$3(State<Color> state, C13088o<? super Composer, ? super Integer, C11921v> oVar, ChipColors chipColors, boolean z, int i, C13089p<? super RowScope, ? super Composer, ? super Integer, C11921v> pVar) {
        super(2);
        this.$contentColor$delegate = state;
        this.$leadingIcon = oVar;
        this.$colors = chipColors;
        this.$enabled = z;
        this.$$dirty = i;
        this.$content = pVar;
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
                ComposerKt.traceEventStart(139076687, i, -1, "androidx.compose.material.Chip.<anonymous> (Chip.kt:108)");
            }
            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m35673getAlphaimpl(ChipKt.Chip$lambda$1(this.$contentColor$delegate))))};
            final C13088o<Composer, Integer, C11921v> oVar = this.$leadingIcon;
            final ChipColors chipColors = this.$colors;
            final boolean z = this.$enabled;
            final int i2 = this.$$dirty;
            final C13089p<RowScope, Composer, Integer, C11921v> pVar = this.$content;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, (C13088o<? super Composer, ? super Integer, C11921v>) ComposableLambdaKt.composableLambda(composer, 667535631, true, new C13088o<Composer, Integer, C11921v>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C11921v.f18618a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer, int i) {
                    if ((i & 11) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(667535631, i, -1, "androidx.compose.material.Chip.<anonymous>.<anonymous> (Chip.kt:109)");
                        }
                        TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer, 6).getBody2();
                        final C13088o<Composer, Integer, C11921v> oVar = oVar;
                        final ChipColors chipColors = chipColors;
                        final boolean z = z;
                        final int i2 = i2;
                        final C13089p<RowScope, Composer, Integer, C11921v> pVar = pVar;
                        TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer, -1131213696, true, new C13088o<Composer, Integer, C11921v>() {
                            private static final long invoke$lambda$1$lambda$0(State<Color> state) {
                                return state.getValue().m35681unboximpl();
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return C11921v.f18618a;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(Composer composer, int i) {
                                float f;
                                Composer composer2 = composer;
                                int i2 = i;
                                if ((i2 & 11) != 2 || !composer.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1131213696, i2, -1, "androidx.compose.material.Chip.<anonymous>.<anonymous>.<anonymous> (Chip.kt:112)");
                                    }
                                    Modifier.Companion companion = Modifier.Companion;
                                    Modifier r8 = SizeKt.m33323defaultMinSizeVpY3zN4$default(companion, 0.0f, ChipDefaults.INSTANCE.m33938getMinHeightD9Ej5fM(), 1, (Object) null);
                                    if (oVar == null) {
                                        f = ChipKt.HorizontalPadding;
                                    } else {
                                        f = C1232Dp.m38468constructorimpl((float) 0);
                                    }
                                    Modifier r3 = PaddingKt.m33272paddingqDBjuR0$default(r8, f, 0.0f, ChipKt.HorizontalPadding, 0.0f, 10, (Object) null);
                                    Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                    Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                                    C13088o<Composer, Integer, C11921v> oVar = oVar;
                                    ChipColors chipColors = chipColors;
                                    boolean z = z;
                                    int i3 = i2;
                                    C13089p<RowScope, Composer, Integer, C11921v> pVar = pVar;
                                    composer2.startReplaceableGroup(693286680);
                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, 54);
                                    composer2.startReplaceableGroup(-1323940314);
                                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                                    C13074a<ComposeUiNode> constructor = companion2.getConstructor();
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
                                    Composer r4 = Updater.m35292constructorimpl(composer);
                                    Updater.m35299setimpl(r4, rowMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m35299setimpl(r4, density, companion2.getSetDensity());
                                    Updater.m35299setimpl(r4, layoutDirection, companion2.getSetLayoutDirection());
                                    Updater.m35299setimpl(r4, viewConfiguration, companion2.getSetViewConfiguration());
                                    composer.enableReusing();
                                    materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    composer2.startReplaceableGroup(2084788907);
                                    if (oVar != null) {
                                        SpacerKt.Spacer(SizeKt.m33343width3ABfNKs(companion, ChipKt.LeadingIconStartSpacing), composer2, 6);
                                        State<Color> leadingIconContentColor = chipColors.leadingIconContentColor(z, composer2, ((i3 >> 6) & 14) | ((i3 >> 15) & 112));
                                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m35661boximpl(invoke$lambda$1$lambda$0(leadingIconContentColor))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m35673getAlphaimpl(invoke$lambda$1$lambda$0(leadingIconContentColor))))}, (C13088o<? super Composer, ? super Integer, C11921v>) oVar, composer2, ((i3 >> 18) & 112) | 8);
                                        SpacerKt.Spacer(SizeKt.m33343width3ABfNKs(companion, ChipKt.LeadingIconEndSpacing), composer2, 6);
                                    }
                                    composer.endReplaceableGroup();
                                    pVar.invoke(rowScopeInstance, composer2, Integer.valueOf(((i3 >> 21) & 112) | 6));
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
