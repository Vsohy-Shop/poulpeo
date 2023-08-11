package androidx.compose.material3;

import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.p002ui.layout.LayoutKt;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.node.ComposeUiNode;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: Switch.kt */
public final class SwitchKt {
    /* access modifiers changed from: private */
    public static final TweenSpec<Float> AnimationSpec = new TweenSpec(100, 0, (Easing) null, 6, (DefaultConstructorMarker) null);
    private static final float SwitchHeight;
    private static final float SwitchWidth;
    private static final float ThumbDiameter;
    private static final float ThumbPadding;
    private static final float ThumbPathLength;
    private static final float UncheckedThumbDiameter;

    static {
        SwitchTokens switchTokens = SwitchTokens.INSTANCE;
        float r1 = switchTokens.m35191getSelectedHandleWidthD9Ej5fM();
        ThumbDiameter = r1;
        UncheckedThumbDiameter = switchTokens.m35198getUnselectedHandleWidthD9Ej5fM();
        float r2 = switchTokens.m35196getTrackWidthD9Ej5fM();
        SwitchWidth = r2;
        float r0 = switchTokens.m35194getTrackHeightD9Ej5fM();
        SwitchHeight = r0;
        float r02 = C1232Dp.m38468constructorimpl(C1232Dp.m38468constructorimpl(r0 - r1) / ((float) 2));
        ThumbPadding = r02;
        ThumbPathLength = C1232Dp.m38468constructorimpl(C1232Dp.m38468constructorimpl(r2 - r1) - r02);
    }

