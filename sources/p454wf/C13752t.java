package p454wf;

import kotlin.jvm.internal.C12775o;

/* renamed from: wf.t */
/* compiled from: StringNumberConversionsJVM.kt */
class C13752t extends C13751s {
    /* renamed from: i */
    public static Double m31516i(String str) {
        C12775o.m28639i(str, "<this>");
        try {
            if (C13742l.f22187b.mo53412e(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
