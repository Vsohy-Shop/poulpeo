package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p002ui.layout.IntrinsicMeasurable;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.C12703l0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13089p;
import p404of.C13090q;
import p404of.C13091r;
import p436tf.C13528f;

@SourceDebugExtension({"SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,724:1\n75#2:725\n76#2,11:727\n89#2:754\n75#2:755\n76#2,11:757\n89#2:784\n76#3:726\n76#3:756\n460#4,16:738\n460#4,16:768\n36#4:785\n36#4:792\n36#4:799\n67#4,3:806\n66#4:809\n36#4:816\n67#4,3:823\n66#4:826\n1057#5,6:786\n1057#5,6:793\n1057#5,6:800\n1057#5,6:810\n1057#5,6:817\n1057#5,6:827\n49#6,6:833\n49#6,6:840\n1#7:839\n1182#8:846\n1161#8,2:847\n*S KotlinDebug\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt\n*L\n66#1:725\n66#1:727,11\n66#1:754\n116#1:755\n116#1:757,11\n116#1:784\n66#1:726\n116#1:756\n66#1:738,16\n116#1:768,16\n126#1:785\n137#1:792\n165#1:799\n168#1:806,3\n168#1:809\n188#1:816\n191#1:823,3\n191#1:826\n126#1:786,6\n137#1:793,6\n165#1:800,6\n168#1:810,6\n188#1:817,6\n191#1:827,6\n427#1:833,6\n542#1:840,6\n580#1:846\n580#1:847,2\n*E\n"})
/* compiled from: FlowLayout.kt */
public final class FlowLayoutKt {
    private static final C13090q<Integer, int[], MeasureScope, int[], C11921v> crossAxisColumnArrangement = FlowLayoutKt$crossAxisColumnArrangement$1.INSTANCE;
    private static final C13090q<Integer, int[], MeasureScope, int[], C11921v> crossAxisRowArrangement = FlowLayoutKt$crossAxisRowArrangement$1.INSTANCE;

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.foundation.layout.ExperimentalLayoutApi
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void FlowColumn(androidx.compose.p002ui.Modifier r16, androidx.compose.foundation.layout.Arrangement.Vertical r17, androidx.compose.p002ui.Alignment.Horizontal r18, int r19, p404of.C13089p<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r20, androidx.compose.runtime.Composer r21, int r22, int r23) {
        /*
            r5 = r20
            r6 = r22
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r5, r0)
            r0 = -310290901(0xffffffffed81562b, float:-5.003467E27)
            r1 = r21
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            r2 = r23 & 1
            if (r2 == 0) goto L_0x001c
            r3 = r6 | 6
            r4 = r3
            r3 = r16
            goto L_0x0030
        L_0x001c:
            r3 = r6 & 14
            if (r3 != 0) goto L_0x002d
            r3 = r16
            boolean r4 = r1.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x002a
            r4 = 4
            goto L_0x002b
        L_0x002a:
            r4 = 2
        L_0x002b:
            r4 = r4 | r6
            goto L_0x0030
        L_0x002d:
            r3 = r16
            r4 = r6
        L_0x0030:
            r7 = r23 & 2
            if (r7 == 0) goto L_0x0037
            r4 = r4 | 48
            goto L_0x004a
        L_0x0037:
            r8 = r6 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x004a
            r8 = r17
            boolean r9 = r1.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x0046
            r9 = 32
            goto L_0x0048
        L_0x0046:
            r9 = 16
        L_0x0048:
            r4 = r4 | r9
            goto L_0x004c
        L_0x004a:
            r8 = r17
        L_0x004c:
            r9 = r23 & 4
            if (r9 == 0) goto L_0x0053
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0053:
            r10 = r6 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x0066
            r10 = r18
            boolean r11 = r1.changed((java.lang.Object) r10)
            if (r11 == 0) goto L_0x0062
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r4 = r4 | r11
            goto L_0x0068
        L_0x0066:
            r10 = r18
        L_0x0068:
            r11 = r23 & 8
            if (r11 == 0) goto L_0x006f
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0082
        L_0x006f:
            r12 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r12 != 0) goto L_0x0082
            r12 = r19
            boolean r13 = r1.changed((int) r12)
            if (r13 == 0) goto L_0x007e
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r4 = r4 | r13
            goto L_0x0084
        L_0x0082:
            r12 = r19
        L_0x0084:
            r13 = r23 & 16
            if (r13 == 0) goto L_0x008b
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009d
        L_0x008b:
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r6
            if (r13 != 0) goto L_0x009d
            boolean r13 = r1.changed((java.lang.Object) r5)
            if (r13 == 0) goto L_0x009a
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r4 = r4 | r13
        L_0x009d:
            r13 = 46811(0xb6db, float:6.5596E-41)
            r13 = r13 & r4
            r14 = 9362(0x2492, float:1.3119E-41)
            if (r13 != r14) goto L_0x00b3
            boolean r13 = r1.getSkipping()
            if (r13 != 0) goto L_0x00ac
            goto L_0x00b3
        L_0x00ac:
            r1.skipToGroupEnd()
            r2 = r8
            r4 = r12
            goto L_0x01b0
        L_0x00b3:
            if (r2 == 0) goto L_0x00b8
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x00b9
        L_0x00b8:
            r2 = r3
        L_0x00b9:
            if (r7 == 0) goto L_0x00c2
            androidx.compose.foundation.layout.Arrangement r3 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            androidx.compose.foundation.layout.Arrangement$Vertical r3 = r3.getTop()
            goto L_0x00c3
        L_0x00c2:
            r3 = r8
        L_0x00c3:
            if (r9 == 0) goto L_0x00cd
            androidx.compose.ui.Alignment$Companion r7 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment$Horizontal r7 = r7.getStart()
            r13 = r7
            goto L_0x00ce
        L_0x00cd:
            r13 = r10
        L_0x00ce:
            if (r11 == 0) goto L_0x00d5
            r7 = 2147483647(0x7fffffff, float:NaN)
            r14 = r7
            goto L_0x00d6
        L_0x00d5:
            r14 = r12
        L_0x00d6:
            boolean r7 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r7 == 0) goto L_0x00e2
            r7 = -1
            java.lang.String r8 = "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:103)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r4, r7, r8)
        L_0x00e2:
            int r0 = r4 >> 3
            r7 = r0 & 14
            r8 = r0 & 112(0x70, float:1.57E-43)
            r7 = r7 | r8
            r0 = r0 & 896(0x380, float:1.256E-42)
            r11 = r7 | r0
            r12 = 0
            r7 = r3
            r8 = r13
            r9 = r14
            r10 = r1
            androidx.compose.ui.layout.MeasurePolicy r0 = columnMeasurementHelper(r7, r8, r9, r10, r11, r12)
            int r7 = r4 << 3
            r7 = r7 & 112(0x70, float:1.57E-43)
            r8 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.startReplaceableGroup(r8)
            androidx.compose.runtime.ProvidableCompositionLocal r8 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r8 = r1.consume(r8)
            androidx.compose.ui.unit.Density r8 = (androidx.compose.p002ui.unit.Density) r8
            androidx.compose.runtime.ProvidableCompositionLocal r9 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r9 = r1.consume(r9)
            androidx.compose.ui.unit.LayoutDirection r9 = (androidx.compose.p002ui.unit.LayoutDirection) r9
            androidx.compose.runtime.ProvidableCompositionLocal r10 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r10 = r1.consume(r10)
            androidx.compose.ui.platform.ViewConfiguration r10 = (androidx.compose.p002ui.platform.ViewConfiguration) r10
            androidx.compose.ui.node.ComposeUiNode$Companion r11 = androidx.compose.p002ui.node.ComposeUiNode.Companion
            of.a r12 = r11.getConstructor()
            of.p r15 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r2)
            int r7 = r7 << 9
            r7 = r7 & 7168(0x1c00, float:1.0045E-41)
            r7 = r7 | 6
            r16 = r2
            androidx.compose.runtime.Applier r2 = r1.getApplier()
            boolean r2 = r2 instanceof androidx.compose.runtime.Applier
            if (r2 != 0) goto L_0x013b
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x013b:
            r1.startReusableNode()
            boolean r2 = r1.getInserting()
            if (r2 == 0) goto L_0x0148
            r1.createNode(r12)
            goto L_0x014b
        L_0x0148:
            r1.useNode()
        L_0x014b:
            r1.disableReusing()
            androidx.compose.runtime.Composer r2 = androidx.compose.runtime.Updater.m35292constructorimpl(r1)
            of.o r12 = r11.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r2, r0, r12)
            of.o r0 = r11.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r2, r8, r0)
            of.o r0 = r11.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r2, r9, r0)
            of.o r0 = r11.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r2, r10, r0)
            r1.enableReusing()
            androidx.compose.runtime.Composer r0 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r1)
            androidx.compose.runtime.SkippableUpdater r0 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r0)
            int r2 = r7 >> 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r15.invoke(r0, r1, r2)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.startReplaceableGroup(r0)
            androidx.compose.foundation.layout.ColumnScopeInstance r0 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE
            int r2 = r4 >> 9
            r2 = r2 & 112(0x70, float:1.57E-43)
            r2 = r2 | 6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.invoke(r0, r1, r2)
            r1.endReplaceableGroup()
            r1.endNode()
            r1.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01ab
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01ab:
            r2 = r3
            r10 = r13
            r4 = r14
            r3 = r16
        L_0x01b0:
            androidx.compose.runtime.ScopeUpdateScope r8 = r1.endRestartGroup()
            if (r8 != 0) goto L_0x01b7
            goto L_0x01c8
        L_0x01b7:
            androidx.compose.foundation.layout.FlowLayoutKt$FlowColumn$2 r9 = new androidx.compose.foundation.layout.FlowLayoutKt$FlowColumn$2
            r0 = r9
            r1 = r3
            r3 = r10
            r5 = r20
            r6 = r22
            r7 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.updateScope(r9)
        L_0x01c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.FlowColumn(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Horizontal, int, of.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.foundation.layout.ExperimentalLayoutApi
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void FlowRow(androidx.compose.p002ui.Modifier r16, androidx.compose.foundation.layout.Arrangement.Horizontal r17, androidx.compose.p002ui.Alignment.Vertical r18, int r19, p404of.C13089p<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r20, androidx.compose.runtime.Composer r21, int r22, int r23) {
        /*
            r5 = r20
            r6 = r22
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r5, r0)
            r0 = 1098475987(0x417969d3, float:15.588336)
            r1 = r21
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            r2 = r23 & 1
            if (r2 == 0) goto L_0x001c
            r3 = r6 | 6
            r4 = r3
            r3 = r16
            goto L_0x0030
        L_0x001c:
            r3 = r6 & 14
            if (r3 != 0) goto L_0x002d
            r3 = r16
            boolean r4 = r1.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x002a
            r4 = 4
            goto L_0x002b
        L_0x002a:
            r4 = 2
        L_0x002b:
            r4 = r4 | r6
            goto L_0x0030
        L_0x002d:
            r3 = r16
            r4 = r6
        L_0x0030:
            r7 = r23 & 2
            if (r7 == 0) goto L_0x0037
            r4 = r4 | 48
            goto L_0x004a
        L_0x0037:
            r8 = r6 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x004a
            r8 = r17
            boolean r9 = r1.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x0046
            r9 = 32
            goto L_0x0048
        L_0x0046:
            r9 = 16
        L_0x0048:
            r4 = r4 | r9
            goto L_0x004c
        L_0x004a:
            r8 = r17
        L_0x004c:
            r9 = r23 & 4
            if (r9 == 0) goto L_0x0053
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0053:
            r10 = r6 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x0066
            r10 = r18
            boolean r11 = r1.changed((java.lang.Object) r10)
            if (r11 == 0) goto L_0x0062
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r4 = r4 | r11
            goto L_0x0068
        L_0x0066:
            r10 = r18
        L_0x0068:
            r11 = r23 & 8
            if (r11 == 0) goto L_0x006f
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0082
        L_0x006f:
            r12 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r12 != 0) goto L_0x0082
            r12 = r19
            boolean r13 = r1.changed((int) r12)
            if (r13 == 0) goto L_0x007e
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r4 = r4 | r13
            goto L_0x0084
        L_0x0082:
            r12 = r19
        L_0x0084:
            r13 = r23 & 16
            if (r13 == 0) goto L_0x008b
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009d
        L_0x008b:
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r6
            if (r13 != 0) goto L_0x009d
            boolean r13 = r1.changed((java.lang.Object) r5)
            if (r13 == 0) goto L_0x009a
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r4 = r4 | r13
        L_0x009d:
            r13 = 46811(0xb6db, float:6.5596E-41)
            r13 = r13 & r4
            r14 = 9362(0x2492, float:1.3119E-41)
            if (r13 != r14) goto L_0x00b3
            boolean r13 = r1.getSkipping()
            if (r13 != 0) goto L_0x00ac
            goto L_0x00b3
        L_0x00ac:
            r1.skipToGroupEnd()
            r2 = r8
            r4 = r12
            goto L_0x01b0
        L_0x00b3:
            if (r2 == 0) goto L_0x00b8
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x00b9
        L_0x00b8:
            r2 = r3
        L_0x00b9:
            if (r7 == 0) goto L_0x00c2
            androidx.compose.foundation.layout.Arrangement r3 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            androidx.compose.foundation.layout.Arrangement$Horizontal r3 = r3.getStart()
            goto L_0x00c3
        L_0x00c2:
            r3 = r8
        L_0x00c3:
            if (r9 == 0) goto L_0x00cd
            androidx.compose.ui.Alignment$Companion r7 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment$Vertical r7 = r7.getTop()
            r13 = r7
            goto L_0x00ce
        L_0x00cd:
            r13 = r10
        L_0x00ce:
            if (r11 == 0) goto L_0x00d5
            r7 = 2147483647(0x7fffffff, float:NaN)
            r14 = r7
            goto L_0x00d6
        L_0x00d5:
            r14 = r12
        L_0x00d6:
            boolean r7 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r7 == 0) goto L_0x00e2
            r7 = -1
            java.lang.String r8 = "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:53)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r4, r7, r8)
        L_0x00e2:
            int r0 = r4 >> 3
            r7 = r0 & 14
            r8 = r0 & 112(0x70, float:1.57E-43)
            r7 = r7 | r8
            r0 = r0 & 896(0x380, float:1.256E-42)
            r11 = r7 | r0
            r12 = 0
            r7 = r3
            r8 = r13
            r9 = r14
            r10 = r1
            androidx.compose.ui.layout.MeasurePolicy r0 = rowMeasurementHelper(r7, r8, r9, r10, r11, r12)
            int r7 = r4 << 3
            r7 = r7 & 112(0x70, float:1.57E-43)
            r8 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.startReplaceableGroup(r8)
            androidx.compose.runtime.ProvidableCompositionLocal r8 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r8 = r1.consume(r8)
            androidx.compose.ui.unit.Density r8 = (androidx.compose.p002ui.unit.Density) r8
            androidx.compose.runtime.ProvidableCompositionLocal r9 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r9 = r1.consume(r9)
            androidx.compose.ui.unit.LayoutDirection r9 = (androidx.compose.p002ui.unit.LayoutDirection) r9
            androidx.compose.runtime.ProvidableCompositionLocal r10 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r10 = r1.consume(r10)
            androidx.compose.ui.platform.ViewConfiguration r10 = (androidx.compose.p002ui.platform.ViewConfiguration) r10
            androidx.compose.ui.node.ComposeUiNode$Companion r11 = androidx.compose.p002ui.node.ComposeUiNode.Companion
            of.a r12 = r11.getConstructor()
            of.p r15 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r2)
            int r7 = r7 << 9
            r7 = r7 & 7168(0x1c00, float:1.0045E-41)
            r7 = r7 | 6
            r16 = r2
            androidx.compose.runtime.Applier r2 = r1.getApplier()
            boolean r2 = r2 instanceof androidx.compose.runtime.Applier
            if (r2 != 0) goto L_0x013b
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x013b:
            r1.startReusableNode()
            boolean r2 = r1.getInserting()
            if (r2 == 0) goto L_0x0148
            r1.createNode(r12)
            goto L_0x014b
        L_0x0148:
            r1.useNode()
        L_0x014b:
            r1.disableReusing()
            androidx.compose.runtime.Composer r2 = androidx.compose.runtime.Updater.m35292constructorimpl(r1)
            of.o r12 = r11.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r2, r0, r12)
            of.o r0 = r11.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r2, r8, r0)
            of.o r0 = r11.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r2, r9, r0)
            of.o r0 = r11.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r2, r10, r0)
            r1.enableReusing()
            androidx.compose.runtime.Composer r0 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r1)
            androidx.compose.runtime.SkippableUpdater r0 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r0)
            int r2 = r7 >> 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r15.invoke(r0, r1, r2)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.startReplaceableGroup(r0)
            androidx.compose.foundation.layout.RowScopeInstance r0 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE
            int r2 = r4 >> 9
            r2 = r2 & 112(0x70, float:1.57E-43)
            r2 = r2 | 6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.invoke(r0, r1, r2)
            r1.endReplaceableGroup()
            r1.endNode()
            r1.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01ab
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01ab:
            r2 = r3
            r10 = r13
            r4 = r14
            r3 = r16
        L_0x01b0:
            androidx.compose.runtime.ScopeUpdateScope r8 = r1.endRestartGroup()
            if (r8 != 0) goto L_0x01b7
            goto L_0x01c8
        L_0x01b7:
            androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2 r9 = new androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
            r0 = r9
            r1 = r3
            r3 = r10
            r5 = r20
            r6 = r22
            r7 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.updateScope(r9)
        L_0x01c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.FlowRow(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Vertical, int, of.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.foundation.layout.FlowResult breakDownItems(androidx.compose.p002ui.layout.MeasureScope r22, androidx.compose.foundation.layout.RowColumnMeasurementHelper r23, androidx.compose.foundation.layout.LayoutOrientation r24, androidx.compose.foundation.layout.OrientationIndependentConstraints r25, int r26) {
        /*
            r6 = r22
            r0 = r24
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.C12775o.m28639i(r6, r1)
            java.lang.String r1 = "measureHelper"
            r7 = r23
            kotlin.jvm.internal.C12775o.m28639i(r7, r1)
            java.lang.String r1 = "orientation"
            kotlin.jvm.internal.C12775o.m28639i(r0, r1)
            java.lang.String r1 = "constraints"
            r8 = r25
            kotlin.jvm.internal.C12775o.m28639i(r8, r1)
            androidx.compose.runtime.collection.MutableVector r9 = new androidx.compose.runtime.collection.MutableVector
            r1 = 16
            androidx.compose.foundation.layout.RowColumnMeasureHelperResult[] r1 = new androidx.compose.foundation.layout.RowColumnMeasureHelperResult[r1]
            r2 = 0
            r9.<init>(r1, r2)
            int r1 = r25.getMainAxisMax()
            int r3 = r25.getMainAxisMin()
            int r4 = r25.getCrossAxisMax()
            java.util.List r5 = r23.getMeasurables()
            androidx.compose.ui.layout.Placeable[] r10 = r23.getPlaceables()
            float r11 = r23.m33309getArrangementSpacingD9Ej5fM()
            float r11 = r6.m38449toPx0680j_4(r11)
            double r11 = (double) r11
            double r11 = java.lang.Math.ceil(r11)
            float r11 = (float) r11
            int r11 = (int) r11
            androidx.compose.foundation.layout.OrientationIndependentConstraints r12 = new androidx.compose.foundation.layout.OrientationIndependentConstraints
            r12.<init>(r3, r1, r2, r4)
            java.lang.Object r4 = kotlin.collections.C12686e0.m28224c0(r5, r2)
            androidx.compose.ui.layout.Measurable r4 = (androidx.compose.p002ui.layout.Measurable) r4
            if (r4 == 0) goto L_0x0064
            androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$nextSize$1 r14 = new androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$nextSize$1
            r14.<init>(r10)
            int r4 = measureAndCache(r4, r12, r0, r14)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0065
        L_0x0064:
            r4 = 0
        L_0x0065:
            int r14 = r5.size()
            java.lang.Integer[] r15 = new java.lang.Integer[r14]
            int r14 = r5.size()
            r18 = r1
            r13 = r2
            r17 = r13
            r19 = r17
            r20 = r19
        L_0x0078:
            if (r13 >= r14) goto L_0x00e9
            kotlin.jvm.internal.C12775o.m28636f(r4)
            int r4 = r4.intValue()
            int r2 = r17 + r4
            int r18 = r18 - r4
            int r4 = r13 + 1
            java.lang.Object r17 = kotlin.collections.C12686e0.m28224c0(r5, r4)
            r21 = r1
            r1 = r17
            androidx.compose.ui.layout.Measurable r1 = (androidx.compose.p002ui.layout.Measurable) r1
            if (r1 == 0) goto L_0x00a2
            androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$1 r6 = new androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$1
            r6.<init>(r10, r13)
            int r1 = measureAndCache(r1, r12, r0, r6)
            int r1 = r1 + r11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x00a3
        L_0x00a2:
            r1 = 0
        L_0x00a3:
            int r6 = r5.size()
            if (r4 >= r6) goto L_0x00bf
            int r6 = r4 - r19
            r13 = r26
            if (r6 >= r13) goto L_0x00c1
            if (r1 == 0) goto L_0x00b6
            int r6 = r1.intValue()
            goto L_0x00b7
        L_0x00b6:
            r6 = 0
        L_0x00b7:
            int r6 = r18 - r6
            if (r6 >= 0) goto L_0x00bc
            goto L_0x00c1
        L_0x00bc:
            r17 = r2
            goto L_0x00e1
        L_0x00bf:
            r13 = r26
        L_0x00c1:
            int r2 = java.lang.Math.max(r3, r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r15[r20] = r3
            int r20 = r20 + 1
            if (r1 == 0) goto L_0x00d9
            int r1 = r1.intValue()
            int r1 = r1 - r11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x00da
        L_0x00d9:
            r1 = 0
        L_0x00da:
            r3 = r2
            r19 = r4
            r18 = r21
            r17 = 0
        L_0x00e1:
            r2 = 0
            r6 = r22
            r13 = r4
            r4 = r1
            r1 = r21
            goto L_0x0078
        L_0x00e9:
            r14 = 0
            r1 = 0
            r16 = 0
            r17 = 14
            r18 = 0
            r13 = r3
            r6 = r15
            r15 = r1
            androidx.compose.foundation.layout.OrientationIndependentConstraints r1 = androidx.compose.foundation.layout.OrientationIndependentConstraints.copy$default(r12, r13, r14, r15, r16, r17, r18)
            long r10 = r1.m33260toBoxConstraintsOenEA2s(r0)
            r0 = 0
            java.lang.Object r1 = kotlin.collections.C12710p.m28387O(r6, r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r4 = r0
            r13 = r4
            r14 = r13
            r12 = r1
            r15 = r3
        L_0x0108:
            if (r12 == 0) goto L_0x0135
            int r5 = r12.intValue()
            r0 = r23
            r1 = r22
            r2 = r10
            androidx.compose.foundation.layout.RowColumnMeasureHelperResult r0 = r0.m33310measureWithoutPlacing_EkL_Y(r1, r2, r4, r5)
            int r1 = r0.getCrossAxisSize()
            int r13 = r13 + r1
            int r1 = r0.getMainAxisSize()
            int r15 = java.lang.Math.max(r15, r1)
            r9.add(r0)
            int r4 = r12.intValue()
            int r14 = r14 + 1
            java.lang.Object r0 = kotlin.collections.C12710p.m28387O(r6, r14)
            r12 = r0
            java.lang.Integer r12 = (java.lang.Integer) r12
            goto L_0x0108
        L_0x0135:
            int r0 = r25.getCrossAxisMin()
            int r0 = java.lang.Math.max(r13, r0)
            int r1 = r25.getMainAxisMin()
            int r1 = java.lang.Math.max(r15, r1)
            androidx.compose.foundation.layout.FlowResult r2 = new androidx.compose.foundation.layout.FlowResult
            r2.<init>(r1, r0, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.breakDownItems(androidx.compose.ui.layout.MeasureScope, androidx.compose.foundation.layout.RowColumnMeasurementHelper, androidx.compose.foundation.layout.LayoutOrientation, androidx.compose.foundation.layout.OrientationIndependentConstraints, int):androidx.compose.foundation.layout.FlowResult");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: androidx.compose.foundation.layout.CrossAxisAlignment} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final androidx.compose.p002ui.layout.MeasurePolicy columnMeasurementHelper(androidx.compose.foundation.layout.Arrangement.Vertical r7, androidx.compose.p002ui.Alignment.Horizontal r8, int r9, androidx.compose.runtime.Composer r10, int r11, int r12) {
        /*
            r0 = -2013098357(0xffffffff88028e8b, float:-3.928801E-34)
            r10.startReplaceableGroup(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0010
            androidx.compose.foundation.layout.Arrangement r7 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            androidx.compose.foundation.layout.Arrangement$Vertical r7 = r7.getTop()
        L_0x0010:
            r12 = r12 & 2
            if (r12 == 0) goto L_0x001a
            androidx.compose.ui.Alignment$Companion r8 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment$Horizontal r8 = r8.getStart()
        L_0x001a:
            boolean r12 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r12 == 0) goto L_0x0026
            r12 = -1
            java.lang.String r1 = "androidx.compose.foundation.layout.columnMeasurementHelper (FlowLayout.kt:181)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r11, r12, r1)
        L_0x0026:
            r11 = r11 & 14
            of.r r1 = mainAxisColumnArrangement(r7, r10, r11)
            r11 = 1157296644(0x44faf204, float:2007.563)
            r10.startReplaceableGroup(r11)
            boolean r11 = r10.changed((java.lang.Object) r8)
            java.lang.Object r12 = r10.rememberedValue()
            if (r11 != 0) goto L_0x0044
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r11 = r11.getEmpty()
            if (r12 != r11) goto L_0x004d
        L_0x0044:
            androidx.compose.foundation.layout.CrossAxisAlignment$Companion r11 = androidx.compose.foundation.layout.CrossAxisAlignment.Companion
            androidx.compose.foundation.layout.CrossAxisAlignment r12 = r11.horizontal$foundation_layout_release(r8)
            r10.updateRememberedValue(r12)
        L_0x004d:
            r10.endReplaceableGroup()
            r4 = r12
            androidx.compose.foundation.layout.CrossAxisAlignment r4 = (androidx.compose.foundation.layout.CrossAxisAlignment) r4
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r12 = 1618982084(0x607fb4c4, float:7.370227E19)
            r10.startReplaceableGroup(r12)
            boolean r12 = r10.changed((java.lang.Object) r7)
            boolean r8 = r10.changed((java.lang.Object) r8)
            r8 = r8 | r12
            boolean r11 = r10.changed((java.lang.Object) r11)
            r8 = r8 | r11
            java.lang.Object r11 = r10.rememberedValue()
            if (r8 != 0) goto L_0x0079
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r8 = r8.getEmpty()
            if (r11 != r8) goto L_0x008b
        L_0x0079:
            androidx.compose.foundation.layout.LayoutOrientation r0 = androidx.compose.foundation.layout.LayoutOrientation.Vertical
            float r2 = r7.m33207getSpacingD9Ej5fM()
            of.q<java.lang.Integer, int[], androidx.compose.ui.layout.MeasureScope, int[], ef.v> r5 = crossAxisColumnArrangement
            androidx.compose.foundation.layout.SizeMode r3 = androidx.compose.foundation.layout.SizeMode.Wrap
            r6 = r9
            androidx.compose.ui.layout.MeasurePolicy r11 = m33238flowMeasurePolicy942rkJo(r0, r1, r2, r3, r4, r5, r6)
            r10.updateRememberedValue(r11)
        L_0x008b:
            r10.endReplaceableGroup()
            androidx.compose.ui.layout.MeasurePolicy r11 = (androidx.compose.p002ui.layout.MeasurePolicy) r11
            boolean r7 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r7 == 0) goto L_0x0099
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0099:
            r10.endReplaceableGroup()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.columnMeasurementHelper(androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Horizontal, int, androidx.compose.runtime.Composer, int, int):androidx.compose.ui.layout.MeasurePolicy");
    }

    public static final int crossAxisMin(Measurable measurable, LayoutOrientation layoutOrientation, int i) {
        C12775o.m28639i(measurable, "<this>");
        C12775o.m28639i(layoutOrientation, "orientation");
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return measurable.minIntrinsicHeight(i);
        }
        return measurable.minIntrinsicWidth(i);
    }

    public static final int crossAxisSize(Placeable placeable, LayoutOrientation layoutOrientation) {
        C12775o.m28639i(placeable, "<this>");
        C12775o.m28639i(layoutOrientation, "orientation");
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return placeable.getHeight();
        }
        return placeable.getWidth();
    }

    /* renamed from: flowMeasurePolicy-942rkJo  reason: not valid java name */
    private static final MeasurePolicy m33238flowMeasurePolicy942rkJo(LayoutOrientation layoutOrientation, C13091r<? super Integer, ? super int[], ? super LayoutDirection, ? super Density, ? super int[], C11921v> rVar, float f, SizeMode sizeMode, CrossAxisAlignment crossAxisAlignment, C13090q<? super Integer, ? super int[], ? super MeasureScope, ? super int[], C11921v> qVar, int i) {
        return new FlowLayoutKt$flowMeasurePolicy$1(layoutOrientation, rVar, f, sizeMode, crossAxisAlignment, i, qVar);
    }

    private static final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, int[] iArr, int[] iArr2, int i, int i2, int i3) {
        return intrinsicCrossAxisSize(list, (C13089p<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer>) new FlowLayoutKt$intrinsicCrossAxisSize$1(iArr), (C13089p<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer>) new FlowLayoutKt$intrinsicCrossAxisSize$2(iArr2), i, i2, i3);
    }

