package androidx.compose.material;

import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.Strings;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.draw.ShadowKt;
import androidx.compose.p002ui.input.pointer.PointerInputScope;
import androidx.compose.p002ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p002ui.layout.LayoutKt;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.node.ComposeUiNode;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.compose.p002ui.semantics.SemanticsModifierKt;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.p002ui.util.MathHelpersKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;
import p436tf.C13522b;
import p466yf.C13995l0;

@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 11 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,1189:1\n25#2:1190\n36#2:1198\n25#2:1206\n25#2:1213\n36#2:1220\n460#2,13:1247\n473#2,3:1264\n460#2,13:1288\n36#2:1306\n36#2:1313\n473#2,3:1320\n460#2,13:1344\n25#2:1358\n50#2:1365\n49#2:1366\n473#2,3:1374\n83#2,3:1393\n1114#3,6:1191\n1114#3,6:1199\n1114#3,6:1207\n1114#3,6:1214\n1114#3,6:1221\n1114#3,6:1307\n1114#3,6:1314\n1114#3,6:1359\n1114#3,6:1367\n1114#3,6:1396\n1#4:1197\n92#5:1205\n92#5:1227\n92#5:1262\n88#5:1263\n92#5:1303\n88#5:1304\n88#5:1305\n67#6,6:1228\n73#6:1260\n77#6:1268\n67#6,6:1269\n73#6:1301\n77#6:1324\n67#6,6:1325\n73#6:1357\n77#6:1378\n75#7:1234\n76#7,11:1236\n89#7:1267\n75#7:1275\n76#7,11:1277\n89#7:1323\n75#7:1331\n76#7,11:1333\n89#7:1377\n76#8:1235\n76#8:1261\n76#8:1276\n76#8:1302\n76#8:1332\n154#9:1373\n154#9:1403\n154#9:1404\n154#9:1405\n154#9:1406\n154#9:1407\n154#9:1408\n154#9:1409\n2333#10,14:1379\n135#11:1402\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt\n*L\n154#1:1190\n159#1:1198\n301#1:1206\n302#1:1213\n306#1:1220\n588#1:1247,13\n588#1:1264,3\n632#1:1288,13\n660#1:1306\n671#1:1313\n632#1:1320,3\n692#1:1344,13\n696#1:1358\n697#1:1365\n697#1:1366\n692#1:1374,3\n839#1:1393,3\n154#1:1191,6\n159#1:1199,6\n301#1:1207,6\n302#1:1214,6\n306#1:1221,6\n660#1:1307,6\n671#1:1314,6\n696#1:1359,6\n697#1:1367,6\n839#1:1396,6\n165#1:1205\n313#1:1227\n598#1:1262\n599#1:1263\n642#1:1303\n643#1:1304\n644#1:1305\n588#1:1228,6\n588#1:1260\n588#1:1268\n632#1:1269,6\n632#1:1301\n632#1:1324\n692#1:1325,6\n692#1:1357\n692#1:1378\n588#1:1234\n588#1:1236,11\n588#1:1267\n632#1:1275\n632#1:1277,11\n632#1:1323\n692#1:1331\n692#1:1333,11\n692#1:1377\n588#1:1235\n592#1:1261\n632#1:1276\n636#1:1302\n692#1:1332\n723#1:1373\n1148#1:1403\n1149#1:1404\n1150#1:1405\n1151#1:1406\n1154#1:1407\n1155#1:1408\n1156#1:1409\n797#1:1379,14\n934#1:1402\n*E\n"})
/* compiled from: Slider.kt */
public final class SliderKt {
    private static final Modifier DefaultSliderConstraints;
    private static final float SliderHeight;
    private static final float SliderMinWidth;
    /* access modifiers changed from: private */
    public static final TweenSpec<Float> SliderToTickAnimation = new TweenSpec(100, 0, (Easing) null, 6, (DefaultConstructorMarker) null);
    private static final float ThumbDefaultElevation = C1232Dp.m38468constructorimpl((float) 1);
    private static final float ThumbPressedElevation = C1232Dp.m38468constructorimpl((float) 6);
    private static final float ThumbRadius = C1232Dp.m38468constructorimpl((float) 10);
    private static final float ThumbRippleRadius = C1232Dp.m38468constructorimpl((float) 24);
    private static final float TrackHeight = C1232Dp.m38468constructorimpl((float) 4);

