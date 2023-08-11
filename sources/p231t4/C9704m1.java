package p231t4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: t4.m1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
final class C9704m1 implements ServiceConnection, C9718q1 {

    /* renamed from: b */
    private final Map<ServiceConnection, ServiceConnection> f14495b = new HashMap();

    /* renamed from: c */
    private int f14496c = 2;

    /* renamed from: d */
    private boolean f14497d;
    @Nullable

    /* renamed from: e */
    private IBinder f14498e;

    /* renamed from: f */
    private final C9701l1 f14499f;

    /* renamed from: g */
    private ComponentName f14500g;

    /* renamed from: h */
    final /* synthetic */ C9715p1 f14501h;

    public C9704m1(C9715p1 p1Var, C9701l1 l1Var) {
        this.f14501h = p1Var;
        this.f14499f = l1Var;
    }

    /* renamed from: a */
    public final int mo44216a() {
        return this.f14496c;
    }

    /* renamed from: b */
    public final ComponentName mo44217b() {
        return this.f14500g;
    }

    @Nullable
    /* renamed from: c */
    public final IBinder mo44218c() {
        return this.f14498e;
    }

    /* renamed from: d */
    public final void mo44219d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f14495b.put(serviceConnection, serviceConnection2);
    }

    /* renamed from: e */
    public final void mo44220e(String str, @Nullable Executor executor) {
        this.f14496c = 3;
        C9715p1 p1Var = this.f14501h;
        boolean d = p1Var.f14519j.mo45089d(p1Var.f14516g, str, this.f14499f.mo44210c(p1Var.f14516g), this, this.f14499f.mo44208a(), executor);
        this.f14497d = d;
        if (d) {
            this.f14501h.f14517h.sendMessageDelayed(this.f14501h.f14517h.obtainMessage(1, this.f14499f), this.f14501h.f14521l);
            return;
        }
        this.f14496c = 2;
        try {
            C9715p1 p1Var2 = this.f14501h;
            p1Var2.f14519j.mo45088c(p1Var2.f14516g, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: f */
    public final void mo44221f(ServiceConnection serviceConnection, String str) {
        this.f14495b.remove(serviceConnection);
    }

    /* renamed from: g */
    public final void mo44222g(String str) {
        this.f14501h.f14517h.removeMessages(1, this.f14499f);
        C9715p1 p1Var = this.f14501h;
        p1Var.f14519j.mo45088c(p1Var.f14516g, this);
        this.f14497d = false;
        this.f14496c = 2;
    }

    /* renamed from: h */
    public final boolean mo44223h(ServiceConnection serviceConnection) {
        return this.f14495b.containsKey(serviceConnection);
    }

    /* renamed from: i */
    public final boolean mo44224i() {
        return this.f14495b.isEmpty();
    }

    /* renamed from: j */
    public final boolean mo44225j() {
        return this.f14497d;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f14501h.f14515f) {
            this.f14501h.f14517h.removeMessages(1, this.f14499f);
            this.f14498e = iBinder;
            this.f14500g = componentName;
            for (ServiceConnection onServiceConnected : this.f14495b.values()) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f14496c = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f14501h.f14515f) {
            this.f14501h.f14517h.removeMessages(1, this.f14499f);
            this.f14498e = null;
            this.f14500g = componentName;
            for (ServiceConnection onServiceDisconnected : this.f14495b.values()) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f14496c = 2;
        }
    }
}
