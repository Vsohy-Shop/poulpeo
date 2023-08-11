package p197q1;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.C4362b;
import com.bumptech.glide.C4369g;
import com.bumptech.glide.C4371h;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p044c1.C3865a;
import p058d1.C7218e;
import p058d1.C7226k;
import p094g1.C7737a;
import p106h1.C7885d;
import p250v1.C9920f;
import p261w1.C10101a;
import p272x1.C10386b;
import p283y1.C10652b;
import p294z1.C10791j;

/* renamed from: q1.g */
/* compiled from: GifFrameLoader */
class C9107g {

    /* renamed from: a */
    private final C3865a f13261a;

    /* renamed from: b */
    private final Handler f13262b;

    /* renamed from: c */
    private final List<C9109b> f13263c;

    /* renamed from: d */
    final C4371h f13264d;

    /* renamed from: e */
    private final C7885d f13265e;

    /* renamed from: f */
    private boolean f13266f;

    /* renamed from: g */
    private boolean f13267g;

    /* renamed from: h */
    private boolean f13268h;

    /* renamed from: i */
    private C4369g<Bitmap> f13269i;

    /* renamed from: j */
    private C9108a f13270j;

    /* renamed from: k */
    private boolean f13271k;

    /* renamed from: l */
    private C9108a f13272l;

    /* renamed from: m */
    private Bitmap f13273m;

    /* renamed from: n */
    private C7226k<Bitmap> f13274n;

    /* renamed from: o */
    private C9108a f13275o;

    /* renamed from: p */
    private int f13276p;

    /* renamed from: q */
    private int f13277q;

    /* renamed from: r */
    private int f13278r;

    @VisibleForTesting
    /* renamed from: q1.g$a */
    /* compiled from: GifFrameLoader */
    static class C9108a extends C10101a<Bitmap> {

        /* renamed from: e */
        private final Handler f13279e;

        /* renamed from: f */
        final int f13280f;

        /* renamed from: g */
        private final long f13281g;

        /* renamed from: h */
        private Bitmap f13282h;

        C9108a(Handler handler, int i, long j) {
            this.f13279e = handler;
            this.f13280f = i;
            this.f13281g = j;
        }

        /* renamed from: i */
        public void mo43367i(@Nullable Drawable drawable) {
            this.f13282h = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public Bitmap mo43368j() {
            return this.f13282h;
        }

        /* renamed from: k */
        public void mo43366d(@NonNull Bitmap bitmap, @Nullable C10386b<? super Bitmap> bVar) {
            this.f13282h = bitmap;
            this.f13279e.sendMessageAtTime(this.f13279e.obtainMessage(1, this), this.f13281g);
        }
    }

    /* renamed from: q1.g$b */
    /* compiled from: GifFrameLoader */
    public interface C9109b {
        /* renamed from: a */
        void mo43329a();
    }

