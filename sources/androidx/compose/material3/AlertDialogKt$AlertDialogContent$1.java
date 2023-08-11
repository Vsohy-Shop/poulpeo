package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
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
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: AlertDialog.kt */
final class AlertDialogKt$AlertDialogContent$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ long $buttonContentColor;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $buttons;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $icon;
    final /* synthetic */ long $iconContentColor;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $text;
    final /* synthetic */ long $textContentColor;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $title;
    final /* synthetic */ long $titleContentColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AlertDialogKt$AlertDialogContent$1(C13088o<? super Composer, ? super Integer, C11921v> oVar, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar3, long j, int i, long j2, long j3, long j4, C13088o<? super Composer, ? super Integer, C11921v> oVar4) {
        super(2);
        this.$icon = oVar;
        this.$title = oVar2;
        this.$text = oVar3;
        this.$iconContentColor = j;
        this.$$dirty = i;
        this.$titleContentColor = j2;
        this.$textContentColor = j3;
        this.$buttonContentColor = j4;
        this.$buttons = oVar4;
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
                ComposerKt.traceEventStart(-2126308228, i2, -1, "androidx.compose.material3.AlertDialogContent.<anonymous> (AlertDialog.kt:57)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier padding = PaddingKt.padding(SizeKt.m33342sizeInqDBjuR0$default(companion, AlertDialogKt.MinWidth, 0.0f, AlertDialogKt.MaxWidth, 0.0f, 10, (Object) null), AlertDialogKt.DialogPadding);
            C13088o<Composer, Integer, C11921v> oVar = this.$icon;
            C13088o<Composer, Integer, C11921v> oVar2 = this.$title;
            C13088o<Composer, Integer, C11921v> oVar3 = this.$text;
            long j = this.$iconContentColor;
            int i3 = this.$$dirty;
            long j2 = this.$titleContentColor;
            long j3 = this.$textContentColor;
            long j4 = this.$buttonContentColor;
            C13088o<Composer, Integer, C11921v> oVar4 = this.$buttons;
            composer2.startReplaceableGroup(-483455358);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            C13088o<Composer, Integer, C11921v> oVar5 = oVar4;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer2, 0);
            composer2.startReplaceableGroup(-1323940314);
            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            Modifier.Companion companion3 = companion;
            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            long j5 = j3;
            C13074a<ComposeUiNode> constructor = companion4.getConstructor();
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
            Composer r12 = Updater.m35292constructorimpl(composer);
            Updater.m35299setimpl(r12, columnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m35299setimpl(r12, density, companion4.getSetDensity());
            Updater.m35299setimpl(r12, layoutDirection, companion4.getSetLayoutDirection());
            Updater.m35299setimpl(r12, viewConfiguration, companion4.getSetViewConfiguration());
            composer.enableReusing();
            materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            composer2.startReplaceableGroup(-1163856341);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composer2.startReplaceableGroup(-1370717838);
            composer2.startReplaceableGroup(76440864);
            if (oVar != null) {
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m35661boximpl(j))}, (C13088o<? super Composer, ? super Integer, C11921v>) ComposableLambdaKt.composableLambda(composer2, 934657765, true, new AlertDialogKt$AlertDialogContent$1$1$1$1(columnScopeInstance, oVar, i3)), composer2, 56);
                C11921v vVar = C11921v.f18618a;
            }
            composer.endReplaceableGroup();
            composer2.startReplaceableGroup(76441259);
            if (oVar2 != null) {
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m35661boximpl(j2))}, (C13088o<? super Composer, ? super Integer, C11921v>) ComposableLambdaKt.composableLambda(composer2, 1845262876, true, new AlertDialogKt$AlertDialogContent$1$1$2$1(columnScopeInstance, oVar, oVar2, i3)), composer2, 56);
                C11921v vVar2 = C11921v.f18618a;
            }
            composer.endReplaceableGroup();
            composer2.startReplaceableGroup(76442209);
            if (oVar3 != null) {
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m35661boximpl(j5))}, (C13088o<? super Composer, ? super Integer, C11921v>) ComposableLambdaKt.composableLambda(composer2, 613970333, true, new AlertDialogKt$AlertDialogContent$1$1$3$1(columnScopeInstance, oVar3, i3)), composer2, 56);
                C11921v vVar3 = C11921v.f18618a;
            }
            composer.endReplaceableGroup();
            Modifier align = columnScopeInstance.align(companion3, companion2.getEnd());
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
            composer2.startReplaceableGroup(-1323940314);
            Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            C13074a<ComposeUiNode> constructor2 = companion4.getConstructor();
            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf2 = LayoutKt.materializerOf(align);
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
            Composer r8 = Updater.m35292constructorimpl(composer);
            Updater.m35299setimpl(r8, rememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m35299setimpl(r8, density2, companion4.getSetDensity());
            Updater.m35299setimpl(r8, layoutDirection2, companion4.getSetLayoutDirection());
            Updater.m35299setimpl(r8, viewConfiguration2, companion4.getSetViewConfiguration());
            composer.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            composer2.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2.startReplaceableGroup(1902704376);
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m35661boximpl(j4))}, (C13088o<? super Composer, ? super Integer, C11921v>) ComposableLambdaKt.composableLambda(composer2, -433542216, true, new AlertDialogKt$AlertDialogContent$1$1$4$1(oVar5, i3)), composer2, 56);
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
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
