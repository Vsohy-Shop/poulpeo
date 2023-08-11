package p197q1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.bumptech.glide.C4362b;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p044c1.C3865a;
import p058d1.C7226k;
import p197q1.C9107g;
import p294z1.C10791j;

/* renamed from: q1.c */
/* compiled from: GifDrawable */
public class C9102c extends Drawable implements C9107g.C9109b, Animatable, Animatable2Compat {

    /* renamed from: b */
    private final C9103a f13248b;

    /* renamed from: c */
    private boolean f13249c;

    /* renamed from: d */
    private boolean f13250d;

    /* renamed from: e */
    private boolean f13251e;

    /* renamed from: f */
    private boolean f13252f;

    /* renamed from: g */
    private int f13253g;

    /* renamed from: h */
    private int f13254h;

    /* renamed from: i */
    private boolean f13255i;

    /* renamed from: j */
    private Paint f13256j;

    /* renamed from: k */
    private Rect f13257k;

    /* renamed from: l */
    private List<Animatable2Compat.AnimationCallback> f13258l;

    /* renamed from: q1.c$a */
    /* compiled from: GifDrawable */
    static final class C9103a extends Drawable.ConstantState {
        @VisibleForTesting

        /* renamed from: a */
        final C9107g f13259a;

        C9103a(C9107g gVar) {
            this.f13259a = gVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        @NonNull
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @NonNull
        public Drawable newDrawable() {
            return new C9102c(this);
        }
    }

    public C9102c(Context context, C3865a aVar, C7226k<Bitmap> kVar, int i, int i2, Bitmap bitmap) {
        this(new C9103a(new C9107g(C4362b.m5041c(context), aVar, i, i2, kVar, bitmap)));
    }

    /* renamed from: b */
    private Drawable.Callback m18492b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    /* renamed from: d */
    private Rect m18493d() {
        if (this.f13257k == null) {
            this.f13257k = new Rect();
        }
        return this.f13257k;
    }

    /* renamed from: h */
    private Paint m18494h() {
        if (this.f13256j == null) {
            this.f13256j = new Paint(2);
        }
        return this.f13256j;
    }

    /* renamed from: j */
    private void m18495j() {
        List<Animatable2Compat.AnimationCallback> list = this.f13258l;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.f13258l.get(i).onAnimationEnd(this);
            }
        }
    }

    /* renamed from: l */
    private void m18496l() {
        this.f13253g = 0;
    }

    /* renamed from: n */
    private void m18497n() {
        C10791j.m22945a(!this.f13251e, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f13248b.f13259a.mo43358f() == 1) {
            invalidateSelf();
        } else if (!this.f13249c) {
            this.f13249c = true;
            this.f13248b.f13259a.mo43364r(this);
            invalidateSelf();
        }
    }

    /* renamed from: o */
    private void m18498o() {
        this.f13249c = false;
        this.f13248b.f13259a.mo43365s(this);
    }

    /* renamed from: a */
    public void mo43329a() {
        if (m18492b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (mo43334g() == mo43333f() - 1) {
            this.f13253g++;
        }
        int i = this.f13254h;
        if (i != -1 && this.f13253g >= i) {
            m18495j();
            stop();
        }
    }

    /* renamed from: c */
    public ByteBuffer mo43330c() {
        return this.f13248b.f13259a.mo43354b();
    }

    public void clearAnimationCallbacks() {
        List<Animatable2Compat.AnimationCallback> list = this.f13258l;
        if (list != null) {
            list.clear();
        }
    }

    public void draw(@NonNull Canvas canvas) {
        if (!this.f13251e) {
            if (this.f13255i) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m18493d());
                this.f13255i = false;
            }
            canvas.drawBitmap(this.f13248b.f13259a.mo43355c(), (Rect) null, m18493d(), m18494h());
        }
    }

    /* renamed from: e */
    public Bitmap mo43332e() {
        return this.f13248b.f13259a.mo43357e();
    }

    /* renamed from: f */
    public int mo43333f() {
        return this.f13248b.f13259a.mo43358f();
    }

    /* renamed from: g */
    public int mo43334g() {
        return this.f13248b.f13259a.mo43356d();
    }

    public Drawable.ConstantState getConstantState() {
        return this.f13248b;
    }

    public int getIntrinsicHeight() {
        return this.f13248b.f13259a.mo43359h();
    }

    public int getIntrinsicWidth() {
        return this.f13248b.f13259a.mo43361k();
    }

    public int getOpacity() {
        return -2;
    }

    /* renamed from: i */
    public int mo43339i() {
        return this.f13248b.f13259a.mo43360j();
    }

    public boolean isRunning() {
        return this.f13249c;
    }

    /* renamed from: k */
    public void mo43341k() {
        this.f13251e = true;
        this.f13248b.f13259a.mo43353a();
    }

    /* renamed from: m */
    public void mo43342m(C7226k<Bitmap> kVar, Bitmap bitmap) {
        this.f13248b.f13259a.mo43363o(kVar, bitmap);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f13255i = true;
    }

    public void registerAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        if (animationCallback != null) {
            if (this.f13258l == null) {
                this.f13258l = new ArrayList();
            }
            this.f13258l.add(animationCallback);
        }
    }

    public void setAlpha(int i) {
        m18494h().setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        m18494h().setColorFilter(colorFilter);
    }

    public boolean setVisible(boolean z, boolean z2) {
        C10791j.m22945a(!this.f13251e, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f13252f = z;
        if (!z) {
            m18498o();
        } else if (this.f13250d) {
            m18497n();
        }
        return super.setVisible(z, z2);
    }

    public void start() {
        this.f13250d = true;
        m18496l();
        if (this.f13252f) {
            m18497n();
        }
    }

    public void stop() {
        this.f13250d = false;
        m18498o();
    }

    public boolean unregisterAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        List<Animatable2Compat.AnimationCallback> list = this.f13258l;
        if (list == null || animationCallback == null) {
            return false;
        }
        return list.remove(animationCallback);
    }

    C9102c(C9103a aVar) {
        this.f13252f = true;
        this.f13254h = -1;
        this.f13248b = (C9103a) C10791j.m22948d(aVar);
    }
}
