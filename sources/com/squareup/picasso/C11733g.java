package com.squareup.picasso;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.squareup.picasso.C11747n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import p452wd.C13694a;
import p452wd.C13695b;

/* renamed from: com.squareup.picasso.g */
/* compiled from: Dispatcher */
class C11733g {

    /* renamed from: a */
    final C11736b f18236a;

    /* renamed from: b */
    final Context f18237b;

    /* renamed from: c */
    final ExecutorService f18238c;

    /* renamed from: d */
    final C13695b f18239d;

    /* renamed from: e */
    final Map<String, C11723c> f18240e = new LinkedHashMap();

    /* renamed from: f */
    final Map<Object, C11720a> f18241f = new WeakHashMap();

    /* renamed from: g */
    final Map<Object, C11720a> f18242g = new WeakHashMap();

    /* renamed from: h */
    final Set<Object> f18243h = new LinkedHashSet();

    /* renamed from: i */
    final Handler f18244i;

    /* renamed from: j */
    final Handler f18245j;

    /* renamed from: k */
    final C13694a f18246k;

    /* renamed from: l */
    final C11771w f18247l;

    /* renamed from: m */
    final List<C11723c> f18248m;

    /* renamed from: n */
    final C11737c f18249n;

    /* renamed from: o */
    final boolean f18250o;

    /* renamed from: p */
    boolean f18251p;

    /* renamed from: com.squareup.picasso.g$a */
    /* compiled from: Dispatcher */
    private static class C11734a extends Handler {

        /* renamed from: a */
        private final C11733g f18252a;

        /* renamed from: com.squareup.picasso.g$a$a */
        /* compiled from: Dispatcher */
        class C11735a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ Message f18253b;

            C11735a(Message message) {
                this.f18253b = message;
            }

            public void run() {
                throw new AssertionError("Unknown handler message received: " + this.f18253b.what);
            }
        }

        C11734a(Looper looper, C11733g gVar) {
            super(looper);
            this.f18252a = gVar;
        }

