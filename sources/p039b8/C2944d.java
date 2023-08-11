package p039b8;

import android.view.View;
import android.widget.ScrollView;

/* renamed from: b8.d */
/* compiled from: ViewMeasure */
public class C2944d {

    /* renamed from: a */
    private View f1349a;

    /* renamed from: b */
    private boolean f1350b;

    /* renamed from: c */
    private int f1351c;

    /* renamed from: d */
    private int f1352d;

    public C2944d(View view, boolean z) {
        this.f1349a = view;
        this.f1350b = z;
    }

    /* renamed from: a */
    public int mo28488a() {
        if (this.f1349a.getVisibility() == 8) {
            return 0;
        }
        View view = this.f1349a;
        if (!(view instanceof ScrollView)) {
            return view.getMeasuredHeight();
        }
        ScrollView scrollView = (ScrollView) view;
        return scrollView.getPaddingBottom() + scrollView.getPaddingTop() + scrollView.getChildAt(0).getMeasuredHeight();
    }

    /* renamed from: b */
    public int mo28489b() {
        return this.f1352d;
    }

    /* renamed from: c */
    public View mo28490c() {
        return this.f1349a;
    }

    /* renamed from: d */
    public boolean mo28491d() {
        return this.f1350b;
    }

    /* renamed from: e */
    public void mo28492e(int i, int i2) {
        C2941b.m2422b(this.f1349a, i, i2);
    }

    /* renamed from: f */
    public void mo28493f(int i, int i2) {
        this.f1351c = i;
        this.f1352d = i2;
    }
}
