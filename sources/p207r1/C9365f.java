package p207r1;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* renamed from: r1.f */
/* compiled from: TranscoderRegistry */
public class C9365f {

    /* renamed from: a */
    private final List<C9366a<?, ?>> f13924a = new ArrayList();

    /* renamed from: r1.f$a */
    /* compiled from: TranscoderRegistry */
    private static final class C9366a<Z, R> {

        /* renamed from: a */
        private final Class<Z> f13925a;

        /* renamed from: b */
        private final Class<R> f13926b;

        /* renamed from: c */
        final C9364e<Z, R> f13927c;

        C9366a(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull C9364e<Z, R> eVar) {
            this.f13925a = cls;
            this.f13926b = cls2;
            this.f13927c = eVar;
        }

        /* renamed from: a */
        public boolean mo43791a(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            if (!this.f13925a.isAssignableFrom(cls) || !cls2.isAssignableFrom(this.f13926b)) {
                return false;
            }
            return true;
        }
    }

    @NonNull
    /* renamed from: a */
    public synchronized <Z, R> C9364e<Z, R> mo43788a(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C9367g.m19382b();
        }
        for (C9366a next : this.f13924a) {
            if (next.mo43791a(cls, cls2)) {
                return next.f13927c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    @NonNull
    /* renamed from: b */
    public synchronized <Z, R> List<Class<R>> mo43789b(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (C9366a<?, ?> a : this.f13924a) {
            if (a.mo43791a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public synchronized <Z, R> void mo43790c(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull C9364e<Z, R> eVar) {
        this.f13924a.add(new C9366a(cls, cls2, eVar));
    }
}
