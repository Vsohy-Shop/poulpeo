package com.google.android.gms.cast.framework.media.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import p120i4.C8137h;
import p120i4.C8140i;
import p120i4.C8152m;
import p120i4.C8154n;
import p140k4.C8559a;
import p140k4.C8560b;
import p140k4.C8561c;
import p140k4.C8562d;
import p150l4.C8673a;

/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public class CastSeekBar extends View {
    @VisibleForTesting

    /* renamed from: b */
    public C8561c f4781b;

    /* renamed from: c */
    private boolean f4782c;
    @Nullable

    /* renamed from: d */
    private Integer f4783d;
    @VisibleForTesting
    @Nullable

    /* renamed from: e */
    public List f4784e;

    /* renamed from: f */
    private final float f4785f;

    /* renamed from: g */
    private final float f4786g;

    /* renamed from: h */
    private final float f4787h;

    /* renamed from: i */
    private final float f4788i;

    /* renamed from: j */
    private final float f4789j;

    /* renamed from: k */
    private final Paint f4790k;
    @ColorInt

    /* renamed from: l */
    private final int f4791l;
    @ColorInt

    /* renamed from: m */
    private final int f4792m;
    @ColorInt

    /* renamed from: n */
    private final int f4793n;
    @ColorInt

    /* renamed from: o */
    private final int f4794o;

    /* renamed from: p */
    private int[] f4795p;

    /* renamed from: q */
    private Point f4796q;

    /* renamed from: r */
    private Runnable f4797r;

    public CastSeekBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: d */
    private final int m6295d(int i) {
        return (int) ((((double) i) / ((double) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))) * ((double) this.f4781b.f12229b));
    }

    /* renamed from: e */
    private final void m6296e(@NonNull Canvas canvas, int i, int i2, int i3, int i4, int i5) {
        this.f4790k.setColor(i5);
        float f = (float) i3;
        float f2 = (float) i4;
        float f3 = this.f4787h;
        canvas.drawRect((((float) i) / f) * f2, -f3, (((float) i2) / f) * f2, f3, this.f4790k);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m6297f(int i) {
        C8561c cVar = this.f4781b;
        if (cVar.f12233f) {
            this.f4783d = Integer.valueOf(C8673a.m17448g(i, cVar.f12231d, cVar.f12232e));
            Runnable runnable = this.f4797r;
            if (runnable == null) {
                this.f4797r = new C8559a(this);
            } else {
                removeCallbacks(runnable);
            }
            postDelayed(this.f4797r, 200);
            postInvalidate();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m6298g() {
        this.f4782c = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m6299h() {
        this.f4782c = false;
    }

    public int getMaxProgress() {
        return this.f4781b.f12229b;
    }

    public int getProgress() {
        Integer num = this.f4783d;
        if (num != null) {
            return num.intValue();
        }
        return this.f4781b.f12228a;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        Runnable runnable = this.f4797r;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        super.onDetachedFromWindow();
    }

    public void onDraw(@NonNull Canvas canvas) {
        int i;
        float f;
        float f2;
        Canvas canvas2 = canvas;
        int save = canvas.save();
        canvas2.translate((float) getPaddingLeft(), (float) getPaddingTop());
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int progress = getProgress();
        int save2 = canvas.save();
        canvas2.translate(0.0f, (float) (((measuredHeight - paddingTop) - paddingBottom) / 2));
        C8561c cVar = this.f4781b;
        if (cVar.f12233f) {
            int i2 = cVar.f12231d;
            if (i2 > 0) {
                m6296e(canvas, 0, i2, cVar.f12229b, measuredWidth, this.f4793n);
            }
            C8561c cVar2 = this.f4781b;
            int i3 = cVar2.f12231d;
            if (progress > i3) {
                m6296e(canvas, i3, progress, cVar2.f12229b, measuredWidth, this.f4791l);
            }
            C8561c cVar3 = this.f4781b;
            int i4 = cVar3.f12232e;
            if (i4 > progress) {
                m6296e(canvas, progress, i4, cVar3.f12229b, measuredWidth, this.f4792m);
            }
            C8561c cVar4 = this.f4781b;
            int i5 = cVar4.f12229b;
            int i6 = cVar4.f12232e;
            if (i5 > i6) {
                m6296e(canvas, i6, i5, i5, measuredWidth, this.f4793n);
            }
        } else {
            int max = Math.max(cVar.f12230c, 0);
            if (max > 0) {
                m6296e(canvas, 0, max, this.f4781b.f12229b, measuredWidth, this.f4793n);
            }
            if (progress > max) {
                m6296e(canvas, max, progress, this.f4781b.f12229b, measuredWidth, this.f4791l);
            }
            int i7 = this.f4781b.f12229b;
            if (i7 > progress) {
                m6296e(canvas, progress, i7, i7, measuredWidth, this.f4793n);
            }
        }
        canvas2.restoreToCount(save2);
        List<C8560b> list = this.f4784e;
        if (list != null && !list.isEmpty()) {
            this.f4790k.setColor(this.f4794o);
            int measuredWidth2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            int measuredHeight2 = getMeasuredHeight();
            int paddingTop2 = getPaddingTop();
            int paddingBottom2 = getPaddingBottom();
            int save3 = canvas.save();
            canvas2.translate(0.0f, (float) (((measuredHeight2 - paddingTop2) - paddingBottom2) / 2));
            for (C8560b bVar : list) {
                if (bVar != null) {
                    int min = Math.min(bVar.f12225a, this.f4781b.f12229b);
                    if (bVar.f12227c) {
                        i = bVar.f12226b;
                    } else {
                        i = 1;
                    }
                    float f3 = (float) measuredWidth2;
                    float f4 = (float) this.f4781b.f12229b;
                    float f5 = (((float) min) * f3) / f4;
                    float f6 = (((float) (min + i)) * f3) / f4;
                    float f7 = this.f4789j;
                    if (f6 - f5 < f7) {
                        f6 = f5 + f7;
                    }
                    if (f6 > f3) {
                        f = f3;
                    } else {
                        f = f6;
                    }
                    if (f - f5 < f7) {
                        f2 = f - f7;
                    } else {
                        f2 = f5;
                    }
                    float f8 = this.f4787h;
                    canvas.drawRect(f2, -f8, f, f8, this.f4790k);
                }
            }
            canvas2.restoreToCount(save3);
        }
        if (isEnabled() && this.f4781b.f12233f) {
            this.f4790k.setColor(this.f4791l);
            int measuredWidth3 = getMeasuredWidth();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int measuredHeight3 = getMeasuredHeight();
            int paddingTop3 = getPaddingTop();
            int paddingBottom3 = getPaddingBottom();
            int progress2 = getProgress();
            int i8 = this.f4781b.f12229b;
            int save4 = canvas.save();
            canvas2.drawCircle((float) ((int) ((((double) progress2) / ((double) i8)) * ((double) ((measuredWidth3 - paddingLeft) - paddingRight)))), ((float) ((measuredHeight3 - paddingTop3) - paddingBottom3)) / 2.0f, this.f4788i, this.f4790k);
            canvas2.restoreToCount(save4);
        }
        canvas2.restoreToCount(save);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i, int i2) {
        setMeasuredDimension(View.resolveSizeAndState((int) (this.f4785f + ((float) getPaddingLeft()) + ((float) getPaddingRight())), i, 0), View.resolveSizeAndState((int) (this.f4786g + ((float) getPaddingTop()) + ((float) getPaddingBottom())), i2, 0));
    }

    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        if (!isEnabled() || !this.f4781b.f12233f) {
            return false;
        }
        if (this.f4796q == null) {
            this.f4796q = new Point();
        }
        if (this.f4795p == null) {
            this.f4795p = new int[2];
        }
        getLocationOnScreen(this.f4795p);
        this.f4796q.set((((int) motionEvent.getRawX()) - this.f4795p[0]) - getPaddingLeft(), ((int) motionEvent.getRawY()) - this.f4795p[1]);
        int action = motionEvent.getAction();
        if (action == 0) {
            m6298g();
            m6297f(m6295d(this.f4796q.x));
            return true;
        } else if (action == 1) {
            m6297f(m6295d(this.f4796q.x));
            m6299h();
            return true;
        } else if (action == 2) {
            m6297f(m6295d(this.f4796q.x));
            return true;
        } else if (action != 3) {
            return false;
        } else {
            this.f4782c = false;
            this.f4783d = null;
            postInvalidate();
            return true;
        }
    }

    public CastSeekBar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4784e = new ArrayList();
        setAccessibilityDelegate(new C4685a(this, (C8562d) null));
        Paint paint = new Paint(1);
        this.f4790k = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f4785f = context.getResources().getDimension(C8140i.cast_seek_bar_minimum_width);
        this.f4786g = context.getResources().getDimension(C8140i.cast_seek_bar_minimum_height);
        this.f4787h = context.getResources().getDimension(C8140i.cast_seek_bar_progress_height) / 2.0f;
        this.f4788i = context.getResources().getDimension(C8140i.cast_seek_bar_thumb_size) / 2.0f;
        this.f4789j = context.getResources().getDimension(C8140i.cast_seek_bar_ad_break_minimum_width);
        C8561c cVar = new C8561c();
        this.f4781b = cVar;
        cVar.f12229b = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C8154n.f11474b, C8137h.castExpandedControllerStyle, C8152m.CastExpandedController);
        int resourceId = obtainStyledAttributes.getResourceId(C8154n.f11476d, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(C8154n.f11477e, 0);
        int resourceId3 = obtainStyledAttributes.getResourceId(C8154n.f11478f, 0);
        int resourceId4 = obtainStyledAttributes.getResourceId(C8154n.f11475c, 0);
        this.f4791l = context.getResources().getColor(resourceId);
        this.f4792m = context.getResources().getColor(resourceId2);
        this.f4793n = context.getResources().getColor(resourceId3);
        this.f4794o = context.getResources().getColor(resourceId4);
        obtainStyledAttributes.recycle();
    }
}
