package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.internal.view.SupportMenu;
import com.squareup.picasso.C11720a;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import p452wd.C13694a;
import p452wd.C13695b;

/* renamed from: com.squareup.picasso.p */
/* compiled from: Picasso */
public class C11751p {

    /* renamed from: o */
    static final Handler f18287o = new C11752a(Looper.getMainLooper());

    /* renamed from: p */
    static volatile C11751p f18288p = null;

    /* renamed from: a */
    private final C11759g f18289a;

    /* renamed from: b */
    private final C11754c f18290b;

    /* renamed from: c */
    private final List<C11768u> f18291c;

    /* renamed from: d */
    final Context f18292d;

    /* renamed from: e */
    final C11733g f18293e;

    /* renamed from: f */
    final C13694a f18294f;

    /* renamed from: g */
    final C11771w f18295g;

    /* renamed from: h */
    final Map<Object, C11720a> f18296h;

    /* renamed from: i */
    final Map<ImageView, C11732f> f18297i;

    /* renamed from: j */
    final ReferenceQueue<Object> f18298j;

    /* renamed from: k */
    final Bitmap.Config f18299k;

    /* renamed from: l */
    boolean f18300l;

    /* renamed from: m */
    volatile boolean f18301m;

    /* renamed from: n */
    boolean f18302n;

