package androidx.compose.foundation.text;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.text.MultiParagraph;
import androidx.compose.p002ui.text.TextLayoutResult;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nClickableText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClickableText.kt\nandroidx/compose/foundation/text/ClickableTextKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,192:1\n25#2:193\n50#2:200\n49#2:201\n50#2:208\n49#2:209\n25#2:216\n25#2:227\n50#2:238\n49#2:239\n1114#3,6:194\n1114#3,6:202\n1114#3,6:210\n1114#3,6:217\n1114#3,3:228\n1117#3,3:234\n1114#3,6:240\n474#4,4:223\n478#4,2:231\n482#4:237\n474#5:233\n1#6:246\n*S KotlinDebug\n*F\n+ 1 ClickableText.kt\nandroidx/compose/foundation/text/ClickableTextKt\n*L\n80#1:193\n81#1:200\n81#1:201\n96#1:208\n96#1:209\n154#1:216\n155#1:227\n184#1:238\n184#1:239\n80#1:194,6\n81#1:202,6\n96#1:210,6\n154#1:217,6\n155#1:228,3\n155#1:234,3\n184#1:240,6\n155#1:223,4\n155#1:231,2\n155#1:237\n155#1:233\n*E\n"})
/* compiled from: ClickableText.kt */
public final class ClickableTextKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: androidx.compose.ui.Modifier$Companion} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0141  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.foundation.ExperimentalFoundationApi
    @androidx.compose.runtime.Composable
    /* renamed from: ClickableText-03UYbkw  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m33634ClickableText03UYbkw(androidx.compose.p002ui.text.AnnotatedString r25, kotlin.jvm.functions.Function1<? super java.lang.Integer, p336ef.C11921v> r26, androidx.compose.p002ui.Modifier r27, androidx.compose.p002ui.text.TextStyle r28, boolean r29, int r30, int r31, kotlin.jvm.functions.Function1<? super androidx.compose.p002ui.text.TextLayoutResult, p336ef.C11921v> r32, kotlin.jvm.functions.Function1<? super java.lang.Integer, p336ef.C11921v> r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            r12 = r25
            r13 = r26
            r14 = r33
            r15 = r35
            r11 = r36
            java.lang.String r0 = "text"
            kotlin.jvm.internal.C12775o.m28639i(r12, r0)
            java.lang.String r0 = "onHover"
            kotlin.jvm.internal.C12775o.m28639i(r13, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C12775o.m28639i(r14, r0)
            r0 = 1020774372(0x3cd7c7e4, float:0.026340432)
            r1 = r34
            androidx.compose.runtime.Composer r10 = r1.startRestartGroup(r0)
            r1 = r11 & 1
            if (r1 == 0) goto L_0x0029
            r1 = r15 | 6
            goto L_0x0039
        L_0x0029:
            r1 = r15 & 14
            if (r1 != 0) goto L_0x0038
            boolean r1 = r10.changed((java.lang.Object) r12)
            if (r1 == 0) goto L_0x0035
            r1 = 4
            goto L_0x0036
        L_0x0035:
            r1 = 2
        L_0x0036:
            r1 = r1 | r15
            goto L_0x0039
        L_0x0038:
            r1 = r15
        L_0x0039:
            r3 = r11 & 2
            if (r3 == 0) goto L_0x0040
            r1 = r1 | 48
            goto L_0x0050
        L_0x0040:
            r3 = r15 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0050
            boolean r3 = r10.changedInstance(r13)
            if (r3 == 0) goto L_0x004d
            r3 = 32
            goto L_0x004f
        L_0x004d:
            r3 = 16
        L_0x004f:
            r1 = r1 | r3
        L_0x0050:
            r3 = r11 & 4
            if (r3 == 0) goto L_0x0057
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x006a
        L_0x0057:
            r4 = r15 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x006a
            r4 = r27
            boolean r5 = r10.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x0066
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0068
        L_0x0066:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0068:
            r1 = r1 | r5
            goto L_0x006c
        L_0x006a:
            r4 = r27
        L_0x006c:
            r5 = r11 & 8
            if (r5 == 0) goto L_0x0073
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0086
        L_0x0073:
            r6 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x0086
            r6 = r28
            boolean r7 = r10.changed((java.lang.Object) r6)
            if (r7 == 0) goto L_0x0082
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0084
        L_0x0082:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0084:
            r1 = r1 | r7
            goto L_0x0088
        L_0x0086:
            r6 = r28
        L_0x0088:
            r7 = r11 & 16
            r8 = 57344(0xe000, float:8.0356E-41)
            if (r7 == 0) goto L_0x0092
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a6
        L_0x0092:
            r9 = r15 & r8
            if (r9 != 0) goto L_0x00a6
            r9 = r29
            boolean r16 = r10.changed((boolean) r9)
            if (r16 == 0) goto L_0x00a1
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a3
        L_0x00a1:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x00a3:
            r1 = r1 | r16
            goto L_0x00a8
        L_0x00a6:
            r9 = r29
        L_0x00a8:
            r16 = r11 & 32
            r17 = 458752(0x70000, float:6.42848E-40)
            if (r16 == 0) goto L_0x00b5
            r18 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r18
            r8 = r30
            goto L_0x00c8
        L_0x00b5:
            r18 = r15 & r17
            r8 = r30
            if (r18 != 0) goto L_0x00c8
            boolean r18 = r10.changed((int) r8)
            if (r18 == 0) goto L_0x00c4
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c6
        L_0x00c4:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00c6:
            r1 = r1 | r18
        L_0x00c8:
            r18 = r11 & 64
            r19 = 3670016(0x380000, float:5.142788E-39)
            if (r18 == 0) goto L_0x00d5
            r20 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r20
            r2 = r31
            goto L_0x00e8
        L_0x00d5:
            r20 = r15 & r19
            r2 = r31
            if (r20 != 0) goto L_0x00e8
            boolean r21 = r10.changed((int) r2)
            if (r21 == 0) goto L_0x00e4
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e6
        L_0x00e4:
            r21 = 524288(0x80000, float:7.34684E-40)
        L_0x00e6:
            r1 = r1 | r21
        L_0x00e8:
            r0 = r11 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00f3
            r22 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r22
            r2 = r32
            goto L_0x0108
        L_0x00f3:
            r22 = 29360128(0x1c00000, float:7.052966E-38)
            r22 = r15 & r22
            r2 = r32
            if (r22 != 0) goto L_0x0108
            boolean r22 = r10.changedInstance(r2)
            if (r22 == 0) goto L_0x0104
            r22 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0106
        L_0x0104:
            r22 = 4194304(0x400000, float:5.877472E-39)
        L_0x0106:
            r1 = r1 | r22
        L_0x0108:
            r2 = r11 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x0110
            r2 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x010e:
            r1 = r1 | r2
            goto L_0x0121
        L_0x0110:
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r15
            if (r2 != 0) goto L_0x0121
            boolean r2 = r10.changedInstance(r14)
            if (r2 == 0) goto L_0x011e
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010e
        L_0x011e:
            r2 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x010e
        L_0x0121:
            r2 = 191739611(0xb6db6db, float:4.5782105E-32)
            r2 = r2 & r1
            r4 = 38347922(0x2492492, float:1.4777643E-37)
            if (r2 != r4) goto L_0x0141
            boolean r2 = r10.getSkipping()
            if (r2 != 0) goto L_0x0131
            goto L_0x0141
        L_0x0131:
            r10.skipToGroupEnd()
            r3 = r27
            r7 = r31
            r4 = r6
            r6 = r8
            r5 = r9
            r24 = r10
            r8 = r32
            goto L_0x0266
        L_0x0141:
            if (r3 == 0) goto L_0x0147
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.p002ui.Modifier.Companion
            r4 = r2
            goto L_0x0149
        L_0x0147:
            r4 = r27
        L_0x0149:
            if (r5 == 0) goto L_0x0154
            androidx.compose.ui.text.TextStyle$Companion r2 = androidx.compose.p002ui.text.TextStyle.Companion
            androidx.compose.ui.text.TextStyle r2 = r2.getDefault()
            r22 = r2
            goto L_0x0156
        L_0x0154:
            r22 = r6
        L_0x0156:
            if (r7 == 0) goto L_0x015c
            r2 = 1
            r23 = r2
            goto L_0x015e
        L_0x015c:
            r23 = r9
        L_0x015e:
            if (r16 == 0) goto L_0x0169
            androidx.compose.ui.text.style.TextOverflow$Companion r2 = androidx.compose.p002ui.text.style.TextOverflow.Companion
            int r2 = r2.m38397getClipgIe3tQ8()
            r16 = r2
            goto L_0x016b
        L_0x0169:
            r16 = r8
        L_0x016b:
            if (r18 == 0) goto L_0x0173
            r2 = 2147483647(0x7fffffff, float:NaN)
            r18 = r2
            goto L_0x0175
        L_0x0173:
            r18 = r31
        L_0x0175:
            if (r0 == 0) goto L_0x017b
            androidx.compose.foundation.text.ClickableTextKt$ClickableText$4 r0 = androidx.compose.foundation.text.ClickableTextKt$ClickableText$4.INSTANCE
            r9 = r0
            goto L_0x017d
        L_0x017b:
            r9 = r32
        L_0x017d:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x018c
            r0 = -1
            java.lang.String r2 = "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)"
            r3 = 1020774372(0x3cd7c7e4, float:0.026340432)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r1, r0, r2)
        L_0x018c:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.startReplaceableGroup(r0)
            java.lang.Object r2 = r10.rememberedValue()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r5 = r3.getEmpty()
            if (r2 != r5) goto L_0x01a7
            r2 = 0
            r5 = 2
            androidx.compose.runtime.MutableState r2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r2, r2, r5, r2)
            r10.updateRememberedValue(r2)
        L_0x01a7:
            r10.endReplaceableGroup()
            androidx.compose.runtime.MutableState r2 = (androidx.compose.runtime.MutableState) r2
            r5 = 773894976(0x2e20b340, float:3.6538994E-11)
            r10.startReplaceableGroup(r5)
            r10.startReplaceableGroup(r0)
            java.lang.Object r0 = r10.rememberedValue()
            java.lang.Object r5 = r3.getEmpty()
            if (r0 != r5) goto L_0x01ce
            hf.h r0 = p355hf.C12085h.f18916b
            yf.l0 r0 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(r0, r10)
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r5 = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller
            r5.<init>(r0)
            r10.updateRememberedValue(r5)
            r0 = r5
        L_0x01ce:
            r10.endReplaceableGroup()
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r0 = (androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) r0
            yf.l0 r0 = r0.getCoroutineScope()
            r10.endReplaceableGroup()
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.p002ui.Modifier.Companion
            androidx.compose.foundation.text.ClickableTextKt$ClickableText$pointerInputModifier$1 r6 = new androidx.compose.foundation.text.ClickableTextKt$ClickableText$pointerInputModifier$1
            r7 = 0
            r27 = r6
            r28 = r0
            r29 = r26
            r30 = r2
            r31 = r33
            r32 = r7
            r27.<init>(r28, r29, r30, r31, r32)
            androidx.compose.ui.Modifier r0 = androidx.compose.p002ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(r5, r14, r13, r6)
            androidx.compose.ui.Modifier r5 = r4.then(r0)
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r10.startReplaceableGroup(r0)
            boolean r0 = r10.changed((java.lang.Object) r2)
            boolean r6 = r10.changed((java.lang.Object) r9)
            r0 = r0 | r6
            java.lang.Object r6 = r10.rememberedValue()
            if (r0 != 0) goto L_0x0211
            java.lang.Object r0 = r3.getEmpty()
            if (r6 != r0) goto L_0x0219
        L_0x0211:
            androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1 r6 = new androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
            r6.<init>(r2, r9)
            r10.updateRememberedValue(r6)
        L_0x0219:
            r10.endReplaceableGroup()
            r3 = r6
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r7 = 0
            r8 = 0
            r0 = r1 & 14
            int r2 = r1 >> 3
            r6 = r2 & 896(0x380, float:1.256E-42)
            r0 = r0 | r6
            r6 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r6
            r0 = r0 | r2
            int r2 = r1 << 3
            r2 = r2 & r17
            r0 = r0 | r2
            r1 = r1 & r19
            r17 = r0 | r1
            r19 = 384(0x180, float:5.38E-43)
            r0 = r25
            r1 = r5
            r2 = r22
            r20 = r4
            r4 = r16
            r5 = r23
            r6 = r18
            r21 = r9
            r9 = r10
            r24 = r10
            r10 = r17
            r11 = r19
            androidx.compose.foundation.text.BasicTextKt.m33633BasicTextVhcvRP8(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x025a
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x025a:
            r6 = r16
            r7 = r18
            r3 = r20
            r8 = r21
            r4 = r22
            r5 = r23
        L_0x0266:
            androidx.compose.runtime.ScopeUpdateScope r11 = r24.endRestartGroup()
            if (r11 != 0) goto L_0x026d
            goto L_0x0282
        L_0x026d:
            androidx.compose.foundation.text.ClickableTextKt$ClickableText$6 r10 = new androidx.compose.foundation.text.ClickableTextKt$ClickableText$6
            r0 = r10
            r1 = r25
            r2 = r26
            r9 = r33
            r12 = r10
            r10 = r35
            r13 = r11
            r11 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13.updateScope(r12)
        L_0x0282:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.ClickableTextKt.m33634ClickableText03UYbkw(androidx.compose.ui.text.AnnotatedString, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, boolean, int, int, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: androidx.compose.ui.Modifier$Companion} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x011d  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: ClickableText-4YKlhWE  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m33635ClickableText4YKlhWE(androidx.compose.p002ui.text.AnnotatedString r25, androidx.compose.p002ui.Modifier r26, androidx.compose.p002ui.text.TextStyle r27, boolean r28, int r29, int r30, kotlin.jvm.functions.Function1<? super androidx.compose.p002ui.text.TextLayoutResult, p336ef.C11921v> r31, kotlin.jvm.functions.Function1<? super java.lang.Integer, p336ef.C11921v> r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            r12 = r25
            r13 = r32
            r14 = r34
            r15 = r35
            java.lang.String r0 = "text"
            kotlin.jvm.internal.C12775o.m28639i(r12, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C12775o.m28639i(r13, r0)
            r0 = -246609449(0xfffffffff14d09d7, float:-1.0153012E30)
            r1 = r33
            androidx.compose.runtime.Composer r11 = r1.startRestartGroup(r0)
            r1 = r15 & 1
            if (r1 == 0) goto L_0x0022
            r1 = r14 | 6
            goto L_0x0032
        L_0x0022:
            r1 = r14 & 14
            if (r1 != 0) goto L_0x0031
            boolean r1 = r11.changed((java.lang.Object) r12)
            if (r1 == 0) goto L_0x002e
            r1 = 4
            goto L_0x002f
        L_0x002e:
            r1 = 2
        L_0x002f:
            r1 = r1 | r14
            goto L_0x0032
        L_0x0031:
            r1 = r14
        L_0x0032:
            r3 = r15 & 2
            if (r3 == 0) goto L_0x0039
            r1 = r1 | 48
            goto L_0x004c
        L_0x0039:
            r4 = r14 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004c
            r4 = r26
            boolean r5 = r11.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x0048
            r5 = 32
            goto L_0x004a
        L_0x0048:
            r5 = 16
        L_0x004a:
            r1 = r1 | r5
            goto L_0x004e
        L_0x004c:
            r4 = r26
        L_0x004e:
            r5 = r15 & 4
            if (r5 == 0) goto L_0x0055
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0055:
            r6 = r14 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0068
            r6 = r27
            boolean r7 = r11.changed((java.lang.Object) r6)
            if (r7 == 0) goto L_0x0064
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r1 = r1 | r7
            goto L_0x006a
        L_0x0068:
            r6 = r27
        L_0x006a:
            r7 = r15 & 8
            if (r7 == 0) goto L_0x0071
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0084
        L_0x0071:
            r8 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0084
            r8 = r28
            boolean r9 = r11.changed((boolean) r8)
            if (r9 == 0) goto L_0x0080
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0082
        L_0x0080:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0082:
            r1 = r1 | r9
            goto L_0x0086
        L_0x0084:
            r8 = r28
        L_0x0086:
            r9 = r15 & 16
            r10 = 57344(0xe000, float:8.0356E-41)
            if (r9 == 0) goto L_0x0092
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r10 = r29
            goto L_0x00a5
        L_0x0092:
            r16 = r14 & r10
            r10 = r29
            if (r16 != 0) goto L_0x00a5
            boolean r16 = r11.changed((int) r10)
            if (r16 == 0) goto L_0x00a1
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a3
        L_0x00a1:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x00a3:
            r1 = r1 | r16
        L_0x00a5:
            r16 = r15 & 32
            r17 = 458752(0x70000, float:6.42848E-40)
            if (r16 == 0) goto L_0x00b2
            r18 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r18
            r2 = r30
            goto L_0x00c5
        L_0x00b2:
            r18 = r14 & r17
            r2 = r30
            if (r18 != 0) goto L_0x00c5
            boolean r19 = r11.changed((int) r2)
            if (r19 == 0) goto L_0x00c1
            r19 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c3
        L_0x00c1:
            r19 = 65536(0x10000, float:9.18355E-41)
        L_0x00c3:
            r1 = r1 | r19
        L_0x00c5:
            r19 = r15 & 64
            r20 = 3670016(0x380000, float:5.142788E-39)
            if (r19 == 0) goto L_0x00d2
            r21 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r21
            r0 = r31
            goto L_0x00e5
        L_0x00d2:
            r21 = r14 & r20
            r0 = r31
            if (r21 != 0) goto L_0x00e5
            boolean r22 = r11.changedInstance(r0)
            if (r22 == 0) goto L_0x00e1
            r22 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e3
        L_0x00e1:
            r22 = 524288(0x80000, float:7.34684E-40)
        L_0x00e3:
            r1 = r1 | r22
        L_0x00e5:
            r0 = r15 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00ed
            r0 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00eb:
            r1 = r1 | r0
            goto L_0x00fe
        L_0x00ed:
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r14
            if (r0 != 0) goto L_0x00fe
            boolean r0 = r11.changedInstance(r13)
            if (r0 == 0) goto L_0x00fb
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00eb
        L_0x00fb:
            r0 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00eb
        L_0x00fe:
            r0 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r0 & r1
            r2 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r2) goto L_0x011d
            boolean r0 = r11.getSkipping()
            if (r0 != 0) goto L_0x010e
            goto L_0x011d
        L_0x010e:
            r11.skipToGroupEnd()
            r7 = r31
            r2 = r4
            r3 = r6
            r4 = r8
            r5 = r10
            r17 = r11
            r6 = r30
            goto L_0x0225
        L_0x011d:
            if (r3 == 0) goto L_0x0122
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            r4 = r0
        L_0x0122:
            if (r5 == 0) goto L_0x012d
            androidx.compose.ui.text.TextStyle$Companion r0 = androidx.compose.p002ui.text.TextStyle.Companion
            androidx.compose.ui.text.TextStyle r0 = r0.getDefault()
            r22 = r0
            goto L_0x012f
        L_0x012d:
            r22 = r6
        L_0x012f:
            if (r7 == 0) goto L_0x0135
            r0 = 1
            r23 = r0
            goto L_0x0137
        L_0x0135:
            r23 = r8
        L_0x0137:
            if (r9 == 0) goto L_0x0142
            androidx.compose.ui.text.style.TextOverflow$Companion r0 = androidx.compose.p002ui.text.style.TextOverflow.Companion
            int r0 = r0.m38397getClipgIe3tQ8()
            r24 = r0
            goto L_0x0144
        L_0x0142:
            r24 = r10
        L_0x0144:
            if (r16 == 0) goto L_0x014c
            r0 = 2147483647(0x7fffffff, float:NaN)
            r16 = r0
            goto L_0x014e
        L_0x014c:
            r16 = r30
        L_0x014e:
            if (r19 == 0) goto L_0x0154
            androidx.compose.foundation.text.ClickableTextKt$ClickableText$1 r0 = androidx.compose.foundation.text.ClickableTextKt$ClickableText$1.INSTANCE
            r10 = r0
            goto L_0x0156
        L_0x0154:
            r10 = r31
        L_0x0156:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0165
            r0 = -1
            java.lang.String r2 = "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)"
            r3 = -246609449(0xfffffffff14d09d7, float:-1.0153012E30)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r1, r0, r2)
        L_0x0165:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.startReplaceableGroup(r0)
            java.lang.Object r0 = r11.rememberedValue()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r2.getEmpty()
            r5 = 0
            if (r0 != r3) goto L_0x0180
            r3 = 2
            androidx.compose.runtime.MutableState r0 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r5, r5, r3, r5)
            r11.updateRememberedValue(r0)
        L_0x0180:
            r11.endReplaceableGroup()
            androidx.compose.runtime.MutableState r0 = (androidx.compose.runtime.MutableState) r0
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.p002ui.Modifier.Companion
            r6 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r11.startReplaceableGroup(r6)
            boolean r7 = r11.changed((java.lang.Object) r0)
            boolean r8 = r11.changed((java.lang.Object) r13)
            r7 = r7 | r8
            java.lang.Object r8 = r11.rememberedValue()
            if (r7 != 0) goto L_0x01a2
            java.lang.Object r7 = r2.getEmpty()
            if (r8 != r7) goto L_0x01aa
        L_0x01a2:
            androidx.compose.foundation.text.ClickableTextKt$ClickableText$pressIndicator$1$1 r8 = new androidx.compose.foundation.text.ClickableTextKt$ClickableText$pressIndicator$1$1
            r8.<init>(r0, r13, r5)
            r11.updateRememberedValue(r8)
        L_0x01aa:
            r11.endReplaceableGroup()
            of.o r8 = (p404of.C13088o) r8
            androidx.compose.ui.Modifier r3 = androidx.compose.p002ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput((androidx.compose.p002ui.Modifier) r3, (java.lang.Object) r13, (p404of.C13088o<? super androidx.compose.p002ui.input.pointer.PointerInputScope, ? super p355hf.C12074d<? super p336ef.C11921v>, ? extends java.lang.Object>) r8)
            androidx.compose.ui.Modifier r3 = r4.then(r3)
            r11.startReplaceableGroup(r6)
            boolean r5 = r11.changed((java.lang.Object) r0)
            boolean r6 = r11.changed((java.lang.Object) r10)
            r5 = r5 | r6
            java.lang.Object r6 = r11.rememberedValue()
            if (r5 != 0) goto L_0x01cf
            java.lang.Object r2 = r2.getEmpty()
            if (r6 != r2) goto L_0x01d7
        L_0x01cf:
            androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1 r6 = new androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
            r6.<init>(r0, r10)
            r11.updateRememberedValue(r6)
        L_0x01d7:
            r11.endReplaceableGroup()
            r5 = r6
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r7 = 0
            r8 = 0
            r0 = r1 & 14
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r1
            r0 = r0 | r2
            int r2 = r1 << 6
            r2 = r2 & r17
            r0 = r0 | r2
            int r1 = r1 << 3
            r1 = r1 & r20
            r17 = r0 | r1
            r18 = 384(0x180, float:5.38E-43)
            r0 = r25
            r1 = r3
            r2 = r22
            r3 = r5
            r19 = r4
            r4 = r24
            r5 = r23
            r6 = r16
            r9 = r11
            r20 = r10
            r10 = r17
            r17 = r11
            r11 = r18
            androidx.compose.foundation.text.BasicTextKt.m33633BasicTextVhcvRP8(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0219
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0219:
            r6 = r16
            r2 = r19
            r7 = r20
            r3 = r22
            r4 = r23
            r5 = r24
        L_0x0225:
            androidx.compose.runtime.ScopeUpdateScope r11 = r17.endRestartGroup()
            if (r11 != 0) goto L_0x022c
            goto L_0x023e
        L_0x022c:
            androidx.compose.foundation.text.ClickableTextKt$ClickableText$3 r10 = new androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
            r0 = r10
            r1 = r25
            r8 = r32
            r9 = r34
            r12 = r10
            r10 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.updateScope(r12)
        L_0x023e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.ClickableTextKt.m33635ClickableText4YKlhWE(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, boolean, int, int, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final Integer ClickableText_03UYbkw$getOffset(MutableState<TextLayoutResult> mutableState, long j) {
        MultiParagraph multiParagraph;
        TextLayoutResult value = mutableState.getValue();
        if (value == null || (multiParagraph = value.getMultiParagraph()) == null) {
            return null;
        }
        if (!m33636containsWithinBoundsUv8p0NA(multiParagraph, j)) {
            multiParagraph = null;
        }
        if (multiParagraph != null) {
            return Integer.valueOf(multiParagraph.m37860getOffsetForPositionk4lQ0M(j));
        }
        return null;
    }

    /* renamed from: containsWithinBounds-Uv8p0NA  reason: not valid java name */
    private static final boolean m33636containsWithinBoundsUv8p0NA(MultiParagraph multiParagraph, long j) {
        float r0 = Offset.m35412component1impl(j);
        float r3 = Offset.m35413component2impl(j);
        if (r0 <= 0.0f || r3 < 0.0f || r0 > multiParagraph.getWidth() || r3 > multiParagraph.getHeight()) {
            return false;
        }
        return true;
    }
}
