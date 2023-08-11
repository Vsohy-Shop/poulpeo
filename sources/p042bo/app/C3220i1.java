package p042bo.app;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: bo.app.i1 */
public final class C3220i1 implements C3096d2 {

    /* renamed from: bo.app.i1$a */
    static final class C3221a extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f1823b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3221a(String str) {
            super(0);
            this.f1823b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Cannot create card control event for Feed card. Returning null. Card id: ", this.f1823b);
        }
    }

    /* renamed from: bo.app.i1$b */
    static final class C3222b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f1824b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3222b(String str) {
            super(0);
            this.f1824b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Cannot create card dismissed event for Feed card. Returning null. Card id: ", this.f1824b);
        }
    }

    /* renamed from: a */
    public C3785x1 mo28819a(String str) {
        C12775o.m28639i(str, "cardId");
        return C3240j.f1842h.mo29082e(str);
    }

    /* renamed from: b */
    public C3785x1 mo28820b(String str) {
        C12775o.m28639i(str, "cardId");
        C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C3221a(str), 6, (Object) null);
        return null;
    }

    /* renamed from: c */
    public C3785x1 mo28821c(String str) {
        C12775o.m28639i(str, "cardId");
        return C3240j.f1842h.mo29084f(str);
    }

    /* renamed from: d */
    public C3785x1 mo28822d(String str) {
        C12775o.m28639i(str, "cardId");
        C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C3222b(str), 6, (Object) null);
        return null;
    }
}
