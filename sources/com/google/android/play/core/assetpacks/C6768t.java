package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import p024a6.C2209b;
import p037b6.C2895b0;
import p037b6.C2900e;
import p049c6.C3888c;

/* renamed from: com.google.android.play.core.assetpacks.t */
final class C6768t extends C3888c<AssetPackState> {

    /* renamed from: g */
    private final C6730j1 f8833g;

    /* renamed from: h */
    private final C6765s0 f8834h;

    /* renamed from: i */
    private final C2895b0<C6697b3> f8835i;

    /* renamed from: j */
    private final C6729j0 f8836j;

    /* renamed from: k */
    private final C6777v0 f8837k;

    /* renamed from: l */
    private final C2209b f8838l;

    /* renamed from: m */
    private final C2895b0<Executor> f8839m;

    /* renamed from: n */
    private final C2895b0<Executor> f8840n;

    /* renamed from: o */
    private final Handler f8841o = new Handler(Looper.getMainLooper());

    C6768t(Context context, C6730j1 j1Var, C6765s0 s0Var, C2895b0<C6697b3> b0Var, C6777v0 v0Var, C6729j0 j0Var, C2209b bVar, C2895b0<Executor> b0Var2, C2895b0<Executor> b0Var3) {
        super(new C2900e("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.f8833g = j1Var;
        this.f8834h = s0Var;
        this.f8835i = b0Var;
        this.f8837k = v0Var;
        this.f8836j = j0Var;
        this.f8838l = bVar;
        this.f8839m = b0Var2;
        this.f8840n = b0Var3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29929a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (bundleExtra != null) {
            ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
            if (stringArrayList == null || stringArrayList.size() != 1) {
                this.f2969a.mo28423e("Corrupt bundle received from broadcast.", new Object[0]);
                return;
            }
            Bundle bundleExtra2 = intent.getBundleExtra("com.google.android.play.core.FLAGS");
            if (bundleExtra2 != null) {
                this.f8838l.mo23534a(bundleExtra2);
            }
            AssetPackState a = AssetPackState.m11322a(bundleExtra, stringArrayList.get(0), this.f8837k, C6776v.f8885a);
            this.f2969a.mo28421c("ListenerRegistryBroadcastReceiver.onReceive: %s", a);
            PendingIntent pendingIntent = (PendingIntent) bundleExtra.getParcelable("confirmation_intent");
            if (pendingIntent != null) {
                this.f8836j.mo39315a(pendingIntent);
            }
            this.f8840n.mo28418a().execute(new C6760r(this, bundleExtra, a));
            this.f8839m.mo28418a().execute(new C6764s(this, bundleExtra));
            return;
        }
        this.f2969a.mo28423e("Empty bundle received from broadcast.", new Object[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo39363f(Bundle bundle) {
        if (this.f8833g.mo39319e(bundle)) {
            this.f8834h.mo39360a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo39364g(Bundle bundle, AssetPackState assetPackState) {
        if (this.f8833g.mo39323i(bundle)) {
            mo39365h(assetPackState);
            this.f8835i.mo28418a().mo39269a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo39365h(AssetPackState assetPackState) {
        this.f8841o.post(new C6756q(this, assetPackState));
    }
}
