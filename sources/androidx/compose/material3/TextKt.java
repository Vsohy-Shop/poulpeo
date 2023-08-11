package androidx.compose.material3;

import androidx.compose.p002ui.text.TextStyle;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: Text.kt */
public final class TextKt {
    private static final ProvidableCompositionLocal<TextStyle> LocalTextStyle = CompositionLocalKt.compositionLocalOf(SnapshotStateKt.structuralEqualityPolicy(), TextKt$LocalTextStyle$1.INSTANCE);

    @ComposableInferredTarget(scheme = "[0[0]]")
    @Composable
    public static final void ProvideTextStyle(TextStyle textStyle, C13088o<? super Composer, ? super Integer, C11921v> oVar, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        C12775o.m28639i(textStyle, "value");
        C12775o.m28639i(oVar, "content");
        Composer startRestartGroup = composer.startRestartGroup(-460300127);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed((Object) textStyle)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changed((Object) oVar)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-460300127, i2, -1, "androidx.compose.material3.ProvideTextStyle (Text.kt:258)");
            }
            ProvidableCompositionLocal providableCompositionLocal = LocalTextStyle;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{providableCompositionLocal.provides(((TextStyle) startRestartGroup.consume(providableCompositionLocal)).merge(textStyle))}, oVar, startRestartGroup, (i2 & 112) | 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TextKt$ProvideTextStyle$1(textStyle, oVar, i));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0414  */
    /* JADX WARNING: Removed duplicated region for block: B:264:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0130  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: Text--4IGK_g  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m34682Text4IGK_g(androidx.compose.p002ui.text.AnnotatedString r63, androidx.compose.p002ui.Modifier r64, long r65, long r67, androidx.compose.p002ui.text.font.FontStyle r69, androidx.compose.p002ui.text.font.FontWeight r70, androidx.compose.p002ui.text.font.FontFamily r71, long r72, androidx.compose.p002ui.text.style.TextDecoration r74, androidx.compose.p002ui.text.style.TextAlign r75, long r76, int r78, boolean r79, int r80, java.util.Map<java.lang.String, androidx.compose.foundation.text.InlineTextContent> r81, kotlin.jvm.functions.Function1<? super androidx.compose.p002ui.text.TextLayoutResult, p336ef.C11921v> r82, androidx.compose.p002ui.text.TextStyle r83, androidx.compose.runtime.Composer r84, int r85, int r86, int r87) {
        /*
            r1 = r63
            r14 = r85
            r15 = r86
            r13 = r87
            java.lang.String r0 = "text"
            kotlin.jvm.internal.C12775o.m28639i(r1, r0)
            r0 = 224529679(0xd620d0f, float:6.9657345E-31)
            r2 = r84
            androidx.compose.runtime.Composer r2 = r2.startRestartGroup(r0)
            r3 = r13 & 1
            if (r3 == 0) goto L_0x001d
            r3 = r14 | 6
            goto L_0x002d
        L_0x001d:
            r3 = r14 & 14
            if (r3 != 0) goto L_0x002c
            boolean r3 = r2.changed((java.lang.Object) r1)
            if (r3 == 0) goto L_0x0029
            r3 = 4
            goto L_0x002a
        L_0x0029:
            r3 = 2
        L_0x002a:
            r3 = r3 | r14
            goto L_0x002d
        L_0x002c:
            r3 = r14
        L_0x002d:
            r6 = r13 & 2
            if (r6 == 0) goto L_0x0034
            r3 = r3 | 48
            goto L_0x0047
        L_0x0034:
            r9 = r14 & 112(0x70, float:1.57E-43)
            if (r9 != 0) goto L_0x0047
            r9 = r64
            boolean r10 = r2.changed((java.lang.Object) r9)
            if (r10 == 0) goto L_0x0043
            r10 = 32
            goto L_0x0045
        L_0x0043:
            r10 = 16
        L_0x0045:
            r3 = r3 | r10
            goto L_0x0049
        L_0x0047:
            r9 = r64
        L_0x0049:
            r10 = r13 & 4
            if (r10 == 0) goto L_0x0052
            r3 = r3 | 384(0x180, float:5.38E-43)
            r7 = r65
            goto L_0x0065
        L_0x0052:
            r4 = r14 & 896(0x380, float:1.256E-42)
            r7 = r65
            if (r4 != 0) goto L_0x0065
            boolean r17 = r2.changed((long) r7)
            if (r17 == 0) goto L_0x0061
            r17 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r17 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r3 = r3 | r17
        L_0x0065:
            r17 = r13 & 8
            r18 = 2048(0x800, float:2.87E-42)
            r19 = 1024(0x400, float:1.435E-42)
            if (r17 == 0) goto L_0x0072
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            r11 = r67
            goto L_0x0085
        L_0x0072:
            r4 = r14 & 7168(0x1c00, float:1.0045E-41)
            r11 = r67
            if (r4 != 0) goto L_0x0085
            boolean r22 = r2.changed((long) r11)
            if (r22 == 0) goto L_0x0081
            r22 = r18
            goto L_0x0083
        L_0x0081:
            r22 = r19
        L_0x0083:
            r3 = r3 | r22
        L_0x0085:
            r22 = r13 & 16
            if (r22 == 0) goto L_0x008e
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            r5 = r69
            goto L_0x00a4
        L_0x008e:
            r24 = 57344(0xe000, float:8.0356E-41)
            r24 = r14 & r24
            r5 = r69
            if (r24 != 0) goto L_0x00a4
            boolean r25 = r2.changed((java.lang.Object) r5)
            if (r25 == 0) goto L_0x00a0
            r25 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a2
        L_0x00a0:
            r25 = 8192(0x2000, float:1.14794E-41)
        L_0x00a2:
            r3 = r3 | r25
        L_0x00a4:
            r25 = r13 & 32
            r26 = 458752(0x70000, float:6.42848E-40)
            r27 = 65536(0x10000, float:9.18355E-41)
            if (r25 == 0) goto L_0x00b3
            r28 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r28
            r0 = r70
            goto L_0x00c6
        L_0x00b3:
            r28 = r14 & r26
            r0 = r70
            if (r28 != 0) goto L_0x00c6
            boolean r29 = r2.changed((java.lang.Object) r0)
            if (r29 == 0) goto L_0x00c2
            r29 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c4
        L_0x00c2:
            r29 = r27
        L_0x00c4:
            r3 = r3 | r29
        L_0x00c6:
            r29 = r13 & 64
            r30 = 3670016(0x380000, float:5.142788E-39)
            if (r29 == 0) goto L_0x00d3
            r31 = 1572864(0x180000, float:2.204052E-39)
            r3 = r3 | r31
            r4 = r71
            goto L_0x00e6
        L_0x00d3:
            r31 = r14 & r30
            r4 = r71
            if (r31 != 0) goto L_0x00e6
            boolean r32 = r2.changed((java.lang.Object) r4)
            if (r32 == 0) goto L_0x00e2
            r32 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e4
        L_0x00e2:
            r32 = 524288(0x80000, float:7.34684E-40)
        L_0x00e4:
            r3 = r3 | r32
        L_0x00e6:
            r0 = r13 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00f1
            r32 = 12582912(0xc00000, float:1.7632415E-38)
            r3 = r3 | r32
            r4 = r72
            goto L_0x0106
        L_0x00f1:
            r32 = 29360128(0x1c00000, float:7.052966E-38)
            r32 = r14 & r32
            r4 = r72
            if (r32 != 0) goto L_0x0106
            boolean r32 = r2.changed((long) r4)
            if (r32 == 0) goto L_0x0102
            r32 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0104
        L_0x0102:
            r32 = 4194304(0x400000, float:5.877472E-39)
        L_0x0104:
            r3 = r3 | r32
        L_0x0106:
            r1 = r13 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0111
            r32 = 100663296(0x6000000, float:2.4074124E-35)
            r3 = r3 | r32
            r4 = r74
            goto L_0x0125
        L_0x0111:
            r32 = 234881024(0xe000000, float:1.5777218E-30)
            r32 = r14 & r32
            r4 = r74
            if (r32 != 0) goto L_0x0125
            boolean r5 = r2.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x0122
            r5 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0124
        L_0x0122:
            r5 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0124:
            r3 = r3 | r5
        L_0x0125:
            r5 = r13 & 512(0x200, float:7.175E-43)
            if (r5 == 0) goto L_0x0130
            r32 = 805306368(0x30000000, float:4.656613E-10)
            r3 = r3 | r32
            r4 = r75
            goto L_0x0145
        L_0x0130:
            r32 = 1879048192(0x70000000, float:1.58456325E29)
            r32 = r14 & r32
            r4 = r75
            if (r32 != 0) goto L_0x0145
            boolean r32 = r2.changed((java.lang.Object) r4)
            if (r32 == 0) goto L_0x0141
            r32 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0143
        L_0x0141:
            r32 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0143:
            r3 = r3 | r32
        L_0x0145:
            r4 = r13 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x014e
            r24 = r15 | 6
            r7 = r76
            goto L_0x0164
        L_0x014e:
            r32 = r15 & 14
            r7 = r76
            if (r32 != 0) goto L_0x0162
            boolean r32 = r2.changed((long) r7)
            if (r32 == 0) goto L_0x015d
            r24 = 4
            goto L_0x015f
        L_0x015d:
            r24 = 2
        L_0x015f:
            r24 = r15 | r24
            goto L_0x0164
        L_0x0162:
            r24 = r15
        L_0x0164:
            r7 = r13 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x016b
            r24 = r24 | 48
            goto L_0x0181
        L_0x016b:
            r8 = r15 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x017f
            r8 = r78
            boolean r32 = r2.changed((int) r8)
            if (r32 == 0) goto L_0x017a
            r16 = 32
            goto L_0x017c
        L_0x017a:
            r16 = 16
        L_0x017c:
            r24 = r24 | r16
            goto L_0x0181
        L_0x017f:
            r8 = r78
        L_0x0181:
            r8 = r24
            r9 = r13 & 4096(0x1000, float:5.74E-42)
            if (r9 == 0) goto L_0x018a
            r8 = r8 | 384(0x180, float:5.38E-43)
            goto L_0x019e
        L_0x018a:
            r11 = r15 & 896(0x380, float:1.256E-42)
            if (r11 != 0) goto L_0x019e
            r11 = r79
            boolean r12 = r2.changed((boolean) r11)
            if (r12 == 0) goto L_0x0199
            r23 = 256(0x100, float:3.59E-43)
            goto L_0x019b
        L_0x0199:
            r23 = 128(0x80, float:1.794E-43)
        L_0x019b:
            r8 = r8 | r23
            goto L_0x01a0
        L_0x019e:
            r11 = r79
        L_0x01a0:
            r12 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r12 == 0) goto L_0x01a7
            r8 = r8 | 3072(0xc00, float:4.305E-42)
            goto L_0x01b9
        L_0x01a7:
            r11 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x01b9
            r11 = r80
            boolean r16 = r2.changed((int) r11)
            if (r16 == 0) goto L_0x01b4
            goto L_0x01b6
        L_0x01b4:
            r18 = r19
        L_0x01b6:
            r8 = r8 | r18
            goto L_0x01bb
        L_0x01b9:
            r11 = r80
        L_0x01bb:
            r11 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r11 == 0) goto L_0x01c1
            r8 = r8 | 8192(0x2000, float:1.14794E-41)
        L_0x01c1:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r13 & r16
            if (r16 == 0) goto L_0x01cd
            r18 = 196608(0x30000, float:2.75506E-40)
            r8 = r8 | r18
            goto L_0x01e3
        L_0x01cd:
            r18 = r15 & r26
            if (r18 != 0) goto L_0x01e3
            r18 = r12
            r12 = r82
            boolean r19 = r2.changed((java.lang.Object) r12)
            if (r19 == 0) goto L_0x01de
            r19 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01e0
        L_0x01de:
            r19 = r27
        L_0x01e0:
            r8 = r8 | r19
            goto L_0x01e7
        L_0x01e3:
            r18 = r12
            r12 = r82
        L_0x01e7:
            r19 = r15 & r30
            if (r19 != 0) goto L_0x01ff
            r19 = r13 & r27
            r12 = r83
            if (r19 != 0) goto L_0x01fa
            boolean r19 = r2.changed((java.lang.Object) r12)
            if (r19 == 0) goto L_0x01fa
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x01fc
        L_0x01fa:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x01fc:
            r8 = r8 | r19
            goto L_0x0201
        L_0x01ff:
            r12 = r83
        L_0x0201:
            r12 = 16384(0x4000, float:2.2959E-41)
            if (r11 != r12) goto L_0x0243
            r12 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r12 = r12 & r3
            r15 = 306783378(0x12492492, float:6.3469493E-28)
            if (r12 != r15) goto L_0x0243
            r12 = 2995931(0x2db6db, float:4.198194E-39)
            r12 = r12 & r8
            r15 = 599186(0x92492, float:8.39638E-40)
            if (r12 != r15) goto L_0x0243
            boolean r12 = r2.getSkipping()
            if (r12 != 0) goto L_0x021e
            goto L_0x0243
        L_0x021e:
            r2.skipToGroupEnd()
            r6 = r64
            r3 = r65
            r23 = r67
            r7 = r69
            r8 = r70
            r9 = r71
            r10 = r72
            r12 = r74
            r13 = r75
            r14 = r76
            r16 = r78
            r17 = r79
            r18 = r80
            r19 = r81
            r20 = r82
            r21 = r83
            goto L_0x040d
        L_0x0243:
            r2.startDefaults()
            r12 = r14 & 1
            if (r12 == 0) goto L_0x0285
            boolean r12 = r2.getDefaultsInvalid()
            if (r12 == 0) goto L_0x0251
            goto L_0x0285
        L_0x0251:
            r2.skipToGroupEnd()
            if (r11 == 0) goto L_0x025a
            r0 = -57345(0xffffffffffff1fff, float:NaN)
            r8 = r8 & r0
        L_0x025a:
            r0 = r13 & r27
            if (r0 == 0) goto L_0x0262
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r8 = r8 & r0
        L_0x0262:
            r6 = r64
            r19 = r65
            r23 = r67
            r12 = r69
            r17 = r70
            r21 = r71
            r0 = r72
            r4 = r74
            r10 = r75
            r5 = r78
            r9 = r79
            r11 = r80
            r15 = r81
            r16 = r82
            r75 = r83
            r13 = r8
            r7 = r76
            goto L_0x0326
        L_0x0285:
            if (r6 == 0) goto L_0x028a
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x028c
        L_0x028a:
            r6 = r64
        L_0x028c:
            if (r10 == 0) goto L_0x0295
            androidx.compose.ui.graphics.Color$Companion r10 = androidx.compose.p002ui.graphics.Color.Companion
            long r19 = r10.m35707getUnspecified0d7_KjU()
            goto L_0x0297
        L_0x0295:
            r19 = r65
        L_0x0297:
            if (r17 == 0) goto L_0x02a0
            androidx.compose.ui.unit.TextUnit$Companion r10 = androidx.compose.p002ui.unit.TextUnit.Companion
            long r23 = r10.m38660getUnspecifiedXSAIIZE()
            goto L_0x02a2
        L_0x02a0:
            r23 = r67
        L_0x02a2:
            r10 = 0
            if (r22 == 0) goto L_0x02a7
            r12 = r10
            goto L_0x02a9
        L_0x02a7:
            r12 = r69
        L_0x02a9:
            if (r25 == 0) goto L_0x02ae
            r17 = r10
            goto L_0x02b0
        L_0x02ae:
            r17 = r70
        L_0x02b0:
            if (r29 == 0) goto L_0x02b5
            r21 = r10
            goto L_0x02b7
        L_0x02b5:
            r21 = r71
        L_0x02b7:
            if (r0 == 0) goto L_0x02c0
            androidx.compose.ui.unit.TextUnit$Companion r0 = androidx.compose.p002ui.unit.TextUnit.Companion
            long r31 = r0.m38660getUnspecifiedXSAIIZE()
            goto L_0x02c2
        L_0x02c0:
            r31 = r72
        L_0x02c2:
            if (r1 == 0) goto L_0x02c6
            r0 = r10
            goto L_0x02c8
        L_0x02c6:
            r0 = r74
        L_0x02c8:
            if (r5 == 0) goto L_0x02cb
            goto L_0x02cd
        L_0x02cb:
            r10 = r75
        L_0x02cd:
            if (r4 == 0) goto L_0x02d6
            androidx.compose.ui.unit.TextUnit$Companion r1 = androidx.compose.p002ui.unit.TextUnit.Companion
            long r4 = r1.m38660getUnspecifiedXSAIIZE()
            goto L_0x02d8
        L_0x02d6:
            r4 = r76
        L_0x02d8:
            if (r7 == 0) goto L_0x02e1
            androidx.compose.ui.text.style.TextOverflow$Companion r1 = androidx.compose.p002ui.text.style.TextOverflow.Companion
            int r1 = r1.m38397getClipgIe3tQ8()
            goto L_0x02e3
        L_0x02e1:
            r1 = r78
        L_0x02e3:
            if (r9 == 0) goto L_0x02e7
            r7 = 1
            goto L_0x02e9
        L_0x02e7:
            r7 = r79
        L_0x02e9:
            if (r18 == 0) goto L_0x02ef
            r9 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x02f1
        L_0x02ef:
            r9 = r80
        L_0x02f1:
            if (r11 == 0) goto L_0x02fd
            java.util.Map r11 = kotlin.collections.C12716r0.m28416g()
            r18 = -57345(0xffffffffffff1fff, float:NaN)
            r8 = r8 & r18
            goto L_0x02ff
        L_0x02fd:
            r11 = r81
        L_0x02ff:
            if (r16 == 0) goto L_0x0304
            androidx.compose.material3.TextKt$Text$3 r16 = androidx.compose.material3.TextKt$Text$3.INSTANCE
            goto L_0x0306
        L_0x0304:
            r16 = r82
        L_0x0306:
            r18 = r13 & r27
            if (r18 == 0) goto L_0x031b
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.text.TextStyle> r15 = LocalTextStyle
            java.lang.Object r15 = r2.consume(r15)
            androidx.compose.ui.text.TextStyle r15 = (androidx.compose.p002ui.text.TextStyle) r15
            r18 = -3670017(0xffffffffffc7ffff, float:NaN)
            r8 = r8 & r18
            r13 = r8
            r75 = r15
            goto L_0x031e
        L_0x031b:
            r75 = r83
            r13 = r8
        L_0x031e:
            r15 = r11
            r11 = r9
            r9 = r7
            r7 = r4
            r4 = r0
            r5 = r1
            r0 = r31
        L_0x0326:
            r2.endDefaults()
            boolean r18 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r18 == 0) goto L_0x033a
            java.lang.String r14 = "androidx.compose.material3.Text (Text.kt:189)"
            r76 = r15
            r15 = 224529679(0xd620d0f, float:6.9657345E-31)
            androidx.compose.runtime.ComposerKt.traceEventStart(r15, r3, r13, r14)
            goto L_0x033c
        L_0x033a:
            r76 = r15
        L_0x033c:
            r14 = 79587464(0x4be6888, float:4.4764782E-36)
            r2.startReplaceableGroup(r14)
            androidx.compose.ui.graphics.Color$Companion r14 = androidx.compose.p002ui.graphics.Color.Companion
            long r27 = r14.m35707getUnspecified0d7_KjU()
            int r15 = (r19 > r27 ? 1 : (r19 == r27 ? 0 : -1))
            if (r15 == 0) goto L_0x034e
            r15 = 1
            goto L_0x034f
        L_0x034e:
            r15 = 0
        L_0x034f:
            if (r15 == 0) goto L_0x0354
            r32 = r19
            goto L_0x0376
        L_0x0354:
            long r27 = r75.m37995getColor0d7_KjU()
            long r14 = r14.m35707getUnspecified0d7_KjU()
            int r14 = (r27 > r14 ? 1 : (r27 == r14 ? 0 : -1))
            if (r14 == 0) goto L_0x0362
            r15 = 1
            goto L_0x0363
        L_0x0362:
            r15 = 0
        L_0x0363:
            if (r15 == 0) goto L_0x0366
            goto L_0x0374
        L_0x0366:
            androidx.compose.runtime.ProvidableCompositionLocal r14 = androidx.compose.material3.ContentColorKt.getLocalContentColor()
            java.lang.Object r14 = r2.consume(r14)
            androidx.compose.ui.graphics.Color r14 = (androidx.compose.p002ui.graphics.Color) r14
            long r27 = r14.m35681unboximpl()
        L_0x0374:
            r32 = r27
        L_0x0376:
            r2.endReplaceableGroup()
            androidx.compose.ui.text.TextStyle r14 = new androidx.compose.ui.text.TextStyle
            r31 = r14
            r38 = 0
            r40 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r49 = 0
            r51 = 0
            r54 = 0
            r55 = 175952(0x2af50, float:2.46561E-40)
            r56 = 0
            r34 = r23
            r36 = r17
            r37 = r12
            r39 = r21
            r41 = r0
            r48 = r4
            r50 = r10
            r52 = r7
            r31.<init>((long) r32, (long) r34, (androidx.compose.p002ui.text.font.FontWeight) r36, (androidx.compose.p002ui.text.font.FontStyle) r37, (androidx.compose.p002ui.text.font.FontSynthesis) r38, (androidx.compose.p002ui.text.font.FontFamily) r39, (java.lang.String) r40, (long) r41, (androidx.compose.p002ui.text.style.BaselineShift) r43, (androidx.compose.p002ui.text.style.TextGeometricTransform) r44, (androidx.compose.p002ui.text.intl.LocaleList) r45, (long) r46, (androidx.compose.p002ui.text.style.TextDecoration) r48, (androidx.compose.p002ui.graphics.Shadow) r49, (androidx.compose.p002ui.text.style.TextAlign) r50, (androidx.compose.p002ui.text.style.TextDirection) r51, (long) r52, (androidx.compose.p002ui.text.style.TextIndent) r54, (int) r55, (kotlin.jvm.internal.DefaultConstructorMarker) r56)
            r15 = r75
            androidx.compose.ui.text.TextStyle r14 = r15.merge((androidx.compose.p002ui.text.TextStyle) r14)
            r18 = 16777216(0x1000000, float:2.3509887E-38)
            r22 = r3 & 14
            r18 = r22 | r18
            r3 = r3 & 112(0x70, float:1.57E-43)
            r3 = r18 | r3
            r77 = r0
            int r0 = r13 >> 6
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r3
            int r1 = r13 << 9
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r1
            r0 = r0 | r3
            r3 = r1 & r26
            r0 = r0 | r3
            r1 = r1 & r30
            r0 = r0 | r1
            r1 = 0
            r64 = r63
            r65 = r6
            r66 = r14
            r67 = r16
            r68 = r5
            r69 = r9
            r70 = r11
            r71 = r76
            r72 = r2
            r73 = r0
            r74 = r1
            androidx.compose.foundation.text.BasicTextKt.m33630BasicText4YKlhWE((androidx.compose.p002ui.text.AnnotatedString) r64, (androidx.compose.p002ui.Modifier) r65, (androidx.compose.p002ui.text.TextStyle) r66, (kotlin.jvm.functions.Function1) r67, (int) r68, (boolean) r69, (int) r70, (java.util.Map) r71, (androidx.compose.runtime.Composer) r72, (int) r73, (int) r74)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x03ee
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x03ee:
            r13 = r10
            r18 = r11
            r10 = r77
            r59 = r19
            r19 = r76
            r20 = r16
            r16 = r5
            r61 = r12
            r12 = r4
            r3 = r59
            r62 = r17
            r17 = r9
            r9 = r21
            r21 = r15
            r14 = r7
            r7 = r61
            r8 = r62
        L_0x040d:
            androidx.compose.runtime.ScopeUpdateScope r5 = r2.endRestartGroup()
            if (r5 != 0) goto L_0x0414
            goto L_0x0430
        L_0x0414:
            androidx.compose.material3.TextKt$Text$4 r2 = new androidx.compose.material3.TextKt$Text$4
            r0 = r2
            r1 = r63
            r57 = r2
            r2 = r6
            r58 = r5
            r5 = r23
            r22 = r85
            r23 = r86
            r24 = r87
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r1 = r57
            r0 = r58
            r0.updateScope(r1)
        L_0x0430:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextKt.m34682Text4IGK_g(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, java.util.Map, kotlin.jvm.functions.Function1, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x03cb  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:250:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0132  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: Text-fLXpl1I  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m34683TextfLXpl1I(java.lang.String r60, androidx.compose.p002ui.Modifier r61, long r62, long r64, androidx.compose.p002ui.text.font.FontStyle r66, androidx.compose.p002ui.text.font.FontWeight r67, androidx.compose.p002ui.text.font.FontFamily r68, long r69, androidx.compose.p002ui.text.style.TextDecoration r71, androidx.compose.p002ui.text.style.TextAlign r72, long r73, int r75, boolean r76, int r77, kotlin.jvm.functions.Function1<? super androidx.compose.p002ui.text.TextLayoutResult, p336ef.C11921v> r78, androidx.compose.p002ui.text.TextStyle r79, androidx.compose.runtime.Composer r80, int r81, int r82, int r83) {
        /*
            r1 = r60
            r14 = r81
            r15 = r82
            r13 = r83
            java.lang.String r0 = "text"
            kotlin.jvm.internal.C12775o.m28639i(r1, r0)
            r0 = 1968784669(0x7559451d, float:2.7542241E32)
            r2 = r80
            androidx.compose.runtime.Composer r2 = r2.startRestartGroup(r0)
            r3 = r13 & 1
            if (r3 == 0) goto L_0x001d
            r3 = r14 | 6
            goto L_0x002d
        L_0x001d:
            r3 = r14 & 14
            if (r3 != 0) goto L_0x002c
            boolean r3 = r2.changed((java.lang.Object) r1)
            if (r3 == 0) goto L_0x0029
            r3 = 4
            goto L_0x002a
        L_0x0029:
            r3 = 2
        L_0x002a:
            r3 = r3 | r14
            goto L_0x002d
        L_0x002c:
            r3 = r14
        L_0x002d:
            r6 = r13 & 2
            if (r6 == 0) goto L_0x0034
            r3 = r3 | 48
            goto L_0x0047
        L_0x0034:
            r9 = r14 & 112(0x70, float:1.57E-43)
            if (r9 != 0) goto L_0x0047
            r9 = r61
            boolean r10 = r2.changed((java.lang.Object) r9)
            if (r10 == 0) goto L_0x0043
            r10 = 32
            goto L_0x0045
        L_0x0043:
            r10 = 16
        L_0x0045:
            r3 = r3 | r10
            goto L_0x0049
        L_0x0047:
            r9 = r61
        L_0x0049:
            r10 = r13 & 4
            if (r10 == 0) goto L_0x0052
            r3 = r3 | 384(0x180, float:5.38E-43)
            r7 = r62
            goto L_0x0065
        L_0x0052:
            r4 = r14 & 896(0x380, float:1.256E-42)
            r7 = r62
            if (r4 != 0) goto L_0x0065
            boolean r17 = r2.changed((long) r7)
            if (r17 == 0) goto L_0x0061
            r17 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r17 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r3 = r3 | r17
        L_0x0065:
            r17 = r13 & 8
            r18 = 2048(0x800, float:2.87E-42)
            r19 = 1024(0x400, float:1.435E-42)
            if (r17 == 0) goto L_0x0072
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            r11 = r64
            goto L_0x0085
        L_0x0072:
            r4 = r14 & 7168(0x1c00, float:1.0045E-41)
            r11 = r64
            if (r4 != 0) goto L_0x0085
            boolean r22 = r2.changed((long) r11)
            if (r22 == 0) goto L_0x0081
            r22 = r18
            goto L_0x0083
        L_0x0081:
            r22 = r19
        L_0x0083:
            r3 = r3 | r22
        L_0x0085:
            r22 = r13 & 16
            r23 = 16384(0x4000, float:2.2959E-41)
            r24 = 8192(0x2000, float:1.14794E-41)
            r25 = 57344(0xe000, float:8.0356E-41)
            if (r22 == 0) goto L_0x0095
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            r4 = r66
            goto L_0x00a8
        L_0x0095:
            r26 = r14 & r25
            r4 = r66
            if (r26 != 0) goto L_0x00a8
            boolean r27 = r2.changed((java.lang.Object) r4)
            if (r27 == 0) goto L_0x00a4
            r27 = r23
            goto L_0x00a6
        L_0x00a4:
            r27 = r24
        L_0x00a6:
            r3 = r3 | r27
        L_0x00a8:
            r27 = r13 & 32
            r28 = 458752(0x70000, float:6.42848E-40)
            if (r27 == 0) goto L_0x00b5
            r29 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r29
            r5 = r67
            goto L_0x00c8
        L_0x00b5:
            r29 = r14 & r28
            r5 = r67
            if (r29 != 0) goto L_0x00c8
            boolean r30 = r2.changed((java.lang.Object) r5)
            if (r30 == 0) goto L_0x00c4
            r30 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c6
        L_0x00c4:
            r30 = 65536(0x10000, float:9.18355E-41)
        L_0x00c6:
            r3 = r3 | r30
        L_0x00c8:
            r30 = r13 & 64
            if (r30 == 0) goto L_0x00d3
            r31 = 1572864(0x180000, float:2.204052E-39)
            r3 = r3 | r31
            r0 = r68
            goto L_0x00e8
        L_0x00d3:
            r31 = 3670016(0x380000, float:5.142788E-39)
            r31 = r14 & r31
            r0 = r68
            if (r31 != 0) goto L_0x00e8
            boolean r32 = r2.changed((java.lang.Object) r0)
            if (r32 == 0) goto L_0x00e4
            r32 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e6
        L_0x00e4:
            r32 = 524288(0x80000, float:7.34684E-40)
        L_0x00e6:
            r3 = r3 | r32
        L_0x00e8:
            r0 = r13 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00f3
            r32 = 12582912(0xc00000, float:1.7632415E-38)
            r3 = r3 | r32
            r4 = r69
            goto L_0x0108
        L_0x00f3:
            r32 = 29360128(0x1c00000, float:7.052966E-38)
            r32 = r14 & r32
            r4 = r69
            if (r32 != 0) goto L_0x0108
            boolean r32 = r2.changed((long) r4)
            if (r32 == 0) goto L_0x0104
            r32 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0106
        L_0x0104:
            r32 = 4194304(0x400000, float:5.877472E-39)
        L_0x0106:
            r3 = r3 | r32
        L_0x0108:
            r1 = r13 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0113
            r32 = 100663296(0x6000000, float:2.4074124E-35)
            r3 = r3 | r32
            r4 = r71
            goto L_0x0127
        L_0x0113:
            r32 = 234881024(0xe000000, float:1.5777218E-30)
            r32 = r14 & r32
            r4 = r71
            if (r32 != 0) goto L_0x0127
            boolean r5 = r2.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x0124
            r5 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0126
        L_0x0124:
            r5 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0126:
            r3 = r3 | r5
        L_0x0127:
            r5 = r13 & 512(0x200, float:7.175E-43)
            if (r5 == 0) goto L_0x0132
            r32 = 805306368(0x30000000, float:4.656613E-10)
            r3 = r3 | r32
            r4 = r72
            goto L_0x0147
        L_0x0132:
            r32 = 1879048192(0x70000000, float:1.58456325E29)
            r32 = r14 & r32
            r4 = r72
            if (r32 != 0) goto L_0x0147
            boolean r32 = r2.changed((java.lang.Object) r4)
            if (r32 == 0) goto L_0x0143
            r32 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0145
        L_0x0143:
            r32 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0145:
            r3 = r3 | r32
        L_0x0147:
            r4 = r13 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x0150
            r29 = r15 | 6
            r7 = r73
            goto L_0x0166
        L_0x0150:
            r32 = r15 & 14
            r7 = r73
            if (r32 != 0) goto L_0x0164
            boolean r32 = r2.changed((long) r7)
            if (r32 == 0) goto L_0x015f
            r29 = 4
            goto L_0x0161
        L_0x015f:
            r29 = 2
        L_0x0161:
            r29 = r15 | r29
            goto L_0x0166
        L_0x0164:
            r29 = r15
        L_0x0166:
            r7 = r13 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x016d
            r29 = r29 | 48
            goto L_0x0183
        L_0x016d:
            r8 = r15 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x0181
            r8 = r75
            boolean r32 = r2.changed((int) r8)
            if (r32 == 0) goto L_0x017c
            r16 = 32
            goto L_0x017e
        L_0x017c:
            r16 = 16
        L_0x017e:
            r29 = r29 | r16
            goto L_0x0183
        L_0x0181:
            r8 = r75
        L_0x0183:
            r8 = r29
            r9 = r13 & 4096(0x1000, float:5.74E-42)
            if (r9 == 0) goto L_0x018c
            r8 = r8 | 384(0x180, float:5.38E-43)
            goto L_0x01a0
        L_0x018c:
            r11 = r15 & 896(0x380, float:1.256E-42)
            if (r11 != 0) goto L_0x01a0
            r11 = r76
            boolean r12 = r2.changed((boolean) r11)
            if (r12 == 0) goto L_0x019b
            r26 = 256(0x100, float:3.59E-43)
            goto L_0x019d
        L_0x019b:
            r26 = 128(0x80, float:1.794E-43)
        L_0x019d:
            r8 = r8 | r26
            goto L_0x01a2
        L_0x01a0:
            r11 = r76
        L_0x01a2:
            r12 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r12 == 0) goto L_0x01a9
            r8 = r8 | 3072(0xc00, float:4.305E-42)
            goto L_0x01bb
        L_0x01a9:
            r11 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x01bb
            r11 = r77
            boolean r16 = r2.changed((int) r11)
            if (r16 == 0) goto L_0x01b6
            goto L_0x01b8
        L_0x01b6:
            r18 = r19
        L_0x01b8:
            r8 = r8 | r18
            goto L_0x01bd
        L_0x01bb:
            r11 = r77
        L_0x01bd:
            r11 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r11 == 0) goto L_0x01c4
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
            goto L_0x01d8
        L_0x01c4:
            r16 = r15 & r25
            if (r16 != 0) goto L_0x01d8
            r16 = r11
            r11 = r78
            boolean r18 = r2.changed((java.lang.Object) r11)
            if (r18 == 0) goto L_0x01d3
            goto L_0x01d5
        L_0x01d3:
            r23 = r24
        L_0x01d5:
            r8 = r8 | r23
            goto L_0x01dc
        L_0x01d8:
            r16 = r11
            r11 = r78
        L_0x01dc:
            r18 = r15 & r28
            r19 = 32768(0x8000, float:4.5918E-41)
            if (r18 != 0) goto L_0x01f7
            r18 = r13 & r19
            r11 = r79
            if (r18 != 0) goto L_0x01f2
            boolean r18 = r2.changed((java.lang.Object) r11)
            if (r18 == 0) goto L_0x01f2
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01f4
        L_0x01f2:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x01f4:
            r8 = r8 | r18
            goto L_0x01f9
        L_0x01f7:
            r11 = r79
        L_0x01f9:
            r18 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r11 = r3 & r18
            r15 = 306783378(0x12492492, float:6.3469493E-28)
            if (r11 != r15) goto L_0x0236
            r11 = 374491(0x5b6db, float:5.24774E-40)
            r11 = r11 & r8
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r11 != r15) goto L_0x0236
            boolean r11 = r2.getSkipping()
            if (r11 != 0) goto L_0x0213
            goto L_0x0236
        L_0x0213:
            r2.skipToGroupEnd()
            r6 = r61
            r3 = r62
            r17 = r64
            r7 = r66
            r8 = r67
            r9 = r68
            r10 = r69
            r12 = r71
            r13 = r72
            r14 = r73
            r16 = r75
            r19 = r76
            r20 = r77
            r21 = r78
            r22 = r79
            goto L_0x03c4
        L_0x0236:
            r2.startDefaults()
            r11 = r14 & 1
            if (r11 == 0) goto L_0x026f
            boolean r11 = r2.getDefaultsInvalid()
            if (r11 == 0) goto L_0x0244
            goto L_0x026f
        L_0x0244:
            r2.skipToGroupEnd()
            r0 = r13 & r19
            if (r0 == 0) goto L_0x024f
            r0 = -458753(0xfffffffffff8ffff, float:NaN)
            r8 = r8 & r0
        L_0x024f:
            r6 = r61
            r10 = r62
            r17 = r64
            r21 = r66
            r22 = r67
            r23 = r68
            r26 = r69
            r0 = r71
            r20 = r72
            r4 = r73
            r1 = r75
            r7 = r76
            r9 = r77
            r12 = r78
        L_0x026b:
            r15 = r79
            goto L_0x02f6
        L_0x026f:
            if (r6 == 0) goto L_0x0274
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x0276
        L_0x0274:
            r6 = r61
        L_0x0276:
            if (r10 == 0) goto L_0x027f
            androidx.compose.ui.graphics.Color$Companion r10 = androidx.compose.p002ui.graphics.Color.Companion
            long r10 = r10.m35707getUnspecified0d7_KjU()
            goto L_0x0281
        L_0x027f:
            r10 = r62
        L_0x0281:
            if (r17 == 0) goto L_0x028a
            androidx.compose.ui.unit.TextUnit$Companion r17 = androidx.compose.p002ui.unit.TextUnit.Companion
            long r17 = r17.m38660getUnspecifiedXSAIIZE()
            goto L_0x028c
        L_0x028a:
            r17 = r64
        L_0x028c:
            r20 = 0
            if (r22 == 0) goto L_0x0293
            r21 = r20
            goto L_0x0295
        L_0x0293:
            r21 = r66
        L_0x0295:
            if (r27 == 0) goto L_0x029a
            r22 = r20
            goto L_0x029c
        L_0x029a:
            r22 = r67
        L_0x029c:
            if (r30 == 0) goto L_0x02a1
            r23 = r20
            goto L_0x02a3
        L_0x02a1:
            r23 = r68
        L_0x02a3:
            if (r0 == 0) goto L_0x02ac
            androidx.compose.ui.unit.TextUnit$Companion r0 = androidx.compose.p002ui.unit.TextUnit.Companion
            long r26 = r0.m38660getUnspecifiedXSAIIZE()
            goto L_0x02ae
        L_0x02ac:
            r26 = r69
        L_0x02ae:
            if (r1 == 0) goto L_0x02b3
            r0 = r20
            goto L_0x02b5
        L_0x02b3:
            r0 = r71
        L_0x02b5:
            if (r5 == 0) goto L_0x02b8
            goto L_0x02ba
        L_0x02b8:
            r20 = r72
        L_0x02ba:
            if (r4 == 0) goto L_0x02c3
            androidx.compose.ui.unit.TextUnit$Companion r1 = androidx.compose.p002ui.unit.TextUnit.Companion
            long r4 = r1.m38660getUnspecifiedXSAIIZE()
            goto L_0x02c5
        L_0x02c3:
            r4 = r73
        L_0x02c5:
            if (r7 == 0) goto L_0x02ce
            androidx.compose.ui.text.style.TextOverflow$Companion r1 = androidx.compose.p002ui.text.style.TextOverflow.Companion
            int r1 = r1.m38397getClipgIe3tQ8()
            goto L_0x02d0
        L_0x02ce:
            r1 = r75
        L_0x02d0:
            if (r9 == 0) goto L_0x02d4
            r7 = 1
            goto L_0x02d6
        L_0x02d4:
            r7 = r76
        L_0x02d6:
            if (r12 == 0) goto L_0x02dc
            r9 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x02de
        L_0x02dc:
            r9 = r77
        L_0x02de:
            if (r16 == 0) goto L_0x02e3
            androidx.compose.material3.TextKt$Text$1 r12 = androidx.compose.material3.TextKt$Text$1.INSTANCE
            goto L_0x02e5
        L_0x02e3:
            r12 = r78
        L_0x02e5:
            r16 = r13 & r19
            if (r16 == 0) goto L_0x026b
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.text.TextStyle> r15 = LocalTextStyle
            java.lang.Object r15 = r2.consume(r15)
            androidx.compose.ui.text.TextStyle r15 = (androidx.compose.p002ui.text.TextStyle) r15
            r16 = -458753(0xfffffffffff8ffff, float:NaN)
            r8 = r8 & r16
        L_0x02f6:
            r2.endDefaults()
            boolean r16 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r16 == 0) goto L_0x0307
            java.lang.String r13 = "androidx.compose.material3.Text (Text.kt:88)"
            r14 = 1968784669(0x7559451d, float:2.7542241E32)
            androidx.compose.runtime.ComposerKt.traceEventStart(r14, r3, r8, r13)
        L_0x0307:
            r13 = 79582607(0x4be558f, float:4.474736E-36)
            r2.startReplaceableGroup(r13)
            androidx.compose.ui.graphics.Color$Companion r13 = androidx.compose.p002ui.graphics.Color.Companion
            long r29 = r13.m35707getUnspecified0d7_KjU()
            int r14 = (r10 > r29 ? 1 : (r10 == r29 ? 0 : -1))
            if (r14 == 0) goto L_0x0319
            r14 = 1
            goto L_0x031a
        L_0x0319:
            r14 = 0
        L_0x031a:
            if (r14 == 0) goto L_0x031f
            r33 = r10
            goto L_0x0341
        L_0x031f:
            long r29 = r15.m37995getColor0d7_KjU()
            long r13 = r13.m35707getUnspecified0d7_KjU()
            int r13 = (r29 > r13 ? 1 : (r29 == r13 ? 0 : -1))
            if (r13 == 0) goto L_0x032d
            r13 = 1
            goto L_0x032e
        L_0x032d:
            r13 = 0
        L_0x032e:
            if (r13 == 0) goto L_0x0331
            goto L_0x033f
        L_0x0331:
            androidx.compose.runtime.ProvidableCompositionLocal r13 = androidx.compose.material3.ContentColorKt.getLocalContentColor()
            java.lang.Object r13 = r2.consume(r13)
            androidx.compose.ui.graphics.Color r13 = (androidx.compose.p002ui.graphics.Color) r13
            long r29 = r13.m35681unboximpl()
        L_0x033f:
            r33 = r29
        L_0x0341:
            r2.endReplaceableGroup()
            androidx.compose.ui.text.TextStyle r13 = new androidx.compose.ui.text.TextStyle
            r32 = r13
            r39 = 0
            r41 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r50 = 0
            r52 = 0
            r55 = 0
            r56 = 175952(0x2af50, float:2.46561E-40)
            r57 = 0
            r35 = r17
            r37 = r22
            r38 = r21
            r40 = r23
            r42 = r26
            r49 = r0
            r51 = r20
            r53 = r4
            r32.<init>((long) r33, (long) r35, (androidx.compose.p002ui.text.font.FontWeight) r37, (androidx.compose.p002ui.text.font.FontStyle) r38, (androidx.compose.p002ui.text.font.FontSynthesis) r39, (androidx.compose.p002ui.text.font.FontFamily) r40, (java.lang.String) r41, (long) r42, (androidx.compose.p002ui.text.style.BaselineShift) r44, (androidx.compose.p002ui.text.style.TextGeometricTransform) r45, (androidx.compose.p002ui.text.intl.LocaleList) r46, (long) r47, (androidx.compose.p002ui.text.style.TextDecoration) r49, (androidx.compose.p002ui.graphics.Shadow) r50, (androidx.compose.p002ui.text.style.TextAlign) r51, (androidx.compose.p002ui.text.style.TextDirection) r52, (long) r53, (androidx.compose.p002ui.text.style.TextIndent) r55, (int) r56, (kotlin.jvm.internal.DefaultConstructorMarker) r57)
            androidx.compose.ui.text.TextStyle r13 = r15.merge((androidx.compose.p002ui.text.TextStyle) r13)
            r14 = r3 & 14
            r3 = r3 & 112(0x70, float:1.57E-43)
            r3 = r3 | r14
            int r14 = r8 >> 3
            r14 = r14 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r14
            int r8 = r8 << 9
            r14 = r8 & r25
            r3 = r3 | r14
            r14 = r8 & r28
            r3 = r3 | r14
            r14 = 3670016(0x380000, float:5.142788E-39)
            r8 = r8 & r14
            r3 = r3 | r8
            r8 = 0
            r61 = r60
            r62 = r6
            r63 = r13
            r64 = r12
            r65 = r1
            r66 = r7
            r67 = r9
            r68 = r2
            r69 = r3
            r70 = r8
            androidx.compose.foundation.text.BasicTextKt.m33632BasicTextBpD7jsM(r61, r62, r63, r64, r65, r66, r67, r68, r69, r70)
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x03ad
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x03ad:
            r16 = r1
            r19 = r7
            r13 = r20
            r7 = r21
            r8 = r22
            r20 = r9
            r21 = r12
            r22 = r15
            r9 = r23
            r12 = r0
            r14 = r4
            r3 = r10
            r10 = r26
        L_0x03c4:
            androidx.compose.runtime.ScopeUpdateScope r5 = r2.endRestartGroup()
            if (r5 != 0) goto L_0x03cb
            goto L_0x03ef
        L_0x03cb:
            androidx.compose.material3.TextKt$Text$2 r2 = new androidx.compose.material3.TextKt$Text$2
            r0 = r2
            r1 = r60
            r58 = r2
            r2 = r6
            r59 = r5
            r5 = r17
            r17 = r19
            r18 = r20
            r19 = r21
            r20 = r22
            r21 = r81
            r22 = r82
            r23 = r83
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23)
            r1 = r58
            r0 = r59
            r0.updateScope(r1)
        L_0x03ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextKt.m34683TextfLXpl1I(java.lang.String, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, kotlin.jvm.functions.Function1, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final ProvidableCompositionLocal<TextStyle> getLocalTextStyle() {
        return LocalTextStyle;
    }
}
