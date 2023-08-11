package com.google.common.collect;

/* renamed from: com.google.common.collect.u */
/* compiled from: ObjectArrays */
public final class C6874u {
    /* renamed from: a */
    static Object m11859a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append("at index ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    /* renamed from: b */
    static Object[] m11860b(Object... objArr) {
        return m11861c(objArr, objArr.length);
    }

    /* renamed from: c */
    static Object[] m11861c(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            m11859a(objArr[i2], i2);
        }
        return objArr;
    }

    /* renamed from: d */
    public static <T> T[] m11862d(T[] tArr, int i) {
        return C6876w.m11866b(tArr, i);
    }
}
