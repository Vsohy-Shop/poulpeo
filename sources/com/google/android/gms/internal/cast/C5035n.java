package com.google.android.gms.internal.cast;

import android.os.RemoteException;
import android.text.TextUtils;
import androidx.mediarouter.media.MediaRouter;
import com.google.android.gms.cast.CastDevice;
import java.util.Iterator;
import p150l4.C8675b;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.cast.n */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final class C5035n extends MediaRouter.Callback {

    /* renamed from: b */
    private static final C8675b f5383b = new C8675b("MediaRouterCallback");

    /* renamed from: a */
    private final C5018m f5384a;

    public C5035n(C5018m mVar) {
        this.f5384a = (C5018m) C9713p.m20275j(mVar);
    }

    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        try {
            this.f5384a.mo32864o1(routeInfo.getId(), routeInfo.getExtras());
        } catch (RemoteException e) {
            f5383b.mo42755b(e, "Unable to call %s on %s.", "onRouteAdded", C5018m.class.getSimpleName());
        }
    }

    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        try {
            this.f5384a.mo32861X0(routeInfo.getId(), routeInfo.getExtras());
        } catch (RemoteException e) {
            f5383b.mo42755b(e, "Unable to call %s on %s.", "onRouteChanged", C5018m.class.getSimpleName());
        }
    }

    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        try {
            this.f5384a.mo32865t0(routeInfo.getId(), routeInfo.getExtras());
        } catch (RemoteException e) {
            f5383b.mo42755b(e, "Unable to call %s on %s.", "onRouteRemoved", C5018m.class.getSimpleName());
        }
    }

    public final void onRouteSelected(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, int i) {
        CastDevice H;
        f5383b.mo42758e("onRouteSelected with reason = %d, routeId = %s", Integer.valueOf(i), routeInfo.getId());
        if (routeInfo.getPlaybackType() == 1) {
            try {
                String id = routeInfo.getId();
                String id2 = routeInfo.getId();
                if (id2 != null) {
                    if (id2.endsWith("-groupRoute")) {
                        CastDevice H2 = CastDevice.m5962H(routeInfo.getExtras());
                        if (H2 != null) {
                            String A = H2.mo31896A();
                            Iterator<MediaRouter.RouteInfo> it = mediaRouter.getRoutes().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    MediaRouter.RouteInfo next = it.next();
                                    String id3 = next.getId();
                                    if (id3 != null && !id3.endsWith("-groupRoute") && (H = CastDevice.m5962H(next.getExtras())) != null && TextUtils.equals(H.mo31896A(), A)) {
                                        f5383b.mo42754a("routeId is changed from %s to %s", id2, next.getId());
                                        id2 = next.getId();
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                }
                if (this.f5384a.mo32863e() >= 220400000) {
                    this.f5384a.mo32860L0(id2, id, routeInfo.getExtras());
                } else {
                    this.f5384a.mo32859L(id2, routeInfo.getExtras());
                }
            } catch (RemoteException e) {
                f5383b.mo42755b(e, "Unable to call %s on %s.", "onRouteSelected", C5018m.class.getSimpleName());
            }
        }
    }

    public final void onRouteUnselected(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, int i) {
        C8675b bVar = f5383b;
        bVar.mo42758e("onRouteUnselected with reason = %d, routeId = %s", Integer.valueOf(i), routeInfo.getId());
        if (routeInfo.getPlaybackType() != 1) {
            bVar.mo42754a("skip route unselection for non-cast route", new Object[0]);
            return;
        }
        try {
            this.f5384a.mo32862Z2(routeInfo.getId(), routeInfo.getExtras(), i);
        } catch (RemoteException e) {
            f5383b.mo42755b(e, "Unable to call %s on %s.", "onRouteUnselected", C5018m.class.getSimpleName());
        }
    }
}
