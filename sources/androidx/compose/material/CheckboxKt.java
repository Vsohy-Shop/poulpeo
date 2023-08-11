package androidx.compose.material;

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
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.util.MathHelpersKt;
import androidx.compose.runtime.State;
import com.rmn.api.p322v2.main.oauth.OAuthErrorCodes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nCheckbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material/CheckboxKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,485:1\n25#2:486\n50#2:493\n49#2:494\n25#2:501\n25#2:526\n83#2,3:533\n1114#3,6:487\n1114#3,6:495\n1114#3,6:502\n1114#3,6:527\n1114#3,6:536\n931#4,4:508\n852#4,5:512\n931#4,4:517\n852#4,5:521\n76#5:542\n76#5:543\n76#5:544\n76#5:545\n76#5:546\n154#6:547\n154#6:548\n154#6:549\n154#6:550\n154#6:551\n*S KotlinDebug\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material/CheckboxKt\n*L\n91#1:486\n96#1:493\n96#1:494\n137#1:501\n297#1:526\n301#1:533,3\n91#1:487,6\n96#1:495,6\n137#1:502,6\n297#1:527,6\n301#1:536,6\n266#1:508,4\n266#1:512,5\n282#1:517,4\n282#1:521,5\n266#1:542\n282#1:543\n298#1:544\n299#1:545\n300#1:546\n480#1:547\n481#1:548\n482#1:549\n483#1:550\n484#1:551\n*E\n"})
/* compiled from: Checkbox.kt */
public final class CheckboxKt {
    private static final int BoxInDuration = 50;
    private static final int BoxOutDuration = 100;
    private static final int CheckAnimationDuration = 100;
    private static final float CheckboxDefaultPadding;
    private static final float CheckboxRippleRadius = C1232Dp.m38468constructorimpl((float) 24);
    private static final float CheckboxSize = C1232Dp.m38468constructorimpl((float) 20);
    /* access modifiers changed from: private */
    public static final float RadiusSize;
    /* access modifiers changed from: private */
    public static final float StrokeWidth;

