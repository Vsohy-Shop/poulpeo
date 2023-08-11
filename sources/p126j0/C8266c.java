package p126j0;

import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.appboy.Constants;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p042bo.app.C3030b6;
import p042bo.app.C3730u5;
import p404of.C13074a;

/* renamed from: j0.c */
public final class C8266c {

    /* renamed from: a */
    public static final C8266c f11641a = new C8266c();

    /* renamed from: b */
    private static C3030b6 f11642b;

    /* renamed from: c */
    private static boolean f11643c;

    /* renamed from: d */
    private static boolean f11644d;

    /* renamed from: e */
    private static final int f11645e = 65;

    /* renamed from: f */
    private static int f11646f = 4;

    /* renamed from: j0.c$a */
    public enum C8267a {
        D(3),
        I(4),
        f11649e(6),
        f11650f(2),
        f11651g(5);
        

        /* renamed from: b */
        private final int f11653b;

        private C8267a(int i) {
            this.f11653b = i;
        }

        /* renamed from: b */
        public final int mo42216b() {
            return this.f11653b;
        }
    }

    /* renamed from: j0.c$b */
    public /* synthetic */ class C8268b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11654a;

        static {
            int[] iArr = new int[C8267a.values().length];
            iArr[C8267a.D.ordinal()] = 1;
            iArr[C8267a.I.ordinal()] = 2;
            iArr[C8267a.f11649e.ordinal()] = 3;
            iArr[C8267a.f11651g.ordinal()] = 4;
            iArr[C8267a.f11650f.ordinal()] = 5;
            f11654a = iArr;
        }
    }

    /* renamed from: j0.c$c */
    static final class C8269c extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Exception f11655g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8269c(Exception exc) {
            super(0);
            this.f11655g = exc;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Failed to append to test user device log. ", this.f11655g);
        }
    }

    /* renamed from: j0.c$d */
    static final class C8270d extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f11656g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8270d(String str) {
            super(0);
            this.f11656g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return "BrazeLogger log level set to " + this.f11656g + " via device system property. Note that subsequent calls to BrazeLogger.setLogLevel() will have no effect.";
        }
    }

    /* renamed from: j0.c$e */
    static final class C8271e extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ int f11657g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8271e(int i) {
            super(0);
            this.f11657g = i;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Log level already set via system property. BrazeLogger.setLogLevel() ignored for level: ", Integer.valueOf(this.f11657g));
        }
    }

    private C8266c() {
    }

    /* renamed from: A */
    public static final void m16391A(String str, String str2, Throwable th) {
        C12775o.m28639i(str, APIResourceDescriptors.RESOURCE_TYPE_TAG);
        C12775o.m28639i(str2, NotificationCompat.CATEGORY_MESSAGE);
        m16393C(str, str2, th, false, 8, (Object) null);
    }

    /* renamed from: B */
    public static final void m16392B(String str, String str2, Throwable th, boolean z) {
        C12775o.m28639i(str, APIResourceDescriptors.RESOURCE_TYPE_TAG);
        C12775o.m28639i(str2, NotificationCompat.CATEGORY_MESSAGE);
        if (z) {
            f11641a.m16395a(str, str2, th);
        }
        if (f11646f > 5) {
            return;
        }
        if (th != null) {
            Log.w(str, str2, th);
        } else {
            Log.w(str, str2);
        }
    }

    /* renamed from: C */
    public static /* synthetic */ void m16393C(String str, String str2, Throwable th, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        m16392B(str, str2, th, z);
    }

    /* renamed from: D */
    private final boolean m16394D(boolean z) {
        if (!z || !m16398g()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final void m16395a(String str, String str2, Throwable th) {
        try {
            if (m16398g()) {
                C3030b6 b6Var = f11642b;
                if (b6Var == null) {
                    C12775o.m28656z("testUserDeviceLoggingManager");
                    b6Var = null;
                }
                b6Var.mo28670a(str, str2, th);
            }
        } catch (Exception e) {
            Exception exc = e;
            m16396e(this, this, C8267a.f11649e, exc, false, new C8269c(exc), 4, (Object) null);
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m16396e(C8266c cVar, Object obj, C8267a aVar, Throwable th, boolean z, C13074a aVar2, int i, Object obj2) {
        if ((i & 1) != 0) {
            aVar = C8267a.D;
        }
        C8267a aVar3 = aVar;
        if ((i & 2) != 0) {
            th = null;
        }
        Throwable th2 = th;
        if ((i & 4) != 0) {
            z = true;
        }
        cVar.mo42213c(obj, aVar3, th2, z, aVar2);
    }

    /* renamed from: f */
    public static /* synthetic */ void m16397f(C8266c cVar, String str, C8267a aVar, Throwable th, boolean z, C13074a aVar2, int i, Object obj) {
        if ((i & 2) != 0) {
            aVar = C8267a.D;
        }
        C8267a aVar3 = aVar;
        if ((i & 4) != 0) {
            th = null;
        }
        Throwable th2 = th;
        if ((i & 8) != 0) {
            z = true;
        }
        cVar.mo42214d(str, aVar3, th2, z, aVar2);
    }

    /* renamed from: g */
    private final boolean m16398g() {
        C3030b6 b6Var = f11642b;
        if (b6Var == null) {
            return false;
        }
        return b6Var.mo28675e();
    }

    /* renamed from: h */
    public static final synchronized void m16399h(boolean z) {
        synchronized (C8266c.class) {
            C8266c cVar = f11641a;
            String a = C3730u5.m3975a("log.tag.APPBOY");
            if (C13754v.m31530r("verbose", C13755w.m31561N0(a).toString(), true)) {
                m16410t(2);
                f11643c = true;
                m16396e(cVar, cVar, C8267a.I, (Throwable) null, false, new C8270d(a), 6, (Object) null);
            }
        }
    }

    /* renamed from: i */
    public static /* synthetic */ void m16400i(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        m16399h(z);
    }

    /* renamed from: j */
    public static final void m16401j(String str, String str2) {
        C12775o.m28639i(str, APIResourceDescriptors.RESOURCE_TYPE_TAG);
        C12775o.m28639i(str2, NotificationCompat.CATEGORY_MESSAGE);
        m16403l(str, str2, (Throwable) null, false, 12, (Object) null);
    }

    /* renamed from: k */
    public static final void m16402k(String str, String str2, Throwable th, boolean z) {
        C12775o.m28639i(str, APIResourceDescriptors.RESOURCE_TYPE_TAG);
        C12775o.m28639i(str2, NotificationCompat.CATEGORY_MESSAGE);
        if (z) {
            f11641a.m16395a(str, str2, th);
        }
        if (f11646f > 3) {
            return;
        }
        if (th != null) {
            Log.d(str, str2, th);
        } else {
            Log.d(str, str2);
        }
    }

    /* renamed from: l */
    public static /* synthetic */ void m16403l(String str, String str2, Throwable th, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        m16402k(str, str2, th, z);
    }

    /* renamed from: m */
    public static final void m16404m(String str, String str2, Throwable th) {
        C12775o.m28639i(str, APIResourceDescriptors.RESOURCE_TYPE_TAG);
        C12775o.m28639i(str2, NotificationCompat.CATEGORY_MESSAGE);
        C12775o.m28639i(th, "tr");
        f11641a.m16395a(str, str2, th);
        if (f11646f <= 6) {
            Log.e(str, str2, th);
        }
    }

    /* renamed from: n */
    public static final String m16405n(Class<?> cls) {
        C12775o.m28639i(cls, "classForTag");
        String name = cls.getName();
        int length = name.length();
        int i = f11645e;
        if (length <= i) {
            C12775o.m28638h(name, "{\n            // No need…  fullClassName\n        }");
        } else {
            C12775o.m28638h(name, "fullClassName");
            name = name.substring(length - i);
            C12775o.m28638h(name, "this as java.lang.String).substring(startIndex)");
        }
        return C12775o.m28647q(Constants.LOG_TAG_PREFIX, name);
    }

    /* renamed from: p */
    public static final void m16406p(String str, String str2) {
        C12775o.m28639i(str, APIResourceDescriptors.RESOURCE_TYPE_TAG);
        C12775o.m28639i(str2, NotificationCompat.CATEGORY_MESSAGE);
        m16408r(str, str2, (Throwable) null, false, 12, (Object) null);
    }

    /* renamed from: q */
    public static final void m16407q(String str, String str2, Throwable th, boolean z) {
        C12775o.m28639i(str, APIResourceDescriptors.RESOURCE_TYPE_TAG);
        C12775o.m28639i(str2, NotificationCompat.CATEGORY_MESSAGE);
        if (z) {
            f11641a.m16395a(str, str2, th);
        }
        if (f11646f > 4) {
            return;
        }
        if (th != null) {
            Log.i(str, str2, th);
        } else {
            Log.i(str, str2);
        }
    }

    /* renamed from: r */
    public static /* synthetic */ void m16408r(String str, String str2, Throwable th, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        m16407q(str, str2, th, z);
    }

    /* renamed from: s */
    public static final synchronized void m16409s(int i) {
        synchronized (C8266c.class) {
            if (!f11644d) {
                m16410t(i);
            }
        }
    }

    /* renamed from: t */
    public static final synchronized void m16410t(int i) {
        synchronized (C8266c.class) {
            if (!f11643c) {
                f11644d = true;
                f11646f = i;
            } else {
                C8266c cVar = f11641a;
                m16396e(cVar, cVar, C8267a.f11651g, (Throwable) null, false, new C8271e(i), 6, (Object) null);
            }
        }
    }

    /* renamed from: u */
    public static final void m16411u(C3030b6 b6Var) {
        C12775o.m28639i(b6Var, "loggingManager");
        f11642b = b6Var;
    }

    /* renamed from: v */
    private final String m16412v(C13074a<? extends Object> aVar) {
        try {
            return String.valueOf(aVar.invoke());
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: w */
    public static final void m16413w(String str, String str2) {
        C12775o.m28639i(str, APIResourceDescriptors.RESOURCE_TYPE_TAG);
        C12775o.m28639i(str2, NotificationCompat.CATEGORY_MESSAGE);
        m16415y(str, str2, (Throwable) null, 4, (Object) null);
    }

    /* renamed from: x */
    public static final void m16414x(String str, String str2, Throwable th) {
        C12775o.m28639i(str, APIResourceDescriptors.RESOURCE_TYPE_TAG);
        C12775o.m28639i(str2, NotificationCompat.CATEGORY_MESSAGE);
        if (f11646f > 2) {
            return;
        }
        if (th != null) {
            Log.v(str, str2, th);
        } else {
            Log.v(str, str2);
        }
    }

    /* renamed from: y */
    public static /* synthetic */ void m16415y(String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        m16414x(str, str2, th);
    }

    /* renamed from: z */
    public static final void m16416z(String str, String str2) {
        C12775o.m28639i(str, APIResourceDescriptors.RESOURCE_TYPE_TAG);
        C12775o.m28639i(str2, NotificationCompat.CATEGORY_MESSAGE);
        m16393C(str, str2, (Throwable) null, false, 12, (Object) null);
    }

    /* renamed from: b */
    public final String mo42212b(Object obj) {
        boolean z;
        C12775o.m28639i(obj, "<this>");
        String name = obj.getClass().getName();
        C12775o.m28638h(name, "fullClassName");
        String G0 = C13755w.m31547G0(C13755w.m31553J0(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
        if (G0.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return mo42215o(name);
        }
        return mo42215o(G0);
    }

    /* renamed from: c */
    public final void mo42213c(Object obj, C8267a aVar, Throwable th, boolean z, C13074a<String> aVar2) {
        C12775o.m28639i(obj, "<this>");
        C12775o.m28639i(aVar, "priority");
        C12775o.m28639i(aVar2, "message");
        if (f11646f <= aVar.mo42216b() || m16394D(z)) {
            mo42214d(mo42212b(obj), aVar, th, z, aVar2);
        }
    }

    /* renamed from: d */
    public final void mo42214d(String str, C8267a aVar, Throwable th, boolean z, C13074a<String> aVar2) {
        C12775o.m28639i(str, APIResourceDescriptors.RESOURCE_TYPE_TAG);
        C12775o.m28639i(aVar, "priority");
        C12775o.m28639i(aVar2, "message");
        if (f11646f <= aVar.mo42216b() || m16394D(z)) {
            int i = C8268b.f11654a[aVar.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                if (th == null) {
                                    Log.v(str, m16412v(aVar2));
                                } else {
                                    Log.v(str, m16412v(aVar2), th);
                                }
                            }
                        } else if (th == null) {
                            Log.w(str, m16412v(aVar2));
                        } else {
                            Log.w(str, m16412v(aVar2), th);
                        }
                    } else if (th == null) {
                        Log.w(str, m16412v(aVar2));
                    } else {
                        Log.e(str, m16412v(aVar2), th);
                    }
                } else if (th == null) {
                    Log.i(str, m16412v(aVar2));
                } else {
                    Log.i(str, m16412v(aVar2), th);
                }
            } else if (th == null) {
                Log.d(str, m16412v(aVar2));
            } else {
                Log.d(str, m16412v(aVar2), th);
            }
        }
    }

    /* renamed from: o */
    public final String mo42215o(String str) {
        C12775o.m28639i(str, "<this>");
        return C12775o.m28647q(Constants.LOG_TAG_PREFIX, str);
    }
}
