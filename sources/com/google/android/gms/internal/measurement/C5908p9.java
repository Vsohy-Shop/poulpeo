package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.p9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
final class C5908p9 implements C5828ka {

    /* renamed from: b */
    private static final C6020w9 f7277b = new C5876n9();

    /* renamed from: a */
    private final C6020w9 f7278a;

    public C5908p9() {
        C6020w9 w9Var;
        C6020w9[] w9VarArr = new C6020w9[2];
        w9VarArr[0] = C5939r8.m9828c();
        try {
            w9Var = (C6020w9) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            w9Var = f7277b;
        }
        w9VarArr[1] = w9Var;
        C5892o9 o9Var = new C5892o9(w9VarArr);
        C5708d9.m9019f(o9Var, "messageInfoFactory");
        this.f7278a = o9Var;
    }

    /* renamed from: b */
    private static boolean m9756b(C5988u9 u9Var) {
        if (u9Var.mo34094x() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final <T> C5811ja<T> mo34143a(Class<T> cls) {
        C5845la.m9597g(cls);
        C5988u9 a = this.f7278a.mo34224a(cls);
        Class<C6003v8> cls2 = C6003v8.class;
        if (a.zzb()) {
            if (cls2.isAssignableFrom(cls)) {
                return C5692ca.m8911j(C5845la.m9591b(), C5843l8.m9558b(), a.zza());
            }
            return C5692ca.m8911j(C5845la.m9592b0(), C5843l8.m9557a(), a.zza());
        } else if (cls2.isAssignableFrom(cls)) {
            if (m9756b(a)) {
                return C5675ba.m8803F(cls, a, C5726ea.m9146b(), C5844l9.m9560d(), C5845la.m9591b(), C5843l8.m9558b(), C5972t9.m9970b());
            }
            return C5675ba.m8803F(cls, a, C5726ea.m9146b(), C5844l9.m9560d(), C5845la.m9591b(), (C5809j8<?>) null, C5972t9.m9970b());
        } else if (m9756b(a)) {
            return C5675ba.m8803F(cls, a, C5726ea.m9145a(), C5844l9.m9559c(), C5845la.m9592b0(), C5843l8.m9557a(), C5972t9.m9969a());
        } else {
            return C5675ba.m8803F(cls, a, C5726ea.m9145a(), C5844l9.m9559c(), C5845la.m9589a(), (C5809j8<?>) null, C5972t9.m9969a());
        }
    }
}
