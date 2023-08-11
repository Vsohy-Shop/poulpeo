package p364io.grpc.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Logger;

/* renamed from: io.grpc.internal.x1 */
/* compiled from: ReflectionLongAdderCounter */
public final class C12461x1 implements C12244e1 {

    /* renamed from: b */
    private static final Logger f19883b = Logger.getLogger(C12461x1.class.getName());

    /* renamed from: c */
    private static final Constructor<?> f19884c;

    /* renamed from: d */
    private static final Method f19885d;

    /* renamed from: e */
    private static final Method f19886e;

    /* renamed from: f */
    private static final RuntimeException f19887f;

    /* renamed from: g */
    private static final Object[] f19888g = {1L};

    /* renamed from: a */
    private final Object f19889a;

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055 A[ADDED_TO_REGION] */
    static {
        /*
            java.lang.Class<io.grpc.internal.x1> r0 = p364io.grpc.internal.C12461x1.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            f19883b = r0
            r0 = 1
            r1 = 0
            r2 = 0
            java.lang.String r3 = "java.util.concurrent.atomic.LongAdder"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x0046 }
            java.lang.String r4 = "add"
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch:{ all -> 0x0046 }
            java.lang.Class r6 = java.lang.Long.TYPE     // Catch:{ all -> 0x0046 }
            r5[r1] = r6     // Catch:{ all -> 0x0046 }
            java.lang.reflect.Method r4 = r3.getMethod(r4, r5)     // Catch:{ all -> 0x0046 }
            java.lang.String r5 = "sum"
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ all -> 0x0043 }
            java.lang.reflect.Method r5 = r3.getMethod(r5, r6)     // Catch:{ all -> 0x0043 }
            java.lang.reflect.Constructor[] r3 = r3.getConstructors()     // Catch:{ all -> 0x0041 }
            int r6 = r3.length     // Catch:{ all -> 0x0041 }
            r7 = r1
        L_0x002f:
            if (r7 >= r6) goto L_0x003e
            r8 = r3[r7]     // Catch:{ all -> 0x0041 }
            java.lang.Class[] r9 = r8.getParameterTypes()     // Catch:{ all -> 0x0041 }
            int r9 = r9.length     // Catch:{ all -> 0x0041 }
            if (r9 != 0) goto L_0x003b
            goto L_0x003f
        L_0x003b:
            int r7 = r7 + 1
            goto L_0x002f
        L_0x003e:
            r8 = r2
        L_0x003f:
            r3 = r2
            goto L_0x0053
        L_0x0041:
            r3 = move-exception
            goto L_0x0049
        L_0x0043:
            r3 = move-exception
            r5 = r2
            goto L_0x0049
        L_0x0046:
            r3 = move-exception
            r4 = r2
            r5 = r4
        L_0x0049:
            java.util.logging.Logger r6 = f19883b
            java.util.logging.Level r7 = java.util.logging.Level.FINE
            java.lang.String r8 = "LongAdder can not be found via reflection, this is normal for JDK7 and below"
            r6.log(r7, r8, r3)
            r8 = r2
        L_0x0053:
            if (r3 != 0) goto L_0x0060
            if (r8 == 0) goto L_0x0060
            f19884c = r8
            f19885d = r4
            f19886e = r5
            f19887f = r2
            goto L_0x006d
        L_0x0060:
            f19884c = r2
            f19885d = r2
            f19886e = r2
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r3)
            f19887f = r2
        L_0x006d:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 1
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0[r1] = r2
            f19888g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p364io.grpc.internal.C12461x1.<clinit>():void");
    }

    C12461x1() {
        RuntimeException runtimeException = f19887f;
        if (runtimeException == null) {
            try {
                this.f19889a = f19884c.newInstance(new Object[0]);
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3);
            }
        } else {
            throw runtimeException;
        }
    }

    /* renamed from: a */
    static boolean m27513a() {
        if (f19887f == null) {
            return true;
        }
        return false;
    }

    public void add(long j) {
        Object[] objArr;
        try {
            Method method = f19885d;
            Object obj = this.f19889a;
            if (j == 1) {
                objArr = f19888g;
            } else {
                objArr = new Object[]{Long.valueOf(j)};
            }
            method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
