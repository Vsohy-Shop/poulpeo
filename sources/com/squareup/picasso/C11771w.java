package com.squareup.picasso;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import p452wd.C13694a;
import p452wd.C13696c;

/* renamed from: com.squareup.picasso.w */
/* compiled from: Stats */
class C11771w {

    /* renamed from: a */
    final HandlerThread f18391a;

    /* renamed from: b */
    final C13694a f18392b;

    /* renamed from: c */
    final Handler f18393c;

    /* renamed from: d */
    long f18394d;

    /* renamed from: e */
    long f18395e;

    /* renamed from: f */
    long f18396f;

    /* renamed from: g */
    long f18397g;

    /* renamed from: h */
    long f18398h;

    /* renamed from: i */
    long f18399i;

    /* renamed from: j */
    long f18400j;

    /* renamed from: k */
    long f18401k;

    /* renamed from: l */
    int f18402l;

    /* renamed from: m */
    int f18403m;

    /* renamed from: n */
    int f18404n;

    /* renamed from: com.squareup.picasso.w$a */
    /* compiled from: Stats */
    private static class C11772a extends Handler {

        /* renamed from: a */
        private final C11771w f18405a;

        /* renamed from: com.squareup.picasso.w$a$a */
        /* compiled from: Stats */
        class C11773a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ Message f18406b;

            C11773a(Message message) {
                this.f18406b = message;
            }

            public void run() {
                throw new AssertionError("Unhandled stats message." + this.f18406b.what);
            }
        }

        C11772a(Looper looper, C11771w wVar) {
            super(looper);
            this.f18405a = wVar;
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                this.f18405a.mo48790j();
            } else if (i == 1) {
                this.f18405a.mo48791k();
            } else if (i == 2) {
                this.f18405a.mo48788h((long) message.arg1);
            } else if (i == 3) {
                this.f18405a.mo48789i((long) message.arg1);
            } else if (i != 4) {
                C11751p.f18287o.post(new C11773a(message));
            } else {
                this.f18405a.mo48792l((Long) message.obj);
            }
        }
    }

    C11771w(C13694a aVar) {
        this.f18392b = aVar;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        this.f18391a = handlerThread;
        handlerThread.start();
        C11774x.m25302h(handlerThread.getLooper());
        this.f18393c = new C11772a(handlerThread.getLooper(), this);
    }

    /* renamed from: g */
    private static long m25282g(int i, long j) {
        return j / ((long) i);
    }

    /* renamed from: m */
    private void m25283m(Bitmap bitmap, int i) {
        int i2 = C11774x.m25303i(bitmap);
        Handler handler = this.f18393c;
        handler.sendMessage(handler.obtainMessage(i, i2, 0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C13696c mo48782a() {
        return new C13696c(this.f18392b.mo48714a(), this.f18392b.size(), this.f18394d, this.f18395e, this.f18396f, this.f18397g, this.f18398h, this.f18399i, this.f18400j, this.f18401k, this.f18402l, this.f18403m, this.f18404n, System.currentTimeMillis());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo48783b(Bitmap bitmap) {
        m25283m(bitmap, 2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo48784c(Bitmap bitmap) {
        m25283m(bitmap, 3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo48785d() {
        this.f18393c.sendEmptyMessage(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo48786e() {
        this.f18393c.sendEmptyMessage(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo48787f(long j) {
        Handler handler = this.f18393c;
        handler.sendMessage(handler.obtainMessage(4, Long.valueOf(j)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo48788h(long j) {
        int i = this.f18403m + 1;
        this.f18403m = i;
        long j2 = this.f18397g + j;
        this.f18397g = j2;
        this.f18400j = m25282g(i, j2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo48789i(long j) {
        this.f18404n++;
        long j2 = this.f18398h + j;
        this.f18398h = j2;
        this.f18401k = m25282g(this.f18403m, j2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo48790j() {
        this.f18394d++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo48791k() {
        this.f18395e++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo48792l(Long l) {
        this.f18402l++;
        long longValue = this.f18396f + l.longValue();
        this.f18396f = longValue;
        this.f18399i = m25282g(this.f18402l, longValue);
    }
}
