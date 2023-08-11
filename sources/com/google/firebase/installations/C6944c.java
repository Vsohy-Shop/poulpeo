package com.google.firebase.installations;

import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.firebase.C6922c;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p113h8.C8030b;
import p124i8.C8210a;
import p124i8.C8211b;
import p124i8.C8212c;
import p124i8.C8213d;
import p124i8.C8215f;
import p134j8.C8425a;
import p144k8.C8588b;
import p144k8.C8589c;
import p144k8.C8591d;
import p154l8.C8759c;
import p154l8.C8760d;
import p154l8.C8764f;
import p203q7.C9322f;
import p214r8.C9403i;
import p231t4.C9713p;
import p276x5.C10406g;
import p276x5.C10410i;

/* renamed from: com.google.firebase.installations.c */
/* compiled from: FirebaseInstallations */
public class C6944c implements C8213d {

    /* renamed from: m */
    private static final Object f9203m = new Object();

    /* renamed from: n */
    private static final ThreadFactory f9204n = new C6945a();

    /* renamed from: a */
    private final C6922c f9205a;

    /* renamed from: b */
    private final C8759c f9206b;

    /* renamed from: c */
    private final C8589c f9207c;

    /* renamed from: d */
    private final C6952h f9208d;

    /* renamed from: e */
    private final C8588b f9209e;

    /* renamed from: f */
    private final C8215f f9210f;

    /* renamed from: g */
    private final Object f9211g;

    /* renamed from: h */
    private final ExecutorService f9212h;

    /* renamed from: i */
    private final ExecutorService f9213i;
    @GuardedBy("this")

    /* renamed from: j */
    private String f9214j;
    @GuardedBy("FirebaseInstallations.this")

    /* renamed from: k */
    private Set<C8425a> f9215k;
    @GuardedBy("lock")

    /* renamed from: l */
    private final List<C6951g> f9216l;

    /* renamed from: com.google.firebase.installations.c$a */
    /* compiled from: FirebaseInstallations */
    class C6945a implements ThreadFactory {

        /* renamed from: b */
        private final AtomicInteger f9217b = new AtomicInteger(1);

        C6945a() {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", new Object[]{Integer.valueOf(this.f9217b.getAndIncrement())}));
        }
    }

