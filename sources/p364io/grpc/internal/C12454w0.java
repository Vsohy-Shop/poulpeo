package p364io.grpc.internal;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* renamed from: io.grpc.internal.w0 */
/* compiled from: InUseStateAggregator */
public abstract class C12454w0<T> {

    /* renamed from: a */
    private final Set<T> f19874a = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: a */
    public final boolean mo50114a(Object... objArr) {
        for (Object contains : objArr) {
            if (this.f19874a.contains(contains)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo49866b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo49867c();

    /* renamed from: d */
    public final boolean mo50115d() {
        return !this.f19874a.isEmpty();
    }

    /* renamed from: e */
    public final void mo50116e(T t, boolean z) {
        int size = this.f19874a.size();
        if (z) {
            this.f19874a.add(t);
            if (size == 0) {
                mo49866b();
            }
        } else if (this.f19874a.remove(t) && size == 1) {
            mo49867c();
        }
    }
}
