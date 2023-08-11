package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.be */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C4843be implements C5186ve {

    /* renamed from: b */
    private static final C4948he f5159b = new C5253zd();

    /* renamed from: a */
    private final C4948he f5160a;

    public C4843be() {
        C4948he heVar;
        C4948he[] heVarArr = new C4948he[2];
        heVarArr[0] = C4824ad.m6785c();
        try {
            heVar = (C4948he) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            heVar = f5159b;
        }
        heVarArr[1] = heVar;
        C4825ae aeVar = new C4825ae(heVarArr);
        C5032md.m7199f(aeVar, "messageInfoFactory");
        this.f5160a = aeVar;
    }

    /* renamed from: b */
    private static boolean m6828b(C4931ge geVar) {
        if (geVar.mo32814x() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final C5169ue mo32648a(Class cls) {
        C5203we.m7649e(cls);
        C4931ge a = this.f5160a.mo32616a(cls);
        Class<C4878dd> cls2 = C4878dd.class;
        if (a.zzb()) {
            if (cls2.isAssignableFrom(cls)) {
                return C5050ne.m7285h(C5203we.m7646b(), C5201wc.m7618b(), a.zza());
            }
            return C5050ne.m7285h(C5203we.m7644Z(), C5201wc.m7617a(), a.zza());
        } else if (cls2.isAssignableFrom(cls)) {
            if (m6828b(a)) {
                return C5033me.m7222r(cls, a, C5084pe.m7369b(), C5219xd.m7681d(), C5203we.m7646b(), C5201wc.m7618b(), C4914fe.m6980b());
            }
            return C5033me.m7222r(cls, a, C5084pe.m7369b(), C5219xd.m7681d(), C5203we.m7646b(), (C5167uc) null, C4914fe.m6980b());
        } else if (m6828b(a)) {
            return C5033me.m7222r(cls, a, C5084pe.m7368a(), C5219xd.m7680c(), C5203we.m7644Z(), C5201wc.m7617a(), C4914fe.m6979a());
        } else {
            return C5033me.m7222r(cls, a, C5084pe.m7368a(), C5219xd.m7680c(), C5203we.m7645a(), (C5167uc) null, C4914fe.m6979a());
        }
    }
}
