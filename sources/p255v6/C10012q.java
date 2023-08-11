package p255v6;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import p050c7.C3894e;
import p222s6.C9502a;
import p222s6.C9511f;

/* renamed from: v6.q */
/* compiled from: CrashlyticsUncaughtExceptionHandler */
class C10012q implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final C10013a f15060a;

    /* renamed from: b */
    private final C3894e f15061b;

    /* renamed from: c */
    private final Thread.UncaughtExceptionHandler f15062c;

    /* renamed from: d */
    private final C9502a f15063d;

    /* renamed from: e */
    private final AtomicBoolean f15064e = new AtomicBoolean(false);

    /* renamed from: v6.q$a */
    /* compiled from: CrashlyticsUncaughtExceptionHandler */
    interface C10013a {
        /* renamed from: a */
        void mo44545a(C3894e eVar, Thread thread, Throwable th);
    }

    public C10012q(C10013a aVar, C3894e eVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C9502a aVar2) {
        this.f15060a = aVar;
        this.f15061b = eVar;
        this.f15062c = uncaughtExceptionHandler;
        this.f15063d = aVar2;
    }

    /* renamed from: b */
    private boolean m20991b(Thread thread, Throwable th) {
        if (thread == null) {
            C9511f.m19696f().mo43967d("Crashlytics will not record uncaught exception; null thread");
            return false;
        } else if (th == null) {
            C9511f.m19696f().mo43967d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        } else if (!this.f15063d.mo43954b()) {
            return true;
        } else {
            C9511f.m19696f().mo43965b("Crashlytics will not record uncaught exception; native crash exists for session.");
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo44593a() {
        return this.f15064e.get();
    }

    public void uncaughtException(Thread thread, Throwable th) {
        this.f15064e.set(true);
        try {
            if (m20991b(thread, th)) {
                this.f15060a.mo44545a(this.f15061b, thread, th);
            } else {
                C9511f.m19696f().mo43965b("Uncaught exception will not be recorded by Crashlytics.");
            }
        } catch (Exception e) {
            C9511f.m19696f().mo43968e("An error occurred in the uncaught exception handler", e);
        } catch (Throwable th2) {
            C9511f.m19696f().mo43965b("Completed exception processing. Invoking default exception handler.");
            this.f15062c.uncaughtException(thread, th);
            this.f15064e.set(false);
            throw th2;
        }
        C9511f.m19696f().mo43965b("Completed exception processing. Invoking default exception handler.");
        this.f15062c.uncaughtException(thread, th);
        this.f15064e.set(false);
    }
}
