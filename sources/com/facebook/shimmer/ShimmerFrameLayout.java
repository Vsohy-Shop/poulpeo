package com.facebook.shimmer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.shimmer.C4584a;
import p084f3.C7570a;

public class ShimmerFrameLayout extends FrameLayout {

    /* renamed from: b */
    private final Paint f4318b = new Paint();

    /* renamed from: c */
    private final C4588b f4319c = new C4588b();

    /* renamed from: d */
    private boolean f4320d = true;

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m5772a(context, attributeSet);
    }

    /* renamed from: a */
    private void m5772a(Context context, @Nullable AttributeSet attributeSet) {
        C4584a.C4586b bVar;
        setWillNotDraw(false);
        this.f4319c.setCallback(this);
        if (attributeSet == null) {
            mo31738b(new C4584a.C4585a().mo31751a());
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7570a.f10525a, 0, 0);
        try {
            int i = C7570a.f10530f;
            if (!obtainStyledAttributes.hasValue(i) || !obtainStyledAttributes.getBoolean(i, false)) {
                bVar = new C4584a.C4585a();
            } else {
                bVar = new C4584a.C4587c();
            }
            mo31738b(bVar.mo31752c(obtainStyledAttributes).mo31751a());
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public ShimmerFrameLayout mo31738b(@Nullable C4584a aVar) {
        this.f4319c.mo31776d(aVar);
        if (aVar == null || !aVar.f4335o) {
            setLayerType(0, (Paint) null);
        } else {
            setLayerType(2, this.f4318b);
        }
        return this;
    }

    /* renamed from: c */
    public void mo31739c() {
        this.f4319c.mo31778e();
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f4320d) {
            this.f4319c.draw(canvas);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4319c.mo31775b();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo31739c();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f4319c.setBounds(0, 0, getWidth(), getHeight());
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(@NonNull Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f4319c) {
            return true;
        }
        return false;
    }
}
