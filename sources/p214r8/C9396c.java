package p214r8;

import java.util.Iterator;
import java.util.Set;
import p202q6.C9284d;
import p202q6.C9287e;
import p202q6.C9307q;

/* renamed from: r8.c */
/* compiled from: DefaultUserAgentPublisher */
public class C9396c implements C9403i {

    /* renamed from: a */
    private final String f13975a;

    /* renamed from: b */
    private final C9397d f13976b;

    C9396c(Set<C9399f> set, C9397d dVar) {
        this.f13975a = m19442e(set);
        this.f13976b = dVar;
    }

    /* renamed from: c */
    public static C9284d<C9403i> m19440c() {
        return C9284d.m19065c(C9403i.class).mo43572b(C9307q.m19145k(C9399f.class)).mo43576f(new C9395b()).mo43574d();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ C9403i m19441d(C9287e eVar) {
        return new C9396c(eVar.mo43560d(C9399f.class), C9397d.m19444a());
    }

    /* renamed from: e */
    private static String m19442e(Set<C9399f> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<C9399f> it = set.iterator();
        while (it.hasNext()) {
            C9399f next = it.next();
            sb.append(next.mo43815b());
            sb.append('/');
            sb.append(next.mo43816c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public String mo43820a() {
        if (this.f13976b.mo43821b().isEmpty()) {
            return this.f13975a;
        }
        return this.f13975a + ' ' + m19442e(this.f13976b.mo43821b());
    }
}
