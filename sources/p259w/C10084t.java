package p259w;

import kotlin.jvm.internal.C12771l;
import p404of.C13074a;

/* renamed from: w.t */
/* compiled from: Time.kt */
public final class C10084t {

    /* renamed from: a */
    public static final C10084t f15243a = new C10084t();

    /* renamed from: b */
    private static C13074a<Long> f15244b = C10085a.f15245b;

    /* renamed from: w.t$a */
    /* compiled from: Time.kt */
    /* synthetic */ class C10085a extends C12771l implements C13074a<Long> {

        /* renamed from: b */
        public static final C10085a f15245b = new C10085a();

        C10085a() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        /* renamed from: b */
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    private C10084t() {
    }

    /* renamed from: a */
    public final long mo44665a() {
        return f15244b.invoke().longValue();
    }
}
