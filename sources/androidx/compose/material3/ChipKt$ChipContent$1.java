package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
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
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: Chip.kt */
final class ChipKt$ChipContent$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $avatar;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $label;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $leadingIcon;
    final /* synthetic */ long $leadingIconColor;
    final /* synthetic */ float $minHeight;
    final /* synthetic */ PaddingValues $paddingValues;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $trailingIcon;
    final /* synthetic */ long $trailingIconColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ChipKt$ChipContent$1(float f, PaddingValues paddingValues, C13088o<? super Composer, ? super Integer, C11921v> oVar, int i, C13088o<? super Composer, ? super Integer, C11921v> oVar2, long j, C13088o<? super Composer, ? super Integer, C11921v> oVar3, C13088o<? super Composer, ? super Integer, C11921v> oVar4, long j2) {
        super(2);
        this.$minHeight = f;
        this.$paddingValues = paddingValues;
        this.$avatar = oVar;
        this.$$dirty = i;
        this.$leadingIcon = oVar2;
        this.$leadingIconColor = j;
        this.$label = oVar3;
        this.$trailingIcon = oVar4;
        this.$trailingIconColor = j2;
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
                ComposerKt.traceEventStart(1748799148, i2, -1, "androidx.compose.material3.ChipContent.<anonymous> (Chip.kt:1417)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier padding = PaddingKt.padding(SizeKt.m33323defaultMinSizeVpY3zN4$default(companion, 0.0f, this.$minHeight, 1, (Object) null), this.$paddingValues);
            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            C13088o<Composer, Integer, C11921v> oVar = this.$avatar;
            int i3 = this.$$dirty;
            C13088o<Composer, Integer, C11921v> oVar2 = this.$leadingIcon;
            long j = this.$leadingIconColor;
            C13088o<Composer, Integer, C11921v> oVar3 = this.$label;
            C13088o<Composer, Integer, C11921v> oVar4 = this.$trailingIcon;
            long j2 = this.$trailingIconColor;
            composer2.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, 54);
            composer2.startReplaceableGroup(-1323940314);
            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            long j3 = j2;
            C13074a<ComposeUiNode> constructor = companion2.getConstructor();
            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(padding);
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
            Updater.m35299setimpl(r14, rowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m35299setimpl(r14, density, companion2.getSetDensity());
            Updater.m35299setimpl(r14, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m35299setimpl(r14, viewConfiguration, companion2.getSetViewConfiguration());
            composer.enableReusing();
            materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            composer2.startReplaceableGroup(-678309503);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer2.startReplaceableGroup(827638800);
            if (oVar != null) {
                composer2.startReplaceableGroup(650988385);
                oVar.invoke(composer2, Integer.valueOf((i3 >> 12) & 14));
                composer.endReplaceableGroup();
            } else if (oVar2 != null) {
                composer2.startReplaceableGroup(650988456);
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m35661boximpl(j))}, (C13088o<? super Composer, ? super Integer, C11921v>) oVar2, composer2, ((i3 >> 6) & 112) | 8);
                composer.endReplaceableGroup();
            } else {
                composer2.startReplaceableGroup(650988618);
                composer.endReplaceableGroup();
            }
            SpacerKt.Spacer(SizeKt.m33343width3ABfNKs(companion, ChipKt.HorizontalElementsPadding), composer2, 6);
            oVar3.invoke(composer2, Integer.valueOf(i3 & 14));
            SpacerKt.Spacer(SizeKt.m33343width3ABfNKs(companion, ChipKt.HorizontalElementsPadding), composer2, 6);
            if (oVar4 != null) {
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m35661boximpl(j3))}, (C13088o<? super Composer, ? super Integer, C11921v>) oVar4, composer2, ((i3 >> 12) & 112) | 8);
            }
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
