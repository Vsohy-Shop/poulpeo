package p039b8;

import android.view.View;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import p278x7.C10584m;

/* renamed from: b8.b */
/* compiled from: MeasureUtils */
public class C2941b {
    /* renamed from: a */
    private static void m2421a(View view, int i, int i2, int i3, int i4) {
        C10584m.m22518d("\tdesired (w,h)", (float) view.getMeasuredWidth(), (float) view.getMeasuredHeight());
        if (view.getVisibility() == 8) {
            i = 0;
            i2 = 0;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(i, i3), View.MeasureSpec.makeMeasureSpec(i2, i4));
        C10584m.m22518d("\tactual (w,h)", (float) view.getMeasuredWidth(), (float) view.getMeasuredHeight());
    }

    /* renamed from: b */
    public static void m2422b(View view, int i, int i2) {
        m2421a(view, i, i2, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* renamed from: c */
    public static void m2423c(View view, int i, int i2) {
        m2421a(view, i, i2, Integer.MIN_VALUE, BasicMeasure.EXACTLY);
    }

    /* renamed from: d */
    public static void m2424d(View view, int i, int i2) {
        m2421a(view, i, i2, BasicMeasure.EXACTLY, Integer.MIN_VALUE);
    }
}
