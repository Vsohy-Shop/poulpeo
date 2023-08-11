package com.google.firebase;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.autofill.HintConstants;
import androidx.collection.ArrayMap;
import androidx.compose.animation.core.C0344a;
import androidx.core.p004os.UserManagerCompat;
import com.google.android.gms.common.api.internal.C4739a;
import com.google.firebase.components.ComponentDiscoveryService;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p174n8.C8938a;
import p193p7.C9073c;
import p202q6.C9284d;
import p202q6.C9289g;
import p202q6.C9299n;
import p202q6.C9310t;
import p231t4.C9705n;
import p231t4.C9713p;
import p286y4.C10669c;
import p286y4.C10680n;
import p286y4.C10681o;

/* renamed from: com.google.firebase.c */
/* compiled from: FirebaseApp */
public class C6922c {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final Object f9132j = new Object();

    /* renamed from: k */
    private static final Executor f9133k = new C6926d();

    /* renamed from: l */
    static final Map<String, C6922c> f9134l = new ArrayMap();

    /* renamed from: a */
    private final Context f9135a;

    /* renamed from: b */
    private final String f9136b;

    /* renamed from: c */
    private final C6935h f9137c;

    /* renamed from: d */
    private final C9299n f9138d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final AtomicBoolean f9139e = new AtomicBoolean(false);

    /* renamed from: f */
    private final AtomicBoolean f9140f = new AtomicBoolean();

    /* renamed from: g */
    private final C9310t<C8938a> f9141g;

    /* renamed from: h */
    private final List<C6924b> f9142h = new CopyOnWriteArrayList();

    /* renamed from: i */
    private final List<Object> f9143i = new CopyOnWriteArrayList();

    /* renamed from: com.google.firebase.c$b */
    /* compiled from: FirebaseApp */
    public interface C6924b {
        /* renamed from: a */
        void mo39774a(boolean z);
    }

    /* renamed from: com.google.firebase.c$c */
    /* compiled from: FirebaseApp */
    private static class C6925c implements C4739a.C4740a {

        /* renamed from: a */
        private static AtomicReference<C6925c> f9144a = new AtomicReference<>();

