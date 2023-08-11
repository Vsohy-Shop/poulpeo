package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.tokens.FilledTextFieldTokens;
import androidx.compose.material3.tokens.OutlinedTextFieldTokens;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
@ExperimentalMaterial3Api
/* compiled from: TextFieldDefaults.kt */
public final class TextFieldDefaults {
    private static final float FocusedBorderThickness = C1232Dp.m38468constructorimpl((float) 2);
    public static final TextFieldDefaults INSTANCE = new TextFieldDefaults();
    private static final float MinHeight = C1232Dp.m38468constructorimpl((float) 56);
    private static final float MinWidth = C1232Dp.m38468constructorimpl((float) 280);
    private static final float UnfocusedBorderThickness = C1232Dp.m38468constructorimpl((float) 1);

    private TextFieldDefaults() {
    }

    /* renamed from: indicatorLine-gv0btCI$default  reason: not valid java name */
    public static /* synthetic */ Modifier m34648indicatorLinegv0btCI$default(TextFieldDefaults textFieldDefaults, Modifier modifier, boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, float f, float f2, int i, Object obj) {
        float f3;
        float f4;
        if ((i & 16) != 0) {
            f3 = FocusedBorderThickness;
        } else {
            f3 = f;
        }
        if ((i & 32) != 0) {
            f4 = UnfocusedBorderThickness;
        } else {
            f4 = f2;
        }
        return textFieldDefaults.m34658indicatorLinegv0btCI(modifier, z, z2, interactionSource, textFieldColors, f3, f4);
    }

