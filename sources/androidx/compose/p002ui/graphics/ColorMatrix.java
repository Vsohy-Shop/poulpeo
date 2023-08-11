package androidx.compose.p002ui.graphics;

import java.util.Arrays;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nColorMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorMatrix.kt\nandroidx/compose/ui/graphics/ColorMatrix\n*L\n1#1,328:1\n97#1,2:329\n97#1,2:331\n97#1,2:333\n97#1,2:335\n84#1:337\n84#1:338\n84#1:339\n84#1:340\n84#1:341\n84#1:342\n84#1:343\n84#1:344\n84#1:345\n84#1:346\n84#1:347\n84#1:348\n84#1:349\n84#1:350\n84#1:351\n84#1:352\n84#1:353\n84#1:354\n84#1:355\n84#1:356\n97#1,2:357\n97#1,2:359\n97#1,2:361\n97#1,2:363\n97#1,2:365\n97#1,2:367\n97#1,2:369\n97#1,2:371\n97#1,2:373\n97#1,2:375\n97#1,2:377\n97#1,2:379\n97#1,2:381\n97#1,2:383\n97#1,2:385\n97#1,2:387\n97#1,2:389\n97#1,2:391\n97#1,2:393\n97#1,2:395\n84#1:397\n84#1:398\n84#1:399\n84#1:400\n97#1,2:401\n97#1,2:403\n97#1,2:405\n97#1,2:407\n97#1,2:409\n97#1,2:411\n97#1,2:413\n97#1,2:415\n97#1,2:417\n97#1,2:419\n97#1,2:421\n97#1,2:423\n97#1,2:425\n133#1,5:427\n97#1,2:432\n97#1,2:434\n97#1,2:436\n97#1,2:438\n138#1:440\n133#1,5:441\n97#1,2:446\n97#1,2:448\n97#1,2:450\n97#1,2:452\n138#1:454\n133#1,5:455\n97#1,2:460\n97#1,2:462\n97#1,2:464\n97#1,2:466\n138#1:468\n97#1,2:469\n97#1,2:471\n97#1,2:473\n97#1,2:475\n97#1,2:477\n97#1,2:479\n97#1,2:481\n97#1,2:483\n97#1,2:485\n97#1,2:487\n97#1,2:489\n97#1,2:491\n97#1,2:493\n97#1,2:495\n97#1,2:497\n97#1,2:499\n*S KotlinDebug\n*F\n+ 1 ColorMatrix.kt\nandroidx/compose/ui/graphics/ColorMatrix\n*L\n111#1:329,2\n112#1:331,2\n113#1:333,2\n114#1:335,2\n148#1:337\n149#1:338\n150#1:339\n151#1:340\n152#1:341\n158#1:342\n159#1:343\n160#1:344\n161#1:345\n162#1:346\n168#1:347\n169#1:348\n170#1:349\n171#1:350\n172#1:351\n178#1:352\n179#1:353\n180#1:354\n181#1:355\n182#1:356\n184#1:357,2\n185#1:359,2\n186#1:361,2\n187#1:363,2\n188#1:365,2\n189#1:367,2\n190#1:369,2\n191#1:371,2\n192#1:373,2\n193#1:375,2\n194#1:377,2\n195#1:379,2\n196#1:381,2\n197#1:383,2\n198#1:385,2\n199#1:387,2\n200#1:389,2\n201#1:391,2\n202#1:393,2\n203#1:395,2\n211#1:397\n212#1:398\n213#1:399\n214#1:400\n228#1:401,2\n229#1:403,2\n230#1:405,2\n231#1:407,2\n232#1:409,2\n233#1:411,2\n234#1:413,2\n235#1:415,2\n236#1:417,2\n255#1:419,2\n256#1:421,2\n257#1:423,2\n258#1:425,2\n265#1:427,5\n266#1:432,2\n267#1:434,2\n268#1:436,2\n269#1:438,2\n265#1:440\n277#1:441,5\n278#1:446,2\n279#1:448,2\n280#1:450,2\n281#1:452,2\n277#1:454\n289#1:455,5\n290#1:460,2\n291#1:462,2\n292#1:464,2\n293#1:466,2\n289#1:468\n303#1:469,2\n304#1:471,2\n305#1:473,2\n306#1:475,2\n307#1:477,2\n308#1:479,2\n309#1:481,2\n310#1:483,2\n311#1:485,2\n320#1:487,2\n321#1:489,2\n322#1:491,2\n323#1:493,2\n324#1:495,2\n325#1:497,2\n326#1:499,2\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.ColorMatrix */
/* compiled from: ColorMatrix.kt */
public final class ColorMatrix {
    private final float[] values;