    static {
        float r1 = C1232Dp.m38468constructorimpl((float) 48);
        SliderHeight = r1;
        float r2 = C1232Dp.m38468constructorimpl((float) 144);
        SliderMinWidth = r2;
        DefaultSliderConstraints = SizeKt.m33326heightInVpY3zN4$default(SizeKt.m33345widthInVpY3zN4$default(Modifier.Companion, r2, 0.0f, 2, (Object) null), 0.0f, r1, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bb, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L_0x00bd;
     */
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void CorrectValueSideEffect(kotlin.jvm.functions.Function1<? super java.lang.Float, java.lang.Float> r15, p436tf.C13522b<java.lang.Float> r16, p436tf.C13522b<java.lang.Float> r17, androidx.compose.runtime.MutableState<java.lang.Float> r18, float r19, androidx.compose.runtime.Composer r20, int r21) {
        /*
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r21
            r0 = -743965752(0xffffffffd3a7fbc8, float:-1.44296745E12)
            r1 = r20
            androidx.compose.runtime.Composer r11 = r1.startRestartGroup(r0)
            r1 = r10 & 14
            r2 = 4
            r3 = 2
            if (r1 != 0) goto L_0x0023
            boolean r1 = r11.changedInstance(r15)
            if (r1 == 0) goto L_0x0020
            r1 = r2
            goto L_0x0021
        L_0x0020:
            r1 = r3
        L_0x0021:
            r1 = r1 | r10
            goto L_0x0024
        L_0x0023:
            r1 = r10
        L_0x0024:
            r4 = r10 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0034
            boolean r4 = r11.changed((java.lang.Object) r7)
            if (r4 == 0) goto L_0x0031
            r4 = 32
            goto L_0x0033
        L_0x0031:
            r4 = 16
        L_0x0033:
            r1 = r1 | r4
        L_0x0034:
            r4 = r10 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0044
            boolean r4 = r11.changed((java.lang.Object) r8)
            if (r4 == 0) goto L_0x0041
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0043
        L_0x0041:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0043:
            r1 = r1 | r4
        L_0x0044:
            r4 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x0054
            boolean r4 = r11.changed((java.lang.Object) r9)
            if (r4 == 0) goto L_0x0051
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x0053
        L_0x0051:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x0053:
            r1 = r1 | r4
        L_0x0054:
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r10
            r12 = r19
            if (r4 != 0) goto L_0x0068
            boolean r4 = r11.changed((float) r12)
            if (r4 == 0) goto L_0x0065
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0067
        L_0x0065:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x0067:
            r1 = r1 | r4
        L_0x0068:
            r4 = 46811(0xb6db, float:6.5596E-41)
            r1 = r1 & r4
            r4 = 9362(0x2492, float:1.3119E-41)
            if (r1 != r4) goto L_0x007b
            boolean r1 = r11.getSkipping()
            if (r1 != 0) goto L_0x0077
            goto L_0x007b
        L_0x0077:
            r11.skipToGroupEnd()
            goto L_0x00e0
        L_0x007b:
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x0087
            r1 = -1
            java.lang.String r4 = "androidx.compose.material.CorrectValueSideEffect (Slider.kt:831)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r10, r1, r4)
        L_0x0087:
            r0 = 5
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r13 = 0
            r1[r13] = r7
            r4 = 1
            r1[r4] = r6
            java.lang.Float r4 = java.lang.Float.valueOf(r19)
            r1[r3] = r4
            r3 = 3
            r1[r3] = r9
            r1[r2] = r8
            r2 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r11.startReplaceableGroup(r2)
            r2 = r13
            r3 = r2
        L_0x00a3:
            if (r2 >= r0) goto L_0x00af
            r4 = r1[r2]
            boolean r4 = r11.changed((java.lang.Object) r4)
            r3 = r3 | r4
            int r2 = r2 + 1
            goto L_0x00a3
        L_0x00af:
            java.lang.Object r0 = r11.rememberedValue()
            if (r3 != 0) goto L_0x00bd
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r0 != r1) goto L_0x00cf
        L_0x00bd:
            androidx.compose.material.SliderKt$CorrectValueSideEffect$1$1 r14 = new androidx.compose.material.SliderKt$CorrectValueSideEffect$1$1
            r0 = r14
            r1 = r16
            r2 = r15
            r3 = r19
            r4 = r18
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            r11.updateRememberedValue(r14)
        L_0x00cf:
            r11.endReplaceableGroup()
            of.a r0 = (p404of.C13074a) r0
            androidx.compose.runtime.EffectsKt.SideEffect(r0, r11, r13)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x00e0
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x00e0:
            androidx.compose.runtime.ScopeUpdateScope r11 = r11.endRestartGroup()
            if (r11 != 0) goto L_0x00e7
            goto L_0x00fb
        L_0x00e7:
            androidx.compose.material.SliderKt$CorrectValueSideEffect$2 r13 = new androidx.compose.material.SliderKt$CorrectValueSideEffect$2
            r0 = r13
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.updateScope(r13)
        L_0x00fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.CorrectValueSideEffect(kotlin.jvm.functions.Function1, tf.b, tf.b, androidx.compose.runtime.MutableState, float, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: androidx.compose.ui.Modifier$Companion} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0119  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void RangeSlider(p436tf.C13522b<java.lang.Float> r42, kotlin.jvm.functions.Function1<? super p436tf.C13522b<java.lang.Float>, p336ef.C11921v> r43, androidx.compose.p002ui.Modifier r44, boolean r45, p436tf.C13522b<java.lang.Float> r46, int r47, p404of.C13074a<p336ef.C11921v> r48, androidx.compose.material.SliderColors r49, androidx.compose.runtime.Composer r50, int r51, int r52) {
        /*
            r12 = r42
            r13 = r43
            r14 = r51
            r15 = r52
            java.lang.String r0 = "value"
            kotlin.jvm.internal.C12775o.m28639i(r12, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.C12775o.m28639i(r13, r0)
            r0 = -1556183027(0xffffffffa33e880d, float:-1.03287305E-17)
            r1 = r50
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
            r4 = r15 & 2
            if (r4 == 0) goto L_0x0039
            r1 = r1 | 48
            goto L_0x0049
        L_0x0039:
            r4 = r14 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0049
            boolean r4 = r11.changedInstance(r13)
            if (r4 == 0) goto L_0x0046
            r4 = 32
            goto L_0x0048
        L_0x0046:
            r4 = 16
        L_0x0048:
            r1 = r1 | r4
        L_0x0049:
            r4 = r15 & 4
            if (r4 == 0) goto L_0x0050
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x0050:
            r5 = r14 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0063
            r5 = r44
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
            r5 = r44
        L_0x0065:
            r6 = r15 & 8
            if (r6 == 0) goto L_0x006c
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007f
        L_0x006c:
            r7 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x007f
            r7 = r45
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
            r7 = r45
        L_0x0081:
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r14
            if (r8 != 0) goto L_0x009c
            r8 = r15 & 16
            if (r8 != 0) goto L_0x0096
            r8 = r46
            boolean r9 = r11.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x0098
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009a
        L_0x0096:
            r8 = r46
        L_0x0098:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x009a:
            r1 = r1 | r9
            goto L_0x009e
        L_0x009c:
            r8 = r46
        L_0x009e:
            r9 = r15 & 32
            if (r9 == 0) goto L_0x00a6
            r10 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r10
            goto L_0x00bb
        L_0x00a6:
            r10 = 458752(0x70000, float:6.42848E-40)
            r10 = r10 & r14
            if (r10 != 0) goto L_0x00bb
            r10 = r47
            boolean r16 = r11.changed((int) r10)
            if (r16 == 0) goto L_0x00b6
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b8
        L_0x00b6:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b8:
            r1 = r1 | r16
            goto L_0x00bd
        L_0x00bb:
            r10 = r47
        L_0x00bd:
            r16 = r15 & 64
            if (r16 == 0) goto L_0x00c8
            r17 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r17
            r3 = r48
            goto L_0x00dd
        L_0x00c8:
            r17 = 3670016(0x380000, float:5.142788E-39)
            r17 = r14 & r17
            r3 = r48
            if (r17 != 0) goto L_0x00dd
            boolean r17 = r11.changedInstance(r3)
            if (r17 == 0) goto L_0x00d9
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00db
        L_0x00d9:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00db:
            r1 = r1 | r17
        L_0x00dd:
            r17 = 29360128(0x1c00000, float:7.052966E-38)
            r17 = r14 & r17
            if (r17 != 0) goto L_0x00f9
            r2 = r15 & 128(0x80, float:1.794E-43)
            if (r2 != 0) goto L_0x00f2
            r2 = r49
            boolean r17 = r11.changed((java.lang.Object) r2)
            if (r17 == 0) goto L_0x00f4
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f6
        L_0x00f2:
            r2 = r49
        L_0x00f4:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f6:
            r1 = r1 | r17
            goto L_0x00fb
        L_0x00f9:
            r2 = r49
        L_0x00fb:
            r17 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r1 & r17
            r2 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r2) goto L_0x0119
            boolean r0 = r11.getSkipping()
            if (r0 != 0) goto L_0x010c
            goto L_0x0119
        L_0x010c:
            r11.skipToGroupEnd()
            r4 = r7
            r6 = r10
            r14 = r11
            r7 = r3
            r3 = r5
            r5 = r8
            r8 = r49
            goto L_0x029b
        L_0x0119:
            r11.startDefaults()
            r0 = r14 & 1
            r2 = 0
            r41 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r17 = -57345(0xffffffffffff1fff, float:NaN)
            r12 = 1
            if (r0 == 0) goto L_0x015b
            boolean r0 = r11.getDefaultsInvalid()
            if (r0 == 0) goto L_0x012f
            goto L_0x015b
        L_0x012f:
            r11.skipToGroupEnd()
            r0 = r15 & 16
            if (r0 == 0) goto L_0x0138
            r1 = r1 & r17
        L_0x0138:
            r0 = r15 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x014d
            r0 = r1 & r41
            r21 = r49
            r20 = r3
            r16 = r5
            r17 = r7
            r18 = r8
            r19 = r10
            r3 = r0
            goto L_0x01b3
        L_0x014d:
            r21 = r49
            r20 = r3
        L_0x0151:
            r16 = r5
            r17 = r7
            r18 = r8
            r19 = r10
            r3 = r1
            goto L_0x01b3
        L_0x015b:
            if (r4 == 0) goto L_0x0160
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            r5 = r0
        L_0x0160:
            if (r6 == 0) goto L_0x0163
            r7 = r12
        L_0x0163:
            r0 = r15 & 16
            if (r0 == 0) goto L_0x0171
            r0 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            tf.b r0 = p436tf.C13536k.m30875b(r0, r4)
            r1 = r1 & r17
            r8 = r0
        L_0x0171:
            if (r9 == 0) goto L_0x0174
            r10 = r2
        L_0x0174:
            if (r16 == 0) goto L_0x0178
            r0 = 0
            goto L_0x0179
        L_0x0178:
            r0 = r3
        L_0x0179:
            r3 = r15 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x01a6
            androidx.compose.material.SliderDefaults r16 = androidx.compose.material.SliderDefaults.INSTANCE
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
            r38 = 0
            r39 = 6
            r40 = 1023(0x3ff, float:1.434E-42)
            r37 = r11
            androidx.compose.material.SliderColors r3 = r16.m34100colorsq0g_0yA(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r38, r39, r40)
            r1 = r1 & r41
            r20 = r0
            r21 = r3
            goto L_0x0151
        L_0x01a6:
            r21 = r49
            r20 = r0
            r3 = r1
            r16 = r5
            r17 = r7
            r18 = r8
            r19 = r10
        L_0x01b3:
            r11.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01c5
            r0 = -1
            java.lang.String r1 = "androidx.compose.material.RangeSlider (Slider.kt:289)"
            r4 = -1556183027(0xffffffffa33e880d, float:-1.03287305E-17)
            androidx.compose.runtime.ComposerKt.traceEventStart(r4, r3, r0, r1)
        L_0x01c5:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.startReplaceableGroup(r0)
            java.lang.Object r1 = r11.rememberedValue()
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r5 = r4.getEmpty()
            if (r1 != r5) goto L_0x01de
            androidx.compose.foundation.interaction.MutableInteractionSource r1 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r11.updateRememberedValue(r1)
        L_0x01de:
            r11.endReplaceableGroup()
            r5 = r1
            androidx.compose.foundation.interaction.MutableInteractionSource r5 = (androidx.compose.foundation.interaction.MutableInteractionSource) r5
            r11.startReplaceableGroup(r0)
            java.lang.Object r0 = r11.rememberedValue()
            java.lang.Object r1 = r4.getEmpty()
            if (r0 != r1) goto L_0x01f8
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r11.updateRememberedValue(r0)
        L_0x01f8:
            r11.endReplaceableGroup()
            r6 = r0
            androidx.compose.foundation.interaction.MutableInteractionSource r6 = (androidx.compose.foundation.interaction.MutableInteractionSource) r6
            if (r19 < 0) goto L_0x0201
            r2 = r12
        L_0x0201:
            if (r2 == 0) goto L_0x02b4
            int r0 = r3 >> 3
            r0 = r0 & 14
            androidx.compose.runtime.State r7 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(r13, r11, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r19)
            r1 = 1157296644(0x44faf204, float:2007.563)
            r11.startReplaceableGroup(r1)
            boolean r0 = r11.changed((java.lang.Object) r0)
            java.lang.Object r1 = r11.rememberedValue()
            if (r0 != 0) goto L_0x0225
            java.lang.Object r0 = r4.getEmpty()
            if (r1 != r0) goto L_0x022c
        L_0x0225:
            java.util.List r1 = stepsToTickFractions(r19)
            r11.updateRememberedValue(r1)
        L_0x022c:
            r11.endReplaceableGroup()
            r10 = r1
            java.util.List r10 = (java.util.List) r10
            androidx.compose.ui.Modifier r22 = androidx.compose.material.InteractiveComponentSizeKt.minimumInteractiveComponentSize(r16)
            float r0 = ThumbRadius
            r1 = 4
            float r1 = (float) r1
            float r1 = r1 * r0
            float r23 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r1)
            r1 = 2
            float r1 = (float) r1
            float r0 = r0 * r1
            float r24 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r0)
            r25 = 0
            r26 = 0
            r27 = 12
            r28 = 0
            androidx.compose.ui.Modifier r22 = androidx.compose.foundation.layout.SizeKt.m33334requiredSizeInqDBjuR0$default(r22, r23, r24, r25, r26, r27, r28)
            r23 = 0
            r24 = 0
            androidx.compose.material.SliderKt$RangeSlider$2 r9 = new androidx.compose.material.SliderKt$RangeSlider$2
            r0 = r9
            r1 = r18
            r2 = r42
            r4 = r7
            r7 = r17
            r8 = r19
            r13 = r9
            r9 = r20
            r14 = r11
            r11 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = 652589923(0x26e5bb63, float:1.5940858E-15)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r14, r0, r12, r13)
            r1 = 3072(0xc00, float:4.305E-42)
            r2 = 6
            r44 = r22
            r45 = r23
            r46 = r24
            r47 = r0
            r48 = r14
            r49 = r1
            r50 = r2
            androidx.compose.foundation.layout.BoxWithConstraintsKt.BoxWithConstraints(r44, r45, r46, r47, r48, r49, r50)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x028f
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x028f:
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
        L_0x029b:
            androidx.compose.runtime.ScopeUpdateScope r11 = r14.endRestartGroup()
            if (r11 != 0) goto L_0x02a2
            goto L_0x02b3
        L_0x02a2:
            androidx.compose.material.SliderKt$RangeSlider$3 r12 = new androidx.compose.material.SliderKt$RangeSlider$3
            r0 = r12
            r1 = r42
            r2 = r43
            r9 = r51
            r10 = r52
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.updateScope(r12)
        L_0x02b3:
            return
        L_0x02b4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "steps should be >= 0"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.RangeSlider(tf.b, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, tf.b, int, of.a, androidx.compose.material.SliderColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void RangeSliderImpl(boolean z, float f, float f2, List<Float> list, SliderColors sliderColors, float f3, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, Modifier modifier, Modifier modifier2, Modifier modifier3, Composer composer, int i, int i2) {
        int i3 = i;
        Composer startRestartGroup = composer.startRestartGroup(-278895713);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-278895713, i3, i2, "androidx.compose.material.RangeSliderImpl (Slider.kt:615)");
        } else {
            int i4 = i2;
        }
        Strings.Companion companion = Strings.Companion;
        String r14 = Strings_androidKt.m34125getString4foXLRw(companion.m34124getSliderRangeStartUdPEhr4(), startRestartGroup, 6);
        String r0 = Strings_androidKt.m34125getString4foXLRw(companion.m34123getSliderRangeEndUdPEhr4(), startRestartGroup, 6);
        Modifier then = modifier.then(DefaultSliderConstraints);
        startRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.Companion;
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        C13074a<ComposeUiNode> constructor = companion3.getConstructor();
        C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(then);
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
        Composer r9 = Updater.m35292constructorimpl(startRestartGroup);
        Updater.m35299setimpl(r9, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m35299setimpl(r9, density, companion3.getSetDensity());
        Updater.m35299setimpl(r9, layoutDirection, companion3.getSetLayoutDirection());
        Updater.m35299setimpl(r9, viewConfiguration, companion3.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        float r8 = density2.m38449toPx0680j_4(TrackHeight);
        float f4 = ThumbRadius;
        float r7 = density2.m38449toPx0680j_4(f4);
        float r1 = density2.m38445toDpu2uoSUM(f3);
        float r16 = C1232Dp.m38468constructorimpl(f4 * ((float) 2));
        float r17 = C1232Dp.m38468constructorimpl(r1 * f);
        float r18 = C1232Dp.m38468constructorimpl(r1 * f2);
        Modifier.Companion companion4 = Modifier.Companion;
        int i5 = i3 >> 9;
        int i6 = i3 << 6;
        int i7 = i5;
        String str = r0;
        Modifier.Companion companion5 = companion4;
        BoxScopeInstance boxScopeInstance2 = boxScopeInstance;
        Track(SizeKt.fillMaxSize$default(boxScopeInstance.align(companion4, companion2.getCenterStart()), 0.0f, 1, (Object) null), sliderColors, z, f, f2, list, r7, r8, startRestartGroup, (i5 & 112) | 262144 | (i6 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i6 & 7168) | (i6 & 57344));
        startRestartGroup.startReplaceableGroup(1157296644);
        boolean changed = startRestartGroup.changed((Object) r14);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new SliderKt$RangeSliderImpl$1$2$1(r14);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        int i8 = i3 & 57344;
        int i9 = (i3 << 15) & 458752;
        m34101SliderThumbPcYyNuk(boxScopeInstance2, FocusableKt.focusable(SemanticsModifierKt.semantics(companion5, true, (Function1) rememberedValue), true, mutableInteractionSource).then(modifier2), r17, mutableInteractionSource, sliderColors, z, r16, startRestartGroup, (i7 & 7168) | 1572870 | i8 | i9);
        startRestartGroup.startReplaceableGroup(1157296644);
        String str2 = str;
        boolean changed2 = startRestartGroup.changed((Object) str2);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new SliderKt$RangeSliderImpl$1$3$1(str2);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        m34101SliderThumbPcYyNuk(boxScopeInstance2, FocusableKt.focusable(SemanticsModifierKt.semantics(companion5, true, (Function1) rememberedValue2), true, mutableInteractionSource2).then(modifier3), r18, mutableInteractionSource2, sliderColors, z, r16, startRestartGroup, ((i3 >> 12) & 7168) | 1572870 | i8 | i9);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            SliderKt$RangeSliderImpl$2 sliderKt$RangeSliderImpl$2 = r0;
            SliderKt$RangeSliderImpl$2 sliderKt$RangeSliderImpl$22 = new SliderKt$RangeSliderImpl$2(z, f, f2, list, sliderColors, f3, mutableInteractionSource, mutableInteractionSource2, modifier, modifier2, modifier3, i, i2);
            endRestartGroup.updateScope(sliderKt$RangeSliderImpl$2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: androidx.compose.ui.Modifier$Companion} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0118  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void Slider(float r39, kotlin.jvm.functions.Function1<? super java.lang.Float, p336ef.C11921v> r40, androidx.compose.p002ui.Modifier r41, boolean r42, p436tf.C13522b<java.lang.Float> r43, int r44, p404of.C13074a<p336ef.C11921v> r45, androidx.compose.foundation.interaction.MutableInteractionSource r46, androidx.compose.material.SliderColors r47, androidx.compose.runtime.Composer r48, int r49, int r50) {
        /*
            r2 = r40
            r10 = r49
            r11 = r50
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.C12775o.m28639i(r2, r0)
            r0 = -1962335196(0xffffffff8b092424, float:-2.641243E-32)
            r1 = r48
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            r3 = r11 & 1
            if (r3 == 0) goto L_0x001e
            r3 = r10 | 6
            r5 = r3
            r3 = r39
            goto L_0x0032
        L_0x001e:
            r3 = r10 & 14
            if (r3 != 0) goto L_0x002f
            r3 = r39
            boolean r5 = r1.changed((float) r3)
            if (r5 == 0) goto L_0x002c
            r5 = 4
            goto L_0x002d
        L_0x002c:
            r5 = 2
        L_0x002d:
            r5 = r5 | r10
            goto L_0x0032
        L_0x002f:
            r3 = r39
            r5 = r10
        L_0x0032:
            r6 = r11 & 2
            if (r6 == 0) goto L_0x0039
            r5 = r5 | 48
            goto L_0x0049
        L_0x0039:
            r6 = r10 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0049
            boolean r6 = r1.changedInstance(r2)
            if (r6 == 0) goto L_0x0046
            r6 = 32
            goto L_0x0048
        L_0x0046:
            r6 = 16
        L_0x0048:
            r5 = r5 | r6
        L_0x0049:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0050
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x0050:
            r7 = r10 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0063
            r7 = r41
            boolean r8 = r1.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x005f
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r5 = r5 | r8
            goto L_0x0065
        L_0x0063:
            r7 = r41
        L_0x0065:
            r8 = r11 & 8
            if (r8 == 0) goto L_0x006c
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x007f
        L_0x006c:
            r9 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x007f
            r9 = r42
            boolean r12 = r1.changed((boolean) r9)
            if (r12 == 0) goto L_0x007b
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r5 = r5 | r12
            goto L_0x0081
        L_0x007f:
            r9 = r42
        L_0x0081:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r10
            if (r12 != 0) goto L_0x009c
            r12 = r11 & 16
            if (r12 != 0) goto L_0x0096
            r12 = r43
            boolean r13 = r1.changed((java.lang.Object) r12)
            if (r13 == 0) goto L_0x0098
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009a
        L_0x0096:
            r12 = r43
        L_0x0098:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x009a:
            r5 = r5 | r13
            goto L_0x009e
        L_0x009c:
            r12 = r43
        L_0x009e:
            r13 = r11 & 32
            if (r13 == 0) goto L_0x00a6
            r14 = 196608(0x30000, float:2.75506E-40)
            r5 = r5 | r14
            goto L_0x00ba
        L_0x00a6:
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r10
            if (r14 != 0) goto L_0x00ba
            r14 = r44
            boolean r15 = r1.changed((int) r14)
            if (r15 == 0) goto L_0x00b6
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b8
        L_0x00b6:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00b8:
            r5 = r5 | r15
            goto L_0x00bc
        L_0x00ba:
            r14 = r44
        L_0x00bc:
            r15 = r11 & 64
            if (r15 == 0) goto L_0x00c7
            r16 = 1572864(0x180000, float:2.204052E-39)
            r5 = r5 | r16
            r4 = r45
            goto L_0x00dc
        L_0x00c7:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r10 & r16
            r4 = r45
            if (r16 != 0) goto L_0x00dc
            boolean r16 = r1.changedInstance(r4)
            if (r16 == 0) goto L_0x00d8
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00da
        L_0x00d8:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00da:
            r5 = r5 | r16
        L_0x00dc:
            r0 = r11 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00e7
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r5 = r5 | r16
            r3 = r46
            goto L_0x00fc
        L_0x00e7:
            r16 = 29360128(0x1c00000, float:7.052966E-38)
            r16 = r10 & r16
            r3 = r46
            if (r16 != 0) goto L_0x00fc
            boolean r16 = r1.changed((java.lang.Object) r3)
            if (r16 == 0) goto L_0x00f8
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fa
        L_0x00f8:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fa:
            r5 = r5 | r16
        L_0x00fc:
            r16 = 234881024(0xe000000, float:1.5777218E-30)
            r16 = r10 & r16
            if (r16 != 0) goto L_0x0118
            r3 = r11 & 256(0x100, float:3.59E-43)
            if (r3 != 0) goto L_0x0111
            r3 = r47
            boolean r16 = r1.changed((java.lang.Object) r3)
            if (r16 == 0) goto L_0x0113
            r16 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0115
        L_0x0111:
            r3 = r47
        L_0x0113:
            r16 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0115:
            r5 = r5 | r16
            goto L_0x011a
        L_0x0118:
            r3 = r47
        L_0x011a:
            r16 = 191739611(0xb6db6db, float:4.5782105E-32)
            r3 = r5 & r16
            r4 = 38347922(0x2492492, float:1.4777643E-37)
            if (r3 != r4) goto L_0x013a
            boolean r3 = r1.getSkipping()
            if (r3 != 0) goto L_0x012b
            goto L_0x013a
        L_0x012b:
            r1.skipToGroupEnd()
            r8 = r46
            r3 = r7
            r4 = r9
            r5 = r12
            r6 = r14
            r7 = r45
            r9 = r47
            goto L_0x02b2
        L_0x013a:
            r1.startDefaults()
            r3 = r10 & 1
            r37 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r16 = -57345(0xffffffffffff1fff, float:NaN)
            r4 = 1
            if (r3 == 0) goto L_0x0174
            boolean r3 = r1.getDefaultsInvalid()
            if (r3 == 0) goto L_0x014f
            goto L_0x0174
        L_0x014f:
            r1.skipToGroupEnd()
            r0 = r11 & 16
            if (r0 == 0) goto L_0x0158
            r5 = r5 & r16
        L_0x0158:
            r0 = r11 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0169
            r0 = r5 & r37
            r8 = r45
            r5 = r47
            r3 = r12
            r6 = r14
            r14 = r0
            r0 = r46
            goto L_0x01e3
        L_0x0169:
            r8 = r45
            r0 = r46
            r3 = r12
            r6 = r14
        L_0x016f:
            r14 = r5
            r5 = r47
            goto L_0x01e3
        L_0x0174:
            if (r6 == 0) goto L_0x0179
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.p002ui.Modifier.Companion
            r7 = r3
        L_0x0179:
            if (r8 == 0) goto L_0x017c
            r9 = r4
        L_0x017c:
            r3 = r11 & 16
            if (r3 == 0) goto L_0x018a
            r3 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            tf.b r3 = p436tf.C13536k.m30875b(r3, r6)
            r5 = r5 & r16
            goto L_0x018b
        L_0x018a:
            r3 = r12
        L_0x018b:
            if (r13 == 0) goto L_0x018f
            r6 = 0
            goto L_0x0190
        L_0x018f:
            r6 = r14
        L_0x0190:
            if (r15 == 0) goto L_0x0194
            r8 = 0
            goto L_0x0196
        L_0x0194:
            r8 = r45
        L_0x0196:
            if (r0 == 0) goto L_0x01b7
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1.startReplaceableGroup(r0)
            java.lang.Object r0 = r1.rememberedValue()
            androidx.compose.runtime.Composer$Companion r12 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r12 = r12.getEmpty()
            if (r0 != r12) goto L_0x01b1
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r1.updateRememberedValue(r0)
        L_0x01b1:
            r1.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = (androidx.compose.foundation.interaction.MutableInteractionSource) r0
            goto L_0x01b9
        L_0x01b7:
            r0 = r46
        L_0x01b9:
            r12 = r11 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L_0x016f
            androidx.compose.material.SliderDefaults r12 = androidx.compose.material.SliderDefaults.INSTANCE
            r13 = 0
            r15 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r34 = 0
            r35 = 6
            r36 = 1023(0x3ff, float:1.434E-42)
            r33 = r1
            androidx.compose.material.SliderColors r12 = r12.m34100colorsq0g_0yA(r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r34, r35, r36)
            r5 = r5 & r37
            r14 = r5
            r5 = r12
        L_0x01e3:
            r1.endDefaults()
            boolean r12 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r12 == 0) goto L_0x01f5
            r12 = -1
            java.lang.String r13 = "androidx.compose.material.Slider (Slider.kt:144)"
            r15 = -1962335196(0xffffffff8b092424, float:-2.641243E-32)
            androidx.compose.runtime.ComposerKt.traceEventStart(r15, r14, r12, r13)
        L_0x01f5:
            if (r6 < 0) goto L_0x01fa
            r38 = r4
            goto L_0x01fc
        L_0x01fa:
            r38 = 0
        L_0x01fc:
            if (r38 == 0) goto L_0x02cb
            int r12 = r14 >> 3
            r12 = r12 & 14
            androidx.compose.runtime.State r20 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(r2, r1, r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            r13 = 1157296644(0x44faf204, float:2007.563)
            r1.startReplaceableGroup(r13)
            boolean r12 = r1.changed((java.lang.Object) r12)
            java.lang.Object r13 = r1.rememberedValue()
            if (r12 != 0) goto L_0x0222
            androidx.compose.runtime.Composer$Companion r12 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r12 = r12.getEmpty()
            if (r13 != r12) goto L_0x0229
        L_0x0222:
            java.util.List r13 = stepsToTickFractions(r6)
            r1.updateRememberedValue(r13)
        L_0x0229:
            r1.endReplaceableGroup()
            r18 = r13
            java.util.List r18 = (java.util.List) r18
            androidx.compose.ui.Modifier r12 = androidx.compose.material.InteractiveComponentSizeKt.minimumInteractiveComponentSize(r7)
            float r13 = ThumbRadius
            r15 = 2
            float r15 = (float) r15
            float r16 = r13 * r15
            float r16 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r16)
            float r13 = r13 * r15
            float r13 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r13)
            r15 = 0
            r17 = 0
            r19 = 12
            r21 = 0
            r41 = r12
            r42 = r16
            r43 = r13
            r44 = r15
            r45 = r17
            r46 = r19
            r47 = r21
            androidx.compose.ui.Modifier r12 = androidx.compose.foundation.layout.SizeKt.m33334requiredSizeInqDBjuR0$default(r41, r42, r43, r44, r45, r46, r47)
            r41 = r12
            r42 = r39
            r43 = r9
            r44 = r40
            r45 = r8
            r46 = r3
            r47 = r6
            androidx.compose.ui.Modifier r12 = sliderSemantics(r41, r42, r43, r44, r45, r46, r47)
            androidx.compose.ui.Modifier r22 = androidx.compose.foundation.FocusableKt.focusable(r12, r9, r0)
            r23 = 0
            r24 = 0
            androidx.compose.material.SliderKt$Slider$3 r15 = new androidx.compose.material.SliderKt$Slider$3
            r12 = r15
            r13 = r3
            r2 = r15
            r15 = r39
            r16 = r0
            r17 = r9
            r19 = r5
            r21 = r8
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r12 = 2085116814(0x7c485b8e, float:4.1612653E36)
            androidx.compose.runtime.internal.ComposableLambda r2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r1, r12, r4, r2)
            r4 = 3072(0xc00, float:4.305E-42)
            r12 = 6
            r41 = r22
            r42 = r23
            r43 = r24
            r44 = r2
            r45 = r1
            r46 = r4
            r47 = r12
            androidx.compose.foundation.layout.BoxWithConstraintsKt.BoxWithConstraints(r41, r42, r43, r44, r45, r46, r47)
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x02ac
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x02ac:
            r4 = r9
            r9 = r5
            r5 = r3
            r3 = r7
            r7 = r8
            r8 = r0
        L_0x02b2:
            androidx.compose.runtime.ScopeUpdateScope r12 = r1.endRestartGroup()
            if (r12 != 0) goto L_0x02b9
            goto L_0x02ca
        L_0x02b9:
            androidx.compose.material.SliderKt$Slider$4 r13 = new androidx.compose.material.SliderKt$Slider$4
            r0 = r13
            r1 = r39
            r2 = r40
            r10 = r49
            r11 = r50
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.updateScope(r13)
        L_0x02ca:
            return
        L_0x02cb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "steps should be >= 0"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.Slider(float, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, tf.b, int, of.a, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.SliderColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void SliderImpl(boolean z, float f, List<Float> list, SliderColors sliderColors, float f2, MutableInteractionSource mutableInteractionSource, Modifier modifier, Composer composer, int i) {
        int i2 = i;
        Composer startRestartGroup = composer.startRestartGroup(1679682785);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1679682785, i2, -1, "androidx.compose.material.SliderImpl (Slider.kt:578)");
        }
        Modifier then = modifier.then(DefaultSliderConstraints);
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        C13074a<ComposeUiNode> constructor = companion.getConstructor();
        C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(then);
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
        Composer r10 = Updater.m35292constructorimpl(startRestartGroup);
        Updater.m35299setimpl(r10, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m35299setimpl(r10, density, companion.getSetDensity());
        Updater.m35299setimpl(r10, layoutDirection, companion.getSetLayoutDirection());
        Updater.m35299setimpl(r10, viewConfiguration, companion.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        float r16 = density2.m38449toPx0680j_4(TrackHeight);
        float f3 = ThumbRadius;
        float r15 = density2.m38449toPx0680j_4(f3);
        float r2 = density2.m38445toDpu2uoSUM(f2);
        float r3 = C1232Dp.m38468constructorimpl(f3 * ((float) 2));
        float r22 = C1232Dp.m38468constructorimpl(r2 * f);
        Modifier.Companion companion2 = Modifier.Companion;
        int i3 = i2 >> 6;
        Track(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, (Object) null), sliderColors, z, 0.0f, f, list, r15, r16, startRestartGroup, (i3 & 112) | 265222 | ((i2 << 6) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i2 << 9) & 57344));
        m34101SliderThumbPcYyNuk(boxScopeInstance, companion2, r22, mutableInteractionSource, sliderColors, z, r3, startRestartGroup, (i3 & 7168) | 1572918 | ((i2 << 3) & 57344) | ((i2 << 15) & 458752));
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SliderKt$SliderImpl$2(z, f, list, sliderColors, f2, mutableInteractionSource, modifier, i));
        }
    }

    /* access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: SliderThumb-PcYyNuk  reason: not valid java name */
    public static final void m34101SliderThumbPcYyNuk(BoxScope boxScope, Modifier modifier, float f, MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, boolean z, float f2, Composer composer, int i) {
        int i2;
        float f3;
        float f4;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        BoxScope boxScope2 = boxScope;
        Modifier modifier2 = modifier;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        SliderColors sliderColors2 = sliderColors;
        boolean z2 = z;
        float f5 = f2;
        int i10 = i;
        Composer startRestartGroup = composer.startRestartGroup(428907178);
        if ((i10 & 14) == 0) {
            if (startRestartGroup.changed((Object) boxScope2)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i10;
        } else {
            i2 = i10;
        }
        if ((i10 & 112) == 0) {
            if (startRestartGroup.changed((Object) modifier2)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        float f6 = f;
        if ((i10 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 0) {
            if (startRestartGroup.changed(f6)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i2 |= i7;
        }
        if ((i10 & 7168) == 0) {
            if (startRestartGroup.changed((Object) mutableInteractionSource2)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((57344 & i10) == 0) {
            if (startRestartGroup.changed((Object) sliderColors2)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        }
        if ((458752 & i10) == 0) {
            if (startRestartGroup.changed(z2)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i2 |= i4;
        }
        if ((3670016 & i10) == 0) {
            if (startRestartGroup.changed(f5)) {
                i3 = 1048576;
            } else {
                i3 = 524288;
            }
            i2 |= i3;
        }
        int i11 = i2;
        if ((2995931 & i11) != 599186 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(428907178, i11, -1, "androidx.compose.material.SliderThumb (Slider.kt:683)");
            }
            Modifier r0 = PaddingKt.m33272paddingqDBjuR0$default(Modifier.Companion, f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
            Alignment.Companion companion = Alignment.Companion;
            Modifier align = boxScope2.align(r0, companion.getCenterStart());
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            C13074a<ComposeUiNode> constructor = companion2.getConstructor();
            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(align);
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
            Composer r1 = Updater.m35292constructorimpl(startRestartGroup);
            Updater.m35299setimpl(r1, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m35299setimpl(r1, density, companion2.getSetDensity());
            Updater.m35299setimpl(r1, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m35299setimpl(r1, viewConfiguration, companion2.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion3 = Composer.Companion;
            if (rememberedValue == companion3.getEmpty()) {
                rememberedValue = SnapshotStateKt.mutableStateListOf();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue;
            int i12 = i11 >> 9;
            int i13 = i12 & 14;
            startRestartGroup.startReplaceableGroup(511388516);
            boolean changed = startRestartGroup.changed((Object) mutableInteractionSource2) | startRestartGroup.changed((Object) snapshotStateList);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == companion3.getEmpty()) {
                rememberedValue2 = new SliderKt$SliderThumb$1$1$1(mutableInteractionSource2, snapshotStateList, (C12074d<? super SliderKt$SliderThumb$1$1$1>) null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect((Object) mutableInteractionSource2, (C13088o<? super C13995l0, ? super C12074d<? super C11921v>, ? extends Object>) (C13088o) rememberedValue2, startRestartGroup, i13 | 64);
            if (!snapshotStateList.isEmpty()) {
                f3 = ThumbPressedElevation;
            } else {
                f3 = ThumbDefaultElevation;
            }
            int i14 = i11;
            float f7 = f3;
            Modifier hoverable$default = HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.m33340sizeVpY3zN4(modifier2, f5, f5), mutableInteractionSource2, RippleKt.m34235rememberRipple9IZ8Weo(false, ThumbRippleRadius, 0, startRestartGroup, 54, 4)), mutableInteractionSource2, false, 2, (Object) null);
            if (z2) {
                f4 = f7;
            } else {
                f4 = C1232Dp.m38468constructorimpl((float) 0);
            }
            SpacerKt.Spacer(BackgroundKt.m32956backgroundbw27NRU(ShadowKt.m35337shadows4CzXII$default(hoverable$default, f4, RoundedCornerShapeKt.getCircleShape(), false, 0, 0, 24, (Object) null), sliderColors2.thumbColor(z2, startRestartGroup, ((i14 >> 15) & 14) | (i12 & 112)).getValue().m35681unboximpl(), RoundedCornerShapeKt.getCircleShape()), startRestartGroup, 0);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SliderKt$SliderThumb$2(boxScope, modifier, f, mutableInteractionSource, sliderColors, z, f2, i));
        }
    }

    /* access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Track(Modifier modifier, SliderColors sliderColors, boolean z, float f, float f2, List<Float> list, float f3, float f4, Composer composer, int i) {
        SliderColors sliderColors2 = sliderColors;
        boolean z2 = z;
        int i2 = i;
        Composer startRestartGroup = composer.startRestartGroup(1833126050);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1833126050, i2, -1, "androidx.compose.material.Track (Slider.kt:729)");
        }
        int i3 = ((i2 >> 6) & 14) | 48 | ((i2 << 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH);
        Modifier modifier2 = modifier;
        CanvasKt.Canvas(modifier2, new SliderKt$Track$1(f3, sliderColors2.trackColor(z2, false, startRestartGroup, i3), f4, f2, f, sliderColors2.trackColor(z2, true, startRestartGroup, i3), list, sliderColors2.tickColor(z2, false, startRestartGroup, i3), sliderColors2.tickColor(z2, true, startRestartGroup, i3)), startRestartGroup, i2 & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SliderKt$Track$2(modifier, sliderColors, z, f, f2, list, f3, f4, i));
        }
    }

    /* access modifiers changed from: private */
    public static final Object animateToTarget(DraggableState draggableState, float f, float f2, float f3, C12074d<? super C11921v> dVar) {
        Object drag$default = DraggableState.drag$default(draggableState, (MutatePriority) null, new SliderKt$animateToTarget$2(f, f2, f3, (C12074d<? super SliderKt$animateToTarget$2>) null), dVar, 1, (Object) null);
        if (drag$default == C12150d.m26492c()) {
            return drag$default;
        }
        return C11921v.f18618a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0063 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: awaitSlop-8vUncbI  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m34104awaitSlop8vUncbI(androidx.compose.p002ui.input.pointer.AwaitPointerEventScope r8, long r9, int r11, p355hf.C12074d<? super p336ef.C11906l<androidx.compose.p002ui.input.pointer.PointerInputChange, java.lang.Float>> r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.material.SliderKt$awaitSlop$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            androidx.compose.material.SliderKt$awaitSlop$1 r0 = (androidx.compose.material.SliderKt$awaitSlop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material.SliderKt$awaitSlop$1 r0 = new androidx.compose.material.SliderKt$awaitSlop$1
            r0.<init>(r12)
        L_0x0018:
            r6 = r0
            java.lang.Object r12 = r6.result
            java.lang.Object r0 = p362if.C12150d.m26492c()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L_0x0036
            if (r1 != r2) goto L_0x002e
            java.lang.Object r8 = r6.L$0
            kotlin.jvm.internal.e0 r8 = (kotlin.jvm.internal.C12757e0) r8
            p336ef.C11910n.m25701b(r12)
            goto L_0x0054
        L_0x002e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0036:
            p336ef.C11910n.m25701b(r12)
            kotlin.jvm.internal.e0 r12 = new kotlin.jvm.internal.e0
            r12.<init>()
            androidx.compose.material.SliderKt$awaitSlop$postPointerSlop$1 r5 = new androidx.compose.material.SliderKt$awaitSlop$postPointerSlop$1
            r5.<init>(r12)
            r6.L$0 = r12
            r6.label = r2
            r1 = r8
            r2 = r9
            r4 = r11
            java.lang.Object r8 = androidx.compose.material.DragGestureDetectorCopyKt.m33988awaitHorizontalPointerSlopOrCancellationgDDlDlE(r1, r2, r4, r5, r6)
            if (r8 != r0) goto L_0x0051
            return r0
        L_0x0051:
            r7 = r12
            r12 = r8
            r8 = r7
        L_0x0054:
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r12
            if (r12 == 0) goto L_0x0063
            float r8 = r8.f20408b
            java.lang.Float r8 = kotlin.coroutines.jvm.internal.C12735b.m28559b(r8)
            ef.l r8 = p336ef.C11915r.m25707a(r12, r8)
            goto L_0x0064
        L_0x0063:
            r8 = 0
        L_0x0064:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.m34104awaitSlop8vUncbI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, hf.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final float calcFraction(float f, float f2, float f3) {
        boolean z;
        float f4;
        float f5 = f2 - f;
        if (f5 == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f4 = 0.0f;
        } else {
            f4 = (f3 - f) / f5;
        }
        return C13537l.m30885l(f4, 0.0f, 1.0f);
    }

    public static final float getThumbRadius() {
        return ThumbRadius;
    }

    public static final float getTrackHeight() {
        return TrackHeight;
    }

    /* access modifiers changed from: private */
    public static final Modifier rangeSliderPressDragModifier(Modifier modifier, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State<Float> state, State<Float> state2, boolean z, boolean z2, float f, C13522b<Float> bVar, State<? extends Function1<? super Boolean, C11921v>> state3, State<? extends C13088o<? super Boolean, ? super Float, C11921v>> state4) {
        if (!z) {
            return modifier;
        }
        Modifier modifier2 = modifier;
        return SuspendingPointerInputFilterKt.pointerInput(modifier, new Object[]{mutableInteractionSource, mutableInteractionSource2, Float.valueOf(f), Boolean.valueOf(z2), bVar}, (C13088o<? super PointerInputScope, ? super C12074d<? super C11921v>, ? extends Object>) new SliderKt$rangeSliderPressDragModifier$1(mutableInteractionSource, mutableInteractionSource2, state, state2, state4, z2, f, state3, (C12074d<? super SliderKt$rangeSliderPressDragModifier$1>) null));
    }

    /* access modifiers changed from: private */
    public static final float scale(float f, float f2, float f3, float f4, float f5) {
        return MathHelpersKt.lerp(f4, f5, calcFraction(f, f2, f3));
    }

    /* access modifiers changed from: private */
    public static final Modifier sliderSemantics(Modifier modifier, float f, boolean z, Function1<? super Float, C11921v> function1, C13074a<C11921v> aVar, C13522b<Float> bVar, int i) {
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier, false, new SliderKt$sliderSemantics$1(z, bVar, i, C13537l.m30885l(f, bVar.getStart().floatValue(), bVar.getEndInclusive().floatValue()), function1, aVar), 1, (Object) null), f, bVar, i);
    }

    static /* synthetic */ Modifier sliderSemantics$default(Modifier modifier, float f, boolean z, Function1 function1, C13074a aVar, C13522b bVar, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            aVar = null;
        }
        C13074a aVar2 = aVar;
        if ((i2 & 16) != 0) {
            bVar = C13536k.m30875b(0.0f, 1.0f);
        }
        C13522b bVar2 = bVar;
        if ((i2 & 32) != 0) {
            i = 0;
        }
        return sliderSemantics(modifier, f, z, function1, aVar2, bVar2, i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: androidx.compose.material.SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: androidx.compose.material.SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1} */
    /* JADX WARNING: type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p002ui.Modifier sliderTapModifier(androidx.compose.p002ui.Modifier r11, androidx.compose.foundation.gestures.DraggableState r12, androidx.compose.foundation.interaction.MutableInteractionSource r13, float r14, boolean r15, androidx.compose.runtime.State<java.lang.Float> r16, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super java.lang.Float, p336ef.C11921v>> r17, androidx.compose.runtime.MutableState<java.lang.Float> r18, boolean r19) {
        /*
            boolean r0 = androidx.compose.p002ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled()
            if (r0 == 0) goto L_0x0019
            androidx.compose.material.SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1 r0 = new androidx.compose.material.SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1
            r1 = r0
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x001d
        L_0x0019:
            kotlin.jvm.functions.Function1 r0 = androidx.compose.p002ui.platform.InspectableValueKt.getNoInspectorInfo()
        L_0x001d:
            androidx.compose.material.SliderKt$sliderTapModifier$2 r10 = new androidx.compose.material.SliderKt$sliderTapModifier$2
            r1 = r10
            r2 = r19
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r18
            r8 = r16
            r9 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = r11
            androidx.compose.ui.Modifier r0 = androidx.compose.p002ui.ComposedModifierKt.composed(r11, r0, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.sliderTapModifier(androidx.compose.ui.Modifier, androidx.compose.foundation.gestures.DraggableState, androidx.compose.foundation.interaction.MutableInteractionSource, float, boolean, androidx.compose.runtime.State, androidx.compose.runtime.State, androidx.compose.runtime.MutableState, boolean):androidx.compose.ui.Modifier");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Number} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final float snapValueToTick(float r5, java.util.List<java.lang.Float> r6, float r7, float r8) {
        /*
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
            boolean r0 = r6.hasNext()
            if (r0 != 0) goto L_0x000e
            r6 = 0
            goto L_0x004d
        L_0x000e:
            java.lang.Object r0 = r6.next()
            boolean r1 = r6.hasNext()
            if (r1 != 0) goto L_0x001a
        L_0x0018:
            r6 = r0
            goto L_0x004d
        L_0x001a:
            r1 = r0
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r1 = androidx.compose.p002ui.util.MathHelpersKt.lerp((float) r7, (float) r8, (float) r1)
            float r1 = r1 - r5
            float r1 = java.lang.Math.abs(r1)
        L_0x002a:
            java.lang.Object r2 = r6.next()
            r3 = r2
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            float r3 = androidx.compose.p002ui.util.MathHelpersKt.lerp((float) r7, (float) r8, (float) r3)
            float r3 = r3 - r5
            float r3 = java.lang.Math.abs(r3)
            int r4 = java.lang.Float.compare(r1, r3)
            if (r4 <= 0) goto L_0x0046
            r0 = r2
            r1 = r3
        L_0x0046:
            boolean r2 = r6.hasNext()
            if (r2 != 0) goto L_0x002a
            goto L_0x0018
        L_0x004d:
            java.lang.Float r6 = (java.lang.Float) r6
            if (r6 == 0) goto L_0x0059
            float r5 = r6.floatValue()
            float r5 = androidx.compose.p002ui.util.MathHelpersKt.lerp((float) r7, (float) r8, (float) r5)
        L_0x0059:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.snapValueToTick(float, java.util.List, float, float):float");
    }

    /* access modifiers changed from: private */
    public static final List<Float> stepsToTickFractions(int i) {
        if (i == 0) {
            return C12726w.m28524k();
        }
        int i2 = i + 2;
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(Float.valueOf(((float) i3) / ((float) (i + 1))));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static final C13522b<Float> scale(float f, float f2, C13522b<Float> bVar, float f3, float f4) {
        return C13536k.m30875b(scale(f, f2, bVar.getStart().floatValue(), f3, f4), scale(f, f2, bVar.getEndInclusive().floatValue(), f3, f4));
    }
}
