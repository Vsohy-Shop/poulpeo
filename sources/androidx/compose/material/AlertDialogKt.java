package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.p002ui.unit.TextUnitKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,291:1\n74#2:292\n75#2,11:294\n75#2:322\n76#2,11:324\n89#2:352\n75#2:360\n76#2,11:362\n89#2:390\n88#2:395\n71#2,4:396\n75#2,11:401\n88#2:426\n76#3:293\n76#3:323\n76#3:361\n76#3:400\n456#4,11:305\n460#4,13:335\n473#4,3:349\n460#4,13:373\n473#4,3:387\n467#4,3:392\n456#4,14:412\n67#5,6:316\n73#5:348\n77#5:353\n67#5,6:354\n73#5:386\n77#5:391\n154#6:427\n154#6:428\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt\n*L\n97#1:292\n97#1:294,11\n100#1:322\n100#1:324,11\n100#1:352\n105#1:360\n105#1:362,11\n105#1:390\n97#1:395\n193#1:396,4\n193#1:401,11\n193#1:426\n97#1:293\n100#1:323\n105#1:361\n193#1:400\n97#1:305,11\n100#1:335,13\n100#1:349,3\n105#1:373,13\n105#1:387,3\n97#1:392,3\n193#1:412,14\n100#1:316,6\n100#1:348\n100#1:353\n105#1:354,6\n105#1:386\n105#1:391\n282#1:427\n283#1:428\n*E\n"})
/* compiled from: AlertDialog.kt */
public final class AlertDialogKt {
    /* access modifiers changed from: private */
    public static final long TextBaselineDistanceFromTitle = TextUnitKt.getSp(36);
    /* access modifiers changed from: private */
    public static final long TextBaselineDistanceFromTop = TextUnitKt.getSp(38);
    private static final Modifier TextPadding;
    /* access modifiers changed from: private */
    public static final long TitleBaselineDistanceFromTop = TextUnitKt.getSp(40);
    private static final Modifier TitlePadding;

