package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.draw.DrawModifierKt;
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
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextField.kt\nandroidx/compose/material/TextFieldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,929:1\n76#2:930\n76#2:940\n76#2:948\n76#2:958\n76#2:976\n76#2:978\n76#2:1007\n76#2:1044\n76#2:1088\n76#2:1126\n25#3:931\n25#3:941\n25#3:949\n25#3:959\n67#3,3:966\n66#3:969\n456#3,11:990\n460#3,13:1019\n473#3,3:1033\n460#3,13:1056\n473#3,3:1070\n460#3,13:1100\n473#3,3:1114\n460#3,13:1138\n473#3,3:1152\n467#3,3:1157\n1114#4,6:932\n1114#4,6:942\n1114#4,6:950\n1114#4,6:960\n1114#4,6:970\n658#5:938\n646#5:939\n658#5:956\n646#5:957\n74#6:977\n75#6,11:979\n75#6:1006\n76#6,11:1008\n89#6:1036\n75#6:1043\n76#6,11:1045\n89#6:1073\n75#6:1087\n76#6,11:1089\n89#6:1117\n75#6:1125\n76#6,11:1127\n89#6:1155\n88#6:1160\n68#7,5:1001\n73#7:1032\n77#7:1037\n68#7,5:1038\n73#7:1069\n77#7:1074\n67#7,6:1081\n73#7:1113\n77#7:1118\n67#7,6:1119\n73#7:1151\n77#7:1156\n58#8:1075\n58#8:1078\n154#9:1076\n211#9:1077\n154#9:1079\n211#9:1080\n154#9:1161\n154#9:1162\n154#9:1163\n*S KotlinDebug\n*F\n+ 1 TextField.kt\nandroidx/compose/material/TextFieldKt\n*L\n165#1:930\n241#1:940\n354#1:948\n429#1:958\n487#1:976\n488#1:978\n492#1:1007\n500#1:1044\n528#1:1088\n530#1:1126\n177#1:931\n252#1:941\n366#1:949\n440#1:959\n484#1:966,3\n484#1:969\n488#1:990,11\n492#1:1019,13\n492#1:1033,3\n500#1:1056,13\n500#1:1070,3\n528#1:1100,13\n528#1:1114,3\n530#1:1138,13\n530#1:1152,3\n488#1:1157,3\n177#1:932,6\n252#1:942,6\n366#1:950,6\n440#1:960,6\n484#1:970,6\n183#1:938\n183#1:939\n371#1:956\n371#1:957\n488#1:977\n488#1:979,11\n492#1:1006\n492#1:1008,11\n492#1:1036\n500#1:1043\n500#1:1045,11\n500#1:1073\n528#1:1087\n528#1:1089,11\n528#1:1117\n530#1:1125\n530#1:1127,11\n530#1:1155\n488#1:1160\n492#1:1001,5\n492#1:1032\n492#1:1037\n500#1:1038,5\n500#1:1069\n500#1:1074\n528#1:1081,6\n528#1:1113\n528#1:1118\n530#1:1119,6\n530#1:1151\n530#1:1156\n512#1:1075\n519#1:1078\n513#1:1076\n512#1:1077\n519#1:1079\n519#1:1080\n922#1:1161\n925#1:1162\n929#1:1163\n*E\n"})
/* compiled from: TextField.kt */
public final class TextFieldKt {
    private static final float FirstBaselineOffset = C1232Dp.m38468constructorimpl((float) 20);
    private static final float TextFieldBottomPadding = C1232Dp.m38468constructorimpl((float) 10);
    private static final float TextFieldTopPadding = C1232Dp.m38468constructorimpl((float) 4);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: androidx.compose.foundation.interaction.MutableInteractionSource} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v46, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v40, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v15, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v49, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v51, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v53, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v9, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v55, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v58, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v60, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v14, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v61, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v63, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v64, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v66, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v69, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v71, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v72, resolved type: int} */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01b1, code lost:
        if (r7.changed((java.lang.Object) r87) != false) goto L_0x01b8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x065c  */
    /* JADX WARNING: Removed duplicated region for block: B:312:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0136  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void TextField(java.lang.String r74, kotlin.jvm.functions.Function1<? super java.lang.String, p336ef.C11921v> r75, androidx.compose.p002ui.Modifier r76, boolean r77, boolean r78, androidx.compose.p002ui.text.TextStyle r79, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r80, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r81, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r82, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r83, boolean r84, androidx.compose.p002ui.text.input.VisualTransformation r85, androidx.compose.foundation.text.KeyboardOptions r86, androidx.compose.foundation.text.KeyboardActions r87, boolean r88, int r89, int r90, androidx.compose.foundation.interaction.MutableInteractionSource r91, androidx.compose.p002ui.graphics.Shape r92, androidx.compose.material.TextFieldColors r93, androidx.compose.runtime.Composer r94, int r95, int r96, int r97) {
        /*
            r13 = r74
            r11 = r75
            r10 = r95
            r9 = r96
            r8 = r97
            java.lang.String r0 = "value"
            kotlin.jvm.internal.C12775o.m28639i(r13, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.C12775o.m28639i(r11, r0)
            r0 = -1504264404(0xffffffffa656bf2c, float:-7.450525E-16)
            r1 = r94
            androidx.compose.runtime.Composer r7 = r1.startRestartGroup(r0)
            r0 = r8 & 1
            if (r0 == 0) goto L_0x0024
            r0 = r10 | 6
            goto L_0x0034
        L_0x0024:
            r0 = r10 & 14
            if (r0 != 0) goto L_0x0033
            boolean r0 = r7.changed((java.lang.Object) r13)
            if (r0 == 0) goto L_0x0030
            r0 = 4
            goto L_0x0031
        L_0x0030:
            r0 = 2
        L_0x0031:
            r0 = r0 | r10
            goto L_0x0034
        L_0x0033:
            r0 = r10
        L_0x0034:
            r3 = r8 & 2
            if (r3 == 0) goto L_0x003b
            r0 = r0 | 48
            goto L_0x004b
        L_0x003b:
            r3 = r10 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004b
            boolean r3 = r7.changedInstance(r11)
            if (r3 == 0) goto L_0x0048
            r3 = 32
            goto L_0x004a
        L_0x0048:
            r3 = 16
        L_0x004a:
            r0 = r0 | r3
        L_0x004b:
            r3 = r8 & 4
            if (r3 == 0) goto L_0x0052
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0065
        L_0x0052:
            r14 = r10 & 896(0x380, float:1.256E-42)
            if (r14 != 0) goto L_0x0065
            r14 = r76
            boolean r15 = r7.changed((java.lang.Object) r14)
            if (r15 == 0) goto L_0x0061
            r15 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r15 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r0 = r0 | r15
            goto L_0x0067
        L_0x0065:
            r14 = r76
        L_0x0067:
            r15 = r8 & 8
            r16 = 2048(0x800, float:2.87E-42)
            r17 = 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L_0x0072
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0086
        L_0x0072:
            r1 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x0086
            r1 = r77
            boolean r18 = r7.changed((boolean) r1)
            if (r18 == 0) goto L_0x0081
            r18 = r16
            goto L_0x0083
        L_0x0081:
            r18 = r17
        L_0x0083:
            r0 = r0 | r18
            goto L_0x0088
        L_0x0086:
            r1 = r77
        L_0x0088:
            r18 = r8 & 16
            r19 = 16384(0x4000, float:2.2959E-41)
            r62 = 57344(0xe000, float:8.0356E-41)
            r20 = 8192(0x2000, float:1.14794E-41)
            if (r18 == 0) goto L_0x0098
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r2 = r78
            goto L_0x00ab
        L_0x0098:
            r21 = r10 & r62
            r2 = r78
            if (r21 != 0) goto L_0x00ab
            boolean r22 = r7.changed((boolean) r2)
            if (r22 == 0) goto L_0x00a7
            r22 = r19
            goto L_0x00a9
        L_0x00a7:
            r22 = r20
        L_0x00a9:
            r0 = r0 | r22
        L_0x00ab:
            r22 = 458752(0x70000, float:6.42848E-40)
            r22 = r10 & r22
            r23 = 65536(0x10000, float:9.18355E-41)
            if (r22 != 0) goto L_0x00c7
            r22 = r8 & 32
            r4 = r79
            if (r22 != 0) goto L_0x00c2
            boolean r24 = r7.changed((java.lang.Object) r4)
            if (r24 == 0) goto L_0x00c2
            r24 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c4
        L_0x00c2:
            r24 = r23
        L_0x00c4:
            r0 = r0 | r24
            goto L_0x00c9
        L_0x00c7:
            r4 = r79
        L_0x00c9:
            r24 = r8 & 64
            r63 = 3670016(0x380000, float:5.142788E-39)
            r25 = 524288(0x80000, float:7.34684E-40)
            if (r24 == 0) goto L_0x00d8
            r26 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 | r26
            r5 = r80
            goto L_0x00eb
        L_0x00d8:
            r26 = r10 & r63
            r5 = r80
            if (r26 != 0) goto L_0x00eb
            boolean r27 = r7.changedInstance(r5)
            if (r27 == 0) goto L_0x00e7
            r27 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e9
        L_0x00e7:
            r27 = r25
        L_0x00e9:
            r0 = r0 | r27
        L_0x00eb:
            r6 = r8 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x00f6
            r28 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r28
            r12 = r81
            goto L_0x010b
        L_0x00f6:
            r28 = 29360128(0x1c00000, float:7.052966E-38)
            r28 = r10 & r28
            r12 = r81
            if (r28 != 0) goto L_0x010b
            boolean r29 = r7.changedInstance(r12)
            if (r29 == 0) goto L_0x0107
            r29 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0109
        L_0x0107:
            r29 = 4194304(0x400000, float:5.877472E-39)
        L_0x0109:
            r0 = r0 | r29
        L_0x010b:
            r1 = r8 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0116
            r29 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 | r29
            r2 = r82
            goto L_0x012b
        L_0x0116:
            r29 = 234881024(0xe000000, float:1.5777218E-30)
            r29 = r10 & r29
            r2 = r82
            if (r29 != 0) goto L_0x012b
            boolean r29 = r7.changedInstance(r2)
            if (r29 == 0) goto L_0x0127
            r29 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0129
        L_0x0127:
            r29 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0129:
            r0 = r0 | r29
        L_0x012b:
            r2 = r8 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x0136
            r29 = 805306368(0x30000000, float:4.656613E-10)
            r0 = r0 | r29
            r4 = r83
            goto L_0x014b
        L_0x0136:
            r29 = 1879048192(0x70000000, float:1.58456325E29)
            r29 = r10 & r29
            r4 = r83
            if (r29 != 0) goto L_0x014b
            boolean r29 = r7.changedInstance(r4)
            if (r29 == 0) goto L_0x0147
            r29 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0149
        L_0x0147:
            r29 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0149:
            r0 = r0 | r29
        L_0x014b:
            r4 = r8 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x0154
            r21 = r9 | 6
            r5 = r84
            goto L_0x016a
        L_0x0154:
            r29 = r9 & 14
            r5 = r84
            if (r29 != 0) goto L_0x0168
            boolean r29 = r7.changed((boolean) r5)
            if (r29 == 0) goto L_0x0163
            r21 = 4
            goto L_0x0165
        L_0x0163:
            r21 = 2
        L_0x0165:
            r21 = r9 | r21
            goto L_0x016a
        L_0x0168:
            r21 = r9
        L_0x016a:
            r5 = r8 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x0171
            r21 = r21 | 48
            goto L_0x0184
        L_0x0171:
            r29 = r9 & 112(0x70, float:1.57E-43)
            r11 = r85
            if (r29 != 0) goto L_0x0184
            boolean r29 = r7.changed((java.lang.Object) r11)
            if (r29 == 0) goto L_0x0180
            r26 = 32
            goto L_0x0182
        L_0x0180:
            r26 = 16
        L_0x0182:
            r21 = r21 | r26
        L_0x0184:
            r11 = r21
            r12 = r8 & 4096(0x1000, float:5.74E-42)
            if (r12 == 0) goto L_0x018d
            r11 = r11 | 384(0x180, float:5.38E-43)
            goto L_0x01a1
        L_0x018d:
            r13 = r9 & 896(0x380, float:1.256E-42)
            if (r13 != 0) goto L_0x01a1
            r13 = r86
            boolean r21 = r7.changed((java.lang.Object) r13)
            if (r21 == 0) goto L_0x019c
            r27 = 256(0x100, float:3.59E-43)
            goto L_0x019e
        L_0x019c:
            r27 = 128(0x80, float:1.794E-43)
        L_0x019e:
            r11 = r11 | r27
            goto L_0x01a3
        L_0x01a1:
            r13 = r86
        L_0x01a3:
            r13 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r13 != 0) goto L_0x01bb
            r13 = r8 & 8192(0x2000, float:1.14794E-41)
            if (r13 != 0) goto L_0x01b4
            r13 = r87
            boolean r21 = r7.changed((java.lang.Object) r13)
            if (r21 == 0) goto L_0x01b6
            goto L_0x01b8
        L_0x01b4:
            r13 = r87
        L_0x01b6:
            r16 = r17
        L_0x01b8:
            r11 = r11 | r16
            goto L_0x01bd
        L_0x01bb:
            r13 = r87
        L_0x01bd:
            r13 = r8 & 16384(0x4000, float:2.2959E-41)
            if (r13 == 0) goto L_0x01c6
            r11 = r11 | 24576(0x6000, float:3.4438E-41)
            r14 = r88
            goto L_0x01d7
        L_0x01c6:
            r16 = r9 & r62
            r14 = r88
            if (r16 != 0) goto L_0x01d7
            boolean r16 = r7.changed((boolean) r14)
            if (r16 == 0) goto L_0x01d3
            goto L_0x01d5
        L_0x01d3:
            r19 = r20
        L_0x01d5:
            r11 = r11 | r19
        L_0x01d7:
            r16 = 458752(0x70000, float:6.42848E-40)
            r16 = r9 & r16
            if (r16 != 0) goto L_0x01f4
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r8 & r16
            r14 = r89
            if (r16 != 0) goto L_0x01ef
            boolean r16 = r7.changed((int) r14)
            if (r16 == 0) goto L_0x01ef
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01f1
        L_0x01ef:
            r16 = r23
        L_0x01f1:
            r11 = r11 | r16
            goto L_0x01f6
        L_0x01f4:
            r14 = r89
        L_0x01f6:
            r16 = r8 & r23
            if (r16 == 0) goto L_0x0201
            r17 = 1572864(0x180000, float:2.204052E-39)
            r11 = r11 | r17
            r14 = r90
            goto L_0x0214
        L_0x0201:
            r17 = r9 & r63
            r14 = r90
            if (r17 != 0) goto L_0x0214
            boolean r17 = r7.changed((int) r14)
            if (r17 == 0) goto L_0x0210
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0212
        L_0x0210:
            r17 = r25
        L_0x0212:
            r11 = r11 | r17
        L_0x0214:
            r17 = 131072(0x20000, float:1.83671E-40)
            r17 = r8 & r17
            if (r17 == 0) goto L_0x0221
            r19 = 12582912(0xc00000, float:1.7632415E-38)
            r11 = r11 | r19
            r14 = r91
            goto L_0x0236
        L_0x0221:
            r19 = 29360128(0x1c00000, float:7.052966E-38)
            r19 = r9 & r19
            r14 = r91
            if (r19 != 0) goto L_0x0236
            boolean r19 = r7.changed((java.lang.Object) r14)
            if (r19 == 0) goto L_0x0232
            r19 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0234
        L_0x0232:
            r19 = 4194304(0x400000, float:5.877472E-39)
        L_0x0234:
            r11 = r11 | r19
        L_0x0236:
            r19 = 234881024(0xe000000, float:1.5777218E-30)
            r19 = r9 & r19
            if (r19 != 0) goto L_0x0252
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r8 & r19
            r14 = r92
            if (r19 != 0) goto L_0x024d
            boolean r19 = r7.changed((java.lang.Object) r14)
            if (r19 == 0) goto L_0x024d
            r19 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x024f
        L_0x024d:
            r19 = 33554432(0x2000000, float:9.403955E-38)
        L_0x024f:
            r11 = r11 | r19
            goto L_0x0254
        L_0x0252:
            r14 = r92
        L_0x0254:
            r19 = 1879048192(0x70000000, float:1.58456325E29)
            r19 = r9 & r19
            if (r19 != 0) goto L_0x026e
            r19 = r8 & r25
            r9 = r93
            if (r19 != 0) goto L_0x0269
            boolean r19 = r7.changed((java.lang.Object) r9)
            if (r19 == 0) goto L_0x0269
            r19 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x026b
        L_0x0269:
            r19 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x026b:
            r11 = r11 | r19
            goto L_0x0270
        L_0x026e:
            r9 = r93
        L_0x0270:
            r19 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r9 = r0 & r19
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            if (r9 != r14) goto L_0x02b5
            r9 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r9 = r9 & r11
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            if (r9 != r14) goto L_0x02b5
            boolean r9 = r7.getSkipping()
            if (r9 != 0) goto L_0x028a
            goto L_0x02b5
        L_0x028a:
            r7.skipToGroupEnd()
            r3 = r76
            r4 = r77
            r5 = r78
            r6 = r79
            r8 = r81
            r9 = r82
            r10 = r83
            r11 = r84
            r12 = r85
            r13 = r86
            r14 = r87
            r15 = r88
            r16 = r89
            r17 = r90
            r18 = r91
            r19 = r92
            r20 = r93
            r31 = r7
            r7 = r80
            goto L_0x0655
        L_0x02b5:
            r7.startDefaults()
            r9 = r10 & 1
            r64 = 0
            if (r9 == 0) goto L_0x031a
            boolean r9 = r7.getDefaultsInvalid()
            if (r9 == 0) goto L_0x02c5
            goto L_0x031a
        L_0x02c5:
            r7.skipToGroupEnd()
            r1 = r8 & 32
            if (r1 == 0) goto L_0x02d0
            r1 = -458753(0xfffffffffff8ffff, float:NaN)
            r0 = r0 & r1
        L_0x02d0:
            r1 = r8 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x02d6
            r11 = r11 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x02d6:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r8
            if (r1 == 0) goto L_0x02e0
            r1 = -458753(0xfffffffffff8ffff, float:NaN)
            r11 = r11 & r1
        L_0x02e0:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r8
            if (r1 == 0) goto L_0x02e9
            r1 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r11 = r11 & r1
        L_0x02e9:
            r1 = r8 & r25
            if (r1 == 0) goto L_0x02f1
            r1 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r11 = r11 & r1
        L_0x02f1:
            r13 = r76
            r65 = r78
            r10 = r79
            r67 = r80
            r20 = r81
            r21 = r82
            r22 = r83
            r9 = r84
            r23 = r85
            r24 = r86
            r25 = r87
            r26 = r88
            r68 = r89
            r69 = r90
            r27 = r91
            r6 = r92
            r4 = r93
            r1 = r0
            r3 = r11
            r0 = 0
            r11 = r77
            goto L_0x04c6
        L_0x031a:
            if (r3 == 0) goto L_0x031f
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x0321
        L_0x031f:
            r3 = r76
        L_0x0321:
            if (r15 == 0) goto L_0x0325
            r9 = 1
            goto L_0x0327
        L_0x0325:
            r9 = r77
        L_0x0327:
            if (r18 == 0) goto L_0x032c
            r65 = r64
            goto L_0x032e
        L_0x032c:
            r65 = r78
        L_0x032e:
            r15 = r8 & 32
            if (r15 == 0) goto L_0x0345
            androidx.compose.runtime.ProvidableCompositionLocal r15 = androidx.compose.material.TextKt.getLocalTextStyle()
            java.lang.Object r15 = r7.consume(r15)
            androidx.compose.ui.text.TextStyle r15 = (androidx.compose.p002ui.text.TextStyle) r15
            r18 = -458753(0xfffffffffff8ffff, float:NaN)
            r0 = r0 & r18
            r66 = r0
            r0 = r15
            goto L_0x0349
        L_0x0345:
            r66 = r0
            r0 = r79
        L_0x0349:
            if (r24 == 0) goto L_0x034e
            r67 = 0
            goto L_0x0350
        L_0x034e:
            r67 = r80
        L_0x0350:
            if (r6 == 0) goto L_0x0354
            r6 = 0
            goto L_0x0356
        L_0x0354:
            r6 = r81
        L_0x0356:
            if (r1 == 0) goto L_0x035a
            r1 = 0
            goto L_0x035c
        L_0x035a:
            r1 = r82
        L_0x035c:
            if (r2 == 0) goto L_0x0360
            r2 = 0
            goto L_0x0362
        L_0x0360:
            r2 = r83
        L_0x0362:
            if (r4 == 0) goto L_0x0367
            r4 = r64
            goto L_0x0369
        L_0x0367:
            r4 = r84
        L_0x0369:
            if (r5 == 0) goto L_0x0372
            androidx.compose.ui.text.input.VisualTransformation$Companion r5 = androidx.compose.p002ui.text.input.VisualTransformation.Companion
            androidx.compose.ui.text.input.VisualTransformation r5 = r5.getNone()
            goto L_0x0374
        L_0x0372:
            r5 = r85
        L_0x0374:
            if (r12 == 0) goto L_0x037d
            androidx.compose.foundation.text.KeyboardOptions$Companion r12 = androidx.compose.foundation.text.KeyboardOptions.Companion
            androidx.compose.foundation.text.KeyboardOptions r12 = r12.getDefault()
            goto L_0x037f
        L_0x037d:
            r12 = r86
        L_0x037f:
            r15 = r8 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x03b2
            androidx.compose.foundation.text.KeyboardActions r15 = new androidx.compose.foundation.text.KeyboardActions
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 63
            r26 = 0
            r76 = r15
            r77 = r18
            r78 = r19
            r79 = r20
            r80 = r21
            r81 = r22
            r82 = r23
            r83 = r24
            r84 = r26
            r76.<init>(r77, r78, r79, r80, r81, r82, r83, r84)
            r11 = r11 & -7169(0xffffffffffffe3ff, float:NaN)
            r73 = r15
            r15 = r11
            r11 = r73
            goto L_0x03b5
        L_0x03b2:
            r15 = r11
            r11 = r87
        L_0x03b5:
            if (r13 == 0) goto L_0x03ba
            r13 = r64
            goto L_0x03bc
        L_0x03ba:
            r13 = r88
        L_0x03bc:
            r18 = 32768(0x8000, float:4.5918E-41)
            r18 = r8 & r18
            if (r18 == 0) goto L_0x03d3
            if (r13 == 0) goto L_0x03c8
            r18 = 1
            goto L_0x03cb
        L_0x03c8:
            r18 = 2147483647(0x7fffffff, float:NaN)
        L_0x03cb:
            r19 = -458753(0xfffffffffff8ffff, float:NaN)
            r15 = r15 & r19
            r68 = r18
            goto L_0x03d5
        L_0x03d3:
            r68 = r89
        L_0x03d5:
            if (r16 == 0) goto L_0x03da
            r69 = 1
            goto L_0x03dc
        L_0x03da:
            r69 = r90
        L_0x03dc:
            if (r17 == 0) goto L_0x03fe
            r14 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r7.startReplaceableGroup(r14)
            java.lang.Object r14 = r7.rememberedValue()
            androidx.compose.runtime.Composer$Companion r16 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r10 = r16.getEmpty()
            if (r14 != r10) goto L_0x03f7
            androidx.compose.foundation.interaction.MutableInteractionSource r14 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r7.updateRememberedValue(r14)
        L_0x03f7:
            r7.endReplaceableGroup()
            r10 = r14
            androidx.compose.foundation.interaction.MutableInteractionSource r10 = (androidx.compose.foundation.interaction.MutableInteractionSource) r10
            goto L_0x0400
        L_0x03fe:
            r10 = r91
        L_0x0400:
            r14 = 262144(0x40000, float:3.67342E-40)
            r14 = r14 & r8
            if (r14 == 0) goto L_0x043a
            androidx.compose.material.MaterialTheme r14 = androidx.compose.material.MaterialTheme.INSTANCE
            r76 = r0
            r0 = 6
            androidx.compose.material.Shapes r0 = r14.getShapes(r7, r0)
            androidx.compose.foundation.shape.CornerBasedShape r0 = r0.getSmall()
            r14 = 0
            r16 = 0
            androidx.compose.foundation.shape.CornerSize r17 = androidx.compose.foundation.shape.CornerSizeKt.getZeroCornerSize()
            androidx.compose.foundation.shape.CornerSize r18 = androidx.compose.foundation.shape.CornerSizeKt.getZeroCornerSize()
            r19 = 3
            r20 = 0
            r77 = r0
            r78 = r14
            r79 = r16
            r80 = r17
            r81 = r18
            r82 = r19
            r83 = r20
            androidx.compose.foundation.shape.CornerBasedShape r0 = androidx.compose.foundation.shape.CornerBasedShape.copy$default(r77, r78, r79, r80, r81, r82, r83)
            r14 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r14 = r14 & r15
            r70 = r14
            goto L_0x0440
        L_0x043a:
            r76 = r0
            r0 = r92
            r70 = r15
        L_0x0440:
            r14 = r8 & r25
            if (r14 == 0) goto L_0x04a6
            androidx.compose.material.TextFieldDefaults r14 = androidx.compose.material.TextFieldDefaults.INSTANCE
            r15 = 0
            r16 = 0
            r77 = r0
            r0 = r15
            r15 = r16
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
            r43 = 0
            r45 = 0
            r47 = 0
            r49 = 0
            r51 = 0
            r53 = 0
            r55 = 0
            r58 = 0
            r59 = 0
            r60 = 48
            r61 = 2097151(0x1fffff, float:2.938734E-39)
            r57 = r7
            androidx.compose.material.TextFieldColors r14 = r14.m34185textFieldColorsdx8h9Zs(r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r58, r59, r60, r61)
            r15 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r15 = r70 & r15
            r21 = r1
            r22 = r2
            r23 = r5
            r20 = r6
            r27 = r10
            r25 = r11
            r24 = r12
            r26 = r13
            r1 = r66
            r10 = r76
            r6 = r77
            r13 = r3
            r11 = r9
            r3 = r15
            r9 = r4
            r4 = r14
            goto L_0x04c6
        L_0x04a6:
            r77 = r0
            r0 = 0
            r21 = r1
            r22 = r2
            r23 = r5
            r20 = r6
            r27 = r10
            r25 = r11
            r24 = r12
            r26 = r13
            r1 = r66
            r10 = r76
            r6 = r77
            r13 = r3
            r11 = r9
            r3 = r70
            r9 = r4
            r4 = r93
        L_0x04c6:
            r7.endDefaults()
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x04d7
            r2 = -1504264404(0xffffffffa656bf2c, float:-7.450525E-16)
            java.lang.String r5 = "androidx.compose.material.TextField (TextField.kt:158)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r1, r3, r5)
        L_0x04d7:
            r2 = -833027253(0xffffffffce59034b, float:-9.1021792E8)
            r7.startReplaceableGroup(r2)
            long r14 = r10.m37995getColor0d7_KjU()
            androidx.compose.ui.graphics.Color$Companion r2 = androidx.compose.p002ui.graphics.Color.Companion
            long r16 = r2.m35707getUnspecified0d7_KjU()
            int r2 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r2 == 0) goto L_0x04ed
            r64 = 1
        L_0x04ed:
            if (r64 == 0) goto L_0x04f0
            goto L_0x0507
        L_0x04f0:
            int r2 = r1 >> 9
            r2 = r2 & 14
            int r5 = r3 >> 24
            r5 = r5 & 112(0x70, float:1.57E-43)
            r2 = r2 | r5
            androidx.compose.runtime.State r2 = r4.textColor(r11, r7, r2)
            java.lang.Object r2 = r2.getValue()
            androidx.compose.ui.graphics.Color r2 = (androidx.compose.p002ui.graphics.Color) r2
            long r14 = r2.m35681unboximpl()
        L_0x0507:
            r29 = r14
            r7.endReplaceableGroup()
            androidx.compose.ui.text.TextStyle r2 = new androidx.compose.ui.text.TextStyle
            r28 = r2
            r31 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r56 = 4194302(0x3ffffe, float:5.877469E-39)
            r57 = 0
            r28.<init>((long) r29, (long) r31, (androidx.compose.p002ui.text.font.FontWeight) r33, (androidx.compose.p002ui.text.font.FontStyle) r34, (androidx.compose.p002ui.text.font.FontSynthesis) r35, (androidx.compose.p002ui.text.font.FontFamily) r36, (java.lang.String) r37, (long) r38, (androidx.compose.p002ui.text.style.BaselineShift) r40, (androidx.compose.p002ui.text.style.TextGeometricTransform) r41, (androidx.compose.p002ui.text.intl.LocaleList) r42, (long) r43, (androidx.compose.p002ui.text.style.TextDecoration) r45, (androidx.compose.p002ui.graphics.Shadow) r46, (androidx.compose.p002ui.text.style.TextAlign) r47, (androidx.compose.p002ui.text.style.TextDirection) r48, (long) r49, (androidx.compose.p002ui.text.style.TextIndent) r51, (androidx.compose.p002ui.text.PlatformTextStyle) r52, (androidx.compose.p002ui.text.style.LineHeightStyle) r53, (androidx.compose.p002ui.text.style.LineBreak) r54, (androidx.compose.p002ui.text.style.Hyphens) r55, (int) r56, (kotlin.jvm.internal.DefaultConstructorMarker) r57)
            androidx.compose.ui.text.TextStyle r5 = r10.merge((androidx.compose.p002ui.text.TextStyle) r2)
            androidx.compose.material.TextFieldDefaults r2 = androidx.compose.material.TextFieldDefaults.INSTANCE
            int r12 = r1 >> 9
            r12 = r12 & 14
            int r14 = r3 >> 24
            r15 = r14 & 112(0x70, float:1.57E-43)
            r12 = r12 | r15
            androidx.compose.runtime.State r12 = r4.backgroundColor(r11, r7, r12)
            java.lang.Object r12 = r12.getValue()
            androidx.compose.ui.graphics.Color r12 = (androidx.compose.p002ui.graphics.Color) r12
            r16 = r1
            long r0 = r12.m35681unboximpl()
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.BackgroundKt.m32956backgroundbw27NRU(r13, r0, r6)
            r1 = 0
            r12 = 0
            r14 = 48
            r17 = 0
            r76 = r2
            r77 = r0
            r78 = r11
            r79 = r9
            r80 = r27
            r81 = r4
            r82 = r1
            r83 = r12
            r84 = r14
            r85 = r17
            androidx.compose.ui.Modifier r0 = androidx.compose.material.TextFieldDefaults.m34173indicatorLinegv0btCI$default(r76, r77, r78, r79, r80, r81, r82, r83, r84, r85)
            float r1 = r2.m34180getMinWidthD9Ej5fM()
            float r2 = r2.m34179getMinHeightD9Ej5fM()
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.m33322defaultMinSizeVpY3zN4(r0, r1, r2)
            androidx.compose.ui.graphics.SolidColor r0 = new androidx.compose.ui.graphics.SolidColor
            r14 = r0
            r1 = r3 & 14
            r1 = r1 | r15
            androidx.compose.runtime.State r1 = r4.cursorColor(r9, r7, r1)
            java.lang.Object r1 = r1.getValue()
            androidx.compose.ui.graphics.Color r1 = (androidx.compose.p002ui.graphics.Color) r1
            r28 = r13
            long r12 = r1.m35681unboximpl()
            r1 = 0
            r0.<init>(r12, r1)
            r12 = 0
            androidx.compose.material.TextFieldKt$TextField$2 r0 = new androidx.compose.material.TextFieldKt$TextField$2
            r76 = r0
            r77 = r74
            r79 = r26
            r80 = r23
            r81 = r27
            r82 = r9
            r83 = r67
            r84 = r20
            r85 = r21
            r86 = r22
            r87 = r4
            r88 = r16
            r89 = r3
            r76.<init>(r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89)
            r1 = 989834338(0x3affac62, float:0.001950633)
            r13 = 1
            androidx.compose.runtime.internal.ComposableLambda r15 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r7, r1, r13, r0)
            r0 = r16 & 14
            r1 = r16 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            r1 = r16
            r13 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r13
            r1 = r1 & r62
            r0 = r0 | r1
            int r1 = r3 << 12
            r13 = r1 & r63
            r0 = r0 | r13
            r13 = 29360128(0x1c00000, float:7.052966E-38)
            r13 = r13 & r1
            r0 = r0 | r13
            r13 = 234881024(0xe000000, float:1.5777218E-30)
            r13 = r13 & r1
            r0 = r0 | r13
            r13 = 1879048192(0x70000000, float:1.58456325E29)
            r1 = r1 & r13
            r17 = r0 | r1
            int r0 = r3 >> 18
            r0 = r0 & 14
            r1 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 | r1
            r1 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            int r1 = r3 >> 12
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r18 = r0 | r1
            r19 = 4096(0x1000, float:5.74E-42)
            r0 = r74
            r1 = r75
            r3 = r11
            r29 = r4
            r4 = r65
            r30 = r6
            r6 = r24
            r31 = r7
            r7 = r25
            r8 = r26
            r32 = r9
            r9 = r68
            r33 = r10
            r10 = r69
            r34 = r11
            r11 = r23
            r13 = r27
            r16 = r31
            androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField((java.lang.String) r0, (kotlin.jvm.functions.Function1<? super java.lang.String, p336ef.C11921v>) r1, (androidx.compose.p002ui.Modifier) r2, (boolean) r3, (boolean) r4, (androidx.compose.p002ui.text.TextStyle) r5, (androidx.compose.foundation.text.KeyboardOptions) r6, (androidx.compose.foundation.text.KeyboardActions) r7, (boolean) r8, (int) r9, (int) r10, (androidx.compose.p002ui.text.input.VisualTransformation) r11, (kotlin.jvm.functions.Function1<? super androidx.compose.p002ui.text.TextLayoutResult, p336ef.C11921v>) r12, (androidx.compose.foundation.interaction.MutableInteractionSource) r13, (androidx.compose.p002ui.graphics.Brush) r14, (p404of.C13089p<? super p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v>) r15, (androidx.compose.runtime.Composer) r16, (int) r17, (int) r18, (int) r19)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0631
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0631:
            r8 = r20
            r9 = r21
            r10 = r22
            r12 = r23
            r13 = r24
            r14 = r25
            r15 = r26
            r18 = r27
            r3 = r28
            r20 = r29
            r19 = r30
            r11 = r32
            r6 = r33
            r4 = r34
            r5 = r65
            r7 = r67
            r16 = r68
            r17 = r69
        L_0x0655:
            androidx.compose.runtime.ScopeUpdateScope r2 = r31.endRestartGroup()
            if (r2 != 0) goto L_0x065c
            goto L_0x0677
        L_0x065c:
            androidx.compose.material.TextFieldKt$TextField$3 r1 = new androidx.compose.material.TextFieldKt$TextField$3
            r0 = r1
            r71 = r1
            r1 = r74
            r72 = r2
            r2 = r75
            r21 = r95
            r22 = r96
            r23 = r97
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r1 = r71
            r0 = r72
            r0.updateScope(r1)
        L_0x0677:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.TextField(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, of.o, of.o, of.o, of.o, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Composable
    public static final void TextFieldLayout(Modifier modifier, C13088o<? super Composer, ? super Integer, C11921v> oVar, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13089p<? super Modifier, ? super Composer, ? super Integer, C11921v> pVar, C13088o<? super Composer, ? super Integer, C11921v> oVar3, C13088o<? super Composer, ? super Integer, C11921v> oVar4, boolean z, float f, PaddingValues paddingValues, Composer composer, int i) {
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
        Modifier modifier2 = modifier;
        C13088o<? super Composer, ? super Integer, C11921v> oVar5 = oVar;
        C13088o<? super Composer, ? super Integer, C11921v> oVar6 = oVar2;
        C13089p<? super Modifier, ? super Composer, ? super Integer, C11921v> pVar2 = pVar;
        C13088o<? super Composer, ? super Integer, C11921v> oVar7 = oVar3;
        C13088o<? super Composer, ? super Integer, C11921v> oVar8 = oVar4;
        boolean z2 = z;
        float f2 = f;
        PaddingValues paddingValues2 = paddingValues;
        int i12 = i;
        C12775o.m28639i(modifier2, "modifier");
        C12775o.m28639i(oVar5, "textField");
        C12775o.m28639i(paddingValues2, "paddingValues");
        Composer startRestartGroup = composer.startRestartGroup(-2112507061);
        if ((i12 & 14) == 0) {
            if (startRestartGroup.changed((Object) modifier2)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i2 = i11 | i12;
        } else {
            i2 = i12;
        }
        if ((i12 & 112) == 0) {
            if (startRestartGroup.changedInstance(oVar5)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i2 |= i10;
        }
        if ((i12 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 0) {
            if (startRestartGroup.changedInstance(oVar6)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i2 |= i9;
        }
        if ((i12 & 7168) == 0) {
            if (startRestartGroup.changedInstance(pVar2)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i2 |= i8;
        }
        if ((57344 & i12) == 0) {
            if (startRestartGroup.changedInstance(oVar7)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i2 |= i7;
        }
        if ((458752 & i12) == 0) {
            if (startRestartGroup.changedInstance(oVar8)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i2 |= i6;
        }
        if ((3670016 & i12) == 0) {
            if (startRestartGroup.changed(z2)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i2 |= i5;
        }
        if ((29360128 & i12) == 0) {
            if (startRestartGroup.changed(f2)) {
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i2 |= i4;
        }
        if ((234881024 & i12) == 0) {
            if (startRestartGroup.changed((Object) paddingValues2)) {
                i3 = 67108864;
            } else {
                i3 = 33554432;
            }
            i2 |= i3;
        }
        if ((191739611 & i2) != 38347922 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2112507061, i2, -1, "androidx.compose.material.TextFieldLayout (TextField.kt:472)");
            }
            Boolean valueOf = Boolean.valueOf(z);
            Float valueOf2 = Float.valueOf(f);
            startRestartGroup.startReplaceableGroup(1618982084);
            boolean changed = startRestartGroup.changed((Object) valueOf) | startRestartGroup.changed((Object) valueOf2) | startRestartGroup.changed((Object) paddingValues2);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new TextFieldMeasurePolicy(z2, f2, paddingValues2);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            TextFieldMeasurePolicy textFieldMeasurePolicy = (TextFieldMeasurePolicy) rememberedValue;
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            C13074a<ComposeUiNode> constructor = companion.getConstructor();
            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(modifier);
            int i13 = ((((i2 << 3) & 112) << 9) & 7168) | 6;
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer r2 = Updater.m35292constructorimpl(startRestartGroup);
            Updater.m35299setimpl(r2, textFieldMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m35299setimpl(r2, density, companion.getSetDensity());
            Updater.m35299setimpl(r2, layoutDirection2, companion.getSetLayoutDirection());
            Updater.m35299setimpl(r2, viewConfiguration, companion.getSetViewConfiguration());
            materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i13 >> 3) & 112));
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(254819681);
            if (oVar7 != null) {
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
                Composer r1 = Updater.m35292constructorimpl(startRestartGroup);
                Updater.m35299setimpl(r1, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m35299setimpl(r1, density2, companion.getSetDensity());
                Updater.m35299setimpl(r1, layoutDirection3, companion.getSetLayoutDirection());
                Updater.m35299setimpl(r1, viewConfiguration2, companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                oVar7.invoke(startRestartGroup, Integer.valueOf((i2 >> 12) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(254819966);
            if (oVar8 != null) {
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
                Composer r14 = Updater.m35292constructorimpl(startRestartGroup);
                Updater.m35299setimpl(r14, rememberBoxMeasurePolicy2, companion.getSetMeasurePolicy());
                Updater.m35299setimpl(r14, density3, companion.getSetDensity());
                Updater.m35299setimpl(r14, layoutDirection4, companion.getSetLayoutDirection());
                Updater.m35299setimpl(r14, viewConfiguration3, companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf3.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                oVar8.invoke(startRestartGroup, Integer.valueOf((i2 >> 15) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            float calculateStartPadding = PaddingKt.calculateStartPadding(paddingValues2, layoutDirection);
            float calculateEndPadding = PaddingKt.calculateEndPadding(paddingValues2, layoutDirection);
            Modifier.Companion companion2 = Modifier.Companion;
            if (oVar7 != null) {
                calculateStartPadding = C1232Dp.m38468constructorimpl(C13537l.m30876c(C1232Dp.m38468constructorimpl(calculateStartPadding - TextFieldImplKt.getHorizontalIconPadding()), C1232Dp.m38468constructorimpl((float) 0)));
            }
            float f3 = calculateStartPadding;
            if (oVar8 != null) {
                calculateEndPadding = C1232Dp.m38468constructorimpl(C13537l.m30876c(C1232Dp.m38468constructorimpl(calculateEndPadding - TextFieldImplKt.getHorizontalIconPadding()), C1232Dp.m38468constructorimpl((float) 0)));
            }
            Modifier r0 = PaddingKt.m33272paddingqDBjuR0$default(companion2, f3, 0.0f, calculateEndPadding, 0.0f, 10, (Object) null);
            startRestartGroup.startReplaceableGroup(254820977);
            if (pVar2 != null) {
                pVar2.invoke(LayoutIdKt.layoutId(companion2, "Hint").then(r0), startRestartGroup, Integer.valueOf((i2 >> 6) & 112));
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(254821106);
            if (oVar6 != null) {
                Modifier then3 = LayoutIdKt.layoutId(companion2, "Label").then(r0);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
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
                Composer r7 = Updater.m35292constructorimpl(startRestartGroup);
                Updater.m35299setimpl(r7, rememberBoxMeasurePolicy3, companion.getSetMeasurePolicy());
                Updater.m35299setimpl(r7, density4, companion.getSetDensity());
                Updater.m35299setimpl(r7, layoutDirection5, companion.getSetLayoutDirection());
                Updater.m35299setimpl(r7, viewConfiguration4, companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf4.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                oVar6.invoke(startRestartGroup, Integer.valueOf((i2 >> 6) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            Modifier then4 = LayoutIdKt.layoutId(companion2, "TextField").then(r0);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), true, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density5 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection6 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration5 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            C13074a<ComposeUiNode> constructor5 = companion.getConstructor();
            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf5 = LayoutKt.materializerOf(then4);
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
            Composer r10 = Updater.m35292constructorimpl(startRestartGroup);
            Updater.m35299setimpl(r10, rememberBoxMeasurePolicy4, companion.getSetMeasurePolicy());
            Updater.m35299setimpl(r10, density5, companion.getSetDensity());
            Updater.m35299setimpl(r10, layoutDirection6, companion.getSetLayoutDirection());
            Updater.m35299setimpl(r10, viewConfiguration5, companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf5.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
            oVar.invoke(startRestartGroup, Integer.valueOf((i2 >> 3) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TextFieldKt$TextFieldLayout$2(modifier, oVar, oVar2, pVar, oVar3, oVar4, z, f, paddingValues, i));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: calculateHeight-O3s9Psw  reason: not valid java name */
    public static final int m34196calculateHeightO3s9Psw(int i, boolean z, int i2, int i3, int i4, int i5, long j, float f, PaddingValues paddingValues) {
        float f2;
        float f3 = TextFieldTopPadding * f;
        float r1 = paddingValues.m33281calculateTopPaddingD9Ej5fM() * f;
        float r11 = paddingValues.m33278calculateBottomPaddingD9Ej5fM() * f;
        int max = Math.max(i, i5);
        if (z) {
            f2 = ((float) i2) + f3 + ((float) max) + r11;
        } else {
            f2 = r1 + ((float) max) + r11;
        }
        return Math.max(C13265c.m30134c(f2), Math.max(Math.max(i3, i4), Constraints.m38413getMinHeightimpl(j)));
    }

    /* access modifiers changed from: private */
    /* renamed from: calculateWidth-VsPV1Ek  reason: not valid java name */
    public static final int m34197calculateWidthVsPV1Ek(int i, int i2, int i3, int i4, int i5, long j) {
        return Math.max(i + Math.max(i3, Math.max(i4, i5)) + i2, Constraints.m38414getMinWidthimpl(j));
    }

    public static final Modifier drawIndicatorLine(Modifier modifier, BorderStroke borderStroke) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(borderStroke, "indicatorBorder");
        return DrawModifierKt.drawWithContent(modifier, new TextFieldKt$drawIndicatorLine$1(borderStroke.m32975getWidthD9Ej5fM(), borderStroke));
    }

    public static final float getFirstBaselineOffset() {
        return FirstBaselineOffset;
    }

    public static final float getTextFieldBottomPadding() {
        return TextFieldBottomPadding;
    }

    public static final float getTextFieldTopPadding() {
        return TextFieldTopPadding;
    }

    /* access modifiers changed from: private */
    public static final void placeWithLabel(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, boolean z, int i3, int i4, float f, float f2) {
        int i5;
        int i6 = i2;
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, 0, Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), i6), 0.0f, 4, (Object) null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, i - placeable5.getWidth(), Alignment.Companion.getCenterVertically().align(placeable5.getHeight(), i6), 0.0f, 4, (Object) null);
        }
        if (placeable2 != null) {
            if (z) {
                i5 = Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), i6);
            } else {
                i5 = C13265c.m30134c(TextFieldImplKt.getTextFieldPadding() * f2);
            }
            int c = i5 - C13265c.m30134c(((float) (i5 - i3)) * f);
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, TextFieldImplKt.widthOrZero(placeable4), c, 0.0f, 4, (Object) null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, TextFieldImplKt.widthOrZero(placeable4), i4, 0.0f, 4, (Object) null);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable4), i4, 0.0f, 4, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public static final void placeWithoutLabel(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, boolean z, float f, PaddingValues paddingValues) {
        int i3;
        int i4 = i2;
        int c = C13265c.m30134c(paddingValues.m33281calculateTopPaddingD9Ej5fM() * f);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, 0, Alignment.Companion.getCenterVertically().align(placeable3.getHeight(), i4), 0.0f, 4, (Object) null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, i - placeable4.getWidth(), Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), i4), 0.0f, 4, (Object) null);
        }
        if (z) {
            i3 = Alignment.Companion.getCenterVertically().align(placeable.getHeight(), i4);
        } else {
            i3 = c;
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, TextFieldImplKt.widthOrZero(placeable3), i3, 0.0f, 4, (Object) null);
        if (placeable2 != null) {
            if (z) {
                c = Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), i4);
            }
            Placeable.PlacementScope placementScope2 = placementScope;
            Placeable placeable5 = placeable2;
            Placeable.PlacementScope.placeRelative$default(placementScope2, placeable5, TextFieldImplKt.widthOrZero(placeable3), c, 0.0f, 4, (Object) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01af, code lost:
        if (r10.changed((java.lang.Object) r85) != false) goto L_0x01b6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x0514  */
    /* JADX WARNING: Removed duplicated region for block: B:290:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0134  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void TextField(java.lang.String r72, kotlin.jvm.functions.Function1 r73, androidx.compose.p002ui.Modifier r74, boolean r75, boolean r76, androidx.compose.p002ui.text.TextStyle r77, p404of.C13088o r78, p404of.C13088o r79, p404of.C13088o r80, p404of.C13088o r81, boolean r82, androidx.compose.p002ui.text.input.VisualTransformation r83, androidx.compose.foundation.text.KeyboardOptions r84, androidx.compose.foundation.text.KeyboardActions r85, boolean r86, int r87, androidx.compose.foundation.interaction.MutableInteractionSource r88, androidx.compose.p002ui.graphics.Shape r89, androidx.compose.material.TextFieldColors r90, androidx.compose.runtime.Composer r91, int r92, int r93, int r94) {
        /*
            r15 = r72
            r14 = r73
            r13 = r92
            r12 = r93
            r11 = r94
            java.lang.String r0 = "value"
            kotlin.jvm.internal.C12775o.m28639i(r15, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.C12775o.m28639i(r14, r0)
            r0 = -1690895095(0xffffffff9b36fd09, float:-1.5136447E-22)
            r1 = r91
            androidx.compose.runtime.Composer r10 = r1.startRestartGroup(r0)
            r0 = r11 & 1
            if (r0 == 0) goto L_0x0024
            r0 = r13 | 6
            goto L_0x0034
        L_0x0024:
            r0 = r13 & 14
            if (r0 != 0) goto L_0x0033
            boolean r0 = r10.changed((java.lang.Object) r15)
            if (r0 == 0) goto L_0x0030
            r0 = 4
            goto L_0x0031
        L_0x0030:
            r0 = 2
        L_0x0031:
            r0 = r0 | r13
            goto L_0x0034
        L_0x0033:
            r0 = r13
        L_0x0034:
            r3 = r11 & 2
            if (r3 == 0) goto L_0x003b
            r0 = r0 | 48
            goto L_0x004b
        L_0x003b:
            r3 = r13 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004b
            boolean r3 = r10.changedInstance(r14)
            if (r3 == 0) goto L_0x0048
            r3 = 32
            goto L_0x004a
        L_0x0048:
            r3 = 16
        L_0x004a:
            r0 = r0 | r3
        L_0x004b:
            r3 = r11 & 4
            if (r3 == 0) goto L_0x0052
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0065
        L_0x0052:
            r8 = r13 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0065
            r8 = r74
            boolean r9 = r10.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x0061
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r0 = r0 | r9
            goto L_0x0067
        L_0x0065:
            r8 = r74
        L_0x0067:
            r9 = r11 & 8
            r16 = 2048(0x800, float:2.87E-42)
            r17 = 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x0072
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0086
        L_0x0072:
            r1 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x0086
            r1 = r75
            boolean r18 = r10.changed((boolean) r1)
            if (r18 == 0) goto L_0x0081
            r18 = r16
            goto L_0x0083
        L_0x0081:
            r18 = r17
        L_0x0083:
            r0 = r0 | r18
            goto L_0x0088
        L_0x0086:
            r1 = r75
        L_0x0088:
            r18 = r11 & 16
            r19 = 16384(0x4000, float:2.2959E-41)
            r64 = 57344(0xe000, float:8.0356E-41)
            r20 = 8192(0x2000, float:1.14794E-41)
            if (r18 == 0) goto L_0x0098
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r2 = r76
            goto L_0x00ab
        L_0x0098:
            r21 = r13 & r64
            r2 = r76
            if (r21 != 0) goto L_0x00ab
            boolean r22 = r10.changed((boolean) r2)
            if (r22 == 0) goto L_0x00a7
            r22 = r19
            goto L_0x00a9
        L_0x00a7:
            r22 = r20
        L_0x00a9:
            r0 = r0 | r22
        L_0x00ab:
            r65 = 458752(0x70000, float:6.42848E-40)
            r22 = r13 & r65
            r23 = 131072(0x20000, float:1.83671E-40)
            if (r22 != 0) goto L_0x00c7
            r22 = r11 & 32
            r4 = r77
            if (r22 != 0) goto L_0x00c2
            boolean r24 = r10.changed((java.lang.Object) r4)
            if (r24 == 0) goto L_0x00c2
            r24 = r23
            goto L_0x00c4
        L_0x00c2:
            r24 = 65536(0x10000, float:9.18355E-41)
        L_0x00c4:
            r0 = r0 | r24
            goto L_0x00c9
        L_0x00c7:
            r4 = r77
        L_0x00c9:
            r24 = r11 & 64
            if (r24 == 0) goto L_0x00d4
            r25 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 | r25
            r5 = r78
            goto L_0x00e9
        L_0x00d4:
            r25 = 3670016(0x380000, float:5.142788E-39)
            r25 = r13 & r25
            r5 = r78
            if (r25 != 0) goto L_0x00e9
            boolean r26 = r10.changedInstance(r5)
            if (r26 == 0) goto L_0x00e5
            r26 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e7
        L_0x00e5:
            r26 = 524288(0x80000, float:7.34684E-40)
        L_0x00e7:
            r0 = r0 | r26
        L_0x00e9:
            r6 = r11 & 128(0x80, float:1.794E-43)
            r66 = 29360128(0x1c00000, float:7.052966E-38)
            if (r6 == 0) goto L_0x00f6
            r27 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r27
            r7 = r79
            goto L_0x0109
        L_0x00f6:
            r27 = r13 & r66
            r7 = r79
            if (r27 != 0) goto L_0x0109
            boolean r28 = r10.changedInstance(r7)
            if (r28 == 0) goto L_0x0105
            r28 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0107
        L_0x0105:
            r28 = 4194304(0x400000, float:5.877472E-39)
        L_0x0107:
            r0 = r0 | r28
        L_0x0109:
            r1 = r11 & 256(0x100, float:3.59E-43)
            r67 = 234881024(0xe000000, float:1.5777218E-30)
            if (r1 == 0) goto L_0x0116
            r28 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 | r28
            r2 = r80
            goto L_0x0129
        L_0x0116:
            r28 = r13 & r67
            r2 = r80
            if (r28 != 0) goto L_0x0129
            boolean r28 = r10.changedInstance(r2)
            if (r28 == 0) goto L_0x0125
            r28 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0127
        L_0x0125:
            r28 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0127:
            r0 = r0 | r28
        L_0x0129:
            r2 = r11 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x0134
            r28 = 805306368(0x30000000, float:4.656613E-10)
            r0 = r0 | r28
            r4 = r81
            goto L_0x0149
        L_0x0134:
            r28 = 1879048192(0x70000000, float:1.58456325E29)
            r28 = r13 & r28
            r4 = r81
            if (r28 != 0) goto L_0x0149
            boolean r28 = r10.changedInstance(r4)
            if (r28 == 0) goto L_0x0145
            r28 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0147
        L_0x0145:
            r28 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0147:
            r0 = r0 | r28
        L_0x0149:
            r4 = r11 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x0152
            r21 = r12 | 6
            r5 = r82
            goto L_0x0168
        L_0x0152:
            r28 = r12 & 14
            r5 = r82
            if (r28 != 0) goto L_0x0166
            boolean r28 = r10.changed((boolean) r5)
            if (r28 == 0) goto L_0x0161
            r21 = 4
            goto L_0x0163
        L_0x0161:
            r21 = 2
        L_0x0163:
            r21 = r12 | r21
            goto L_0x0168
        L_0x0166:
            r21 = r12
        L_0x0168:
            r5 = r11 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x016f
            r21 = r21 | 48
            goto L_0x0182
        L_0x016f:
            r28 = r12 & 112(0x70, float:1.57E-43)
            r7 = r83
            if (r28 != 0) goto L_0x0182
            boolean r28 = r10.changed((java.lang.Object) r7)
            if (r28 == 0) goto L_0x017e
            r25 = 32
            goto L_0x0180
        L_0x017e:
            r25 = 16
        L_0x0180:
            r21 = r21 | r25
        L_0x0182:
            r7 = r21
            r8 = r11 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto L_0x018b
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x019f
        L_0x018b:
            r14 = r12 & 896(0x380, float:1.256E-42)
            if (r14 != 0) goto L_0x019f
            r14 = r84
            boolean r21 = r10.changed((java.lang.Object) r14)
            if (r21 == 0) goto L_0x019a
            r26 = 256(0x100, float:3.59E-43)
            goto L_0x019c
        L_0x019a:
            r26 = 128(0x80, float:1.794E-43)
        L_0x019c:
            r7 = r7 | r26
            goto L_0x01a1
        L_0x019f:
            r14 = r84
        L_0x01a1:
            r14 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r14 != 0) goto L_0x01b9
            r14 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r14 != 0) goto L_0x01b2
            r14 = r85
            boolean r21 = r10.changed((java.lang.Object) r14)
            if (r21 == 0) goto L_0x01b4
            goto L_0x01b6
        L_0x01b2:
            r14 = r85
        L_0x01b4:
            r16 = r17
        L_0x01b6:
            r7 = r7 | r16
            goto L_0x01bb
        L_0x01b9:
            r14 = r85
        L_0x01bb:
            r14 = r11 & 16384(0x4000, float:2.2959E-41)
            if (r14 == 0) goto L_0x01c4
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
            r15 = r86
            goto L_0x01d5
        L_0x01c4:
            r16 = r12 & r64
            r15 = r86
            if (r16 != 0) goto L_0x01d5
            boolean r16 = r10.changed((boolean) r15)
            if (r16 == 0) goto L_0x01d1
            goto L_0x01d3
        L_0x01d1:
            r19 = r20
        L_0x01d3:
            r7 = r7 | r19
        L_0x01d5:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r11 & r16
            if (r16 == 0) goto L_0x01e3
            r17 = 196608(0x30000, float:2.75506E-40)
            r7 = r7 | r17
            r15 = r87
            goto L_0x01f6
        L_0x01e3:
            r17 = r12 & r65
            r15 = r87
            if (r17 != 0) goto L_0x01f6
            boolean r17 = r10.changed((int) r15)
            if (r17 == 0) goto L_0x01f2
            r17 = r23
            goto L_0x01f4
        L_0x01f2:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x01f4:
            r7 = r7 | r17
        L_0x01f6:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r11 & r17
            if (r17 == 0) goto L_0x0203
            r19 = 1572864(0x180000, float:2.204052E-39)
            r7 = r7 | r19
            r15 = r88
            goto L_0x0218
        L_0x0203:
            r19 = 3670016(0x380000, float:5.142788E-39)
            r19 = r12 & r19
            r15 = r88
            if (r19 != 0) goto L_0x0218
            boolean r19 = r10.changed((java.lang.Object) r15)
            if (r19 == 0) goto L_0x0214
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0216
        L_0x0214:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x0216:
            r7 = r7 | r19
        L_0x0218:
            r19 = r12 & r66
            if (r19 != 0) goto L_0x0230
            r19 = r11 & r23
            r15 = r89
            if (r19 != 0) goto L_0x022b
            boolean r19 = r10.changed((java.lang.Object) r15)
            if (r19 == 0) goto L_0x022b
            r19 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x022d
        L_0x022b:
            r19 = 4194304(0x400000, float:5.877472E-39)
        L_0x022d:
            r7 = r7 | r19
            goto L_0x0232
        L_0x0230:
            r15 = r89
        L_0x0232:
            r19 = r12 & r67
            if (r19 != 0) goto L_0x024c
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r11 & r19
            r12 = r90
            if (r19 != 0) goto L_0x0247
            boolean r19 = r10.changed((java.lang.Object) r12)
            if (r19 == 0) goto L_0x0247
            r19 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0249
        L_0x0247:
            r19 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0249:
            r7 = r7 | r19
            goto L_0x024e
        L_0x024c:
            r12 = r90
        L_0x024e:
            r19 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r12 = r0 & r19
            r15 = 306783378(0x12492492, float:6.3469493E-28)
            if (r12 != r15) goto L_0x0291
            r12 = 191739611(0xb6db6db, float:4.5782105E-32)
            r12 = r12 & r7
            r15 = 38347922(0x2492492, float:1.4777643E-37)
            if (r12 != r15) goto L_0x0291
            boolean r12 = r10.getSkipping()
            if (r12 != 0) goto L_0x0268
            goto L_0x0291
        L_0x0268:
            r10.skipToGroupEnd()
            r3 = r74
            r4 = r75
            r5 = r76
            r6 = r77
            r7 = r78
            r8 = r79
            r9 = r80
            r11 = r82
            r12 = r83
            r13 = r84
            r14 = r85
            r15 = r86
            r16 = r87
            r17 = r88
            r18 = r89
            r19 = r90
            r39 = r10
            r10 = r81
            goto L_0x050d
        L_0x0291:
            r10.startDefaults()
            r12 = r13 & 1
            if (r12 == 0) goto L_0x02e5
            boolean r12 = r10.getDefaultsInvalid()
            if (r12 == 0) goto L_0x029f
            goto L_0x02e5
        L_0x029f:
            r10.skipToGroupEnd()
            r1 = r11 & 32
            if (r1 == 0) goto L_0x02aa
            r1 = -458753(0xfffffffffff8ffff, float:NaN)
            r0 = r0 & r1
        L_0x02aa:
            r1 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x02b0
            r7 = r7 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x02b0:
            r1 = r11 & r23
            if (r1 == 0) goto L_0x02b8
            r1 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r7 = r7 & r1
        L_0x02b8:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r11
            if (r1 == 0) goto L_0x02c1
            r1 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r7 = r7 & r1
        L_0x02c1:
            r24 = r74
            r25 = r75
            r26 = r76
            r27 = r77
            r68 = r78
            r28 = r79
            r29 = r80
            r30 = r81
            r31 = r82
            r32 = r83
            r33 = r84
            r34 = r85
            r35 = r86
            r69 = r87
            r36 = r88
            r37 = r89
            r38 = r90
            goto L_0x045f
        L_0x02e5:
            if (r3 == 0) goto L_0x02ea
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x02ec
        L_0x02ea:
            r3 = r74
        L_0x02ec:
            if (r9 == 0) goto L_0x02f0
            r9 = 1
            goto L_0x02f2
        L_0x02f0:
            r9 = r75
        L_0x02f2:
            if (r18 == 0) goto L_0x02f6
            r12 = 0
            goto L_0x02f8
        L_0x02f6:
            r12 = r76
        L_0x02f8:
            r15 = r11 & 32
            if (r15 == 0) goto L_0x030c
            androidx.compose.runtime.ProvidableCompositionLocal r15 = androidx.compose.material.TextKt.getLocalTextStyle()
            java.lang.Object r15 = r10.consume(r15)
            androidx.compose.ui.text.TextStyle r15 = (androidx.compose.p002ui.text.TextStyle) r15
            r18 = -458753(0xfffffffffff8ffff, float:NaN)
            r0 = r0 & r18
            goto L_0x030e
        L_0x030c:
            r15 = r77
        L_0x030e:
            r18 = 0
            if (r24 == 0) goto L_0x0315
            r68 = r18
            goto L_0x0317
        L_0x0315:
            r68 = r78
        L_0x0317:
            if (r6 == 0) goto L_0x031c
            r6 = r18
            goto L_0x031e
        L_0x031c:
            r6 = r79
        L_0x031e:
            if (r1 == 0) goto L_0x0323
            r1 = r18
            goto L_0x0325
        L_0x0323:
            r1 = r80
        L_0x0325:
            if (r2 == 0) goto L_0x032a
            r2 = r18
            goto L_0x032c
        L_0x032a:
            r2 = r81
        L_0x032c:
            if (r4 == 0) goto L_0x0330
            r4 = 0
            goto L_0x0332
        L_0x0330:
            r4 = r82
        L_0x0332:
            if (r5 == 0) goto L_0x033b
            androidx.compose.ui.text.input.VisualTransformation$Companion r5 = androidx.compose.p002ui.text.input.VisualTransformation.Companion
            androidx.compose.ui.text.input.VisualTransformation r5 = r5.getNone()
            goto L_0x033d
        L_0x033b:
            r5 = r83
        L_0x033d:
            if (r8 == 0) goto L_0x0346
            androidx.compose.foundation.text.KeyboardOptions$Companion r8 = androidx.compose.foundation.text.KeyboardOptions.Companion
            androidx.compose.foundation.text.KeyboardOptions r8 = r8.getDefault()
            goto L_0x0348
        L_0x0346:
            r8 = r84
        L_0x0348:
            r74 = r0
            r0 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0378
            androidx.compose.foundation.text.KeyboardActions r0 = new androidx.compose.foundation.text.KeyboardActions
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 63
            r26 = 0
            r75 = r0
            r76 = r18
            r77 = r19
            r78 = r20
            r79 = r21
            r80 = r22
            r81 = r24
            r82 = r25
            r83 = r26
            r75.<init>(r76, r77, r78, r79, r80, r81, r82, r83)
            r7 = r7 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x037a
        L_0x0378:
            r0 = r85
        L_0x037a:
            if (r14 == 0) goto L_0x037e
            r14 = 0
            goto L_0x0380
        L_0x037e:
            r14 = r86
        L_0x0380:
            if (r16 == 0) goto L_0x0388
            r16 = 2147483647(0x7fffffff, float:NaN)
            r69 = r16
            goto L_0x038a
        L_0x0388:
            r69 = r87
        L_0x038a:
            r75 = r0
            if (r17 == 0) goto L_0x03af
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.startReplaceableGroup(r0)
            java.lang.Object r0 = r10.rememberedValue()
            androidx.compose.runtime.Composer$Companion r16 = androidx.compose.runtime.Composer.Companion
            r76 = r1
            java.lang.Object r1 = r16.getEmpty()
            if (r0 != r1) goto L_0x03a9
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r10.updateRememberedValue(r0)
        L_0x03a9:
            r10.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = (androidx.compose.foundation.interaction.MutableInteractionSource) r0
            goto L_0x03b3
        L_0x03af:
            r76 = r1
            r0 = r88
        L_0x03b3:
            r1 = r11 & r23
            if (r1 == 0) goto L_0x03eb
            androidx.compose.material.MaterialTheme r1 = androidx.compose.material.MaterialTheme.INSTANCE
            r77 = r0
            r0 = 6
            androidx.compose.material.Shapes r0 = r1.getShapes(r10, r0)
            androidx.compose.foundation.shape.CornerBasedShape r0 = r0.getSmall()
            r1 = 0
            r16 = 0
            androidx.compose.foundation.shape.CornerSize r17 = androidx.compose.foundation.shape.CornerSizeKt.getZeroCornerSize()
            androidx.compose.foundation.shape.CornerSize r18 = androidx.compose.foundation.shape.CornerSizeKt.getZeroCornerSize()
            r19 = 3
            r20 = 0
            r78 = r0
            r79 = r1
            r80 = r16
            r81 = r17
            r82 = r18
            r83 = r19
            r84 = r20
            androidx.compose.foundation.shape.CornerBasedShape r0 = androidx.compose.foundation.shape.CornerBasedShape.copy$default(r78, r79, r80, r81, r82, r83, r84)
            r1 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r7
            r7 = r1
            goto L_0x03ef
        L_0x03eb:
            r77 = r0
            r0 = r89
        L_0x03ef:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r11
            if (r1 == 0) goto L_0x043f
            androidx.compose.material.TextFieldDefaults r16 = androidx.compose.material.TextFieldDefaults.INSTANCE
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
            r43 = 0
            r45 = 0
            r47 = 0
            r49 = 0
            r51 = 0
            r53 = 0
            r55 = 0
            r57 = 0
            r60 = 0
            r61 = 0
            r62 = 48
            r63 = 2097151(0x1fffff, float:2.938734E-39)
            r59 = r10
            androidx.compose.material.TextFieldColors r1 = r16.m34185textFieldColorsdx8h9Zs(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r60, r61, r62, r63)
            r16 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r7 = r7 & r16
            r34 = r75
            r29 = r76
            r36 = r77
            r37 = r0
            r38 = r1
            goto L_0x0449
        L_0x043f:
            r34 = r75
            r29 = r76
            r36 = r77
            r38 = r90
            r37 = r0
        L_0x0449:
            r30 = r2
            r24 = r3
            r31 = r4
            r32 = r5
            r28 = r6
            r33 = r8
            r25 = r9
            r26 = r12
            r35 = r14
            r27 = r15
            r0 = r74
        L_0x045f:
            r10.endDefaults()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x0470
            r1 = -1690895095(0xffffffff9b36fd09, float:-1.5136447E-22)
            java.lang.String r2 = "androidx.compose.material.TextField (TextField.kt:234)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r1, r0, r7, r2)
        L_0x0470:
            r16 = 1
            r1 = r0 & 14
            r2 = r0 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            r2 = r0 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            r2 = r0 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            r2 = r0 & r64
            r1 = r1 | r2
            r2 = r0 & r65
            r1 = r1 | r2
            r2 = 3670016(0x380000, float:5.142788E-39)
            r2 = r2 & r0
            r1 = r1 | r2
            r2 = r0 & r66
            r1 = r1 | r2
            r2 = r0 & r67
            r1 = r1 | r2
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r0 & r2
            r21 = r1 | r0
            r0 = 1572864(0x180000, float:2.204052E-39)
            r1 = r7 & 14
            r0 = r0 | r1
            r1 = r7 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            r1 = r7 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            r1 = r7 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r1
            r1 = r7 & r64
            r0 = r0 | r1
            r1 = r7 & r65
            r0 = r0 | r1
            int r1 = r7 << 3
            r2 = r1 & r66
            r0 = r0 | r2
            r2 = r1 & r67
            r0 = r0 | r2
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r1 = r1 & r2
            r22 = r0 | r1
            r23 = 0
            r0 = r72
            r1 = r73
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r27
            r6 = r68
            r7 = r28
            r8 = r29
            r9 = r30
            r39 = r10
            r10 = r31
            r11 = r32
            r12 = r33
            r13 = r34
            r14 = r35
            r15 = r69
            r17 = r36
            r18 = r37
            r19 = r38
            r20 = r39
            TextField((java.lang.String) r0, (kotlin.jvm.functions.Function1<? super java.lang.String, p336ef.C11921v>) r1, (androidx.compose.p002ui.Modifier) r2, (boolean) r3, (boolean) r4, (androidx.compose.p002ui.text.TextStyle) r5, (p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v>) r6, (p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v>) r7, (p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v>) r8, (p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v>) r9, (boolean) r10, (androidx.compose.p002ui.text.input.VisualTransformation) r11, (androidx.compose.foundation.text.KeyboardOptions) r12, (androidx.compose.foundation.text.KeyboardActions) r13, (boolean) r14, (int) r15, (int) r16, (androidx.compose.foundation.interaction.MutableInteractionSource) r17, (androidx.compose.p002ui.graphics.Shape) r18, (androidx.compose.material.TextFieldColors) r19, (androidx.compose.runtime.Composer) r20, (int) r21, (int) r22, (int) r23)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x04eb
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x04eb:
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r27
            r8 = r28
            r9 = r29
            r10 = r30
            r11 = r31
            r12 = r32
            r13 = r33
            r14 = r34
            r15 = r35
            r17 = r36
            r18 = r37
            r19 = r38
            r7 = r68
            r16 = r69
        L_0x050d:
            androidx.compose.runtime.ScopeUpdateScope r2 = r39.endRestartGroup()
            if (r2 != 0) goto L_0x0514
            goto L_0x052f
        L_0x0514:
            androidx.compose.material.TextFieldKt$TextField$5 r1 = new androidx.compose.material.TextFieldKt$TextField$5
            r0 = r1
            r70 = r1
            r1 = r72
            r71 = r2
            r2 = r73
            r20 = r92
            r21 = r93
            r22 = r94
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r1 = r70
            r0 = r71
            r0.updateScope(r1)
        L_0x052f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.TextField(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, of.o, of.o, of.o, of.o, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: androidx.compose.foundation.interaction.MutableInteractionSource} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v44, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v27, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v31, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v40, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v15, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v47, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v49, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v51, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v9, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v53, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v56, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v58, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v13, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v59, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v61, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v62, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v64, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v67, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v69, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v70, resolved type: int} */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01b1, code lost:
        if (r7.changed((java.lang.Object) r87) != false) goto L_0x01b8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x0637  */
    /* JADX WARNING: Removed duplicated region for block: B:312:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0136  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void TextField(androidx.compose.p002ui.text.input.TextFieldValue r74, kotlin.jvm.functions.Function1<? super androidx.compose.p002ui.text.input.TextFieldValue, p336ef.C11921v> r75, androidx.compose.p002ui.Modifier r76, boolean r77, boolean r78, androidx.compose.p002ui.text.TextStyle r79, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r80, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r81, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r82, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r83, boolean r84, androidx.compose.p002ui.text.input.VisualTransformation r85, androidx.compose.foundation.text.KeyboardOptions r86, androidx.compose.foundation.text.KeyboardActions r87, boolean r88, int r89, int r90, androidx.compose.foundation.interaction.MutableInteractionSource r91, androidx.compose.p002ui.graphics.Shape r92, androidx.compose.material.TextFieldColors r93, androidx.compose.runtime.Composer r94, int r95, int r96, int r97) {
        /*
            r13 = r74
            r11 = r75
            r10 = r95
            r9 = r96
            r8 = r97
            java.lang.String r0 = "value"
            kotlin.jvm.internal.C12775o.m28639i(r13, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.C12775o.m28639i(r11, r0)
            r0 = -359119489(0xffffffffea98457f, float:-9.2042455E25)
            r1 = r94
            androidx.compose.runtime.Composer r7 = r1.startRestartGroup(r0)
            r0 = r8 & 1
            if (r0 == 0) goto L_0x0024
            r0 = r10 | 6
            goto L_0x0034
        L_0x0024:
            r0 = r10 & 14
            if (r0 != 0) goto L_0x0033
            boolean r0 = r7.changed((java.lang.Object) r13)
            if (r0 == 0) goto L_0x0030
            r0 = 4
            goto L_0x0031
        L_0x0030:
            r0 = 2
        L_0x0031:
            r0 = r0 | r10
            goto L_0x0034
        L_0x0033:
            r0 = r10
        L_0x0034:
            r3 = r8 & 2
            if (r3 == 0) goto L_0x003b
            r0 = r0 | 48
            goto L_0x004b
        L_0x003b:
            r3 = r10 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004b
            boolean r3 = r7.changedInstance(r11)
            if (r3 == 0) goto L_0x0048
            r3 = 32
            goto L_0x004a
        L_0x0048:
            r3 = 16
        L_0x004a:
            r0 = r0 | r3
        L_0x004b:
            r3 = r8 & 4
            if (r3 == 0) goto L_0x0052
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0065
        L_0x0052:
            r14 = r10 & 896(0x380, float:1.256E-42)
            if (r14 != 0) goto L_0x0065
            r14 = r76
            boolean r15 = r7.changed((java.lang.Object) r14)
            if (r15 == 0) goto L_0x0061
            r15 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r15 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r0 = r0 | r15
            goto L_0x0067
        L_0x0065:
            r14 = r76
        L_0x0067:
            r15 = r8 & 8
            r16 = 2048(0x800, float:2.87E-42)
            r17 = 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L_0x0072
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0086
        L_0x0072:
            r1 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x0086
            r1 = r77
            boolean r18 = r7.changed((boolean) r1)
            if (r18 == 0) goto L_0x0081
            r18 = r16
            goto L_0x0083
        L_0x0081:
            r18 = r17
        L_0x0083:
            r0 = r0 | r18
            goto L_0x0088
        L_0x0086:
            r1 = r77
        L_0x0088:
            r18 = r8 & 16
            r19 = 16384(0x4000, float:2.2959E-41)
            r62 = 57344(0xe000, float:8.0356E-41)
            r20 = 8192(0x2000, float:1.14794E-41)
            if (r18 == 0) goto L_0x0098
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r2 = r78
            goto L_0x00ab
        L_0x0098:
            r21 = r10 & r62
            r2 = r78
            if (r21 != 0) goto L_0x00ab
            boolean r22 = r7.changed((boolean) r2)
            if (r22 == 0) goto L_0x00a7
            r22 = r19
            goto L_0x00a9
        L_0x00a7:
            r22 = r20
        L_0x00a9:
            r0 = r0 | r22
        L_0x00ab:
            r22 = 458752(0x70000, float:6.42848E-40)
            r22 = r10 & r22
            r23 = 65536(0x10000, float:9.18355E-41)
            if (r22 != 0) goto L_0x00c7
            r22 = r8 & 32
            r4 = r79
            if (r22 != 0) goto L_0x00c2
            boolean r24 = r7.changed((java.lang.Object) r4)
            if (r24 == 0) goto L_0x00c2
            r24 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c4
        L_0x00c2:
            r24 = r23
        L_0x00c4:
            r0 = r0 | r24
            goto L_0x00c9
        L_0x00c7:
            r4 = r79
        L_0x00c9:
            r24 = r8 & 64
            r63 = 3670016(0x380000, float:5.142788E-39)
            r25 = 524288(0x80000, float:7.34684E-40)
            if (r24 == 0) goto L_0x00d8
            r26 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 | r26
            r5 = r80
            goto L_0x00eb
        L_0x00d8:
            r26 = r10 & r63
            r5 = r80
            if (r26 != 0) goto L_0x00eb
            boolean r27 = r7.changedInstance(r5)
            if (r27 == 0) goto L_0x00e7
            r27 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e9
        L_0x00e7:
            r27 = r25
        L_0x00e9:
            r0 = r0 | r27
        L_0x00eb:
            r6 = r8 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x00f6
            r28 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r28
            r12 = r81
            goto L_0x010b
        L_0x00f6:
            r28 = 29360128(0x1c00000, float:7.052966E-38)
            r28 = r10 & r28
            r12 = r81
            if (r28 != 0) goto L_0x010b
            boolean r29 = r7.changedInstance(r12)
            if (r29 == 0) goto L_0x0107
            r29 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0109
        L_0x0107:
            r29 = 4194304(0x400000, float:5.877472E-39)
        L_0x0109:
            r0 = r0 | r29
        L_0x010b:
            r1 = r8 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0116
            r29 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 | r29
            r2 = r82
            goto L_0x012b
        L_0x0116:
            r29 = 234881024(0xe000000, float:1.5777218E-30)
            r29 = r10 & r29
            r2 = r82
            if (r29 != 0) goto L_0x012b
            boolean r29 = r7.changedInstance(r2)
            if (r29 == 0) goto L_0x0127
            r29 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0129
        L_0x0127:
            r29 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0129:
            r0 = r0 | r29
        L_0x012b:
            r2 = r8 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x0136
            r29 = 805306368(0x30000000, float:4.656613E-10)
            r0 = r0 | r29
            r4 = r83
            goto L_0x014b
        L_0x0136:
            r29 = 1879048192(0x70000000, float:1.58456325E29)
            r29 = r10 & r29
            r4 = r83
            if (r29 != 0) goto L_0x014b
            boolean r29 = r7.changedInstance(r4)
            if (r29 == 0) goto L_0x0147
            r29 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0149
        L_0x0147:
            r29 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0149:
            r0 = r0 | r29
        L_0x014b:
            r4 = r8 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x0154
            r21 = r9 | 6
            r5 = r84
            goto L_0x016a
        L_0x0154:
            r29 = r9 & 14
            r5 = r84
            if (r29 != 0) goto L_0x0168
            boolean r29 = r7.changed((boolean) r5)
            if (r29 == 0) goto L_0x0163
            r21 = 4
            goto L_0x0165
        L_0x0163:
            r21 = 2
        L_0x0165:
            r21 = r9 | r21
            goto L_0x016a
        L_0x0168:
            r21 = r9
        L_0x016a:
            r5 = r8 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x0171
            r21 = r21 | 48
            goto L_0x0184
        L_0x0171:
            r29 = r9 & 112(0x70, float:1.57E-43)
            r11 = r85
            if (r29 != 0) goto L_0x0184
            boolean r29 = r7.changed((java.lang.Object) r11)
            if (r29 == 0) goto L_0x0180
            r26 = 32
            goto L_0x0182
        L_0x0180:
            r26 = 16
        L_0x0182:
            r21 = r21 | r26
        L_0x0184:
            r11 = r21
            r12 = r8 & 4096(0x1000, float:5.74E-42)
            if (r12 == 0) goto L_0x018d
            r11 = r11 | 384(0x180, float:5.38E-43)
            goto L_0x01a1
        L_0x018d:
            r13 = r9 & 896(0x380, float:1.256E-42)
            if (r13 != 0) goto L_0x01a1
            r13 = r86
            boolean r21 = r7.changed((java.lang.Object) r13)
            if (r21 == 0) goto L_0x019c
            r27 = 256(0x100, float:3.59E-43)
            goto L_0x019e
        L_0x019c:
            r27 = 128(0x80, float:1.794E-43)
        L_0x019e:
            r11 = r11 | r27
            goto L_0x01a3
        L_0x01a1:
            r13 = r86
        L_0x01a3:
            r13 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r13 != 0) goto L_0x01bb
            r13 = r8 & 8192(0x2000, float:1.14794E-41)
            if (r13 != 0) goto L_0x01b4
            r13 = r87
            boolean r21 = r7.changed((java.lang.Object) r13)
            if (r21 == 0) goto L_0x01b6
            goto L_0x01b8
        L_0x01b4:
            r13 = r87
        L_0x01b6:
            r16 = r17
        L_0x01b8:
            r11 = r11 | r16
            goto L_0x01bd
        L_0x01bb:
            r13 = r87
        L_0x01bd:
            r13 = r8 & 16384(0x4000, float:2.2959E-41)
            if (r13 == 0) goto L_0x01c6
            r11 = r11 | 24576(0x6000, float:3.4438E-41)
            r14 = r88
            goto L_0x01d7
        L_0x01c6:
            r16 = r9 & r62
            r14 = r88
            if (r16 != 0) goto L_0x01d7
            boolean r16 = r7.changed((boolean) r14)
            if (r16 == 0) goto L_0x01d3
            goto L_0x01d5
        L_0x01d3:
            r19 = r20
        L_0x01d5:
            r11 = r11 | r19
        L_0x01d7:
            r16 = 458752(0x70000, float:6.42848E-40)
            r16 = r9 & r16
            if (r16 != 0) goto L_0x01f4
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r8 & r16
            r14 = r89
            if (r16 != 0) goto L_0x01ef
            boolean r16 = r7.changed((int) r14)
            if (r16 == 0) goto L_0x01ef
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01f1
        L_0x01ef:
            r16 = r23
        L_0x01f1:
            r11 = r11 | r16
            goto L_0x01f6
        L_0x01f4:
            r14 = r89
        L_0x01f6:
            r16 = r8 & r23
            if (r16 == 0) goto L_0x0201
            r17 = 1572864(0x180000, float:2.204052E-39)
            r11 = r11 | r17
            r14 = r90
            goto L_0x0214
        L_0x0201:
            r17 = r9 & r63
            r14 = r90
            if (r17 != 0) goto L_0x0214
            boolean r17 = r7.changed((int) r14)
            if (r17 == 0) goto L_0x0210
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0212
        L_0x0210:
            r17 = r25
        L_0x0212:
            r11 = r11 | r17
        L_0x0214:
            r17 = 131072(0x20000, float:1.83671E-40)
            r17 = r8 & r17
            if (r17 == 0) goto L_0x0221
            r19 = 12582912(0xc00000, float:1.7632415E-38)
            r11 = r11 | r19
            r14 = r91
            goto L_0x0236
        L_0x0221:
            r19 = 29360128(0x1c00000, float:7.052966E-38)
            r19 = r9 & r19
            r14 = r91
            if (r19 != 0) goto L_0x0236
            boolean r19 = r7.changed((java.lang.Object) r14)
            if (r19 == 0) goto L_0x0232
            r19 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0234
        L_0x0232:
            r19 = 4194304(0x400000, float:5.877472E-39)
        L_0x0234:
            r11 = r11 | r19
        L_0x0236:
            r19 = 234881024(0xe000000, float:1.5777218E-30)
            r19 = r9 & r19
            if (r19 != 0) goto L_0x0252
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r8 & r19
            r14 = r92
            if (r19 != 0) goto L_0x024d
            boolean r19 = r7.changed((java.lang.Object) r14)
            if (r19 == 0) goto L_0x024d
            r19 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x024f
        L_0x024d:
            r19 = 33554432(0x2000000, float:9.403955E-38)
        L_0x024f:
            r11 = r11 | r19
            goto L_0x0254
        L_0x0252:
            r14 = r92
        L_0x0254:
            r19 = 1879048192(0x70000000, float:1.58456325E29)
            r19 = r9 & r19
            if (r19 != 0) goto L_0x026e
            r19 = r8 & r25
            r9 = r93
            if (r19 != 0) goto L_0x0269
            boolean r19 = r7.changed((java.lang.Object) r9)
            if (r19 == 0) goto L_0x0269
            r19 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x026b
        L_0x0269:
            r19 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x026b:
            r11 = r11 | r19
            goto L_0x0270
        L_0x026e:
            r9 = r93
        L_0x0270:
            r19 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r9 = r0 & r19
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            if (r9 != r14) goto L_0x02b5
            r9 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r9 = r9 & r11
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            if (r9 != r14) goto L_0x02b5
            boolean r9 = r7.getSkipping()
            if (r9 != 0) goto L_0x028a
            goto L_0x02b5
        L_0x028a:
            r7.skipToGroupEnd()
            r3 = r76
            r4 = r77
            r5 = r78
            r6 = r79
            r8 = r81
            r9 = r82
            r10 = r83
            r11 = r84
            r12 = r85
            r13 = r86
            r14 = r87
            r15 = r88
            r16 = r89
            r17 = r90
            r18 = r91
            r19 = r92
            r20 = r93
            r31 = r7
            r7 = r80
            goto L_0x0630
        L_0x02b5:
            r7.startDefaults()
            r9 = r10 & 1
            r64 = 0
            if (r9 == 0) goto L_0x031a
            boolean r9 = r7.getDefaultsInvalid()
            if (r9 == 0) goto L_0x02c5
            goto L_0x031a
        L_0x02c5:
            r7.skipToGroupEnd()
            r1 = r8 & 32
            if (r1 == 0) goto L_0x02d0
            r1 = -458753(0xfffffffffff8ffff, float:NaN)
            r0 = r0 & r1
        L_0x02d0:
            r1 = r8 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x02d6
            r11 = r11 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x02d6:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r8
            if (r1 == 0) goto L_0x02e0
            r1 = -458753(0xfffffffffff8ffff, float:NaN)
            r11 = r11 & r1
        L_0x02e0:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r8
            if (r1 == 0) goto L_0x02e9
            r1 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r11 = r11 & r1
        L_0x02e9:
            r1 = r8 & r25
            if (r1 == 0) goto L_0x02f1
            r1 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r11 = r11 & r1
        L_0x02f1:
            r13 = r76
            r65 = r78
            r10 = r79
            r67 = r80
            r20 = r81
            r21 = r82
            r22 = r83
            r9 = r84
            r23 = r85
            r24 = r86
            r25 = r87
            r26 = r88
            r68 = r89
            r69 = r90
            r27 = r91
            r6 = r92
            r4 = r93
            r1 = r0
            r3 = r11
            r0 = 0
            r11 = r77
            goto L_0x04a1
        L_0x031a:
            if (r3 == 0) goto L_0x031f
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x0321
        L_0x031f:
            r3 = r76
        L_0x0321:
            if (r15 == 0) goto L_0x0325
            r9 = 1
            goto L_0x0327
        L_0x0325:
            r9 = r77
        L_0x0327:
            if (r18 == 0) goto L_0x032c
            r65 = r64
            goto L_0x032e
        L_0x032c:
            r65 = r78
        L_0x032e:
            r15 = r8 & 32
            if (r15 == 0) goto L_0x0345
            androidx.compose.runtime.ProvidableCompositionLocal r15 = androidx.compose.material.TextKt.getLocalTextStyle()
            java.lang.Object r15 = r7.consume(r15)
            androidx.compose.ui.text.TextStyle r15 = (androidx.compose.p002ui.text.TextStyle) r15
            r18 = -458753(0xfffffffffff8ffff, float:NaN)
            r0 = r0 & r18
            r66 = r0
            r0 = r15
            goto L_0x0349
        L_0x0345:
            r66 = r0
            r0 = r79
        L_0x0349:
            if (r24 == 0) goto L_0x034e
            r67 = 0
            goto L_0x0350
        L_0x034e:
            r67 = r80
        L_0x0350:
            if (r6 == 0) goto L_0x0354
            r6 = 0
            goto L_0x0356
        L_0x0354:
            r6 = r81
        L_0x0356:
            if (r1 == 0) goto L_0x035a
            r1 = 0
            goto L_0x035c
        L_0x035a:
            r1 = r82
        L_0x035c:
            if (r2 == 0) goto L_0x0360
            r2 = 0
            goto L_0x0362
        L_0x0360:
            r2 = r83
        L_0x0362:
            if (r4 == 0) goto L_0x0367
            r4 = r64
            goto L_0x0369
        L_0x0367:
            r4 = r84
        L_0x0369:
            if (r5 == 0) goto L_0x0372
            androidx.compose.ui.text.input.VisualTransformation$Companion r5 = androidx.compose.p002ui.text.input.VisualTransformation.Companion
            androidx.compose.ui.text.input.VisualTransformation r5 = r5.getNone()
            goto L_0x0374
        L_0x0372:
            r5 = r85
        L_0x0374:
            if (r12 == 0) goto L_0x037d
            androidx.compose.foundation.text.KeyboardOptions$Companion r12 = androidx.compose.foundation.text.KeyboardOptions.Companion
            androidx.compose.foundation.text.KeyboardOptions r12 = r12.getDefault()
            goto L_0x037f
        L_0x037d:
            r12 = r86
        L_0x037f:
            r15 = r8 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x03b2
            androidx.compose.foundation.text.KeyboardActions r15 = new androidx.compose.foundation.text.KeyboardActions
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 63
            r26 = 0
            r76 = r15
            r77 = r18
            r78 = r19
            r79 = r20
            r80 = r21
            r81 = r22
            r82 = r23
            r83 = r24
            r84 = r26
            r76.<init>(r77, r78, r79, r80, r81, r82, r83, r84)
            r11 = r11 & -7169(0xffffffffffffe3ff, float:NaN)
            r73 = r15
            r15 = r11
            r11 = r73
            goto L_0x03b5
        L_0x03b2:
            r15 = r11
            r11 = r87
        L_0x03b5:
            if (r13 == 0) goto L_0x03ba
            r13 = r64
            goto L_0x03bc
        L_0x03ba:
            r13 = r88
        L_0x03bc:
            r18 = 32768(0x8000, float:4.5918E-41)
            r18 = r8 & r18
            if (r18 == 0) goto L_0x03d3
            if (r13 == 0) goto L_0x03c8
            r18 = 1
            goto L_0x03cb
        L_0x03c8:
            r18 = 2147483647(0x7fffffff, float:NaN)
        L_0x03cb:
            r19 = -458753(0xfffffffffff8ffff, float:NaN)
            r15 = r15 & r19
            r68 = r18
            goto L_0x03d5
        L_0x03d3:
            r68 = r89
        L_0x03d5:
            if (r16 == 0) goto L_0x03da
            r69 = 1
            goto L_0x03dc
        L_0x03da:
            r69 = r90
        L_0x03dc:
            if (r17 == 0) goto L_0x03fe
            r14 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r7.startReplaceableGroup(r14)
            java.lang.Object r14 = r7.rememberedValue()
            androidx.compose.runtime.Composer$Companion r16 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r10 = r16.getEmpty()
            if (r14 != r10) goto L_0x03f7
            androidx.compose.foundation.interaction.MutableInteractionSource r14 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r7.updateRememberedValue(r14)
        L_0x03f7:
            r7.endReplaceableGroup()
            r10 = r14
            androidx.compose.foundation.interaction.MutableInteractionSource r10 = (androidx.compose.foundation.interaction.MutableInteractionSource) r10
            goto L_0x0400
        L_0x03fe:
            r10 = r91
        L_0x0400:
            r14 = 262144(0x40000, float:3.67342E-40)
            r14 = r14 & r8
            if (r14 == 0) goto L_0x0415
            androidx.compose.material.TextFieldDefaults r14 = androidx.compose.material.TextFieldDefaults.INSTANCE
            r76 = r0
            r0 = 6
            androidx.compose.ui.graphics.Shape r0 = r14.getTextFieldShape(r7, r0)
            r14 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r14 = r14 & r15
            r70 = r14
            goto L_0x041b
        L_0x0415:
            r76 = r0
            r0 = r92
            r70 = r15
        L_0x041b:
            r14 = r8 & r25
            if (r14 == 0) goto L_0x0481
            androidx.compose.material.TextFieldDefaults r14 = androidx.compose.material.TextFieldDefaults.INSTANCE
            r15 = 0
            r16 = 0
            r77 = r0
            r0 = r15
            r15 = r16
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
            r43 = 0
            r45 = 0
            r47 = 0
            r49 = 0
            r51 = 0
            r53 = 0
            r55 = 0
            r58 = 0
            r59 = 0
            r60 = 48
            r61 = 2097151(0x1fffff, float:2.938734E-39)
            r57 = r7
            androidx.compose.material.TextFieldColors r14 = r14.m34185textFieldColorsdx8h9Zs(r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r58, r59, r60, r61)
            r15 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r15 = r70 & r15
            r21 = r1
            r22 = r2
            r23 = r5
            r20 = r6
            r27 = r10
            r25 = r11
            r24 = r12
            r26 = r13
            r1 = r66
            r10 = r76
            r6 = r77
            r13 = r3
            r11 = r9
            r3 = r15
            r9 = r4
            r4 = r14
            goto L_0x04a1
        L_0x0481:
            r77 = r0
            r0 = 0
            r21 = r1
            r22 = r2
            r23 = r5
            r20 = r6
            r27 = r10
            r25 = r11
            r24 = r12
            r26 = r13
            r1 = r66
            r10 = r76
            r6 = r77
            r13 = r3
            r11 = r9
            r3 = r70
            r9 = r4
            r4 = r93
        L_0x04a1:
            r7.endDefaults()
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x04b2
            r2 = -359119489(0xffffffffea98457f, float:-9.2042455E25)
            java.lang.String r5 = "androidx.compose.material.TextField (TextField.kt:347)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r1, r3, r5)
        L_0x04b2:
            r2 = -833018186(0xffffffffce5926b6, float:-9.1079821E8)
            r7.startReplaceableGroup(r2)
            long r14 = r10.m37995getColor0d7_KjU()
            androidx.compose.ui.graphics.Color$Companion r2 = androidx.compose.p002ui.graphics.Color.Companion
            long r16 = r2.m35707getUnspecified0d7_KjU()
            int r2 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r2 == 0) goto L_0x04c8
            r64 = 1
        L_0x04c8:
            if (r64 == 0) goto L_0x04cb
            goto L_0x04e2
        L_0x04cb:
            int r2 = r1 >> 9
            r2 = r2 & 14
            int r5 = r3 >> 24
            r5 = r5 & 112(0x70, float:1.57E-43)
            r2 = r2 | r5
            androidx.compose.runtime.State r2 = r4.textColor(r11, r7, r2)
            java.lang.Object r2 = r2.getValue()
            androidx.compose.ui.graphics.Color r2 = (androidx.compose.p002ui.graphics.Color) r2
            long r14 = r2.m35681unboximpl()
        L_0x04e2:
            r29 = r14
            r7.endReplaceableGroup()
            androidx.compose.ui.text.TextStyle r2 = new androidx.compose.ui.text.TextStyle
            r28 = r2
            r31 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r56 = 4194302(0x3ffffe, float:5.877469E-39)
            r57 = 0
            r28.<init>((long) r29, (long) r31, (androidx.compose.p002ui.text.font.FontWeight) r33, (androidx.compose.p002ui.text.font.FontStyle) r34, (androidx.compose.p002ui.text.font.FontSynthesis) r35, (androidx.compose.p002ui.text.font.FontFamily) r36, (java.lang.String) r37, (long) r38, (androidx.compose.p002ui.text.style.BaselineShift) r40, (androidx.compose.p002ui.text.style.TextGeometricTransform) r41, (androidx.compose.p002ui.text.intl.LocaleList) r42, (long) r43, (androidx.compose.p002ui.text.style.TextDecoration) r45, (androidx.compose.p002ui.graphics.Shadow) r46, (androidx.compose.p002ui.text.style.TextAlign) r47, (androidx.compose.p002ui.text.style.TextDirection) r48, (long) r49, (androidx.compose.p002ui.text.style.TextIndent) r51, (androidx.compose.p002ui.text.PlatformTextStyle) r52, (androidx.compose.p002ui.text.style.LineHeightStyle) r53, (androidx.compose.p002ui.text.style.LineBreak) r54, (androidx.compose.p002ui.text.style.Hyphens) r55, (int) r56, (kotlin.jvm.internal.DefaultConstructorMarker) r57)
            androidx.compose.ui.text.TextStyle r5 = r10.merge((androidx.compose.p002ui.text.TextStyle) r2)
            androidx.compose.material.TextFieldDefaults r2 = androidx.compose.material.TextFieldDefaults.INSTANCE
            int r12 = r1 >> 9
            r12 = r12 & 14
            int r14 = r3 >> 24
            r15 = r14 & 112(0x70, float:1.57E-43)
            r12 = r12 | r15
            androidx.compose.runtime.State r12 = r4.backgroundColor(r11, r7, r12)
            java.lang.Object r12 = r12.getValue()
            androidx.compose.ui.graphics.Color r12 = (androidx.compose.p002ui.graphics.Color) r12
            r16 = r1
            long r0 = r12.m35681unboximpl()
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.BackgroundKt.m32956backgroundbw27NRU(r13, r0, r6)
            r1 = 0
            r12 = 0
            r14 = 48
            r17 = 0
            r76 = r2
            r77 = r0
            r78 = r11
            r79 = r9
            r80 = r27
            r81 = r4
            r82 = r1
            r83 = r12
            r84 = r14
            r85 = r17
            androidx.compose.ui.Modifier r0 = androidx.compose.material.TextFieldDefaults.m34173indicatorLinegv0btCI$default(r76, r77, r78, r79, r80, r81, r82, r83, r84, r85)
            float r1 = r2.m34180getMinWidthD9Ej5fM()
            float r2 = r2.m34179getMinHeightD9Ej5fM()
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.m33322defaultMinSizeVpY3zN4(r0, r1, r2)
            androidx.compose.ui.graphics.SolidColor r0 = new androidx.compose.ui.graphics.SolidColor
            r14 = r0
            r1 = r3 & 14
            r1 = r1 | r15
            androidx.compose.runtime.State r1 = r4.cursorColor(r9, r7, r1)
            java.lang.Object r1 = r1.getValue()
            androidx.compose.ui.graphics.Color r1 = (androidx.compose.p002ui.graphics.Color) r1
            r28 = r13
            long r12 = r1.m35681unboximpl()
            r1 = 0
            r0.<init>(r12, r1)
            r12 = 0
            androidx.compose.material.TextFieldKt$TextField$7 r0 = new androidx.compose.material.TextFieldKt$TextField$7
            r76 = r0
            r77 = r74
            r79 = r26
            r80 = r23
            r81 = r27
            r82 = r9
            r83 = r67
            r84 = r20
            r85 = r21
            r86 = r22
            r87 = r4
            r88 = r16
            r89 = r3
            r76.<init>(r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89)
            r1 = -126640971(0xfffffffff8739cb5, float:-1.9764165E34)
            r13 = 1
            androidx.compose.runtime.internal.ComposableLambda r15 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r7, r1, r13, r0)
            r0 = r16 & 14
            r1 = r16 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            r1 = r16
            r13 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r13
            r1 = r1 & r62
            r0 = r0 | r1
            int r1 = r3 << 12
            r13 = r1 & r63
            r0 = r0 | r13
            r13 = 29360128(0x1c00000, float:7.052966E-38)
            r13 = r13 & r1
            r0 = r0 | r13
            r13 = 234881024(0xe000000, float:1.5777218E-30)
            r13 = r13 & r1
            r0 = r0 | r13
            r13 = 1879048192(0x70000000, float:1.58456325E29)
            r1 = r1 & r13
            r17 = r0 | r1
            int r0 = r3 >> 18
            r0 = r0 & 14
            r1 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 | r1
            r1 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            int r1 = r3 >> 12
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r18 = r0 | r1
            r19 = 4096(0x1000, float:5.74E-42)
            r0 = r74
            r1 = r75
            r3 = r11
            r29 = r4
            r4 = r65
            r30 = r6
            r6 = r24
            r31 = r7
            r7 = r25
            r8 = r26
            r32 = r9
            r9 = r68
            r33 = r10
            r10 = r69
            r34 = r11
            r11 = r23
            r13 = r27
            r16 = r31
            androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField((androidx.compose.p002ui.text.input.TextFieldValue) r0, (kotlin.jvm.functions.Function1<? super androidx.compose.p002ui.text.input.TextFieldValue, p336ef.C11921v>) r1, (androidx.compose.p002ui.Modifier) r2, (boolean) r3, (boolean) r4, (androidx.compose.p002ui.text.TextStyle) r5, (androidx.compose.foundation.text.KeyboardOptions) r6, (androidx.compose.foundation.text.KeyboardActions) r7, (boolean) r8, (int) r9, (int) r10, (androidx.compose.p002ui.text.input.VisualTransformation) r11, (kotlin.jvm.functions.Function1<? super androidx.compose.p002ui.text.TextLayoutResult, p336ef.C11921v>) r12, (androidx.compose.foundation.interaction.MutableInteractionSource) r13, (androidx.compose.p002ui.graphics.Brush) r14, (p404of.C13089p<? super p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v>) r15, (androidx.compose.runtime.Composer) r16, (int) r17, (int) r18, (int) r19)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x060c
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x060c:
            r8 = r20
            r9 = r21
            r10 = r22
            r12 = r23
            r13 = r24
            r14 = r25
            r15 = r26
            r18 = r27
            r3 = r28
            r20 = r29
            r19 = r30
            r11 = r32
            r6 = r33
            r4 = r34
            r5 = r65
            r7 = r67
            r16 = r68
            r17 = r69
        L_0x0630:
            androidx.compose.runtime.ScopeUpdateScope r2 = r31.endRestartGroup()
            if (r2 != 0) goto L_0x0637
            goto L_0x0652
        L_0x0637:
            androidx.compose.material.TextFieldKt$TextField$8 r1 = new androidx.compose.material.TextFieldKt$TextField$8
            r0 = r1
            r71 = r1
            r1 = r74
            r72 = r2
            r2 = r75
            r21 = r95
            r22 = r96
            r23 = r97
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r1 = r71
            r0 = r72
            r0.updateScope(r1)
        L_0x0652:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.TextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, of.o, of.o, of.o, of.o, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01af, code lost:
        if (r10.changed((java.lang.Object) r85) != false) goto L_0x01b6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x04ef  */
    /* JADX WARNING: Removed duplicated region for block: B:290:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0134  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void TextField(androidx.compose.p002ui.text.input.TextFieldValue r72, kotlin.jvm.functions.Function1 r73, androidx.compose.p002ui.Modifier r74, boolean r75, boolean r76, androidx.compose.p002ui.text.TextStyle r77, p404of.C13088o r78, p404of.C13088o r79, p404of.C13088o r80, p404of.C13088o r81, boolean r82, androidx.compose.p002ui.text.input.VisualTransformation r83, androidx.compose.foundation.text.KeyboardOptions r84, androidx.compose.foundation.text.KeyboardActions r85, boolean r86, int r87, androidx.compose.foundation.interaction.MutableInteractionSource r88, androidx.compose.p002ui.graphics.Shape r89, androidx.compose.material.TextFieldColors r90, androidx.compose.runtime.Composer r91, int r92, int r93, int r94) {
        /*
            r15 = r72
            r14 = r73
            r13 = r92
            r12 = r93
            r11 = r94
            java.lang.String r0 = "value"
            kotlin.jvm.internal.C12775o.m28639i(r15, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.C12775o.m28639i(r14, r0)
            r0 = -1576622884(0xffffffffa206a4dc, float:-1.8247662E-18)
            r1 = r91
            androidx.compose.runtime.Composer r10 = r1.startRestartGroup(r0)
            r0 = r11 & 1
            if (r0 == 0) goto L_0x0024
            r0 = r13 | 6
            goto L_0x0034
        L_0x0024:
            r0 = r13 & 14
            if (r0 != 0) goto L_0x0033
            boolean r0 = r10.changed((java.lang.Object) r15)
            if (r0 == 0) goto L_0x0030
            r0 = 4
            goto L_0x0031
        L_0x0030:
            r0 = 2
        L_0x0031:
            r0 = r0 | r13
            goto L_0x0034
        L_0x0033:
            r0 = r13
        L_0x0034:
            r3 = r11 & 2
            if (r3 == 0) goto L_0x003b
            r0 = r0 | 48
            goto L_0x004b
        L_0x003b:
            r3 = r13 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004b
            boolean r3 = r10.changedInstance(r14)
            if (r3 == 0) goto L_0x0048
            r3 = 32
            goto L_0x004a
        L_0x0048:
            r3 = 16
        L_0x004a:
            r0 = r0 | r3
        L_0x004b:
            r3 = r11 & 4
            if (r3 == 0) goto L_0x0052
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0065
        L_0x0052:
            r8 = r13 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0065
            r8 = r74
            boolean r9 = r10.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x0061
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r0 = r0 | r9
            goto L_0x0067
        L_0x0065:
            r8 = r74
        L_0x0067:
            r9 = r11 & 8
            r16 = 2048(0x800, float:2.87E-42)
            r17 = 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x0072
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0086
        L_0x0072:
            r1 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x0086
            r1 = r75
            boolean r18 = r10.changed((boolean) r1)
            if (r18 == 0) goto L_0x0081
            r18 = r16
            goto L_0x0083
        L_0x0081:
            r18 = r17
        L_0x0083:
            r0 = r0 | r18
            goto L_0x0088
        L_0x0086:
            r1 = r75
        L_0x0088:
            r18 = r11 & 16
            r19 = 16384(0x4000, float:2.2959E-41)
            r64 = 57344(0xe000, float:8.0356E-41)
            r20 = 8192(0x2000, float:1.14794E-41)
            if (r18 == 0) goto L_0x0098
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r2 = r76
            goto L_0x00ab
        L_0x0098:
            r21 = r13 & r64
            r2 = r76
            if (r21 != 0) goto L_0x00ab
            boolean r22 = r10.changed((boolean) r2)
            if (r22 == 0) goto L_0x00a7
            r22 = r19
            goto L_0x00a9
        L_0x00a7:
            r22 = r20
        L_0x00a9:
            r0 = r0 | r22
        L_0x00ab:
            r65 = 458752(0x70000, float:6.42848E-40)
            r22 = r13 & r65
            r23 = 131072(0x20000, float:1.83671E-40)
            if (r22 != 0) goto L_0x00c7
            r22 = r11 & 32
            r4 = r77
            if (r22 != 0) goto L_0x00c2
            boolean r24 = r10.changed((java.lang.Object) r4)
            if (r24 == 0) goto L_0x00c2
            r24 = r23
            goto L_0x00c4
        L_0x00c2:
            r24 = 65536(0x10000, float:9.18355E-41)
        L_0x00c4:
            r0 = r0 | r24
            goto L_0x00c9
        L_0x00c7:
            r4 = r77
        L_0x00c9:
            r24 = r11 & 64
            if (r24 == 0) goto L_0x00d4
            r25 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 | r25
            r5 = r78
            goto L_0x00e9
        L_0x00d4:
            r25 = 3670016(0x380000, float:5.142788E-39)
            r25 = r13 & r25
            r5 = r78
            if (r25 != 0) goto L_0x00e9
            boolean r26 = r10.changedInstance(r5)
            if (r26 == 0) goto L_0x00e5
            r26 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e7
        L_0x00e5:
            r26 = 524288(0x80000, float:7.34684E-40)
        L_0x00e7:
            r0 = r0 | r26
        L_0x00e9:
            r6 = r11 & 128(0x80, float:1.794E-43)
            r66 = 29360128(0x1c00000, float:7.052966E-38)
            if (r6 == 0) goto L_0x00f6
            r27 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r27
            r7 = r79
            goto L_0x0109
        L_0x00f6:
            r27 = r13 & r66
            r7 = r79
            if (r27 != 0) goto L_0x0109
            boolean r28 = r10.changedInstance(r7)
            if (r28 == 0) goto L_0x0105
            r28 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0107
        L_0x0105:
            r28 = 4194304(0x400000, float:5.877472E-39)
        L_0x0107:
            r0 = r0 | r28
        L_0x0109:
            r1 = r11 & 256(0x100, float:3.59E-43)
            r67 = 234881024(0xe000000, float:1.5777218E-30)
            if (r1 == 0) goto L_0x0116
            r28 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 | r28
            r2 = r80
            goto L_0x0129
        L_0x0116:
            r28 = r13 & r67
            r2 = r80
            if (r28 != 0) goto L_0x0129
            boolean r28 = r10.changedInstance(r2)
            if (r28 == 0) goto L_0x0125
            r28 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0127
        L_0x0125:
            r28 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0127:
            r0 = r0 | r28
        L_0x0129:
            r2 = r11 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x0134
            r28 = 805306368(0x30000000, float:4.656613E-10)
            r0 = r0 | r28
            r4 = r81
            goto L_0x0149
        L_0x0134:
            r28 = 1879048192(0x70000000, float:1.58456325E29)
            r28 = r13 & r28
            r4 = r81
            if (r28 != 0) goto L_0x0149
            boolean r28 = r10.changedInstance(r4)
            if (r28 == 0) goto L_0x0145
            r28 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0147
        L_0x0145:
            r28 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0147:
            r0 = r0 | r28
        L_0x0149:
            r4 = r11 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x0152
            r21 = r12 | 6
            r5 = r82
            goto L_0x0168
        L_0x0152:
            r28 = r12 & 14
            r5 = r82
            if (r28 != 0) goto L_0x0166
            boolean r28 = r10.changed((boolean) r5)
            if (r28 == 0) goto L_0x0161
            r21 = 4
            goto L_0x0163
        L_0x0161:
            r21 = 2
        L_0x0163:
            r21 = r12 | r21
            goto L_0x0168
        L_0x0166:
            r21 = r12
        L_0x0168:
            r5 = r11 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x016f
            r21 = r21 | 48
            goto L_0x0182
        L_0x016f:
            r28 = r12 & 112(0x70, float:1.57E-43)
            r7 = r83
            if (r28 != 0) goto L_0x0182
            boolean r28 = r10.changed((java.lang.Object) r7)
            if (r28 == 0) goto L_0x017e
            r25 = 32
            goto L_0x0180
        L_0x017e:
            r25 = 16
        L_0x0180:
            r21 = r21 | r25
        L_0x0182:
            r7 = r21
            r8 = r11 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto L_0x018b
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x019f
        L_0x018b:
            r14 = r12 & 896(0x380, float:1.256E-42)
            if (r14 != 0) goto L_0x019f
            r14 = r84
            boolean r21 = r10.changed((java.lang.Object) r14)
            if (r21 == 0) goto L_0x019a
            r26 = 256(0x100, float:3.59E-43)
            goto L_0x019c
        L_0x019a:
            r26 = 128(0x80, float:1.794E-43)
        L_0x019c:
            r7 = r7 | r26
            goto L_0x01a1
        L_0x019f:
            r14 = r84
        L_0x01a1:
            r14 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r14 != 0) goto L_0x01b9
            r14 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r14 != 0) goto L_0x01b2
            r14 = r85
            boolean r21 = r10.changed((java.lang.Object) r14)
            if (r21 == 0) goto L_0x01b4
            goto L_0x01b6
        L_0x01b2:
            r14 = r85
        L_0x01b4:
            r16 = r17
        L_0x01b6:
            r7 = r7 | r16
            goto L_0x01bb
        L_0x01b9:
            r14 = r85
        L_0x01bb:
            r14 = r11 & 16384(0x4000, float:2.2959E-41)
            if (r14 == 0) goto L_0x01c4
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
            r15 = r86
            goto L_0x01d5
        L_0x01c4:
            r16 = r12 & r64
            r15 = r86
            if (r16 != 0) goto L_0x01d5
            boolean r16 = r10.changed((boolean) r15)
            if (r16 == 0) goto L_0x01d1
            goto L_0x01d3
        L_0x01d1:
            r19 = r20
        L_0x01d3:
            r7 = r7 | r19
        L_0x01d5:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r11 & r16
            if (r16 == 0) goto L_0x01e3
            r17 = 196608(0x30000, float:2.75506E-40)
            r7 = r7 | r17
            r15 = r87
            goto L_0x01f6
        L_0x01e3:
            r17 = r12 & r65
            r15 = r87
            if (r17 != 0) goto L_0x01f6
            boolean r17 = r10.changed((int) r15)
            if (r17 == 0) goto L_0x01f2
            r17 = r23
            goto L_0x01f4
        L_0x01f2:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x01f4:
            r7 = r7 | r17
        L_0x01f6:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r11 & r17
            if (r17 == 0) goto L_0x0203
            r19 = 1572864(0x180000, float:2.204052E-39)
            r7 = r7 | r19
            r15 = r88
            goto L_0x0218
        L_0x0203:
            r19 = 3670016(0x380000, float:5.142788E-39)
            r19 = r12 & r19
            r15 = r88
            if (r19 != 0) goto L_0x0218
            boolean r19 = r10.changed((java.lang.Object) r15)
            if (r19 == 0) goto L_0x0214
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0216
        L_0x0214:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x0216:
            r7 = r7 | r19
        L_0x0218:
            r19 = r12 & r66
            if (r19 != 0) goto L_0x0230
            r19 = r11 & r23
            r15 = r89
            if (r19 != 0) goto L_0x022b
            boolean r19 = r10.changed((java.lang.Object) r15)
            if (r19 == 0) goto L_0x022b
            r19 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x022d
        L_0x022b:
            r19 = 4194304(0x400000, float:5.877472E-39)
        L_0x022d:
            r7 = r7 | r19
            goto L_0x0232
        L_0x0230:
            r15 = r89
        L_0x0232:
            r19 = r12 & r67
            if (r19 != 0) goto L_0x024c
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r11 & r19
            r12 = r90
            if (r19 != 0) goto L_0x0247
            boolean r19 = r10.changed((java.lang.Object) r12)
            if (r19 == 0) goto L_0x0247
            r19 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0249
        L_0x0247:
            r19 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0249:
            r7 = r7 | r19
            goto L_0x024e
        L_0x024c:
            r12 = r90
        L_0x024e:
            r19 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r12 = r0 & r19
            r15 = 306783378(0x12492492, float:6.3469493E-28)
            if (r12 != r15) goto L_0x0291
            r12 = 191739611(0xb6db6db, float:4.5782105E-32)
            r12 = r12 & r7
            r15 = 38347922(0x2492492, float:1.4777643E-37)
            if (r12 != r15) goto L_0x0291
            boolean r12 = r10.getSkipping()
            if (r12 != 0) goto L_0x0268
            goto L_0x0291
        L_0x0268:
            r10.skipToGroupEnd()
            r3 = r74
            r4 = r75
            r5 = r76
            r6 = r77
            r7 = r78
            r8 = r79
            r9 = r80
            r11 = r82
            r12 = r83
            r13 = r84
            r14 = r85
            r15 = r86
            r16 = r87
            r17 = r88
            r18 = r89
            r19 = r90
            r39 = r10
            r10 = r81
            goto L_0x04e8
        L_0x0291:
            r10.startDefaults()
            r12 = r13 & 1
            if (r12 == 0) goto L_0x02e5
            boolean r12 = r10.getDefaultsInvalid()
            if (r12 == 0) goto L_0x029f
            goto L_0x02e5
        L_0x029f:
            r10.skipToGroupEnd()
            r1 = r11 & 32
            if (r1 == 0) goto L_0x02aa
            r1 = -458753(0xfffffffffff8ffff, float:NaN)
            r0 = r0 & r1
        L_0x02aa:
            r1 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x02b0
            r7 = r7 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x02b0:
            r1 = r11 & r23
            if (r1 == 0) goto L_0x02b8
            r1 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r7 = r7 & r1
        L_0x02b8:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r11
            if (r1 == 0) goto L_0x02c1
            r1 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r7 = r7 & r1
        L_0x02c1:
            r24 = r74
            r25 = r75
            r26 = r76
            r27 = r77
            r68 = r78
            r28 = r79
            r29 = r80
            r30 = r81
            r31 = r82
            r32 = r83
            r33 = r84
            r34 = r85
            r35 = r86
            r69 = r87
            r36 = r88
            r37 = r89
            r38 = r90
            goto L_0x043a
        L_0x02e5:
            if (r3 == 0) goto L_0x02ea
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x02ec
        L_0x02ea:
            r3 = r74
        L_0x02ec:
            if (r9 == 0) goto L_0x02f0
            r9 = 1
            goto L_0x02f2
        L_0x02f0:
            r9 = r75
        L_0x02f2:
            if (r18 == 0) goto L_0x02f6
            r12 = 0
            goto L_0x02f8
        L_0x02f6:
            r12 = r76
        L_0x02f8:
            r15 = r11 & 32
            if (r15 == 0) goto L_0x030c
            androidx.compose.runtime.ProvidableCompositionLocal r15 = androidx.compose.material.TextKt.getLocalTextStyle()
            java.lang.Object r15 = r10.consume(r15)
            androidx.compose.ui.text.TextStyle r15 = (androidx.compose.p002ui.text.TextStyle) r15
            r18 = -458753(0xfffffffffff8ffff, float:NaN)
            r0 = r0 & r18
            goto L_0x030e
        L_0x030c:
            r15 = r77
        L_0x030e:
            r18 = 0
            if (r24 == 0) goto L_0x0315
            r68 = r18
            goto L_0x0317
        L_0x0315:
            r68 = r78
        L_0x0317:
            if (r6 == 0) goto L_0x031c
            r6 = r18
            goto L_0x031e
        L_0x031c:
            r6 = r79
        L_0x031e:
            if (r1 == 0) goto L_0x0323
            r1 = r18
            goto L_0x0325
        L_0x0323:
            r1 = r80
        L_0x0325:
            if (r2 == 0) goto L_0x032a
            r2 = r18
            goto L_0x032c
        L_0x032a:
            r2 = r81
        L_0x032c:
            if (r4 == 0) goto L_0x0330
            r4 = 0
            goto L_0x0332
        L_0x0330:
            r4 = r82
        L_0x0332:
            if (r5 == 0) goto L_0x033b
            androidx.compose.ui.text.input.VisualTransformation$Companion r5 = androidx.compose.p002ui.text.input.VisualTransformation.Companion
            androidx.compose.ui.text.input.VisualTransformation r5 = r5.getNone()
            goto L_0x033d
        L_0x033b:
            r5 = r83
        L_0x033d:
            if (r8 == 0) goto L_0x0346
            androidx.compose.foundation.text.KeyboardOptions$Companion r8 = androidx.compose.foundation.text.KeyboardOptions.Companion
            androidx.compose.foundation.text.KeyboardOptions r8 = r8.getDefault()
            goto L_0x0348
        L_0x0346:
            r8 = r84
        L_0x0348:
            r74 = r0
            r0 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0378
            androidx.compose.foundation.text.KeyboardActions r0 = new androidx.compose.foundation.text.KeyboardActions
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 63
            r26 = 0
            r75 = r0
            r76 = r18
            r77 = r19
            r78 = r20
            r79 = r21
            r80 = r22
            r81 = r24
            r82 = r25
            r83 = r26
            r75.<init>(r76, r77, r78, r79, r80, r81, r82, r83)
            r7 = r7 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x037a
        L_0x0378:
            r0 = r85
        L_0x037a:
            if (r14 == 0) goto L_0x037e
            r14 = 0
            goto L_0x0380
        L_0x037e:
            r14 = r86
        L_0x0380:
            if (r16 == 0) goto L_0x0388
            r16 = 2147483647(0x7fffffff, float:NaN)
            r69 = r16
            goto L_0x038a
        L_0x0388:
            r69 = r87
        L_0x038a:
            r75 = r0
            if (r17 == 0) goto L_0x03af
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.startReplaceableGroup(r0)
            java.lang.Object r0 = r10.rememberedValue()
            androidx.compose.runtime.Composer$Companion r16 = androidx.compose.runtime.Composer.Companion
            r76 = r1
            java.lang.Object r1 = r16.getEmpty()
            if (r0 != r1) goto L_0x03a9
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r10.updateRememberedValue(r0)
        L_0x03a9:
            r10.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = (androidx.compose.foundation.interaction.MutableInteractionSource) r0
            goto L_0x03b3
        L_0x03af:
            r76 = r1
            r0 = r88
        L_0x03b3:
            r1 = r11 & r23
            if (r1 == 0) goto L_0x03c6
            androidx.compose.material.TextFieldDefaults r1 = androidx.compose.material.TextFieldDefaults.INSTANCE
            r77 = r0
            r0 = 6
            androidx.compose.ui.graphics.Shape r0 = r1.getTextFieldShape(r10, r0)
            r1 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r7
            r7 = r1
            goto L_0x03ca
        L_0x03c6:
            r77 = r0
            r0 = r89
        L_0x03ca:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r11
            if (r1 == 0) goto L_0x041a
            androidx.compose.material.TextFieldDefaults r16 = androidx.compose.material.TextFieldDefaults.INSTANCE
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
            r43 = 0
            r45 = 0
            r47 = 0
            r49 = 0
            r51 = 0
            r53 = 0
            r55 = 0
            r57 = 0
            r60 = 0
            r61 = 0
            r62 = 48
            r63 = 2097151(0x1fffff, float:2.938734E-39)
            r59 = r10
            androidx.compose.material.TextFieldColors r1 = r16.m34185textFieldColorsdx8h9Zs(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r60, r61, r62, r63)
            r16 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r7 = r7 & r16
            r34 = r75
            r29 = r76
            r36 = r77
            r37 = r0
            r38 = r1
            goto L_0x0424
        L_0x041a:
            r34 = r75
            r29 = r76
            r36 = r77
            r38 = r90
            r37 = r0
        L_0x0424:
            r30 = r2
            r24 = r3
            r31 = r4
            r32 = r5
            r28 = r6
            r33 = r8
            r25 = r9
            r26 = r12
            r35 = r14
            r27 = r15
            r0 = r74
        L_0x043a:
            r10.endDefaults()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x044b
            r1 = -1576622884(0xffffffffa206a4dc, float:-1.8247662E-18)
            java.lang.String r2 = "androidx.compose.material.TextField (TextField.kt:422)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r1, r0, r7, r2)
        L_0x044b:
            r16 = 1
            r1 = r0 & 14
            r2 = r0 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            r2 = r0 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            r2 = r0 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            r2 = r0 & r64
            r1 = r1 | r2
            r2 = r0 & r65
            r1 = r1 | r2
            r2 = 3670016(0x380000, float:5.142788E-39)
            r2 = r2 & r0
            r1 = r1 | r2
            r2 = r0 & r66
            r1 = r1 | r2
            r2 = r0 & r67
            r1 = r1 | r2
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r0 & r2
            r21 = r1 | r0
            r0 = 1572864(0x180000, float:2.204052E-39)
            r1 = r7 & 14
            r0 = r0 | r1
            r1 = r7 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            r1 = r7 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            r1 = r7 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r1
            r1 = r7 & r64
            r0 = r0 | r1
            r1 = r7 & r65
            r0 = r0 | r1
            int r1 = r7 << 3
            r2 = r1 & r66
            r0 = r0 | r2
            r2 = r1 & r67
            r0 = r0 | r2
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r1 = r1 & r2
            r22 = r0 | r1
            r23 = 0
            r0 = r72
            r1 = r73
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r27
            r6 = r68
            r7 = r28
            r8 = r29
            r9 = r30
            r39 = r10
            r10 = r31
            r11 = r32
            r12 = r33
            r13 = r34
            r14 = r35
            r15 = r69
            r17 = r36
            r18 = r37
            r19 = r38
            r20 = r39
            TextField((androidx.compose.p002ui.text.input.TextFieldValue) r0, (kotlin.jvm.functions.Function1<? super androidx.compose.p002ui.text.input.TextFieldValue, p336ef.C11921v>) r1, (androidx.compose.p002ui.Modifier) r2, (boolean) r3, (boolean) r4, (androidx.compose.p002ui.text.TextStyle) r5, (p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v>) r6, (p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v>) r7, (p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v>) r8, (p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v>) r9, (boolean) r10, (androidx.compose.p002ui.text.input.VisualTransformation) r11, (androidx.compose.foundation.text.KeyboardOptions) r12, (androidx.compose.foundation.text.KeyboardActions) r13, (boolean) r14, (int) r15, (int) r16, (androidx.compose.foundation.interaction.MutableInteractionSource) r17, (androidx.compose.p002ui.graphics.Shape) r18, (androidx.compose.material.TextFieldColors) r19, (androidx.compose.runtime.Composer) r20, (int) r21, (int) r22, (int) r23)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x04c6
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x04c6:
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r27
            r8 = r28
            r9 = r29
            r10 = r30
            r11 = r31
            r12 = r32
            r13 = r33
            r14 = r34
            r15 = r35
            r17 = r36
            r18 = r37
            r19 = r38
            r7 = r68
            r16 = r69
        L_0x04e8:
            androidx.compose.runtime.ScopeUpdateScope r2 = r39.endRestartGroup()
            if (r2 != 0) goto L_0x04ef
            goto L_0x050a
        L_0x04ef:
            androidx.compose.material.TextFieldKt$TextField$10 r1 = new androidx.compose.material.TextFieldKt$TextField$10
            r0 = r1
            r70 = r1
            r1 = r72
            r71 = r2
            r2 = r73
            r20 = r92
            r21 = r93
            r22 = r94
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r1 = r70
            r0 = r71
            r0.updateScope(r1)
        L_0x050a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.TextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, of.o, of.o, of.o, of.o, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
