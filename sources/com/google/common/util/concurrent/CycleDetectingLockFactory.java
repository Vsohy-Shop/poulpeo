package com.google.common.util.concurrent;

import com.google.common.collect.C6826n;
import com.google.common.collect.C6830p;
import com.google.common.collect.C6831q;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

public class CycleDetectingLockFactory {

    /* renamed from: a */
    private static final ConcurrentMap<Class<? extends Enum>, Map<? extends Enum, C6890c>> f9055a = new C6831q().mo39538l().mo39535i();

    /* renamed from: b */
    private static final Logger f9056b = Logger.getLogger(CycleDetectingLockFactory.class.getName());

    /* renamed from: c */
    private static final ThreadLocal<ArrayList<C6890c>> f9057c = new C6888a();

    public static final class PotentialDeadlockException extends C6889b {

        /* renamed from: d */
        private final C6889b f9058d;

        public String getMessage() {
            StringBuilder sb = new StringBuilder(super.getMessage());
            for (Throwable th = this.f9058d; th != null; th = th.getCause()) {
                sb.append(", ");
                sb.append(th.getMessage());
            }
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$a */
    class C6888a extends ThreadLocal<ArrayList<C6890c>> {
        C6888a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public ArrayList<C6890c> initialValue() {
            return C6830p.m11687f(3);
        }
    }

    /* renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$b */
    private static class C6889b extends IllegalStateException {

        /* renamed from: b */
        static final StackTraceElement[] f9059b = new StackTraceElement[0];

        /* renamed from: c */
        static final C6826n<String> f9060c = C6826n.m11669H(CycleDetectingLockFactory.class.getName(), C6889b.class.getName(), C6890c.class.getName());
    }

    /* renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$c */
    private static class C6890c {
    }
}
