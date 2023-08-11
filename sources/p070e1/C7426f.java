package p070e1;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p070e1.C7424e;
import p294z1.C10791j;

/* renamed from: e1.f */
/* compiled from: DataRewinderRegistry */
public class C7426f {

    /* renamed from: b */
    private static final C7424e.C7425a<?> f10267b = new C7427a();

    /* renamed from: a */
    private final Map<Class<?>, C7424e.C7425a<?>> f10268a = new HashMap();

    /* renamed from: e1.f$a */
    /* compiled from: DataRewinderRegistry */
    class C7427a implements C7424e.C7425a<Object> {
        C7427a() {
        }

        @NonNull
        /* renamed from: a */
        public Class<Object> mo41087a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @NonNull
        /* renamed from: b */
        public C7424e<Object> mo41088b(@NonNull Object obj) {
            return new C7428b(obj);
        }
    }

    @NonNull
    /* renamed from: a */
    public synchronized <T> C7424e<T> mo41089a(@NonNull T t) {
        C7424e.C7425a<?> aVar;
        C10791j.m22948d(t);
        aVar = this.f10268a.get(t.getClass());
        if (aVar == null) {
            Iterator<C7424e.C7425a<?>> it = this.f10268a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C7424e.C7425a<?> next = it.next();
                if (next.mo41087a().isAssignableFrom(t.getClass())) {
                    aVar = next;
                    break;
                }
            }
        }
        if (aVar == null) {
            aVar = f10267b;
        }
        return aVar.mo41088b(t);
    }

    /* renamed from: b */
    public synchronized void mo41090b(@NonNull C7424e.C7425a<?> aVar) {
        this.f10268a.put(aVar.mo41087a(), aVar);
    }

    /* renamed from: e1.f$b */
    /* compiled from: DataRewinderRegistry */
    private static final class C7428b implements C7424e<Object> {

        /* renamed from: a */
        private final Object f10269a;

        C7428b(@NonNull Object obj) {
            this.f10269a = obj;
        }

        @NonNull
        /* renamed from: a */
        public Object mo41085a() {
            return this.f10269a;
        }

        /* renamed from: b */
        public void mo41086b() {
        }
    }
}
