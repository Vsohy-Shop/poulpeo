package androidx.compose.p002ui.graphics;

import androidx.compose.p002ui.geometry.MutableRect;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.geometry.Rect;
import java.util.Arrays;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,440:1\n39#1:441\n39#1:442\n39#1:443\n42#1,2:444\n42#1,2:446\n42#1,2:448\n42#1,2:450\n42#1,2:452\n42#1,2:454\n42#1,2:456\n42#1,2:458\n42#1,2:460\n42#1,2:462\n42#1,2:464\n42#1,2:466\n42#1,2:468\n42#1,2:470\n42#1,2:472\n42#1,2:474\n39#1:476\n39#1:477\n39#1:478\n39#1:479\n39#1:480\n39#1:481\n39#1:482\n39#1:483\n39#1:484\n39#1:485\n39#1:486\n39#1:487\n39#1:488\n39#1:489\n39#1:490\n39#1:491\n39#1:492\n39#1:493\n39#1:494\n39#1:495\n42#1,2:496\n42#1,2:498\n42#1,2:500\n42#1,2:502\n42#1,2:504\n42#1,2:506\n42#1,2:508\n42#1,2:510\n42#1,2:512\n42#1,2:514\n42#1,2:516\n42#1,2:518\n42#1,2:520\n42#1,2:522\n42#1,2:524\n42#1,2:526\n42#1,2:528\n39#1:530\n39#1:531\n39#1:532\n39#1:533\n39#1:534\n39#1:535\n39#1:536\n39#1:537\n42#1,2:538\n42#1,2:540\n42#1,2:542\n42#1,2:544\n42#1,2:546\n42#1,2:548\n42#1,2:550\n42#1,2:552\n39#1:554\n39#1:555\n39#1:556\n39#1:557\n39#1:558\n39#1:559\n39#1:560\n39#1:561\n42#1,2:562\n42#1,2:564\n42#1,2:566\n42#1,2:568\n42#1,2:570\n42#1,2:572\n42#1,2:574\n42#1,2:576\n39#1:578\n39#1:579\n39#1:580\n39#1:581\n39#1:582\n39#1:583\n39#1:584\n39#1:585\n42#1,2:586\n42#1,2:588\n42#1,2:590\n42#1,2:592\n42#1,2:594\n42#1,2:596\n42#1,2:598\n42#1,2:600\n39#1,5:602\n39#1,5:607\n39#1,5:612\n39#1,5:617\n39#1,5:622\n39#1,5:627\n39#1,5:632\n39#1,5:637\n39#1,5:642\n39#1,5:647\n39#1,5:652\n39#1,5:657\n39#1:662\n39#1:663\n39#1:664\n39#1:665\n39#1:666\n39#1:667\n39#1:668\n39#1:669\n39#1:670\n39#1:671\n39#1:672\n39#1:673\n39#1:674\n39#1:675\n39#1:676\n39#1:677\n42#1,2:678\n42#1,2:680\n42#1,2:682\n42#1,2:684\n*S KotlinDebug\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n51#1:441\n56#1:442\n57#1:443\n112#1:444,2\n113#1:446,2\n114#1:448,2\n115#1:450,2\n116#1:452,2\n117#1:454,2\n118#1:456,2\n119#1:458,2\n120#1:460,2\n121#1:462,2\n122#1:464,2\n123#1:466,2\n124#1:468,2\n125#1:470,2\n126#1:472,2\n127#1:474,2\n132#1:476\n133#1:477\n134#1:478\n135#1:479\n143#1:480\n144#1:481\n145#1:482\n146#1:483\n147#1:484\n148#1:485\n149#1:486\n150#1:487\n151#1:488\n152#1:489\n153#1:490\n154#1:491\n155#1:492\n156#1:493\n157#1:494\n158#1:495\n177#1:496,2\n178#1:498,2\n179#1:500,2\n180#1:502,2\n181#1:504,2\n182#1:506,2\n183#1:508,2\n184#1:510,2\n185#1:512,2\n186#1:514,2\n187#1:516,2\n188#1:518,2\n189#1:520,2\n190#1:522,2\n191#1:524,2\n192#1:526,2\n201#1:528,2\n220#1:530\n221#1:531\n225#1:532\n226#1:533\n230#1:534\n231#1:535\n235#1:536\n236#1:537\n240#1:538,2\n241#1:540,2\n242#1:542,2\n243#1:544,2\n244#1:546,2\n245#1:548,2\n246#1:550,2\n247#1:552,2\n257#1:554\n258#1:555\n262#1:556\n263#1:557\n267#1:558\n268#1:559\n272#1:560\n273#1:561\n277#1:562,2\n278#1:564,2\n279#1:566,2\n280#1:568,2\n281#1:570,2\n282#1:572,2\n283#1:574,2\n284#1:576,2\n294#1:578\n295#1:579\n299#1:580\n300#1:581\n304#1:582\n305#1:583\n309#1:584\n310#1:585\n314#1:586,2\n315#1:588,2\n316#1:590,2\n317#1:592,2\n318#1:594,2\n319#1:596,2\n320#1:598,2\n321#1:600,2\n326#1:602,5\n327#1:607,5\n328#1:612,5\n329#1:617,5\n330#1:622,5\n331#1:627,5\n332#1:632,5\n333#1:637,5\n334#1:642,5\n335#1:647,5\n336#1:652,5\n337#1:657,5\n342#1:662\n343#1:663\n344#1:664\n345#1:665\n346#1:666\n347#1:667\n348#1:668\n349#1:669\n350#1:670\n351#1:671\n352#1:672\n353#1:673\n354#1:674\n355#1:675\n356#1:676\n357#1:677\n358#1:678,2\n359#1:680,2\n360#1:682,2\n361#1:684,2\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.Matrix */
/* compiled from: Matrix.kt */
public final class Matrix {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int Perspective0 = 3;
    public static final int Perspective1 = 7;
    public static final int Perspective2 = 15;
    public static final int ScaleX = 0;
    public static final int ScaleY = 5;
    public static final int ScaleZ = 10;
    public static final int SkewX = 4;
    public static final int SkewY = 1;
    public static final int TranslateX = 12;
    public static final int TranslateY = 13;
    public static final int TranslateZ = 14;
    private final float[] values;

