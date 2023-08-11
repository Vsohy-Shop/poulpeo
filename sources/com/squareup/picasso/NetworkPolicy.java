package com.squareup.picasso;

public enum NetworkPolicy {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);
    

    /* renamed from: b */
    final int f18183b;

    private NetworkPolicy(int i) {
        this.f18183b = i;
    }

    /* renamed from: a */
    public static boolean m25118a(int i) {
        if ((i & OFFLINE.f18183b) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m25119b(int i) {
        if ((i & NO_CACHE.f18183b) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m25120c(int i) {
        if ((i & NO_STORE.f18183b) == 0) {
            return true;
        }
        return false;
    }
}
