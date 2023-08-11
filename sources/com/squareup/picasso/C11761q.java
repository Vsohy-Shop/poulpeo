package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import com.squareup.picasso.C11751p;

/* renamed from: com.squareup.picasso.q */
/* compiled from: PicassoDrawable */
final class C11761q extends BitmapDrawable {

    /* renamed from: h */
    private static final Paint f18326h = new Paint();

    /* renamed from: a */
    private final boolean f18327a;

    /* renamed from: b */
    private final float f18328b;

    /* renamed from: c */
    private final C11751p.C11757e f18329c;

    /* renamed from: d */
    Drawable f18330d;

    /* renamed from: e */
    long f18331e;

    /* renamed from: f */
    boolean f18332f;

    /* renamed from: g */
    int f18333g = 255;

    C11761q(Context context, Bitmap bitmap, Drawable drawable, C11751p.C11757e eVar, boolean z, boolean z2) {
        super(context.getResources(), bitmap);
        boolean z3;
        this.f18327a = z2;
        this.f18328b = context.getResources().getDisplayMetrics().density;
        this.f18329c = eVar;
        if (eVar == C11751p.C11757e.MEMORY || z) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            this.f18330d = drawable;
            this.f18332f = true;
            this.f18331e = SystemClock.uptimeMillis();
        }
    }

    /* renamed from: a */
    private void m25241a(Canvas canvas) {
        Paint paint = f18326h;
        paint.setColor(-1);
        canvas.drawPath(m25242b(0, 0, (int) (this.f18328b * 16.0f)), paint);
        paint.setColor(this.f18329c.f18320b);
        canvas.drawPath(m25242b(0, 0, (int) (this.f18328b * 15.0f)), paint);
    }

    /* renamed from: b */
    private static Path m25242b(int i, int i2, int i3) {
        Path path = new Path();
        float f = (float) i;
        float f2 = (float) i2;
        path.moveTo(f, f2);
        path.lineTo((float) (i + i3), f2);
        path.lineTo(f, (float) (i2 + i3));
        return path;
    }

    /* renamed from: c */
    static void m25243c(ImageView imageView, Context context, Bitmap bitmap, C11751p.C11757e eVar, boolean z, boolean z2) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        imageView.setImageDrawable(new C11761q(context, bitmap, drawable, eVar, z, z2));
    }

    /* renamed from: d */
    static void m25244d(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof Animatable) {
            ((Animatable) imageView.getDrawable()).start();
        }
    }

    public void draw(Canvas canvas) {
        if (!this.f18332f) {
            super.draw(canvas);
        } else {
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.f18331e)) / 200.0f;
            if (uptimeMillis >= 1.0f) {
                this.f18332f = false;
                this.f18330d = null;
                super.draw(canvas);
            } else {
                Drawable drawable = this.f18330d;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                super.setAlpha((int) (((float) this.f18333g) * uptimeMillis));
                super.draw(canvas);
                super.setAlpha(this.f18333g);
            }
        }
        if (this.f18327a) {
            m25241a(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f18330d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    public void setAlpha(int i) {
        this.f18333g = i;
        Drawable drawable = this.f18330d;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        super.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f18330d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
