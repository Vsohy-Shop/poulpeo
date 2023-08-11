package p037b6;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: b6.w */
final class C2933w {

    /* renamed from: a */
    private final ConcurrentHashMap<C2932v, List<Throwable>> f1332a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f1333b = new ReferenceQueue<>();

    C2933w() {
    }

    /* renamed from: a */
    public final List<Throwable> mo28475a(Throwable th) {
        while (true) {
            Reference<? extends Throwable> poll = this.f1333b.poll();
            if (poll == null) {
                break;
            }
            this.f1332a.remove(poll);
        }
        List<Throwable> list = this.f1332a.get(new C2932v(th, (ReferenceQueue<Throwable>) null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f1332a.putIfAbsent(new C2932v(th, this.f1333b), vector);
        if (putIfAbsent == null) {
            return vector;
        }
        return putIfAbsent;
    }
}
