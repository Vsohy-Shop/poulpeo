package com.squareup.picasso;

/* renamed from: com.squareup.picasso.m */
/* compiled from: MemoryPolicy */
public enum C11746m {
    NO_CACHE(1),
    NO_STORE(2);
    

    /* renamed from: b */
    final int f18279b;

    private C11746m(int i) {
        this.f18279b = i;
    }

    /* renamed from: a */
    static boolean m25215a(int i) {
        if ((i & NO_CACHE.f18279b) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    static boolean m25216b(int i) {
        if ((i & NO_STORE.f18279b) == 0) {
            return true;
        }
        return false;
    }
}
