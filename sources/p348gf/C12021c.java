package p348gf;

import kotlin.jvm.internal.C12775o;

/* renamed from: gf.c */
/* compiled from: _ComparisonsJvm.kt */
class C12021c extends C12019b {
    /* renamed from: f */
    public static float m26109f(float f, float... fArr) {
        C12775o.m28639i(fArr, "other");
        for (float max : fArr) {
            f = Math.max(f, max);
        }
        return f;
    }

    /* renamed from: g */
    public static float m26110g(float f, float... fArr) {
        C12775o.m28639i(fArr, "other");
        for (float min : fArr) {
            f = Math.min(f, min);
        }
        return f;
    }
}
