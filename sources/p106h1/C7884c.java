package p106h1;

import java.util.Queue;
import p106h1.C7898l;
import p294z1.C10792k;

/* renamed from: h1.c */
/* compiled from: BaseKeyPool */
abstract class C7884c<T extends C7898l> {

    /* renamed from: a */
    private final Queue<T> f11015a = C10792k.m22954e(20);

    C7884c() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract T mo41597a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public T mo41598b() {
        T t = (C7898l) this.f11015a.poll();
        if (t == null) {
            return mo41597a();
        }
        return t;
    }

    /* renamed from: c */
    public void mo41599c(T t) {
        if (this.f11015a.size() < 20) {
            this.f11015a.offer(t);
        }
    }
}
