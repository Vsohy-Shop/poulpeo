package p037b6;

import androidx.annotation.Nullable;
import p099g6.C7790l;

/* renamed from: b6.f */
public abstract class C2902f implements Runnable {
    @Nullable

    /* renamed from: b */
    private final C7790l<?> f1304b;

    C2902f() {
        this.f1304b = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo28426a();

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: b */
    public final C7790l<?> mo28427b() {
        return this.f1304b;
    }

    public final void run() {
        try {
            mo28426a();
        } catch (Exception e) {
            C7790l<?> lVar = this.f1304b;
            if (lVar != null) {
                lVar.mo41437d(e);
            }
        }
    }

    public C2902f(@Nullable C7790l<?> lVar) {
        this.f1304b = lVar;
    }
}
