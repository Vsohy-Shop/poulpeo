package androidx.compose.material;

import androidx.compose.p002ui.unit.C1232Dp;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/FloatingActionButtonKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,336:1\n25#2:337\n25#2:344\n1114#3,6:338\n1114#3,6:345\n154#4:351\n154#4:352\n154#4:353\n154#4:354\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/FloatingActionButtonKt\n*L\n85#1:337\n152#1:344\n85#1:338,6\n152#1:345,6\n332#1:351\n333#1:352\n334#1:353\n335#1:354\n*E\n"})
/* compiled from: FloatingActionButton.kt */
public final class FloatingActionButtonKt {
    /* access modifiers changed from: private */
    public static final float ExtendedFabIconPadding = C1232Dp.m38468constructorimpl((float) 12);
    private static final float ExtendedFabSize = C1232Dp.m38468constructorimpl((float) 48);
    /* access modifiers changed from: private */
    public static final float ExtendedFabTextPadding = C1232Dp.m38468constructorimpl((float) 20);
    /* access modifiers changed from: private */
    public static final float FabSize = C1232Dp.m38468constructorimpl((float) 56);

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0116  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* renamed from: ExtendedFloatingActionButton-wqdebIU  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m34031ExtendedFloatingActionButtonwqdebIU(p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r29, p404of.C13074a<p336ef.C11921v> r30, androidx.compose.p002ui.Modifier r31, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r32, androidx.compose.foundation.interaction.MutableInteractionSource r33, androidx.compose.p002ui.graphics.Shape r34, long r35, long r37, androidx.compose.material.FloatingActionButtonElevation r39, androidx.compose.runtime.Composer r40, int r41, int r42) {
        /*
            r1 = r29
            r15 = r30
            r0 = r41
            r14 = r42
            java.lang.String r2 = "text"
            kotlin.jvm.internal.C12775o.m28639i(r1, r2)
            java.lang.String r2 = "onClick"
            kotlin.jvm.internal.C12775o.m28639i(r15, r2)
            r2 = -1555720195(0xffffffffa34597fd, float:-1.0711576E-17)
            r3 = r40
            androidx.compose.runtime.Composer r13 = r3.startRestartGroup(r2)
            r3 = r14 & 1
            if (r3 == 0) goto L_0x0022
            r3 = r0 | 6
            goto L_0x0032
        L_0x0022:
            r3 = r0 & 14
            if (r3 != 0) goto L_0x0031
            boolean r3 = r13.changedInstance(r1)
            if (r3 == 0) goto L_0x002e
            r3 = 4
            goto L_0x002f
        L_0x002e:
            r3 = 2
        L_0x002f:
            r3 = r3 | r0
            goto L_0x0032
        L_0x0031:
            r3 = r0
        L_0x0032:
            r4 = r14 & 2
            if (r4 == 0) goto L_0x0039
            r3 = r3 | 48
            goto L_0x0049
        L_0x0039:
            r4 = r0 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0049
            boolean r4 = r13.changedInstance(r15)
            if (r4 == 0) goto L_0x0046
            r4 = 32
            goto L_0x0048
        L_0x0046:
            r4 = 16
        L_0x0048:
            r3 = r3 | r4
        L_0x0049:
            r4 = r14 & 4
            if (r4 == 0) goto L_0x0050
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x0050:
            r5 = r0 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0063
            r5 = r31
            boolean r6 = r13.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x005f
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r3 = r3 | r6
            goto L_0x0065
        L_0x0063:
            r5 = r31
        L_0x0065:
            r6 = r14 & 8
            if (r6 == 0) goto L_0x006c
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x007f
        L_0x006c:
            r7 = r0 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x007f
            r7 = r32
            boolean r8 = r13.changedInstance(r7)
            if (r8 == 0) goto L_0x007b
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r3 = r3 | r8
            goto L_0x0081
        L_0x007f:
            r7 = r32
        L_0x0081:
            r8 = r14 & 16
            r9 = 57344(0xe000, float:8.0356E-41)
            if (r8 == 0) goto L_0x008b
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009e
        L_0x008b:
            r10 = r0 & r9
            if (r10 != 0) goto L_0x009e
            r10 = r33
            boolean r11 = r13.changed((java.lang.Object) r10)
            if (r11 == 0) goto L_0x009a
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r3 = r3 | r11
            goto L_0x00a0
        L_0x009e:
            r10 = r33
        L_0x00a0:
            r11 = 458752(0x70000, float:6.42848E-40)
            r12 = r0 & r11
            if (r12 != 0) goto L_0x00bc
            r12 = r14 & 32
            if (r12 != 0) goto L_0x00b5
            r12 = r34
            boolean r16 = r13.changed((java.lang.Object) r12)
            if (r16 == 0) goto L_0x00b7
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b9
        L_0x00b5:
            r12 = r34
        L_0x00b7:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b9:
            r3 = r3 | r16
            goto L_0x00be
        L_0x00bc:
            r12 = r34
        L_0x00be:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r17 = r0 & r16
            if (r17 != 0) goto L_0x00d8
            r17 = r14 & 64
            r11 = r35
            if (r17 != 0) goto L_0x00d3
            boolean r17 = r13.changed((long) r11)
            if (r17 == 0) goto L_0x00d3
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d5
        L_0x00d3:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00d5:
            r3 = r3 | r17
            goto L_0x00da
        L_0x00d8:
            r11 = r35
        L_0x00da:
            r17 = 29360128(0x1c00000, float:7.052966E-38)
            r17 = r0 & r17
            if (r17 != 0) goto L_0x00f6
            r9 = r14 & 128(0x80, float:1.794E-43)
            r18 = r3
            r2 = r37
            if (r9 != 0) goto L_0x00f1
            boolean r19 = r13.changed((long) r2)
            if (r19 == 0) goto L_0x00f1
            r19 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f3
        L_0x00f1:
            r19 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f3:
            r18 = r18 | r19
            goto L_0x00fa
        L_0x00f6:
            r18 = r3
            r2 = r37
        L_0x00fa:
            r19 = 234881024(0xe000000, float:1.5777218E-30)
            r19 = r0 & r19
            if (r19 != 0) goto L_0x0116
            r9 = r14 & 256(0x100, float:3.59E-43)
            if (r9 != 0) goto L_0x010f
            r9 = r39
            boolean r20 = r13.changed((java.lang.Object) r9)
            if (r20 == 0) goto L_0x0111
            r20 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0113
        L_0x010f:
            r9 = r39
        L_0x0111:
            r20 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0113:
            r18 = r18 | r20
            goto L_0x0118
        L_0x0116:
            r9 = r39
        L_0x0118:
            r20 = 191739611(0xb6db6db, float:4.5782105E-32)
            r2 = r18 & r20
            r3 = 38347922(0x2492492, float:1.4777643E-37)
            if (r2 != r3) goto L_0x0139
            boolean r2 = r13.getSkipping()
            if (r2 != 0) goto L_0x0129
            goto L_0x0139
        L_0x0129:
            r13.skipToGroupEnd()
            r6 = r34
            r3 = r5
            r4 = r7
            r5 = r10
            r7 = r11
            r27 = r13
            r11 = r9
            r9 = r37
            goto L_0x02af
        L_0x0139:
            r13.startDefaults()
            r2 = r0 & 1
            r20 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r21 = -3670017(0xffffffffffc7ffff, float:NaN)
            r22 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = 6
            if (r2 == 0) goto L_0x0180
            boolean r2 = r13.getDefaultsInvalid()
            if (r2 == 0) goto L_0x0151
            goto L_0x0180
        L_0x0151:
            r13.skipToGroupEnd()
            r2 = r14 & 32
            if (r2 == 0) goto L_0x015a
            r18 = r18 & r22
        L_0x015a:
            r2 = r14 & 64
            if (r2 == 0) goto L_0x0160
            r18 = r18 & r21
        L_0x0160:
            r2 = r14 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x0166
            r18 = r18 & r20
        L_0x0166:
            r2 = r14 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x016f
            r2 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r18 = r18 & r2
        L_0x016f:
            r21 = r34
            r24 = r37
            r26 = r9
            r20 = r10
            r22 = r11
            r2 = r18
            r18 = r5
            r12 = r7
            goto L_0x022a
        L_0x0180:
            if (r4 == 0) goto L_0x0185
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x0186
        L_0x0185:
            r2 = r5
        L_0x0186:
            if (r6 == 0) goto L_0x018a
            r4 = 0
            goto L_0x018b
        L_0x018a:
            r4 = r7
        L_0x018b:
            if (r8 == 0) goto L_0x01ac
            r5 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r13.startReplaceableGroup(r5)
            java.lang.Object r5 = r13.rememberedValue()
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r6 = r6.getEmpty()
            if (r5 != r6) goto L_0x01a6
            androidx.compose.foundation.interaction.MutableInteractionSource r5 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r13.updateRememberedValue(r5)
        L_0x01a6:
            r13.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r5 = (androidx.compose.foundation.interaction.MutableInteractionSource) r5
            goto L_0x01ad
        L_0x01ac:
            r5 = r10
        L_0x01ad:
            r6 = r14 & 32
            if (r6 == 0) goto L_0x01c8
            androidx.compose.material.MaterialTheme r6 = androidx.compose.material.MaterialTheme.INSTANCE
            androidx.compose.material.Shapes r6 = r6.getShapes(r13, r3)
            androidx.compose.foundation.shape.CornerBasedShape r6 = r6.getSmall()
            r7 = 50
            androidx.compose.foundation.shape.CornerSize r7 = androidx.compose.foundation.shape.CornerSizeKt.CornerSize((int) r7)
            androidx.compose.foundation.shape.CornerBasedShape r6 = r6.copy(r7)
            r18 = r18 & r22
            goto L_0x01ca
        L_0x01c8:
            r6 = r34
        L_0x01ca:
            r7 = r14 & 64
            if (r7 == 0) goto L_0x01db
            androidx.compose.material.MaterialTheme r7 = androidx.compose.material.MaterialTheme.INSTANCE
            androidx.compose.material.Colors r7 = r7.getColors(r13, r3)
            long r7 = r7.m33954getSecondary0d7_KjU()
            r18 = r18 & r21
            goto L_0x01dc
        L_0x01db:
            r7 = r11
        L_0x01dc:
            r10 = r14 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x01ed
            int r10 = r18 >> 18
            r10 = r10 & 14
            long r10 = androidx.compose.material.ColorsKt.m33970contentColorForek8zF_U(r7, r13, r10)
            r12 = r18 & r20
            r18 = r12
            goto L_0x01ef
        L_0x01ed:
            r10 = r37
        L_0x01ef:
            r12 = r14 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L_0x0219
            androidx.compose.material.FloatingActionButtonDefaults r9 = androidx.compose.material.FloatingActionButtonDefaults.INSTANCE
            r12 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 24576(0x6000, float:3.4438E-41)
            r25 = 15
            r31 = r9
            r32 = r12
            r33 = r20
            r34 = r21
            r35 = r22
            r36 = r13
            r37 = r24
            r38 = r25
            androidx.compose.material.FloatingActionButtonElevation r9 = r31.m34030elevationxZ9QkE(r32, r33, r34, r35, r36, r37, r38)
            r12 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r18 = r18 & r12
        L_0x0219:
            r12 = r4
            r20 = r5
            r21 = r6
            r22 = r7
            r26 = r9
            r24 = r10
            r28 = r18
            r18 = r2
            r2 = r28
        L_0x022a:
            r13.endDefaults()
            boolean r4 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r4 == 0) goto L_0x023c
            r4 = -1
            java.lang.String r5 = "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:146)"
            r6 = -1555720195(0xffffffffa34597fd, float:-1.0711576E-17)
            androidx.compose.runtime.ComposerKt.traceEventStart(r6, r2, r4, r5)
        L_0x023c:
            float r4 = ExtendedFabSize
            r5 = 0
            r6 = 0
            r7 = 12
            r8 = 0
            r31 = r18
            r32 = r4
            r33 = r4
            r34 = r5
            r35 = r6
            r36 = r7
            r37 = r8
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.m33342sizeInqDBjuR0$default(r31, r32, r33, r34, r35, r36, r37)
            androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2 r5 = new androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
            r5.<init>(r12, r2, r1)
            r6 = 1418981691(0x5493f13b, float:5.0832589E12)
            r7 = 1
            androidx.compose.runtime.internal.ComposableLambda r11 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r13, r6, r7, r5)
            int r5 = r2 >> 3
            r5 = r5 & 14
            r6 = 12582912(0xc00000, float:1.7632415E-38)
            r5 = r5 | r6
            int r2 = r2 >> r3
            r3 = r2 & 896(0x380, float:1.256E-42)
            r3 = r3 | r5
            r5 = r2 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r5
            r5 = 57344(0xe000, float:8.0356E-41)
            r5 = r5 & r2
            r3 = r3 | r5
            r5 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r2
            r3 = r3 | r5
            r2 = r2 & r16
            r16 = r3 | r2
            r17 = 0
            r2 = r30
            r3 = r4
            r4 = r20
            r5 = r21
            r6 = r22
            r8 = r24
            r10 = r26
            r19 = r12
            r12 = r13
            r27 = r13
            r13 = r16
            r14 = r17
            m34032FloatingActionButtonbogVsAg(r2, r3, r4, r5, r6, r8, r10, r11, r12, r13, r14)
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x02a1
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x02a1:
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r9 = r24
            r11 = r26
        L_0x02af:
            androidx.compose.runtime.ScopeUpdateScope r14 = r27.endRestartGroup()
            if (r14 != 0) goto L_0x02b6
            goto L_0x02c8
        L_0x02b6:
            androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$3 r13 = new androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$3
            r0 = r13
            r1 = r29
            r2 = r30
            r12 = r41
            r15 = r13
            r13 = r42
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r11, r12, r13)
            r14.updateScope(r15)
        L_0x02c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.FloatingActionButtonKt.m34031ExtendedFloatingActionButtonwqdebIU(of.o, of.a, androidx.compose.ui.Modifier, of.o, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.material.FloatingActionButtonElevation, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:132:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0110  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* renamed from: FloatingActionButton-bogVsAg  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m34032FloatingActionButtonbogVsAg(p404of.C13074a<p336ef.C11921v> r28, androidx.compose.p002ui.Modifier r29, androidx.compose.foundation.interaction.MutableInteractionSource r30, androidx.compose.p002ui.graphics.Shape r31, long r32, long r34, androidx.compose.material.FloatingActionButtonElevation r36, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r37, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            r15 = r28
            r14 = r37
            r13 = r39
            r12 = r40
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C12775o.m28639i(r15, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r14, r0)
            r0 = 1028985328(0x3d5511f0, float:0.05201906)
            r1 = r38
            androidx.compose.runtime.Composer r11 = r1.startRestartGroup(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0022
            r1 = r13 | 6
            goto L_0x0032
        L_0x0022:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x0031
            boolean r1 = r11.changedInstance(r15)
            if (r1 == 0) goto L_0x002e
            r1 = 4
            goto L_0x002f
        L_0x002e:
            r1 = 2
        L_0x002f:
            r1 = r1 | r13
            goto L_0x0032
        L_0x0031:
            r1 = r13
        L_0x0032:
            r2 = r12 & 2
            if (r2 == 0) goto L_0x0039
            r1 = r1 | 48
            goto L_0x004c
        L_0x0039:
            r3 = r13 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004c
            r3 = r29
            boolean r4 = r11.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0048
            r4 = 32
            goto L_0x004a
        L_0x0048:
            r4 = 16
        L_0x004a:
            r1 = r1 | r4
            goto L_0x004e
        L_0x004c:
            r3 = r29
        L_0x004e:
            r4 = r12 & 4
            if (r4 == 0) goto L_0x0055
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0055:
            r5 = r13 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0068
            r5 = r30
            boolean r6 = r11.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x0064
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r1 = r1 | r6
            goto L_0x006a
        L_0x0068:
            r5 = r30
        L_0x006a:
            r6 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x0083
            r6 = r12 & 8
            if (r6 != 0) goto L_0x007d
            r6 = r31
            boolean r7 = r11.changed((java.lang.Object) r6)
            if (r7 == 0) goto L_0x007f
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007d:
            r6 = r31
        L_0x007f:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r1 = r1 | r7
            goto L_0x0085
        L_0x0083:
            r6 = r31
        L_0x0085:
            r7 = 57344(0xe000, float:8.0356E-41)
            r8 = r13 & r7
            if (r8 != 0) goto L_0x00a1
            r8 = r12 & 16
            if (r8 != 0) goto L_0x009b
            r8 = r32
            boolean r10 = r11.changed((long) r8)
            if (r10 == 0) goto L_0x009d
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009f
        L_0x009b:
            r8 = r32
        L_0x009d:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x009f:
            r1 = r1 | r10
            goto L_0x00a3
        L_0x00a1:
            r8 = r32
        L_0x00a3:
            r10 = 458752(0x70000, float:6.42848E-40)
            r16 = r13 & r10
            if (r16 != 0) goto L_0x00bc
            r16 = r12 & 32
            r7 = r34
            if (r16 != 0) goto L_0x00b8
            boolean r9 = r11.changed((long) r7)
            if (r9 == 0) goto L_0x00b8
            r9 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ba
        L_0x00b8:
            r9 = 65536(0x10000, float:9.18355E-41)
        L_0x00ba:
            r1 = r1 | r9
            goto L_0x00be
        L_0x00bc:
            r7 = r34
        L_0x00be:
            r9 = 3670016(0x380000, float:5.142788E-39)
            r9 = r9 & r13
            if (r9 != 0) goto L_0x00d9
            r9 = r12 & 64
            if (r9 != 0) goto L_0x00d2
            r9 = r36
            boolean r16 = r11.changed((java.lang.Object) r9)
            if (r16 == 0) goto L_0x00d4
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d6
        L_0x00d2:
            r9 = r36
        L_0x00d4:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d6:
            r1 = r1 | r16
            goto L_0x00db
        L_0x00d9:
            r9 = r36
        L_0x00db:
            r10 = r12 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x00e3
            r10 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00e1:
            r1 = r1 | r10
            goto L_0x00f4
        L_0x00e3:
            r10 = 29360128(0x1c00000, float:7.052966E-38)
            r10 = r10 & r13
            if (r10 != 0) goto L_0x00f4
            boolean r10 = r11.changedInstance(r14)
            if (r10 == 0) goto L_0x00f1
            r10 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e1
        L_0x00f1:
            r10 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00e1
        L_0x00f4:
            r10 = 23967451(0x16db6db, float:4.3661218E-38)
            r10 = r10 & r1
            r0 = 4793490(0x492492, float:6.71711E-39)
            if (r10 != r0) goto L_0x0110
            boolean r0 = r11.getSkipping()
            if (r0 != 0) goto L_0x0104
            goto L_0x0110
        L_0x0104:
            r11.skipToGroupEnd()
            r2 = r3
            r3 = r5
            r4 = r6
            r27 = r11
            r5 = r32
            goto L_0x0279
        L_0x0110:
            r11.startDefaults()
            r0 = r13 & 1
            r10 = -3670017(0xffffffffffc7ffff, float:NaN)
            r18 = -458753(0xfffffffffff8ffff, float:NaN)
            r19 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x014b
            boolean r0 = r11.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0127
            goto L_0x014b
        L_0x0127:
            r11.skipToGroupEnd()
            r0 = r12 & 8
            if (r0 == 0) goto L_0x0130
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0130:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x0136
            r1 = r1 & r19
        L_0x0136:
            r0 = r12 & 32
            if (r0 == 0) goto L_0x013c
            r1 = r1 & r18
        L_0x013c:
            r0 = r12 & 64
            if (r0 == 0) goto L_0x0141
            r1 = r1 & r10
        L_0x0141:
            r19 = r32
        L_0x0143:
            r10 = r3
            r18 = r6
            r6 = r7
            r8 = r9
            r9 = r5
            goto L_0x01e7
        L_0x014b:
            if (r2 == 0) goto L_0x0150
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            r3 = r0
        L_0x0150:
            if (r4 == 0) goto L_0x0171
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.startReplaceableGroup(r0)
            java.lang.Object r0 = r11.rememberedValue()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r0 != r2) goto L_0x016b
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r11.updateRememberedValue(r0)
        L_0x016b:
            r11.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = (androidx.compose.foundation.interaction.MutableInteractionSource) r0
            r5 = r0
        L_0x0171:
            r0 = r12 & 8
            r2 = 6
            if (r0 == 0) goto L_0x018d
            androidx.compose.material.MaterialTheme r0 = androidx.compose.material.MaterialTheme.INSTANCE
            androidx.compose.material.Shapes r0 = r0.getShapes(r11, r2)
            androidx.compose.foundation.shape.CornerBasedShape r0 = r0.getSmall()
            r4 = 50
            androidx.compose.foundation.shape.CornerSize r4 = androidx.compose.foundation.shape.CornerSizeKt.CornerSize((int) r4)
            androidx.compose.foundation.shape.CornerBasedShape r0 = r0.copy(r4)
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
            r6 = r0
        L_0x018d:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x01a1
            androidx.compose.material.MaterialTheme r0 = androidx.compose.material.MaterialTheme.INSTANCE
            androidx.compose.material.Colors r0 = r0.getColors(r11, r2)
            long r20 = r0.m33954getSecondary0d7_KjU()
            r1 = r1 & r19
            r2 = r1
            r0 = r20
            goto L_0x01a4
        L_0x01a1:
            r2 = r1
            r0 = r32
        L_0x01a4:
            r4 = r12 & 32
            if (r4 == 0) goto L_0x01b2
            int r4 = r2 >> 12
            r4 = r4 & 14
            long r7 = androidx.compose.material.ColorsKt.m33970contentColorForek8zF_U(r0, r11, r4)
            r2 = r2 & r18
        L_0x01b2:
            r4 = r12 & 64
            if (r4 == 0) goto L_0x01e2
            androidx.compose.material.FloatingActionButtonDefaults r4 = androidx.compose.material.FloatingActionButtonDefaults.INSTANCE
            r9 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 24576(0x6000, float:3.4438E-41)
            r22 = 15
            r29 = r4
            r30 = r9
            r31 = r18
            r32 = r19
            r33 = r20
            r34 = r11
            r35 = r21
            r36 = r22
            androidx.compose.material.FloatingActionButtonElevation r4 = r29.m34030elevationxZ9QkE(r30, r31, r32, r33, r34, r35, r36)
            r2 = r2 & r10
            r19 = r0
            r1 = r2
            r10 = r3
            r9 = r5
            r18 = r6
            r6 = r7
            r8 = r4
            goto L_0x01e7
        L_0x01e2:
            r19 = r0
            r1 = r2
            goto L_0x0143
        L_0x01e7:
            r11.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01f9
            r0 = -1
            java.lang.String r2 = "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:81)"
            r3 = 1028985328(0x3d5511f0, float:0.05201906)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r1, r0, r2)
        L_0x01f9:
            androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2 r0 = androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2.INSTANCE
            r2 = 0
            r3 = 0
            r4 = 1
            androidx.compose.ui.Modifier r2 = androidx.compose.p002ui.semantics.SemanticsModifierKt.semantics$default(r10, r3, r0, r4, r2)
            r17 = 0
            int r0 = r1 >> 6
            r0 = r0 & 14
            int r5 = r1 >> 15
            r5 = r5 & 112(0x70, float:1.57E-43)
            r0 = r0 | r5
            androidx.compose.runtime.State r0 = r8.elevation(r9, r11, r0)
            java.lang.Object r0 = r0.getValue()
            androidx.compose.ui.unit.Dp r0 = (androidx.compose.p002ui.unit.C1232Dp) r0
            float r21 = r0.m38482unboximpl()
            androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3 r0 = new androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3
            r0.<init>(r6, r14, r1)
            r5 = 1972871863(0x7597a2b7, float:3.8444193E32)
            androidx.compose.runtime.internal.ComposableLambda r22 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r11, r5, r4, r0)
            r0 = r1 & 14
            r4 = 805306368(0x30000000, float:4.656613E-10)
            r0 = r0 | r4
            r4 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r4
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r1
            r0 = r0 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r1
            r0 = r0 | r4
            int r1 = r1 << 18
            r4 = 234881024(0xe000000, float:1.5777218E-30)
            r1 = r1 & r4
            r16 = r0 | r1
            r23 = 68
            r0 = r28
            r1 = r2
            r2 = r3
            r3 = r18
            r4 = r19
            r24 = r6
            r26 = r8
            r8 = r17
            r17 = r9
            r9 = r21
            r21 = r10
            r10 = r17
            r27 = r11
            r11 = r22
            r12 = r27
            r13 = r16
            r14 = r23
            androidx.compose.material.SurfaceKt.m34128SurfaceLPr_se0(r0, r1, r2, r3, r4, r6, r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x026d
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x026d:
            r3 = r17
            r4 = r18
            r5 = r19
            r2 = r21
            r7 = r24
            r9 = r26
        L_0x0279:
            androidx.compose.runtime.ScopeUpdateScope r13 = r27.endRestartGroup()
            if (r13 != 0) goto L_0x0280
            goto L_0x0291
        L_0x0280:
            androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$4 r14 = new androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$4
            r0 = r14
            r1 = r28
            r10 = r37
            r11 = r39
            r12 = r40
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r11, r12)
            r13.updateScope(r14)
        L_0x0291:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.FloatingActionButtonKt.m34032FloatingActionButtonbogVsAg(of.a, androidx.compose.ui.Modifier, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.material.FloatingActionButtonElevation, of.o, androidx.compose.runtime.Composer, int, int):void");
    }
}
