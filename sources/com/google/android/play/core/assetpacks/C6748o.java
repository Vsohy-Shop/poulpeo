package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p037b6.C2900e;
import p037b6.C2915l0;
import p037b6.C2920o;
import p037b6.C2926r;
import p075e6.C7479a;
import p099g6.C7781c;
import p099g6.C7783e;
import p099g6.C7790l;

/* renamed from: com.google.android.play.core.assetpacks.o */
final class C6748o implements C6697b3 {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C2900e f8747f = new C2900e("AssetPackServiceImpl");

    /* renamed from: g */
    private static final Intent f8748g = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f8749a;

    /* renamed from: b */
    private final C6777v0 f8750b;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: c */
    public C2920o<C2915l0> f8751c;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: d */
    public C2920o<C2915l0> f8752d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final AtomicBoolean f8753e = new AtomicBoolean();

    C6748o(Context context, C6777v0 v0Var) {
        this.f8749a = context.getPackageName();
        this.f8750b = v0Var;
        if (C2926r.m2396a(context)) {
            Context a = C7479a.m14655a(context);
            C2900e eVar = f8747f;
            Intent intent = f8748g;
            this.f8751c = new C2920o(a, eVar, "AssetPackService", intent, C6702c3.f8590a);
            this.f8752d = new C2920o(C7479a.m14655a(context), eVar, "AssetPackService-keepAlive", intent, C6707d3.f8600a);
        }
        f8747f.mo28421c("AssetPackService initiated.", new Object[0]);
    }

    /* renamed from: e */
    static /* synthetic */ ArrayList m11465e(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", (String) it.next());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: f */
    static /* synthetic */ List m11466f(C6748o oVar, List list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AssetPackState next = C6693b.m11339b((Bundle) list.get(i), oVar.f8750b).mo39263e().values().iterator().next();
            if (next == null) {
                f8747f.mo28423e("onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            if (C6770t1.m11533c(next.mo39255f())) {
                arrayList.add(next.mo39254e());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m11467g(int i, String str, int i2) {
        if (this.f8751c != null) {
            f8747f.mo28424f("notifyModuleCompleted", new Object[0]);
            C7790l lVar = new C7790l();
            this.f8751c.mo28460c(new C6712f(this, lVar, i, str, lVar, i2));
            return;
        }
        throw new C6761r0("The Play Store app is not installed or is an unofficial version.", i);
    }

    /* renamed from: k */
    static /* synthetic */ Bundle m11471k(Map map) {
        Bundle t = m11480t();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        t.putParcelableArrayList("installed_asset_module", arrayList);
        return t;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static Bundle m11474n(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", i);
        return bundle;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static Bundle m11475o(int i, String str) {
        Bundle n = m11474n(i);
        n.putString("module_name", str);
        return n;
    }

    /* renamed from: p */
    static /* synthetic */ Bundle m11476p(int i, String str, String str2, int i2) {
        Bundle o = m11475o(i, str);
        o.putString("slice_id", str2);
        o.putInt("chunk_number", i2);
        return o;
    }

    /* renamed from: s */
    private static <T> C7781c<T> m11479s() {
        f8747f.mo28423e("onError(%d)", -11);
        return C7783e.m15174a(new AssetPackException(-11));
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static Bundle m11480t() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 10800);
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        bundle.putIntegerArrayList("supported_patch_formats", new ArrayList());
        return bundle;
    }

    /* renamed from: a */
    public final C7781c<List<String>> mo39268a(Map<String, Long> map) {
        if (this.f8751c == null) {
            return m11479s();
        }
        f8747f.mo28424f("syncPacks", new Object[0]);
        C7790l lVar = new C7790l();
        this.f8751c.mo28460c(new C6703d(this, lVar, map, lVar));
        return lVar.mo41434a();
    }

    /* renamed from: b */
    public final C7781c<ParcelFileDescriptor> mo39272b(int i, String str, String str2, int i2) {
        if (this.f8751c == null) {
            return m11479s();
        }
        f8747f.mo28424f("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i2), Integer.valueOf(i));
        C7790l lVar = new C7790l();
        this.f8751c.mo28460c(new C6720h(this, lVar, i, str, str2, i2, lVar));
        return lVar.mo41434a();
    }

    /* renamed from: c */
    public final void mo39273c(int i, String str, String str2, int i2) {
        if (this.f8751c != null) {
            f8747f.mo28424f("notifyChunkTransferred", new Object[0]);
            C7790l lVar = new C7790l();
            this.f8751c.mo28460c(new C6708e(this, lVar, i, str, str2, i2, lVar));
            return;
        }
        throw new C6761r0("The Play Store app is not installed or is an unofficial version.", i);
    }

    /* renamed from: u */
    public final void mo39274u(int i) {
        if (this.f8751c != null) {
            f8747f.mo28424f("notifySessionFailed", new Object[0]);
            C7790l lVar = new C7790l();
            this.f8751c.mo28460c(new C6716g(this, lVar, i, lVar));
            return;
        }
        throw new C6761r0("The Play Store app is not installed or is an unofficial version.", i);
    }

    /* renamed from: a */
    public final synchronized void mo39269a() {
        if (this.f8752d == null) {
            f8747f.mo28425g("Keep alive connection manager is not initialized.", new Object[0]);
            return;
        }
        C2900e eVar = f8747f;
        eVar.mo28424f("keepAlive", new Object[0]);
        if (!this.f8753e.compareAndSet(false, true)) {
            eVar.mo28424f("Service is already kept alive.", new Object[0]);
            return;
        }
        C7790l lVar = new C7790l();
        this.f8752d.mo28460c(new C6724i(this, lVar, lVar));
    }

    /* renamed from: a */
    public final void mo39270a(int i, String str) {
        m11467g(i, str, 10);
    }

    /* renamed from: a */
    public final void mo39271a(List<String> list) {
        if (this.f8751c != null) {
            f8747f.mo28424f("cancelDownloads(%s)", list);
            C7790l lVar = new C7790l();
            this.f8751c.mo28460c(new C6698c(this, lVar, list, lVar));
        }
    }
}
