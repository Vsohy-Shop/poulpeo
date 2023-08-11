package com.google.android.play.core.assetpacks;

import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import p037b6.C2895b0;
import p037b6.C2900e;
import p037b6.C2903f0;

/* renamed from: com.google.android.play.core.assetpacks.j1 */
final class C6730j1 {

    /* renamed from: g */
    private static final C2900e f8684g = new C2900e("ExtractorSessionStoreView");

    /* renamed from: a */
    private final C6792z f8685a;

    /* renamed from: b */
    private final C2895b0<C6697b3> f8686b;

    /* renamed from: c */
    private final C6777v0 f8687c;

    /* renamed from: d */
    private final C2895b0<Executor> f8688d;

    /* renamed from: e */
    private final Map<Integer, C6718g1> f8689e = new HashMap();

    /* renamed from: f */
    private final ReentrantLock f8690f = new ReentrantLock();

    C6730j1(C6792z zVar, C2895b0<C6697b3> b0Var, C6777v0 v0Var, C2895b0<Executor> b0Var2) {
        this.f8685a = zVar;
        this.f8686b = b0Var;
        this.f8687c = v0Var;
        this.f8688d = b0Var2;
    }

    /* renamed from: a */
    private final <T> T m11425a(C6726i1<T> i1Var) {
        try {
            mo39316b();
            return i1Var.mo39261a();
        } finally {
            mo39320f();
        }
    }

    /* renamed from: o */
    private final Map<String, C6718g1> m11426o(List<String> list) {
        return (Map) m11425a(new C6695b1(this, list));
    }

    /* renamed from: q */
    private final C6718g1 m11427q(int i) {
        Map<Integer, C6718g1> map = this.f8689e;
        Integer valueOf = Integer.valueOf(i);
        C6718g1 g1Var = map.get(valueOf);
        if (g1Var != null) {
            return g1Var;
        }
        throw new C6761r0(String.format("Could not find session %d while trying to get it", new Object[]{valueOf}), i);
    }

