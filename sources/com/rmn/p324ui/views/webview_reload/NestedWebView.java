package com.rmn.p324ui.views.webview_reload;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingChildHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* renamed from: com.rmn.ui.views.webview_reload.NestedWebView */
/* compiled from: NestedWebView.kt */
public final class NestedWebView extends WebView implements NestedScrollingChild {

    /* renamed from: b */
    private final int[] f18135b;

    /* renamed from: c */
    private final int[] f18136c;

    /* renamed from: d */
    private final NestedScrollingChildHelper f18137d;

    /* renamed from: e */
    private int f18138e;

    /* renamed from: f */
    private int f18139f;

    /* renamed from: g */
    private boolean f18140g;

    /* renamed from: h */
    public Map<Integer, View> f18141h;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NestedWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C12775o.m28639i(context, "context");
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f18137d.dispatchNestedFling(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f18137d.dispatchNestedPreFling(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f18137d.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f18137d.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    public boolean hasNestedScrollingParent() {
        return this.f18137d.hasNestedScrollingParent();
    }

    public boolean isNestedScrollingEnabled() {
        return this.f18137d.isNestedScrollingEnabled();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C12775o.m28639i(motionEvent, "ev");
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = MotionEventCompat.getActionMasked(obtain);
        if (actionMasked == 0) {
            this.f18139f = 0;
        }
        int y = (int) obtain.getY();
        obtain.offsetLocation(0.0f, (float) this.f18139f);
        if (actionMasked == 0) {
            boolean onTouchEvent = super.onTouchEvent(obtain);
            if (this.f18140g) {
                this.f18138e = y - 5;
                this.f18140g = false;
            } else {
                this.f18138e = y;
            }
            startNestedScroll(2);
            return onTouchEvent;
        } else if (actionMasked != 2) {
            boolean onTouchEvent2 = super.onTouchEvent(obtain);
            stopNestedScroll();
            return onTouchEvent2;
        } else {
            int i = this.f18138e - y;
            if (dispatchNestedPreScroll(0, i, this.f18136c, this.f18135b)) {
                i -= this.f18136c[1];
                int i2 = this.f18135b[1];
                this.f18138e = y - i2;
                obtain.offsetLocation(0.0f, (float) (-i2));
                this.f18139f += this.f18135b[1];
            }
            int i3 = i;
            boolean onTouchEvent3 = super.onTouchEvent(obtain);
            int[] iArr = this.f18135b;
            if (dispatchNestedScroll(0, iArr[1], 0, i3, iArr)) {
                obtain.offsetLocation(0.0f, (float) this.f18135b[1]);
                int i4 = this.f18139f;
                int i5 = this.f18135b[1];
                this.f18139f = i4 + i5;
                this.f18138e -= i5;
            }
            return onTouchEvent3;
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f18137d.setNestedScrollingEnabled(z);
    }

    public boolean startNestedScroll(int i) {
        return this.f18137d.startNestedScroll(i);
    }

    public void stopNestedScroll() {
        this.f18137d.stopNestedScroll();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NestedWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C12775o.m28639i(context, "context");
        this.f18141h = new LinkedHashMap();
        this.f18135b = new int[2];
        this.f18136c = new int[2];
        this.f18137d = new NestedScrollingChildHelper(this);
        this.f18140g = true;
        setNestedScrollingEnabled(true);
        setBackgroundColor(ContextCompat.getColor(getContext(), 17170445));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NestedWebView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 16842885 : i);
    }
}
