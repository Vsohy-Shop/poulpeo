package androidx.compose.material3;

import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.ColorKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* compiled from: Slider.kt */
public final class SliderDefaults {
    public static final int $stable = 0;
    public static final SliderDefaults INSTANCE = new SliderDefaults();

    private SliderDefaults() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d0  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.Composable
    /* renamed from: Thumb-9LiSoMs  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m34559Thumb9LiSoMs(androidx.compose.foundation.interaction.MutableInteractionSource r38, androidx.compose.p002ui.Modifier r39, androidx.compose.material3.SliderColors r40, boolean r41, long r42, androidx.compose.runtime.Composer r44, int r45, int r46) {
        /*
            r37 = this;
            r2 = r38
            r8 = r45
            java.lang.String r0 = "interactionSource"
            kotlin.jvm.internal.C12775o.m28639i(r2, r0)
            r0 = -290277409(0xffffffffeeb2b7df, float:-2.765531E28)
            r1 = r44
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            r3 = r46 & 1
            r4 = 2
            if (r3 == 0) goto L_0x001a
            r3 = r8 | 6
            goto L_0x002a
        L_0x001a:
            r3 = r8 & 14
            if (r3 != 0) goto L_0x0029
            boolean r3 = r1.changed((java.lang.Object) r2)
            if (r3 == 0) goto L_0x0026
            r3 = 4
            goto L_0x0027
        L_0x0026:
            r3 = r4
        L_0x0027:
            r3 = r3 | r8
            goto L_0x002a
        L_0x0029:
            r3 = r8
        L_0x002a:
            r5 = r46 & 2
            if (r5 == 0) goto L_0x0031
            r3 = r3 | 48
            goto L_0x0044
        L_0x0031:
            r6 = r8 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0044
            r6 = r39
            boolean r7 = r1.changed((java.lang.Object) r6)
            if (r7 == 0) goto L_0x0040
            r7 = 32
            goto L_0x0042
        L_0x0040:
            r7 = 16
        L_0x0042:
            r3 = r3 | r7
            goto L_0x0046
        L_0x0044:
            r6 = r39
        L_0x0046:
            r7 = r8 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x005f
            r7 = r46 & 4
            if (r7 != 0) goto L_0x0059
            r7 = r40
            boolean r9 = r1.changed((java.lang.Object) r7)
            if (r9 == 0) goto L_0x005b
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x0059:
            r7 = r40
        L_0x005b:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r3 = r3 | r9
            goto L_0x0061
        L_0x005f:
            r7 = r40
        L_0x0061:
            r34 = r46 & 8
            if (r34 == 0) goto L_0x0068
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x007b
        L_0x0068:
            r9 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x007b
            r9 = r41
            boolean r10 = r1.changed((boolean) r9)
            if (r10 == 0) goto L_0x0077
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r3 = r3 | r10
            goto L_0x007d
        L_0x007b:
            r9 = r41
        L_0x007d:
            r35 = r46 & 16
            if (r35 == 0) goto L_0x0086
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            r14 = r42
            goto L_0x009a
        L_0x0086:
            r10 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r8
            r14 = r42
            if (r10 != 0) goto L_0x009a
            boolean r10 = r1.changed((long) r14)
            if (r10 == 0) goto L_0x0097
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r3 = r3 | r10
        L_0x009a:
            r10 = r46 & 32
            if (r10 == 0) goto L_0x00a4
            r10 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r10
            r12 = r37
            goto L_0x00b7
        L_0x00a4:
            r10 = 458752(0x70000, float:6.42848E-40)
            r10 = r10 & r8
            r12 = r37
            if (r10 != 0) goto L_0x00b7
            boolean r10 = r1.changed((java.lang.Object) r12)
            if (r10 == 0) goto L_0x00b4
            r10 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b6
        L_0x00b4:
            r10 = 65536(0x10000, float:9.18355E-41)
        L_0x00b6:
            r3 = r3 | r10
        L_0x00b7:
            r10 = 374491(0x5b6db, float:5.24774E-40)
            r10 = r10 & r3
            r11 = 74898(0x12492, float:1.04954E-40)
            if (r10 != r11) goto L_0x00d0
            boolean r10 = r1.getSkipping()
            if (r10 != 0) goto L_0x00c7
            goto L_0x00d0
        L_0x00c7:
            r1.skipToGroupEnd()
            r3 = r6
            r4 = r7
            r5 = r9
            r6 = r14
            goto L_0x021f
        L_0x00d0:
            r1.startDefaults()
            r10 = r8 & 1
            r36 = 1
            if (r10 == 0) goto L_0x00eb
            boolean r10 = r1.getDefaultsInvalid()
            if (r10 == 0) goto L_0x00e0
            goto L_0x00eb
        L_0x00e0:
            r1.skipToGroupEnd()
            r5 = r46 & 4
            if (r5 == 0) goto L_0x00e9
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00e9:
            r5 = r9
            goto L_0x012c
        L_0x00eb:
            if (r5 == 0) goto L_0x00f0
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.p002ui.Modifier.Companion
            r6 = r5
        L_0x00f0:
            r5 = r46 & 4
            if (r5 == 0) goto L_0x011b
            r10 = 0
            r16 = 0
            r12 = r16
            r14 = r16
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r28 = 0
            r31 = 0
            int r5 = r3 >> 15
            r32 = r5 & 14
            r33 = 1023(0x3ff, float:1.434E-42)
            r9 = r37
            r30 = r1
            androidx.compose.material3.SliderColors r5 = r9.m34560colorsq0g_0yA(r10, r12, r14, r16, r18, r20, r22, r24, r26, r28, r30, r31, r32, r33)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            r7 = r5
        L_0x011b:
            if (r34 == 0) goto L_0x0120
            r5 = r36
            goto L_0x0122
        L_0x0120:
            r5 = r41
        L_0x0122:
            if (r35 == 0) goto L_0x012a
            long r9 = androidx.compose.material3.SliderKt.ThumbSize
            r14 = r9
            goto L_0x012c
        L_0x012a:
            r14 = r42
        L_0x012c:
            r1.endDefaults()
            boolean r9 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r9 == 0) goto L_0x013b
            r9 = -1
            java.lang.String r10 = "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:673)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r3, r9, r10)
        L_0x013b:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1.startReplaceableGroup(r0)
            java.lang.Object r0 = r1.rememberedValue()
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r10 = r9.getEmpty()
            if (r0 != r10) goto L_0x0154
            androidx.compose.runtime.snapshots.SnapshotStateList r0 = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf()
            r1.updateRememberedValue(r0)
        L_0x0154:
            r1.endReplaceableGroup()
            androidx.compose.runtime.snapshots.SnapshotStateList r0 = (androidx.compose.runtime.snapshots.SnapshotStateList) r0
            r10 = r3 & 14
            r11 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r1.startReplaceableGroup(r11)
            boolean r11 = r1.changed((java.lang.Object) r2)
            boolean r12 = r1.changed((java.lang.Object) r0)
            r11 = r11 | r12
            java.lang.Object r12 = r1.rememberedValue()
            r13 = 0
            if (r11 != 0) goto L_0x0177
            java.lang.Object r9 = r9.getEmpty()
            if (r12 != r9) goto L_0x017f
        L_0x0177:
            androidx.compose.material3.SliderDefaults$Thumb$1$1 r12 = new androidx.compose.material3.SliderDefaults$Thumb$1$1
            r12.<init>(r2, r0, r13)
            r1.updateRememberedValue(r12)
        L_0x017f:
            r1.endReplaceableGroup()
            of.o r12 = (p404of.C13088o) r12
            r9 = r10 | 64
            androidx.compose.runtime.EffectsKt.LaunchedEffect((java.lang.Object) r2, (p404of.C13088o<? super p466yf.C13995l0, ? super p355hf.C12074d<? super p336ef.C11921v>, ? extends java.lang.Object>) r12, (androidx.compose.runtime.Composer) r1, (int) r9)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0196
            float r0 = androidx.compose.material3.SliderKt.ThumbPressedElevation
            goto L_0x019a
        L_0x0196:
            float r0 = androidx.compose.material3.SliderKt.ThumbDefaultElevation
        L_0x019a:
            androidx.compose.material3.tokens.SliderTokens r9 = androidx.compose.material3.tokens.SliderTokens.INSTANCE
            androidx.compose.material3.tokens.ShapeKeyTokens r10 = r9.getHandleShape()
            r11 = 6
            androidx.compose.ui.graphics.Shape r11 = androidx.compose.material3.ShapesKt.toShape(r10, r1, r11)
            androidx.compose.ui.Modifier r12 = androidx.compose.foundation.layout.SizeKt.m33339size6HolHcs(r6, r14)
            r10 = 0
            float r9 = r9.m35169getStateLayerSizeD9Ej5fM()
            float r13 = (float) r4
            float r9 = r9 / r13
            float r13 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r9)
            r16 = 0
            r18 = 54
            r19 = 4
            r9 = r10
            r10 = r13
            r13 = r11
            r4 = r12
            r11 = r16
            r40 = r13
            r13 = r1
            r26 = r14
            r14 = r18
            r15 = r19
            androidx.compose.foundation.Indication r9 = androidx.compose.material.ripple.RippleKt.m34235rememberRipple9IZ8Weo(r9, r10, r11, r13, r14, r15)
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.IndicationKt.indication(r4, r2, r9)
            r9 = 0
            r10 = 0
            r11 = 2
            androidx.compose.ui.Modifier r16 = androidx.compose.foundation.HoverableKt.hoverable$default(r4, r2, r9, r11, r10)
            if (r5 == 0) goto L_0x01db
            goto L_0x01e0
        L_0x01db:
            float r0 = (float) r9
            float r0 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r0)
        L_0x01e0:
            r17 = r0
            r19 = 0
            r20 = 0
            r22 = 0
            r24 = 24
            r25 = 0
            r18 = r40
            androidx.compose.ui.Modifier r0 = androidx.compose.p002ui.draw.ShadowKt.m35337shadows4CzXII$default(r16, r17, r18, r19, r20, r22, r24, r25)
            int r4 = r3 >> 9
            r4 = r4 & 14
            int r3 = r3 >> 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            r3 = r3 | r4
            androidx.compose.runtime.State r3 = r7.thumbColor$material3_release(r5, r1, r3)
            java.lang.Object r3 = r3.getValue()
            androidx.compose.ui.graphics.Color r3 = (androidx.compose.p002ui.graphics.Color) r3
            long r3 = r3.m35681unboximpl()
            r10 = r40
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.BackgroundKt.m32956backgroundbw27NRU(r0, r3, r10)
            androidx.compose.foundation.layout.SpacerKt.Spacer(r0, r1, r9)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x021b
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x021b:
            r3 = r6
            r4 = r7
            r6 = r26
        L_0x021f:
            androidx.compose.runtime.ScopeUpdateScope r10 = r1.endRestartGroup()
            if (r10 != 0) goto L_0x0226
            goto L_0x0237
        L_0x0226:
            androidx.compose.material3.SliderDefaults$Thumb$2 r11 = new androidx.compose.material3.SliderDefaults$Thumb$2
            r0 = r11
            r1 = r37
            r2 = r38
            r8 = r45
            r9 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r9)
            r10.updateScope(r11)
        L_0x0237:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderDefaults.m34559Thumb9LiSoMs(androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.Modifier, androidx.compose.material3.SliderColors, boolean, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: androidx.compose.material3.SliderDefaults$Track$1$1} */
    /* JADX WARNING: type inference failed for: r3v0, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Track(androidx.compose.material3.SliderPositions r35, androidx.compose.p002ui.Modifier r36, androidx.compose.material3.SliderColors r37, boolean r38, androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            r34 = this;
            r6 = r35
            r7 = r40
            java.lang.String r0 = "sliderPositions"
            kotlin.jvm.internal.C12775o.m28639i(r6, r0)
            r0 = -1546713545(0xffffffffa3cf0637, float:-2.2445617E-17)
            r1 = r39
            androidx.compose.runtime.Composer r5 = r1.startRestartGroup(r0)
            r1 = r41 & 1
            r2 = 2
            if (r1 == 0) goto L_0x001a
            r1 = r7 | 6
            goto L_0x002a
        L_0x001a:
            r1 = r7 & 14
            if (r1 != 0) goto L_0x0029
            boolean r1 = r5.changed((java.lang.Object) r6)
            if (r1 == 0) goto L_0x0026
            r1 = 4
            goto L_0x0027
        L_0x0026:
            r1 = r2
        L_0x0027:
            r1 = r1 | r7
            goto L_0x002a
        L_0x0029:
            r1 = r7
        L_0x002a:
            r4 = r41 & 2
            if (r4 == 0) goto L_0x0031
            r1 = r1 | 48
            goto L_0x0044
        L_0x0031:
            r8 = r7 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x0044
            r8 = r36
            boolean r9 = r5.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x0040
            r9 = 32
            goto L_0x0042
        L_0x0040:
            r9 = 16
        L_0x0042:
            r1 = r1 | r9
            goto L_0x0046
        L_0x0044:
            r8 = r36
        L_0x0046:
            r9 = r7 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x005f
            r9 = r41 & 4
            if (r9 != 0) goto L_0x0059
            r9 = r37
            boolean r10 = r5.changed((java.lang.Object) r9)
            if (r10 == 0) goto L_0x005b
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x0059:
            r9 = r37
        L_0x005b:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r1 = r1 | r10
            goto L_0x0061
        L_0x005f:
            r9 = r37
        L_0x0061:
            r33 = r41 & 8
            if (r33 == 0) goto L_0x006a
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r15 = r38
            goto L_0x007c
        L_0x006a:
            r10 = r7 & 7168(0x1c00, float:1.0045E-41)
            r15 = r38
            if (r10 != 0) goto L_0x007c
            boolean r10 = r5.changed((boolean) r15)
            if (r10 == 0) goto L_0x0079
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r1 = r1 | r10
        L_0x007c:
            r10 = r41 & 16
            if (r10 == 0) goto L_0x0085
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r13 = r34
            goto L_0x0099
        L_0x0085:
            r10 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r7
            r13 = r34
            if (r10 != 0) goto L_0x0099
            boolean r10 = r5.changed((java.lang.Object) r13)
            if (r10 == 0) goto L_0x0096
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0096:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r1 = r1 | r10
        L_0x0099:
            r10 = 46811(0xb6db, float:6.5596E-41)
            r10 = r10 & r1
            r11 = 9362(0x2492, float:1.3119E-41)
            if (r10 != r11) goto L_0x00b1
            boolean r10 = r5.getSkipping()
            if (r10 != 0) goto L_0x00a8
            goto L_0x00b1
        L_0x00a8:
            r5.skipToGroupEnd()
            r11 = r5
        L_0x00ac:
            r3 = r8
            r4 = r9
            r5 = r15
            goto L_0x0198
        L_0x00b1:
            r5.startDefaults()
            r10 = r7 & 1
            r14 = 1
            if (r10 == 0) goto L_0x00cb
            boolean r10 = r5.getDefaultsInvalid()
            if (r10 == 0) goto L_0x00c0
            goto L_0x00cb
        L_0x00c0:
            r5.skipToGroupEnd()
            r4 = r41 & 4
            if (r4 == 0) goto L_0x00c9
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00c9:
            r3 = r14
            goto L_0x010a
        L_0x00cb:
            if (r4 == 0) goto L_0x00d0
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x00d1
        L_0x00d0:
            r4 = r8
        L_0x00d1:
            r8 = r41 & 4
            if (r8 == 0) goto L_0x0100
            r9 = 0
            r11 = 0
            r16 = 0
            r8 = r14
            r13 = r16
            r15 = r16
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r30 = 0
            int r29 = r1 >> 12
            r31 = r29 & 14
            r32 = 1023(0x3ff, float:1.434E-42)
            r3 = r8
            r8 = r34
            r29 = r5
            androidx.compose.material3.SliderColors r8 = r8.m34560colorsq0g_0yA(r9, r11, r13, r15, r17, r19, r21, r23, r25, r27, r29, r30, r31, r32)
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x0102
        L_0x0100:
            r3 = r14
            r8 = r9
        L_0x0102:
            if (r33 == 0) goto L_0x0106
            r15 = r3
            goto L_0x0108
        L_0x0106:
            r15 = r38
        L_0x0108:
            r9 = r8
            r8 = r4
        L_0x010a:
            r5.endDefaults()
            boolean r4 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r4 == 0) goto L_0x0119
            r4 = -1
            java.lang.String r10 = "androidx.compose.material3.SliderDefaults.Track (Slider.kt:731)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r4, r10)
        L_0x0119:
            int r0 = r1 >> 9
            r0 = r0 & 14
            r0 = r0 | 48
            r1 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            r10 = 0
            androidx.compose.runtime.State r1 = r9.trackColor$material3_release(r15, r10, r5, r0)
            androidx.compose.runtime.State r4 = r9.trackColor$material3_release(r15, r3, r5, r0)
            androidx.compose.runtime.State r11 = r9.tickColor$material3_release(r15, r10, r5, r0)
            androidx.compose.runtime.State r12 = r9.tickColor$material3_release(r15, r3, r5, r0)
            r0 = 0
            r13 = 0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(r8, r0, r3, r13)
            float r13 = androidx.compose.material3.SliderKt.getTrackHeight()
            androidx.compose.ui.Modifier r13 = androidx.compose.foundation.layout.SizeKt.m33324height3ABfNKs(r0, r13)
            r0 = 5
            java.lang.Object[] r14 = new java.lang.Object[r0]
            r14[r10] = r1
            r14[r3] = r6
            r14[r2] = r4
            r2 = 3
            r14[r2] = r11
            r2 = 4
            r14[r2] = r12
            r2 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r5.startReplaceableGroup(r2)
            r2 = r10
            r3 = r2
        L_0x0158:
            if (r2 >= r0) goto L_0x0165
            r0 = r14[r2]
            boolean r0 = r5.changed((java.lang.Object) r0)
            r3 = r3 | r0
            int r2 = r2 + 1
            r0 = 5
            goto L_0x0158
        L_0x0165:
            java.lang.Object r0 = r5.rememberedValue()
            if (r3 != 0) goto L_0x0176
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r0 != r2) goto L_0x0174
            goto L_0x0176
        L_0x0174:
            r11 = r5
            goto L_0x0185
        L_0x0176:
            androidx.compose.material3.SliderDefaults$Track$1$1 r14 = new androidx.compose.material3.SliderDefaults$Track$1$1
            r0 = r14
            r2 = r35
            r3 = r4
            r4 = r11
            r11 = r5
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r11.updateRememberedValue(r14)
        L_0x0185:
            r11.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            androidx.compose.foundation.CanvasKt.Canvas(r13, r0, r11, r10)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x00ac
            androidx.compose.runtime.ComposerKt.traceEventEnd()
            goto L_0x00ac
        L_0x0198:
            androidx.compose.runtime.ScopeUpdateScope r8 = r11.endRestartGroup()
            if (r8 != 0) goto L_0x019f
            goto L_0x01b0
        L_0x019f:
            androidx.compose.material3.SliderDefaults$Track$2 r9 = new androidx.compose.material3.SliderDefaults$Track$2
            r0 = r9
            r1 = r34
            r2 = r35
            r6 = r40
            r7 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.updateScope(r9)
        L_0x01b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderDefaults.Track(androidx.compose.material3.SliderPositions, androidx.compose.ui.Modifier, androidx.compose.material3.SliderColors, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    /* renamed from: colors-q0g_0yA  reason: not valid java name */
    public final SliderColors m34560colorsq0g_0yA(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, Composer composer, int i, int i2, int i3) {
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        Composer composer2 = composer;
        int i4 = i3;
        composer2.startReplaceableGroup(885588574);
        if ((i4 & 1) != 0) {
            j11 = ColorSchemeKt.toColor(SliderTokens.INSTANCE.getHandleColor(), composer2, 6);
        } else {
            j11 = j;
        }
        if ((i4 & 2) != 0) {
            j12 = ColorSchemeKt.toColor(SliderTokens.INSTANCE.getActiveTrackColor(), composer2, 6);
        } else {
            j12 = j2;
        }
        if ((i4 & 4) != 0) {
            j13 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(SliderTokens.INSTANCE.getTickMarksActiveContainerColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j13 = j3;
        }
        if ((i4 & 8) != 0) {
            j14 = ColorSchemeKt.toColor(SliderTokens.INSTANCE.getInactiveTrackColor(), composer2, 6);
        } else {
            j14 = j4;
        }
        if ((i4 & 16) != 0) {
            j15 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(SliderTokens.INSTANCE.getTickMarksInactiveContainerColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j15 = j5;
        }
        if ((i4 & 32) != 0) {
            j16 = ColorKt.m35716compositeOverOWjLjI(Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(SliderTokens.INSTANCE.getDisabledHandleColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), MaterialTheme.INSTANCE.getColorScheme(composer2, 6).m34323getSurface0d7_KjU());
        } else {
            j16 = j6;
        }
        if ((i4 & 64) != 0) {
            j17 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(SliderTokens.INSTANCE.getDisabledActiveTrackColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j17 = j7;
        }
        if ((i4 & 128) != 0) {
            j18 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(SliderTokens.INSTANCE.getTickMarksDisabledContainerColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j18 = j8;
        }
        if ((i4 & 256) != 0) {
            j19 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(SliderTokens.INSTANCE.getDisabledInactiveTrackColor(), composer2, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j19 = j9;
        }
        if ((i4 & 512) != 0) {
            j20 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(SliderTokens.INSTANCE.getTickMarksDisabledContainerColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j20 = j10;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(885588574, i, i2, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:618)");
        }
        SliderColors sliderColors = new SliderColors(j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return sliderColors;
    }
}
