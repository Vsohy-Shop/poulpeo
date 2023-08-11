package androidx.compose.foundation.lazy;

import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13090q;
import p404of.C13091r;

@SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,423:1\n136#1,12:424\n171#1,12:436\n206#1,12:448\n241#1,12:460\n154#2:472\n154#2:473\n154#2:474\n154#2:475\n*S KotlinDebug\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n154#1:424,12\n189#1:436,12\n224#1:448,12\n259#1:460,12\n293#1:472\n349#1:473\n377#1:474\n403#1:475\n*E\n"})
/* compiled from: LazyDsl.kt */
public final class LazyDslKt {
    /* JADX WARNING: Removed duplicated region for block: B:100:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0128  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void LazyColumn(androidx.compose.p002ui.Modifier r27, androidx.compose.foundation.lazy.LazyListState r28, androidx.compose.foundation.layout.PaddingValues r29, boolean r30, androidx.compose.foundation.layout.Arrangement.Vertical r31, androidx.compose.p002ui.Alignment.Horizontal r32, androidx.compose.foundation.gestures.FlingBehavior r33, boolean r34, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.LazyListScope, p336ef.C11921v> r35, androidx.compose.runtime.Composer r36, int r37, int r38) {
        /*
            r13 = r35
            r12 = r37
            r9 = r38
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r13, r0)
            r0 = -740714857(0xffffffffd3d99697, float:-1.86906876E12)
            r1 = r36
            androidx.compose.runtime.Composer r8 = r1.startRestartGroup(r0)
            r1 = r9 & 1
            if (r1 == 0) goto L_0x001e
            r2 = r12 | 6
            r3 = r2
            r2 = r27
            goto L_0x0032
        L_0x001e:
            r2 = r12 & 14
            if (r2 != 0) goto L_0x002f
            r2 = r27
            boolean r3 = r8.changed((java.lang.Object) r2)
            if (r3 == 0) goto L_0x002c
            r3 = 4
            goto L_0x002d
        L_0x002c:
            r3 = 2
        L_0x002d:
            r3 = r3 | r12
            goto L_0x0032
        L_0x002f:
            r2 = r27
            r3 = r12
        L_0x0032:
            r4 = r12 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004b
            r4 = r9 & 2
            if (r4 != 0) goto L_0x0045
            r4 = r28
            boolean r5 = r8.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x0047
            r5 = 32
            goto L_0x0049
        L_0x0045:
            r4 = r28
        L_0x0047:
            r5 = 16
        L_0x0049:
            r3 = r3 | r5
            goto L_0x004d
        L_0x004b:
            r4 = r28
        L_0x004d:
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0054
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0054:
            r6 = r12 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0067
            r6 = r29
            boolean r7 = r8.changed((java.lang.Object) r6)
            if (r7 == 0) goto L_0x0063
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r3 = r3 | r7
            goto L_0x0069
        L_0x0067:
            r6 = r29
        L_0x0069:
            r7 = r9 & 8
            if (r7 == 0) goto L_0x0070
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x0070:
            r10 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x0083
            r10 = r30
            boolean r11 = r8.changed((boolean) r10)
            if (r11 == 0) goto L_0x007f
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r3 = r3 | r11
            goto L_0x0085
        L_0x0083:
            r10 = r30
        L_0x0085:
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r12
            if (r11 != 0) goto L_0x00a0
            r11 = r9 & 16
            if (r11 != 0) goto L_0x009a
            r11 = r31
            boolean r14 = r8.changed((java.lang.Object) r11)
            if (r14 == 0) goto L_0x009c
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009a:
            r11 = r31
        L_0x009c:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r3 = r3 | r14
            goto L_0x00a2
        L_0x00a0:
            r11 = r31
        L_0x00a2:
            r14 = r9 & 32
            r15 = 458752(0x70000, float:6.42848E-40)
            if (r14 == 0) goto L_0x00af
            r16 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r16
            r15 = r32
            goto L_0x00c2
        L_0x00af:
            r16 = r12 & r15
            r15 = r32
            if (r16 != 0) goto L_0x00c2
            boolean r16 = r8.changed((java.lang.Object) r15)
            if (r16 == 0) goto L_0x00be
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c0
        L_0x00be:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00c0:
            r3 = r3 | r16
        L_0x00c2:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r17 = r12 & r16
            if (r17 != 0) goto L_0x00dc
            r17 = r9 & 64
            r0 = r33
            if (r17 != 0) goto L_0x00d7
            boolean r18 = r8.changed((java.lang.Object) r0)
            if (r18 == 0) goto L_0x00d7
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d9
        L_0x00d7:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00d9:
            r3 = r3 | r18
            goto L_0x00de
        L_0x00dc:
            r0 = r33
        L_0x00de:
            r0 = r9 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00e9
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            r3 = r3 | r18
            r2 = r34
            goto L_0x00fe
        L_0x00e9:
            r18 = 29360128(0x1c00000, float:7.052966E-38)
            r18 = r12 & r18
            r2 = r34
            if (r18 != 0) goto L_0x00fe
            boolean r18 = r8.changed((boolean) r2)
            if (r18 == 0) goto L_0x00fa
            r18 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fc
        L_0x00fa:
            r18 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fc:
            r3 = r3 | r18
        L_0x00fe:
            r2 = r9 & 256(0x100, float:3.59E-43)
            r18 = 234881024(0xe000000, float:1.5777218E-30)
            if (r2 == 0) goto L_0x0108
            r2 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x0106:
            r3 = r3 | r2
            goto L_0x0118
        L_0x0108:
            r2 = r12 & r18
            if (r2 != 0) goto L_0x0118
            boolean r2 = r8.changedInstance(r13)
            if (r2 == 0) goto L_0x0115
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0106
        L_0x0115:
            r2 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x0106
        L_0x0118:
            r2 = 191739611(0xb6db6db, float:4.5782105E-32)
            r2 = r2 & r3
            r4 = 38347922(0x2492492, float:1.4777643E-37)
            if (r2 != r4) goto L_0x013b
            boolean r2 = r8.getSkipping()
            if (r2 != 0) goto L_0x0128
            goto L_0x013b
        L_0x0128:
            r8.skipToGroupEnd()
            r1 = r27
            r2 = r28
            r7 = r33
            r3 = r6
            r17 = r8
            r4 = r10
            r5 = r11
            r6 = r15
            r8 = r34
            goto L_0x0253
        L_0x013b:
            r8.startDefaults()
            r2 = r12 & 1
            r4 = -3670017(0xffffffffffc7ffff, float:NaN)
            r19 = -57345(0xffffffffffff1fff, float:NaN)
            if (r2 == 0) goto L_0x0175
            boolean r2 = r8.getDefaultsInvalid()
            if (r2 == 0) goto L_0x014f
            goto L_0x0175
        L_0x014f:
            r8.skipToGroupEnd()
            r0 = r9 & 2
            if (r0 == 0) goto L_0x0158
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0158:
            r0 = r9 & 16
            if (r0 == 0) goto L_0x015e
            r3 = r3 & r19
        L_0x015e:
            r0 = r9 & 64
            if (r0 == 0) goto L_0x0163
            r3 = r3 & r4
        L_0x0163:
            r19 = r27
            r20 = r28
            r25 = r33
            r26 = r34
            r21 = r6
            r22 = r10
            r23 = r11
            r24 = r15
            goto L_0x01e3
        L_0x0175:
            if (r1 == 0) goto L_0x017a
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x017c
        L_0x017a:
            r1 = r27
        L_0x017c:
            r2 = r9 & 2
            r4 = 0
            if (r2 == 0) goto L_0x0189
            r2 = 3
            androidx.compose.foundation.lazy.LazyListState r2 = androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(r4, r4, r8, r4, r2)
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x018b
        L_0x0189:
            r2 = r28
        L_0x018b:
            if (r5 == 0) goto L_0x0197
            float r5 = (float) r4
            float r5 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r5)
            androidx.compose.foundation.layout.PaddingValues r5 = androidx.compose.foundation.layout.PaddingKt.m33261PaddingValues0680j_4(r5)
            goto L_0x0198
        L_0x0197:
            r5 = r6
        L_0x0198:
            if (r7 == 0) goto L_0x019b
            goto L_0x019c
        L_0x019b:
            r4 = r10
        L_0x019c:
            r6 = r9 & 16
            if (r6 == 0) goto L_0x01b0
            androidx.compose.foundation.layout.Arrangement r6 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            if (r4 != 0) goto L_0x01a9
            androidx.compose.foundation.layout.Arrangement$Vertical r6 = r6.getTop()
            goto L_0x01ad
        L_0x01a9:
            androidx.compose.foundation.layout.Arrangement$Vertical r6 = r6.getBottom()
        L_0x01ad:
            r3 = r3 & r19
            goto L_0x01b1
        L_0x01b0:
            r6 = r11
        L_0x01b1:
            if (r14 == 0) goto L_0x01ba
            androidx.compose.ui.Alignment$Companion r7 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment$Horizontal r7 = r7.getStart()
            goto L_0x01bb
        L_0x01ba:
            r7 = r15
        L_0x01bb:
            r10 = r9 & 64
            if (r10 == 0) goto L_0x01cb
            androidx.compose.foundation.gestures.ScrollableDefaults r10 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE
            r11 = 6
            androidx.compose.foundation.gestures.FlingBehavior r10 = r10.flingBehavior(r8, r11)
            r11 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r11
            goto L_0x01cd
        L_0x01cb:
            r10 = r33
        L_0x01cd:
            if (r0 == 0) goto L_0x01d3
            r0 = 1
            r26 = r0
            goto L_0x01d5
        L_0x01d3:
            r26 = r34
        L_0x01d5:
            r19 = r1
            r20 = r2
            r22 = r4
            r21 = r5
            r23 = r6
            r24 = r7
            r25 = r10
        L_0x01e3:
            r8.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01f5
            r0 = -1
            java.lang.String r1 = "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)"
            r2 = -740714857(0xffffffffd3d99697, float:-1.86906876E12)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r3, r0, r1)
        L_0x01f5:
            r4 = 1
            r7 = 0
            r10 = 0
            r11 = 0
            r0 = r3 & 14
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r1 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            r1 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            r1 = r3 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r1
            int r1 = r3 >> 3
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r1
            r0 = r0 | r2
            r1 = r1 & r16
            r0 = r0 | r1
            int r1 = r3 << 9
            r1 = r1 & r18
            r0 = r0 | r1
            int r1 = r3 << 15
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r1 = r1 & r2
            r14 = r0 | r1
            int r0 = r3 >> 18
            r15 = r0 & 896(0x380, float:1.256E-42)
            r16 = 3200(0xc80, float:4.484E-42)
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r5 = r25
            r6 = r26
            r17 = r8
            r8 = r24
            r9 = r23
            r12 = r35
            r13 = r17
            androidx.compose.foundation.lazy.LazyListKt.LazyList(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0243
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0243:
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r25
            r8 = r26
        L_0x0253:
            androidx.compose.runtime.ScopeUpdateScope r12 = r17.endRestartGroup()
            if (r12 != 0) goto L_0x025a
            goto L_0x0269
        L_0x025a:
            androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$1 r13 = new androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$1
            r0 = r13
            r9 = r35
            r10 = r37
            r11 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.updateScope(r13)
        L_0x0269:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0127  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void LazyRow(androidx.compose.p002ui.Modifier r26, androidx.compose.foundation.lazy.LazyListState r27, androidx.compose.foundation.layout.PaddingValues r28, boolean r29, androidx.compose.foundation.layout.Arrangement.Horizontal r30, androidx.compose.p002ui.Alignment.Vertical r31, androidx.compose.foundation.gestures.FlingBehavior r32, boolean r33, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.LazyListScope, p336ef.C11921v> r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            r13 = r34
            r12 = r36
            r11 = r37
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r13, r0)
            r0 = -1724297413(0xffffffff99394f3b, float:-9.580276E-24)
            r1 = r35
            androidx.compose.runtime.Composer r10 = r1.startRestartGroup(r0)
            r1 = r11 & 1
            if (r1 == 0) goto L_0x001e
            r2 = r12 | 6
            r3 = r2
            r2 = r26
            goto L_0x0032
        L_0x001e:
            r2 = r12 & 14
            if (r2 != 0) goto L_0x002f
            r2 = r26
            boolean r3 = r10.changed((java.lang.Object) r2)
            if (r3 == 0) goto L_0x002c
            r3 = 4
            goto L_0x002d
        L_0x002c:
            r3 = 2
        L_0x002d:
            r3 = r3 | r12
            goto L_0x0032
        L_0x002f:
            r2 = r26
            r3 = r12
        L_0x0032:
            r4 = r12 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004b
            r4 = r11 & 2
            if (r4 != 0) goto L_0x0045
            r4 = r27
            boolean r5 = r10.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x0047
            r5 = 32
            goto L_0x0049
        L_0x0045:
            r4 = r27
        L_0x0047:
            r5 = 16
        L_0x0049:
            r3 = r3 | r5
            goto L_0x004d
        L_0x004b:
            r4 = r27
        L_0x004d:
            r5 = r11 & 4
            if (r5 == 0) goto L_0x0054
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0054:
            r6 = r12 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0067
            r6 = r28
            boolean r7 = r10.changed((java.lang.Object) r6)
            if (r7 == 0) goto L_0x0063
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r3 = r3 | r7
            goto L_0x0069
        L_0x0067:
            r6 = r28
        L_0x0069:
            r7 = r11 & 8
            if (r7 == 0) goto L_0x0070
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x0070:
            r8 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0083
            r8 = r29
            boolean r9 = r10.changed((boolean) r8)
            if (r9 == 0) goto L_0x007f
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r3 = r3 | r9
            goto L_0x0085
        L_0x0083:
            r8 = r29
        L_0x0085:
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r12
            if (r9 != 0) goto L_0x00a0
            r9 = r11 & 16
            if (r9 != 0) goto L_0x009a
            r9 = r30
            boolean r14 = r10.changed((java.lang.Object) r9)
            if (r14 == 0) goto L_0x009c
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009a:
            r9 = r30
        L_0x009c:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r3 = r3 | r14
            goto L_0x00a2
        L_0x00a0:
            r9 = r30
        L_0x00a2:
            r14 = r11 & 32
            r15 = 458752(0x70000, float:6.42848E-40)
            if (r14 == 0) goto L_0x00af
            r16 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r16
            r15 = r31
            goto L_0x00c2
        L_0x00af:
            r16 = r12 & r15
            r15 = r31
            if (r16 != 0) goto L_0x00c2
            boolean r16 = r10.changed((java.lang.Object) r15)
            if (r16 == 0) goto L_0x00be
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c0
        L_0x00be:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00c0:
            r3 = r3 | r16
        L_0x00c2:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r17 = r12 & r16
            if (r17 != 0) goto L_0x00dc
            r17 = r11 & 64
            r0 = r32
            if (r17 != 0) goto L_0x00d7
            boolean r18 = r10.changed((java.lang.Object) r0)
            if (r18 == 0) goto L_0x00d7
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d9
        L_0x00d7:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00d9:
            r3 = r3 | r18
            goto L_0x00de
        L_0x00dc:
            r0 = r32
        L_0x00de:
            r0 = r11 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00e9
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            r3 = r3 | r18
            r2 = r33
            goto L_0x00fe
        L_0x00e9:
            r18 = 29360128(0x1c00000, float:7.052966E-38)
            r18 = r12 & r18
            r2 = r33
            if (r18 != 0) goto L_0x00fe
            boolean r18 = r10.changed((boolean) r2)
            if (r18 == 0) goto L_0x00fa
            r18 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fc
        L_0x00fa:
            r18 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fc:
            r3 = r3 | r18
        L_0x00fe:
            r2 = r11 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x0106
            r2 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x0104:
            r3 = r3 | r2
            goto L_0x0117
        L_0x0106:
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r12
            if (r2 != 0) goto L_0x0117
            boolean r2 = r10.changedInstance(r13)
            if (r2 == 0) goto L_0x0114
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0104
        L_0x0114:
            r2 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x0104
        L_0x0117:
            r2 = 191739611(0xb6db6db, float:4.5782105E-32)
            r2 = r2 & r3
            r4 = 38347922(0x2492492, float:1.4777643E-37)
            if (r2 != r4) goto L_0x013a
            boolean r2 = r10.getSkipping()
            if (r2 != 0) goto L_0x0127
            goto L_0x013a
        L_0x0127:
            r10.skipToGroupEnd()
            r1 = r26
            r2 = r27
            r7 = r32
            r3 = r6
            r4 = r8
            r5 = r9
            r17 = r10
            r6 = r15
            r8 = r33
            goto L_0x0252
        L_0x013a:
            r10.startDefaults()
            r2 = r12 & 1
            r4 = -3670017(0xffffffffffc7ffff, float:NaN)
            r18 = -57345(0xffffffffffff1fff, float:NaN)
            if (r2 == 0) goto L_0x0174
            boolean r2 = r10.getDefaultsInvalid()
            if (r2 == 0) goto L_0x014e
            goto L_0x0174
        L_0x014e:
            r10.skipToGroupEnd()
            r0 = r11 & 2
            if (r0 == 0) goto L_0x0157
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0157:
            r0 = r11 & 16
            if (r0 == 0) goto L_0x015d
            r3 = r3 & r18
        L_0x015d:
            r0 = r11 & 64
            if (r0 == 0) goto L_0x0162
            r3 = r3 & r4
        L_0x0162:
            r18 = r26
            r19 = r27
            r24 = r32
            r25 = r33
            r20 = r6
            r21 = r8
            r22 = r9
            r23 = r15
            goto L_0x01e2
        L_0x0174:
            if (r1 == 0) goto L_0x0179
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x017b
        L_0x0179:
            r1 = r26
        L_0x017b:
            r2 = r11 & 2
            r4 = 0
            if (r2 == 0) goto L_0x0188
            r2 = 3
            androidx.compose.foundation.lazy.LazyListState r2 = androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(r4, r4, r10, r4, r2)
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x018a
        L_0x0188:
            r2 = r27
        L_0x018a:
            if (r5 == 0) goto L_0x0196
            float r5 = (float) r4
            float r5 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r5)
            androidx.compose.foundation.layout.PaddingValues r5 = androidx.compose.foundation.layout.PaddingKt.m33261PaddingValues0680j_4(r5)
            goto L_0x0197
        L_0x0196:
            r5 = r6
        L_0x0197:
            if (r7 == 0) goto L_0x019a
            goto L_0x019b
        L_0x019a:
            r4 = r8
        L_0x019b:
            r6 = r11 & 16
            if (r6 == 0) goto L_0x01af
            androidx.compose.foundation.layout.Arrangement r6 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            if (r4 != 0) goto L_0x01a8
            androidx.compose.foundation.layout.Arrangement$Horizontal r6 = r6.getStart()
            goto L_0x01ac
        L_0x01a8:
            androidx.compose.foundation.layout.Arrangement$Horizontal r6 = r6.getEnd()
        L_0x01ac:
            r3 = r3 & r18
            goto L_0x01b0
        L_0x01af:
            r6 = r9
        L_0x01b0:
            if (r14 == 0) goto L_0x01b9
            androidx.compose.ui.Alignment$Companion r7 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment$Vertical r7 = r7.getTop()
            goto L_0x01ba
        L_0x01b9:
            r7 = r15
        L_0x01ba:
            r8 = r11 & 64
            if (r8 == 0) goto L_0x01ca
            androidx.compose.foundation.gestures.ScrollableDefaults r8 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE
            r9 = 6
            androidx.compose.foundation.gestures.FlingBehavior r8 = r8.flingBehavior(r10, r9)
            r9 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r9
            goto L_0x01cc
        L_0x01ca:
            r8 = r32
        L_0x01cc:
            if (r0 == 0) goto L_0x01d2
            r0 = 1
            r25 = r0
            goto L_0x01d4
        L_0x01d2:
            r25 = r33
        L_0x01d4:
            r18 = r1
            r19 = r2
            r21 = r4
            r20 = r5
            r22 = r6
            r23 = r7
            r24 = r8
        L_0x01e2:
            r10.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01f4
            r0 = -1
            java.lang.String r1 = "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)"
            r2 = -1724297413(0xffffffff99394f3b, float:-9.580276E-24)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r3, r0, r1)
        L_0x01f4:
            r4 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r0 = r3 & 14
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r1 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            r1 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            r1 = r3 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r1
            int r1 = r3 >> 3
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r1
            r0 = r0 | r2
            r1 = r1 & r16
            r14 = r0 | r1
            int r0 = r3 >> 15
            r0 = r0 & 14
            int r1 = r3 >> 9
            r1 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            int r1 = r3 >> 18
            r1 = r1 & 896(0x380, float:1.256E-42)
            r15 = r0 | r1
            r16 = 896(0x380, float:1.256E-42)
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r5 = r24
            r6 = r25
            r17 = r10
            r10 = r23
            r11 = r22
            r12 = r34
            r13 = r17
            androidx.compose.foundation.lazy.LazyListKt.LazyList(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0242
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0242:
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
        L_0x0252:
            androidx.compose.runtime.ScopeUpdateScope r12 = r17.endRestartGroup()
            if (r12 != 0) goto L_0x0259
            goto L_0x0268
        L_0x0259:
            androidx.compose.foundation.lazy.LazyDslKt$LazyRow$1 r13 = new androidx.compose.foundation.lazy.LazyDslKt$LazyRow$1
            r0 = r13
            r9 = r34
            r10 = r36
            r11 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.updateScope(r13)
        L_0x0268:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyRow(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.FlingBehavior, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(LazyListScope lazyListScope, List<? extends T> list, Function1<? super T, ? extends Object> function1, Function1<? super T, ? extends Object> function12, C13090q<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, C11921v> qVar) {
        C12775o.m28639i(lazyListScope, "<this>");
        C12775o.m28639i(list, "items");
        C12775o.m28639i(function12, "contentType");
        C12775o.m28639i(qVar, "itemContent");
        lazyListScope.items(list.size(), function1 != null ? new LazyDslKt$items$2(function1, list) : null, new LazyDslKt$items$3(function12, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new LazyDslKt$items$4(qVar, list)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, List list, Function1 function1, Function1 function12, C13090q qVar, int i, Object obj) {
        LazyDslKt$items$2 lazyDslKt$items$2 = null;
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function12 = LazyDslKt$items$1.INSTANCE;
        }
        C12775o.m28639i(lazyListScope, "<this>");
        C12775o.m28639i(list, "items");
        C12775o.m28639i(function12, "contentType");
        C12775o.m28639i(qVar, "itemContent");
        int size = list.size();
        if (function1 != null) {
            lazyDslKt$items$2 = new LazyDslKt$items$2(function1, list);
        }
        lazyListScope.items(size, lazyDslKt$items$2, new LazyDslKt$items$3(function12, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new LazyDslKt$items$4(qVar, list)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(LazyListScope lazyListScope, List<? extends T> list, C13088o<? super Integer, ? super T, ? extends Object> oVar, C13088o<? super Integer, ? super T, ? extends Object> oVar2, C13091r<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, C11921v> rVar) {
        C12775o.m28639i(lazyListScope, "<this>");
        C12775o.m28639i(list, "items");
        C12775o.m28639i(oVar2, "contentType");
        C12775o.m28639i(rVar, "itemContent");
        lazyListScope.items(list.size(), oVar != null ? new LazyDslKt$itemsIndexed$2(oVar, list) : null, new LazyDslKt$itemsIndexed$3(oVar2, list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new LazyDslKt$itemsIndexed$4(rVar, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, List list, C13088o oVar, C13088o oVar2, C13091r rVar, int i, Object obj) {
        LazyDslKt$itemsIndexed$2 lazyDslKt$itemsIndexed$2 = null;
        if ((i & 2) != 0) {
            oVar = null;
        }
        if ((i & 4) != 0) {
            oVar2 = LazyDslKt$itemsIndexed$1.INSTANCE;
        }
        C12775o.m28639i(lazyListScope, "<this>");
        C12775o.m28639i(list, "items");
        C12775o.m28639i(oVar2, "contentType");
        C12775o.m28639i(rVar, "itemContent");
        int size = list.size();
        if (oVar != null) {
            lazyDslKt$itemsIndexed$2 = new LazyDslKt$itemsIndexed$2(oVar, list);
        }
        lazyListScope.items(size, lazyDslKt$itemsIndexed$2, new LazyDslKt$itemsIndexed$3(oVar2, list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new LazyDslKt$itemsIndexed$4(rVar, list)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(LazyListScope lazyListScope, T[] tArr, Function1<? super T, ? extends Object> function1, Function1<? super T, ? extends Object> function12, C13090q<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, C11921v> qVar) {
        C12775o.m28639i(lazyListScope, "<this>");
        C12775o.m28639i(tArr, "items");
        C12775o.m28639i(function12, "contentType");
        C12775o.m28639i(qVar, "itemContent");
        lazyListScope.items(tArr.length, function1 != null ? new LazyDslKt$items$6(function1, tArr) : null, new LazyDslKt$items$7(function12, tArr), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new LazyDslKt$items$8(qVar, tArr)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(LazyListScope lazyListScope, T[] tArr, C13088o<? super Integer, ? super T, ? extends Object> oVar, C13088o<? super Integer, ? super T, ? extends Object> oVar2, C13091r<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, C11921v> rVar) {
        C12775o.m28639i(lazyListScope, "<this>");
        C12775o.m28639i(tArr, "items");
        C12775o.m28639i(oVar2, "contentType");
        C12775o.m28639i(rVar, "itemContent");
        lazyListScope.items(tArr.length, oVar != null ? new LazyDslKt$itemsIndexed$6(oVar, tArr) : null, new LazyDslKt$itemsIndexed$7(oVar2, tArr), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new LazyDslKt$itemsIndexed$8(rVar, tArr)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, List list, Function1 function1, C13090q qVar, int i, Object obj) {
        LazyDslKt$items$2 lazyDslKt$items$2 = null;
        if ((i & 2) != 0) {
            function1 = null;
        }
        C12775o.m28639i(lazyListScope, "<this>");
        C12775o.m28639i(list, "items");
        C12775o.m28639i(qVar, "itemContent");
        LazyDslKt$items$1 lazyDslKt$items$1 = LazyDslKt$items$1.INSTANCE;
        int size = list.size();
        if (function1 != null) {
            lazyDslKt$items$2 = new LazyDslKt$items$2(function1, list);
        }
        lazyListScope.items(size, lazyDslKt$items$2, new LazyDslKt$items$3(lazyDslKt$items$1, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new LazyDslKt$items$4(qVar, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, List list, C13088o oVar, C13091r rVar, int i, Object obj) {
        LazyDslKt$itemsIndexed$2 lazyDslKt$itemsIndexed$2 = null;
        if ((i & 2) != 0) {
            oVar = null;
        }
        C12775o.m28639i(lazyListScope, "<this>");
        C12775o.m28639i(list, "items");
        C12775o.m28639i(rVar, "itemContent");
        int size = list.size();
        if (oVar != null) {
            lazyDslKt$itemsIndexed$2 = new LazyDslKt$itemsIndexed$2(oVar, list);
        }
        lazyListScope.items(size, lazyDslKt$itemsIndexed$2, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$1(list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new LazyDslKt$itemsIndexed$4(rVar, list)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final /* synthetic */ <T> void items(LazyListScope lazyListScope, List<? extends T> list, Function1<? super T, ? extends Object> function1, C13090q<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, C11921v> qVar) {
        C12775o.m28639i(lazyListScope, "<this>");
        C12775o.m28639i(list, "items");
        C12775o.m28639i(qVar, "itemContent");
        lazyListScope.items(list.size(), function1 != null ? new LazyDslKt$items$2(function1, list) : null, new LazyDslKt$items$3(LazyDslKt$items$1.INSTANCE, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new LazyDslKt$items$4(qVar, list)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final /* synthetic */ <T> void itemsIndexed(LazyListScope lazyListScope, List<? extends T> list, C13088o<? super Integer, ? super T, ? extends Object> oVar, C13091r<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, C11921v> rVar) {
        C12775o.m28639i(lazyListScope, "<this>");
        C12775o.m28639i(list, "items");
        C12775o.m28639i(rVar, "itemContent");
        lazyListScope.items(list.size(), oVar != null ? new LazyDslKt$itemsIndexed$2(oVar, list) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$1(list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new LazyDslKt$itemsIndexed$4(rVar, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, Object[] objArr, C13088o oVar, C13088o oVar2, C13091r rVar, int i, Object obj) {
        LazyDslKt$itemsIndexed$6 lazyDslKt$itemsIndexed$6 = null;
        if ((i & 2) != 0) {
            oVar = null;
        }
        if ((i & 4) != 0) {
            oVar2 = LazyDslKt$itemsIndexed$5.INSTANCE;
        }
        C12775o.m28639i(lazyListScope, "<this>");
        C12775o.m28639i(objArr, "items");
        C12775o.m28639i(oVar2, "contentType");
        C12775o.m28639i(rVar, "itemContent");
        int length = objArr.length;
        if (oVar != null) {
            lazyDslKt$itemsIndexed$6 = new LazyDslKt$itemsIndexed$6(oVar, objArr);
        }
        lazyListScope.items(length, lazyDslKt$itemsIndexed$6, new LazyDslKt$itemsIndexed$7(oVar2, objArr), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new LazyDslKt$itemsIndexed$8(rVar, objArr)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, Object[] objArr, Function1 function1, Function1 function12, C13090q qVar, int i, Object obj) {
        LazyDslKt$items$6 lazyDslKt$items$6 = null;
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function12 = LazyDslKt$items$5.INSTANCE;
        }
        C12775o.m28639i(lazyListScope, "<this>");
        C12775o.m28639i(objArr, "items");
        C12775o.m28639i(function12, "contentType");
        C12775o.m28639i(qVar, "itemContent");
        int length = objArr.length;
        if (function1 != null) {
            lazyDslKt$items$6 = new LazyDslKt$items$6(function1, objArr);
        }
        lazyListScope.items(length, lazyDslKt$items$6, new LazyDslKt$items$7(function12, objArr), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new LazyDslKt$items$8(qVar, objArr)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final /* synthetic */ <T> void itemsIndexed(LazyListScope lazyListScope, T[] tArr, C13088o<? super Integer, ? super T, ? extends Object> oVar, C13091r<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, C11921v> rVar) {
        C12775o.m28639i(lazyListScope, "<this>");
        C12775o.m28639i(tArr, "items");
        C12775o.m28639i(rVar, "itemContent");
        lazyListScope.items(tArr.length, oVar != null ? new LazyDslKt$itemsIndexed$6(oVar, tArr) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$2(tArr), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new LazyDslKt$itemsIndexed$8(rVar, tArr)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final /* synthetic */ <T> void items(LazyListScope lazyListScope, T[] tArr, Function1<? super T, ? extends Object> function1, C13090q<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, C11921v> qVar) {
        C12775o.m28639i(lazyListScope, "<this>");
        C12775o.m28639i(tArr, "items");
        C12775o.m28639i(qVar, "itemContent");
        lazyListScope.items(tArr.length, function1 != null ? new LazyDslKt$items$6(function1, tArr) : null, new LazyDslKt$items$7(LazyDslKt$items$5.INSTANCE, tArr), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new LazyDslKt$items$8(qVar, tArr)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:139:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0117  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void LazyColumn(androidx.compose.p002ui.Modifier r27, androidx.compose.foundation.lazy.LazyListState r28, androidx.compose.foundation.layout.PaddingValues r29, boolean r30, androidx.compose.foundation.layout.Arrangement.Vertical r31, androidx.compose.p002ui.Alignment.Horizontal r32, androidx.compose.foundation.gestures.FlingBehavior r33, kotlin.jvm.functions.Function1 r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            r12 = r34
            r13 = r36
            r14 = r37
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r12, r0)
            r0 = -563353797(0xffffffffde6be73b, float:-4.24965505E18)
            r1 = r35
            androidx.compose.runtime.Composer r15 = r1.startRestartGroup(r0)
            r1 = r14 & 1
            if (r1 == 0) goto L_0x001e
            r2 = r13 | 6
            r3 = r2
            r2 = r27
            goto L_0x0032
        L_0x001e:
            r2 = r13 & 14
            if (r2 != 0) goto L_0x002f
            r2 = r27
            boolean r3 = r15.changed((java.lang.Object) r2)
            if (r3 == 0) goto L_0x002c
            r3 = 4
            goto L_0x002d
        L_0x002c:
            r3 = 2
        L_0x002d:
            r3 = r3 | r13
            goto L_0x0032
        L_0x002f:
            r2 = r27
            r3 = r13
        L_0x0032:
            r4 = r13 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004b
            r4 = r14 & 2
            if (r4 != 0) goto L_0x0045
            r4 = r28
            boolean r5 = r15.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x0047
            r5 = 32
            goto L_0x0049
        L_0x0045:
            r4 = r28
        L_0x0047:
            r5 = 16
        L_0x0049:
            r3 = r3 | r5
            goto L_0x004d
        L_0x004b:
            r4 = r28
        L_0x004d:
            r5 = r14 & 4
            if (r5 == 0) goto L_0x0054
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0054:
            r6 = r13 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0067
            r6 = r29
            boolean r7 = r15.changed((java.lang.Object) r6)
            if (r7 == 0) goto L_0x0063
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r3 = r3 | r7
            goto L_0x0069
        L_0x0067:
            r6 = r29
        L_0x0069:
            r7 = r14 & 8
            if (r7 == 0) goto L_0x0070
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x0070:
            r8 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0083
            r8 = r30
            boolean r9 = r15.changed((boolean) r8)
            if (r9 == 0) goto L_0x007f
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r3 = r3 | r9
            goto L_0x0085
        L_0x0083:
            r8 = r30
        L_0x0085:
            r9 = 57344(0xe000, float:8.0356E-41)
            r10 = r13 & r9
            if (r10 != 0) goto L_0x00a1
            r10 = r14 & 16
            if (r10 != 0) goto L_0x009b
            r10 = r31
            boolean r11 = r15.changed((java.lang.Object) r10)
            if (r11 == 0) goto L_0x009d
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009f
        L_0x009b:
            r10 = r31
        L_0x009d:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x009f:
            r3 = r3 | r11
            goto L_0x00a3
        L_0x00a1:
            r10 = r31
        L_0x00a3:
            r11 = r14 & 32
            r16 = 458752(0x70000, float:6.42848E-40)
            if (r11 == 0) goto L_0x00b0
            r17 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r17
            r9 = r32
            goto L_0x00c3
        L_0x00b0:
            r17 = r13 & r16
            r9 = r32
            if (r17 != 0) goto L_0x00c3
            boolean r17 = r15.changed((java.lang.Object) r9)
            if (r17 == 0) goto L_0x00bf
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c1
        L_0x00bf:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00c1:
            r3 = r3 | r17
        L_0x00c3:
            r17 = 3670016(0x380000, float:5.142788E-39)
            r18 = r13 & r17
            if (r18 != 0) goto L_0x00dd
            r18 = r14 & 64
            r0 = r33
            if (r18 != 0) goto L_0x00d8
            boolean r19 = r15.changed((java.lang.Object) r0)
            if (r19 == 0) goto L_0x00d8
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00da
        L_0x00d8:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00da:
            r3 = r3 | r19
            goto L_0x00df
        L_0x00dd:
            r0 = r33
        L_0x00df:
            r0 = r14 & 128(0x80, float:1.794E-43)
            r19 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00e8
            r3 = r3 | r19
            goto L_0x00f9
        L_0x00e8:
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r13
            if (r0 != 0) goto L_0x00f9
            boolean r0 = r15.changedInstance(r12)
            if (r0 == 0) goto L_0x00f6
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f8
        L_0x00f6:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f8:
            r3 = r3 | r0
        L_0x00f9:
            r0 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r0 & r3
            r2 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r2) goto L_0x0117
            boolean r0 = r15.getSkipping()
            if (r0 != 0) goto L_0x0109
            goto L_0x0117
        L_0x0109:
            r15.skipToGroupEnd()
            r1 = r27
            r7 = r33
            r2 = r4
            r3 = r6
            r4 = r8
            r6 = r9
            r5 = r10
            goto L_0x020b
        L_0x0117:
            r15.startDefaults()
            r0 = r13 & 1
            r20 = -57345(0xffffffffffff1fff, float:NaN)
            r2 = 3
            if (r0 == 0) goto L_0x0150
            boolean r0 = r15.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0129
            goto L_0x0150
        L_0x0129:
            r15.skipToGroupEnd()
            r0 = r14 & 2
            if (r0 == 0) goto L_0x0132
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0132:
            r0 = r14 & 16
            if (r0 == 0) goto L_0x0138
            r3 = r3 & r20
        L_0x0138:
            r0 = r14 & 64
            if (r0 == 0) goto L_0x0140
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r0
        L_0x0140:
            r20 = r27
            r26 = r33
            r21 = r4
        L_0x0146:
            r22 = r6
            r23 = r8
            r25 = r9
            r24 = r10
            goto L_0x01ad
        L_0x0150:
            if (r1 == 0) goto L_0x0155
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x0157
        L_0x0155:
            r0 = r27
        L_0x0157:
            r1 = r14 & 2
            r27 = r0
            r0 = 0
            if (r1 == 0) goto L_0x0165
            androidx.compose.foundation.lazy.LazyListState r1 = androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(r0, r0, r15, r0, r2)
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x0166
        L_0x0165:
            r1 = r4
        L_0x0166:
            if (r5 == 0) goto L_0x0172
            float r4 = (float) r0
            float r4 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r4)
            androidx.compose.foundation.layout.PaddingValues r4 = androidx.compose.foundation.layout.PaddingKt.m33261PaddingValues0680j_4(r4)
            r6 = r4
        L_0x0172:
            if (r7 == 0) goto L_0x0175
            r8 = r0
        L_0x0175:
            r0 = r14 & 16
            if (r0 == 0) goto L_0x0189
            androidx.compose.foundation.layout.Arrangement r0 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            if (r8 != 0) goto L_0x0182
            androidx.compose.foundation.layout.Arrangement$Vertical r0 = r0.getTop()
            goto L_0x0186
        L_0x0182:
            androidx.compose.foundation.layout.Arrangement$Vertical r0 = r0.getBottom()
        L_0x0186:
            r3 = r3 & r20
            r10 = r0
        L_0x0189:
            if (r11 == 0) goto L_0x0192
            androidx.compose.ui.Alignment$Companion r0 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment$Horizontal r0 = r0.getStart()
            r9 = r0
        L_0x0192:
            r0 = r14 & 64
            if (r0 == 0) goto L_0x01a6
            androidx.compose.foundation.gestures.ScrollableDefaults r0 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE
            r4 = 6
            androidx.compose.foundation.gestures.FlingBehavior r0 = r0.flingBehavior(r15, r4)
            r4 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r4
            r20 = r27
            r26 = r0
            goto L_0x01aa
        L_0x01a6:
            r20 = r27
            r26 = r33
        L_0x01aa:
            r21 = r1
            goto L_0x0146
        L_0x01ad:
            r15.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01bf
            r0 = -1
            java.lang.String r1 = "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:373)"
            r4 = -563353797(0xffffffffde6be73b, float:-4.24965505E18)
            androidx.compose.runtime.ComposerKt.traceEventStart(r4, r3, r0, r1)
        L_0x01bf:
            r7 = 1
            r0 = r3 & 14
            r0 = r0 | r19
            r1 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            r1 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            r1 = r3 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r1
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r3
            r0 = r0 | r1
            r1 = r3 & r16
            r0 = r0 | r1
            r1 = r3 & r17
            r0 = r0 | r1
            r1 = 234881024(0xe000000, float:1.5777218E-30)
            int r2 = r3 << 3
            r1 = r1 & r2
            r10 = r0 | r1
            r11 = 0
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r8 = r34
            r9 = r15
            LazyColumn(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01fd
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01fd:
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r26
        L_0x020b:
            androidx.compose.runtime.ScopeUpdateScope r11 = r15.endRestartGroup()
            if (r11 != 0) goto L_0x0212
            goto L_0x0221
        L_0x0212:
            androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$2 r15 = new androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$2
            r0 = r15
            r8 = r34
            r9 = r36
            r10 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.updateScope(r15)
        L_0x0221:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:139:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0117  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void LazyRow(androidx.compose.p002ui.Modifier r27, androidx.compose.foundation.lazy.LazyListState r28, androidx.compose.foundation.layout.PaddingValues r29, boolean r30, androidx.compose.foundation.layout.Arrangement.Horizontal r31, androidx.compose.p002ui.Alignment.Vertical r32, androidx.compose.foundation.gestures.FlingBehavior r33, kotlin.jvm.functions.Function1 r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            r12 = r34
            r13 = r36
            r14 = r37
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r12, r0)
            r0 = 407929823(0x185083df, float:2.6949948E-24)
            r1 = r35
            androidx.compose.runtime.Composer r15 = r1.startRestartGroup(r0)
            r1 = r14 & 1
            if (r1 == 0) goto L_0x001e
            r2 = r13 | 6
            r3 = r2
            r2 = r27
            goto L_0x0032
        L_0x001e:
            r2 = r13 & 14
            if (r2 != 0) goto L_0x002f
            r2 = r27
            boolean r3 = r15.changed((java.lang.Object) r2)
            if (r3 == 0) goto L_0x002c
            r3 = 4
            goto L_0x002d
        L_0x002c:
            r3 = 2
        L_0x002d:
            r3 = r3 | r13
            goto L_0x0032
        L_0x002f:
            r2 = r27
            r3 = r13
        L_0x0032:
            r4 = r13 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004b
            r4 = r14 & 2
            if (r4 != 0) goto L_0x0045
            r4 = r28
            boolean r5 = r15.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x0047
            r5 = 32
            goto L_0x0049
        L_0x0045:
            r4 = r28
        L_0x0047:
            r5 = 16
        L_0x0049:
            r3 = r3 | r5
            goto L_0x004d
        L_0x004b:
            r4 = r28
        L_0x004d:
            r5 = r14 & 4
            if (r5 == 0) goto L_0x0054
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0054:
            r6 = r13 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0067
            r6 = r29
            boolean r7 = r15.changed((java.lang.Object) r6)
            if (r7 == 0) goto L_0x0063
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r3 = r3 | r7
            goto L_0x0069
        L_0x0067:
            r6 = r29
        L_0x0069:
            r7 = r14 & 8
            if (r7 == 0) goto L_0x0070
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x0070:
            r8 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0083
            r8 = r30
            boolean r9 = r15.changed((boolean) r8)
            if (r9 == 0) goto L_0x007f
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r3 = r3 | r9
            goto L_0x0085
        L_0x0083:
            r8 = r30
        L_0x0085:
            r9 = 57344(0xe000, float:8.0356E-41)
            r10 = r13 & r9
            if (r10 != 0) goto L_0x00a1
            r10 = r14 & 16
            if (r10 != 0) goto L_0x009b
            r10 = r31
            boolean r11 = r15.changed((java.lang.Object) r10)
            if (r11 == 0) goto L_0x009d
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009f
        L_0x009b:
            r10 = r31
        L_0x009d:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x009f:
            r3 = r3 | r11
            goto L_0x00a3
        L_0x00a1:
            r10 = r31
        L_0x00a3:
            r11 = r14 & 32
            r16 = 458752(0x70000, float:6.42848E-40)
            if (r11 == 0) goto L_0x00b0
            r17 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r17
            r9 = r32
            goto L_0x00c3
        L_0x00b0:
            r17 = r13 & r16
            r9 = r32
            if (r17 != 0) goto L_0x00c3
            boolean r17 = r15.changed((java.lang.Object) r9)
            if (r17 == 0) goto L_0x00bf
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c1
        L_0x00bf:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00c1:
            r3 = r3 | r17
        L_0x00c3:
            r17 = 3670016(0x380000, float:5.142788E-39)
            r18 = r13 & r17
            if (r18 != 0) goto L_0x00dd
            r18 = r14 & 64
            r0 = r33
            if (r18 != 0) goto L_0x00d8
            boolean r19 = r15.changed((java.lang.Object) r0)
            if (r19 == 0) goto L_0x00d8
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00da
        L_0x00d8:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00da:
            r3 = r3 | r19
            goto L_0x00df
        L_0x00dd:
            r0 = r33
        L_0x00df:
            r0 = r14 & 128(0x80, float:1.794E-43)
            r19 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00e8
            r3 = r3 | r19
            goto L_0x00f9
        L_0x00e8:
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r13
            if (r0 != 0) goto L_0x00f9
            boolean r0 = r15.changedInstance(r12)
            if (r0 == 0) goto L_0x00f6
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f8
        L_0x00f6:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f8:
            r3 = r3 | r0
        L_0x00f9:
            r0 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r0 & r3
            r2 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r2) goto L_0x0117
            boolean r0 = r15.getSkipping()
            if (r0 != 0) goto L_0x0109
            goto L_0x0117
        L_0x0109:
            r15.skipToGroupEnd()
            r1 = r27
            r7 = r33
            r2 = r4
            r3 = r6
            r4 = r8
            r6 = r9
            r5 = r10
            goto L_0x020b
        L_0x0117:
            r15.startDefaults()
            r0 = r13 & 1
            r20 = -57345(0xffffffffffff1fff, float:NaN)
            r2 = 3
            if (r0 == 0) goto L_0x0150
            boolean r0 = r15.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0129
            goto L_0x0150
        L_0x0129:
            r15.skipToGroupEnd()
            r0 = r14 & 2
            if (r0 == 0) goto L_0x0132
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0132:
            r0 = r14 & 16
            if (r0 == 0) goto L_0x0138
            r3 = r3 & r20
        L_0x0138:
            r0 = r14 & 64
            if (r0 == 0) goto L_0x0140
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r0
        L_0x0140:
            r20 = r27
            r26 = r33
            r21 = r4
        L_0x0146:
            r22 = r6
            r23 = r8
            r25 = r9
            r24 = r10
            goto L_0x01ad
        L_0x0150:
            if (r1 == 0) goto L_0x0155
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x0157
        L_0x0155:
            r0 = r27
        L_0x0157:
            r1 = r14 & 2
            r27 = r0
            r0 = 0
            if (r1 == 0) goto L_0x0165
            androidx.compose.foundation.lazy.LazyListState r1 = androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(r0, r0, r15, r0, r2)
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x0166
        L_0x0165:
            r1 = r4
        L_0x0166:
            if (r5 == 0) goto L_0x0172
            float r4 = (float) r0
            float r4 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r4)
            androidx.compose.foundation.layout.PaddingValues r4 = androidx.compose.foundation.layout.PaddingKt.m33261PaddingValues0680j_4(r4)
            r6 = r4
        L_0x0172:
            if (r7 == 0) goto L_0x0175
            r8 = r0
        L_0x0175:
            r0 = r14 & 16
            if (r0 == 0) goto L_0x0189
            androidx.compose.foundation.layout.Arrangement r0 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            if (r8 != 0) goto L_0x0182
            androidx.compose.foundation.layout.Arrangement$Horizontal r0 = r0.getStart()
            goto L_0x0186
        L_0x0182:
            androidx.compose.foundation.layout.Arrangement$Horizontal r0 = r0.getEnd()
        L_0x0186:
            r3 = r3 & r20
            r10 = r0
        L_0x0189:
            if (r11 == 0) goto L_0x0192
            androidx.compose.ui.Alignment$Companion r0 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment$Vertical r0 = r0.getTop()
            r9 = r0
        L_0x0192:
            r0 = r14 & 64
            if (r0 == 0) goto L_0x01a6
            androidx.compose.foundation.gestures.ScrollableDefaults r0 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE
            r4 = 6
            androidx.compose.foundation.gestures.FlingBehavior r0 = r0.flingBehavior(r15, r4)
            r4 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r4
            r20 = r27
            r26 = r0
            goto L_0x01aa
        L_0x01a6:
            r20 = r27
            r26 = r33
        L_0x01aa:
            r21 = r1
            goto L_0x0146
        L_0x01ad:
            r15.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01bf
            r0 = -1
            java.lang.String r1 = "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:399)"
            r4 = 407929823(0x185083df, float:2.6949948E-24)
            androidx.compose.runtime.ComposerKt.traceEventStart(r4, r3, r0, r1)
        L_0x01bf:
            r7 = 1
            r0 = r3 & 14
            r0 = r0 | r19
            r1 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            r1 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            r1 = r3 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r1
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r3
            r0 = r0 | r1
            r1 = r3 & r16
            r0 = r0 | r1
            r1 = r3 & r17
            r0 = r0 | r1
            r1 = 234881024(0xe000000, float:1.5777218E-30)
            int r2 = r3 << 3
            r1 = r1 & r2
            r10 = r0 | r1
            r11 = 0
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r8 = r34
            r9 = r15
            LazyRow(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01fd
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01fd:
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r26
        L_0x020b:
            androidx.compose.runtime.ScopeUpdateScope r11 = r15.endRestartGroup()
            if (r11 != 0) goto L_0x0212
            goto L_0x0221
        L_0x0212:
            androidx.compose.foundation.lazy.LazyDslKt$LazyRow$2 r15 = new androidx.compose.foundation.lazy.LazyDslKt$LazyRow$2
            r0 = r15
            r8 = r34
            r9 = r36
            r10 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.updateScope(r15)
        L_0x0221:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyRow(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.FlingBehavior, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, Object[] objArr, C13088o oVar, C13091r rVar, int i, Object obj) {
        LazyDslKt$itemsIndexed$6 lazyDslKt$itemsIndexed$6 = null;
        if ((i & 2) != 0) {
            oVar = null;
        }
        C12775o.m28639i(lazyListScope, "<this>");
        C12775o.m28639i(objArr, "items");
        C12775o.m28639i(rVar, "itemContent");
        int length = objArr.length;
        if (oVar != null) {
            lazyDslKt$itemsIndexed$6 = new LazyDslKt$itemsIndexed$6(oVar, objArr);
        }
        lazyListScope.items(length, lazyDslKt$itemsIndexed$6, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$2(objArr), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new LazyDslKt$itemsIndexed$8(rVar, objArr)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, Object[] objArr, Function1 function1, C13090q qVar, int i, Object obj) {
        LazyDslKt$items$6 lazyDslKt$items$6 = null;
        if ((i & 2) != 0) {
            function1 = null;
        }
        C12775o.m28639i(lazyListScope, "<this>");
        C12775o.m28639i(objArr, "items");
        C12775o.m28639i(qVar, "itemContent");
        LazyDslKt$items$5 lazyDslKt$items$5 = LazyDslKt$items$5.INSTANCE;
        int length = objArr.length;
        if (function1 != null) {
            lazyDslKt$items$6 = new LazyDslKt$items$6(function1, objArr);
        }
        lazyListScope.items(length, lazyDslKt$items$6, new LazyDslKt$items$7(lazyDslKt$items$5, objArr), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new LazyDslKt$items$8(qVar, objArr)));
    }
}
