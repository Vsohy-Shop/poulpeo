package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.e0 */
public enum C5317e0 {
    NONE,
    BATCH_BY_SESSION,
    BATCH_BY_TIME,
    BATCH_BY_BRUTE_FORCE,
    BATCH_BY_COUNT,
    BATCH_BY_SIZE;

    /* renamed from: a */
    public static C5317e0 m7875a(String str) {
        if ("BATCH_BY_SESSION".equalsIgnoreCase(str)) {
            return BATCH_BY_SESSION;
        }
        if ("BATCH_BY_TIME".equalsIgnoreCase(str)) {
            return BATCH_BY_TIME;
        }
        if ("BATCH_BY_BRUTE_FORCE".equalsIgnoreCase(str)) {
            return BATCH_BY_BRUTE_FORCE;
        }
        if ("BATCH_BY_COUNT".equalsIgnoreCase(str)) {
            return BATCH_BY_COUNT;
        }
        if ("BATCH_BY_SIZE".equalsIgnoreCase(str)) {
            return BATCH_BY_SIZE;
        }
        return NONE;
    }
}
