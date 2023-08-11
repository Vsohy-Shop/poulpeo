package p135k;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p115i.C8044h;
import p215s.C9413h;

@SourceDebugExtension({"SMAP\nCrossfadeDrawable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrossfadeDrawable.kt\ncoil/drawable/CrossfadeDrawable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Canvas.kt\nandroidx/core/graphics/CanvasKt\n+ 4 Collections.kt\ncoil/util/-Collections\n*L\n1#1,277:1\n1#2:278\n30#3,7:279\n30#3,7:286\n30#3,7:293\n30#3,7:300\n12#4,4:307\n12#4,4:311\n*S KotlinDebug\n*F\n+ 1 CrossfadeDrawable.kt\ncoil/drawable/CrossfadeDrawable\n*L\n71#1:279,7\n79#1:286,7\n93#1:293,7\n100#1:300,7\n211#1:307,4\n266#1:311,4\n*E\n"})
/* renamed from: k.b */
/* compiled from: CrossfadeDrawable.kt */
public final class C8427b extends Drawable implements Drawable.Callback, Animatable2Compat {

    /* renamed from: n */
    public static final C8428a f12002n = new C8428a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final C9413h f12003b;

    /* renamed from: c */
    private final int f12004c;

    /* renamed from: d */
    private final boolean f12005d;

    /* renamed from: e */
    private final boolean f12006e;

    /* renamed from: f */
    private final List<Animatable2Compat.AnimationCallback> f12007f = new ArrayList();

    /* renamed from: g */
    private final int f12008g;

    /* renamed from: h */
    private final int f12009h;

    /* renamed from: i */
    private long f12010i;

    /* renamed from: j */
    private int f12011j;

    /* renamed from: k */
    private int f12012k;

    /* renamed from: l */
    private Drawable f12013l;

    /* renamed from: m */
    private final Drawable f12014m;

    /* renamed from: k.b$a */
    /* compiled from: CrossfadeDrawable.kt */
    public static final class C8428a {
        private C8428a() {
        }

        public /* synthetic */ C8428a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C8427b(Drawable drawable, Drawable drawable2, C9413h hVar, int i, boolean z, boolean z2) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Drawable drawable3;
        boolean z3;
        this.f12003b = hVar;
        this.f12004c = i;
        this.f12005d = z;
        this.f12006e = z2;
        Drawable drawable4 = null;
        if (drawable != null) {
            num = Integer.valueOf(drawable.getIntrinsicWidth());
        } else {
            num = null;
        }
        if (drawable2 != null) {
            num2 = Integer.valueOf(drawable2.getIntrinsicWidth());
        } else {
            num2 = null;
        }
        this.f12008g = m16851a(num, num2);
        if (drawable != null) {
            num3 = Integer.valueOf(drawable.getIntrinsicHeight());
        } else {
            num3 = null;
        }
        if (drawable2 != null) {
            num4 = Integer.valueOf(drawable2.getIntrinsicHeight());
        } else {
            num4 = null;
        }
        this.f12009h = m16851a(num3, num4);
        this.f12011j = 255;
        if (drawable != null) {
            drawable3 = drawable.mutate();
        } else {
            drawable3 = null;
        }
        this.f12013l = drawable3;
        drawable4 = drawable2 != null ? drawable2.mutate() : drawable4;
        this.f12014m = drawable4;
        if (i > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            Drawable drawable5 = this.f12013l;
            if (drawable5 != null) {
                drawable5.setCallback(this);
            }
            if (drawable4 != null) {
                drawable4.setCallback(this);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("durationMillis must be > 0.".toString());
    }

    /* renamed from: a */
    private final int m16851a(Integer num, Integer num2) {
        int i;
        int i2 = -1;
        if (!this.f12006e && ((num != null && num.intValue() == -1) || (num2 != null && num2.intValue() == -1))) {
            return -1;
        }
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        if (num2 != null) {
            i2 = num2.intValue();
        }
        return Math.max(i, i2);
    }

    /* renamed from: b */
    private final void m16852b() {
        this.f12012k = 2;
        this.f12013l = null;
        List<Animatable2Compat.AnimationCallback> list = this.f12007f;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).onAnimationEnd(this);
        }
    }

