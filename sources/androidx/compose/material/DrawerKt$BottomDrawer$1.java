package androidx.compose.material;

import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;
import p466yf.C13995l0;

@SourceDebugExtension({"SMAP\nDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt$BottomDrawer$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,713:1\n36#2:714\n460#2,13:741\n36#2:755\n36#2:762\n473#2,3:769\n1114#3,6:715\n1114#3,6:756\n1114#3,6:763\n76#4:721\n76#4:729\n67#5,6:722\n73#5:754\n77#5:773\n75#6:728\n76#6,11:730\n89#6:772\n76#7:774\n102#7,2:775\n*S KotlinDebug\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt$BottomDrawer$1\n*L\n536#1:714\n577#1:741,13\n593#1:755\n594#1:762\n577#1:769,3\n536#1:715,6\n593#1:756,6\n594#1:763,6\n555#1:721\n577#1:729\n577#1:722,6\n577#1:754\n577#1:773\n577#1:728\n577#1:730,11\n577#1:772\n536#1:774\n536#1:775,2\n*E\n"})
/* compiled from: Drawer.kt */
final class DrawerKt$BottomDrawer$1 extends C12777p implements C13089p<BoxWithConstraintsScope, Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $content;
    final /* synthetic */ long $drawerBackgroundColor;
    final /* synthetic */ C13089p<ColumnScope, Composer, Integer, C11921v> $drawerContent;
    final /* synthetic */ long $drawerContentColor;
    final /* synthetic */ float $drawerElevation;
    final /* synthetic */ Shape $drawerShape;
    final /* synthetic */ BottomDrawerState $drawerState;
    final /* synthetic */ boolean $gesturesEnabled;
    final /* synthetic */ C13995l0 $scope;
    final /* synthetic */ long $scrimColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DrawerKt$BottomDrawer$1(boolean z, BottomDrawerState bottomDrawerState, C13088o<? super Composer, ? super Integer, C11921v> oVar, int i, long j, Shape shape, long j2, long j3, float f, C13995l0 l0Var, C13089p<? super ColumnScope, ? super Composer, ? super Integer, C11921v> pVar) {
        super(3);
        this.$gesturesEnabled = z;
        this.$drawerState = bottomDrawerState;
        this.$content = oVar;
        this.$$dirty = i;
        this.$scrimColor = j;
        this.$drawerShape = shape;
        this.$drawerBackgroundColor = j2;
        this.$drawerContentColor = j3;
        this.$drawerElevation = f;
        this.$scope = l0Var;
        this.$drawerContent = pVar;
    }

    private static final float invoke$lambda$1(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    /* access modifiers changed from: private */
    public static final void invoke$lambda$2(MutableState<Float> mutableState, float f) {
        mutableState.setValue(Float.valueOf(f));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return C11921v.f18618a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: androidx.compose.runtime.MutableState} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.foundation.layout.BoxWithConstraintsScope r28, androidx.compose.runtime.Composer r29, int r30) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r13 = r29
            r2 = r30
            java.lang.String r3 = "$this$BoxWithConstraints"
            kotlin.jvm.internal.C12775o.m28639i(r1, r3)
            r3 = r2 & 14
            r4 = 2
            if (r3 != 0) goto L_0x001d
            boolean r3 = r13.changed((java.lang.Object) r1)
            if (r3 == 0) goto L_0x001a
            r3 = 4
            goto L_0x001b
        L_0x001a:
            r3 = r4
        L_0x001b:
            r3 = r3 | r2
            goto L_0x001e
        L_0x001d:
            r3 = r2
        L_0x001e:
            r3 = r3 & 91
            r5 = 18
            if (r3 != r5) goto L_0x0030
            boolean r3 = r29.getSkipping()
            if (r3 != 0) goto L_0x002b
            goto L_0x0030
        L_0x002b:
            r29.skipToGroupEnd()
            goto L_0x02ea
        L_0x0030:
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x003f
            r3 = -1
            java.lang.String r5 = "androidx.compose.material.BottomDrawer.<anonymous> (Drawer.kt:533)"
            r6 = 1220102512(0x48b94970, float:379467.5)
            androidx.compose.runtime.ComposerKt.traceEventStart(r6, r2, r3, r5)
        L_0x003f:
            long r2 = r28.m33222getConstraintsmsEJaDk()
            int r2 = androidx.compose.p002ui.unit.Constraints.m38411getMaxHeightimpl(r2)
            float r2 = (float) r2
            java.lang.Float r3 = java.lang.Float.valueOf(r2)
            r7 = 1157296644(0x44faf204, float:2007.563)
            r13.startReplaceableGroup(r7)
            boolean r3 = r13.changed((java.lang.Object) r3)
            java.lang.Object r5 = r29.rememberedValue()
            r8 = 0
            if (r3 != 0) goto L_0x0065
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            if (r5 != r3) goto L_0x0070
        L_0x0065:
            java.lang.Float r3 = java.lang.Float.valueOf(r2)
            androidx.compose.runtime.MutableState r5 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r3, r8, r4, r8)
            r13.updateRememberedValue(r5)
        L_0x0070:
            r29.endReplaceableGroup()
            r9 = r5
            androidx.compose.runtime.MutableState r9 = (androidx.compose.runtime.MutableState) r9
            long r5 = r28.m33222getConstraintsmsEJaDk()
            int r3 = androidx.compose.p002ui.unit.Constraints.m38412getMaxWidthimpl(r5)
            long r5 = r28.m33222getConstraintsmsEJaDk()
            int r5 = androidx.compose.p002ui.unit.Constraints.m38411getMaxHeightimpl(r5)
            r10 = 1
            r11 = 0
            if (r3 <= r5) goto L_0x008c
            r3 = r10
            goto L_0x008d
        L_0x008c:
            r3 = r11
        L_0x008d:
            r5 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r2
            float r6 = invoke$lambda$1(r9)
            float r6 = r2 - r6
            r12 = 0
            float r6 = java.lang.Math.max(r12, r6)
            float r12 = invoke$lambda$1(r9)
            int r12 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r12 < 0) goto L_0x00d2
            if (r3 == 0) goto L_0x00a6
            goto L_0x00d2
        L_0x00a6:
            r3 = 3
            ef.l[] r3 = new p336ef.C11906l[r3]
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            androidx.compose.material.BottomDrawerValue r12 = androidx.compose.material.BottomDrawerValue.Closed
            ef.l r2 = p336ef.C11915r.m25707a(r2, r12)
            r3[r11] = r2
            java.lang.Float r2 = java.lang.Float.valueOf(r5)
            androidx.compose.material.BottomDrawerValue r5 = androidx.compose.material.BottomDrawerValue.Open
            ef.l r2 = p336ef.C11915r.m25707a(r2, r5)
            r3[r10] = r2
            java.lang.Float r2 = java.lang.Float.valueOf(r6)
            androidx.compose.material.BottomDrawerValue r5 = androidx.compose.material.BottomDrawerValue.Expanded
            ef.l r2 = p336ef.C11915r.m25707a(r2, r5)
            r3[r4] = r2
            java.util.Map r2 = kotlin.collections.C12716r0.m28419j(r3)
            goto L_0x00f0
        L_0x00d2:
            ef.l[] r3 = new p336ef.C11906l[r4]
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            androidx.compose.material.BottomDrawerValue r5 = androidx.compose.material.BottomDrawerValue.Closed
            ef.l r2 = p336ef.C11915r.m25707a(r2, r5)
            r3[r11] = r2
            java.lang.Float r2 = java.lang.Float.valueOf(r6)
            androidx.compose.material.BottomDrawerValue r5 = androidx.compose.material.BottomDrawerValue.Expanded
            ef.l r2 = p336ef.C11915r.m25707a(r2, r5)
            r3[r10] = r2
            java.util.Map r2 = kotlin.collections.C12716r0.m28419j(r3)
        L_0x00f0:
            r16 = r2
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r2 = r13.consume(r2)
            androidx.compose.ui.unit.Density r2 = (androidx.compose.p002ui.unit.Density) r2
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.p002ui.Modifier.Companion
            r18 = 0
            r19 = 0
            long r5 = r28.m33222getConstraintsmsEJaDk()
            int r5 = androidx.compose.p002ui.unit.Constraints.m38412getMaxWidthimpl(r5)
            float r20 = r2.m38446toDpu2uoSUM((int) r5)
            long r5 = r28.m33222getConstraintsmsEJaDk()
            int r1 = androidx.compose.p002ui.unit.Constraints.m38411getMaxHeightimpl(r5)
            float r21 = r2.m38446toDpu2uoSUM((int) r1)
            r22 = 3
            r23 = 0
            r17 = r3
            androidx.compose.ui.Modifier r12 = androidx.compose.foundation.layout.SizeKt.m33342sizeInqDBjuR0$default(r17, r18, r19, r20, r21, r22, r23)
            boolean r1 = r0.$gesturesEnabled
            if (r1 == 0) goto L_0x0133
            androidx.compose.material.BottomDrawerState r1 = r0.$drawerState
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r1 = r1.getNestedScrollConnection$material_release()
            androidx.compose.ui.Modifier r1 = androidx.compose.p002ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll$default(r3, r1, r8, r4, r8)
            goto L_0x0134
        L_0x0133:
            r1 = r3
        L_0x0134:
            androidx.compose.ui.Modifier r14 = r3.then(r1)
            androidx.compose.material.BottomDrawerState r15 = r0.$drawerState
            androidx.compose.foundation.gestures.Orientation r17 = androidx.compose.foundation.gestures.Orientation.Vertical
            boolean r1 = r0.$gesturesEnabled
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 368(0x170, float:5.16E-43)
            r25 = 0
            r18 = r1
            androidx.compose.ui.Modifier r1 = androidx.compose.material.SwipeableKt.m34140swipeablepPrIpRY$default(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            of.o<androidx.compose.runtime.Composer, java.lang.Integer, ef.v> r2 = r0.$content
            int r14 = r0.$$dirty
            long r3 = r0.$scrimColor
            androidx.compose.material.BottomDrawerState r15 = r0.$drawerState
            androidx.compose.ui.graphics.Shape r6 = r0.$drawerShape
            r16 = r9
            long r8 = r0.$drawerBackgroundColor
            r18 = r8
            long r7 = r0.$drawerContentColor
            float r9 = r0.$drawerElevation
            boolean r5 = r0.$gesturesEnabled
            yf.l0 r10 = r0.$scope
            of.p<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, ef.v> r11 = r0.$drawerContent
            r0 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r13.startReplaceableGroup(r0)
            androidx.compose.ui.Alignment$Companion r0 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment r0 = r0.getTopStart()
            r22 = r6
            r6 = 0
            androidx.compose.ui.layout.MeasurePolicy r0 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r0, r6, r13, r6)
            r6 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r13.startReplaceableGroup(r6)
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r6 = r13.consume(r6)
            androidx.compose.ui.unit.Density r6 = (androidx.compose.p002ui.unit.Density) r6
            r23 = r9
            androidx.compose.runtime.ProvidableCompositionLocal r9 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r9 = r13.consume(r9)
            androidx.compose.ui.unit.LayoutDirection r9 = (androidx.compose.p002ui.unit.LayoutDirection) r9
            r24 = r7
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r7 = r13.consume(r7)
            androidx.compose.ui.platform.ViewConfiguration r7 = (androidx.compose.p002ui.platform.ViewConfiguration) r7
            androidx.compose.ui.node.ComposeUiNode$Companion r8 = androidx.compose.p002ui.node.ComposeUiNode.Companion
            r28 = r11
            of.a r11 = r8.getConstructor()
            of.p r1 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r1)
            r26 = r12
            androidx.compose.runtime.Applier r12 = r29.getApplier()
            boolean r12 = r12 instanceof androidx.compose.runtime.Applier
            if (r12 != 0) goto L_0x01c0
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x01c0:
            r29.startReusableNode()
            boolean r12 = r29.getInserting()
            if (r12 == 0) goto L_0x01cd
            r13.createNode(r11)
            goto L_0x01d0
        L_0x01cd:
            r29.useNode()
        L_0x01d0:
            r29.disableReusing()
            androidx.compose.runtime.Composer r11 = androidx.compose.runtime.Updater.m35292constructorimpl(r29)
            of.o r12 = r8.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r11, r0, r12)
            of.o r0 = r8.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r11, r6, r0)
            of.o r0 = r8.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r11, r9, r0)
            of.o r0 = r8.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r11, r7, r0)
            r29.enableReusing()
            androidx.compose.runtime.Composer r0 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r29)
            androidx.compose.runtime.SkippableUpdater r0 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r0)
            r6 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r1.invoke(r0, r13, r7)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r13.startReplaceableGroup(r0)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            int r0 = r14 >> 27
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.invoke(r13, r0)
            androidx.compose.material.DrawerKt$BottomDrawer$1$1$1 r0 = new androidx.compose.material.DrawerKt$BottomDrawer$1$1$1
            r0.<init>(r5, r15, r10)
            java.lang.Object r1 = r15.getTargetValue()
            androidx.compose.material.BottomDrawerValue r2 = androidx.compose.material.BottomDrawerValue.Closed
            if (r1 == r2) goto L_0x0228
            r5 = 1
            goto L_0x0229
        L_0x0228:
            r5 = 0
        L_0x0229:
            int r1 = r14 >> 24
            r6 = r1 & 14
            r1 = r3
            r3 = r0
            r4 = r5
            r5 = r29
            r0 = r22
            androidx.compose.material.DrawerKt.m33994BottomDrawerScrim3JVO9M(r1, r3, r4, r5, r6)
            androidx.compose.material.Strings$Companion r1 = androidx.compose.material.Strings.Companion
            int r1 = r1.m34122getNavigationMenuUdPEhr4()
            r2 = 6
            java.lang.String r1 = androidx.compose.material.Strings_androidKt.m34125getString4foXLRw(r1, r13, r2)
            r2 = 1157296644(0x44faf204, float:2007.563)
            r13.startReplaceableGroup(r2)
            boolean r2 = r13.changed((java.lang.Object) r15)
            java.lang.Object r3 = r29.rememberedValue()
            if (r2 != 0) goto L_0x025a
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r3 != r2) goto L_0x0262
        L_0x025a:
            androidx.compose.material.DrawerKt$BottomDrawer$1$1$2$1 r3 = new androidx.compose.material.DrawerKt$BottomDrawer$1$1$2$1
            r3.<init>(r15)
            r13.updateRememberedValue(r3)
        L_0x0262:
            r29.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r2 = r26
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.OffsetKt.offset(r2, r3)
            r3 = 1157296644(0x44faf204, float:2007.563)
            r13.startReplaceableGroup(r3)
            r5 = r16
            boolean r3 = r13.changed((java.lang.Object) r5)
            java.lang.Object r4 = r29.rememberedValue()
            if (r3 != 0) goto L_0x0287
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            if (r4 != r3) goto L_0x028f
        L_0x0287:
            androidx.compose.material.DrawerKt$BottomDrawer$1$1$3$1 r4 = new androidx.compose.material.DrawerKt$BottomDrawer$1$1$3$1
            r4.<init>(r5)
            r13.updateRememberedValue(r4)
        L_0x028f:
            r29.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            androidx.compose.ui.Modifier r2 = androidx.compose.p002ui.layout.OnGloballyPositionedModifierKt.onGloballyPositioned(r2, r4)
            androidx.compose.material.DrawerKt$BottomDrawer$1$1$4 r3 = new androidx.compose.material.DrawerKt$BottomDrawer$1$1$4
            r3.<init>(r1, r15, r10)
            r1 = 0
            r4 = 1
            r5 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.p002ui.semantics.SemanticsModifierKt.semantics$default(r2, r5, r3, r4, r1)
            r7 = 0
            androidx.compose.material.DrawerKt$BottomDrawer$1$1$5 r2 = new androidx.compose.material.DrawerKt$BottomDrawer$1$1$5
            r3 = r28
            r2.<init>(r3, r14)
            r3 = 457750254(0x1b48b6ee, float:1.660272E-22)
            androidx.compose.runtime.internal.ComposableLambda r9 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r13, r3, r4, r2)
            int r2 = r14 >> 9
            r2 = r2 & 112(0x70, float:1.57E-43)
            r3 = 1572864(0x180000, float:2.204052E-39)
            r2 = r2 | r3
            int r3 = r14 >> 12
            r4 = r3 & 896(0x380, float:1.256E-42)
            r2 = r2 | r4
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r14
            r11 = r2 | r3
            r12 = 16
            r2 = r0
            r3 = r18
            r5 = r24
            r8 = r23
            r10 = r29
            androidx.compose.material.SurfaceKt.m34127SurfaceFjzlyU(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            r29.endReplaceableGroup()
            r29.endNode()
            r29.endReplaceableGroup()
            r29.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x02ea
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x02ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt$BottomDrawer$1.invoke(androidx.compose.foundation.layout.BoxWithConstraintsScope, androidx.compose.runtime.Composer, int):void");
    }
}
