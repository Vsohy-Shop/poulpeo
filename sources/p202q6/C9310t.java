package p202q6;

import p113h8.C8030b;

/* renamed from: q6.t */
/* compiled from: Lazy */
public class C9310t<T> implements C8030b<T> {

    /* renamed from: c */
    private static final Object f13674c = new Object();

    /* renamed from: a */
    private volatile Object f13675a = f13674c;

    /* renamed from: b */
    private volatile C8030b<T> f13676b;

    public C9310t(C8030b<T> bVar) {
        this.f13676b = bVar;
    }

    public T get() {
        T t = this.f13675a;
        T t2 = f13674c;
        if (t == t2) {
            synchronized (this) {
                t = this.f13675a;
                if (t == t2) {
                    t = this.f13676b.get();
                    this.f13675a = t;
                    this.f13676b = null;
                }
            }
        }
        return t;
    }
}
