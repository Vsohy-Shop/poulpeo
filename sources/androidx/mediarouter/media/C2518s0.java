package androidx.mediarouter.media;

import androidx.mediarouter.media.MediaRouteProvider;
import androidx.mediarouter.media.MediaRouteProviderService;
import java.util.Collection;

/* renamed from: androidx.mediarouter.media.s0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2518s0 implements MediaRouteProvider.DynamicGroupRouteController.OnDynamicRoutesChangedListener {

    /* renamed from: a */
    public final /* synthetic */ MediaRouteProviderService.MediaRouteProviderServiceImplApi30 f1063a;

    public /* synthetic */ C2518s0(MediaRouteProviderService.MediaRouteProviderServiceImplApi30 mediaRouteProviderServiceImplApi30) {
        this.f1063a = mediaRouteProviderServiceImplApi30;
    }

    public final void onRoutesChanged(MediaRouteProvider.DynamicGroupRouteController dynamicGroupRouteController, MediaRouteDescriptor mediaRouteDescriptor, Collection collection) {
        this.f1063a.lambda$new$0(dynamicGroupRouteController, mediaRouteDescriptor, collection);
    }
}