    /* renamed from: r */
    private static String m11428r(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList != null && !stringArrayList.isEmpty()) {
            return stringArrayList.get(0);
        }
        throw new C6761r0("Session without pack received.");
    }

    /* renamed from: s */
    private static <T> List<T> m11429s(List<T> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo39316b() {
        this.f8690f.lock();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo39317c(int i) {
        m11425a(new C6705d1(this, i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo39318d(String str, int i, long j) {
        m11425a(new C6690a1(this, str, i, j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo39319e(Bundle bundle) {
        return ((Boolean) m11425a(new C6789y0(this, bundle))).booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo39320f() {
        this.f8690f.unlock();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo39321g(int i) {
        m11427q(i).f8644c.f8631c = 5;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo39322h(String str, int i, long j) {
        C6718g1 g1Var = m11426o(Arrays.asList(new String[]{str})).get(str);
        if (g1Var == null || C6770t1.m11536f(g1Var.f8644c.f8631c)) {
            f8684g.mo28423e(String.format("Could not find pack %s while trying to complete it", new Object[]{str}), new Object[0]);
        }
        this.f8685a.mo39380A(str, i, j);
        g1Var.f8644c.f8631c = 4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean mo39323i(Bundle bundle) {
        return ((Boolean) m11425a(new C6793z0(this, bundle))).booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ Boolean mo39324j(Bundle bundle) {
        int i = bundle.getInt("session_id");
        if (i == 0) {
            return Boolean.TRUE;
        }
        Map<Integer, C6718g1> map = this.f8689e;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            return Boolean.TRUE;
        }
        C6718g1 g1Var = this.f8689e.get(valueOf);
        if (g1Var.f8644c.f8631c == 6) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(!C6770t1.m11534d(g1Var.f8644c.f8631c, bundle.getInt(C2903f0.m2319a(NotificationCompat.CATEGORY_STATUS, m11428r(bundle)))));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final Map<Integer, C6718g1> mo39325k() {
        return this.f8689e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ Map mo39326l(List list) {
        int i;
        HashMap hashMap = new HashMap();
        for (C6718g1 next : this.f8689e.values()) {
            String str = next.f8644c.f8629a;
            if (list.contains(str)) {
                C6718g1 g1Var = (C6718g1) hashMap.get(str);
                if (g1Var == null) {
                    i = -1;
                } else {
                    i = g1Var.f8642a;
                }
                if (i < next.f8642a) {
                    hashMap.put(str, next);
                }
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ void mo39327m(int i) {
        C6718g1 q = m11427q(i);
        if (C6770t1.m11536f(q.f8644c.f8631c)) {
            C6792z zVar = this.f8685a;
            C6714f1 f1Var = q.f8644c;
            zVar.mo39380A(f1Var.f8629a, q.f8643b, f1Var.f8630b);
            C6714f1 f1Var2 = q.f8644c;
            int i2 = f1Var2.f8631c;
            if (i2 == 5 || i2 == 6) {
                this.f8685a.mo39396t(f1Var2.f8629a);
                return;
            }
            return;
        }
        throw new C6761r0(String.format("Could not safely delete session %d because it is not in a terminal state.", new Object[]{Integer.valueOf(i)}), i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final /* synthetic */ Boolean mo39328n(Bundle bundle) {
        C6722h1 h1Var;
        Bundle bundle2 = bundle;
        int i = bundle2.getInt("session_id");
        if (i == 0) {
            return Boolean.FALSE;
        }
        Map<Integer, C6718g1> map = this.f8689e;
        Integer valueOf = Integer.valueOf(i);
        boolean z = false;
        if (map.containsKey(valueOf)) {
            C6718g1 q = m11427q(i);
            int i2 = bundle2.getInt(C2903f0.m2319a(NotificationCompat.CATEGORY_STATUS, q.f8644c.f8629a));
            if (C6770t1.m11534d(q.f8644c.f8631c, i2)) {
                f8684g.mo28421c("Found stale update for session %s with status %d.", valueOf, Integer.valueOf(q.f8644c.f8631c));
                C6714f1 f1Var = q.f8644c;
                String str = f1Var.f8629a;
                int i3 = f1Var.f8631c;
                if (i3 == 4) {
                    this.f8686b.mo28418a().mo39270a(i, str);
                } else if (i3 == 5) {
                    this.f8686b.mo28418a().mo39274u(i);
                } else if (i3 == 6) {
                    this.f8686b.mo28418a().mo39271a((List<String>) Arrays.asList(new String[]{str}));
                }
            } else {
                q.f8644c.f8631c = i2;
                if (C6770t1.m11536f(i2)) {
                    mo39317c(i);
                    this.f8687c.mo39376b(q.f8644c.f8629a);
                } else {
                    List<C6722h1> list = q.f8644c.f8633e;
                    int size = list.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        C6722h1 h1Var2 = list.get(i4);
                        ArrayList parcelableArrayList = bundle2.getParcelableArrayList(C2903f0.m2320b("chunk_intents", q.f8644c.f8629a, h1Var2.f8655a));
                        if (parcelableArrayList != null) {
                            for (int i5 = 0; i5 < parcelableArrayList.size(); i5++) {
                                if (!(parcelableArrayList.get(i5) == null || ((Intent) parcelableArrayList.get(i5)).getData() == null)) {
                                    h1Var2.f8658d.get(i5).f8613a = true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            String r = m11428r(bundle);
            long j = bundle2.getLong(C2903f0.m2319a("pack_version", r));
            int i6 = bundle2.getInt(C2903f0.m2319a(NotificationCompat.CATEGORY_STATUS, r));
            long j2 = bundle2.getLong(C2903f0.m2319a("total_bytes_to_download", r));
            ArrayList<String> stringArrayList = bundle2.getStringArrayList(C2903f0.m2319a("slice_ids", r));
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = m11429s(stringArrayList).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                ArrayList parcelableArrayList2 = bundle2.getParcelableArrayList(C2903f0.m2320b("chunk_intents", r, str2));
                ArrayList arrayList2 = new ArrayList();
                for (Intent intent : m11429s(parcelableArrayList2)) {
                    Iterator<T> it2 = it;
                    if (intent != null) {
                        z = true;
                    }
                    arrayList2.add(new C6710e1(z));
                    it = it2;
                    z = false;
                }
                Iterator<T> it3 = it;
                String string = bundle2.getString(C2903f0.m2320b("uncompressed_hash_sha256", r, str2));
                long j3 = bundle2.getLong(C2903f0.m2320b("uncompressed_size", r, str2));
                int i7 = bundle2.getInt(C2903f0.m2320b("patch_format", r, str2), 0);
                if (i7 != 0) {
                    h1Var = new C6722h1(str2, string, j3, arrayList2, 0, i7);
                    z = false;
                } else {
                    z = false;
                    h1Var = new C6722h1(str2, string, j3, arrayList2, bundle2.getInt(C2903f0.m2320b("compression_format", r, str2), 0), 0);
                }
                arrayList.add(h1Var);
                it = it3;
            }
            this.f8689e.put(Integer.valueOf(i), new C6718g1(i, bundle2.getInt("app_version_code"), new C6714f1(r, j, i6, j2, arrayList)));
        }
        return Boolean.TRUE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo39329p(int i) {
        m11425a(new C6700c1(this, i));
    }
}
