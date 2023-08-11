package p042bo.app;

import android.content.Context;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p126j0.C8266c;
import p270x.C10156b;
import p404of.C13074a;

/* renamed from: bo.app.f5 */
public final class C3151f5 implements C3667s2 {

    /* renamed from: a */
    private final Context f1712a;

    /* renamed from: bo.app.f5$a */
    static final class C3152a extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3152a f1713b = new C3152a();

        C3152a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Content Cards enabled in server config. Requesting Content Cards refresh.";
        }
    }

    public C3151f5(Context context) {
        C12775o.m28639i(context, "applicationContext");
        this.f1712a = context;
    }

    /* renamed from: a */
    public void mo28917a() {
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3152a.f1713b, 7, (Object) null);
        C10156b.f15345m.mo44811g(this.f1712a).mo44791h0(false);
    }
}
