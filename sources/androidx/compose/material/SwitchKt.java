package androidx.compose.material;

import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.draw.ShadowKt;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.PathEffect;
import androidx.compose.p002ui.graphics.StrokeCap;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@SourceDebugExtension({"SMAP\nSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Switch.kt\nandroidx/compose/material/SwitchKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,380:1\n25#2:381\n460#2,13:410\n473#2,3:424\n25#2:429\n50#2:436\n49#2:437\n36#2:444\n36#2:454\n1114#3,6:382\n1114#3,6:430\n1114#3,6:438\n1114#3,6:445\n1114#3,6:455\n76#4:388\n76#4:390\n76#4:398\n76#4:451\n76#4:452\n1#5:389\n67#6,6:391\n73#6:423\n77#6:428\n75#7:397\n76#7,11:399\n89#7:427\n51#8:453\n58#8:468\n76#9:461\n76#9:462\n154#10:463\n154#10:464\n154#10:465\n154#10:466\n154#10:467\n154#10:469\n154#10:470\n*S KotlinDebug\n*F\n+ 1 Switch.kt\nandroidx/compose/material/SwitchKt\n*L\n94#1:381\n115#1:410,13\n115#1:424,3\n185#1:429\n187#1:436\n187#1:437\n208#1:444\n223#1:454\n94#1:382,6\n185#1:430,6\n187#1:438,6\n208#1:445,6\n223#1:455,6\n98#1:388\n100#1:390\n115#1:398\n212#1:451\n213#1:452\n115#1:391,6\n115#1:423\n115#1:428\n115#1:397\n115#1:399,11\n115#1:427\n213#1:453\n254#1:468\n206#1:461\n211#1:462\n245#1:463\n246#1:464\n247#1:465\n249#1:466\n251#1:467\n258#1:469\n259#1:470\n*E\n"})
/* compiled from: Switch.kt */
public final class SwitchKt {
    private static final TweenSpec<Float> AnimationSpec = new TweenSpec(100, 0, (Easing) null, 6, (DefaultConstructorMarker) null);
    private static final float DefaultSwitchPadding = C1232Dp.m38468constructorimpl((float) 2);
    private static final float SwitchHeight;
    private static final float SwitchWidth;
    private static final float ThumbDefaultElevation = C1232Dp.m38468constructorimpl((float) 1);
    private static final float ThumbDiameter;
    private static final float ThumbPathLength;
    private static final float ThumbPressedElevation = C1232Dp.m38468constructorimpl((float) 6);
    private static final float ThumbRippleRadius = C1232Dp.m38468constructorimpl((float) 24);
    private static final float TrackStrokeWidth = C1232Dp.m38468constructorimpl((float) 14);
    private static final float TrackWidth;