    /* renamed from: androidx.compose.ui.graphics.Matrix$Companion */
    /* compiled from: Matrix.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ Matrix(float[] fArr) {
        this.values = fArr;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Matrix m35896boximpl(float[] fArr) {
        return new Matrix(fArr);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static float[] m35897constructorimpl(float[] fArr) {
        C12775o.m28639i(fArr, "values");
        return fArr;
    }

    /* renamed from: constructor-impl$default  reason: not valid java name */
    public static /* synthetic */ float[] m35898constructorimpl$default(float[] fArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return m35897constructorimpl(fArr);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m35899equalsimpl(float[] fArr, Object obj) {
        if ((obj instanceof Matrix) && C12775o.m28634d(fArr, ((Matrix) obj).m35919unboximpl())) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m35900equalsimpl0(float[] fArr, float[] fArr2) {
        return C12775o.m28634d(fArr, fArr2);
    }

    /* renamed from: get-impl  reason: not valid java name */
    public static final float m35901getimpl(float[] fArr, int i, int i2) {
        return fArr[(i * 4) + i2];
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m35902hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    /* renamed from: invert-impl  reason: not valid java name */
    public static final void m35903invertimpl(float[] fArr) {
        boolean z;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (((((f17 * f28) - (f18 * f27)) + (f19 * f26)) + (f20 * f25)) - (f21 * f24)) + (f22 * f23);
        if (f29 == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            float f30 = 1.0f / f29;
            fArr[0] = (((f6 * f28) - (f7 * f27)) + (f8 * f26)) * f30;
            fArr[1] = ((((-f2) * f28) + (f3 * f27)) - (f4 * f26)) * f30;
            fArr[2] = (((f14 * f22) - (f15 * f21)) + (f16 * f20)) * f30;
            fArr[3] = ((((-f10) * f22) + (f11 * f21)) - (f12 * f20)) * f30;
            float f31 = -f5;
            fArr[4] = (((f31 * f28) + (f7 * f25)) - (f8 * f24)) * f30;
            fArr[5] = (((f28 * f) - (f3 * f25)) + (f4 * f24)) * f30;
            float f32 = -f13;
            fArr[6] = (((f32 * f22) + (f15 * f19)) - (f16 * f18)) * f30;
            fArr[7] = (((f22 * f9) - (f11 * f19)) + (f12 * f18)) * f30;
            fArr[8] = (((f5 * f27) - (f6 * f25)) + (f8 * f23)) * f30;
            fArr[9] = ((((-f) * f27) + (f25 * f2)) - (f4 * f23)) * f30;
            fArr[10] = (((f13 * f21) - (f14 * f19)) + (f16 * f17)) * f30;
            fArr[11] = ((((-f9) * f21) + (f19 * f10)) - (f12 * f17)) * f30;
            fArr[12] = (((f31 * f26) + (f6 * f24)) - (f7 * f23)) * f30;
            fArr[13] = (((f * f26) - (f2 * f24)) + (f3 * f23)) * f30;
            fArr[14] = (((f32 * f20) + (f14 * f18)) - (f15 * f17)) * f30;
            fArr[15] = (((f9 * f20) - (f10 * f18)) + (f11 * f17)) * f30;
        }
    }

    /* renamed from: map-MK-Hz9U  reason: not valid java name */
    public static final long m35904mapMKHz9U(float[] fArr, long j) {
        boolean z;
        float r0 = Offset.m35422getXimpl(j);
        float r5 = Offset.m35423getYimpl(j);
        float f = ((float) 1) / (((fArr[3] * r0) + (fArr[7] * r5)) + fArr[15]);
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            f = 0.0f;
        }
        return OffsetKt.Offset(((fArr[0] * r0) + (fArr[4] * r5) + fArr[12]) * f, f * ((fArr[1] * r0) + (fArr[5] * r5) + fArr[13]));
    }

    /* renamed from: map-impl  reason: not valid java name */
    public static final Rect m35905mapimpl(float[] fArr, Rect rect) {
        C12775o.m28639i(rect, "rect");
        long r0 = m35904mapMKHz9U(fArr, OffsetKt.Offset(rect.getLeft(), rect.getTop()));
        long r2 = m35904mapMKHz9U(fArr, OffsetKt.Offset(rect.getLeft(), rect.getBottom()));
        long r4 = m35904mapMKHz9U(fArr, OffsetKt.Offset(rect.getRight(), rect.getTop()));
        long r11 = m35904mapMKHz9U(fArr, OffsetKt.Offset(rect.getRight(), rect.getBottom()));
        return new Rect(Math.min(Math.min(Offset.m35422getXimpl(r0), Offset.m35422getXimpl(r2)), Math.min(Offset.m35422getXimpl(r4), Offset.m35422getXimpl(r11))), Math.min(Math.min(Offset.m35423getYimpl(r0), Offset.m35423getYimpl(r2)), Math.min(Offset.m35423getYimpl(r4), Offset.m35423getYimpl(r11))), Math.max(Math.max(Offset.m35422getXimpl(r0), Offset.m35422getXimpl(r2)), Math.max(Offset.m35422getXimpl(r4), Offset.m35422getXimpl(r11))), Math.max(Math.max(Offset.m35423getYimpl(r0), Offset.m35423getYimpl(r2)), Math.max(Offset.m35423getYimpl(r4), Offset.m35423getYimpl(r11))));
    }

    /* renamed from: reset-impl  reason: not valid java name */
    public static final void m35907resetimpl(float[] fArr) {
        float f;
        for (int i = 0; i < 4; i++) {
            for (int i2 = 0; i2 < 4; i2++) {
                if (i == i2) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                fArr[(i2 * 4) + i] = f;
            }
        }
    }

    /* renamed from: rotateX-impl  reason: not valid java name */
    public static final void m35908rotateXimpl(float[] fArr, float f) {
        double d = (((double) f) * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[5];
        float f5 = fArr[6];
        float f6 = fArr[9];
        float f7 = fArr[10];
        float f8 = fArr[13];
        float f9 = fArr[14];
        fArr[1] = (f2 * cos) - (f3 * sin);
        fArr[2] = (f2 * sin) + (f3 * cos);
        fArr[5] = (f4 * cos) - (f5 * sin);
        fArr[6] = (f4 * sin) + (f5 * cos);
        fArr[9] = (f6 * cos) - (f7 * sin);
        fArr[10] = (f6 * sin) + (f7 * cos);
        fArr[13] = (f8 * cos) - (f9 * sin);
        fArr[14] = (f8 * sin) + (f9 * cos);
    }

    /* renamed from: rotateY-impl  reason: not valid java name */
    public static final void m35909rotateYimpl(float[] fArr, float f) {
        double d = (((double) f) * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f2 = fArr[0];
        float f3 = fArr[2];
        float f4 = fArr[4];
        float f5 = fArr[6];
        float f6 = fArr[8];
        float f7 = fArr[10];
        float f8 = fArr[12];
        float f9 = fArr[14];
        fArr[0] = (f2 * cos) + (f3 * sin);
        fArr[2] = ((-f2) * sin) + (f3 * cos);
        fArr[4] = (f4 * cos) + (f5 * sin);
        fArr[6] = ((-f4) * sin) + (f5 * cos);
        fArr[8] = (f6 * cos) + (f7 * sin);
        fArr[10] = ((-f6) * sin) + (f7 * cos);
        fArr[12] = (f8 * cos) + (f9 * sin);
        fArr[14] = ((-f8) * sin) + (f9 * cos);
    }

    /* renamed from: rotateZ-impl  reason: not valid java name */
    public static final void m35910rotateZimpl(float[] fArr, float f) {
        double d = (((double) f) * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f2 = fArr[0];
        float f3 = fArr[4];
        float f4 = -sin;
        float f5 = fArr[1];
        float f6 = fArr[5];
        float f7 = fArr[2];
        float f8 = fArr[6];
        float f9 = fArr[3];
        float f10 = fArr[7];
        fArr[0] = (cos * f2) + (sin * f3);
        fArr[1] = (cos * f5) + (sin * f6);
        fArr[2] = (cos * f7) + (sin * f8);
        fArr[3] = (cos * f9) + (sin * f10);
        fArr[4] = (f2 * f4) + (f3 * cos);
        fArr[5] = (f5 * f4) + (f6 * cos);
        fArr[6] = (f7 * f4) + (f8 * cos);
        fArr[7] = (f4 * f9) + (cos * f10);
    }

    /* renamed from: scale-impl  reason: not valid java name */
    public static final void m35911scaleimpl(float[] fArr, float f, float f2, float f3) {
        fArr[0] = fArr[0] * f;
        fArr[1] = fArr[1] * f;
        fArr[2] = fArr[2] * f;
        fArr[3] = fArr[3] * f;
        fArr[4] = fArr[4] * f2;
        fArr[5] = fArr[5] * f2;
        fArr[6] = fArr[6] * f2;
        fArr[7] = fArr[7] * f2;
        fArr[8] = fArr[8] * f3;
        fArr[9] = fArr[9] * f3;
        fArr[10] = fArr[10] * f3;
        fArr[11] = fArr[11] * f3;
    }

    /* renamed from: scale-impl$default  reason: not valid java name */
    public static /* synthetic */ void m35912scaleimpl$default(float[] fArr, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        if ((i & 4) != 0) {
            f3 = 1.0f;
        }
        m35911scaleimpl(fArr, f, f2, f3);
    }

    /* renamed from: set-impl  reason: not valid java name */
    public static final void m35913setimpl(float[] fArr, int i, int i2, float f) {
        fArr[(i * 4) + i2] = f;
    }

    /* renamed from: setFrom-58bKbWc  reason: not valid java name */
    public static final void m35914setFrom58bKbWc(float[] fArr, float[] fArr2) {
        C12775o.m28639i(fArr2, "matrix");
        for (int i = 0; i < 16; i++) {
            fArr[i] = fArr2[i];
        }
    }

    /* renamed from: timesAssign-58bKbWc  reason: not valid java name */
    public static final void m35915timesAssign58bKbWc(float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        C12775o.m28639i(fArr4, "m");
        float r3 = MatrixKt.m35921dotp89u6pk(fArr3, 0, fArr4, 0);
        float r5 = MatrixKt.m35921dotp89u6pk(fArr3, 0, fArr4, 1);
        float r7 = MatrixKt.m35921dotp89u6pk(fArr3, 0, fArr4, 2);
        float r9 = MatrixKt.m35921dotp89u6pk(fArr3, 0, fArr4, 3);
        float r10 = MatrixKt.m35921dotp89u6pk(fArr3, 1, fArr4, 0);
        float r11 = MatrixKt.m35921dotp89u6pk(fArr3, 1, fArr4, 1);
        float r12 = MatrixKt.m35921dotp89u6pk(fArr3, 1, fArr4, 2);
        float r13 = MatrixKt.m35921dotp89u6pk(fArr3, 1, fArr4, 3);
        float r14 = MatrixKt.m35921dotp89u6pk(fArr3, 2, fArr4, 0);
        float r15 = MatrixKt.m35921dotp89u6pk(fArr3, 2, fArr4, 1);
        float r16 = MatrixKt.m35921dotp89u6pk(fArr3, 2, fArr4, 2);
        float r17 = MatrixKt.m35921dotp89u6pk(fArr3, 2, fArr4, 3);
        float r18 = MatrixKt.m35921dotp89u6pk(fArr3, 3, fArr4, 0);
        float r19 = MatrixKt.m35921dotp89u6pk(fArr3, 3, fArr4, 1);
        float r20 = MatrixKt.m35921dotp89u6pk(fArr3, 3, fArr4, 2);
        float r1 = MatrixKt.m35921dotp89u6pk(fArr3, 3, fArr4, 3);
        fArr3[0] = r3;
        fArr3[1] = r5;
        fArr3[2] = r7;
        fArr3[3] = r9;
        fArr3[4] = r10;
        fArr3[5] = r11;
        fArr3[6] = r12;
        fArr3[7] = r13;
        fArr3[8] = r14;
        fArr3[9] = r15;
        fArr3[10] = r16;
        fArr3[11] = r17;
        fArr3[12] = r18;
        fArr3[13] = r19;
        fArr3[14] = r20;
        fArr3[15] = r1;
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m35916toStringimpl(float[] fArr) {
        return C13745o.m31511f("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
    }

    /* renamed from: translate-impl  reason: not valid java name */
    public static final void m35917translateimpl(float[] fArr, float f, float f2, float f3) {
        float f4 = (fArr[0] * f) + (fArr[4] * f2) + (fArr[8] * f3) + fArr[12];
        float f5 = (fArr[1] * f) + (fArr[5] * f2) + (fArr[9] * f3) + fArr[13];
        float f6 = (fArr[2] * f) + (fArr[6] * f2) + (fArr[10] * f3) + fArr[14];
        fArr[12] = f4;
        fArr[13] = f5;
        fArr[14] = f6;
        fArr[15] = (fArr[3] * f) + (fArr[7] * f2) + (fArr[11] * f3) + fArr[15];
    }

    /* renamed from: translate-impl$default  reason: not valid java name */
    public static /* synthetic */ void m35918translateimpl$default(float[] fArr, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        m35917translateimpl(fArr, f, f2, f3);
    }

    public boolean equals(Object obj) {
        return m35899equalsimpl(this.values, obj);
    }

    public final float[] getValues() {
        return this.values;
    }

    public int hashCode() {
        return m35902hashCodeimpl(this.values);
    }

    public String toString() {
        return m35916toStringimpl(this.values);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ float[] m35919unboximpl() {
        return this.values;
    }

    /* renamed from: map-impl  reason: not valid java name */
    public static final void m35906mapimpl(float[] fArr, MutableRect mutableRect) {
        C12775o.m28639i(mutableRect, "rect");
        long r0 = m35904mapMKHz9U(fArr, OffsetKt.Offset(mutableRect.getLeft(), mutableRect.getTop()));
        long r2 = m35904mapMKHz9U(fArr, OffsetKt.Offset(mutableRect.getLeft(), mutableRect.getBottom()));
        long r4 = m35904mapMKHz9U(fArr, OffsetKt.Offset(mutableRect.getRight(), mutableRect.getTop()));
        long r6 = m35904mapMKHz9U(fArr, OffsetKt.Offset(mutableRect.getRight(), mutableRect.getBottom()));
        mutableRect.setLeft(Math.min(Math.min(Offset.m35422getXimpl(r0), Offset.m35422getXimpl(r2)), Math.min(Offset.m35422getXimpl(r4), Offset.m35422getXimpl(r6))));
        mutableRect.setTop(Math.min(Math.min(Offset.m35423getYimpl(r0), Offset.m35423getYimpl(r2)), Math.min(Offset.m35423getYimpl(r4), Offset.m35423getYimpl(r6))));
        mutableRect.setRight(Math.max(Math.max(Offset.m35422getXimpl(r0), Offset.m35422getXimpl(r2)), Math.max(Offset.m35422getXimpl(r4), Offset.m35422getXimpl(r6))));
        mutableRect.setBottom(Math.max(Math.max(Offset.m35423getYimpl(r0), Offset.m35423getYimpl(r2)), Math.max(Offset.m35423getYimpl(r4), Offset.m35423getYimpl(r6))));
    }
}
