package p343fg;

import p466yf.C14015p0;

/* renamed from: fg.k */
/* compiled from: Tasks.kt */
public final class C12001k extends C11998h {

    /* renamed from: d */
    public final Runnable f18753d;

    public C12001k(Runnable runnable, long j, C11999i iVar) {
        super(j, iVar);
        this.f18753d = runnable;
    }

    public void run() {
        try {
            this.f18753d.run();
        } finally {
            this.f18751c.mo49428a();
        }
    }

    public String toString() {
        return "Task[" + C14015p0.m32518a(this.f18753d) + '@' + C14015p0.m32519b(this.f18753d) + ", " + this.f18750b + ", " + this.f18751c + ']';
    }
}
