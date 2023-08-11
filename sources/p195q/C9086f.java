package p195q;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p195q.C9083d;

@SourceDebugExtension({"SMAP\nNetworkObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkObserver.kt\ncoil/network/RealNetworkObserver\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,112:1\n12744#2,2:113\n12744#2,2:115\n*S KotlinDebug\n*F\n+ 1 NetworkObserver.kt\ncoil/network/RealNetworkObserver\n*L\n82#1:113,2\n96#1:115,2\n*E\n"})
/* renamed from: q.f */
/* compiled from: NetworkObserver.kt */
final class C9086f implements C9083d {

    /* renamed from: a */
    private final ConnectivityManager f13230a;

    /* renamed from: b */
    private final C9083d.C9084a f13231b;

    /* renamed from: c */
    private final C9087a f13232c;

    /* renamed from: q.f$a */
    /* compiled from: NetworkObserver.kt */
    public static final class C9087a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a */
        final /* synthetic */ C9086f f13233a;

        C9087a(C9086f fVar) {
            this.f13233a = fVar;
        }

        public void onAvailable(Network network) {
            this.f13233a.m18460d(network, true);
        }

        public void onLost(Network network) {
            this.f13233a.m18460d(network, false);
        }
    }

    public C9086f(ConnectivityManager connectivityManager, C9083d.C9084a aVar) {
        this.f13230a = connectivityManager;
        this.f13231b = aVar;
        C9087a aVar2 = new C9087a(this);
        this.f13232c = aVar2;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), aVar2);
    }

    /* renamed from: c */
    private final boolean m18459c(Network network) {
        NetworkCapabilities networkCapabilities = this.f13230a.getNetworkCapabilities(network);
        if (networkCapabilities == null || !networkCapabilities.hasCapability(12)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m18460d(Network network, boolean z) {
        boolean z2;
        Network[] allNetworks = this.f13230a.getAllNetworks();
        int length = allNetworks.length;
        boolean z3 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Network network2 = allNetworks[i];
            if (C12775o.m28634d(network2, network)) {
                z2 = z;
            } else {
                z2 = m18459c(network2);
            }
            if (z2) {
                z3 = true;
                break;
            }
            i++;
        }
        this.f13231b.mo43303a(z3);
    }

    /* renamed from: a */
    public boolean mo43301a() {
        for (Network c : this.f13230a.getAllNetworks()) {
            if (m18459c(c)) {
                return true;
            }
        }
        return false;
    }

    public void shutdown() {
        this.f13230a.unregisterNetworkCallback(this.f13232c);
    }
}
