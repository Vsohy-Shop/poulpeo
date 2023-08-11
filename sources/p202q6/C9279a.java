package p202q6;

import java.util.Set;
import p113h8.C8030b;

/* renamed from: q6.a */
/* compiled from: AbstractComponentContainer */
abstract class C9279a implements C9287e {
    C9279a() {
    }

    /* renamed from: a */
    public <T> T mo43559a(Class<T> cls) {
        C8030b<T> b = mo43561b(cls);
        if (b == null) {
            return null;
        }
        return b.get();
    }

    /* renamed from: d */
    public <T> Set<T> mo43560d(Class<T> cls) {
        return mo43562c(cls).get();
    }
}
