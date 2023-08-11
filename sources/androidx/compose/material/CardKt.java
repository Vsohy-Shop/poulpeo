package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Card.kt\nandroidx/compose/material/CardKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,212:1\n154#2:213\n154#2:214\n154#2:222\n25#3:215\n25#3:223\n1114#4,6:216\n1114#4,6:224\n76#5:230\n*S KotlinDebug\n*F\n+ 1 Card.kt\nandroidx/compose/material/CardKt\n*L\n65#1:213\n116#1:214\n187#1:222\n117#1:215\n188#1:223\n117#1:216,6\n188#1:224,6\n189#1:230\n*E\n"})
/* compiled from: Card.kt */
public final class CardKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: androidx.compose.foundation.interaction.MutableInteractionSource} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.Composable
    /* renamed from: Card-9VG74zQ  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m33927Card9VG74zQ(p404of.C13074a<p336ef.C11921v> r23, androidx.compose.p002ui.Modifier r24, androidx.compose.p002ui.graphics.Shape r25, long r26, long r28, androidx.compose.foundation.BorderStroke r30, float r31, androidx.compose.foundation.interaction.MutableInteractionSource r32, androidx.compose.foundation.Indication r33, boolean r34, java.lang.String r35, androidx.compose.p002ui.semantics.Role r36, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r37, androidx.compose.runtime.Composer r38, int r39, int r40, int r41) {
        /*
            r15 = r38
            r0 = r39
            r1 = r40
            r2 = r41
            java.lang.String r3 = "onClick"
            r4 = r23
            kotlin.jvm.internal.C12775o.m28639i(r4, r3)
            java.lang.String r3 = "content"
            r14 = r37
            kotlin.jvm.internal.C12775o.m28639i(r14, r3)
            r3 = 1353606722(0x50ae6642, float:2.34074972E10)
            r15.startReplaceableGroup(r3)
            r5 = r2 & 2
            if (r5 == 0) goto L_0x0023
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x0025
        L_0x0023:
            r5 = r24
        L_0x0025:
            r6 = r2 & 4
            r7 = 6
            if (r6 == 0) goto L_0x0035
            androidx.compose.material.MaterialTheme r6 = androidx.compose.material.MaterialTheme.INSTANCE
            androidx.compose.material.Shapes r6 = r6.getShapes(r15, r7)
            androidx.compose.foundation.shape.CornerBasedShape r6 = r6.getMedium()
            goto L_0x0037
        L_0x0035:
            r6 = r25
        L_0x0037:
            r8 = r2 & 8
            if (r8 == 0) goto L_0x0046
            androidx.compose.material.MaterialTheme r8 = androidx.compose.material.MaterialTheme.INSTANCE
            androidx.compose.material.Colors r7 = r8.getColors(r15, r7)
            long r7 = r7.m33956getSurface0d7_KjU()
            goto L_0x0048
        L_0x0046:
            r7 = r26
        L_0x0048:
            r9 = r2 & 16
            if (r9 == 0) goto L_0x0055
            int r9 = r0 >> 9
            r9 = r9 & 14
            long r9 = androidx.compose.material.ColorsKt.m33970contentColorForek8zF_U(r7, r15, r9)
            goto L_0x0057
        L_0x0055:
            r9 = r28
        L_0x0057:
            r11 = r2 & 32
            if (r11 == 0) goto L_0x005d
            r11 = 0
            goto L_0x005f
        L_0x005d:
            r11 = r30
        L_0x005f:
            r13 = r2 & 64
            r12 = 1
            if (r13 == 0) goto L_0x006a
            float r13 = (float) r12
            float r13 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r13)
            goto L_0x006c
        L_0x006a:
            r13 = r31
        L_0x006c:
            r12 = r2 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L_0x0091
            r12 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r15.startReplaceableGroup(r12)
            java.lang.Object r12 = r38.rememberedValue()
            androidx.compose.runtime.Composer$Companion r16 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r16.getEmpty()
            if (r12 != r3) goto L_0x0089
            androidx.compose.foundation.interaction.MutableInteractionSource r12 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r15.updateRememberedValue(r12)
        L_0x0089:
            r38.endReplaceableGroup()
            r3 = r12
            androidx.compose.foundation.interaction.MutableInteractionSource r3 = (androidx.compose.foundation.interaction.MutableInteractionSource) r3
            r12 = r3
            goto L_0x0093
        L_0x0091:
            r12 = r32
        L_0x0093:
            r3 = r2 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x00a4
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.foundation.IndicationKt.getLocalIndication()
            java.lang.Object r3 = r15.consume(r3)
            androidx.compose.foundation.Indication r3 = (androidx.compose.foundation.Indication) r3
            r19 = r3
            goto L_0x00a6
        L_0x00a4:
            r19 = r33
        L_0x00a6:
            r3 = r2 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x00ad
            r20 = 1
            goto L_0x00af
        L_0x00ad:
            r20 = r34
        L_0x00af:
            r3 = r2 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x00b6
            r21 = 0
            goto L_0x00b8
        L_0x00b6:
            r21 = r35
        L_0x00b8:
            r2 = r2 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x00bf
            r22 = 0
            goto L_0x00c1
        L_0x00bf:
            r22 = r36
        L_0x00c1:
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x00cf
            java.lang.String r2 = "androidx.compose.material.Card (Card.kt:179)"
            r3 = 1353606722(0x50ae6642, float:2.34074972E10)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r0, r1, r2)
        L_0x00cf:
            r2 = r0 & 14
            r3 = r0 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            r3 = r0 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            r3 = r0 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r0
            r2 = r2 | r3
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r0
            r2 = r2 | r3
            r3 = 3670016(0x380000, float:5.142788E-39)
            r3 = r3 & r0
            r2 = r2 | r3
            r3 = 29360128(0x1c00000, float:7.052966E-38)
            r3 = r3 & r0
            r2 = r2 | r3
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r0
            r2 = r2 | r3
            r3 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r0 & r3
            r16 = r2 | r0
            r0 = r1 & 14
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r1 = r1 & 896(0x380, float:1.256E-42)
            r17 = r0 | r1
            r18 = 0
            r0 = r23
            r1 = r5
            r2 = r6
            r3 = r7
            r5 = r9
            r7 = r11
            r8 = r13
            r9 = r12
            r10 = r19
            r11 = r20
            r12 = r21
            r13 = r22
            r14 = r37
            r15 = r38
            androidx.compose.material.SurfaceKt.m34126Surface9VG74zQ(r0, r1, r2, r3, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0120
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0120:
            r38.endReplaceableGroup()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.CardKt.m33927Card9VG74zQ(of.a, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.foundation.BorderStroke, float, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.Indication, boolean, java.lang.String, androidx.compose.ui.semantics.Role, of.o, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @Composable
    /* renamed from: Card-F-jzlyU  reason: not valid java name */
    public static final void m33928CardFjzlyU(Modifier modifier, Shape shape, long j, long j2, BorderStroke borderStroke, float f, C13088o<? super Composer, ? super Integer, C11921v> oVar, Composer composer, int i, int i2) {
        Modifier modifier2;
        Shape shape2;
        long j3;
        long j4;
        BorderStroke borderStroke2;
        float f2;
        Composer composer2 = composer;
        int i3 = i;
        C12775o.m28639i(oVar, "content");
        composer2.startReplaceableGroup(1956755640);
        if ((i2 & 1) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if ((i2 & 2) != 0) {
            shape2 = MaterialTheme.INSTANCE.getShapes(composer2, 6).getMedium();
        } else {
            shape2 = shape;
        }
        if ((i2 & 4) != 0) {
            j3 = MaterialTheme.INSTANCE.getColors(composer2, 6).m33956getSurface0d7_KjU();
        } else {
            j3 = j;
        }
        if ((i2 & 8) != 0) {
            j4 = ColorsKt.m33970contentColorForek8zF_U(j3, composer2, (i3 >> 6) & 14);
        } else {
            j4 = j2;
        }
        if ((i2 & 16) != 0) {
            borderStroke2 = null;
        } else {
            borderStroke2 = borderStroke;
        }
        if ((i2 & 32) != 0) {
            f2 = C1232Dp.m38468constructorimpl((float) 1);
        } else {
            f2 = f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1956755640, i3, -1, "androidx.compose.material.Card (Card.kt:58)");
        }
        SurfaceKt.m34127SurfaceFjzlyU(modifier2, shape2, j3, j4, borderStroke2, f2, oVar, composer, (i3 & 14) | (i3 & 112) | (i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (i3 & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @ExperimentalMaterialApi
    @Composable
    /* renamed from: Card-LPr_se0  reason: not valid java name */
    public static final void m33929CardLPr_se0(C13074a<C11921v> aVar, Modifier modifier, boolean z, Shape shape, long j, long j2, BorderStroke borderStroke, float f, MutableInteractionSource mutableInteractionSource, C13088o<? super Composer, ? super Integer, C11921v> oVar, Composer composer, int i, int i2) {
        Modifier modifier2;
        boolean z2;
        Shape shape2;
        long j3;
        long j4;
        BorderStroke borderStroke2;
        float f2;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2 = composer;
        int i3 = i;
        int i4 = i2;
        C12775o.m28639i(aVar, "onClick");
        C12775o.m28639i(oVar, "content");
        composer2.startReplaceableGroup(778538979);
        if ((i4 & 2) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if ((i4 & 4) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        if ((i4 & 8) != 0) {
            shape2 = MaterialTheme.INSTANCE.getShapes(composer2, 6).getMedium();
        } else {
            shape2 = shape;
        }
        if ((i4 & 16) != 0) {
            j3 = MaterialTheme.INSTANCE.getColors(composer2, 6).m33956getSurface0d7_KjU();
        } else {
            j3 = j;
        }
        if ((i4 & 32) != 0) {
            j4 = ColorsKt.m33970contentColorForek8zF_U(j3, composer2, (i3 >> 12) & 14);
        } else {
            j4 = j2;
        }
        if ((i4 & 64) != 0) {
            borderStroke2 = null;
        } else {
            borderStroke2 = borderStroke;
        }
        if ((i4 & 128) != 0) {
            f2 = C1232Dp.m38468constructorimpl((float) 1);
        } else {
            f2 = f;
        }
        if ((i4 & 256) != 0) {
            composer2.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer2.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(778538979, i3, -1, "androidx.compose.material.Card (Card.kt:107)");
        }
        SurfaceKt.m34128SurfaceLPr_se0(aVar, modifier2, z2, shape2, j3, j4, borderStroke2, f2, mutableInteractionSource2, oVar, composer, (i3 & 14) | (i3 & 112) | (i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (29360128 & i3) | (234881024 & i3) | (i3 & 1879048192), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }
}
