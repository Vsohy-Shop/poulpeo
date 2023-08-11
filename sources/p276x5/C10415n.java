package p276x5;

import androidx.annotation.NonNull;
import java.util.concurrent.ExecutionException;

/* renamed from: x5.n */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
final class C10415n implements C10414m {

    /* renamed from: a */
    private final Object f15700a = new Object();

    /* renamed from: b */
    private final int f15701b;

    /* renamed from: c */
    private final C10407g0<Void> f15702c;

    /* renamed from: d */
    private int f15703d;

    /* renamed from: e */
    private int f15704e;

    /* renamed from: f */
    private int f15705f;

    /* renamed from: g */
    private Exception f15706g;

    /* renamed from: h */
    private boolean f15707h;

    public C10415n(int i, C10407g0<Void> g0Var) {
        this.f15701b = i;
        this.f15702c = g0Var;
    }

    /* renamed from: c */
    private final void m21843c() {
        if (this.f15703d + this.f15704e + this.f15705f != this.f15701b) {
            return;
        }
        if (this.f15706g != null) {
            C10407g0<Void> g0Var = this.f15702c;
            int i = this.f15704e;
            int i2 = this.f15701b;
            StringBuilder sb = new StringBuilder(54);
            sb.append(i);
            sb.append(" out of ");
            sb.append(i2);
            sb.append(" underlying tasks failed");
            g0Var.mo45101s(new ExecutionException(sb.toString(), this.f15706g));
        } else if (this.f15707h) {
            this.f15702c.mo45103u();
        } else {
            this.f15702c.mo45102t(null);
        }
    }

    /* renamed from: a */
    public final void mo29368a(Object obj) {
        synchronized (this.f15700a) {
            this.f15703d++;
            m21843c();
        }
    }

    /* renamed from: b */
    public final void mo29406b(@NonNull Exception exc) {
        synchronized (this.f15700a) {
            this.f15704e++;
            this.f15706g = exc;
            m21843c();
        }
    }

    public final void onCanceled() {
        synchronized (this.f15700a) {
            this.f15705f++;
            this.f15707h = true;
            m21843c();
        }
    }
}
