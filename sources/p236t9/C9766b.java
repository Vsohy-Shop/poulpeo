package p236t9;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.home.PageActivity;
import com.poulpeo.p321ui.screens.merchant.MerchantActivity;
import com.poulpeo.p321ui.screens.merchant_grid.MerchantCampaignsGridActivity;
import com.poulpeo.p321ui.screens.merchant_grid.MerchantListGridActivity;
import com.poulpeo.p321ui.screens.offer.OfferActivity;
import com.rmn.apiclient.core.model.ModelRelationship;
import com.rmn.apiclient.core.model.RemoteImage;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import com.rmn.apiclient.impl.api.models.Campaign;
import com.rmn.apiclient.impl.api.models.CashbackObject;
import com.rmn.apiclient.impl.api.models.Merchant;
import com.rmn.apiclient.impl.api.models.Offer;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.utils.AsyncImageLoader;
import com.squareup.picasso.Callback;
import java.net.URL;
import java.text.NumberFormat;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p360id.C12136d;
import p360id.C12139g;
import p368jd.C12616b;
import p415qc.C13240e;
import p427sc.C13386c;
import p440ud.C13565k;
import p440ud.C13566l;
import p445vc.C13618g;
import p446vd.C13621b;
import p446vd.C13629j;
import p450wb.C13690b;
import p463yc.C13867a;

@StabilityInferred(parameters = 0)
/* renamed from: t9.b */
/* compiled from: CampaignCellViewHolder.kt */
public class C9766b extends C9765a {

    /* renamed from: h */
    private final String f14576h;

    /* renamed from: i */
    private final String f14577i;

    /* renamed from: j */
    private final boolean f14578j;

    /* renamed from: k */
    private final String f14579k;

    /* renamed from: l */
    private final ViewGroup f14580l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final ImageView f14581m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final TextView f14582n;

    /* renamed from: o */
    private final TextView f14583o;

    /* renamed from: p */
    private final TextView f14584p;

    /* renamed from: q */
    private int f14585q = 100;

    /* renamed from: r */
    private Campaign f14586r;

