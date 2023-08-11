package p222s6;

import android.util.Log;

/* renamed from: s6.f */
/* compiled from: Logger */
public class C9511f {

    /* renamed from: c */
    static final C9511f f14183c = new C9511f("FirebaseCrashlytics");

    /* renamed from: a */
    private final String f14184a;

    /* renamed from: b */
    private int f14185b = 4;

    public C9511f(String str) {
        this.f14184a = str;
    }

    /* renamed from: a */
    private boolean m19695a(int i) {
        if (this.f14185b <= i || Log.isLoggable(this.f14184a, i)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static C9511f m19696f() {
        return f14183c;
    }

    /* renamed from: b */
    public void mo43965b(String str) {
        mo43966c(str, (Throwable) null);
    }

    /* renamed from: c */
    public void mo43966c(String str, Throwable th) {
        if (m19695a(3)) {
            Log.d(this.f14184a, str, th);
        }
    }

    /* renamed from: d */
    public void mo43967d(String str) {
        mo43968e(str, (Throwable) null);
    }

    /* renamed from: e */
    public void mo43968e(String str, Throwable th) {
        if (m19695a(6)) {
            Log.e(this.f14184a, str, th);
        }
    }

    /* renamed from: g */
    public void mo43969g(String str) {
        mo43970h(str, (Throwable) null);
    }

    /* renamed from: h */
    public void mo43970h(String str, Throwable th) {
        if (m19695a(4)) {
            Log.i(this.f14184a, str, th);
        }
    }

    /* renamed from: i */
    public void mo43971i(String str) {
        mo43972j(str, (Throwable) null);
    }

    /* renamed from: j */
    public void mo43972j(String str, Throwable th) {
        if (m19695a(2)) {
            Log.v(this.f14184a, str, th);
        }
    }

    /* renamed from: k */
    public void mo43973k(String str) {
        mo43974l(str, (Throwable) null);
    }

    /* renamed from: l */
    public void mo43974l(String str, Throwable th) {
        if (m19695a(5)) {
            Log.w(this.f14184a, str, th);
        }
    }
}