    @VisibleForTesting
    /* renamed from: c */
    public final void mo42429c(Drawable drawable, Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            return;
        }
        int width = rect.width();
        int height = rect.height();
        double c = C8044h.m15819c(intrinsicWidth, intrinsicHeight, width, height, this.f12003b);
        double d = (double) 2;
        int b = C13265c.m30133b((((double) width) - (((double) intrinsicWidth) * c)) / d);
        int b2 = C13265c.m30133b((((double) height) - (c * ((double) intrinsicHeight))) / d);
        drawable.setBounds(rect.left + b, rect.top + b2, rect.right - b, rect.bottom - b2);
    }

    public void clearAnimationCallbacks() {
        this.f12007f.clear();
    }

    public void draw(Canvas canvas) {
        boolean z;
        Drawable drawable;
        int i = this.f12012k;
        if (i == 0) {
            Drawable drawable2 = this.f12013l;
            if (drawable2 != null) {
                drawable2.setAlpha(this.f12011j);
                int save = canvas.save();
                try {
                    drawable2.draw(canvas);
                } finally {
                    canvas.restoreToCount(save);
                }
            }
        } else if (i == 2) {
            Drawable drawable3 = this.f12014m;
            if (drawable3 != null) {
                drawable3.setAlpha(this.f12011j);
                int save2 = canvas.save();
                try {
                    drawable3.draw(canvas);
                } finally {
                    canvas.restoreToCount(save2);
                }
            }
        } else {
            double uptimeMillis = ((double) (SystemClock.uptimeMillis() - this.f12010i)) / ((double) this.f12004c);
            double k = C13537l.m30884k(uptimeMillis, 0.0d, 1.0d);
            int i2 = this.f12011j;
            int i3 = (int) (k * ((double) i2));
            if (this.f12005d) {
                i2 -= i3;
            }
            if (uptimeMillis >= 1.0d) {
                z = true;
            } else {
                z = false;
            }
            if (!z && (drawable = this.f12013l) != null) {
                drawable.setAlpha(i2);
                int save3 = canvas.save();
                try {
                    drawable.draw(canvas);
                } finally {
                    canvas.restoreToCount(save3);
                }
            }
            Drawable drawable4 = this.f12014m;
            if (drawable4 != null) {
                drawable4.setAlpha(i3);
                int save4 = canvas.save();
                try {
                    drawable4.draw(canvas);
                } finally {
                    canvas.restoreToCount(save4);
                }
            }
            if (z) {
                m16852b();
            } else {
                invalidateSelf();
            }
        }
    }

    public int getAlpha() {
        return this.f12011j;
    }

    public ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        Drawable drawable;
        int i = this.f12012k;
        if (i == 0) {
            Drawable drawable2 = this.f12013l;
            if (drawable2 != null) {
                return drawable2.getColorFilter();
            }
            return null;
        } else if (i == 1) {
            Drawable drawable3 = this.f12014m;
            if (drawable3 != null && (colorFilter = drawable3.getColorFilter()) != null) {
                return colorFilter;
            }
            Drawable drawable4 = this.f12013l;
            if (drawable4 != null) {
                return drawable4.getColorFilter();
            }
            return null;
        } else if (i == 2 && (drawable = this.f12014m) != null) {
            return drawable.getColorFilter();
        } else {
            return null;
        }
    }

    public int getIntrinsicHeight() {
        return this.f12009h;
    }

    public int getIntrinsicWidth() {
        return this.f12008g;
    }

    public int getOpacity() {
        Drawable drawable = this.f12013l;
        Drawable drawable2 = this.f12014m;
        int i = this.f12012k;
        if (i == 0) {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            return -2;
        } else if (i == 2) {
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        } else if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        } else {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isRunning() {
        if (this.f12012k == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f12013l;
        if (drawable != null) {
            mo42429c(drawable, rect);
        }
        Drawable drawable2 = this.f12014m;
        if (drawable2 != null) {
            mo42429c(drawable2, rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        boolean z;
        boolean z2;
        Drawable drawable = this.f12013l;
        if (drawable != null) {
            z = drawable.setLevel(i);
        } else {
            z = false;
        }
        Drawable drawable2 = this.f12014m;
        if (drawable2 != null) {
            z2 = drawable2.setLevel(i);
        } else {
            z2 = false;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z;
        boolean z2;
        Drawable drawable = this.f12013l;
        if (drawable != null) {
            z = drawable.setState(iArr);
        } else {
            z = false;
        }
        Drawable drawable2 = this.f12014m;
        if (drawable2 != null) {
            z2 = drawable2.setState(iArr);
        } else {
            z2 = false;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }

    public void registerAnimationCallback(Animatable2Compat.AnimationCallback animationCallback) {
        this.f12007f.add(animationCallback);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        boolean z = false;
        if (i >= 0 && i < 256) {
            z = true;
        }
        if (z) {
            this.f12011j = i;
            return;
        }
        throw new IllegalArgumentException(("Invalid alpha: " + i).toString());
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f12013l;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f12014m;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
    }

    public void setTint(int i) {
        Drawable drawable = this.f12013l;
        if (drawable != null) {
            drawable.setTint(i);
        }
        Drawable drawable2 = this.f12014m;
        if (drawable2 != null) {
            drawable2.setTint(i);
        }
    }

    @RequiresApi(29)
    public void setTintBlendMode(BlendMode blendMode) {
        Drawable drawable = this.f12013l;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.f12014m;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f12013l;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.f12014m;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f12013l;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.f12014m;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void start() {
        /*
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.f12013l
            boolean r1 = r0 instanceof android.graphics.drawable.Animatable
            r2 = 0
            if (r1 == 0) goto L_0x000a
            android.graphics.drawable.Animatable r0 = (android.graphics.drawable.Animatable) r0
            goto L_0x000b
        L_0x000a:
            r0 = r2
        L_0x000b:
            if (r0 == 0) goto L_0x0010
            r0.start()
        L_0x0010:
            android.graphics.drawable.Drawable r0 = r4.f12014m
            boolean r1 = r0 instanceof android.graphics.drawable.Animatable
            if (r1 == 0) goto L_0x0019
            r2 = r0
            android.graphics.drawable.Animatable r2 = (android.graphics.drawable.Animatable) r2
        L_0x0019:
            if (r2 == 0) goto L_0x001e
            r2.start()
        L_0x001e:
            int r0 = r4.f12012k
            if (r0 == 0) goto L_0x0023
            return
        L_0x0023:
            r0 = 1
            r4.f12012k = r0
            long r0 = android.os.SystemClock.uptimeMillis()
            r4.f12010i = r0
            java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r0 = r4.f12007f
            int r1 = r0.size()
            r2 = 0
        L_0x0033:
            if (r2 >= r1) goto L_0x0041
            java.lang.Object r3 = r0.get(r2)
            androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback r3 = (androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback) r3
            r3.onAnimationStart(r4)
            int r2 = r2 + 1
            goto L_0x0033
        L_0x0041:
            r4.invalidateSelf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p135k.C8427b.start():void");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void stop() {
        /*
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.f12013l
            boolean r1 = r0 instanceof android.graphics.drawable.Animatable
            r2 = 0
            if (r1 == 0) goto L_0x000a
            android.graphics.drawable.Animatable r0 = (android.graphics.drawable.Animatable) r0
            goto L_0x000b
        L_0x000a:
            r0 = r2
        L_0x000b:
            if (r0 == 0) goto L_0x0010
            r0.stop()
        L_0x0010:
            android.graphics.drawable.Drawable r0 = r3.f12014m
            boolean r1 = r0 instanceof android.graphics.drawable.Animatable
            if (r1 == 0) goto L_0x0019
            r2 = r0
            android.graphics.drawable.Animatable r2 = (android.graphics.drawable.Animatable) r2
        L_0x0019:
            if (r2 == 0) goto L_0x001e
            r2.stop()
        L_0x001e:
            int r0 = r3.f12012k
            r1 = 2
            if (r0 == r1) goto L_0x0026
            r3.m16852b()
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p135k.C8427b.stop():void");
    }

    public boolean unregisterAnimationCallback(Animatable2Compat.AnimationCallback animationCallback) {
        return this.f12007f.remove(animationCallback);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
