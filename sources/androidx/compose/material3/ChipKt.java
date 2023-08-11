package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.p002ui.semantics.SemanticsModifierKt;
import androidx.compose.p002ui.text.TextStyle;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;

/* compiled from: Chip.kt */
public final class ChipKt {
    private static final PaddingValues AssistChipPadding;
    private static final PaddingValues FilterChipPadding;
    /* access modifiers changed from: private */
    public static final float HorizontalElementsPadding;
    private static final PaddingValues SuggestionChipPadding;

    static {
        float r0 = C1232Dp.m38468constructorimpl((float) 8);
        HorizontalElementsPadding = r0;
        AssistChipPadding = PaddingKt.m33263PaddingValuesYgX7TsA$default(r0, 0.0f, 2, (Object) null);
        FilterChipPadding = PaddingKt.m33263PaddingValuesYgX7TsA$default(r0, 0.0f, 2, (Object) null);
        SuggestionChipPadding = PaddingKt.m33263PaddingValuesYgX7TsA$default(r0, 0.0f, 2, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0378  */
    /* JADX WARNING: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x011e  */
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void AssistChip(p404of.C13074a<p336ef.C11921v> r47, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r48, androidx.compose.p002ui.Modifier r49, boolean r50, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r51, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r52, androidx.compose.p002ui.graphics.Shape r53, androidx.compose.material3.ChipColors r54, androidx.compose.material3.ChipElevation r55, androidx.compose.material3.ChipBorder r56, androidx.compose.foundation.interaction.MutableInteractionSource r57, androidx.compose.runtime.Composer r58, int r59, int r60, int r61) {
        /*
            r15 = r47
            r12 = r48
            r11 = r59
            r10 = r61
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C12775o.m28639i(r15, r0)
            java.lang.String r0 = "label"
            kotlin.jvm.internal.C12775o.m28639i(r12, r0)
            r0 = -1932300596(0xffffffff8cd36ecc, float:-3.257638E-31)
            r1 = r58
            androidx.compose.runtime.Composer r14 = r1.startRestartGroup(r0)
            r1 = r10 & 1
            if (r1 == 0) goto L_0x0022
            r1 = r11 | 6
            goto L_0x0032
        L_0x0022:
            r1 = r11 & 14
            if (r1 != 0) goto L_0x0031
            boolean r1 = r14.changed((java.lang.Object) r15)
            if (r1 == 0) goto L_0x002e
            r1 = 4
            goto L_0x002f
        L_0x002e:
            r1 = 2
        L_0x002f:
            r1 = r1 | r11
            goto L_0x0032
        L_0x0031:
            r1 = r11
        L_0x0032:
            r4 = r10 & 2
            if (r4 == 0) goto L_0x0039
            r1 = r1 | 48
            goto L_0x0049
        L_0x0039:
            r4 = r11 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0049
            boolean r4 = r14.changed((java.lang.Object) r12)
            if (r4 == 0) goto L_0x0046
            r4 = 32
            goto L_0x0048
        L_0x0046:
            r4 = 16
        L_0x0048:
            r1 = r1 | r4
        L_0x0049:
            r4 = r10 & 4
            if (r4 == 0) goto L_0x0050
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x0050:
            r5 = r11 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0063
            r5 = r49
            boolean r6 = r14.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x005f
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r1 = r1 | r6
            goto L_0x0065
        L_0x0063:
            r5 = r49
        L_0x0065:
            r6 = r10 & 8
            if (r6 == 0) goto L_0x006c
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007f
        L_0x006c:
            r7 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x007f
            r7 = r50
            boolean r8 = r14.changed((boolean) r7)
            if (r8 == 0) goto L_0x007b
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r1 = r1 | r8
            goto L_0x0081
        L_0x007f:
            r7 = r50
        L_0x0081:
            r8 = r10 & 16
            r36 = 57344(0xe000, float:8.0356E-41)
            if (r8 == 0) goto L_0x008b
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009e
        L_0x008b:
            r9 = r11 & r36
            if (r9 != 0) goto L_0x009e
            r9 = r51
            boolean r13 = r14.changed((java.lang.Object) r9)
            if (r13 == 0) goto L_0x009a
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r1 = r1 | r13
            goto L_0x00a0
        L_0x009e:
            r9 = r51
        L_0x00a0:
            r13 = r10 & 32
            if (r13 == 0) goto L_0x00ab
            r16 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r16
            r2 = r52
            goto L_0x00c0
        L_0x00ab:
            r16 = 458752(0x70000, float:6.42848E-40)
            r16 = r11 & r16
            r2 = r52
            if (r16 != 0) goto L_0x00c0
            boolean r16 = r14.changed((java.lang.Object) r2)
            if (r16 == 0) goto L_0x00bc
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00be
        L_0x00bc:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00be:
            r1 = r1 | r16
        L_0x00c0:
            r37 = 3670016(0x380000, float:5.142788E-39)
            r16 = r11 & r37
            if (r16 != 0) goto L_0x00da
            r16 = r10 & 64
            r0 = r53
            if (r16 != 0) goto L_0x00d5
            boolean r16 = r14.changed((java.lang.Object) r0)
            if (r16 == 0) goto L_0x00d5
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d7
        L_0x00d5:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d7:
            r1 = r1 | r16
            goto L_0x00dc
        L_0x00da:
            r0 = r53
        L_0x00dc:
            r38 = 29360128(0x1c00000, float:7.052966E-38)
            r16 = r11 & r38
            if (r16 != 0) goto L_0x00f8
            r3 = r10 & 128(0x80, float:1.794E-43)
            if (r3 != 0) goto L_0x00f1
            r3 = r54
            boolean r17 = r14.changed((java.lang.Object) r3)
            if (r17 == 0) goto L_0x00f3
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f5
        L_0x00f1:
            r3 = r54
        L_0x00f3:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f5:
            r1 = r1 | r17
            goto L_0x00fa
        L_0x00f8:
            r3 = r54
        L_0x00fa:
            r39 = 234881024(0xe000000, float:1.5777218E-30)
            r17 = r11 & r39
            if (r17 != 0) goto L_0x0116
            r0 = r10 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x010f
            r0 = r55
            boolean r17 = r14.changed((java.lang.Object) r0)
            if (r17 == 0) goto L_0x0111
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0113
        L_0x010f:
            r0 = r55
        L_0x0111:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0113:
            r1 = r1 | r17
            goto L_0x0118
        L_0x0116:
            r0 = r55
        L_0x0118:
            r40 = 1879048192(0x70000000, float:1.58456325E29)
            r17 = r11 & r40
            if (r17 != 0) goto L_0x0134
            r0 = r10 & 512(0x200, float:7.175E-43)
            if (r0 != 0) goto L_0x012d
            r0 = r56
            boolean r17 = r14.changed((java.lang.Object) r0)
            if (r17 == 0) goto L_0x012f
            r17 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0131
        L_0x012d:
            r0 = r56
        L_0x012f:
            r17 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0131:
            r1 = r1 | r17
            goto L_0x0136
        L_0x0134:
            r0 = r56
        L_0x0136:
            r9 = r10 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x0141
            r17 = r60 | 6
            r41 = r9
        L_0x013e:
            r9 = r17
            goto L_0x0159
        L_0x0141:
            r17 = r60 & 14
            r41 = r9
            r9 = r57
            if (r17 != 0) goto L_0x0157
            boolean r17 = r14.changed((java.lang.Object) r9)
            if (r17 == 0) goto L_0x0152
            r17 = 4
            goto L_0x0154
        L_0x0152:
            r17 = 2
        L_0x0154:
            r17 = r60 | r17
            goto L_0x013e
        L_0x0157:
            r9 = r60
        L_0x0159:
            r17 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r0 = r1 & r17
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r2) goto L_0x0185
            r0 = r9 & 11
            r2 = 2
            if (r0 != r2) goto L_0x0185
            boolean r0 = r14.getSkipping()
            if (r0 != 0) goto L_0x016f
            goto L_0x0185
        L_0x016f:
            r14.skipToGroupEnd()
            r6 = r52
            r9 = r55
            r10 = r56
            r11 = r57
            r8 = r3
            r3 = r5
            r4 = r7
            r23 = r14
            r5 = r51
            r7 = r53
            goto L_0x0371
        L_0x0185:
            r14.startDefaults()
            r0 = r11 & 1
            r42 = 0
            r2 = 6
            if (r0 == 0) goto L_0x01cc
            boolean r0 = r14.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0196
            goto L_0x01cc
        L_0x0196:
            r14.skipToGroupEnd()
            r0 = r10 & 64
            if (r0 == 0) goto L_0x01a1
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r1 = r1 & r0
        L_0x01a1:
            r0 = r10 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x01a9
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r0
        L_0x01a9:
            r0 = r10 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x01b1
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r1 = r1 & r0
        L_0x01b1:
            r0 = r10 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x01b9
            r0 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r1 = r1 & r0
        L_0x01b9:
            r44 = r51
            r20 = r52
            r45 = r53
            r21 = r55
            r22 = r57
            r8 = r3
            r19 = r5
            r0 = r9
            r9 = r7
            r7 = r56
            goto L_0x02ac
        L_0x01cc:
            if (r4 == 0) goto L_0x01d1
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x01d2
        L_0x01d1:
            r0 = r5
        L_0x01d2:
            if (r6 == 0) goto L_0x01d8
            r4 = 1
            r43 = r4
            goto L_0x01da
        L_0x01d8:
            r43 = r7
        L_0x01da:
            if (r8 == 0) goto L_0x01df
            r44 = r42
            goto L_0x01e1
        L_0x01df:
            r44 = r51
        L_0x01e1:
            if (r13 == 0) goto L_0x01e6
            r13 = r42
            goto L_0x01e8
        L_0x01e6:
            r13 = r52
        L_0x01e8:
            r4 = r10 & 64
            if (r4 == 0) goto L_0x01f9
            androidx.compose.material3.AssistChipDefaults r4 = androidx.compose.material3.AssistChipDefaults.INSTANCE
            androidx.compose.ui.graphics.Shape r4 = r4.getShape(r14, r2)
            r5 = -3670017(0xffffffffffc7ffff, float:NaN)
            r1 = r1 & r5
            r45 = r4
            goto L_0x01fb
        L_0x01f9:
            r45 = r53
        L_0x01fb:
            r4 = r10 & 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x021f
            androidx.compose.material3.AssistChipDefaults r16 = androidx.compose.material3.AssistChipDefaults.INSTANCE
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r34 = 100663296(0x6000000, float:2.4074124E-35)
            r35 = 255(0xff, float:3.57E-43)
            r33 = r14
            androidx.compose.material3.ChipColors r3 = r16.m34258assistChipColorsoq7We08(r17, r19, r21, r23, r25, r27, r29, r31, r33, r34, r35)
            r4 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r4
        L_0x021f:
            r26 = r3
            r3 = r10 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x0246
            androidx.compose.material3.AssistChipDefaults r16 = androidx.compose.material3.AssistChipDefaults.INSTANCE
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 1572864(0x180000, float:2.204052E-39)
            r25 = 63
            r23 = r14
            androidx.compose.material3.ChipElevation r3 = r16.m34259assistChipElevationaqJV_2Y(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r4 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r1 = r1 & r4
            r17 = r1
            r16 = r3
            goto L_0x024a
        L_0x0246:
            r16 = r55
            r17 = r1
        L_0x024a:
            r1 = r10 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0270
            androidx.compose.material3.AssistChipDefaults r1 = androidx.compose.material3.AssistChipDefaults.INSTANCE
            r3 = 0
            r5 = 0
            r7 = 0
            r8 = 3072(0xc00, float:4.305E-42)
            r18 = 7
            r2 = r3
            r4 = r5
            r6 = r7
            r7 = r14
            r49 = r0
            r0 = r9
            r19 = r41
            r9 = r18
            androidx.compose.material3.ChipBorder r1 = r1.m34257assistChipBorderd_3_b6Q(r2, r4, r6, r7, r8, r9)
            r2 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r2 = r17 & r2
            r17 = r2
            goto L_0x0277
        L_0x0270:
            r49 = r0
            r0 = r9
            r19 = r41
            r1 = r56
        L_0x0277:
            if (r19 == 0) goto L_0x029d
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r14.startReplaceableGroup(r2)
            java.lang.Object r2 = r14.rememberedValue()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            if (r2 != r3) goto L_0x0292
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r14.updateRememberedValue(r2)
        L_0x0292:
            r14.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = (androidx.compose.foundation.interaction.MutableInteractionSource) r2
            r19 = r49
            r7 = r1
            r22 = r2
            goto L_0x02a2
        L_0x029d:
            r19 = r49
            r22 = r57
            r7 = r1
        L_0x02a2:
            r20 = r13
            r21 = r16
            r1 = r17
            r8 = r26
            r9 = r43
        L_0x02ac:
            r14.endDefaults()
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x02bd
            java.lang.String r2 = "androidx.compose.material3.AssistChip (Chip.kt:104)"
            r3 = -1932300596(0xffffffff8cd36ecc, float:-3.257638E-31)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r1, r0, r2)
        L_0x02bd:
            androidx.compose.material3.MaterialTheme r2 = androidx.compose.material3.MaterialTheme.INSTANCE
            r3 = 6
            androidx.compose.material3.Typography r2 = r2.getTypography(r14, r3)
            androidx.compose.material3.tokens.AssistChipTokens r3 = androidx.compose.material3.tokens.AssistChipTokens.INSTANCE
            androidx.compose.material3.tokens.TypographyKeyTokens r3 = r3.getLabelTextFont()
            androidx.compose.ui.text.TextStyle r4 = androidx.compose.material3.TypographyKt.fromToken(r2, r3)
            int r2 = r1 >> 9
            r2 = r2 & 14
            int r3 = r1 >> 18
            r3 = r3 & 112(0x70, float:1.57E-43)
            r3 = r3 | r2
            androidx.compose.runtime.State r3 = r8.labelColor$material3_release(r9, r14, r3)
            java.lang.Object r3 = r3.getValue()
            androidx.compose.ui.graphics.Color r3 = (androidx.compose.p002ui.graphics.Color) r3
            long r5 = r3.m35681unboximpl()
            if (r7 != 0) goto L_0x02ea
            r2 = r42
            goto L_0x02f3
        L_0x02ea:
            int r3 = r1 >> 24
            r3 = r3 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            androidx.compose.runtime.State r2 = r7.borderStroke$material3_release(r9, r14, r2)
        L_0x02f3:
            if (r2 == 0) goto L_0x02fd
            java.lang.Object r2 = r2.getValue()
            androidx.compose.foundation.BorderStroke r2 = (androidx.compose.foundation.BorderStroke) r2
            r42 = r2
        L_0x02fd:
            androidx.compose.material3.AssistChipDefaults r2 = androidx.compose.material3.AssistChipDefaults.INSTANCE
            float r13 = r2.m34262getHeightD9Ej5fM()
            androidx.compose.foundation.layout.PaddingValues r2 = AssistChipPadding
            r23 = r14
            r14 = r2
            int r2 = r1 >> 6
            r2 = r2 & 14
            int r3 = r1 << 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            int r3 = r1 >> 3
            r3 = r3 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            int r3 = r1 << 6
            r49 = r7
            r7 = r3 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r7
            r7 = r3 & r37
            r2 = r2 | r7
            r7 = r3 & r38
            r2 = r2 | r7
            r7 = r3 & r39
            r2 = r2 | r7
            r3 = r3 & r40
            r17 = r2 | r3
            int r1 = r1 >> 24
            r1 = r1 & 14
            r1 = r1 | 3456(0xd80, float:4.843E-42)
            int r0 = r0 << 12
            r0 = r0 & r36
            r18 = r1 | r0
            r0 = r19
            r1 = r47
            r2 = r9
            r3 = r48
            r24 = r49
            r7 = r44
            r26 = r8
            r8 = r20
            r43 = r9
            r9 = r45
            r10 = r26
            r11 = r21
            r12 = r42
            r15 = r22
            r16 = r23
            m34290ChipnkUnTEs(r0, r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x035f
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x035f:
            r3 = r19
            r6 = r20
            r9 = r21
            r11 = r22
            r10 = r24
            r8 = r26
            r4 = r43
            r5 = r44
            r7 = r45
        L_0x0371:
            androidx.compose.runtime.ScopeUpdateScope r15 = r23.endRestartGroup()
            if (r15 != 0) goto L_0x0378
            goto L_0x038f
        L_0x0378:
            androidx.compose.material3.ChipKt$AssistChip$2 r14 = new androidx.compose.material3.ChipKt$AssistChip$2
            r0 = r14
            r1 = r47
            r2 = r48
            r12 = r59
            r13 = r60
            r46 = r14
            r14 = r61
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r46
            r15.updateScope(r0)
        L_0x038f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.AssistChip(of.a, of.o, androidx.compose.ui.Modifier, boolean, of.o, of.o, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.material3.ChipBorder, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* access modifiers changed from: private */
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Composable
    /* renamed from: Chip-nkUnTEs  reason: not valid java name */
    public static final void m34290ChipnkUnTEs(Modifier modifier, C13074a<C11921v> aVar, boolean z, C13088o<? super Composer, ? super Integer, C11921v> oVar, TextStyle textStyle, long j, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar3, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, float f, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2) {
        int i3;
        int i4;
        Composer composer2;
        float f2;
        State<C1232Dp> state;
        float f3;
        boolean z2 = z;
        ChipColors chipColors2 = chipColors;
        ChipElevation chipElevation2 = chipElevation;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        int i5 = i;
        int i6 = i2;
        Composer startRestartGroup = composer.startRestartGroup(1400504719);
        int i7 = 4;
        Modifier modifier2 = modifier;
        if ((i5 & 14) == 0) {
            i3 = (startRestartGroup.changed((Object) modifier2) ? 4 : 2) | i5;
        } else {
            i3 = i5;
        }
        int i8 = 32;
        C13074a<C11921v> aVar2 = aVar;
        if ((i5 & 112) == 0) {
            i3 |= startRestartGroup.changed((Object) aVar2) ? 32 : 16;
        }
        int i9 = 256;
        if ((i5 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 256 : 128;
        }
        int i10 = 2048;
        if ((i5 & 7168) == 0) {
            i3 |= startRestartGroup.changed((Object) oVar) ? 2048 : 1024;
        } else {
            C13088o<? super Composer, ? super Integer, C11921v> oVar4 = oVar;
        }
        int i11 = 16384;
        TextStyle textStyle2 = textStyle;
        if ((i5 & 57344) == 0) {
            i3 |= startRestartGroup.changed((Object) textStyle2) ? 16384 : 8192;
        }
        long j2 = j;
        if ((i5 & 458752) == 0) {
            i3 |= startRestartGroup.changed(j2) ? 131072 : 65536;
        }
        C13088o<? super Composer, ? super Integer, C11921v> oVar5 = oVar2;
        if ((i5 & 3670016) == 0) {
            i3 |= startRestartGroup.changed((Object) oVar5) ? 1048576 : 524288;
        }
        if ((29360128 & i5) == 0) {
            i3 |= startRestartGroup.changed((Object) oVar3) ? 8388608 : 4194304;
        } else {
            C13088o<? super Composer, ? super Integer, C11921v> oVar6 = oVar3;
        }
        Shape shape2 = shape;
        if ((i5 & 234881024) == 0) {
            i3 |= startRestartGroup.changed((Object) shape2) ? 67108864 : 33554432;
        }
        if ((i5 & 1879048192) == 0) {
            i3 |= startRestartGroup.changed((Object) chipColors2) ? 536870912 : 268435456;
        }
        if ((i6 & 14) == 0) {
            if (!startRestartGroup.changed((Object) chipElevation2)) {
                i7 = 2;
            }
            i4 = i7 | i6;
        } else {
            i4 = i6;
        }
        if ((i6 & 112) == 0) {
            if (!startRestartGroup.changed((Object) borderStroke)) {
                i8 = 16;
            }
            i4 |= i8;
        } else {
            BorderStroke borderStroke2 = borderStroke;
        }
        float f4 = f;
        if ((i6 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 0) {
            if (!startRestartGroup.changed(f4)) {
                i9 = 128;
            }
            i4 |= i9;
        }
        if ((i6 & 7168) == 0) {
            if (!startRestartGroup.changed((Object) paddingValues)) {
                i10 = 1024;
            }
            i4 |= i10;
        } else {
            PaddingValues paddingValues2 = paddingValues;
        }
        if ((i6 & 57344) == 0) {
            if (!startRestartGroup.changed((Object) mutableInteractionSource2)) {
                i11 = 8192;
            }
            i4 |= i11;
        }
        if ((i3 & 1533916891) == 306783378 && (46811 & i4) == 9362 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1400504719, i3, i4, "androidx.compose.material3.Chip (Chip.kt:1308)");
            }
            int i12 = (i3 >> 6) & 14;
            long r17 = chipColors2.containerColor$material3_release(z2, startRestartGroup, ((i3 >> 24) & 112) | i12).getValue().m35681unboximpl();
            startRestartGroup.startReplaceableGroup(64019101);
            State<C1232Dp> state2 = chipElevation2 == null ? null : chipElevation2.tonalElevation$material3_release(z2, mutableInteractionSource2, startRestartGroup, i12 | ((i4 >> 9) & 112) | ((i4 << 6) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH));
            startRestartGroup.endReplaceableGroup();
            int i13 = i3;
            if (state2 != null) {
                f2 = state2.getValue().m38482unboximpl();
            } else {
                f2 = C1232Dp.m38468constructorimpl((float) 0);
            }
            float f5 = f2;
            if (chipElevation2 == null) {
                state = null;
            } else {
                state = chipElevation2.shadowElevation$material3_release(z2, mutableInteractionSource2, startRestartGroup, i12 | ((i4 >> 9) & 112) | ((i4 << 6) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH));
            }
            if (state != null) {
                f3 = state.getValue().m38482unboximpl();
            } else {
                f3 = C1232Dp.m38468constructorimpl((float) 0);
            }
            float f6 = f3;
            int i14 = i13;
            int i15 = i4;
            ChipKt$Chip$1 chipKt$Chip$1 = r0;
            Composer composer3 = startRestartGroup;
            ChipKt$Chip$1 chipKt$Chip$12 = new ChipKt$Chip$1(oVar, textStyle, j, oVar2, oVar3, chipColors, z, i14, f, paddingValues, i15);
            int i16 = i14;
            composer2 = composer3;
            SurfaceKt.m34605Surfaceo_FOJdg(aVar, modifier, z, shape, r17, 0, f5, f6, borderStroke, mutableInteractionSource, ComposableLambdaKt.composableLambda(composer3, -1985962652, true, chipKt$Chip$1), composer2, ((i16 >> 3) & 14) | ((i16 << 3) & 112) | (i16 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i16 >> 15) & 7168) | ((i15 << 21) & 234881024) | ((i15 << 15) & 1879048192), 6, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            ChipKt$Chip$2 chipKt$Chip$2 = r0;
            ChipKt$Chip$2 chipKt$Chip$22 = new ChipKt$Chip$2(modifier, aVar, z, oVar, textStyle, j, oVar2, oVar3, shape, chipColors, chipElevation, borderStroke, f, paddingValues, mutableInteractionSource, i, i2);
            endRestartGroup.updateScope(chipKt$Chip$2);
        }
    }

    /* access modifiers changed from: private */
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Composable
    /* renamed from: ChipContent-fe0OD_I  reason: not valid java name */
    public static final void m34291ChipContentfe0OD_I(C13088o<? super Composer, ? super Integer, C11921v> oVar, TextStyle textStyle, long j, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar3, C13088o<? super Composer, ? super Integer, C11921v> oVar4, long j2, long j3, float f, PaddingValues paddingValues, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        TextStyle textStyle2 = textStyle;
        int i14 = i;
        Composer startRestartGroup = composer.startRestartGroup(-782878228);
        if ((i14 & 14) == 0) {
            if (startRestartGroup.changed((Object) oVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i2 = i13 | i14;
        } else {
            C13088o<? super Composer, ? super Integer, C11921v> oVar5 = oVar;
            i2 = i14;
        }
        if ((i14 & 112) == 0) {
            if (startRestartGroup.changed((Object) textStyle2)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i2 |= i12;
        }
        if ((i14 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 0) {
            if (startRestartGroup.changed(j)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i2 |= i11;
        } else {
            long j4 = j;
        }
        if ((i14 & 7168) == 0) {
            if (startRestartGroup.changed((Object) oVar2)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i2 |= i10;
        } else {
            C13088o<? super Composer, ? super Integer, C11921v> oVar6 = oVar2;
        }
        if ((57344 & i14) == 0) {
            if (startRestartGroup.changed((Object) oVar3)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i2 |= i9;
        } else {
            C13088o<? super Composer, ? super Integer, C11921v> oVar7 = oVar3;
        }
        if ((458752 & i14) == 0) {
            if (startRestartGroup.changed((Object) oVar4)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i2 |= i8;
        } else {
            C13088o<? super Composer, ? super Integer, C11921v> oVar8 = oVar4;
        }
        if ((3670016 & i14) == 0) {
            if (startRestartGroup.changed(j2)) {
                i7 = 1048576;
            } else {
                i7 = 524288;
            }
            i2 |= i7;
        } else {
            long j5 = j2;
        }
        if ((29360128 & i14) == 0) {
            int i15 = i2;
            if (startRestartGroup.changed(j3)) {
                i6 = 8388608;
            } else {
                i6 = 4194304;
            }
            i3 = i15 | i6;
        } else {
            i3 = i2;
            long j6 = j3;
        }
        if ((234881024 & i14) == 0) {
            if (startRestartGroup.changed(f)) {
                i5 = 67108864;
            } else {
                i5 = 33554432;
            }
            i3 |= i5;
        } else {
            float f2 = f;
        }
        PaddingValues paddingValues2 = paddingValues;
        if ((i14 & 1879048192) == 0) {
            if (startRestartGroup.changed((Object) paddingValues2)) {
                i4 = 536870912;
            } else {
                i4 = 268435456;
            }
            i3 |= i4;
        }
        if ((i3 & 1533916891) != 306783378 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-782878228, i3, -1, "androidx.compose.material3.ChipContent (Chip.kt:1402)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m35661boximpl(j)), TextKt.getLocalTextStyle().provides(textStyle2)}, (C13088o<? super Composer, ? super Integer, C11921v>) ComposableLambdaKt.composableLambda(startRestartGroup, 1748799148, true, new ChipKt$ChipContent$1(f, paddingValues, oVar3, i3, oVar2, j2, oVar, oVar4, j3)), startRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            ChipKt$ChipContent$2 chipKt$ChipContent$2 = r0;
            ChipKt$ChipContent$2 chipKt$ChipContent$22 = new ChipKt$ChipContent$2(oVar, textStyle, j, oVar2, oVar3, oVar4, j2, j3, f, paddingValues, i);
            endRestartGroup.updateScope(chipKt$ChipContent$2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x036b  */
    /* JADX WARNING: Removed duplicated region for block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0127  */
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void ElevatedAssistChip(p404of.C13074a<p336ef.C11921v> r50, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r51, androidx.compose.p002ui.Modifier r52, boolean r53, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r54, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r55, androidx.compose.p002ui.graphics.Shape r56, androidx.compose.material3.ChipColors r57, androidx.compose.material3.ChipElevation r58, androidx.compose.material3.ChipBorder r59, androidx.compose.foundation.interaction.MutableInteractionSource r60, androidx.compose.runtime.Composer r61, int r62, int r63, int r64) {
        /*
            r15 = r50
            r14 = r51
            r13 = r62
            r12 = r64
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C12775o.m28639i(r15, r0)
            java.lang.String r0 = "label"
            kotlin.jvm.internal.C12775o.m28639i(r14, r0)
            r0 = 1295844802(0x4d3d05c2, float:1.98204448E8)
            r1 = r61
            androidx.compose.runtime.Composer r11 = r1.startRestartGroup(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0022
            r1 = r13 | 6
            goto L_0x0032
        L_0x0022:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x0031
            boolean r1 = r11.changed((java.lang.Object) r15)
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
            r4 = r12 & 2
            if (r4 == 0) goto L_0x0039
            r1 = r1 | 48
            goto L_0x0049
        L_0x0039:
            r4 = r13 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0049
            boolean r4 = r11.changed((java.lang.Object) r14)
            if (r4 == 0) goto L_0x0046
            r4 = 32
            goto L_0x0048
        L_0x0046:
            r4 = 16
        L_0x0048:
            r1 = r1 | r4
        L_0x0049:
            r4 = r12 & 4
            if (r4 == 0) goto L_0x0050
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x0050:
            r5 = r13 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0063
            r5 = r52
            boolean r6 = r11.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x005f
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r1 = r1 | r6
            goto L_0x0065
        L_0x0063:
            r5 = r52
        L_0x0065:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x006c
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007f
        L_0x006c:
            r7 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x007f
            r7 = r53
            boolean r8 = r11.changed((boolean) r7)
            if (r8 == 0) goto L_0x007b
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r1 = r1 | r8
            goto L_0x0081
        L_0x007f:
            r7 = r53
        L_0x0081:
            r8 = r12 & 16
            r36 = 57344(0xe000, float:8.0356E-41)
            if (r8 == 0) goto L_0x008b
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009e
        L_0x008b:
            r9 = r13 & r36
            if (r9 != 0) goto L_0x009e
            r9 = r54
            boolean r10 = r11.changed((java.lang.Object) r9)
            if (r10 == 0) goto L_0x009a
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r1 = r1 | r10
            goto L_0x00a0
        L_0x009e:
            r9 = r54
        L_0x00a0:
            r10 = r12 & 32
            if (r10 == 0) goto L_0x00ab
            r16 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r16
            r2 = r55
            goto L_0x00c0
        L_0x00ab:
            r16 = 458752(0x70000, float:6.42848E-40)
            r16 = r13 & r16
            r2 = r55
            if (r16 != 0) goto L_0x00c0
            boolean r16 = r11.changed((java.lang.Object) r2)
            if (r16 == 0) goto L_0x00bc
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00be
        L_0x00bc:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00be:
            r1 = r1 | r16
        L_0x00c0:
            r37 = 3670016(0x380000, float:5.142788E-39)
            r16 = r13 & r37
            if (r16 != 0) goto L_0x00da
            r16 = r12 & 64
            r0 = r56
            if (r16 != 0) goto L_0x00d5
            boolean r16 = r11.changed((java.lang.Object) r0)
            if (r16 == 0) goto L_0x00d5
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d7
        L_0x00d5:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d7:
            r1 = r1 | r16
            goto L_0x00dc
        L_0x00da:
            r0 = r56
        L_0x00dc:
            r38 = 29360128(0x1c00000, float:7.052966E-38)
            r16 = r13 & r38
            if (r16 != 0) goto L_0x00f8
            r3 = r12 & 128(0x80, float:1.794E-43)
            if (r3 != 0) goto L_0x00f1
            r3 = r57
            boolean r17 = r11.changed((java.lang.Object) r3)
            if (r17 == 0) goto L_0x00f3
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f5
        L_0x00f1:
            r3 = r57
        L_0x00f3:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f5:
            r1 = r1 | r17
            goto L_0x00fa
        L_0x00f8:
            r3 = r57
        L_0x00fa:
            r39 = 234881024(0xe000000, float:1.5777218E-30)
            r17 = r13 & r39
            if (r17 != 0) goto L_0x0116
            r0 = r12 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x010f
            r0 = r58
            boolean r17 = r11.changed((java.lang.Object) r0)
            if (r17 == 0) goto L_0x0111
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0113
        L_0x010f:
            r0 = r58
        L_0x0111:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0113:
            r1 = r1 | r17
            goto L_0x0118
        L_0x0116:
            r0 = r58
        L_0x0118:
            r9 = r12 & 512(0x200, float:7.175E-43)
            r40 = 1879048192(0x70000000, float:1.58456325E29)
            if (r9 == 0) goto L_0x0127
            r17 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r17
            r41 = r9
            r9 = r59
            goto L_0x013c
        L_0x0127:
            r17 = r13 & r40
            r41 = r9
            r9 = r59
            if (r17 != 0) goto L_0x013c
            boolean r17 = r11.changed((java.lang.Object) r9)
            if (r17 == 0) goto L_0x0138
            r17 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013a
        L_0x0138:
            r17 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013a:
            r1 = r1 | r17
        L_0x013c:
            r9 = r12 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x0147
            r17 = r63 | 6
            r42 = r9
        L_0x0144:
            r9 = r17
            goto L_0x015f
        L_0x0147:
            r17 = r63 & 14
            r42 = r9
            r9 = r60
            if (r17 != 0) goto L_0x015d
            boolean r17 = r11.changed((java.lang.Object) r9)
            if (r17 == 0) goto L_0x0158
            r17 = 4
            goto L_0x015a
        L_0x0158:
            r17 = 2
        L_0x015a:
            r17 = r63 | r17
            goto L_0x0144
        L_0x015d:
            r9 = r63
        L_0x015f:
            r17 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r0 = r1 & r17
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r2) goto L_0x018b
            r0 = r9 & 11
            r2 = 2
            if (r0 != r2) goto L_0x018b
            boolean r0 = r11.getSkipping()
            if (r0 != 0) goto L_0x0175
            goto L_0x018b
        L_0x0175:
            r11.skipToGroupEnd()
            r6 = r55
            r9 = r58
            r10 = r59
            r8 = r3
            r3 = r5
            r4 = r7
            r25 = r11
            r5 = r54
            r7 = r56
            r11 = r60
            goto L_0x0364
        L_0x018b:
            r11.startDefaults()
            r0 = r13 & 1
            r2 = -3670017(0xffffffffffc7ffff, float:NaN)
            r43 = 0
            r61 = r9
            r9 = 6
            if (r0 == 0) goto L_0x01cd
            boolean r0 = r11.getDefaultsInvalid()
            if (r0 == 0) goto L_0x01a1
            goto L_0x01cd
        L_0x01a1:
            r11.skipToGroupEnd()
            r0 = r12 & 64
            if (r0 == 0) goto L_0x01a9
            r1 = r1 & r2
        L_0x01a9:
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x01b1
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r0
        L_0x01b1:
            r0 = r12 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x01b9
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r1 = r1 & r0
        L_0x01b9:
            r45 = r54
            r46 = r55
            r47 = r56
            r20 = r58
            r8 = r59
            r21 = r60
            r48 = r61
            r9 = r3
            r19 = r5
            r10 = r7
            goto L_0x0290
        L_0x01cd:
            if (r4 == 0) goto L_0x01d2
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x01d3
        L_0x01d2:
            r0 = r5
        L_0x01d3:
            if (r6 == 0) goto L_0x01d9
            r4 = 1
            r44 = r4
            goto L_0x01db
        L_0x01d9:
            r44 = r7
        L_0x01db:
            if (r8 == 0) goto L_0x01e0
            r45 = r43
            goto L_0x01e2
        L_0x01e0:
            r45 = r54
        L_0x01e2:
            if (r10 == 0) goto L_0x01e7
            r46 = r43
            goto L_0x01e9
        L_0x01e7:
            r46 = r55
        L_0x01e9:
            r4 = r12 & 64
            if (r4 == 0) goto L_0x01f7
            androidx.compose.material3.AssistChipDefaults r4 = androidx.compose.material3.AssistChipDefaults.INSTANCE
            androidx.compose.ui.graphics.Shape r4 = r4.getShape(r11, r9)
            r1 = r1 & r2
            r47 = r4
            goto L_0x01f9
        L_0x01f7:
            r47 = r56
        L_0x01f9:
            r2 = r12 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x0222
            androidx.compose.material3.AssistChipDefaults r16 = androidx.compose.material3.AssistChipDefaults.INSTANCE
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r34 = 100663296(0x6000000, float:2.4074124E-35)
            r35 = 255(0xff, float:3.57E-43)
            r33 = r11
            androidx.compose.material3.ChipColors r2 = r16.m34260elevatedAssistChipColorsoq7We08(r17, r19, r21, r23, r25, r27, r29, r31, r33, r34, r35)
            r3 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r3
            r17 = r1
            r16 = r2
            goto L_0x0226
        L_0x0222:
            r17 = r1
            r16 = r3
        L_0x0226:
            r1 = r12 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x024c
            androidx.compose.material3.AssistChipDefaults r1 = androidx.compose.material3.AssistChipDefaults.INSTANCE
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r10 = 1572864(0x180000, float:2.204052E-39)
            r18 = 63
            r8 = r11
            r48 = r61
            r19 = r41
            r20 = r42
            r9 = r10
            r10 = r18
            androidx.compose.material3.ChipElevation r1 = r1.m34261elevatedAssistChipElevationaqJV_2Y(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r2 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r2 = r17 & r2
            r17 = r2
            goto L_0x0254
        L_0x024c:
            r48 = r61
            r19 = r41
            r20 = r42
            r1 = r58
        L_0x0254:
            if (r19 == 0) goto L_0x0259
            r2 = r43
            goto L_0x025b
        L_0x0259:
            r2 = r59
        L_0x025b:
            if (r20 == 0) goto L_0x0283
            r3 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.startReplaceableGroup(r3)
            java.lang.Object r3 = r11.rememberedValue()
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r4 = r4.getEmpty()
            if (r3 != r4) goto L_0x0276
            androidx.compose.foundation.interaction.MutableInteractionSource r3 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r11.updateRememberedValue(r3)
        L_0x0276:
            r11.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r3 = (androidx.compose.foundation.interaction.MutableInteractionSource) r3
            r19 = r0
            r20 = r1
            r8 = r2
            r21 = r3
            goto L_0x028a
        L_0x0283:
            r21 = r60
            r19 = r0
            r20 = r1
            r8 = r2
        L_0x028a:
            r9 = r16
            r1 = r17
            r10 = r44
        L_0x0290:
            r11.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x02a4
            java.lang.String r0 = "androidx.compose.material3.ElevatedAssistChip (Chip.kt:176)"
            r2 = r48
            r3 = 1295844802(0x4d3d05c2, float:1.98204448E8)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r1, r2, r0)
            goto L_0x02a6
        L_0x02a4:
            r2 = r48
        L_0x02a6:
            androidx.compose.material3.MaterialTheme r0 = androidx.compose.material3.MaterialTheme.INSTANCE
            r3 = 6
            androidx.compose.material3.Typography r0 = r0.getTypography(r11, r3)
            androidx.compose.material3.tokens.AssistChipTokens r3 = androidx.compose.material3.tokens.AssistChipTokens.INSTANCE
            androidx.compose.material3.tokens.TypographyKeyTokens r3 = r3.getLabelTextFont()
            androidx.compose.ui.text.TextStyle r4 = androidx.compose.material3.TypographyKt.fromToken(r0, r3)
            int r0 = r1 >> 9
            r0 = r0 & 14
            int r3 = r1 >> 18
            r3 = r3 & 112(0x70, float:1.57E-43)
            r3 = r3 | r0
            androidx.compose.runtime.State r3 = r9.labelColor$material3_release(r10, r11, r3)
            java.lang.Object r3 = r3.getValue()
            androidx.compose.ui.graphics.Color r3 = (androidx.compose.p002ui.graphics.Color) r3
            long r5 = r3.m35681unboximpl()
            androidx.compose.material3.AssistChipDefaults r3 = androidx.compose.material3.AssistChipDefaults.INSTANCE
            float r16 = r3.m34262getHeightD9Ej5fM()
            androidx.compose.foundation.layout.PaddingValues r22 = AssistChipPadding
            r3 = -227039467(0xfffffffff277a715, float:-4.9052664E30)
            r11.startReplaceableGroup(r3)
            if (r8 != 0) goto L_0x02e1
            r0 = r43
            goto L_0x02ea
        L_0x02e1:
            int r3 = r1 >> 24
            r3 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            androidx.compose.runtime.State r0 = r8.borderStroke$material3_release(r10, r11, r0)
        L_0x02ea:
            r11.endReplaceableGroup()
            if (r0 == 0) goto L_0x02f7
            java.lang.Object r0 = r0.getValue()
            androidx.compose.foundation.BorderStroke r0 = (androidx.compose.foundation.BorderStroke) r0
            r43 = r0
        L_0x02f7:
            int r0 = r1 >> 6
            r0 = r0 & 14
            int r3 = r1 << 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            int r3 = r1 >> 3
            r3 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            int r3 = r1 << 6
            r7 = r3 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r7
            r7 = r3 & r37
            r0 = r0 | r7
            r7 = r3 & r38
            r0 = r0 | r7
            r7 = r3 & r39
            r0 = r0 | r7
            r3 = r3 & r40
            r17 = r0 | r3
            int r0 = r1 >> 24
            r0 = r0 & 14
            r0 = r0 | 3456(0xd80, float:4.843E-42)
            int r1 = r2 << 12
            r1 = r1 & r36
            r18 = r0 | r1
            r0 = r19
            r1 = r50
            r2 = r10
            r3 = r51
            r7 = r45
            r23 = r8
            r8 = r46
            r24 = r9
            r9 = r47
            r44 = r10
            r10 = r24
            r25 = r11
            r11 = r20
            r12 = r43
            r13 = r16
            r14 = r22
            r15 = r21
            r16 = r25
            m34290ChipnkUnTEs(r0, r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0352
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0352:
            r3 = r19
            r9 = r20
            r11 = r21
            r10 = r23
            r8 = r24
            r4 = r44
            r5 = r45
            r6 = r46
            r7 = r47
        L_0x0364:
            androidx.compose.runtime.ScopeUpdateScope r15 = r25.endRestartGroup()
            if (r15 != 0) goto L_0x036b
            goto L_0x0382
        L_0x036b:
            androidx.compose.material3.ChipKt$ElevatedAssistChip$2 r14 = new androidx.compose.material3.ChipKt$ElevatedAssistChip$2
            r0 = r14
            r1 = r50
            r2 = r51
            r12 = r62
            r13 = r63
            r49 = r14
            r14 = r64
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r49
            r15.updateScope(r0)
        L_0x0382:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.ElevatedAssistChip(of.a, of.o, androidx.compose.ui.Modifier, boolean, of.o, of.o, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.material3.ChipBorder, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0399  */
    /* JADX WARNING: Removed duplicated region for block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0120  */
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void ElevatedFilterChip(boolean r57, p404of.C13074a<p336ef.C11921v> r58, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r59, androidx.compose.p002ui.Modifier r60, boolean r61, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r62, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r63, androidx.compose.p002ui.graphics.Shape r64, androidx.compose.material3.SelectableChipColors r65, androidx.compose.material3.SelectableChipElevation r66, androidx.compose.material3.SelectableChipBorder r67, androidx.compose.foundation.interaction.MutableInteractionSource r68, androidx.compose.runtime.Composer r69, int r70, int r71, int r72) {
        /*
            r15 = r57
            r14 = r58
            r13 = r59
            r12 = r70
            r11 = r72
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C12775o.m28639i(r14, r0)
            java.lang.String r0 = "label"
            kotlin.jvm.internal.C12775o.m28639i(r13, r0)
            r0 = 1904578605(0x7185902d, float:1.3227457E30)
            r1 = r69
            androidx.compose.runtime.Composer r10 = r1.startRestartGroup(r0)
            r1 = r11 & 1
            if (r1 == 0) goto L_0x0024
            r1 = r12 | 6
            goto L_0x0034
        L_0x0024:
            r1 = r12 & 14
            if (r1 != 0) goto L_0x0033
            boolean r1 = r10.changed((boolean) r15)
            if (r1 == 0) goto L_0x0030
            r1 = 4
            goto L_0x0031
        L_0x0030:
            r1 = 2
        L_0x0031:
            r1 = r1 | r12
            goto L_0x0034
        L_0x0033:
            r1 = r12
        L_0x0034:
            r4 = r11 & 2
            if (r4 == 0) goto L_0x003b
            r1 = r1 | 48
            goto L_0x004b
        L_0x003b:
            r4 = r12 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004b
            boolean r4 = r10.changed((java.lang.Object) r14)
            if (r4 == 0) goto L_0x0048
            r4 = 32
            goto L_0x004a
        L_0x0048:
            r4 = 16
        L_0x004a:
            r1 = r1 | r4
        L_0x004b:
            r4 = r11 & 4
            if (r4 == 0) goto L_0x0052
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0062
        L_0x0052:
            r4 = r12 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0062
            boolean r4 = r10.changed((java.lang.Object) r13)
            if (r4 == 0) goto L_0x005f
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r1 = r1 | r4
        L_0x0062:
            r4 = r11 & 8
            if (r4 == 0) goto L_0x0069
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007c
        L_0x0069:
            r7 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x007c
            r7 = r60
            boolean r8 = r10.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x0078
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0078:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r1 = r1 | r8
            goto L_0x007e
        L_0x007c:
            r7 = r60
        L_0x007e:
            r8 = r11 & 16
            r45 = 57344(0xe000, float:8.0356E-41)
            if (r8 == 0) goto L_0x0088
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009c
        L_0x0088:
            r9 = r12 & r45
            if (r9 != 0) goto L_0x009c
            r9 = r61
            boolean r16 = r10.changed((boolean) r9)
            if (r16 == 0) goto L_0x0097
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r1 = r1 | r16
            goto L_0x009e
        L_0x009c:
            r9 = r61
        L_0x009e:
            r16 = r11 & 32
            r46 = 458752(0x70000, float:6.42848E-40)
            if (r16 == 0) goto L_0x00ab
            r17 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r17
            r2 = r62
            goto L_0x00be
        L_0x00ab:
            r17 = r12 & r46
            r2 = r62
            if (r17 != 0) goto L_0x00be
            boolean r17 = r10.changed((java.lang.Object) r2)
            if (r17 == 0) goto L_0x00ba
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bc
        L_0x00ba:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00bc:
            r1 = r1 | r17
        L_0x00be:
            r17 = r11 & 64
            r47 = 3670016(0x380000, float:5.142788E-39)
            if (r17 == 0) goto L_0x00cb
            r18 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r18
            r3 = r63
            goto L_0x00de
        L_0x00cb:
            r18 = r12 & r47
            r3 = r63
            if (r18 != 0) goto L_0x00de
            boolean r19 = r10.changed((java.lang.Object) r3)
            if (r19 == 0) goto L_0x00da
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00dc
        L_0x00da:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00dc:
            r1 = r1 | r19
        L_0x00de:
            r19 = 29360128(0x1c00000, float:7.052966E-38)
            r19 = r12 & r19
            if (r19 != 0) goto L_0x00fa
            r5 = r11 & 128(0x80, float:1.794E-43)
            if (r5 != 0) goto L_0x00f3
            r5 = r64
            boolean r20 = r10.changed((java.lang.Object) r5)
            if (r20 == 0) goto L_0x00f5
            r20 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f7
        L_0x00f3:
            r5 = r64
        L_0x00f5:
            r20 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f7:
            r1 = r1 | r20
            goto L_0x00fc
        L_0x00fa:
            r5 = r64
        L_0x00fc:
            r20 = 234881024(0xe000000, float:1.5777218E-30)
            r20 = r12 & r20
            if (r20 != 0) goto L_0x0118
            r6 = r11 & 256(0x100, float:3.59E-43)
            if (r6 != 0) goto L_0x0111
            r6 = r65
            boolean r21 = r10.changed((java.lang.Object) r6)
            if (r21 == 0) goto L_0x0113
            r21 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0115
        L_0x0111:
            r6 = r65
        L_0x0113:
            r21 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0115:
            r1 = r1 | r21
            goto L_0x011a
        L_0x0118:
            r6 = r65
        L_0x011a:
            r21 = 1879048192(0x70000000, float:1.58456325E29)
            r21 = r12 & r21
            if (r21 != 0) goto L_0x0136
            r0 = r11 & 512(0x200, float:7.175E-43)
            if (r0 != 0) goto L_0x012f
            r0 = r66
            boolean r21 = r10.changed((java.lang.Object) r0)
            if (r21 == 0) goto L_0x0131
            r21 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0133
        L_0x012f:
            r0 = r66
        L_0x0131:
            r21 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0133:
            r1 = r1 | r21
            goto L_0x0138
        L_0x0136:
            r0 = r66
        L_0x0138:
            r9 = r11 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x0143
            r18 = r71 | 6
            r48 = r9
            r9 = r67
            goto L_0x015b
        L_0x0143:
            r21 = r71 & 14
            r48 = r9
            r9 = r67
            if (r21 != 0) goto L_0x0159
            boolean r21 = r10.changed((java.lang.Object) r9)
            if (r21 == 0) goto L_0x0154
            r18 = 4
            goto L_0x0156
        L_0x0154:
            r18 = 2
        L_0x0156:
            r18 = r71 | r18
            goto L_0x015b
        L_0x0159:
            r18 = r71
        L_0x015b:
            r9 = r11 & 2048(0x800, float:2.87E-42)
            if (r9 == 0) goto L_0x0164
            r18 = r18 | 48
            r69 = r9
            goto L_0x0179
        L_0x0164:
            r21 = r71 & 112(0x70, float:1.57E-43)
            r69 = r9
            r9 = r68
            if (r21 != 0) goto L_0x0179
            boolean r21 = r10.changed((java.lang.Object) r9)
            if (r21 == 0) goto L_0x0175
            r19 = 32
            goto L_0x0177
        L_0x0175:
            r19 = 16
        L_0x0177:
            r18 = r18 | r19
        L_0x0179:
            r9 = r18
            r18 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r0 = r1 & r18
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r2) goto L_0x01a7
            r0 = r9 & 91
            r2 = 18
            if (r0 != r2) goto L_0x01a7
            boolean r0 = r10.getSkipping()
            if (r0 != 0) goto L_0x0192
            goto L_0x01a7
        L_0x0192:
            r10.skipToGroupEnd()
            r11 = r67
            r12 = r68
            r8 = r5
            r9 = r6
            r4 = r7
            r25 = r10
            r5 = r61
            r6 = r62
            r10 = r66
            r7 = r3
            goto L_0x0392
        L_0x01a7:
            r10.startDefaults()
            r0 = r12 & 1
            r49 = 0
            r2 = 6
            if (r0 == 0) goto L_0x01ea
            boolean r0 = r10.getDefaultsInvalid()
            if (r0 == 0) goto L_0x01b8
            goto L_0x01ea
        L_0x01b8:
            r10.skipToGroupEnd()
            r0 = r11 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x01c3
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r0
        L_0x01c3:
            r0 = r11 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x01cb
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r1 = r1 & r0
        L_0x01cb:
            r0 = r11 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x01d3
            r0 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r1 = r1 & r0
        L_0x01d3:
            r51 = r62
            r21 = r66
            r22 = r68
            r52 = r3
            r53 = r5
            r20 = r6
            r19 = r7
            r54 = r9
            r14 = r10
            r10 = r61
            r9 = r67
            goto L_0x02c3
        L_0x01ea:
            if (r4 == 0) goto L_0x01ef
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x01f0
        L_0x01ef:
            r0 = r7
        L_0x01f0:
            if (r8 == 0) goto L_0x01f6
            r4 = 1
            r50 = r4
            goto L_0x01f8
        L_0x01f6:
            r50 = r61
        L_0x01f8:
            if (r16 == 0) goto L_0x01fd
            r51 = r49
            goto L_0x01ff
        L_0x01fd:
            r51 = r62
        L_0x01ff:
            if (r17 == 0) goto L_0x0204
            r52 = r49
            goto L_0x0206
        L_0x0204:
            r52 = r3
        L_0x0206:
            r3 = r11 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x0217
            androidx.compose.material3.FilterChipDefaults r3 = androidx.compose.material3.FilterChipDefaults.INSTANCE
            androidx.compose.ui.graphics.Shape r3 = r3.getShape(r10, r2)
            r4 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r4
            r53 = r3
            goto L_0x0219
        L_0x0217:
            r53 = r5
        L_0x0219:
            r3 = r11 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x024c
            androidx.compose.material3.FilterChipDefaults r16 = androidx.compose.material3.FilterChipDefaults.INSTANCE
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            r37 = 0
            r39 = 0
            r42 = 0
            r43 = 384(0x180, float:5.38E-43)
            r44 = 4095(0xfff, float:5.738E-42)
            r41 = r10
            androidx.compose.material3.SelectableChipColors r3 = r16.m34436elevatedFilterChipColorsXqyqHi0(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r42, r43, r44)
            r4 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r1 = r1 & r4
            r17 = r1
            r16 = r3
            goto L_0x0250
        L_0x024c:
            r17 = r1
            r16 = r6
        L_0x0250:
            r1 = r11 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x027e
            androidx.compose.material3.FilterChipDefaults r1 = androidx.compose.material3.FilterChipDefaults.INSTANCE
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r18 = 1572864(0x180000, float:2.204052E-39)
            r19 = 63
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r10
            r21 = r69
            r54 = r9
            r20 = r48
            r9 = r18
            r14 = r10
            r10 = r19
            androidx.compose.material3.SelectableChipElevation r1 = r1.m34437elevatedFilterChipElevationaqJV_2Y(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r2 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r2 = r17 & r2
            r17 = r2
            goto L_0x0287
        L_0x027e:
            r21 = r69
            r54 = r9
            r14 = r10
            r20 = r48
            r1 = r66
        L_0x0287:
            if (r20 == 0) goto L_0x028c
            r2 = r49
            goto L_0x028e
        L_0x028c:
            r2 = r67
        L_0x028e:
            if (r21 == 0) goto L_0x02b6
            r3 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r14.startReplaceableGroup(r3)
            java.lang.Object r3 = r14.rememberedValue()
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r4 = r4.getEmpty()
            if (r3 != r4) goto L_0x02a9
            androidx.compose.foundation.interaction.MutableInteractionSource r3 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r14.updateRememberedValue(r3)
        L_0x02a9:
            r14.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r3 = (androidx.compose.foundation.interaction.MutableInteractionSource) r3
            r19 = r0
            r21 = r1
            r9 = r2
            r22 = r3
            goto L_0x02bd
        L_0x02b6:
            r22 = r68
            r19 = r0
            r21 = r1
            r9 = r2
        L_0x02bd:
            r20 = r16
            r1 = r17
            r10 = r50
        L_0x02c3:
            r14.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x02d7
            java.lang.String r0 = "androidx.compose.material3.ElevatedFilterChip (Chip.kt:337)"
            r2 = r54
            r3 = 1904578605(0x7185902d, float:1.3227457E30)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r1, r2, r0)
            goto L_0x02d9
        L_0x02d7:
            r2 = r54
        L_0x02d9:
            androidx.compose.material3.MaterialTheme r0 = androidx.compose.material3.MaterialTheme.INSTANCE
            r3 = 6
            androidx.compose.material3.Typography r0 = r0.getTypography(r14, r3)
            androidx.compose.material3.tokens.FilterChipTokens r3 = androidx.compose.material3.tokens.FilterChipTokens.INSTANCE
            androidx.compose.material3.tokens.TypographyKeyTokens r3 = r3.getLabelTextFont()
            androidx.compose.ui.text.TextStyle r5 = androidx.compose.material3.TypographyKt.fromToken(r0, r3)
            androidx.compose.material3.FilterChipDefaults r0 = androidx.compose.material3.FilterChipDefaults.INSTANCE
            float r16 = r0.m34441getHeightD9Ej5fM()
            androidx.compose.foundation.layout.PaddingValues r23 = FilterChipPadding
            r0 = -790769726(0xffffffffd0ddcfc2, float:-2.97710428E10)
            r14.startReplaceableGroup(r0)
            if (r9 != 0) goto L_0x02fd
            r0 = r49
            goto L_0x030f
        L_0x02fd:
            int r0 = r1 >> 12
            r0 = r0 & 14
            int r3 = r1 << 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            int r3 = r2 << 6
            r3 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            androidx.compose.runtime.State r0 = r9.borderStroke$material3_release(r10, r15, r14, r0)
        L_0x030f:
            r14.endReplaceableGroup()
            if (r0 == 0) goto L_0x031c
            java.lang.Object r0 = r0.getValue()
            androidx.compose.foundation.BorderStroke r0 = (androidx.compose.foundation.BorderStroke) r0
            r49 = r0
        L_0x031c:
            r7 = 0
            r0 = r1 & 14
            r3 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r3
            int r3 = r1 >> 6
            r3 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            int r3 = r1 << 3
            r4 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 | r4
            int r4 = r1 >> 3
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r4
            int r4 = r1 << 6
            r6 = r4 & r45
            r0 = r0 | r6
            r3 = r3 & r47
            r0 = r0 | r3
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r4
            r0 = r0 | r3
            r3 = 1879048192(0x70000000, float:1.58456325E29)
            r3 = r3 & r4
            r17 = r0 | r3
            int r0 = r1 >> 24
            r1 = r0 & 14
            r1 = r1 | 27648(0x6c00, float:3.8743E-41)
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            int r1 = r2 << 12
            r1 = r1 & r46
            r18 = r0 | r1
            r0 = r57
            r1 = r19
            r2 = r58
            r3 = r10
            r4 = r59
            r6 = r51
            r8 = r52
            r24 = r9
            r9 = r53
            r50 = r10
            r10 = r20
            r11 = r21
            r12 = r49
            r13 = r16
            r25 = r14
            r14 = r23
            r15 = r22
            r16 = r25
            m34292SelectableChipu0RnIRE(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0380
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0380:
            r4 = r19
            r9 = r20
            r10 = r21
            r12 = r22
            r11 = r24
            r5 = r50
            r6 = r51
            r7 = r52
            r8 = r53
        L_0x0392:
            androidx.compose.runtime.ScopeUpdateScope r15 = r25.endRestartGroup()
            if (r15 != 0) goto L_0x0399
            goto L_0x03b6
        L_0x0399:
            androidx.compose.material3.ChipKt$ElevatedFilterChip$2 r14 = new androidx.compose.material3.ChipKt$ElevatedFilterChip$2
            r0 = r14
            r1 = r57
            r2 = r58
            r3 = r59
            r13 = r70
            r55 = r14
            r14 = r71
            r56 = r15
            r15 = r72
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r55
            r0 = r56
            r0.updateScope(r1)
        L_0x03b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.ElevatedFilterChip(boolean, of.a, of.o, androidx.compose.ui.Modifier, boolean, of.o, of.o, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SelectableChipColors, androidx.compose.material3.SelectableChipElevation, androidx.compose.material3.SelectableChipBorder, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x011c  */
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void ElevatedSuggestionChip(p404of.C13074a<p336ef.C11921v> r42, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r43, androidx.compose.p002ui.Modifier r44, boolean r45, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r46, androidx.compose.p002ui.graphics.Shape r47, androidx.compose.material3.ChipColors r48, androidx.compose.material3.ChipElevation r49, androidx.compose.material3.ChipBorder r50, androidx.compose.foundation.interaction.MutableInteractionSource r51, androidx.compose.runtime.Composer r52, int r53, int r54) {
        /*
            r15 = r42
            r14 = r43
            r13 = r53
            r12 = r54
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C12775o.m28639i(r15, r0)
            java.lang.String r0 = "label"
            kotlin.jvm.internal.C12775o.m28639i(r14, r0)
            r0 = 1668751803(0x637721bb, float:4.5587763E21)
            r1 = r52
            androidx.compose.runtime.Composer r11 = r1.startRestartGroup(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0022
            r1 = r13 | 6
            goto L_0x0032
        L_0x0022:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x0031
            boolean r1 = r11.changed((java.lang.Object) r15)
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
            goto L_0x0049
        L_0x0039:
            r2 = r13 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0049
            boolean r2 = r11.changed((java.lang.Object) r14)
            if (r2 == 0) goto L_0x0046
            r2 = 32
            goto L_0x0048
        L_0x0046:
            r2 = 16
        L_0x0048:
            r1 = r1 | r2
        L_0x0049:
            r2 = r12 & 4
            if (r2 == 0) goto L_0x0050
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x0050:
            r3 = r13 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0063
            r3 = r44
            boolean r4 = r11.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x005f
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r1 = r1 | r4
            goto L_0x0065
        L_0x0063:
            r3 = r44
        L_0x0065:
            r4 = r12 & 8
            if (r4 == 0) goto L_0x006c
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007f
        L_0x006c:
            r5 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x007f
            r5 = r45
            boolean r6 = r11.changed((boolean) r5)
            if (r6 == 0) goto L_0x007b
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r1 = r1 | r6
            goto L_0x0081
        L_0x007f:
            r5 = r45
        L_0x0081:
            r6 = r12 & 16
            r32 = 57344(0xe000, float:8.0356E-41)
            if (r6 == 0) goto L_0x008b
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009e
        L_0x008b:
            r7 = r13 & r32
            if (r7 != 0) goto L_0x009e
            r7 = r46
            boolean r8 = r11.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x009a
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r1 = r1 | r8
            goto L_0x00a0
        L_0x009e:
            r7 = r46
        L_0x00a0:
            r8 = 458752(0x70000, float:6.42848E-40)
            r8 = r8 & r13
            if (r8 != 0) goto L_0x00ba
            r8 = r12 & 32
            if (r8 != 0) goto L_0x00b4
            r8 = r47
            boolean r9 = r11.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x00b6
            r9 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b8
        L_0x00b4:
            r8 = r47
        L_0x00b6:
            r9 = 65536(0x10000, float:9.18355E-41)
        L_0x00b8:
            r1 = r1 | r9
            goto L_0x00bc
        L_0x00ba:
            r8 = r47
        L_0x00bc:
            r33 = 3670016(0x380000, float:5.142788E-39)
            r9 = r13 & r33
            if (r9 != 0) goto L_0x00d7
            r9 = r12 & 64
            if (r9 != 0) goto L_0x00d1
            r9 = r48
            boolean r10 = r11.changed((java.lang.Object) r9)
            if (r10 == 0) goto L_0x00d3
            r10 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d5
        L_0x00d1:
            r9 = r48
        L_0x00d3:
            r10 = 524288(0x80000, float:7.34684E-40)
        L_0x00d5:
            r1 = r1 | r10
            goto L_0x00d9
        L_0x00d7:
            r9 = r48
        L_0x00d9:
            r10 = 29360128(0x1c00000, float:7.052966E-38)
            r10 = r10 & r13
            if (r10 != 0) goto L_0x00f4
            r10 = r12 & 128(0x80, float:1.794E-43)
            if (r10 != 0) goto L_0x00ed
            r10 = r49
            boolean r16 = r11.changed((java.lang.Object) r10)
            if (r16 == 0) goto L_0x00ef
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f1
        L_0x00ed:
            r10 = r49
        L_0x00ef:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f1:
            r1 = r1 | r16
            goto L_0x00f6
        L_0x00f4:
            r10 = r49
        L_0x00f6:
            r0 = r12 & 256(0x100, float:3.59E-43)
            r34 = 234881024(0xe000000, float:1.5777218E-30)
            if (r0 == 0) goto L_0x0103
            r16 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r16
            r10 = r50
            goto L_0x0116
        L_0x0103:
            r16 = r13 & r34
            r10 = r50
            if (r16 != 0) goto L_0x0116
            boolean r16 = r11.changed((java.lang.Object) r10)
            if (r16 == 0) goto L_0x0112
            r16 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0114
        L_0x0112:
            r16 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0114:
            r1 = r1 | r16
        L_0x0116:
            r10 = r12 & 512(0x200, float:7.175E-43)
            r35 = 1879048192(0x70000000, float:1.58456325E29)
            if (r10 == 0) goto L_0x0125
            r16 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r16
            r52 = r10
            r10 = r51
            goto L_0x013a
        L_0x0125:
            r16 = r13 & r35
            r52 = r10
            r10 = r51
            if (r16 != 0) goto L_0x013a
            boolean r16 = r11.changed((java.lang.Object) r10)
            if (r16 == 0) goto L_0x0136
            r16 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0138
        L_0x0136:
            r16 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0138:
            r1 = r1 | r16
        L_0x013a:
            r16 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r3 = r1 & r16
            r5 = 306783378(0x12492492, float:6.3469493E-28)
            if (r3 != r5) goto L_0x015d
            boolean r3 = r11.getSkipping()
            if (r3 != 0) goto L_0x014b
            goto L_0x015d
        L_0x014b:
            r11.skipToGroupEnd()
            r3 = r44
            r4 = r45
            r5 = r7
            r6 = r8
            r7 = r9
            r24 = r11
            r8 = r49
            r9 = r50
            goto L_0x0314
        L_0x015d:
            r11.startDefaults()
            r3 = r13 & 1
            r36 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r5 = -3670017(0xffffffffffc7ffff, float:NaN)
            r16 = -458753(0xfffffffffff8ffff, float:NaN)
            r37 = 0
            r10 = 6
            if (r3 == 0) goto L_0x019c
            boolean r3 = r11.getDefaultsInvalid()
            if (r3 == 0) goto L_0x0177
            goto L_0x019c
        L_0x0177:
            r11.skipToGroupEnd()
            r0 = r12 & 32
            if (r0 == 0) goto L_0x0180
            r1 = r1 & r16
        L_0x0180:
            r0 = r12 & 64
            if (r0 == 0) goto L_0x0185
            r1 = r1 & r5
        L_0x0185:
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x018b
            r1 = r1 & r36
        L_0x018b:
            r38 = r44
            r19 = r49
            r20 = r51
            r40 = r7
            r41 = r8
            r12 = r10
            r10 = r45
            r7 = r50
            goto L_0x0247
        L_0x019c:
            if (r2 == 0) goto L_0x01a3
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.p002ui.Modifier.Companion
            r38 = r2
            goto L_0x01a5
        L_0x01a3:
            r38 = r44
        L_0x01a5:
            if (r4 == 0) goto L_0x01ab
            r2 = 1
            r39 = r2
            goto L_0x01ad
        L_0x01ab:
            r39 = r45
        L_0x01ad:
            if (r6 == 0) goto L_0x01b2
            r40 = r37
            goto L_0x01b4
        L_0x01b2:
            r40 = r7
        L_0x01b4:
            r2 = r12 & 32
            if (r2 == 0) goto L_0x01c3
            androidx.compose.material3.SuggestionChipDefaults r2 = androidx.compose.material3.SuggestionChipDefaults.INSTANCE
            androidx.compose.ui.graphics.Shape r2 = r2.getShape(r11, r10)
            r1 = r1 & r16
            r41 = r2
            goto L_0x01c5
        L_0x01c3:
            r41 = r8
        L_0x01c5:
            r2 = r12 & 64
            if (r2 == 0) goto L_0x01e7
            androidx.compose.material3.SuggestionChipDefaults r16 = androidx.compose.material3.SuggestionChipDefaults.INSTANCE
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r30 = 1572864(0x180000, float:2.204052E-39)
            r31 = 63
            r29 = r11
            androidx.compose.material3.ChipColors r2 = r16.m34595elevatedSuggestionChipColors5tl4gsc(r17, r19, r21, r23, r25, r27, r29, r30, r31)
            r1 = r1 & r5
            r17 = r1
            r16 = r2
            goto L_0x01eb
        L_0x01e7:
            r17 = r1
            r16 = r9
        L_0x01eb:
            r1 = r12 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x020a
            androidx.compose.material3.SuggestionChipDefaults r1 = androidx.compose.material3.SuggestionChipDefaults.INSTANCE
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 1572864(0x180000, float:2.204052E-39)
            r18 = 63
            r8 = r11
            r19 = r52
            r12 = r10
            r10 = r18
            androidx.compose.material3.ChipElevation r1 = r1.m34596elevatedSuggestionChipElevationaqJV_2Y(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r2 = r17 & r36
            r17 = r2
            goto L_0x020f
        L_0x020a:
            r19 = r52
            r12 = r10
            r1 = r49
        L_0x020f:
            if (r0 == 0) goto L_0x0214
            r0 = r37
            goto L_0x0216
        L_0x0214:
            r0 = r50
        L_0x0216:
            if (r19 == 0) goto L_0x023c
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.startReplaceableGroup(r2)
            java.lang.Object r2 = r11.rememberedValue()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            if (r2 != r3) goto L_0x0231
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r11.updateRememberedValue(r2)
        L_0x0231:
            r11.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = (androidx.compose.foundation.interaction.MutableInteractionSource) r2
            r7 = r0
            r19 = r1
            r20 = r2
            goto L_0x0241
        L_0x023c:
            r20 = r51
            r7 = r0
            r19 = r1
        L_0x0241:
            r9 = r16
            r1 = r17
            r10 = r39
        L_0x0247:
            r11.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0259
            r0 = -1
            java.lang.String r2 = "androidx.compose.material3.ElevatedSuggestionChip (Chip.kt:589)"
            r3 = 1668751803(0x637721bb, float:4.5587763E21)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r1, r0, r2)
        L_0x0259:
            androidx.compose.material3.MaterialTheme r0 = androidx.compose.material3.MaterialTheme.INSTANCE
            androidx.compose.material3.Typography r0 = r0.getTypography(r11, r12)
            androidx.compose.material3.tokens.SuggestionChipTokens r2 = androidx.compose.material3.tokens.SuggestionChipTokens.INSTANCE
            androidx.compose.material3.tokens.TypographyKeyTokens r2 = r2.getLabelTextFont()
            androidx.compose.ui.text.TextStyle r4 = androidx.compose.material3.TypographyKt.fromToken(r0, r2)
            int r0 = r1 >> 9
            r0 = r0 & 14
            int r2 = r1 >> 15
            r3 = r2 & 112(0x70, float:1.57E-43)
            r3 = r3 | r0
            androidx.compose.runtime.State r3 = r9.labelColor$material3_release(r10, r11, r3)
            java.lang.Object r3 = r3.getValue()
            androidx.compose.ui.graphics.Color r3 = (androidx.compose.p002ui.graphics.Color) r3
            long r5 = r3.m35681unboximpl()
            androidx.compose.material3.SuggestionChipDefaults r3 = androidx.compose.material3.SuggestionChipDefaults.INSTANCE
            float r16 = r3.m34597getHeightD9Ej5fM()
            androidx.compose.foundation.layout.PaddingValues r21 = SuggestionChipPadding
            r3 = -1455593643(0xffffffffa93d6755, float:-4.2056057E-14)
            r11.startReplaceableGroup(r3)
            if (r7 != 0) goto L_0x0293
            r0 = r37
            goto L_0x029c
        L_0x0293:
            int r3 = r1 >> 21
            r3 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            androidx.compose.runtime.State r0 = r7.borderStroke$material3_release(r10, r11, r0)
        L_0x029c:
            r11.endReplaceableGroup()
            if (r0 == 0) goto L_0x02a9
            java.lang.Object r0 = r0.getValue()
            androidx.compose.foundation.BorderStroke r0 = (androidx.compose.foundation.BorderStroke) r0
            r12 = r0
            goto L_0x02ab
        L_0x02a9:
            r12 = r37
        L_0x02ab:
            r8 = 0
            int r0 = r1 >> 6
            r0 = r0 & 14
            r3 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r3
            int r3 = r1 << 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            int r3 = r1 >> 3
            r3 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            int r3 = r1 << 6
            r8 = r3 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r8
            r3 = r3 & r33
            r0 = r0 | r3
            int r3 = r1 << 9
            r8 = r3 & r34
            r0 = r0 | r8
            r3 = r3 & r35
            r17 = r0 | r3
            int r0 = r1 >> 21
            r0 = r0 & 14
            r0 = r0 | 3456(0xd80, float:4.843E-42)
            r1 = r2 & r32
            r18 = r0 | r1
            r0 = r38
            r1 = r42
            r2 = r10
            r3 = r43
            r22 = r7
            r7 = r40
            r23 = r9
            r9 = r41
            r39 = r10
            r10 = r23
            r24 = r11
            r11 = r19
            r13 = r16
            r14 = r21
            r15 = r20
            r16 = r24
            r8 = 0
            m34290ChipnkUnTEs(r0, r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0304
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0304:
            r8 = r19
            r10 = r20
            r9 = r22
            r7 = r23
            r3 = r38
            r4 = r39
            r5 = r40
            r6 = r41
        L_0x0314:
            androidx.compose.runtime.ScopeUpdateScope r13 = r24.endRestartGroup()
            if (r13 != 0) goto L_0x031b
            goto L_0x032c
        L_0x031b:
            androidx.compose.material3.ChipKt$ElevatedSuggestionChip$2 r14 = new androidx.compose.material3.ChipKt$ElevatedSuggestionChip$2
            r0 = r14
            r1 = r42
            r2 = r43
            r11 = r53
            r12 = r54
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.updateScope(r14)
        L_0x032c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.ElevatedSuggestionChip(of.a, of.o, androidx.compose.ui.Modifier, boolean, of.o, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.material3.ChipBorder, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x03af  */
    /* JADX WARNING: Removed duplicated region for block: B:205:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0120  */
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void FilterChip(boolean r56, p404of.C13074a<p336ef.C11921v> r57, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r58, androidx.compose.p002ui.Modifier r59, boolean r60, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r61, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r62, androidx.compose.p002ui.graphics.Shape r63, androidx.compose.material3.SelectableChipColors r64, androidx.compose.material3.SelectableChipElevation r65, androidx.compose.material3.SelectableChipBorder r66, androidx.compose.foundation.interaction.MutableInteractionSource r67, androidx.compose.runtime.Composer r68, int r69, int r70, int r71) {
        /*
            r15 = r56
            r14 = r57
            r13 = r58
            r12 = r69
            r11 = r71
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C12775o.m28639i(r14, r0)
            java.lang.String r0 = "label"
            kotlin.jvm.internal.C12775o.m28639i(r13, r0)
            r0 = -1878072905(0xffffffff900ee1b7, float:-2.8178447E-29)
            r1 = r68
            androidx.compose.runtime.Composer r10 = r1.startRestartGroup(r0)
            r1 = r11 & 1
            if (r1 == 0) goto L_0x0024
            r1 = r12 | 6
            goto L_0x0034
        L_0x0024:
            r1 = r12 & 14
            if (r1 != 0) goto L_0x0033
            boolean r1 = r10.changed((boolean) r15)
            if (r1 == 0) goto L_0x0030
            r1 = 4
            goto L_0x0031
        L_0x0030:
            r1 = 2
        L_0x0031:
            r1 = r1 | r12
            goto L_0x0034
        L_0x0033:
            r1 = r12
        L_0x0034:
            r4 = r11 & 2
            if (r4 == 0) goto L_0x003b
            r1 = r1 | 48
            goto L_0x004b
        L_0x003b:
            r4 = r12 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004b
            boolean r4 = r10.changed((java.lang.Object) r14)
            if (r4 == 0) goto L_0x0048
            r4 = 32
            goto L_0x004a
        L_0x0048:
            r4 = 16
        L_0x004a:
            r1 = r1 | r4
        L_0x004b:
            r4 = r11 & 4
            if (r4 == 0) goto L_0x0052
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0062
        L_0x0052:
            r4 = r12 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0062
            boolean r4 = r10.changed((java.lang.Object) r13)
            if (r4 == 0) goto L_0x005f
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r1 = r1 | r4
        L_0x0062:
            r4 = r11 & 8
            if (r4 == 0) goto L_0x0069
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007c
        L_0x0069:
            r7 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x007c
            r7 = r59
            boolean r8 = r10.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x0078
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0078:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r1 = r1 | r8
            goto L_0x007e
        L_0x007c:
            r7 = r59
        L_0x007e:
            r8 = r11 & 16
            r45 = 57344(0xe000, float:8.0356E-41)
            if (r8 == 0) goto L_0x0088
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009c
        L_0x0088:
            r9 = r12 & r45
            if (r9 != 0) goto L_0x009c
            r9 = r60
            boolean r16 = r10.changed((boolean) r9)
            if (r16 == 0) goto L_0x0097
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r1 = r1 | r16
            goto L_0x009e
        L_0x009c:
            r9 = r60
        L_0x009e:
            r16 = r11 & 32
            r46 = 458752(0x70000, float:6.42848E-40)
            if (r16 == 0) goto L_0x00ab
            r17 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r17
            r2 = r61
            goto L_0x00be
        L_0x00ab:
            r17 = r12 & r46
            r2 = r61
            if (r17 != 0) goto L_0x00be
            boolean r17 = r10.changed((java.lang.Object) r2)
            if (r17 == 0) goto L_0x00ba
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bc
        L_0x00ba:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00bc:
            r1 = r1 | r17
        L_0x00be:
            r17 = r11 & 64
            r47 = 3670016(0x380000, float:5.142788E-39)
            if (r17 == 0) goto L_0x00cb
            r18 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r18
            r3 = r62
            goto L_0x00de
        L_0x00cb:
            r18 = r12 & r47
            r3 = r62
            if (r18 != 0) goto L_0x00de
            boolean r19 = r10.changed((java.lang.Object) r3)
            if (r19 == 0) goto L_0x00da
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00dc
        L_0x00da:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00dc:
            r1 = r1 | r19
        L_0x00de:
            r19 = 29360128(0x1c00000, float:7.052966E-38)
            r19 = r12 & r19
            if (r19 != 0) goto L_0x00fa
            r5 = r11 & 128(0x80, float:1.794E-43)
            if (r5 != 0) goto L_0x00f3
            r5 = r63
            boolean r20 = r10.changed((java.lang.Object) r5)
            if (r20 == 0) goto L_0x00f5
            r20 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f7
        L_0x00f3:
            r5 = r63
        L_0x00f5:
            r20 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f7:
            r1 = r1 | r20
            goto L_0x00fc
        L_0x00fa:
            r5 = r63
        L_0x00fc:
            r20 = 234881024(0xe000000, float:1.5777218E-30)
            r20 = r12 & r20
            if (r20 != 0) goto L_0x0118
            r6 = r11 & 256(0x100, float:3.59E-43)
            if (r6 != 0) goto L_0x0111
            r6 = r64
            boolean r21 = r10.changed((java.lang.Object) r6)
            if (r21 == 0) goto L_0x0113
            r21 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0115
        L_0x0111:
            r6 = r64
        L_0x0113:
            r21 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0115:
            r1 = r1 | r21
            goto L_0x011a
        L_0x0118:
            r6 = r64
        L_0x011a:
            r21 = 1879048192(0x70000000, float:1.58456325E29)
            r21 = r12 & r21
            if (r21 != 0) goto L_0x0136
            r0 = r11 & 512(0x200, float:7.175E-43)
            if (r0 != 0) goto L_0x012f
            r0 = r65
            boolean r21 = r10.changed((java.lang.Object) r0)
            if (r21 == 0) goto L_0x0131
            r21 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0133
        L_0x012f:
            r0 = r65
        L_0x0131:
            r21 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0133:
            r1 = r1 | r21
            goto L_0x0138
        L_0x0136:
            r0 = r65
        L_0x0138:
            r21 = r70 & 14
            if (r21 != 0) goto L_0x0152
            r0 = r11 & 1024(0x400, float:1.435E-42)
            if (r0 != 0) goto L_0x014b
            r0 = r66
            boolean r21 = r10.changed((java.lang.Object) r0)
            if (r21 == 0) goto L_0x014d
            r18 = 4
            goto L_0x014f
        L_0x014b:
            r0 = r66
        L_0x014d:
            r18 = 2
        L_0x014f:
            r18 = r70 | r18
            goto L_0x0156
        L_0x0152:
            r0 = r66
            r18 = r70
        L_0x0156:
            r9 = r11 & 2048(0x800, float:2.87E-42)
            if (r9 == 0) goto L_0x0163
            r18 = r18 | 48
            r68 = r9
            r48 = r18
            r9 = r67
            goto L_0x017a
        L_0x0163:
            r21 = r70 & 112(0x70, float:1.57E-43)
            r68 = r9
            r9 = r67
            if (r21 != 0) goto L_0x0178
            boolean r21 = r10.changed((java.lang.Object) r9)
            if (r21 == 0) goto L_0x0174
            r19 = 32
            goto L_0x0176
        L_0x0174:
            r19 = 16
        L_0x0176:
            r18 = r18 | r19
        L_0x0178:
            r48 = r18
        L_0x017a:
            r18 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r0 = r1 & r18
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r2) goto L_0x01a5
            r0 = r48 & 91
            r2 = 18
            if (r0 != r2) goto L_0x01a5
            boolean r0 = r10.getSkipping()
            if (r0 != 0) goto L_0x0191
            goto L_0x01a5
        L_0x0191:
            r10.skipToGroupEnd()
            r11 = r66
            r8 = r5
            r4 = r7
            r12 = r9
            r24 = r10
            r5 = r60
            r10 = r65
            r7 = r3
            r9 = r6
            r6 = r61
            goto L_0x03a8
        L_0x01a5:
            r10.startDefaults()
            r0 = r12 & 1
            r49 = 0
            r2 = 6
            if (r0 == 0) goto L_0x01ed
            boolean r0 = r10.getDefaultsInvalid()
            if (r0 == 0) goto L_0x01b6
            goto L_0x01ed
        L_0x01b6:
            r10.skipToGroupEnd()
            r0 = r11 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x01c1
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r0
        L_0x01c1:
            r0 = r11 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x01c9
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r1 = r1 & r0
        L_0x01c9:
            r0 = r11 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x01d1
            r0 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r1 = r1 & r0
        L_0x01d1:
            r0 = r11 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x01d7
            r48 = r48 & -15
        L_0x01d7:
            r51 = r61
            r20 = r65
            r8 = r66
            r52 = r3
            r53 = r5
            r30 = r6
            r19 = r7
            r21 = r9
            r0 = r48
            r9 = r60
            goto L_0x02de
        L_0x01ed:
            if (r4 == 0) goto L_0x01f2
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x01f3
        L_0x01f2:
            r0 = r7
        L_0x01f3:
            if (r8 == 0) goto L_0x01f9
            r4 = 1
            r50 = r4
            goto L_0x01fb
        L_0x01f9:
            r50 = r60
        L_0x01fb:
            if (r16 == 0) goto L_0x0200
            r51 = r49
            goto L_0x0202
        L_0x0200:
            r51 = r61
        L_0x0202:
            if (r17 == 0) goto L_0x0207
            r52 = r49
            goto L_0x0209
        L_0x0207:
            r52 = r3
        L_0x0209:
            r3 = r11 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x021a
            androidx.compose.material3.FilterChipDefaults r3 = androidx.compose.material3.FilterChipDefaults.INSTANCE
            androidx.compose.ui.graphics.Shape r3 = r3.getShape(r10, r2)
            r4 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r4
            r53 = r3
            goto L_0x021c
        L_0x021a:
            r53 = r5
        L_0x021c:
            r3 = r11 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x024f
            androidx.compose.material3.FilterChipDefaults r16 = androidx.compose.material3.FilterChipDefaults.INSTANCE
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            r37 = 0
            r39 = 0
            r42 = 0
            r43 = 384(0x180, float:5.38E-43)
            r44 = 4095(0xfff, float:5.738E-42)
            r41 = r10
            androidx.compose.material3.SelectableChipColors r3 = r16.m34439filterChipColorsXqyqHi0(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r42, r43, r44)
            r4 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r1 = r1 & r4
            r16 = r1
            r30 = r3
            goto L_0x0253
        L_0x024f:
            r16 = r1
            r30 = r6
        L_0x0253:
            r1 = r11 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x027c
            androidx.compose.material3.FilterChipDefaults r1 = androidx.compose.material3.FilterChipDefaults.INSTANCE
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r17 = 1572864(0x180000, float:2.204052E-39)
            r18 = 63
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r10
            r31 = r68
            r9 = r17
            r59 = r10
            r10 = r18
            androidx.compose.material3.SelectableChipElevation r1 = r1.m34440filterChipElevationaqJV_2Y(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r2 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r2 = r16 & r2
            goto L_0x0284
        L_0x027c:
            r31 = r68
            r59 = r10
            r1 = r65
            r2 = r16
        L_0x0284:
            r3 = r11 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x02a3
            androidx.compose.material3.FilterChipDefaults r16 = androidx.compose.material3.FilterChipDefaults.INSTANCE
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r28 = 1572864(0x180000, float:2.204052E-39)
            r29 = 63
            r27 = r59
            androidx.compose.material3.SelectableChipBorder r3 = r16.m34438filterChipBordergHcDVlo(r17, r19, r21, r23, r25, r26, r27, r28, r29)
            r48 = r48 & -15
            goto L_0x02a5
        L_0x02a3:
            r3 = r66
        L_0x02a5:
            if (r31 == 0) goto L_0x02d0
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10 = r59
            r10.startReplaceableGroup(r4)
            java.lang.Object r4 = r10.rememberedValue()
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r5 = r5.getEmpty()
            if (r4 != r5) goto L_0x02c2
            androidx.compose.foundation.interaction.MutableInteractionSource r4 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r10.updateRememberedValue(r4)
        L_0x02c2:
            r10.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r4 = (androidx.compose.foundation.interaction.MutableInteractionSource) r4
            r19 = r0
            r20 = r1
            r1 = r2
            r8 = r3
            r21 = r4
            goto L_0x02da
        L_0x02d0:
            r10 = r59
            r21 = r67
            r19 = r0
            r20 = r1
            r1 = r2
            r8 = r3
        L_0x02da:
            r0 = r48
            r9 = r50
        L_0x02de:
            r10.endDefaults()
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x02ef
            java.lang.String r2 = "androidx.compose.material3.FilterChip (Chip.kt:257)"
            r3 = -1878072905(0xffffffff900ee1b7, float:-2.8178447E-29)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r1, r0, r2)
        L_0x02ef:
            androidx.compose.material3.MaterialTheme r2 = androidx.compose.material3.MaterialTheme.INSTANCE
            r3 = 6
            androidx.compose.material3.Typography r2 = r2.getTypography(r10, r3)
            androidx.compose.material3.tokens.FilterChipTokens r3 = androidx.compose.material3.tokens.FilterChipTokens.INSTANCE
            androidx.compose.material3.tokens.TypographyKeyTokens r3 = r3.getLabelTextFont()
            androidx.compose.ui.text.TextStyle r5 = androidx.compose.material3.TypographyKt.fromToken(r2, r3)
            androidx.compose.material3.FilterChipDefaults r2 = androidx.compose.material3.FilterChipDefaults.INSTANCE
            float r16 = r2.m34441getHeightD9Ej5fM()
            androidx.compose.foundation.layout.PaddingValues r22 = FilterChipPadding
            r2 = 276171483(0x10760adb, float:4.8523308E-29)
            r10.startReplaceableGroup(r2)
            if (r8 != 0) goto L_0x0313
            r2 = r49
            goto L_0x0325
        L_0x0313:
            int r2 = r1 >> 12
            r2 = r2 & 14
            int r3 = r1 << 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            int r3 = r0 << 6
            r3 = r3 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            androidx.compose.runtime.State r2 = r8.borderStroke$material3_release(r9, r15, r10, r2)
        L_0x0325:
            r10.endReplaceableGroup()
            if (r2 == 0) goto L_0x0332
            java.lang.Object r2 = r2.getValue()
            androidx.compose.foundation.BorderStroke r2 = (androidx.compose.foundation.BorderStroke) r2
            r49 = r2
        L_0x0332:
            r7 = 0
            r2 = r1 & 14
            r3 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r2 | r3
            int r3 = r1 >> 6
            r3 = r3 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            int r3 = r1 << 3
            r4 = r3 & 896(0x380, float:1.256E-42)
            r2 = r2 | r4
            int r4 = r1 >> 3
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r4
            int r4 = r1 << 6
            r6 = r4 & r45
            r2 = r2 | r6
            r3 = r3 & r47
            r2 = r2 | r3
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r4
            r2 = r2 | r3
            r3 = 1879048192(0x70000000, float:1.58456325E29)
            r3 = r3 & r4
            r17 = r2 | r3
            int r1 = r1 >> 24
            r2 = r1 & 14
            r2 = r2 | 27648(0x6c00, float:3.8743E-41)
            r1 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            int r0 = r0 << 12
            r0 = r0 & r46
            r18 = r1 | r0
            r0 = r56
            r1 = r19
            r2 = r57
            r3 = r9
            r4 = r58
            r6 = r51
            r23 = r8
            r8 = r52
            r50 = r9
            r9 = r53
            r24 = r10
            r10 = r30
            r11 = r20
            r12 = r49
            r13 = r16
            r14 = r22
            r15 = r21
            r16 = r24
            m34292SelectableChipu0RnIRE(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0396
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0396:
            r4 = r19
            r10 = r20
            r12 = r21
            r11 = r23
            r9 = r30
            r5 = r50
            r6 = r51
            r7 = r52
            r8 = r53
        L_0x03a8:
            androidx.compose.runtime.ScopeUpdateScope r15 = r24.endRestartGroup()
            if (r15 != 0) goto L_0x03af
            goto L_0x03cc
        L_0x03af:
            androidx.compose.material3.ChipKt$FilterChip$2 r14 = new androidx.compose.material3.ChipKt$FilterChip$2
            r0 = r14
            r1 = r56
            r2 = r57
            r3 = r58
            r13 = r69
            r54 = r14
            r14 = r70
            r55 = r15
            r15 = r71
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r54
            r0 = r55
            r0.updateScope(r1)
        L_0x03cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.FilterChip(boolean, of.a, of.o, androidx.compose.ui.Modifier, boolean, of.o, of.o, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SelectableChipColors, androidx.compose.material3.SelectableChipElevation, androidx.compose.material3.SelectableChipBorder, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: androidx.compose.foundation.interaction.MutableInteractionSource} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0401  */
    /* JADX WARNING: Removed duplicated region for block: B:231:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0124  */
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void InputChip(boolean r51, p404of.C13074a<p336ef.C11921v> r52, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r53, androidx.compose.p002ui.Modifier r54, boolean r55, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r56, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r57, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r58, androidx.compose.p002ui.graphics.Shape r59, androidx.compose.material3.SelectableChipColors r60, androidx.compose.material3.SelectableChipElevation r61, androidx.compose.material3.SelectableChipBorder r62, androidx.compose.foundation.interaction.MutableInteractionSource r63, androidx.compose.runtime.Composer r64, int r65, int r66, int r67) {
        /*
            r15 = r51
            r13 = r52
            r12 = r53
            r11 = r65
            r10 = r66
            r9 = r67
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C12775o.m28639i(r13, r0)
            java.lang.String r0 = "label"
            kotlin.jvm.internal.C12775o.m28639i(r12, r0)
            r0 = -1599030387(0xffffffffa0b0bb8d, float:-2.993967E-19)
            r1 = r64
            androidx.compose.runtime.Composer r8 = r1.startRestartGroup(r0)
            r1 = r9 & 1
            if (r1 == 0) goto L_0x0026
            r1 = r11 | 6
            goto L_0x0036
        L_0x0026:
            r1 = r11 & 14
            if (r1 != 0) goto L_0x0035
            boolean r1 = r8.changed((boolean) r15)
            if (r1 == 0) goto L_0x0032
            r1 = 4
            goto L_0x0033
        L_0x0032:
            r1 = 2
        L_0x0033:
            r1 = r1 | r11
            goto L_0x0036
        L_0x0035:
            r1 = r11
        L_0x0036:
            r4 = r9 & 2
            if (r4 == 0) goto L_0x003d
            r1 = r1 | 48
            goto L_0x004d
        L_0x003d:
            r4 = r11 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004d
            boolean r4 = r8.changed((java.lang.Object) r13)
            if (r4 == 0) goto L_0x004a
            r4 = 32
            goto L_0x004c
        L_0x004a:
            r4 = 16
        L_0x004c:
            r1 = r1 | r4
        L_0x004d:
            r4 = r9 & 4
            if (r4 == 0) goto L_0x0054
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0064
        L_0x0054:
            r4 = r11 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0064
            boolean r4 = r8.changed((java.lang.Object) r12)
            if (r4 == 0) goto L_0x0061
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r1 = r1 | r4
        L_0x0064:
            r4 = r9 & 8
            if (r4 == 0) goto L_0x006b
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007f
        L_0x006b:
            r2 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x007f
            r2 = r54
            boolean r16 = r8.changed((java.lang.Object) r2)
            if (r16 == 0) goto L_0x007a
            r16 = 2048(0x800, float:2.87E-42)
            goto L_0x007c
        L_0x007a:
            r16 = 1024(0x400, float:1.435E-42)
        L_0x007c:
            r1 = r1 | r16
            goto L_0x0081
        L_0x007f:
            r2 = r54
        L_0x0081:
            r16 = r9 & 16
            r47 = 57344(0xe000, float:8.0356E-41)
            if (r16 == 0) goto L_0x008d
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r3 = r55
            goto L_0x00a0
        L_0x008d:
            r17 = r11 & r47
            r3 = r55
            if (r17 != 0) goto L_0x00a0
            boolean r18 = r8.changed((boolean) r3)
            if (r18 == 0) goto L_0x009c
            r18 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009c:
            r18 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r1 = r1 | r18
        L_0x00a0:
            r18 = r9 & 32
            if (r18 == 0) goto L_0x00ab
            r19 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r19
            r5 = r56
            goto L_0x00c0
        L_0x00ab:
            r19 = 458752(0x70000, float:6.42848E-40)
            r19 = r11 & r19
            r5 = r56
            if (r19 != 0) goto L_0x00c0
            boolean r20 = r8.changed((java.lang.Object) r5)
            if (r20 == 0) goto L_0x00bc
            r20 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00be
        L_0x00bc:
            r20 = 65536(0x10000, float:9.18355E-41)
        L_0x00be:
            r1 = r1 | r20
        L_0x00c0:
            r20 = r9 & 64
            if (r20 == 0) goto L_0x00cb
            r21 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r21
            r6 = r57
            goto L_0x00e0
        L_0x00cb:
            r21 = 3670016(0x380000, float:5.142788E-39)
            r21 = r11 & r21
            r6 = r57
            if (r21 != 0) goto L_0x00e0
            boolean r22 = r8.changed((java.lang.Object) r6)
            if (r22 == 0) goto L_0x00dc
            r22 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00de
        L_0x00dc:
            r22 = 524288(0x80000, float:7.34684E-40)
        L_0x00de:
            r1 = r1 | r22
        L_0x00e0:
            r7 = r9 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x00eb
            r23 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r23
            r14 = r58
            goto L_0x0100
        L_0x00eb:
            r23 = 29360128(0x1c00000, float:7.052966E-38)
            r23 = r11 & r23
            r14 = r58
            if (r23 != 0) goto L_0x0100
            boolean r24 = r8.changed((java.lang.Object) r14)
            if (r24 == 0) goto L_0x00fc
            r24 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fe
        L_0x00fc:
            r24 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fe:
            r1 = r1 | r24
        L_0x0100:
            r24 = 234881024(0xe000000, float:1.5777218E-30)
            r24 = r11 & r24
            if (r24 != 0) goto L_0x011c
            r0 = r9 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x0115
            r0 = r59
            boolean r24 = r8.changed((java.lang.Object) r0)
            if (r24 == 0) goto L_0x0117
            r24 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0119
        L_0x0115:
            r0 = r59
        L_0x0117:
            r24 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0119:
            r1 = r1 | r24
            goto L_0x011e
        L_0x011c:
            r0 = r59
        L_0x011e:
            r24 = 1879048192(0x70000000, float:1.58456325E29)
            r24 = r11 & r24
            if (r24 != 0) goto L_0x013a
            r0 = r9 & 512(0x200, float:7.175E-43)
            if (r0 != 0) goto L_0x0133
            r0 = r60
            boolean r24 = r8.changed((java.lang.Object) r0)
            if (r24 == 0) goto L_0x0135
            r24 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0137
        L_0x0133:
            r0 = r60
        L_0x0135:
            r24 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0137:
            r1 = r1 | r24
            goto L_0x013c
        L_0x013a:
            r0 = r60
        L_0x013c:
            r24 = r10 & 14
            if (r24 != 0) goto L_0x0156
            r0 = r9 & 1024(0x400, float:1.435E-42)
            if (r0 != 0) goto L_0x014f
            r0 = r61
            boolean r24 = r8.changed((java.lang.Object) r0)
            if (r24 == 0) goto L_0x0151
            r17 = 4
            goto L_0x0153
        L_0x014f:
            r0 = r61
        L_0x0151:
            r17 = 2
        L_0x0153:
            r17 = r10 | r17
            goto L_0x015a
        L_0x0156:
            r0 = r61
            r17 = r10
        L_0x015a:
            r24 = r10 & 112(0x70, float:1.57E-43)
            if (r24 != 0) goto L_0x0174
            r0 = r9 & 2048(0x800, float:2.87E-42)
            if (r0 != 0) goto L_0x016d
            r0 = r62
            boolean r24 = r8.changed((java.lang.Object) r0)
            if (r24 == 0) goto L_0x016f
            r19 = 32
            goto L_0x0171
        L_0x016d:
            r0 = r62
        L_0x016f:
            r19 = 16
        L_0x0171:
            r17 = r17 | r19
            goto L_0x0176
        L_0x0174:
            r0 = r62
        L_0x0176:
            r0 = r17
            r2 = r9 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x017f
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0193
        L_0x017f:
            r3 = r10 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0193
            r3 = r63
            boolean r17 = r8.changed((java.lang.Object) r3)
            if (r17 == 0) goto L_0x018e
            r22 = 256(0x100, float:3.59E-43)
            goto L_0x0190
        L_0x018e:
            r22 = 128(0x80, float:1.794E-43)
        L_0x0190:
            r0 = r0 | r22
            goto L_0x0195
        L_0x0193:
            r3 = r63
        L_0x0195:
            r17 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r3 = r1 & r17
            r5 = 306783378(0x12492492, float:6.3469493E-28)
            if (r3 != r5) goto L_0x01c5
            r3 = r0 & 731(0x2db, float:1.024E-42)
            r5 = 146(0x92, float:2.05E-43)
            if (r3 != r5) goto L_0x01c5
            boolean r3 = r8.getSkipping()
            if (r3 != 0) goto L_0x01ac
            goto L_0x01c5
        L_0x01ac:
            r8.skipToGroupEnd()
            r4 = r54
            r5 = r55
            r9 = r59
            r10 = r60
            r11 = r61
            r12 = r62
            r13 = r63
            r7 = r6
            r30 = r8
            r8 = r14
            r6 = r56
            goto L_0x03fa
        L_0x01c5:
            r8.startDefaults()
            r3 = r11 & 1
            if (r3 == 0) goto L_0x0206
            boolean r3 = r8.getDefaultsInvalid()
            if (r3 == 0) goto L_0x01d3
            goto L_0x0206
        L_0x01d3:
            r8.skipToGroupEnd()
            r2 = r9 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x01de
            r2 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r1 = r1 & r2
        L_0x01de:
            r2 = r9 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x01e6
            r2 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r1 = r1 & r2
        L_0x01e6:
            r2 = r9 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x01ec
            r0 = r0 & -15
        L_0x01ec:
            r2 = r9 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x01f2
            r0 = r0 & -113(0xffffffffffffff8f, float:NaN)
        L_0x01f2:
            r19 = r54
            r7 = r55
            r48 = r56
            r21 = r59
            r22 = r60
            r23 = r61
            r5 = r62
            r24 = r63
            r20 = r14
            goto L_0x02f0
        L_0x0206:
            if (r4 == 0) goto L_0x020b
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x020d
        L_0x020b:
            r3 = r54
        L_0x020d:
            if (r16 == 0) goto L_0x0211
            r4 = 1
            goto L_0x0213
        L_0x0211:
            r4 = r55
        L_0x0213:
            if (r18 == 0) goto L_0x0218
            r48 = 0
            goto L_0x021a
        L_0x0218:
            r48 = r56
        L_0x021a:
            if (r20 == 0) goto L_0x021d
            r6 = 0
        L_0x021d:
            if (r7 == 0) goto L_0x0220
            r14 = 0
        L_0x0220:
            r7 = r9 & 256(0x100, float:3.59E-43)
            if (r7 == 0) goto L_0x0230
            androidx.compose.material3.InputChipDefaults r7 = androidx.compose.material3.InputChipDefaults.INSTANCE
            r5 = 6
            androidx.compose.ui.graphics.Shape r7 = r7.getShape(r8, r5)
            r5 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r1 = r1 & r5
            goto L_0x0232
        L_0x0230:
            r7 = r59
        L_0x0232:
            r5 = r9 & 512(0x200, float:7.175E-43)
            if (r5 == 0) goto L_0x0264
            androidx.compose.material3.InputChipDefaults r16 = androidx.compose.material3.InputChipDefaults.INSTANCE
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            r37 = 0
            r39 = 0
            r41 = 0
            r44 = 0
            r45 = 3072(0xc00, float:4.305E-42)
            r46 = 8191(0x1fff, float:1.1478E-41)
            r43 = r8
            androidx.compose.material3.SelectableChipColors r5 = r16.m34472inputChipColorskwJvTHA(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r44, r45, r46)
            r16 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r1 = r1 & r16
            goto L_0x0266
        L_0x0264:
            r5 = r60
        L_0x0266:
            r54 = r1
            r1 = r9 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0287
            androidx.compose.material3.InputChipDefaults r16 = androidx.compose.material3.InputChipDefaults.INSTANCE
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 1572864(0x180000, float:2.204052E-39)
            r25 = 63
            r23 = r8
            androidx.compose.material3.SelectableChipElevation r1 = r16.m34473inputChipElevationaqJV_2Y(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r0 = r0 & -15
            goto L_0x0289
        L_0x0287:
            r1 = r61
        L_0x0289:
            r55 = r1
            r1 = r9 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x02aa
            androidx.compose.material3.InputChipDefaults r16 = androidx.compose.material3.InputChipDefaults.INSTANCE
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r28 = 1572864(0x180000, float:2.204052E-39)
            r29 = 63
            r27 = r8
            androidx.compose.material3.SelectableChipBorder r1 = r16.m34471inputChipBordergHcDVlo(r17, r19, r21, r23, r25, r26, r27, r28, r29)
            r0 = r0 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x02ac
        L_0x02aa:
            r1 = r62
        L_0x02ac:
            if (r2 == 0) goto L_0x02de
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r8.startReplaceableGroup(r2)
            java.lang.Object r2 = r8.rememberedValue()
            androidx.compose.runtime.Composer$Companion r16 = androidx.compose.runtime.Composer.Companion
            r56 = r0
            java.lang.Object r0 = r16.getEmpty()
            if (r2 != r0) goto L_0x02c9
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r8.updateRememberedValue(r2)
        L_0x02c9:
            r8.endReplaceableGroup()
            r0 = r2
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = (androidx.compose.foundation.interaction.MutableInteractionSource) r0
            r23 = r55
            r24 = r0
            r19 = r3
            r22 = r5
            r21 = r7
            r20 = r14
            r0 = r56
            goto L_0x02ec
        L_0x02de:
            r56 = r0
            r23 = r55
            r24 = r63
            r19 = r3
            r22 = r5
            r21 = r7
            r20 = r14
        L_0x02ec:
            r5 = r1
            r7 = r4
            r1 = r54
        L_0x02f0:
            r8.endDefaults()
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x0301
            java.lang.String r2 = "androidx.compose.material3.InputChip (Chip.kt:421)"
            r3 = -1599030387(0xffffffffa0b0bb8d, float:-2.993967E-19)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r1, r0, r2)
        L_0x0301:
            r2 = -1372002035(0xffffffffae38e90d, float:-4.2043747E-11)
            r8.startReplaceableGroup(r2)
            if (r6 == 0) goto L_0x032c
            if (r7 == 0) goto L_0x030e
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0311
        L_0x030e:
            r2 = 1052938076(0x3ec28f5c, float:0.38)
        L_0x0311:
            androidx.compose.material3.tokens.InputChipTokens r3 = androidx.compose.material3.tokens.InputChipTokens.INSTANCE
            androidx.compose.material3.tokens.ShapeKeyTokens r3 = r3.getAvatarShape()
            r4 = 6
            androidx.compose.ui.graphics.Shape r3 = androidx.compose.material3.ShapesKt.toShape(r3, r8, r4)
            androidx.compose.material3.ChipKt$InputChip$2 r14 = new androidx.compose.material3.ChipKt$InputChip$2
            r14.<init>(r2, r3, r6, r1)
            r2 = -352359235(0xffffffffeaff6cbd, float:-1.5439479E26)
            r3 = 1
            androidx.compose.runtime.internal.ComposableLambda r2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r8, r2, r3, r14)
            r16 = r2
            goto L_0x0330
        L_0x032c:
            r3 = 1
            r4 = 6
            r16 = 0
        L_0x0330:
            r8.endReplaceableGroup()
            androidx.compose.material3.MaterialTheme r2 = androidx.compose.material3.MaterialTheme.INSTANCE
            androidx.compose.material3.Typography r2 = r2.getTypography(r8, r4)
            androidx.compose.material3.tokens.InputChipTokens r4 = androidx.compose.material3.tokens.InputChipTokens.INSTANCE
            androidx.compose.material3.tokens.TypographyKeyTokens r4 = r4.getLabelTextFont()
            androidx.compose.ui.text.TextStyle r25 = androidx.compose.material3.TypographyKt.fromToken(r2, r4)
            if (r5 != 0) goto L_0x0347
            r2 = 0
            goto L_0x0359
        L_0x0347:
            int r2 = r1 >> 12
            r2 = r2 & 14
            int r4 = r1 << 3
            r4 = r4 & 112(0x70, float:1.57E-43)
            r2 = r2 | r4
            int r4 = r0 << 3
            r4 = r4 & 896(0x380, float:1.256E-42)
            r2 = r2 | r4
            androidx.compose.runtime.State r2 = r5.borderStroke$material3_release(r7, r15, r8, r2)
        L_0x0359:
            if (r2 == 0) goto L_0x0364
            java.lang.Object r2 = r2.getValue()
            androidx.compose.foundation.BorderStroke r2 = (androidx.compose.foundation.BorderStroke) r2
            r26 = r2
            goto L_0x0366
        L_0x0364:
            r26 = 0
        L_0x0366:
            androidx.compose.material3.InputChipDefaults r2 = androidx.compose.material3.InputChipDefaults.INSTANCE
            float r27 = r2.m34469getHeightD9Ej5fM()
            r2 = 0
            if (r16 == 0) goto L_0x0371
            r4 = r3
            goto L_0x0372
        L_0x0371:
            r4 = r2
        L_0x0372:
            if (r48 == 0) goto L_0x0376
            r14 = r3
            goto L_0x0377
        L_0x0376:
            r14 = r2
        L_0x0377:
            if (r20 == 0) goto L_0x037a
            r2 = r3
        L_0x037a:
            androidx.compose.foundation.layout.PaddingValues r14 = inputChipPadding(r4, r14, r2)
            r2 = r1 & 14
            int r3 = r1 >> 6
            r3 = r3 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            int r3 = r1 << 3
            r4 = r3 & 896(0x380, float:1.256E-42)
            r2 = r2 | r4
            int r4 = r1 >> 3
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r4
            int r4 = r1 << 6
            r4 = r4 & r47
            r2 = r2 | r4
            r4 = 3670016(0x380000, float:5.142788E-39)
            r4 = r4 & r3
            r2 = r2 | r4
            r4 = 234881024(0xe000000, float:1.5777218E-30)
            r4 = r4 & r3
            r2 = r2 | r4
            r4 = 1879048192(0x70000000, float:1.58456325E29)
            r3 = r3 & r4
            r17 = r2 | r3
            int r1 = r1 >> 27
            r1 = r1 & 14
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            int r2 = r0 << 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            int r0 = r0 << 9
            r2 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r2
            r18 = r1 | r0
            r0 = r51
            r1 = r19
            r2 = r52
            r3 = r7
            r4 = r53
            r28 = r5
            r5 = r25
            r25 = r6
            r6 = r48
            r29 = r7
            r7 = r16
            r30 = r8
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r12 = r26
            r13 = r27
            r15 = r24
            r16 = r30
            m34292SelectableChipu0RnIRE(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x03e6
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x03e6:
            r4 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r13 = r24
            r7 = r25
            r12 = r28
            r5 = r29
            r6 = r48
        L_0x03fa:
            androidx.compose.runtime.ScopeUpdateScope r15 = r30.endRestartGroup()
            if (r15 != 0) goto L_0x0401
            goto L_0x041e
        L_0x0401:
            androidx.compose.material3.ChipKt$InputChip$3 r14 = new androidx.compose.material3.ChipKt$InputChip$3
            r0 = r14
            r1 = r51
            r2 = r52
            r3 = r53
            r49 = r14
            r14 = r65
            r50 = r15
            r15 = r66
            r16 = r67
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = r49
            r0 = r50
            r0.updateScope(r1)
        L_0x041e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.InputChip(boolean, of.a, of.o, androidx.compose.ui.Modifier, boolean, of.o, of.o, of.o, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SelectableChipColors, androidx.compose.material3.SelectableChipElevation, androidx.compose.material3.SelectableChipBorder, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* access modifiers changed from: private */
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Composable
    /* renamed from: SelectableChip-u0RnIRE  reason: not valid java name */
    public static final void m34292SelectableChipu0RnIRE(boolean z, Modifier modifier, C13074a<C11921v> aVar, boolean z2, C13088o<? super Composer, ? super Integer, C11921v> oVar, TextStyle textStyle, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar3, C13088o<? super Composer, ? super Integer, C11921v> oVar4, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, float f, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2) {
        int i3;
        int i4;
        Composer composer2;
        float f2;
        State<C1232Dp> state;
        float f3;
        boolean z3 = z;
        Modifier modifier2 = modifier;
        boolean z4 = z2;
        SelectableChipColors selectableChipColors2 = selectableChipColors;
        SelectableChipElevation selectableChipElevation2 = selectableChipElevation;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        int i5 = i;
        int i6 = i2;
        Composer startRestartGroup = composer.startRestartGroup(402951308);
        int i7 = 2;
        if ((i5 & 14) == 0) {
            i3 = (startRestartGroup.changed(z3) ? 4 : 2) | i5;
        } else {
            i3 = i5;
        }
        int i8 = 32;
        if ((i5 & 112) == 0) {
            i3 |= startRestartGroup.changed((Object) modifier2) ? 32 : 16;
        }
        int i9 = 256;
        if ((i5 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 0) {
            i3 |= startRestartGroup.changed((Object) aVar) ? 256 : 128;
        } else {
            C13074a<C11921v> aVar2 = aVar;
        }
        int i10 = 2048;
        if ((i5 & 7168) == 0) {
            i3 |= startRestartGroup.changed(z4) ? 2048 : 1024;
        }
        int i11 = 16384;
        if ((i5 & 57344) == 0) {
            i3 |= startRestartGroup.changed((Object) oVar) ? 16384 : 8192;
        } else {
            C13088o<? super Composer, ? super Integer, C11921v> oVar5 = oVar;
        }
        int i12 = 131072;
        TextStyle textStyle2 = textStyle;
        if ((i5 & 458752) == 0) {
            i3 |= startRestartGroup.changed((Object) textStyle2) ? 131072 : 65536;
        }
        C13088o<? super Composer, ? super Integer, C11921v> oVar6 = oVar2;
        if ((i5 & 3670016) == 0) {
            i3 |= startRestartGroup.changed((Object) oVar6) ? 1048576 : 524288;
        }
        C13088o<? super Composer, ? super Integer, C11921v> oVar7 = oVar3;
        if ((i5 & 29360128) == 0) {
            i3 |= startRestartGroup.changed((Object) oVar7) ? 8388608 : 4194304;
        }
        C13088o<? super Composer, ? super Integer, C11921v> oVar8 = oVar4;
        if ((i5 & 234881024) == 0) {
            i3 |= startRestartGroup.changed((Object) oVar8) ? 67108864 : 33554432;
        }
        int i13 = i5 & 1879048192;
        Shape shape2 = shape;
        if (i13 == 0) {
            i3 |= startRestartGroup.changed((Object) shape2) ? 536870912 : 268435456;
        }
        if ((i6 & 14) == 0) {
            if (startRestartGroup.changed((Object) selectableChipColors2)) {
                i7 = 4;
            }
            i4 = i7 | i6;
        } else {
            i4 = i6;
        }
        if ((i6 & 112) == 0) {
            if (!startRestartGroup.changed((Object) selectableChipElevation2)) {
                i8 = 16;
            }
            i4 |= i8;
        }
        if ((i6 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 0) {
            if (!startRestartGroup.changed((Object) borderStroke)) {
                i9 = 128;
            }
            i4 |= i9;
        } else {
            BorderStroke borderStroke2 = borderStroke;
        }
        if ((i6 & 7168) == 0) {
            if (!startRestartGroup.changed(f)) {
                i10 = 1024;
            }
            i4 |= i10;
        } else {
            float f4 = f;
        }
        PaddingValues paddingValues2 = paddingValues;
        if ((i6 & 57344) == 0) {
            if (!startRestartGroup.changed((Object) paddingValues2)) {
                i11 = 8192;
            }
            i4 |= i11;
        }
        if ((i6 & 458752) == 0) {
            if (!startRestartGroup.changed((Object) mutableInteractionSource2)) {
                i12 = 65536;
            }
            i4 |= i12;
        }
        if ((i3 & 1533916891) == 306783378 && (374491 & i4) == 74898 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(402951308, i3, i4, "androidx.compose.material3.SelectableChip (Chip.kt:1353)");
            }
            Modifier semantics$default = SemanticsModifierKt.semantics$default(modifier2, false, ChipKt$SelectableChip$1.INSTANCE, 1, (Object) null);
            int i14 = (i3 >> 9) & 14;
            long r21 = selectableChipColors2.containerColor$material3_release(z4, z3, startRestartGroup, ((i3 << 3) & 112) | i14 | ((i4 << 6) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH)).getValue().m35681unboximpl();
            startRestartGroup.startReplaceableGroup(1036661290);
            State<C1232Dp> state2 = selectableChipElevation2 == null ? null : selectableChipElevation2.tonalElevation$material3_release(z4, mutableInteractionSource2, startRestartGroup, ((i4 >> 12) & 112) | i14 | ((i4 << 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH));
            startRestartGroup.endReplaceableGroup();
            if (state2 != null) {
                f2 = state2.getValue().m38482unboximpl();
            } else {
                f2 = C1232Dp.m38468constructorimpl((float) 0);
            }
            float f5 = f2;
            if (selectableChipElevation2 == null) {
                state = null;
            } else {
                state = selectableChipElevation2.shadowElevation$material3_release(z4, mutableInteractionSource2, startRestartGroup, i14 | ((i4 >> 12) & 112) | ((i4 << 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH));
            }
            if (state != null) {
                f3 = state.getValue().m38482unboximpl();
            } else {
                f3 = C1232Dp.m38468constructorimpl((float) 0);
            }
            float f6 = f3;
            int i15 = i3;
            int i16 = i4;
            ChipKt$SelectableChip$2 chipKt$SelectableChip$2 = r0;
            Composer composer3 = startRestartGroup;
            ChipKt$SelectableChip$2 chipKt$SelectableChip$22 = new ChipKt$SelectableChip$2(selectableChipColors, z2, z, i15, i16, oVar, textStyle, oVar2, oVar3, oVar4, f, paddingValues);
            int i17 = i15;
            composer2 = composer3;
            SurfaceKt.m34604Surfaced85dljk(z, aVar, semantics$default, z2, shape, r21, 0, f5, f6, borderStroke, mutableInteractionSource, (C13088o<? super Composer, ? super Integer, C11921v>) ComposableLambdaKt.composableLambda(composer3, -577614814, true, chipKt$SelectableChip$2), composer3, (i17 & 14) | ((i17 >> 3) & 112) | (i17 & 7168) | ((i17 >> 15) & 57344) | ((i16 << 21) & 1879048192), ((i16 >> 15) & 14) | 48, 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            ChipKt$SelectableChip$3 chipKt$SelectableChip$3 = r0;
            ChipKt$SelectableChip$3 chipKt$SelectableChip$32 = new ChipKt$SelectableChip$3(z, modifier, aVar, z2, oVar, textStyle, oVar2, oVar3, oVar4, shape, selectableChipColors, selectableChipElevation, borderStroke, f, paddingValues, mutableInteractionSource, i, i2);
            endRestartGroup.updateScope(chipKt$SelectableChip$3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0112  */
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void SuggestionChip(p404of.C13074a<p336ef.C11921v> r41, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r42, androidx.compose.p002ui.Modifier r43, boolean r44, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r45, androidx.compose.p002ui.graphics.Shape r46, androidx.compose.material3.ChipColors r47, androidx.compose.material3.ChipElevation r48, androidx.compose.material3.ChipBorder r49, androidx.compose.foundation.interaction.MutableInteractionSource r50, androidx.compose.runtime.Composer r51, int r52, int r53) {
        /*
            r15 = r41
            r12 = r42
            r11 = r52
            r10 = r53
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C12775o.m28639i(r15, r0)
            java.lang.String r0 = "label"
            kotlin.jvm.internal.C12775o.m28639i(r12, r0)
            r0 = 170629701(0xa2b9a45, float:8.2623654E-33)
            r1 = r51
            androidx.compose.runtime.Composer r14 = r1.startRestartGroup(r0)
            r1 = r10 & 1
            if (r1 == 0) goto L_0x0022
            r1 = r11 | 6
            goto L_0x0032
        L_0x0022:
            r1 = r11 & 14
            if (r1 != 0) goto L_0x0031
            boolean r1 = r14.changed((java.lang.Object) r15)
            if (r1 == 0) goto L_0x002e
            r1 = 4
            goto L_0x002f
        L_0x002e:
            r1 = 2
        L_0x002f:
            r1 = r1 | r11
            goto L_0x0032
        L_0x0031:
            r1 = r11
        L_0x0032:
            r2 = r10 & 2
            if (r2 == 0) goto L_0x0039
            r1 = r1 | 48
            goto L_0x0049
        L_0x0039:
            r2 = r11 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0049
            boolean r2 = r14.changed((java.lang.Object) r12)
            if (r2 == 0) goto L_0x0046
            r2 = 32
            goto L_0x0048
        L_0x0046:
            r2 = 16
        L_0x0048:
            r1 = r1 | r2
        L_0x0049:
            r2 = r10 & 4
            if (r2 == 0) goto L_0x0050
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x0050:
            r3 = r11 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0063
            r3 = r43
            boolean r4 = r14.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x005f
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r1 = r1 | r4
            goto L_0x0065
        L_0x0063:
            r3 = r43
        L_0x0065:
            r4 = r10 & 8
            if (r4 == 0) goto L_0x006c
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007f
        L_0x006c:
            r5 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x007f
            r5 = r44
            boolean r6 = r14.changed((boolean) r5)
            if (r6 == 0) goto L_0x007b
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r1 = r1 | r6
            goto L_0x0081
        L_0x007f:
            r5 = r44
        L_0x0081:
            r6 = r10 & 16
            r32 = 57344(0xe000, float:8.0356E-41)
            if (r6 == 0) goto L_0x008b
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009e
        L_0x008b:
            r7 = r11 & r32
            if (r7 != 0) goto L_0x009e
            r7 = r45
            boolean r8 = r14.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x009a
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r1 = r1 | r8
            goto L_0x00a0
        L_0x009e:
            r7 = r45
        L_0x00a0:
            r8 = 458752(0x70000, float:6.42848E-40)
            r8 = r8 & r11
            if (r8 != 0) goto L_0x00ba
            r8 = r10 & 32
            if (r8 != 0) goto L_0x00b4
            r8 = r46
            boolean r9 = r14.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x00b6
            r9 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b8
        L_0x00b4:
            r8 = r46
        L_0x00b6:
            r9 = 65536(0x10000, float:9.18355E-41)
        L_0x00b8:
            r1 = r1 | r9
            goto L_0x00bc
        L_0x00ba:
            r8 = r46
        L_0x00bc:
            r33 = 3670016(0x380000, float:5.142788E-39)
            r9 = r11 & r33
            if (r9 != 0) goto L_0x00d7
            r9 = r10 & 64
            if (r9 != 0) goto L_0x00d1
            r9 = r47
            boolean r13 = r14.changed((java.lang.Object) r9)
            if (r13 == 0) goto L_0x00d3
            r13 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d5
        L_0x00d1:
            r9 = r47
        L_0x00d3:
            r13 = 524288(0x80000, float:7.34684E-40)
        L_0x00d5:
            r1 = r1 | r13
            goto L_0x00d9
        L_0x00d7:
            r9 = r47
        L_0x00d9:
            r13 = 29360128(0x1c00000, float:7.052966E-38)
            r13 = r13 & r11
            if (r13 != 0) goto L_0x00f4
            r13 = r10 & 128(0x80, float:1.794E-43)
            if (r13 != 0) goto L_0x00ed
            r13 = r48
            boolean r16 = r14.changed((java.lang.Object) r13)
            if (r16 == 0) goto L_0x00ef
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f1
        L_0x00ed:
            r13 = r48
        L_0x00ef:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f1:
            r1 = r1 | r16
            goto L_0x00f6
        L_0x00f4:
            r13 = r48
        L_0x00f6:
            r34 = 234881024(0xe000000, float:1.5777218E-30)
            r16 = r11 & r34
            if (r16 != 0) goto L_0x0112
            r0 = r10 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x010b
            r0 = r49
            boolean r16 = r14.changed((java.lang.Object) r0)
            if (r16 == 0) goto L_0x010d
            r16 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010f
        L_0x010b:
            r0 = r49
        L_0x010d:
            r16 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010f:
            r1 = r1 | r16
            goto L_0x0114
        L_0x0112:
            r0 = r49
        L_0x0114:
            r9 = r10 & 512(0x200, float:7.175E-43)
            r35 = 1879048192(0x70000000, float:1.58456325E29)
            if (r9 == 0) goto L_0x0123
            r16 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r16
            r51 = r9
            r9 = r50
            goto L_0x0138
        L_0x0123:
            r16 = r11 & r35
            r51 = r9
            r9 = r50
            if (r16 != 0) goto L_0x0138
            boolean r16 = r14.changed((java.lang.Object) r9)
            if (r16 == 0) goto L_0x0134
            r16 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0136
        L_0x0134:
            r16 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0136:
            r1 = r1 | r16
        L_0x0138:
            r16 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r0 = r1 & r16
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r3) goto L_0x015b
            boolean r0 = r14.getSkipping()
            if (r0 != 0) goto L_0x0149
            goto L_0x015b
        L_0x0149:
            r14.skipToGroupEnd()
            r3 = r43
            r4 = r5
            r5 = r7
            r6 = r8
            r10 = r9
            r8 = r13
            r22 = r14
            r7 = r47
            r9 = r49
            goto L_0x0332
        L_0x015b:
            r14.startDefaults()
            r0 = r11 & 1
            r3 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r36 = -3670017(0xffffffffffc7ffff, float:NaN)
            r16 = -458753(0xfffffffffff8ffff, float:NaN)
            r37 = 0
            r9 = 6
            if (r0 == 0) goto L_0x01a3
            boolean r0 = r14.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0175
            goto L_0x01a3
        L_0x0175:
            r14.skipToGroupEnd()
            r0 = r10 & 32
            if (r0 == 0) goto L_0x017e
            r1 = r1 & r16
        L_0x017e:
            r0 = r10 & 64
            if (r0 == 0) goto L_0x0184
            r1 = r1 & r36
        L_0x0184:
            r0 = r10 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0189
            r1 = r1 & r3
        L_0x0189:
            r0 = r10 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0191
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r1 = r1 & r0
        L_0x0191:
            r19 = r43
            r21 = r50
            r39 = r7
            r40 = r8
            r0 = r9
            r20 = r13
            r8 = r47
            r7 = r49
            r9 = r5
            goto L_0x026d
        L_0x01a3:
            if (r2 == 0) goto L_0x01a8
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x01aa
        L_0x01a8:
            r0 = r43
        L_0x01aa:
            if (r4 == 0) goto L_0x01b0
            r2 = 1
            r38 = r2
            goto L_0x01b2
        L_0x01b0:
            r38 = r5
        L_0x01b2:
            if (r6 == 0) goto L_0x01b7
            r39 = r37
            goto L_0x01b9
        L_0x01b7:
            r39 = r7
        L_0x01b9:
            r2 = r10 & 32
            if (r2 == 0) goto L_0x01c8
            androidx.compose.material3.SuggestionChipDefaults r2 = androidx.compose.material3.SuggestionChipDefaults.INSTANCE
            androidx.compose.ui.graphics.Shape r2 = r2.getShape(r14, r9)
            r1 = r1 & r16
            r40 = r2
            goto L_0x01ca
        L_0x01c8:
            r40 = r8
        L_0x01ca:
            r2 = r10 & 64
            if (r2 == 0) goto L_0x01eb
            androidx.compose.material3.SuggestionChipDefaults r16 = androidx.compose.material3.SuggestionChipDefaults.INSTANCE
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r30 = 1572864(0x180000, float:2.204052E-39)
            r31 = 63
            r29 = r14
            androidx.compose.material3.ChipColors r2 = r16.m34600suggestionChipColors5tl4gsc(r17, r19, r21, r23, r25, r27, r29, r30, r31)
            r1 = r1 & r36
            r26 = r2
            goto L_0x01ed
        L_0x01eb:
            r26 = r47
        L_0x01ed:
            r2 = r10 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x020e
            androidx.compose.material3.SuggestionChipDefaults r16 = androidx.compose.material3.SuggestionChipDefaults.INSTANCE
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 1572864(0x180000, float:2.204052E-39)
            r25 = 63
            r23 = r14
            androidx.compose.material3.ChipElevation r2 = r16.m34601suggestionChipElevationaqJV_2Y(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r1 = r1 & r3
            r16 = r1
            r13 = r2
            goto L_0x0210
        L_0x020e:
            r16 = r1
        L_0x0210:
            r1 = r10 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0233
            androidx.compose.material3.SuggestionChipDefaults r1 = androidx.compose.material3.SuggestionChipDefaults.INSTANCE
            r2 = 0
            r4 = 0
            r6 = 0
            r8 = 3072(0xc00, float:4.305E-42)
            r17 = 7
            r7 = r14
            r18 = r51
            r43 = r0
            r0 = r9
            r9 = r17
            androidx.compose.material3.ChipBorder r1 = r1.m34599suggestionChipBorderd_3_b6Q(r2, r4, r6, r7, r8, r9)
            r2 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r2 = r16 & r2
            r16 = r2
            goto L_0x023a
        L_0x0233:
            r18 = r51
            r43 = r0
            r0 = r9
            r1 = r49
        L_0x023a:
            if (r18 == 0) goto L_0x0260
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r14.startReplaceableGroup(r2)
            java.lang.Object r2 = r14.rememberedValue()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            if (r2 != r3) goto L_0x0255
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r14.updateRememberedValue(r2)
        L_0x0255:
            r14.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = (androidx.compose.foundation.interaction.MutableInteractionSource) r2
            r19 = r43
            r7 = r1
            r21 = r2
            goto L_0x0265
        L_0x0260:
            r19 = r43
            r21 = r50
            r7 = r1
        L_0x0265:
            r20 = r13
            r1 = r16
            r8 = r26
            r9 = r38
        L_0x026d:
            r14.endDefaults()
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x027f
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.SuggestionChip (Chip.kt:520)"
            r4 = 170629701(0xa2b9a45, float:8.2623654E-33)
            androidx.compose.runtime.ComposerKt.traceEventStart(r4, r1, r2, r3)
        L_0x027f:
            androidx.compose.material3.MaterialTheme r2 = androidx.compose.material3.MaterialTheme.INSTANCE
            androidx.compose.material3.Typography r0 = r2.getTypography(r14, r0)
            androidx.compose.material3.tokens.SuggestionChipTokens r2 = androidx.compose.material3.tokens.SuggestionChipTokens.INSTANCE
            androidx.compose.material3.tokens.TypographyKeyTokens r2 = r2.getLabelTextFont()
            androidx.compose.ui.text.TextStyle r4 = androidx.compose.material3.TypographyKt.fromToken(r0, r2)
            int r0 = r1 >> 9
            r0 = r0 & 14
            int r2 = r1 >> 15
            r3 = r2 & 112(0x70, float:1.57E-43)
            r3 = r3 | r0
            androidx.compose.runtime.State r3 = r8.labelColor$material3_release(r9, r14, r3)
            java.lang.Object r3 = r3.getValue()
            androidx.compose.ui.graphics.Color r3 = (androidx.compose.p002ui.graphics.Color) r3
            long r5 = r3.m35681unboximpl()
            r16 = 0
            if (r7 != 0) goto L_0x02ad
            r0 = r37
            goto L_0x02b6
        L_0x02ad:
            int r3 = r1 >> 21
            r3 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            androidx.compose.runtime.State r0 = r7.borderStroke$material3_release(r9, r14, r0)
        L_0x02b6:
            if (r0 == 0) goto L_0x02c0
            java.lang.Object r0 = r0.getValue()
            androidx.compose.foundation.BorderStroke r0 = (androidx.compose.foundation.BorderStroke) r0
            r37 = r0
        L_0x02c0:
            androidx.compose.material3.SuggestionChipDefaults r0 = androidx.compose.material3.SuggestionChipDefaults.INSTANCE
            float r13 = r0.m34597getHeightD9Ej5fM()
            androidx.compose.foundation.layout.PaddingValues r0 = SuggestionChipPadding
            r22 = r14
            r14 = r0
            int r0 = r1 >> 6
            r0 = r0 & 14
            r3 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r3
            int r3 = r1 << 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            int r3 = r1 >> 3
            r3 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            int r3 = r1 << 6
            r43 = r7
            r7 = r3 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r7
            r3 = r3 & r33
            r0 = r0 | r3
            int r3 = r1 << 9
            r7 = r3 & r34
            r0 = r0 | r7
            r3 = r3 & r35
            r17 = r0 | r3
            int r0 = r1 >> 21
            r0 = r0 & 14
            r0 = r0 | 3456(0xd80, float:4.843E-42)
            r1 = r2 & r32
            r18 = r0 | r1
            r0 = r19
            r1 = r41
            r2 = r9
            r3 = r42
            r23 = r43
            r7 = r39
            r26 = r8
            r8 = r16
            r38 = r9
            r9 = r40
            r10 = r26
            r11 = r20
            r12 = r37
            r15 = r21
            r16 = r22
            m34290ChipnkUnTEs(r0, r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0322
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0322:
            r3 = r19
            r8 = r20
            r10 = r21
            r9 = r23
            r7 = r26
            r4 = r38
            r5 = r39
            r6 = r40
        L_0x0332:
            androidx.compose.runtime.ScopeUpdateScope r13 = r22.endRestartGroup()
            if (r13 != 0) goto L_0x0339
            goto L_0x034a
        L_0x0339:
            androidx.compose.material3.ChipKt$SuggestionChip$2 r14 = new androidx.compose.material3.ChipKt$SuggestionChip$2
            r0 = r14
            r1 = r41
            r2 = r42
            r11 = r52
            r12 = r53
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.updateScope(r14)
        L_0x034a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.SuggestionChip(of.a, of.o, androidx.compose.ui.Modifier, boolean, of.o, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.material3.ChipBorder, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final PaddingValues inputChipPadding(boolean z, boolean z2, boolean z3) {
        float f;
        float f2;
        if (z || !z2) {
            f = (float) 4;
        } else {
            f = (float) 8;
        }
        float r2 = C1232Dp.m38468constructorimpl(f);
        if (z3) {
            f2 = (float) 8;
        } else {
            f2 = (float) 4;
        }
        return PaddingKt.m33265PaddingValuesa9UjIt4$default(r2, 0.0f, C1232Dp.m38468constructorimpl(f2), 0.0f, 10, (Object) null);
    }

    static /* synthetic */ PaddingValues inputChipPadding$default(boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        return inputChipPadding(z, z2, z3);
    }
}
