package com.google.android.gms.cast.framework.media;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.cast.C4689g;
import com.google.android.gms.cast.framework.media.C4648h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p150l4.C8673a;

@VisibleForTesting
/* renamed from: com.google.android.gms.cast.framework.media.v0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final class C4682v0 extends C4648h.C4649a {

    /* renamed from: a */
    final /* synthetic */ C4639d f4777a;

    public C4682v0(C4639d dVar) {
        this.f4777a = dVar;
    }

    /* renamed from: g */
    public final void mo32193g() {
        long a = this.f4777a.m6109p();
        C4639d dVar = this.f4777a;
        if (a != dVar.f4669b) {
            dVar.f4669b = a;
            dVar.mo32081l();
            C4639d dVar2 = this.f4777a;
            if (dVar2.f4669b != 0) {
                dVar2.mo32084o();
            }
        }
    }

    /* renamed from: h */
    public final void mo32194h(int[] iArr) {
        List l = C8673a.m17453l(iArr);
        if (!this.f4777a.f4671d.equals(l)) {
            this.f4777a.m6117x();
            this.f4777a.f4673f.evictAll();
            this.f4777a.f4674g.clear();
            C4639d dVar = this.f4777a;
            dVar.f4671d = l;
            C4639d.m6108k(dVar);
            this.f4777a.m6115v();
            this.f4777a.m6114u();
        }
    }

    /* renamed from: i */
    public final void mo32195i(int[] iArr, int i) {
        int i2;
        int length = iArr.length;
        if (i == 0) {
            i2 = this.f4777a.f4671d.size();
        } else {
            i2 = this.f4777a.f4672e.get(i, -1);
            if (i2 == -1) {
                this.f4777a.mo32084o();
                return;
            }
        }
        this.f4777a.m6117x();
        this.f4777a.f4671d.addAll(i2, C8673a.m17453l(iArr));
        C4639d.m6108k(this.f4777a);
        C4639d.m6102e(this.f4777a, i2, length);
        this.f4777a.m6114u();
    }

    /* renamed from: j */
    public final void mo32196j(C4689g[] gVarArr) {
        HashSet hashSet = new HashSet();
        this.f4777a.f4674g.clear();
        int length = gVarArr.length;
        int i = 0;
        while (i < length) {
            C4689g gVar = gVarArr[i];
            int H = gVar.mo32243H();
            this.f4777a.f4673f.put(Integer.valueOf(H), gVar);
            int i2 = this.f4777a.f4672e.get(H, -1);
            if (i2 == -1) {
                this.f4777a.mo32084o();
                return;
            } else {
                hashSet.add(Integer.valueOf(i2));
                i++;
            }
        }
        for (Integer intValue : this.f4777a.f4674g) {
            int i3 = this.f4777a.f4672e.get(intValue.intValue(), -1);
            if (i3 != -1) {
                hashSet.add(Integer.valueOf(i3));
            }
        }
        this.f4777a.f4674g.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        Collections.sort(arrayList);
        this.f4777a.m6117x();
        this.f4777a.m6116w(C8673a.m17456o(arrayList));
        this.f4777a.m6114u();
    }

    /* renamed from: k */
    public final void mo32197k(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            this.f4777a.f4673f.remove(Integer.valueOf(i));
            int i2 = this.f4777a.f4672e.get(i, -1);
            if (i2 == -1) {
                this.f4777a.mo32084o();
                return;
            }
            this.f4777a.f4672e.delete(i);
            arrayList.add(Integer.valueOf(i2));
        }
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            this.f4777a.m6117x();
            this.f4777a.f4671d.removeAll(C8673a.m17453l(iArr));
            C4639d.m6108k(this.f4777a);
            C4639d.m6103f(this.f4777a, C8673a.m17456o(arrayList));
            this.f4777a.m6114u();
        }
    }

    /* renamed from: l */
    public final void mo32198l(List list, List list2, int i) {
        int i2;
        ArrayList arrayList = new ArrayList();
        if (i == 0) {
            i2 = this.f4777a.f4671d.size();
        } else if (list2.isEmpty()) {
            this.f4777a.f4668a.mo42759f("Received a Queue Reordered message with an empty reordered items IDs list.", new Object[0]);
            i2 = -1;
        } else {
            i2 = this.f4777a.f4672e.get(i, -1);
            if (i2 == -1) {
                i2 = this.f4777a.f4672e.get(((Integer) list2.get(0)).intValue(), -1);
            }
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            int i3 = this.f4777a.f4672e.get(((Integer) it.next()).intValue(), -1);
            if (i3 == -1) {
                this.f4777a.mo32084o();
                return;
            }
            arrayList.add(Integer.valueOf(i3));
        }
        this.f4777a.m6117x();
        C4639d dVar = this.f4777a;
        dVar.f4671d = list;
        C4639d.m6108k(dVar);
        C4639d.m6104g(this.f4777a, arrayList, i2);
        this.f4777a.m6114u();
    }

    /* renamed from: m */
    public final void mo32199m(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i = 0;
        while (i < length) {
            int i2 = iArr[i];
            this.f4777a.f4673f.remove(Integer.valueOf(i2));
            int i3 = this.f4777a.f4672e.get(i2, -1);
            if (i3 == -1) {
                this.f4777a.mo32084o();
                return;
            } else {
                arrayList.add(Integer.valueOf(i3));
                i++;
            }
        }
        Collections.sort(arrayList);
        this.f4777a.m6117x();
        this.f4777a.m6116w(C8673a.m17456o(arrayList));
        this.f4777a.m6114u();
    }

    /* renamed from: n */
    public final void mo32200n() {
        this.f4777a.mo32084o();
    }
}
