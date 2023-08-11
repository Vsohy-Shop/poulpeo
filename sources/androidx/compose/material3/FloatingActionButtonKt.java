package androidx.compose.material3;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.unit.C1232Dp;
import kotlin.jvm.functions.Function1;

/* compiled from: FloatingActionButton.kt */
public final class FloatingActionButtonKt {
    /* access modifiers changed from: private */
    public static final ExitTransition ExtendedFabCollapseAnimation;
    /* access modifiers changed from: private */
    public static final float ExtendedFabEndIconPadding = C1232Dp.m38468constructorimpl((float) 12);
    /* access modifiers changed from: private */
    public static final EnterTransition ExtendedFabExpandAnimation;
    /* access modifiers changed from: private */
    public static final float ExtendedFabMinimumWidth = C1232Dp.m38468constructorimpl((float) 80);
    /* access modifiers changed from: private */
    public static final float ExtendedFabStartIconPadding = C1232Dp.m38468constructorimpl((float) 16);
    /* access modifiers changed from: private */
    public static final float ExtendedFabTextPadding = C1232Dp.m38468constructorimpl((float) 20);

    static {
        MotionTokens motionTokens = MotionTokens.INSTANCE;
        ExitTransition fadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, 0, motionTokens.getEasingLinearCubicBezier(), 2, (Object) null), 0.0f, 2, (Object) null);
        TweenSpec tween$default = AnimationSpecKt.tween$default(500, 0, motionTokens.getEasingEmphasizedCubicBezier(), 2, (Object) null);
        Alignment.Companion companion = Alignment.Companion;
        ExtendedFabCollapseAnimation = fadeOut$default.plus(EnterExitTransitionKt.shrinkHorizontally$default(tween$default, companion.getStart(), false, (Function1) null, 12, (Object) null));
        ExtendedFabExpandAnimation = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween(200, 100, motionTokens.getEasingLinearCubicBezier()), 0.0f, 2, (Object) null).plus(EnterExitTransitionKt.expandHorizontally$default(AnimationSpecKt.tween$default(500, 0, motionTokens.getEasingEmphasizedCubicBezier(), 2, (Object) null), companion.getStart(), false, (Function1) null, 12, (Object) null));
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0120  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* renamed from: ExtendedFloatingActionButton-ElI5-7k  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m34451ExtendedFloatingActionButtonElI57k(p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r31, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r32, p404of.C13074a<p336ef.C11921v> r33, androidx.compose.p002ui.Modifier r34, boolean r35, androidx.compose.p002ui.graphics.Shape r36, long r37, long r39, androidx.compose.material3.FloatingActionButtonElevation r41, androidx.compose.foundation.interaction.MutableInteractionSource r42, androidx.compose.runtime.Composer r43, int r44, int r45) {
        /*
            r1 = r31
            r2 = r32
            r0 = r33
            r15 = r44
            r14 = r45
            java.lang.String r3 = "text"
            kotlin.jvm.internal.C12775o.m28639i(r1, r3)
            java.lang.String r3 = "icon"
            kotlin.jvm.internal.C12775o.m28639i(r2, r3)
            java.lang.String r3 = "onClick"
            kotlin.jvm.internal.C12775o.m28639i(r0, r3)
            r3 = -1387401842(0xffffffffad4ded8e, float:-1.1705649E-11)
            r4 = r43
            androidx.compose.runtime.Composer r13 = r4.startRestartGroup(r3)
            r4 = r14 & 1
            if (r4 == 0) goto L_0x0029
            r4 = r15 | 6
            goto L_0x0039
        L_0x0029:
            r4 = r15 & 14
            if (r4 != 0) goto L_0x0038
            boolean r4 = r13.changed((java.lang.Object) r1)
            if (r4 == 0) goto L_0x0035
            r4 = 4
            goto L_0x0036
        L_0x0035:
            r4 = 2
        L_0x0036:
            r4 = r4 | r15
            goto L_0x0039
        L_0x0038:
            r4 = r15
        L_0x0039:
            r5 = r14 & 2
            if (r5 == 0) goto L_0x0040
            r4 = r4 | 48
            goto L_0x0050
        L_0x0040:
            r5 = r15 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0050
            boolean r5 = r13.changed((java.lang.Object) r2)
            if (r5 == 0) goto L_0x004d
            r5 = 32
            goto L_0x004f
        L_0x004d:
            r5 = 16
        L_0x004f:
            r4 = r4 | r5
        L_0x0050:
            r5 = r14 & 4
            if (r5 == 0) goto L_0x0057
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0057:
            r5 = r15 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0067
            boolean r5 = r13.changed((java.lang.Object) r0)
            if (r5 == 0) goto L_0x0064
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r4 = r4 | r5
        L_0x0067:
            r5 = r14 & 8
            if (r5 == 0) goto L_0x006e
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0081
        L_0x006e:
            r6 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x0081
            r6 = r34
            boolean r7 = r13.changed((java.lang.Object) r6)
            if (r7 == 0) goto L_0x007d
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r4 = r4 | r7
            goto L_0x0083
        L_0x0081:
            r6 = r34
        L_0x0083:
            r7 = r14 & 16
            r8 = 57344(0xe000, float:8.0356E-41)
            if (r7 == 0) goto L_0x008d
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a0
        L_0x008d:
            r9 = r15 & r8
            if (r9 != 0) goto L_0x00a0
            r9 = r35
            boolean r10 = r13.changed((boolean) r9)
            if (r10 == 0) goto L_0x009c
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009c:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r4 = r4 | r10
            goto L_0x00a2
        L_0x00a0:
            r9 = r35
        L_0x00a2:
            r10 = 458752(0x70000, float:6.42848E-40)
            r11 = r15 & r10
            if (r11 != 0) goto L_0x00bd
            r11 = r14 & 32
            if (r11 != 0) goto L_0x00b7
            r11 = r36
            boolean r12 = r13.changed((java.lang.Object) r11)
            if (r12 == 0) goto L_0x00b9
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bb
        L_0x00b7:
            r11 = r36
        L_0x00b9:
            r12 = 65536(0x10000, float:9.18355E-41)
        L_0x00bb:
            r4 = r4 | r12
            goto L_0x00bf
        L_0x00bd:
            r11 = r36
        L_0x00bf:
            r12 = 3670016(0x380000, float:5.142788E-39)
            r16 = r15 & r12
            if (r16 != 0) goto L_0x00d9
            r16 = r14 & 64
            r10 = r37
            if (r16 != 0) goto L_0x00d4
            boolean r16 = r13.changed((long) r10)
            if (r16 == 0) goto L_0x00d4
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d6
        L_0x00d4:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d6:
            r4 = r4 | r16
            goto L_0x00db
        L_0x00d9:
            r10 = r37
        L_0x00db:
            r16 = 29360128(0x1c00000, float:7.052966E-38)
            r16 = r15 & r16
            if (r16 != 0) goto L_0x00f5
            r12 = r14 & 128(0x80, float:1.794E-43)
            r8 = r39
            if (r12 != 0) goto L_0x00f0
            boolean r17 = r13.changed((long) r8)
            if (r17 == 0) goto L_0x00f0
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f2
        L_0x00f0:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f2:
            r4 = r4 | r17
            goto L_0x00f7
        L_0x00f5:
            r8 = r39
        L_0x00f7:
            r17 = 234881024(0xe000000, float:1.5777218E-30)
            r17 = r15 & r17
            if (r17 != 0) goto L_0x0113
            r12 = r14 & 256(0x100, float:3.59E-43)
            if (r12 != 0) goto L_0x010c
            r12 = r41
            boolean r18 = r13.changed((java.lang.Object) r12)
            if (r18 == 0) goto L_0x010e
            r18 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0110
        L_0x010c:
            r12 = r41
        L_0x010e:
            r18 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0110:
            r4 = r4 | r18
            goto L_0x0115
        L_0x0113:
            r12 = r41
        L_0x0115:
            r3 = r14 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x0120
            r19 = 805306368(0x30000000, float:4.656613E-10)
            r4 = r4 | r19
            r0 = r42
            goto L_0x0135
        L_0x0120:
            r19 = 1879048192(0x70000000, float:1.58456325E29)
            r19 = r15 & r19
            r0 = r42
            if (r19 != 0) goto L_0x0135
            boolean r19 = r13.changed((java.lang.Object) r0)
            if (r19 == 0) goto L_0x0131
            r19 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0133
        L_0x0131:
            r19 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0133:
            r4 = r4 | r19
        L_0x0135:
            r19 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r0 = r4 & r19
            r6 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r6) goto L_0x015e
            boolean r0 = r13.getSkipping()
            if (r0 != 0) goto L_0x0146
            goto L_0x015e
        L_0x0146:
            r13.skipToGroupEnd()
            r4 = r34
            r5 = r35
            r6 = r36
            r18 = r13
            r28 = r12
            r12 = r42
            r29 = r10
            r11 = r28
            r9 = r8
            r7 = r29
            goto L_0x02a3
        L_0x015e:
            r13.startDefaults()
            r0 = r15 & 1
            r19 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r20 = -3670017(0xffffffffffc7ffff, float:NaN)
            r21 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r0 == 0) goto L_0x01a2
            boolean r0 = r13.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0175
            goto L_0x01a2
        L_0x0175:
            r13.skipToGroupEnd()
            r0 = r14 & 32
            if (r0 == 0) goto L_0x017e
            r4 = r4 & r21
        L_0x017e:
            r0 = r14 & 64
            if (r0 == 0) goto L_0x0184
            r4 = r4 & r20
        L_0x0184:
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x018a
            r4 = r4 & r19
        L_0x018a:
            r0 = r14 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0192
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r4 = r4 & r0
        L_0x0192:
            r0 = r34
            r19 = r36
            r26 = r42
            r24 = r8
            r20 = r10
            r22 = r12
            r12 = r35
            goto L_0x0232
        L_0x01a2:
            if (r5 == 0) goto L_0x01a7
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x01a9
        L_0x01a7:
            r0 = r34
        L_0x01a9:
            if (r7 == 0) goto L_0x01ad
            r5 = 1
            goto L_0x01af
        L_0x01ad:
            r5 = r35
        L_0x01af:
            r7 = r14 & 32
            r6 = 6
            if (r7 == 0) goto L_0x01bd
            androidx.compose.material3.FloatingActionButtonDefaults r7 = androidx.compose.material3.FloatingActionButtonDefaults.INSTANCE
            androidx.compose.ui.graphics.Shape r7 = r7.getExtendedFabShape(r13, r6)
            r4 = r4 & r21
            goto L_0x01bf
        L_0x01bd:
            r7 = r36
        L_0x01bf:
            r21 = r14 & 64
            if (r21 == 0) goto L_0x01cb
            androidx.compose.material3.FloatingActionButtonDefaults r10 = androidx.compose.material3.FloatingActionButtonDefaults.INSTANCE
            long r10 = r10.getContainerColor(r13, r6)
            r4 = r4 & r20
        L_0x01cb:
            r6 = r14 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x01d9
            int r6 = r4 >> 18
            r6 = r6 & 14
            long r8 = androidx.compose.material3.ColorSchemeKt.m34359contentColorForek8zF_U(r10, r13, r6)
            r4 = r4 & r19
        L_0x01d9:
            r6 = r14 & 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x0203
            androidx.compose.material3.FloatingActionButtonDefaults r6 = androidx.compose.material3.FloatingActionButtonDefaults.INSTANCE
            r12 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r24 = 24576(0x6000, float:3.4438E-41)
            r25 = 15
            r34 = r6
            r35 = r12
            r36 = r19
            r37 = r20
            r38 = r21
            r39 = r13
            r40 = r24
            r41 = r25
            androidx.compose.material3.FloatingActionButtonElevation r6 = r34.m34448elevationxZ9QkE(r35, r36, r37, r38, r39, r40, r41)
            r12 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r4 = r4 & r12
            goto L_0x0204
        L_0x0203:
            r6 = r12
        L_0x0204:
            if (r3 == 0) goto L_0x0227
            r3 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r13.startReplaceableGroup(r3)
            java.lang.Object r3 = r13.rememberedValue()
            androidx.compose.runtime.Composer$Companion r12 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r12 = r12.getEmpty()
            if (r3 != r12) goto L_0x021f
            androidx.compose.foundation.interaction.MutableInteractionSource r3 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r13.updateRememberedValue(r3)
        L_0x021f:
            r13.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r3 = (androidx.compose.foundation.interaction.MutableInteractionSource) r3
            r26 = r3
            goto L_0x0229
        L_0x0227:
            r26 = r42
        L_0x0229:
            r12 = r5
            r22 = r6
            r19 = r7
            r24 = r8
            r20 = r10
        L_0x0232:
            r13.endDefaults()
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x0244
            r3 = -1
            java.lang.String r5 = "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:335)"
            r6 = -1387401842(0xffffffffad4ded8e, float:-1.1705649E-11)
            androidx.compose.runtime.ComposerKt.traceEventStart(r6, r4, r3, r5)
        L_0x0244:
            androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5 r3 = new androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5
            r3.<init>(r12, r2, r4, r1)
            r5 = 1172118032(0x45dd1a10, float:7075.258)
            r6 = 1
            androidx.compose.runtime.internal.ComposableLambda r18 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r13, r5, r6, r3)
            int r3 = r4 >> 6
            r5 = r3 & 14
            r6 = 12582912(0xc00000, float:1.7632415E-38)
            r5 = r5 | r6
            r3 = r3 & 112(0x70, float:1.57E-43)
            r3 = r3 | r5
            int r4 = r4 >> 9
            r5 = r4 & 896(0x380, float:1.256E-42)
            r3 = r3 | r5
            r5 = r4 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r5
            r5 = 57344(0xe000, float:8.0356E-41)
            r5 = r5 & r4
            r3 = r3 | r5
            r5 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r4
            r3 = r3 | r5
            r5 = 3670016(0x380000, float:5.142788E-39)
            r4 = r4 & r5
            r16 = r3 | r4
            r17 = 0
            r3 = r33
            r4 = r0
            r5 = r19
            r6 = r20
            r8 = r24
            r10 = r22
            r11 = r26
            r23 = r12
            r12 = r18
            r18 = r13
            r14 = r16
            r15 = r17
            m34453FloatingActionButtonXz6DiA(r3, r4, r5, r6, r8, r10, r11, r12, r13, r14, r15)
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x0296
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0296:
            r4 = r0
            r6 = r19
            r7 = r20
            r11 = r22
            r5 = r23
            r9 = r24
            r12 = r26
        L_0x02a3:
            androidx.compose.runtime.ScopeUpdateScope r15 = r18.endRestartGroup()
            if (r15 != 0) goto L_0x02aa
            goto L_0x02c1
        L_0x02aa:
            androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$6 r14 = new androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$6
            r0 = r14
            r1 = r31
            r2 = r32
            r3 = r33
            r13 = r44
            r27 = r14
            r14 = r45
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r11, r12, r13, r14)
            r0 = r27
            r15.updateScope(r0)
        L_0x02c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonKt.m34451ExtendedFloatingActionButtonElI57k(of.o, of.o, of.a, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.material3.FloatingActionButtonElevation, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:135:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0115  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* renamed from: ExtendedFloatingActionButton-X-z6DiA  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m34452ExtendedFloatingActionButtonXz6DiA(p404of.C13074a<p336ef.C11921v> r28, androidx.compose.p002ui.Modifier r29, androidx.compose.p002ui.graphics.Shape r30, long r31, long r33, androidx.compose.material3.FloatingActionButtonElevation r35, androidx.compose.foundation.interaction.MutableInteractionSource r36, p404of.C13089p<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r37, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            r13 = r28
            r14 = r37
            r15 = r39
            r12 = r40
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C12775o.m28639i(r13, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r14, r0)
            r0 = -326283107(0xffffffffec8d509d, float:-1.3667138E27)
            r1 = r38
            androidx.compose.runtime.Composer r11 = r1.startRestartGroup(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0022
            r1 = r15 | 6
            goto L_0x0032
        L_0x0022:
            r1 = r15 & 14
            if (r1 != 0) goto L_0x0031
            boolean r1 = r11.changed((java.lang.Object) r13)
            if (r1 == 0) goto L_0x002e
            r1 = 4
            goto L_0x002f
        L_0x002e:
            r1 = 2
        L_0x002f:
            r1 = r1 | r15
            goto L_0x0032
        L_0x0031:
            r1 = r15
        L_0x0032:
            r2 = r12 & 2
            if (r2 == 0) goto L_0x0039
            r1 = r1 | 48
            goto L_0x004c
        L_0x0039:
            r3 = r15 & 112(0x70, float:1.57E-43)
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
            r4 = r15 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0067
            r4 = r12 & 4
            if (r4 != 0) goto L_0x0061
            r4 = r30
            boolean r5 = r11.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x0063
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0061:
            r4 = r30
        L_0x0063:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r1 = r1 | r5
            goto L_0x0069
        L_0x0067:
            r4 = r30
        L_0x0069:
            r5 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x0082
            r5 = r12 & 8
            if (r5 != 0) goto L_0x007c
            r5 = r31
            boolean r7 = r11.changed((long) r5)
            if (r7 == 0) goto L_0x007e
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007c:
            r5 = r31
        L_0x007e:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r1 = r1 | r7
            goto L_0x0084
        L_0x0082:
            r5 = r31
        L_0x0084:
            r9 = 57344(0xe000, float:8.0356E-41)
            r7 = r15 & r9
            if (r7 != 0) goto L_0x00a0
            r7 = r12 & 16
            if (r7 != 0) goto L_0x009a
            r7 = r33
            boolean r10 = r11.changed((long) r7)
            if (r10 == 0) goto L_0x009c
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009a:
            r7 = r33
        L_0x009c:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r1 = r1 | r10
            goto L_0x00a2
        L_0x00a0:
            r7 = r33
        L_0x00a2:
            r10 = 458752(0x70000, float:6.42848E-40)
            r16 = r15 & r10
            if (r16 != 0) goto L_0x00bc
            r16 = r12 & 32
            r10 = r35
            if (r16 != 0) goto L_0x00b7
            boolean r16 = r11.changed((java.lang.Object) r10)
            if (r16 == 0) goto L_0x00b7
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b9
        L_0x00b7:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b9:
            r1 = r1 | r16
            goto L_0x00be
        L_0x00bc:
            r10 = r35
        L_0x00be:
            r16 = r12 & 64
            r17 = 3670016(0x380000, float:5.142788E-39)
            if (r16 == 0) goto L_0x00cb
            r18 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r18
            r9 = r36
            goto L_0x00de
        L_0x00cb:
            r18 = r15 & r17
            r9 = r36
            if (r18 != 0) goto L_0x00de
            boolean r19 = r11.changed((java.lang.Object) r9)
            if (r19 == 0) goto L_0x00da
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00dc
        L_0x00da:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00dc:
            r1 = r1 | r19
        L_0x00de:
            r0 = r12 & 128(0x80, float:1.794E-43)
            r20 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00e7
            r1 = r1 | r20
            goto L_0x00f8
        L_0x00e7:
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r15
            if (r0 != 0) goto L_0x00f8
            boolean r0 = r11.changed((java.lang.Object) r14)
            if (r0 == 0) goto L_0x00f5
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f7
        L_0x00f5:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f7:
            r1 = r1 | r0
        L_0x00f8:
            r0 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r0 & r1
            r3 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r3) goto L_0x0115
            boolean r0 = r11.getSkipping()
            if (r0 != 0) goto L_0x0108
            goto L_0x0115
        L_0x0108:
            r11.skipToGroupEnd()
            r2 = r29
            r3 = r4
            r4 = r5
            r6 = r7
            r8 = r10
            r19 = r11
            goto L_0x0243
        L_0x0115:
            r11.startDefaults()
            r0 = r15 & 1
            r21 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0151
            boolean r0 = r11.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0129
            goto L_0x0151
        L_0x0129:
            r11.skipToGroupEnd()
            r0 = r12 & 4
            if (r0 == 0) goto L_0x0132
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0132:
            r0 = r12 & 8
            if (r0 == 0) goto L_0x0138
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0138:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x013d
            r1 = r1 & r3
        L_0x013d:
            r0 = r12 & 32
            if (r0 == 0) goto L_0x0143
            r1 = r1 & r21
        L_0x0143:
            r16 = r29
            r23 = r4
            r26 = r5
            r24 = r7
        L_0x014b:
            r22 = r9
        L_0x014d:
            r21 = r10
            goto L_0x01db
        L_0x0151:
            if (r2 == 0) goto L_0x0156
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x0158
        L_0x0156:
            r0 = r29
        L_0x0158:
            r2 = r12 & 4
            r3 = 6
            if (r2 == 0) goto L_0x0168
            androidx.compose.material3.FloatingActionButtonDefaults r2 = androidx.compose.material3.FloatingActionButtonDefaults.INSTANCE
            androidx.compose.ui.graphics.Shape r2 = r2.getExtendedFabShape(r11, r3)
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            r23 = r2
            goto L_0x016a
        L_0x0168:
            r23 = r4
        L_0x016a:
            r2 = r12 & 8
            if (r2 == 0) goto L_0x0177
            androidx.compose.material3.FloatingActionButtonDefaults r2 = androidx.compose.material3.FloatingActionButtonDefaults.INSTANCE
            long r2 = r2.getContainerColor(r11, r3)
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
            r5 = r2
        L_0x0177:
            r2 = r12 & 16
            if (r2 == 0) goto L_0x018c
            int r2 = r1 >> 9
            r2 = r2 & 14
            long r2 = androidx.compose.material3.ColorSchemeKt.m34359contentColorForek8zF_U(r5, r11, r2)
            r4 = -57345(0xffffffffffff1fff, float:NaN)
            r1 = r1 & r4
            r22 = r1
            r24 = r2
            goto L_0x0190
        L_0x018c:
            r22 = r1
            r24 = r7
        L_0x0190:
            r1 = r12 & 32
            if (r1 == 0) goto L_0x01ad
            androidx.compose.material3.FloatingActionButtonDefaults r1 = androidx.compose.material3.FloatingActionButtonDefaults.INSTANCE
            r2 = 0
            r3 = 0
            r4 = 0
            r7 = 0
            r8 = 24576(0x6000, float:3.4438E-41)
            r10 = 15
            r26 = r5
            r5 = r7
            r6 = r11
            r7 = r8
            r8 = r10
            androidx.compose.material3.FloatingActionButtonElevation r1 = r1.m34448elevationxZ9QkE(r2, r3, r4, r5, r6, r7, r8)
            r2 = r22 & r21
            r10 = r1
            r1 = r2
            goto L_0x01b1
        L_0x01ad:
            r26 = r5
            r1 = r22
        L_0x01b1:
            if (r16 == 0) goto L_0x01d7
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.startReplaceableGroup(r2)
            java.lang.Object r2 = r11.rememberedValue()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            if (r2 != r3) goto L_0x01cc
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r11.updateRememberedValue(r2)
        L_0x01cc:
            r11.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = (androidx.compose.foundation.interaction.MutableInteractionSource) r2
            r16 = r0
            r22 = r2
            goto L_0x014d
        L_0x01d7:
            r16 = r0
            goto L_0x014b
        L_0x01db:
            r11.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01ed
            r0 = -1
            java.lang.String r2 = "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:268)"
            r3 = -326283107(0xffffffffec8d509d, float:-1.3667138E27)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r1, r0, r2)
        L_0x01ed:
            androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$2 r0 = new androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$2
            r0.<init>(r14, r1)
            r2 = 398457247(0x17bff99f, float:1.2406099E-24)
            r3 = 1
            androidx.compose.runtime.internal.ComposableLambda r9 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r11, r2, r3, r0)
            r0 = r1 & 14
            r0 = r0 | r20
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r1
            r0 = r0 | r2
            r1 = r1 & r17
            r17 = r0 | r1
            r18 = 0
            r0 = r28
            r1 = r16
            r2 = r23
            r3 = r26
            r5 = r24
            r7 = r21
            r8 = r22
            r10 = r11
            r19 = r11
            r11 = r17
            r12 = r18
            m34453FloatingActionButtonXz6DiA(r0, r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0237
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0237:
            r2 = r16
            r8 = r21
            r9 = r22
            r3 = r23
            r6 = r24
            r4 = r26
        L_0x0243:
            androidx.compose.runtime.ScopeUpdateScope r12 = r19.endRestartGroup()
            if (r12 != 0) goto L_0x024a
            goto L_0x025d
        L_0x024a:
            androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$3 r11 = new androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$3
            r0 = r11
            r1 = r28
            r10 = r37
            r13 = r11
            r11 = r39
            r14 = r12
            r12 = r40
            r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11, r12)
            r14.updateScope(r13)
        L_0x025d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonKt.m34452ExtendedFloatingActionButtonXz6DiA(of.a, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.material3.FloatingActionButtonElevation, androidx.compose.foundation.interaction.MutableInteractionSource, of.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:138:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0115  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* renamed from: FloatingActionButton-X-z6DiA  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m34453FloatingActionButtonXz6DiA(p404of.C13074a<p336ef.C11921v> r28, androidx.compose.p002ui.Modifier r29, androidx.compose.p002ui.graphics.Shape r30, long r31, long r33, androidx.compose.material3.FloatingActionButtonElevation r35, androidx.compose.foundation.interaction.MutableInteractionSource r36, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r37, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            r13 = r28
            r11 = r37
            r6 = r39
            r7 = r40
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C12775o.m28639i(r13, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r11, r0)
            r0 = -731723913(0xffffffffd462c777, float:-3.89603629E12)
            r1 = r38
            androidx.compose.runtime.Composer r4 = r1.startRestartGroup(r0)
            r1 = r7 & 1
            if (r1 == 0) goto L_0x0022
            r1 = r6 | 6
            goto L_0x0032
        L_0x0022:
            r1 = r6 & 14
            if (r1 != 0) goto L_0x0031
            boolean r1 = r4.changed((java.lang.Object) r13)
            if (r1 == 0) goto L_0x002e
            r1 = 4
            goto L_0x002f
        L_0x002e:
            r1 = 2
        L_0x002f:
            r1 = r1 | r6
            goto L_0x0032
        L_0x0031:
            r1 = r6
        L_0x0032:
            r2 = r7 & 2
            if (r2 == 0) goto L_0x0039
            r1 = r1 | 48
            goto L_0x004c
        L_0x0039:
            r3 = r6 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004c
            r3 = r29
            boolean r5 = r4.changed((java.lang.Object) r3)
            if (r5 == 0) goto L_0x0048
            r5 = 32
            goto L_0x004a
        L_0x0048:
            r5 = 16
        L_0x004a:
            r1 = r1 | r5
            goto L_0x004e
        L_0x004c:
            r3 = r29
        L_0x004e:
            r5 = r6 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0067
            r5 = r7 & 4
            if (r5 != 0) goto L_0x0061
            r5 = r30
            boolean r8 = r4.changed((java.lang.Object) r5)
            if (r8 == 0) goto L_0x0063
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0061:
            r5 = r30
        L_0x0063:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r1 = r1 | r8
            goto L_0x0069
        L_0x0067:
            r5 = r30
        L_0x0069:
            r8 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0082
            r8 = r7 & 8
            if (r8 != 0) goto L_0x007c
            r8 = r31
            boolean r10 = r4.changed((long) r8)
            if (r10 == 0) goto L_0x007e
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007c:
            r8 = r31
        L_0x007e:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r1 = r1 | r10
            goto L_0x0084
        L_0x0082:
            r8 = r31
        L_0x0084:
            r22 = 57344(0xe000, float:8.0356E-41)
            r10 = r6 & r22
            if (r10 != 0) goto L_0x009e
            r10 = r7 & 16
            r14 = r33
            if (r10 != 0) goto L_0x009a
            boolean r10 = r4.changed((long) r14)
            if (r10 == 0) goto L_0x009a
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r1 = r1 | r10
            goto L_0x00a0
        L_0x009e:
            r14 = r33
        L_0x00a0:
            r23 = 458752(0x70000, float:6.42848E-40)
            r10 = r6 & r23
            if (r10 != 0) goto L_0x00bb
            r10 = r7 & 32
            if (r10 != 0) goto L_0x00b5
            r10 = r35
            boolean r12 = r4.changed((java.lang.Object) r10)
            if (r12 == 0) goto L_0x00b7
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b9
        L_0x00b5:
            r10 = r35
        L_0x00b7:
            r12 = 65536(0x10000, float:9.18355E-41)
        L_0x00b9:
            r1 = r1 | r12
            goto L_0x00bd
        L_0x00bb:
            r10 = r35
        L_0x00bd:
            r12 = r7 & 64
            if (r12 == 0) goto L_0x00c8
            r16 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r16
            r0 = r36
            goto L_0x00dd
        L_0x00c8:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r6 & r16
            r0 = r36
            if (r16 != 0) goto L_0x00dd
            boolean r16 = r4.changed((java.lang.Object) r0)
            if (r16 == 0) goto L_0x00d9
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00db
        L_0x00d9:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00db:
            r1 = r1 | r16
        L_0x00dd:
            r0 = r7 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00e5
            r0 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00e3:
            r1 = r1 | r0
            goto L_0x00f6
        L_0x00e5:
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r6
            if (r0 != 0) goto L_0x00f6
            boolean r0 = r4.changed((java.lang.Object) r11)
            if (r0 == 0) goto L_0x00f3
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e3
        L_0x00f3:
            r0 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00e3
        L_0x00f6:
            r0 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r0 & r1
            r3 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r3) goto L_0x0115
            boolean r0 = r4.getSkipping()
            if (r0 != 0) goto L_0x0106
            goto L_0x0115
        L_0x0106:
            r4.skipToGroupEnd()
            r2 = r29
            r24 = r4
            r3 = r5
            r4 = r8
            r8 = r10
            r6 = r14
            r9 = r36
            goto L_0x0266
        L_0x0115:
            r4.startDefaults()
            r0 = r6 & 1
            r3 = -458753(0xfffffffffff8ffff, float:NaN)
            r16 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0153
            boolean r0 = r4.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0129
            goto L_0x0153
        L_0x0129:
            r4.skipToGroupEnd()
            r0 = r7 & 4
            if (r0 == 0) goto L_0x0132
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0132:
            r0 = r7 & 8
            if (r0 == 0) goto L_0x0138
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0138:
            r0 = r7 & 16
            if (r0 == 0) goto L_0x013e
            r1 = r1 & r16
        L_0x013e:
            r0 = r7 & 32
            if (r0 == 0) goto L_0x0143
            r1 = r1 & r3
        L_0x0143:
            r17 = r29
            r3 = r36
            r18 = r5
            r19 = r8
            r5 = r10
            r26 = r14
            r14 = r1
            r0 = r26
            goto L_0x01d6
        L_0x0153:
            if (r2 == 0) goto L_0x0158
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x015a
        L_0x0158:
            r0 = r29
        L_0x015a:
            r2 = r7 & 4
            r3 = 6
            if (r2 == 0) goto L_0x0168
            androidx.compose.material3.FloatingActionButtonDefaults r2 = androidx.compose.material3.FloatingActionButtonDefaults.INSTANCE
            androidx.compose.ui.graphics.Shape r2 = r2.getShape(r4, r3)
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            r5 = r2
        L_0x0168:
            r2 = r7 & 8
            if (r2 == 0) goto L_0x0175
            androidx.compose.material3.FloatingActionButtonDefaults r2 = androidx.compose.material3.FloatingActionButtonDefaults.INSTANCE
            long r2 = r2.getContainerColor(r4, r3)
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
            r8 = r2
        L_0x0175:
            r2 = r7 & 16
            if (r2 == 0) goto L_0x0184
            int r2 = r1 >> 9
            r2 = r2 & 14
            long r2 = androidx.compose.material3.ColorSchemeKt.m34359contentColorForek8zF_U(r8, r4, r2)
            r1 = r1 & r16
            goto L_0x0185
        L_0x0184:
            r2 = r14
        L_0x0185:
            r14 = r7 & 32
            if (r14 == 0) goto L_0x01a0
            androidx.compose.material3.FloatingActionButtonDefaults r14 = androidx.compose.material3.FloatingActionButtonDefaults.INSTANCE
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 24576(0x6000, float:3.4438E-41)
            r21 = 15
            r19 = r4
            androidx.compose.material3.FloatingActionButtonElevation r10 = r14.m34448elevationxZ9QkE(r15, r16, r17, r18, r19, r20, r21)
            r14 = -458753(0xfffffffffff8ffff, float:NaN)
            r1 = r1 & r14
        L_0x01a0:
            if (r12 == 0) goto L_0x01cb
            r12 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r4.startReplaceableGroup(r12)
            java.lang.Object r12 = r4.rememberedValue()
            androidx.compose.runtime.Composer$Companion r14 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r14 = r14.getEmpty()
            if (r12 != r14) goto L_0x01bb
            androidx.compose.foundation.interaction.MutableInteractionSource r12 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r4.updateRememberedValue(r12)
        L_0x01bb:
            r4.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r12 = (androidx.compose.foundation.interaction.MutableInteractionSource) r12
            r17 = r0
            r14 = r1
            r0 = r2
            r18 = r5
            r19 = r8
            r5 = r10
            r3 = r12
            goto L_0x01d6
        L_0x01cb:
            r17 = r0
            r14 = r1
            r0 = r2
            r18 = r5
            r19 = r8
            r5 = r10
            r3 = r36
        L_0x01d6:
            r4.endDefaults()
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x01e8
            r2 = -1
            java.lang.String r8 = "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:93)"
            r9 = -731723913(0xffffffffd462c777, float:-3.89603629E12)
            androidx.compose.runtime.ComposerKt.traceEventStart(r9, r14, r2, r8)
        L_0x01e8:
            r2 = 0
            int r8 = r14 >> 18
            r8 = r8 & 14
            int r9 = r14 >> 12
            r9 = r9 & 112(0x70, float:1.57E-43)
            r9 = r9 | r8
            androidx.compose.runtime.State r8 = r5.tonalElevation$material3_release(r3, r4, r9)
            java.lang.Object r8 = r8.getValue()
            androidx.compose.ui.unit.Dp r8 = (androidx.compose.p002ui.unit.C1232Dp) r8
            float r8 = r8.m38482unboximpl()
            androidx.compose.runtime.State r9 = r5.shadowElevation$material3_release(r3, r4, r9)
            java.lang.Object r9 = r9.getValue()
            androidx.compose.ui.unit.Dp r9 = (androidx.compose.p002ui.unit.C1232Dp) r9
            float r9 = r9.m38482unboximpl()
            r10 = 0
            androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$2 r12 = new androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$2
            r12.<init>(r0, r11, r14)
            r15 = 1249316354(0x4a770e02, float:4047744.5)
            r2 = 1
            androidx.compose.runtime.internal.ComposableLambda r12 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r4, r15, r2, r12)
            r2 = r14 & 14
            r15 = r14 & 112(0x70, float:1.57E-43)
            r2 = r2 | r15
            int r15 = r14 << 3
            r10 = r15 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r10
            r10 = r15 & r22
            r2 = r2 | r10
            r10 = r15 & r23
            r2 = r2 | r10
            r10 = 1879048192(0x70000000, float:1.58456325E29)
            int r14 = r14 << 9
            r10 = r10 & r14
            r14 = r2 | r10
            r15 = 6
            r16 = 260(0x104, float:3.64E-43)
            r21 = r0
            r0 = r28
            r1 = r17
            r23 = r3
            r3 = r18
            r24 = r4
            r25 = r5
            r4 = r19
            r6 = r21
            r11 = r23
            r13 = r24
            r2 = 0
            r10 = 0
            androidx.compose.material3.SurfaceKt.m34605Surfaceo_FOJdg(r0, r1, r2, r3, r4, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x025a
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x025a:
            r2 = r17
            r3 = r18
            r4 = r19
            r6 = r21
            r9 = r23
            r8 = r25
        L_0x0266:
            androidx.compose.runtime.ScopeUpdateScope r13 = r24.endRestartGroup()
            if (r13 != 0) goto L_0x026d
            goto L_0x027e
        L_0x026d:
            androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$3 r14 = new androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$3
            r0 = r14
            r1 = r28
            r10 = r37
            r11 = r39
            r12 = r40
            r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11, r12)
            r13.updateScope(r14)
        L_0x027e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonKt.m34453FloatingActionButtonXz6DiA(of.a, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.material3.FloatingActionButtonElevation, androidx.compose.foundation.interaction.MutableInteractionSource, of.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:135:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0115  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* renamed from: LargeFloatingActionButton-X-z6DiA  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m34454LargeFloatingActionButtonXz6DiA(p404of.C13074a<p336ef.C11921v> r28, androidx.compose.p002ui.Modifier r29, androidx.compose.p002ui.graphics.Shape r30, long r31, long r33, androidx.compose.material3.FloatingActionButtonElevation r35, androidx.compose.foundation.interaction.MutableInteractionSource r36, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r37, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            r13 = r28
            r14 = r37
            r15 = r39
            r12 = r40
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C12775o.m28639i(r13, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r14, r0)
            r0 = -1650866856(0xffffffff9d99c558, float:-4.070281E-21)
            r1 = r38
            androidx.compose.runtime.Composer r11 = r1.startRestartGroup(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0022
            r1 = r15 | 6
            goto L_0x0032
        L_0x0022:
            r1 = r15 & 14
            if (r1 != 0) goto L_0x0031
            boolean r1 = r11.changed((java.lang.Object) r13)
            if (r1 == 0) goto L_0x002e
            r1 = 4
            goto L_0x002f
        L_0x002e:
            r1 = 2
        L_0x002f:
            r1 = r1 | r15
            goto L_0x0032
        L_0x0031:
            r1 = r15
        L_0x0032:
            r2 = r12 & 2
            if (r2 == 0) goto L_0x0039
            r1 = r1 | 48
            goto L_0x004c
        L_0x0039:
            r3 = r15 & 112(0x70, float:1.57E-43)
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
            r4 = r15 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0067
            r4 = r12 & 4
            if (r4 != 0) goto L_0x0061
            r4 = r30
            boolean r5 = r11.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x0063
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0061:
            r4 = r30
        L_0x0063:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r1 = r1 | r5
            goto L_0x0069
        L_0x0067:
            r4 = r30
        L_0x0069:
            r5 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x0082
            r5 = r12 & 8
            if (r5 != 0) goto L_0x007c
            r5 = r31
            boolean r7 = r11.changed((long) r5)
            if (r7 == 0) goto L_0x007e
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007c:
            r5 = r31
        L_0x007e:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r1 = r1 | r7
            goto L_0x0084
        L_0x0082:
            r5 = r31
        L_0x0084:
            r9 = 57344(0xe000, float:8.0356E-41)
            r7 = r15 & r9
            if (r7 != 0) goto L_0x00a0
            r7 = r12 & 16
            if (r7 != 0) goto L_0x009a
            r7 = r33
            boolean r10 = r11.changed((long) r7)
            if (r10 == 0) goto L_0x009c
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009a:
            r7 = r33
        L_0x009c:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r1 = r1 | r10
            goto L_0x00a2
        L_0x00a0:
            r7 = r33
        L_0x00a2:
            r10 = 458752(0x70000, float:6.42848E-40)
            r16 = r15 & r10
            if (r16 != 0) goto L_0x00bc
            r16 = r12 & 32
            r10 = r35
            if (r16 != 0) goto L_0x00b7
            boolean r16 = r11.changed((java.lang.Object) r10)
            if (r16 == 0) goto L_0x00b7
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b9
        L_0x00b7:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b9:
            r1 = r1 | r16
            goto L_0x00be
        L_0x00bc:
            r10 = r35
        L_0x00be:
            r16 = r12 & 64
            r17 = 3670016(0x380000, float:5.142788E-39)
            if (r16 == 0) goto L_0x00cb
            r18 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r18
            r9 = r36
            goto L_0x00de
        L_0x00cb:
            r18 = r15 & r17
            r9 = r36
            if (r18 != 0) goto L_0x00de
            boolean r19 = r11.changed((java.lang.Object) r9)
            if (r19 == 0) goto L_0x00da
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00dc
        L_0x00da:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00dc:
            r1 = r1 | r19
        L_0x00de:
            r0 = r12 & 128(0x80, float:1.794E-43)
            r20 = 29360128(0x1c00000, float:7.052966E-38)
            if (r0 == 0) goto L_0x00e8
            r0 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00e6:
            r1 = r1 | r0
            goto L_0x00f8
        L_0x00e8:
            r0 = r15 & r20
            if (r0 != 0) goto L_0x00f8
            boolean r0 = r11.changed((java.lang.Object) r14)
            if (r0 == 0) goto L_0x00f5
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e6
        L_0x00f5:
            r0 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00e6
        L_0x00f8:
            r0 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r0 & r1
            r3 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r3) goto L_0x0115
            boolean r0 = r11.getSkipping()
            if (r0 != 0) goto L_0x0108
            goto L_0x0115
        L_0x0108:
            r11.skipToGroupEnd()
            r2 = r29
            r3 = r4
            r4 = r5
            r6 = r7
            r8 = r10
            r19 = r11
            goto L_0x0256
        L_0x0115:
            r11.startDefaults()
            r0 = r15 & 1
            r21 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0151
            boolean r0 = r11.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0129
            goto L_0x0151
        L_0x0129:
            r11.skipToGroupEnd()
            r0 = r12 & 4
            if (r0 == 0) goto L_0x0132
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0132:
            r0 = r12 & 8
            if (r0 == 0) goto L_0x0138
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0138:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x013d
            r1 = r1 & r3
        L_0x013d:
            r0 = r12 & 32
            if (r0 == 0) goto L_0x0143
            r1 = r1 & r21
        L_0x0143:
            r16 = r29
            r23 = r4
            r26 = r5
            r24 = r7
        L_0x014b:
            r22 = r9
        L_0x014d:
            r21 = r10
            goto L_0x01db
        L_0x0151:
            if (r2 == 0) goto L_0x0156
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x0158
        L_0x0156:
            r0 = r29
        L_0x0158:
            r2 = r12 & 4
            r3 = 6
            if (r2 == 0) goto L_0x0168
            androidx.compose.material3.FloatingActionButtonDefaults r2 = androidx.compose.material3.FloatingActionButtonDefaults.INSTANCE
            androidx.compose.ui.graphics.Shape r2 = r2.getLargeShape(r11, r3)
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            r23 = r2
            goto L_0x016a
        L_0x0168:
            r23 = r4
        L_0x016a:
            r2 = r12 & 8
            if (r2 == 0) goto L_0x0177
            androidx.compose.material3.FloatingActionButtonDefaults r2 = androidx.compose.material3.FloatingActionButtonDefaults.INSTANCE
            long r2 = r2.getContainerColor(r11, r3)
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
            r5 = r2
        L_0x0177:
            r2 = r12 & 16
            if (r2 == 0) goto L_0x018c
            int r2 = r1 >> 9
            r2 = r2 & 14
            long r2 = androidx.compose.material3.ColorSchemeKt.m34359contentColorForek8zF_U(r5, r11, r2)
            r4 = -57345(0xffffffffffff1fff, float:NaN)
            r1 = r1 & r4
            r22 = r1
            r24 = r2
            goto L_0x0190
        L_0x018c:
            r22 = r1
            r24 = r7
        L_0x0190:
            r1 = r12 & 32
            if (r1 == 0) goto L_0x01ad
            androidx.compose.material3.FloatingActionButtonDefaults r1 = androidx.compose.material3.FloatingActionButtonDefaults.INSTANCE
            r2 = 0
            r3 = 0
            r4 = 0
            r7 = 0
            r8 = 24576(0x6000, float:3.4438E-41)
            r10 = 15
            r26 = r5
            r5 = r7
            r6 = r11
            r7 = r8
            r8 = r10
            androidx.compose.material3.FloatingActionButtonElevation r1 = r1.m34448elevationxZ9QkE(r2, r3, r4, r5, r6, r7, r8)
            r2 = r22 & r21
            r10 = r1
            r1 = r2
            goto L_0x01b1
        L_0x01ad:
            r26 = r5
            r1 = r22
        L_0x01b1:
            if (r16 == 0) goto L_0x01d7
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.startReplaceableGroup(r2)
            java.lang.Object r2 = r11.rememberedValue()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            if (r2 != r3) goto L_0x01cc
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r11.updateRememberedValue(r2)
        L_0x01cc:
            r11.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = (androidx.compose.foundation.interaction.MutableInteractionSource) r2
            r16 = r0
            r22 = r2
            goto L_0x014d
        L_0x01d7:
            r16 = r0
            goto L_0x014b
        L_0x01db:
            r11.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01ed
            r0 = -1
            java.lang.String r2 = "androidx.compose.material3.LargeFloatingActionButton (FloatingActionButton.kt:213)"
            r3 = -1650866856(0xffffffff9d99c558, float:-4.070281E-21)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r1, r0, r2)
        L_0x01ed:
            androidx.compose.material3.tokens.FabPrimaryLargeTokens r0 = androidx.compose.material3.tokens.FabPrimaryLargeTokens.INSTANCE
            float r2 = r0.m34895getContainerWidthD9Ej5fM()
            float r0 = r0.m34894getContainerHeightD9Ej5fM()
            r3 = 0
            r4 = 0
            r5 = 12
            r6 = 0
            r29 = r16
            r30 = r2
            r31 = r0
            r32 = r3
            r33 = r4
            r34 = r5
            r35 = r6
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.m33342sizeInqDBjuR0$default(r29, r30, r31, r32, r33, r34, r35)
            r0 = r1 & 14
            r3 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            r3 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r1
            r0 = r0 | r3
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r1
            r0 = r0 | r3
            r3 = r1 & r17
            r0 = r0 | r3
            r1 = r1 & r20
            r17 = r0 | r1
            r18 = 0
            r0 = r28
            r1 = r2
            r2 = r23
            r3 = r26
            r5 = r24
            r7 = r21
            r8 = r22
            r9 = r37
            r10 = r11
            r19 = r11
            r11 = r17
            r12 = r18
            m34453FloatingActionButtonXz6DiA(r0, r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x024a
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x024a:
            r2 = r16
            r8 = r21
            r9 = r22
            r3 = r23
            r6 = r24
            r4 = r26
        L_0x0256:
            androidx.compose.runtime.ScopeUpdateScope r12 = r19.endRestartGroup()
            if (r12 != 0) goto L_0x025d
            goto L_0x0270
        L_0x025d:
            androidx.compose.material3.FloatingActionButtonKt$LargeFloatingActionButton$2 r11 = new androidx.compose.material3.FloatingActionButtonKt$LargeFloatingActionButton$2
            r0 = r11
            r1 = r28
            r10 = r37
            r13 = r11
            r11 = r39
            r14 = r12
            r12 = r40
            r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11, r12)
            r14.updateScope(r13)
        L_0x0270:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonKt.m34454LargeFloatingActionButtonXz6DiA(of.a, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.material3.FloatingActionButtonElevation, androidx.compose.foundation.interaction.MutableInteractionSource, of.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:135:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0115  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* renamed from: SmallFloatingActionButton-X-z6DiA  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m34455SmallFloatingActionButtonXz6DiA(p404of.C13074a<p336ef.C11921v> r28, androidx.compose.p002ui.Modifier r29, androidx.compose.p002ui.graphics.Shape r30, long r31, long r33, androidx.compose.material3.FloatingActionButtonElevation r35, androidx.compose.foundation.interaction.MutableInteractionSource r36, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r37, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            r13 = r28
            r14 = r37
            r15 = r39
            r12 = r40
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C12775o.m28639i(r13, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r14, r0)
            r0 = 1444748300(0x561d1c0c, float:4.3185946E13)
            r1 = r38
            androidx.compose.runtime.Composer r11 = r1.startRestartGroup(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0022
            r1 = r15 | 6
            goto L_0x0032
        L_0x0022:
            r1 = r15 & 14
            if (r1 != 0) goto L_0x0031
            boolean r1 = r11.changed((java.lang.Object) r13)
            if (r1 == 0) goto L_0x002e
            r1 = 4
            goto L_0x002f
        L_0x002e:
            r1 = 2
        L_0x002f:
            r1 = r1 | r15
            goto L_0x0032
        L_0x0031:
            r1 = r15
        L_0x0032:
            r2 = r12 & 2
            if (r2 == 0) goto L_0x0039
            r1 = r1 | 48
            goto L_0x004c
        L_0x0039:
            r3 = r15 & 112(0x70, float:1.57E-43)
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
            r4 = r15 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0067
            r4 = r12 & 4
            if (r4 != 0) goto L_0x0061
            r4 = r30
            boolean r5 = r11.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x0063
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0061:
            r4 = r30
        L_0x0063:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r1 = r1 | r5
            goto L_0x0069
        L_0x0067:
            r4 = r30
        L_0x0069:
            r5 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x0082
            r5 = r12 & 8
            if (r5 != 0) goto L_0x007c
            r5 = r31
            boolean r7 = r11.changed((long) r5)
            if (r7 == 0) goto L_0x007e
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007c:
            r5 = r31
        L_0x007e:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r1 = r1 | r7
            goto L_0x0084
        L_0x0082:
            r5 = r31
        L_0x0084:
            r9 = 57344(0xe000, float:8.0356E-41)
            r7 = r15 & r9
            if (r7 != 0) goto L_0x00a0
            r7 = r12 & 16
            if (r7 != 0) goto L_0x009a
            r7 = r33
            boolean r10 = r11.changed((long) r7)
            if (r10 == 0) goto L_0x009c
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009a:
            r7 = r33
        L_0x009c:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r1 = r1 | r10
            goto L_0x00a2
        L_0x00a0:
            r7 = r33
        L_0x00a2:
            r10 = 458752(0x70000, float:6.42848E-40)
            r16 = r15 & r10
            if (r16 != 0) goto L_0x00bc
            r16 = r12 & 32
            r10 = r35
            if (r16 != 0) goto L_0x00b7
            boolean r16 = r11.changed((java.lang.Object) r10)
            if (r16 == 0) goto L_0x00b7
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b9
        L_0x00b7:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b9:
            r1 = r1 | r16
            goto L_0x00be
        L_0x00bc:
            r10 = r35
        L_0x00be:
            r16 = r12 & 64
            r17 = 3670016(0x380000, float:5.142788E-39)
            if (r16 == 0) goto L_0x00cb
            r18 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r18
            r9 = r36
            goto L_0x00de
        L_0x00cb:
            r18 = r15 & r17
            r9 = r36
            if (r18 != 0) goto L_0x00de
            boolean r19 = r11.changed((java.lang.Object) r9)
            if (r19 == 0) goto L_0x00da
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00dc
        L_0x00da:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00dc:
            r1 = r1 | r19
        L_0x00de:
            r0 = r12 & 128(0x80, float:1.794E-43)
            r20 = 29360128(0x1c00000, float:7.052966E-38)
            if (r0 == 0) goto L_0x00e8
            r0 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00e6:
            r1 = r1 | r0
            goto L_0x00f8
        L_0x00e8:
            r0 = r15 & r20
            if (r0 != 0) goto L_0x00f8
            boolean r0 = r11.changed((java.lang.Object) r14)
            if (r0 == 0) goto L_0x00f5
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e6
        L_0x00f5:
            r0 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00e6
        L_0x00f8:
            r0 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r0 & r1
            r3 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r3) goto L_0x0115
            boolean r0 = r11.getSkipping()
            if (r0 != 0) goto L_0x0108
            goto L_0x0115
        L_0x0108:
            r11.skipToGroupEnd()
            r2 = r29
            r3 = r4
            r4 = r5
            r6 = r7
            r8 = r10
            r19 = r11
            goto L_0x0256
        L_0x0115:
            r11.startDefaults()
            r0 = r15 & 1
            r21 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0151
            boolean r0 = r11.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0129
            goto L_0x0151
        L_0x0129:
            r11.skipToGroupEnd()
            r0 = r12 & 4
            if (r0 == 0) goto L_0x0132
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0132:
            r0 = r12 & 8
            if (r0 == 0) goto L_0x0138
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0138:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x013d
            r1 = r1 & r3
        L_0x013d:
            r0 = r12 & 32
            if (r0 == 0) goto L_0x0143
            r1 = r1 & r21
        L_0x0143:
            r16 = r29
            r23 = r4
            r26 = r5
            r24 = r7
        L_0x014b:
            r22 = r9
        L_0x014d:
            r21 = r10
            goto L_0x01db
        L_0x0151:
            if (r2 == 0) goto L_0x0156
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x0158
        L_0x0156:
            r0 = r29
        L_0x0158:
            r2 = r12 & 4
            r3 = 6
            if (r2 == 0) goto L_0x0168
            androidx.compose.material3.FloatingActionButtonDefaults r2 = androidx.compose.material3.FloatingActionButtonDefaults.INSTANCE
            androidx.compose.ui.graphics.Shape r2 = r2.getSmallShape(r11, r3)
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            r23 = r2
            goto L_0x016a
        L_0x0168:
            r23 = r4
        L_0x016a:
            r2 = r12 & 8
            if (r2 == 0) goto L_0x0177
            androidx.compose.material3.FloatingActionButtonDefaults r2 = androidx.compose.material3.FloatingActionButtonDefaults.INSTANCE
            long r2 = r2.getContainerColor(r11, r3)
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
            r5 = r2
        L_0x0177:
            r2 = r12 & 16
            if (r2 == 0) goto L_0x018c
            int r2 = r1 >> 9
            r2 = r2 & 14
            long r2 = androidx.compose.material3.ColorSchemeKt.m34359contentColorForek8zF_U(r5, r11, r2)
            r4 = -57345(0xffffffffffff1fff, float:NaN)
            r1 = r1 & r4
            r22 = r1
            r24 = r2
            goto L_0x0190
        L_0x018c:
            r22 = r1
            r24 = r7
        L_0x0190:
            r1 = r12 & 32
            if (r1 == 0) goto L_0x01ad
            androidx.compose.material3.FloatingActionButtonDefaults r1 = androidx.compose.material3.FloatingActionButtonDefaults.INSTANCE
            r2 = 0
            r3 = 0
            r4 = 0
            r7 = 0
            r8 = 24576(0x6000, float:3.4438E-41)
            r10 = 15
            r26 = r5
            r5 = r7
            r6 = r11
            r7 = r8
            r8 = r10
            androidx.compose.material3.FloatingActionButtonElevation r1 = r1.m34448elevationxZ9QkE(r2, r3, r4, r5, r6, r7, r8)
            r2 = r22 & r21
            r10 = r1
            r1 = r2
            goto L_0x01b1
        L_0x01ad:
            r26 = r5
            r1 = r22
        L_0x01b1:
            if (r16 == 0) goto L_0x01d7
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.startReplaceableGroup(r2)
            java.lang.Object r2 = r11.rememberedValue()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            if (r2 != r3) goto L_0x01cc
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r11.updateRememberedValue(r2)
        L_0x01cc:
            r11.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = (androidx.compose.foundation.interaction.MutableInteractionSource) r2
            r16 = r0
            r22 = r2
            goto L_0x014d
        L_0x01d7:
            r16 = r0
            goto L_0x014b
        L_0x01db:
            r11.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01ed
            r0 = -1
            java.lang.String r2 = "androidx.compose.material3.SmallFloatingActionButton (FloatingActionButton.kt:161)"
            r3 = 1444748300(0x561d1c0c, float:4.3185946E13)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r1, r0, r2)
        L_0x01ed:
            androidx.compose.material3.tokens.FabPrimarySmallTokens r0 = androidx.compose.material3.tokens.FabPrimarySmallTokens.INSTANCE
            float r2 = r0.m34906getContainerWidthD9Ej5fM()
            float r0 = r0.m34905getContainerHeightD9Ej5fM()
            r3 = 0
            r4 = 0
            r5 = 12
            r6 = 0
            r29 = r16
            r30 = r2
            r31 = r0
            r32 = r3
            r33 = r4
            r34 = r5
            r35 = r6
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.m33342sizeInqDBjuR0$default(r29, r30, r31, r32, r33, r34, r35)
            r0 = r1 & 14
            r3 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            r3 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r1
            r0 = r0 | r3
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r1
            r0 = r0 | r3
            r3 = r1 & r17
            r0 = r0 | r3
            r1 = r1 & r20
            r17 = r0 | r1
            r18 = 0
            r0 = r28
            r1 = r2
            r2 = r23
            r3 = r26
            r5 = r24
            r7 = r21
            r8 = r22
            r9 = r37
            r10 = r11
            r19 = r11
            r11 = r17
            r12 = r18
            m34453FloatingActionButtonXz6DiA(r0, r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x024a
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x024a:
            r2 = r16
            r8 = r21
            r9 = r22
            r3 = r23
            r6 = r24
            r4 = r26
        L_0x0256:
            androidx.compose.runtime.ScopeUpdateScope r12 = r19.endRestartGroup()
            if (r12 != 0) goto L_0x025d
            goto L_0x0270
        L_0x025d:
            androidx.compose.material3.FloatingActionButtonKt$SmallFloatingActionButton$2 r11 = new androidx.compose.material3.FloatingActionButtonKt$SmallFloatingActionButton$2
            r0 = r11
            r1 = r28
            r10 = r37
            r13 = r11
            r11 = r39
            r14 = r12
            r12 = r40
            r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11, r12)
            r14.updateScope(r13)
        L_0x0270:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonKt.m34455SmallFloatingActionButtonXz6DiA(of.a, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.material3.FloatingActionButtonElevation, androidx.compose.foundation.interaction.MutableInteractionSource, of.o, androidx.compose.runtime.Composer, int, int):void");
    }
}
