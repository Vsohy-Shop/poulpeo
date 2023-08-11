package androidx.core.content.res;

import android.graphics.Color;
import androidx.annotation.NonNull;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;

final class CamUtils {
    static final float[][] CAM16RGB_TO_XYZ = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    static final float[][] SRGB_TO_XYZ = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    static final float[] WHITE_POINT_D65 = {95.047f, 100.0f, 108.883f};
    static final float[][] XYZ_TO_CAM16RGB = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    private CamUtils() {
    }

    static int intFromLStar(float f) {
        boolean z;
        float f2;
        boolean z2;
        float f3;
        if (f < 1.0f) {
            return ViewCompat.MEASURED_STATE_MASK;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f4 = (f + 16.0f) / 116.0f;
        if (f > 8.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f2 = f4 * f4 * f4;
        } else {
            f2 = f / 903.2963f;
        }
        float f5 = f4 * f4 * f4;
        if (f5 > 0.008856452f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            f3 = f5;
        } else {
            f3 = ((f4 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z2) {
            f5 = ((f4 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = WHITE_POINT_D65;
        return ColorUtils.XYZToColor((double) (f3 * fArr[0]), (double) (f2 * fArr[1]), (double) (f5 * fArr[2]));
    }

    static float lStarFromInt(int i) {
        return lStarFromY(yFromInt(i));
    }

    static float lStarFromY(float f) {
        float f2 = f / 100.0f;
        if (f2 <= 0.008856452f) {
            return f2 * 903.2963f;
        }
        return (((float) Math.cbrt((double) f2)) * 116.0f) - 16.0f;
    }

    static float lerp(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    static float linearized(int i) {
        float pow;
        float f = ((float) i) / 255.0f;
        if (f <= 0.04045f) {
            pow = f / 12.92f;
        } else {
            pow = (float) Math.pow((double) ((f + 0.055f) / 1.055f), 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    @NonNull
    static float[] xyzFromInt(int i) {
        float linearized = linearized(Color.red(i));
        float linearized2 = linearized(Color.green(i));
        float linearized3 = linearized(Color.blue(i));
        float[][] fArr = SRGB_TO_XYZ;
        float[] fArr2 = fArr[0];
        float f = (fArr2[0] * linearized) + (fArr2[1] * linearized2) + (fArr2[2] * linearized3);
        float[] fArr3 = fArr[1];
        float f2 = (fArr3[0] * linearized) + (fArr3[1] * linearized2) + (fArr3[2] * linearized3);
        float[] fArr4 = fArr[2];
        return new float[]{f, f2, (linearized * fArr4[0]) + (linearized2 * fArr4[1]) + (linearized3 * fArr4[2])};
    }

    static float yFromInt(int i) {
        float linearized = linearized(Color.red(i));
        float linearized2 = linearized(Color.green(i));
        float linearized3 = linearized(Color.blue(i));
        float[] fArr = SRGB_TO_XYZ[1];
        return (linearized * fArr[0]) + (linearized2 * fArr[1]) + (linearized3 * fArr[2]);
    }

    static float yFromLStar(float f) {
        float f2;
        if (f > 8.0f) {
            f2 = (float) Math.pow((((double) f) + 16.0d) / 116.0d, 3.0d);
        } else {
            f2 = f / 903.2963f;
        }
        return f2 * 100.0f;
    }
}
