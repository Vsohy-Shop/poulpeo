package p200q4;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.BinderThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4719a;
import com.google.android.gms.common.api.C4733c;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import p221s5.C9495a;
import p221s5.C9499e;
import p221s5.C9500f;
import p231t4.C9673d;
import p231t4.C9713p;
import p231t4.C9714p0;
import p232t5.C9747d;
import p232t5.C9755l;

/* renamed from: q4.e0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C9225e0 extends C9747d implements C4733c.C4734a, C4733c.C4735b {

    /* renamed from: h */
    private static final C4719a.C4720a<? extends C9500f, C9495a> f13547h = C9499e.f14164c;

    /* renamed from: a */
    private final Context f13548a;

    /* renamed from: b */
    private final Handler f13549b;

    /* renamed from: c */
    private final C4719a.C4720a<? extends C9500f, C9495a> f13550c;

    /* renamed from: d */
    private final Set<Scope> f13551d;

    /* renamed from: e */
    private final C9673d f13552e;

    /* renamed from: f */
    private C9500f f13553f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C9223d0 f13554g;

    @WorkerThread
    public C9225e0(Context context, Handler handler, @NonNull C9673d dVar) {
        C4719a.C4720a<? extends C9500f, C9495a> aVar = f13547h;
        this.f13548a = context;
        this.f13549b = handler;
        this.f13552e = (C9673d) C9713p.m20276k(dVar, "ClientSettings must not be null");
        this.f13551d = dVar.mo44165g();
        this.f13550c = aVar;
    }

    /* renamed from: d3 */
    static /* bridge */ /* synthetic */ void m18933d3(C9225e0 e0Var, C9755l lVar) {
        ConnectionResult A = lVar.mo44280A();
        if (A.mo32338I()) {
            C9714p0 p0Var = (C9714p0) C9713p.m20275j(lVar.mo44281F());
            ConnectionResult A2 = p0Var.mo44234A();
            if (!A2.mo32338I()) {
                String valueOf = String.valueOf(A2);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                e0Var.f13554g.mo32573c(A2);
                e0Var.f13553f.mo32396c();
                return;
            }
            e0Var.f13554g.mo32572b(p0Var.mo44235F(), e0Var.f13551d);
        } else {
            e0Var.f13554g.mo32573c(A);
        }
        e0Var.f13553f.mo32396c();
    }

    @WorkerThread
    /* renamed from: E */
    public final void mo32550E(int i) {
        this.f13553f.mo32396c();
    }

    @WorkerThread
    /* renamed from: G */
    public final void mo32552G(@NonNull ConnectionResult connectionResult) {
        this.f13554g.mo32573c(connectionResult);
    }

    @WorkerThread
    /* renamed from: J */
    public final void mo32555J(@Nullable Bundle bundle) {
        this.f13553f.mo43951f(this);
    }

    @BinderThread
    /* renamed from: b0 */
    public final void mo43515b0(C9755l lVar) {
        this.f13549b.post(new C9221c0(this, lVar));
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.google.android.gms.common.api.a$f, s5.f] */
    @WorkerThread
    /* renamed from: e3 */
    public final void mo43516e3(C9223d0 d0Var) {
        C9500f fVar = this.f13553f;
        if (fVar != null) {
            fVar.mo32396c();
        }
        this.f13552e.mo44169k(Integer.valueOf(System.identityHashCode(this)));
        C4719a.C4720a aVar = this.f13550c;
        Context context = this.f13548a;
        Looper looper = this.f13549b.getLooper();
        C9673d dVar = this.f13552e;
        this.f13553f = aVar.mo28416a(context, looper, dVar, dVar.mo44166h(), this, this);
        this.f13554g = d0Var;
        Set<Scope> set = this.f13551d;
        if (set == null || set.isEmpty()) {
            this.f13549b.post(new C9219b0(this));
        } else {
            this.f13553f.mo43952p();
        }
    }

    /* renamed from: f3 */
    public final void mo43517f3() {
        C9500f fVar = this.f13553f;
        if (fVar != null) {
            fVar.mo32396c();
        }
    }
}
