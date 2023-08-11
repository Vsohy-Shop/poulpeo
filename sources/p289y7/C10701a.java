package p289y7;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.firebase.inappmessaging.display.internal.ResizableImageView;
import com.google.firebase.inappmessaging.display.internal.layout.FiamFrameLayout;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;
import p101g8.C7796a;
import p101g8.C7802c;
import p101g8.C7817i;
import p256v7.C10044f;
import p256v7.C10045g;
import p278x7.C10582l;

/* renamed from: y7.a */
/* compiled from: BannerBindingWrapper */
public class C10701a extends C10703c {

    /* renamed from: d */
    private FiamFrameLayout f16278d;

    /* renamed from: e */
    private ViewGroup f16279e;

    /* renamed from: f */
    private TextView f16280f;

    /* renamed from: g */
    private ResizableImageView f16281g;

    /* renamed from: h */
    private TextView f16282h;

    /* renamed from: i */
    private View.OnClickListener f16283i;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C10701a(C10582l lVar, LayoutInflater layoutInflater, C7817i iVar) {
        super(lVar, layoutInflater, iVar);
    }

    /* renamed from: l */
    private void m22761l(View.OnClickListener onClickListener) {
        this.f16279e.setOnClickListener(onClickListener);
    }

    /* renamed from: m */
    private void m22762m(C10582l lVar) {
        int min = Math.min(lVar.mo45519u().intValue(), lVar.mo45518t().intValue());
        ViewGroup.LayoutParams layoutParams = this.f16278d.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        layoutParams.width = min;
        this.f16278d.setLayoutParams(layoutParams);
        this.f16281g.setMaxHeight(lVar.mo45516r());
        this.f16281g.setMaxWidth(lVar.mo45517s());
    }

    /* renamed from: n */
    private void m22763n(@NonNull C7802c cVar) {
        int i;
        if (!TextUtils.isEmpty(cVar.mo41466f())) {
            mo45632j(this.f16279e, cVar.mo41466f());
        }
        ResizableImageView resizableImageView = this.f16281g;
        if (cVar.mo41463b() == null || TextUtils.isEmpty(cVar.mo41463b().mo41503b())) {
            i = 8;
        } else {
            i = 0;
        }
        resizableImageView.setVisibility(i);
        if (cVar.mo41468h() != null) {
            if (!TextUtils.isEmpty(cVar.mo41468h().mo41530c())) {
                this.f16282h.setText(cVar.mo41468h().mo41530c());
            }
            if (!TextUtils.isEmpty(cVar.mo41468h().mo41529b())) {
                this.f16282h.setTextColor(Color.parseColor(cVar.mo41468h().mo41529b()));
            }
        }
        if (cVar.mo41467g() != null) {
            if (!TextUtils.isEmpty(cVar.mo41467g().mo41530c())) {
                this.f16280f.setText(cVar.mo41467g().mo41530c());
            }
            if (!TextUtils.isEmpty(cVar.mo41467g().mo41529b())) {
                this.f16280f.setTextColor(Color.parseColor(cVar.mo41467g().mo41529b()));
            }
        }
    }

    /* renamed from: o */
    private void m22764o(View.OnClickListener onClickListener) {
        this.f16283i = onClickListener;
        this.f16278d.setDismissListener(onClickListener);
    }

    /* renamed from: a */
    public boolean mo45623a() {
        return true;
    }

    @NonNull
    /* renamed from: b */
    public C10582l mo45624b() {
        return this.f16288b;
    }

    @NonNull
    /* renamed from: c */
    public View mo45625c() {
        return this.f16279e;
    }

    @Nullable
    /* renamed from: d */
    public View.OnClickListener mo45626d() {
        return this.f16283i;
    }

    @NonNull
    /* renamed from: e */
    public ImageView mo45627e() {
        return this.f16281g;
    }

    @NonNull
    /* renamed from: f */
    public ViewGroup mo45628f() {
        return this.f16278d;
    }

    @Nullable
    /* renamed from: g */
    public ViewTreeObserver.OnGlobalLayoutListener mo45629g(Map<C7796a, View.OnClickListener> map, View.OnClickListener onClickListener) {
        View inflate = this.f16289c.inflate(C10045g.banner, (ViewGroup) null);
        this.f16278d = (FiamFrameLayout) inflate.findViewById(C10044f.banner_root);
        this.f16279e = (ViewGroup) inflate.findViewById(C10044f.banner_content_root);
        this.f16280f = (TextView) inflate.findViewById(C10044f.banner_body);
        this.f16281g = (ResizableImageView) inflate.findViewById(C10044f.banner_image);
        this.f16282h = (TextView) inflate.findViewById(C10044f.banner_title);
        if (this.f16287a.mo41515c().equals(MessageType.BANNER)) {
            C7802c cVar = (C7802c) this.f16287a;
            m22763n(cVar);
            m22762m(this.f16288b);
            m22764o(onClickListener);
            m22761l(map.get(cVar.mo41464e()));
        }
        return null;
    }
}