    /* renamed from: com.squareup.picasso.p$a */
    /* compiled from: Picasso */
    static class C11752a extends Handler {
        C11752a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 3) {
                int i2 = 0;
                if (i == 8) {
                    List list = (List) message.obj;
                    int size = list.size();
                    while (i2 < size) {
                        C11723c cVar = (C11723c) list.get(i2);
                        cVar.f18207c.mo48738c(cVar);
                        i2++;
                    }
                } else if (i == 13) {
                    List list2 = (List) message.obj;
                    int size2 = list2.size();
                    while (i2 < size2) {
                        C11720a aVar = (C11720a) list2.get(i2);
                        aVar.f18185a.mo48745l(aVar);
                        i2++;
                    }
                } else {
                    throw new AssertionError("Unknown handler message received: " + message.what);
                }
            } else {
                C11720a aVar2 = (C11720a) message.obj;
                if (aVar2.mo48654g().f18301m) {
                    C11774x.m25314t("Main", "canceled", aVar2.f18186b.mo48764d(), "target got garbage collected");
                }
                aVar2.f18185a.mo48736a(aVar2.mo48658k());
            }
        }
    }

    /* renamed from: com.squareup.picasso.p$b */
    /* compiled from: Picasso */
    public static class C11753b {

        /* renamed from: a */
        private final Context f18303a;

        /* renamed from: b */
        private C13695b f18304b;

        /* renamed from: c */
        private ExecutorService f18305c;

        /* renamed from: d */
        private C13694a f18306d;

        /* renamed from: e */
        private C11759g f18307e;

        /* renamed from: f */
        private List<C11768u> f18308f;

        /* renamed from: g */
        private Bitmap.Config f18309g;

        /* renamed from: h */
        private boolean f18310h;

        /* renamed from: i */
        private boolean f18311i;

        public C11753b(@NonNull Context context) {
            if (context != null) {
                this.f18303a = context.getApplicationContext();
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        /* renamed from: a */
        public C11751p mo48749a() {
            Context context = this.f18303a;
            if (this.f18304b == null) {
                this.f18304b = new C11750o(context);
            }
            if (this.f18306d == null) {
                this.f18306d = new C11740j(context);
            }
            if (this.f18305c == null) {
                this.f18305c = new C11762r();
            }
            if (this.f18307e == null) {
                this.f18307e = C11759g.f18325a;
            }
            C11771w wVar = new C11771w(this.f18306d);
            Context context2 = context;
            return new C11751p(context2, new C11733g(context2, this.f18305c, C11751p.f18287o, this.f18304b, this.f18306d, wVar), this.f18306d, (C11756d) null, this.f18307e, this.f18308f, wVar, this.f18309g, this.f18310h, this.f18311i);
        }
    }

    /* renamed from: com.squareup.picasso.p$c */
    /* compiled from: Picasso */
    private static class C11754c extends Thread {

        /* renamed from: b */
        private final ReferenceQueue<Object> f18312b;

        /* renamed from: c */
        private final Handler f18313c;

        /* renamed from: com.squareup.picasso.p$c$a */
        /* compiled from: Picasso */
        class C11755a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ Exception f18314b;

            C11755a(Exception exc) {
                this.f18314b = exc;
            }

            public void run() {
                throw new RuntimeException(this.f18314b);
            }
        }

        C11754c(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.f18312b = referenceQueue;
            this.f18313c = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    C11720a.C11721a aVar = (C11720a.C11721a) this.f18312b.remove(1000);
                    Message obtainMessage = this.f18313c.obtainMessage();
                    if (aVar != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = aVar.f18197a;
                        this.f18313c.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e) {
                    this.f18313c.post(new C11755a(e));
                    return;
                }
            }
        }
    }

    /* renamed from: com.squareup.picasso.p$d */
    /* compiled from: Picasso */
    public interface C11756d {
    }

    /* renamed from: com.squareup.picasso.p$e */
    /* compiled from: Picasso */
    public enum C11757e {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(SupportMenu.CATEGORY_MASK);
        

        /* renamed from: b */
        final int f18320b;

        private C11757e(int i) {
            this.f18320b = i;
        }
    }

    /* renamed from: com.squareup.picasso.p$f */
    /* compiled from: Picasso */
    public enum C11758f {
        LOW,
        NORMAL,
        HIGH
    }

    C11751p(Context context, C11733g gVar, C13694a aVar, C11756d dVar, C11759g gVar2, List<C11768u> list, C11771w wVar, Bitmap.Config config, boolean z, boolean z2) {
        int i;
        this.f18292d = context;
        this.f18293e = gVar;
        this.f18294f = aVar;
        this.f18289a = gVar2;
        this.f18299k = config;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        ArrayList arrayList = new ArrayList(i + 7);
        arrayList.add(new C11770v(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new C11730d(context));
        arrayList.add(new C11744l(context));
        arrayList.add(new C11731e(context));
        arrayList.add(new C11722b(context));
        arrayList.add(new C11738h(context));
        arrayList.add(new C11747n(gVar.f18239d, wVar));
        this.f18291c = Collections.unmodifiableList(arrayList);
        this.f18295g = wVar;
        this.f18296h = new WeakHashMap();
        this.f18297i = new WeakHashMap();
        this.f18300l = z;
        this.f18301m = z2;
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.f18298j = referenceQueue;
        C11754c cVar = new C11754c(referenceQueue, f18287o);
        this.f18290b = cVar;
        cVar.start();
    }

    /* renamed from: e */
    private void m25224e(Bitmap bitmap, C11757e eVar, C11720a aVar, Exception exc) {
        if (!aVar.mo48659l()) {
            if (!aVar.mo48660m()) {
                this.f18296h.remove(aVar.mo48658k());
            }
            if (bitmap == null) {
                aVar.mo48650c(exc);
                if (this.f18301m) {
                    C11774x.m25314t("Main", "errored", aVar.f18186b.mo48764d(), exc.getMessage());
                }
            } else if (eVar != null) {
                aVar.mo48649b(bitmap, eVar);
                if (this.f18301m) {
                    String d = aVar.f18186b.mo48764d();
                    C11774x.m25314t("Main", "completed", d, "from " + eVar);
                }
            } else {
                throw new AssertionError("LoadedFrom cannot be null.");
            }
        }
    }

    /* renamed from: g */
    public static C11751p m25225g() {
        if (f18288p == null) {
            synchronized (C11751p.class) {
                if (f18288p == null) {
                    Context context = PicassoProvider.f18184b;
                    if (context != null) {
                        f18288p = new C11753b(context).mo48749a();
                    } else {
                        throw new IllegalStateException("context == null");
                    }
                }
            }
        }
        return f18288p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo48736a(Object obj) {
        C11732f remove;
        C11774x.m25297c();
        C11720a remove2 = this.f18296h.remove(obj);
        if (remove2 != null) {
            remove2.mo48648a();
            this.f18293e.mo48693c(remove2);
        }
        if ((obj instanceof ImageView) && (remove = this.f18297i.remove((ImageView) obj)) != null) {
            remove.mo48688a();
        }
    }

    /* renamed from: b */
    public void mo48737b(@NonNull ImageView imageView) {
        if (imageView != null) {
            mo48736a(imageView);
            return;
        }
        throw new IllegalArgumentException("view cannot be null.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo48738c(C11723c cVar) {
        boolean z;
        C11720a h = cVar.mo48666h();
        List<C11720a> i = cVar.mo48667i();
        boolean z2 = true;
        if (i == null || i.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (h == null && !z) {
            z2 = false;
        }
        if (z2) {
            Uri uri = cVar.mo48668j().f18339d;
            Exception k = cVar.mo48669k();
            Bitmap s = cVar.mo48676s();
            C11757e o = cVar.mo48671o();
            if (h != null) {
                m25224e(s, o, h, k);
            }
            if (z) {
                int size = i.size();
                for (int i2 = 0; i2 < size; i2++) {
                    m25224e(s, o, i.get(i2), k);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo48739d(ImageView imageView, C11732f fVar) {
        if (this.f18297i.containsKey(imageView)) {
            mo48736a(imageView);
        }
        this.f18297i.put(imageView, fVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo48740f(C11720a aVar) {
        Object k = aVar.mo48658k();
        if (!(k == null || this.f18296h.get(k) == aVar)) {
            mo48736a(k);
            this.f18296h.put(k, aVar);
        }
        mo48746m(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public List<C11768u> mo48741h() {
        return this.f18291c;
    }

    /* renamed from: i */
    public C11767t mo48742i(@Nullable Uri uri) {
        return new C11767t(this, uri, 0);
    }

    /* renamed from: j */
    public C11767t mo48743j(@Nullable String str) {
        if (str == null) {
            return new C11767t(this, (Uri) null, 0);
        }
        if (str.trim().length() != 0) {
            return mo48742i(Uri.parse(str));
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Bitmap mo48744k(String str) {
        Bitmap bitmap = this.f18294f.get(str);
        if (bitmap != null) {
            this.f18295g.mo48785d();
        } else {
            this.f18295g.mo48786e();
        }
        return bitmap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo48745l(C11720a aVar) {
        Bitmap bitmap;
        if (C11746m.m25215a(aVar.f18189e)) {
            bitmap = mo48744k(aVar.mo48651d());
        } else {
            bitmap = null;
        }
        if (bitmap != null) {
            C11757e eVar = C11757e.MEMORY;
            m25224e(bitmap, eVar, aVar, (Exception) null);
            if (this.f18301m) {
                C11774x.m25314t("Main", "completed", aVar.f18186b.mo48764d(), "from " + eVar);
                return;
            }
            return;
        }
        mo48740f(aVar);
        if (this.f18301m) {
            C11774x.m25313s("Main", "resumed", aVar.f18186b.mo48764d());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo48746m(C11720a aVar) {
        this.f18293e.mo48698h(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C11764s mo48747n(C11764s sVar) {
        C11764s a = this.f18289a.mo48752a(sVar);
        if (a != null) {
            return a;
        }
        throw new IllegalStateException("Request transformer " + this.f18289a.getClass().getCanonicalName() + " returned null for " + sVar);
    }

    /* renamed from: com.squareup.picasso.p$g */
    /* compiled from: Picasso */
    public interface C11759g {

        /* renamed from: a */
        public static final C11759g f18325a = new C11760a();

        /* renamed from: a */
        C11764s mo48752a(C11764s sVar);

        /* renamed from: com.squareup.picasso.p$g$a */
        /* compiled from: Picasso */
        static class C11760a implements C11759g {
            C11760a() {
            }

            /* renamed from: a */
            public C11764s mo48752a(C11764s sVar) {
                return sVar;
            }
        }
    }
}
