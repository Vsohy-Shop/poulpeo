package androidx.compose.p002ui.graphics;

import android.graphics.BitmapShader;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build;
import androidx.annotation.VisibleForTesting;
import androidx.compose.p002ui.geometry.Offset;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nAndroidShader.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidShader.android.kt\nandroidx/compose/ui/graphics/AndroidShader_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,205:1\n69#2,6:206\n*S KotlinDebug\n*F\n+ 1 AndroidShader.android.kt\nandroidx/compose/ui/graphics/AndroidShader_androidKt\n*L\n141#1:206,6\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.AndroidShader_androidKt */
/* compiled from: AndroidShader.android.kt */
public final class AndroidShader_androidKt {
    /* renamed from: ActualImageShader-F49vj9s  reason: not valid java name */
    public static final Shader m35562ActualImageShaderF49vj9s(ImageBitmap imageBitmap, int i, int i2) {
        C12775o.m28639i(imageBitmap, "image");
        return new BitmapShader(AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap), AndroidTileMode_androidKt.m35567toAndroidTileMode0vamqd0(i), AndroidTileMode_androidKt.m35567toAndroidTileMode0vamqd0(i2));
    }

    /* renamed from: ActualLinearGradientShader-VjE6UOU  reason: not valid java name */
    public static final Shader m35563ActualLinearGradientShaderVjE6UOU(long j, long j2, List<Color> list, List<Float> list2, int i) {
        List<Color> list3 = list;
        C12775o.m28639i(list, "colors");
        validateColorStops(list, list2);
        int countTransparentColors = countTransparentColors(list);
        return new LinearGradient(Offset.m35422getXimpl(j), Offset.m35423getYimpl(j), Offset.m35422getXimpl(j2), Offset.m35423getYimpl(j2), makeTransparentColors(list, countTransparentColors), makeTransparentStops(list2, list, countTransparentColors), AndroidTileMode_androidKt.m35567toAndroidTileMode0vamqd0(i));
    }

    /* renamed from: ActualRadialGradientShader-8uybcMk  reason: not valid java name */
    public static final Shader m35564ActualRadialGradientShader8uybcMk(long j, float f, List<Color> list, List<Float> list2, int i) {
        C12775o.m28639i(list, "colors");
        validateColorStops(list, list2);
        int countTransparentColors = countTransparentColors(list);
        return new RadialGradient(Offset.m35422getXimpl(j), Offset.m35423getYimpl(j), f, makeTransparentColors(list, countTransparentColors), makeTransparentStops(list2, list, countTransparentColors), AndroidTileMode_androidKt.m35567toAndroidTileMode0vamqd0(i));
    }

    /* renamed from: ActualSweepGradientShader-9KIMszo  reason: not valid java name */
    public static final Shader m35565ActualSweepGradientShader9KIMszo(long j, List<Color> list, List<Float> list2) {
        C12775o.m28639i(list, "colors");
        validateColorStops(list, list2);
        int countTransparentColors = countTransparentColors(list);
        return new SweepGradient(Offset.m35422getXimpl(j), Offset.m35423getYimpl(j), makeTransparentColors(list, countTransparentColors), makeTransparentStops(list2, list, countTransparentColors));
    }

    @VisibleForTesting
    public static final int countTransparentColors(List<Color> list) {
        boolean z;
        C12775o.m28639i(list, "colors");
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int m = C12726w.m28526m(list);
        int i = 0;
        for (int i2 = 1; i2 < m; i2++) {
            if (Color.m35673getAlphaimpl(list.get(i2).m35681unboximpl()) == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i++;
            }
        }
        return i;
    }

    @VisibleForTesting
    public static final int[] makeTransparentColors(List<Color> list, int i) {
        boolean z;
        int i2;
        List<Color> list2 = list;
        C12775o.m28639i(list2, "colors");
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            for (int i3 = 0; i3 < size; i3++) {
                iArr[i3] = ColorKt.m35725toArgb8_81llA(list2.get(i3).m35681unboximpl());
            }
            return iArr;
        }
        int[] iArr2 = new int[(list.size() + i)];
        int m = C12726w.m28526m(list);
        int size2 = list.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size2; i5++) {
            long r7 = list2.get(i5).m35681unboximpl();
            if (Color.m35673getAlphaimpl(r7) == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (i5 == 0) {
                    i2 = i4 + 1;
                    iArr2[i4] = ColorKt.m35725toArgb8_81llA(Color.m35670copywmQWz5c$default(list2.get(1).m35681unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null));
                } else if (i5 == m) {
                    i2 = i4 + 1;
                    iArr2[i4] = ColorKt.m35725toArgb8_81llA(Color.m35670copywmQWz5c$default(list2.get(i5 - 1).m35681unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null));
                } else {
                    int i6 = i4 + 1;
                    iArr2[i4] = ColorKt.m35725toArgb8_81llA(Color.m35670copywmQWz5c$default(list2.get(i5 - 1).m35681unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null));
                    i4 = i6 + 1;
                    iArr2[i6] = ColorKt.m35725toArgb8_81llA(Color.m35670copywmQWz5c$default(list2.get(i5 + 1).m35681unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null));
                }
                i4 = i2;
            } else {
                iArr2[i4] = ColorKt.m35725toArgb8_81llA(r7);
                i4++;
            }
        }
        return iArr2;
    }

    @VisibleForTesting
    public static final float[] makeTransparentStops(List<Float> list, List<Color> list2, int i) {
        float f;
        float f2;
        float f3;
        boolean z;
        C12775o.m28639i(list2, "colors");
        if (i != 0) {
            float[] fArr = new float[(list2.size() + i)];
            if (list != null) {
                f = list.get(0).floatValue();
            } else {
                f = 0.0f;
            }
            fArr[0] = f;
            int m = C12726w.m28526m(list2);
            int i2 = 1;
            for (int i3 = 1; i3 < m; i3++) {
                long r6 = list2.get(i3).m35681unboximpl();
                if (list != null) {
                    f3 = list.get(i3).floatValue();
                } else {
                    f3 = ((float) i3) / ((float) C12726w.m28526m(list2));
                }
                int i4 = i2 + 1;
                fArr[i2] = f3;
                if (Color.m35673getAlphaimpl(r6) == 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i2 = i4 + 1;
                    fArr[i4] = f3;
                } else {
                    i2 = i4;
                }
            }
            if (list != null) {
                f2 = list.get(C12726w.m28526m(list2)).floatValue();
            } else {
                f2 = 1.0f;
            }
            fArr[i2] = f2;
            return fArr;
        } else if (list != null) {
            return C12686e0.m28246y0(list);
        } else {
            return null;
        }
    }

    private static final void validateColorStops(List<Color> list, List<Float> list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
