package p042bo.app;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.reflect.KProperty;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: bo.app.j3 */
public final class C3286j3<T> {

    /* renamed from: a */
    private T f1943a;

    /* renamed from: bo.app.j3$a */
    static final class C3287a extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ T f1944b;

        /* renamed from: c */
        final /* synthetic */ KProperty<?> f1945c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3287a(T t, KProperty<?> kProperty) {
            super(0);
            this.f1944b = t;
            this.f1945c = kProperty;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Cannot assign " + this.f1944b + " to only-set-once property " + this.f1945c.getName();
        }
    }

    public T getValue(Object obj, KProperty<?> kProperty) {
        C12775o.m28639i(obj, "thisRef");
        C12775o.m28639i(kProperty, "property");
        return this.f1943a;
    }

    public void setValue(Object obj, KProperty<?> kProperty, T t) {
        C12775o.m28639i(obj, "thisRef");
        C12775o.m28639i(kProperty, "property");
        T t2 = this.f1943a;
        if (t2 == null) {
            this.f1943a = t;
        } else if (!C12775o.m28634d(t2, t)) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3287a(t, kProperty), 7, (Object) null);
        }
    }
}
