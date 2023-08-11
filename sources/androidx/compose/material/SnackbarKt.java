package androidx.compose.material;

import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.layout.LayoutIdKt;
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
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material/SnackbarKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,364:1\n154#2:365\n154#2:366\n154#2:367\n154#2:655\n154#2:656\n154#2:657\n154#2:658\n154#2:659\n154#2:660\n154#2:661\n154#2:662\n154#2:663\n71#3,4:368\n75#3,11:373\n75#3:401\n76#3,11:403\n89#3:431\n88#3:436\n75#3:443\n76#3,11:445\n75#3:476\n76#3,11:478\n89#3:506\n75#3:514\n76#3,11:516\n89#3:544\n89#3:549\n74#3:551\n75#3,11:553\n75#3:581\n76#3,11:583\n89#3:611\n75#3:619\n76#3,11:621\n89#3:649\n88#3:654\n76#4:372\n76#4:402\n76#4:444\n76#4:477\n76#4:515\n76#4:552\n76#4:582\n76#4:620\n456#5,11:384\n460#5,13:414\n473#5,3:428\n467#5,3:433\n460#5,13:456\n460#5,13:489\n473#5,3:503\n460#5,13:527\n473#5,3:541\n473#5,3:546\n456#5,11:564\n460#5,13:594\n473#5,3:608\n460#5,13:632\n473#5,3:646\n467#5,3:651\n67#6,6:395\n73#6:427\n77#6:432\n67#6,6:470\n73#6:502\n77#6:507\n67#6,6:508\n73#6:540\n77#6:545\n67#6,6:575\n73#6:607\n77#6:612\n67#6,6:613\n73#6:645\n77#6:650\n74#7,6:437\n80#7:469\n84#7:550\n*S KotlinDebug\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material/SnackbarKt\n*L\n88#1:365\n160#1:366\n175#1:367\n355#1:655\n356#1:656\n357#1:657\n358#1:658\n359#1:659\n360#1:660\n361#1:661\n362#1:662\n363#1:663\n237#1:368,4\n237#1:373,11\n238#1:401\n238#1:403,11\n238#1:431\n237#1:436\n275#1:443\n275#1:445,11\n283#1:476\n283#1:478,11\n283#1:506\n287#1:514\n287#1:516,11\n287#1:544\n275#1:549\n298#1:551\n298#1:553,11\n300#1:581\n300#1:583,11\n300#1:611\n301#1:619\n301#1:621,11\n301#1:649\n298#1:654\n237#1:372\n238#1:402\n275#1:444\n283#1:477\n287#1:515\n298#1:552\n300#1:582\n301#1:620\n237#1:384,11\n238#1:414,13\n238#1:428,3\n237#1:433,3\n275#1:456,13\n283#1:489,13\n283#1:503,3\n287#1:527,13\n287#1:541,3\n275#1:546,3\n298#1:564,11\n300#1:594,13\n300#1:608,3\n301#1:632,13\n301#1:646,3\n298#1:651,3\n238#1:395,6\n238#1:427\n238#1:432\n283#1:470,6\n283#1:502\n283#1:507\n287#1:508,6\n287#1:540\n287#1:545\n300#1:575,6\n300#1:607\n300#1:612\n301#1:613,6\n301#1:645\n301#1:650\n275#1:437,6\n275#1:469\n275#1:550\n*E\n"})
/* compiled from: Snackbar.kt */
public final class SnackbarKt {
    /* access modifiers changed from: private */
    public static final float HeightToFirstLine = C1232Dp.m38468constructorimpl((float) 30);
    private static final float HorizontalSpacing = C1232Dp.m38468constructorimpl((float) 16);
    private static final float HorizontalSpacingButtonSide;
    private static final float LongButtonVerticalOffset = C1232Dp.m38468constructorimpl((float) 12);
    private static final float SeparateButtonExtraY = C1232Dp.m38468constructorimpl((float) 2);
    /* access modifiers changed from: private */
    public static final float SnackbarMinHeightOneLine = C1232Dp.m38468constructorimpl((float) 48);
    /* access modifiers changed from: private */
    public static final float SnackbarMinHeightTwoLines = C1232Dp.m38468constructorimpl((float) 68);
    private static final float SnackbarVerticalPadding = C1232Dp.m38468constructorimpl((float) 6);
    /* access modifiers changed from: private */
    public static final float TextEndExtraSpacing;

