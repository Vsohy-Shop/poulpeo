package com.facebook;

import android.os.Handler;
import com.facebook.C4555l;
import kotlin.jvm.internal.C12775o;
import p251v2.C9925a;

/* renamed from: com.facebook.y */
/* compiled from: RequestProgress.kt */
public final class C4598y {

    /* renamed from: a */
    private final long f4371a = FacebookSdk.getOnProgressThreshold();

    /* renamed from: b */
    private long f4372b;

    /* renamed from: c */
    private long f4373c;

    /* renamed from: d */
    private long f4374d;

    /* renamed from: e */
    private final Handler f4375e;

    /* renamed from: f */
    private final C4555l f4376f;

    /* renamed from: com.facebook.y$a */
    /* compiled from: RequestProgress.kt */
    static final class C4599a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C4555l.C4557b f4377b;

        /* renamed from: c */
        final /* synthetic */ long f4378c;

        /* renamed from: d */
        final /* synthetic */ long f4379d;

        C4599a(C4555l.C4557b bVar, long j, long j2) {
            this.f4377b = bVar;
            this.f4378c = j;
            this.f4379d = j2;
        }

        public final void run() {
            if (!C9925a.m20734d(this)) {
                try {
                    if (!C9925a.m20734d(this)) {
                        ((C4555l.C4561e) this.f4377b).mo31652a(this.f4378c, this.f4379d);
                    }
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    public C4598y(Handler handler, C4555l lVar) {
        C12775o.m28639i(lVar, "request");
        this.f4375e = handler;
        this.f4376f = lVar;
    }

    /* renamed from: a */
    public final void mo31805a(long j) {
        long j2 = this.f4372b + j;
        this.f4372b = j2;
        if (j2 >= this.f4373c + this.f4371a || j2 >= this.f4374d) {
            mo31807c();
        }
    }

    /* renamed from: b */
    public final void mo31806b(long j) {
        this.f4374d += j;
    }

    /* renamed from: c */
    public final void mo31807c() {
        if (this.f4372b > this.f4373c) {
            C4555l.C4557b m = this.f4376f.mo31623m();
            long j = this.f4374d;
            if (j > 0 && (m instanceof C4555l.C4561e)) {
                long j2 = this.f4372b;
                Handler handler = this.f4375e;
                if (handler != null) {
                    handler.post(new C4599a(m, j2, j));
                } else {
                    ((C4555l.C4561e) m).mo31652a(j2, j);
                }
                this.f4373c = this.f4372b;
            }
        }
    }
}