    private /* synthetic */ ColorMatrix(float[] fArr) {
        this.values = fArr;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ ColorMatrix m35726boximpl(float[] fArr) {
        return new ColorMatrix(fArr);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static float[] m35727constructorimpl(float[] fArr) {
        C12775o.m28639i(fArr, "values");
        return fArr;
    }

    /* renamed from: constructor-impl$default  reason: not valid java name */
    public static /* synthetic */ float[] m35728constructorimpl$default(float[] fArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        }
        return m35727constructorimpl(fArr);
    }

    /* renamed from: convertRgbToYuv-impl  reason: not valid java name */
    public static final void m35729convertRgbToYuvimpl(float[] fArr) {
        m35736resetimpl(fArr);
        fArr[0] = 0.299f;
        fArr[1] = 0.587f;
        fArr[2] = 0.114f;
        fArr[5] = -0.16874f;
        fArr[6] = -0.33126f;
        fArr[7] = 0.5f;
        fArr[10] = 0.5f;
        fArr[11] = -0.41869f;
        fArr[12] = -0.08131f;
    }

    /* renamed from: convertYuvToRgb-impl  reason: not valid java name */
    public static final void m35730convertYuvToRgbimpl(float[] fArr) {
        m35736resetimpl(fArr);
        fArr[2] = 1.402f;
        fArr[5] = 1.0f;
        fArr[6] = -0.34414f;
        fArr[7] = -0.71414f;
        fArr[10] = 1.0f;
        fArr[11] = 1.772f;
        fArr[12] = 0.0f;
    }

    /* renamed from: dot-Me4OoYI  reason: not valid java name */
    private static final float m35731dotMe4OoYI(float[] fArr, float[] fArr2, int i, float[] fArr3, int i2) {
        int i3 = i * 5;
        return (fArr2[i3 + 0] * fArr3[0 + i2]) + (fArr2[i3 + 1] * fArr3[5 + i2]) + (fArr2[i3 + 2] * fArr3[10 + i2]) + (fArr2[i3 + 3] * fArr3[15 + i2]);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m35732equalsimpl(float[] fArr, Object obj) {
        if ((obj instanceof ColorMatrix) && C12775o.m28634d(fArr, ((ColorMatrix) obj).m35747unboximpl())) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m35733equalsimpl0(float[] fArr, float[] fArr2) {
        return C12775o.m28634d(fArr, fArr2);
    }

    /* renamed from: get-impl  reason: not valid java name */
    public static final float m35734getimpl(float[] fArr, int i, int i2) {
        return fArr[(i * 5) + i2];
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m35735hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    /* renamed from: reset-impl  reason: not valid java name */
    public static final void m35736resetimpl(float[] fArr) {
        C12708o.m28353t(fArr, 0.0f, 0, 0, 6, (Object) null);
        fArr[0] = 1.0f;
        fArr[12] = 1.0f;
        fArr[6] = 1.0f;
        fArr[18] = 1.0f;
    }

    /* renamed from: rotateInternal-impl  reason: not valid java name */
    private static final void m35737rotateInternalimpl(float[] fArr, float f, C13088o<? super Float, ? super Float, C11921v> oVar) {
        m35736resetimpl(fArr);
        double d = (((double) f) * 3.141592653589793d) / 180.0d;
        oVar.invoke(Float.valueOf((float) Math.cos(d)), Float.valueOf((float) Math.sin(d)));
    }

    /* renamed from: set-impl  reason: not valid java name */
    public static final void m35738setimpl(float[] fArr, int i, int i2, float f) {
        fArr[(i * 5) + i2] = f;
    }

    /* renamed from: set-jHG-Opc  reason: not valid java name */
    public static final void m35739setjHGOpc(float[] fArr, float[] fArr2) {
        C12775o.m28639i(fArr2, "src");
        float[] unused = C12708o.m28344k(fArr2, fArr, 0, 0, 0, 14, (Object) null);
    }

    /* renamed from: setToRotateBlue-impl  reason: not valid java name */
    public static final void m35740setToRotateBlueimpl(float[] fArr, float f) {
        m35736resetimpl(fArr);
        double d = (((double) f) * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        fArr[6] = cos;
        fArr[0] = cos;
        fArr[1] = sin;
        fArr[5] = -sin;
    }

    /* renamed from: setToRotateGreen-impl  reason: not valid java name */
    public static final void m35741setToRotateGreenimpl(float[] fArr, float f) {
        m35736resetimpl(fArr);
        double d = (((double) f) * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        fArr[12] = cos;
        fArr[0] = cos;
        fArr[2] = -sin;
        fArr[10] = sin;
    }

    /* renamed from: setToRotateRed-impl  reason: not valid java name */
    public static final void m35742setToRotateRedimpl(float[] fArr, float f) {
        m35736resetimpl(fArr);
        double d = (((double) f) * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        fArr[12] = cos;
        fArr[6] = cos;
        fArr[7] = sin;
        fArr[11] = -sin;
    }

    /* renamed from: setToSaturation-impl  reason: not valid java name */
    public static final void m35743setToSaturationimpl(float[] fArr, float f) {
        m35736resetimpl(fArr);
        float f2 = ((float) 1) - f;
        float f3 = 0.213f * f2;
        float f4 = 0.715f * f2;
        float f5 = f2 * 0.072f;
        fArr[0] = f3 + f;
        fArr[1] = f4;
        fArr[2] = f5;
        fArr[5] = f3;
        fArr[6] = f4 + f;
        fArr[7] = f5;
        fArr[10] = f3;
        fArr[11] = f4;
        fArr[12] = f5 + f;
    }

    /* renamed from: setToScale-impl  reason: not valid java name */
    public static final void m35744setToScaleimpl(float[] fArr, float f, float f2, float f3, float f4) {
        m35736resetimpl(fArr);
        fArr[0] = f;
        fArr[6] = f2;
        fArr[12] = f3;
        fArr[18] = f4;
    }

    /* renamed from: timesAssign-jHG-Opc  reason: not valid java name */
    public static final void m35745timesAssignjHGOpc(float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        C12775o.m28639i(fArr4, "colorMatrix");
        float r3 = m35731dotMe4OoYI(fArr3, fArr3, 0, fArr4, 0);
        float r5 = m35731dotMe4OoYI(fArr3, fArr3, 0, fArr4, 1);
        float r7 = m35731dotMe4OoYI(fArr3, fArr3, 0, fArr4, 2);
        float r9 = m35731dotMe4OoYI(fArr3, fArr3, 0, fArr4, 3);
        float f = (fArr3[0] * fArr4[4]) + (fArr3[1] * fArr4[9]) + (fArr3[2] * fArr4[14]) + (fArr3[3] * fArr4[19]) + fArr3[4];
        float r12 = m35731dotMe4OoYI(fArr3, fArr3, 1, fArr4, 0);
        float r16 = m35731dotMe4OoYI(fArr3, fArr3, 1, fArr4, 1);
        float r17 = m35731dotMe4OoYI(fArr3, fArr3, 1, fArr4, 2);
        float r18 = m35731dotMe4OoYI(fArr3, fArr3, 1, fArr4, 3);
        float f2 = (fArr3[5] * fArr4[4]) + (fArr3[6] * fArr4[9]) + (fArr3[7] * fArr4[14]) + (fArr3[8] * fArr4[19]) + fArr3[9];
        float r24 = m35731dotMe4OoYI(fArr3, fArr3, 2, fArr4, 0);
        float r25 = m35731dotMe4OoYI(fArr3, fArr3, 2, fArr4, 1);
        float r26 = m35731dotMe4OoYI(fArr3, fArr3, 2, fArr4, 2);
        float r27 = m35731dotMe4OoYI(fArr3, fArr3, 2, fArr4, 3);
        float f3 = (fArr3[10] * fArr4[4]) + (fArr3[11] * fArr4[9]) + (fArr3[12] * fArr4[14]) + (fArr3[13] * fArr4[19]) + fArr3[14];
        float r33 = m35731dotMe4OoYI(fArr3, fArr3, 3, fArr4, 0);
        float r34 = m35731dotMe4OoYI(fArr3, fArr3, 3, fArr4, 1);
        float r35 = m35731dotMe4OoYI(fArr3, fArr3, 3, fArr4, 2);
        float r36 = m35731dotMe4OoYI(fArr3, fArr3, 3, fArr4, 3);
        fArr3[0] = r3;
        fArr3[1] = r5;
        fArr3[2] = r7;
        fArr3[3] = r9;
        fArr3[4] = f;
        fArr3[5] = r12;
        fArr3[6] = r16;
        fArr3[7] = r17;
        fArr3[8] = r18;
        fArr3[9] = f2;
        fArr3[10] = r24;
        fArr3[11] = r25;
        fArr3[12] = r26;
        fArr3[13] = r27;
        fArr3[14] = f3;
        fArr3[15] = r33;
        fArr3[16] = r34;
        fArr3[17] = r35;
        fArr3[18] = r36;
        fArr3[19] = (fArr3[15] * fArr4[4]) + (fArr3[16] * fArr4[9]) + (fArr3[17] * fArr4[14]) + (fArr3[18] * fArr4[19]) + fArr3[19];
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m35746toStringimpl(float[] fArr) {
        return "ColorMatrix(values=" + Arrays.toString(fArr) + ')';
    }

    public boolean equals(Object obj) {
        return m35732equalsimpl(this.values, obj);
    }

    public final float[] getValues() {
        return this.values;
    }

    public int hashCode() {
        return m35735hashCodeimpl(this.values);
    }

    public String toString() {
        return m35746toStringimpl(this.values);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ float[] m35747unboximpl() {
        return this.values;
    }
}
