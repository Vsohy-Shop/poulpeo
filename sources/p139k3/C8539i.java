package p139k3;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p139k3.C8524b;

/* renamed from: k3.i */
/* compiled from: EventInternal */
public abstract class C8539i {

    /* renamed from: k3.i$a */
    /* compiled from: EventInternal */
    public static abstract class C8540a {
        /* renamed from: a */
        public final C8540a mo42604a(String str, int i) {
            mo42559e().put(str, String.valueOf(i));
            return this;
        }

        /* renamed from: b */
        public final C8540a mo42605b(String str, long j) {
            mo42559e().put(str, String.valueOf(j));
            return this;
        }

        /* renamed from: c */
        public final C8540a mo42606c(String str, String str2) {
            mo42559e().put(str, str2);
            return this;
        }

        /* renamed from: d */
        public abstract C8539i mo42558d();

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public abstract Map<String, String> mo42559e();

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public abstract C8540a mo42560f(Map<String, String> map);

        /* renamed from: g */
        public abstract C8540a mo42561g(Integer num);

        /* renamed from: h */
        public abstract C8540a mo42562h(C8538h hVar);

        /* renamed from: i */
        public abstract C8540a mo42563i(long j);

        /* renamed from: j */
        public abstract C8540a mo42564j(String str);

        /* renamed from: k */
        public abstract C8540a mo42565k(long j);
    }

    /* renamed from: a */
    public static C8540a m17122a() {
        return new C8524b.C8526b().mo42560f(new HashMap());
    }

    /* renamed from: b */
    public final String mo42599b(String str) {
        String str2 = mo42549c().get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Map<String, String> mo42549c();

    @Nullable
    /* renamed from: d */
    public abstract Integer mo42550d();

    /* renamed from: e */
    public abstract C8538h mo42551e();

    /* renamed from: f */
    public abstract long mo42553f();

    /* renamed from: g */
    public final int mo42600g(String str) {
        String str2 = mo42549c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* renamed from: h */
    public final long mo42601h(String str) {
        String str2 = mo42549c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Long.valueOf(str2).longValue();
    }

    /* renamed from: i */
    public final Map<String, String> mo42602i() {
        return Collections.unmodifiableMap(mo42549c());
    }

    /* renamed from: j */
    public abstract String mo42555j();

    /* renamed from: k */
    public abstract long mo42556k();

    /* renamed from: l */
    public C8540a mo42603l() {
        return new C8524b.C8526b().mo42564j(mo42555j()).mo42561g(mo42550d()).mo42562h(mo42551e()).mo42563i(mo42553f()).mo42565k(mo42556k()).mo42560f(new HashMap(mo42549c()));
    }
}
