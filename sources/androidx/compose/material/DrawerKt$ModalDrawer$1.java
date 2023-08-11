package androidx.compose.material;

import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;
import p466yf.C13995l0;

@SourceDebugExtension({"SMAP\nDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt$ModalDrawer$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n*L\n1#1,713:1\n76#2:714\n76#2:730\n76#2:764\n76#2:805\n50#3:715\n49#3:716\n460#3,13:742\n460#3,13:776\n473#3,3:790\n67#3,3:795\n66#3:798\n36#3:806\n473#3,3:813\n1114#4,6:717\n1114#4,6:799\n1114#4,6:807\n67#5,6:723\n73#5:755\n66#5,7:756\n73#5:789\n77#5:794\n77#5:817\n75#6:729\n76#6,11:731\n75#6:763\n76#6,11:765\n89#6:793\n89#6:816\n*S KotlinDebug\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt$ModalDrawer$1\n*L\n409#1:714\n410#1:730\n428#1:764\n448#1:805\n421#1:715\n421#1:716\n410#1:742,13\n428#1:776,13\n428#1:790,3\n441#1:795,3\n441#1:798\n457#1:806\n410#1:813,3\n421#1:717,6\n441#1:799,6\n457#1:807,6\n410#1:723,6\n410#1:755\n428#1:756,7\n428#1:789\n428#1:794\n410#1:817\n410#1:729\n410#1:731,11\n428#1:763\n428#1:765,11\n428#1:793\n410#1:816\n*E\n"})
/* compiled from: Drawer.kt */
final class DrawerKt$ModalDrawer$1 extends C12777p implements C13089p<BoxWithConstraintsScope, Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $content;
    final /* synthetic */ long $drawerBackgroundColor;
    final /* synthetic */ C13089p<ColumnScope, Composer, Integer, C11921v> $drawerContent;
    final /* synthetic */ long $drawerContentColor;
    final /* synthetic */ float $drawerElevation;
    final /* synthetic */ Shape $drawerShape;
    final /* synthetic */ DrawerState $drawerState;
    final /* synthetic */ boolean $gesturesEnabled;
    final /* synthetic */ C13995l0 $scope;
    final /* synthetic */ long $scrimColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DrawerKt$ModalDrawer$1(DrawerState drawerState, boolean z, int i, long j, Shape shape, long j2, long j3, float f, C13088o<? super Composer, ? super Integer, C11921v> oVar, C13995l0 l0Var, C13089p<? super ColumnScope, ? super Composer, ? super Integer, C11921v> pVar) {
        super(3);
        this.$drawerState = drawerState;
        this.$gesturesEnabled = z;
        this.$$dirty = i;
        this.$scrimColor = j;
        this.$drawerShape = shape;
        this.$drawerBackgroundColor = j2;
        this.$drawerContentColor = j3;
        this.$drawerElevation = f;
        this.$content = oVar;
        this.$scope = l0Var;
        this.$drawerContent = pVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return C11921v.f18618a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v0, resolved type: of.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: of.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.foundation.layout.BoxWithConstraintsScope r33, androidx.compose.runtime.Composer r34, int r35) {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            r13 = r34
            r2 = r35
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
            boolean r3 = r34.getSkipping()
            if (r3 != 0) goto L_0x002b
            goto L_0x0030
        L_0x002b:
            r34.skipToGroupEnd()
            goto L_0x034e
        L_0x0030:
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x003f
            r3 = -1
            java.lang.String r5 = "androidx.compose.material.ModalDrawer.<anonymous> (Drawer.kt:398)"
            r6 = 816674999(0x30ad78b7, float:1.2621716E-9)
            androidx.compose.runtime.ComposerKt.traceEventStart(r6, r2, r3, r5)
        L_0x003f:
            long r8 = r33.m33222getConstraintsmsEJaDk()
            boolean r1 = androidx.compose.p002ui.unit.Constraints.m38408getHasBoundedWidthimpl(r8)
            if (r1 == 0) goto L_0x034f
            int r1 = androidx.compose.p002ui.unit.Constraints.m38412getMaxWidthimpl(r8)
            float r1 = (float) r1
            float r1 = -r1
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r2 = r13.consume(r2)
            androidx.compose.ui.unit.LayoutDirection r3 = androidx.compose.p002ui.unit.LayoutDirection.Rtl
            r10 = 1
            r11 = 0
            if (r2 != r3) goto L_0x0060
            r18 = r10
            goto L_0x0062
        L_0x0060:
            r18 = r11
        L_0x0062:
            androidx.compose.ui.Modifier$Companion r12 = androidx.compose.p002ui.Modifier.Companion
            androidx.compose.material.DrawerState r2 = r0.$drawerState
            androidx.compose.material.SwipeableV2State r15 = r2.getSwipeableState$material_release()
            androidx.compose.foundation.gestures.Orientation r16 = androidx.compose.foundation.gestures.Orientation.Horizontal
            boolean r2 = r0.$gesturesEnabled
            r19 = 0
            r20 = 16
            r21 = 0
            r14 = r12
            r17 = r2
            androidx.compose.ui.Modifier r22 = androidx.compose.material.SwipeableV2Kt.swipeableV2$default(r14, r15, r16, r17, r18, r19, r20, r21)
            androidx.compose.material.DrawerState r2 = r0.$drawerState
            androidx.compose.material.SwipeableV2State r23 = r2.getSwipeableState$material_release()
            androidx.compose.material.DrawerValue[] r2 = new androidx.compose.material.DrawerValue[r4]
            androidx.compose.material.DrawerValue r3 = androidx.compose.material.DrawerValue.Closed
            r2[r11] = r3
            androidx.compose.material.DrawerValue r3 = androidx.compose.material.DrawerValue.Open
            r2[r10] = r3
            java.util.Set r24 = kotlin.collections.C12731y0.m28555i(r2)
            r25 = 0
            java.lang.Float r2 = java.lang.Float.valueOf(r1)
            r3 = 0
            java.lang.Float r4 = java.lang.Float.valueOf(r3)
            r5 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r13.startReplaceableGroup(r5)
            boolean r2 = r13.changed((java.lang.Object) r2)
            boolean r4 = r13.changed((java.lang.Object) r4)
            r2 = r2 | r4
            java.lang.Object r4 = r34.rememberedValue()
            if (r2 != 0) goto L_0x00b7
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r4 != r2) goto L_0x00bf
        L_0x00b7:
            androidx.compose.material.DrawerKt$ModalDrawer$1$1$1 r4 = new androidx.compose.material.DrawerKt$ModalDrawer$1$1$1
            r4.<init>(r1, r3)
            r13.updateRememberedValue(r4)
        L_0x00bf:
            r34.endReplaceableGroup()
            r26 = r4
            of.o r26 = (p404of.C13088o) r26
            r27 = 4
            r28 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.material.SwipeableV2Kt.swipeAnchors$default(r22, r23, r24, r25, r26, r27, r28)
            androidx.compose.material.DrawerState r14 = r0.$drawerState
            int r15 = r0.$$dirty
            long r4 = r0.$scrimColor
            androidx.compose.ui.graphics.Shape r7 = r0.$drawerShape
            r16 = r4
            long r3 = r0.$drawerBackgroundColor
            long r5 = r0.$drawerContentColor
            float r10 = r0.$drawerElevation
            of.o<androidx.compose.runtime.Composer, java.lang.Integer, ef.v> r11 = r0.$content
            r19 = r3
            boolean r3 = r0.$gesturesEnabled
            yf.l0 r4 = r0.$scope
            r21 = r10
            of.p<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, ef.v> r10 = r0.$drawerContent
            r0 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r13.startReplaceableGroup(r0)
            androidx.compose.ui.Alignment$Companion r22 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment r0 = r22.getTopStart()
            r24 = r5
            r5 = 0
            androidx.compose.ui.layout.MeasurePolicy r0 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r0, r5, r13, r5)
            r5 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r13.startReplaceableGroup(r5)
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r6 = r13.consume(r6)
            androidx.compose.ui.unit.Density r6 = (androidx.compose.p002ui.unit.Density) r6
            androidx.compose.runtime.ProvidableCompositionLocal r5 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r5 = r13.consume(r5)
            androidx.compose.ui.unit.LayoutDirection r5 = (androidx.compose.p002ui.unit.LayoutDirection) r5
            r27 = r7
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r7 = r13.consume(r7)
            androidx.compose.ui.platform.ViewConfiguration r7 = (androidx.compose.p002ui.platform.ViewConfiguration) r7
            androidx.compose.ui.node.ComposeUiNode$Companion r28 = androidx.compose.p002ui.node.ComposeUiNode.Companion
            r29 = r10
            of.a r10 = r28.getConstructor()
            of.p r2 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r2)
            r30 = r8
            androidx.compose.runtime.Applier r8 = r34.getApplier()
            boolean r8 = r8 instanceof androidx.compose.runtime.Applier
            if (r8 != 0) goto L_0x013c
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x013c:
            r34.startReusableNode()
            boolean r8 = r34.getInserting()
            if (r8 == 0) goto L_0x0149
            r13.createNode(r10)
            goto L_0x014c
        L_0x0149:
            r34.useNode()
        L_0x014c:
            r34.disableReusing()
            androidx.compose.runtime.Composer r8 = androidx.compose.runtime.Updater.m35292constructorimpl(r34)
            of.o r9 = r28.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r8, r0, r9)
            of.o r0 = r28.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r8, r6, r0)
            of.o r0 = r28.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r8, r5, r0)
            of.o r0 = r28.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r8, r7, r0)
            r34.enableReusing()
            androidx.compose.runtime.Composer r0 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r34)
            androidx.compose.runtime.SkippableUpdater r0 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r0)
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r2.invoke(r0, r13, r6)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r13.startReplaceableGroup(r0)
            androidx.compose.foundation.layout.BoxScopeInstance r2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            r2 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r13.startReplaceableGroup(r2)
            androidx.compose.ui.Alignment r2 = r22.getTopStart()
            androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r2, r5, r13, r5)
            r5 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r13.startReplaceableGroup(r5)
            androidx.compose.runtime.ProvidableCompositionLocal r5 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r5 = r13.consume(r5)
            androidx.compose.ui.unit.Density r5 = (androidx.compose.p002ui.unit.Density) r5
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r6 = r13.consume(r6)
            androidx.compose.ui.unit.LayoutDirection r6 = (androidx.compose.p002ui.unit.LayoutDirection) r6
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r7 = r13.consume(r7)
            androidx.compose.ui.platform.ViewConfiguration r7 = (androidx.compose.p002ui.platform.ViewConfiguration) r7
            of.a r8 = r28.getConstructor()
            of.p r9 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r12)
            androidx.compose.runtime.Applier r10 = r34.getApplier()
            boolean r10 = r10 instanceof androidx.compose.runtime.Applier
            if (r10 != 0) goto L_0x01cf
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x01cf:
            r34.startReusableNode()
            boolean r10 = r34.getInserting()
            if (r10 == 0) goto L_0x01dc
            r13.createNode(r8)
            goto L_0x01df
        L_0x01dc:
            r34.useNode()
        L_0x01df:
            r34.disableReusing()
            androidx.compose.runtime.Composer r8 = androidx.compose.runtime.Updater.m35292constructorimpl(r34)
            of.o r10 = r28.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r8, r2, r10)
            of.o r2 = r28.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r8, r5, r2)
            of.o r2 = r28.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r8, r6, r2)
            of.o r2 = r28.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r8, r7, r2)
            r34.enableReusing()
            androidx.compose.runtime.Composer r2 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r34)
            androidx.compose.runtime.SkippableUpdater r2 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r2)
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r9.invoke(r2, r13, r6)
            r13.startReplaceableGroup(r0)
            int r0 = r15 >> 27
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11.invoke(r13, r0)
            r34.endReplaceableGroup()
            r34.endNode()
            r34.endReplaceableGroup()
            r34.endReplaceableGroup()
            boolean r0 = r14.isOpen()
            androidx.compose.material.DrawerKt$ModalDrawer$1$2$2 r2 = new androidx.compose.material.DrawerKt$ModalDrawer$1$2$2
            r2.<init>(r3, r14, r4)
            java.lang.Float r3 = java.lang.Float.valueOf(r1)
            r5 = 0
            java.lang.Float r6 = java.lang.Float.valueOf(r5)
            r5 = 1618982084(0x607fb4c4, float:7.370227E19)
            r13.startReplaceableGroup(r5)
            boolean r3 = r13.changed((java.lang.Object) r3)
            boolean r5 = r13.changed((java.lang.Object) r6)
            r3 = r3 | r5
            boolean r5 = r13.changed((java.lang.Object) r14)
            r3 = r3 | r5
            java.lang.Object r5 = r34.rememberedValue()
            if (r3 != 0) goto L_0x0263
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            if (r5 != r3) goto L_0x026c
        L_0x0263:
            androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1 r5 = new androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1
            r3 = 0
            r5.<init>(r1, r3, r14)
            r13.updateRememberedValue(r5)
        L_0x026c:
            r34.endReplaceableGroup()
            r3 = r5
            of.a r3 = (p404of.C13074a) r3
            int r1 = r15 >> 15
            r7 = r1 & 7168(0x1c00, float:1.0045E-41)
            r1 = r0
            r8 = r19
            r0 = r4
            r10 = r24
            r4 = r16
            r6 = r34
            r16 = r27
            androidx.compose.material.DrawerKt.m33996ScrimBx497Mc(r1, r2, r3, r4, r6, r7)
            androidx.compose.material.Strings$Companion r1 = androidx.compose.material.Strings.Companion
            int r1 = r1.m34122getNavigationMenuUdPEhr4()
            r2 = 6
            java.lang.String r1 = androidx.compose.material.Strings_androidKt.m34125getString4foXLRw(r1, r13, r2)
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r2 = r13.consume(r2)
            androidx.compose.ui.unit.Density r2 = (androidx.compose.p002ui.unit.Density) r2
            int r3 = androidx.compose.p002ui.unit.Constraints.m38414getMinWidthimpl(r30)
            float r3 = r2.m38446toDpu2uoSUM((int) r3)
            int r4 = androidx.compose.p002ui.unit.Constraints.m38413getMinHeightimpl(r30)
            float r4 = r2.m38446toDpu2uoSUM((int) r4)
            int r5 = androidx.compose.p002ui.unit.Constraints.m38412getMaxWidthimpl(r30)
            float r5 = r2.m38446toDpu2uoSUM((int) r5)
            int r6 = androidx.compose.p002ui.unit.Constraints.m38411getMaxHeightimpl(r30)
            float r2 = r2.m38446toDpu2uoSUM((int) r6)
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.m33341sizeInqDBjuR0(r12, r3, r4, r5, r2)
            r3 = 1157296644(0x44faf204, float:2007.563)
            r13.startReplaceableGroup(r3)
            boolean r3 = r13.changed((java.lang.Object) r14)
            java.lang.Object r4 = r34.rememberedValue()
            if (r3 != 0) goto L_0x02d6
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            if (r4 != r3) goto L_0x02de
        L_0x02d6:
            androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1 r4 = new androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1
            r4.<init>(r14)
            r13.updateRememberedValue(r4)
        L_0x02de:
            r34.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            androidx.compose.ui.Modifier r22 = androidx.compose.foundation.layout.OffsetKt.offset(r2, r4)
            r23 = 0
            r24 = 0
            float r25 = androidx.compose.material.DrawerKt.EndDrawerPadding
            r26 = 0
            r27 = 11
            r28 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.PaddingKt.m33272paddingqDBjuR0$default(r22, r23, r24, r25, r26, r27, r28)
            androidx.compose.material.DrawerKt$ModalDrawer$1$2$6 r3 = new androidx.compose.material.DrawerKt$ModalDrawer$1$2$6
            r3.<init>(r1, r14, r0)
            r0 = 0
            r1 = 1
            r4 = 0
            androidx.compose.ui.Modifier r0 = androidx.compose.p002ui.semantics.SemanticsModifierKt.semantics$default(r2, r4, r3, r1, r0)
            r7 = 0
            androidx.compose.material.DrawerKt$ModalDrawer$1$2$7 r2 = new androidx.compose.material.DrawerKt$ModalDrawer$1$2$7
            r3 = r29
            r2.<init>(r3, r15)
            r3 = -1941234439(0xffffffff8c4b1cf9, float:-1.564727E-31)
            androidx.compose.runtime.internal.ComposableLambda r12 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r13, r3, r1, r2)
            int r1 = r15 >> 9
            r1 = r1 & 112(0x70, float:1.57E-43)
            r2 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r2
            int r2 = r15 >> 12
            r3 = r2 & 896(0x380, float:1.256E-42)
            r1 = r1 | r3
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r15
            r14 = r1 | r2
            r15 = 16
            r1 = r0
            r2 = r16
            r3 = r8
            r5 = r10
            r8 = r21
            r9 = r12
            r10 = r34
            r11 = r14
            r12 = r15
            androidx.compose.material.SurfaceKt.m34127SurfaceFjzlyU(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            r34.endReplaceableGroup()
            r34.endNode()
            r34.endReplaceableGroup()
            r34.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x034e
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x034e:
            return
        L_0x034f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Drawer shouldn't have infinite width"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt$ModalDrawer$1.invoke(androidx.compose.foundation.layout.BoxWithConstraintsScope, androidx.compose.runtime.Composer, int):void");
    }
}
