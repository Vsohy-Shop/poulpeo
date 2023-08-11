package com.google.common.collect;

/* renamed from: com.google.common.collect.j */
/* compiled from: Hashing */
final class C6816j {
    /* renamed from: a */
    static int m11623a(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }

    /* renamed from: b */
    static int m11624b(Object obj) {
        int i;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        return m11623a(i);
    }
}
