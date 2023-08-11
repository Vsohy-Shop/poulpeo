package com.google.common.util.concurrent;

import java.util.concurrent.locks.LockSupport;

/* renamed from: com.google.common.util.concurrent.f */
/* compiled from: OverflowAvoidingLockSupport */
final class C6908f {
    /* renamed from: a */
    static void m11992a(Object obj, long j) {
        LockSupport.parkNanos(obj, Math.min(j, 2147483647999999999L));
    }
}