    /* renamed from: com.google.firebase.installations.c$b */
    /* compiled from: FirebaseInstallations */
    static /* synthetic */ class C6946b {

        /* renamed from: a */
        static final /* synthetic */ int[] f9218a;

        /* renamed from: b */
        static final /* synthetic */ int[] f9219b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        static {
            /*
                l8.f$b[] r0 = p154l8.C8764f.C8766b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9219b = r0
                r1 = 1
                l8.f$b r2 = p154l8.C8764f.C8766b.OK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f9219b     // Catch:{ NoSuchFieldError -> 0x001d }
                l8.f$b r3 = p154l8.C8764f.C8766b.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = f9219b     // Catch:{ NoSuchFieldError -> 0x0028 }
                l8.f$b r3 = p154l8.C8764f.C8766b.AUTH_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                l8.d$b[] r2 = p154l8.C8760d.C8762b.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f9218a = r2
                l8.d$b r3 = p154l8.C8760d.C8762b.OK     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f9218a     // Catch:{ NoSuchFieldError -> 0x0043 }
                l8.d$b r2 = p154l8.C8760d.C8762b.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C6944c.C6946b.<clinit>():void");
        }
    }

    C6944c(C6922c cVar, @NonNull C8030b<C9403i> bVar, @NonNull C8030b<C9322f> bVar2) {
        this(new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f9204n), cVar, new C8759c(cVar.mo39766h(), bVar, bVar2), new C8589c(cVar), C6952h.m12169c(), new C8588b(cVar), new C8215f());
    }

    /* renamed from: A */
    private void m12126A(C8591d dVar) {
        synchronized (this.f9211g) {
            Iterator<C6951g> it = this.f9216l.iterator();
            while (it.hasNext()) {
                if (it.next().mo39838a(dVar)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: B */
    private synchronized void m12127B(String str) {
        this.f9214j = str;
    }

    /* renamed from: C */
    private synchronized void m12128C(C8591d dVar, C8591d dVar2) {
        if (this.f9215k.size() != 0 && !dVar.mo42648d().equals(dVar2.mo42648d())) {
            for (C8425a a : this.f9215k) {
                a.mo42428a(dVar2.mo42648d());
            }
        }
    }

    /* renamed from: e */
    private Task<C6949f> m12132e() {
        C10406g gVar = new C10406g();
        m12134g(new C6947d(this.f9208d, gVar));
        return gVar.mo45096a();
    }

    /* renamed from: f */
    private Task<String> m12133f() {
        C10406g gVar = new C10406g();
        m12134g(new C6948e(gVar));
        return gVar.mo45096a();
    }

    /* renamed from: g */
    private void m12134g(C6951g gVar) {
        synchronized (this.f9211g) {
            this.f9216l.add(gVar);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004a  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m12144t(boolean r3) {
        /*
            r2 = this;
            k8.d r0 = r2.m12141p()
            boolean r1 = r0.mo42669i()     // Catch:{ FirebaseInstallationsException -> 0x005f }
            if (r1 != 0) goto L_0x0022
            boolean r1 = r0.mo42672l()     // Catch:{ FirebaseInstallationsException -> 0x005f }
            if (r1 == 0) goto L_0x0011
            goto L_0x0022
        L_0x0011:
            if (r3 != 0) goto L_0x001d
            com.google.firebase.installations.h r3 = r2.f9208d     // Catch:{ FirebaseInstallationsException -> 0x005f }
            boolean r3 = r3.mo39843f(r0)     // Catch:{ FirebaseInstallationsException -> 0x005f }
            if (r3 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            return
        L_0x001d:
            k8.d r3 = r2.m12137j(r0)     // Catch:{ FirebaseInstallationsException -> 0x005f }
            goto L_0x0026
        L_0x0022:
            k8.d r3 = r2.m12149y(r0)     // Catch:{ FirebaseInstallationsException -> 0x005f }
        L_0x0026:
            r2.m12143s(r3)
            r2.m12128C(r0, r3)
            boolean r0 = r3.mo42671k()
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = r3.mo42648d()
            r2.m12127B(r0)
        L_0x0039:
            boolean r0 = r3.mo42669i()
            if (r0 == 0) goto L_0x004a
            com.google.firebase.installations.FirebaseInstallationsException r3 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$a r0 = com.google.firebase.installations.FirebaseInstallationsException.C6939a.BAD_CONFIG
            r3.<init>(r0)
            r2.m12150z(r3)
            goto L_0x005e
        L_0x004a:
            boolean r0 = r3.mo42670j()
            if (r0 == 0) goto L_0x005b
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            r2.m12150z(r3)
            goto L_0x005e
        L_0x005b:
            r2.m12126A(r3)
        L_0x005e:
            return
        L_0x005f:
            r3 = move-exception
            r2.m12150z(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C6944c.m12144t(boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final void m12146v(boolean z) {
        C8591d q = m12142q();
        if (z) {
            q = q.mo42675p();
        }
        m12126A(q);
        this.f9213i.execute(new C8212c(this, z));
    }

    /* renamed from: j */
    private C8591d m12137j(@NonNull C8591d dVar) {
        C8764f e = this.f9206b.mo42919e(mo39834k(), dVar.mo42648d(), mo39836r(), dVar.mo42651f());
        int i = C6946b.f9219b[e.mo42908b().ordinal()];
        if (i == 1) {
            return dVar.mo42674o(e.mo42909c(), e.mo42910d(), this.f9208d.mo39841b());
        } else if (i == 2) {
            return dVar.mo42676q("BAD CONFIG");
        } else {
            if (i == 3) {
                m12127B((String) null);
                return dVar.mo42677r();
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.C6939a.UNAVAILABLE);
        }
    }

    /* renamed from: m */
    private synchronized String m12138m() {
        return this.f9214j;
    }

    @NonNull
    /* renamed from: n */
    public static C6944c m12139n() {
        return m12140o(C6922c.m12057i());
    }

    @NonNull
    /* renamed from: o */
    public static C6944c m12140o(@NonNull C6922c cVar) {
        boolean z;
        if (cVar != null) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20267b(z, "Null is not a valid value of FirebaseApp.");
        return (C6944c) cVar.mo39765g(C8213d.class);
    }

    /* renamed from: p */
    private C8591d m12141p() {
        C8591d c;
        synchronized (f9203m) {
            C6943b a = C6943b.m12124a(this.f9205a.mo39766h(), "generatefid.lock");
            try {
                c = this.f9207c.mo42668c();
                if (a != null) {
                    a.mo39831b();
                }
            } catch (Throwable th) {
                if (a != null) {
                    a.mo39831b();
                }
                throw th;
            }
        }
        return c;
    }

    /* renamed from: q */
    private C8591d m12142q() {
        C8591d c;
        synchronized (f9203m) {
            C6943b a = C6943b.m12124a(this.f9205a.mo39766h(), "generatefid.lock");
            try {
                c = this.f9207c.mo42668c();
                if (c.mo42670j()) {
                    c = this.f9207c.mo42667a(c.mo42679t(m12148x(c)));
                }
                if (a != null) {
                    a.mo39831b();
                }
            } catch (Throwable th) {
                if (a != null) {
                    a.mo39831b();
                }
                throw th;
            }
        }
        return c;
    }

    /* renamed from: s */
    private void m12143s(C8591d dVar) {
        synchronized (f9203m) {
            C6943b a = C6943b.m12124a(this.f9205a.mo39766h(), "generatefid.lock");
            try {
                this.f9207c.mo42667a(dVar);
                if (a != null) {
                    a.mo39831b();
                }
            } catch (Throwable th) {
                if (a != null) {
                    a.mo39831b();
                }
                throw th;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void m12145u() {
        m12146v(false);
    }

    /* renamed from: w */
    private void m12147w() {
        C9713p.m20272g(mo39835l(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C9713p.m20272g(mo39836r(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C9713p.m20272g(mo39834k(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C9713p.m20267b(C6952h.m12172h(mo39835l()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C9713p.m20267b(C6952h.m12171g(mo39834k()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* renamed from: x */
    private String m12148x(C8591d dVar) {
        if ((!this.f9205a.mo39768j().equals("CHIME_ANDROID_SDK") && !this.f9205a.mo39772r()) || !dVar.mo42673m()) {
            return this.f9210f.mo42126a();
        }
        String f = this.f9209e.mo42665f();
        if (TextUtils.isEmpty(f)) {
            return this.f9210f.mo42126a();
        }
        return f;
    }

    /* renamed from: y */
    private C8591d m12149y(C8591d dVar) {
        String str;
        if (dVar.mo42648d() == null || dVar.mo42648d().length() != 11) {
            str = null;
        } else {
            str = this.f9209e.mo42666i();
        }
        C8760d d = this.f9206b.mo42918d(mo39834k(), dVar.mo42648d(), mo39836r(), mo39835l(), str);
        int i = C6946b.f9218a[d.mo42897e().ordinal()];
        if (i == 1) {
            return dVar.mo42678s(d.mo42895c(), d.mo42896d(), this.f9208d.mo39841b(), d.mo42894b().mo42909c(), d.mo42894b().mo42910d());
        } else if (i == 2) {
            return dVar.mo42676q("BAD CONFIG");
        } else {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.C6939a.UNAVAILABLE);
        }
    }

    /* renamed from: z */
    private void m12150z(Exception exc) {
        synchronized (this.f9211g) {
            Iterator<C6951g> it = this.f9216l.iterator();
            while (it.hasNext()) {
                if (it.next().mo39839b(exc)) {
                    it.remove();
                }
            }
        }
    }

    @NonNull
    /* renamed from: a */
    public Task<C6949f> mo39832a(boolean z) {
        m12147w();
        Task<C6949f> e = m12132e();
        this.f9212h.execute(new C8210a(this, z));
        return e;
    }

    @NonNull
    public Task<String> getId() {
        m12147w();
        String m = m12138m();
        if (m != null) {
            return C10410i.m21831e(m);
        }
        Task<String> f = m12133f();
        this.f9212h.execute(new C8211b(this));
        return f;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: k */
    public String mo39834k() {
        return this.f9205a.mo39769k().mo39784b();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: l */
    public String mo39835l() {
        return this.f9205a.mo39769k().mo39785c();
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: r */
    public String mo39836r() {
        return this.f9205a.mo39769k().mo39787e();
    }

    C6944c(ExecutorService executorService, C6922c cVar, C8759c cVar2, C8589c cVar3, C6952h hVar, C8588b bVar, C8215f fVar) {
        this.f9211g = new Object();
        this.f9215k = new HashSet();
        this.f9216l = new ArrayList();
        this.f9205a = cVar;
        this.f9206b = cVar2;
        this.f9207c = cVar3;
        this.f9208d = hVar;
        this.f9209e = bVar;
        this.f9210f = fVar;
        this.f9212h = executorService;
        this.f9213i = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f9204n);
    }
}
