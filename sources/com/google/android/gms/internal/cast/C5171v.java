package com.google.android.gms.internal.cast;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.mediarouter.media.MediaRouter;

/* renamed from: com.google.android.gms.internal.cast.v */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final /* synthetic */ class C5171v implements CallbackToFutureAdapter.Resolver {

    /* renamed from: a */
    public final /* synthetic */ C5188w f5557a;

    /* renamed from: b */
    public final /* synthetic */ MediaRouter.RouteInfo f5558b;

    /* renamed from: c */
    public final /* synthetic */ MediaRouter.RouteInfo f5559c;

    public /* synthetic */ C5171v(C5188w wVar, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteInfo routeInfo2) {
        this.f5557a = wVar;
        this.f5558b = routeInfo;
        this.f5559c = routeInfo2;
    }

    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return this.f5557a.mo33039a(this.f5558b, this.f5559c, completer);
    }
}
