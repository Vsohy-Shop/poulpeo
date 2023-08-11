package androidx.compose.material;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.input.pointer.PointerInputScope;
import androidx.compose.p002ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.layout.LayoutCoordinatesKt;
import androidx.compose.p002ui.semantics.SemanticsModifierKt;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13074a;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nExposedDropdownMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material/ExposedDropdownMenuKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,731:1\n76#2:732\n76#2:733\n76#2:788\n25#3:734\n25#3:741\n25#3:749\n67#3,3:756\n66#3:759\n25#3:766\n50#3:773\n49#3:774\n460#3,13:800\n473#3,3:814\n50#3:819\n49#3:820\n1114#4,6:735\n1114#4,6:742\n1114#4,6:750\n1114#4,6:760\n1114#4,6:767\n1114#4,6:775\n1114#4,6:821\n1#5:748\n67#6,6:781\n73#6:813\n77#6:818\n75#7:787\n76#7,11:789\n89#7:817\n76#8:827\n102#8,2:828\n76#8:830\n102#8,2:831\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material/ExposedDropdownMenuKt\n*L\n94#1:732\n95#1:733\n116#1:788\n96#1:734\n97#1:741\n99#1:749\n101#1:756,3\n101#1:759\n114#1:766\n128#1:773\n128#1:774\n116#1:800,13\n116#1:814,3\n135#1:819\n135#1:820\n96#1:735,6\n97#1:742,6\n99#1:750,6\n101#1:760,6\n114#1:767,6\n128#1:775,6\n135#1:821,6\n116#1:781,6\n116#1:813\n116#1:818\n116#1:787\n116#1:789,11\n116#1:817\n96#1:827\n96#1:828,2\n97#1:830\n97#1:831,2\n*E\n"})
/* compiled from: ExposedDropdownMenu.kt */
public final class ExposedDropdownMenuKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: androidx.compose.ui.Modifier$Companion} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void ExposedDropdownMenuBox(boolean r20, kotlin.jvm.functions.Function1<? super java.lang.Boolean, p336ef.C11921v> r21, androidx.compose.p002ui.Modifier r22, p404of.C13089p<? super androidx.compose.material.ExposedDropdownMenuBoxScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r23, androidx.compose.runtime.Composer r24, int r25, int r26) {
        /*
            r1 = r20
            r2 = r21
            r4 = r23
            r5 = r25
            java.lang.String r0 = "onExpandedChange"
            kotlin.jvm.internal.C12775o.m28639i(r2, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r4, r0)
            r0 = 1456052980(0x56c99af4, float:1.10833678E14)
            r3 = r24
            androidx.compose.runtime.Composer r3 = r3.startRestartGroup(r0)
            r6 = r26 & 1
            r7 = 2
            if (r6 == 0) goto L_0x0023
            r6 = r5 | 6
            goto L_0x0033
        L_0x0023:
            r6 = r5 & 14
            if (r6 != 0) goto L_0x0032
            boolean r6 = r3.changed((boolean) r1)
            if (r6 == 0) goto L_0x002f
            r6 = 4
            goto L_0x0030
        L_0x002f:
            r6 = r7
        L_0x0030:
            r6 = r6 | r5
            goto L_0x0033
        L_0x0032:
            r6 = r5
        L_0x0033:
            r8 = r26 & 2
            if (r8 == 0) goto L_0x003a
            r6 = r6 | 48
            goto L_0x004a
        L_0x003a:
            r8 = r5 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x004a
            boolean r8 = r3.changedInstance(r2)
            if (r8 == 0) goto L_0x0047
            r8 = 32
            goto L_0x0049
        L_0x0047:
            r8 = 16
        L_0x0049:
            r6 = r6 | r8
        L_0x004a:
            r8 = r26 & 4
            if (r8 == 0) goto L_0x0051
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x0064
        L_0x0051:
            r9 = r5 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x0064
            r9 = r22
            boolean r10 = r3.changed((java.lang.Object) r9)
            if (r10 == 0) goto L_0x0060
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r6 = r6 | r10
            goto L_0x0066
        L_0x0064:
            r9 = r22
        L_0x0066:
            r10 = r26 & 8
            if (r10 == 0) goto L_0x006d
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x007d
        L_0x006d:
            r10 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x007d
            boolean r10 = r3.changedInstance(r4)
            if (r10 == 0) goto L_0x007a
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x007c
        L_0x007a:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x007c:
            r6 = r6 | r10
        L_0x007d:
            r10 = r6 & 5851(0x16db, float:8.199E-42)
            r11 = 1170(0x492, float:1.64E-42)
            if (r10 != r11) goto L_0x008f
            boolean r10 = r3.getSkipping()
            if (r10 != 0) goto L_0x008a
            goto L_0x008f
        L_0x008a:
            r3.skipToGroupEnd()
            goto L_0x02c5
        L_0x008f:
            if (r8 == 0) goto L_0x0094
            androidx.compose.ui.Modifier$Companion r8 = androidx.compose.p002ui.Modifier.Companion
            r9 = r8
        L_0x0094:
            boolean r8 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r8 == 0) goto L_0x00a0
            r8 = -1
            java.lang.String r10 = "androidx.compose.material.ExposedDropdownMenuBox (ExposedDropdownMenu.kt:87)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r6, r8, r10)
        L_0x00a0:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r0 = r3.consume(r0)
            androidx.compose.ui.unit.Density r0 = (androidx.compose.p002ui.unit.Density) r0
            androidx.compose.runtime.ProvidableCompositionLocal r8 = androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt.getLocalView()
            java.lang.Object r8 = r3.consume(r8)
            android.view.View r8 = (android.view.View) r8
            r10 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r3.startReplaceableGroup(r10)
            java.lang.Object r11 = r3.rememberedValue()
            androidx.compose.runtime.Composer$Companion r16 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r12 = r16.getEmpty()
            r13 = 0
            r15 = 0
            if (r11 != r12) goto L_0x00d3
            java.lang.Integer r11 = java.lang.Integer.valueOf(r15)
            androidx.compose.runtime.MutableState r11 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r11, r13, r7, r13)
            r3.updateRememberedValue(r11)
        L_0x00d3:
            r3.endReplaceableGroup()
            r14 = r11
            androidx.compose.runtime.MutableState r14 = (androidx.compose.runtime.MutableState) r14
            r3.startReplaceableGroup(r10)
            java.lang.Object r11 = r3.rememberedValue()
            java.lang.Object r12 = r16.getEmpty()
            if (r11 != r12) goto L_0x00f1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r15)
            androidx.compose.runtime.MutableState r11 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r11, r13, r7, r13)
            r3.updateRememberedValue(r11)
        L_0x00f1:
            r3.endReplaceableGroup()
            r7 = r11
            androidx.compose.runtime.MutableState r7 = (androidx.compose.runtime.MutableState) r7
            float r11 = androidx.compose.material.MenuKt.getMenuVerticalMargin()
            int r13 = r0.m38443roundToPx0680j_4(r11)
            r3.startReplaceableGroup(r10)
            java.lang.Object r11 = r3.rememberedValue()
            java.lang.Object r12 = r16.getEmpty()
            if (r11 != r12) goto L_0x0114
            androidx.compose.ui.node.Ref r11 = new androidx.compose.ui.node.Ref
            r11.<init>()
            r3.updateRememberedValue(r11)
        L_0x0114:
            r3.endReplaceableGroup()
            r12 = r11
            androidx.compose.ui.node.Ref r12 = (androidx.compose.p002ui.node.Ref) r12
            int r11 = ExposedDropdownMenuBox$lambda$4(r7)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            int r17 = ExposedDropdownMenuBox$lambda$1(r14)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r17)
            r10 = 1618982084(0x607fb4c4, float:7.370227E19)
            r3.startReplaceableGroup(r10)
            boolean r10 = r3.changed((java.lang.Object) r0)
            boolean r11 = r3.changed((java.lang.Object) r11)
            r10 = r10 | r11
            boolean r11 = r3.changed((java.lang.Object) r15)
            r10 = r10 | r11
            java.lang.Object r11 = r3.rememberedValue()
            if (r10 != 0) goto L_0x014a
            java.lang.Object r10 = r16.getEmpty()
            if (r11 != r10) goto L_0x0152
        L_0x014a:
            androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1 r11 = new androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1
            r11.<init>(r0, r7, r14)
            r3.updateRememberedValue(r11)
        L_0x0152:
            r3.endReplaceableGroup()
            r0 = r11
            androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1 r0 = (androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1) r0
            r10 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r3.startReplaceableGroup(r10)
            java.lang.Object r10 = r3.rememberedValue()
            java.lang.Object r11 = r16.getEmpty()
            if (r10 != r11) goto L_0x0170
            androidx.compose.ui.focus.FocusRequester r10 = new androidx.compose.ui.focus.FocusRequester
            r10.<init>()
            r3.updateRememberedValue(r10)
        L_0x0170:
            r3.endReplaceableGroup()
            r15 = r10
            androidx.compose.ui.focus.FocusRequester r15 = (androidx.compose.p002ui.focus.FocusRequester) r15
            androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$1 r11 = new androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$1
            r10 = r11
            r5 = r11
            r11 = r12
            r18 = r12
            r12 = r8
            r24 = r13
            r22 = r0
            r17 = r8
            r8 = r15
            r0 = 0
            r15 = r7
            r10.<init>(r11, r12, r13, r14, r15)
            androidx.compose.ui.Modifier r5 = androidx.compose.p002ui.layout.OnGloballyPositionedModifierKt.onGloballyPositioned(r9, r5)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r20)
            r11 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r3.startReplaceableGroup(r11)
            boolean r12 = r3.changed((java.lang.Object) r2)
            boolean r10 = r3.changed((java.lang.Object) r10)
            r10 = r10 | r12
            java.lang.Object r12 = r3.rememberedValue()
            if (r10 != 0) goto L_0x01ad
            java.lang.Object r10 = r16.getEmpty()
            if (r12 != r10) goto L_0x01b5
        L_0x01ad:
            androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$2$1 r12 = new androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$2$1
            r12.<init>(r2, r1)
            r3.updateRememberedValue(r12)
        L_0x01b5:
            r3.endReplaceableGroup()
            of.a r12 = (p404of.C13074a) r12
            androidx.compose.material.Strings$Companion r10 = androidx.compose.material.Strings.Companion
            int r10 = r10.m34121getExposedDropdownMenuUdPEhr4()
            r13 = 6
            java.lang.String r10 = androidx.compose.material.Strings_androidKt.m34125getString4foXLRw(r10, r3, r13)
            androidx.compose.ui.Modifier r5 = expandable(r5, r12, r10)
            androidx.compose.ui.Modifier r5 = androidx.compose.p002ui.focus.FocusRequesterModifierKt.focusRequester(r5, r8)
            r10 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r3.startReplaceableGroup(r10)
            androidx.compose.ui.Alignment$Companion r10 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment r10 = r10.getTopStart()
            androidx.compose.ui.layout.MeasurePolicy r10 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r10, r0, r3, r0)
            r12 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r3.startReplaceableGroup(r12)
            androidx.compose.runtime.ProvidableCompositionLocal r12 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r12 = r3.consume(r12)
            androidx.compose.ui.unit.Density r12 = (androidx.compose.p002ui.unit.Density) r12
            androidx.compose.runtime.ProvidableCompositionLocal r14 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r14 = r3.consume(r14)
            androidx.compose.ui.unit.LayoutDirection r14 = (androidx.compose.p002ui.unit.LayoutDirection) r14
            androidx.compose.runtime.ProvidableCompositionLocal r15 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r15 = r3.consume(r15)
            androidx.compose.ui.platform.ViewConfiguration r15 = (androidx.compose.p002ui.platform.ViewConfiguration) r15
            androidx.compose.ui.node.ComposeUiNode$Companion r19 = androidx.compose.p002ui.node.ComposeUiNode.Companion
            of.a r11 = r19.getConstructor()
            of.p r5 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r5)
            androidx.compose.runtime.Applier r13 = r3.getApplier()
            boolean r13 = r13 instanceof androidx.compose.runtime.Applier
            if (r13 != 0) goto L_0x0216
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x0216:
            r3.startReusableNode()
            boolean r13 = r3.getInserting()
            if (r13 == 0) goto L_0x0223
            r3.createNode(r11)
            goto L_0x0226
        L_0x0223:
            r3.useNode()
        L_0x0226:
            r3.disableReusing()
            androidx.compose.runtime.Composer r11 = androidx.compose.runtime.Updater.m35292constructorimpl(r3)
            of.o r13 = r19.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r11, r10, r13)
            of.o r10 = r19.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r11, r12, r10)
            of.o r10 = r19.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r11, r14, r10)
            of.o r10 = r19.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r11, r15, r10)
            r3.enableReusing()
            androidx.compose.runtime.Composer r10 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r3)
            androidx.compose.runtime.SkippableUpdater r10 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r10)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            r5.invoke(r10, r3, r11)
            r5 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r3.startReplaceableGroup(r5)
            androidx.compose.foundation.layout.BoxScopeInstance r5 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            r5 = 6
            int r5 = r6 >> 6
            r5 = r5 & 112(0x70, float:1.57E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r11 = r22
            r4.invoke(r11, r3, r5)
            r3.endReplaceableGroup()
            r3.endNode()
            r3.endReplaceableGroup()
            r3.endReplaceableGroup()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r20)
            r6 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r3.startReplaceableGroup(r6)
            boolean r5 = r3.changed((java.lang.Object) r5)
            boolean r6 = r3.changed((java.lang.Object) r8)
            r5 = r5 | r6
            java.lang.Object r6 = r3.rememberedValue()
            if (r5 != 0) goto L_0x029c
            java.lang.Object r5 = r16.getEmpty()
            if (r6 != r5) goto L_0x02a4
        L_0x029c:
            androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$4$1 r6 = new androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$4$1
            r6.<init>(r1, r8)
            r3.updateRememberedValue(r6)
        L_0x02a4:
            r3.endReplaceableGroup()
            of.a r6 = (p404of.C13074a) r6
            androidx.compose.runtime.EffectsKt.SideEffect(r6, r3, r0)
            androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$5 r0 = new androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$5
            r5 = r24
            r8 = r17
            r11 = r18
            r0.<init>(r8, r11, r5, r7)
            r5 = 8
            androidx.compose.runtime.EffectsKt.DisposableEffect((java.lang.Object) r8, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) r0, (androidx.compose.runtime.Composer) r3, (int) r5)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x02c5
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x02c5:
            androidx.compose.runtime.ScopeUpdateScope r7 = r3.endRestartGroup()
            if (r7 != 0) goto L_0x02cc
            goto L_0x02e0
        L_0x02cc:
            androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$6 r8 = new androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$6
            r0 = r8
            r1 = r20
            r2 = r21
            r3 = r9
            r4 = r23
            r5 = r25
            r6 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.updateScope(r8)
        L_0x02e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ExposedDropdownMenuKt.ExposedDropdownMenuBox(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, of.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final int ExposedDropdownMenuBox$lambda$1(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* access modifiers changed from: private */
    public static final void ExposedDropdownMenuBox$lambda$2(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* access modifiers changed from: private */
    public static final int ExposedDropdownMenuBox$lambda$4(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* access modifiers changed from: private */
    public static final void ExposedDropdownMenuBox$lambda$5(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    private static final Modifier expandable(Modifier modifier, C13074a<C11921v> aVar, String str) {
        return SemanticsModifierKt.semantics$default(SuspendingPointerInputFilterKt.pointerInput(modifier, (Object) C11921v.f18618a, (C13088o<? super PointerInputScope, ? super C12074d<? super C11921v>, ? extends Object>) new ExposedDropdownMenuKt$expandable$1(aVar, (C12074d<? super ExposedDropdownMenuKt$expandable$1>) null)), false, new ExposedDropdownMenuKt$expandable$2(str, aVar), 1, (Object) null);
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
