package androidx.compose.material3;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.layout.LayoutCoordinatesKt;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function1;
import p336ef.C11921v;

/* compiled from: ExposedDropdownMenu.kt */
public final class ExposedDropdownMenuKt {
    /* access modifiers changed from: private */
    public static final float ExposedDropdownMenuItemHorizontalPadding = C1232Dp.m38468constructorimpl((float) 16);

    /* JADX WARNING: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02f7  */
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void ExposedDropdownMenuBox(boolean r23, kotlin.jvm.functions.Function1<? super java.lang.Boolean, p336ef.C11921v> r24, androidx.compose.p002ui.Modifier r25, p404of.C13089p<? super androidx.compose.material3.ExposedDropdownMenuBoxScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r26, androidx.compose.runtime.Composer r27, int r28, int r29) {
        /*
            r11 = r23
            r12 = r24
            r13 = r26
            r14 = r28
            java.lang.String r0 = "onExpandedChange"
            kotlin.jvm.internal.C12775o.m28639i(r12, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r13, r0)
            r0 = -1990697039(0xffffffff89585fb1, float:-2.6045048E-33)
            r1 = r27
            androidx.compose.runtime.Composer r15 = r1.startRestartGroup(r0)
            r1 = r29 & 1
            r10 = 2
            if (r1 == 0) goto L_0x0023
            r1 = r14 | 6
            goto L_0x0033
        L_0x0023:
            r1 = r14 & 14
            if (r1 != 0) goto L_0x0032
            boolean r1 = r15.changed((boolean) r11)
            if (r1 == 0) goto L_0x002f
            r1 = 4
            goto L_0x0030
        L_0x002f:
            r1 = r10
        L_0x0030:
            r1 = r1 | r14
            goto L_0x0033
        L_0x0032:
            r1 = r14
        L_0x0033:
            r3 = r29 & 2
            if (r3 == 0) goto L_0x003a
            r1 = r1 | 48
            goto L_0x004a
        L_0x003a:
            r3 = r14 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004a
            boolean r3 = r15.changed((java.lang.Object) r12)
            if (r3 == 0) goto L_0x0047
            r3 = 32
            goto L_0x0049
        L_0x0047:
            r3 = 16
        L_0x0049:
            r1 = r1 | r3
        L_0x004a:
            r3 = r29 & 4
            if (r3 == 0) goto L_0x0051
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0064
        L_0x0051:
            r4 = r14 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0064
            r4 = r25
            boolean r5 = r15.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x0060
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r1 = r1 | r5
            goto L_0x0066
        L_0x0064:
            r4 = r25
        L_0x0066:
            r5 = r29 & 8
            if (r5 == 0) goto L_0x006d
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007d
        L_0x006d:
            r5 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x007d
            boolean r5 = r15.changed((java.lang.Object) r13)
            if (r5 == 0) goto L_0x007a
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x007c
        L_0x007a:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x007c:
            r1 = r1 | r5
        L_0x007d:
            r8 = r1
            r1 = r8 & 5851(0x16db, float:8.199E-42)
            r5 = 1170(0x492, float:1.64E-42)
            if (r1 != r5) goto L_0x0091
            boolean r1 = r15.getSkipping()
            if (r1 != 0) goto L_0x008b
            goto L_0x0091
        L_0x008b:
            r15.skipToGroupEnd()
            r3 = r4
            goto L_0x02f0
        L_0x0091:
            if (r3 == 0) goto L_0x0098
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.p002ui.Modifier.Companion
            r16 = r1
            goto L_0x009a
        L_0x0098:
            r16 = r4
        L_0x009a:
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x00a6
            r1 = -1
            java.lang.String r3 = "androidx.compose.material3.ExposedDropdownMenuBox (ExposedDropdownMenu.kt:102)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r8, r1, r3)
        L_0x00a6:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r0 = r15.consume(r0)
            r7 = r0
            androidx.compose.ui.unit.Density r7 = (androidx.compose.p002ui.unit.Density) r7
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt.getLocalView()
            java.lang.Object r0 = r15.consume(r0)
            r6 = r0
            android.view.View r6 = (android.view.View) r6
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r15.startReplaceableGroup(r0)
            java.lang.Object r1 = r15.rememberedValue()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r4 = r3.getEmpty()
            r5 = 0
            r2 = 0
            if (r1 != r4) goto L_0x00db
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            androidx.compose.runtime.MutableState r1 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r1, r5, r10, r5)
            r15.updateRememberedValue(r1)
        L_0x00db:
            r15.endReplaceableGroup()
            r17 = r1
            androidx.compose.runtime.MutableState r17 = (androidx.compose.runtime.MutableState) r17
            r15.startReplaceableGroup(r0)
            java.lang.Object r1 = r15.rememberedValue()
            java.lang.Object r4 = r3.getEmpty()
            if (r1 != r4) goto L_0x00fa
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            androidx.compose.runtime.MutableState r1 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r1, r5, r10, r5)
            r15.updateRememberedValue(r1)
        L_0x00fa:
            r15.endReplaceableGroup()
            r5 = r1
            androidx.compose.runtime.MutableState r5 = (androidx.compose.runtime.MutableState) r5
            float r1 = androidx.compose.material3.MenuKt.getMenuVerticalMargin()
            int r4 = r7.m38443roundToPx0680j_4(r1)
            r15.startReplaceableGroup(r0)
            java.lang.Object r1 = r15.rememberedValue()
            java.lang.Object r9 = r3.getEmpty()
            if (r1 != r9) goto L_0x011d
            androidx.compose.ui.node.Ref r1 = new androidx.compose.ui.node.Ref
            r1.<init>()
            r15.updateRememberedValue(r1)
        L_0x011d:
            r15.endReplaceableGroup()
            r9 = r1
            androidx.compose.ui.node.Ref r9 = (androidx.compose.p002ui.node.Ref) r9
            r15.startReplaceableGroup(r0)
            java.lang.Object r0 = r15.rememberedValue()
            java.lang.Object r1 = r3.getEmpty()
            if (r0 != r1) goto L_0x0138
            androidx.compose.ui.focus.FocusRequester r0 = new androidx.compose.ui.focus.FocusRequester
            r0.<init>()
            r15.updateRememberedValue(r0)
        L_0x0138:
            r15.endReplaceableGroup()
            r3 = r0
            androidx.compose.ui.focus.FocusRequester r3 = (androidx.compose.p002ui.focus.FocusRequester) r3
            r0 = 5
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r23)
            r1[r2] = r18
            r18 = 1
            r1[r18] = r12
            r1[r10] = r7
            int r18 = m34421ExposedDropdownMenuBox$lambda4(r5)
            java.lang.Integer r18 = java.lang.Integer.valueOf(r18)
            r19 = 3
            r1[r19] = r18
            int r18 = m34419ExposedDropdownMenuBox$lambda1(r17)
            java.lang.Integer r18 = java.lang.Integer.valueOf(r18)
            r19 = 4
            r1[r19] = r18
            r2 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r15.startReplaceableGroup(r2)
            r2 = 0
            r18 = 0
        L_0x016e:
            if (r2 >= r0) goto L_0x017c
            r0 = r1[r2]
            boolean r0 = r15.changed((java.lang.Object) r0)
            r18 = r18 | r0
            int r2 = r2 + 1
            r0 = 5
            goto L_0x016e
        L_0x017c:
            java.lang.Object r0 = r15.rememberedValue()
            if (r18 != 0) goto L_0x0199
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r0 != r1) goto L_0x018b
            goto L_0x0199
        L_0x018b:
            r25 = r3
            r27 = r4
            r18 = r5
            r19 = r6
            r21 = r8
            r22 = r9
            r14 = 0
            goto L_0x01c3
        L_0x0199:
            androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1 r2 = new androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1
            r0 = r2
            r1 = r23
            r12 = r2
            r14 = 0
            r2 = r24
            r25 = r3
            r3 = r8
            r27 = r4
            r4 = r25
            r18 = r5
            r5 = r9
            r19 = r6
            r20 = r7
            r7 = r27
            r21 = r8
            r8 = r17
            r22 = r9
            r9 = r18
            r10 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r15.updateRememberedValue(r12)
            r0 = r12
        L_0x01c3:
            r15.endReplaceableGroup()
            androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1 r0 = (androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1) r0
            int r1 = r21 >> 6
            r2 = r1 & 14
            r3 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r15.startReplaceableGroup(r3)
            androidx.compose.ui.Alignment$Companion r3 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment r3 = r3.getTopStart()
            int r4 = r2 >> 3
            r5 = r4 & 14
            r4 = r4 & 112(0x70, float:1.57E-43)
            r4 = r4 | r5
            androidx.compose.ui.layout.MeasurePolicy r3 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r3, r14, r15, r4)
            int r4 = r2 << 3
            r4 = r4 & 112(0x70, float:1.57E-43)
            r5 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15.startReplaceableGroup(r5)
            androidx.compose.runtime.ProvidableCompositionLocal r5 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r5 = r15.consume(r5)
            androidx.compose.ui.unit.Density r5 = (androidx.compose.p002ui.unit.Density) r5
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r6 = r15.consume(r6)
            androidx.compose.ui.unit.LayoutDirection r6 = (androidx.compose.p002ui.unit.LayoutDirection) r6
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r7 = r15.consume(r7)
            androidx.compose.ui.platform.ViewConfiguration r7 = (androidx.compose.p002ui.platform.ViewConfiguration) r7
            androidx.compose.ui.node.ComposeUiNode$Companion r8 = androidx.compose.p002ui.node.ComposeUiNode.Companion
            of.a r9 = r8.getConstructor()
            of.p r10 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r16)
            int r4 = r4 << 9
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 | 6
            androidx.compose.runtime.Applier r12 = r15.getApplier()
            boolean r12 = r12 instanceof androidx.compose.runtime.Applier
            if (r12 != 0) goto L_0x0226
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x0226:
            r15.startReusableNode()
            boolean r12 = r15.getInserting()
            if (r12 == 0) goto L_0x0233
            r15.createNode(r9)
            goto L_0x0236
        L_0x0233:
            r15.useNode()
        L_0x0236:
            r15.disableReusing()
            androidx.compose.runtime.Composer r9 = androidx.compose.runtime.Updater.m35292constructorimpl(r15)
            of.o r12 = r8.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r9, r3, r12)
            of.o r3 = r8.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r9, r5, r3)
            of.o r3 = r8.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r9, r6, r3)
            of.o r3 = r8.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r9, r7, r3)
            r15.enableReusing()
            androidx.compose.runtime.Composer r3 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r15)
            androidx.compose.runtime.SkippableUpdater r3 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r3)
            int r5 = r4 >> 3
            r5 = r5 & 112(0x70, float:1.57E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r10.invoke(r3, r15, r5)
            r3 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r15.startReplaceableGroup(r3)
            int r3 = r4 >> 9
            r3 = r3 & 14
            r4 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r15.startReplaceableGroup(r4)
            r3 = r3 & 11
            r4 = 2
            if (r3 != r4) goto L_0x028f
            boolean r3 = r15.getSkipping()
            if (r3 != 0) goto L_0x028b
            goto L_0x028f
        L_0x028b:
            r15.skipToGroupEnd()
            goto L_0x02ba
        L_0x028f:
            androidx.compose.foundation.layout.BoxScopeInstance r3 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            int r2 = r2 >> 6
            r2 = r2 & 112(0x70, float:1.57E-43)
            r2 = r2 | 6
            r3 = -738793417(0xffffffffd3f6e837, float:-2.12091575E12)
            r15.startReplaceableGroup(r3)
            r2 = r2 & 81
            r3 = 16
            if (r2 != r3) goto L_0x02ae
            boolean r2 = r15.getSkipping()
            if (r2 != 0) goto L_0x02aa
            goto L_0x02ae
        L_0x02aa:
            r15.skipToGroupEnd()
            goto L_0x02b7
        L_0x02ae:
            r1 = r1 & 112(0x70, float:1.57E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r13.invoke(r0, r15, r1)
        L_0x02b7:
            r15.endReplaceableGroup()
        L_0x02ba:
            r15.endReplaceableGroup()
            r15.endReplaceableGroup()
            r15.endNode()
            r15.endReplaceableGroup()
            r15.endReplaceableGroup()
            androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$2 r0 = new androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$2
            r1 = r25
            r0.<init>(r11, r1)
            androidx.compose.runtime.EffectsKt.SideEffect(r0, r15, r14)
            androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$3 r0 = new androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$3
            r3 = r27
            r2 = r18
            r1 = r19
            r4 = r22
            r0.<init>(r1, r4, r3, r2)
            r2 = 8
            androidx.compose.runtime.EffectsKt.DisposableEffect((java.lang.Object) r1, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) r0, (androidx.compose.runtime.Composer) r15, (int) r2)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x02ee
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x02ee:
            r3 = r16
        L_0x02f0:
            androidx.compose.runtime.ScopeUpdateScope r7 = r15.endRestartGroup()
            if (r7 != 0) goto L_0x02f7
            goto L_0x030a
        L_0x02f7:
            androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$4 r8 = new androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$4
            r0 = r8
            r1 = r23
            r2 = r24
            r4 = r26
            r5 = r28
            r6 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.updateScope(r8)
        L_0x030a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExposedDropdownMenuKt.ExposedDropdownMenuBox(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, of.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: ExposedDropdownMenuBox$lambda-1  reason: not valid java name */
    public static final int m34419ExposedDropdownMenuBox$lambda1(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: ExposedDropdownMenuBox$lambda-2  reason: not valid java name */
    public static final void m34420ExposedDropdownMenuBox$lambda2(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: ExposedDropdownMenuBox$lambda-4  reason: not valid java name */
    public static final int m34421ExposedDropdownMenuBox$lambda4(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: ExposedDropdownMenuBox$lambda-5  reason: not valid java name */
    public static final void m34422ExposedDropdownMenuBox$lambda5(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b2, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L_0x00b4;
     */
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p002ui.Modifier expandable(androidx.compose.p002ui.Modifier r14, boolean r15, p404of.C13074a<p336ef.C11921v> r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, androidx.compose.runtime.Composer r20, int r21, int r22) {
        /*
            r5 = r16
            r6 = r20
            r0 = 1006563320(0x3bfeeff8, float:0.0077800713)
            r6.startReplaceableGroup(r0)
            r1 = r22 & 4
            r2 = 6
            if (r1 == 0) goto L_0x001b
            androidx.compose.material3.Strings$Companion r1 = androidx.compose.material3.Strings.Companion
            int r1 = r1.m34588getExposedDropdownMenuadMyvUU()
            java.lang.String r1 = androidx.compose.material3.Strings_androidKt.m34594getStringNWtq28(r1, r6, r2)
            r4 = r1
            goto L_0x001d
        L_0x001b:
            r4 = r17
        L_0x001d:
            r1 = r22 & 8
            if (r1 == 0) goto L_0x002d
            androidx.compose.material3.Strings$Companion r1 = androidx.compose.material3.Strings.Companion
            int r1 = r1.m34590getMenuExpandedadMyvUU()
            java.lang.String r1 = androidx.compose.material3.Strings_androidKt.m34594getStringNWtq28(r1, r6, r2)
            r3 = r1
            goto L_0x002f
        L_0x002d:
            r3 = r18
        L_0x002f:
            r1 = r22 & 16
            if (r1 == 0) goto L_0x003f
            androidx.compose.material3.Strings$Companion r1 = androidx.compose.material3.Strings.Companion
            int r1 = r1.m34589getMenuCollapsedadMyvUU()
            java.lang.String r1 = androidx.compose.material3.Strings_androidKt.m34594getStringNWtq28(r1, r6, r2)
            r7 = r1
            goto L_0x0041
        L_0x003f:
            r7 = r19
        L_0x0041:
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x004f
            r1 = -1
            java.lang.String r2 = "androidx.compose.material3.expandable (ExposedDropdownMenu.kt:522)"
            r8 = r21
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r8, r1, r2)
        L_0x004f:
            ef.v r0 = p336ef.C11921v.f18618a
            r1 = 1157296644(0x44faf204, float:2007.563)
            r6.startReplaceableGroup(r1)
            boolean r1 = r6.changed((java.lang.Object) r5)
            java.lang.Object r2 = r20.rememberedValue()
            r8 = 0
            if (r1 != 0) goto L_0x006a
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r2 != r1) goto L_0x0072
        L_0x006a:
            androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1 r2 = new androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1
            r2.<init>(r5, r8)
            r6.updateRememberedValue(r2)
        L_0x0072:
            r20.endReplaceableGroup()
            of.o r2 = (p404of.C13088o) r2
            r1 = r14
            androidx.compose.ui.Modifier r9 = androidx.compose.p002ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput((androidx.compose.p002ui.Modifier) r14, (java.lang.Object) r0, (p404of.C13088o<? super androidx.compose.p002ui.input.pointer.PointerInputScope, ? super p355hf.C12074d<? super p336ef.C11921v>, ? extends java.lang.Object>) r2)
            r0 = 5
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r15)
            r10 = 0
            r1[r10] = r2
            r11 = 1
            r1[r11] = r3
            r2 = 2
            r1[r2] = r7
            r2 = 3
            r1[r2] = r4
            r2 = 4
            r1[r2] = r5
            r2 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r6.startReplaceableGroup(r2)
            r2 = r10
            r12 = r2
        L_0x009a:
            if (r2 >= r0) goto L_0x00a6
            r13 = r1[r2]
            boolean r13 = r6.changed((java.lang.Object) r13)
            r12 = r12 | r13
            int r2 = r2 + 1
            goto L_0x009a
        L_0x00a6:
            java.lang.Object r0 = r20.rememberedValue()
            if (r12 != 0) goto L_0x00b4
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r0 != r1) goto L_0x00c2
        L_0x00b4:
            androidx.compose.material3.ExposedDropdownMenuKt$expandable$2$1 r12 = new androidx.compose.material3.ExposedDropdownMenuKt$expandable$2$1
            r0 = r12
            r1 = r15
            r2 = r3
            r3 = r7
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            r6.updateRememberedValue(r12)
        L_0x00c2:
            r20.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            androidx.compose.ui.Modifier r0 = androidx.compose.p002ui.semantics.SemanticsModifierKt.semantics$default(r9, r10, r0, r11, r8)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x00d4
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x00d4:
            r20.endReplaceableGroup()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExposedDropdownMenuKt.expandable(androidx.compose.ui.Modifier, boolean, of.a, java.lang.String, java.lang.String, java.lang.String, androidx.compose.runtime.Composer, int, int):androidx.compose.ui.Modifier");
    }

    /* access modifiers changed from: private */
    public static final void updateHeight(View view, LayoutCoordinates layoutCoordinates, int i, Function1<? super Integer, C11921v> function1) {
        if (layoutCoordinates != null) {
            Rect rect = new Rect();
            view.getWindowVisibleDisplayFrame(rect);
            float top = LayoutCoordinatesKt.boundsInWindow(layoutCoordinates).getTop();
            int i2 = rect.top;
            function1.invoke(Integer.valueOf(((int) Math.max(top - ((float) i2), ((float) (rect.bottom - i2)) - LayoutCoordinatesKt.boundsInWindow(layoutCoordinates).getBottom())) - i));
        }
    }
}