    static {
        float f = (float) 8;
        HorizontalSpacingButtonSide = C1232Dp.m38468constructorimpl(f);
        TextEndExtraSpacing = C1232Dp.m38468constructorimpl(f);
    }

    /* access modifiers changed from: private */
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Composable
    public static final void NewLineButtonSnackbar(C13088o<? super Composer, ? super Integer, C11921v> oVar, C13088o<? super Composer, ? super Integer, C11921v> oVar2, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        C13088o<? super Composer, ? super Integer, C11921v> oVar3 = oVar;
        C13088o<? super Composer, ? super Integer, C11921v> oVar4 = oVar2;
        int i5 = i;
        Composer startRestartGroup = composer.startRestartGroup(-1229075900);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changedInstance(oVar3)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i5;
        } else {
            i2 = i5;
        }
        if ((i5 & 112) == 0) {
            if (startRestartGroup.changedInstance(oVar4)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1229075900, i2, -1, "androidx.compose.material.NewLineButtonSnackbar (Snackbar.kt:270)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, (Object) null);
            float f = HorizontalSpacing;
            float f2 = HorizontalSpacingButtonSide;
            Modifier r7 = PaddingKt.m33272paddingqDBjuR0$default(fillMaxWidth$default, f, 0.0f, f2, SeparateButtonExtraY, 2, (Object) null);
            startRestartGroup.startReplaceableGroup(-483455358);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            C13074a<ComposeUiNode> constructor = companion3.getConstructor();
            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(r7);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer r10 = Updater.m35292constructorimpl(startRestartGroup);
            Updater.m35299setimpl(r10, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m35299setimpl(r10, density, companion3.getSetDensity());
            Updater.m35299setimpl(r10, layoutDirection, companion3.getSetLayoutDirection());
            Updater.m35299setimpl(r10, viewConfiguration, companion3.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier r6 = PaddingKt.m33272paddingqDBjuR0$default(AlignmentLineKt.m33165paddingFromBaselineVpY3zN4(companion, HeightToFirstLine, LongButtonVerticalOffset), 0.0f, 0.0f, f2, 0.0f, 11, (Object) null);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            C13074a<ComposeUiNode> constructor2 = companion3.getConstructor();
            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf2 = LayoutKt.materializerOf(r6);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer r72 = Updater.m35292constructorimpl(startRestartGroup);
            Updater.m35299setimpl(r72, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m35299setimpl(r72, density2, companion3.getSetDensity());
            Updater.m35299setimpl(r72, layoutDirection2, companion3.getSetLayoutDirection());
            Updater.m35299setimpl(r72, viewConfiguration2, companion3.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            oVar3.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            Modifier align = columnScopeInstance.align(companion, companion2.getEnd());
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density3 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            C13074a<ComposeUiNode> constructor3 = companion3.getConstructor();
            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf3 = LayoutKt.materializerOf(align);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer r102 = Updater.m35292constructorimpl(startRestartGroup);
            Updater.m35299setimpl(r102, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m35299setimpl(r102, density3, companion3.getSetDensity());
            Updater.m35299setimpl(r102, layoutDirection3, companion3.getSetLayoutDirection());
            Updater.m35299setimpl(r102, viewConfiguration3, companion3.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf3.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            oVar4.invoke(startRestartGroup, Integer.valueOf((i2 >> 3) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SnackbarKt$NewLineButtonSnackbar$2(oVar3, oVar4, i5));
        }
    }

    /* access modifiers changed from: private */
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Composable
    public static final void OneRowSnackbar(C13088o<? super Composer, ? super Integer, C11921v> oVar, C13088o<? super Composer, ? super Integer, C11921v> oVar2, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        C13088o<? super Composer, ? super Integer, C11921v> oVar3 = oVar;
        C13088o<? super Composer, ? super Integer, C11921v> oVar4 = oVar2;
        int i5 = i;
        Composer startRestartGroup = composer.startRestartGroup(-534813202);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changedInstance(oVar3)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i5;
        } else {
            i2 = i5;
        }
        if ((i5 & 112) == 0) {
            if (startRestartGroup.changedInstance(oVar4)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-534813202, i2, -1, "androidx.compose.material.OneRowSnackbar (Snackbar.kt:291)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier r6 = PaddingKt.m33272paddingqDBjuR0$default(companion, HorizontalSpacing, 0.0f, HorizontalSpacingButtonSide, 0.0f, 10, (Object) null);
            SnackbarKt$OneRowSnackbar$2 snackbarKt$OneRowSnackbar$2 = new SnackbarKt$OneRowSnackbar$2("action", "text");
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            C13074a<ComposeUiNode> constructor = companion2.getConstructor();
            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(r6);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer r10 = Updater.m35292constructorimpl(startRestartGroup);
            Updater.m35299setimpl(r10, snackbarKt$OneRowSnackbar$2, companion2.getSetMeasurePolicy());
            Updater.m35299setimpl(r10, density, companion2.getSetDensity());
            Updater.m35299setimpl(r10, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m35299setimpl(r10, viewConfiguration, companion2.getSetViewConfiguration());
            materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            Modifier r7 = PaddingKt.m33270paddingVpY3zN4$default(LayoutIdKt.layoutId(companion, "text"), 0.0f, SnackbarVerticalPadding, 1, (Object) null);
            startRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            C13074a<ComposeUiNode> constructor2 = companion2.getConstructor();
            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf2 = LayoutKt.materializerOf(r7);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer r62 = Updater.m35292constructorimpl(startRestartGroup);
            Updater.m35299setimpl(r62, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m35299setimpl(r62, density2, companion2.getSetDensity());
            Updater.m35299setimpl(r62, layoutDirection2, companion2.getSetLayoutDirection());
            Updater.m35299setimpl(r62, viewConfiguration2, companion2.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            oVar3.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            Modifier layoutId = LayoutIdKt.layoutId(companion, "action");
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density3 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            C13074a<ComposeUiNode> constructor3 = companion2.getConstructor();
            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf3 = LayoutKt.materializerOf(layoutId);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer r102 = Updater.m35292constructorimpl(startRestartGroup);
            Updater.m35299setimpl(r102, rememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m35299setimpl(r102, density3, companion2.getSetDensity());
            Updater.m35299setimpl(r102, layoutDirection3, companion2.getSetLayoutDirection());
            Updater.m35299setimpl(r102, viewConfiguration3, companion2.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf3.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            oVar4.invoke(startRestartGroup, Integer.valueOf((i2 >> 3) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SnackbarKt$OneRowSnackbar$3(oVar3, oVar4, i5));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:128:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0114  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* renamed from: Snackbar-7zSek6w  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m34107Snackbar7zSek6w(androidx.compose.p002ui.Modifier r27, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r28, boolean r29, androidx.compose.p002ui.graphics.Shape r30, long r31, long r33, float r35, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r36, androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            r10 = r36
            r11 = r38
            r12 = r39
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r10, r0)
            r0 = -558258760(0xffffffffdeb9a5b8, float:-6.6886503E18)
            r1 = r37
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            r2 = r12 & 1
            if (r2 == 0) goto L_0x001e
            r3 = r11 | 6
            r4 = r3
            r3 = r27
            goto L_0x0032
        L_0x001e:
            r3 = r11 & 14
            if (r3 != 0) goto L_0x002f
            r3 = r27
            boolean r4 = r1.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x002c
            r4 = 4
            goto L_0x002d
        L_0x002c:
            r4 = 2
        L_0x002d:
            r4 = r4 | r11
            goto L_0x0032
        L_0x002f:
            r3 = r27
            r4 = r11
        L_0x0032:
            r5 = r12 & 2
            if (r5 == 0) goto L_0x0039
            r4 = r4 | 48
            goto L_0x004c
        L_0x0039:
            r6 = r11 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x004c
            r6 = r28
            boolean r7 = r1.changedInstance(r6)
            if (r7 == 0) goto L_0x0048
            r7 = 32
            goto L_0x004a
        L_0x0048:
            r7 = 16
        L_0x004a:
            r4 = r4 | r7
            goto L_0x004e
        L_0x004c:
            r6 = r28
        L_0x004e:
            r7 = r12 & 4
            if (r7 == 0) goto L_0x0055
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0055:
            r8 = r11 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0068
            r8 = r29
            boolean r9 = r1.changed((boolean) r8)
            if (r9 == 0) goto L_0x0064
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r4 = r4 | r9
            goto L_0x006a
        L_0x0068:
            r8 = r29
        L_0x006a:
            r9 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0083
            r9 = r12 & 8
            if (r9 != 0) goto L_0x007d
            r9 = r30
            boolean r13 = r1.changed((java.lang.Object) r9)
            if (r13 == 0) goto L_0x007f
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007d:
            r9 = r30
        L_0x007f:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r4 = r4 | r13
            goto L_0x0085
        L_0x0083:
            r9 = r30
        L_0x0085:
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r11
            if (r13 != 0) goto L_0x00a0
            r13 = r12 & 16
            if (r13 != 0) goto L_0x009a
            r13 = r31
            boolean r15 = r1.changed((long) r13)
            if (r15 == 0) goto L_0x009c
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009a:
            r13 = r31
        L_0x009c:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r4 = r4 | r15
            goto L_0x00a2
        L_0x00a0:
            r13 = r31
        L_0x00a2:
            r15 = 458752(0x70000, float:6.42848E-40)
            r16 = r11 & r15
            if (r16 != 0) goto L_0x00bc
            r16 = r12 & 32
            r8 = r33
            if (r16 != 0) goto L_0x00b7
            boolean r16 = r1.changed((long) r8)
            if (r16 == 0) goto L_0x00b7
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b9
        L_0x00b7:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b9:
            r4 = r4 | r16
            goto L_0x00be
        L_0x00bc:
            r8 = r33
        L_0x00be:
            r16 = r12 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r16 == 0) goto L_0x00c9
            r4 = r4 | r17
            r15 = r35
            goto L_0x00de
        L_0x00c9:
            r18 = 3670016(0x380000, float:5.142788E-39)
            r18 = r11 & r18
            r15 = r35
            if (r18 != 0) goto L_0x00de
            boolean r18 = r1.changed((float) r15)
            if (r18 == 0) goto L_0x00da
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00dc
        L_0x00da:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00dc:
            r4 = r4 | r18
        L_0x00de:
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00e6
            r0 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00e4:
            r4 = r4 | r0
            goto L_0x00f7
        L_0x00e6:
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r11
            if (r0 != 0) goto L_0x00f7
            boolean r0 = r1.changedInstance(r10)
            if (r0 == 0) goto L_0x00f4
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e4
        L_0x00f4:
            r0 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00e4
        L_0x00f7:
            r0 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r0 & r4
            r3 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r3) goto L_0x0114
            boolean r0 = r1.getSkipping()
            if (r0 != 0) goto L_0x0107
            goto L_0x0114
        L_0x0107:
            r1.skipToGroupEnd()
            r2 = r27
            r3 = r29
            r4 = r30
            r7 = r8
            r9 = r15
            goto L_0x01ea
        L_0x0114:
            r1.startDefaults()
            r0 = r11 & 1
            r3 = -458753(0xfffffffffff8ffff, float:NaN)
            r19 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0149
            boolean r0 = r1.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0128
            goto L_0x0149
        L_0x0128:
            r1.skipToGroupEnd()
            r0 = r12 & 8
            if (r0 == 0) goto L_0x0131
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0131:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x0137
            r4 = r4 & r19
        L_0x0137:
            r0 = r12 & 32
            if (r0 == 0) goto L_0x013c
            r4 = r4 & r3
        L_0x013c:
            r0 = r27
            r2 = r29
            r5 = r30
        L_0x0142:
            r7 = r15
        L_0x0143:
            r25 = r13
            r13 = r4
            r3 = r25
            goto L_0x0193
        L_0x0149:
            if (r2 == 0) goto L_0x014e
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x0150
        L_0x014e:
            r0 = r27
        L_0x0150:
            if (r5 == 0) goto L_0x0154
            r2 = 0
            r6 = r2
        L_0x0154:
            if (r7 == 0) goto L_0x0158
            r2 = 0
            goto L_0x015a
        L_0x0158:
            r2 = r29
        L_0x015a:
            r5 = r12 & 8
            r7 = 6
            if (r5 == 0) goto L_0x016c
            androidx.compose.material.MaterialTheme r5 = androidx.compose.material.MaterialTheme.INSTANCE
            androidx.compose.material.Shapes r5 = r5.getShapes(r1, r7)
            androidx.compose.foundation.shape.CornerBasedShape r5 = r5.getSmall()
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x016e
        L_0x016c:
            r5 = r30
        L_0x016e:
            r20 = r12 & 16
            if (r20 == 0) goto L_0x017a
            androidx.compose.material.SnackbarDefaults r13 = androidx.compose.material.SnackbarDefaults.INSTANCE
            long r13 = r13.getBackgroundColor(r1, r7)
            r4 = r4 & r19
        L_0x017a:
            r19 = r12 & 32
            if (r19 == 0) goto L_0x018a
            androidx.compose.material.MaterialTheme r8 = androidx.compose.material.MaterialTheme.INSTANCE
            androidx.compose.material.Colors r8 = r8.getColors(r1, r7)
            long r8 = r8.m33956getSurface0d7_KjU()
            r3 = r3 & r4
            r4 = r3
        L_0x018a:
            if (r16 == 0) goto L_0x0142
            float r3 = (float) r7
            float r3 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r3)
            r7 = r3
            goto L_0x0143
        L_0x0193:
            r1.endDefaults()
            boolean r14 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r14 == 0) goto L_0x01a5
            r14 = -1
            java.lang.String r15 = "androidx.compose.material.Snackbar (Snackbar.kt:80)"
            r11 = -558258760(0xffffffffdeb9a5b8, float:-6.6886503E18)
            androidx.compose.runtime.ComposerKt.traceEventStart(r11, r13, r14, r15)
        L_0x01a5:
            r19 = 0
            androidx.compose.material.SnackbarKt$Snackbar$1 r11 = new androidx.compose.material.SnackbarKt$Snackbar$1
            r11.<init>(r6, r10, r13, r2)
            r14 = -2084221700(0xffffffff83c54cfc, float:-1.1596294E-36)
            r15 = 1
            androidx.compose.runtime.internal.ComposableLambda r21 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r1, r14, r15, r11)
            r11 = r13 & 14
            r11 = r11 | r17
            int r14 = r13 >> 6
            r15 = r14 & 112(0x70, float:1.57E-43)
            r11 = r11 | r15
            r15 = r14 & 896(0x380, float:1.256E-42)
            r11 = r11 | r15
            r14 = r14 & 7168(0x1c00, float:1.0045E-41)
            r11 = r11 | r14
            int r13 = r13 >> 3
            r14 = 458752(0x70000, float:6.42848E-40)
            r13 = r13 & r14
            r23 = r11 | r13
            r24 = 16
            r13 = r0
            r14 = r5
            r15 = r3
            r17 = r8
            r20 = r7
            r22 = r1
            androidx.compose.material.SurfaceKt.m34127SurfaceFjzlyU(r13, r14, r15, r17, r19, r20, r21, r22, r23, r24)
            boolean r11 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r11 == 0) goto L_0x01e1
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01e1:
            r13 = r3
            r4 = r5
            r3 = r2
            r2 = r0
            r25 = r8
            r9 = r7
            r7 = r25
        L_0x01ea:
            androidx.compose.runtime.ScopeUpdateScope r15 = r1.endRestartGroup()
            if (r15 != 0) goto L_0x01f1
            goto L_0x0204
        L_0x01f1:
            androidx.compose.material.SnackbarKt$Snackbar$2 r11 = new androidx.compose.material.SnackbarKt$Snackbar$2
            r0 = r11
            r1 = r2
            r2 = r6
            r5 = r13
            r10 = r36
            r13 = r11
            r11 = r38
            r12 = r39
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r11, r12)
            r15.updateScope(r13)
        L_0x0204:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarKt.m34107Snackbar7zSek6w(androidx.compose.ui.Modifier, of.o, boolean, androidx.compose.ui.graphics.Shape, long, long, float, of.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:146:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0116  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: Snackbar-sPrSdHI  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m34108SnackbarsPrSdHI(androidx.compose.material.SnackbarData r29, androidx.compose.p002ui.Modifier r30, boolean r31, androidx.compose.p002ui.graphics.Shape r32, long r33, long r35, long r37, float r39, androidx.compose.runtime.Composer r40, int r41, int r42) {
        /*
            r1 = r29
            r12 = r41
            r13 = r42
            java.lang.String r0 = "snackbarData"
            kotlin.jvm.internal.C12775o.m28639i(r1, r0)
            r0 = 258660814(0xf6ad9ce, float:1.15790384E-29)
            r2 = r40
            androidx.compose.runtime.Composer r2 = r2.startRestartGroup(r0)
            r3 = r13 & 1
            if (r3 == 0) goto L_0x001b
            r3 = r12 | 6
            goto L_0x002b
        L_0x001b:
            r3 = r12 & 14
            if (r3 != 0) goto L_0x002a
            boolean r3 = r2.changed((java.lang.Object) r1)
            if (r3 == 0) goto L_0x0027
            r3 = 4
            goto L_0x0028
        L_0x0027:
            r3 = 2
        L_0x0028:
            r3 = r3 | r12
            goto L_0x002b
        L_0x002a:
            r3 = r12
        L_0x002b:
            r4 = r13 & 2
            if (r4 == 0) goto L_0x0032
            r3 = r3 | 48
            goto L_0x0045
        L_0x0032:
            r5 = r12 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0045
            r5 = r30
            boolean r6 = r2.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x0041
            r6 = 32
            goto L_0x0043
        L_0x0041:
            r6 = 16
        L_0x0043:
            r3 = r3 | r6
            goto L_0x0047
        L_0x0045:
            r5 = r30
        L_0x0047:
            r6 = r13 & 4
            if (r6 == 0) goto L_0x004e
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0061
        L_0x004e:
            r7 = r12 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0061
            r7 = r31
            boolean r8 = r2.changed((boolean) r7)
            if (r8 == 0) goto L_0x005d
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r3 = r3 | r8
            goto L_0x0063
        L_0x0061:
            r7 = r31
        L_0x0063:
            r8 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x007c
            r8 = r13 & 8
            if (r8 != 0) goto L_0x0076
            r8 = r32
            boolean r9 = r2.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x0078
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0076:
            r8 = r32
        L_0x0078:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r3 = r3 | r9
            goto L_0x007e
        L_0x007c:
            r8 = r32
        L_0x007e:
            r9 = 57344(0xe000, float:8.0356E-41)
            r10 = r12 & r9
            if (r10 != 0) goto L_0x009a
            r10 = r13 & 16
            if (r10 != 0) goto L_0x0094
            r10 = r33
            boolean r14 = r2.changed((long) r10)
            if (r14 == 0) goto L_0x0096
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0094:
            r10 = r33
        L_0x0096:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r3 = r3 | r14
            goto L_0x009c
        L_0x009a:
            r10 = r33
        L_0x009c:
            r14 = 458752(0x70000, float:6.42848E-40)
            r15 = r12 & r14
            if (r15 != 0) goto L_0x00b8
            r15 = r13 & 32
            if (r15 != 0) goto L_0x00b1
            r14 = r35
            boolean r16 = r2.changed((long) r14)
            if (r16 == 0) goto L_0x00b3
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b5
        L_0x00b1:
            r14 = r35
        L_0x00b3:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b5:
            r3 = r3 | r16
            goto L_0x00ba
        L_0x00b8:
            r14 = r35
        L_0x00ba:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r17 = r12 & r16
            if (r17 != 0) goto L_0x00d3
            r17 = r13 & 64
            r9 = r37
            if (r17 != 0) goto L_0x00cf
            boolean r11 = r2.changed((long) r9)
            if (r11 == 0) goto L_0x00cf
            r11 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d1
        L_0x00cf:
            r11 = 524288(0x80000, float:7.34684E-40)
        L_0x00d1:
            r3 = r3 | r11
            goto L_0x00d5
        L_0x00d3:
            r9 = r37
        L_0x00d5:
            r11 = r13 & 128(0x80, float:1.794E-43)
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            if (r11 == 0) goto L_0x00e0
            r3 = r3 | r18
            r0 = r39
            goto L_0x00f5
        L_0x00e0:
            r19 = 29360128(0x1c00000, float:7.052966E-38)
            r19 = r12 & r19
            r0 = r39
            if (r19 != 0) goto L_0x00f5
            boolean r20 = r2.changed((float) r0)
            if (r20 == 0) goto L_0x00f1
            r20 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f3
        L_0x00f1:
            r20 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f3:
            r3 = r3 | r20
        L_0x00f5:
            r20 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r3 & r20
            r5 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r5) goto L_0x0116
            boolean r0 = r2.getSkipping()
            if (r0 != 0) goto L_0x0106
            goto L_0x0116
        L_0x0106:
            r2.skipToGroupEnd()
            r3 = r30
            r11 = r39
            r4 = r7
            r6 = r8
            r27 = r9
            r9 = r14
            r7 = r33
            goto L_0x022d
        L_0x0116:
            r2.startDefaults()
            r0 = r12 & 1
            r5 = -3670017(0xffffffffffc7ffff, float:NaN)
            r20 = -458753(0xfffffffffff8ffff, float:NaN)
            r21 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0153
            boolean r0 = r2.getDefaultsInvalid()
            if (r0 == 0) goto L_0x012d
            goto L_0x0153
        L_0x012d:
            r2.skipToGroupEnd()
            r0 = r13 & 8
            if (r0 == 0) goto L_0x0136
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0136:
            r0 = r13 & 16
            if (r0 == 0) goto L_0x013c
            r3 = r3 & r21
        L_0x013c:
            r0 = r13 & 32
            if (r0 == 0) goto L_0x0142
            r3 = r3 & r20
        L_0x0142:
            r0 = r13 & 64
            if (r0 == 0) goto L_0x0147
            r3 = r3 & r5
        L_0x0147:
            r0 = r30
            r5 = r39
            r4 = r7
            r6 = r8
            r27 = r9
            r9 = r14
            r7 = r33
            goto L_0x01ad
        L_0x0153:
            if (r4 == 0) goto L_0x0158
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x015a
        L_0x0158:
            r0 = r30
        L_0x015a:
            if (r6 == 0) goto L_0x015e
            r4 = 0
            goto L_0x015f
        L_0x015e:
            r4 = r7
        L_0x015f:
            r6 = r13 & 8
            r7 = 6
            if (r6 == 0) goto L_0x0171
            androidx.compose.material.MaterialTheme r6 = androidx.compose.material.MaterialTheme.INSTANCE
            androidx.compose.material.Shapes r6 = r6.getShapes(r2, r7)
            androidx.compose.foundation.shape.CornerBasedShape r6 = r6.getSmall()
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x0172
        L_0x0171:
            r6 = r8
        L_0x0172:
            r8 = r13 & 16
            if (r8 == 0) goto L_0x017f
            androidx.compose.material.SnackbarDefaults r8 = androidx.compose.material.SnackbarDefaults.INSTANCE
            long r22 = r8.getBackgroundColor(r2, r7)
            r3 = r3 & r21
            goto L_0x0181
        L_0x017f:
            r22 = r33
        L_0x0181:
            r8 = r13 & 32
            if (r8 == 0) goto L_0x0191
            androidx.compose.material.MaterialTheme r8 = androidx.compose.material.MaterialTheme.INSTANCE
            androidx.compose.material.Colors r8 = r8.getColors(r2, r7)
            long r14 = r8.m33956getSurface0d7_KjU()
            r3 = r3 & r20
        L_0x0191:
            r8 = r13 & 64
            if (r8 == 0) goto L_0x019d
            androidx.compose.material.SnackbarDefaults r8 = androidx.compose.material.SnackbarDefaults.INSTANCE
            long r8 = r8.getPrimaryActionColor(r2, r7)
            r3 = r3 & r5
            goto L_0x019e
        L_0x019d:
            r8 = r9
        L_0x019e:
            if (r11 == 0) goto L_0x01a6
            float r5 = (float) r7
            float r5 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r5)
            goto L_0x01a8
        L_0x01a6:
            r5 = r39
        L_0x01a8:
            r27 = r8
            r9 = r14
            r7 = r22
        L_0x01ad:
            r2.endDefaults()
            boolean r11 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r11 == 0) goto L_0x01bf
            r11 = -1
            java.lang.String r14 = "androidx.compose.material.Snackbar (Snackbar.kt:151)"
            r15 = 258660814(0xf6ad9ce, float:1.15790384E-29)
            androidx.compose.runtime.ComposerKt.traceEventStart(r15, r3, r11, r14)
        L_0x01bf:
            java.lang.String r11 = r29.getActionLabel()
            r14 = 1
            if (r11 == 0) goto L_0x01dd
            androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1 r15 = new androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1
            r30 = r15
            r31 = r27
            r33 = r3
            r34 = r29
            r35 = r11
            r30.<init>(r31, r33, r34, r35)
            r11 = 1843479216(0x6de142b0, float:8.7143434E27)
            androidx.compose.runtime.internal.ComposableLambda r11 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r11, r14, r15)
            goto L_0x01de
        L_0x01dd:
            r11 = 0
        L_0x01de:
            r15 = r11
            r11 = 12
            float r11 = (float) r11
            float r11 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r11)
            androidx.compose.ui.Modifier r11 = androidx.compose.foundation.layout.PaddingKt.m33268padding3ABfNKs(r0, r11)
            androidx.compose.material.SnackbarKt$Snackbar$3 r14 = new androidx.compose.material.SnackbarKt$Snackbar$3
            r14.<init>(r1)
            r31 = r0
            r0 = -261845785(0xfffffffff0648ce7, float:-2.829317E29)
            r1 = 1
            androidx.compose.runtime.internal.ComposableLambda r23 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r0, r1, r14)
            r0 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 | r18
            r1 = r3 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r1
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r3
            r0 = r0 | r1
            r1 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r3
            r0 = r0 | r1
            int r1 = r3 >> 3
            r1 = r1 & r16
            r25 = r0 | r1
            r26 = 0
            r14 = r11
            r16 = r4
            r17 = r6
            r18 = r7
            r20 = r9
            r22 = r5
            r24 = r2
            m34107Snackbar7zSek6w(r14, r15, r16, r17, r18, r20, r22, r23, r24, r25, r26)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x022a
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x022a:
            r3 = r31
            r11 = r5
        L_0x022d:
            androidx.compose.runtime.ScopeUpdateScope r14 = r2.endRestartGroup()
            if (r14 != 0) goto L_0x0234
            goto L_0x024a
        L_0x0234:
            androidx.compose.material.SnackbarKt$Snackbar$4 r15 = new androidx.compose.material.SnackbarKt$Snackbar$4
            r0 = r15
            r1 = r29
            r2 = r3
            r3 = r4
            r4 = r6
            r5 = r7
            r7 = r9
            r9 = r27
            r12 = r41
            r13 = r42
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r11, r12, r13)
            r14.updateScope(r15)
        L_0x024a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarKt.m34108SnackbarsPrSdHI(androidx.compose.material.SnackbarData, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, long, long, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @Composable
    public static final void TextOnlySnackbar(C13088o<? super Composer, ? super Integer, C11921v> oVar, Composer composer, int i) {
        int i2;
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(917397959);
        if ((i & 14) == 0) {
            if (startRestartGroup.changedInstance(oVar)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(917397959, i2, -1, "androidx.compose.material.TextOnlySnackbar (Snackbar.kt:235)");
            }
            SnackbarKt$TextOnlySnackbar$2 snackbarKt$TextOnlySnackbar$2 = SnackbarKt$TextOnlySnackbar$2.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1323940314);
            Modifier.Companion companion = Modifier.Companion;
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            C13074a<ComposeUiNode> constructor = companion2.getConstructor();
            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(companion);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer r8 = Updater.m35292constructorimpl(startRestartGroup);
            Updater.m35299setimpl(r8, snackbarKt$TextOnlySnackbar$2, companion2.getSetMeasurePolicy());
            Updater.m35299setimpl(r8, density, companion2.getSetDensity());
            Updater.m35299setimpl(r8, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m35299setimpl(r8, viewConfiguration, companion2.getSetViewConfiguration());
            materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            Modifier r3 = PaddingKt.m33269paddingVpY3zN4(companion, HorizontalSpacing, SnackbarVerticalPadding);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            C13074a<ComposeUiNode> constructor2 = companion2.getConstructor();
            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf2 = LayoutKt.materializerOf(r3);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer r9 = Updater.m35292constructorimpl(startRestartGroup);
            Updater.m35299setimpl(r9, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m35299setimpl(r9, density2, companion2.getSetDensity());
            Updater.m35299setimpl(r9, layoutDirection2, companion2.getSetLayoutDirection());
            Updater.m35299setimpl(r9, viewConfiguration2, companion2.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            oVar.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SnackbarKt$TextOnlySnackbar$3(oVar, i));
        }
    }
}
