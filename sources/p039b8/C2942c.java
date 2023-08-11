package p039b8;

import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p278x7.C10584m;

/* renamed from: b8.c */
/* compiled from: VerticalViewGroupMeasure */
public class C2942c {

    /* renamed from: a */
    private List<C2944d> f1345a = new ArrayList();

    /* renamed from: b */
    private int f1346b = 0;

    /* renamed from: c */
    private int f1347c = 0;

    /* renamed from: b8.c$a */
    /* compiled from: VerticalViewGroupMeasure */
    class C2943a implements Comparator<C2944d> {
        C2943a() {
        }

        /* renamed from: a */
        public int compare(C2944d dVar, C2944d dVar2) {
            if (dVar.mo28488a() > dVar2.mo28488a()) {
                return -1;
            }
            if (dVar.mo28488a() < dVar2.mo28488a()) {
                return 1;
            }
            return 0;
        }
    }

    /* renamed from: a */
    public void mo28480a(View view, boolean z) {
        C2944d dVar = new C2944d(view, z);
        dVar.mo28493f(this.f1346b, this.f1347c);
        this.f1345a.add(dVar);
    }

    /* renamed from: b */
    public void mo28481b(int i) {
        float f;
        ArrayList<C2944d> arrayList = new ArrayList<>();
        for (C2944d next : this.f1345a) {
            if (next.mo28491d()) {
                arrayList.add(next);
            }
        }
        Collections.sort(arrayList, new C2943a());
        int i2 = 0;
        for (C2944d a : arrayList) {
            i2 += a.mo28488a();
        }
        int size = arrayList.size();
        if (size < 6) {
            float f2 = 1.0f - (((float) (size - 1)) * 0.2f);
            C10584m.m22518d("VVGM (minFrac, maxFrac)", 0.2f, f2);
            float f3 = 0.0f;
            for (C2944d dVar : arrayList) {
                float a2 = ((float) dVar.mo28488a()) / ((float) i2);
                if (a2 > f2) {
                    f3 += a2 - f2;
                    f = f2;
                } else {
                    f = a2;
                }
                if (a2 < 0.2f) {
                    float min = Math.min(0.2f - a2, f3);
                    f3 -= min;
                    f = a2 + min;
                }
                C10584m.m22518d("\t(desired, granted)", a2, f);
                dVar.mo28493f(this.f1346b, (int) (f * ((float) i)));
            }
            return;
        }
        throw new IllegalStateException("VerticalViewGroupMeasure only supports up to 5 children");
    }

    /* renamed from: c */
    public int mo28482c() {
        int i = 0;
        for (C2944d next : this.f1345a) {
            if (!next.mo28491d()) {
                i += next.mo28488a();
            }
        }
        return i;
    }

    /* renamed from: d */
    public int mo28483d() {
        int i = 0;
        for (C2944d a : this.f1345a) {
            i += a.mo28488a();
        }
        return i;
    }

    /* renamed from: e */
    public List<C2944d> mo28484e() {
        return this.f1345a;
    }

    /* renamed from: f */
    public void mo28485f(int i, int i2) {
        this.f1346b = i;
        this.f1347c = i2;
        this.f1345a = new ArrayList();
    }
}
