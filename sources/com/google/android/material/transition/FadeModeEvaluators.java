package com.google.android.material.transition;

class FadeModeEvaluators {
    private static final FadeModeEvaluator CROSS = new FadeModeEvaluator() {
        public FadeModeResult evaluate(float f, float f2, float f3, float f4) {
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f2, f3, f), TransitionUtils.lerp(0, 255, f2, f3, f));
        }
    };

    /* renamed from: IN */
    private static final FadeModeEvaluator f8542IN = new FadeModeEvaluator() {
        public FadeModeResult evaluate(float f, float f2, float f3, float f4) {
            return FadeModeResult.endOnTop(255, TransitionUtils.lerp(0, 255, f2, f3, f));
        }
    };
    private static final FadeModeEvaluator OUT = new FadeModeEvaluator() {
        public FadeModeResult evaluate(float f, float f2, float f3, float f4) {
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f2, f3, f), 255);
        }
    };
    private static final FadeModeEvaluator THROUGH = new FadeModeEvaluator() {
        public FadeModeResult evaluate(float f, float f2, float f3, float f4) {
            float f5 = ((f3 - f2) * f4) + f2;
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f2, f5, f), TransitionUtils.lerp(0, 255, f5, f3, f));
        }
    };

    private FadeModeEvaluators() {
    }

    static FadeModeEvaluator get(int i, boolean z) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return CROSS;
                }
                if (i == 3) {
                    return THROUGH;
                }
                throw new IllegalArgumentException("Invalid fade mode: " + i);
            } else if (z) {
                return OUT;
            } else {
                return f8542IN;
            }
        } else if (z) {
            return f8542IN;
        } else {
            return OUT;
        }
    }
}
