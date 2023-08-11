package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.draw.ClipKt;
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
final class ChipKt$FilterChip$3 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ SelectableChipColors $colors;
    final /* synthetic */ C13089p<RowScope, Composer, Integer, C11921v> $content;
    final /* synthetic */ State<Color> $contentColor;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $leadingIcon;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $selectedIcon;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $trailingIcon;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ChipKt$FilterChip$3(State<Color> state, C13088o<? super Composer, ? super Integer, C11921v> oVar, boolean z, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar3, C13089p<? super RowScope, ? super Composer, ? super Integer, C11921v> pVar, int i, SelectableChipColors selectableChipColors, boolean z2, int i2) {
        super(2);
        this.$contentColor = state;
        this.$leadingIcon = oVar;
        this.$selected = z;
        this.$selectedIcon = oVar2;
        this.$trailingIcon = oVar3;
        this.$content = pVar;
        this.$$dirty1 = i;
        this.$colors = selectableChipColors;
        this.$enabled = z2;
        this.$$dirty = i2;
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
                ComposerKt.traceEventStart(722126431, i2, -1, "androidx.compose.material.FilterChip.<anonymous> (Chip.kt:209)");
            }
            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m35673getAlphaimpl(this.$contentColor.getValue().m35681unboximpl())))};
            final C13088o<Composer, Integer, C11921v> oVar = this.$leadingIcon;
            final boolean z = this.$selected;
            final C13088o<Composer, Integer, C11921v> oVar2 = this.$selectedIcon;
            final C13088o<Composer, Integer, C11921v> oVar3 = this.$trailingIcon;
            final C13089p<RowScope, Composer, Integer, C11921v> pVar = this.$content;
            final int i3 = this.$$dirty1;
            final SelectableChipColors selectableChipColors = this.$colors;
            final boolean z2 = this.$enabled;
            final int i4 = this.$$dirty;
            final State<Color> state = this.$contentColor;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, (C13088o<? super Composer, ? super Integer, C11921v>) ComposableLambdaKt.composableLambda(composer2, 1582291359, true, new C13088o<Composer, Integer, C11921v>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C11921v.f18618a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer, int i) {
                    if ((i & 11) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1582291359, i, -1, "androidx.compose.material.FilterChip.<anonymous>.<anonymous> (Chip.kt:210)");
                        }
                        TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer, 6).getBody2();
                        final C13088o<Composer, Integer, C11921v> oVar = oVar;
                        final boolean z = z;
                        final C13088o<Composer, Integer, C11921v> oVar2 = oVar2;
                        final C13088o<Composer, Integer, C11921v> oVar3 = oVar3;
                        final C13089p<RowScope, Composer, Integer, C11921v> pVar = pVar;
                        final int i2 = i3;
                        final SelectableChipColors selectableChipColors = selectableChipColors;
                        final boolean z2 = z2;
                        final int i3 = i4;
                        final State<Color> state = state;
                        TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer, -1543702066, true, new C13088o<Composer, Integer, C11921v>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return C11921v.f18618a;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(Composer composer, int i) {
                                float f;
                                float f2;
                                RowScopeInstance rowScopeInstance;
                                int i2;
                                Modifier modifier;
                                Composer composer2 = composer;
                                int i3 = i;
                                if ((i3 & 11) != 2 || !composer.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1543702066, i3, -1, "androidx.compose.material.FilterChip.<anonymous>.<anonymous>.<anonymous> (Chip.kt:213)");
                                    }
                                    Modifier.Companion companion = Modifier.Companion;
                                    Modifier r8 = SizeKt.m33323defaultMinSizeVpY3zN4$default(companion, 0.0f, ChipDefaults.INSTANCE.m33938getMinHeightD9Ej5fM(), 1, (Object) null);
                                    if (oVar != null || (z && oVar2 != null)) {
                                        f = C1232Dp.m38468constructorimpl((float) 0);
                                    } else {
                                        f = ChipKt.HorizontalPadding;
                                    }
                                    float f3 = f;
                                    if (oVar3 == null) {
                                        f2 = ChipKt.HorizontalPadding;
                                    } else {
                                        f2 = C1232Dp.m38468constructorimpl((float) 0);
                                    }
                                    Modifier r3 = PaddingKt.m33272paddingqDBjuR0$default(r8, f3, 0.0f, f2, 0.0f, 10, (Object) null);
                                    Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                    Alignment.Companion companion2 = Alignment.Companion;
                                    Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                    C13088o<Composer, Integer, C11921v> oVar = oVar;
                                    boolean z = z;
                                    C13088o<Composer, Integer, C11921v> oVar2 = oVar2;
                                    C13089p<RowScope, Composer, Integer, C11921v> pVar = pVar;
                                    int i4 = i2;
                                    C13088o<Composer, Integer, C11921v> oVar3 = oVar3;
                                    SelectableChipColors selectableChipColors = selectableChipColors;
                                    boolean z2 = z2;
                                    int i5 = i3;
                                    C13088o<Composer, Integer, C11921v> oVar4 = oVar3;
                                    State<Color> state = state;
                                    composer2.startReplaceableGroup(693286680);
                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, 54);
                                    composer2.startReplaceableGroup(-1323940314);
                                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    C13089p<RowScope, Composer, Integer, C11921v> pVar2 = pVar;
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                                    int i6 = i4;
                                    C13074a<ComposeUiNode> constructor = companion3.getConstructor();
                                    C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(r3);
                                    State<Color> state2 = state;
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
                                    Composer r14 = Updater.m35292constructorimpl(composer);
                                    Updater.m35299setimpl(r14, rowMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m35299setimpl(r14, density, companion3.getSetDensity());
                                    Updater.m35299setimpl(r14, layoutDirection, companion3.getSetLayoutDirection());
                                    Updater.m35299setimpl(r14, viewConfiguration, companion3.getSetViewConfiguration());
                                    composer.enableReusing();
                                    materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                    composer2.startReplaceableGroup(-1943412077);
                                    if (oVar != null || (z && oVar2 != null)) {
                                        SpacerKt.Spacer(SizeKt.m33343width3ABfNKs(companion, ChipKt.LeadingIconStartSpacing), composer2, 6);
                                        composer2.startReplaceableGroup(733328855);
                                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
                                        composer2.startReplaceableGroup(-1323940314);
                                        Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                        LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                        ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                        C13074a<ComposeUiNode> constructor2 = companion3.getConstructor();
                                        C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf2 = LayoutKt.materializerOf(companion);
                                        rowScopeInstance = rowScopeInstance2;
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
                                        Composer r32 = Updater.m35292constructorimpl(composer);
                                        Updater.m35299setimpl(r32, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                        Updater.m35299setimpl(r32, density2, companion3.getSetDensity());
                                        Updater.m35299setimpl(r32, layoutDirection2, companion3.getSetLayoutDirection());
                                        Updater.m35299setimpl(r32, viewConfiguration2, companion3.getSetViewConfiguration());
                                        composer.enableReusing();
                                        materializerOf2.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer)), composer2, 0);
                                        composer2.startReplaceableGroup(2058660585);
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        composer2.startReplaceableGroup(649985655);
                                        if (oVar != null) {
                                            State<Color> leadingIconColor = selectableChipColors.leadingIconColor(z2, z, composer2, ((i5 >> 9) & 14) | ((i5 << 3) & 112) | ((i5 >> 15) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH));
                                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(leadingIconColor.getValue()), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m35673getAlphaimpl(leadingIconColor.getValue().m35681unboximpl())))}, (C13088o<? super Composer, ? super Integer, C11921v>) oVar, composer2, ((i5 >> 21) & 112) | 8);
                                        }
                                        composer.endReplaceableGroup();
                                        composer2.startReplaceableGroup(-1943411263);
                                        if (z && oVar2 != null) {
                                            long r13 = state2.getValue().m35681unboximpl();
                                            composer2.startReplaceableGroup(649986486);
                                            if (oVar != null) {
                                                modifier = ClipKt.clip(BackgroundKt.m32956backgroundbw27NRU(SizeKt.m33330requiredSize3ABfNKs(companion, ChipKt.SelectedIconContainerSize), state2.getValue().m35681unboximpl(), RoundedCornerShapeKt.getCircleShape()), RoundedCornerShapeKt.getCircleShape());
                                                r13 = selectableChipColors.backgroundColor(z2, z, composer2, ((i5 >> 9) & 14) | ((i5 << 3) & 112) | ((i5 >> 15) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH)).getValue().m35681unboximpl();
                                            } else {
                                                modifier = companion;
                                            }
                                            composer.endReplaceableGroup();
                                            Alignment center = companion2.getCenter();
                                            composer2.startReplaceableGroup(733328855);
                                            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                                            composer2.startReplaceableGroup(-1323940314);
                                            Density density3 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                            LayoutDirection layoutDirection3 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                            ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                            C13074a<ComposeUiNode> constructor3 = companion3.getConstructor();
                                            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf3 = LayoutKt.materializerOf(modifier);
                                            if (!(composer.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer.startReusableNode();
                                            if (composer.getInserting()) {
                                                composer2.createNode(constructor3);
                                            } else {
                                                composer.useNode();
                                            }
                                            composer.disableReusing();
                                            Composer r82 = Updater.m35292constructorimpl(composer);
                                            Updater.m35299setimpl(r82, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                                            Updater.m35299setimpl(r82, density3, companion3.getSetDensity());
                                            Updater.m35299setimpl(r82, layoutDirection3, companion3.getSetLayoutDirection());
                                            Updater.m35299setimpl(r82, viewConfiguration3, companion3.getSetViewConfiguration());
                                            composer.enableReusing();
                                            materializerOf3.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer)), composer2, 0);
                                            composer2.startReplaceableGroup(2058660585);
                                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m35661boximpl(r13))}, (C13088o<? super Composer, ? super Integer, C11921v>) oVar2, composer2, ((i5 >> 24) & 112) | 8);
                                            composer.endReplaceableGroup();
                                            composer.endNode();
                                            composer.endReplaceableGroup();
                                            composer.endReplaceableGroup();
                                        }
                                        composer.endReplaceableGroup();
                                        composer.endReplaceableGroup();
                                        composer.endNode();
                                        composer.endReplaceableGroup();
                                        composer.endReplaceableGroup();
                                        i2 = 6;
                                        SpacerKt.Spacer(SizeKt.m33343width3ABfNKs(companion, ChipKt.LeadingIconEndSpacing), composer2, 6);
                                    } else {
                                        rowScopeInstance = rowScopeInstance2;
                                        i2 = 6;
                                    }
                                    composer.endReplaceableGroup();
                                    pVar2.invoke(rowScopeInstance, composer2, Integer.valueOf((i6 & 112) | i2));
                                    composer2.startReplaceableGroup(-1181292859);
                                    if (oVar4 != null) {
                                        SpacerKt.Spacer(SizeKt.m33343width3ABfNKs(companion, ChipKt.TrailingIconSpacing), composer2, i2);
                                        oVar4.invoke(composer2, Integer.valueOf(i6 & 14));
                                        SpacerKt.Spacer(SizeKt.m33343width3ABfNKs(companion, ChipKt.TrailingIconSpacing), composer2, i2);
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
