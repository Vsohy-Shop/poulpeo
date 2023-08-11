package p291y9;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.apiclient.core.data_access.base.call.CallManager;
import com.rmn.apiclient.core.model.IModel;
import com.rmn.apiclient.impl.api.models.submodels.page.BasePageSection;
import com.rmn.apiclient.impl.api.models.submodels.page.sections.PageSectionCampaignsList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p247u9.C9902a;
import p247u9.C9903b;
import p258v9.C10058c;
import p269w9.C10153a;
import p269w9.C10154b;
import p291y9.C10725h;
import p360id.C12139g;
import p394nb.C12977b;
import p404of.C13074a;
import p440ud.C13567m;
import p463yc.C13867a;

@StabilityInferred(parameters = 0)
/* renamed from: y9.a */
/* compiled from: BillboardCampaignsSectionViewHolder.kt */
public class C10717a extends C10154b implements C10153a {

    /* renamed from: q */
    private final TextView f16345q;

    /* renamed from: r */
    private final ImageView f16346r;

    /* renamed from: s */
    private final int f16347s = -1;

    /* renamed from: t */
    protected PageSectionCampaignsList f16348t;

    /* renamed from: u */
    private final Lazy f16349u;

    /* renamed from: y9.a$a */
    /* compiled from: BillboardCampaignsSectionViewHolder.kt */
    static final class C10718a extends C12777p implements C13074a<C10725h> {

        /* renamed from: g */
        final /* synthetic */ C10717a f16350g;

        /* renamed from: h */
        final /* synthetic */ CallManager f16351h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10718a(C10717a aVar, CallManager callManager) {
            super(0);
            this.f16350g = aVar;
            this.f16351h = callManager;
        }

        /* renamed from: b */
        public final C10725h invoke() {
            C10717a aVar = this.f16350g;
            return new C10725h(aVar, new C10725h.C10727b(this.f16351h, new C13567m(C10717a.super.mo44756t2())));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10717a(View view, C13867a.C13868a aVar, CallManager callManager, C10058c cVar, String str) {
        super(view, aVar, callManager, cVar, str);
        C12775o.m28639i(view, "itemView");
        C12775o.m28639i(aVar, "listener");
        C12775o.m28639i(callManager, "callManager");
        C12775o.m28639i(cVar, "pageReload");
        C12775o.m28639i(str, "trackingPageName");
        this.f16345q = (TextView) view.findViewById(R.id.textViewTitle);
        View findViewById = view.findViewById(R.id.imageViewArrow);
        C12775o.m28638h(findViewById, "itemView.findViewById(R.id.imageViewArrow)");
        this.f16346r = (ImageView) findViewById;
        this.f16349u = C11901h.m25690b(new C10718a(this, callManager));
    }

    /* access modifiers changed from: protected */
    /* renamed from: A2 */
    public final C10725h mo45648A2() {
        return (C10725h) this.f16349u.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: B2 */
    public final ImageView mo45649B2() {
        return this.f16346r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C2 */
    public int mo45650C2() {
        return this.f16347s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D2 */
    public final PageSectionCampaignsList mo45651D2() {
        PageSectionCampaignsList pageSectionCampaignsList = this.f16348t;
        if (pageSectionCampaignsList != null) {
            return pageSectionCampaignsList;
        }
        C12775o.m28656z("pageSectionCampaignsList");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E2 */
    public final void mo45652E2(PageSectionCampaignsList pageSectionCampaignsList) {
        C12775o.m28639i(pageSectionCampaignsList, "<set-?>");
        this.f16348t = pageSectionCampaignsList;
    }

    /* renamed from: M */
    public void mo28504M(List<? extends IModel> list) {
        C12775o.m28639i(list, "items");
        C12139g.m26475d(mo44757u2(), false, 0, 2, (Object) null);
        TextView textView = this.f16345q;
        C12775o.m28638h(textView, "textViewTitle");
        C12139g.m26475d(textView, true, 0, 2, (Object) null);
        String str = mo45651D2().title;
        if (str == null) {
            str = "";
        }
        mo45653z2(list, str);
    }

    /* renamed from: j1 */
    public void mo28505j1() {
        mo44750d();
    }

    /* renamed from: m2 */
    public void mo23234m2(C13867a aVar, Object obj) {
        super.mo23234m2(aVar, obj);
        if (obj instanceof PageSectionCampaignsList) {
            PageSectionCampaignsList pageSectionCampaignsList = (PageSectionCampaignsList) obj;
            mo45652E2(pageSectionCampaignsList);
            TextView textView = this.f16345q;
            String str = pageSectionCampaignsList.title;
            if (str == null) {
                str = "";
            }
            textView.setText(str);
            TextView textView2 = this.f16345q;
            C12775o.m28638h(textView2, "textViewTitle");
            C12139g.m26475d(textView2, false, 0, 2, (Object) null);
            C12139g.m26475d(this.f16346r, false, 0, 2, (Object) null);
            mo45648A2().mo44052o2(new C10725h.C10726a((BasePageSection) obj, pageSectionCampaignsList.getCampaignType(), mo45650C2(), mo44754r2()));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o2 */
    public C9903b mo28506o2() {
        return new C9902a();
    }

    /* renamed from: x1 */
    public int mo28507x1() {
        return getBindingAdapterPosition();
    }

    /* renamed from: z2 */
    public void mo45653z2(List<? extends IModel> list, String str) {
        C12775o.m28639i(list, "items");
        C12775o.m28639i(str, "sectionTitle");
        C12977b s2 = mo44755s2();
        String campaignType = mo45651D2().getCampaignType();
        C12775o.m28638h(campaignType, "pageSectionCampaignsList.campaignType");
        s2.mo50883a(list, str, campaignType, mo44758v2());
    }
}
