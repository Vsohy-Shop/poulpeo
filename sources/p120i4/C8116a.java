package p120i4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.mediarouter.media.MediaRouter;
import com.google.android.gms.cast.framework.ModuleUnavailableException;
import com.google.android.gms.common.api.internal.C4756h;
import com.google.android.gms.internal.cast.C4829b0;
import com.google.android.gms.internal.cast.C4864d;
import com.google.android.gms.internal.cast.C4881dg;
import com.google.android.gms.internal.cast.C4882e;
import com.google.android.gms.internal.cast.C4900f0;
import com.google.android.gms.internal.cast.C4916g;
import com.google.android.gms.internal.cast.C5137t;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p023a5.C2207e;
import p109h4.C7958q;
import p150l4.C8675b;
import p150l4.C8676b0;
import p150l4.C8686g0;
import p231t4.C9713p;

/* renamed from: i4.a */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public class C8116a {

    /* renamed from: p */
    private static final C8675b f11419p = new C8675b("CastContext");

    /* renamed from: q */
    private static final Object f11420q = new Object();
    @Nullable

    /* renamed from: r */
    private static volatile C8116a f11421r;

    /* renamed from: a */
    private final Context f11422a;

    /* renamed from: b */
    private final C8145j1 f11423b;

    /* renamed from: c */
    private final C8158p f11424c;

    /* renamed from: d */
    private final C8124c1 f11425d;

    /* renamed from: e */
    private final C8134g f11426e;

    /* renamed from: f */
    private final C8128e f11427f;

    /* renamed from: g */
    private final C8119b f11428g;

    /* renamed from: h */
    private final C8686g0 f11429h;

    /* renamed from: i */
    final C4864d f11430i;

    /* renamed from: j */
    private final C4829b0 f11431j;

    /* renamed from: k */
    private final C5137t f11432k;
    @Nullable

    /* renamed from: l */
    private final List f11433l;
    @Nullable

    /* renamed from: m */
    private final C4900f0 f11434m;
    @Nullable

    /* renamed from: n */
    private C4916g f11435n;
    @Nullable

    /* renamed from: o */
    private C8122c f11436o;

    private C8116a(Context context, C8119b bVar, @Nullable List list, C4829b0 b0Var, C8686g0 g0Var) {
        this.f11422a = context;
        this.f11428g = bVar;
        this.f11431j = b0Var;
        this.f11429h = g0Var;
        this.f11433l = list;
        C5137t tVar = new C5137t(context);
        this.f11432k = tVar;
        C4900f0 G = b0Var.mo32623G();
        this.f11434m = G;
        m15990j();
        try {
            C8145j1 a = C4882e.m6933a(context, bVar, b0Var, m15989i());
            this.f11423b = a;
            try {
                this.f11425d = new C8124c1(a.mo42028f());
                try {
                    C8158p pVar = new C8158p(a.mo42027d(), context);
                    this.f11424c = pVar;
                    this.f11427f = new C8128e(pVar);
                    this.f11426e = new C8134g(bVar, pVar, g0Var);
                    if (G != null) {
                        G.mo32780c(pVar);
                    }
                    g0Var.mo42783B(new String[]{"com.google.android.gms.cast.FLAG_MEDIA_ROUTE_DIALOG_UPDATE_DEVICES_DELAY_MS", "com.google.android.gms.cast.FLAG_MEDIA_ROUTE_DIALOG_DISCOVERY_TIMEOUT_MS", "com.google.android.gms.cast.FLAG_MEDIA_ROUTE_DIALOG_ZERO_DEVICE_TIMEOUT_MS"}).mo35456g(C4881dg.f5198a);
                    C4864d dVar = new C4864d();
                    this.f11430i = dVar;
                    try {
                        a.mo42029o2(dVar);
                        dVar.mo32716G(tVar.f5528a);
                        if (!bVar.mo41991M().isEmpty()) {
                            f11419p.mo42758e("Setting Route Discovery for appIds: ".concat(String.valueOf(bVar.mo41991M())), new Object[0]);
                            tVar.mo33007a(bVar.mo41991M());
                        }
                        g0Var.mo42783B(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"}).mo35456g(new C8166t(this));
                        g0Var.mo32411k(C4756h.m6576a().mo32518b(new C8676b0(g0Var, new String[]{"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"})).mo32520d(C7958q.f11190h).mo32519c(false).mo32521e(8427).mo32517a()).mo35456g(new C8163r0(this));
                    } catch (RemoteException e) {
                        throw new IllegalStateException("Failed to call addAppVisibilityListener", e);
                    }
                } catch (RemoteException e2) {
                    throw new IllegalStateException("Failed to call getSessionManagerImpl", e2);
                }
            } catch (RemoteException e3) {
                throw new IllegalStateException("Failed to call getDiscoveryManagerImpl", e3);
            }
        } catch (RemoteException e4) {
            throw new IllegalStateException("Failed to call newCastContextImpl", e4);
        }
    }

    @Nullable
    /* renamed from: c */
    public static C8116a m15985c() {
        C9713p.m20270e("Must be called from the main thread.");
        return f11421r;
    }

    @NonNull
    @Deprecated
    /* renamed from: d */
    public static C8116a m15986d(@NonNull Context context) {
        C9713p.m20270e("Must be called from the main thread.");
        if (f11421r == null) {
            synchronized (f11420q) {
                if (f11421r == null) {
                    Context applicationContext = context.getApplicationContext();
                    C8131f h = m15988h(applicationContext);
                    C8119b b = h.mo42012b(applicationContext);
                    C8686g0 g0Var = new C8686g0(applicationContext);
                    try {
                        f11421r = new C8116a(applicationContext, b, h.mo42011a(applicationContext), new C4829b0(applicationContext, MediaRouter.getInstance(applicationContext), b, g0Var), g0Var);
                    } catch (ModuleUnavailableException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return f11421r;
    }

    /* renamed from: h */
    private static C8131f m15988h(Context context) {
        try {
            Bundle bundle = C2207e.m1805a(context).mo23528c(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                f11419p.mo42756c("Bundle is null", new Object[0]);
            }
            String string = bundle.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
            if (string != null) {
                return (C8131f) Class.forName(string).asSubclass(C8131f.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        }
    }

    /* renamed from: i */
    private final Map m15989i() {
        HashMap hashMap = new HashMap();
        C4916g gVar = this.f11435n;
        if (gVar != null) {
            hashMap.put(gVar.mo42060b(), gVar.mo42062e());
        }
        List<C8162r> list = this.f11433l;
        if (list != null) {
            for (C8162r rVar : list) {
                C9713p.m20276k(rVar, "Additional SessionProvider must not be null.");
                String g = C9713p.m20272g(rVar.mo42060b(), "Category for SessionProvider must not be null or empty string.");
                C9713p.m20267b(!hashMap.containsKey(g), String.format("SessionProvider for category %s already added", new Object[]{g}));
                hashMap.put(g, rVar.mo42062e());
            }
        }
        return hashMap;
    }

    @RequiresNonNull({"castOptions", "mediaRouter", "appContext"})
    /* renamed from: j */
    private final void m15990j() {
        C4916g gVar;
        if (!TextUtils.isEmpty(this.f11428g.mo41986H())) {
            gVar = new C4916g(this.f11422a, this.f11428g, this.f11431j);
        } else {
            gVar = null;
        }
        this.f11435n = gVar;
    }

    @NonNull
    /* renamed from: a */
    public C8119b mo41971a() {
        C9713p.m20270e("Must be called from the main thread.");
        return this.f11428g;
    }

    @NonNull
    /* renamed from: b */
    public C8158p mo41972b() {
        C9713p.m20270e("Must be called from the main thread.");
        return this.f11424c;
    }

    /* renamed from: e */
    public final C8124c1 mo41973e() {
        C9713p.m20270e("Must be called from the main thread.");
        return this.f11425d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo41974g(Bundle bundle) {
        this.f11436o = new C8122c(bundle);
    }
}
