package p236t9;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.merchant.MerchantActivity;
import com.rmn.apiclient.core.model.IModel;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import com.rmn.apiclient.impl.api.models.Merchant;
import com.rmn.apiclient.impl.api.models.Offer;
import com.rmn.utils.AsyncImageLoader;
import com.squareup.picasso.Callback;
import java.net.URL;
import kotlin.jvm.internal.C12775o;
import p015p9.C2076a;
import p258v9.C10060e;
import p360id.C12139g;
import p368jd.C12616b;
import p445vc.C13618g;
import p445vc.C13619h;
import p463yc.C13867a;

@StabilityInferred(parameters = 0)
/* renamed from: t9.g */
/* compiled from: OfferRowViewHolder.kt */
public class C9777g extends C2076a {

    /* renamed from: n */
    private final String f14611n;

    /* renamed from: o */
    private final String f14612o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final ImageView f14613p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final TextView f14614q;

    /* renamed from: r */
    private final TextView f14615r;

    /* renamed from: s */
    protected Offer f14616s;

    /* renamed from: t9.g$a */
    /* compiled from: OfferRowViewHolder.kt */
    public static final class C9778a implements Callback {

        /* renamed from: a */
        final /* synthetic */ C9777g f14617a;

        C9778a(C9777g gVar) {
            this.f14617a = gVar;
        }

        /* renamed from: a */
        public void mo23239a(Exception exc) {
            C12139g.m26474c(this.f14617a.f14613p, false, 4);
        }

        public void onSuccess() {
            C12139g.m26475d(this.f14617a.f14613p, true, 0, 2, (Object) null);
            C12139g.m26475d(this.f14617a.f14614q, false, 0, 2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9777g(View view, C13867a.C13868a aVar, String str, String str2) {
        super(view, aVar);
        C12775o.m28639i(view, "itemView");
        C12775o.m28639i(str, "sectionTitle");
        C12775o.m28639i(str2, "trackingPageName");
        this.f14611n = str;
        this.f14612o = str2;
        View findViewById = view.findViewById(R.id.logoImageView);
        C12775o.m28638h(findViewById, "itemView.findViewById(R.id.logoImageView)");
        this.f14613p = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.textViewMerchantNamePlaceholder);
        C12775o.m28638h(findViewById2, "itemView.findViewById(R.…wMerchantNamePlaceholder)");
        this.f14614q = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.mentionAd);
        C12775o.m28638h(findViewById3, "itemView.findViewById(R.id.mentionAd)");
        this.f14615r = (TextView) findViewById3;
        view.setOnClickListener(this);
    }

    /* renamed from: m2 */
    public void mo23234m2(C13867a aVar, Object obj) {
        C10060e eVar;
        IModel iModel;
        Offer offer;
        boolean z;
        Offer offer2;
        boolean z2 = obj instanceof C10060e;
        String str = null;
        if (z2) {
            eVar = (C10060e) obj;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            iModel = eVar.f15209a;
        } else {
            iModel = null;
        }
        if (iModel instanceof Offer) {
            offer = (Offer) iModel;
        } else {
            offer = null;
        }
        if (offer == null) {
            if (obj instanceof Offer) {
                offer2 = (Offer) obj;
            } else {
                offer2 = null;
            }
            if (offer == null) {
                return;
            }
        }
        mo44298s2(offer);
        super.mo23234m2(aVar, mo44297r2());
        C12139g.m26475d(this.f14614q, false, 0, 2, (Object) null);
        C12139g.m26475d(this.f14613p, false, 0, 2, (Object) null);
        TextView textView = this.f14615r;
        if (!z2 || !((C10060e) obj).f15210b) {
            z = false;
        } else {
            z = true;
        }
        C12139g.m26475d(textView, z, 0, 2, (Object) null);
        Merchant merchant = mo44297r2().getMerchant();
        if (merchant != null) {
            C12139g.m26475d(this.f14614q, true, 0, 2, (Object) null);
            this.f14614q.setText(merchant.name);
            URL logoUrl = merchant.getLogoUrl();
            if (logoUrl != null) {
                str = logoUrl.toString();
            }
            AsyncImageLoader.loadImage(this.f14613p, str, str, 0, new C9778a(this));
        }
    }

    public void onClick(View view) {
        C12775o.m28639i(view, "v");
        Merchant merchant = mo44297r2().getMerchant();
        if (merchant != null) {
            String a = C13619h.m31080a("click", mo44297r2());
            C12775o.m28638h(a, "getOfferTrackingSuffix(\"click\", offer)");
            C13618g.f21930b.mo53279c(this.f14612o, a + "|" + this.f14611n, merchant.name + "-" + mo44297r2().title);
            C12616b b0 = mo53842b0();
            if (b0 != null) {
                MerchantActivity.C11159a aVar = MerchantActivity.f17469w;
                Context t0 = mo53843t0();
                String str = merchant.f18063id;
                C12775o.m28638h(str, "merchant.id");
                b0.startActivity(aVar.mo46357h(t0, str, false, mo44297r2().f18063id));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r2 */
    public final Offer mo44297r2() {
        Offer offer = this.f14616s;
        if (offer != null) {
            return offer;
        }
        C12775o.m28656z(APIResourceDescriptors.RESOURCE_TYPE_OFFER);
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s2 */
    public final void mo44298s2(Offer offer) {
        C12775o.m28639i(offer, "<set-?>");
        this.f14616s = offer;
    }
}
