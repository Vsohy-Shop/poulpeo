package p293z0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.core.view.GravityCompat;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p018a0.C2111i;
import p126j0.C8266c;
import p238u0.C9783d;
import p404of.C13074a;

/* renamed from: z0.c */
/* compiled from: InAppMessageViewUtils.kt */
public final class C10762c {

    /* renamed from: a */
    public static final C10762c f16461a = new C10762c();

    /* renamed from: z0.c$a */
    /* compiled from: InAppMessageViewUtils.kt */
    static final class C10763a extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10763a f16462g = new C10763a();

        C10763a() {
            super(0);
        }

        public final String invoke() {
            return "Back button intercepted by in-app message view, closing in-app message.";
        }
    }

    /* renamed from: z0.c$b */
    /* compiled from: InAppMessageViewUtils.kt */
    static final class C10764b extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10764b f16463g = new C10764b();

        C10764b() {
            super(0);
        }

        public final String invoke() {
            return "LayerDrawable for button background did not have the expected number of layers or the 0th layer was not a GradientDrawable.";
        }
    }

    /* renamed from: z0.c$c */
    /* compiled from: InAppMessageViewUtils.kt */
    static final class C10765c extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10765c f16464g = new C10765c();

        C10765c() {
            super(0);
        }

        public final String invoke() {
            return "Caught exception setting icon typeface. Not rendering icon.";
        }
    }

    private C10762c() {
    }

    /* renamed from: a */
    public static final void m22900a() {
        C8266c.m16396e(C8266c.f11641a, f16461a, (C8266c.C8267a) null, (Throwable) null, false, C10763a.f16462g, 7, (Object) null);
        C9783d.f14623G.mo44312a().mo44302B(true);
    }

    /* renamed from: b */
    public static final void m22901b(TextView textView, TextView textView2) {
        if (textView2 == null && textView != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(textView.getLayoutParams().width, textView.getLayoutParams().height);
            layoutParams.setMargins(0, 0, 0, 0);
            textView.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: c */
    public static final void m22902c(Drawable drawable, @ColorInt int i) {
        C12775o.m28639i(drawable, "drawable");
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            if (layerDrawable.getNumberOfLayers() <= 0 || !(layerDrawable.getDrawable(0) instanceof GradientDrawable)) {
                C8266c.m16396e(C8266c.f11641a, f16461a, (C8266c.C8267a) null, (Throwable) null, false, C10764b.f16463g, 7, (Object) null);
            } else {
                Drawable drawable2 = layerDrawable.getDrawable(0);
                C12775o.m28638h(drawable2, "drawable.getDrawable(0)");
                m22902c(drawable2, i);
            }
        }
        if (drawable instanceof GradientDrawable) {
            ((GradientDrawable) drawable).setColor(i);
        } else {
            f16461a.m22903d(drawable, i);
        }
    }

    /* renamed from: d */
    private final void m22903d(Drawable drawable, @ColorInt int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            drawable.setColorFilter(new BlendModeColorFilter(i, BlendMode.SRC_ATOP));
        } else {
            drawable.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        }
    }

    /* renamed from: e */
    public static final void m22904e(View view, Integer num) {
        C12775o.m28639i(view, "view");
        if (num != null) {
            view.setBackgroundColor(num.intValue());
        }
    }

    /* renamed from: f */
    public static final void m22905f(Context context, String str, int i, int i2, TextView textView) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(textView, "textView");
        if (str != null) {
            try {
                textView.setTypeface(Typeface.createFromAsset(context.getAssets(), "fontawesome-webfont.ttf"));
                textView.setText(str);
                m22908i(textView, i);
                if (textView.getBackground() != null) {
                    Drawable background = textView.getBackground();
                    C12775o.m28638h(background, "textView.background");
                    m22902c(background, i2);
                    return;
                }
                m22909j(textView, i2);
            } catch (Exception e) {
                C8266c.m16396e(C8266c.f11641a, f16461a, C8266c.C8267a.f11649e, e, false, C10765c.f16464g, 4, (Object) null);
            }
        }
    }

    /* renamed from: g */
    public static final void m22906g(Bitmap bitmap, ImageView imageView) {
        C12775o.m28639i(imageView, "imageView");
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    /* renamed from: h */
    public static final void m22907h(TextView textView, C2111i iVar) {
        C12775o.m28639i(textView, "textView");
        C12775o.m28639i(iVar, "textAlign");
        if (iVar == C2111i.START) {
            textView.setGravity(8388611);
        } else if (iVar == C2111i.END) {
            textView.setGravity(GravityCompat.END);
        } else if (iVar == C2111i.CENTER) {
            textView.setGravity(17);
        }
    }

    /* renamed from: i */
    public static final void m22908i(TextView textView, int i) {
        C12775o.m28639i(textView, "textView");
        textView.setTextColor(i);
    }

    /* renamed from: j */
    public static final void m22909j(View view, int i) {
        C12775o.m28639i(view, "view");
        view.setBackgroundColor(i);
    }

    /* renamed from: k */
    public static final void m22910k(View view, @ColorInt int i) {
        C12775o.m28639i(view, "view");
        C10762c cVar = f16461a;
        Drawable background = view.getBackground();
        C12775o.m28638h(background, "view.background");
        cVar.m22903d(background, i);
        view.getBackground().setAlpha(Color.alpha(i));
    }
}
