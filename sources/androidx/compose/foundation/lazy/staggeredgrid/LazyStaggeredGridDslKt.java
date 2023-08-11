package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13090q;
import p404of.C13091r;

@SourceDebugExtension({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,434:1\n154#2:435\n154#2:436\n154#2:437\n154#2:448\n154#2:449\n154#2:450\n67#3,3:438\n66#3:441\n67#3,3:451\n66#3:454\n1114#4,6:442\n1114#4,6:455\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt\n*L\n63#1:435\n65#1:436\n66#1:437\n148#1:448\n150#1:449\n151#1:450\n93#1:438,3\n93#1:441\n178#1:451,3\n178#1:454\n93#1:442,6\n178#1:455,6\n*E\n"})
/* compiled from: LazyStaggeredGridDsl.kt */
public final class LazyStaggeredGridDslKt {
    /* JADX WARNING: Removed duplicated region for block: B:104:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0116  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.foundation.ExperimentalFoundationApi
    @androidx.compose.runtime.Composable
    /* renamed from: LazyHorizontalStaggeredGrid-cJHQLPU  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m33544LazyHorizontalStaggeredGridcJHQLPU(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells r28, androidx.compose.p002ui.Modifier r29, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r30, androidx.compose.foundation.layout.PaddingValues r31, boolean r32, androidx.compose.foundation.layout.Arrangement.Vertical r33, float r34, androidx.compose.foundation.gestures.FlingBehavior r35, boolean r36, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope, p336ef.C11921v> r37, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            r1 = r28
            r0 = r37
            r15 = r39
            r14 = r40
            java.lang.String r2 = "rows"
            kotlin.jvm.internal.C12775o.m28639i(r1, r2)
            java.lang.String r2 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r0, r2)
            r2 = -8666074(0xffffffffff7bc426, float:-3.3465469E38)
            r3 = r38
            androidx.compose.runtime.Composer r13 = r3.startRestartGroup(r2)
            r3 = r14 & 1
            if (r3 == 0) goto L_0x0022
            r3 = r15 | 6
            goto L_0x0032
        L_0x0022:
            r3 = r15 & 14
            if (r3 != 0) goto L_0x0031
            boolean r3 = r13.changed((java.lang.Object) r1)
            if (r3 == 0) goto L_0x002e
            r3 = 4
            goto L_0x002f
        L_0x002e:
            r3 = 2
        L_0x002f:
            r3 = r3 | r15
            goto L_0x0032
        L_0x0031:
            r3 = r15
        L_0x0032:
            r5 = r14 & 2
            if (r5 == 0) goto L_0x0039
            r3 = r3 | 48
            goto L_0x004c
        L_0x0039:
            r6 = r15 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x004c
            r6 = r29
            boolean r7 = r13.changed((java.lang.Object) r6)
            if (r7 == 0) goto L_0x0048
            r7 = 32
            goto L_0x004a
        L_0x0048:
            r7 = 16
        L_0x004a:
            r3 = r3 | r7
            goto L_0x004e
        L_0x004c:
            r6 = r29
        L_0x004e:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x0054
            r3 = r3 | 128(0x80, float:1.794E-43)
        L_0x0054:
            r8 = r14 & 8
            if (r8 == 0) goto L_0x005b
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x006e
        L_0x005b:
            r9 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x006e
            r9 = r31
            boolean r10 = r13.changed((java.lang.Object) r9)
            if (r10 == 0) goto L_0x006a
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x006c
        L_0x006a:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x006c:
            r3 = r3 | r10
            goto L_0x0070
        L_0x006e:
            r9 = r31
        L_0x0070:
            r10 = r14 & 16
            r11 = 57344(0xe000, float:8.0356E-41)
            if (r10 == 0) goto L_0x007a
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x008e
        L_0x007a:
            r12 = r15 & r11
            if (r12 != 0) goto L_0x008e
            r12 = r32
            boolean r16 = r13.changed((boolean) r12)
            if (r16 == 0) goto L_0x0089
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008b
        L_0x0089:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x008b:
            r3 = r3 | r16
            goto L_0x0090
        L_0x008e:
            r12 = r32
        L_0x0090:
            r16 = r14 & 32
            r17 = 458752(0x70000, float:6.42848E-40)
            if (r16 == 0) goto L_0x009d
            r18 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r18
            r11 = r33
            goto L_0x00b0
        L_0x009d:
            r18 = r15 & r17
            r11 = r33
            if (r18 != 0) goto L_0x00b0
            boolean r18 = r13.changed((java.lang.Object) r11)
            if (r18 == 0) goto L_0x00ac
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ae
        L_0x00ac:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00ae:
            r3 = r3 | r18
        L_0x00b0:
            r18 = r14 & 64
            r19 = 3670016(0x380000, float:5.142788E-39)
            if (r18 == 0) goto L_0x00bd
            r20 = 1572864(0x180000, float:2.204052E-39)
            r3 = r3 | r20
            r2 = r34
            goto L_0x00d0
        L_0x00bd:
            r20 = r15 & r19
            r2 = r34
            if (r20 != 0) goto L_0x00d0
            boolean r21 = r13.changed((float) r2)
            if (r21 == 0) goto L_0x00cc
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ce
        L_0x00cc:
            r21 = 524288(0x80000, float:7.34684E-40)
        L_0x00ce:
            r3 = r3 | r21
        L_0x00d0:
            r21 = 29360128(0x1c00000, float:7.052966E-38)
            r22 = r15 & r21
            if (r22 != 0) goto L_0x00ec
            r4 = r14 & 128(0x80, float:1.794E-43)
            if (r4 != 0) goto L_0x00e5
            r4 = r35
            boolean r23 = r13.changed((java.lang.Object) r4)
            if (r23 == 0) goto L_0x00e7
            r23 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e9
        L_0x00e5:
            r4 = r35
        L_0x00e7:
            r23 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e9:
            r3 = r3 | r23
            goto L_0x00ee
        L_0x00ec:
            r4 = r35
        L_0x00ee:
            r2 = r14 & 256(0x100, float:3.59E-43)
            r23 = 234881024(0xe000000, float:1.5777218E-30)
            if (r2 == 0) goto L_0x00fb
            r24 = 100663296(0x6000000, float:2.4074124E-35)
            r3 = r3 | r24
            r4 = r36
            goto L_0x010e
        L_0x00fb:
            r24 = r15 & r23
            r4 = r36
            if (r24 != 0) goto L_0x010e
            boolean r24 = r13.changed((boolean) r4)
            if (r24 == 0) goto L_0x010a
            r24 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010c
        L_0x010a:
            r24 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010c:
            r3 = r3 | r24
        L_0x010e:
            r4 = r14 & 512(0x200, float:7.175E-43)
            if (r4 == 0) goto L_0x0116
            r4 = 805306368(0x30000000, float:4.656613E-10)
        L_0x0114:
            r3 = r3 | r4
            goto L_0x0127
        L_0x0116:
            r4 = 1879048192(0x70000000, float:1.58456325E29)
            r4 = r4 & r15
            if (r4 != 0) goto L_0x0127
            boolean r4 = r13.changedInstance(r0)
            if (r4 == 0) goto L_0x0124
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0114
        L_0x0124:
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0114
        L_0x0127:
            r4 = 4
            if (r7 != r4) goto L_0x014d
            r4 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r4 = r4 & r3
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r4 != r0) goto L_0x014d
            boolean r0 = r13.getSkipping()
            if (r0 != 0) goto L_0x013a
            goto L_0x014d
        L_0x013a:
            r13.skipToGroupEnd()
            r3 = r30
            r7 = r34
            r8 = r35
            r2 = r6
            r4 = r9
            r6 = r11
            r5 = r12
            r27 = r13
            r9 = r36
            goto L_0x0258
        L_0x014d:
            r13.startDefaults()
            r0 = r15 & 1
            r4 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            if (r0 == 0) goto L_0x0178
            boolean r0 = r13.getDefaultsInvalid()
            if (r0 == 0) goto L_0x015e
            goto L_0x0178
        L_0x015e:
            r13.skipToGroupEnd()
            if (r7 == 0) goto L_0x0165
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0165:
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x016a
            r3 = r3 & r4
        L_0x016a:
            r18 = r30
            r24 = r34
            r25 = r35
            r26 = r36
            r0 = r6
            r22 = r12
            r12 = r9
            goto L_0x01d7
        L_0x0178:
            if (r5 == 0) goto L_0x017d
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            r6 = r0
        L_0x017d:
            r0 = 0
            if (r7 == 0) goto L_0x0188
            r5 = 3
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r5 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(r0, r0, r13, r0, r5)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x018a
        L_0x0188:
            r5 = r30
        L_0x018a:
            if (r8 == 0) goto L_0x0196
            float r7 = (float) r0
            float r7 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r7)
            androidx.compose.foundation.layout.PaddingValues r7 = androidx.compose.foundation.layout.PaddingKt.m33261PaddingValues0680j_4(r7)
            goto L_0x0197
        L_0x0196:
            r7 = r9
        L_0x0197:
            if (r10 == 0) goto L_0x019a
            r12 = r0
        L_0x019a:
            if (r16 == 0) goto L_0x01a8
            androidx.compose.foundation.layout.Arrangement r8 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            float r9 = (float) r0
            float r9 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r9)
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r8 = r8.m33185spacedBy0680j_4(r9)
            goto L_0x01a9
        L_0x01a8:
            r8 = r11
        L_0x01a9:
            if (r18 == 0) goto L_0x01b1
            float r0 = (float) r0
            float r0 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r0)
            goto L_0x01b3
        L_0x01b1:
            r0 = r34
        L_0x01b3:
            r9 = r14 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x01c0
            androidx.compose.foundation.gestures.ScrollableDefaults r9 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE
            r10 = 6
            androidx.compose.foundation.gestures.FlingBehavior r9 = r9.flingBehavior(r13, r10)
            r3 = r3 & r4
            goto L_0x01c2
        L_0x01c0:
            r9 = r35
        L_0x01c2:
            if (r2 == 0) goto L_0x01ca
            r2 = 1
            r24 = r0
            r26 = r2
            goto L_0x01ce
        L_0x01ca:
            r26 = r36
            r24 = r0
        L_0x01ce:
            r18 = r5
            r0 = r6
            r11 = r8
            r25 = r9
            r22 = r12
            r12 = r7
        L_0x01d7:
            r13.endDefaults()
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x01e9
            r2 = -1
            java.lang.String r4 = "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:143)"
            r5 = -8666074(0xffffffffff7bc426, float:-3.3465469E38)
            androidx.compose.runtime.ComposerKt.traceEventStart(r5, r3, r2, r4)
        L_0x01e9:
            androidx.compose.foundation.gestures.Orientation r4 = androidx.compose.foundation.gestures.Orientation.Horizontal
            float r16 = r11.m33207getSpacingD9Ej5fM()
            r2 = r3 & 14
            int r5 = r3 >> 12
            r5 = r5 & 112(0x70, float:1.57E-43)
            r2 = r2 | r5
            int r5 = r3 >> 3
            r6 = r5 & 896(0x380, float:1.256E-42)
            r2 = r2 | r6
            of.o r6 = rememberRowHeightSums(r1, r11, r12, r13, r2)
            int r2 = r3 << 6
            r7 = r2 & 7168(0x1c00, float:1.0045E-41)
            r7 = r7 | 56
            int r8 = r3 << 3
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r8
            r7 = r7 | r9
            r8 = r8 & r17
            r7 = r7 | r8
            r8 = r5 & r19
            r7 = r7 | r8
            r5 = r5 & r21
            r5 = r5 | r7
            r2 = r2 & r23
            r17 = r5 | r2
            int r2 = r3 >> 27
            r19 = r2 & 14
            r20 = 0
            r2 = r18
            r3 = r4
            r4 = r6
            r5 = r0
            r6 = r12
            r7 = r22
            r8 = r25
            r9 = r26
            r10 = r24
            r21 = r11
            r11 = r16
            r23 = r12
            r12 = r37
            r27 = r13
            r14 = r17
            r15 = r19
            r16 = r20
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridKt.m33550LazyStaggeredGridLJWHXA8(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x0249
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0249:
            r2 = r0
            r3 = r18
            r6 = r21
            r5 = r22
            r4 = r23
            r7 = r24
            r8 = r25
            r9 = r26
        L_0x0258:
            androidx.compose.runtime.ScopeUpdateScope r13 = r27.endRestartGroup()
            if (r13 != 0) goto L_0x025f
            goto L_0x0270
        L_0x025f:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1 r14 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1
            r0 = r14
            r1 = r28
            r10 = r37
            r11 = r39
            r12 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.updateScope(r14)
        L_0x0270:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.m33544LazyHorizontalStaggeredGridcJHQLPU(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, float, androidx.compose.foundation.gestures.FlingBehavior, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0116  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.foundation.ExperimentalFoundationApi
    @androidx.compose.runtime.Composable
    /* renamed from: LazyVerticalStaggeredGrid-zadm560  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m33545LazyVerticalStaggeredGridzadm560(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells r28, androidx.compose.p002ui.Modifier r29, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r30, androidx.compose.foundation.layout.PaddingValues r31, boolean r32, float r33, androidx.compose.foundation.layout.Arrangement.Horizontal r34, androidx.compose.foundation.gestures.FlingBehavior r35, boolean r36, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope, p336ef.C11921v> r37, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            r1 = r28
            r0 = r37
            r15 = r39
            r14 = r40
            java.lang.String r2 = "columns"
            kotlin.jvm.internal.C12775o.m28639i(r1, r2)
            java.lang.String r2 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r0, r2)
            r2 = 1695323794(0x650c9692, float:4.1494302E22)
            r3 = r38
            androidx.compose.runtime.Composer r13 = r3.startRestartGroup(r2)
            r3 = r14 & 1
            if (r3 == 0) goto L_0x0022
            r3 = r15 | 6
            goto L_0x0032
        L_0x0022:
            r3 = r15 & 14
            if (r3 != 0) goto L_0x0031
            boolean r3 = r13.changed((java.lang.Object) r1)
            if (r3 == 0) goto L_0x002e
            r3 = 4
            goto L_0x002f
        L_0x002e:
            r3 = 2
        L_0x002f:
            r3 = r3 | r15
            goto L_0x0032
        L_0x0031:
            r3 = r15
        L_0x0032:
            r5 = r14 & 2
            if (r5 == 0) goto L_0x0039
            r3 = r3 | 48
            goto L_0x004c
        L_0x0039:
            r6 = r15 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x004c
            r6 = r29
            boolean r7 = r13.changed((java.lang.Object) r6)
            if (r7 == 0) goto L_0x0048
            r7 = 32
            goto L_0x004a
        L_0x0048:
            r7 = 16
        L_0x004a:
            r3 = r3 | r7
            goto L_0x004e
        L_0x004c:
            r6 = r29
        L_0x004e:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x0054
            r3 = r3 | 128(0x80, float:1.794E-43)
        L_0x0054:
            r8 = r14 & 8
            if (r8 == 0) goto L_0x005b
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x006e
        L_0x005b:
            r9 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x006e
            r9 = r31
            boolean r10 = r13.changed((java.lang.Object) r9)
            if (r10 == 0) goto L_0x006a
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x006c
        L_0x006a:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x006c:
            r3 = r3 | r10
            goto L_0x0070
        L_0x006e:
            r9 = r31
        L_0x0070:
            r10 = r14 & 16
            r11 = 57344(0xe000, float:8.0356E-41)
            if (r10 == 0) goto L_0x007a
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x008e
        L_0x007a:
            r12 = r15 & r11
            if (r12 != 0) goto L_0x008e
            r12 = r32
            boolean r16 = r13.changed((boolean) r12)
            if (r16 == 0) goto L_0x0089
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008b
        L_0x0089:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x008b:
            r3 = r3 | r16
            goto L_0x0090
        L_0x008e:
            r12 = r32
        L_0x0090:
            r16 = r14 & 32
            r17 = 458752(0x70000, float:6.42848E-40)
            if (r16 == 0) goto L_0x009d
            r18 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r18
            r11 = r33
            goto L_0x00b0
        L_0x009d:
            r18 = r15 & r17
            r11 = r33
            if (r18 != 0) goto L_0x00b0
            boolean r18 = r13.changed((float) r11)
            if (r18 == 0) goto L_0x00ac
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ae
        L_0x00ac:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00ae:
            r3 = r3 | r18
        L_0x00b0:
            r18 = r14 & 64
            r19 = 3670016(0x380000, float:5.142788E-39)
            if (r18 == 0) goto L_0x00bd
            r20 = 1572864(0x180000, float:2.204052E-39)
            r3 = r3 | r20
            r2 = r34
            goto L_0x00d0
        L_0x00bd:
            r20 = r15 & r19
            r2 = r34
            if (r20 != 0) goto L_0x00d0
            boolean r21 = r13.changed((java.lang.Object) r2)
            if (r21 == 0) goto L_0x00cc
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ce
        L_0x00cc:
            r21 = 524288(0x80000, float:7.34684E-40)
        L_0x00ce:
            r3 = r3 | r21
        L_0x00d0:
            r21 = 29360128(0x1c00000, float:7.052966E-38)
            r22 = r15 & r21
            if (r22 != 0) goto L_0x00ec
            r4 = r14 & 128(0x80, float:1.794E-43)
            if (r4 != 0) goto L_0x00e5
            r4 = r35
            boolean r23 = r13.changed((java.lang.Object) r4)
            if (r23 == 0) goto L_0x00e7
            r23 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e9
        L_0x00e5:
            r4 = r35
        L_0x00e7:
            r23 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e9:
            r3 = r3 | r23
            goto L_0x00ee
        L_0x00ec:
            r4 = r35
        L_0x00ee:
            r2 = r14 & 256(0x100, float:3.59E-43)
            r23 = 234881024(0xe000000, float:1.5777218E-30)
            if (r2 == 0) goto L_0x00fb
            r24 = 100663296(0x6000000, float:2.4074124E-35)
            r3 = r3 | r24
            r4 = r36
            goto L_0x010e
        L_0x00fb:
            r24 = r15 & r23
            r4 = r36
            if (r24 != 0) goto L_0x010e
            boolean r24 = r13.changed((boolean) r4)
            if (r24 == 0) goto L_0x010a
            r24 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010c
        L_0x010a:
            r24 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010c:
            r3 = r3 | r24
        L_0x010e:
            r4 = r14 & 512(0x200, float:7.175E-43)
            if (r4 == 0) goto L_0x0116
            r4 = 805306368(0x30000000, float:4.656613E-10)
        L_0x0114:
            r3 = r3 | r4
            goto L_0x0127
        L_0x0116:
            r4 = 1879048192(0x70000000, float:1.58456325E29)
            r4 = r4 & r15
            if (r4 != 0) goto L_0x0127
            boolean r4 = r13.changedInstance(r0)
            if (r4 == 0) goto L_0x0124
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0114
        L_0x0124:
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0114
        L_0x0127:
            r4 = 4
            if (r7 != r4) goto L_0x014d
            r4 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r4 = r4 & r3
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r4 != r0) goto L_0x014d
            boolean r0 = r13.getSkipping()
            if (r0 != 0) goto L_0x013a
            goto L_0x014d
        L_0x013a:
            r13.skipToGroupEnd()
            r3 = r30
            r7 = r34
            r8 = r35
            r2 = r6
            r4 = r9
            r6 = r11
            r5 = r12
            r27 = r13
            r9 = r36
            goto L_0x025b
        L_0x014d:
            r13.startDefaults()
            r0 = r15 & 1
            r4 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            if (r0 == 0) goto L_0x017a
            boolean r0 = r13.getDefaultsInvalid()
            if (r0 == 0) goto L_0x015e
            goto L_0x017a
        L_0x015e:
            r13.skipToGroupEnd()
            if (r7 == 0) goto L_0x0165
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0165:
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x016a
            r3 = r3 & r4
        L_0x016a:
            r18 = r30
            r25 = r35
            r26 = r36
            r0 = r6
            r24 = r11
            r22 = r12
            r11 = r34
            r12 = r9
            goto L_0x01d8
        L_0x017a:
            if (r5 == 0) goto L_0x017f
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            r6 = r0
        L_0x017f:
            r0 = 0
            if (r7 == 0) goto L_0x018a
            r5 = 3
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r5 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(r0, r0, r13, r0, r5)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x018c
        L_0x018a:
            r5 = r30
        L_0x018c:
            if (r8 == 0) goto L_0x0198
            float r7 = (float) r0
            float r7 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r7)
            androidx.compose.foundation.layout.PaddingValues r7 = androidx.compose.foundation.layout.PaddingKt.m33261PaddingValues0680j_4(r7)
            goto L_0x0199
        L_0x0198:
            r7 = r9
        L_0x0199:
            if (r10 == 0) goto L_0x019c
            r12 = r0
        L_0x019c:
            if (r16 == 0) goto L_0x01a4
            float r8 = (float) r0
            float r8 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r8)
            goto L_0x01a5
        L_0x01a4:
            r8 = r11
        L_0x01a5:
            if (r18 == 0) goto L_0x01b3
            androidx.compose.foundation.layout.Arrangement r9 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            float r0 = (float) r0
            float r0 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r0)
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r0 = r9.m33185spacedBy0680j_4(r0)
            goto L_0x01b5
        L_0x01b3:
            r0 = r34
        L_0x01b5:
            r9 = r14 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x01c2
            androidx.compose.foundation.gestures.ScrollableDefaults r9 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE
            r10 = 6
            androidx.compose.foundation.gestures.FlingBehavior r9 = r9.flingBehavior(r13, r10)
            r3 = r3 & r4
            goto L_0x01c4
        L_0x01c2:
            r9 = r35
        L_0x01c4:
            if (r2 == 0) goto L_0x01cb
            r2 = 1
            r11 = r0
            r26 = r2
            goto L_0x01ce
        L_0x01cb:
            r26 = r36
            r11 = r0
        L_0x01ce:
            r18 = r5
            r0 = r6
            r24 = r8
            r25 = r9
            r22 = r12
            r12 = r7
        L_0x01d8:
            r13.endDefaults()
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x01ea
            r2 = -1
            java.lang.String r4 = "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:58)"
            r5 = 1695323794(0x650c9692, float:4.1494302E22)
            androidx.compose.runtime.ComposerKt.traceEventStart(r5, r3, r2, r4)
        L_0x01ea:
            androidx.compose.foundation.gestures.Orientation r4 = androidx.compose.foundation.gestures.Orientation.Vertical
            float r16 = r11.m33193getSpacingD9Ej5fM()
            r2 = r3 & 14
            int r5 = r3 >> 15
            r5 = r5 & 112(0x70, float:1.57E-43)
            r2 = r2 | r5
            int r5 = r3 >> 3
            r6 = r5 & 896(0x380, float:1.256E-42)
            r2 = r2 | r6
            of.o r6 = rememberColumnWidthSums(r1, r11, r12, r13, r2)
            int r2 = r3 << 6
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | 56
            int r7 = r3 << 3
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r7
            r2 = r2 | r8
            r7 = r7 & r17
            r2 = r2 | r7
            r7 = r5 & r19
            r2 = r2 | r7
            r5 = r5 & r21
            r2 = r2 | r5
            int r5 = r3 << 9
            r5 = r5 & r23
            r17 = r2 | r5
            int r2 = r3 >> 27
            r19 = r2 & 14
            r20 = 0
            r2 = r18
            r3 = r4
            r4 = r6
            r5 = r0
            r6 = r12
            r7 = r22
            r8 = r25
            r9 = r26
            r10 = r24
            r21 = r11
            r11 = r16
            r23 = r12
            r12 = r37
            r27 = r13
            r14 = r17
            r15 = r19
            r16 = r20
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridKt.m33550LazyStaggeredGridLJWHXA8(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x024c
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x024c:
            r2 = r0
            r3 = r18
            r7 = r21
            r5 = r22
            r4 = r23
            r6 = r24
            r8 = r25
            r9 = r26
        L_0x025b:
            androidx.compose.runtime.ScopeUpdateScope r13 = r27.endRestartGroup()
            if (r13 != 0) goto L_0x0262
            goto L_0x0273
        L_0x0262:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1 r14 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1
            r0 = r14
            r1 = r28
            r10 = r37
            r11 = r39
            r12 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.updateScope(r14)
        L_0x0273:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.m33545LazyVerticalStaggeredGridzadm560(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, androidx.compose.foundation.layout.PaddingValues, boolean, float, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    @ExperimentalFoundationApi
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(LazyStaggeredGridScope lazyStaggeredGridScope, List<? extends T> list, Function1<? super T, ? extends Object> function1, Function1<? super T, ? extends Object> function12, Function1<? super T, StaggeredGridItemSpan> function13, C13090q<? super LazyStaggeredGridItemScope, ? super T, ? super Composer, ? super Integer, C11921v> qVar) {
        C12775o.m28639i(lazyStaggeredGridScope, "<this>");
        C12775o.m28639i(list, "items");
        C12775o.m28639i(function12, "contentType");
        C12775o.m28639i(qVar, "itemContent");
        lazyStaggeredGridScope.items(list.size(), function1 != null ? new LazyStaggeredGridDslKt$items$2$1(function1, list) : null, new LazyStaggeredGridDslKt$items$3(function12, list), function13 != null ? new LazyStaggeredGridDslKt$items$4$1(function13, list) : null, ComposableLambdaKt.composableLambdaInstance(-886456479, true, new LazyStaggeredGridDslKt$items$5(qVar, list)));
    }

    public static /* synthetic */ void items$default(LazyStaggeredGridScope lazyStaggeredGridScope, List list, Function1 function1, Function1 function12, Function1 function13, C13090q qVar, int i, Object obj) {
        LazyStaggeredGridDslKt$items$4$1 lazyStaggeredGridDslKt$items$4$1 = null;
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function12 = LazyStaggeredGridDslKt$items$1.INSTANCE;
        }
        if ((i & 8) != 0) {
            function13 = null;
        }
        C12775o.m28639i(lazyStaggeredGridScope, "<this>");
        C12775o.m28639i(list, "items");
        C12775o.m28639i(function12, "contentType");
        C12775o.m28639i(qVar, "itemContent");
        int size = list.size();
        LazyStaggeredGridDslKt$items$2$1 lazyStaggeredGridDslKt$items$2$1 = function1 != null ? new LazyStaggeredGridDslKt$items$2$1(function1, list) : null;
        LazyStaggeredGridDslKt$items$3 lazyStaggeredGridDslKt$items$3 = new LazyStaggeredGridDslKt$items$3(function12, list);
        if (function13 != null) {
            lazyStaggeredGridDslKt$items$4$1 = new LazyStaggeredGridDslKt$items$4$1(function13, list);
        }
        lazyStaggeredGridScope.items(size, lazyStaggeredGridDslKt$items$2$1, lazyStaggeredGridDslKt$items$3, lazyStaggeredGridDslKt$items$4$1, ComposableLambdaKt.composableLambdaInstance(-886456479, true, new LazyStaggeredGridDslKt$items$5(qVar, list)));
    }

    @ExperimentalFoundationApi
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(LazyStaggeredGridScope lazyStaggeredGridScope, List<? extends T> list, C13088o<? super Integer, ? super T, ? extends Object> oVar, C13088o<? super Integer, ? super T, ? extends Object> oVar2, C13088o<? super Integer, ? super T, StaggeredGridItemSpan> oVar3, C13091r<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, C11921v> rVar) {
        C12775o.m28639i(lazyStaggeredGridScope, "<this>");
        C12775o.m28639i(list, "items");
        C12775o.m28639i(oVar2, "contentType");
        C12775o.m28639i(rVar, "itemContent");
        lazyStaggeredGridScope.items(list.size(), oVar != null ? new LazyStaggeredGridDslKt$itemsIndexed$2$1(oVar, list) : null, new LazyStaggeredGridDslKt$itemsIndexed$3(oVar2, list), oVar3 != null ? new LazyStaggeredGridDslKt$itemsIndexed$4$1(oVar3, list) : null, ComposableLambdaKt.composableLambdaInstance(284833944, true, new LazyStaggeredGridDslKt$itemsIndexed$5(rVar, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyStaggeredGridScope lazyStaggeredGridScope, List list, C13088o oVar, C13088o oVar2, C13088o oVar3, C13091r rVar, int i, Object obj) {
        LazyStaggeredGridDslKt$itemsIndexed$4$1 lazyStaggeredGridDslKt$itemsIndexed$4$1 = null;
        if ((i & 2) != 0) {
            oVar = null;
        }
        if ((i & 4) != 0) {
            oVar2 = LazyStaggeredGridDslKt$itemsIndexed$1.INSTANCE;
        }
        if ((i & 8) != 0) {
            oVar3 = null;
        }
        C12775o.m28639i(lazyStaggeredGridScope, "<this>");
        C12775o.m28639i(list, "items");
        C12775o.m28639i(oVar2, "contentType");
        C12775o.m28639i(rVar, "itemContent");
        int size = list.size();
        LazyStaggeredGridDslKt$itemsIndexed$2$1 lazyStaggeredGridDslKt$itemsIndexed$2$1 = oVar != null ? new LazyStaggeredGridDslKt$itemsIndexed$2$1(oVar, list) : null;
        LazyStaggeredGridDslKt$itemsIndexed$3 lazyStaggeredGridDslKt$itemsIndexed$3 = new LazyStaggeredGridDslKt$itemsIndexed$3(oVar2, list);
        if (oVar3 != null) {
            lazyStaggeredGridDslKt$itemsIndexed$4$1 = new LazyStaggeredGridDslKt$itemsIndexed$4$1(oVar3, list);
        }
        lazyStaggeredGridScope.items(size, lazyStaggeredGridDslKt$itemsIndexed$2$1, lazyStaggeredGridDslKt$itemsIndexed$3, lazyStaggeredGridDslKt$itemsIndexed$4$1, ComposableLambdaKt.composableLambdaInstance(284833944, true, new LazyStaggeredGridDslKt$itemsIndexed$5(rVar, list)));
    }

    @Composable
    private static final C13088o<Density, Constraints, int[]> rememberColumnWidthSums(StaggeredGridCells staggeredGridCells, Arrangement.Horizontal horizontal, PaddingValues paddingValues, Composer composer, int i) {
        composer.startReplaceableGroup(1426908594);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1426908594, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnWidthSums (LazyStaggeredGridDsl.kt:88)");
        }
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed((Object) staggeredGridCells) | composer.changed((Object) horizontal) | composer.changed((Object) paddingValues);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyStaggeredGridDslKt$rememberColumnWidthSums$1$1(paddingValues, staggeredGridCells, horizontal);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        C13088o<Density, Constraints, int[]> oVar = (C13088o) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return oVar;
    }

    @Composable
    private static final C13088o<Density, Constraints, int[]> rememberRowHeightSums(StaggeredGridCells staggeredGridCells, Arrangement.Vertical vertical, PaddingValues paddingValues, Composer composer, int i) {
        composer.startReplaceableGroup(-1665208491);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1665208491, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowHeightSums (LazyStaggeredGridDsl.kt:173)");
        }
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed((Object) staggeredGridCells) | composer.changed((Object) vertical) | composer.changed((Object) paddingValues);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyStaggeredGridDslKt$rememberRowHeightSums$1$1(paddingValues, staggeredGridCells, vertical);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        C13088o<Density, Constraints, int[]> oVar = (C13088o) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return oVar;
    }

    @ExperimentalFoundationApi
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(LazyStaggeredGridScope lazyStaggeredGridScope, T[] tArr, Function1<? super T, ? extends Object> function1, Function1<? super T, ? extends Object> function12, Function1<? super T, StaggeredGridItemSpan> function13, C13090q<? super LazyStaggeredGridItemScope, ? super T, ? super Composer, ? super Integer, C11921v> qVar) {
        C12775o.m28639i(lazyStaggeredGridScope, "<this>");
        C12775o.m28639i(tArr, "items");
        C12775o.m28639i(function12, "contentType");
        C12775o.m28639i(qVar, "itemContent");
        lazyStaggeredGridScope.items(tArr.length, function1 != null ? new LazyStaggeredGridDslKt$items$7$1(function1, tArr) : null, new LazyStaggeredGridDslKt$items$8(function12, tArr), function13 != null ? new LazyStaggeredGridDslKt$items$9$1(function13, tArr) : null, ComposableLambdaKt.composableLambdaInstance(2101296000, true, new LazyStaggeredGridDslKt$items$10(qVar, tArr)));
    }

    @ExperimentalFoundationApi
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(LazyStaggeredGridScope lazyStaggeredGridScope, T[] tArr, C13088o<? super Integer, ? super T, ? extends Object> oVar, C13088o<? super Integer, ? super T, ? extends Object> oVar2, C13088o<? super Integer, ? super T, StaggeredGridItemSpan> oVar3, C13091r<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, C11921v> rVar) {
        C12775o.m28639i(lazyStaggeredGridScope, "<this>");
        C12775o.m28639i(tArr, "items");
        C12775o.m28639i(oVar2, "contentType");
        C12775o.m28639i(rVar, "itemContent");
        lazyStaggeredGridScope.items(tArr.length, oVar != null ? new LazyStaggeredGridDslKt$itemsIndexed$7$1(oVar, tArr) : null, new LazyStaggeredGridDslKt$itemsIndexed$8(oVar2, tArr), oVar3 != null ? new LazyStaggeredGridDslKt$itemsIndexed$9$1(oVar3, tArr) : null, ComposableLambdaKt.composableLambdaInstance(-804487775, true, new LazyStaggeredGridDslKt$itemsIndexed$10(rVar, tArr)));
    }

    public static /* synthetic */ void items$default(LazyStaggeredGridScope lazyStaggeredGridScope, Object[] objArr, Function1 function1, Function1 function12, Function1 function13, C13090q qVar, int i, Object obj) {
        LazyStaggeredGridDslKt$items$9$1 lazyStaggeredGridDslKt$items$9$1 = null;
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function12 = LazyStaggeredGridDslKt$items$6.INSTANCE;
        }
        if ((i & 8) != 0) {
            function13 = null;
        }
        C12775o.m28639i(lazyStaggeredGridScope, "<this>");
        C12775o.m28639i(objArr, "items");
        C12775o.m28639i(function12, "contentType");
        C12775o.m28639i(qVar, "itemContent");
        int length = objArr.length;
        LazyStaggeredGridDslKt$items$7$1 lazyStaggeredGridDslKt$items$7$1 = function1 != null ? new LazyStaggeredGridDslKt$items$7$1(function1, objArr) : null;
        LazyStaggeredGridDslKt$items$8 lazyStaggeredGridDslKt$items$8 = new LazyStaggeredGridDslKt$items$8(function12, objArr);
        if (function13 != null) {
            lazyStaggeredGridDslKt$items$9$1 = new LazyStaggeredGridDslKt$items$9$1(function13, objArr);
        }
        lazyStaggeredGridScope.items(length, lazyStaggeredGridDslKt$items$7$1, lazyStaggeredGridDslKt$items$8, lazyStaggeredGridDslKt$items$9$1, ComposableLambdaKt.composableLambdaInstance(2101296000, true, new LazyStaggeredGridDslKt$items$10(qVar, objArr)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyStaggeredGridScope lazyStaggeredGridScope, Object[] objArr, C13088o oVar, C13088o oVar2, C13088o oVar3, C13091r rVar, int i, Object obj) {
        LazyStaggeredGridDslKt$itemsIndexed$9$1 lazyStaggeredGridDslKt$itemsIndexed$9$1 = null;
        if ((i & 2) != 0) {
            oVar = null;
        }
        if ((i & 4) != 0) {
            oVar2 = LazyStaggeredGridDslKt$itemsIndexed$6.INSTANCE;
        }
        if ((i & 8) != 0) {
            oVar3 = null;
        }
        C12775o.m28639i(lazyStaggeredGridScope, "<this>");
        C12775o.m28639i(objArr, "items");
        C12775o.m28639i(oVar2, "contentType");
        C12775o.m28639i(rVar, "itemContent");
        int length = objArr.length;
        LazyStaggeredGridDslKt$itemsIndexed$7$1 lazyStaggeredGridDslKt$itemsIndexed$7$1 = oVar != null ? new LazyStaggeredGridDslKt$itemsIndexed$7$1(oVar, objArr) : null;
        LazyStaggeredGridDslKt$itemsIndexed$8 lazyStaggeredGridDslKt$itemsIndexed$8 = new LazyStaggeredGridDslKt$itemsIndexed$8(oVar2, objArr);
        if (oVar3 != null) {
            lazyStaggeredGridDslKt$itemsIndexed$9$1 = new LazyStaggeredGridDslKt$itemsIndexed$9$1(oVar3, objArr);
        }
        lazyStaggeredGridScope.items(length, lazyStaggeredGridDslKt$itemsIndexed$7$1, lazyStaggeredGridDslKt$itemsIndexed$8, lazyStaggeredGridDslKt$itemsIndexed$9$1, ComposableLambdaKt.composableLambdaInstance(-804487775, true, new LazyStaggeredGridDslKt$itemsIndexed$10(rVar, objArr)));
    }
}
