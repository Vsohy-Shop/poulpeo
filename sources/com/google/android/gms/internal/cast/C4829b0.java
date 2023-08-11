package com.google.android.gms.internal.cast;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.support.p001v4.media.session.MediaSessionCompat;
import androidx.annotation.Nullable;
import androidx.mediarouter.media.MediaRouteSelector;
import androidx.mediarouter.media.MediaRouter;
import androidx.mediarouter.media.MediaTransferReceiver;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p120i4.C8119b;
import p150l4.C8675b;
import p150l4.C8686g0;

/* renamed from: com.google.android.gms.internal.cast.b0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final class C4829b0 extends C4967j {

    /* renamed from: f */
    private static final C8675b f5145f = new C8675b("MediaRouterProxy");

    /* renamed from: a */
    private final MediaRouter f5146a;

    /* renamed from: b */
    private final C8119b f5147b;

    /* renamed from: c */
    private final Map f5148c = new HashMap();
    @Nullable

    /* renamed from: d */
    private C4900f0 f5149d;

    /* renamed from: e */
    private boolean f5150e;

    public C4829b0(Context context, MediaRouter mediaRouter, C8119b bVar, C8686g0 g0Var) {
        this.f5146a = mediaRouter;
        this.f5147b = bVar;
        if (Build.VERSION.SDK_INT <= 32) {
            f5145f.mo42758e("Don't need to set MediaRouterParams for Android S v2 or below", new Object[0]);
            return;
        }
        f5145f.mo42758e("Set up MediaRouterParams based on module flag and CastOptions for Android T or above", new Object[0]);
        this.f5149d = new C4900f0();
        Intent intent = new Intent(context, MediaTransferReceiver.class);
        intent.setPackage(context.getPackageName());
        boolean z = !context.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty();
        this.f5150e = z;
        if (z) {
            C5066od.m7339d(C5009l7.CAST_OUTPUT_SWITCHER_ENABLED);
        }
        g0Var.mo42783B(new String[]{"com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED"}).mo35452c(new C5239z(this, bVar));
    }

    /* renamed from: f3 */
    private final void m6794f3(@Nullable MediaRouteSelector mediaRouteSelector, int i) {
        Set<MediaRouter.Callback> set = (Set) this.f5148c.get(mediaRouteSelector);
        if (set != null) {
            for (MediaRouter.Callback addCallback : set) {
                this.f5146a.addCallback(mediaRouteSelector, addCallback, i);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g3 */
    public final void mo32629c3(@Nullable MediaRouteSelector mediaRouteSelector) {
        Set<MediaRouter.Callback> set = (Set) this.f5148c.get(mediaRouteSelector);
        if (set != null) {
            for (MediaRouter.Callback removeCallback : set) {
                this.f5146a.removeCallback(removeCallback);
            }
        }
    }

    /* renamed from: A */
    public final boolean mo32619A() {
        MediaRouter.RouteInfo bluetoothRoute = this.f5146a.getBluetoothRoute();
        if (bluetoothRoute == null || !this.f5146a.getSelectedRoute().getId().equals(bluetoothRoute.getId())) {
            return false;
        }
        return true;
    }

    @Nullable
    /* renamed from: B */
    public final Bundle mo32620B(String str) {
        for (MediaRouter.RouteInfo next : this.f5146a.getRoutes()) {
            if (next.getId().equals(str)) {
                return next.getExtras();
            }
        }
        return null;
    }

    /* renamed from: C */
    public final void mo32621C(int i) {
        this.f5146a.unselect(i);
    }

    /* renamed from: D */
    public final void mo32622D(@Nullable Bundle bundle) {
        MediaRouteSelector fromBundle = MediaRouteSelector.fromBundle(bundle);
        if (fromBundle != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo32629c3(fromBundle);
            } else {
                new C4968j0(Looper.getMainLooper()).post(new C4811a0(this, fromBundle));
            }
        }
    }

    @Nullable
    /* renamed from: G */
    public final C4900f0 mo32623G() {
        return this.f5149d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final /* synthetic */ void mo32624J(MediaRouteSelector mediaRouteSelector, int i) {
        synchronized (this.f5148c) {
            m6794f3(mediaRouteSelector, i);
        }
    }

    /* renamed from: R0 */
    public final boolean mo32625R0(@Nullable Bundle bundle, int i) {
        MediaRouteSelector fromBundle = MediaRouteSelector.fromBundle(bundle);
        if (fromBundle == null) {
            return false;
        }
        return this.f5146a.isRouteAvailable(fromBundle, i);
    }

    /* renamed from: S2 */
    public final void mo32626S2(String str) {
        f5145f.mo42754a("select route with routeId = %s", str);
        for (MediaRouter.RouteInfo next : this.f5146a.getRoutes()) {
            if (next.getId().equals(str)) {
                f5145f.mo42754a("media route is found and selected", new Object[0]);
                this.f5146a.selectRoute(next);
                return;
            }
        }
    }

    /* renamed from: Z */
    public final void mo32627Z(@Nullable Bundle bundle, C5018m mVar) {
        MediaRouteSelector fromBundle = MediaRouteSelector.fromBundle(bundle);
        if (fromBundle != null) {
            if (!this.f5148c.containsKey(fromBundle)) {
                this.f5148c.put(fromBundle, new HashSet());
            }
            ((Set) this.f5148c.get(fromBundle)).add(new C5035n(mVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: b3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo32628b3(p120i4.C8119b r8, com.google.android.gms.tasks.Task r9) {
        /*
            r7 = this;
            boolean r0 = r9.mo35465p()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0034
            java.lang.Object r9 = r9.mo35461l()
            android.os.Bundle r9 = (android.os.Bundle) r9
            java.lang.String r0 = "com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED"
            if (r9 == 0) goto L_0x001a
            boolean r3 = r9.containsKey(r0)
            if (r3 == 0) goto L_0x001a
            r3 = r2
            goto L_0x001b
        L_0x001a:
            r3 = r1
        L_0x001b:
            l4.b r4 = f5145f
            java.lang.Object[] r5 = new java.lang.Object[r2]
            if (r2 == r3) goto L_0x0024
            java.lang.String r6 = "not existed"
            goto L_0x0026
        L_0x0024:
            java.lang.String r6 = "existed"
        L_0x0026:
            r5[r1] = r6
            java.lang.String r6 = "The module-to-client output switcher flag %s"
            r4.mo42754a(r6, r5)
            if (r3 == 0) goto L_0x0034
            boolean r9 = r9.getBoolean(r0)
            goto L_0x0035
        L_0x0034:
            r9 = r2
        L_0x0035:
            l4.b r0 = f5145f
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r9)
            r4[r1] = r5
            boolean r5 = r8.mo41994P()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r4[r2] = r5
            java.lang.String r5 = "Set up output switcher flags: %b (from module), %b (from CastOptions)"
            r0.mo42754a(r5, r4)
            if (r9 == 0) goto L_0x0059
            boolean r8 = r8.mo41994P()
            if (r8 == 0) goto L_0x0059
            r8 = r2
            goto L_0x005a
        L_0x0059:
            r8 = r1
        L_0x005a:
            androidx.mediarouter.media.MediaRouter r9 = r7.f5146a
            if (r9 == 0) goto L_0x00bf
            i4.b r4 = r7.f5147b
            if (r4 != 0) goto L_0x0063
            goto L_0x00bf
        L_0x0063:
            boolean r5 = r4.mo41993O()
            boolean r4 = r4.mo41992N()
            androidx.mediarouter.media.MediaRouterParams$Builder r6 = new androidx.mediarouter.media.MediaRouterParams$Builder
            r6.<init>()
            androidx.mediarouter.media.MediaRouterParams$Builder r6 = r6.setMediaTransferReceiverEnabled(r8)
            androidx.mediarouter.media.MediaRouterParams$Builder r6 = r6.setTransferToLocalEnabled(r5)
            androidx.mediarouter.media.MediaRouterParams$Builder r6 = r6.setOutputSwitcherEnabled(r4)
            androidx.mediarouter.media.MediaRouterParams r6 = r6.build()
            r9.setRouterParams(r6)
            r9 = 4
            java.lang.Object[] r9 = new java.lang.Object[r9]
            boolean r6 = r7.f5150e
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r9[r1] = r6
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r9[r2] = r8
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r5)
            r9[r3] = r8
            r8 = 3
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            r9[r8] = r1
            java.lang.String r8 = "media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b"
            r0.mo42758e(r8, r9)
            if (r5 == 0) goto L_0x00bf
            androidx.mediarouter.media.MediaRouter r8 = r7.f5146a
            com.google.android.gms.internal.cast.w r9 = new com.google.android.gms.internal.cast.w
            com.google.android.gms.internal.cast.f0 r0 = r7.f5149d
            java.lang.Object r0 = p231t4.C9713p.m20275j(r0)
            com.google.android.gms.internal.cast.f0 r0 = (com.google.android.gms.internal.cast.C4900f0) r0
            r9.<init>(r0)
            r8.setOnPrepareTransferListener(r9)
            com.google.android.gms.internal.cast.l7 r8 = com.google.android.gms.internal.cast.C5009l7.CAST_TRANSFER_TO_LOCAL_ENABLED
            com.google.android.gms.internal.cast.C5066od.m7339d(r8)
        L_0x00bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.C4829b0.mo32628b3(i4.b, com.google.android.gms.tasks.Task):void");
    }

    /* renamed from: d3 */
    public final void mo32630d3(@Nullable MediaSessionCompat mediaSessionCompat) {
        this.f5146a.setMediaSessionCompat(mediaSessionCompat);
    }

    /* renamed from: e3 */
    public final boolean mo32631e3() {
        return this.f5150e;
    }

    /* renamed from: f */
    public final void mo32632f() {
        for (Set<MediaRouter.Callback> it : this.f5148c.values()) {
            for (MediaRouter.Callback removeCallback : it) {
                this.f5146a.removeCallback(removeCallback);
            }
        }
        this.f5148c.clear();
    }

    /* renamed from: x */
    public final String mo32633x() {
        return this.f5146a.getSelectedRoute().getId();
    }

    /* renamed from: x1 */
    public final void mo32634x1(@Nullable Bundle bundle, int i) {
        MediaRouteSelector fromBundle = MediaRouteSelector.fromBundle(bundle);
        if (fromBundle != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                m6794f3(fromBundle, i);
            } else {
                new C4968j0(Looper.getMainLooper()).post(new C5222y(this, fromBundle, i));
            }
        }
    }

    /* renamed from: y */
    public final void mo32635y() {
        MediaRouter mediaRouter = this.f5146a;
        mediaRouter.selectRoute(mediaRouter.getDefaultRoute());
    }

    /* renamed from: z */
    public final boolean mo32636z() {
        MediaRouter.RouteInfo defaultRoute = this.f5146a.getDefaultRoute();
        if (defaultRoute == null || !this.f5146a.getSelectedRoute().getId().equals(defaultRoute.getId())) {
            return false;
        }
        return true;
    }
}
