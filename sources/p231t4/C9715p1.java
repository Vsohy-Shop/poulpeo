package p231t4;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.concurrent.Executor;
import p141k5.C8567e;
import p275x4.C10393b;

/* renamed from: t4.p1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
final class C9715p1 extends C9686h {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final HashMap<C9701l1, C9704m1> f14515f = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Context f14516g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public volatile Handler f14517h;

    /* renamed from: i */
    private final C9712o1 f14518i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C10393b f14519j;

    /* renamed from: k */
    private final long f14520k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final long f14521l;

    C9715p1(Context context, Looper looper) {
        C9712o1 o1Var = new C9712o1(this, (C9708n1) null);
        this.f14518i = o1Var;
        this.f14516g = context.getApplicationContext();
        this.f14517h = new C8567e(looper, o1Var);
        this.f14519j = C10393b.m21775b();
        this.f14520k = 5000;
        this.f14521l = 300000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo44191d(C9701l1 l1Var, ServiceConnection serviceConnection, String str) {
        C9713p.m20276k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f14515f) {
            C9704m1 m1Var = this.f14515f.get(l1Var);
            if (m1Var == null) {
                String obj = l1Var.toString();
                StringBuilder sb = new StringBuilder(obj.length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString());
            } else if (m1Var.mo44223h(serviceConnection)) {
                m1Var.mo44221f(serviceConnection, str);
                if (m1Var.mo44224i()) {
                    this.f14517h.sendMessageDelayed(this.f14517h.obtainMessage(0, l1Var), this.f14520k);
                }
            } else {
                String obj2 = l1Var.toString();
                StringBuilder sb2 = new StringBuilder(obj2.length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(obj2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo44193f(C9701l1 l1Var, ServiceConnection serviceConnection, String str, @Nullable Executor executor) {
        boolean j;
        C9713p.m20276k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f14515f) {
            C9704m1 m1Var = this.f14515f.get(l1Var);
            if (m1Var == null) {
                m1Var = new C9704m1(this, l1Var);
                m1Var.mo44219d(serviceConnection, serviceConnection, str);
                m1Var.mo44220e(str, executor);
                this.f14515f.put(l1Var, m1Var);
            } else {
                this.f14517h.removeMessages(0, l1Var);
                if (!m1Var.mo44223h(serviceConnection)) {
                    m1Var.mo44219d(serviceConnection, serviceConnection, str);
                    int a = m1Var.mo44216a();
                    if (a == 1) {
                        serviceConnection.onServiceConnected(m1Var.mo44217b(), m1Var.mo44218c());
                    } else if (a == 2) {
                        m1Var.mo44220e(str, executor);
                    }
                } else {
                    String obj = l1Var.toString();
                    StringBuilder sb = new StringBuilder(obj.length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(obj);
                    throw new IllegalStateException(sb.toString());
                }
            }
            j = m1Var.mo44225j();
        }
        return j;
    }
}