    static {
        Modifier.Companion companion = Modifier.Companion;
        float f = (float) 24;
        TitlePadding = PaddingKt.m33272paddingqDBjuR0$default(companion, C1232Dp.m38468constructorimpl(f), 0.0f, C1232Dp.m38468constructorimpl(f), 0.0f, 10, (Object) null);
        TextPadding = PaddingKt.m33272paddingqDBjuR0$default(companion, C1232Dp.m38468constructorimpl(f), 0.0f, C1232Dp.m38468constructorimpl(f), C1232Dp.m38468constructorimpl((float) 28), 2, (Object) null);
    }

    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Composable
    public static final void AlertDialogBaselineLayout(ColumnScope columnScope, C13088o<? super Composer, ? super Integer, C11921v> oVar, C13088o<? super Composer, ? super Integer, C11921v> oVar2, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        ColumnScope columnScope2 = columnScope;
        C13088o<? super Composer, ? super Integer, C11921v> oVar3 = oVar;
        C13088o<? super Composer, ? super Integer, C11921v> oVar4 = oVar2;
        int i6 = i;
        C12775o.m28639i(columnScope2, "<this>");
        Composer startRestartGroup = composer.startRestartGroup(-555573207);
        if ((i6 & 14) == 0) {
            if (startRestartGroup.changed((Object) columnScope2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i6;
        } else {
            i2 = i6;
        }
        if ((i6 & 112) == 0) {
            if (startRestartGroup.changedInstance(oVar3)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i6 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 0) {
            if (startRestartGroup.changedInstance(oVar4)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-555573207, i6, -1, "androidx.compose.material.AlertDialogBaselineLayout (AlertDialog.kt:92)");
            }
            Modifier weight = columnScope2.weight(Modifier.Companion, 1.0f, false);
            AlertDialogKt$AlertDialogBaselineLayout$2 alertDialogKt$AlertDialogBaselineLayout$2 = AlertDialogKt$AlertDialogBaselineLayout$2.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            C13074a<ComposeUiNode> constructor = companion.getConstructor();
            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(weight);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer r13 = Updater.m35292constructorimpl(startRestartGroup);
            Updater.m35299setimpl(r13, alertDialogKt$AlertDialogBaselineLayout$2, companion.getSetMeasurePolicy());
            Updater.m35299setimpl(r13, density, companion.getSetDensity());
            Updater.m35299setimpl(r13, layoutDirection, companion.getSetLayoutDirection());
            Updater.m35299setimpl(r13, viewConfiguration, companion.getSetViewConfiguration());
            materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-1160646206);
            if (oVar3 != null) {
                Modifier layoutId = LayoutIdKt.layoutId(TitlePadding, "title");
                Alignment.Companion companion2 = Alignment.Companion;
                Modifier align = columnScope2.align(layoutId, companion2.getStart());
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                C13074a<ComposeUiNode> constructor2 = companion.getConstructor();
                C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf2 = LayoutKt.materializerOf(align);
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
                Composer r8 = Updater.m35292constructorimpl(startRestartGroup);
                Updater.m35299setimpl(r8, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m35299setimpl(r8, density2, companion.getSetDensity());
                Updater.m35299setimpl(r8, layoutDirection2, companion.getSetLayoutDirection());
                Updater.m35299setimpl(r8, viewConfiguration2, companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                oVar3.invoke(startRestartGroup, 0);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-1735756597);
            if (oVar4 != null) {
                Modifier layoutId2 = LayoutIdKt.layoutId(TextPadding, "text");
                Alignment.Companion companion3 = Alignment.Companion;
                Modifier align2 = columnScope2.align(layoutId2, companion3.getStart());
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density3 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                C13074a<ComposeUiNode> constructor3 = companion.getConstructor();
                C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf3 = LayoutKt.materializerOf(align2);
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
                Composer r132 = Updater.m35292constructorimpl(startRestartGroup);
                Updater.m35299setimpl(r132, rememberBoxMeasurePolicy2, companion.getSetMeasurePolicy());
                Updater.m35299setimpl(r132, density3, companion.getSetDensity());
                Updater.m35299setimpl(r132, layoutDirection3, companion.getSetLayoutDirection());
                Updater.m35299setimpl(r132, viewConfiguration3, companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf3.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                oVar4.invoke(startRestartGroup, 0);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
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
            endRestartGroup.updateScope(new AlertDialogKt$AlertDialogBaselineLayout$3(columnScope2, oVar3, oVar4, i6));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00f0  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* renamed from: AlertDialogContent-WMdw5o4  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m33866AlertDialogContentWMdw5o4(p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r25, androidx.compose.p002ui.Modifier r26, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r27, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r28, androidx.compose.p002ui.graphics.Shape r29, long r30, long r32, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            r1 = r25
            r10 = r35
            java.lang.String r0 = "buttons"
            kotlin.jvm.internal.C12775o.m28639i(r1, r0)
            r0 = -453679601(0xffffffffe4f5660f, float:-3.6214451E22)
            r2 = r34
            androidx.compose.runtime.Composer r2 = r2.startRestartGroup(r0)
            r3 = r36 & 1
            if (r3 == 0) goto L_0x0019
            r3 = r10 | 6
            goto L_0x0029
        L_0x0019:
            r3 = r10 & 14
            if (r3 != 0) goto L_0x0028
            boolean r3 = r2.changedInstance(r1)
            if (r3 == 0) goto L_0x0025
            r3 = 4
            goto L_0x0026
        L_0x0025:
            r3 = 2
        L_0x0026:
            r3 = r3 | r10
            goto L_0x0029
        L_0x0028:
            r3 = r10
        L_0x0029:
            r4 = r36 & 2
            if (r4 == 0) goto L_0x0030
            r3 = r3 | 48
            goto L_0x0043
        L_0x0030:
            r5 = r10 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0043
            r5 = r26
            boolean r6 = r2.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x003f
            r6 = 32
            goto L_0x0041
        L_0x003f:
            r6 = 16
        L_0x0041:
            r3 = r3 | r6
            goto L_0x0045
        L_0x0043:
            r5 = r26
        L_0x0045:
            r6 = r36 & 4
            if (r6 == 0) goto L_0x004c
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x005f
        L_0x004c:
            r7 = r10 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x005f
            r7 = r27
            boolean r8 = r2.changedInstance(r7)
            if (r8 == 0) goto L_0x005b
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r3 = r3 | r8
            goto L_0x0061
        L_0x005f:
            r7 = r27
        L_0x0061:
            r8 = r36 & 8
            if (r8 == 0) goto L_0x0068
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x007b
        L_0x0068:
            r9 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x007b
            r9 = r28
            boolean r11 = r2.changedInstance(r9)
            if (r11 == 0) goto L_0x0077
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r3 = r3 | r11
            goto L_0x007d
        L_0x007b:
            r9 = r28
        L_0x007d:
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r10
            if (r11 != 0) goto L_0x0098
            r11 = r36 & 16
            if (r11 != 0) goto L_0x0092
            r11 = r29
            boolean r12 = r2.changed((java.lang.Object) r11)
            if (r12 == 0) goto L_0x0094
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0092:
            r11 = r29
        L_0x0094:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r3 = r3 | r12
            goto L_0x009a
        L_0x0098:
            r11 = r29
        L_0x009a:
            r12 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r10
            if (r12 != 0) goto L_0x00b4
            r12 = r36 & 32
            if (r12 != 0) goto L_0x00ae
            r12 = r30
            boolean r14 = r2.changed((long) r12)
            if (r14 == 0) goto L_0x00b0
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b2
        L_0x00ae:
            r12 = r30
        L_0x00b0:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00b2:
            r3 = r3 | r14
            goto L_0x00b6
        L_0x00b4:
            r12 = r30
        L_0x00b6:
            r14 = 3670016(0x380000, float:5.142788E-39)
            r14 = r14 & r10
            if (r14 != 0) goto L_0x00d1
            r14 = r36 & 64
            if (r14 != 0) goto L_0x00ca
            r14 = r32
            boolean r16 = r2.changed((long) r14)
            if (r16 == 0) goto L_0x00cc
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ce
        L_0x00ca:
            r14 = r32
        L_0x00cc:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00ce:
            r3 = r3 | r16
            goto L_0x00d3
        L_0x00d1:
            r14 = r32
        L_0x00d3:
            r16 = 2995931(0x2db6db, float:4.198194E-39)
            r0 = r3 & r16
            r5 = 599186(0x92492, float:8.39638E-40)
            if (r0 != r5) goto L_0x00f0
            boolean r0 = r2.getSkipping()
            if (r0 != 0) goto L_0x00e4
            goto L_0x00f0
        L_0x00e4:
            r2.skipToGroupEnd()
            r3 = r26
            r4 = r9
            r5 = r11
            r8 = r12
            r23 = r14
            goto L_0x01b3
        L_0x00f0:
            r2.startDefaults()
            r0 = r10 & 1
            r5 = -3670017(0xffffffffffc7ffff, float:NaN)
            r16 = -458753(0xfffffffffff8ffff, float:NaN)
            r18 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0123
            boolean r0 = r2.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0107
            goto L_0x0123
        L_0x0107:
            r2.skipToGroupEnd()
            r0 = r36 & 16
            if (r0 == 0) goto L_0x0110
            r3 = r3 & r18
        L_0x0110:
            r0 = r36 & 32
            if (r0 == 0) goto L_0x0116
            r3 = r3 & r16
        L_0x0116:
            r0 = r36 & 64
            if (r0 == 0) goto L_0x011b
            r3 = r3 & r5
        L_0x011b:
            r0 = r26
            r4 = r9
            r6 = r11
            r8 = r12
        L_0x0120:
            r23 = r14
            goto L_0x0166
        L_0x0123:
            if (r4 == 0) goto L_0x0128
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x012a
        L_0x0128:
            r0 = r26
        L_0x012a:
            r4 = 0
            if (r6 == 0) goto L_0x012e
            r7 = r4
        L_0x012e:
            if (r8 == 0) goto L_0x0131
            goto L_0x0132
        L_0x0131:
            r4 = r9
        L_0x0132:
            r6 = r36 & 16
            r8 = 6
            if (r6 == 0) goto L_0x0144
            androidx.compose.material.MaterialTheme r6 = androidx.compose.material.MaterialTheme.INSTANCE
            androidx.compose.material.Shapes r6 = r6.getShapes(r2, r8)
            androidx.compose.foundation.shape.CornerBasedShape r6 = r6.getMedium()
            r3 = r3 & r18
            goto L_0x0145
        L_0x0144:
            r6 = r11
        L_0x0145:
            r9 = r36 & 32
            if (r9 == 0) goto L_0x0156
            androidx.compose.material.MaterialTheme r9 = androidx.compose.material.MaterialTheme.INSTANCE
            androidx.compose.material.Colors r8 = r9.getColors(r2, r8)
            long r8 = r8.m33956getSurface0d7_KjU()
            r3 = r3 & r16
            goto L_0x0157
        L_0x0156:
            r8 = r12
        L_0x0157:
            r11 = r36 & 64
            if (r11 == 0) goto L_0x0120
            int r11 = r3 >> 15
            r11 = r11 & 14
            long r11 = androidx.compose.material.ColorsKt.m33970contentColorForek8zF_U(r8, r2, r11)
            r3 = r3 & r5
            r23 = r11
        L_0x0166:
            r2.endDefaults()
            boolean r5 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r5 == 0) goto L_0x0178
            r5 = -1
            java.lang.String r11 = "androidx.compose.material.AlertDialogContent (AlertDialog.kt:43)"
            r12 = -453679601(0xffffffffe4f5660f, float:-3.6214451E22)
            androidx.compose.runtime.ComposerKt.traceEventStart(r12, r3, r5, r11)
        L_0x0178:
            r17 = 0
            r18 = 0
            androidx.compose.material.AlertDialogKt$AlertDialogContent$1 r5 = new androidx.compose.material.AlertDialogKt$AlertDialogContent$1
            r5.<init>(r7, r4, r1, r3)
            r11 = 629950291(0x258c4753, float:2.433446E-16)
            r12 = 1
            androidx.compose.runtime.internal.ComposableLambda r19 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r11, r12, r5)
            int r5 = r3 >> 3
            r5 = r5 & 14
            r11 = 1572864(0x180000, float:2.204052E-39)
            r5 = r5 | r11
            int r3 = r3 >> 9
            r11 = r3 & 112(0x70, float:1.57E-43)
            r5 = r5 | r11
            r11 = r3 & 896(0x380, float:1.256E-42)
            r5 = r5 | r11
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r21 = r5 | r3
            r22 = 48
            r11 = r0
            r12 = r6
            r13 = r8
            r15 = r23
            r20 = r2
            androidx.compose.material.SurfaceKt.m34127SurfaceFjzlyU(r11, r12, r13, r15, r17, r18, r19, r20, r21, r22)
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x01b1
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01b1:
            r3 = r0
            r5 = r6
        L_0x01b3:
            androidx.compose.runtime.ScopeUpdateScope r12 = r2.endRestartGroup()
            if (r12 != 0) goto L_0x01ba
            goto L_0x01ce
        L_0x01ba:
            androidx.compose.material.AlertDialogKt$AlertDialogContent$2 r13 = new androidx.compose.material.AlertDialogKt$AlertDialogContent$2
            r0 = r13
            r1 = r25
            r2 = r3
            r3 = r7
            r6 = r8
            r8 = r23
            r10 = r35
            r11 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r11)
            r12.updateScope(r13)
        L_0x01ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AlertDialogKt.m33866AlertDialogContentWMdw5o4(of.o, androidx.compose.ui.Modifier, of.o, of.o, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @Composable
    /* renamed from: AlertDialogFlowRow-ixp7dh8  reason: not valid java name */
    public static final void m33867AlertDialogFlowRowixp7dh8(float f, float f2, C13088o<? super Composer, ? super Integer, C11921v> oVar, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        C12775o.m28639i(oVar, "content");
        Composer startRestartGroup = composer.startRestartGroup(73434452);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(f)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changed(f2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 0) {
            if (startRestartGroup.changedInstance(oVar)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(73434452, i2, -1, "androidx.compose.material.AlertDialogFlowRow (AlertDialog.kt:187)");
            }
            AlertDialogKt$AlertDialogFlowRow$1 alertDialogKt$AlertDialogFlowRow$1 = new AlertDialogKt$AlertDialogFlowRow$1(f, f2);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Modifier.Companion companion = Modifier.Companion;
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            C13074a<ComposeUiNode> constructor = companion2.getConstructor();
            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(companion);
            int i6 = ((((i2 >> 6) & 14) << 9) & 7168) | 6;
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer r7 = Updater.m35292constructorimpl(startRestartGroup);
            Updater.m35299setimpl(r7, alertDialogKt$AlertDialogFlowRow$1, companion2.getSetMeasurePolicy());
            Updater.m35299setimpl(r7, density, companion2.getSetDensity());
            Updater.m35299setimpl(r7, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m35299setimpl(r7, viewConfiguration, companion2.getSetViewConfiguration());
            materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i6 >> 3) & 112));
            startRestartGroup.startReplaceableGroup(2058660585);
            oVar.invoke(startRestartGroup, Integer.valueOf((i6 >> 9) & 14));
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
            endRestartGroup.updateScope(new AlertDialogKt$AlertDialogFlowRow$2(f, f2, oVar, i));
        }
    }
}