        private C6925c() {
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static void m12074c(Context context) {
            if (C10680n.m22697a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f9144a.get() == null) {
                    C6925c cVar = new C6925c();
                    if (C0344a.m496a(f9144a, (Object) null, cVar)) {
                        C4739a.m6490c(application);
                        C4739a.m6489b().mo32455a(cVar);
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo32468a(boolean z) {
            synchronized (C6922c.f9132j) {
                Iterator it = new ArrayList(C6922c.f9134l.values()).iterator();
                while (it.hasNext()) {
                    C6922c cVar = (C6922c) it.next();
                    if (cVar.f9139e.get()) {
                        cVar.m12064u(z);
                    }
                }
            }
        }
    }

    /* renamed from: com.google.firebase.c$d */
    /* compiled from: FirebaseApp */
    private static class C6926d implements Executor {

        /* renamed from: b */
        private static final Handler f9145b = new Handler(Looper.getMainLooper());

        private C6926d() {
        }

        public void execute(@NonNull Runnable runnable) {
            f9145b.post(runnable);
        }
    }

    /* renamed from: com.google.firebase.c$e */
    /* compiled from: FirebaseApp */
    private static class C6927e extends BroadcastReceiver {

        /* renamed from: b */
        private static AtomicReference<C6927e> f9146b = new AtomicReference<>();

        /* renamed from: a */
        private final Context f9147a;

        public C6927e(Context context) {
            this.f9147a = context;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static void m12077b(Context context) {
            if (f9146b.get() == null) {
                C6927e eVar = new C6927e(context);
                if (C0344a.m496a(f9146b, (Object) null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        /* renamed from: c */
        public void mo39776c() {
            this.f9147a.unregisterReceiver(this);
        }

        public void onReceive(Context context, Intent intent) {
            synchronized (C6922c.f9132j) {
                for (C6922c c : C6922c.f9134l.values()) {
                    c.m12058m();
                }
            }
            mo39776c();
        }
    }

    protected C6922c(Context context, String str, C6935h hVar) {
        this.f9135a = (Context) C9713p.m20275j(context);
        this.f9136b = C9713p.m20271f(str);
        this.f9137c = (C6935h) C9713p.m20275j(hVar);
        this.f9138d = C9299n.m19106i(f9133k).mo43585d(C9289g.m19094c(context, ComponentDiscoveryService.class).mo43577b()).mo43584c(new FirebaseCommonRegistrar()).mo43583b(C9284d.m19071p(context, Context.class, new Class[0])).mo43583b(C9284d.m19071p(this, C6922c.class, new Class[0])).mo43583b(C9284d.m19071p(hVar, C6935h.class, new Class[0])).mo43586e();
        this.f9141g = new C9310t<>(new C6921b(this, context));
    }

    /* renamed from: f */
    private void m12056f() {
        C9713p.m20279n(!this.f9140f.get(), "FirebaseApp was deleted");
    }

    @NonNull
    /* renamed from: i */
    public static C6922c m12057i() {
        C6922c cVar;
        synchronized (f9132j) {
            cVar = f9134l.get("[DEFAULT]");
            if (cVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + C10681o.m22708a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m12058m() {
        if (!UserManagerCompat.isUserUnlocked(this.f9135a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + mo39768j());
            C6927e.m12077b(this.f9135a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + mo39768j());
        this.f9138d.mo43582l(mo39772r());
    }

    @Nullable
    /* renamed from: n */
    public static C6922c m12059n(@NonNull Context context) {
        synchronized (f9132j) {
            if (f9134l.containsKey("[DEFAULT]")) {
                C6922c i = m12057i();
                return i;
            }
            C6935h a = C6935h.m12092a(context);
            if (a == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            C6922c o = m12060o(context, a);
            return o;
        }
    }

    @NonNull
    /* renamed from: o */
    public static C6922c m12060o(@NonNull Context context, @NonNull C6935h hVar) {
        return m12061p(context, hVar, "[DEFAULT]");
    }

    @NonNull
    /* renamed from: p */
    public static C6922c m12061p(@NonNull Context context, @NonNull C6935h hVar, @NonNull String str) {
        boolean z;
        C6922c cVar;
        C6925c.m12074c(context);
        String t = m12063t(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f9132j) {
            Map<String, C6922c> map = f9134l;
            if (!map.containsKey(t)) {
                z = true;
            } else {
                z = false;
            }
            C9713p.m20279n(z, "FirebaseApp name " + t + " already exists!");
            C9713p.m20276k(context, "Application context cannot be null.");
            cVar = new C6922c(context, t, hVar);
            map.put(t, cVar);
        }
        cVar.m12058m();
        return cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ C8938a m12062s(Context context) {
        return new C8938a(context, mo39770l(), (C9073c) this.f9138d.mo43559a(C9073c.class));
    }

    /* renamed from: t */
    private static String m12063t(@NonNull String str) {
        return str.trim();
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m12064u(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (C6924b a : this.f9142h) {
            a.mo39774a(z);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6922c)) {
            return false;
        }
        return this.f9136b.equals(((C6922c) obj).mo39768j());
    }

    /* renamed from: g */
    public <T> T mo39765g(Class<T> cls) {
        m12056f();
        return this.f9138d.mo43559a(cls);
    }

    @NonNull
    /* renamed from: h */
    public Context mo39766h() {
        m12056f();
        return this.f9135a;
    }

    public int hashCode() {
        return this.f9136b.hashCode();
    }

    @NonNull
    /* renamed from: j */
    public String mo39768j() {
        m12056f();
        return this.f9136b;
    }

    @NonNull
    /* renamed from: k */
    public C6935h mo39769k() {
        m12056f();
        return this.f9137c;
    }

    /* renamed from: l */
    public String mo39770l() {
        return C10669c.m22669a(mo39768j().getBytes(Charset.defaultCharset())) + "+" + C10669c.m22669a(mo39769k().mo39785c().getBytes(Charset.defaultCharset()));
    }

    /* renamed from: q */
    public boolean mo39771q() {
        m12056f();
        return this.f9141g.get().mo43091b();
    }

    @VisibleForTesting
    /* renamed from: r */
    public boolean mo39772r() {
        return "[DEFAULT]".equals(mo39768j());
    }

    public String toString() {
        return C9705n.m20261d(this).mo44228a(HintConstants.AUTOFILL_HINT_NAME, this.f9136b).mo44228a("options", this.f9137c).toString();
    }
}
