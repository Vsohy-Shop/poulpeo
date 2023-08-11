package com.google.android.gms.internal.cast;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.mediarouter.media.MediaRouter;

/* renamed from: com.google.android.gms.internal.cast.u */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final /* synthetic */ class C5154u implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C5188w f5548b;

    /* renamed from: c */
    public final /* synthetic */ MediaRouter.RouteInfo f5549c;

    /* renamed from: d */
    public final /* synthetic */ MediaRouter.RouteInfo f5550d;

    /* renamed from: e */
    public final /* synthetic */ CallbackToFutureAdapter.Completer f5551e;

    public /* synthetic */ C5154u(C5188w wVar, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteInfo routeInfo2, CallbackToFutureAdapter.Completer completer) {
        this.f5548b = wVar;
        this.f5549c = routeInfo;
        this.f5550d = routeInfo2;
        this.f5551e = completer;
    }

    public final void run() {
        this.f5548b.mo33040b(this.f5549c, this.f5550d, this.f5551e);
    }
}
