package com.google.android.gms.internal.cast;

import android.content.Context;
import android.os.Looper;
import androidx.mediarouter.media.MediaRouteSelector;
import androidx.mediarouter.media.MediaRouter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p109h4.C7922d;
import p120i4.C8150l0;
import p150l4.C8675b;

/* renamed from: com.google.android.gms.internal.cast.t */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final class C5137t extends MediaRouter.Callback {

    /* renamed from: f */
    private static final C8675b f5527f = new C8675b("MRDiscoveryCallback");

    /* renamed from: a */
    public final C5103r f5528a = new C5103r(this);

    /* renamed from: b */
    private final Set f5529b = Collections.synchronizedSet(new LinkedHashSet());

    /* renamed from: c */
    private final Map f5530c = Collections.synchronizedMap(new HashMap());

    /* renamed from: d */
    private final LinkedHashSet f5531d = new LinkedHashSet();

    /* renamed from: e */
    private final C5120s f5532e;

    public C5137t(Context context) {
        this.f5532e = new C5120s(context);
    }

    /* renamed from: a */
    public final void mo33007a(List list) {
        C8675b bVar = f5527f;
        int size = list.size();
        bVar.mo42754a("SetRouteDiscovery for " + size + " IDs", new Object[0]);
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(C5002l0.m7142a((String) it.next()));
        }
        f5527f.mo42754a("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.f5530c.keySet())), new Object[0]);
        HashMap hashMap = new HashMap();
        synchronized (this.f5530c) {
            for (String str : linkedHashSet) {
                C5086q qVar = (C5086q) this.f5530c.get(C5002l0.m7142a(str));
                if (qVar != null) {
                    hashMap.put(str, qVar);
                }
            }
            this.f5530c.clear();
            this.f5530c.putAll(hashMap);
        }
        f5527f.mo42754a("Routes reset. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.f5530c.keySet())), new Object[0]);
        synchronized (this.f5531d) {
            this.f5531d.clear();
            this.f5531d.addAll(linkedHashSet);
        }
        mo33008b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo33008b() {
        C8675b bVar = f5527f;
        int size = this.f5531d.size();
        bVar.mo42754a("Starting RouteDiscovery with " + size + " IDs", new Object[0]);
        bVar.mo42754a("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.f5530c.keySet())), new Object[0]);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            mo33009c();
        } else {
            new C4968j0(Looper.getMainLooper()).post(new C5069p(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo33009c() {
        this.f5532e.mo32995b(this);
        synchronized (this.f5531d) {
            Iterator it = this.f5531d.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                MediaRouteSelector build = new MediaRouteSelector.Builder().addControlCategory(C7922d.m15559a(str)).build();
                if (((C5086q) this.f5530c.get(str)) == null) {
                    this.f5530c.put(str, new C5086q(build));
                }
                C8675b bVar = f5527f;
                String a = C7922d.m15559a(str);
                bVar.mo42754a("Adding mediaRouter callback for control category " + a, new Object[0]);
                this.f5532e.mo32994a().addCallback(build, this, 4);
            }
        }
        f5527f.mo42754a("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.f5530c.keySet())), new Object[0]);
    }

    /* renamed from: d */
    public final void mo33010d() {
        f5527f.mo42754a("Stopping RouteDiscovery.", new Object[0]);
        this.f5530c.clear();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f5532e.mo32995b(this);
        } else {
            new C4968j0(Looper.getMainLooper()).post(new C5052o(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo33011e() {
        this.f5532e.mo32995b(this);
    }

    /* renamed from: f */
    public final void mo33012f(MediaRouter.RouteInfo routeInfo, boolean z) {
        boolean z2;
        C4866d1 d1Var;
        boolean z3;
        C8675b bVar = f5527f;
        bVar.mo42754a("MediaRouterDiscoveryCallback.updateRouteToAppIds (add=%b) route %s", Boolean.valueOf(z), routeInfo);
        synchronized (this.f5530c) {
            String valueOf = String.valueOf(this.f5530c.keySet());
            bVar.mo42754a("appIdToRouteInfo has these appId route keys: " + valueOf, new Object[0]);
            z2 = false;
            for (Map.Entry entry : this.f5530c.entrySet()) {
                String str = (String) entry.getKey();
                C5086q qVar = (C5086q) entry.getValue();
                if (routeInfo.matchesSelector(qVar.f5478b)) {
                    if (z) {
                        C8675b bVar2 = f5527f;
                        bVar2.mo42754a("Adding/updating route for appId " + str, new Object[0]);
                        z3 = qVar.f5477a.add(routeInfo);
                        if (!z3) {
                            String valueOf2 = String.valueOf(routeInfo);
                            bVar2.mo42759f("Route " + valueOf2 + " already exists for appId " + str, new Object[0]);
                        }
                    } else {
                        C8675b bVar3 = f5527f;
                        bVar3.mo42754a("Removing route for appId " + str, new Object[0]);
                        z3 = qVar.f5477a.remove(routeInfo);
                        if (!z3) {
                            String valueOf3 = String.valueOf(routeInfo);
                            bVar3.mo42759f("Route " + valueOf3 + " already removed from appId " + str, new Object[0]);
                        }
                    }
                    z2 = z3;
                }
            }
        }
        if (z2) {
            f5527f.mo42754a("Invoking callback.onRouteUpdated.", new Object[0]);
            synchronized (this.f5529b) {
                HashMap hashMap = new HashMap();
                synchronized (this.f5530c) {
                    for (String str2 : this.f5530c.keySet()) {
                        C5086q qVar2 = (C5086q) this.f5530c.get(C5002l0.m7142a(str2));
                        if (qVar2 == null) {
                            d1Var = C4866d1.m6890v();
                        } else {
                            d1Var = C4866d1.m6889u(qVar2.f5477a);
                        }
                        if (!d1Var.isEmpty()) {
                            hashMap.put(str2, d1Var);
                        }
                    }
                }
                C4848c1.m6832c(hashMap.entrySet());
                for (C8150l0 a : this.f5529b) {
                    a.mo42047a();
                }
            }
        }
    }

    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        f5527f.mo42754a("MediaRouterDiscoveryCallback.onRouteAdded.", new Object[0]);
        mo33012f(routeInfo, true);
    }

    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        f5527f.mo42754a("MediaRouterDiscoveryCallback.onRouteChanged.", new Object[0]);
        mo33012f(routeInfo, true);
    }

    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        f5527f.mo42754a("MediaRouterDiscoveryCallback.onRouteRemoved.", new Object[0]);
        mo33012f(routeInfo, false);
    }
}
