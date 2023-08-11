package com.google.android.material.color;

final class Blend {
    private static final float HARMONIZE_MAX_DEGREES = 15.0f;
    private static final float HARMONIZE_PERCENTAGE = 0.5f;

    private Blend() {
    }

    public static int blendCam16Ucs(int i, int i2, float f) {
        Cam16 fromInt = Cam16.fromInt(i);
        Cam16 fromInt2 = Cam16.fromInt(i2);
        float jStar = fromInt.getJStar();
        float aStar = fromInt.getAStar();
        float bStar = fromInt.getBStar();
        return Cam16.fromUcs(jStar + ((fromInt2.getJStar() - jStar) * f), aStar + ((fromInt2.getAStar() - aStar) * f), bStar + ((fromInt2.getBStar() - bStar) * f)).getInt();
    }

    public static int blendHctHue(int i, int i2, float f) {
        return Hct.from(Cam16.fromInt(blendCam16Ucs(i, i2, f)).getHue(), Cam16.fromInt(i).getChroma(), ColorUtils.lstarFromInt(i)).toInt();
    }

    public static int harmonize(int i, int i2) {
        Hct fromInt = Hct.fromInt(i);
        Hct fromInt2 = Hct.fromInt(i2);
        return Hct.from(MathUtils.sanitizeDegrees(fromInt.getHue() + (Math.min(MathUtils.differenceDegrees(fromInt.getHue(), fromInt2.getHue()) * 0.5f, HARMONIZE_MAX_DEGREES) * rotationDirection(fromInt.getHue(), fromInt2.getHue()))), fromInt.getChroma(), fromInt.getTone()).toInt();
    }

    private static float rotationDirection(float f, float f2) {
        float f3 = f2 - f;
        float f4 = f3 + 360.0f;
        float f5 = f3 - 360.0f;
        float abs = Math.abs(f3);
        float abs2 = Math.abs(f4);
        float abs3 = Math.abs(f5);
        if (abs > abs2 || abs > abs3) {
            if (abs2 > abs || abs2 > abs3) {
                if (((double) f5) >= 0.0d) {
                    return 1.0f;
                }
                return -1.0f;
            } else if (((double) f4) >= 0.0d) {
                return 1.0f;
            } else {
                return -1.0f;
            }
        } else if (((double) f3) >= 0.0d) {
            return 1.0f;
        } else {
            return -1.0f;
        }
    }
}
