package p053ca;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.home.PageActivity;
import com.poulpeo.p321ui.screens.merchant_grid.MerchantListGridActivity;
import com.rmn.apiclient.core.data_access.base.call.CallManager;
import com.rmn.apiclient.core.model.IModel;
import com.rmn.apiclient.impl.api.models.submodels.page.BasePageSection;
import com.rmn.apiclient.impl.api.models.submodels.page.sections.PageSectionCashbacksList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p053ca.C4044f;
import p247u9.C9903b;
import p247u9.C9904c;
import p258v9.C10058c;
import p269w9.C10153a;
import p269w9.C10154b;
import p336ef.C11921v;
import p360id.C12139g;
import p368jd.C12616b;
import p394nb.C12977b;
import p404of.C13074a;
import p440ud.C13567m;
import p445vc.C13618g;
import p463yc.C13867a;

@StabilityInferred(parameters = 0)
/* renamed from: ca.b */
/* compiled from: ListCashbackSectionViewHolder.kt */
public final class C4038b extends C10154b implements C10153a {

    /* renamed from: q */
    private final ImageView f3231q;

    /* renamed from: r */
    private final TextView f3232r;

    /* renamed from: s */
    private final RelativeLayout f3233s;

    /* renamed from: t */
    private final TextView f3234t;

    /* renamed from: u */
    private PageSectionCashbacksList f3235u;

    /* renamed from: v */
    private final Lazy f3236v;

    /* renamed from: ca.b$a */
    /* compiled from: ListCashbackSectionViewHolder.kt */
    static final class C4039a extends C12777p implements C13074a<C4044f> {

        /* renamed from: g */
        final /* synthetic */ C4038b f3237g;

        /* renamed from: h */
        final /* synthetic */ CallManager f3238h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4039a(C4038b bVar, CallManager callManager) {
            super(0);
            this.f3237g = bVar;
            this.f3238h = callManager;
        }

        /* renamed from: b */
        public final C4044f invoke() {
            C4038b bVar = this.f3237g;
            return new C4044f(bVar, new C4044f.C4046b(this.f3238h, new C13567m(C4038b.super.mo44756t2()), true, false));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4038b(View view, C13867a.C13868a aVar, CallManager callManager, C10058c cVar, String str) {
        super(view, aVar, callManager, cVar, str);
        C12775o.m28639i(view, "itemView");
        C12775o.m28639i(aVar, "listener");
        C12775o.m28639i(callManager, "callManager");
        C12775o.m28639i(cVar, "pageReload");
        C12775o.m28639i(str, "trackingPageName");
        this.f3231q = (ImageView) view.findViewById(R.id.imageViewArrow);
        this.f3232r = (TextView) view.findViewById(R.id.textViewTitle);
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.titleLayoutSection);
        this.f3233s = relativeLayout;
        this.f3234t = (TextView) view.findViewById(R.id.textViewDescription);
        this.f3236v = C11901h.m25690b(new C4039a(this, callManager));
        relativeLayout.setOnClickListener(new C4037a(this, str));
    }

    /* renamed from: B2 */
    private final C4044f m4759B2() {
        return (C4044f) this.f3236v.getValue();
    }

    /* renamed from: C2 */
    private final String m4760C2() {
        String str;
        PageSectionCashbacksList pageSectionCashbacksList = this.f3235u;
        if (pageSectionCashbacksList != null) {
            str = pageSectionCashbacksList.title;
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    /* access modifiers changed from: private */
    /* renamed from: z2 */
    public static final void m4762z2(C4038b bVar, String str, View view) {
        boolean z;
        Intent intent;
        C12775o.m28639i(bVar, "this$0");
        C12775o.m28639i(str, "$trackingPageName");
        if (bVar.f3231q.getVisibility() == 0) {
            C13618g.f21930b.mo53279c(str, "see-all", bVar.m4760C2());
            PageSectionCashbacksList pageSectionCashbacksList = bVar.f3235u;
            if (pageSectionCashbacksList != null) {
                String w2 = bVar.mo44759w2(pageSectionCashbacksList);
                if (w2.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    intent = PageActivity.f17333q.mo46270e(bVar.mo53843t0(), bVar.m4760C2(), w2);
                } else {
                    MerchantListGridActivity.C11171a aVar = MerchantListGridActivity.f17524v;
                    Context t0 = bVar.mo53843t0();
                    String C2 = bVar.m4760C2();
                    String technicalName = pageSectionCashbacksList.getTechnicalName();
                    C12775o.m28638h(technicalName, "it.technicalName");
                    intent = aVar.mo46385c(t0, C2, technicalName);
                }
                C12616b b0 = bVar.mo53842b0();
                if (b0 != null) {
                    b0.startActivity(intent);
                }
            }
        }
    }

    /* renamed from: M */
    public void mo28504M(List<? extends IModel> list) {
        String str;
        String technicalName;
        C11921v vVar;
        boolean z;
        C12775o.m28639i(list, "items");
        this.f3232r.setText(m4760C2());
        mo44757u2().setVisibility(8);
        PageSectionCashbacksList pageSectionCashbacksList = this.f3235u;
        if (pageSectionCashbacksList != null) {
            ImageView imageView = this.f3231q;
            C12775o.m28638h(imageView, "imageViewArrow");
            C12139g.m26475d(imageView, mo44751n2(pageSectionCashbacksList, list), 0, 2, (Object) null);
            String str2 = pageSectionCashbacksList.description;
            if (str2 != null) {
                TextView textView = this.f3234t;
                C12775o.m28638h(textView, "textViewDescription");
                C12775o.m28638h(str2, "description");
                if (str2.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                C12139g.m26475d(textView, z, 0, 2, (Object) null);
                this.f3234t.setText(str2);
                vVar = C11921v.f18618a;
            } else {
                vVar = null;
            }
            if (vVar == null) {
                TextView textView2 = this.f3234t;
                C12775o.m28638h(textView2, "textViewDescription");
                C12139g.m26475d(textView2, false, 0, 2, (Object) null);
            }
        }
        C12977b s2 = mo44755s2();
        PageSectionCashbacksList pageSectionCashbacksList2 = this.f3235u;
        String str3 = "";
        if (pageSectionCashbacksList2 == null || (str = pageSectionCashbacksList2.title) == null) {
            str = str3;
        }
        if (!(pageSectionCashbacksList2 == null || (technicalName = pageSectionCashbacksList2.getTechnicalName()) == null)) {
            str3 = technicalName;
        }
        s2.mo50883a(list, str, str3, mo44758v2());
        mo44760x2(true);
    }

    /* renamed from: j1 */
    public void mo28505j1() {
        super.mo44750d();
    }

    /* renamed from: m2 */
    public void mo23234m2(C13867a aVar, Object obj) {
        super.mo23234m2(aVar, obj);
        if (obj instanceof PageSectionCashbacksList) {
            PageSectionCashbacksList pageSectionCashbacksList = (PageSectionCashbacksList) obj;
            this.f3235u = pageSectionCashbacksList;
            if (!mo44752p2()) {
                this.f3231q.setVisibility(8);
            }
            m4759B2().mo44052o2(new C4044f.C4045a((BasePageSection) obj, pageSectionCashbacksList.getTechnicalName(), mo44754r2(), pageSectionCashbacksList.isSponsored(), 7));
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