    @Composable
    private static final C13091r<Integer, int[], LayoutDirection, Density, int[], C11921v> mainAxisColumnArrangement(Arrangement.Vertical vertical, Composer composer, int i) {
        composer.startReplaceableGroup(-1642644113);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1642644113, i, -1, "androidx.compose.foundation.layout.mainAxisColumnArrangement (FlowLayout.kt:134)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed((Object) vertical);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new FlowLayoutKt$mainAxisColumnArrangement$1$1(vertical);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        C13091r<Integer, int[], LayoutDirection, Density, int[], C11921v> rVar = (C13091r) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rVar;
    }

    public static final int mainAxisMin(Measurable measurable, LayoutOrientation layoutOrientation, int i) {
        C12775o.m28639i(measurable, "<this>");
        C12775o.m28639i(layoutOrientation, "orientation");
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return measurable.minIntrinsicWidth(i);
        }
        return measurable.minIntrinsicHeight(i);
    }

    @Composable
    private static final C13091r<Integer, int[], LayoutDirection, Density, int[], C11921v> mainAxisRowArrangement(Arrangement.Horizontal horizontal, Composer composer, int i) {
        composer.startReplaceableGroup(746410833);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(746410833, i, -1, "androidx.compose.foundation.layout.mainAxisRowArrangement (FlowLayout.kt:123)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed((Object) horizontal);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new FlowLayoutKt$mainAxisRowArrangement$1$1(horizontal);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        C13091r<Integer, int[], LayoutDirection, Density, int[], C11921v> rVar = (C13091r) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rVar;
    }

    public static final int mainAxisSize(Placeable placeable, LayoutOrientation layoutOrientation) {
        C12775o.m28639i(placeable, "<this>");
        C12775o.m28639i(layoutOrientation, "orientation");
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return placeable.getWidth();
        }
        return placeable.getHeight();
    }

    /* access modifiers changed from: private */
    public static final int maxIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, C13089p<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> pVar, int i, int i2, int i3) {
        int size = list.size();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i4 < size) {
            int intValue = pVar.invoke((IntrinsicMeasurable) list.get(i4), Integer.valueOf(i4), Integer.valueOf(i)).intValue() + i2;
            int i8 = i4 + 1;
            if (i8 - i6 == i3 || i8 == list.size()) {
                i5 = Math.max(i5, i7 + intValue);
                i7 = 0;
                i6 = i4;
            } else {
                i7 += intValue;
            }
            i4 = i8;
        }
        return i5;
    }

    private static final int measureAndCache(Measurable measurable, OrientationIndependentConstraints orientationIndependentConstraints, LayoutOrientation layoutOrientation, Function1<? super Placeable, C11921v> function1) {
        boolean z;
        if (RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(measurable)) == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return mainAxisMin(measurable, layoutOrientation, Integer.MAX_VALUE);
        }
        Placeable r8 = measurable.m37365measureBRTryo0(OrientationIndependentConstraints.copy$default(orientationIndependentConstraints, 0, 0, 0, 0, 14, (Object) null).m33260toBoxConstraintsOenEA2s(layoutOrientation));
        function1.invoke(r8);
        return mainAxisSize(r8, layoutOrientation);
    }

    /* access modifiers changed from: private */
    public static final int minIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, C13089p<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> pVar, C13089p<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> pVar2, int i, int i2, int i3) {
        boolean z;
        boolean z2;
        int size = list.size();
        int[] iArr = new int[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr[i4] = 0;
        }
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        for (int i5 = 0; i5 < size2; i5++) {
            iArr2[i5] = 0;
        }
        int size3 = list.size();
        for (int i6 = 0; i6 < size3; i6++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i6);
            int intValue = pVar.invoke(intrinsicMeasurable, Integer.valueOf(i6), Integer.valueOf(i)).intValue();
            iArr[i6] = intValue;
            iArr2[i6] = pVar2.invoke(intrinsicMeasurable, Integer.valueOf(i6), Integer.valueOf(intValue)).intValue();
        }
        int d0 = C12710p.m28402d0(iArr);
        if (size2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int i7 = iArr2[0];
            C12703l0 r = new C13528f(1, C12710p.m28384L(iArr2)).iterator();
            while (r.hasNext()) {
                int i8 = iArr2[r.nextInt()];
                if (i7 < i8) {
                    i7 = i8;
                }
            }
            if (size == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                int i9 = iArr[0];
                C12703l0 r2 = new C13528f(1, C12710p.m28384L(iArr)).iterator();
                while (r2.hasNext()) {
                    int i10 = iArr[r2.nextInt()];
                    if (i9 < i10) {
                        i9 = i10;
                    }
                }
                int i11 = d0;
                while (i9 < d0 && i7 != i) {
                    i11 = (i9 + d0) / 2;
                    i7 = intrinsicCrossAxisSize(list, iArr, iArr2, i11, i2, i3);
                    if (i7 == i) {
                        return i11;
                    }
                    if (i7 > i) {
                        i9 = i11 + 1;
                    } else {
                        d0 = i11 - 1;
                    }
                }
                return i11;
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: androidx.compose.foundation.layout.CrossAxisAlignment} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final androidx.compose.p002ui.layout.MeasurePolicy rowMeasurementHelper(androidx.compose.foundation.layout.Arrangement.Horizontal r7, androidx.compose.p002ui.Alignment.Vertical r8, int r9, androidx.compose.runtime.Composer r10, int r11, int r12) {
        /*
            r0 = 1479255111(0x582ba447, float:7.5488822E14)
            r10.startReplaceableGroup(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0010
            androidx.compose.foundation.layout.Arrangement r7 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            androidx.compose.foundation.layout.Arrangement$Horizontal r7 = r7.getEnd()
        L_0x0010:
            r12 = r12 & 2
            if (r12 == 0) goto L_0x001a
            androidx.compose.ui.Alignment$Companion r8 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment$Vertical r8 = r8.getTop()
        L_0x001a:
            boolean r12 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r12 == 0) goto L_0x0026
            r12 = -1
            java.lang.String r1 = "androidx.compose.foundation.layout.rowMeasurementHelper (FlowLayout.kt:158)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r11, r12, r1)
        L_0x0026:
            r11 = r11 & 14
            of.r r1 = mainAxisRowArrangement(r7, r10, r11)
            r11 = 1157296644(0x44faf204, float:2007.563)
            r10.startReplaceableGroup(r11)
            boolean r11 = r10.changed((java.lang.Object) r8)
            java.lang.Object r12 = r10.rememberedValue()
            if (r11 != 0) goto L_0x0044
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r11 = r11.getEmpty()
            if (r12 != r11) goto L_0x004d
        L_0x0044:
            androidx.compose.foundation.layout.CrossAxisAlignment$Companion r11 = androidx.compose.foundation.layout.CrossAxisAlignment.Companion
            androidx.compose.foundation.layout.CrossAxisAlignment r12 = r11.vertical$foundation_layout_release(r8)
            r10.updateRememberedValue(r12)
        L_0x004d:
            r10.endReplaceableGroup()
            r4 = r12
            androidx.compose.foundation.layout.CrossAxisAlignment r4 = (androidx.compose.foundation.layout.CrossAxisAlignment) r4
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r12 = 1618982084(0x607fb4c4, float:7.370227E19)
            r10.startReplaceableGroup(r12)
            boolean r12 = r10.changed((java.lang.Object) r7)
            boolean r8 = r10.changed((java.lang.Object) r8)
            r8 = r8 | r12
            boolean r11 = r10.changed((java.lang.Object) r11)
            r8 = r8 | r11
            java.lang.Object r11 = r10.rememberedValue()
            if (r8 != 0) goto L_0x0079
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r8 = r8.getEmpty()
            if (r11 != r8) goto L_0x008b
        L_0x0079:
            androidx.compose.foundation.layout.LayoutOrientation r0 = androidx.compose.foundation.layout.LayoutOrientation.Horizontal
            float r2 = r7.m33193getSpacingD9Ej5fM()
            androidx.compose.foundation.layout.SizeMode r3 = androidx.compose.foundation.layout.SizeMode.Wrap
            of.q<java.lang.Integer, int[], androidx.compose.ui.layout.MeasureScope, int[], ef.v> r5 = crossAxisRowArrangement
            r6 = r9
            androidx.compose.ui.layout.MeasurePolicy r11 = m33238flowMeasurePolicy942rkJo(r0, r1, r2, r3, r4, r5, r6)
            r10.updateRememberedValue(r11)
        L_0x008b:
            r10.endReplaceableGroup()
            androidx.compose.ui.layout.MeasurePolicy r11 = (androidx.compose.p002ui.layout.MeasurePolicy) r11
            boolean r7 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r7 == 0) goto L_0x0099
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0099:
            r10.endReplaceableGroup()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.rowMeasurementHelper(androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Vertical, int, androidx.compose.runtime.Composer, int, int):androidx.compose.ui.layout.MeasurePolicy");
    }

    /* access modifiers changed from: private */
    public static final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, C13089p<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> pVar, C13089p<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> pVar2, int i, int i2, int i3) {
        List<? extends IntrinsicMeasurable> list2 = list;
        C13089p<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> pVar3 = pVar;
        C13089p<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> pVar4 = pVar2;
        if (list.isEmpty()) {
            return 0;
        }
        Object c0 = C12686e0.m28224c0(list2, 0);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) c0;
        int intValue = intrinsicMeasurable != null ? pVar4.invoke(intrinsicMeasurable, 0, Integer.valueOf(i)).intValue() : 0;
        int intValue2 = intrinsicMeasurable != null ? pVar3.invoke(intrinsicMeasurable, 0, Integer.valueOf(intValue)).intValue() : 0;
        int size = list.size();
        int i4 = i;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i5 < size) {
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) list2.get(i5);
            C12775o.m28636f(c0);
            i4 -= intValue2;
            int max = Math.max(i7, intValue);
            i5++;
            Object c02 = C12686e0.m28224c0(list2, i5);
            IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) c02;
            int intValue3 = intrinsicMeasurable3 != null ? pVar4.invoke(intrinsicMeasurable3, Integer.valueOf(i5), Integer.valueOf(i)).intValue() : 0;
            int intValue4 = intrinsicMeasurable3 != null ? pVar3.invoke(intrinsicMeasurable3, Integer.valueOf(i5), Integer.valueOf(intValue3)).intValue() + i2 : 0;
            if (i4 < 0 || i5 == list.size()) {
                int i9 = i3;
            } else if (i5 - i8 != i3 && i4 - intValue4 >= 0) {
                int i10 = intValue3;
                i7 = max;
                c0 = c02;
                intValue2 = intValue4;
                intValue = i10;
            }
            i6 += max;
            intValue4 -= i2;
            i4 = i;
            max = 0;
            i8 = i5;
            int i102 = intValue3;
            i7 = max;
            c0 = c02;
            intValue2 = intValue4;
            intValue = i102;
        }
        return i6;
    }
}
