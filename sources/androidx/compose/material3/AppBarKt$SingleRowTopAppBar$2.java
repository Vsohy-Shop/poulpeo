package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.p002ui.text.TextStyle;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: AppBar.kt */
final class AppBarKt$SingleRowTopAppBar$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $actionsRow;
    final /* synthetic */ boolean $centeredTitle;
    final /* synthetic */ TopAppBarColors $colors;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $navigationIcon;
    final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $title;
    final /* synthetic */ TextStyle $titleTextStyle;
    final /* synthetic */ WindowInsets $windowInsets;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AppBarKt$SingleRowTopAppBar$2(WindowInsets windowInsets, TopAppBarColors topAppBarColors, C13088o<? super Composer, ? super Integer, C11921v> oVar, TextStyle textStyle, boolean z, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar3, int i, TopAppBarScrollBehavior topAppBarScrollBehavior) {
        super(2);
        this.$windowInsets = windowInsets;
        this.$colors = topAppBarColors;
        this.$title = oVar;
        this.$titleTextStyle = textStyle;
        this.$centeredTitle = z;
        this.$navigationIcon = oVar2;
        this.$actionsRow = oVar3;
        this.$$dirty = i;
        this.$scrollBehavior = topAppBarScrollBehavior;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003e, code lost:
        r2 = r2.getState();
     */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.Composer r23, int r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r24
            r2 = r1 & 11
            r3 = 2
            if (r2 != r3) goto L_0x0015
            boolean r2 = r23.getSkipping()
            if (r2 != 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            r23.skipToGroupEnd()
            goto L_0x00ba
        L_0x0015:
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x0024
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.SingleRowTopAppBar.<anonymous> (AppBar.kt:1046)"
            r4 = 376925230(0x16776c2e, float:1.9986637E-25)
            androidx.compose.runtime.ComposerKt.traceEventStart(r4, r1, r2, r3)
        L_0x0024:
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            r14 = r23
            java.lang.Object r1 = r14.consume(r1)
            androidx.compose.material3.TopAppBarScrollBehavior r2 = r0.$scrollBehavior
            androidx.compose.ui.unit.Density r1 = (androidx.compose.p002ui.unit.Density) r1
            androidx.compose.material3.tokens.TopAppBarSmallTokens r3 = androidx.compose.material3.tokens.TopAppBarSmallTokens.INSTANCE
            float r3 = r3.m35217getContainerHeightD9Ej5fM()
            float r1 = r1.m38449toPx0680j_4(r3)
            if (r2 == 0) goto L_0x0049
            androidx.compose.material3.TopAppBarState r2 = r2.getState()
            if (r2 == 0) goto L_0x0049
            float r2 = r2.getHeightOffset()
            goto L_0x004a
        L_0x0049:
            r2 = 0
        L_0x004a:
            float r3 = r1 + r2
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.p002ui.Modifier.Companion
            androidx.compose.foundation.layout.WindowInsets r2 = r0.$windowInsets
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.WindowInsetsPaddingKt.windowInsetsPadding(r1, r2)
            androidx.compose.ui.Modifier r2 = androidx.compose.p002ui.draw.ClipKt.clipToBounds(r1)
            androidx.compose.material3.TopAppBarColors r1 = r0.$colors
            long r4 = r1.m34751getNavigationIconContentColor0d7_KjU$material3_release()
            androidx.compose.material3.TopAppBarColors r1 = r0.$colors
            long r6 = r1.m34752getTitleContentColor0d7_KjU$material3_release()
            androidx.compose.material3.TopAppBarColors r1 = r0.$colors
            long r8 = r1.m34750getActionIconContentColor0d7_KjU$material3_release()
            of.o<androidx.compose.runtime.Composer, java.lang.Integer, ef.v> r10 = r0.$title
            androidx.compose.ui.text.TextStyle r11 = r0.$titleTextStyle
            r12 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.foundation.layout.Arrangement r1 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r13 = r1.getCenter()
            boolean r15 = r0.$centeredTitle
            if (r15 == 0) goto L_0x007f
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r1 = r1.getCenter()
            goto L_0x0083
        L_0x007f:
            androidx.compose.foundation.layout.Arrangement$Horizontal r1 = r1.getStart()
        L_0x0083:
            r15 = 0
            r16 = 0
            of.o<androidx.compose.runtime.Composer, java.lang.Integer, ef.v> r15 = r0.$navigationIcon
            r17 = r15
            of.o<androidx.compose.runtime.Composer, java.lang.Integer, ef.v> r15 = r0.$actionsRow
            r18 = r15
            int r15 = r0.$$dirty
            int r19 = r15 << 12
            r20 = 458752(0x70000, float:6.42848E-40)
            r19 = r19 & r20
            r20 = 113246208(0x6c00000, float:7.2222373E-35)
            r19 = r19 | r20
            r20 = 3670016(0x380000, float:5.142788E-39)
            int r21 = r15 << 12
            r20 = r21 & r20
            r20 = r19 | r20
            int r15 = r15 >> 6
            r15 = r15 & 896(0x380, float:1.256E-42)
            r15 = r15 | 3126(0xc36, float:4.38E-42)
            r21 = r15
            r14 = r1
            r19 = r23
            r15 = 0
            androidx.compose.material3.AppBarKt.m34251TopAppBarLayoutkXwM9vE(r2, r3, r4, r6, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x00ba
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x00ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$2.invoke(androidx.compose.runtime.Composer, int):void");
    }
}
