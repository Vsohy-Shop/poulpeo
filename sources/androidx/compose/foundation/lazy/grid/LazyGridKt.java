package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nLazyGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,364:1\n154#2:365\n474#3,4:366\n478#3,2:374\n482#3:380\n25#4:370\n50#4:381\n49#4:382\n83#4,3:390\n1114#5,3:371\n1117#5,3:377\n1114#5,6:383\n1114#5,6:393\n474#6:376\n76#7:389\n*S KotlinDebug\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt\n*L\n60#1:365\n82#1:366,4\n82#1:374,2\n82#1:380\n82#1:370\n83#1:381\n83#1:382\n170#1:390,3\n82#1:371,3\n82#1:377,3\n83#1:383,6\n170#1:393,6\n82#1:376\n121#1:389\n*E\n"})
/* compiled from: LazyGrid.kt */
public final class LazyGridKt {
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0132  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void LazyGrid(androidx.compose.p002ui.Modifier r32, androidx.compose.foundation.lazy.grid.LazyGridState r33, p404of.C13088o<? super androidx.compose.p002ui.unit.Density, ? super androidx.compose.p002ui.unit.Constraints, ? extends java.util.List<java.lang.Integer>> r34, androidx.compose.foundation.layout.PaddingValues r35, boolean r36, boolean r37, androidx.compose.foundation.gestures.FlingBehavior r38, boolean r39, androidx.compose.foundation.layout.Arrangement.Vertical r40, androidx.compose.foundation.layout.Arrangement.Horizontal r41, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.grid.LazyGridScope, p336ef.C11921v> r42, androidx.compose.runtime.Composer r43, int r44, int r45, int r46) {
        /*
            r12 = r33
            r13 = r34
            r14 = r37
            r15 = r40
            r11 = r41
            r10 = r42
            r9 = r44
            r8 = r46
            java.lang.String r0 = "state"
            kotlin.jvm.internal.C12775o.m28639i(r12, r0)
            java.lang.String r0 = "slotSizesSums"
            kotlin.jvm.internal.C12775o.m28639i(r13, r0)
            java.lang.String r0 = "verticalArrangement"
            kotlin.jvm.internal.C12775o.m28639i(r15, r0)
            java.lang.String r0 = "horizontalArrangement"
            kotlin.jvm.internal.C12775o.m28639i(r11, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r10, r0)
            r0 = 152645664(0x9193020, float:1.8439333E-33)
            r1 = r43
            androidx.compose.runtime.Composer r7 = r1.startRestartGroup(r0)
            r1 = r8 & 1
            if (r1 == 0) goto L_0x003c
            r4 = r9 | 6
            r5 = r4
            r4 = r32
            goto L_0x0050
        L_0x003c:
            r4 = r9 & 14
            if (r4 != 0) goto L_0x004d
            r4 = r32
            boolean r5 = r7.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x004a
            r5 = 4
            goto L_0x004b
        L_0x004a:
            r5 = 2
        L_0x004b:
            r5 = r5 | r9
            goto L_0x0050
        L_0x004d:
            r4 = r32
            r5 = r9
        L_0x0050:
            r6 = r8 & 2
            if (r6 == 0) goto L_0x0057
            r5 = r5 | 48
            goto L_0x0067
        L_0x0057:
            r6 = r9 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0067
            boolean r6 = r7.changed((java.lang.Object) r12)
            if (r6 == 0) goto L_0x0064
            r6 = 32
            goto L_0x0066
        L_0x0064:
            r6 = 16
        L_0x0066:
            r5 = r5 | r6
        L_0x0067:
            r6 = r8 & 4
            if (r6 == 0) goto L_0x006e
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x007e
        L_0x006e:
            r6 = r9 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x007e
            boolean r6 = r7.changedInstance(r13)
            if (r6 == 0) goto L_0x007b
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x007d
        L_0x007b:
            r6 = 128(0x80, float:1.794E-43)
        L_0x007d:
            r5 = r5 | r6
        L_0x007e:
            r6 = r8 & 8
            if (r6 == 0) goto L_0x0085
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x0099
        L_0x0085:
            r2 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x0099
            r2 = r35
            boolean r16 = r7.changed((java.lang.Object) r2)
            if (r16 == 0) goto L_0x0094
            r16 = 2048(0x800, float:2.87E-42)
            goto L_0x0096
        L_0x0094:
            r16 = 1024(0x400, float:1.435E-42)
        L_0x0096:
            r5 = r5 | r16
            goto L_0x009b
        L_0x0099:
            r2 = r35
        L_0x009b:
            r16 = r8 & 16
            r17 = 57344(0xe000, float:8.0356E-41)
            if (r16 == 0) goto L_0x00a7
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
            r0 = r36
            goto L_0x00ba
        L_0x00a7:
            r18 = r9 & r17
            r0 = r36
            if (r18 != 0) goto L_0x00ba
            boolean r19 = r7.changed((boolean) r0)
            if (r19 == 0) goto L_0x00b6
            r19 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00b8
        L_0x00b6:
            r19 = 8192(0x2000, float:1.14794E-41)
        L_0x00b8:
            r5 = r5 | r19
        L_0x00ba:
            r19 = r8 & 32
            r20 = 458752(0x70000, float:6.42848E-40)
            if (r19 == 0) goto L_0x00c5
            r19 = 196608(0x30000, float:2.75506E-40)
        L_0x00c2:
            r5 = r5 | r19
            goto L_0x00d5
        L_0x00c5:
            r19 = r9 & r20
            if (r19 != 0) goto L_0x00d5
            boolean r19 = r7.changed((boolean) r14)
            if (r19 == 0) goto L_0x00d2
            r19 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c2
        L_0x00d2:
            r19 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00c2
        L_0x00d5:
            r19 = 3670016(0x380000, float:5.142788E-39)
            r21 = r9 & r19
            if (r21 != 0) goto L_0x00ef
            r21 = r8 & 64
            r3 = r38
            if (r21 != 0) goto L_0x00ea
            boolean r22 = r7.changed((java.lang.Object) r3)
            if (r22 == 0) goto L_0x00ea
            r22 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ec
        L_0x00ea:
            r22 = 524288(0x80000, float:7.34684E-40)
        L_0x00ec:
            r5 = r5 | r22
            goto L_0x00f1
        L_0x00ef:
            r3 = r38
        L_0x00f1:
            r0 = r8 & 128(0x80, float:1.794E-43)
            r22 = 29360128(0x1c00000, float:7.052966E-38)
            if (r0 == 0) goto L_0x00fb
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r5 = r5 | r0
            goto L_0x010f
        L_0x00fb:
            r0 = r9 & r22
            if (r0 != 0) goto L_0x010f
            r0 = r39
            boolean r23 = r7.changed((boolean) r0)
            if (r23 == 0) goto L_0x010a
            r23 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x010c
        L_0x010a:
            r23 = 4194304(0x400000, float:5.877472E-39)
        L_0x010c:
            r5 = r5 | r23
            goto L_0x0111
        L_0x010f:
            r0 = r39
        L_0x0111:
            r0 = r8 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0119
            r0 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x0117:
            r5 = r5 | r0
            goto L_0x012a
        L_0x0119:
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r9
            if (r0 != 0) goto L_0x012a
            boolean r0 = r7.changed((java.lang.Object) r15)
            if (r0 == 0) goto L_0x0127
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0117
        L_0x0127:
            r0 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x0117
        L_0x012a:
            r0 = r8 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0132
            r0 = 805306368(0x30000000, float:4.656613E-10)
        L_0x0130:
            r5 = r5 | r0
            goto L_0x0143
        L_0x0132:
            r0 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r0 & r9
            if (r0 != 0) goto L_0x0143
            boolean r0 = r7.changed((java.lang.Object) r11)
            if (r0 == 0) goto L_0x0140
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0130
        L_0x0140:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0130
        L_0x0143:
            r0 = r8 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x014a
            r0 = r45 | 6
            goto L_0x015c
        L_0x014a:
            r0 = r45 & 14
            if (r0 != 0) goto L_0x015a
            boolean r0 = r7.changedInstance(r10)
            if (r0 == 0) goto L_0x0156
            r0 = 4
            goto L_0x0157
        L_0x0156:
            r0 = 2
        L_0x0157:
            r0 = r45 | r0
            goto L_0x015c
        L_0x015a:
            r0 = r45
        L_0x015c:
            r23 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r2 = r5 & r23
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r2 != r3) goto L_0x017f
            r2 = r0 & 11
            r3 = 2
            if (r2 != r3) goto L_0x017f
            boolean r2 = r7.getSkipping()
            if (r2 != 0) goto L_0x0172
            goto L_0x017f
        L_0x0172:
            r7.skipToGroupEnd()
            r5 = r36
            r1 = r4
            r10 = r7
            r4 = r35
            r7 = r38
            goto L_0x0340
        L_0x017f:
            r7.startDefaults()
            r2 = r9 & 1
            r3 = 6
            if (r2 == 0) goto L_0x01a2
            boolean r2 = r7.getDefaultsInvalid()
            if (r2 == 0) goto L_0x018e
            goto L_0x01a2
        L_0x018e:
            r7.skipToGroupEnd()
            r1 = r8 & 64
            if (r1 == 0) goto L_0x0199
            r1 = -3670017(0xffffffffffc7ffff, float:NaN)
            r5 = r5 & r1
        L_0x0199:
            r16 = r35
            r21 = r38
            r6 = r4
            r4 = r5
            r5 = r36
            goto L_0x01d9
        L_0x01a2:
            if (r1 == 0) goto L_0x01a7
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x01a8
        L_0x01a7:
            r1 = r4
        L_0x01a8:
            r2 = 0
            if (r6 == 0) goto L_0x01b5
            float r4 = (float) r2
            float r4 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r4)
            androidx.compose.foundation.layout.PaddingValues r4 = androidx.compose.foundation.layout.PaddingKt.m33261PaddingValues0680j_4(r4)
            goto L_0x01b7
        L_0x01b5:
            r4 = r35
        L_0x01b7:
            if (r16 == 0) goto L_0x01ba
            goto L_0x01bc
        L_0x01ba:
            r2 = r36
        L_0x01bc:
            r6 = r8 & 64
            if (r6 == 0) goto L_0x01d2
            androidx.compose.foundation.gestures.ScrollableDefaults r6 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE
            androidx.compose.foundation.gestures.FlingBehavior r6 = r6.flingBehavior(r7, r3)
            r16 = -3670017(0xffffffffffc7ffff, float:NaN)
            r5 = r5 & r16
            r16 = r4
            r4 = r5
            r21 = r6
            r6 = r1
            goto L_0x01d8
        L_0x01d2:
            r21 = r38
            r6 = r1
            r16 = r4
            r4 = r5
        L_0x01d8:
            r5 = r2
        L_0x01d9:
            r7.endDefaults()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x01ea
            java.lang.String r1 = "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:51)"
            r2 = 152645664(0x9193020, float:1.8439333E-33)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r4, r0, r1)
        L_0x01ea:
            androidx.compose.foundation.gestures.ScrollableDefaults r2 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE
            androidx.compose.foundation.OverscrollEffect r3 = r2.overscrollEffect(r7, r3)
            int r1 = r4 >> 3
            r18 = r1 & 14
            int r0 = r0 << 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r18 | r0
            androidx.compose.foundation.lazy.grid.LazyGridItemProvider r0 = androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt.rememberLazyGridItemProvider(r12, r10, r7, r0)
            int r23 = r4 >> 9
            r24 = r23 & 112(0x70, float:1.57E-43)
            r32 = r0
            r0 = r18 | r24
            androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState r18 = androidx.compose.foundation.lazy.grid.LazySemanticsKt.rememberLazyGridSemanticState(r12, r5, r7, r0)
            r0 = 773894976(0x2e20b340, float:3.6538994E-11)
            r7.startReplaceableGroup(r0)
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r7.startReplaceableGroup(r0)
            java.lang.Object r0 = r7.rememberedValue()
            androidx.compose.runtime.Composer$Companion r24 = androidx.compose.runtime.Composer.Companion
            r35 = r2
            java.lang.Object r2 = r24.getEmpty()
            if (r0 != r2) goto L_0x0233
            hf.h r0 = p355hf.C12085h.f18916b
            yf.l0 r0 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(r0, r7)
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r2 = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller
            r2.<init>(r0)
            r7.updateRememberedValue(r2)
            r0 = r2
        L_0x0233:
            r7.endReplaceableGroup()
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r0 = (androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) r0
            yf.l0 r0 = r0.getCoroutineScope()
            r7.endReplaceableGroup()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r37)
            r36 = r3
            r3 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r7.startReplaceableGroup(r3)
            boolean r3 = r7.changed((java.lang.Object) r12)
            boolean r2 = r7.changed((java.lang.Object) r2)
            r2 = r2 | r3
            java.lang.Object r3 = r7.rememberedValue()
            if (r2 != 0) goto L_0x0260
            java.lang.Object r2 = r24.getEmpty()
            if (r3 != r2) goto L_0x0268
        L_0x0260:
            androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator r3 = new androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator
            r3.<init>(r0, r14)
            r7.updateRememberedValue(r3)
        L_0x0268:
            r7.endReplaceableGroup()
            androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator r3 = (androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator) r3
            r12.setPlacementAnimator$foundation_release(r3)
            r2 = r4 & 112(0x70, float:1.57E-43)
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r0 = r0 | r2
            r38 = r2
            r2 = r4 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r4 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = r4 & r17
            r0 = r0 | r2
            r2 = r4 & r20
            r0 = r0 | r2
            r2 = r23 & r19
            r0 = r0 | r2
            r1 = r1 & r22
            r19 = r0 | r1
            r22 = 0
            r2 = r32
            r0 = r2
            r1 = r33
            r25 = r35
            r27 = r38
            r26 = r2
            r2 = r34
            r28 = r36
            r24 = r3
            r3 = r16
            r29 = r4
            r4 = r5
            r32 = r5
            r5 = r37
            r30 = r6
            r6 = r41
            r35 = r7
            r7 = r40
            r8 = r24
            r9 = r35
            r10 = r19
            r11 = r22
            of.o r9 = rememberLazyGridMeasurePolicy(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.setVertical$foundation_release(r14)
            r10 = r35
            r11 = r26
            r0 = r27
            ScrollPositionUpdater(r11, r12, r10, r0)
            if (r14 == 0) goto L_0x02cb
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Vertical
            goto L_0x02cd
        L_0x02cb:
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Horizontal
        L_0x02cd:
            androidx.compose.ui.layout.RemeasurementModifier r1 = r33.getRemeasurementModifier$foundation_release()
            r8 = r30
            androidx.compose.ui.Modifier r1 = r8.then(r1)
            androidx.compose.foundation.lazy.AwaitFirstLayoutModifier r2 = r33.getAwaitLayoutModifier$foundation_release()
            androidx.compose.ui.Modifier r1 = r1.then(r2)
            r2 = r23 & r17
            int r3 = r29 << 3
            r3 = r3 & r20
            r17 = r2 | r3
            r2 = r11
            r3 = r18
            r4 = r0
            r5 = r39
            r6 = r32
            r7 = r10
            r18 = r8
            r8 = r17
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt.lazyLayoutSemantics(r1, r2, r3, r4, r5, r6, r7, r8)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.ClipScrollableContainerKt.clipScrollableContainer(r1, r0)
            r3 = r28
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.OverscrollKt.overscroll(r1, r3)
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r2 = r10.consume(r2)
            androidx.compose.ui.unit.LayoutDirection r2 = (androidx.compose.p002ui.unit.LayoutDirection) r2
            r8 = r32
            r4 = r25
            boolean r5 = r4.reverseDirection(r2, r0, r8)
            androidx.compose.foundation.interaction.MutableInteractionSource r7 = r33.getInternalInteractionSource$foundation_release()
            r2 = r0
            r0 = r1
            r1 = r33
            r4 = r39
            r6 = r21
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.gestures.ScrollableKt.scrollable(r0, r1, r2, r3, r4, r5, r6, r7)
            androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState r3 = r33.getPrefetchState$foundation_release()
            r6 = 0
            r7 = 0
            r1 = r11
            r4 = r9
            r5 = r10
            androidx.compose.foundation.lazy.layout.LazyLayoutKt.LazyLayout(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0339
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0339:
            r5 = r8
            r4 = r16
            r1 = r18
            r7 = r21
        L_0x0340:
            androidx.compose.runtime.ScopeUpdateScope r11 = r10.endRestartGroup()
            if (r11 != 0) goto L_0x0347
            goto L_0x036a
        L_0x0347:
            androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$1 r10 = new androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$1
            r0 = r10
            r2 = r33
            r3 = r34
            r6 = r37
            r8 = r39
            r9 = r40
            r15 = r10
            r10 = r41
            r14 = r11
            r11 = r42
            r12 = r44
            r13 = r45
            r31 = r14
            r14 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r31
            r0.updateScope(r15)
        L_0x036a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.grid.LazyGridState, of.o, androidx.compose.foundation.layout.PaddingValues, boolean, boolean, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* access modifiers changed from: private */
    @Composable
    public static final void ScrollPositionUpdater(LazyGridItemProvider lazyGridItemProvider, LazyGridState lazyGridState, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(950944068);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed((Object) lazyGridItemProvider)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changed((Object) lazyGridState)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(950944068, i, -1, "androidx.compose.foundation.lazy.grid.ScrollPositionUpdater (LazyGrid.kt:139)");
            }
            if (lazyGridItemProvider.getItemCount() > 0) {
                lazyGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyGridItemProvider);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LazyGridKt$ScrollPositionUpdater$1(lazyGridItemProvider, lazyGridState, i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1} */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006c, code lost:
        if (r1 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L_0x006e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final p404of.C13088o<androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.p002ui.unit.Constraints, androidx.compose.p002ui.layout.MeasureResult> rememberLazyGridMeasurePolicy(androidx.compose.foundation.lazy.grid.LazyGridItemProvider r15, androidx.compose.foundation.lazy.grid.LazyGridState r16, p404of.C13088o<? super androidx.compose.p002ui.unit.Density, ? super androidx.compose.p002ui.unit.Constraints, ? extends java.util.List<java.lang.Integer>> r17, androidx.compose.foundation.layout.PaddingValues r18, boolean r19, boolean r20, androidx.compose.foundation.layout.Arrangement.Horizontal r21, androidx.compose.foundation.layout.Arrangement.Vertical r22, androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator r23, androidx.compose.runtime.Composer r24, int r25, int r26) {
        /*
            r0 = r24
            r1 = r26
            r2 = 237903564(0xe2e1ecc, float:2.1461984E-30)
            r0.startReplaceableGroup(r2)
            r3 = r1 & 64
            r4 = 0
            if (r3 == 0) goto L_0x0011
            r13 = r4
            goto L_0x0013
        L_0x0011:
            r13 = r21
        L_0x0013:
            r1 = r1 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0019
            r12 = r4
            goto L_0x001b
        L_0x0019:
            r12 = r22
        L_0x001b:
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x0029
            r1 = -1
            java.lang.String r3 = "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:150)"
            r4 = r25
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r4, r1, r3)
        L_0x0029:
            r1 = 8
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r16
            r4 = 1
            r2[r4] = r17
            r4 = 2
            r2[r4] = r18
            r4 = 3
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r19)
            r2[r4] = r5
            r4 = 4
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r20)
            r2[r4] = r5
            r4 = 5
            r2[r4] = r13
            r4 = 6
            r2[r4] = r12
            r4 = 7
            r2[r4] = r23
            r4 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r0.startReplaceableGroup(r4)
            r4 = r3
        L_0x0054:
            if (r3 >= r1) goto L_0x0060
            r5 = r2[r3]
            boolean r5 = r0.changed((java.lang.Object) r5)
            r4 = r4 | r5
            int r3 = r3 + 1
            goto L_0x0054
        L_0x0060:
            java.lang.Object r1 = r24.rememberedValue()
            if (r4 != 0) goto L_0x006e
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r1 != r2) goto L_0x0084
        L_0x006e:
            androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1 r1 = new androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1
            r5 = r1
            r6 = r20
            r7 = r18
            r8 = r19
            r9 = r16
            r10 = r15
            r11 = r17
            r14 = r23
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0.updateRememberedValue(r1)
        L_0x0084:
            r24.endReplaceableGroup()
            of.o r1 = (p404of.C13088o) r1
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x0092
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0092:
            r24.endReplaceableGroup()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridKt.rememberLazyGridMeasurePolicy(androidx.compose.foundation.lazy.grid.LazyGridItemProvider, androidx.compose.foundation.lazy.grid.LazyGridState, of.o, androidx.compose.foundation.layout.PaddingValues, boolean, boolean, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator, androidx.compose.runtime.Composer, int, int):of.o");
    }
}
