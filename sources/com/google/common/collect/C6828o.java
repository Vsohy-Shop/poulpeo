package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p111h6.C8012n;

/* renamed from: com.google.common.collect.o */
/* compiled from: Iterators */
public final class C6828o {

    /* renamed from: com.google.common.collect.o$a */
    /* compiled from: Iterators */
    class C6829a extends C6809d0<T> {

        /* renamed from: b */
        boolean f8946b;

        /* renamed from: c */
        final /* synthetic */ Object f8947c;

        C6829a(Object obj) {
            this.f8947c = obj;
        }

        public boolean hasNext() {
            return !this.f8946b;
        }

        public T next() {
            if (!this.f8946b) {
                this.f8946b = true;
                return this.f8947c;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: a */
    public static <T> boolean m11679a(Collection<T> collection, Iterator<? extends T> it) {
        C8012n.m15755n(collection);
        C8012n.m15755n(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:2:0x0006  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m11680b(java.util.Iterator<?> r3, java.util.Iterator<?> r4) {
        /*
        L_0x0000:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x001d
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            java.lang.Object r0 = r3.next()
            java.lang.Object r2 = r4.next()
            boolean r0 = p111h6.C8007k.m15735a(r0, r2)
            if (r0 != 0) goto L_0x0000
            return r1
        L_0x001d:
            boolean r3 = r4.hasNext()
            r3 = r3 ^ 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.C6828o.m11680b(java.util.Iterator, java.util.Iterator):boolean");
    }

    /* renamed from: c */
    public static <T> C6809d0<T> m11681c(T t) {
        return new C6829a(t);
    }
}
