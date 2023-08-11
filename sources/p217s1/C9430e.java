package p217s1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import androidx.annotation.NonNull;
import p217s1.C9427c;
import p294z1.C10791j;

/* renamed from: s1.e */
/* compiled from: DefaultConnectivityMonitor */
final class C9430e implements C9427c {

    /* renamed from: b */
    private final Context f14012b;

    /* renamed from: c */
    final C9427c.C9428a f14013c;

    /* renamed from: d */
    boolean f14014d;

    /* renamed from: e */
    private boolean f14015e;

    /* renamed from: f */
    private final BroadcastReceiver f14016f = new C9431a();

    /* renamed from: s1.e$a */
    /* compiled from: DefaultConnectivityMonitor */
    class C9431a extends BroadcastReceiver {
        C9431a() {
        }

        public void onReceive(@NonNull Context context, Intent intent) {
            C9430e eVar = C9430e.this;
            boolean z = eVar.f14014d;
            eVar.f14014d = eVar.mo43850j(context);
            if (z != C9430e.this.f14014d) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + C9430e.this.f14014d);
                }
                C9430e eVar2 = C9430e.this;
                eVar2.f14013c.mo31234a(eVar2.f14014d);
            }
        }
    }

    C9430e(@NonNull Context context, @NonNull C9427c.C9428a aVar) {
        this.f14012b = context.getApplicationContext();
        this.f14013c = aVar;
    }

    /* renamed from: k */
    private void m19490k() {
        if (!this.f14015e) {
            this.f14014d = mo43850j(this.f14012b);
            try {
                this.f14012b.registerReceiver(this.f14016f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f14015e = true;
            } catch (SecurityException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register", e);
                }
            }
        }
    }

    /* renamed from: l */
    private void m19491l() {
        if (this.f14015e) {
            this.f14012b.unregisterReceiver(this.f14016f);
            this.f14015e = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo43850j(@NonNull Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) C10791j.m22948d((ConnectivityManager) context.getSystemService("connectivity"))).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e);
            }
            return true;
        }
    }

    public void onStart() {
        m19490k();
    }

    public void onStop() {
        m19491l();
    }

    /* renamed from: e */
    public void mo31210e() {
    }
}
