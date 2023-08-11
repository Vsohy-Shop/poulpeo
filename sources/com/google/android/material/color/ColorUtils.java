package com.google.android.material.color;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import java.util.Arrays;

final class ColorUtils {
    private static final float[] WHITE_POINT_D65 = {95.047f, 100.0f, 108.883f};

    private ColorUtils() {
    }

    public static int blueFromInt(int i) {
        return i & 255;
    }

    public static float delinearized(float f) {
        if (f <= 0.0031308f) {
            return f * 12.92f;
        }
        return (((float) Math.pow((double) f, 0.4166666567325592d)) * 1.055f) - 0.055f;
    }

    public static int greenFromInt(int i) {
        return (i & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
    }

    public static String hexFromInt(int i) {
        int redFromInt = redFromInt(i);
        int blueFromInt = blueFromInt(i);
        return String.format("#%02x%02x%02x", new Object[]{Integer.valueOf(redFromInt), Integer.valueOf(greenFromInt(i)), Integer.valueOf(blueFromInt)});
    }

    public static int intFromLab(double d, double d2, double d3) {
        double d4;
        double d5 = (d + 16.0d) / 116.0d;
        double d6 = (d2 / 500.0d) + d5;
        double d7 = d5 - (d3 / 200.0d);
        double d8 = d6 * d6 * d6;
        if (d8 <= 0.008856451679035631d) {
            d8 = ((d6 * 116.0d) - 16.0d) / 903.2962962962963d;
        }
        if (d > 8.0d) {
            d4 = d5 * d5 * d5;
        } else {
            d4 = d / 903.2962962962963d;
        }
        double d9 = d7 * d7 * d7;
        if (d9 <= 0.008856451679035631d) {
            d9 = ((d7 * 116.0d) - 16.0d) / 903.2962962962963d;
        }
        float[] fArr = WHITE_POINT_D65;
        return intFromXyzComponents((float) (d8 * ((double) fArr[0])), (float) (d4 * ((double) fArr[1])), (float) (d9 * ((double) fArr[2])));
    }

    public static int intFromLstar(float f) {
        boolean z;
        boolean z2;
        float f2;
        float f3;
        float f4 = (f + 16.0f) / 116.0f;
        float f5 = f4 * f4 * f4;
        if (f5 > 0.008856452f) {
            z = true;
        } else {
            z = false;
        }
        if (f > 8.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            f2 = f5;
        } else {
            f2 = f / 903.2963f;
        }
        if (z) {
            f3 = f5;
        } else {
            f3 = ((f4 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z) {
            f5 = ((f4 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = WHITE_POINT_D65;
        return intFromXyz(new float[]{f3 * fArr[0], f2 * fArr[1], f5 * fArr[2]});
    }

    public static int intFromRgb(int i, int i2, int i3) {
        return (((((i & 255) << 16) | ViewCompat.MEASURED_STATE_MASK) | ((i2 & 255) << 8)) | (i3 & 255)) >>> 0;
    }

    public static int intFromXyz(float[] fArr) {
        return intFromXyzComponents(fArr[0], fArr[1], fArr[2]);
    }

    public static int intFromXyzComponents(float f, float f2, float f3) {
        float f4 = f / 100.0f;
        float f5 = f2 / 100.0f;
        float f6 = f3 / 100.0f;
        float f7 = (3.2406f * f4) + (-1.5372f * f5) + (-0.4986f * f6);
        float f8 = (f4 * 0.0557f) + (f5 * -0.204f) + (f6 * 1.057f);
        return intFromRgb(Math.max(Math.min(255, Math.round(delinearized(f7) * 255.0f)), 0), Math.max(Math.min(255, Math.round(delinearized((-0.9689f * f4) + (1.8758f * f5) + (0.0415f * f6)) * 255.0f)), 0), Math.max(Math.min(255, Math.round(delinearized(f8) * 255.0f)), 0));
    }

    public static double[] labFromInt(int i) {
        double d;
        double d2;
        double d3;
        float[] xyzFromInt = xyzFromInt(i);
        float f = xyzFromInt[1];
        float[] fArr = WHITE_POINT_D65;
        double d4 = (double) (f / fArr[1]);
        if (d4 > 0.008856451679035631d) {
            d = Math.cbrt(d4);
        } else {
            d = ((d4 * 903.2962962962963d) + 16.0d) / 116.0d;
        }
        double d5 = (double) (xyzFromInt[0] / fArr[0]);
        if (d5 > 0.008856451679035631d) {
            d2 = Math.cbrt(d5);
        } else {
            d2 = ((d5 * 903.2962962962963d) + 16.0d) / 116.0d;
        }
        double d6 = (double) (xyzFromInt[2] / fArr[2]);
        if (d6 > 0.008856451679035631d) {
            d3 = Math.cbrt(d6);
        } else {
            d3 = ((d6 * 903.2962962962963d) + 16.0d) / 116.0d;
        }
        return new double[]{(116.0d * d) - 16.0d, (d2 - d) * 500.0d, (d - d3) * 200.0d};
    }

    public static float linearized(float f) {
        if (f <= 0.04045f) {
            return f / 12.92f;
        }
        return (float) Math.pow((double) ((f + 0.055f) / 1.055f), 2.4000000953674316d);
    }

    public static float lstarFromInt(int i) {
        return (float) labFromInt(i)[0];
    }

    public static int redFromInt(int i) {
        return (i & 16711680) >> 16;
    }

    public static final float[] whitePointD65() {
        return Arrays.copyOf(WHITE_POINT_D65, 3);
    }

    public static float[] xyzFromInt(int i) {
        float linearized = linearized(((float) redFromInt(i)) / 255.0f) * 100.0f;
        float linearized2 = linearized(((float) greenFromInt(i)) / 255.0f) * 100.0f;
        float linearized3 = linearized(((float) blueFromInt(i)) / 255.0f) * 100.0f;
        return new float[]{(0.41233894f * linearized) + (0.35762063f * linearized2) + (0.18051042f * linearized3), (0.2126f * linearized) + (0.7152f * linearized2) + (0.0722f * linearized3), (linearized * 0.01932141f) + (linearized2 * 0.11916382f) + (linearized3 * 0.9503448f)};
    }

    public static float yFromLstar(float f) {
        float f2;
        if (f > 8.0f) {
            f2 = (float) Math.pow((((double) f) + 16.0d) / 116.0d, 3.0d);
        } else {
            f2 = f / 903.2963f;
        }
        return f2 * 100.0f;
    }
}
