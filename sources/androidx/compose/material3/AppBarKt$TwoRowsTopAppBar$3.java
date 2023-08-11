package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.p002ui.text.TextStyle;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12757e0;
import kotlin.jvm.internal.C12760f0;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: AppBar.kt */
final class AppBarKt$TwoRowsTopAppBar$3 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $actionsRow;
    final /* synthetic */ float $bottomTitleAlpha;
    final /* synthetic */ TopAppBarColors $colors;
    final /* synthetic */ boolean $hideBottomRowSemantics;
    final /* synthetic */ boolean $hideTopRowSemantics;
    final /* synthetic */ C12757e0 $maxHeightPx;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $navigationIcon;
    final /* synthetic */ C12757e0 $pinnedHeightPx;
    final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $smallTitle;
    final /* synthetic */ TextStyle $smallTitleTextStyle;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $title;
    final /* synthetic */ C12760f0 $titleBottomPaddingPx;
    final /* synthetic */ TextStyle $titleTextStyle;
    final /* synthetic */ float $topTitleAlpha;
    final /* synthetic */ WindowInsets $windowInsets;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AppBarKt$TwoRowsTopAppBar$3(WindowInsets windowInsets, C12757e0 e0Var, TopAppBarColors topAppBarColors, C13088o<? super Composer, ? super Integer, C11921v> oVar, TextStyle textStyle, float f, boolean z, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar3, int i, C12757e0 e0Var2, TopAppBarScrollBehavior topAppBarScrollBehavior, C13088o<? super Composer, ? super Integer, C11921v> oVar4, TextStyle textStyle2, float f2, C12760f0 f0Var, boolean z2) {
        super(2);
        this.$windowInsets = windowInsets;
        this.$pinnedHeightPx = e0Var;
        this.$colors = topAppBarColors;
        this.$smallTitle = oVar;
        this.$smallTitleTextStyle = textStyle;
        this.$topTitleAlpha = f;
        this.$hideTopRowSemantics = z;
        this.$navigationIcon = oVar2;
        this.$actionsRow = oVar3;
        this.$$dirty = i;
        this.$maxHeightPx = e0Var2;
        this.$scrollBehavior = topAppBarScrollBehavior;
        this.$title = oVar4;
        this.$titleTextStyle = textStyle2;
        this.$bottomTitleAlpha = f2;
        this.$titleBottomPaddingPx = f0Var;
        this.$hideBottomRowSemantics = z2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0184, code lost:
        r2 = r24.getState();
     */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.Composer r39, int r40) {
        /*
            r38 = this;
            r0 = r38
            r15 = r39
            r1 = r40
            r2 = r1 & 11
            r3 = 2
            if (r2 != r3) goto L_0x0017
            boolean r2 = r39.getSkipping()
            if (r2 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r39.skipToGroupEnd()
            goto L_0x01e9
        L_0x0017:
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x0026
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.TwoRowsTopAppBar.<anonymous> (AppBar.kt:1163)"
            r4 = 1985938853(0x765f05a5, float:1.1308561E33)
            androidx.compose.runtime.ComposerKt.traceEventStart(r4, r1, r2, r3)
        L_0x0026:
            androidx.compose.foundation.layout.WindowInsets r1 = r0.$windowInsets
            kotlin.jvm.internal.e0 r11 = r0.$pinnedHeightPx
            androidx.compose.material3.TopAppBarColors r10 = r0.$colors
            of.o<androidx.compose.runtime.Composer, java.lang.Integer, ef.v> r9 = r0.$smallTitle
            androidx.compose.ui.text.TextStyle r14 = r0.$smallTitleTextStyle
            float r13 = r0.$topTitleAlpha
            boolean r12 = r0.$hideTopRowSemantics
            of.o<androidx.compose.runtime.Composer, java.lang.Integer, ef.v> r7 = r0.$navigationIcon
            of.o<androidx.compose.runtime.Composer, java.lang.Integer, ef.v> r8 = r0.$actionsRow
            int r5 = r0.$$dirty
            kotlin.jvm.internal.e0 r6 = r0.$maxHeightPx
            androidx.compose.material3.TopAppBarScrollBehavior r3 = r0.$scrollBehavior
            of.o<androidx.compose.runtime.Composer, java.lang.Integer, ef.v> r4 = r0.$title
            androidx.compose.ui.text.TextStyle r2 = r0.$titleTextStyle
            r16 = r14
            float r14 = r0.$bottomTitleAlpha
            r17 = r14
            kotlin.jvm.internal.f0 r14 = r0.$titleBottomPaddingPx
            r18 = r14
            boolean r14 = r0.$hideBottomRowSemantics
            r0 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r15.startReplaceableGroup(r0)
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            androidx.compose.foundation.layout.Arrangement r21 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            r19 = r2
            androidx.compose.foundation.layout.Arrangement$Vertical r2 = r21.getTop()
            androidx.compose.ui.Alignment$Companion r20 = androidx.compose.p002ui.Alignment.Companion
            r40 = r3
            androidx.compose.ui.Alignment$Horizontal r3 = r20.getStart()
            r20 = r4
            r4 = 0
            androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(r2, r3, r15, r4)
            r3 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15.startReplaceableGroup(r3)
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r3 = r15.consume(r3)
            androidx.compose.ui.unit.Density r3 = (androidx.compose.p002ui.unit.Density) r3
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r4 = r15.consume(r4)
            androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.p002ui.unit.LayoutDirection) r4
            r23 = r5
            androidx.compose.runtime.ProvidableCompositionLocal r5 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r5 = r15.consume(r5)
            androidx.compose.ui.platform.ViewConfiguration r5 = (androidx.compose.p002ui.platform.ViewConfiguration) r5
            androidx.compose.ui.node.ComposeUiNode$Companion r24 = androidx.compose.p002ui.node.ComposeUiNode.Companion
            r25 = r6
            of.a r6 = r24.getConstructor()
            r26 = r7
            of.p r7 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r0)
            r27 = r8
            androidx.compose.runtime.Applier r8 = r39.getApplier()
            boolean r8 = r8 instanceof androidx.compose.runtime.Applier
            if (r8 != 0) goto L_0x00ae
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x00ae:
            r39.startReusableNode()
            boolean r8 = r39.getInserting()
            if (r8 == 0) goto L_0x00bb
            r15.createNode(r6)
            goto L_0x00be
        L_0x00bb:
            r39.useNode()
        L_0x00be:
            r39.disableReusing()
            androidx.compose.runtime.Composer r6 = androidx.compose.runtime.Updater.m35292constructorimpl(r39)
            of.o r8 = r24.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r6, r2, r8)
            of.o r2 = r24.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r6, r3, r2)
            of.o r2 = r24.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r6, r4, r2)
            of.o r2 = r24.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r6, r5, r2)
            r39.enableReusing()
            androidx.compose.runtime.Composer r2 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r39)
            androidx.compose.runtime.SkippableUpdater r2 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r2)
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7.invoke(r2, r15, r3)
            r2 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r15.startReplaceableGroup(r2)
            r2 = -1163856341(0xffffffffbaa0f62b, float:-0.0012280395)
            r15.startReplaceableGroup(r2)
            androidx.compose.foundation.layout.ColumnScopeInstance r2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE
            r2 = 80455579(0x4cba79b, float:4.7878992E-36)
            r15.startReplaceableGroup(r2)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.WindowInsetsPaddingKt.windowInsetsPadding(r0, r1)
            androidx.compose.ui.Modifier r1 = androidx.compose.p002ui.draw.ClipKt.clipToBounds(r1)
            float r2 = r11.f20408b
            r22 = r19
            long r3 = r10.m34751getNavigationIconContentColor0d7_KjU$material3_release()
            r24 = r40
            r28 = r20
            long r5 = r10.m34752getTitleContentColor0d7_KjU$material3_release()
            r7 = r25
            long r19 = r10.m34750getActionIconContentColor0d7_KjU$material3_release()
            r29 = r7
            r25 = r26
            r26 = r27
            r7 = r19
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r19 = r21.getCenter()
            r27 = r12
            r12 = r19
            androidx.compose.foundation.layout.Arrangement$Horizontal r19 = r21.getStart()
            r30 = r13
            r13 = r19
            r19 = 0
            r33 = r14
            r31 = r17
            r32 = r18
            r14 = r19
            int r17 = r23 << 3
            r34 = 458752(0x70000, float:6.42848E-40)
            r18 = r17 & r34
            r19 = 905969664(0x36000000, float:1.9073486E-6)
            r18 = r18 | r19
            r35 = 3670016(0x380000, float:5.142788E-39)
            r17 = r17 & r35
            r19 = r18 | r17
            int r14 = r23 >> 12
            r14 = r14 & 896(0x380, float:1.256E-42)
            r14 = r14 | 3078(0xc06, float:4.313E-42)
            r20 = r14
            r36 = r10
            r10 = r16
            r14 = r11
            r11 = r30
            r15 = r27
            r16 = r25
            r17 = r26
            r18 = r39
            r37 = r14
            r14 = 0
            androidx.compose.material3.AppBarKt.m34251TopAppBarLayoutkXwM9vE(r1, r2, r3, r5, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            androidx.compose.ui.Modifier r1 = androidx.compose.p002ui.draw.ClipKt.clipToBounds(r0)
            r0 = r29
            float r0 = r0.f20408b
            r2 = r37
            float r2 = r2.f20408b
            float r0 = r0 - r2
            if (r24 == 0) goto L_0x018f
            androidx.compose.material3.TopAppBarState r2 = r24.getState()
            if (r2 == 0) goto L_0x018f
            float r2 = r2.getHeightOffset()
            goto L_0x0190
        L_0x018f:
            r2 = 0
        L_0x0190:
            float r2 = r2 + r0
            long r3 = r36.m34751getNavigationIconContentColor0d7_KjU$material3_release()
            long r5 = r36.m34752getTitleContentColor0d7_KjU$material3_release()
            long r7 = r36.m34750getActionIconContentColor0d7_KjU$material3_release()
            androidx.compose.foundation.layout.Arrangement$Vertical r12 = r21.getBottom()
            androidx.compose.foundation.layout.Arrangement$Horizontal r13 = r21.getStart()
            r0 = r32
            int r14 = r0.f20416b
            androidx.compose.material3.ComposableSingletons$AppBarKt r0 = androidx.compose.material3.ComposableSingletons$AppBarKt.INSTANCE
            of.o r16 = r0.m34367getLambda11$material3_release()
            of.o r17 = r0.m34368getLambda12$material3_release()
            int r0 = r23 << 12
            r9 = r0 & r34
            r10 = 905969670(0x36000006, float:1.90735E-6)
            r9 = r9 | r10
            r0 = r0 & r35
            r19 = r9 | r0
            r20 = 3456(0xd80, float:4.843E-42)
            r9 = r28
            r10 = r22
            r11 = r31
            r15 = r33
            r18 = r39
            androidx.compose.material3.AppBarKt.m34251TopAppBarLayoutkXwM9vE(r1, r2, r3, r5, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r39.endReplaceableGroup()
            r39.endReplaceableGroup()
            r39.endReplaceableGroup()
            r39.endNode()
            r39.endReplaceableGroup()
            r39.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01e9
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$3.invoke(androidx.compose.runtime.Composer, int):void");
    }
}