    /* renamed from: t9.b$a */
    /* compiled from: CampaignCellViewHolder.kt */
    public /* synthetic */ class C9767a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14587a;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.rmn.apiclient.impl.api.models.submodels.campaign.CampaignTarget[] r0 = com.rmn.apiclient.impl.api.models.submodels.campaign.CampaignTarget.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.rmn.apiclient.impl.api.models.submodels.campaign.CampaignTarget r1 = com.rmn.apiclient.impl.api.models.submodels.campaign.CampaignTarget.OFFER     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.rmn.apiclient.impl.api.models.submodels.campaign.CampaignTarget r1 = com.rmn.apiclient.impl.api.models.submodels.campaign.CampaignTarget.MERCHANT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.rmn.apiclient.impl.api.models.submodels.campaign.CampaignTarget r1 = com.rmn.apiclient.impl.api.models.submodels.campaign.CampaignTarget.MERCHANTS_LIST     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.rmn.apiclient.impl.api.models.submodels.campaign.CampaignTarget r1 = com.rmn.apiclient.impl.api.models.submodels.campaign.CampaignTarget.PAGE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.rmn.apiclient.impl.api.models.submodels.campaign.CampaignTarget r1 = com.rmn.apiclient.impl.api.models.submodels.campaign.CampaignTarget.OTHER     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                com.rmn.apiclient.impl.api.models.submodels.campaign.CampaignTarget r1 = com.rmn.apiclient.impl.api.models.submodels.campaign.CampaignTarget.URL     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                f14587a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p236t9.C9766b.C9767a.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9766b(View view, C13867a.C13868a aVar, boolean z, boolean z2, String str, String str2, boolean z3, String str3) {
        super(view, aVar, z2);
        C12775o.m28639i(view, "itemView");
        C12775o.m28639i(str, "sectionTitle");
        C12775o.m28639i(str2, "technicalNameTracking");
        C12775o.m28639i(str3, "trackingPageName");
        this.f14576h = str;
        this.f14577i = str2;
        this.f14578j = z3;
        this.f14579k = str3;
        View findViewById = view.findViewById(R.id.layoutIllustration);
        C12775o.m28638h(findViewById, "itemView.findViewById(R.id.layoutIllustration)");
        this.f14580l = (ViewGroup) findViewById;
        View findViewById2 = view.findViewById(R.id.imageViewIllustration);
        C12775o.m28638h(findViewById2, "itemView.findViewById(R.id.imageViewIllustration)");
        this.f14581m = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.textViewMerchantNamePlaceholder);
        C12775o.m28638h(findViewById3, "itemView.findViewById(R.…wMerchantNamePlaceholder)");
        this.f14582n = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.textViewTitle);
        C12775o.m28638h(findViewById4, "itemView.findViewById(R.id.textViewTitle)");
        this.f14583o = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.mentionAd);
        C12775o.m28638h(findViewById5, "itemView.findViewById(R.id.mentionAd)");
        TextView textView = (TextView) findViewById5;
        this.f14584p = textView;
        view.setOnClickListener(this);
        View findViewById6 = view.findViewById(R.id.cardView);
        C12775o.m28638h(findViewById6, "itemView.findViewById(R.id.cardView)");
        ViewGroup.LayoutParams layoutParams = findViewById6.getLayoutParams();
        int c = C13265c.m30134c(((float) mo53843t0().getResources().getDisplayMetrics().widthPixels) / 1.9f);
        layoutParams.width = c;
        layoutParams.height = c;
        findViewById6.setLayoutParams(layoutParams);
        this.f14585q = (int) (((float) C12136d.m26466h(mo53843t0(), layoutParams.height)) * 0.55f);
        if (z) {
            mo44287n2();
        }
        textView.setVisibility(8);
    }

    /* renamed from: r2 */
    private final void m20361r2() {
        Object obj;
        ModelRelationship<?> modelRelationship = mo44288q2().targetRelationship;
        Merchant merchant = null;
        if (modelRelationship != null) {
            obj = modelRelationship.getModel();
        } else {
            obj = null;
        }
        if (obj instanceof Merchant) {
            merchant = (Merchant) obj;
        }
        if (merchant != null) {
            CashbackObject cashbackObject = merchant.getCashbackObject();
            if (cashbackObject != null) {
                TextView textView = this.f14583o;
                C13690b bVar = C13690b.f22034a;
                String cashbackText = cashbackObject.getCashbackText(NumberFormat.getInstance(), mo53843t0().getString(R.string.cashback_amount_variable), C13565k.m30967a(new ContextContainer(mo53843t0()), R.plurals.cashback_refund, (double) cashbackObject.getRate()));
                C12775o.m28638h(cashbackText, "it.getCashbackText(\n    …uble())\n                )");
                textView.setText(bVar.mo53350h(cashbackText));
            }
            m20362s2(merchant);
        }
    }

    /* renamed from: s2 */
    private final void m20362s2(Merchant merchant) {
        String url;
        m20365v2((int) (((float) this.f14585q) * 0.85f), 20, ImageView.ScaleType.FIT_CENTER);
        this.f14581m.setBackgroundColor(0);
        URL logoUrl = merchant.getLogoUrl();
        if (logoUrl != null && (url = logoUrl.toString()) != null) {
            AsyncImageLoader.loadImage(this.f14581m, url, url, 0, new C9768b(this, merchant));
        }
    }

    /* renamed from: t2 */
    private final void m20363t2() {
        Object obj;
        boolean z;
        CashbackObject cashbackObject;
        ModelRelationship<?> modelRelationship = mo44288q2().targetRelationship;
        Offer offer = null;
        if (modelRelationship != null) {
            obj = modelRelationship.getModel();
        } else {
            obj = null;
        }
        if (obj instanceof Offer) {
            offer = (Offer) obj;
        }
        if (offer != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            String str = offer.shortTitle;
            C12775o.m28638h(str, "offer.shortTitle");
            boolean z2 = false;
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = offer.title;
                C12775o.m28638h(str, "offer.title");
            }
            if (offer.canCombineCashbackAndOffersCodes && (cashbackObject = offer.getCashbackObject()) != null) {
                String str2 = C13629j.m31134d().format(Float.valueOf(cashbackObject.getRate())) + cashbackObject.getCommissionType().text;
                String previousCashbackText = cashbackObject.getPreviousCashbackText(NumberFormat.getInstance(), "%s");
                C12775o.m28638h(previousCashbackText, "it.getPreviousCashbackTe…rmat.getInstance(), \"%s\")");
                String string = mo53843t0().getString(R.string.campaign_title_cell, new Object[]{previousCashbackText, str2});
                C12775o.m28638h(string, "getContext().getString(R…Cashback, strTmpCashback)");
                spannableStringBuilder2 = C13690b.f22034a.mo53349g(mo53843t0(), str2, string, previousCashbackText, new StyleSpan(1));
                if (str.length() > 32) {
                    String substring = str.substring(0, 30);
                    C12775o.m28638h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    str = substring + "...";
                }
            }
            C13690b bVar = C13690b.f22034a;
            spannableStringBuilder.append(bVar.mo53350h(str));
            if (spannableStringBuilder2.length() > 0) {
                z2 = true;
            }
            if (z2) {
                spannableStringBuilder.append(bVar.mo53351i("\n + \n ", new StyleSpan(1)));
                spannableStringBuilder.append(spannableStringBuilder2);
            }
            this.f14583o.setText(spannableStringBuilder);
            Merchant merchant = offer.getMerchant();
            if (merchant != null) {
                m20362s2(merchant);
            }
        }
    }

    /* renamed from: u2 */
    private final void m20364u2() {
        URL imageURL;
        String url;
        this.f14583o.setText(mo44288q2().title);
        RemoteImage remoteImage = mo44288q2().dataIllustration;
        if (remoteImage != null && (imageURL = remoteImage.getImageURL()) != null && (url = imageURL.toString()) != null) {
            AsyncImageLoader.loadImage(this.f14581m, url, url, 0, (Callback) null);
        }
    }

    /* renamed from: v2 */
    private final void m20365v2(int i, int i2, ImageView.ScaleType scaleType) {
        ViewGroup.LayoutParams layoutParams = this.f14580l.getLayoutParams();
        layoutParams.height = C12136d.m26463e(mo53843t0(), i);
        C12775o.m28637g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = C12136d.m26463e(mo53843t0(), i2);
        this.f14580l.setLayoutParams(layoutParams);
        this.f14581m.setScaleType(scaleType);
    }

    /* renamed from: m2 */
    public void mo23234m2(C13867a aVar, Object obj) {
        C12775o.m28637g(obj, "null cannot be cast to non-null type com.rmn.apiclient.impl.api.models.Campaign");
        Campaign campaign = (Campaign) obj;
        this.f14586r = campaign;
        this.f14583o.setText((CharSequence) null);
        this.f14581m.setImageDrawable((Drawable) null);
        this.f14581m.setBackgroundColor(mo53843t0().getColor(R.color.background_theme));
        C12139g.m26475d(this.f14581m, true, 0, 2, (Object) null);
        C12139g.m26475d(this.f14582n, false, 0, 2, (Object) null);
        m20365v2(this.f14585q, 0, ImageView.ScaleType.CENTER_CROP);
        int i = C9767a.f14587a[mo44288q2().dataTarget.ordinal()];
        if (i == 1) {
            m20363t2();
        } else if (i != 2) {
            m20364u2();
        } else {
            m20361r2();
        }
        C12139g.m26475d(this.f14584p, campaign.isSponsored(), 0, 2, (Object) null);
    }

    public void onClick(View view) {
        Object obj;
        Offer offer;
        ModelRelationship<Merchant> modelRelationship;
        String str;
        String url;
        Object obj2;
        Merchant merchant;
        String str2;
        C12775o.m28639i(view, "v");
        ContextContainer contextContainer = new ContextContainer(mo53843t0());
        new C13240e(contextContainer).mo52889g(new C13386c(contextContainer, mo44288q2().getTrackingCampaignId(), mo44288q2().getTrackingMedium(), mo44288q2().getTrackingSource(), mo44288q2().getTrackingCampaignName(), (String) null, (String) null));
        C11921v vVar = null;
        if (this.f14578j) {
            ModelRelationship<?> modelRelationship2 = mo44288q2().targetRelationship;
            if (modelRelationship2 != null) {
                obj2 = modelRelationship2.getModel();
            } else {
                obj2 = null;
            }
            if (obj2 instanceof Merchant) {
                merchant = (Merchant) obj2;
            } else {
                merchant = null;
            }
            C13618g gVar = C13618g.f21930b;
            String str3 = "grid-campaigns-" + this.f14577i;
            if (merchant != null) {
                str2 = merchant.name;
            } else {
                str2 = null;
            }
            gVar.mo53279c(str3, "click", str2);
        } else {
            C13618g.f21930b.mo53279c(this.f14579k, "campaign|" + this.f14576h, mo44288q2().getTrackingCampaignId() + "-" + mo44288q2().getTrackingCampaignName());
        }
        C12616b b0 = mo53842b0();
        if (b0 != null) {
            String str4 = "";
            switch (C9767a.f14587a[mo44288q2().dataTarget.ordinal()]) {
                case 1:
                    String targetId = mo44288q2().getTargetId();
                    if (targetId != null) {
                        ModelRelationship<?> modelRelationship3 = mo44288q2().targetRelationship;
                        if (modelRelationship3 != null) {
                            obj = modelRelationship3.getModel();
                        } else {
                            obj = null;
                        }
                        if (obj instanceof Offer) {
                            offer = (Offer) obj;
                        } else {
                            offer = null;
                        }
                        if (!(offer == null || (modelRelationship = offer.merchantRelationship) == null || (str = modelRelationship.f18064id) == null)) {
                            MerchantActivity.C11159a aVar = MerchantActivity.f17469w;
                            C12775o.m28638h(str, "merchantId");
                            b0.startActivity(aVar.mo46357h(b0, str, true, targetId));
                            vVar = C11921v.f18618a;
                        }
                        if (vVar == null) {
                            b0.startActivity(OfferActivity.f17608r.mo46434e(b0, targetId, 0));
                            return;
                        }
                        return;
                    }
                    return;
                case 2:
                    String targetId2 = mo44288q2().getTargetId();
                    if (targetId2 != null) {
                        b0.startActivity(MerchantActivity.C11159a.m24356i(MerchantActivity.f17469w, b0, targetId2, false, (String) null, 8, (Object) null));
                        return;
                    }
                    return;
                case 3:
                    String targetId3 = mo44288q2().getTargetId();
                    if (targetId3 != null) {
                        MerchantListGridActivity.C11171a aVar2 = MerchantListGridActivity.f17524v;
                        String str5 = mo44288q2().title;
                        if (str5 != null) {
                            str4 = str5;
                        }
                        C12775o.m28638h(str4, "campaign.title ?: \"\"");
                        b0.startActivity(aVar2.mo46385c(b0, str4, targetId3));
                        return;
                    }
                    return;
                case 4:
                    String targetId4 = mo44288q2().getTargetId();
                    if (targetId4 != null) {
                        PageActivity.C11133a aVar3 = PageActivity.f17333q;
                        String str6 = mo44288q2().title;
                        if (str6 != null) {
                            str4 = str6;
                        }
                        C12775o.m28638h(str4, "campaign.title ?: \"\"");
                        b0.startActivity(aVar3.mo46270e(b0, str4, targetId4));
                        return;
                    }
                    return;
                case 5:
                    String str7 = mo44288q2().dataLabelUrl;
                    if (str7 != null) {
                        MerchantCampaignsGridActivity.C11170a aVar4 = MerchantCampaignsGridActivity.f17518v;
                        String str8 = mo44288q2().title;
                        if (str8 != null) {
                            str4 = str8;
                        }
                        C12775o.m28638h(str4, "campaign.title ?: \"\"");
                        b0.startActivity(aVar4.mo46384c(b0, str4, str7));
                        return;
                    }
                    return;
                case 6:
                    URL url2 = mo44288q2().dataSpecificUrl;
                    if (url2 != null && (url = url2.toString()) != null) {
                        C13621b.m31098l(new C13566l(b0), url);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q2 */
    public final Campaign mo44288q2() {
        Campaign campaign = this.f14586r;
        if (campaign != null) {
            return campaign;
        }
        C12775o.m28656z(APIResourceDescriptors.RESOURCE_TYPE_CAMPAIGN);
        return null;
    }

    /* renamed from: t9.b$b */
    /* compiled from: CampaignCellViewHolder.kt */
    public static final class C9768b implements Callback {

        /* renamed from: a */
        final /* synthetic */ C9766b f14588a;

        /* renamed from: b */
        final /* synthetic */ Merchant f14589b;

        C9768b(C9766b bVar, Merchant merchant) {
            this.f14588a = bVar;
            this.f14589b = merchant;
        }

        /* renamed from: a */
        public void mo23239a(Exception exc) {
            C12139g.m26475d(this.f14588a.f14581m, false, 0, 2, (Object) null);
            this.f14588a.f14582n.setText(this.f14589b.name);
            C12139g.m26475d(this.f14588a.f14582n, true, 0, 2, (Object) null);
        }

        public void onSuccess() {
        }
    }
}
