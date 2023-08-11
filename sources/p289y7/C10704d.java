package p289y7;

import android.graphics.Color;
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
import com.google.firebase.inappmessaging.display.internal.layout.C6938a;
import com.google.firebase.inappmessaging.display.internal.layout.FiamCardView;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;
import p101g8.C7796a;
import p101g8.C7809f;
import p101g8.C7817i;
import p256v7.C10044f;
import p256v7.C10045g;
import p278x7.C10582l;

/* renamed from: y7.d */
/* compiled from: CardBindingWrapper */
public class C10704d extends C10703c {

    /* renamed from: d */
    private FiamCardView f16290d;

    /* renamed from: e */
    private C6938a f16291e;

    /* renamed from: f */
    private ScrollView f16292f;

    /* renamed from: g */
    private Button f16293g;

    /* renamed from: h */
    private Button f16294h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public ImageView f16295i;

    /* renamed from: j */
    private TextView f16296j;

    /* renamed from: k */
    private TextView f16297k;

    /* renamed from: l */
    private C7809f f16298l;

    /* renamed from: m */
    private View.OnClickListener f16299m;

    /* renamed from: n */
    private ViewTreeObserver.OnGlobalLayoutListener f16300n = new C10705a();

    /* renamed from: y7.d$a */
    /* compiled from: CardBindingWrapper */
    public class C10705a implements ViewTreeObserver.OnGlobalLayoutListener {
        public C10705a() {
        }

        public void onGlobalLayout() {
            C10704d.this.f16295i.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C10704d(C10582l lVar, LayoutInflater layoutInflater, C7817i iVar) {
        super(lVar, layoutInflater, iVar);
    }

    /* renamed from: m */
    private void m22787m(Map<C7796a, View.OnClickListener> map) {
        C7796a i = this.f16298l.mo41492i();
        C7796a j = this.f16298l.mo41493j();
        C10703c.m22776k(this.f16293g, i.mo41447c());
        mo45631h(this.f16293g, map.get(i));
        this.f16293g.setVisibility(0);
        if (j == null || j.mo41447c() == null) {
            this.f16294h.setVisibility(8);
            return;
        }
        C10703c.m22776k(this.f16294h, j.mo41447c());
        mo45631h(this.f16294h, map.get(j));
        this.f16294h.setVisibility(0);
    }

    /* renamed from: n */
    private void m22788n(View.OnClickListener onClickListener) {
        this.f16299m = onClickListener;
        this.f16290d.setDismissListener(onClickListener);
    }

    /* renamed from: o */
    private void m22789o(C7809f fVar) {
        if (fVar.mo41490h() == null && fVar.mo41489g() == null) {
            this.f16295i.setVisibility(8);
        } else {
            this.f16295i.setVisibility(0);
        }
    }

    /* renamed from: p */
    private void m22790p(C10582l lVar) {
        this.f16295i.setMaxHeight(lVar.mo45516r());
        this.f16295i.setMaxWidth(lVar.mo45517s());
    }

    /* renamed from: q */
    private void m22791q(C7809f fVar) {
        this.f16297k.setText(fVar.mo41494k().mo41530c());
        this.f16297k.setTextColor(Color.parseColor(fVar.mo41494k().mo41529b()));
        if (fVar.mo41488f() == null || fVar.mo41488f().mo41530c() == null) {
            this.f16292f.setVisibility(8);
            this.f16296j.setVisibility(8);
            return;
        }
        this.f16292f.setVisibility(0);
        this.f16296j.setVisibility(0);
        this.f16296j.setText(fVar.mo41488f().mo41530c());
        this.f16296j.setTextColor(Color.parseColor(fVar.mo41488f().mo41529b()));
    }

    @NonNull
    /* renamed from: b */
    public C10582l mo45624b() {
        return this.f16288b;
    }

    @NonNull
    /* renamed from: c */
    public View mo45625c() {
        return this.f16291e;
    }

    @NonNull
    /* renamed from: d */
    public View.OnClickListener mo45626d() {
        return this.f16299m;
    }

    @NonNull
    /* renamed from: e */
    public ImageView mo45627e() {
        return this.f16295i;
    }

    @NonNull
    /* renamed from: f */
    public ViewGroup mo45628f() {
        return this.f16290d;
    }

    @NonNull
    /* renamed from: g */
    public ViewTreeObserver.OnGlobalLayoutListener mo45629g(Map<C7796a, View.OnClickListener> map, View.OnClickListener onClickListener) {
        View inflate = this.f16289c.inflate(C10045g.card, (ViewGroup) null);
        this.f16292f = (ScrollView) inflate.findViewById(C10044f.body_scroll);
        this.f16293g = (Button) inflate.findViewById(C10044f.primary_button);
        this.f16294h = (Button) inflate.findViewById(C10044f.secondary_button);
        this.f16295i = (ImageView) inflate.findViewById(C10044f.image_view);
        this.f16296j = (TextView) inflate.findViewById(C10044f.message_body);
        this.f16297k = (TextView) inflate.findViewById(C10044f.message_title);
        this.f16290d = (FiamCardView) inflate.findViewById(C10044f.card_root);
        this.f16291e = (C6938a) inflate.findViewById(C10044f.card_content_root);
        if (this.f16287a.mo41515c().equals(MessageType.CARD)) {
            C7809f fVar = (C7809f) this.f16287a;
            this.f16298l = fVar;
            m22791q(fVar);
            m22789o(this.f16298l);
            m22787m(map);
            m22790p(this.f16288b);
            m22788n(onClickListener);
            mo45632j(this.f16291e, this.f16298l.mo41486e());
        }
        return this.f16300n;
    }
}
