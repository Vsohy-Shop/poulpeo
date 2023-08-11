package androidx.mediarouter.media;

import androidx.mediarouter.media.MediaRouteProviderService;

/* renamed from: androidx.mediarouter.media.t0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2520t0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ MediaRouteProviderService.MediaRouteProviderServiceImplApi30.ClientRecord f1064b;

    /* renamed from: c */
    public final /* synthetic */ String f1065c;

    public /* synthetic */ C2520t0(MediaRouteProviderService.MediaRouteProviderServiceImplApi30.ClientRecord clientRecord, String str) {
        this.f1064b = clientRecord;
        this.f1065c = str;
    }

    public final void run() {
        this.f1064b.lambda$disableRouteForReleasedRouteController$0(this.f1065c);
    }
}
