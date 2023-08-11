package p118i2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.math.BigInteger;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.Ref$ObjectRef;

/* renamed from: i2.g */
/* compiled from: HashUtils.kt */
public final class C8101g {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f11391a;

    /* renamed from: b */
    private static final String[] f11392b = {"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"};

    /* renamed from: c */
    public static final C8101g f11393c = new C8101g();

    /* renamed from: i2.g$a */
    /* compiled from: HashUtils.kt */
    public static final class C8102a implements InvocationHandler {

        /* renamed from: a */
        final /* synthetic */ Object f11394a;

        /* renamed from: b */
        final /* synthetic */ Ref$ObjectRef f11395b;

        /* renamed from: c */
        final /* synthetic */ ReentrantLock f11396c;

        /* renamed from: d */
        final /* synthetic */ Condition f11397d;

        C8102a(Object obj, Ref$ObjectRef ref$ObjectRef, ReentrantLock reentrantLock, Condition condition) {
            this.f11394a = obj;
            this.f11395b = ref$ObjectRef;
            this.f11396c = reentrantLock;
            this.f11397d = condition;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            C12775o.m28639i(method, "method");
            C12775o.m28639i(objArr, "objects");
            try {
                if (C12775o.m28634d(method.getName(), "onChecksumsReady") && objArr.length == 1) {
                    List list = objArr[0];
                    if (list instanceof List) {
                        if (list != null) {
                            for (Object next : list) {
                                if (next != null) {
                                    Method method2 = next.getClass().getMethod("getSplitName", new Class[0]);
                                    C12775o.m28638h(method2, "c.javaClass.getMethod(\"getSplitName\")");
                                    Method method3 = next.getClass().getMethod("getType", new Class[0]);
                                    C12775o.m28638h(method3, "c.javaClass.getMethod(\"getType\")");
                                    if (method2.invoke(next, new Object[0]) == null && C12775o.m28634d(method3.invoke(next, new Object[0]), this.f11394a)) {
                                        Method method4 = next.getClass().getMethod("getValue", new Class[0]);
                                        C12775o.m28638h(method4, "c.javaClass.getMethod(\"getValue\")");
                                        Object invoke = method4.invoke(next, new Object[0]);
                                        if (invoke != null) {
                                            this.f11395b.f20403b = new BigInteger(1, (byte[]) invoke).toString(16);
                                            this.f11396c.lock();
                                            this.f11397d.signalAll();
                                            this.f11396c.unlock();
                                            return null;
                                        }
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
                                    }
                                }
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                        }
                    }
                }
            } catch (Throwable th) {
                Log.d(C8101g.f11391a, "Can't fetch checksum.", th);
            }
            return null;
        }
    }

    static {
        String simpleName = C8101g.class.getSimpleName();
        C12775o.m28638h(simpleName, "HashUtils::class.java.simpleName");
        f11391a = simpleName;
    }

    private C8101g() {
    }

    /* renamed from: b */
    public static final String m15941b(String str) {
        return f11393c.m15943d(new File(str));
    }

    /* renamed from: c */
    public static final String m15942c(Context context, Long l) {
        C12775o.m28639i(context, "context");
        CertificateFactory instance = CertificateFactory.getInstance("X.509");
        String[] strArr = f11392b;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String decode : strArr) {
            arrayList.add(instance.generateCertificate(new ByteArrayInputStream(Base64.decode(decode, 0))));
        }
        List D0 = C12686e0.m28207D0(arrayList);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f20403b = null;
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        reentrantLock.lock();
        try {
            Class<?> cls = Class.forName("android.content.pm.Checksum");
            C12775o.m28638h(cls, "Class.forName(\"android.content.pm.Checksum\")");
            Field field = cls.getField("TYPE_WHOLE_MD5");
            C12775o.m28638h(field, "checksumClass.getField(\"TYPE_WHOLE_MD5\")");
            Object obj = field.get((Object) null);
            Class<?> cls2 = Class.forName("android.content.pm.PackageManager$OnChecksumsReadyListener");
            C12775o.m28638h(cls2, "Class.forName(\"android.c…nChecksumsReadyListener\")");
            Object newProxyInstance = Proxy.newProxyInstance(C8101g.class.getClassLoader(), new Class[]{cls2}, new C8102a(obj, ref$ObjectRef, reentrantLock, newCondition));
            C12775o.m28638h(newProxyInstance, "Proxy.newProxyInstance(\n…       }\n              })");
            Method method = PackageManager.class.getMethod("requestChecksums", new Class[]{String.class, Boolean.TYPE, Integer.TYPE, List.class, cls2});
            C12775o.m28638h(method, "PackageManager::class.ja…ecksumReadyListenerClass)");
            method.invoke(context.getPackageManager(), new Object[]{context.getPackageName(), Boolean.FALSE, obj, C12686e0.m28207D0(D0), newProxyInstance});
            if (l == null) {
                newCondition.await();
            } else {
                newCondition.awaitNanos(l.longValue());
            }
            String str = (String) ref$ObjectRef.f20403b;
            reentrantLock.unlock();
            return str;
        } catch (Throwable unused) {
            reentrantLock.unlock();
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        p392mf.C12941b.m29245a(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        throw r1;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m15943d(java.io.File r5) {
        /*
            r4 = this;
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r5)
            r5 = 1024(0x400, float:1.435E-42)
            r0.<init>(r1, r5)
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch:{ all -> 0x003b }
            byte[] r5 = new byte[r5]     // Catch:{ all -> 0x003b }
        L_0x0014:
            int r2 = r0.read(r5)     // Catch:{ all -> 0x003b }
            if (r2 <= 0) goto L_0x001e
            r3 = 0
            r1.update(r5, r3, r2)     // Catch:{ all -> 0x003b }
        L_0x001e:
            r3 = -1
            if (r2 != r3) goto L_0x0014
            java.math.BigInteger r5 = new java.math.BigInteger     // Catch:{ all -> 0x003b }
            byte[] r1 = r1.digest()     // Catch:{ all -> 0x003b }
            r2 = 1
            r5.<init>(r2, r1)     // Catch:{ all -> 0x003b }
            r1 = 16
            java.lang.String r5 = r5.toString(r1)     // Catch:{ all -> 0x003b }
            java.lang.String r1 = "BigInteger(1, md.digest()).toString(16)"
            kotlin.jvm.internal.C12775o.m28638h(r5, r1)     // Catch:{ all -> 0x003b }
            r1 = 0
            p392mf.C12941b.m29245a(r0, r1)
            return r5
        L_0x003b:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x003d }
        L_0x003d:
            r1 = move-exception
            p392mf.C12941b.m29245a(r0, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p118i2.C8101g.m15943d(java.io.File):java.lang.String");
    }
}
