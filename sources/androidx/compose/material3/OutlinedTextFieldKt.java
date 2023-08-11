package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.draw.DrawModifierKt;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.layout.LayoutIdKt;
import androidx.compose.p002ui.layout.LayoutKt;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.node.ComposeUiNode;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: OutlinedTextField.kt */
public final class OutlinedTextFieldKt {
    /* access modifiers changed from: private */
    public static final float OutlinedTextFieldInnerPadding = C1232Dp.m38468constructorimpl((float) 4);
    private static final float OutlinedTextFieldTopPadding = C1232Dp.m38468constructorimpl((float) 8);

    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01b4, code lost:
        if (r9.changed((java.lang.Object) r99) != false) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x01d1, code lost:
        if (r9.changed((java.lang.Object) r100) != false) goto L_0x01d8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x05b4  */
    /* JADX WARNING: Removed duplicated region for block: B:315:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0139  */
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void OutlinedTextField(java.lang.String r86, kotlin.jvm.functions.Function1<? super java.lang.String, p336ef.C11921v> r87, androidx.compose.p002ui.Modifier r88, boolean r89, boolean r90, androidx.compose.p002ui.text.TextStyle r91, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r92, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r93, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r94, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r95, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r96, boolean r97, androidx.compose.p002ui.text.input.VisualTransformation r98, androidx.compose.foundation.text.KeyboardOptions r99, androidx.compose.foundation.text.KeyboardActions r100, boolean r101, int r102, androidx.compose.foundation.interaction.MutableInteractionSource r103, androidx.compose.p002ui.graphics.Shape r104, androidx.compose.material3.TextFieldColors r105, androidx.compose.runtime.Composer r106, int r107, int r108, int r109) {
        /*
            r15 = r86
            r14 = r87
            r13 = r107
            r12 = r108
            r11 = r109
            java.lang.String r0 = "value"
            kotlin.jvm.internal.C12775o.m28639i(r15, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.C12775o.m28639i(r14, r0)
            r0 = 534493230(0x1fdbb82e, float:9.305481E-20)
            r1 = r106
            androidx.compose.runtime.Composer r9 = r1.startRestartGroup(r0)
            r1 = r11 & 1
            if (r1 == 0) goto L_0x0024
            r1 = r13 | 6
            goto L_0x0034
        L_0x0024:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x0033
            boolean r1 = r9.changed((java.lang.Object) r15)
            if (r1 == 0) goto L_0x0030
            r1 = 4
            goto L_0x0031
        L_0x0030:
            r1 = 2
        L_0x0031:
            r1 = r1 | r13
            goto L_0x0034
        L_0x0033:
            r1 = r13
        L_0x0034:
            r4 = r11 & 2
            if (r4 == 0) goto L_0x003b
            r1 = r1 | 48
            goto L_0x004b
        L_0x003b:
            r4 = r13 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004b
            boolean r4 = r9.changed((java.lang.Object) r14)
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
            goto L_0x0066
        L_0x0052:
            r10 = r13 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x0066
            r10 = r88
            boolean r16 = r9.changed((java.lang.Object) r10)
            if (r16 == 0) goto L_0x0061
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r1 = r1 | r16
            goto L_0x0068
        L_0x0066:
            r10 = r88
        L_0x0068:
            r16 = r11 & 8
            r17 = 2048(0x800, float:2.87E-42)
            r18 = 1024(0x400, float:1.435E-42)
            if (r16 == 0) goto L_0x0073
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0087
        L_0x0073:
            r2 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x0087
            r2 = r89
            boolean r19 = r9.changed((boolean) r2)
            if (r19 == 0) goto L_0x0082
            r19 = r17
            goto L_0x0084
        L_0x0082:
            r19 = r18
        L_0x0084:
            r1 = r1 | r19
            goto L_0x0089
        L_0x0087:
            r2 = r89
        L_0x0089:
            r19 = r11 & 16
            r20 = 16384(0x4000, float:2.2959E-41)
            r21 = 8192(0x2000, float:1.14794E-41)
            if (r19 == 0) goto L_0x0096
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r3 = r90
            goto L_0x00ac
        L_0x0096:
            r22 = 57344(0xe000, float:8.0356E-41)
            r22 = r13 & r22
            r3 = r90
            if (r22 != 0) goto L_0x00ac
            boolean r23 = r9.changed((boolean) r3)
            if (r23 == 0) goto L_0x00a8
            r23 = r20
            goto L_0x00aa
        L_0x00a8:
            r23 = r21
        L_0x00aa:
            r1 = r1 | r23
        L_0x00ac:
            r23 = 458752(0x70000, float:6.42848E-40)
            r23 = r13 & r23
            r24 = 131072(0x20000, float:1.83671E-40)
            r25 = 65536(0x10000, float:9.18355E-41)
            if (r23 != 0) goto L_0x00ca
            r23 = r11 & 32
            r5 = r91
            if (r23 != 0) goto L_0x00c5
            boolean r26 = r9.changed((java.lang.Object) r5)
            if (r26 == 0) goto L_0x00c5
            r26 = r24
            goto L_0x00c7
        L_0x00c5:
            r26 = r25
        L_0x00c7:
            r1 = r1 | r26
            goto L_0x00cc
        L_0x00ca:
            r5 = r91
        L_0x00cc:
            r26 = r11 & 64
            r27 = 524288(0x80000, float:7.34684E-40)
            if (r26 == 0) goto L_0x00d9
            r28 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r28
            r6 = r92
            goto L_0x00ee
        L_0x00d9:
            r28 = 3670016(0x380000, float:5.142788E-39)
            r28 = r13 & r28
            r6 = r92
            if (r28 != 0) goto L_0x00ee
            boolean r29 = r9.changed((java.lang.Object) r6)
            if (r29 == 0) goto L_0x00ea
            r29 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ec
        L_0x00ea:
            r29 = r27
        L_0x00ec:
            r1 = r1 | r29
        L_0x00ee:
            r7 = r11 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x00f9
            r30 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r30
            r8 = r93
            goto L_0x010e
        L_0x00f9:
            r30 = 29360128(0x1c00000, float:7.052966E-38)
            r30 = r13 & r30
            r8 = r93
            if (r30 != 0) goto L_0x010e
            boolean r31 = r9.changed((java.lang.Object) r8)
            if (r31 == 0) goto L_0x010a
            r31 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x010c
        L_0x010a:
            r31 = 4194304(0x400000, float:5.877472E-39)
        L_0x010c:
            r1 = r1 | r31
        L_0x010e:
            r0 = r11 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0119
            r31 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r31
            r2 = r94
            goto L_0x012e
        L_0x0119:
            r31 = 234881024(0xe000000, float:1.5777218E-30)
            r31 = r13 & r31
            r2 = r94
            if (r31 != 0) goto L_0x012e
            boolean r31 = r9.changed((java.lang.Object) r2)
            if (r31 == 0) goto L_0x012a
            r31 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x012c
        L_0x012a:
            r31 = 33554432(0x2000000, float:9.403955E-38)
        L_0x012c:
            r1 = r1 | r31
        L_0x012e:
            r2 = r11 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x0139
            r31 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r31
            r3 = r95
            goto L_0x014e
        L_0x0139:
            r31 = 1879048192(0x70000000, float:1.58456325E29)
            r31 = r13 & r31
            r3 = r95
            if (r31 != 0) goto L_0x014e
            boolean r31 = r9.changed((java.lang.Object) r3)
            if (r31 == 0) goto L_0x014a
            r31 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x014c
        L_0x014a:
            r31 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x014c:
            r1 = r1 | r31
        L_0x014e:
            r3 = r11 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0157
            r22 = r12 | 6
            r5 = r96
            goto L_0x016d
        L_0x0157:
            r31 = r12 & 14
            r5 = r96
            if (r31 != 0) goto L_0x016b
            boolean r31 = r9.changed((java.lang.Object) r5)
            if (r31 == 0) goto L_0x0166
            r22 = 4
            goto L_0x0168
        L_0x0166:
            r22 = 2
        L_0x0168:
            r22 = r12 | r22
            goto L_0x016d
        L_0x016b:
            r22 = r12
        L_0x016d:
            r5 = r11 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x0174
            r22 = r22 | 48
            goto L_0x0187
        L_0x0174:
            r31 = r12 & 112(0x70, float:1.57E-43)
            r6 = r97
            if (r31 != 0) goto L_0x0187
            boolean r31 = r9.changed((boolean) r6)
            if (r31 == 0) goto L_0x0183
            r28 = 32
            goto L_0x0185
        L_0x0183:
            r28 = 16
        L_0x0185:
            r22 = r22 | r28
        L_0x0187:
            r6 = r22
            r8 = r11 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto L_0x0190
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x01a4
        L_0x0190:
            r10 = r12 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x01a4
            r10 = r98
            boolean r22 = r9.changed((java.lang.Object) r10)
            if (r22 == 0) goto L_0x019f
            r29 = 256(0x100, float:3.59E-43)
            goto L_0x01a1
        L_0x019f:
            r29 = 128(0x80, float:1.794E-43)
        L_0x01a1:
            r6 = r6 | r29
            goto L_0x01a6
        L_0x01a4:
            r10 = r98
        L_0x01a6:
            r10 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x01be
            r10 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r10 != 0) goto L_0x01b7
            r10 = r99
            boolean r22 = r9.changed((java.lang.Object) r10)
            if (r22 == 0) goto L_0x01b9
            goto L_0x01bb
        L_0x01b7:
            r10 = r99
        L_0x01b9:
            r17 = r18
        L_0x01bb:
            r6 = r6 | r17
            goto L_0x01c0
        L_0x01be:
            r10 = r99
        L_0x01c0:
            r17 = 57344(0xe000, float:8.0356E-41)
            r17 = r12 & r17
            if (r17 != 0) goto L_0x01db
            r10 = r11 & 16384(0x4000, float:2.2959E-41)
            if (r10 != 0) goto L_0x01d4
            r10 = r100
            boolean r17 = r9.changed((java.lang.Object) r10)
            if (r17 == 0) goto L_0x01d6
            goto L_0x01d8
        L_0x01d4:
            r10 = r100
        L_0x01d6:
            r20 = r21
        L_0x01d8:
            r6 = r6 | r20
            goto L_0x01dd
        L_0x01db:
            r10 = r100
        L_0x01dd:
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r11 & r17
            if (r17 == 0) goto L_0x01eb
            r18 = 196608(0x30000, float:2.75506E-40)
            r6 = r6 | r18
            r10 = r101
            goto L_0x0200
        L_0x01eb:
            r18 = 458752(0x70000, float:6.42848E-40)
            r18 = r12 & r18
            r10 = r101
            if (r18 != 0) goto L_0x0200
            boolean r18 = r9.changed((boolean) r10)
            if (r18 == 0) goto L_0x01fc
            r18 = r24
            goto L_0x01fe
        L_0x01fc:
            r18 = r25
        L_0x01fe:
            r6 = r6 | r18
        L_0x0200:
            r18 = r11 & r25
            if (r18 == 0) goto L_0x020b
            r20 = 1572864(0x180000, float:2.204052E-39)
            r6 = r6 | r20
            r10 = r102
            goto L_0x0220
        L_0x020b:
            r20 = 3670016(0x380000, float:5.142788E-39)
            r20 = r12 & r20
            r10 = r102
            if (r20 != 0) goto L_0x0220
            boolean r20 = r9.changed((int) r10)
            if (r20 == 0) goto L_0x021c
            r20 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x021e
        L_0x021c:
            r20 = r27
        L_0x021e:
            r6 = r6 | r20
        L_0x0220:
            r20 = r11 & r24
            if (r20 == 0) goto L_0x022b
            r21 = 12582912(0xc00000, float:1.7632415E-38)
            r6 = r6 | r21
            r10 = r103
            goto L_0x0240
        L_0x022b:
            r21 = 29360128(0x1c00000, float:7.052966E-38)
            r21 = r12 & r21
            r10 = r103
            if (r21 != 0) goto L_0x0240
            boolean r21 = r9.changed((java.lang.Object) r10)
            if (r21 == 0) goto L_0x023c
            r21 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x023e
        L_0x023c:
            r21 = 4194304(0x400000, float:5.877472E-39)
        L_0x023e:
            r6 = r6 | r21
        L_0x0240:
            r21 = 234881024(0xe000000, float:1.5777218E-30)
            r21 = r12 & r21
            r22 = 262144(0x40000, float:3.67342E-40)
            if (r21 != 0) goto L_0x025c
            r21 = r11 & r22
            r10 = r104
            if (r21 != 0) goto L_0x0257
            boolean r21 = r9.changed((java.lang.Object) r10)
            if (r21 == 0) goto L_0x0257
            r21 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0259
        L_0x0257:
            r21 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0259:
            r6 = r6 | r21
            goto L_0x025e
        L_0x025c:
            r10 = r104
        L_0x025e:
            r21 = 1879048192(0x70000000, float:1.58456325E29)
            r21 = r12 & r21
            if (r21 != 0) goto L_0x0278
            r21 = r11 & r27
            r10 = r105
            if (r21 != 0) goto L_0x0273
            boolean r21 = r9.changed((java.lang.Object) r10)
            if (r21 == 0) goto L_0x0273
            r21 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0275
        L_0x0273:
            r21 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0275:
            r6 = r6 | r21
            goto L_0x027a
        L_0x0278:
            r10 = r105
        L_0x027a:
            r21 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r10 = r1 & r21
            r12 = 306783378(0x12492492, float:6.3469493E-28)
            if (r10 != r12) goto L_0x02be
            r10 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r10 = r10 & r6
            r12 = 306783378(0x12492492, float:6.3469493E-28)
            if (r10 != r12) goto L_0x02be
            boolean r10 = r9.getSkipping()
            if (r10 != 0) goto L_0x0294
            goto L_0x02be
        L_0x0294:
            r9.skipToGroupEnd()
            r3 = r88
            r4 = r89
            r5 = r90
            r6 = r91
            r7 = r92
            r8 = r93
            r10 = r95
            r11 = r96
            r12 = r97
            r13 = r98
            r14 = r99
            r15 = r100
            r16 = r101
            r17 = r102
            r18 = r103
            r19 = r104
            r20 = r105
            r1 = r9
            r9 = r94
            goto L_0x05ad
        L_0x02be:
            r9.startDefaults()
            r10 = r13 & 1
            if (r10 == 0) goto L_0x0344
            boolean r10 = r9.getDefaultsInvalid()
            if (r10 == 0) goto L_0x02cd
            goto L_0x0344
        L_0x02cd:
            r9.skipToGroupEnd()
            r0 = r11 & 32
            if (r0 == 0) goto L_0x02d8
            r0 = -458753(0xfffffffffff8ffff, float:NaN)
            r1 = r1 & r0
        L_0x02d8:
            r0 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x02de
            r6 = r6 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x02de:
            r0 = r11 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x02e6
            r0 = -57345(0xffffffffffff1fff, float:NaN)
            r6 = r6 & r0
        L_0x02e6:
            r0 = r11 & r22
            if (r0 == 0) goto L_0x02ee
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r6 = r6 & r0
        L_0x02ee:
            r0 = r11 & r27
            if (r0 == 0) goto L_0x031c
            r0 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r0 = r0 & r6
            r23 = r88
            r12 = r89
            r77 = r90
            r8 = r91
            r78 = r92
            r24 = r93
            r25 = r94
            r26 = r95
            r27 = r96
            r28 = r97
            r29 = r98
            r30 = r99
            r31 = r100
            r79 = r101
            r80 = r102
            r32 = r103
            r33 = r104
            r7 = r105
            r5 = r0
            goto L_0x0341
        L_0x031c:
            r23 = r88
            r12 = r89
            r77 = r90
            r8 = r91
            r78 = r92
            r24 = r93
            r25 = r94
            r26 = r95
            r27 = r96
            r28 = r97
            r29 = r98
            r30 = r99
            r31 = r100
            r79 = r101
            r80 = r102
            r32 = r103
            r33 = r104
            r7 = r105
            r5 = r6
        L_0x0341:
            r6 = r1
            goto L_0x04a4
        L_0x0344:
            if (r4 == 0) goto L_0x0349
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x034b
        L_0x0349:
            r4 = r88
        L_0x034b:
            if (r16 == 0) goto L_0x034f
            r10 = 1
            goto L_0x0351
        L_0x034f:
            r10 = r89
        L_0x0351:
            if (r19 == 0) goto L_0x0356
            r77 = 0
            goto L_0x0358
        L_0x0356:
            r77 = r90
        L_0x0358:
            r16 = r11 & 32
            if (r16 == 0) goto L_0x036c
            androidx.compose.runtime.ProvidableCompositionLocal r12 = androidx.compose.material3.TextKt.getLocalTextStyle()
            java.lang.Object r12 = r9.consume(r12)
            androidx.compose.ui.text.TextStyle r12 = (androidx.compose.p002ui.text.TextStyle) r12
            r16 = -458753(0xfffffffffff8ffff, float:NaN)
            r1 = r1 & r16
            goto L_0x036e
        L_0x036c:
            r12 = r91
        L_0x036e:
            r16 = 0
            if (r26 == 0) goto L_0x0375
            r78 = r16
            goto L_0x0377
        L_0x0375:
            r78 = r92
        L_0x0377:
            if (r7 == 0) goto L_0x037c
            r7 = r16
            goto L_0x037e
        L_0x037c:
            r7 = r93
        L_0x037e:
            if (r0 == 0) goto L_0x0383
            r0 = r16
            goto L_0x0385
        L_0x0383:
            r0 = r94
        L_0x0385:
            if (r2 == 0) goto L_0x038a
            r2 = r16
            goto L_0x038c
        L_0x038a:
            r2 = r95
        L_0x038c:
            if (r3 == 0) goto L_0x0391
            r3 = r16
            goto L_0x0393
        L_0x0391:
            r3 = r96
        L_0x0393:
            if (r5 == 0) goto L_0x0397
            r5 = 0
            goto L_0x0399
        L_0x0397:
            r5 = r97
        L_0x0399:
            if (r8 == 0) goto L_0x03a2
            androidx.compose.ui.text.input.VisualTransformation$Companion r8 = androidx.compose.p002ui.text.input.VisualTransformation.Companion
            androidx.compose.ui.text.input.VisualTransformation r8 = r8.getNone()
            goto L_0x03a4
        L_0x03a2:
            r8 = r98
        L_0x03a4:
            r88 = r0
            r0 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x03b3
            androidx.compose.foundation.text.KeyboardOptions$Companion r0 = androidx.compose.foundation.text.KeyboardOptions.Companion
            androidx.compose.foundation.text.KeyboardOptions r0 = r0.getDefault()
            r6 = r6 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x03b5
        L_0x03b3:
            r0 = r99
        L_0x03b5:
            r89 = r0
            r0 = r11 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x03c7
            androidx.compose.foundation.text.KeyboardActions$Companion r0 = androidx.compose.foundation.text.KeyboardActions.Companion
            androidx.compose.foundation.text.KeyboardActions r0 = r0.getDefault()
            r16 = -57345(0xffffffffffff1fff, float:NaN)
            r6 = r6 & r16
            goto L_0x03c9
        L_0x03c7:
            r0 = r100
        L_0x03c9:
            if (r17 == 0) goto L_0x03ce
            r79 = 0
            goto L_0x03d0
        L_0x03ce:
            r79 = r101
        L_0x03d0:
            if (r18 == 0) goto L_0x03d8
            r16 = 2147483647(0x7fffffff, float:NaN)
            r80 = r16
            goto L_0x03da
        L_0x03d8:
            r80 = r102
        L_0x03da:
            r90 = r0
            if (r20 == 0) goto L_0x03ff
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r9.startReplaceableGroup(r0)
            java.lang.Object r0 = r9.rememberedValue()
            androidx.compose.runtime.Composer$Companion r16 = androidx.compose.runtime.Composer.Companion
            r91 = r1
            java.lang.Object r1 = r16.getEmpty()
            if (r0 != r1) goto L_0x03f9
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r9.updateRememberedValue(r0)
        L_0x03f9:
            r9.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = (androidx.compose.foundation.interaction.MutableInteractionSource) r0
            goto L_0x0403
        L_0x03ff:
            r91 = r1
            r0 = r103
        L_0x0403:
            r1 = r11 & r22
            if (r1 == 0) goto L_0x0415
            androidx.compose.material3.TextFieldDefaults r1 = androidx.compose.material3.TextFieldDefaults.INSTANCE
            r92 = r0
            r0 = 6
            androidx.compose.ui.graphics.Shape r0 = r1.getOutlinedShape(r9, r0)
            r1 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r6 = r6 & r1
            goto L_0x0419
        L_0x0415:
            r92 = r0
            r0 = r104
        L_0x0419:
            r1 = r11 & r27
            if (r1 == 0) goto L_0x0487
            androidx.compose.material3.TextFieldDefaults r16 = androidx.compose.material3.TextFieldDefaults.INSTANCE
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r30 = 0
            r32 = 0
            r34 = 0
            r36 = 0
            r38 = 0
            r40 = 0
            r42 = 0
            r44 = 0
            r46 = 0
            r48 = 0
            r50 = 0
            r52 = 0
            r54 = 0
            r56 = 0
            r58 = 0
            r60 = 0
            r62 = 0
            r64 = 0
            r66 = 0
            r68 = 0
            r70 = 0
            r73 = 0
            r74 = 0
            r75 = 100663296(0x6000000, float:2.4074124E-35)
            r76 = 268435455(0xfffffff, float:2.5243547E-29)
            r72 = r9
            androidx.compose.material3.TextFieldColors r1 = r16.m34659outlinedTextFieldColorsl59Burw(r17, r19, r21, r23, r25, r27, r28, r30, r32, r34, r36, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64, r66, r68, r70, r72, r73, r74, r75, r76)
            r16 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r6 = r6 & r16
            r25 = r88
            r30 = r89
            r31 = r90
            r32 = r92
            r33 = r0
            r26 = r2
            r27 = r3
            r23 = r4
            r28 = r5
            r5 = r6
            r24 = r7
            r29 = r8
            r8 = r12
            r6 = r91
            r7 = r1
            goto L_0x04a3
        L_0x0487:
            r25 = r88
            r30 = r89
            r31 = r90
            r32 = r92
            r33 = r0
            r26 = r2
            r27 = r3
            r23 = r4
            r28 = r5
            r5 = r6
            r24 = r7
            r29 = r8
            r8 = r12
            r6 = r91
            r7 = r105
        L_0x04a3:
            r12 = r10
        L_0x04a4:
            r9.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x04b5
            java.lang.String r0 = "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:132)"
            r1 = 534493230(0x1fdbb82e, float:9.305481E-20)
            androidx.compose.runtime.ComposerKt.traceEventStart(r1, r6, r5, r0)
        L_0x04b5:
            r0 = 1663535219(0x63278873, float:3.0904385E21)
            r9.startReplaceableGroup(r0)
            long r0 = r8.m37995getColor0d7_KjU()
            androidx.compose.ui.graphics.Color$Companion r2 = androidx.compose.p002ui.graphics.Color.Companion
            long r2 = r2.m35707getUnspecified0d7_KjU()
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x04cb
            r2 = 1
            goto L_0x04cc
        L_0x04cb:
            r2 = 0
        L_0x04cc:
            if (r2 == 0) goto L_0x04cf
            goto L_0x04e6
        L_0x04cf:
            int r0 = r6 >> 9
            r0 = r0 & 14
            int r1 = r5 >> 24
            r1 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            androidx.compose.runtime.State r0 = r7.textColor$material3_release(r12, r9, r0)
            java.lang.Object r0 = r0.getValue()
            androidx.compose.ui.graphics.Color r0 = (androidx.compose.p002ui.graphics.Color) r0
            long r0 = r0.m35681unboximpl()
        L_0x04e6:
            r35 = r0
            r9.endReplaceableGroup()
            androidx.compose.ui.text.TextStyle r0 = new androidx.compose.ui.text.TextStyle
            r34 = r0
            r37 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r57 = 0
            r58 = 262142(0x3fffe, float:3.67339E-40)
            r59 = 0
            r34.<init>((long) r35, (long) r37, (androidx.compose.p002ui.text.font.FontWeight) r39, (androidx.compose.p002ui.text.font.FontStyle) r40, (androidx.compose.p002ui.text.font.FontSynthesis) r41, (androidx.compose.p002ui.text.font.FontFamily) r42, (java.lang.String) r43, (long) r44, (androidx.compose.p002ui.text.style.BaselineShift) r46, (androidx.compose.p002ui.text.style.TextGeometricTransform) r47, (androidx.compose.p002ui.text.intl.LocaleList) r48, (long) r49, (androidx.compose.p002ui.text.style.TextDecoration) r51, (androidx.compose.p002ui.graphics.Shadow) r52, (androidx.compose.p002ui.text.style.TextAlign) r53, (androidx.compose.p002ui.text.style.TextDirection) r54, (long) r55, (androidx.compose.p002ui.text.style.TextIndent) r57, (int) r58, (kotlin.jvm.internal.DefaultConstructorMarker) r59)
            androidx.compose.ui.text.TextStyle r10 = r8.merge((androidx.compose.p002ui.text.TextStyle) r0)
            r4 = 1
            androidx.compose.runtime.ProvidedValue[] r3 = new androidx.compose.runtime.ProvidedValue[r4]
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.foundation.text.selection.TextSelectionColorsKt.getLocalTextSelectionColors()
            int r1 = r5 >> 27
            r1 = r1 & 14
            androidx.compose.foundation.text.selection.TextSelectionColors r1 = r7.getSelectionColors(r9, r1)
            androidx.compose.runtime.ProvidedValue r0 = r0.provides(r1)
            r1 = 0
            r3[r1] = r0
            androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2 r2 = new androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2
            r0 = r2
            r1 = r78
            r81 = r2
            r2 = r23
            r82 = r3
            r3 = r7
            r16 = r4
            r4 = r28
            r17 = r6
            r6 = r86
            r34 = r7
            r7 = r87
            r35 = r8
            r8 = r12
            r83 = r9
            r9 = r77
            r11 = r30
            r36 = r12
            r12 = r31
            r13 = r79
            r14 = r80
            r15 = r29
            r16 = r32
            r18 = r24
            r19 = r25
            r20 = r26
            r21 = r27
            r22 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r0 = -1801753362(0xffffffff949b6cee, float:-1.5693966E-26)
            r2 = r81
            r1 = r83
            r3 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r1, r0, r3, r2)
            r2 = 56
            r3 = r82
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) r3, (p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v>) r0, (androidx.compose.runtime.Composer) r1, (int) r2)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0589
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0589:
            r3 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            r12 = r28
            r13 = r29
            r14 = r30
            r15 = r31
            r18 = r32
            r19 = r33
            r20 = r34
            r6 = r35
            r4 = r36
            r5 = r77
            r7 = r78
            r16 = r79
            r17 = r80
        L_0x05ad:
            androidx.compose.runtime.ScopeUpdateScope r2 = r1.endRestartGroup()
            if (r2 != 0) goto L_0x05b4
            goto L_0x05cf
        L_0x05b4:
            androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$3 r1 = new androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$3
            r0 = r1
            r84 = r1
            r1 = r86
            r85 = r2
            r2 = r87
            r21 = r107
            r22 = r108
            r23 = r109
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r1 = r84
            r0 = r85
            r0.updateScope(r1)
        L_0x05cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, of.o, of.o, of.o, of.o, of.o, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Composable
    public static final void OutlinedTextFieldLayout(Modifier modifier, C13088o<? super Composer, ? super Integer, C11921v> oVar, C13089p<? super Modifier, ? super Composer, ? super Integer, C11921v> pVar, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar3, C13088o<? super Composer, ? super Integer, C11921v> oVar4, boolean z, float f, Function1<? super Size, C11921v> function1, C13088o<? super Composer, ? super Integer, C11921v> oVar5, C13088o<? super Composer, ? super Integer, C11921v> oVar6, PaddingValues paddingValues, Composer composer, int i, int i2) {
        int i3;
        int i4;
        int i5;
        Modifier modifier2 = modifier;
        C13088o<? super Composer, ? super Integer, C11921v> oVar7 = oVar;
        C13089p<? super Modifier, ? super Composer, ? super Integer, C11921v> pVar2 = pVar;
        C13088o<? super Composer, ? super Integer, C11921v> oVar8 = oVar2;
        C13088o<? super Composer, ? super Integer, C11921v> oVar9 = oVar3;
        C13088o<? super Composer, ? super Integer, C11921v> oVar10 = oVar4;
        boolean z2 = z;
        float f2 = f;
        Function1<? super Size, C11921v> function12 = function1;
        C13088o<? super Composer, ? super Integer, C11921v> oVar11 = oVar5;
        C13088o<? super Composer, ? super Integer, C11921v> oVar12 = oVar6;
        PaddingValues paddingValues2 = paddingValues;
        int i6 = i;
        C12775o.m28639i(modifier2, "modifier");
        C12775o.m28639i(oVar7, "textField");
        C12775o.m28639i(function12, "onLabelMeasured");
        C12775o.m28639i(oVar11, APIResourceDescriptors.RESOURCE_TYPE_CONTAINER);
        C12775o.m28639i(paddingValues2, "paddingValues");
        Composer startRestartGroup = composer.startRestartGroup(-222199799);
        if ((i6 & 14) == 0) {
            i3 = (startRestartGroup.changed((Object) modifier2) ? 4 : 2) | i6;
        } else {
            i3 = i6;
        }
        int i7 = 32;
        if ((i6 & 112) == 0) {
            i3 |= startRestartGroup.changed((Object) oVar7) ? 32 : 16;
        }
        if ((i6 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 0) {
            i3 |= startRestartGroup.changed((Object) pVar2) ? 256 : 128;
        }
        if ((i6 & 7168) == 0) {
            i3 |= startRestartGroup.changed((Object) oVar8) ? 2048 : 1024;
        }
        if ((57344 & i6) == 0) {
            i3 |= startRestartGroup.changed((Object) oVar9) ? 16384 : 8192;
        }
        if ((458752 & i6) == 0) {
            i3 |= startRestartGroup.changed((Object) oVar10) ? 131072 : 65536;
        }
        if ((3670016 & i6) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 1048576 : 524288;
        }
        if ((29360128 & i6) == 0) {
            i3 |= startRestartGroup.changed(f2) ? 8388608 : 4194304;
        }
        if ((234881024 & i6) == 0) {
            i3 |= startRestartGroup.changed((Object) function12) ? 67108864 : 33554432;
        }
        if ((1879048192 & i6) == 0) {
            i3 |= startRestartGroup.changed((Object) oVar11) ? 536870912 : 268435456;
        }
        if ((i2 & 14) == 0) {
            i4 = i2 | (startRestartGroup.changed((Object) oVar12) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 112) == 0) {
            if (!startRestartGroup.changed((Object) paddingValues2)) {
                i7 = 16;
            }
            i4 |= i7;
        }
        if ((i3 & 1533916891) == 306783378 && (i4 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            C13088o<? super Composer, ? super Integer, C11921v> oVar13 = oVar7;
            C13088o<? super Composer, ? super Integer, C11921v> oVar14 = oVar8;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-222199799, i3, i4, "androidx.compose.material3.OutlinedTextFieldLayout (OutlinedTextField.kt:377)");
            }
            Object[] objArr = {function12, Boolean.valueOf(z), Float.valueOf(f), paddingValues2};
            startRestartGroup.startReplaceableGroup(-568225417);
            int i8 = i4;
            int i9 = 0;
            boolean z3 = false;
            for (int i10 = 4; i9 < i10; i10 = 4) {
                z3 |= startRestartGroup.changed(objArr[i9]);
                i9++;
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z3 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new OutlinedTextFieldMeasurePolicy(function12, z2, f2, paddingValues2);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = (OutlinedTextFieldMeasurePolicy) rememberedValue;
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            C13074a<ComposeUiNode> constructor = companion.getConstructor();
            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(modifier);
            int i11 = ((((i3 << 3) & 112) << 9) & 7168) | 6;
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer r2 = Updater.m35292constructorimpl(startRestartGroup);
            Updater.m35299setimpl(r2, outlinedTextFieldMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m35299setimpl(r2, density, companion.getSetDensity());
            Updater.m35299setimpl(r2, layoutDirection2, companion.getSetLayoutDirection());
            Updater.m35299setimpl(r2, viewConfiguration, companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i11 >> 3) & 112));
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-147819150);
            if (((i11 >> 9) & 14 & 11) != 2 || !startRestartGroup.getSkipping()) {
                oVar11.invoke(startRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                startRestartGroup.startReplaceableGroup(1116449790);
                if (oVar9 != null) {
                    Modifier then = LayoutIdKt.layoutId(Modifier.Companion, "Leading").then(TextFieldImplKt.getIconDefaultSizeModifier());
                    Alignment center = Alignment.Companion.getCenter();
                    startRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection3 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    C13074a<ComposeUiNode> constructor2 = companion.getConstructor();
                    C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf2 = LayoutKt.materializerOf(then);
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor2);
                    } else {
                        startRestartGroup.useNode();
                    }
                    startRestartGroup.disableReusing();
                    Composer r22 = Updater.m35292constructorimpl(startRestartGroup);
                    Updater.m35299setimpl(r22, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m35299setimpl(r22, density2, companion.getSetDensity());
                    Updater.m35299setimpl(r22, layoutDirection3, companion.getSetLayoutDirection());
                    Updater.m35299setimpl(r22, viewConfiguration2, companion.getSetViewConfiguration());
                    startRestartGroup.enableReusing();
                    materializerOf2.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(2058660585);
                    startRestartGroup.startReplaceableGroup(-2137368960);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    startRestartGroup.startReplaceableGroup(2127001777);
                    oVar9.invoke(startRestartGroup, Integer.valueOf((i3 >> 12) & 14));
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                }
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(1116450075);
                if (oVar10 != null) {
                    Modifier then2 = LayoutIdKt.layoutId(Modifier.Companion, "Trailing").then(TextFieldImplKt.getIconDefaultSizeModifier());
                    Alignment center2 = Alignment.Companion.getCenter();
                    startRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, startRestartGroup, 6);
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    Density density3 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection4 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration3 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    C13074a<ComposeUiNode> constructor3 = companion.getConstructor();
                    C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf3 = LayoutKt.materializerOf(then2);
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor3);
                    } else {
                        startRestartGroup.useNode();
                    }
                    startRestartGroup.disableReusing();
                    Composer r11 = Updater.m35292constructorimpl(startRestartGroup);
                    Updater.m35299setimpl(r11, rememberBoxMeasurePolicy2, companion.getSetMeasurePolicy());
                    Updater.m35299setimpl(r11, density3, companion.getSetDensity());
                    Updater.m35299setimpl(r11, layoutDirection4, companion.getSetLayoutDirection());
                    Updater.m35299setimpl(r11, viewConfiguration3, companion.getSetViewConfiguration());
                    startRestartGroup.enableReusing();
                    materializerOf3.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(2058660585);
                    startRestartGroup.startReplaceableGroup(-2137368960);
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    startRestartGroup.startReplaceableGroup(-827051110);
                    oVar10.invoke(startRestartGroup, Integer.valueOf((i3 >> 15) & 14));
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                }
                startRestartGroup.endReplaceableGroup();
                float calculateStartPadding = PaddingKt.calculateStartPadding(paddingValues2, layoutDirection);
                float calculateEndPadding = PaddingKt.calculateEndPadding(paddingValues2, layoutDirection);
                Modifier.Companion companion2 = Modifier.Companion;
                if (oVar9 != null) {
                    i5 = 0;
                    calculateStartPadding = C1232Dp.m38468constructorimpl(C13537l.m30876c(C1232Dp.m38468constructorimpl(calculateStartPadding - TextFieldImplKt.getHorizontalIconPadding()), C1232Dp.m38468constructorimpl((float) 0)));
                } else {
                    i5 = 0;
                }
                float f3 = calculateStartPadding;
                if (oVar10 != null) {
                    calculateEndPadding = C1232Dp.m38468constructorimpl(C13537l.m30876c(C1232Dp.m38468constructorimpl(calculateEndPadding - TextFieldImplKt.getHorizontalIconPadding()), C1232Dp.m38468constructorimpl((float) i5)));
                }
                Modifier r1 = PaddingKt.m33272paddingqDBjuR0$default(companion2, f3, 0.0f, calculateEndPadding, 0.0f, 10, (Object) null);
                startRestartGroup.startReplaceableGroup(1116451086);
                if (pVar2 != null) {
                    pVar2.invoke(LayoutIdKt.layoutId(companion2, "Hint").then(r1), startRestartGroup, Integer.valueOf((i3 >> 3) & 112));
                }
                startRestartGroup.endReplaceableGroup();
                Modifier then3 = LayoutIdKt.layoutId(companion2, "TextField").then(r1);
                startRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion3 = Alignment.Companion;
                MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), true, startRestartGroup, 48);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density4 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection5 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration4 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                C13074a<ComposeUiNode> constructor4 = companion.getConstructor();
                C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf4 = LayoutKt.materializerOf(then3);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor4);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer r0 = Updater.m35292constructorimpl(startRestartGroup);
                Updater.m35299setimpl(r0, rememberBoxMeasurePolicy3, companion.getSetMeasurePolicy());
                Updater.m35299setimpl(r0, density4, companion.getSetDensity());
                Updater.m35299setimpl(r0, layoutDirection5, companion.getSetLayoutDirection());
                Updater.m35299setimpl(r0, viewConfiguration4, companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf4.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(-475693524);
                oVar.invoke(startRestartGroup, Integer.valueOf((i3 >> 3) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(1116451412);
                C13088o<? super Composer, ? super Integer, C11921v> oVar15 = oVar2;
                if (oVar15 != null) {
                    Modifier layoutId = LayoutIdKt.layoutId(companion2, "Label");
                    startRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy rememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    Density density5 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection6 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration5 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    C13074a<ComposeUiNode> constructor5 = companion.getConstructor();
                    C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf5 = LayoutKt.materializerOf(layoutId);
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor5);
                    } else {
                        startRestartGroup.useNode();
                    }
                    startRestartGroup.disableReusing();
                    Composer r3 = Updater.m35292constructorimpl(startRestartGroup);
                    Updater.m35299setimpl(r3, rememberBoxMeasurePolicy4, companion.getSetMeasurePolicy());
                    Updater.m35299setimpl(r3, density5, companion.getSetDensity());
                    Updater.m35299setimpl(r3, layoutDirection6, companion.getSetLayoutDirection());
                    Updater.m35299setimpl(r3, viewConfiguration5, companion.getSetViewConfiguration());
                    startRestartGroup.enableReusing();
                    materializerOf5.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(2058660585);
                    startRestartGroup.startReplaceableGroup(-2137368960);
                    startRestartGroup.startReplaceableGroup(-1527117480);
                    oVar15.invoke(startRestartGroup, Integer.valueOf((i3 >> 9) & 14));
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                }
                startRestartGroup.endReplaceableGroup();
                C13088o<? super Composer, ? super Integer, C11921v> oVar16 = oVar6;
                if (oVar16 != null) {
                    Modifier padding = PaddingKt.padding(LayoutIdKt.layoutId(companion2, TextFieldImplKt.SupportingId), TextFieldDefaults.m34650supportingTextPaddinga9UjIt4$material3_release$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, (Object) null));
                    startRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy rememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    Density density6 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection7 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration6 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    C13074a<ComposeUiNode> constructor6 = companion.getConstructor();
                    C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf6 = LayoutKt.materializerOf(padding);
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor6);
                    } else {
                        startRestartGroup.useNode();
                    }
                    startRestartGroup.disableReusing();
                    Composer r5 = Updater.m35292constructorimpl(startRestartGroup);
                    Updater.m35299setimpl(r5, rememberBoxMeasurePolicy5, companion.getSetMeasurePolicy());
                    Updater.m35299setimpl(r5, density6, companion.getSetDensity());
                    Updater.m35299setimpl(r5, layoutDirection7, companion.getSetLayoutDirection());
                    Updater.m35299setimpl(r5, viewConfiguration6, companion.getSetViewConfiguration());
                    startRestartGroup.enableReusing();
                    materializerOf6.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(2058660585);
                    startRestartGroup.startReplaceableGroup(-2137368960);
                    startRestartGroup.startReplaceableGroup(270332983);
                    oVar16.invoke(startRestartGroup, Integer.valueOf(i8 & 14));
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                C13088o<? super Composer, ? super Integer, C11921v> oVar17 = oVar;
                C13088o<? super Composer, ? super Integer, C11921v> oVar18 = oVar2;
                C13088o<? super Composer, ? super Integer, C11921v> oVar19 = oVar6;
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            OutlinedTextFieldKt$OutlinedTextFieldLayout$2 outlinedTextFieldKt$OutlinedTextFieldLayout$2 = r0;
            OutlinedTextFieldKt$OutlinedTextFieldLayout$2 outlinedTextFieldKt$OutlinedTextFieldLayout$22 = new OutlinedTextFieldKt$OutlinedTextFieldLayout$2(modifier, oVar, pVar, oVar2, oVar3, oVar4, z, f, function1, oVar5, oVar6, paddingValues, i, i2);
            endRestartGroup.updateScope(outlinedTextFieldKt$OutlinedTextFieldLayout$2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: calculateHeight-O3s9Psw  reason: not valid java name */
    public static final int m34535calculateHeightO3s9Psw(int i, int i2, int i3, int i4, int i5, int i6, long j, float f, PaddingValues paddingValues) {
        return Math.max(Constraints.m38413getMinHeightimpl(j), Math.max(i, Math.max(i2, C13265c.m30134c(((float) Math.max(i3, i5)) + (paddingValues.m33278calculateBottomPaddingD9Ej5fM() * f) + Math.max(paddingValues.m33281calculateTopPaddingD9Ej5fM() * f, ((float) i4) / 2.0f)))) + i6);
    }

    /* access modifiers changed from: private */
    /* renamed from: calculateWidth-O3s9Psw  reason: not valid java name */
    public static final int m34536calculateWidthO3s9Psw(int i, int i2, int i3, int i4, int i5, boolean z, long j, float f, PaddingValues paddingValues) {
        int i6;
        int i7 = 0;
        if (z) {
            i6 = i4;
        } else {
            i6 = 0;
        }
        int max = i + Math.max(i3, Math.max(i6, i5)) + i2;
        if (!z) {
            LayoutDirection layoutDirection = LayoutDirection.Ltr;
            i7 = i4 + C13265c.m30134c(C1232Dp.m38468constructorimpl(paddingValues.m33279calculateLeftPaddingu2uoSUM(layoutDirection) + paddingValues.m33280calculateRightPaddingu2uoSUM(layoutDirection)) * f);
        }
        return Math.max(max, Math.max(i7, Constraints.m38414getMinWidthimpl(j)));
    }

    public static final float getOutlinedTextFieldTopPadding() {
        return OutlinedTextFieldTopPadding;
    }

    /* renamed from: outlineCutout-12SF9DM  reason: not valid java name */
    public static final Modifier m34537outlineCutout12SF9DM(Modifier modifier, long j, PaddingValues paddingValues) {
        C12775o.m28639i(modifier, "$this$outlineCutout");
        C12775o.m28639i(paddingValues, "paddingValues");
        return DrawModifierKt.drawWithContent(modifier, new OutlinedTextFieldKt$outlineCutout$1(j, paddingValues));
    }

    /* access modifiers changed from: private */
    public static final void place(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, float f, boolean z, float f2, LayoutDirection layoutDirection, PaddingValues paddingValues) {
        int i3;
        int i4;
        float f3;
        Placeable.PlacementScope.m37405place70tqf50$default(placementScope, placeable6, IntOffset.Companion.m38596getZeronOccac(), 0.0f, 2, (Object) null);
        int heightOrZero = i - TextFieldImplKt.heightOrZero(placeable7);
        int c = C13265c.m30134c(paddingValues.m33281calculateTopPaddingD9Ej5fM() * f2);
        int c2 = C13265c.m30134c(PaddingKt.calculateStartPadding(paddingValues, layoutDirection) * f2);
        float horizontalIconPadding = TextFieldImplKt.getHorizontalIconPadding() * f2;
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Alignment.Companion.getCenterVertically().align(placeable.getHeight(), heightOrZero), 0.0f, 4, (Object) null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i2 - placeable2.getWidth(), Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), heightOrZero), 0.0f, 4, (Object) null);
        }
        if (placeable4 != null) {
            if (z) {
                i4 = Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), heightOrZero);
            } else {
                i4 = c;
            }
            float f4 = ((float) 1) - f;
            float height = (((float) i4) * f4) - (((float) (placeable4.getHeight() / 2)) * f);
            if (placeable == null) {
                f3 = 0.0f;
            } else {
                f3 = f4 * (((float) TextFieldImplKt.widthOrZero(placeable)) - horizontalIconPadding);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, C13265c.m30134c(f3) + c2, C13265c.m30134c(height), 0.0f, 4, (Object) null);
        }
        if (z) {
            i3 = Alignment.Companion.getCenterVertically().align(placeable3.getHeight(), heightOrZero);
        } else {
            i3 = c;
        }
        Placeable.PlacementScope placementScope2 = placementScope;
        Placeable placeable8 = placeable3;
        Placeable.PlacementScope.placeRelative$default(placementScope2, placeable8, TextFieldImplKt.widthOrZero(placeable), Math.max(i3, TextFieldImplKt.heightOrZero(placeable4) / 2), 0.0f, 4, (Object) null);
        if (placeable5 != null) {
            if (z) {
                c = Alignment.Companion.getCenterVertically().align(placeable5.getHeight(), heightOrZero);
            }
            Placeable.PlacementScope placementScope3 = placementScope;
            Placeable placeable9 = placeable5;
            Placeable.PlacementScope.placeRelative$default(placementScope3, placeable9, TextFieldImplKt.widthOrZero(placeable), c, 0.0f, 4, (Object) null);
        }
        if (placeable7 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable7, 0, heightOrZero, 0.0f, 4, (Object) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01b4, code lost:
        if (r9.changed((java.lang.Object) r99) != false) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x01d1, code lost:
        if (r9.changed((java.lang.Object) r100) != false) goto L_0x01d8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x05b4  */
    /* JADX WARNING: Removed duplicated region for block: B:315:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0139  */
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void OutlinedTextField(androidx.compose.p002ui.text.input.TextFieldValue r86, kotlin.jvm.functions.Function1<? super androidx.compose.p002ui.text.input.TextFieldValue, p336ef.C11921v> r87, androidx.compose.p002ui.Modifier r88, boolean r89, boolean r90, androidx.compose.p002ui.text.TextStyle r91, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r92, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r93, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r94, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r95, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r96, boolean r97, androidx.compose.p002ui.text.input.VisualTransformation r98, androidx.compose.foundation.text.KeyboardOptions r99, androidx.compose.foundation.text.KeyboardActions r100, boolean r101, int r102, androidx.compose.foundation.interaction.MutableInteractionSource r103, androidx.compose.p002ui.graphics.Shape r104, androidx.compose.material3.TextFieldColors r105, androidx.compose.runtime.Composer r106, int r107, int r108, int r109) {
        /*
            r15 = r86
            r14 = r87
            r13 = r107
            r12 = r108
            r11 = r109
            java.lang.String r0 = "value"
            kotlin.jvm.internal.C12775o.m28639i(r15, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.C12775o.m28639i(r14, r0)
            r0 = 1040237435(0x3e00c37b, float:0.1257457)
            r1 = r106
            androidx.compose.runtime.Composer r9 = r1.startRestartGroup(r0)
            r1 = r11 & 1
            if (r1 == 0) goto L_0x0024
            r1 = r13 | 6
            goto L_0x0034
        L_0x0024:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x0033
            boolean r1 = r9.changed((java.lang.Object) r15)
            if (r1 == 0) goto L_0x0030
            r1 = 4
            goto L_0x0031
        L_0x0030:
            r1 = 2
        L_0x0031:
            r1 = r1 | r13
            goto L_0x0034
        L_0x0033:
            r1 = r13
        L_0x0034:
            r4 = r11 & 2
            if (r4 == 0) goto L_0x003b
            r1 = r1 | 48
            goto L_0x004b
        L_0x003b:
            r4 = r13 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004b
            boolean r4 = r9.changed((java.lang.Object) r14)
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
            goto L_0x0066
        L_0x0052:
            r10 = r13 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x0066
            r10 = r88
            boolean r16 = r9.changed((java.lang.Object) r10)
            if (r16 == 0) goto L_0x0061
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r1 = r1 | r16
            goto L_0x0068
        L_0x0066:
            r10 = r88
        L_0x0068:
            r16 = r11 & 8
            r17 = 2048(0x800, float:2.87E-42)
            r18 = 1024(0x400, float:1.435E-42)
            if (r16 == 0) goto L_0x0073
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0087
        L_0x0073:
            r2 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x0087
            r2 = r89
            boolean r19 = r9.changed((boolean) r2)
            if (r19 == 0) goto L_0x0082
            r19 = r17
            goto L_0x0084
        L_0x0082:
            r19 = r18
        L_0x0084:
            r1 = r1 | r19
            goto L_0x0089
        L_0x0087:
            r2 = r89
        L_0x0089:
            r19 = r11 & 16
            r20 = 16384(0x4000, float:2.2959E-41)
            r21 = 8192(0x2000, float:1.14794E-41)
            if (r19 == 0) goto L_0x0096
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r3 = r90
            goto L_0x00ac
        L_0x0096:
            r22 = 57344(0xe000, float:8.0356E-41)
            r22 = r13 & r22
            r3 = r90
            if (r22 != 0) goto L_0x00ac
            boolean r23 = r9.changed((boolean) r3)
            if (r23 == 0) goto L_0x00a8
            r23 = r20
            goto L_0x00aa
        L_0x00a8:
            r23 = r21
        L_0x00aa:
            r1 = r1 | r23
        L_0x00ac:
            r23 = 458752(0x70000, float:6.42848E-40)
            r23 = r13 & r23
            r24 = 131072(0x20000, float:1.83671E-40)
            r25 = 65536(0x10000, float:9.18355E-41)
            if (r23 != 0) goto L_0x00ca
            r23 = r11 & 32
            r5 = r91
            if (r23 != 0) goto L_0x00c5
            boolean r26 = r9.changed((java.lang.Object) r5)
            if (r26 == 0) goto L_0x00c5
            r26 = r24
            goto L_0x00c7
        L_0x00c5:
            r26 = r25
        L_0x00c7:
            r1 = r1 | r26
            goto L_0x00cc
        L_0x00ca:
            r5 = r91
        L_0x00cc:
            r26 = r11 & 64
            r27 = 524288(0x80000, float:7.34684E-40)
            if (r26 == 0) goto L_0x00d9
            r28 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r28
            r6 = r92
            goto L_0x00ee
        L_0x00d9:
            r28 = 3670016(0x380000, float:5.142788E-39)
            r28 = r13 & r28
            r6 = r92
            if (r28 != 0) goto L_0x00ee
            boolean r29 = r9.changed((java.lang.Object) r6)
            if (r29 == 0) goto L_0x00ea
            r29 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ec
        L_0x00ea:
            r29 = r27
        L_0x00ec:
            r1 = r1 | r29
        L_0x00ee:
            r7 = r11 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x00f9
            r30 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r30
            r8 = r93
            goto L_0x010e
        L_0x00f9:
            r30 = 29360128(0x1c00000, float:7.052966E-38)
            r30 = r13 & r30
            r8 = r93
            if (r30 != 0) goto L_0x010e
            boolean r31 = r9.changed((java.lang.Object) r8)
            if (r31 == 0) goto L_0x010a
            r31 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x010c
        L_0x010a:
            r31 = 4194304(0x400000, float:5.877472E-39)
        L_0x010c:
            r1 = r1 | r31
        L_0x010e:
            r0 = r11 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0119
            r31 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r31
            r2 = r94
            goto L_0x012e
        L_0x0119:
            r31 = 234881024(0xe000000, float:1.5777218E-30)
            r31 = r13 & r31
            r2 = r94
            if (r31 != 0) goto L_0x012e
            boolean r31 = r9.changed((java.lang.Object) r2)
            if (r31 == 0) goto L_0x012a
            r31 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x012c
        L_0x012a:
            r31 = 33554432(0x2000000, float:9.403955E-38)
        L_0x012c:
            r1 = r1 | r31
        L_0x012e:
            r2 = r11 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x0139
            r31 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r31
            r3 = r95
            goto L_0x014e
        L_0x0139:
            r31 = 1879048192(0x70000000, float:1.58456325E29)
            r31 = r13 & r31
            r3 = r95
            if (r31 != 0) goto L_0x014e
            boolean r31 = r9.changed((java.lang.Object) r3)
            if (r31 == 0) goto L_0x014a
            r31 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x014c
        L_0x014a:
            r31 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x014c:
            r1 = r1 | r31
        L_0x014e:
            r3 = r11 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0157
            r22 = r12 | 6
            r5 = r96
            goto L_0x016d
        L_0x0157:
            r31 = r12 & 14
            r5 = r96
            if (r31 != 0) goto L_0x016b
            boolean r31 = r9.changed((java.lang.Object) r5)
            if (r31 == 0) goto L_0x0166
            r22 = 4
            goto L_0x0168
        L_0x0166:
            r22 = 2
        L_0x0168:
            r22 = r12 | r22
            goto L_0x016d
        L_0x016b:
            r22 = r12
        L_0x016d:
            r5 = r11 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x0174
            r22 = r22 | 48
            goto L_0x0187
        L_0x0174:
            r31 = r12 & 112(0x70, float:1.57E-43)
            r6 = r97
            if (r31 != 0) goto L_0x0187
            boolean r31 = r9.changed((boolean) r6)
            if (r31 == 0) goto L_0x0183
            r28 = 32
            goto L_0x0185
        L_0x0183:
            r28 = 16
        L_0x0185:
            r22 = r22 | r28
        L_0x0187:
            r6 = r22
            r8 = r11 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto L_0x0190
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x01a4
        L_0x0190:
            r10 = r12 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x01a4
            r10 = r98
            boolean r22 = r9.changed((java.lang.Object) r10)
            if (r22 == 0) goto L_0x019f
            r29 = 256(0x100, float:3.59E-43)
            goto L_0x01a1
        L_0x019f:
            r29 = 128(0x80, float:1.794E-43)
        L_0x01a1:
            r6 = r6 | r29
            goto L_0x01a6
        L_0x01a4:
            r10 = r98
        L_0x01a6:
            r10 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x01be
            r10 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r10 != 0) goto L_0x01b7
            r10 = r99
            boolean r22 = r9.changed((java.lang.Object) r10)
            if (r22 == 0) goto L_0x01b9
            goto L_0x01bb
        L_0x01b7:
            r10 = r99
        L_0x01b9:
            r17 = r18
        L_0x01bb:
            r6 = r6 | r17
            goto L_0x01c0
        L_0x01be:
            r10 = r99
        L_0x01c0:
            r17 = 57344(0xe000, float:8.0356E-41)
            r17 = r12 & r17
            if (r17 != 0) goto L_0x01db
            r10 = r11 & 16384(0x4000, float:2.2959E-41)
            if (r10 != 0) goto L_0x01d4
            r10 = r100
            boolean r17 = r9.changed((java.lang.Object) r10)
            if (r17 == 0) goto L_0x01d6
            goto L_0x01d8
        L_0x01d4:
            r10 = r100
        L_0x01d6:
            r20 = r21
        L_0x01d8:
            r6 = r6 | r20
            goto L_0x01dd
        L_0x01db:
            r10 = r100
        L_0x01dd:
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r11 & r17
            if (r17 == 0) goto L_0x01eb
            r18 = 196608(0x30000, float:2.75506E-40)
            r6 = r6 | r18
            r10 = r101
            goto L_0x0200
        L_0x01eb:
            r18 = 458752(0x70000, float:6.42848E-40)
            r18 = r12 & r18
            r10 = r101
            if (r18 != 0) goto L_0x0200
            boolean r18 = r9.changed((boolean) r10)
            if (r18 == 0) goto L_0x01fc
            r18 = r24
            goto L_0x01fe
        L_0x01fc:
            r18 = r25
        L_0x01fe:
            r6 = r6 | r18
        L_0x0200:
            r18 = r11 & r25
            if (r18 == 0) goto L_0x020b
            r20 = 1572864(0x180000, float:2.204052E-39)
            r6 = r6 | r20
            r10 = r102
            goto L_0x0220
        L_0x020b:
            r20 = 3670016(0x380000, float:5.142788E-39)
            r20 = r12 & r20
            r10 = r102
            if (r20 != 0) goto L_0x0220
            boolean r20 = r9.changed((int) r10)
            if (r20 == 0) goto L_0x021c
            r20 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x021e
        L_0x021c:
            r20 = r27
        L_0x021e:
            r6 = r6 | r20
        L_0x0220:
            r20 = r11 & r24
            if (r20 == 0) goto L_0x022b
            r21 = 12582912(0xc00000, float:1.7632415E-38)
            r6 = r6 | r21
            r10 = r103
            goto L_0x0240
        L_0x022b:
            r21 = 29360128(0x1c00000, float:7.052966E-38)
            r21 = r12 & r21
            r10 = r103
            if (r21 != 0) goto L_0x0240
            boolean r21 = r9.changed((java.lang.Object) r10)
            if (r21 == 0) goto L_0x023c
            r21 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x023e
        L_0x023c:
            r21 = 4194304(0x400000, float:5.877472E-39)
        L_0x023e:
            r6 = r6 | r21
        L_0x0240:
            r21 = 234881024(0xe000000, float:1.5777218E-30)
            r21 = r12 & r21
            r22 = 262144(0x40000, float:3.67342E-40)
            if (r21 != 0) goto L_0x025c
            r21 = r11 & r22
            r10 = r104
            if (r21 != 0) goto L_0x0257
            boolean r21 = r9.changed((java.lang.Object) r10)
            if (r21 == 0) goto L_0x0257
            r21 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0259
        L_0x0257:
            r21 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0259:
            r6 = r6 | r21
            goto L_0x025e
        L_0x025c:
            r10 = r104
        L_0x025e:
            r21 = 1879048192(0x70000000, float:1.58456325E29)
            r21 = r12 & r21
            if (r21 != 0) goto L_0x0278
            r21 = r11 & r27
            r10 = r105
            if (r21 != 0) goto L_0x0273
            boolean r21 = r9.changed((java.lang.Object) r10)
            if (r21 == 0) goto L_0x0273
            r21 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0275
        L_0x0273:
            r21 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0275:
            r6 = r6 | r21
            goto L_0x027a
        L_0x0278:
            r10 = r105
        L_0x027a:
            r21 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r10 = r1 & r21
            r12 = 306783378(0x12492492, float:6.3469493E-28)
            if (r10 != r12) goto L_0x02be
            r10 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r10 = r10 & r6
            r12 = 306783378(0x12492492, float:6.3469493E-28)
            if (r10 != r12) goto L_0x02be
            boolean r10 = r9.getSkipping()
            if (r10 != 0) goto L_0x0294
            goto L_0x02be
        L_0x0294:
            r9.skipToGroupEnd()
            r3 = r88
            r4 = r89
            r5 = r90
            r6 = r91
            r7 = r92
            r8 = r93
            r10 = r95
            r11 = r96
            r12 = r97
            r13 = r98
            r14 = r99
            r15 = r100
            r16 = r101
            r17 = r102
            r18 = r103
            r19 = r104
            r20 = r105
            r1 = r9
            r9 = r94
            goto L_0x05ad
        L_0x02be:
            r9.startDefaults()
            r10 = r13 & 1
            if (r10 == 0) goto L_0x0344
            boolean r10 = r9.getDefaultsInvalid()
            if (r10 == 0) goto L_0x02cd
            goto L_0x0344
        L_0x02cd:
            r9.skipToGroupEnd()
            r0 = r11 & 32
            if (r0 == 0) goto L_0x02d8
            r0 = -458753(0xfffffffffff8ffff, float:NaN)
            r1 = r1 & r0
        L_0x02d8:
            r0 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x02de
            r6 = r6 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x02de:
            r0 = r11 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x02e6
            r0 = -57345(0xffffffffffff1fff, float:NaN)
            r6 = r6 & r0
        L_0x02e6:
            r0 = r11 & r22
            if (r0 == 0) goto L_0x02ee
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r6 = r6 & r0
        L_0x02ee:
            r0 = r11 & r27
            if (r0 == 0) goto L_0x031c
            r0 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r0 = r0 & r6
            r23 = r88
            r12 = r89
            r77 = r90
            r8 = r91
            r78 = r92
            r24 = r93
            r25 = r94
            r26 = r95
            r27 = r96
            r28 = r97
            r29 = r98
            r30 = r99
            r31 = r100
            r79 = r101
            r80 = r102
            r32 = r103
            r33 = r104
            r7 = r105
            r5 = r0
            goto L_0x0341
        L_0x031c:
            r23 = r88
            r12 = r89
            r77 = r90
            r8 = r91
            r78 = r92
            r24 = r93
            r25 = r94
            r26 = r95
            r27 = r96
            r28 = r97
            r29 = r98
            r30 = r99
            r31 = r100
            r79 = r101
            r80 = r102
            r32 = r103
            r33 = r104
            r7 = r105
            r5 = r6
        L_0x0341:
            r6 = r1
            goto L_0x04a4
        L_0x0344:
            if (r4 == 0) goto L_0x0349
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x034b
        L_0x0349:
            r4 = r88
        L_0x034b:
            if (r16 == 0) goto L_0x034f
            r10 = 1
            goto L_0x0351
        L_0x034f:
            r10 = r89
        L_0x0351:
            if (r19 == 0) goto L_0x0356
            r77 = 0
            goto L_0x0358
        L_0x0356:
            r77 = r90
        L_0x0358:
            r16 = r11 & 32
            if (r16 == 0) goto L_0x036c
            androidx.compose.runtime.ProvidableCompositionLocal r12 = androidx.compose.material3.TextKt.getLocalTextStyle()
            java.lang.Object r12 = r9.consume(r12)
            androidx.compose.ui.text.TextStyle r12 = (androidx.compose.p002ui.text.TextStyle) r12
            r16 = -458753(0xfffffffffff8ffff, float:NaN)
            r1 = r1 & r16
            goto L_0x036e
        L_0x036c:
            r12 = r91
        L_0x036e:
            r16 = 0
            if (r26 == 0) goto L_0x0375
            r78 = r16
            goto L_0x0377
        L_0x0375:
            r78 = r92
        L_0x0377:
            if (r7 == 0) goto L_0x037c
            r7 = r16
            goto L_0x037e
        L_0x037c:
            r7 = r93
        L_0x037e:
            if (r0 == 0) goto L_0x0383
            r0 = r16
            goto L_0x0385
        L_0x0383:
            r0 = r94
        L_0x0385:
            if (r2 == 0) goto L_0x038a
            r2 = r16
            goto L_0x038c
        L_0x038a:
            r2 = r95
        L_0x038c:
            if (r3 == 0) goto L_0x0391
            r3 = r16
            goto L_0x0393
        L_0x0391:
            r3 = r96
        L_0x0393:
            if (r5 == 0) goto L_0x0397
            r5 = 0
            goto L_0x0399
        L_0x0397:
            r5 = r97
        L_0x0399:
            if (r8 == 0) goto L_0x03a2
            androidx.compose.ui.text.input.VisualTransformation$Companion r8 = androidx.compose.p002ui.text.input.VisualTransformation.Companion
            androidx.compose.ui.text.input.VisualTransformation r8 = r8.getNone()
            goto L_0x03a4
        L_0x03a2:
            r8 = r98
        L_0x03a4:
            r88 = r0
            r0 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x03b3
            androidx.compose.foundation.text.KeyboardOptions$Companion r0 = androidx.compose.foundation.text.KeyboardOptions.Companion
            androidx.compose.foundation.text.KeyboardOptions r0 = r0.getDefault()
            r6 = r6 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x03b5
        L_0x03b3:
            r0 = r99
        L_0x03b5:
            r89 = r0
            r0 = r11 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x03c7
            androidx.compose.foundation.text.KeyboardActions$Companion r0 = androidx.compose.foundation.text.KeyboardActions.Companion
            androidx.compose.foundation.text.KeyboardActions r0 = r0.getDefault()
            r16 = -57345(0xffffffffffff1fff, float:NaN)
            r6 = r6 & r16
            goto L_0x03c9
        L_0x03c7:
            r0 = r100
        L_0x03c9:
            if (r17 == 0) goto L_0x03ce
            r79 = 0
            goto L_0x03d0
        L_0x03ce:
            r79 = r101
        L_0x03d0:
            if (r18 == 0) goto L_0x03d8
            r16 = 2147483647(0x7fffffff, float:NaN)
            r80 = r16
            goto L_0x03da
        L_0x03d8:
            r80 = r102
        L_0x03da:
            r90 = r0
            if (r20 == 0) goto L_0x03ff
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r9.startReplaceableGroup(r0)
            java.lang.Object r0 = r9.rememberedValue()
            androidx.compose.runtime.Composer$Companion r16 = androidx.compose.runtime.Composer.Companion
            r91 = r1
            java.lang.Object r1 = r16.getEmpty()
            if (r0 != r1) goto L_0x03f9
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r9.updateRememberedValue(r0)
        L_0x03f9:
            r9.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = (androidx.compose.foundation.interaction.MutableInteractionSource) r0
            goto L_0x0403
        L_0x03ff:
            r91 = r1
            r0 = r103
        L_0x0403:
            r1 = r11 & r22
            if (r1 == 0) goto L_0x0415
            androidx.compose.material3.TextFieldDefaults r1 = androidx.compose.material3.TextFieldDefaults.INSTANCE
            r92 = r0
            r0 = 6
            androidx.compose.ui.graphics.Shape r0 = r1.getOutlinedShape(r9, r0)
            r1 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r6 = r6 & r1
            goto L_0x0419
        L_0x0415:
            r92 = r0
            r0 = r104
        L_0x0419:
            r1 = r11 & r27
            if (r1 == 0) goto L_0x0487
            androidx.compose.material3.TextFieldDefaults r16 = androidx.compose.material3.TextFieldDefaults.INSTANCE
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r30 = 0
            r32 = 0
            r34 = 0
            r36 = 0
            r38 = 0
            r40 = 0
            r42 = 0
            r44 = 0
            r46 = 0
            r48 = 0
            r50 = 0
            r52 = 0
            r54 = 0
            r56 = 0
            r58 = 0
            r60 = 0
            r62 = 0
            r64 = 0
            r66 = 0
            r68 = 0
            r70 = 0
            r73 = 0
            r74 = 0
            r75 = 100663296(0x6000000, float:2.4074124E-35)
            r76 = 268435455(0xfffffff, float:2.5243547E-29)
            r72 = r9
            androidx.compose.material3.TextFieldColors r1 = r16.m34659outlinedTextFieldColorsl59Burw(r17, r19, r21, r23, r25, r27, r28, r30, r32, r34, r36, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64, r66, r68, r70, r72, r73, r74, r75, r76)
            r16 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r6 = r6 & r16
            r25 = r88
            r30 = r89
            r31 = r90
            r32 = r92
            r33 = r0
            r26 = r2
            r27 = r3
            r23 = r4
            r28 = r5
            r5 = r6
            r24 = r7
            r29 = r8
            r8 = r12
            r6 = r91
            r7 = r1
            goto L_0x04a3
        L_0x0487:
            r25 = r88
            r30 = r89
            r31 = r90
            r32 = r92
            r33 = r0
            r26 = r2
            r27 = r3
            r23 = r4
            r28 = r5
            r5 = r6
            r24 = r7
            r29 = r8
            r8 = r12
            r6 = r91
            r7 = r105
        L_0x04a3:
            r12 = r10
        L_0x04a4:
            r9.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x04b5
            java.lang.String r0 = "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:283)"
            r1 = 1040237435(0x3e00c37b, float:0.1257457)
            androidx.compose.runtime.ComposerKt.traceEventStart(r1, r6, r5, r0)
        L_0x04b5:
            r0 = 1663543409(0x6327a871, float:3.0927437E21)
            r9.startReplaceableGroup(r0)
            long r0 = r8.m37995getColor0d7_KjU()
            androidx.compose.ui.graphics.Color$Companion r2 = androidx.compose.p002ui.graphics.Color.Companion
            long r2 = r2.m35707getUnspecified0d7_KjU()
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x04cb
            r2 = 1
            goto L_0x04cc
        L_0x04cb:
            r2 = 0
        L_0x04cc:
            if (r2 == 0) goto L_0x04cf
            goto L_0x04e6
        L_0x04cf:
            int r0 = r6 >> 9
            r0 = r0 & 14
            int r1 = r5 >> 24
            r1 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            androidx.compose.runtime.State r0 = r7.textColor$material3_release(r12, r9, r0)
            java.lang.Object r0 = r0.getValue()
            androidx.compose.ui.graphics.Color r0 = (androidx.compose.p002ui.graphics.Color) r0
            long r0 = r0.m35681unboximpl()
        L_0x04e6:
            r35 = r0
            r9.endReplaceableGroup()
            androidx.compose.ui.text.TextStyle r0 = new androidx.compose.ui.text.TextStyle
            r34 = r0
            r37 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r57 = 0
            r58 = 262142(0x3fffe, float:3.67339E-40)
            r59 = 0
            r34.<init>((long) r35, (long) r37, (androidx.compose.p002ui.text.font.FontWeight) r39, (androidx.compose.p002ui.text.font.FontStyle) r40, (androidx.compose.p002ui.text.font.FontSynthesis) r41, (androidx.compose.p002ui.text.font.FontFamily) r42, (java.lang.String) r43, (long) r44, (androidx.compose.p002ui.text.style.BaselineShift) r46, (androidx.compose.p002ui.text.style.TextGeometricTransform) r47, (androidx.compose.p002ui.text.intl.LocaleList) r48, (long) r49, (androidx.compose.p002ui.text.style.TextDecoration) r51, (androidx.compose.p002ui.graphics.Shadow) r52, (androidx.compose.p002ui.text.style.TextAlign) r53, (androidx.compose.p002ui.text.style.TextDirection) r54, (long) r55, (androidx.compose.p002ui.text.style.TextIndent) r57, (int) r58, (kotlin.jvm.internal.DefaultConstructorMarker) r59)
            androidx.compose.ui.text.TextStyle r10 = r8.merge((androidx.compose.p002ui.text.TextStyle) r0)
            r4 = 1
            androidx.compose.runtime.ProvidedValue[] r3 = new androidx.compose.runtime.ProvidedValue[r4]
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.foundation.text.selection.TextSelectionColorsKt.getLocalTextSelectionColors()
            int r1 = r5 >> 27
            r1 = r1 & 14
            androidx.compose.foundation.text.selection.TextSelectionColors r1 = r7.getSelectionColors(r9, r1)
            androidx.compose.runtime.ProvidedValue r0 = r0.provides(r1)
            r1 = 0
            r3[r1] = r0
            androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5 r2 = new androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5
            r0 = r2
            r1 = r78
            r81 = r2
            r2 = r23
            r82 = r3
            r3 = r7
            r16 = r4
            r4 = r28
            r17 = r6
            r6 = r86
            r34 = r7
            r7 = r87
            r35 = r8
            r8 = r12
            r83 = r9
            r9 = r77
            r11 = r30
            r36 = r12
            r12 = r31
            r13 = r79
            r14 = r80
            r15 = r29
            r16 = r32
            r18 = r24
            r19 = r25
            r20 = r26
            r21 = r27
            r22 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r0 = -719341509(0xffffffffd51fb83b, float:-1.09758508E13)
            r2 = r81
            r1 = r83
            r3 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r1, r0, r3, r2)
            r2 = 56
            r3 = r82
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) r3, (p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v>) r0, (androidx.compose.runtime.Composer) r1, (int) r2)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0589
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0589:
            r3 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            r12 = r28
            r13 = r29
            r14 = r30
            r15 = r31
            r18 = r32
            r19 = r33
            r20 = r34
            r6 = r35
            r4 = r36
            r5 = r77
            r7 = r78
            r16 = r79
            r17 = r80
        L_0x05ad:
            androidx.compose.runtime.ScopeUpdateScope r2 = r1.endRestartGroup()
            if (r2 != 0) goto L_0x05b4
            goto L_0x05cf
        L_0x05b4:
            androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$6 r1 = new androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$6
            r0 = r1
            r84 = r1
            r1 = r86
            r85 = r2
            r2 = r87
            r21 = r107
            r22 = r108
            r23 = r109
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r1 = r84
            r0 = r85
            r0.updateScope(r1)
        L_0x05cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, of.o, of.o, of.o, of.o, of.o, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