        public void handleMessage(Message message) {
            boolean z = false;
            switch (message.what) {
                case 1:
                    this.f18252a.mo48708v((C11720a) message.obj);
                    return;
                case 2:
                    this.f18252a.mo48701o((C11720a) message.obj);
                    return;
                case 4:
                    this.f18252a.mo48702p((C11723c) message.obj);
                    return;
                case 5:
                    this.f18252a.mo48707u((C11723c) message.obj);
                    return;
                case 6:
                    this.f18252a.mo48703q((C11723c) message.obj, false);
                    return;
                case 7:
                    this.f18252a.mo48700n();
                    return;
                case 9:
                    this.f18252a.mo48704r((NetworkInfo) message.obj);
                    return;
                case 10:
                    C11733g gVar = this.f18252a;
                    if (message.arg1 == 1) {
                        z = true;
                    }
                    gVar.mo48699m(z);
                    return;
                case 11:
                    this.f18252a.mo48705s(message.obj);
                    return;
                case 12:
                    this.f18252a.mo48706t(message.obj);
                    return;
                default:
                    C11751p.f18287o.post(new C11735a(message));
                    return;
            }
        }
    }

    /* renamed from: com.squareup.picasso.g$b */
    /* compiled from: Dispatcher */
    static class C11736b extends HandlerThread {
        C11736b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    /* renamed from: com.squareup.picasso.g$c */
    /* compiled from: Dispatcher */
    static class C11737c extends BroadcastReceiver {

        /* renamed from: a */
        private final C11733g f18255a;

        C11737c(C11733g gVar) {
            this.f18255a = gVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo48712a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (this.f18255a.f18250o) {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            this.f18255a.f18237b.registerReceiver(this, intentFilter);
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                    if (intent.hasExtra("state")) {
                        this.f18255a.mo48692b(intent.getBooleanExtra("state", false));
                    }
                } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    this.f18255a.mo48696f(((ConnectivityManager) C11774x.m25308n(context, "connectivity")).getActiveNetworkInfo());
                }
            }
        }
    }

    C11733g(Context context, ExecutorService executorService, Handler handler, C13695b bVar, C13694a aVar, C11771w wVar) {
        C11736b bVar2 = new C11736b();
        this.f18236a = bVar2;
        bVar2.start();
        C11774x.m25302h(bVar2.getLooper());
        this.f18237b = context;
        this.f18238c = executorService;
        this.f18244i = new C11734a(bVar2.getLooper(), this);
        this.f18239d = bVar;
        this.f18245j = handler;
        this.f18246k = aVar;
        this.f18247l = wVar;
        this.f18248m = new ArrayList(4);
        this.f18251p = C11774x.m25310p(context);
        this.f18250o = C11774x.m25309o(context, "android.permission.ACCESS_NETWORK_STATE");
        C11737c cVar = new C11737c(this);
        this.f18249n = cVar;
        cVar.mo48712a();
    }

    /* renamed from: a */
    private void m25173a(C11723c cVar) {
        if (!cVar.mo48678u()) {
            Bitmap bitmap = cVar.f18218n;
            if (bitmap != null) {
                bitmap.prepareToDraw();
            }
            this.f18248m.add(cVar);
            if (!this.f18244i.hasMessages(7)) {
                this.f18244i.sendEmptyMessageDelayed(7, 200);
            }
        }
    }

    /* renamed from: i */
    private void m25174i() {
        if (!this.f18241f.isEmpty()) {
            Iterator<C11720a> it = this.f18241f.values().iterator();
            while (it.hasNext()) {
                C11720a next = it.next();
                it.remove();
                if (next.mo48654g().f18301m) {
                    C11774x.m25313s("Dispatcher", "replaying", next.mo48656i().mo48764d());
                }
                mo48709w(next, false);
            }
        }
    }

    /* renamed from: j */
    private void m25175j(List<C11723c> list) {
        if (list != null && !list.isEmpty() && list.get(0).mo48673q().f18301m) {
            StringBuilder sb = new StringBuilder();
            for (C11723c next : list) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(C11774x.m25304j(next));
            }
            C11774x.m25313s("Dispatcher", "delivered", sb.toString());
        }
    }

    /* renamed from: k */
    private void m25176k(C11720a aVar) {
        Object k = aVar.mo48658k();
        if (k != null) {
            aVar.f18195k = true;
            this.f18241f.put(k, aVar);
        }
    }

    /* renamed from: l */
    private void m25177l(C11723c cVar) {
        C11720a h = cVar.mo48666h();
        if (h != null) {
            m25176k(h);
        }
        List<C11720a> i = cVar.mo48667i();
        if (i != null) {
            int size = i.size();
            for (int i2 = 0; i2 < size; i2++) {
                m25176k(i.get(i2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo48692b(boolean z) {
        Handler handler = this.f18244i;
        handler.sendMessage(handler.obtainMessage(10, z ? 1 : 0, 0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo48693c(C11720a aVar) {
        Handler handler = this.f18244i;
        handler.sendMessage(handler.obtainMessage(2, aVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo48694d(C11723c cVar) {
        Handler handler = this.f18244i;
        handler.sendMessage(handler.obtainMessage(4, cVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo48695e(C11723c cVar) {
        Handler handler = this.f18244i;
        handler.sendMessage(handler.obtainMessage(6, cVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo48696f(NetworkInfo networkInfo) {
        Handler handler = this.f18244i;
        handler.sendMessage(handler.obtainMessage(9, networkInfo));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo48697g(C11723c cVar) {
        Handler handler = this.f18244i;
        handler.sendMessageDelayed(handler.obtainMessage(5, cVar), 500);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo48698h(C11720a aVar) {
        Handler handler = this.f18244i;
        handler.sendMessage(handler.obtainMessage(1, aVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo48699m(boolean z) {
        this.f18251p = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo48700n() {
        ArrayList arrayList = new ArrayList(this.f18248m);
        this.f18248m.clear();
        Handler handler = this.f18245j;
        handler.sendMessage(handler.obtainMessage(8, arrayList));
        m25175j(arrayList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo48701o(C11720a aVar) {
        String d = aVar.mo48651d();
        C11723c cVar = this.f18240e.get(d);
        if (cVar != null) {
            cVar.mo48665f(aVar);
            if (cVar.mo48664c()) {
                this.f18240e.remove(d);
                if (aVar.mo48654g().f18301m) {
                    C11774x.m25313s("Dispatcher", "canceled", aVar.mo48656i().mo48764d());
                }
            }
        }
        if (this.f18243h.contains(aVar.mo48657j())) {
            this.f18242g.remove(aVar.mo48658k());
            if (aVar.mo48654g().f18301m) {
                C11774x.m25314t("Dispatcher", "canceled", aVar.mo48656i().mo48764d(), "because paused request got canceled");
            }
        }
        C11720a remove = this.f18241f.remove(aVar.mo48658k());
        if (remove != null && remove.mo48654g().f18301m) {
            C11774x.m25314t("Dispatcher", "canceled", remove.mo48656i().mo48764d(), "from replaying");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo48702p(C11723c cVar) {
        if (C11746m.m25216b(cVar.mo48672p())) {
            this.f18246k.mo48715b(cVar.mo48670n(), cVar.mo48676s());
        }
        this.f18240e.remove(cVar.mo48670n());
        m25173a(cVar);
        if (cVar.mo48673q().f18301m) {
            C11774x.m25314t("Dispatcher", "batched", C11774x.m25304j(cVar), "for completion");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo48703q(C11723c cVar, boolean z) {
        String str;
        if (cVar.mo48673q().f18301m) {
            String j = C11774x.m25304j(cVar);
            StringBuilder sb = new StringBuilder();
            sb.append("for error");
            if (z) {
                str = " (will replay)";
            } else {
                str = "";
            }
            sb.append(str);
            C11774x.m25314t("Dispatcher", "batched", j, sb.toString());
        }
        this.f18240e.remove(cVar.mo48670n());
        m25173a(cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo48704r(NetworkInfo networkInfo) {
        ExecutorService executorService = this.f18238c;
        if (executorService instanceof C11762r) {
            ((C11762r) executorService).mo48757a(networkInfo);
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            m25174i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo48705s(Object obj) {
        boolean z;
        if (this.f18243h.add(obj)) {
            Iterator<C11723c> it = this.f18240e.values().iterator();
            while (it.hasNext()) {
                C11723c next = it.next();
                boolean z2 = next.mo48673q().f18301m;
                C11720a h = next.mo48666h();
                List<C11720a> i = next.mo48667i();
                if (i == null || i.isEmpty()) {
                    z = false;
                } else {
                    z = true;
                }
                if (h != null || z) {
                    if (h != null && h.mo48657j().equals(obj)) {
                        next.mo48665f(h);
                        this.f18242g.put(h.mo48658k(), h);
                        if (z2) {
                            C11774x.m25314t("Dispatcher", "paused", h.f18186b.mo48764d(), "because tag '" + obj + "' was paused");
                        }
                    }
                    if (z) {
                        for (int size = i.size() - 1; size >= 0; size--) {
                            C11720a aVar = i.get(size);
                            if (aVar.mo48657j().equals(obj)) {
                                next.mo48665f(aVar);
                                this.f18242g.put(aVar.mo48658k(), aVar);
                                if (z2) {
                                    C11774x.m25314t("Dispatcher", "paused", aVar.f18186b.mo48764d(), "because tag '" + obj + "' was paused");
                                }
                            }
                        }
                    }
                    if (next.mo48664c()) {
                        it.remove();
                        if (z2) {
                            C11774x.m25314t("Dispatcher", "canceled", C11774x.m25304j(next), "all actions paused");
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo48706t(Object obj) {
        if (this.f18243h.remove(obj)) {
            Iterator<C11720a> it = this.f18242g.values().iterator();
            ArrayList arrayList = null;
            while (it.hasNext()) {
                C11720a next = it.next();
                if (next.mo48657j().equals(obj)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(next);
                    it.remove();
                }
            }
            if (arrayList != null) {
                Handler handler = this.f18245j;
                handler.sendMessage(handler.obtainMessage(13, arrayList));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo48707u(C11723c cVar) {
        NetworkInfo networkInfo;
        if (!cVar.mo48678u()) {
            boolean z = false;
            if (this.f18238c.isShutdown()) {
                mo48703q(cVar, false);
                return;
            }
            if (this.f18250o) {
                networkInfo = ((ConnectivityManager) C11774x.m25308n(this.f18237b, "connectivity")).getActiveNetworkInfo();
            } else {
                networkInfo = null;
            }
            if (cVar.mo48679w(this.f18251p, networkInfo)) {
                if (cVar.mo48673q().f18301m) {
                    C11774x.m25313s("Dispatcher", "retrying", C11774x.m25304j(cVar));
                }
                if (cVar.mo48669k() instanceof C11747n.C11748a) {
                    cVar.f18214j |= NetworkPolicy.NO_CACHE.f18183b;
                }
                cVar.f18219o = this.f18238c.submit(cVar);
                return;
            }
            if (this.f18250o && cVar.mo48680x()) {
                z = true;
            }
            mo48703q(cVar, z);
            if (z) {
                m25177l(cVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo48708v(C11720a aVar) {
        mo48709w(aVar, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo48709w(C11720a aVar, boolean z) {
        if (this.f18243h.contains(aVar.mo48657j())) {
            this.f18242g.put(aVar.mo48658k(), aVar);
            if (aVar.mo48654g().f18301m) {
                String d = aVar.f18186b.mo48764d();
                C11774x.m25314t("Dispatcher", "paused", d, "because tag '" + aVar.mo48657j() + "' is paused");
                return;
            }
            return;
        }
        C11723c cVar = this.f18240e.get(aVar.mo48651d());
        if (cVar != null) {
            cVar.mo48663b(aVar);
        } else if (!this.f18238c.isShutdown()) {
            C11723c g = C11723c.m25140g(aVar.mo48654g(), this, this.f18246k, this.f18247l, aVar);
            g.f18219o = this.f18238c.submit(g);
            this.f18240e.put(aVar.mo48651d(), g);
            if (z) {
                this.f18241f.remove(aVar.mo48658k());
            }
            if (aVar.mo48654g().f18301m) {
                C11774x.m25313s("Dispatcher", "enqueued", aVar.f18186b.mo48764d());
            }
        } else if (aVar.mo48654g().f18301m) {
            C11774x.m25314t("Dispatcher", "ignored", aVar.f18186b.mo48764d(), "because shut down");
        }
    }
}
