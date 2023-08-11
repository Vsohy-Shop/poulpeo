package com.google.android.gms.cast.framework.media;

/* renamed from: com.google.android.gms.cast.framework.media.n0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final /* synthetic */ class C4666n0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ MediaNotificationService f4747b;

    /* renamed from: c */
    public final /* synthetic */ int f4748c;

    public /* synthetic */ C4666n0(MediaNotificationService mediaNotificationService, int i) {
        this.f4747b = mediaNotificationService;
        this.f4748c = i;
    }

    public final void run() {
        this.f4747b.stopSelf(this.f4748c);
    }
}
