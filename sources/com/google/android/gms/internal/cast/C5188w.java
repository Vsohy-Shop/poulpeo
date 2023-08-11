package com.google.android.gms.internal.cast;

import android.os.Handler;
import android.os.Looper;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.mediarouter.media.MediaRouter;
import com.google.common.util.concurrent.C6906d;
import p150l4.C8675b;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.cast.w */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final class C5188w implements MediaRouter.OnPrepareTransferListener {

    /* renamed from: c */
    private static final C8675b f5572c = new C8675b("MediaRouterOPTListener");

    /* renamed from: a */
    private final C4900f0 f5573a;

    /* renamed from: b */
    private final Handler f5574b = new C4968j0(Looper.getMainLooper());

    public C5188w(C4900f0 f0Var) {
        this.f5573a = (C4900f0) C9713p.m20275j(f0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Object mo33039a(MediaRouter.RouteInfo routeInfo, MediaRouter.RouteInfo routeInfo2, CallbackToFutureAdapter.Completer completer) {
        return Boolean.valueOf(this.f5574b.post(new C5154u(this, routeInfo, routeInfo2, completer)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo33040b(MediaRouter.RouteInfo routeInfo, MediaRouter.RouteInfo routeInfo2, CallbackToFutureAdapter.Completer completer) {
        this.f5573a.mo32783f(routeInfo, routeInfo2, completer);
    }

    public final C6906d onPrepareTransfer(MediaRouter.RouteInfo routeInfo, MediaRouter.RouteInfo routeInfo2) {
        f5572c.mo42754a("Prepare transfer from Route(%s) to Route(%s)", routeInfo, routeInfo2);
        return CallbackToFutureAdapter.getFuture(new C5171v(this, routeInfo, routeInfo2));
    }
}
