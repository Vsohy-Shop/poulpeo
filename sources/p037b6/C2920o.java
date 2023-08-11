package p037b6;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.play.core.internal.C6796aq;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p099g6.C7790l;

/* renamed from: b6.o */
public final class C2920o<T extends IInterface> {

    /* renamed from: l */
    private static final Map<String, Handler> f1315l = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f1316a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2900e f1317b;

    /* renamed from: c */
    private final String f1318c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final List<C2902f> f1319d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f1320e;

    /* renamed from: f */
    private final Intent f1321f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C2912k<T> f1322g;

    /* renamed from: h */
    private final WeakReference<C2910j> f1323h;

    /* renamed from: i */
    private final IBinder.DeathRecipient f1324i = new C2904g(this);
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: j */
    public ServiceConnection f1325j;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: k */
    public T f1326k;

    public C2920o(Context context, C2900e eVar, String str, Intent intent, C2912k<T> kVar) {
        this.f1316a = context;
        this.f1317b = eVar;
        this.f1318c = str;
        this.f1321f = intent;
        this.f1322g = kVar;
        this.f1323h = new WeakReference<>((Object) null);
    }

    /* renamed from: e */
    static /* synthetic */ void m2364e(C2920o oVar, C2902f fVar) {
        if (oVar.f1326k == null && !oVar.f1320e) {
            oVar.f1317b.mo28424f("Initiate binding to the service.", new Object[0]);
            oVar.f1319d.add(fVar);
            C2918n nVar = new C2918n(oVar);
            oVar.f1325j = nVar;
            oVar.f1320e = true;
            if (!oVar.f1316a.bindService(oVar.f1321f, nVar, 1)) {
                oVar.f1317b.mo28424f("Failed to bind to the service.", new Object[0]);
                oVar.f1320e = false;
                List<C2902f> list = oVar.f1319d;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    C7790l<?> b = list.get(i).mo28427b();
                    if (b != null) {
                        b.mo41437d(new C6796aq());
                    }
                }
                oVar.f1319d.clear();
            }
        } else if (oVar.f1320e) {
            oVar.f1317b.mo28424f("Waiting to bind to the service.", new Object[0]);
            oVar.f1319d.add(fVar);
        } else {
            fVar.run();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m2366h(C2902f fVar) {
        Handler handler;
        Map<String, Handler> map = f1315l;
        synchronized (map) {
            if (!map.containsKey(this.f1318c)) {
                HandlerThread handlerThread = new HandlerThread(this.f1318c, 10);
                handlerThread.start();
                map.put(this.f1318c, new Handler(handlerThread.getLooper()));
            }
            handler = map.get(this.f1318c);
        }
        handler.post(fVar);
    }

    /* renamed from: n */
    static /* synthetic */ void m2371n(C2920o oVar) {
        oVar.f1317b.mo28424f("linkToDeath", new Object[0]);
        try {
            oVar.f1326k.asBinder().linkToDeath(oVar.f1324i, 0);
        } catch (RemoteException e) {
            oVar.f1317b.mo28422d(e, "linkToDeath failed", new Object[0]);
        }
    }

    /* renamed from: p */
    static /* synthetic */ void m2373p(C2920o oVar) {
        oVar.f1317b.mo28424f("unlinkToDeath", new Object[0]);
        oVar.f1326k.asBinder().unlinkToDeath(oVar.f1324i, 0);
    }

    /* renamed from: b */
    public final void mo28459b() {
        m2366h(new C2908i(this));
    }

    /* renamed from: c */
    public final void mo28460c(C2902f fVar) {
        m2366h(new C2906h(this, fVar.mo28427b(), fVar));
    }

    @Nullable
    /* renamed from: f */
    public final T mo28461f() {
        return this.f1326k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ void mo28462k() {
        this.f1317b.mo28424f("reportBinderDeath", new Object[0]);
        C2910j jVar = this.f1323h.get();
        if (jVar == null) {
            this.f1317b.mo28424f("%s : Binder has died.", this.f1318c);
            List<C2902f> list = this.f1319d;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C7790l<?> b = list.get(i).mo28427b();
                if (b != null) {
                    b.mo41437d(new RemoteException(String.valueOf(this.f1318c).concat(" : Binder has died.")));
                }
            }
            this.f1319d.clear();
            return;
        }
        this.f1317b.mo28424f("calling onBinderDied", new Object[0]);
        jVar.mo28435a();
    }
}
