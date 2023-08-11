package p289y7;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.drawable.DrawableCompat;
import java.util.Map;
import p101g8.C7796a;
import p101g8.C7805d;
import p101g8.C7817i;
import p278x7.C10582l;
import p278x7.C10584m;

/* renamed from: y7.c */
/* compiled from: BindingWrapper */
public abstract class C10703c {

    /* renamed from: a */
    protected final C7817i f16287a;

    /* renamed from: b */
    final C10582l f16288b;

    /* renamed from: c */
    final LayoutInflater f16289c;

    protected C10703c(C10582l lVar, LayoutInflater layoutInflater, C7817i iVar) {
        this.f16288b = lVar;
        this.f16289c = layoutInflater;
        this.f16287a = iVar;
    }

    /* renamed from: i */
    public static void m22775i(Button button, String str) {
        try {
            Drawable wrap = DrawableCompat.wrap(button.getBackground());
            DrawableCompat.setTint(wrap, Color.parseColor(str));
            button.setBackground(wrap);
        } catch (IllegalArgumentException e) {
            C10584m.m22519e("Error parsing background color: " + e.toString());
        }
    }

    /* renamed from: k */
    public static void m22776k(Button button, C7805d dVar) {
        String b = dVar.mo41477c().mo41529b();
        m22775i(button, dVar.mo41476b());
        button.setText(dVar.mo41477c().mo41530c());
        button.setTextColor(Color.parseColor(b));
    }

    /* renamed from: a */
    public boolean mo45623a() {
        return false;
    }

    @NonNull
    /* renamed from: b */
    public C10582l mo45624b() {
        return this.f16288b;
    }

    @NonNull
    /* renamed from: c */
    public abstract View mo45625c();

    @Nullable
    /* renamed from: d */
    public View.OnClickListener mo45626d() {
        return null;
    }

    @NonNull
    /* renamed from: e */
    public abstract ImageView mo45627e();

    @NonNull
    /* renamed from: f */
    public abstract ViewGroup mo45628f();

    @Nullable
    /* renamed from: g */
    public abstract ViewTreeObserver.OnGlobalLayoutListener mo45629g(Map<C7796a, View.OnClickListener> map, View.OnClickListener onClickListener);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo45631h(@Nullable Button button, View.OnClickListener onClickListener) {
        if (button != null) {
            button.setOnClickListener(onClickListener);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo45632j(@Nullable View view, @Nullable String str) {
        if (view != null && !TextUtils.isEmpty(str)) {
            try {
                view.setBackgroundColor(Color.parseColor(str));
            } catch (IllegalArgumentException e) {
                C10584m.m22519e("Error parsing background color: " + e.toString() + " color: " + str);
            }
        }
    }
}
