package com.rmn.iosadapters.android.p323os;

import android.os.Handler;
import android.os.Looper;
import p382lc.C12820b;
import p382lc.C12821c;
import p382lc.C12822d;

/* renamed from: com.rmn.iosadapters.android.os.AndroidOsHandler */
public class AndroidOsHandler {

    /* renamed from: a */
    private Handler f18090a;

    public AndroidOsHandler() {
        this(false);
    }

    /* renamed from: c */
    public final boolean mo47870c(int i) {
        return this.f18090a.hasMessages(i);
    }

    /* renamed from: d */
    public void mo47871d(C12822d dVar, boolean z) {
        if (dVar == null) {
            if (z) {
                this.f18090a = new Handler(Looper.getMainLooper());
            } else {
                this.f18090a = new Handler();
            }
        } else if (z) {
            this.f18090a = new Handler(Looper.getMainLooper(), new C12820b(dVar));
        } else {
            this.f18090a = new Handler(new C12821c(dVar));
        }
    }

    /* renamed from: g */
    public final boolean mo47872g(Runnable runnable) {
        return this.f18090a.post(runnable);
    }

    /* renamed from: h */
    public final boolean mo47873h(Runnable runnable, long j) {
        return this.f18090a.postDelayed(runnable, j);
    }

    /* renamed from: i */
    public final void mo47874i(int i) {
        this.f18090a.removeMessages(i);
    }

    /* renamed from: j */
    public final boolean mo47875j(int i, long j) {
        return this.f18090a.sendEmptyMessageDelayed(i, j);
    }

    public AndroidOsHandler(boolean z) {
        mo47871d((C12822d) null, z);
    }

    public AndroidOsHandler(C12822d dVar) {
        this(dVar, false);
    }

    public AndroidOsHandler(C12822d dVar, boolean z) {
        mo47871d(dVar, z);
    }
}
