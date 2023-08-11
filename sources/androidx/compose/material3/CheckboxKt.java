package androidx.compose.material3;

import androidx.compose.p002ui.geometry.CornerRadiusKt;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.geometry.SizeKt;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.PathEffect;
import androidx.compose.p002ui.graphics.StrokeCap;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.graphics.drawscope.Fill;
import androidx.compose.p002ui.graphics.drawscope.Stroke;
import androidx.compose.p002ui.state.ToggleableState;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.util.MathHelpersKt;
import com.rmn.api.p322v2.main.oauth.OAuthErrorCodes;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Checkbox.kt */
public final class CheckboxKt {
    private static final int BoxInDuration = 50;
    private static final int BoxOutDuration = 100;
    private static final int CheckAnimationDuration = 100;
    private static final float CheckboxDefaultPadding;
    private static final float CheckboxSize = C1232Dp.m38468constructorimpl((float) 20);
    /* access modifiers changed from: private */
    public static final float RadiusSize;
    /* access modifiers changed from: private */
    public static final float StrokeWidth;

    /* compiled from: Checkbox.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            iArr[ToggleableState.On.ordinal()] = 1;
            iArr[ToggleableState.Off.ordinal()] = 2;
            iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        float f = (float) 2;
        CheckboxDefaultPadding = C1232Dp.m38468constructorimpl(f);
        StrokeWidth = C1232Dp.m38468constructorimpl(f);
        RadiusSize = C1232Dp.m38468constructorimpl(f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c9  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void Checkbox(boolean r29, kotlin.jvm.functions.Function1<? super java.lang.Boolean, p336ef.C11921v> r30, androidx.compose.p002ui.Modifier r31, boolean r32, androidx.compose.material3.CheckboxColors r33, androidx.compose.foundation.interaction.MutableInteractionSource r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            r1 = r29
            r2 = r30
            r7 = r36
            r0 = -1406741137(0xffffffffac26d56f, float:-2.3708498E-12)
            r3 = r35
            androidx.compose.runtime.Composer r3 = r3.startRestartGroup(r0)
            r4 = r37 & 1
            if (r4 == 0) goto L_0x0016
            r4 = r7 | 6
            goto L_0x0026
        L_0x0016:
            r4 = r7 & 14
            if (r4 != 0) goto L_0x0025
            boolean r4 = r3.changed((boolean) r1)
            if (r4 == 0) goto L_0x0022
            r4 = 4
            goto L_0x0023
        L_0x0022:
            r4 = 2
        L_0x0023:
            r4 = r4 | r7
            goto L_0x0026
        L_0x0025:
            r4 = r7
        L_0x0026:
            r5 = r37 & 2
            if (r5 == 0) goto L_0x002d
            r4 = r4 | 48
            goto L_0x003d
        L_0x002d:
            r5 = r7 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x003d
            boolean r5 = r3.changed((java.lang.Object) r2)
            if (r5 == 0) goto L_0x003a
            r5 = 32
            goto L_0x003c
        L_0x003a:
            r5 = 16
        L_0x003c:
            r4 = r4 | r5
        L_0x003d:
            r5 = r37 & 4
            if (r5 == 0) goto L_0x0044
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x0057
        L_0x0044:
            r6 = r7 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0057
            r6 = r31
            boolean r8 = r3.changed((java.lang.Object) r6)
            if (r8 == 0) goto L_0x0053
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0055
        L_0x0053:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0055:
            r4 = r4 | r8
            goto L_0x0059
        L_0x0057:
            r6 = r31
        L_0x0059:
            r8 = r37 & 8
            if (r8 == 0) goto L_0x0060
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0073
        L_0x0060:
            r9 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0073
            r9 = r32
            boolean r10 = r3.changed((boolean) r9)
            if (r10 == 0) goto L_0x006f
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0071
        L_0x006f:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0071:
            r4 = r4 | r10
            goto L_0x0075
        L_0x0073:
            r9 = r32
        L_0x0075:
            r24 = 57344(0xe000, float:8.0356E-41)
            r10 = r7 & r24
            if (r10 != 0) goto L_0x0091
            r10 = r37 & 16
            if (r10 != 0) goto L_0x008b
            r10 = r33
            boolean r11 = r3.changed((java.lang.Object) r10)
            if (r11 == 0) goto L_0x008d
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008f
        L_0x008b:
            r10 = r33
        L_0x008d:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x008f:
            r4 = r4 | r11
            goto L_0x0093
        L_0x0091:
            r10 = r33
        L_0x0093:
            r25 = r37 & 32
            r26 = 458752(0x70000, float:6.42848E-40)
            if (r25 == 0) goto L_0x009f
            r11 = 196608(0x30000, float:2.75506E-40)
            r4 = r4 | r11
            r15 = r34
            goto L_0x00b1
        L_0x009f:
            r11 = r7 & r26
            r15 = r34
            if (r11 != 0) goto L_0x00b1
            boolean r11 = r3.changed((java.lang.Object) r15)
            if (r11 == 0) goto L_0x00ae
            r11 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b0
        L_0x00ae:
            r11 = 65536(0x10000, float:9.18355E-41)
        L_0x00b0:
            r4 = r4 | r11
        L_0x00b1:
            r11 = 374491(0x5b6db, float:5.24774E-40)
            r11 = r11 & r4
            r12 = 74898(0x12492, float:1.04954E-40)
            if (r11 != r12) goto L_0x00c9
            boolean r11 = r3.getSkipping()
            if (r11 != 0) goto L_0x00c1
            goto L_0x00c9
        L_0x00c1:
            r3.skipToGroupEnd()
            r5 = r6
            r4 = r9
            r6 = r15
            goto L_0x01b0
        L_0x00c9:
            r3.startDefaults()
            r11 = r7 & 1
            r27 = -57345(0xffffffffffff1fff, float:NaN)
            if (r11 == 0) goto L_0x00ea
            boolean r11 = r3.getDefaultsInvalid()
            if (r11 == 0) goto L_0x00da
            goto L_0x00ea
        L_0x00da:
            r3.skipToGroupEnd()
            r5 = r37 & 16
            if (r5 == 0) goto L_0x00e3
            r4 = r4 & r27
        L_0x00e3:
            r8 = r4
            r5 = r6
            r6 = r9
            r4 = r10
            r17 = r15
            goto L_0x0145
        L_0x00ea:
            if (r5 == 0) goto L_0x00ef
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x00f0
        L_0x00ef:
            r5 = r6
        L_0x00f0:
            if (r8 == 0) goto L_0x00f4
            r6 = 1
            goto L_0x00f5
        L_0x00f4:
            r6 = r9
        L_0x00f5:
            r8 = r37 & 16
            if (r8 == 0) goto L_0x011a
            androidx.compose.material3.CheckboxDefaults r8 = androidx.compose.material3.CheckboxDefaults.INSTANCE
            r9 = 0
            r11 = 0
            r13 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 1572864(0x180000, float:2.204052E-39)
            r23 = 63
            r15 = r16
            r17 = r18
            r19 = r20
            r21 = r3
            androidx.compose.material3.CheckboxColors r8 = r8.m34285colors5tl4gsc(r9, r11, r13, r15, r17, r19, r21, r22, r23)
            r4 = r4 & r27
            goto L_0x011b
        L_0x011a:
            r8 = r10
        L_0x011b:
            if (r25 == 0) goto L_0x013e
            r9 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r3.startReplaceableGroup(r9)
            java.lang.Object r9 = r3.rememberedValue()
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r10 = r10.getEmpty()
            if (r9 != r10) goto L_0x0136
            androidx.compose.foundation.interaction.MutableInteractionSource r9 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r3.updateRememberedValue(r9)
        L_0x0136:
            r3.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r9 = (androidx.compose.foundation.interaction.MutableInteractionSource) r9
            r17 = r9
            goto L_0x0140
        L_0x013e:
            r17 = r34
        L_0x0140:
            r28 = r8
            r8 = r4
            r4 = r28
        L_0x0145:
            r3.endDefaults()
            boolean r9 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r9 == 0) goto L_0x0154
            r9 = -1
            java.lang.String r10 = "androidx.compose.material3.Checkbox (Checkbox.kt:87)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r8, r9, r10)
        L_0x0154:
            androidx.compose.ui.state.ToggleableState r0 = androidx.compose.p002ui.state.ToggleableStateKt.ToggleableState(r29)
            if (r2 == 0) goto L_0x018a
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r29)
            r10 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r3.startReplaceableGroup(r10)
            boolean r10 = r3.changed((java.lang.Object) r2)
            boolean r9 = r3.changed((java.lang.Object) r9)
            r9 = r9 | r10
            java.lang.Object r10 = r3.rememberedValue()
            if (r9 != 0) goto L_0x017b
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r9 = r9.getEmpty()
            if (r10 != r9) goto L_0x0183
        L_0x017b:
            androidx.compose.material3.CheckboxKt$Checkbox$2$1 r10 = new androidx.compose.material3.CheckboxKt$Checkbox$2$1
            r10.<init>(r2, r1)
            r3.updateRememberedValue(r10)
        L_0x0183:
            r3.endReplaceableGroup()
            of.a r10 = (p404of.C13074a) r10
            r9 = r10
            goto L_0x018b
        L_0x018a:
            r9 = 0
        L_0x018b:
            r10 = r8 & 896(0x380, float:1.256E-42)
            r11 = r8 & 7168(0x1c00, float:1.0045E-41)
            r10 = r10 | r11
            r11 = r8 & r24
            r10 = r10 | r11
            r8 = r8 & r26
            r15 = r10 | r8
            r16 = 0
            r8 = r0
            r10 = r5
            r11 = r6
            r12 = r4
            r13 = r17
            r14 = r3
            TriStateCheckbox(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01ac
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01ac:
            r10 = r4
            r4 = r6
            r6 = r17
        L_0x01b0:
            androidx.compose.runtime.ScopeUpdateScope r9 = r3.endRestartGroup()
            if (r9 != 0) goto L_0x01b7
            goto L_0x01ca
        L_0x01b7:
            androidx.compose.material3.CheckboxKt$Checkbox$3 r11 = new androidx.compose.material3.CheckboxKt$Checkbox$3
            r0 = r11
            r1 = r29
            r2 = r30
            r3 = r5
            r5 = r10
            r7 = r36
            r8 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.updateScope(r11)
        L_0x01ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CheckboxKt.Checkbox(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.CheckboxColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v42, resolved type: androidx.compose.material3.CheckDrawingCache} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v43, resolved type: androidx.compose.material3.CheckboxKt$CheckboxImpl$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v1, resolved type: androidx.compose.material3.CheckboxKt$CheckboxImpl$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: androidx.compose.material3.CheckDrawingCache} */
    /* JADX WARNING: type inference failed for: r6v17 */
    /* JADX WARNING: type inference failed for: r6v27 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0286, code lost:
        if (r6 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L_0x0288;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0270 A[LOOP:0: B:106:0x026e->B:107:0x0270, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01cf  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void CheckboxImpl(boolean r34, androidx.compose.p002ui.state.ToggleableState r35, androidx.compose.p002ui.Modifier r36, androidx.compose.material3.CheckboxColors r37, androidx.compose.runtime.Composer r38, int r39) {
        /*
            r1 = r34
            r2 = r35
            r3 = r36
            r4 = r37
            r5 = r39
            r0 = 2007131616(0x77a265e0, float:6.5876434E33)
            r6 = r38
            androidx.compose.runtime.Composer r14 = r6.startRestartGroup(r0)
            r6 = r5 & 14
            r13 = 2
            if (r6 != 0) goto L_0x0023
            boolean r6 = r14.changed((boolean) r1)
            if (r6 == 0) goto L_0x0020
            r6 = 4
            goto L_0x0021
        L_0x0020:
            r6 = r13
        L_0x0021:
            r6 = r6 | r5
            goto L_0x0024
        L_0x0023:
            r6 = r5
        L_0x0024:
            r7 = r5 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0034
            boolean r7 = r14.changed((java.lang.Object) r2)
            if (r7 == 0) goto L_0x0031
            r7 = 32
            goto L_0x0033
        L_0x0031:
            r7 = 16
        L_0x0033:
            r6 = r6 | r7
        L_0x0034:
            r7 = r5 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0044
            boolean r7 = r14.changed((java.lang.Object) r3)
            if (r7 == 0) goto L_0x0041
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0043
        L_0x0041:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0043:
            r6 = r6 | r7
        L_0x0044:
            r7 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0054
            boolean r7 = r14.changed((java.lang.Object) r4)
            if (r7 == 0) goto L_0x0051
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0053
        L_0x0051:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0053:
            r6 = r6 | r7
        L_0x0054:
            r12 = r6
            r6 = r12 & 5851(0x16db, float:8.199E-42)
            r7 = 1170(0x492, float:1.64E-42)
            if (r6 != r7) goto L_0x0067
            boolean r6 = r14.getSkipping()
            if (r6 != 0) goto L_0x0062
            goto L_0x0067
        L_0x0062:
            r14.skipToGroupEnd()
            goto L_0x02a4
        L_0x0067:
            boolean r6 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            r11 = -1
            if (r6 == 0) goto L_0x0073
            java.lang.String r6 = "androidx.compose.material3.CheckboxImpl (Checkbox.kt:227)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r12, r11, r6)
        L_0x0073:
            int r0 = r12 >> 3
            r10 = r0 & 14
            r9 = 0
            androidx.compose.animation.core.Transition r16 = androidx.compose.animation.core.TransitionKt.updateTransition(r2, (java.lang.String) r9, (androidx.compose.runtime.Composer) r14, (int) r10, (int) r13)
            androidx.compose.material3.CheckboxKt$CheckboxImpl$checkDrawFraction$1 r6 = androidx.compose.material3.CheckboxKt$CheckboxImpl$checkDrawFraction$1.INSTANCE
            r8 = 1399891485(0x5370a61d, float:1.03357907E12)
            r14.startReplaceableGroup(r8)
            java.lang.String r17 = "FloatAnimation"
            kotlin.jvm.internal.h r18 = kotlin.jvm.internal.C12763h.f20419a
            androidx.compose.animation.core.TwoWayConverter r19 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter((kotlin.jvm.internal.C12763h) r18)
            r7 = 1847725064(0x6e220c08, float:1.2537779E28)
            r14.startReplaceableGroup(r7)
            java.lang.Object r20 = r16.getCurrentState()
            androidx.compose.ui.state.ToggleableState r20 = (androidx.compose.p002ui.state.ToggleableState) r20
            r7 = 1800065638(0x6b4ad266, float:2.451966E26)
            r14.startReplaceableGroup(r7)
            boolean r21 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            java.lang.String r8 = "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:242)"
            r15 = 0
            if (r21 == 0) goto L_0x00aa
            androidx.compose.runtime.ComposerKt.traceEventStart(r7, r15, r11, r8)
        L_0x00aa:
            int[] r21 = androidx.compose.material3.CheckboxKt.WhenMappings.$EnumSwitchMapping$0
            int r20 = r20.ordinal()
            r9 = r21[r20]
            r20 = 0
            r23 = 1065353216(0x3f800000, float:1.0)
            r11 = 1
            r15 = 3
            if (r9 == r11) goto L_0x00c8
            if (r9 == r13) goto L_0x00c5
            if (r9 != r15) goto L_0x00bf
            goto L_0x00c8
        L_0x00bf:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00c5:
            r9 = r20
            goto L_0x00ca
        L_0x00c8:
            r9 = r23
        L_0x00ca:
            boolean r25 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r25 == 0) goto L_0x00d3
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x00d3:
            r14.endReplaceableGroup()
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            java.lang.Object r25 = r16.getTargetState()
            androidx.compose.ui.state.ToggleableState r25 = (androidx.compose.p002ui.state.ToggleableState) r25
            r14.startReplaceableGroup(r7)
            boolean r26 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r26 == 0) goto L_0x00ef
            r13 = 0
            r15 = -1
            androidx.compose.runtime.ComposerKt.traceEventStart(r7, r13, r15, r8)
            goto L_0x00f0
        L_0x00ef:
            r15 = -1
        L_0x00f0:
            int r7 = r25.ordinal()
            r7 = r21[r7]
            if (r7 == r11) goto L_0x0108
            r13 = 2
            if (r7 == r13) goto L_0x0105
            r8 = 3
            if (r7 != r8) goto L_0x00ff
            goto L_0x0109
        L_0x00ff:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0105:
            r7 = r20
            goto L_0x010b
        L_0x0108:
            r13 = 2
        L_0x0109:
            r7 = r23
        L_0x010b:
            boolean r8 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r8 == 0) goto L_0x0114
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0114:
            r14.endReplaceableGroup()
            java.lang.Float r8 = java.lang.Float.valueOf(r7)
            androidx.compose.animation.core.Transition$Segment r7 = r16.getSegment()
            r24 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r24)
            java.lang.Object r6 = r6.invoke(r7, r14, r11)
            r11 = r6
            androidx.compose.animation.core.FiniteAnimationSpec r11 = (androidx.compose.animation.core.FiniteAnimationSpec) r11
            r24 = 0
            r6 = r16
            r15 = 1847725064(0x6e220c08, float:1.2537779E28)
            r7 = r9
            r9 = 1399891485(0x5370a61d, float:1.03357907E12)
            r15 = r9
            r9 = r11
            r22 = r10
            r10 = r19
            r11 = r17
            r17 = r12
            r12 = r14
            r13 = r24
            androidx.compose.runtime.State r31 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(r6, r7, r8, r9, r10, r11, r12, r13)
            r14.endReplaceableGroup()
            r14.endReplaceableGroup()
            androidx.compose.material3.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1 r6 = androidx.compose.material3.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1.INSTANCE
            r14.startReplaceableGroup(r15)
            java.lang.String r11 = "FloatAnimation"
            androidx.compose.animation.core.TwoWayConverter r10 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter((kotlin.jvm.internal.C12763h) r18)
            r7 = 1847725064(0x6e220c08, float:1.2537779E28)
            r14.startReplaceableGroup(r7)
            java.lang.Object r7 = r16.getCurrentState()
            androidx.compose.ui.state.ToggleableState r7 = (androidx.compose.p002ui.state.ToggleableState) r7
            r8 = -1426969489(0xffffffffaaf22c6f, float:-4.3018668E-13)
            r14.startReplaceableGroup(r8)
            boolean r9 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            java.lang.String r12 = "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:258)"
            if (r9 == 0) goto L_0x0179
            r9 = -1
            r13 = 0
            androidx.compose.runtime.ComposerKt.traceEventStart(r8, r13, r9, r12)
            goto L_0x017a
        L_0x0179:
            r9 = -1
        L_0x017a:
            int r7 = r7.ordinal()
            r7 = r21[r7]
            r15 = 1
            if (r7 == r15) goto L_0x0192
            r13 = 2
            if (r7 == r13) goto L_0x0192
            r13 = 3
            if (r7 != r13) goto L_0x018c
            r7 = r23
            goto L_0x0194
        L_0x018c:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0192:
            r7 = r20
        L_0x0194:
            boolean r13 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r13 == 0) goto L_0x019d
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x019d:
            r14.endReplaceableGroup()
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Object r13 = r16.getTargetState()
            androidx.compose.ui.state.ToggleableState r13 = (androidx.compose.p002ui.state.ToggleableState) r13
            r14.startReplaceableGroup(r8)
            boolean r18 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r18 == 0) goto L_0x01b7
            r15 = 0
            androidx.compose.runtime.ComposerKt.traceEventStart(r8, r15, r9, r12)
        L_0x01b7:
            int r8 = r13.ordinal()
            r8 = r21[r8]
            r9 = 1
            if (r8 == r9) goto L_0x01cf
            r13 = 2
            if (r8 == r13) goto L_0x01d0
            r9 = 3
            if (r8 != r9) goto L_0x01c9
            r20 = r23
            goto L_0x01d0
        L_0x01c9:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01cf:
            r13 = 2
        L_0x01d0:
            boolean r8 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r8 == 0) goto L_0x01d9
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01d9:
            r14.endReplaceableGroup()
            java.lang.Float r8 = java.lang.Float.valueOf(r20)
            androidx.compose.animation.core.Transition$Segment r9 = r16.getSegment()
            r12 = 0
            java.lang.Integer r15 = java.lang.Integer.valueOf(r12)
            java.lang.Object r6 = r6.invoke(r9, r14, r15)
            r9 = r6
            androidx.compose.animation.core.FiniteAnimationSpec r9 = (androidx.compose.animation.core.FiniteAnimationSpec) r9
            r6 = r16
            r12 = r14
            r15 = r13
            r13 = r24
            androidx.compose.runtime.State r32 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(r6, r7, r8, r9, r10, r11, r12, r13)
            r14.endReplaceableGroup()
            r14.endReplaceableGroup()
            r6 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r14.startReplaceableGroup(r6)
            java.lang.Object r6 = r14.rememberedValue()
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r7 = r7.getEmpty()
            if (r6 != r7) goto L_0x0220
            androidx.compose.material3.CheckDrawingCache r6 = new androidx.compose.material3.CheckDrawingCache
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 7
            r13 = 0
            r8 = r6
            r8.<init>(r9, r10, r11, r12, r13)
            r14.updateRememberedValue(r6)
        L_0x0220:
            r14.endReplaceableGroup()
            r33 = r6
            androidx.compose.material3.CheckDrawingCache r33 = (androidx.compose.material3.CheckDrawingCache) r33
            int r6 = r17 >> 6
            r6 = r6 & 112(0x70, float:1.57E-43)
            r6 = r22 | r6
            androidx.compose.runtime.State r30 = r4.checkmarkColor$material3_release(r2, r14, r6)
            r6 = r17 & 14
            r7 = r17 & 112(0x70, float:1.57E-43)
            r6 = r6 | r7
            r0 = r0 & 896(0x380, float:1.256E-42)
            r0 = r0 | r6
            androidx.compose.runtime.State r28 = r4.boxColor$material3_release(r1, r2, r14, r0)
            androidx.compose.runtime.State r29 = r4.borderColor$material3_release(r1, r2, r14, r0)
            androidx.compose.ui.Alignment$Companion r0 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment r0 = r0.getCenter()
            r6 = 0
            r7 = 0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(r3, r0, r7, r15, r6)
            float r6 = CheckboxSize
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.m33330requiredSize3ABfNKs(r0, r6)
            r6 = 6
            java.lang.Object[] r8 = new java.lang.Object[r6]
            r8[r7] = r28
            r7 = 1
            r8[r7] = r29
            r8[r15] = r30
            r7 = 3
            r8[r7] = r31
            r7 = 4
            r8[r7] = r32
            r7 = 5
            r8[r7] = r33
            r7 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r14.startReplaceableGroup(r7)
            r7 = 0
            r13 = 0
        L_0x026e:
            if (r13 >= r6) goto L_0x027a
            r9 = r8[r13]
            boolean r9 = r14.changed((java.lang.Object) r9)
            r7 = r7 | r9
            int r13 = r13 + 1
            goto L_0x026e
        L_0x027a:
            java.lang.Object r6 = r14.rememberedValue()
            if (r7 != 0) goto L_0x0288
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r7 = r7.getEmpty()
            if (r6 != r7) goto L_0x0292
        L_0x0288:
            androidx.compose.material3.CheckboxKt$CheckboxImpl$1$1 r6 = new androidx.compose.material3.CheckboxKt$CheckboxImpl$1$1
            r27 = r6
            r27.<init>(r28, r29, r30, r31, r32, r33)
            r14.updateRememberedValue(r6)
        L_0x0292:
            r14.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            r7 = 0
            androidx.compose.foundation.CanvasKt.Canvas(r0, r6, r14, r7)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x02a4
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x02a4:
            androidx.compose.runtime.ScopeUpdateScope r6 = r14.endRestartGroup()
            if (r6 != 0) goto L_0x02ab
            goto L_0x02be
        L_0x02ab:
            androidx.compose.material3.CheckboxKt$CheckboxImpl$2 r7 = new androidx.compose.material3.CheckboxKt$CheckboxImpl$2
            r0 = r7
            r1 = r34
            r2 = r35
            r3 = r36
            r4 = r37
            r5 = r39
            r0.<init>(r1, r2, r3, r4, r5)
            r6.updateScope(r7)
        L_0x02be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CheckboxKt.CheckboxImpl(boolean, androidx.compose.ui.state.ToggleableState, androidx.compose.ui.Modifier, androidx.compose.material3.CheckboxColors, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01a2  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void TriStateCheckbox(androidx.compose.p002ui.state.ToggleableState r28, p404of.C13074a<p336ef.C11921v> r29, androidx.compose.p002ui.Modifier r30, boolean r31, androidx.compose.material3.CheckboxColors r32, androidx.compose.foundation.interaction.MutableInteractionSource r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            r7 = r28
            r8 = r29
            r9 = r35
            java.lang.String r0 = "state"
            kotlin.jvm.internal.C12775o.m28639i(r7, r0)
            r0 = -1608358065(0xffffffffa022674f, float:-1.3756116E-19)
            r1 = r34
            androidx.compose.runtime.Composer r6 = r1.startRestartGroup(r0)
            r1 = r36 & 1
            r2 = 2
            if (r1 == 0) goto L_0x001c
            r1 = r9 | 6
            goto L_0x002c
        L_0x001c:
            r1 = r9 & 14
            if (r1 != 0) goto L_0x002b
            boolean r1 = r6.changed((java.lang.Object) r7)
            if (r1 == 0) goto L_0x0028
            r1 = 4
            goto L_0x0029
        L_0x0028:
            r1 = r2
        L_0x0029:
            r1 = r1 | r9
            goto L_0x002c
        L_0x002b:
            r1 = r9
        L_0x002c:
            r3 = r36 & 2
            if (r3 == 0) goto L_0x0033
            r1 = r1 | 48
            goto L_0x0043
        L_0x0033:
            r3 = r9 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0043
            boolean r3 = r6.changed((java.lang.Object) r8)
            if (r3 == 0) goto L_0x0040
            r3 = 32
            goto L_0x0042
        L_0x0040:
            r3 = 16
        L_0x0042:
            r1 = r1 | r3
        L_0x0043:
            r3 = r36 & 4
            if (r3 == 0) goto L_0x004a
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x005d
        L_0x004a:
            r4 = r9 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x005d
            r4 = r30
            boolean r5 = r6.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x0059
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0059:
            r5 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r1 = r1 | r5
            goto L_0x005f
        L_0x005d:
            r4 = r30
        L_0x005f:
            r5 = r36 & 8
            if (r5 == 0) goto L_0x0066
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0079
        L_0x0066:
            r10 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x0079
            r10 = r31
            boolean r11 = r6.changed((boolean) r10)
            if (r11 == 0) goto L_0x0075
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0077
        L_0x0075:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0077:
            r1 = r1 | r11
            goto L_0x007b
        L_0x0079:
            r10 = r31
        L_0x007b:
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r9
            if (r11 != 0) goto L_0x0096
            r11 = r36 & 16
            if (r11 != 0) goto L_0x0090
            r11 = r32
            boolean r12 = r6.changed((java.lang.Object) r11)
            if (r12 == 0) goto L_0x0092
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0090:
            r11 = r32
        L_0x0092:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r1 = r1 | r12
            goto L_0x0098
        L_0x0096:
            r11 = r32
        L_0x0098:
            r26 = r36 & 32
            if (r26 == 0) goto L_0x00a2
            r12 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r12
            r15 = r33
            goto L_0x00b5
        L_0x00a2:
            r12 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r9
            r15 = r33
            if (r12 != 0) goto L_0x00b5
            boolean r12 = r6.changed((java.lang.Object) r15)
            if (r12 == 0) goto L_0x00b2
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b4
        L_0x00b2:
            r12 = 65536(0x10000, float:9.18355E-41)
        L_0x00b4:
            r1 = r1 | r12
        L_0x00b5:
            r12 = 374491(0x5b6db, float:5.24774E-40)
            r12 = r12 & r1
            r13 = 74898(0x12492, float:1.04954E-40)
            if (r12 != r13) goto L_0x00cf
            boolean r12 = r6.getSkipping()
            if (r12 != 0) goto L_0x00c5
            goto L_0x00cf
        L_0x00c5:
            r6.skipToGroupEnd()
            r3 = r4
            r4 = r10
            r5 = r11
            r10 = r6
            r6 = r15
            goto L_0x01ec
        L_0x00cf:
            r6.startDefaults()
            r12 = r9 & 1
            r27 = -57345(0xffffffffffff1fff, float:NaN)
            if (r12 == 0) goto L_0x00f3
            boolean r12 = r6.getDefaultsInvalid()
            if (r12 == 0) goto L_0x00e0
            goto L_0x00f3
        L_0x00e0:
            r6.skipToGroupEnd()
            r3 = r36 & 16
            if (r3 == 0) goto L_0x00e9
            r1 = r1 & r27
        L_0x00e9:
            r5 = r4
            r17 = r10
            r18 = r11
            r19 = r15
        L_0x00f0:
            r4 = r1
            goto L_0x0156
        L_0x00f3:
            if (r3 == 0) goto L_0x00f8
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x00f9
        L_0x00f8:
            r3 = r4
        L_0x00f9:
            if (r5 == 0) goto L_0x00fd
            r4 = 1
            goto L_0x00fe
        L_0x00fd:
            r4 = r10
        L_0x00fe:
            r5 = r36 & 16
            if (r5 == 0) goto L_0x0125
            androidx.compose.material3.CheckboxDefaults r10 = androidx.compose.material3.CheckboxDefaults.INSTANCE
            r11 = 0
            r13 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 1572864(0x180000, float:2.204052E-39)
            r25 = 63
            r15 = r16
            r17 = r18
            r19 = r20
            r21 = r22
            r23 = r6
            androidx.compose.material3.CheckboxColors r5 = r10.m34285colors5tl4gsc(r11, r13, r15, r17, r19, r21, r23, r24, r25)
            r1 = r1 & r27
            r11 = r5
        L_0x0125:
            if (r26 == 0) goto L_0x014e
            r5 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r6.startReplaceableGroup(r5)
            java.lang.Object r5 = r6.rememberedValue()
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r10 = r10.getEmpty()
            if (r5 != r10) goto L_0x0140
            androidx.compose.foundation.interaction.MutableInteractionSource r5 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r6.updateRememberedValue(r5)
        L_0x0140:
            r6.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r5 = (androidx.compose.foundation.interaction.MutableInteractionSource) r5
            r17 = r4
            r19 = r5
            r18 = r11
            r4 = r1
            r5 = r3
            goto L_0x0156
        L_0x014e:
            r19 = r33
            r5 = r3
            r17 = r4
            r18 = r11
            goto L_0x00f0
        L_0x0156:
            r6.endDefaults()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x0165
            r1 = -1
            java.lang.String r3 = "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:135)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r4, r1, r3)
        L_0x0165:
            r0 = 1797978036(0x6b2af7b4, float:2.0668713E26)
            r6.startReplaceableGroup(r0)
            if (r8 == 0) goto L_0x01a2
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            androidx.compose.ui.semantics.Role$Companion r1 = androidx.compose.p002ui.semantics.Role.Companion
            int r1 = r1.m37815getCheckboxo7Vup1c()
            r10 = 0
            androidx.compose.material3.tokens.CheckboxTokens r3 = androidx.compose.material3.tokens.CheckboxTokens.INSTANCE
            float r3 = r3.m34791getStateLayerSizeD9Ej5fM()
            float r2 = (float) r2
            float r3 = r3 / r2
            float r11 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r3)
            r12 = 0
            r15 = 54
            r16 = 4
            r14 = r6
            androidx.compose.foundation.Indication r3 = androidx.compose.material.ripple.RippleKt.m34235rememberRipple9IZ8Weo(r10, r11, r12, r14, r15, r16)
            androidx.compose.ui.semantics.Role r10 = androidx.compose.p002ui.semantics.Role.m37807boximpl(r1)
            r1 = r28
            r2 = r19
            r11 = r4
            r4 = r17
            r12 = r5
            r5 = r10
            r10 = r6
            r6 = r29
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.selection.ToggleableKt.m33595triStateToggleableO2vRcR0(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01a7
        L_0x01a2:
            r11 = r4
            r12 = r5
            r10 = r6
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
        L_0x01a7:
            r10.endReplaceableGroup()
            if (r8 == 0) goto L_0x01b3
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.p002ui.Modifier.Companion
            androidx.compose.ui.Modifier r1 = androidx.compose.material3.TouchTargetKt.minimumTouchTargetSize(r1)
            goto L_0x01b5
        L_0x01b3:
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.p002ui.Modifier.Companion
        L_0x01b5:
            androidx.compose.ui.Modifier r1 = r12.then(r1)
            androidx.compose.ui.Modifier r0 = r1.then(r0)
            float r1 = CheckboxDefaultPadding
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.PaddingKt.m33268padding3ABfNKs(r0, r1)
            int r0 = r11 >> 9
            r0 = r0 & 14
            int r1 = r11 << 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            int r1 = r11 >> 3
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r5 = r0 | r1
            r0 = r17
            r1 = r28
            r3 = r18
            r4 = r10
            CheckboxImpl(r0, r1, r2, r3, r4, r5)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01e5
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01e5:
            r3 = r12
            r4 = r17
            r5 = r18
            r6 = r19
        L_0x01ec:
            androidx.compose.runtime.ScopeUpdateScope r10 = r10.endRestartGroup()
            if (r10 != 0) goto L_0x01f3
            goto L_0x0204
        L_0x01f3:
            androidx.compose.material3.CheckboxKt$TriStateCheckbox$2 r11 = new androidx.compose.material3.CheckboxKt$TriStateCheckbox$2
            r0 = r11
            r1 = r28
            r2 = r29
            r7 = r35
            r8 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.updateScope(r11)
        L_0x0204:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CheckboxKt.TriStateCheckbox(androidx.compose.ui.state.ToggleableState, of.a, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.CheckboxColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: drawBox-1wkBAMs  reason: not valid java name */
    public static final void m34288drawBox1wkBAMs(DrawScope drawScope, long j, long j2, float f, float f2) {
        float f3 = f;
        float f4 = f2;
        float f5 = f4 / 2.0f;
        Stroke stroke = new Stroke(f2, 0.0f, 0, 0, (PathEffect) null, 30, (DefaultConstructorMarker) null);
        float r1 = Size.m35491getWidthimpl(drawScope.m36274getSizeNHjbRc());
        if (Color.m35672equalsimpl0(j, j2)) {
            DrawScope.m36252drawRoundRectuAw5IA$default(drawScope, j, 0, SizeKt.Size(r1, r1), CornerRadiusKt.CornerRadius$default(f3, 0.0f, 2, (Object) null), Fill.INSTANCE, 0.0f, (ColorFilter) null, 0, OAuthErrorCodes.ERR_OAUTH_MISSING_TIMESTAMP, (Object) null);
            return;
        }
        float f6 = r1 - (((float) 2) * f4);
        DrawScope.m36252drawRoundRectuAw5IA$default(drawScope, j, OffsetKt.Offset(f4, f4), SizeKt.Size(f6, f6), CornerRadiusKt.CornerRadius$default(Math.max(0.0f, f3 - f4), 0.0f, 2, (Object) null), Fill.INSTANCE, 0.0f, (ColorFilter) null, 0, OAuthErrorCodes.ERR_OAUTH_INVALID_CONSUMER, (Object) null);
        float f7 = r1 - f4;
        DrawScope.m36252drawRoundRectuAw5IA$default(drawScope, j2, OffsetKt.Offset(f5, f5), SizeKt.Size(f7, f7), CornerRadiusKt.CornerRadius$default(f3 - f5, 0.0f, 2, (Object) null), stroke, 0.0f, (ColorFilter) null, 0, OAuthErrorCodes.ERR_OAUTH_INVALID_CONSUMER, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: drawCheck-3IgeMak  reason: not valid java name */
    public static final void m34289drawCheck3IgeMak(DrawScope drawScope, long j, float f, float f2, float f3, CheckDrawingCache checkDrawingCache) {
        float f4 = f2;
        Stroke stroke = new Stroke(f3, 0.0f, StrokeCap.Companion.m36056getSquareKaPHkGw(), 0, (PathEffect) null, 26, (DefaultConstructorMarker) null);
        float r1 = Size.m35491getWidthimpl(drawScope.m36274getSizeNHjbRc());
        float lerp = MathHelpersKt.lerp(0.4f, 0.5f, f2);
        float lerp2 = MathHelpersKt.lerp(0.7f, 0.5f, f2);
        float lerp3 = MathHelpersKt.lerp(0.5f, 0.5f, f2);
        float lerp4 = MathHelpersKt.lerp(0.3f, 0.5f, f2);
        checkDrawingCache.getCheckPath().reset();
        checkDrawingCache.getCheckPath().moveTo(0.2f * r1, lerp3 * r1);
        checkDrawingCache.getCheckPath().lineTo(lerp * r1, lerp2 * r1);
        checkDrawingCache.getCheckPath().lineTo(0.8f * r1, r1 * lerp4);
        checkDrawingCache.getPathMeasure().setPath(checkDrawingCache.getCheckPath(), false);
        checkDrawingCache.getPathToDraw().reset();
        checkDrawingCache.getPathMeasure().getSegment(0.0f, checkDrawingCache.getPathMeasure().getLength() * f, checkDrawingCache.getPathToDraw(), true);
        DrawScope.m36246drawPathLG529CI$default(drawScope, checkDrawingCache.getPathToDraw(), j, 0.0f, stroke, (ColorFilter) null, 0, 52, (Object) null);
    }
}
