package p051c8;

import android.os.Bundle;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p113h8.C8028a;
import p113h8.C8030b;
import p192p6.C9063a;

/* renamed from: c8.y2 */
/* compiled from: ProxyAnalyticsConnector */
public class C4029y2 implements C9063a {

    /* renamed from: a */
    private volatile Object f3218a;

    /* renamed from: c8.y2$b */
    /* compiled from: ProxyAnalyticsConnector */
    private static class C4031b implements C9063a.C9064a {

        /* renamed from: c */
        private static final Object f3219c = new Object();
        @GuardedBy("this")

        /* renamed from: a */
        private Set<String> f3220a;

        /* renamed from: b */
        private volatile Object f3221b;

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m4754c(String str, C9063a.C9065b bVar, C8030b bVar2) {
            if (this.f3221b != f3219c) {
                C9063a.C9064a f = ((C9063a) bVar2.get()).mo30051f(str, bVar);
                this.f3221b = f;
                synchronized (this) {
                    if (!this.f3220a.isEmpty()) {
                        f.mo30053a(this.f3220a);
                        this.f3220a = new HashSet();
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo30053a(@NonNull Set<String> set) {
            Object obj = this.f3221b;
            if (obj != f3219c) {
                if (obj != null) {
                    ((C9063a.C9064a) obj).mo30053a(set);
                    return;
                }
                synchronized (this) {
                    this.f3220a.addAll(set);
                }
            }
        }

        private C4031b(String str, C9063a.C9065b bVar, C8028a<C9063a> aVar) {
            this.f3220a = new HashSet();
            aVar.mo41859a(new C4035z2(this, str, bVar));
        }
    }

    public C4029y2(C8028a<C9063a> aVar) {
        this.f3218a = aVar;
        aVar.mo41859a(new C4025x2(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m4744i(C8030b bVar) {
        this.f3218a = bVar.get();
    }

    /* renamed from: j */
    private C9063a m4745j() {
        Object obj = this.f3218a;
        if (obj instanceof C9063a) {
            return (C9063a) obj;
        }
        return null;
    }

    @NonNull
    /* renamed from: a */
    public Map<String, Object> mo30045a(boolean z) {
        return Collections.emptyMap();
    }

    /* renamed from: c */
    public void mo30047c(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        C9063a j = m4745j();
        if (j != null) {
            j.mo30047c(str, str2, bundle);
        }
    }

    /* renamed from: d */
    public int mo30049d(@NonNull String str) {
        return 0;
    }

    @NonNull
    /* renamed from: e */
    public List<C9063a.C9066c> mo30050e(@NonNull String str, @Nullable String str2) {
        return Collections.emptyList();
    }

    @NonNull
    /* renamed from: f */
    public C9063a.C9064a mo30051f(@NonNull String str, @NonNull C9063a.C9065b bVar) {
        Object obj = this.f3218a;
        if (obj instanceof C9063a) {
            return ((C9063a) obj).mo30051f(str, bVar);
        }
        return new C4031b(str, bVar, (C8028a) obj);
    }

    /* renamed from: g */
    public void mo30052g(@NonNull String str, @NonNull String str2, @NonNull Object obj) {
        C9063a j = m4745j();
        if (j != null) {
            j.mo30052g(str, str2, obj);
        }
    }

    /* renamed from: b */
    public void mo30046b(@NonNull C9063a.C9066c cVar) {
    }

    public void clearConditionalUserProperty(@NonNull String str, @Nullable String str2, @Nullable Bundle bundle) {
    }
}