    /* compiled from: Checkbox.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.ui.state.ToggleableState[] r0 = androidx.compose.p002ui.state.ToggleableState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.state.ToggleableState r1 = androidx.compose.p002ui.state.ToggleableState.On     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.state.ToggleableState r1 = androidx.compose.p002ui.state.ToggleableState.Off     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.state.ToggleableState r1 = androidx.compose.p002ui.state.ToggleableState.Indeterminate     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.CheckboxKt.WhenMappings.<clinit>():void");
        }
    }

    static {
        float f = (float) 2;
        CheckboxDefaultPadding = C1232Dp.m38468constructorimpl(f);
        StrokeWidth = C1232Dp.m38468constructorimpl(f);
        RadiusSize = C1232Dp.m38468constructorimpl(f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0149  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void Checkbox(boolean r27, kotlin.jvm.functions.Function1<? super java.lang.Boolean, p336ef.C11921v> r28, androidx.compose.p002ui.Modifier r29, boolean r30, androidx.compose.foundation.interaction.MutableInteractionSource r31, androidx.compose.material.CheckboxColors r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            r1 = r27
            r2 = r28
            r7 = r34
            r0 = -2118660998(0xffffffff81b7cc7a, float:-6.751699E-38)
            r3 = r33
            androidx.compose.runtime.Composer r3 = r3.startRestartGroup(r0)
            r4 = r35 & 1
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
            r5 = r35 & 2
            if (r5 == 0) goto L_0x002d
            r4 = r4 | 48
            goto L_0x003d
        L_0x002d:
            r5 = r7 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x003d
            boolean r5 = r3.changedInstance(r2)
            if (r5 == 0) goto L_0x003a
            r5 = 32
            goto L_0x003c
        L_0x003a:
            r5 = 16
        L_0x003c:
            r4 = r4 | r5
        L_0x003d:
            r5 = r35 & 4
            if (r5 == 0) goto L_0x0044
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x0057
        L_0x0044:
            r6 = r7 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0057
            r6 = r29
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
            r6 = r29
        L_0x0059:
            r8 = r35 & 8
            if (r8 == 0) goto L_0x0060
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0073
        L_0x0060:
            r9 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0073
            r9 = r30
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
            r9 = r30
        L_0x0075:
            r10 = r35 & 16
            r22 = 57344(0xe000, float:8.0356E-41)
            if (r10 == 0) goto L_0x007f
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0092
        L_0x007f:
            r11 = r7 & r22
            if (r11 != 0) goto L_0x0092
            r11 = r31
            boolean r12 = r3.changed((java.lang.Object) r11)
            if (r12 == 0) goto L_0x008e
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0090
        L_0x008e:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x0090:
            r4 = r4 | r12
            goto L_0x0094
        L_0x0092:
            r11 = r31
        L_0x0094:
            r23 = 458752(0x70000, float:6.42848E-40)
            r12 = r7 & r23
            if (r12 != 0) goto L_0x00af
            r12 = r35 & 32
            if (r12 != 0) goto L_0x00a9
            r12 = r32
            boolean r13 = r3.changed((java.lang.Object) r12)
            if (r13 == 0) goto L_0x00ab
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ad
        L_0x00a9:
            r12 = r32
        L_0x00ab:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x00ad:
            r4 = r4 | r13
            goto L_0x00b1
        L_0x00af:
            r12 = r32
        L_0x00b1:
            r13 = 374491(0x5b6db, float:5.24774E-40)
            r13 = r13 & r4
            r14 = 74898(0x12492, float:1.04954E-40)
            if (r13 != r14) goto L_0x00cb
            boolean r13 = r3.getSkipping()
            if (r13 != 0) goto L_0x00c1
            goto L_0x00cb
        L_0x00c1:
            r3.skipToGroupEnd()
            r5 = r6
            r4 = r9
            r25 = r11
            r6 = r12
            goto L_0x01b5
        L_0x00cb:
            r3.startDefaults()
            r13 = r7 & 1
            r24 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r13 == 0) goto L_0x00ec
            boolean r13 = r3.getDefaultsInvalid()
            if (r13 == 0) goto L_0x00dc
            goto L_0x00ec
        L_0x00dc:
            r3.skipToGroupEnd()
            r5 = r35 & 32
            if (r5 == 0) goto L_0x00e5
            r4 = r4 & r24
        L_0x00e5:
            r8 = r4
            r5 = r6
            r6 = r9
            r25 = r11
        L_0x00ea:
            r4 = r12
            goto L_0x0140
        L_0x00ec:
            if (r5 == 0) goto L_0x00f1
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x00f2
        L_0x00f1:
            r5 = r6
        L_0x00f2:
            if (r8 == 0) goto L_0x00f6
            r6 = 1
            goto L_0x00f7
        L_0x00f6:
            r6 = r9
        L_0x00f7:
            if (r10 == 0) goto L_0x011a
            r8 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r3.startReplaceableGroup(r8)
            java.lang.Object r8 = r3.rememberedValue()
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r9 = r9.getEmpty()
            if (r8 != r9) goto L_0x0112
            androidx.compose.foundation.interaction.MutableInteractionSource r8 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r3.updateRememberedValue(r8)
        L_0x0112:
            r3.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r8 = (androidx.compose.foundation.interaction.MutableInteractionSource) r8
            r25 = r8
            goto L_0x011c
        L_0x011a:
            r25 = r11
        L_0x011c:
            r8 = r35 & 32
            if (r8 == 0) goto L_0x013e
            androidx.compose.material.CheckboxDefaults r8 = androidx.compose.material.CheckboxDefaults.INSTANCE
            r9 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r17 = 0
            r20 = 196608(0x30000, float:2.75506E-40)
            r21 = 31
            r19 = r3
            androidx.compose.material.CheckboxColors r8 = r8.m33930colorszjMxDiM(r9, r11, r13, r15, r17, r19, r20, r21)
            r4 = r4 & r24
            r26 = r8
            r8 = r4
            r4 = r26
            goto L_0x0140
        L_0x013e:
            r8 = r4
            goto L_0x00ea
        L_0x0140:
            r3.endDefaults()
            boolean r9 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r9 == 0) goto L_0x014f
            r9 = -1
            java.lang.String r10 = "androidx.compose.material.Checkbox (Checkbox.kt:85)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r8, r9, r10)
        L_0x014f:
            androidx.compose.ui.state.ToggleableState r0 = androidx.compose.p002ui.state.ToggleableStateKt.ToggleableState(r27)
            r9 = 1433125990(0x556bc466, float:1.62017973E13)
            r3.startReplaceableGroup(r9)
            if (r2 == 0) goto L_0x018b
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r27)
            r10 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r3.startReplaceableGroup(r10)
            boolean r10 = r3.changed((java.lang.Object) r2)
            boolean r9 = r3.changed((java.lang.Object) r9)
            r9 = r9 | r10
            java.lang.Object r10 = r3.rememberedValue()
            if (r9 != 0) goto L_0x017c
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r9 = r9.getEmpty()
            if (r10 != r9) goto L_0x0184
        L_0x017c:
            androidx.compose.material.CheckboxKt$Checkbox$2$1 r10 = new androidx.compose.material.CheckboxKt$Checkbox$2$1
            r10.<init>(r2, r1)
            r3.updateRememberedValue(r10)
        L_0x0184:
            r3.endReplaceableGroup()
            of.a r10 = (p404of.C13074a) r10
            r9 = r10
            goto L_0x018c
        L_0x018b:
            r9 = 0
        L_0x018c:
            r3.endReplaceableGroup()
            r10 = r8 & 896(0x380, float:1.256E-42)
            r11 = r8 & 7168(0x1c00, float:1.0045E-41)
            r10 = r10 | r11
            r11 = r8 & r22
            r10 = r10 | r11
            r8 = r8 & r23
            r15 = r10 | r8
            r16 = 0
            r8 = r0
            r10 = r5
            r11 = r6
            r12 = r25
            r13 = r4
            r14 = r3
            TriStateCheckbox(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01b0
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01b0:
            r26 = r6
            r6 = r4
            r4 = r26
        L_0x01b5:
            androidx.compose.runtime.ScopeUpdateScope r9 = r3.endRestartGroup()
            if (r9 != 0) goto L_0x01bc
            goto L_0x01d0
        L_0x01bc:
            androidx.compose.material.CheckboxKt$Checkbox$3 r10 = new androidx.compose.material.CheckboxKt$Checkbox$3
            r0 = r10
            r1 = r27
            r2 = r28
            r3 = r5
            r5 = r25
            r7 = r34
            r8 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.updateScope(r10)
        L_0x01d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.CheckboxKt.Checkbox(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.CheckboxColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v42, resolved type: androidx.compose.material.CheckDrawingCache} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v43, resolved type: androidx.compose.material.CheckboxKt$CheckboxImpl$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v1, resolved type: androidx.compose.material.CheckboxKt$CheckboxImpl$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: androidx.compose.material.CheckDrawingCache} */
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
    public static final void CheckboxImpl(boolean r34, androidx.compose.p002ui.state.ToggleableState r35, androidx.compose.p002ui.Modifier r36, androidx.compose.material.CheckboxColors r37, androidx.compose.runtime.Composer r38, int r39) {
        /*
            r1 = r34
            r2 = r35
            r3 = r36
            r4 = r37
            r5 = r39
            r0 = -2118895727(0xffffffff81b43791, float:-6.620129E-38)
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
            java.lang.String r6 = "androidx.compose.material.CheckboxImpl (Checkbox.kt:258)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r12, r11, r6)
        L_0x0073:
            int r0 = r12 >> 3
            r10 = r0 & 14
            r9 = 0
            androidx.compose.animation.core.Transition r16 = androidx.compose.animation.core.TransitionKt.updateTransition(r2, (java.lang.String) r9, (androidx.compose.runtime.Composer) r14, (int) r10, (int) r13)
            androidx.compose.material.CheckboxKt$CheckboxImpl$checkDrawFraction$2 r6 = androidx.compose.material.CheckboxKt$CheckboxImpl$checkDrawFraction$2.INSTANCE
            r8 = -1338768149(0xffffffffb03404eb, float:-6.549061E-10)
            r14.startReplaceableGroup(r8)
            java.lang.String r17 = "FloatAnimation"
            kotlin.jvm.internal.h r18 = kotlin.jvm.internal.C12763h.f20419a
            androidx.compose.animation.core.TwoWayConverter r19 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter((kotlin.jvm.internal.C12763h) r18)
            r7 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r14.startReplaceableGroup(r7)
            java.lang.Object r20 = r16.getCurrentState()
            androidx.compose.ui.state.ToggleableState r20 = (androidx.compose.p002ui.state.ToggleableState) r20
            r7 = -1798345588(0xffffffff94cf6c8c, float:-2.0944473E-26)
            r14.startReplaceableGroup(r7)
            boolean r21 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            java.lang.String r8 = "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:273)"
            r15 = 0
            if (r21 == 0) goto L_0x00aa
            androidx.compose.runtime.ComposerKt.traceEventStart(r7, r15, r11, r8)
        L_0x00aa:
            int[] r21 = androidx.compose.material.CheckboxKt.WhenMappings.$EnumSwitchMapping$0
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
            r15 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r7 = r9
            r9 = -1338768149(0xffffffffb03404eb, float:-6.549061E-10)
            r15 = r9
            r9 = r11
            r22 = r10
            r10 = r19
            r11 = r17
            r17 = r12
            r12 = r14
            r13 = r24
            androidx.compose.runtime.State r32 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(r6, r7, r8, r9, r10, r11, r12, r13)
            r14.endReplaceableGroup()
            r14.endReplaceableGroup()
            androidx.compose.material.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2 r6 = androidx.compose.material.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2.INSTANCE
            r14.startReplaceableGroup(r15)
            java.lang.String r11 = "FloatAnimation"
            androidx.compose.animation.core.TwoWayConverter r10 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter((kotlin.jvm.internal.C12763h) r18)
            r7 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r14.startReplaceableGroup(r7)
            java.lang.Object r7 = r16.getCurrentState()
            androidx.compose.ui.state.ToggleableState r7 = (androidx.compose.p002ui.state.ToggleableState) r7
            r8 = -2098942571(0xffffffff82e4ad95, float:-3.360122E-37)
            r14.startReplaceableGroup(r8)
            boolean r9 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            java.lang.String r12 = "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:289)"
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
            androidx.compose.runtime.State r33 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(r6, r7, r8, r9, r10, r11, r12, r13)
            r14.endReplaceableGroup()
            r14.endReplaceableGroup()
            r6 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r14.startReplaceableGroup(r6)
            java.lang.Object r6 = r14.rememberedValue()
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r7 = r7.getEmpty()
            if (r6 != r7) goto L_0x0220
            androidx.compose.material.CheckDrawingCache r6 = new androidx.compose.material.CheckDrawingCache
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
            r28 = r6
            androidx.compose.material.CheckDrawingCache r28 = (androidx.compose.material.CheckDrawingCache) r28
            int r6 = r17 >> 6
            r6 = r6 & 112(0x70, float:1.57E-43)
            r6 = r22 | r6
            androidx.compose.runtime.State r31 = r4.checkmarkColor(r2, r14, r6)
            r6 = r17 & 14
            r7 = r17 & 112(0x70, float:1.57E-43)
            r6 = r6 | r7
            r0 = r0 & 896(0x380, float:1.256E-42)
            r0 = r0 | r6
            androidx.compose.runtime.State r29 = r4.boxColor(r1, r2, r14, r0)
            androidx.compose.runtime.State r30 = r4.borderColor(r1, r2, r14, r0)
            androidx.compose.ui.Alignment$Companion r0 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment r0 = r0.getCenter()
            r6 = 0
            r7 = 0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(r3, r0, r7, r15, r6)
            float r6 = CheckboxSize
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.m33330requiredSize3ABfNKs(r0, r6)
            r6 = 6
            java.lang.Object[] r8 = new java.lang.Object[r6]
            r8[r7] = r29
            r7 = 1
            r8[r7] = r30
            r8[r15] = r31
            r7 = 3
            r8[r7] = r32
            r7 = 4
            r8[r7] = r33
            r7 = 5
            r8[r7] = r28
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
            androidx.compose.material.CheckboxKt$CheckboxImpl$1$1 r6 = new androidx.compose.material.CheckboxKt$CheckboxImpl$1$1
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
            androidx.compose.material.CheckboxKt$CheckboxImpl$2 r7 = new androidx.compose.material.CheckboxKt$CheckboxImpl$2
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.CheckboxKt.CheckboxImpl(boolean, androidx.compose.ui.state.ToggleableState, androidx.compose.ui.Modifier, androidx.compose.material.CheckboxColors, androidx.compose.runtime.Composer, int):void");
    }

    /* access modifiers changed from: private */
    public static final long CheckboxImpl$lambda$10(State<Color> state) {
        return state.getValue().m35681unboximpl();
    }

    /* access modifiers changed from: private */
    public static final float CheckboxImpl$lambda$4(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* access modifiers changed from: private */
    public static final float CheckboxImpl$lambda$6(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* access modifiers changed from: private */
    public static final long CheckboxImpl$lambda$8(State<Color> state) {
        return state.getValue().m35681unboximpl();
    }

    /* access modifiers changed from: private */
    public static final long CheckboxImpl$lambda$9(State<Color> state) {
        return state.getValue().m35681unboximpl();
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00cd  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void TriStateCheckbox(androidx.compose.p002ui.state.ToggleableState r25, p404of.C13074a<p336ef.C11921v> r26, androidx.compose.p002ui.Modifier r27, boolean r28, androidx.compose.foundation.interaction.MutableInteractionSource r29, androidx.compose.material.CheckboxColors r30, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            r7 = r25
            r8 = r26
            r9 = r32
            java.lang.String r0 = "state"
            kotlin.jvm.internal.C12775o.m28639i(r7, r0)
            r0 = 2031255194(0x79127e9a, float:4.7540195E34)
            r1 = r31
            androidx.compose.runtime.Composer r6 = r1.startRestartGroup(r0)
            r1 = r33 & 1
            if (r1 == 0) goto L_0x001b
            r1 = r9 | 6
            goto L_0x002b
        L_0x001b:
            r1 = r9 & 14
            if (r1 != 0) goto L_0x002a
            boolean r1 = r6.changed((java.lang.Object) r7)
            if (r1 == 0) goto L_0x0027
            r1 = 4
            goto L_0x0028
        L_0x0027:
            r1 = 2
        L_0x0028:
            r1 = r1 | r9
            goto L_0x002b
        L_0x002a:
            r1 = r9
        L_0x002b:
            r2 = r33 & 2
            if (r2 == 0) goto L_0x0032
            r1 = r1 | 48
            goto L_0x0042
        L_0x0032:
            r2 = r9 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0042
            boolean r2 = r6.changedInstance(r8)
            if (r2 == 0) goto L_0x003f
            r2 = 32
            goto L_0x0041
        L_0x003f:
            r2 = 16
        L_0x0041:
            r1 = r1 | r2
        L_0x0042:
            r2 = r33 & 4
            if (r2 == 0) goto L_0x0049
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x005c
        L_0x0049:
            r3 = r9 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x005c
            r3 = r27
            boolean r4 = r6.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0058
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x005a
        L_0x0058:
            r4 = 128(0x80, float:1.794E-43)
        L_0x005a:
            r1 = r1 | r4
            goto L_0x005e
        L_0x005c:
            r3 = r27
        L_0x005e:
            r4 = r33 & 8
            if (r4 == 0) goto L_0x0065
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0078
        L_0x0065:
            r5 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x0078
            r5 = r28
            boolean r10 = r6.changed((boolean) r5)
            if (r10 == 0) goto L_0x0074
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0074:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r1 = r1 | r10
            goto L_0x007a
        L_0x0078:
            r5 = r28
        L_0x007a:
            r10 = r33 & 16
            if (r10 == 0) goto L_0x0081
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0096
        L_0x0081:
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r9
            if (r11 != 0) goto L_0x0096
            r11 = r29
            boolean r12 = r6.changed((java.lang.Object) r11)
            if (r12 == 0) goto L_0x0092
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r1 = r1 | r12
            goto L_0x0098
        L_0x0096:
            r11 = r29
        L_0x0098:
            r12 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r9
            if (r12 != 0) goto L_0x00b2
            r12 = r33 & 32
            if (r12 != 0) goto L_0x00ac
            r12 = r30
            boolean r13 = r6.changed((java.lang.Object) r12)
            if (r13 == 0) goto L_0x00ae
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b0
        L_0x00ac:
            r12 = r30
        L_0x00ae:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x00b0:
            r1 = r1 | r13
            goto L_0x00b4
        L_0x00b2:
            r12 = r30
        L_0x00b4:
            r13 = 374491(0x5b6db, float:5.24774E-40)
            r13 = r13 & r1
            r14 = 74898(0x12492, float:1.04954E-40)
            if (r13 != r14) goto L_0x00cd
            boolean r13 = r6.getSkipping()
            if (r13 != 0) goto L_0x00c4
            goto L_0x00cd
        L_0x00c4:
            r6.skipToGroupEnd()
            r4 = r5
            r10 = r6
            r5 = r11
            r6 = r12
            goto L_0x01d6
        L_0x00cd:
            r6.startDefaults()
            r13 = r9 & 1
            r24 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r13 == 0) goto L_0x00f0
            boolean r13 = r6.getDefaultsInvalid()
            if (r13 == 0) goto L_0x00de
            goto L_0x00f0
        L_0x00de:
            r6.skipToGroupEnd()
            r2 = r33 & 32
            if (r2 == 0) goto L_0x00e7
            r1 = r1 & r24
        L_0x00e7:
            r4 = r1
            r17 = r5
            r18 = r11
            r19 = r12
            r5 = r3
            goto L_0x014a
        L_0x00f0:
            if (r2 == 0) goto L_0x00f5
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x00f6
        L_0x00f5:
            r2 = r3
        L_0x00f6:
            if (r4 == 0) goto L_0x00fa
            r3 = 1
            goto L_0x00fb
        L_0x00fa:
            r3 = r5
        L_0x00fb:
            if (r10 == 0) goto L_0x011c
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r6.startReplaceableGroup(r4)
            java.lang.Object r4 = r6.rememberedValue()
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r5 = r5.getEmpty()
            if (r4 != r5) goto L_0x0116
            androidx.compose.foundation.interaction.MutableInteractionSource r4 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r6.updateRememberedValue(r4)
        L_0x0116:
            r6.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r4 = (androidx.compose.foundation.interaction.MutableInteractionSource) r4
            goto L_0x011d
        L_0x011c:
            r4 = r11
        L_0x011d:
            r5 = r33 & 32
            if (r5 == 0) goto L_0x0142
            androidx.compose.material.CheckboxDefaults r10 = androidx.compose.material.CheckboxDefaults.INSTANCE
            r11 = 0
            r13 = 0
            r15 = 0
            r17 = 0
            r19 = 0
            r22 = 196608(0x30000, float:2.75506E-40)
            r23 = 31
            r21 = r6
            androidx.compose.material.CheckboxColors r5 = r10.m33930colorszjMxDiM(r11, r13, r15, r17, r19, r21, r22, r23)
            r1 = r1 & r24
            r17 = r3
            r18 = r4
            r19 = r5
            r4 = r1
            r5 = r2
            goto L_0x014a
        L_0x0142:
            r5 = r2
            r17 = r3
            r18 = r4
            r19 = r12
            r4 = r1
        L_0x014a:
            r6.endDefaults()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x0159
            r1 = -1
            java.lang.String r2 = "androidx.compose.material.TriStateCheckbox (Checkbox.kt:131)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r4, r1, r2)
        L_0x0159:
            r0 = -1517549514(0xffffffffa58c0836, float:-2.4291693E-16)
            r6.startReplaceableGroup(r0)
            if (r8 == 0) goto L_0x018c
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            androidx.compose.ui.semantics.Role$Companion r1 = androidx.compose.p002ui.semantics.Role.Companion
            int r1 = r1.m37815getCheckboxo7Vup1c()
            r10 = 0
            float r11 = CheckboxRippleRadius
            r12 = 0
            r15 = 54
            r16 = 4
            r14 = r6
            androidx.compose.foundation.Indication r3 = androidx.compose.material.ripple.RippleKt.m34235rememberRipple9IZ8Weo(r10, r11, r12, r14, r15, r16)
            androidx.compose.ui.semantics.Role r10 = androidx.compose.p002ui.semantics.Role.m37807boximpl(r1)
            r1 = r25
            r2 = r18
            r11 = r4
            r4 = r17
            r12 = r5
            r5 = r10
            r10 = r6
            r6 = r26
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.selection.ToggleableKt.m33595triStateToggleableO2vRcR0(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0191
        L_0x018c:
            r11 = r4
            r12 = r5
            r10 = r6
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
        L_0x0191:
            r10.endReplaceableGroup()
            if (r8 == 0) goto L_0x019d
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.p002ui.Modifier.Companion
            androidx.compose.ui.Modifier r1 = androidx.compose.material.InteractiveComponentSizeKt.minimumInteractiveComponentSize(r1)
            goto L_0x019f
        L_0x019d:
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.p002ui.Modifier.Companion
        L_0x019f:
            androidx.compose.ui.Modifier r1 = r12.then(r1)
            androidx.compose.ui.Modifier r0 = r1.then(r0)
            float r1 = CheckboxDefaultPadding
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.PaddingKt.m33268padding3ABfNKs(r0, r1)
            int r0 = r11 >> 9
            r0 = r0 & 14
            int r1 = r11 << 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            int r1 = r11 >> 6
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r5 = r0 | r1
            r0 = r17
            r1 = r25
            r3 = r19
            r4 = r10
            CheckboxImpl(r0, r1, r2, r3, r4, r5)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01cf
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01cf:
            r3 = r12
            r4 = r17
            r5 = r18
            r6 = r19
        L_0x01d6:
            androidx.compose.runtime.ScopeUpdateScope r10 = r10.endRestartGroup()
            if (r10 != 0) goto L_0x01dd
            goto L_0x01ee
        L_0x01dd:
            androidx.compose.material.CheckboxKt$TriStateCheckbox$2 r11 = new androidx.compose.material.CheckboxKt$TriStateCheckbox$2
            r0 = r11
            r1 = r25
            r2 = r26
            r7 = r32
            r8 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.updateScope(r11)
        L_0x01ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.CheckboxKt.TriStateCheckbox(androidx.compose.ui.state.ToggleableState, of.a, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.CheckboxColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: drawBox-1wkBAMs  reason: not valid java name */
    public static final void m33933drawBox1wkBAMs(DrawScope drawScope, long j, long j2, float f, float f2) {
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
    public static final void m33934drawCheck3IgeMak(DrawScope drawScope, long j, float f, float f2, float f3, CheckDrawingCache checkDrawingCache) {
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