    /* renamed from: q1.g$c */
    /* compiled from: GifFrameLoader */
    private class C9110c implements Handler.Callback {
        C9110c() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                C9107g.this.mo43362m((C9108a) message.obj);
                return true;
            } else if (i != 2) {
                return false;
            } else {
                C9107g.this.f13264d.mo31215n((C9108a) message.obj);
                return false;
            }
        }
    }

    C9107g(C4362b bVar, C3865a aVar, int i, int i2, C7226k<Bitmap> kVar, Bitmap bitmap) {
        this(bVar.mo31177f(), C4362b.m5047t(bVar.mo31179h()), aVar, (Handler) null, m18514i(C4362b.m5047t(bVar.mo31179h()), i, i2), kVar, bitmap);
    }

    /* renamed from: g */
    private static C7218e m18513g() {
        return new C10652b(Double.valueOf(Math.random()));
    }

    /* renamed from: i */
    private static C4369g<Bitmap> m18514i(C4371h hVar, int i, int i2) {
        return hVar.mo31213l().mo31201a(((C9920f) ((C9920f) C9920f.m20685c0(C7737a.f10716b).mo44454a0(true)).mo44450W(true)).mo44444K(i, i2));
    }

    /* renamed from: l */
    private void m18515l() {
        boolean z;
        if (this.f13266f && !this.f13267g) {
            if (this.f13268h) {
                if (this.f13275o == null) {
                    z = true;
                } else {
                    z = false;
                }
                C10791j.m22945a(z, "Pending target must be null when starting from the first frame");
                this.f13261a.mo29895f();
                this.f13268h = false;
            }
            C9108a aVar = this.f13275o;
            if (aVar != null) {
                this.f13275o = null;
                mo43362m(aVar);
                return;
            }
            this.f13267g = true;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) this.f13261a.mo29893d());
            this.f13261a.mo29890b();
            this.f13272l = new C9108a(this.f13262b, this.f13261a.mo29896g(), uptimeMillis);
            this.f13269i.mo31201a(C9920f.m20686d0(m18513g())).mo31209n0(this.f13261a).mo31207j0(this.f13272l);
        }
    }

    /* renamed from: n */
    private void m18516n() {
        Bitmap bitmap = this.f13273m;
        if (bitmap != null) {
            this.f13265e.mo31429c(bitmap);
            this.f13273m = null;
        }
    }

    /* renamed from: p */
    private void m18517p() {
        if (!this.f13266f) {
            this.f13266f = true;
            this.f13271k = false;
            m18515l();
        }
    }

    /* renamed from: q */
    private void m18518q() {
        this.f13266f = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo43353a() {
        this.f13263c.clear();
        m18516n();
        m18518q();
        C9108a aVar = this.f13270j;
        if (aVar != null) {
            this.f13264d.mo31215n(aVar);
            this.f13270j = null;
        }
        C9108a aVar2 = this.f13272l;
        if (aVar2 != null) {
            this.f13264d.mo31215n(aVar2);
            this.f13272l = null;
        }
        C9108a aVar3 = this.f13275o;
        if (aVar3 != null) {
            this.f13264d.mo31215n(aVar3);
            this.f13275o = null;
        }
        this.f13261a.clear();
        this.f13271k = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ByteBuffer mo43354b() {
        return this.f13261a.getData().asReadOnlyBuffer();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Bitmap mo43355c() {
        C9108a aVar = this.f13270j;
        if (aVar != null) {
            return aVar.mo43368j();
        }
        return this.f13273m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo43356d() {
        C9108a aVar = this.f13270j;
        if (aVar != null) {
            return aVar.f13280f;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Bitmap mo43357e() {
        return this.f13273m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo43358f() {
        return this.f13261a.mo29891c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo43359h() {
        return this.f13278r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo43360j() {
        return this.f13261a.mo29898h() + this.f13276p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo43361k() {
        return this.f13277q;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: m */
    public void mo43362m(C9108a aVar) {
        this.f13267g = false;
        if (this.f13271k) {
            this.f13262b.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f13266f) {
            this.f13275o = aVar;
        } else {
            if (aVar.mo43368j() != null) {
                m18516n();
                C9108a aVar2 = this.f13270j;
                this.f13270j = aVar;
                for (int size = this.f13263c.size() - 1; size >= 0; size--) {
                    this.f13263c.get(size).mo43329a();
                }
                if (aVar2 != null) {
                    this.f13262b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            m18515l();
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [d1.k, d1.k<android.graphics.Bitmap>, java.lang.Object] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo43363o(p058d1.C7226k<android.graphics.Bitmap> r3, android.graphics.Bitmap r4) {
        /*
            r2 = this;
            java.lang.Object r0 = p294z1.C10791j.m22948d(r3)
            d1.k r0 = (p058d1.C7226k) r0
            r2.f13274n = r0
            java.lang.Object r0 = p294z1.C10791j.m22948d(r4)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r2.f13273m = r0
            com.bumptech.glide.g<android.graphics.Bitmap> r0 = r2.f13269i
            v1.f r1 = new v1.f
            r1.<init>()
            v1.a r3 = r1.mo44451X(r3)
            com.bumptech.glide.g r3 = r0.mo31201a(r3)
            r2.f13269i = r3
            int r3 = p294z1.C10792k.m22956g(r4)
            r2.f13276p = r3
            int r3 = r4.getWidth()
            r2.f13277q = r3
            int r3 = r4.getHeight()
            r2.f13278r = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p197q1.C9107g.mo43363o(d1.k, android.graphics.Bitmap):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo43364r(C9109b bVar) {
        if (this.f13271k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        } else if (!this.f13263c.contains(bVar)) {
            boolean isEmpty = this.f13263c.isEmpty();
            this.f13263c.add(bVar);
            if (isEmpty) {
                m18517p();
            }
        } else {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo43365s(C9109b bVar) {
        this.f13263c.remove(bVar);
        if (this.f13263c.isEmpty()) {
            m18518q();
        }
    }

    C9107g(C7885d dVar, C4371h hVar, C3865a aVar, Handler handler, C4369g<Bitmap> gVar, C7226k<Bitmap> kVar, Bitmap bitmap) {
        this.f13263c = new ArrayList();
        this.f13264d = hVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new C9110c()) : handler;
        this.f13265e = dVar;
        this.f13262b = handler;
        this.f13269i = gVar;
        this.f13261a = aVar;
        mo43363o(kVar, bitmap);
    }
}
