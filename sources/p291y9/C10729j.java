package p291y9;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.merchant_grid.MerchantCampaignsGridActivity;
import com.rmn.apiclient.core.data_access.base.call.CallManager;
import com.rmn.apiclient.core.model.IModel;
import com.rmn.apiclient.impl.api.models.submodels.page.sections.PageSectionCampaignsList;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import p247u9.C9903b;
import p247u9.C9904c;
import p258v9.C10058c;
import p360id.C12139g;
import p368jd.C12616b;
import p394nb.C12977b;
import p445vc.C13618g;
import p463yc.C13867a;

@StabilityInferred(parameters = 0)
/* renamed from: y9.j */
/* compiled from: CashbackCampaignsSectionViewHolder.kt */
public final class C10729j extends C10717a {

    /* renamed from: v */
    private final RelativeLayout f16370v;

    /* renamed from: w */
    private final int f16371w = 7;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10729j(View view, C13867a.C13868a aVar, CallManager callManager, C10058c cVar, String str) {
        super(view, aVar, callManager, cVar, str);
        C12775o.m28639i(view, "itemView");
        C12775o.m28639i(aVar, "listener");
        C12775o.m28639i(callManager, "callManager");
        C12775o.m28639i(cVar, "pageReload");
        C12775o.m28639i(str, "trackingPageName");
        this.f16370v = (RelativeLayout) view.findViewById(R.id.titleLayoutSection);
    }

    /* access modifiers changed from: private */
    /* renamed from: G2 */
    public static final void m22871G2(C10729j jVar, Object obj, View view) {
        C12775o.m28639i(jVar, "this$0");
        if (jVar.mo45649B2().getVisibility() == 0) {
            PageSectionCampaignsList pageSectionCampaignsList = (PageSectionCampaignsList) obj;
            C13618g.f21930b.mo53279c(jVar.mo44758v2(), "see-all", pageSectionCampaignsList.title);
            C12616b b0 = jVar.mo53842b0();
            if (b0 != null) {
                MerchantCampaignsGridActivity.C11170a aVar = MerchantCampaignsGridActivity.f17518v;
                Context t0 = jVar.mo53843t0();
                String str = pageSectionCampaignsList.title;
                if (str == null) {
                    str = "";
                }
                String campaignType = pageSectionCampaignsList.getCampaignType();
                C12775o.m28638h(campaignType, "item.campaignType");
                b0.startActivity(aVar.mo46384c(t0, str, campaignType));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C2 */
    public int mo45650C2() {
        return this.f16371w;
    }

    /* renamed from: M */
    public void mo28504M(List<? extends IModel> list) {
        boolean z;
        C12775o.m28639i(list, "items");
        super.mo28504M(list);
        ImageView B2 = mo45649B2();
        if (list.size() >= 7) {
            z = true;
        } else {
            z = false;
        }
        C12139g.m26475d(B2, z, 0, 2, (Object) null);
    }

    /* renamed from: m2 */
    public void mo23234m2(C13867a aVar, Object obj) {
        super.mo23234m2(aVar, obj);
        if (obj instanceof PageSectionCampaignsList) {
            mo44753q2().setImageResource(R.drawable.placeholder_cashbacks);
            this.f16370v.setOnClickListener(new C10728i(this, obj));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o2 */
    public C9903b mo28506o2() {
        return new C9904c();
    }

    /* renamed from: z2 */
    public void mo45653z2(List<? extends IModel> list, String str) {
        C12775o.m28639i(list, "items");
        C12775o.m28639i(str, "sectionTitle");
        C12977b s2 = mo44755s2();
        List<IModel> C2 = C10725h.m22852C2(list);
        C12775o.m28638h(C2, "extractMerchantsInCampaigns(items)");
        String campaignType = mo45651D2().getCampaignType();
        C12775o.m28638h(campaignType, "pageSectionCampaignsList.campaignType");
        s2.mo50883a(C2, str, campaignType, mo44758v2());
    }
}
