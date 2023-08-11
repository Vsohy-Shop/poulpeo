package com.google.android.gms.internal.cast;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.mediarouter.media.MediaRouter;
import com.google.android.gms.cast.framework.media.C4648h;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;
import p109h4.C7939i;
import p120i4.C8125d;
import p120i4.C8158p;
import p120i4.C8164s;
import p150l4.C8675b;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.cast.f0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final class C4900f0 {

    /* renamed from: h */
    private static final C8675b f5209h = new C8675b("SessionTransController");

    /* renamed from: a */
    private final Set f5210a = Collections.synchronizedSet(new HashSet());

    /* renamed from: b */
    private final Handler f5211b = new C4968j0(Looper.getMainLooper());

    /* renamed from: c */
    private final Runnable f5212c = new C4847c0(this);

    /* renamed from: d */
    private int f5213d = 0;

    /* renamed from: e */
    private C8158p f5214e;
    @Nullable

    /* renamed from: f */
    private CallbackToFutureAdapter.Completer f5215f;
    @Nullable

    /* renamed from: g */
    private C7939i f5216g;

    /* renamed from: a */
    public static /* synthetic */ void m6958a(C4900f0 f0Var, C7939i iVar) {
        f0Var.f5216g = iVar;
        CallbackToFutureAdapter.Completer completer = f0Var.f5215f;
        if (completer != null) {
            completer.set(null);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m6959b(C4900f0 f0Var) {
        f5209h.mo42758e("transfer with type = %d has timed out", Integer.valueOf(f0Var.f5213d));
        f0Var.m6961i(101);
    }

    /* renamed from: h */
    private final void m6960h() {
        if (this.f5214e == null) {
            f5209h.mo42754a("skip detaching as sessionManager is null", new Object[0]);
            return;
        }
        f5209h.mo42754a("detach from CastSession", new Object[0]);
        C8125d c = this.f5214e.mo42057c();
        if (c != null) {
            c.mo42006y((C4900f0) null);
        }
    }

    /* renamed from: i */
    private final void m6961i(int i) {
        CallbackToFutureAdapter.Completer completer = this.f5215f;
        if (completer != null) {
            completer.setCancelled();
        }
        f5209h.mo42754a("notify failed transfer with type = %d, reason = %d", Integer.valueOf(this.f5213d), Integer.valueOf(i));
        for (C8164s a : new HashSet(this.f5210a)) {
            a.mo32890a(this.f5213d, i);
        }
        m6962j();
    }

    /* renamed from: j */
    private final void m6962j() {
        ((Handler) C9713p.m20275j(this.f5211b)).removeCallbacks((Runnable) C9713p.m20275j(this.f5212c));
        this.f5213d = 0;
        this.f5216g = null;
        m6960h();
    }

    /* renamed from: c */
    public final void mo32780c(C8158p pVar) {
        this.f5214e = pVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo32781d(Exception exc) {
        f5209h.mo42760g(exc, "Fail to store SessionState", new Object[0]);
        m6961i(100);
    }

    /* renamed from: e */
    public final void mo32782e() {
        if (this.f5213d != 0) {
            C7939i iVar = this.f5216g;
            if (iVar == null) {
                f5209h.mo42754a("No need to notify with null sessionState", new Object[0]);
            } else {
                f5209h.mo42754a("notify transferred with type = %d, sessionState = %s", 1, this.f5216g);
                for (C8164s b : new HashSet(this.f5210a)) {
                    b.mo32891b(this.f5213d, iVar);
                }
            }
            m6962j();
            return;
        }
        f5209h.mo42754a("No need to notify non remote-to-local transfer", new Object[0]);
    }

    /* renamed from: f */
    public final void mo32783f(MediaRouter.RouteInfo routeInfo, MediaRouter.RouteInfo routeInfo2, CallbackToFutureAdapter.Completer completer) {
        C8125d dVar;
        if (new HashSet(this.f5210a).isEmpty()) {
            f5209h.mo42754a("No need to prepare transfer without any callback", new Object[0]);
            completer.set(null);
        } else if (routeInfo.getPlaybackType() == 1 && routeInfo2.getPlaybackType() == 0) {
            if (this.f5214e == null) {
                f5209h.mo42754a("skip attaching as sessionManager is null", new Object[0]);
                dVar = null;
            } else {
                f5209h.mo42754a("attach to CastSession for transfer notification", new Object[0]);
                dVar = this.f5214e.mo42057c();
                if (dVar != null) {
                    dVar.mo42006y(this);
                }
            }
            if (dVar == null) {
                f5209h.mo42754a("No need to prepare transfer when there is no Cast session", new Object[0]);
                completer.set(null);
                return;
            }
            C4648h p = dVar.mo42005p();
            if (p == null || !p.mo32170j()) {
                f5209h.mo42754a("No need to prepare transfer when there is no media session", new Object[0]);
                m6960h();
                completer.set(null);
                return;
            }
            C8675b bVar = f5209h;
            bVar.mo42754a("Prepare route transfer for changing endpoint", new Object[0]);
            this.f5213d = 1;
            this.f5215f = completer;
            bVar.mo42754a("notify transferring with type = %d", 1);
            for (C8164s c : new HashSet(this.f5210a)) {
                c.mo32892c(this.f5213d);
            }
            this.f5216g = null;
            p.mo32153K((JSONObject) null).mo35456g(new C4865d0(this)).mo35454e(new C4883e0(this));
            ((Handler) C9713p.m20275j(this.f5211b)).postDelayed((Runnable) C9713p.m20275j(this.f5212c), 10000);
            C5066od.m7339d(C5009l7.CAST_TRANSFER_TO_LOCAL_USED);
        } else {
            f5209h.mo42754a("No need to prepare transfer for non cast-to-phone case", new Object[0]);
            completer.set(null);
        }
    }

    /* renamed from: g */
    public final void mo32784g(C8164s sVar) {
        f5209h.mo42754a("register callback = %s", sVar);
        C9713p.m20270e("Must be called from the main thread.");
        C9713p.m20275j(sVar);
        this.f5210a.add(sVar);
    }
}
