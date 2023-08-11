package p020a2;

import androidx.annotation.NonNull;

/* renamed from: a2.c */
/* compiled from: StateVerifier */
public abstract class C2134c {

    /* renamed from: a2.c$b */
    /* compiled from: StateVerifier */
    private static class C2136b extends C2134c {

        /* renamed from: a */
        private volatile boolean f817a;

        C2136b() {
            super();
        }

        /* renamed from: b */
        public void mo23272b(boolean z) {
            this.f817a = z;
        }

        /* renamed from: c */
        public void mo23273c() {
            if (this.f817a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    private C2134c() {
    }

    @NonNull
    /* renamed from: a */
    public static C2134c m1493a() {
        return new C2136b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo23272b(boolean z);

    /* renamed from: c */
    public abstract void mo23273c();
}
