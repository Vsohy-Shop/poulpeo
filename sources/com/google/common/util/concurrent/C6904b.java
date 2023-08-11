package com.google.common.util.concurrent;

import sun.misc.Unsafe;

/* renamed from: com.google.common.util.concurrent.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6904b {
    /* renamed from: a */
    public static /* synthetic */ boolean m11989a(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
