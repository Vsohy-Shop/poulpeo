package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import java.util.List;
import p037b6.C2917m0;
import p099g6.C7790l;

/* renamed from: com.google.android.play.core.assetpacks.j */
class C6728j<T> extends C2917m0 {

    /* renamed from: a */
    final C7790l<T> f8681a;

    /* renamed from: b */
    final /* synthetic */ C6748o f8682b;

    C6728j(C6748o oVar, C7790l<T> lVar) {
        this.f8682b = oVar;
        this.f8681a = lVar;
    }

    /* renamed from: N1 */
    public final void mo28446N1(int i) {
        this.f8682b.f8751c.mo28459b();
        C6748o.f8747f.mo28424f("onGetSession(%d)", Integer.valueOf(i));
    }

    /* renamed from: P1 */
    public void mo28447P1(Bundle bundle, Bundle bundle2) {
        this.f8682b.f8751c.mo28459b();
        C6748o.f8747f.mo28424f("onRequestDownloadInfo()", new Object[0]);
    }

    /* renamed from: a */
    public void mo28448a() {
        this.f8682b.f8751c.mo28459b();
        C6748o.f8747f.mo28424f("onCancelDownloads()", new Object[0]);
    }

    /* renamed from: b */
    public void mo28451b(Bundle bundle) {
        this.f8682b.f8751c.mo28459b();
        int i = bundle.getInt("error_code");
        C6748o.f8747f.mo28423e("onError(%d)", Integer.valueOf(i));
        this.f8681a.mo41437d(new AssetPackException(i));
    }

    /* renamed from: j2 */
    public void mo28452j2(int i, Bundle bundle) {
        this.f8682b.f8751c.mo28459b();
        C6748o.f8747f.mo28424f("onStartDownload(%d)", Integer.valueOf(i));
    }

    /* renamed from: k2 */
    public void mo28453k2(Bundle bundle) {
        this.f8682b.f8751c.mo28459b();
        C6748o.f8747f.mo28424f("onNotifySessionFailed(%d)", Integer.valueOf(bundle.getInt("session_id")));
    }

    /* renamed from: o */
    public void mo28454o(Bundle bundle) {
        this.f8682b.f8751c.mo28459b();
        C6748o.f8747f.mo28424f("onNotifyModuleCompleted(%s, sessionId=%d)", bundle.getString("module_name"), Integer.valueOf(bundle.getInt("session_id")));
    }

    /* renamed from: p */
    public void mo28455p(Bundle bundle, Bundle bundle2) {
        this.f8682b.f8752d.mo28459b();
        C6748o.f8747f.mo28424f("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }

    /* renamed from: s1 */
    public void mo28456s1(Bundle bundle, Bundle bundle2) {
        this.f8682b.f8751c.mo28459b();
        C6748o.f8747f.mo28424f("onGetChunkFileDescriptor", new Object[0]);
    }

    /* renamed from: u */
    public final void mo28457u(int i) {
        this.f8682b.f8751c.mo28459b();
        C6748o.f8747f.mo28424f("onCancelDownload(%d)", Integer.valueOf(i));
    }

    /* renamed from: v */
    public void mo28458v(Bundle bundle) {
        this.f8682b.f8751c.mo28459b();
        C6748o.f8747f.mo28424f("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle.getString("module_name"), bundle.getString("slice_id"), Integer.valueOf(bundle.getInt("chunk_number")), Integer.valueOf(bundle.getInt("session_id")));
    }

    C6728j(C6748o oVar, C7790l lVar, byte[] bArr) {
        this(oVar, lVar);
    }

    /* renamed from: a */
    public void mo28449a(List<Bundle> list) {
        this.f8682b.f8751c.mo28459b();
        C6748o.f8747f.mo28424f("onGetSessionStates", new Object[0]);
    }

    /* renamed from: b */
    public void mo28450b() {
        this.f8682b.f8751c.mo28459b();
        C6748o.f8747f.mo28424f("onRemoveModule()", new Object[0]);
    }

    C6728j(C6748o oVar, C7790l lVar, char[] cArr) {
        this(oVar, lVar);
    }

    C6728j(C6748o oVar, C7790l lVar, int[] iArr) {
        this(oVar, lVar);
    }
}
