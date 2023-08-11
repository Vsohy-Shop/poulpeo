package p289y7;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.firebase.inappmessaging.display.internal.layout.FiamRelativeLayout;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;
import p101g8.C7796a;
import p101g8.C7817i;
import p101g8.C7818j;
import p256v7.C10044f;
import p256v7.C10045g;
import p278x7.C10582l;

/* renamed from: y7.h */
/* compiled from: ModalBindingWrapper */
public class C10709h extends C10703c {

    /* renamed from: d */
    private FiamRelativeLayout f16312d;

    /* renamed from: e */
    private ViewGroup f16313e;

    /* renamed from: f */
    private ScrollView f16314f;

    /* renamed from: g */
    private Button f16315g;

    /* renamed from: h */
    private View f16316h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public ImageView f16317i;

    /* renamed from: j */
    private TextView f16318j;

    /* renamed from: k */
    private TextView f16319k;

    /* renamed from: l */
    private C7818j f16320l;

    /* renamed from: m */
    private ViewTreeObserver.OnGlobalLayoutListener f16321m = new C10710a();

    /* renamed from: y7.h$a */
    /* compiled from: ModalBindingWrapper */
    public class C10710a implements ViewTreeObserver.OnGlobalLayoutListener {
        public C10710a() {
        }

        public void onGlobalLayout() {
            C10709h.this.f16317i.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C10709h(C10582l lVar, LayoutInflater layoutInflater, C7817i iVar) {
        super(lVar, layoutInflater, iVar);
    }

    /* renamed from: m */
    private void m22809m(Map<C7796a, View.OnClickListener> map) {
        C7796a e = this.f16320l.mo41516e();
        if (e == null || e.mo41447c() == null || TextUtils.isEmpty(e.mo41447c().mo41477c().mo41530c())) {
            this.f16315g.setVisibility(8);
            return;
        }
        C10703c.m22776k(this.f16315g, e.mo41447c());
        mo45631h(this.f16315g, map.get(this.f16320l.mo41516e()));
        this.f16315g.setVisibility(0);
    }

    /* renamed from: n */
    private void m22810n(View.OnClickListener onClickListener) {
        this.f16316h.setOnClickListener(onClickListener);
        this.f16312d.setDismissListener(onClickListener);
    }

    /* renamed from: o */
    private void m22811o(C10582l lVar) {
        this.f16317i.setMaxHeight(lVar.mo45516r());
        this.f16317i.setMaxWidth(lVar.mo45517s());
    }

    /* renamed from: p */
    private void m22812p(C7818j jVar) {
        if (jVar.mo41463b() == null || TextUtils.isEmpty(jVar.mo41463b().mo41503b())) {
            this.f16317i.setVisibility(8);
        } else {
            this.f16317i.setVisibility(0);
        }
        if (jVar.mo41520h() != null) {
            if (!TextUtils.isEmpty(jVar.mo41520h().mo41530c())) {
                this.f16319k.setVisibility(0);
                this.f16319k.setText(jVar.mo41520h().mo41530c());
            } else {
                this.f16319k.setVisibility(8);
            }
            if (!TextUtils.isEmpty(jVar.mo41520h().mo41529b())) {
                this.f16319k.setTextColor(Color.parseColor(jVar.mo41520h().mo41529b()));
            }
        }
        if (jVar.mo41519g() == null || TextUtils.isEmpty(jVar.mo41519g().mo41530c())) {
            this.f16314f.setVisibility(8);
            this.f16318j.setVisibility(8);
            return;
        }
        this.f16314f.setVisibility(0);
        this.f16318j.setVisibility(0);
        this.f16318j.setTextColor(Color.parseColor(jVar.mo41519g().mo41529b()));
        this.f16318j.setText(jVar.mo41519g().mo41530c());
    }

    @NonNull
    /* renamed from: b */
    public C10582l mo45624b() {
        return this.f16288b;
    }

    @NonNull
    /* renamed from: c */
    public View mo45625c() {
        return this.f16313e;
    }

    @NonNull
    /* renamed from: e */
    public ImageView mo45627e() {
        return this.f16317i;
    }

    @NonNull
    /* renamed from: f */
    public ViewGroup mo45628f() {
        return this.f16312d;
    }

    @NonNull
    /* renamed from: g */
    public ViewTreeObserver.OnGlobalLayoutListener mo45629g(Map<C7796a, View.OnClickListener> map, View.OnClickListener onClickListener) {
        View inflate = this.f16289c.inflate(C10045g.modal, (ViewGroup) null);
        this.f16314f = (ScrollView) inflate.findViewById(C10044f.body_scroll);
        this.f16315g = (Button) inflate.findViewById(C10044f.f15147h);
        this.f16316h = inflate.findViewById(C10044f.collapse_button);
        this.f16317i = (ImageView) inflate.findViewById(C10044f.image_view);
        this.f16318j = (TextView) inflate.findViewById(C10044f.message_body);
        this.f16319k = (TextView) inflate.findViewById(C10044f.message_title);
        this.f16312d = (FiamRelativeLayout) inflate.findViewById(C10044f.modal_root);
        this.f16313e = (ViewGroup) inflate.findViewById(C10044f.modal_content_root);
        if (this.f16287a.mo41515c().equals(MessageType.MODAL)) {
            C7818j jVar = (C7818j) this.f16287a;
            this.f16320l = jVar;
            m22812p(jVar);
            m22809m(map);
            m22811o(this.f16288b);
            m22810n(onClickListener);
            mo45632j(this.f16313e, this.f16320l.mo41518f());
        }
        return this.f16321m;
    }
}