    /* renamed from: outlinedTextFieldPadding-a9UjIt4$default  reason: not valid java name */
    public static /* synthetic */ PaddingValues m34649outlinedTextFieldPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m34660outlinedTextFieldPaddinga9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: supportingTextPadding-a9UjIt4$material3_release$default  reason: not valid java name */
    public static /* synthetic */ PaddingValues m34650supportingTextPaddinga9UjIt4$material3_release$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getSupportingTopPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = C1232Dp.m38468constructorimpl((float) 0);
        }
        return textFieldDefaults.m34661supportingTextPaddinga9UjIt4$material3_release(f, f2, f3, f4);
    }

    /* renamed from: textFieldWithLabelPadding-a9UjIt4$default  reason: not valid java name */
    public static /* synthetic */ PaddingValues m34651textFieldWithLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldKt.getFirstBaselineOffset();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldKt.getTextFieldBottomPadding();
        }
        return textFieldDefaults.m34663textFieldWithLabelPaddinga9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4$default  reason: not valid java name */
    public static /* synthetic */ PaddingValues m34652textFieldWithoutLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m34664textFieldWithoutLabelPaddinga9UjIt4(f, f2, f3, f4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00e1, code lost:
        if ((r27 & 16) != 0) goto L_0x00f0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FilledContainerBox(boolean r20, boolean r21, androidx.compose.foundation.interaction.InteractionSource r22, androidx.compose.material3.TextFieldColors r23, androidx.compose.p002ui.graphics.Shape r24, androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            r19 = this;
            r10 = r19
            r11 = r22
            r12 = r23
            r13 = r26
            java.lang.String r0 = "interactionSource"
            kotlin.jvm.internal.C12775o.m28639i(r11, r0)
            java.lang.String r0 = "colors"
            kotlin.jvm.internal.C12775o.m28639i(r12, r0)
            r0 = -1358797526(0xffffffffaf02652a, float:-1.1859372E-10)
            r1 = r25
            androidx.compose.runtime.Composer r14 = r1.startRestartGroup(r0)
            r1 = r27 & 1
            if (r1 == 0) goto L_0x0024
            r1 = r13 | 6
            r15 = r20
            goto L_0x0036
        L_0x0024:
            r1 = r13 & 14
            r15 = r20
            if (r1 != 0) goto L_0x0035
            boolean r1 = r14.changed((boolean) r15)
            if (r1 == 0) goto L_0x0032
            r1 = 4
            goto L_0x0033
        L_0x0032:
            r1 = 2
        L_0x0033:
            r1 = r1 | r13
            goto L_0x0036
        L_0x0035:
            r1 = r13
        L_0x0036:
            r2 = r27 & 2
            if (r2 == 0) goto L_0x003f
            r1 = r1 | 48
            r9 = r21
            goto L_0x0051
        L_0x003f:
            r2 = r13 & 112(0x70, float:1.57E-43)
            r9 = r21
            if (r2 != 0) goto L_0x0051
            boolean r2 = r14.changed((boolean) r9)
            if (r2 == 0) goto L_0x004e
            r2 = 32
            goto L_0x0050
        L_0x004e:
            r2 = 16
        L_0x0050:
            r1 = r1 | r2
        L_0x0051:
            r2 = r27 & 4
            if (r2 == 0) goto L_0x0058
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0058:
            r2 = r13 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0068
            boolean r2 = r14.changed((java.lang.Object) r11)
            if (r2 == 0) goto L_0x0065
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0067
        L_0x0065:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0067:
            r1 = r1 | r2
        L_0x0068:
            r2 = r27 & 8
            if (r2 == 0) goto L_0x006f
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007f
        L_0x006f:
            r2 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x007f
            boolean r2 = r14.changed((java.lang.Object) r12)
            if (r2 == 0) goto L_0x007c
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r1 = r1 | r2
        L_0x007f:
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r13
            if (r2 != 0) goto L_0x009a
            r2 = r27 & 16
            if (r2 != 0) goto L_0x0094
            r2 = r24
            boolean r3 = r14.changed((java.lang.Object) r2)
            if (r3 == 0) goto L_0x0096
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0094:
            r2 = r24
        L_0x0096:
            r3 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r1 = r1 | r3
            goto L_0x009c
        L_0x009a:
            r2 = r24
        L_0x009c:
            r3 = r27 & 32
            if (r3 == 0) goto L_0x00a4
            r3 = 196608(0x30000, float:2.75506E-40)
        L_0x00a2:
            r1 = r1 | r3
            goto L_0x00b5
        L_0x00a4:
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r13
            if (r3 != 0) goto L_0x00b5
            boolean r3 = r14.changed((java.lang.Object) r10)
            if (r3 == 0) goto L_0x00b2
            r3 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a2
        L_0x00b2:
            r3 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00a2
        L_0x00b5:
            r3 = 374491(0x5b6db, float:5.24774E-40)
            r3 = r3 & r1
            r4 = 74898(0x12492, float:1.04954E-40)
            if (r3 != r4) goto L_0x00cb
            boolean r3 = r14.getSkipping()
            if (r3 != 0) goto L_0x00c5
            goto L_0x00cb
        L_0x00c5:
            r14.skipToGroupEnd()
            r6 = r2
            goto L_0x0142
        L_0x00cb:
            r14.startDefaults()
            r3 = r13 & 1
            r4 = -57345(0xffffffffffff1fff, float:NaN)
            if (r3 == 0) goto L_0x00e4
            boolean r3 = r14.getDefaultsInvalid()
            if (r3 == 0) goto L_0x00dc
            goto L_0x00e4
        L_0x00dc:
            r14.skipToGroupEnd()
            r3 = r27 & 16
            if (r3 == 0) goto L_0x00f1
            goto L_0x00f0
        L_0x00e4:
            r3 = r27 & 16
            if (r3 == 0) goto L_0x00f1
            int r2 = r1 >> 15
            r2 = r2 & 14
            androidx.compose.ui.graphics.Shape r2 = r10.getFilledShape(r14, r2)
        L_0x00f0:
            r1 = r1 & r4
        L_0x00f1:
            r8 = r2
            r14.endDefaults()
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x0101
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.TextFieldDefaults.FilledContainerBox (TextFieldDefaults.kt:102)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r2, r3)
        L_0x0101:
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            int r1 = r1 >> 9
            r1 = r1 & 14
            androidx.compose.runtime.State r1 = r12.containerColor$material3_release(r14, r1)
            java.lang.Object r1 = r1.getValue()
            androidx.compose.ui.graphics.Color r1 = (androidx.compose.p002ui.graphics.Color) r1
            long r1 = r1.m35681unboximpl()
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.BackgroundKt.m32956backgroundbw27NRU(r0, r1, r8)
            r6 = 0
            r7 = 0
            r16 = 48
            r17 = 0
            r0 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r18 = r8
            r8 = r16
            r9 = r17
            androidx.compose.ui.Modifier r0 = m34648indicatorLinegv0btCI$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = 0
            androidx.compose.foundation.layout.BoxKt.Box(r0, r14, r1)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0140
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0140:
            r6 = r18
        L_0x0142:
            androidx.compose.runtime.ScopeUpdateScope r9 = r14.endRestartGroup()
            if (r9 != 0) goto L_0x0149
            goto L_0x0160
        L_0x0149:
            androidx.compose.material3.TextFieldDefaults$FilledContainerBox$1 r14 = new androidx.compose.material3.TextFieldDefaults$FilledContainerBox$1
            r0 = r14
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r7 = r26
            r8 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.updateScope(r14)
        L_0x0160:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.FilledContainerBox(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.material3.TextFieldColors, androidx.compose.ui.graphics.Shape, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01ca  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.Composable
    /* renamed from: OutlinedBorderContainerBox-nbWgWpA  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m34653OutlinedBorderContainerBoxnbWgWpA(boolean r21, boolean r22, androidx.compose.foundation.interaction.InteractionSource r23, androidx.compose.material3.TextFieldColors r24, androidx.compose.p002ui.graphics.Shape r25, float r26, float r27, androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            r20 = this;
            r8 = r23
            r9 = r24
            r10 = r29
            r11 = r30
            java.lang.String r0 = "interactionSource"
            kotlin.jvm.internal.C12775o.m28639i(r8, r0)
            java.lang.String r0 = "colors"
            kotlin.jvm.internal.C12775o.m28639i(r9, r0)
            r0 = -1998946250(0xffffffff88da8036, float:-1.315054E-33)
            r1 = r28
            androidx.compose.runtime.Composer r12 = r1.startRestartGroup(r0)
            r1 = r11 & 1
            if (r1 == 0) goto L_0x0024
            r1 = r10 | 6
            r13 = r21
            goto L_0x0036
        L_0x0024:
            r1 = r10 & 14
            r13 = r21
            if (r1 != 0) goto L_0x0035
            boolean r1 = r12.changed((boolean) r13)
            if (r1 == 0) goto L_0x0032
            r1 = 4
            goto L_0x0033
        L_0x0032:
            r1 = 2
        L_0x0033:
            r1 = r1 | r10
            goto L_0x0036
        L_0x0035:
            r1 = r10
        L_0x0036:
            r2 = r11 & 2
            if (r2 == 0) goto L_0x003f
            r1 = r1 | 48
            r14 = r22
            goto L_0x0051
        L_0x003f:
            r2 = r10 & 112(0x70, float:1.57E-43)
            r14 = r22
            if (r2 != 0) goto L_0x0051
            boolean r2 = r12.changed((boolean) r14)
            if (r2 == 0) goto L_0x004e
            r2 = 32
            goto L_0x0050
        L_0x004e:
            r2 = 16
        L_0x0050:
            r1 = r1 | r2
        L_0x0051:
            r2 = r11 & 4
            if (r2 == 0) goto L_0x0058
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0058:
            r2 = r10 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0068
            boolean r2 = r12.changed((java.lang.Object) r8)
            if (r2 == 0) goto L_0x0065
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0067
        L_0x0065:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0067:
            r1 = r1 | r2
        L_0x0068:
            r2 = r11 & 8
            if (r2 == 0) goto L_0x006f
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007f
        L_0x006f:
            r2 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x007f
            boolean r2 = r12.changed((java.lang.Object) r9)
            if (r2 == 0) goto L_0x007c
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r1 = r1 | r2
        L_0x007f:
            r2 = 57344(0xe000, float:8.0356E-41)
            r3 = r10 & r2
            if (r3 != 0) goto L_0x009b
            r3 = r11 & 16
            if (r3 != 0) goto L_0x0095
            r3 = r25
            boolean r4 = r12.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0097
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0095:
            r3 = r25
        L_0x0097:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r1 = r1 | r4
            goto L_0x009d
        L_0x009b:
            r3 = r25
        L_0x009d:
            r4 = 458752(0x70000, float:6.42848E-40)
            r5 = r10 & r4
            if (r5 != 0) goto L_0x00b8
            r5 = r11 & 32
            if (r5 != 0) goto L_0x00b2
            r5 = r26
            boolean r6 = r12.changed((float) r5)
            if (r6 == 0) goto L_0x00b4
            r6 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b6
        L_0x00b2:
            r5 = r26
        L_0x00b4:
            r6 = 65536(0x10000, float:9.18355E-41)
        L_0x00b6:
            r1 = r1 | r6
            goto L_0x00ba
        L_0x00b8:
            r5 = r26
        L_0x00ba:
            r6 = 3670016(0x380000, float:5.142788E-39)
            r6 = r6 & r10
            if (r6 != 0) goto L_0x00d4
            r6 = r11 & 64
            if (r6 != 0) goto L_0x00ce
            r6 = r27
            boolean r7 = r12.changed((float) r6)
            if (r7 == 0) goto L_0x00d0
            r7 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d2
        L_0x00ce:
            r6 = r27
        L_0x00d0:
            r7 = 524288(0x80000, float:7.34684E-40)
        L_0x00d2:
            r1 = r1 | r7
            goto L_0x00d6
        L_0x00d4:
            r6 = r27
        L_0x00d6:
            r7 = r11 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x00e0
            r7 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r7
            r15 = r20
            goto L_0x00f3
        L_0x00e0:
            r7 = 29360128(0x1c00000, float:7.052966E-38)
            r7 = r7 & r10
            r15 = r20
            if (r7 != 0) goto L_0x00f3
            boolean r7 = r12.changed((java.lang.Object) r15)
            if (r7 == 0) goto L_0x00f0
            r7 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f2
        L_0x00f0:
            r7 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f2:
            r1 = r1 | r7
        L_0x00f3:
            r7 = 23967451(0x16db6db, float:4.3661218E-38)
            r7 = r7 & r1
            r4 = 4793490(0x492492, float:6.71711E-39)
            if (r7 != r4) goto L_0x010b
            boolean r4 = r12.getSkipping()
            if (r4 != 0) goto L_0x0103
            goto L_0x010b
        L_0x0103:
            r12.skipToGroupEnd()
            r7 = r5
            r8 = r6
            r6 = r3
            goto L_0x01d2
        L_0x010b:
            r12.startDefaults()
            r4 = r10 & 1
            r7 = -3670017(0xffffffffffc7ffff, float:NaN)
            r16 = -458753(0xfffffffffff8ffff, float:NaN)
            r17 = -57345(0xffffffffffff1fff, float:NaN)
            if (r4 == 0) goto L_0x0137
            boolean r4 = r12.getDefaultsInvalid()
            if (r4 == 0) goto L_0x0122
            goto L_0x0137
        L_0x0122:
            r12.skipToGroupEnd()
            r4 = r11 & 16
            if (r4 == 0) goto L_0x012b
            r1 = r1 & r17
        L_0x012b:
            r4 = r11 & 32
            if (r4 == 0) goto L_0x0131
            r1 = r1 & r16
        L_0x0131:
            r4 = r11 & 64
            if (r4 == 0) goto L_0x015f
            r1 = r1 & r7
            goto L_0x015f
        L_0x0137:
            r4 = r11 & 16
            if (r4 == 0) goto L_0x0148
            androidx.compose.material3.tokens.OutlinedTextFieldTokens r3 = androidx.compose.material3.tokens.OutlinedTextFieldTokens.INSTANCE
            androidx.compose.material3.tokens.ShapeKeyTokens r3 = r3.getContainerShape()
            r4 = 6
            androidx.compose.ui.graphics.Shape r3 = androidx.compose.material3.ShapesKt.toShape(r3, r12, r4)
            r1 = r1 & r17
        L_0x0148:
            r4 = r11 & 32
            if (r4 == 0) goto L_0x0151
            float r4 = FocusedBorderThickness
            r1 = r1 & r16
            r5 = r4
        L_0x0151:
            r4 = r11 & 64
            if (r4 == 0) goto L_0x015f
            float r4 = UnfocusedBorderThickness
            r1 = r1 & r7
            r6 = r1
            r7 = r3
            r17 = r4
            r16 = r5
            goto L_0x0165
        L_0x015f:
            r7 = r3
            r16 = r5
            r17 = r6
            r6 = r1
        L_0x0165:
            r12.endDefaults()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x0174
            r1 = -1
            java.lang.String r3 = "androidx.compose.material3.TextFieldDefaults.OutlinedBorderContainerBox (TextFieldDefaults.kt:175)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r6, r1, r3)
        L_0x0174:
            r0 = r6 & 14
            r1 = r6 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            r1 = r6 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            r1 = r6 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r1
            int r1 = r6 >> 3
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r2
            r18 = r0 | r1
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r16
            r5 = r17
            r19 = r6
            r6 = r12
            r8 = r7
            r7 = r18
            androidx.compose.runtime.State r0 = androidx.compose.material3.TextFieldDefaultsKt.m34666animateBorderStrokeAsStateNuRrP5Q(r0, r1, r2, r3, r4, r5, r6, r7)
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.p002ui.Modifier.Companion
            java.lang.Object r0 = r0.getValue()
            androidx.compose.foundation.BorderStroke r0 = (androidx.compose.foundation.BorderStroke) r0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.BorderKt.border(r1, r0, r8)
            int r1 = r19 >> 9
            r1 = r1 & 14
            androidx.compose.runtime.State r1 = r9.containerColor$material3_release(r12, r1)
            java.lang.Object r1 = r1.getValue()
            androidx.compose.ui.graphics.Color r1 = (androidx.compose.p002ui.graphics.Color) r1
            long r1 = r1.m35681unboximpl()
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.BackgroundKt.m32956backgroundbw27NRU(r0, r1, r8)
            r1 = 0
            androidx.compose.foundation.layout.BoxKt.Box(r0, r12, r1)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01cd
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01cd:
            r6 = r8
            r7 = r16
            r8 = r17
        L_0x01d2:
            androidx.compose.runtime.ScopeUpdateScope r12 = r12.endRestartGroup()
            if (r12 != 0) goto L_0x01d9
            goto L_0x01f1
        L_0x01d9:
            androidx.compose.material3.TextFieldDefaults$OutlinedBorderContainerBox$1 r5 = new androidx.compose.material3.TextFieldDefaults$OutlinedBorderContainerBox$1
            r0 = r5
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r13 = r5
            r5 = r24
            r9 = r29
            r10 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r12.updateScope(r13)
        L_0x01f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.m34653OutlinedBorderContainerBoxnbWgWpA(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.material3.TextFieldColors, androidx.compose.ui.graphics.Shape, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01b6, code lost:
        if (r8.changed((java.lang.Object) r96) != false) goto L_0x01bd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x03e5  */
    /* JADX WARNING: Removed duplicated region for block: B:223:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x013c  */
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void OutlinedTextFieldDecorationBox(java.lang.String r83, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r84, boolean r85, boolean r86, androidx.compose.p002ui.text.input.VisualTransformation r87, androidx.compose.foundation.interaction.InteractionSource r88, boolean r89, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r90, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r91, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r92, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r93, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r94, androidx.compose.material3.TextFieldColors r95, androidx.compose.foundation.layout.PaddingValues r96, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r97, androidx.compose.runtime.Composer r98, int r99, int r100, int r101) {
        /*
            r82 = this;
            r15 = r83
            r14 = r84
            r13 = r87
            r12 = r88
            r11 = r99
            r10 = r100
            r9 = r101
            java.lang.String r0 = "value"
            kotlin.jvm.internal.C12775o.m28639i(r15, r0)
            java.lang.String r0 = "innerTextField"
            kotlin.jvm.internal.C12775o.m28639i(r14, r0)
            java.lang.String r0 = "visualTransformation"
            kotlin.jvm.internal.C12775o.m28639i(r13, r0)
            java.lang.String r0 = "interactionSource"
            kotlin.jvm.internal.C12775o.m28639i(r12, r0)
            r0 = 508645792(0x1e5151a0, float:1.10812475E-20)
            r1 = r98
            androidx.compose.runtime.Composer r8 = r1.startRestartGroup(r0)
            r0 = r9 & 1
            if (r0 == 0) goto L_0x0032
            r0 = r11 | 6
            goto L_0x0042
        L_0x0032:
            r0 = r11 & 14
            if (r0 != 0) goto L_0x0041
            boolean r0 = r8.changed((java.lang.Object) r15)
            if (r0 == 0) goto L_0x003e
            r0 = 4
            goto L_0x003f
        L_0x003e:
            r0 = 2
        L_0x003f:
            r0 = r0 | r11
            goto L_0x0042
        L_0x0041:
            r0 = r11
        L_0x0042:
            r3 = r9 & 2
            if (r3 == 0) goto L_0x0049
            r0 = r0 | 48
            goto L_0x0059
        L_0x0049:
            r3 = r11 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0059
            boolean r3 = r8.changed((java.lang.Object) r14)
            if (r3 == 0) goto L_0x0056
            r3 = 32
            goto L_0x0058
        L_0x0056:
            r3 = 16
        L_0x0058:
            r0 = r0 | r3
        L_0x0059:
            r3 = r9 & 4
            if (r3 == 0) goto L_0x0060
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0074
        L_0x0060:
            r3 = r11 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0074
            r3 = r85
            boolean r16 = r8.changed((boolean) r3)
            if (r16 == 0) goto L_0x006f
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0071
        L_0x006f:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0071:
            r0 = r0 | r16
            goto L_0x0076
        L_0x0074:
            r3 = r85
        L_0x0076:
            r16 = r9 & 8
            r17 = 2048(0x800, float:2.87E-42)
            r18 = 1024(0x400, float:1.435E-42)
            if (r16 == 0) goto L_0x0081
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0095
        L_0x0081:
            r1 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x0095
            r1 = r86
            boolean r16 = r8.changed((boolean) r1)
            if (r16 == 0) goto L_0x0090
            r16 = r17
            goto L_0x0092
        L_0x0090:
            r16 = r18
        L_0x0092:
            r0 = r0 | r16
            goto L_0x0097
        L_0x0095:
            r1 = r86
        L_0x0097:
            r16 = r9 & 16
            r19 = 16384(0x4000, float:2.2959E-41)
            r77 = 57344(0xe000, float:8.0356E-41)
            r20 = 8192(0x2000, float:1.14794E-41)
            if (r16 == 0) goto L_0x00a5
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00b6
        L_0x00a5:
            r16 = r11 & r77
            if (r16 != 0) goto L_0x00b6
            boolean r16 = r8.changed((java.lang.Object) r13)
            if (r16 == 0) goto L_0x00b2
            r16 = r19
            goto L_0x00b4
        L_0x00b2:
            r16 = r20
        L_0x00b4:
            r0 = r0 | r16
        L_0x00b6:
            r16 = r9 & 32
            r78 = 458752(0x70000, float:6.42848E-40)
            if (r16 == 0) goto L_0x00c1
            r16 = 196608(0x30000, float:2.75506E-40)
        L_0x00be:
            r0 = r0 | r16
            goto L_0x00d1
        L_0x00c1:
            r16 = r11 & r78
            if (r16 != 0) goto L_0x00d1
            boolean r16 = r8.changed((java.lang.Object) r12)
            if (r16 == 0) goto L_0x00ce
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00be
        L_0x00ce:
            r16 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00be
        L_0x00d1:
            r16 = r9 & 64
            if (r16 == 0) goto L_0x00dc
            r21 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 | r21
            r2 = r89
            goto L_0x00f1
        L_0x00dc:
            r21 = 3670016(0x380000, float:5.142788E-39)
            r21 = r11 & r21
            r2 = r89
            if (r21 != 0) goto L_0x00f1
            boolean r22 = r8.changed((boolean) r2)
            if (r22 == 0) goto L_0x00ed
            r22 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ef
        L_0x00ed:
            r22 = 524288(0x80000, float:7.34684E-40)
        L_0x00ef:
            r0 = r0 | r22
        L_0x00f1:
            r4 = r9 & 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x00fc
            r23 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r23
            r5 = r90
            goto L_0x0111
        L_0x00fc:
            r23 = 29360128(0x1c00000, float:7.052966E-38)
            r23 = r11 & r23
            r5 = r90
            if (r23 != 0) goto L_0x0111
            boolean r24 = r8.changed((java.lang.Object) r5)
            if (r24 == 0) goto L_0x010d
            r24 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x010f
        L_0x010d:
            r24 = 4194304(0x400000, float:5.877472E-39)
        L_0x010f:
            r0 = r0 | r24
        L_0x0111:
            r6 = r9 & 256(0x100, float:3.59E-43)
            r79 = 234881024(0xe000000, float:1.5777218E-30)
            if (r6 == 0) goto L_0x011e
            r25 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 | r25
            r7 = r91
            goto L_0x0131
        L_0x011e:
            r25 = r11 & r79
            r7 = r91
            if (r25 != 0) goto L_0x0131
            boolean r26 = r8.changed((java.lang.Object) r7)
            if (r26 == 0) goto L_0x012d
            r26 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x012f
        L_0x012d:
            r26 = 33554432(0x2000000, float:9.403955E-38)
        L_0x012f:
            r0 = r0 | r26
        L_0x0131:
            r1 = r9 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x013c
            r26 = 805306368(0x30000000, float:4.656613E-10)
            r0 = r0 | r26
            r2 = r92
            goto L_0x0151
        L_0x013c:
            r26 = 1879048192(0x70000000, float:1.58456325E29)
            r26 = r11 & r26
            r2 = r92
            if (r26 != 0) goto L_0x0151
            boolean r26 = r8.changed((java.lang.Object) r2)
            if (r26 == 0) goto L_0x014d
            r26 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x014f
        L_0x014d:
            r26 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x014f:
            r0 = r0 | r26
        L_0x0151:
            r2 = r9 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x015a
            r21 = r10 | 6
            r3 = r93
            goto L_0x0170
        L_0x015a:
            r26 = r10 & 14
            r3 = r93
            if (r26 != 0) goto L_0x016e
            boolean r26 = r8.changed((java.lang.Object) r3)
            if (r26 == 0) goto L_0x0169
            r21 = 4
            goto L_0x016b
        L_0x0169:
            r21 = 2
        L_0x016b:
            r21 = r10 | r21
            goto L_0x0170
        L_0x016e:
            r21 = r10
        L_0x0170:
            r3 = r9 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x0179
            r21 = r21 | 48
            r5 = r94
            goto L_0x018c
        L_0x0179:
            r26 = r10 & 112(0x70, float:1.57E-43)
            r5 = r94
            if (r26 != 0) goto L_0x018c
            boolean r26 = r8.changed((java.lang.Object) r5)
            if (r26 == 0) goto L_0x0188
            r22 = 32
            goto L_0x018a
        L_0x0188:
            r22 = 16
        L_0x018a:
            r21 = r21 | r22
        L_0x018c:
            r5 = r10 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x01a6
            r5 = r9 & 4096(0x1000, float:5.74E-42)
            if (r5 != 0) goto L_0x019f
            r5 = r95
            boolean r22 = r8.changed((java.lang.Object) r5)
            if (r22 == 0) goto L_0x01a1
            r24 = 256(0x100, float:3.59E-43)
            goto L_0x01a3
        L_0x019f:
            r5 = r95
        L_0x01a1:
            r24 = 128(0x80, float:1.794E-43)
        L_0x01a3:
            r21 = r21 | r24
            goto L_0x01a8
        L_0x01a6:
            r5 = r95
        L_0x01a8:
            r5 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x01c0
            r5 = r9 & 8192(0x2000, float:1.14794E-41)
            if (r5 != 0) goto L_0x01b9
            r5 = r96
            boolean r22 = r8.changed((java.lang.Object) r5)
            if (r22 == 0) goto L_0x01bb
            goto L_0x01bd
        L_0x01b9:
            r5 = r96
        L_0x01bb:
            r17 = r18
        L_0x01bd:
            r21 = r21 | r17
            goto L_0x01c2
        L_0x01c0:
            r5 = r96
        L_0x01c2:
            r5 = r21
            r7 = r9 & 16384(0x4000, float:2.2959E-41)
            if (r7 == 0) goto L_0x01cd
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
            r12 = r97
            goto L_0x01de
        L_0x01cd:
            r17 = r10 & r77
            r12 = r97
            if (r17 != 0) goto L_0x01de
            boolean r17 = r8.changed((java.lang.Object) r12)
            if (r17 == 0) goto L_0x01da
            goto L_0x01dc
        L_0x01da:
            r19 = r20
        L_0x01dc:
            r5 = r5 | r19
        L_0x01de:
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r9 & r17
            if (r17 == 0) goto L_0x01ec
            r17 = 196608(0x30000, float:2.75506E-40)
            r5 = r5 | r17
            r15 = r82
            goto L_0x01ff
        L_0x01ec:
            r17 = r10 & r78
            r15 = r82
            if (r17 != 0) goto L_0x01ff
            boolean r17 = r8.changed((java.lang.Object) r15)
            if (r17 == 0) goto L_0x01fb
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01fd
        L_0x01fb:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x01fd:
            r5 = r5 | r17
        L_0x01ff:
            r17 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r10 = r0 & r17
            r12 = 306783378(0x12492492, float:6.3469493E-28)
            if (r10 != r12) goto L_0x0232
            r10 = 374491(0x5b6db, float:5.24774E-40)
            r10 = r10 & r5
            r12 = 74898(0x12492, float:1.04954E-40)
            if (r10 != r12) goto L_0x0232
            boolean r10 = r8.getSkipping()
            if (r10 != 0) goto L_0x0219
            goto L_0x0232
        L_0x0219:
            r8.skipToGroupEnd()
            r9 = r90
            r10 = r91
            r11 = r92
            r12 = r93
            r13 = r94
            r14 = r95
            r15 = r96
            r16 = r97
            r29 = r8
            r8 = r89
            goto L_0x03de
        L_0x0232:
            r8.startDefaults()
            r10 = r11 & 1
            if (r10 == 0) goto L_0x0263
            boolean r10 = r8.getDefaultsInvalid()
            if (r10 == 0) goto L_0x0240
            goto L_0x0263
        L_0x0240:
            r8.skipToGroupEnd()
            r1 = r9 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0249
            r5 = r5 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0249:
            r1 = r9 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x024f
            r5 = r5 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x024f:
            r20 = r89
            r21 = r90
            r22 = r91
            r23 = r92
            r24 = r93
            r25 = r94
            r26 = r95
            r27 = r96
            r28 = r97
            goto L_0x0343
        L_0x0263:
            if (r16 == 0) goto L_0x0267
            r10 = 0
            goto L_0x0269
        L_0x0267:
            r10 = r89
        L_0x0269:
            r12 = 0
            if (r4 == 0) goto L_0x026e
            r4 = r12
            goto L_0x0270
        L_0x026e:
            r4 = r90
        L_0x0270:
            if (r6 == 0) goto L_0x0274
            r6 = r12
            goto L_0x0276
        L_0x0274:
            r6 = r91
        L_0x0276:
            if (r1 == 0) goto L_0x027a
            r1 = r12
            goto L_0x027c
        L_0x027a:
            r1 = r92
        L_0x027c:
            if (r2 == 0) goto L_0x0280
            r2 = r12
            goto L_0x0282
        L_0x0280:
            r2 = r93
        L_0x0282:
            if (r3 == 0) goto L_0x0285
            goto L_0x0287
        L_0x0285:
            r12 = r94
        L_0x0287:
            r3 = r9 & 4096(0x1000, float:5.74E-42)
            if (r3 == 0) goto L_0x02d9
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
            int r3 = r5 << 9
            r75 = r3 & r79
            r76 = 268435455(0xfffffff, float:2.5243547E-29)
            r16 = r82
            r72 = r8
            androidx.compose.material3.TextFieldColors r3 = r16.m34659outlinedTextFieldColorsl59Burw(r17, r19, r21, r23, r25, r27, r28, r30, r32, r34, r36, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64, r66, r68, r70, r72, r73, r74, r75, r76)
            r5 = r5 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x02db
        L_0x02d9:
            r3 = r95
        L_0x02db:
            r98 = r1
            r1 = r9 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0301
            r1 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 15
            r20 = 0
            r89 = r82
            r90 = r1
            r91 = r16
            r92 = r17
            r93 = r18
            r94 = r19
            r95 = r20
            androidx.compose.foundation.layout.PaddingValues r1 = m34649outlinedTextFieldPaddinga9UjIt4$default(r89, r90, r91, r92, r93, r94, r95)
            r5 = r5 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x0303
        L_0x0301:
            r1 = r96
        L_0x0303:
            if (r7 == 0) goto L_0x032d
            androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$1 r7 = new androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$1
            r89 = r7
            r90 = r85
            r91 = r10
            r92 = r88
            r93 = r3
            r94 = r0
            r95 = r5
            r89.<init>(r90, r91, r92, r93, r94, r95)
            r89 = r1
            r1 = 144282315(0x89992cb, float:9.242863E-34)
            r90 = r2
            r2 = 1
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r8, r1, r2, r7)
            r27 = r89
            r24 = r90
            r23 = r98
            r28 = r1
            goto L_0x0339
        L_0x032d:
            r89 = r1
            r90 = r2
            r27 = r89
            r24 = r90
            r28 = r97
            r23 = r98
        L_0x0339:
            r26 = r3
            r21 = r4
            r22 = r6
            r20 = r10
            r25 = r12
        L_0x0343:
            r8.endDefaults()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x0354
            r1 = 508645792(0x1e5151a0, float:1.10812475E-20)
            java.lang.String r2 = "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:629)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r1, r0, r5, r2)
        L_0x0354:
            androidx.compose.material3.TextFieldType r1 = androidx.compose.material3.TextFieldType.Outlined
            r2 = r0
            r0 = r1
            int r1 = r2 << 3
            r3 = r1 & 112(0x70, float:1.57E-43)
            r3 = r3 | 6
            r1 = r1 & 896(0x380, float:1.256E-42)
            r1 = r1 | r3
            int r3 = r2 >> 3
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r3
            int r3 = r2 >> 9
            r4 = r3 & r77
            r1 = r1 | r4
            r4 = r3 & r78
            r1 = r1 | r4
            r4 = 3670016(0x380000, float:5.142788E-39)
            r4 = r4 & r3
            r1 = r1 | r4
            int r4 = r5 << 21
            r6 = 29360128(0x1c00000, float:7.052966E-38)
            r6 = r6 & r4
            r1 = r1 | r6
            r4 = r4 & r79
            r1 = r1 | r4
            int r4 = r2 << 18
            r6 = 1879048192(0x70000000, float:1.58456325E29)
            r4 = r4 & r6
            r17 = r1 | r4
            int r1 = r2 >> 6
            r1 = r1 & 14
            int r2 = r2 >> 15
            r2 = r2 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            r2 = r3 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            r2 = r5 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            int r2 = r5 << 6
            r2 = r2 & r77
            r1 = r1 | r2
            int r2 = r5 << 3
            r2 = r2 & r78
            r18 = r1 | r2
            r19 = 0
            r1 = r83
            r2 = r84
            r3 = r87
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r29 = r8
            r8 = r25
            r9 = r86
            r10 = r85
            r11 = r20
            r12 = r88
            r13 = r27
            r14 = r26
            r15 = r28
            r16 = r29
            androidx.compose.material3.TextFieldImplKt.CommonDecorationBox(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x03cc
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x03cc:
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r12 = r24
            r13 = r25
            r14 = r26
            r15 = r27
            r16 = r28
        L_0x03de:
            androidx.compose.runtime.ScopeUpdateScope r7 = r29.endRestartGroup()
            if (r7 != 0) goto L_0x03e5
            goto L_0x040a
        L_0x03e5:
            androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$2 r6 = new androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$2
            r0 = r6
            r1 = r82
            r2 = r83
            r3 = r84
            r4 = r85
            r5 = r86
            r80 = r6
            r6 = r87
            r81 = r7
            r7 = r88
            r17 = r99
            r18 = r100
            r19 = r101
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r1 = r80
            r0 = r81
            r0.updateScope(r1)
        L_0x040a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox(java.lang.String, of.o, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, of.o, of.o, of.o, of.o, of.o, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, of.o, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:139:0x01ba, code lost:
        if (r7.changed((java.lang.Object) r90) != false) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x01d4, code lost:
        if (r7.changed((java.lang.Object) r91) != false) goto L_0x01db;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x045a  */
    /* JADX WARNING: Removed duplicated region for block: B:244:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0142  */
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void TextFieldDecorationBox(java.lang.String r77, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r78, boolean r79, boolean r80, androidx.compose.p002ui.text.input.VisualTransformation r81, androidx.compose.foundation.interaction.InteractionSource r82, boolean r83, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r84, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r85, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r86, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r87, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r88, androidx.compose.p002ui.graphics.Shape r89, androidx.compose.material3.TextFieldColors r90, androidx.compose.foundation.layout.PaddingValues r91, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r92, androidx.compose.runtime.Composer r93, int r94, int r95, int r96) {
        /*
            r76 = this;
            r0 = r76
            r14 = r77
            r15 = r78
            r12 = r81
            r13 = r82
            r11 = r94
            r9 = r95
            r10 = r96
            java.lang.String r1 = "value"
            kotlin.jvm.internal.C12775o.m28639i(r14, r1)
            java.lang.String r1 = "innerTextField"
            kotlin.jvm.internal.C12775o.m28639i(r15, r1)
            java.lang.String r1 = "visualTransformation"
            kotlin.jvm.internal.C12775o.m28639i(r12, r1)
            java.lang.String r1 = "interactionSource"
            kotlin.jvm.internal.C12775o.m28639i(r13, r1)
            r1 = -1224712461(0xffffffffb7005ef3, float:-7.651502E-6)
            r2 = r93
            androidx.compose.runtime.Composer r7 = r2.startRestartGroup(r1)
            r1 = r10 & 1
            if (r1 == 0) goto L_0x0034
            r1 = r11 | 6
            goto L_0x0044
        L_0x0034:
            r1 = r11 & 14
            if (r1 != 0) goto L_0x0043
            boolean r1 = r7.changed((java.lang.Object) r14)
            if (r1 == 0) goto L_0x0040
            r1 = 4
            goto L_0x0041
        L_0x0040:
            r1 = 2
        L_0x0041:
            r1 = r1 | r11
            goto L_0x0044
        L_0x0043:
            r1 = r11
        L_0x0044:
            r4 = r10 & 2
            if (r4 == 0) goto L_0x004b
            r1 = r1 | 48
            goto L_0x005b
        L_0x004b:
            r4 = r11 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x005b
            boolean r4 = r7.changed((java.lang.Object) r15)
            if (r4 == 0) goto L_0x0058
            r4 = 32
            goto L_0x005a
        L_0x0058:
            r4 = 16
        L_0x005a:
            r1 = r1 | r4
        L_0x005b:
            r4 = r10 & 4
            r16 = 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x0064
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0078
        L_0x0064:
            r4 = r11 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0078
            r4 = r79
            boolean r17 = r7.changed((boolean) r4)
            if (r17 == 0) goto L_0x0073
            r17 = 256(0x100, float:3.59E-43)
            goto L_0x0075
        L_0x0073:
            r17 = r16
        L_0x0075:
            r1 = r1 | r17
            goto L_0x007a
        L_0x0078:
            r4 = r79
        L_0x007a:
            r17 = r10 & 8
            r18 = 2048(0x800, float:2.87E-42)
            r19 = 1024(0x400, float:1.435E-42)
            if (r17 == 0) goto L_0x0085
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0099
        L_0x0085:
            r2 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x0099
            r2 = r80
            boolean r17 = r7.changed((boolean) r2)
            if (r17 == 0) goto L_0x0094
            r17 = r18
            goto L_0x0096
        L_0x0094:
            r17 = r19
        L_0x0096:
            r1 = r1 | r17
            goto L_0x009b
        L_0x0099:
            r2 = r80
        L_0x009b:
            r17 = r10 & 16
            r61 = 57344(0xe000, float:8.0356E-41)
            r20 = 16384(0x4000, float:2.2959E-41)
            r21 = 8192(0x2000, float:1.14794E-41)
            if (r17 == 0) goto L_0x00a9
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00ba
        L_0x00a9:
            r17 = r11 & r61
            if (r17 != 0) goto L_0x00ba
            boolean r17 = r7.changed((java.lang.Object) r12)
            if (r17 == 0) goto L_0x00b6
            r17 = r20
            goto L_0x00b8
        L_0x00b6:
            r17 = r21
        L_0x00b8:
            r1 = r1 | r17
        L_0x00ba:
            r17 = r10 & 32
            r22 = 65536(0x10000, float:9.18355E-41)
            r62 = 458752(0x70000, float:6.42848E-40)
            if (r17 == 0) goto L_0x00c7
            r17 = 196608(0x30000, float:2.75506E-40)
        L_0x00c4:
            r1 = r1 | r17
            goto L_0x00d7
        L_0x00c7:
            r17 = r11 & r62
            if (r17 != 0) goto L_0x00d7
            boolean r17 = r7.changed((java.lang.Object) r13)
            if (r17 == 0) goto L_0x00d4
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c4
        L_0x00d4:
            r17 = r22
            goto L_0x00c4
        L_0x00d7:
            r17 = r10 & 64
            r63 = 3670016(0x380000, float:5.142788E-39)
            if (r17 == 0) goto L_0x00e4
            r23 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r23
            r3 = r83
            goto L_0x00f7
        L_0x00e4:
            r23 = r11 & r63
            r3 = r83
            if (r23 != 0) goto L_0x00f7
            boolean r24 = r7.changed((boolean) r3)
            if (r24 == 0) goto L_0x00f3
            r24 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00f5
        L_0x00f3:
            r24 = 524288(0x80000, float:7.34684E-40)
        L_0x00f5:
            r1 = r1 | r24
        L_0x00f7:
            r5 = r10 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x0102
            r25 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r25
            r6 = r84
            goto L_0x0117
        L_0x0102:
            r25 = 29360128(0x1c00000, float:7.052966E-38)
            r25 = r11 & r25
            r6 = r84
            if (r25 != 0) goto L_0x0117
            boolean r26 = r7.changed((java.lang.Object) r6)
            if (r26 == 0) goto L_0x0113
            r26 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0115
        L_0x0113:
            r26 = 4194304(0x400000, float:5.877472E-39)
        L_0x0115:
            r1 = r1 | r26
        L_0x0117:
            r8 = r10 & 256(0x100, float:3.59E-43)
            if (r8 == 0) goto L_0x0122
            r27 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r27
            r2 = r85
            goto L_0x0137
        L_0x0122:
            r27 = 234881024(0xe000000, float:1.5777218E-30)
            r27 = r11 & r27
            r2 = r85
            if (r27 != 0) goto L_0x0137
            boolean r27 = r7.changed((java.lang.Object) r2)
            if (r27 == 0) goto L_0x0133
            r27 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0135
        L_0x0133:
            r27 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0135:
            r1 = r1 | r27
        L_0x0137:
            r2 = r10 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x0142
            r27 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r27
            r3 = r86
            goto L_0x0157
        L_0x0142:
            r27 = 1879048192(0x70000000, float:1.58456325E29)
            r27 = r11 & r27
            r3 = r86
            if (r27 != 0) goto L_0x0157
            boolean r27 = r7.changed((java.lang.Object) r3)
            if (r27 == 0) goto L_0x0153
            r27 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0155
        L_0x0153:
            r27 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0155:
            r1 = r1 | r27
        L_0x0157:
            r3 = r10 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0160
            r23 = r9 | 6
            r4 = r87
            goto L_0x0176
        L_0x0160:
            r27 = r9 & 14
            r4 = r87
            if (r27 != 0) goto L_0x0174
            boolean r27 = r7.changed((java.lang.Object) r4)
            if (r27 == 0) goto L_0x016f
            r23 = 4
            goto L_0x0171
        L_0x016f:
            r23 = 2
        L_0x0171:
            r23 = r9 | r23
            goto L_0x0176
        L_0x0174:
            r23 = r9
        L_0x0176:
            r4 = r10 & 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L_0x017f
            r23 = r23 | 48
            r6 = r88
            goto L_0x0192
        L_0x017f:
            r27 = r9 & 112(0x70, float:1.57E-43)
            r6 = r88
            if (r27 != 0) goto L_0x0192
            boolean r27 = r7.changed((java.lang.Object) r6)
            if (r27 == 0) goto L_0x018e
            r24 = 32
            goto L_0x0190
        L_0x018e:
            r24 = 16
        L_0x0190:
            r23 = r23 | r24
        L_0x0192:
            r6 = r9 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x01aa
            r6 = r10 & 4096(0x1000, float:5.74E-42)
            if (r6 != 0) goto L_0x01a5
            r6 = r89
            boolean r24 = r7.changed((java.lang.Object) r6)
            if (r24 == 0) goto L_0x01a7
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x01a7
        L_0x01a5:
            r6 = r89
        L_0x01a7:
            r23 = r23 | r16
            goto L_0x01ac
        L_0x01aa:
            r6 = r89
        L_0x01ac:
            r6 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x01c4
            r6 = r10 & 8192(0x2000, float:1.14794E-41)
            if (r6 != 0) goto L_0x01bd
            r6 = r90
            boolean r16 = r7.changed((java.lang.Object) r6)
            if (r16 == 0) goto L_0x01bf
            goto L_0x01c1
        L_0x01bd:
            r6 = r90
        L_0x01bf:
            r18 = r19
        L_0x01c1:
            r23 = r23 | r18
            goto L_0x01c6
        L_0x01c4:
            r6 = r90
        L_0x01c6:
            r16 = r9 & r61
            if (r16 != 0) goto L_0x01de
            r6 = r10 & 16384(0x4000, float:2.2959E-41)
            if (r6 != 0) goto L_0x01d7
            r6 = r91
            boolean r16 = r7.changed((java.lang.Object) r6)
            if (r16 == 0) goto L_0x01d9
            goto L_0x01db
        L_0x01d7:
            r6 = r91
        L_0x01d9:
            r20 = r21
        L_0x01db:
            r23 = r23 | r20
            goto L_0x01e0
        L_0x01de:
            r6 = r91
        L_0x01e0:
            r16 = 32768(0x8000, float:4.5918E-41)
            r64 = r10 & r16
            if (r64 == 0) goto L_0x01ee
            r16 = 196608(0x30000, float:2.75506E-40)
            r23 = r23 | r16
            r14 = r92
            goto L_0x0201
        L_0x01ee:
            r16 = r9 & r62
            r14 = r92
            if (r16 != 0) goto L_0x0201
            boolean r16 = r7.changed((java.lang.Object) r14)
            if (r16 == 0) goto L_0x01fd
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01ff
        L_0x01fd:
            r16 = r22
        L_0x01ff:
            r23 = r23 | r16
        L_0x0201:
            r16 = r10 & r22
            if (r16 == 0) goto L_0x020a
            r16 = 1572864(0x180000, float:2.204052E-39)
        L_0x0207:
            r23 = r23 | r16
            goto L_0x021a
        L_0x020a:
            r16 = r9 & r63
            if (r16 != 0) goto L_0x021a
            boolean r16 = r7.changed((java.lang.Object) r0)
            if (r16 == 0) goto L_0x0217
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0207
        L_0x0217:
            r16 = 524288(0x80000, float:7.34684E-40)
            goto L_0x0207
        L_0x021a:
            r6 = r23
            r16 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r9 = r1 & r16
            r93 = r1
            r1 = 306783378(0x12492492, float:6.3469493E-28)
            if (r9 != r1) goto L_0x0253
            r1 = 2995931(0x2db6db, float:4.198194E-39)
            r1 = r1 & r6
            r9 = 599186(0x92492, float:8.39638E-40)
            if (r1 != r9) goto L_0x0253
            boolean r1 = r7.getSkipping()
            if (r1 != 0) goto L_0x0238
            goto L_0x0253
        L_0x0238:
            r7.skipToGroupEnd()
            r8 = r83
            r9 = r84
            r10 = r85
            r11 = r86
            r12 = r87
            r13 = r88
            r15 = r90
            r16 = r91
            r23 = r7
            r17 = r14
            r14 = r89
            goto L_0x0453
        L_0x0253:
            r7.startDefaults()
            r1 = r11 & 1
            if (r1 == 0) goto L_0x0292
            boolean r1 = r7.getDefaultsInvalid()
            if (r1 == 0) goto L_0x0261
            goto L_0x0292
        L_0x0261:
            r7.skipToGroupEnd()
            r1 = r10 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x026a
            r6 = r6 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x026a:
            r1 = r10 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0270
            r6 = r6 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0270:
            r1 = r10 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0278
            r1 = -57345(0xffffffffffff1fff, float:NaN)
            r6 = r6 & r1
        L_0x0278:
            r65 = r83
            r66 = r84
            r67 = r85
            r68 = r86
            r69 = r87
            r70 = r88
            r71 = r89
            r20 = r90
            r21 = r91
            r72 = r93
            r15 = r10
            r22 = r14
            r14 = r7
            goto L_0x03b3
        L_0x0292:
            if (r17 == 0) goto L_0x0298
            r1 = 0
            r65 = r1
            goto L_0x029a
        L_0x0298:
            r65 = r83
        L_0x029a:
            r1 = 0
            if (r5 == 0) goto L_0x02a0
            r66 = r1
            goto L_0x02a2
        L_0x02a0:
            r66 = r84
        L_0x02a2:
            if (r8 == 0) goto L_0x02a7
            r67 = r1
            goto L_0x02a9
        L_0x02a7:
            r67 = r85
        L_0x02a9:
            if (r2 == 0) goto L_0x02ae
            r68 = r1
            goto L_0x02b0
        L_0x02ae:
            r68 = r86
        L_0x02b0:
            if (r3 == 0) goto L_0x02b5
            r69 = r1
            goto L_0x02b7
        L_0x02b5:
            r69 = r87
        L_0x02b7:
            if (r4 == 0) goto L_0x02bc
            r70 = r1
            goto L_0x02be
        L_0x02bc:
            r70 = r88
        L_0x02be:
            r1 = r10 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x02cf
            int r1 = r6 >> 18
            r1 = r1 & 14
            androidx.compose.ui.graphics.Shape r1 = r0.getFilledShape(r7, r1)
            r6 = r6 & -897(0xfffffffffffffc7f, float:NaN)
            r71 = r1
            goto L_0x02d1
        L_0x02cf:
            r71 = r89
        L_0x02d1:
            r9 = r6
            r1 = r10 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0338
            r1 = 0
            r8 = r93
            r3 = 0
            r5 = 0
            r16 = 0
            r93 = r7
            r72 = r8
            r7 = r16
            r1 = r9
            r2 = r10
            r9 = r16
            r16 = 0
            r11 = r16
            r16 = 0
            r12 = r16
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
            r42 = 0
            r44 = 0
            r46 = 0
            r48 = 0
            r50 = 0
            r52 = 0
            r54 = 0
            r57 = 0
            r58 = 0
            int r56 = r1 << 6
            r59 = 234881024(0xe000000, float:1.5777218E-30)
            r59 = r56 & r59
            r60 = 268435455(0xfffffff, float:2.5243547E-29)
            r0 = r76
            r56 = r93
            r73 = r1
            r1 = 0
            androidx.compose.material3.TextFieldColors r0 = r0.m34662textFieldColorsl59Burw(r1, r3, r5, r7, r9, r11, r12, r14, r16, r18, r20, r22, r24, r26, r28, r30, r32, r34, r36, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r57, r58, r59, r60)
            r6 = r73
            r9 = r6 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x033f
        L_0x0338:
            r72 = r93
            r93 = r7
            r6 = r9
            r0 = r90
        L_0x033f:
            r15 = r96
            r1 = r15 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0380
            if (r66 != 0) goto L_0x0361
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 15
            r6 = 0
            r83 = r76
            r84 = r1
            r85 = r2
            r86 = r3
            r87 = r4
            r88 = r5
            r89 = r6
            androidx.compose.foundation.layout.PaddingValues r1 = m34652textFieldWithoutLabelPaddinga9UjIt4$default(r83, r84, r85, r86, r87, r88, r89)
            goto L_0x037a
        L_0x0361:
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 15
            r6 = 0
            r83 = r76
            r84 = r1
            r85 = r2
            r86 = r3
            r87 = r4
            r88 = r5
            r89 = r6
            androidx.compose.foundation.layout.PaddingValues r1 = m34651textFieldWithLabelPaddinga9UjIt4$default(r83, r84, r85, r86, r87, r88, r89)
        L_0x037a:
            r2 = -57345(0xffffffffffff1fff, float:NaN)
            r2 = r2 & r9
            r6 = r2
            goto L_0x0383
        L_0x0380:
            r1 = r91
            r6 = r9
        L_0x0383:
            if (r64 == 0) goto L_0x03ab
            androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1 r2 = new androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
            r83 = r2
            r84 = r79
            r85 = r65
            r86 = r82
            r87 = r0
            r88 = r71
            r89 = r72
            r90 = r6
            r83.<init>(r84, r85, r86, r87, r88, r89, r90)
            r3 = -1171460386(0xffffffffba2ceede, float:-6.596873E-4)
            r4 = 1
            r14 = r93
            androidx.compose.runtime.internal.ComposableLambda r2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r14, r3, r4, r2)
            r20 = r0
            r21 = r1
            r22 = r2
            goto L_0x03b3
        L_0x03ab:
            r14 = r93
            r22 = r92
            r20 = r0
            r21 = r1
        L_0x03b3:
            r14.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x03c7
            r0 = -1224712461(0xffffffffb7005ef3, float:-7.651502E-6)
            java.lang.String r1 = "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:527)"
            r2 = r72
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r2, r6, r1)
            goto L_0x03c9
        L_0x03c7:
            r2 = r72
        L_0x03c9:
            androidx.compose.material3.TextFieldType r0 = androidx.compose.material3.TextFieldType.Filled
            int r1 = r2 << 3
            r3 = r1 & 112(0x70, float:1.57E-43)
            r3 = r3 | 6
            r1 = r1 & 896(0x380, float:1.256E-42)
            r1 = r1 | r3
            int r3 = r2 >> 3
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r3
            int r3 = r2 >> 9
            r4 = r3 & r61
            r1 = r1 | r4
            r4 = r3 & r62
            r1 = r1 | r4
            r4 = r3 & r63
            r1 = r1 | r4
            int r4 = r6 << 21
            r5 = 29360128(0x1c00000, float:7.052966E-38)
            r5 = r5 & r4
            r1 = r1 | r5
            r5 = 234881024(0xe000000, float:1.5777218E-30)
            r4 = r4 & r5
            r1 = r1 | r4
            int r4 = r2 << 18
            r5 = 1879048192(0x70000000, float:1.58456325E29)
            r4 = r4 & r5
            r17 = r1 | r4
            int r1 = r2 >> 6
            r1 = r1 & 14
            int r2 = r2 >> 15
            r2 = r2 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            r2 = r3 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            int r2 = r6 >> 3
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            int r2 = r6 << 3
            r2 = r2 & r61
            r1 = r1 | r2
            r2 = r6 & r62
            r18 = r1 | r2
            r19 = 0
            r1 = r77
            r2 = r78
            r3 = r81
            r4 = r66
            r5 = r67
            r6 = r68
            r7 = r69
            r8 = r70
            r9 = r80
            r10 = r79
            r11 = r65
            r12 = r82
            r13 = r21
            r23 = r14
            r14 = r20
            r15 = r22
            r16 = r23
            androidx.compose.material3.TextFieldImplKt.CommonDecorationBox(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x043f
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x043f:
            r15 = r20
            r16 = r21
            r17 = r22
            r8 = r65
            r9 = r66
            r10 = r67
            r11 = r68
            r12 = r69
            r13 = r70
            r14 = r71
        L_0x0453:
            androidx.compose.runtime.ScopeUpdateScope r7 = r23.endRestartGroup()
            if (r7 != 0) goto L_0x045a
            goto L_0x047f
        L_0x045a:
            androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$2 r6 = new androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$2
            r0 = r6
            r1 = r76
            r2 = r77
            r3 = r78
            r4 = r79
            r5 = r80
            r74 = r6
            r6 = r81
            r75 = r7
            r7 = r82
            r18 = r94
            r19 = r95
            r20 = r96
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r1 = r74
            r0 = r75
            r0.updateScope(r1)
        L_0x047f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox(java.lang.String, of.o, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, of.o, of.o, of.o, of.o, of.o, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, of.o, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Composable
    public final Shape getFilledShape(Composer composer, int i) {
        composer.startReplaceableGroup(611926497);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(611926497, i, -1, "androidx.compose.material3.TextFieldDefaults.<get-filledShape> (TextFieldDefaults.kt:62)");
        }
        Shape shape = ShapesKt.toShape(FilledTextFieldTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    /* renamed from: getFocusedBorderThickness-D9Ej5fM  reason: not valid java name */
    public final float m34654getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* renamed from: getMinHeight-D9Ej5fM  reason: not valid java name */
    public final float m34655getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM  reason: not valid java name */
    public final float m34656getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    @Composable
    public final Shape getOutlinedShape(Composer composer, int i) {
        composer.startReplaceableGroup(-584749279);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-584749279, i, -1, "androidx.compose.material3.TextFieldDefaults.<get-outlinedShape> (TextFieldDefaults.kt:59)");
        }
        Shape shape = ShapesKt.toShape(OutlinedTextFieldTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM  reason: not valid java name */
    public final float m34657getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.compose.material3.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: androidx.compose.material3.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1} */
    /* JADX WARNING: type inference failed for: r1v4, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.material3.ExperimentalMaterial3Api
    /* renamed from: indicatorLine-gv0btCI  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p002ui.Modifier m34658indicatorLinegv0btCI(androidx.compose.p002ui.Modifier r13, boolean r14, boolean r15, androidx.compose.foundation.interaction.InteractionSource r16, androidx.compose.material3.TextFieldColors r17, float r18, float r19) {
        /*
            r12 = this;
            r0 = r13
            java.lang.String r1 = "$this$indicatorLine"
            kotlin.jvm.internal.C12775o.m28639i(r13, r1)
            java.lang.String r1 = "interactionSource"
            r9 = r16
            kotlin.jvm.internal.C12775o.m28639i(r9, r1)
            java.lang.String r1 = "colors"
            r10 = r17
            kotlin.jvm.internal.C12775o.m28639i(r10, r1)
            boolean r1 = androidx.compose.p002ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled()
            if (r1 == 0) goto L_0x002b
            androidx.compose.material3.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1 r1 = new androidx.compose.material3.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1
            r2 = r1
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L_0x002f
        L_0x002b:
            kotlin.jvm.functions.Function1 r1 = androidx.compose.p002ui.platform.InspectableValueKt.getNoInspectorInfo()
        L_0x002f:
            androidx.compose.material3.TextFieldDefaults$indicatorLine$2 r11 = new androidx.compose.material3.TextFieldDefaults$indicatorLine$2
            r2 = r11
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8)
            androidx.compose.ui.Modifier r0 = androidx.compose.p002ui.ComposedModifierKt.composed(r13, r1, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.m34658indicatorLinegv0btCI(androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.material3.TextFieldColors, float, float):androidx.compose.ui.Modifier");
    }

    @ExperimentalMaterial3Api
    @Composable
    /* renamed from: outlinedTextFieldColors-l59Burw  reason: not valid java name */
    public final TextFieldColors m34659outlinedTextFieldColorsl59Burw(long j, long j2, long j3, long j4, long j5, TextSelectionColors textSelectionColors, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, Composer composer, int i, int i2, int i3, int i4) {
        Composer composer2 = composer;
        int i5 = i4;
        composer2.startReplaceableGroup(-1654658683);
        long color = (i5 & 1) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputColor(), composer2, 6) : j;
        long r10 = (i5 & 2) != 0 ? Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j2;
        long r12 = (i5 & 4) != 0 ? Color.Companion.m35706getTransparent0d7_KjU() : j3;
        long color2 = (i5 & 8) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getCaretColor(), composer2, 6) : j4;
        long color3 = (i5 & 16) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorFocusCaretColor(), composer2, 6) : j5;
        TextSelectionColors textSelectionColors2 = (i5 & 32) != 0 ? (TextSelectionColors) composer2.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long color4 = (i5 & 64) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusOutlineColor(), composer2, 6) : j6;
        long color5 = (i5 & 128) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getOutlineColor(), composer2, 6) : j7;
        long r25 = (i5 & 256) != 0 ? Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledOutlineColor(), composer2, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j8;
        long color6 = (i5 & 512) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorOutlineColor(), composer2, 6) : j9;
        long color7 = (i5 & 1024) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusLeadingIconColor(), composer2, 6) : j10;
        long color8 = (i5 & 2048) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getLeadingIconColor(), composer2, 6) : j11;
        long r31 = (i5 & 4096) != 0 ? Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j12;
        long color9 = (i5 & 8192) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorLeadingIconColor(), composer2, 6) : j13;
        long color10 = (i5 & 16384) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusTrailingIconColor(), composer2, 6) : j14;
        long color11 = (32768 & i5) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getTrailingIconColor(), composer2, 6) : j15;
        long r39 = (65536 & i5) != 0 ? Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j16;
        long color12 = (131072 & i5) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorTrailingIconColor(), composer2, 6) : j17;
        long color13 = (262144 & i5) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusLabelColor(), composer2, 6) : j18;
        long color14 = (524288 & i5) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getLabelColor(), composer2, 6) : j19;
        long r47 = (1048576 & i5) != 0 ? Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledLabelColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j20;
        long color15 = (2097152 & i5) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorLabelColor(), composer2, 6) : j21;
        long color16 = (4194304 & i5) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer2, 6) : j22;
        long r53 = (8388608 & i5) != 0 ? Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j23;
        long color17 = (16777216 & i5) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusSupportingColor(), composer2, 6) : j24;
        long color18 = (33554432 & i5) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getSupportingColor(), composer2, 6) : j25;
        long r59 = (67108864 & i5) != 0 ? Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledSupportingColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j26;
        long color19 = (i5 & 134217728) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorSupportingColor(), composer2, 6) : j27;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1654658683, i, i2, "androidx.compose.material3.TextFieldDefaults.outlinedTextFieldColors (TextFieldDefaults.kt:399)");
        }
        TextFieldColors textFieldColors = new TextFieldColors(color, r10, r12, color2, color3, textSelectionColors2, color4, color5, color6, r25, color7, color8, r31, color9, color10, color11, r39, color12, color13, color14, r47, color15, color16, r53, color17, color18, r59, color19, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textFieldColors;
    }

    @ExperimentalMaterial3Api
    /* renamed from: outlinedTextFieldPadding-a9UjIt4  reason: not valid java name */
    public final PaddingValues m34660outlinedTextFieldPaddinga9UjIt4(float f, float f2, float f3, float f4) {
        return PaddingKt.m33264PaddingValuesa9UjIt4(f, f2, f3, f4);
    }

    @ExperimentalMaterial3Api
    /* renamed from: supportingTextPadding-a9UjIt4$material3_release  reason: not valid java name */
    public final PaddingValues m34661supportingTextPaddinga9UjIt4$material3_release(float f, float f2, float f3, float f4) {
        return PaddingKt.m33264PaddingValuesa9UjIt4(f, f2, f3, f4);
    }

    @ExperimentalMaterial3Api
    @Composable
    /* renamed from: textFieldColors-l59Burw  reason: not valid java name */
    public final TextFieldColors m34662textFieldColorsl59Burw(long j, long j2, long j3, long j4, long j5, TextSelectionColors textSelectionColors, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, Composer composer, int i, int i2, int i3, int i4) {
        Composer composer2 = composer;
        int i5 = i4;
        composer2.startReplaceableGroup(-128842621);
        long color = (i5 & 1) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputColor(), composer2, 6) : j;
        long r10 = (i5 & 2) != 0 ? Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j2;
        long color2 = (i5 & 4) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getContainerColor(), composer2, 6) : j3;
        long color3 = (i5 & 8) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer2, 6) : j4;
        long color4 = (i5 & 16) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorFocusCaretColor(), composer2, 6) : j5;
        TextSelectionColors textSelectionColors2 = (i5 & 32) != 0 ? (TextSelectionColors) composer2.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long color5 = (i5 & 64) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusActiveIndicatorColor(), composer2, 6) : j6;
        long color6 = (i5 & 128) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getActiveIndicatorColor(), composer2, 6) : j7;
        long r25 = (i5 & 256) != 0 ? Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledActiveIndicatorColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j8;
        long color7 = (i5 & 512) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorActiveIndicatorColor(), composer2, 6) : j9;
        long color8 = (i5 & 1024) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusLeadingIconColor(), composer2, 6) : j10;
        long color9 = (i5 & 2048) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getLeadingIconColor(), composer2, 6) : j11;
        long r31 = (i5 & 4096) != 0 ? Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j12;
        long color10 = (i5 & 8192) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorLeadingIconColor(), composer2, 6) : j13;
        long color11 = (i5 & 16384) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusTrailingIconColor(), composer2, 6) : j14;
        long color12 = (32768 & i5) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getTrailingIconColor(), composer2, 6) : j15;
        long r39 = (65536 & i5) != 0 ? Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j16;
        long color13 = (131072 & i5) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorTrailingIconColor(), composer2, 6) : j17;
        long color14 = (262144 & i5) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusLabelColor(), composer2, 6) : j18;
        long color15 = (524288 & i5) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getLabelColor(), composer2, 6) : j19;
        long r47 = (1048576 & i5) != 0 ? Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledLabelColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j20;
        long color16 = (2097152 & i5) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorLabelColor(), composer2, 6) : j21;
        long color17 = (4194304 & i5) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer2, 6) : j22;
        long r53 = (8388608 & i5) != 0 ? Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j23;
        long color18 = (16777216 & i5) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusSupportingColor(), composer2, 6) : j24;
        long color19 = (33554432 & i5) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getSupportingColor(), composer2, 6) : j25;
        long r59 = (67108864 & i5) != 0 ? Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledSupportingColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j26;
        long color20 = (i5 & 134217728) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorSupportingColor(), composer2, 6) : j27;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-128842621, i, i2, "androidx.compose.material3.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:292)");
        }
        TextFieldColors textFieldColors = new TextFieldColors(color, r10, color2, color3, color4, textSelectionColors2, color5, color6, color7, r25, color8, color9, r31, color10, color11, color12, r39, color13, color14, color15, r47, color16, color17, r53, color18, color19, r59, color20, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textFieldColors;
    }

    @ExperimentalMaterial3Api
    /* renamed from: textFieldWithLabelPadding-a9UjIt4  reason: not valid java name */
    public final PaddingValues m34663textFieldWithLabelPaddinga9UjIt4(float f, float f2, float f3, float f4) {
        return PaddingKt.m33264PaddingValuesa9UjIt4(f, f3, f2, f4);
    }

    @ExperimentalMaterial3Api
    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4  reason: not valid java name */
    public final PaddingValues m34664textFieldWithoutLabelPaddinga9UjIt4(float f, float f2, float f3, float f4) {
        return PaddingKt.m33264PaddingValuesa9UjIt4(f, f2, f3, f4);
    }
}
