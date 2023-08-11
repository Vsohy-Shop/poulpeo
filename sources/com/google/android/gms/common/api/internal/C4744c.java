package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.collection.ArraySet;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.C4719a;
import com.google.android.gms.common.api.C4730b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4746d;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p121i5.C8185f;
import p190p4.C9056e;
import p200q4.C9218b;
import p200q4.C9229g0;
import p200q4.C9236k;
import p200q4.C9242o;
import p200q4.C9250w;
import p200q4.C9251x;
import p231t4.C9686h;
import p231t4.C9687h0;
import p231t4.C9702m;
import p231t4.C9716q;
import p231t4.C9719r;
import p231t4.C9725t;
import p231t4.C9728u;
import p231t4.C9731v;
import p276x5.C10406g;
import p286y4.C10675i;

/* renamed from: com.google.android.gms.common.api.internal.c */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C4744c implements Handler.Callback {
    @NonNull

    /* renamed from: s */
    public static final Status f4946s = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static final Status f4947t = new Status(4, "The user must be signed in to make this API call.");
    /* access modifiers changed from: private */

    /* renamed from: u */
    public static final Object f4948u = new Object();
    @Nullable

    /* renamed from: v */
    private static C4744c f4949v;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public long f4950b = 5000;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public long f4951c = 120000;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public long f4952d = 10000;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f4953e = false;
    @Nullable

    /* renamed from: f */
    private C9725t f4954f;
    @Nullable

    /* renamed from: g */
    private C9731v f4955g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Context f4956h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final GoogleApiAvailability f4957i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C9687h0 f4958j;

    /* renamed from: k */
    private final AtomicInteger f4959k = new AtomicInteger(1);

    /* renamed from: l */
    private final AtomicInteger f4960l = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final Map<C9218b<?>, C4777t<?>> f4961m = new ConcurrentHashMap(5, 0.75f, 1);
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: n */
    public C4767m f4962n = null;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final Set<C9218b<?>> f4963o = new ArraySet();

    /* renamed from: p */
    private final Set<C9218b<?>> f4964p = new ArraySet();
    /* access modifiers changed from: private */
    @NotOnlyInitialized

    /* renamed from: q */
    public final Handler f4965q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public volatile boolean f4966r = true;

    private C4744c(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.f4956h = context;
        C8185f fVar = new C8185f(looper, this);
        this.f4965q = fVar;
        this.f4957i = googleApiAvailability;
        this.f4958j = new C9687h0(googleApiAvailability);
        if (C10675i.m22683a(context)) {
            this.f4966r = false;
        }
        fVar.sendMessage(fVar.obtainMessage(6));
    }

    /* renamed from: a */
    public static void m6508a() {
        synchronized (f4948u) {
            C4744c cVar = f4949v;
            if (cVar != null) {
                cVar.f4960l.incrementAndGet();
                Handler handler = cVar.f4965q;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static Status m6510i(C9218b<?> bVar, ConnectionResult connectionResult) {
        String b = bVar.mo43506b();
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 63 + valueOf.length());
        sb.append("API: ");
        sb.append(b);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(connectionResult, sb.toString());
    }

    @WorkerThread
    /* renamed from: j */
    private final C4777t<?> m6511j(C4730b<?> bVar) {
        C9218b<?> p = bVar.mo32416p();
        C4777t<?> tVar = this.f4961m.get(p);
        if (tVar == null) {
            tVar = new C4777t<>(this, bVar);
            this.f4961m.put(p, tVar);
        }
        if (tVar.mo32560P()) {
            this.f4964p.add(p);
        }
        tVar.mo32547B();
        return tVar;
    }

    @WorkerThread
    /* renamed from: k */
    private final C9731v m6512k() {
        if (this.f4955g == null) {
            this.f4955g = C9728u.m20314a(this.f4956h);
        }
        return this.f4955g;
    }

    @WorkerThread
    /* renamed from: l */
    private final void m6513l() {
        C9725t tVar = this.f4954f;
        if (tVar != null) {
            if (tVar.mo44253A() > 0 || mo32486g()) {
                m6512k().mo44261g(tVar);
            }
            this.f4954f = null;
        }
    }

    /* renamed from: m */
    private final <T> void m6514m(C10406g<T> gVar, int i, C4730b bVar) {
        C4781x b;
        if (i != 0 && (b = C4781x.m6688b(this, i, bVar.mo32416p())) != null) {
            Task<T> a = gVar.mo45096a();
            Handler handler = this.f4965q;
            handler.getClass();
            a.mo35451b(new C9242o(handler), b);
        }
    }

    @NonNull
    /* renamed from: y */
    public static C4744c m6524y(@NonNull Context context) {
        C4744c cVar;
        synchronized (f4948u) {
            if (f4949v == null) {
                f4949v = new C4744c(context.getApplicationContext(), C9686h.m20229c().getLooper(), GoogleApiAvailability.m6375n());
            }
            cVar = f4949v;
        }
        return cVar;
    }

    @NonNull
    /* renamed from: A */
    public final <O extends C4719a.C4723d> Task<Void> mo32476A(@NonNull C4730b<O> bVar, @NonNull C4751f<C4719a.C4721b, ?> fVar, @NonNull C4759i<C4719a.C4721b, ?> iVar, @NonNull Runnable runnable) {
        C10406g gVar = new C10406g();
        m6514m(gVar, fVar.mo32504e(), bVar);
        C4752f0 f0Var = new C4752f0(new C9251x(fVar, iVar, runnable), gVar);
        Handler handler = this.f4965q;
        handler.sendMessage(handler.obtainMessage(8, new C9250w(f0Var, this.f4960l.get(), bVar)));
        return gVar.mo45096a();
    }

    @NonNull
    /* renamed from: B */
    public final <O extends C4719a.C4723d> Task<Boolean> mo32477B(@NonNull C4730b<O> bVar, @NonNull C4746d.C4747a aVar, int i) {
        C10406g gVar = new C10406g();
        m6514m(gVar, i, bVar);
        C4758h0 h0Var = new C4758h0(aVar, gVar);
        Handler handler = this.f4965q;
        handler.sendMessage(handler.obtainMessage(13, new C9250w(h0Var, this.f4960l.get(), bVar)));
        return gVar.mo45096a();
    }

    /* renamed from: G */
    public final <O extends C4719a.C4723d> void mo32478G(@NonNull C4730b<O> bVar, int i, @NonNull C4742b<? extends C9056e, C4719a.C4721b> bVar2) {
        C4750e0 e0Var = new C4750e0(i, bVar2);
        Handler handler = this.f4965q;
        handler.sendMessage(handler.obtainMessage(4, new C9250w(e0Var, this.f4960l.get(), bVar)));
    }

    /* renamed from: H */
    public final <O extends C4719a.C4723d, ResultT> void mo32479H(@NonNull C4730b<O> bVar, int i, @NonNull C4756h<C4719a.C4721b, ResultT> hVar, @NonNull C10406g<ResultT> gVar, @NonNull C9236k kVar) {
        m6514m(gVar, hVar.mo32515d(), bVar);
        C4755g0 g0Var = new C4755g0(i, hVar, gVar, kVar);
        Handler handler = this.f4965q;
        handler.sendMessage(handler.obtainMessage(4, new C9250w(g0Var, this.f4960l.get(), bVar)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final void mo32480I(C9702m mVar, int i, long j, int i2) {
        Handler handler = this.f4965q;
        handler.sendMessage(handler.obtainMessage(18, new C4782y(mVar, i, j, i2)));
    }

    /* renamed from: J */
    public final void mo32481J(@NonNull ConnectionResult connectionResult, int i) {
        if (!mo32487h(connectionResult, i)) {
            Handler handler = this.f4965q;
            handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
        }
    }

    /* renamed from: b */
    public final void mo32482b() {
        Handler handler = this.f4965q;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* renamed from: c */
    public final void mo32483c(@NonNull C4730b<?> bVar) {
        Handler handler = this.f4965q;
        handler.sendMessage(handler.obtainMessage(7, bVar));
    }

    /* renamed from: d */
    public final void mo32484d(@NonNull C4767m mVar) {
        synchronized (f4948u) {
            if (this.f4962n != mVar) {
                this.f4962n = mVar;
                this.f4963o.clear();
            }
            this.f4963o.addAll(mVar.mo32535t());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo32485e(@NonNull C4767m mVar) {
        synchronized (f4948u) {
            if (this.f4962n == mVar) {
                this.f4962n = null;
                this.f4963o.clear();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: g */
    public final boolean mo32486g() {
        if (this.f4953e) {
            return false;
        }
        C9719r a = C9716q.m20289b().mo44238a();
        if (a != null && !a.mo44244G()) {
            return false;
        }
        int a2 = this.f4958j.mo44194a(this.f4956h, 203400000);
        if (a2 == -1 || a2 == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo32487h(ConnectionResult connectionResult, int i) {
        return this.f4957i.mo32360x(this.f4956h, connectionResult, i);
    }

    @WorkerThread
    public final boolean handleMessage(@NonNull Message message) {
        int i = message.what;
        long j = 300000;
        C4777t tVar = null;
        switch (i) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.f4952d = j;
                this.f4965q.removeMessages(12);
                for (C9218b<?> obtainMessage : this.f4961m.keySet()) {
                    Handler handler = this.f4965q;
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.f4952d);
                }
                break;
            case 2:
                C9229g0 g0Var = (C9229g0) message.obj;
                Iterator<C9218b<?>> it = g0Var.mo43527a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        C9218b next = it.next();
                        C4777t tVar2 = this.f4961m.get(next);
                        if (tVar2 == null) {
                            g0Var.mo43528b(next, new ConnectionResult(13), (String) null);
                            break;
                        } else if (tVar2.mo32559O()) {
                            g0Var.mo43528b(next, ConnectionResult.f4869f, tVar2.mo32565s().mo32398e());
                        } else {
                            ConnectionResult q = tVar2.mo32564q();
                            if (q != null) {
                                g0Var.mo43528b(next, q, (String) null);
                            } else {
                                tVar2.mo32554I(g0Var);
                                tVar2.mo32547B();
                            }
                        }
                    }
                }
            case 3:
                for (C4777t next2 : this.f4961m.values()) {
                    next2.mo32546A();
                    next2.mo32547B();
                }
                break;
            case 4:
            case 8:
            case 13:
                C9250w wVar = (C9250w) message.obj;
                C4777t<?> tVar3 = this.f4961m.get(wVar.f13595c.mo32416p());
                if (tVar3 == null) {
                    tVar3 = m6511j(wVar.f13595c);
                }
                if (tVar3.mo32560P() && this.f4960l.get() != wVar.f13594b) {
                    wVar.f13593a.mo32491a(f4946s);
                    tVar3.mo32557L();
                    break;
                } else {
                    tVar3.mo32548C(wVar.f13593a);
                    break;
                }
                break;
            case 5:
                int i2 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator<C4777t<?>> it2 = this.f4961m.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C4777t next3 = it2.next();
                        if (next3.mo32562o() == i2) {
                            tVar = next3;
                        }
                    }
                }
                if (tVar != null) {
                    if (connectionResult.mo32334A() != 13) {
                        tVar.m6639d(m6510i(tVar.f5031c, connectionResult));
                        break;
                    } else {
                        String e = this.f4957i.mo32345e(connectionResult.mo32334A());
                        String F = connectionResult.mo32335F();
                        StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 69 + String.valueOf(F).length());
                        sb.append("Error resolution was canceled by the user, original error message: ");
                        sb.append(e);
                        sb.append(": ");
                        sb.append(F);
                        tVar.m6639d(new Status(17, sb.toString()));
                        break;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i2);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                    break;
                }
            case 6:
                if (this.f4956h.getApplicationContext() instanceof Application) {
                    C4739a.m6490c((Application) this.f4956h.getApplicationContext());
                    C4739a.m6489b().mo32455a(new C4771o(this));
                    if (!C4739a.m6489b().mo32457e(true)) {
                        this.f4952d = 300000;
                        break;
                    }
                }
                break;
            case 7:
                m6511j((C4730b) message.obj);
                break;
            case 9:
                if (this.f4961m.containsKey(message.obj)) {
                    this.f4961m.get(message.obj).mo32556K();
                    break;
                }
                break;
            case 10:
                for (C9218b<?> remove : this.f4964p) {
                    C4777t remove2 = this.f4961m.remove(remove);
                    if (remove2 != null) {
                        remove2.mo32557L();
                    }
                }
                this.f4964p.clear();
                break;
            case 11:
                if (this.f4961m.containsKey(message.obj)) {
                    this.f4961m.get(message.obj).mo32558M();
                    break;
                }
                break;
            case 12:
                if (this.f4961m.containsKey(message.obj)) {
                    this.f4961m.get(message.obj).mo32561a();
                    break;
                }
                break;
            case 14:
                C4769n nVar = (C4769n) message.obj;
                C9218b<?> a = nVar.mo32538a();
                if (this.f4961m.containsKey(a)) {
                    nVar.mo32539b().mo45098c(Boolean.valueOf(this.f4961m.get(a).m6649n(false)));
                    break;
                } else {
                    nVar.mo32539b().mo45098c(Boolean.FALSE);
                    break;
                }
            case 15:
                C4778u uVar = (C4778u) message.obj;
                if (this.f4961m.containsKey(uVar.f5042a)) {
                    C4777t.m6655y(this.f4961m.get(uVar.f5042a), uVar);
                    break;
                }
                break;
            case 16:
                C4778u uVar2 = (C4778u) message.obj;
                if (this.f4961m.containsKey(uVar2.f5042a)) {
                    C4777t.m6656z(this.f4961m.get(uVar2.f5042a), uVar2);
                    break;
                }
                break;
            case 17:
                m6513l();
                break;
            case 18:
                C4782y yVar = (C4782y) message.obj;
                if (yVar.f5059c != 0) {
                    C9725t tVar4 = this.f4954f;
                    if (tVar4 != null) {
                        List<C9702m> F2 = tVar4.mo44254F();
                        if (tVar4.mo44253A() != yVar.f5058b || (F2 != null && F2.size() >= yVar.f5060d)) {
                            this.f4965q.removeMessages(17);
                            m6513l();
                        } else {
                            this.f4954f.mo44255G(yVar.f5057a);
                        }
                    }
                    if (this.f4954f == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(yVar.f5057a);
                        this.f4954f = new C9725t(yVar.f5058b, arrayList);
                        Handler handler2 = this.f4965q;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), yVar.f5059c);
                        break;
                    }
                } else {
                    m6512k().mo44261g(new C9725t(yVar.f5058b, Arrays.asList(new C9702m[]{yVar.f5057a})));
                    break;
                }
                break;
            case 19:
                this.f4953e = false;
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }

    /* renamed from: n */
    public final int mo32489n() {
        return this.f4959k.getAndIncrement();
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: x */
    public final C4777t mo32490x(C9218b<?> bVar) {
        return this.f4961m.get(bVar);
    }
}