    /* JADX WARNING: Removed duplicated region for block: B:147:0x03cf  */
    /* JADX WARNING: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00ee  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void Switch(boolean r52, kotlin.jvm.functions.Function1<? super java.lang.Boolean, p336ef.C11921v> r53, androidx.compose.p002ui.Modifier r54, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r55, boolean r56, androidx.compose.material3.SwitchColors r57, androidx.compose.foundation.interaction.MutableInteractionSource r58, androidx.compose.runtime.Composer r59, int r60, int r61) {
        /*
            r7 = r53
            r8 = r60
            r0 = 1580463220(0x5e33f474, float:3.24177919E18)
            r1 = r59
            androidx.compose.runtime.Composer r6 = r1.startRestartGroup(r0)
            r1 = r61 & 1
            if (r1 == 0) goto L_0x0016
            r1 = r8 | 6
            r4 = r52
            goto L_0x0028
        L_0x0016:
            r1 = r8 & 14
            r4 = r52
            if (r1 != 0) goto L_0x0027
            boolean r1 = r6.changed((boolean) r4)
            if (r1 == 0) goto L_0x0024
            r1 = 4
            goto L_0x0025
        L_0x0024:
            r1 = 2
        L_0x0025:
            r1 = r1 | r8
            goto L_0x0028
        L_0x0027:
            r1 = r8
        L_0x0028:
            r2 = r61 & 2
            if (r2 == 0) goto L_0x002f
            r1 = r1 | 48
            goto L_0x003f
        L_0x002f:
            r2 = r8 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x003f
            boolean r2 = r6.changed((java.lang.Object) r7)
            if (r2 == 0) goto L_0x003c
            r2 = 32
            goto L_0x003e
        L_0x003c:
            r2 = 16
        L_0x003e:
            r1 = r1 | r2
        L_0x003f:
            r2 = r61 & 4
            if (r2 == 0) goto L_0x0046
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0059
        L_0x0046:
            r3 = r8 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0059
            r3 = r54
            boolean r9 = r6.changed((java.lang.Object) r3)
            if (r9 == 0) goto L_0x0055
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0057
        L_0x0055:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0057:
            r1 = r1 | r9
            goto L_0x005b
        L_0x0059:
            r3 = r54
        L_0x005b:
            r9 = r61 & 8
            if (r9 == 0) goto L_0x0062
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0075
        L_0x0062:
            r10 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x0075
            r10 = r55
            boolean r11 = r6.changed((java.lang.Object) r10)
            if (r11 == 0) goto L_0x0071
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0073
        L_0x0071:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0073:
            r1 = r1 | r11
            goto L_0x0077
        L_0x0075:
            r10 = r55
        L_0x0077:
            r11 = r61 & 16
            if (r11 == 0) goto L_0x007e
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0093
        L_0x007e:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r8
            if (r12 != 0) goto L_0x0093
            r12 = r56
            boolean r13 = r6.changed((boolean) r12)
            if (r13 == 0) goto L_0x008f
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0091
        L_0x008f:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0091:
            r1 = r1 | r13
            goto L_0x0095
        L_0x0093:
            r12 = r56
        L_0x0095:
            r46 = 458752(0x70000, float:6.42848E-40)
            r13 = r8 & r46
            if (r13 != 0) goto L_0x00b0
            r13 = r61 & 32
            if (r13 != 0) goto L_0x00aa
            r13 = r57
            boolean r14 = r6.changed((java.lang.Object) r13)
            if (r14 == 0) goto L_0x00ac
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ae
        L_0x00aa:
            r13 = r57
        L_0x00ac:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00ae:
            r1 = r1 | r14
            goto L_0x00b2
        L_0x00b0:
            r13 = r57
        L_0x00b2:
            r47 = r61 & 64
            r48 = 3670016(0x380000, float:5.142788E-39)
            if (r47 == 0) goto L_0x00bc
            r14 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r14
            goto L_0x00cf
        L_0x00bc:
            r14 = r8 & r48
            if (r14 != 0) goto L_0x00cf
            r14 = r58
            boolean r15 = r6.changed((java.lang.Object) r14)
            if (r15 == 0) goto L_0x00cb
            r15 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cd
        L_0x00cb:
            r15 = 524288(0x80000, float:7.34684E-40)
        L_0x00cd:
            r1 = r1 | r15
            goto L_0x00d1
        L_0x00cf:
            r14 = r58
        L_0x00d1:
            r15 = 2995931(0x2db6db, float:4.198194E-39)
            r15 = r15 & r1
            r5 = 599186(0x92492, float:8.39638E-40)
            if (r15 != r5) goto L_0x00ee
            boolean r5 = r6.getSkipping()
            if (r5 != 0) goto L_0x00e1
            goto L_0x00ee
        L_0x00e1:
            r6.skipToGroupEnd()
            r4 = r3
            r3 = r6
            r23 = r10
            r5 = r12
            r6 = r13
            r25 = r14
            goto L_0x03c8
        L_0x00ee:
            r6.startDefaults()
            r5 = r8 & 1
            r49 = -458753(0xfffffffffff8ffff, float:NaN)
            r15 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            if (r5 == 0) goto L_0x0119
            boolean r5 = r6.getDefaultsInvalid()
            if (r5 == 0) goto L_0x0102
            goto L_0x0119
        L_0x0102:
            r6.skipToGroupEnd()
            r2 = r61 & 32
            if (r2 == 0) goto L_0x010b
            r1 = r1 & r49
        L_0x010b:
            r9 = r1
            r23 = r10
            r50 = r12
            r24 = r13
            r25 = r14
            r3 = r15
            r15 = r54
            goto L_0x0193
        L_0x0119:
            if (r2 == 0) goto L_0x011e
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x0120
        L_0x011e:
            r2 = r54
        L_0x0120:
            if (r9 == 0) goto L_0x0124
            r5 = 0
            goto L_0x0125
        L_0x0124:
            r5 = r10
        L_0x0125:
            if (r11 == 0) goto L_0x012b
            r9 = 1
            r50 = r9
            goto L_0x012d
        L_0x012b:
            r50 = r12
        L_0x012d:
            r9 = r61 & 32
            if (r9 == 0) goto L_0x0164
            androidx.compose.material3.SwitchDefaults r9 = androidx.compose.material3.SwitchDefaults.INSTANCE
            r10 = 0
            r12 = 0
            r16 = 0
            r3 = r15
            r14 = r16
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r28 = 0
            r30 = 0
            r32 = 0
            r34 = 0
            r36 = 0
            r38 = 0
            r40 = 0
            r43 = 0
            r44 = 1572864(0x180000, float:2.204052E-39)
            r45 = 65535(0xffff, float:9.1834E-41)
            r42 = r6
            androidx.compose.material3.SwitchColors r9 = r9.m34618colorsV1nXRL4(r10, r12, r14, r16, r18, r20, r22, r24, r26, r28, r30, r32, r34, r36, r38, r40, r42, r43, r44, r45)
            r1 = r1 & r49
            goto L_0x0166
        L_0x0164:
            r3 = r15
            r9 = r13
        L_0x0166:
            if (r47 == 0) goto L_0x018b
            r6.startReplaceableGroup(r3)
            java.lang.Object r10 = r6.rememberedValue()
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r11 = r11.getEmpty()
            if (r10 != r11) goto L_0x017e
            androidx.compose.foundation.interaction.MutableInteractionSource r10 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r6.updateRememberedValue(r10)
        L_0x017e:
            r6.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r10 = (androidx.compose.foundation.interaction.MutableInteractionSource) r10
            r15 = r2
            r23 = r5
            r24 = r9
            r25 = r10
            goto L_0x0192
        L_0x018b:
            r25 = r58
            r15 = r2
            r23 = r5
            r24 = r9
        L_0x0192:
            r9 = r1
        L_0x0193:
            r6.endDefaults()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x01a2
            r1 = -1
            java.lang.String r2 = "androidx.compose.material3.Switch (Switch.kt:90)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r9, r1, r2)
        L_0x01a2:
            if (r23 != 0) goto L_0x01a7
            float r0 = UncheckedThumbDiameter
            goto L_0x01a9
        L_0x01a7:
            float r0 = ThumbDiameter
        L_0x01a9:
            r17 = r0
            float r10 = SwitchHeight
            float r0 = r10 - r17
            float r0 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r0)
            r1 = 2
            float r2 = (float) r1
            float r0 = r0 / r2
            float r14 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r0)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r0 = r6.consume(r0)
            androidx.compose.ui.unit.Density r0 = (androidx.compose.p002ui.unit.Density) r0
            float r0 = r0.m38449toPx0680j_4(r14)
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r1 = r6.consume(r1)
            androidx.compose.ui.unit.Density r1 = (androidx.compose.p002ui.unit.Density) r1
            float r13 = ThumbPathLength
            float r1 = r1.m38449toPx0680j_4(r13)
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            java.lang.Float r5 = java.lang.Float.valueOf(r1)
            r11 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r6.startReplaceableGroup(r11)
            boolean r2 = r6.changed((java.lang.Object) r2)
            boolean r5 = r6.changed((java.lang.Object) r5)
            r2 = r2 | r5
            java.lang.Object r5 = r6.rememberedValue()
            if (r2 != 0) goto L_0x01fd
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r5 != r2) goto L_0x0205
        L_0x01fd:
            androidx.compose.material3.SwitchKt$Switch$valueToOffset$1$1 r5 = new androidx.compose.material3.SwitchKt$Switch$valueToOffset$1$1
            r5.<init>(r1, r0)
            r6.updateRememberedValue(r5)
        L_0x0205:
            r6.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r52)
            java.lang.Object r1 = r5.invoke(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            r6.startReplaceableGroup(r3)
            java.lang.Object r2 = r6.rememberedValue()
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r11 = r5.getEmpty()
            if (r2 != r11) goto L_0x0232
            r2 = 0
            r11 = 0
            r12 = 2
            androidx.compose.animation.core.Animatable r2 = androidx.compose.animation.core.AnimatableKt.Animatable$default(r1, r2, r12, r11)
            r6.updateRememberedValue(r2)
            goto L_0x0234
        L_0x0232:
            r11 = 0
            r12 = 2
        L_0x0234:
            r6.endReplaceableGroup()
            androidx.compose.animation.core.Animatable r2 = (androidx.compose.animation.core.Animatable) r2
            r11 = 773894976(0x2e20b340, float:3.6538994E-11)
            r6.startReplaceableGroup(r11)
            r6.startReplaceableGroup(r3)
            java.lang.Object r3 = r6.rememberedValue()
            java.lang.Object r5 = r5.getEmpty()
            if (r3 != r5) goto L_0x025b
            hf.h r3 = p355hf.C12085h.f18916b
            yf.l0 r3 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(r3, r6)
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r5 = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller
            r5.<init>(r3)
            r6.updateRememberedValue(r5)
            r3 = r5
        L_0x025b:
            r6.endReplaceableGroup()
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r3 = (androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) r3
            yf.l0 r3 = r3.getCoroutineScope()
            r6.endReplaceableGroup()
            androidx.compose.material3.SwitchKt$Switch$2 r5 = new androidx.compose.material3.SwitchKt$Switch$2
            r5.<init>(r2, r0)
            r11 = 0
            androidx.compose.runtime.EffectsKt.SideEffect(r5, r6, r11)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r52)
            androidx.compose.material3.SwitchKt$Switch$3 r5 = new androidx.compose.material3.SwitchKt$Switch$3
            r5.<init>(r2, r1, r3)
            r1 = r9 & 14
            androidx.compose.runtime.EffectsKt.DisposableEffect((java.lang.Object) r0, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) r5, (androidx.compose.runtime.Composer) r6, (int) r1)
            if (r7 == 0) goto L_0x029f
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            androidx.compose.ui.semantics.Role$Companion r1 = androidx.compose.p002ui.semantics.Role.Companion
            int r1 = r1.m37819getSwitcho7Vup1c()
            r3 = 0
            androidx.compose.ui.semantics.Role r5 = androidx.compose.p002ui.semantics.Role.m37807boximpl(r1)
            r1 = r52
            r16 = r2
            r2 = r25
            r12 = 0
            r4 = r50
            r51 = r6
            r6 = r53
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.selection.ToggleableKt.m33591toggleableO2vRcR0(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x02a6
        L_0x029f:
            r16 = r2
            r51 = r6
            r12 = 0
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
        L_0x02a6:
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.p002ui.Modifier.Companion
            if (r7 == 0) goto L_0x02ae
            androidx.compose.ui.Modifier r1 = androidx.compose.material3.TouchTargetKt.minimumTouchTargetSize(r1)
        L_0x02ae:
            androidx.compose.ui.Modifier r1 = r15.then(r1)
            androidx.compose.ui.Modifier r0 = r1.then(r0)
            androidx.compose.ui.Alignment$Companion r1 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment r2 = r1.getCenter()
            r3 = 2
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(r0, r2, r11, r3, r12)
            float r2 = SwitchWidth
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.m33332requiredSizeVpY3zN4(r0, r2, r10)
            r2 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r3 = r51
            r3.startReplaceableGroup(r2)
            androidx.compose.ui.Alignment r1 = r1.getTopStart()
            androidx.compose.ui.layout.MeasurePolicy r1 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r1, r11, r3, r11)
            r2 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r3.startReplaceableGroup(r2)
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r2 = r3.consume(r2)
            androidx.compose.ui.unit.Density r2 = (androidx.compose.p002ui.unit.Density) r2
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r4 = r3.consume(r4)
            androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.p002ui.unit.LayoutDirection) r4
            androidx.compose.runtime.ProvidableCompositionLocal r5 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r5 = r3.consume(r5)
            androidx.compose.ui.platform.ViewConfiguration r5 = (androidx.compose.p002ui.platform.ViewConfiguration) r5
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.p002ui.node.ComposeUiNode.Companion
            of.a r10 = r6.getConstructor()
            of.p r0 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r0)
            androidx.compose.runtime.Applier r12 = r3.getApplier()
            boolean r12 = r12 instanceof androidx.compose.runtime.Applier
            if (r12 != 0) goto L_0x0310
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x0310:
            r3.startReusableNode()
            boolean r12 = r3.getInserting()
            if (r12 == 0) goto L_0x031d
            r3.createNode(r10)
            goto L_0x0320
        L_0x031d:
            r3.useNode()
        L_0x0320:
            r3.disableReusing()
            androidx.compose.runtime.Composer r10 = androidx.compose.runtime.Updater.m35292constructorimpl(r3)
            of.o r12 = r6.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r10, r1, r12)
            of.o r1 = r6.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r10, r2, r1)
            of.o r1 = r6.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r10, r4, r1)
            of.o r1 = r6.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r10, r5, r1)
            r3.enableReusing()
            androidx.compose.runtime.Composer r1 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r3)
            androidx.compose.runtime.SkippableUpdater r1 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r0.invoke(r1, r3, r2)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r3.startReplaceableGroup(r0)
            r0 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r3.startReplaceableGroup(r0)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            r1 = 1204996270(0x47d2c8ae, float:107921.36)
            r3.startReplaceableGroup(r1)
            androidx.compose.runtime.State r1 = r16.asState()
            androidx.compose.material3.tokens.SwitchTokens r2 = androidx.compose.material3.tokens.SwitchTokens.INSTANCE
            androidx.compose.material3.tokens.ShapeKeyTokens r2 = r2.getHandleShape()
            r4 = 6
            androidx.compose.ui.graphics.Shape r16 = androidx.compose.material3.ShapesKt.toShape(r2, r3, r4)
            int r2 = r9 << 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            r2 = r2 | r4
            int r4 = r9 >> 6
            r5 = r4 & 896(0x380, float:1.256E-42)
            r2 = r2 | r5
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r4
            int r4 = r9 << 6
            r4 = r4 & r46
            r2 = r2 | r4
            r4 = r9 & r48
            r21 = r2 | r4
            r22 = 6
            r9 = r0
            r10 = r52
            r11 = r50
            r12 = r24
            r0 = r13
            r13 = r1
            r1 = r14
            r14 = r23
            r2 = r15
            r15 = r25
            r18 = r1
            r19 = r0
            r20 = r3
            m34620SwitchImpl0DmnUew(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r3.endReplaceableGroup()
            r3.endReplaceableGroup()
            r3.endReplaceableGroup()
            r3.endNode()
            r3.endReplaceableGroup()
            r3.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x03c3
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x03c3:
            r4 = r2
            r6 = r24
            r5 = r50
        L_0x03c8:
            androidx.compose.runtime.ScopeUpdateScope r10 = r3.endRestartGroup()
            if (r10 != 0) goto L_0x03cf
            goto L_0x03e5
        L_0x03cf:
            androidx.compose.material3.SwitchKt$Switch$5 r11 = new androidx.compose.material3.SwitchKt$Switch$5
            r0 = r11
            r1 = r52
            r2 = r53
            r3 = r4
            r4 = r23
            r7 = r25
            r8 = r60
            r9 = r61
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.updateScope(r11)
        L_0x03e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwitchKt.Switch(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, of.o, boolean, androidx.compose.material3.SwitchColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @Composable
    /* renamed from: SwitchImpl-0DmnUew  reason: not valid java name */
    public static final void m34620SwitchImpl0DmnUew(BoxScope boxScope, boolean z, boolean z2, SwitchColors switchColors, State<Float> state, C13088o<? super Composer, ? super Integer, C11921v> oVar, InteractionSource interactionSource, Shape shape, float f, float f2, float f3, Composer composer, int i, int i2) {
        int i3;
        int i4;
        float f4;
        float f5;
        float f6;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        BoxScope boxScope2 = boxScope;
        boolean z3 = z;
        boolean z4 = z2;
        SwitchColors switchColors2 = switchColors;
        C13088o<? super Composer, ? super Integer, C11921v> oVar2 = oVar;
        InteractionSource interactionSource2 = interactionSource;
        Shape shape2 = shape;
        float f7 = f;
        float f8 = f2;
        float f9 = f3;
        int i16 = i;
        Composer startRestartGroup = composer.startRestartGroup(-1968109941);
        if ((i16 & 14) == 0) {
            if (startRestartGroup.changed((Object) boxScope2)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i3 = i15 | i16;
        } else {
            i3 = i16;
        }
        if ((i16 & 112) == 0) {
            if (startRestartGroup.changed(z3)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i3 |= i14;
        }
        if ((i16 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 0) {
            if (startRestartGroup.changed(z4)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i3 |= i13;
        }
        if ((i16 & 7168) == 0) {
            if (startRestartGroup.changed((Object) switchColors2)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i3 |= i12;
        }
        if ((57344 & i16) == 0) {
            if (startRestartGroup.changed((Object) state)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i3 |= i11;
        } else {
            State<Float> state2 = state;
        }
        if ((i16 & 458752) == 0) {
            if (startRestartGroup.changed((Object) oVar2)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i3 |= i10;
        }
        if ((i16 & 3670016) == 0) {
            if (startRestartGroup.changed((Object) interactionSource2)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i3 |= i9;
        }
        if ((i16 & 29360128) == 0) {
            if (startRestartGroup.changed((Object) shape2)) {
                i8 = 8388608;
            } else {
                i8 = 4194304;
            }
            i3 |= i8;
        }
        if ((i16 & 234881024) == 0) {
            if (startRestartGroup.changed(f7)) {
                i7 = 67108864;
            } else {
                i7 = 33554432;
            }
            i3 |= i7;
        }
        if ((i16 & 1879048192) == 0) {
            if (startRestartGroup.changed(f8)) {
                i6 = 536870912;
            } else {
                i6 = 268435456;
            }
            i3 |= i6;
        }
        if ((i2 & 14) == 0) {
            if (startRestartGroup.changed(f9)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i4 = i2 | i5;
        } else {
            i4 = i2;
        }
        if ((i3 & 1533916891) == 306783378 && (i4 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            InteractionSource interactionSource3 = interactionSource2;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1968109941, i3, i4, "androidx.compose.material3.SwitchImpl (Switch.kt:171)");
            }
            int i17 = ((i3 >> 6) & 14) | (i3 & 112) | ((i3 >> 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH);
            State<Color> trackColor$material3_release = switchColors2.trackColor$material3_release(z4, z3, startRestartGroup, i17);
            State<Boolean> collectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(interactionSource2, startRestartGroup, (i3 >> 18) & 14);
            int i18 = i3;
            float r13 = ((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).m38445toDpu2uoSUM(state.getValue().floatValue());
            if (m34623SwitchImpl_0DmnUew$lambda7(collectIsPressedAsState)) {
                f4 = SwitchTokens.INSTANCE.m35189getPressedHandleWidthD9Ej5fM();
            } else {
                f4 = C1232Dp.m38468constructorimpl(C1232Dp.m38468constructorimpl(C1232Dp.m38468constructorimpl(ThumbDiameter - f7) * (C1232Dp.m38468constructorimpl(r13 - f8) / C1232Dp.m38468constructorimpl(f9 - f8))) + f7);
            }
            float f10 = f4;
            startRestartGroup.startReplaceableGroup(-993794194);
            if (m34623SwitchImpl_0DmnUew$lambda7(collectIsPressedAsState)) {
                Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                if (z3) {
                    f6 = C1232Dp.m38468constructorimpl(ThumbPathLength - SwitchTokens.INSTANCE.m35195getTrackOutlineWidthD9Ej5fM());
                } else {
                    f6 = SwitchTokens.INSTANCE.m35195getTrackOutlineWidthD9Ej5fM();
                }
                f5 = density.m38449toPx0680j_4(f6);
            } else {
                f5 = state.getValue().floatValue();
            }
            startRestartGroup.endReplaceableGroup();
            SwitchTokens switchTokens = SwitchTokens.INSTANCE;
            Shape shape3 = ShapesKt.toShape(switchTokens.getTrackShape(), startRestartGroup, 6);
            Modifier.Companion companion = Modifier.Companion;
            Alignment.Companion companion2 = Alignment.Companion;
            Modifier r1 = BackgroundKt.m32956backgroundbw27NRU(BorderKt.m32967borderxT4_qwU(SizeKt.m33324height3ABfNKs(SizeKt.m33343width3ABfNKs(boxScope2.align(companion, companion2.getCenter()), SwitchWidth), SwitchHeight), switchTokens.m35195getTrackOutlineWidthD9Ej5fM(), switchColors2.borderColor$material3_release(z4, z3, startRestartGroup, i17).getValue().m35681unboximpl(), shape3), m34622SwitchImpl_0DmnUew$lambda6(trackColor$material3_release), shape3);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            C13074a<ComposeUiNode> constructor = companion3.getConstructor();
            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(r1);
            float f11 = f10;
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
            Updater.m35299setimpl(r9, density2, companion3.getSetDensity());
            Updater.m35299setimpl(r9, layoutDirection, companion3.getSetLayoutDirection());
            Updater.m35299setimpl(r9, viewConfiguration, companion3.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(968687813);
            long r11 = m34621SwitchImpl_0DmnUew$lambda13$lambda10(switchColors2.thumbColor$material3_release(z4, z3, startRestartGroup, i17));
            Modifier align = boxScopeInstance.align(companion, companion2.getCenterStart());
            Float valueOf = Float.valueOf(f5);
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed = startRestartGroup.changed((Object) valueOf);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SwitchKt$SwitchImpl$1$1$1(f5);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            int i19 = i18;
            Modifier r6 = BackgroundKt.m32956backgroundbw27NRU(SizeKt.m33330requiredSize3ABfNKs(IndicationKt.indication(OffsetKt.offset(align, (Function1) rememberedValue), interactionSource, RippleKt.m34235rememberRipple9IZ8Weo(false, C1232Dp.m38468constructorimpl(switchTokens.m35193getStateLayerSizeD9Ej5fM() / ((float) 2)), 0, startRestartGroup, 54, 4)), f11), r11, shape2);
            Alignment center = companion2.getCenter();
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density3 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            C13074a<ComposeUiNode> constructor2 = companion3.getConstructor();
            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf2 = LayoutKt.materializerOf(r6);
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
            Composer r132 = Updater.m35292constructorimpl(startRestartGroup);
            Updater.m35299setimpl(r132, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m35299setimpl(r132, density3, companion3.getSetDensity());
            Updater.m35299setimpl(r132, layoutDirection2, companion3.getSetLayoutDirection());
            Updater.m35299setimpl(r132, viewConfiguration2, companion3.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            startRestartGroup.startReplaceableGroup(881862015);
            C13088o<? super Composer, ? super Integer, C11921v> oVar3 = oVar;
            if (oVar3 != null) {
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(switchColors2.iconColor$material3_release(z4, z3, startRestartGroup, i17).getValue())}, oVar3, startRestartGroup, ((i19 >> 12) & 112) | 8);
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SwitchKt$SwitchImpl$2(boxScope, z, z2, switchColors, state, oVar, interactionSource, shape, f, f2, f3, i, i2));
        }
    }

    /* renamed from: SwitchImpl_0DmnUew$lambda-13$lambda-10  reason: not valid java name */
    private static final long m34621SwitchImpl_0DmnUew$lambda13$lambda10(State<Color> state) {
        return state.getValue().m35681unboximpl();
    }

    /* renamed from: SwitchImpl_0DmnUew$lambda-6  reason: not valid java name */
    private static final long m34622SwitchImpl_0DmnUew$lambda6(State<Color> state) {
        return state.getValue().m35681unboximpl();
    }

    /* renamed from: SwitchImpl_0DmnUew$lambda-7  reason: not valid java name */
    private static final boolean m34623SwitchImpl_0DmnUew$lambda7(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    public static final float getThumbDiameter() {
        return ThumbDiameter;
    }

    public static final float getUncheckedThumbDiameter() {
        return UncheckedThumbDiameter;
    }
}
