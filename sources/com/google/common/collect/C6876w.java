package com.google.common.collect;

import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: com.google.common.collect.w */
/* compiled from: Platform */
final class C6876w {
    /* renamed from: a */
    static <T> T[] m11865a(Object[] objArr, int i, int i2, T[] tArr) {
        return Arrays.copyOfRange(objArr, i, i2, tArr.getClass());
    }

    /* renamed from: b */
    static <T> T[] m11866b(T[] tArr, int i) {
        return (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i);
    }
}
