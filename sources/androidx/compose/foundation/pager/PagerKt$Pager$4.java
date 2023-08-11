package androidx.compose.foundation.pager;

import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerKt$Pager$4\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,781:1\n83#2,3:782\n36#2:791\n1114#3,6:785\n1114#3,3:792\n1117#3,3:796\n1#4:795\n*S KotlinDebug\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerKt$Pager$4\n*L\n299#1:782,3\n322#1:791\n299#1:785,6\n322#1:792,3\n322#1:796,3\n*E\n"})
/* compiled from: Pager.kt */
final class PagerKt$Pager$4 extends C12777p implements C13089p<BoxWithConstraintsScope, Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ int $beyondBoundsPageCount;
    final /* synthetic */ float $calculatedContentPaddings;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ Density $density;
    final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ Function1<Integer, Object> $key;
    final /* synthetic */ C13089p<Integer, Composer, Integer, C11921v> $pageContent;
    final /* synthetic */ int $pageCount;
    final /* synthetic */ NestedScrollConnection $pageNestedScrollConnection;
    final /* synthetic */ PageSize $pageSize;
    final /* synthetic */ float $pageSpacing;
    final /* synthetic */ PagerWrapperFlingBehavior $pagerFlingBehavior;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ PagerState $state;
    final /* synthetic */ boolean $userScrollEnabled;
    final /* synthetic */ Alignment.Vertical $verticalAlignment;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PagerKt$Pager$4(boolean z, Density density, float f, float f2, boolean z2, PagerState pagerState, int i, PaddingValues paddingValues, PagerWrapperFlingBehavior pagerWrapperFlingBehavior, boolean z3, int i2, Alignment.Horizontal horizontal, Alignment.Vertical vertical, int i3, PageSize pageSize, int i4, Function1<? super Integer, ? extends Object> function1, NestedScrollConnection nestedScrollConnection, C13089p<? super Integer, ? super Composer, ? super Integer, C11921v> pVar) {
        super(3);
        this.$isVertical = z;
        this.$density = density;
        this.$pageSpacing = f;
        this.$calculatedContentPaddings = f2;
        this.$reverseLayout = z2;
        this.$state = pagerState;
        this.$$dirty = i;
        this.$contentPadding = paddingValues;
        this.$pagerFlingBehavior = pagerWrapperFlingBehavior;
        this.$userScrollEnabled = z3;
        this.$beyondBoundsPageCount = i2;
        this.$horizontalAlignment = horizontal;
        this.$verticalAlignment = vertical;
        this.$$dirty1 = i3;
        this.$pageSize = pageSize;
        this.$pageCount = i4;
        this.$key = function1;
        this.$pageNestedScrollConnection = nestedScrollConnection;
        this.$pageContent = pVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return C11921v.f18618a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0104, code lost:
        if (r6 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L_0x0106;
     */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.foundation.layout.BoxWithConstraintsScope r26, androidx.compose.runtime.Composer r27, int r28) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r14 = r27
            r2 = r28
            java.lang.String r3 = "$this$BoxWithConstraints"
            kotlin.jvm.internal.C12775o.m28639i(r1, r3)
            r3 = r2 & 14
            r4 = 4
            r5 = 2
            if (r3 != 0) goto L_0x001e
            boolean r3 = r14.changed((java.lang.Object) r1)
            if (r3 == 0) goto L_0x001b
            r3 = r4
            goto L_0x001c
        L_0x001b:
            r3 = r5
        L_0x001c:
            r3 = r3 | r2
            goto L_0x001f
        L_0x001e:
            r3 = r2
        L_0x001f:
            r3 = r3 & 91
            r6 = 18
            if (r3 != r6) goto L_0x0031
            boolean r3 = r27.getSkipping()
            if (r3 != 0) goto L_0x002c
            goto L_0x0031
        L_0x002c:
            r27.skipToGroupEnd()
            goto L_0x01af
        L_0x0031:
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x0040
            r3 = -1
            java.lang.String r6 = "androidx.compose.foundation.pager.Pager.<anonymous> (Pager.kt:295)"
            r7 = -1677736225(0xffffffff9bffc6df, float:-4.2314729E-22)
            androidx.compose.runtime.ComposerKt.traceEventStart(r7, r2, r3, r6)
        L_0x0040:
            boolean r2 = r0.$isVertical
            if (r2 == 0) goto L_0x004d
            long r1 = r26.m33222getConstraintsmsEJaDk()
            int r1 = androidx.compose.p002ui.unit.Constraints.m38411getMaxHeightimpl(r1)
            goto L_0x0055
        L_0x004d:
            long r1 = r26.m33222getConstraintsmsEJaDk()
            int r1 = androidx.compose.p002ui.unit.Constraints.m38412getMaxWidthimpl(r1)
        L_0x0055:
            java.lang.Object[] r2 = new java.lang.Object[r4]
            androidx.compose.ui.unit.Density r3 = r0.$density
            r6 = 0
            r2[r6] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r7 = 1
            r2[r7] = r3
            float r3 = r0.$pageSpacing
            androidx.compose.ui.unit.Dp r3 = androidx.compose.p002ui.unit.C1232Dp.m38466boximpl(r3)
            r2[r5] = r3
            float r3 = r0.$calculatedContentPaddings
            androidx.compose.ui.unit.Dp r3 = androidx.compose.p002ui.unit.C1232Dp.m38466boximpl(r3)
            r5 = 3
            r2[r5] = r3
            androidx.compose.ui.unit.Density r3 = r0.$density
            float r5 = r0.$pageSpacing
            float r7 = r0.$calculatedContentPaddings
            androidx.compose.foundation.pager.PageSize r8 = r0.$pageSize
            r9 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r14.startReplaceableGroup(r9)
            r9 = r6
        L_0x0083:
            if (r6 >= r4) goto L_0x008f
            r10 = r2[r6]
            boolean r10 = r14.changed((java.lang.Object) r10)
            r9 = r9 | r10
            int r6 = r6 + 1
            goto L_0x0083
        L_0x008f:
            java.lang.Object r2 = r27.rememberedValue()
            if (r9 != 0) goto L_0x009d
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r4 = r4.getEmpty()
            if (r2 != r4) goto L_0x00bd
        L_0x009d:
            int r2 = r3.m38443roundToPx0680j_4(r5)
            int r4 = r3.m38443roundToPx0680j_4(r7)
            int r1 = r1 - r4
            int r1 = r8.calculateMainAxisPageSize(r3, r1, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r1 = r1.intValue()
            float r1 = r3.m38446toDpu2uoSUM((int) r1)
            androidx.compose.ui.unit.Dp r2 = androidx.compose.p002ui.unit.C1232Dp.m38466boximpl(r1)
            r14.updateRememberedValue(r2)
        L_0x00bd:
            r27.endReplaceableGroup()
            androidx.compose.ui.unit.Dp r2 = (androidx.compose.p002ui.unit.C1232Dp) r2
            float r15 = r2.m38482unboximpl()
            boolean r1 = r0.$reverseLayout
            if (r1 != 0) goto L_0x00d1
            androidx.compose.ui.Alignment$Companion r1 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment$Horizontal r1 = r1.getStart()
            goto L_0x00d7
        L_0x00d1:
            androidx.compose.ui.Alignment$Companion r1 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment$Horizontal r1 = r1.getEnd()
        L_0x00d7:
            r3 = r1
            boolean r1 = r0.$reverseLayout
            if (r1 != 0) goto L_0x00e3
            androidx.compose.ui.Alignment$Companion r1 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment$Vertical r1 = r1.getTop()
            goto L_0x00e9
        L_0x00e3:
            androidx.compose.ui.Alignment$Companion r1 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment$Vertical r1 = r1.getBottom()
        L_0x00e9:
            r4 = r1
            androidx.compose.foundation.pager.PagerState r1 = r0.$state
            androidx.compose.ui.unit.Density r2 = r0.$density
            r5 = 1157296644(0x44faf204, float:2007.563)
            r14.startReplaceableGroup(r5)
            boolean r5 = r14.changed((java.lang.Object) r1)
            java.lang.Object r6 = r27.rememberedValue()
            if (r5 != 0) goto L_0x0106
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r5 = r5.getEmpty()
            if (r6 != r5) goto L_0x0123
        L_0x0106:
            int r2 = r2.m38443roundToPx0680j_4(r15)
            float r2 = (float) r2
            float r5 = r1.getInitialPageOffsetFraction()
            float r2 = r2 * r5
            androidx.compose.foundation.lazy.LazyListState r6 = new androidx.compose.foundation.lazy.LazyListState
            int r5 = r1.getInitialPage()
            int r2 = p418qf.C13265c.m30134c(r2)
            r6.<init>(r5, r2)
            r1.loadNewState$foundation_release(r6)
            r14.updateRememberedValue(r6)
        L_0x0123:
            r27.endReplaceableGroup()
            r2 = r6
            androidx.compose.foundation.lazy.LazyListState r2 = (androidx.compose.foundation.lazy.LazyListState) r2
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.p002ui.Modifier.Companion
            androidx.compose.foundation.layout.Arrangement r5 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            float r6 = r0.$pageSpacing
            androidx.compose.foundation.layout.Arrangement$Horizontal r12 = r5.m33186spacedByD5KLDUw((float) r6, (androidx.compose.p002ui.Alignment.Horizontal) r3)
            float r3 = r0.$pageSpacing
            androidx.compose.foundation.layout.Arrangement$Vertical r10 = r5.m33187spacedByD5KLDUw((float) r3, (androidx.compose.p002ui.Alignment.Vertical) r4)
            androidx.compose.foundation.layout.PaddingValues r3 = r0.$contentPadding
            boolean r4 = r0.$reverseLayout
            boolean r13 = r0.$isVertical
            r5 = r13
            androidx.compose.foundation.pager.PagerWrapperFlingBehavior r6 = r0.$pagerFlingBehavior
            boolean r7 = r0.$userScrollEnabled
            int r8 = r0.$beyondBoundsPageCount
            androidx.compose.ui.Alignment$Horizontal r9 = r0.$horizontalAlignment
            androidx.compose.ui.Alignment$Vertical r11 = r0.$verticalAlignment
            androidx.compose.foundation.pager.PagerKt$Pager$4$1 r16 = new androidx.compose.foundation.pager.PagerKt$Pager$4$1
            r18 = r13
            r13 = r16
            int r14 = r0.$pageCount
            r26 = r1
            kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object> r1 = r0.$key
            r28 = r2
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r2 = r0.$pageNestedScrollConnection
            r23 = r3
            of.p<java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, ef.v> r3 = r0.$pageContent
            r24 = r4
            int r4 = r0.$$dirty1
            r19 = r15
            r15 = r16
            r16 = r14
            r17 = r1
            r20 = r2
            r21 = r3
            r22 = r4
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            int r1 = r0.$$dirty
            int r2 = r1 >> 21
            r2 = r2 & 896(0x380, float:1.256E-42)
            r2 = r2 | 6
            int r3 = r0.$$dirty1
            int r4 = r3 << 3
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r4
            int r3 = r3 << 15
            r4 = 3670016(0x380000, float:5.142788E-39)
            r3 = r3 & r4
            r2 = r2 | r3
            int r3 = r1 << 3
            r4 = 29360128(0x1c00000, float:7.052966E-38)
            r3 = r3 & r4
            r2 = r2 | r3
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r1
            r15 = r2 | r3
            int r1 = r1 >> 21
            r16 = r1 & 14
            r17 = 0
            r14 = r27
            r1 = r26
            r2 = r28
            r3 = r23
            r4 = r24
            androidx.compose.foundation.lazy.LazyListKt.LazyList(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x01af
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerKt$Pager$4.invoke(androidx.compose.foundation.layout.BoxWithConstraintsScope, androidx.compose.runtime.Composer, int):void");
    }
}
