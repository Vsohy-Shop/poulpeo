package p364io.grpc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* renamed from: io.grpc.s */
/* compiled from: ServiceProviders */
final class C12591s {

    /* renamed from: io.grpc.s$a */
    /* compiled from: ServiceProviders */
    class C12592a implements Comparator<T> {

        /* renamed from: b */
        final /* synthetic */ C12593b f20180b;

        C12592a(C12593b bVar) {
            this.f20180b = bVar;
        }

        public int compare(T t, T t2) {
            int b = this.f20180b.mo49598b(t) - this.f20180b.mo49598b(t2);
            if (b != 0) {
                return b;
            }
            return t.getClass().getName().compareTo(t2.getClass().getName());
        }
    }

    /* renamed from: io.grpc.s$b */
    /* compiled from: ServiceProviders */
    public interface C12593b<T> {
        /* renamed from: a */
        boolean mo49597a(T t);

        /* renamed from: b */
        int mo49598b(T t);
    }

    /* renamed from: a */
    static <T> T m27912a(Class<T> cls, Class<?> cls2) {
        try {
            return cls2.asSubclass(cls).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", new Object[]{cls2.getName(), th}), th);
        }
    }

    /* renamed from: b */
    static <T> Iterable<T> m27913b(Class<T> cls, Iterable<Class<?>> iterable) {
        ArrayList arrayList = new ArrayList();
        for (Class<?> a : iterable) {
            arrayList.add(m27912a(cls, a));
        }
        return arrayList;
    }

    /* renamed from: c */
    public static <T> Iterable<T> m27914c(Class<T> cls, ClassLoader classLoader) {
        ServiceLoader<S> load = ServiceLoader.load(cls, classLoader);
        if (!load.iterator().hasNext()) {
            return ServiceLoader.load(cls);
        }
        return load;
    }

    /* renamed from: d */
    static boolean m27915d(ClassLoader classLoader) {
        try {
            Class.forName("android.app.Application", false, classLoader);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Iterable<java.lang.Class<?>>, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> java.util.List<T> m27916e(java.lang.Class<T> r1, java.lang.Iterable<java.lang.Class<?>> r2, java.lang.ClassLoader r3, p364io.grpc.C12591s.C12593b<T> r4) {
        /*
            boolean r0 = m27915d(r3)
            if (r0 == 0) goto L_0x000b
            java.lang.Iterable r1 = m27913b(r1, r2)
            goto L_0x000f
        L_0x000b:
            java.lang.Iterable r1 = m27914c(r1, r3)
        L_0x000f:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0018:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x002d
            java.lang.Object r3 = r1.next()
            boolean r0 = r4.mo49597a(r3)
            if (r0 != 0) goto L_0x0029
            goto L_0x0018
        L_0x0029:
            r2.add(r3)
            goto L_0x0018
        L_0x002d:
            io.grpc.s$a r1 = new io.grpc.s$a
            r1.<init>(r4)
            java.util.Comparator r1 = java.util.Collections.reverseOrder(r1)
            java.util.Collections.sort(r2, r1)
            java.util.List r1 = java.util.Collections.unmodifiableList(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p364io.grpc.C12591s.m27916e(java.lang.Class, java.lang.Iterable, java.lang.ClassLoader, io.grpc.s$b):java.util.List");
    }
}
