package p458xd;

import p111h6.C8003j;

/* renamed from: xd.e0 */
/* compiled from: PartialForwardingClientCall */
abstract class C13790e0<ReqT, RespT> extends C13788e<ReqT, RespT> {
    C13790e0() {
    }

    /* renamed from: a */
    public void mo49848a(String str, Throwable th) {
        mo49857f().mo49848a(str, th);
    }

    /* renamed from: b */
    public void mo49849b() {
        mo49857f().mo49849b();
    }

    /* renamed from: c */
    public void mo49850c(int i) {
        mo49857f().mo49850c(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract C13788e<?, ?> mo49857f();

    public String toString() {
        return C8003j.m15723c(this).mo41840d("delegate", mo49857f()).toString();
    }
}