    static {
        float r0 = C1232Dp.m38468constructorimpl((float) 34);
        TrackWidth = r0;
        float r1 = C1232Dp.m38468constructorimpl((float) 20);
        ThumbDiameter = r1;
        SwitchWidth = r0;
        SwitchHeight = r1;
        ThumbPathLength = C1232Dp.m38468constructorimpl(r0 - r1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02f5  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x015f  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void Switch(boolean r36, kotlin.jvm.functions.Function1<? super java.lang.Boolean, p336ef.C11921v> r37, androidx.compose.p002ui.Modifier r38, boolean r39, androidx.compose.foundation.interaction.MutableInteractionSource r40, androidx.compose.material.SwitchColors r41, androidx.compose.runtime.Composer r42, int r43, int r44) {
        /*
            r7 = r37
            r8 = r43
            r0 = 25866825(0x18ab249, float:5.094902E-38)
            r1 = r42
            androidx.compose.runtime.Composer r6 = r1.startRestartGroup(r0)
            r1 = r44 & 1
            r5 = 2
            if (r1 == 0) goto L_0x0017
            r1 = r8 | 6
            r4 = r36
            goto L_0x0029
        L_0x0017:
            r1 = r8 & 14
            r4 = r36
            if (r1 != 0) goto L_0x0028
            boolean r1 = r6.changed((boolean) r4)
            if (r1 == 0) goto L_0x0025
            r1 = 4
            goto L_0x0026
        L_0x0025:
            r1 = r5
        L_0x0026:
            r1 = r1 | r8
            goto L_0x0029
        L_0x0028:
            r1 = r8
        L_0x0029:
            r2 = r44 & 2
            if (r2 == 0) goto L_0x0030
            r1 = r1 | 48
            goto L_0x0040
        L_0x0030:
            r2 = r8 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0040
            boolean r2 = r6.changedInstance(r7)
            if (r2 == 0) goto L_0x003d
            r2 = 32
            goto L_0x003f
        L_0x003d:
            r2 = 16
        L_0x003f:
            r1 = r1 | r2
        L_0x0040:
            r2 = r44 & 4
            if (r2 == 0) goto L_0x0047
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x005a
        L_0x0047:
            r3 = r8 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x005a
            r3 = r38
            boolean r9 = r6.changed((java.lang.Object) r3)
            if (r9 == 0) goto L_0x0056
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0058
        L_0x0056:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0058:
            r1 = r1 | r9
            goto L_0x005c
        L_0x005a:
            r3 = r38
        L_0x005c:
            r9 = r44 & 8
            if (r9 == 0) goto L_0x0063
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0076
        L_0x0063:
            r10 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x0076
            r10 = r39
            boolean r11 = r6.changed((boolean) r10)
            if (r11 == 0) goto L_0x0072
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0074
        L_0x0072:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0074:
            r1 = r1 | r11
            goto L_0x0078
        L_0x0076:
            r10 = r39
        L_0x0078:
            r11 = r44 & 16
            if (r11 == 0) goto L_0x007f
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0094
        L_0x007f:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r8
            if (r12 != 0) goto L_0x0094
            r12 = r40
            boolean r13 = r6.changed((java.lang.Object) r12)
            if (r13 == 0) goto L_0x0090
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0092
        L_0x0090:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0092:
            r1 = r1 | r13
            goto L_0x0096
        L_0x0094:
            r12 = r40
        L_0x0096:
            r32 = 458752(0x70000, float:6.42848E-40)
            r13 = r8 & r32
            if (r13 != 0) goto L_0x00b1
            r13 = r44 & 32
            if (r13 != 0) goto L_0x00ab
            r13 = r41
            boolean r14 = r6.changed((java.lang.Object) r13)
            if (r14 == 0) goto L_0x00ad
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00af
        L_0x00ab:
            r13 = r41
        L_0x00ad:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00af:
            r1 = r1 | r14
            goto L_0x00b3
        L_0x00b1:
            r13 = r41
        L_0x00b3:
            r14 = 374491(0x5b6db, float:5.24774E-40)
            r14 = r14 & r1
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r14 != r15) goto L_0x00cc
            boolean r14 = r6.getSkipping()
            if (r14 != 0) goto L_0x00c3
            goto L_0x00cc
        L_0x00c3:
            r6.skipToGroupEnd()
            r0 = r6
            r4 = r10
            r5 = r12
            r6 = r13
            goto L_0x02ff
        L_0x00cc:
            r6.startDefaults()
            r14 = r8 & 1
            r33 = -458753(0xfffffffffff8ffff, float:NaN)
            r34 = 1
            if (r14 == 0) goto L_0x00f2
            boolean r14 = r6.getDefaultsInvalid()
            if (r14 == 0) goto L_0x00df
            goto L_0x00f2
        L_0x00df:
            r6.skipToGroupEnd()
            r2 = r44 & 32
            if (r2 == 0) goto L_0x00e8
            r1 = r1 & r33
        L_0x00e8:
            r9 = r1
            r15 = r3
            r17 = r10
            r35 = r12
        L_0x00ee:
            r30 = r13
            goto L_0x0156
        L_0x00f2:
            if (r2 == 0) goto L_0x00f7
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x00f8
        L_0x00f7:
            r2 = r3
        L_0x00f8:
            if (r9 == 0) goto L_0x00fd
            r3 = r34
            goto L_0x00fe
        L_0x00fd:
            r3 = r10
        L_0x00fe:
            if (r11 == 0) goto L_0x0121
            r9 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r6.startReplaceableGroup(r9)
            java.lang.Object r9 = r6.rememberedValue()
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r10 = r10.getEmpty()
            if (r9 != r10) goto L_0x0119
            androidx.compose.foundation.interaction.MutableInteractionSource r9 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r6.updateRememberedValue(r9)
        L_0x0119:
            r6.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r9 = (androidx.compose.foundation.interaction.MutableInteractionSource) r9
            r35 = r9
            goto L_0x0123
        L_0x0121:
            r35 = r12
        L_0x0123:
            r9 = r44 & 32
            if (r9 == 0) goto L_0x0151
            androidx.compose.material.SwitchDefaults r9 = androidx.compose.material.SwitchDefaults.INSTANCE
            r10 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r29 = 0
            r30 = 6
            r31 = 1023(0x3ff, float:1.434E-42)
            r28 = r6
            androidx.compose.material.SwitchColors r9 = r9.m34151colorsSQMK_m0(r10, r12, r14, r15, r17, r19, r20, r22, r24, r26, r28, r29, r30, r31)
            r1 = r1 & r33
            r15 = r2
            r17 = r3
            r30 = r9
            r9 = r1
            goto L_0x0156
        L_0x0151:
            r9 = r1
            r15 = r2
            r17 = r3
            goto L_0x00ee
        L_0x0156:
            r6.endDefaults()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x0165
            r1 = -1
            java.lang.String r2 = "androidx.compose.material.Switch (Switch.kt:88)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r9, r1, r2)
        L_0x0165:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r0 = r6.consume(r0)
            androidx.compose.ui.unit.Density r0 = (androidx.compose.p002ui.unit.Density) r0
            float r1 = ThumbPathLength
            float r10 = r0.m38449toPx0680j_4(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r36)
            if (r7 != 0) goto L_0x017f
            androidx.compose.material.SwitchKt$Switch$swipeableState$1 r0 = androidx.compose.material.SwitchKt$Switch$swipeableState$1.INSTANCE
            r2 = r0
            goto L_0x0180
        L_0x017f:
            r2 = r7
        L_0x0180:
            androidx.compose.animation.core.TweenSpec<java.lang.Float> r3 = AnimationSpec
            r0 = r9 & 14
            r0 = r0 | 384(0x180, float:5.38E-43)
            r11 = 0
            r4 = r6
            r12 = r5
            r5 = r0
            r14 = r6
            r6 = r11
            androidx.compose.material.SwipeableState r11 = androidx.compose.material.SwipeableKt.rememberSwipeableStateFor(r1, r2, r3, r4, r5, r6)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r0 = r14.consume(r0)
            androidx.compose.ui.unit.LayoutDirection r1 = androidx.compose.p002ui.unit.LayoutDirection.Rtl
            r13 = 0
            if (r0 != r1) goto L_0x01a0
            r23 = r34
            goto L_0x01a2
        L_0x01a0:
            r23 = r13
        L_0x01a2:
            if (r7 == 0) goto L_0x01be
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            androidx.compose.ui.semantics.Role$Companion r1 = androidx.compose.p002ui.semantics.Role.Companion
            int r1 = r1.m37819getSwitcho7Vup1c()
            r3 = 0
            androidx.compose.ui.semantics.Role r5 = androidx.compose.p002ui.semantics.Role.m37807boximpl(r1)
            r1 = r36
            r2 = r35
            r4 = r17
            r6 = r37
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.selection.ToggleableKt.m33591toggleableO2vRcR0(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01c0
        L_0x01be:
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
        L_0x01c0:
            if (r7 == 0) goto L_0x01c9
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.p002ui.Modifier.Companion
            androidx.compose.ui.Modifier r1 = androidx.compose.material.InteractiveComponentSizeKt.minimumInteractiveComponentSize(r1)
            goto L_0x01cb
        L_0x01c9:
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.p002ui.Modifier.Companion
        L_0x01cb:
            androidx.compose.ui.Modifier r1 = r15.then(r1)
            androidx.compose.ui.Modifier r18 = r1.then(r0)
            ef.l[] r0 = new p336ef.C11906l[r12]
            r1 = 0
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            ef.l r1 = p336ef.C11915r.m25707a(r1, r2)
            r0[r13] = r1
            java.lang.Float r1 = java.lang.Float.valueOf(r10)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            ef.l r1 = p336ef.C11915r.m25707a(r1, r2)
            r0[r34] = r1
            java.util.Map r20 = kotlin.collections.C12716r0.m28419j(r0)
            androidx.compose.foundation.gestures.Orientation r21 = androidx.compose.foundation.gestures.Orientation.Horizontal
            if (r17 == 0) goto L_0x01fb
            if (r7 == 0) goto L_0x01fb
            r22 = r34
            goto L_0x01fd
        L_0x01fb:
            r22 = r13
        L_0x01fd:
            androidx.compose.material.SwitchKt$Switch$2 r25 = androidx.compose.material.SwitchKt$Switch$2.INSTANCE
            r26 = 0
            r27 = 0
            r28 = 256(0x100, float:3.59E-43)
            r29 = 0
            r19 = r11
            r24 = r35
            androidx.compose.ui.Modifier r0 = androidx.compose.material.SwipeableKt.m34140swipeablepPrIpRY$default(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            androidx.compose.ui.Alignment$Companion r1 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment r2 = r1.getCenter()
            r3 = 0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(r0, r2, r13, r12, r3)
            float r2 = DefaultSwitchPadding
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.PaddingKt.m33268padding3ABfNKs(r0, r2)
            float r2 = SwitchWidth
            float r3 = SwitchHeight
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.m33332requiredSizeVpY3zN4(r0, r2, r3)
            r2 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r14.startReplaceableGroup(r2)
            androidx.compose.ui.Alignment r1 = r1.getTopStart()
            androidx.compose.ui.layout.MeasurePolicy r1 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r1, r13, r14, r13)
            r2 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r14.startReplaceableGroup(r2)
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r2 = r14.consume(r2)
            androidx.compose.ui.unit.Density r2 = (androidx.compose.p002ui.unit.Density) r2
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r3 = r14.consume(r3)
            androidx.compose.ui.unit.LayoutDirection r3 = (androidx.compose.p002ui.unit.LayoutDirection) r3
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r4 = r14.consume(r4)
            androidx.compose.ui.platform.ViewConfiguration r4 = (androidx.compose.p002ui.platform.ViewConfiguration) r4
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.p002ui.node.ComposeUiNode.Companion
            of.a r6 = r5.getConstructor()
            of.p r0 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r0)
            androidx.compose.runtime.Applier r10 = r14.getApplier()
            boolean r10 = r10 instanceof androidx.compose.runtime.Applier
            if (r10 != 0) goto L_0x026f
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x026f:
            r14.startReusableNode()
            boolean r10 = r14.getInserting()
            if (r10 == 0) goto L_0x027c
            r14.createNode(r6)
            goto L_0x027f
        L_0x027c:
            r14.useNode()
        L_0x027f:
            r14.disableReusing()
            androidx.compose.runtime.Composer r6 = androidx.compose.runtime.Updater.m35292constructorimpl(r14)
            of.o r10 = r5.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r6, r1, r10)
            of.o r1 = r5.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r6, r2, r1)
            of.o r1 = r5.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r6, r3, r1)
            of.o r1 = r5.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r6, r4, r1)
            r14.enableReusing()
            androidx.compose.runtime.Composer r1 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r14)
            androidx.compose.runtime.SkippableUpdater r1 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r0.invoke(r1, r14, r2)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r14.startReplaceableGroup(r0)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            androidx.compose.runtime.State r13 = r11.getOffset()
            int r1 = r9 << 3
            r2 = r1 & 112(0x70, float:1.57E-43)
            r3 = 6
            r2 = r2 | r3
            int r4 = r9 >> 3
            r4 = r4 & 896(0x380, float:1.256E-42)
            r2 = r2 | r4
            int r3 = r9 >> 6
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            r1 = r1 & r32
            r16 = r2 | r1
            r9 = r0
            r10 = r36
            r11 = r17
            r12 = r30
            r0 = r14
            r14 = r35
            r2 = r15
            r15 = r0
            SwitchImpl(r9, r10, r11, r12, r13, r14, r15, r16)
            r0.endReplaceableGroup()
            r0.endNode()
            r0.endReplaceableGroup()
            r0.endReplaceableGroup()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x02f8
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x02f8:
            r3 = r2
            r4 = r17
            r6 = r30
            r5 = r35
        L_0x02ff:
            androidx.compose.runtime.ScopeUpdateScope r9 = r0.endRestartGroup()
            if (r9 != 0) goto L_0x0306
            goto L_0x0317
        L_0x0306:
            androidx.compose.material.SwitchKt$Switch$4 r10 = new androidx.compose.material.SwitchKt$Switch$4
            r0 = r10
            r1 = r36
            r2 = r37
            r7 = r43
            r8 = r44
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.updateScope(r10)
        L_0x0317:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwitchKt.Switch(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.SwitchColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void SwitchImpl(BoxScope boxScope, boolean z, boolean z2, SwitchColors switchColors, State<Float> state, InteractionSource interactionSource, Composer composer, int i) {
        int i2;
        float f;
        long j;
        Modifier.Companion companion;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        BoxScope boxScope2 = boxScope;
        boolean z3 = z;
        boolean z4 = z2;
        SwitchColors switchColors2 = switchColors;
        State<Float> state2 = state;
        InteractionSource interactionSource2 = interactionSource;
        int i9 = i;
        Composer startRestartGroup = composer.startRestartGroup(-1834839253);
        if ((i9 & 14) == 0) {
            if (startRestartGroup.changed((Object) boxScope2)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i9;
        } else {
            i2 = i9;
        }
        if ((i9 & 112) == 0) {
            if (startRestartGroup.changed(z3)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i9 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 0) {
            if (startRestartGroup.changed(z4)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        }
        if ((i9 & 7168) == 0) {
            if (startRestartGroup.changed((Object) switchColors2)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((57344 & i9) == 0) {
            if (startRestartGroup.changed((Object) state2)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((458752 & i9) == 0) {
            if (startRestartGroup.changed((Object) interactionSource2)) {
                i3 = 131072;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        if ((374491 & i2) != 74898 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1834839253, i2, -1, "androidx.compose.material.SwitchImpl (Switch.kt:177)");
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.Companion;
            if (rememberedValue == companion2.getEmpty()) {
                rememberedValue = SnapshotStateKt.mutableStateListOf();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue;
            int i10 = (i2 >> 15) & 14;
            startRestartGroup.startReplaceableGroup(511388516);
            boolean changed = startRestartGroup.changed((Object) interactionSource2) | startRestartGroup.changed((Object) snapshotStateList);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == companion2.getEmpty()) {
                rememberedValue2 = new SwitchKt$SwitchImpl$1$1(interactionSource2, snapshotStateList, (C12074d<? super SwitchKt$SwitchImpl$1$1>) null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect((Object) interactionSource2, (C13088o<? super C13995l0, ? super C12074d<? super C11921v>, ? extends Object>) (C13088o) rememberedValue2, startRestartGroup, i10 | 64);
            if (!snapshotStateList.isEmpty()) {
                f = ThumbPressedElevation;
            } else {
                f = ThumbDefaultElevation;
            }
            float f2 = f;
            int i11 = ((i2 >> 6) & 14) | (i2 & 112) | ((i2 >> 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH);
            State<Color> trackColor = switchColors2.trackColor(z4, z3, startRestartGroup, i11);
            Modifier.Companion companion3 = Modifier.Companion;
            Alignment.Companion companion4 = Alignment.Companion;
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(boxScope2.align(companion3, companion4.getCenter()), 0.0f, 1, (Object) null);
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed2 = startRestartGroup.changed((Object) trackColor);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue3 == companion2.getEmpty()) {
                rememberedValue3 = new SwitchKt$SwitchImpl$2$1(trackColor);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(fillMaxSize$default, (Function1) rememberedValue3, startRestartGroup, 0);
            State<Color> thumbColor = switchColors2.thumbColor(z4, z3, startRestartGroup, i11);
            ElevationOverlay elevationOverlay = (ElevationOverlay) startRestartGroup.consume(ElevationOverlayKt.getLocalElevationOverlay());
            float r11 = C1232Dp.m38468constructorimpl(((C1232Dp) startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m38482unboximpl() + f2);
            startRestartGroup.startReplaceableGroup(-539245302);
            Modifier.Companion companion5 = companion3;
            if (!Color.m35672equalsimpl0(SwitchImpl$lambda$7(thumbColor), MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m33956getSurface0d7_KjU()) || elevationOverlay == null) {
                companion = companion5;
                j = SwitchImpl$lambda$7(thumbColor);
            } else {
                companion = companion5;
                j = elevationOverlay.m34011apply7g2Lkgo(SwitchImpl$lambda$7(thumbColor), r11, startRestartGroup, 0);
            }
            long j2 = j;
            startRestartGroup.endReplaceableGroup();
            Modifier align = boxScope2.align(companion, companion4.getCenterStart());
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed3 = startRestartGroup.changed((Object) state2);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue4 == companion2.getEmpty()) {
                rememberedValue4 = new SwitchKt$SwitchImpl$3$1(state2);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceableGroup();
            SpacerKt.Spacer(BackgroundKt.m32956backgroundbw27NRU(ShadowKt.m35337shadows4CzXII$default(SizeKt.m33330requiredSize3ABfNKs(IndicationKt.indication(OffsetKt.offset(align, (Function1) rememberedValue4), interactionSource2, RippleKt.m34235rememberRipple9IZ8Weo(false, ThumbRippleRadius, 0, startRestartGroup, 54, 4)), ThumbDiameter), f2, RoundedCornerShapeKt.getCircleShape(), false, 0, 0, 24, (Object) null), j2, RoundedCornerShapeKt.getCircleShape()), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SwitchKt$SwitchImpl$4(boxScope, z, z2, switchColors, state, interactionSource, i));
        }
    }

    /* access modifiers changed from: private */
    public static final long SwitchImpl$lambda$5(State<Color> state) {
        return state.getValue().m35681unboximpl();
    }

    private static final long SwitchImpl$lambda$7(State<Color> state) {
        return state.getValue().m35681unboximpl();
    }

    /* access modifiers changed from: private */
    /* renamed from: drawTrack-RPmYEkk  reason: not valid java name */
    public static final void m34153drawTrackRPmYEkk(DrawScope drawScope, long j, float f, float f2) {
        float f3 = f2 / ((float) 2);
        DrawScope.m36242drawLineNGM6Ib0$default(drawScope, j, androidx.compose.p002ui.geometry.OffsetKt.Offset(f3, Offset.m35423getYimpl(drawScope.m36273getCenterF1C5BW0())), androidx.compose.p002ui.geometry.OffsetKt.Offset(f - f3, Offset.m35423getYimpl(drawScope.m36273getCenterF1C5BW0())), f2, StrokeCap.Companion.m36055getRoundKaPHkGw(), (PathEffect) null, 0.0f, (ColorFilter) null, 0, 480, (Object) null);
    }

    public static final float getThumbDiameter() {
        return ThumbDiameter;
    }

    public static final float getTrackStrokeWidth() {
        return TrackStrokeWidth;
    }

    public static final float getTrackWidth() {
        return TrackWidth;
    }
}
