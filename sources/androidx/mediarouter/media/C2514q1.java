package androidx.mediarouter.media;

import androidx.mediarouter.media.MediaRouteProvider;
import androidx.mediarouter.media.RegisteredMediaRouteProvider;

/* renamed from: androidx.mediarouter.media.q1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2514q1 implements RegisteredMediaRouteProvider.ControllerCallback {

    /* renamed from: a */
    public final /* synthetic */ RegisteredMediaRouteProviderWatcher f1061a;

    /* renamed from: b */
    public final /* synthetic */ RegisteredMediaRouteProvider f1062b;

    public /* synthetic */ C2514q1(RegisteredMediaRouteProviderWatcher registeredMediaRouteProviderWatcher, RegisteredMediaRouteProvider registeredMediaRouteProvider) {
        this.f1061a = registeredMediaRouteProviderWatcher;
        this.f1062b = registeredMediaRouteProvider;
    }

    public final void onControllerReleasedByProvider(MediaRouteProvider.RouteController routeController) {
        this.f1061a.lambda$scanPackages$0(this.f1062b, routeController);
    }
}
