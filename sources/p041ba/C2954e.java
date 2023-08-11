package p041ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.merchant_favorites_grid.MerchantFavoritesGridActivity;
import com.rmn.apiclient.core.data_access.base.call.CallManager;
import com.rmn.apiclient.core.model.IModel;
import com.rmn.apiclient.impl.api.models.submodels.page.BasePageSection;
import com.rmn.apiclient.impl.api.models.submodels.page.sections.PageSectionShortCode;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p041ba.C2951c;
import p225s9.C9584b;
import p247u9.C9903b;
import p247u9.C9904c;
import p258v9.C10058c;
import p269w9.C10153a;
import p269w9.C10154b;
import p360id.C12139g;
import p368jd.C12616b;
import p404of.C13074a;
import p440ud.C13567m;
import p445vc.C13618g;
import p463yc.C13867a;

@StabilityInferred(parameters = 0)
/* renamed from: ba.e */
/* compiled from: FavoriteSectionViewHolder.kt */
public final class C2954e extends C10154b implements C10153a {

    /* renamed from: q */
    private final ImageView f1371q;

    /* renamed from: r */
    private final TextView f1372r;

    /* renamed from: s */
    private final RelativeLayout f1373s;

    /* renamed from: t */
    private final Lazy f1374t;

    /* renamed from: ba.e$a */
    /* compiled from: FavoriteSectionViewHolder.kt */
    static final class C2955a extends C12777p implements C13074a<C2951c> {

        /* renamed from: g */
        final /* synthetic */ C2954e f1375g;

        /* renamed from: h */
        final /* synthetic */ CallManager f1376h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2955a(C2954e eVar, CallManager callManager) {
            super(0);
            this.f1375g = eVar;
            this.f1376h = callManager;
        }

        /* renamed from: b */
        public final C2951c invoke() {
            C2954e eVar = this.f1375g;
            return new C2951c(eVar, new C2951c.C2952a(this.f1376h, eVar.mo53840J0(), new C13567m(C2954e.super.mo44756t2())));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2954e(View view, C13867a.C13868a aVar, CallManager callManager, C10058c cVar, String str) {
        super(view, aVar, callManager, cVar, str);
        C12775o.m28639i(view, "itemView");
        C12775o.m28639i(aVar, "listener");
        C12775o.m28639i(callManager, "callManager");
        C12775o.m28639i(cVar, "pageReload");
        C12775o.m28639i(str, "trackingPageName");
        this.f1371q = (ImageView) view.findViewById(R.id.imageViewArrow);
        this.f1372r = (TextView) view.findViewById(R.id.textViewTitle);
        this.f1373s = (RelativeLayout) view.findViewById(R.id.titleLayoutSection);
        this.f1374t = C11901h.m25690b(new C2955a(this, callManager));
    }

    /* renamed from: A2 */
    private final C2951c m2453A2() {
        return (C2951c) this.f1374t.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: B2 */
    public static final void m2454B2(C2954e eVar, View view) {
        C12775o.m28639i(eVar, "this$0");
        if (eVar.f1371q.getVisibility() == 0) {
            C13618g.f21930b.mo53279c(eVar.mo44758v2(), "manage", "favorites");
            C12616b b0 = eVar.mo53842b0();
            if (b0 != null) {
                b0.startActivity(MerchantFavoritesGridActivity.f17515p.mo46380a(eVar.mo53843t0()));
            }
        }
    }

    /* renamed from: M */
    public void mo28504M(List<? extends IModel> list) {
        boolean z;
        C12775o.m28639i(list, "items");
        mo44755s2().mo50883a(list, "favorites", "", mo44758v2());
        ImageView imageView = this.f1371q;
        C12775o.m28638h(imageView, "imageViewArrow");
        if (list.size() >= 7) {
            z = true;
        } else {
            z = false;
        }
        C12139g.m26475d(imageView, z, 0, 2, (Object) null);
        mo44757u2().setVisibility(8);
    }

    /* renamed from: j1 */
    public void mo28505j1() {
        mo44750d();
        mo44755s2().mo50883a(C12726w.m28524k(), "favorites", "", mo44758v2());
    }

    /* renamed from: m2 */
    public void mo23234m2(C13867a aVar, Object obj) {
        super.mo23234m2(aVar, obj);
        if (obj instanceof PageSectionShortCode) {
            this.f1372r.setText(mo53843t0().getString(R.string.shortcut_favorites));
            this.f1371q.setVisibility(4);
            m2453A2().mo44052o2(new C9584b.C9585a((BasePageSection) obj, mo44754r2()));
            this.f1373s.setOnClickListener(new C2953d(this));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o2 */
    public C9903b mo28506o2() {
        return new C9904c();
    }

    /* renamed from: x1 */
    public int mo28507x1() {
        return getBindingAdapterPosition();
    }
}
