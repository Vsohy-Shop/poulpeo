package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import p256v7.C10046h;
import p278x7.C10584m;

/* renamed from: com.google.firebase.inappmessaging.display.internal.layout.a */
/* compiled from: BaseModalLayout */
public abstract class C6938a extends FrameLayout {

    /* renamed from: b */
    private float f9186b;

    /* renamed from: c */
    private float f9187c;

    /* renamed from: d */
    private DisplayMetrics f9188d;

    /* renamed from: e */
    private List<View> f9189e = new ArrayList();

    /* JADX INFO: finally extract failed */
    public C6938a(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C10046h.f15157J, 0, 0);
        try {
            this.f9186b = obtainStyledAttributes.getFloat(C10046h.f15159L, -1.0f);
            this.f9187c = obtainStyledAttributes.getFloat(C10046h.f15158K, -1.0f);
            obtainStyledAttributes.recycle();
            this.f9188d = context.getResources().getDisplayMetrics();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo39806a(int i) {
        if (getMaxHeightPct() > 0.0f) {
            C10584m.m22515a("Height: restrict by pct");
            return mo39819j((int) (((float) getDisplayMetrics().heightPixels) * getMaxHeightPct()), 4);
        }
        C10584m.m22515a("Height: restrict by spec");
        return View.MeasureSpec.getSize(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo39807b(int i) {
        if (getMaxWidthPct() > 0.0f) {
            C10584m.m22515a("Width: restrict by pct");
            return mo39819j((int) (((float) getDisplayMetrics().widthPixels) * getMaxWidthPct()), 4);
        }
        C10584m.m22515a("Width: restrict by spec");
        return View.MeasureSpec.getSize(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo39808c(int i) {
        return (int) Math.floor((double) TypedValue.applyDimension(1, (float) i, this.f9188d));
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: d */
    public View mo39809d(@IdRes int i) {
        View findViewById = findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalStateException("No such child: " + i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo39810e(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo39811f(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return view.getMeasuredWidth();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public FrameLayout.LayoutParams mo39812g(View view) {
        return (FrameLayout.LayoutParams) view.getLayoutParams();
    }

    /* access modifiers changed from: protected */
    public DisplayMetrics getDisplayMetrics() {
        return this.f9188d;
    }

    /* access modifiers changed from: protected */
    public float getMaxHeightPct() {
        return this.f9187c;
    }

    /* access modifiers changed from: protected */
    public float getMaxWidthPct() {
        return this.f9186b;
    }

    /* access modifiers changed from: protected */
    public List<View> getVisibleChildren() {
        return this.f9189e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo39817h(View view, int i, int i2) {
        mo39818i(view, i, i2, i + mo39811f(view), i2 + mo39810e(view));
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo39818i(View view, int i, int i2, int i3, int i4) {
        C10584m.m22518d("\tleft, right", (float) i, (float) i3);
        C10584m.m22518d("\ttop, bottom", (float) i2, (float) i4);
        view.layout(i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo39819j(int i, int i2) {
        return i2 * Math.round(((float) i) / ((float) i2));
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        C10584m.m22518d("\tdesired (w,h)", (float) view.getMeasuredWidth(), (float) view.getMeasuredHeight());
        super.measureChildWithMargins(view, i, i2, i3, i4);
        C10584m.m22518d("\tactual  (w,h)", (float) view.getMeasuredWidth(), (float) view.getMeasuredHeight());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C10584m.m22516b("BEGIN LAYOUT");
        C10584m.m22515a("onLayout: l: " + i + ", t: " + i2 + ", r: " + i3 + ", b: " + i4);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C10584m.m22516b("BEGIN MEASURE");
        C10584m.m22518d("Display", (float) getDisplayMetrics().widthPixels, (float) getDisplayMetrics().heightPixels);
        this.f9189e.clear();
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                this.f9189e.add(childAt);
            } else {
                C10584m.m22517c("Skipping GONE child", (float) i3);
            }
        }
    }
}
