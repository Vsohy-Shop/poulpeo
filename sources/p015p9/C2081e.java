package p015p9;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.purchase.activation.CashbackActivationActivity;
import com.rmn.apiclient.impl.api.models.Merchant;
import com.rmn.apiclient.impl.api.models.Offer;
import com.rmn.apiclient.impl.api.models.submodels.offer.OfferAmountType;
import com.rmn.apiclient.impl.api.models.submodels.offer.OfferCodeType;
import com.rmn.apiclient.impl.api.models.submodels.offer.OfferDiscount;
import com.rmn.apiclient.impl.api.models.submodels.offer.OfferType;
import kotlin.jvm.internal.C12775o;
import p360id.C12139g;
import p445vc.C13619h;
import p446vd.C13629j;
import p463yc.C13867a;

@StabilityInferred(parameters = 0)
/* renamed from: p9.e */
/* compiled from: OfferViewHolder.kt */
public final class C2081e extends C2076a {

    /* renamed from: n */
    private final int f726n;

    /* renamed from: o */
    private final boolean f727o;

    /* renamed from: p */
    private final TextView f728p;

    /* renamed from: q */
    private final ImageView f729q;

    /* renamed from: r */
    private final TextView f730r;

    /* renamed from: p9.e$a */
    /* compiled from: OfferViewHolder.kt */
    public /* synthetic */ class C2082a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f731a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.rmn.apiclient.impl.api.models.submodels.offer.OfferAmountType[] r0 = com.rmn.apiclient.impl.api.models.submodels.offer.OfferAmountType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.rmn.apiclient.impl.api.models.submodels.offer.OfferAmountType r1 = com.rmn.apiclient.impl.api.models.submodels.offer.OfferAmountType.RATE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.rmn.apiclient.impl.api.models.submodels.offer.OfferAmountType r1 = com.rmn.apiclient.impl.api.models.submodels.offer.OfferAmountType.FIXED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f731a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015p9.C2081e.C2082a.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2081e(View view, C13867a.C13868a aVar, int i, boolean z) {
        super(view, aVar);
        C12775o.m28639i(view, "itemView");
        C12775o.m28639i(aVar, "listener");
        this.f726n = i;
        this.f727o = z;
        View findViewById = view.findViewById(R.id.textViewAmount);
        C12775o.m28638h(findViewById, "itemView.findViewById(R.id.textViewAmount)");
        this.f728p = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.imageViewDecoration);
        C12775o.m28638h(findViewById2, "itemView.findViewById(R.id.imageViewDecoration)");
        this.f729q = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.buttonUse);
        C12775o.m28638h(findViewById3, "itemView.findViewById(R.id.buttonUse)");
        this.f730r = (TextView) findViewById3;
        view.setOnClickListener(this);
    }

    /* renamed from: q2 */
    private final void m1431q2(Offer offer) {
        int i;
        String str;
        int i2;
        C12139g.m26475d(this.f729q, false, 0, 2, (Object) null);
        C12139g.m26475d(this.f728p, false, 0, 2, (Object) null);
        OfferDiscount offerDiscount = offer.discount;
        if (offerDiscount == null) {
            if (offer.hasShipping) {
                i2 = R.drawable.decoration_shipping;
            } else if (offer.hasGift) {
                i2 = R.drawable.decoration_gift;
            } else {
                i2 = R.drawable.decoration_quantity;
            }
            this.f729q.setImageResource(i2);
            C12139g.m26475d(this.f729q, true, 0, 2, (Object) null);
            return;
        }
        C12139g.m26475d(this.f728p, true, 0, 2, (Object) null);
        OfferAmountType offerAmountType = offerDiscount.type;
        if (offerAmountType == null) {
            i = -1;
        } else {
            i = C2082a.f731a[offerAmountType.ordinal()];
        }
        if (i == 1) {
            str = "%";
        } else if (i != 2) {
            str = "";
        } else {
            str = "€";
        }
        TextView textView = this.f728p;
        String format = C13629j.m31134d().format(Float.valueOf(offerDiscount.amount));
        textView.setText("-" + format + str);
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public static final void m1432r2(C2081e eVar, Offer offer, View view) {
        C12775o.m28639i(eVar, "this$0");
        C12775o.m28639i(offer, "$offer");
        if (eVar.f727o) {
            View view2 = eVar.itemView;
            C12775o.m28638h(view2, "itemView");
            eVar.onClick(view2);
            return;
        }
        C13619h.f21932a.mo53283d("merchant", C13619h.m31080a("activate", offer), offer);
        if (offer.getMerchant() == null) {
            eVar.mo53843t0().startActivity(CashbackActivationActivity.f17643u.mo46455t(eVar.mo53843t0(), offer));
        } else if (offer.codeType == OfferCodeType.MULTIPLE) {
            Context t0 = eVar.mo53843t0();
            CashbackActivationActivity.C11200a aVar = CashbackActivationActivity.f17643u;
            Context t02 = eVar.mo53843t0();
            Merchant merchant = offer.getMerchant();
            C12775o.m28636f(merchant);
            t0.startActivity(aVar.mo46457v(t02, offer, merchant, true, eVar.f726n, eVar.f727o));
        } else {
            Context t03 = eVar.mo53843t0();
            CashbackActivationActivity.C11200a aVar2 = CashbackActivationActivity.f17643u;
            Context t04 = eVar.mo53843t0();
            Merchant merchant2 = offer.getMerchant();
            C12775o.m28636f(merchant2);
            t03.startActivity(aVar2.mo46456u(t04, offer, merchant2));
        }
    }

    /* renamed from: m2 */
    public void mo23234m2(C13867a aVar, Object obj) {
        int i;
        super.mo23234m2(aVar, obj);
        C12775o.m28637g(obj, "null cannot be cast to non-null type com.rmn.apiclient.impl.api.models.Offer");
        Offer offer = (Offer) obj;
        m1431q2(offer);
        TextView textView = this.f730r;
        if (offer.getOfferType() == OfferType.CODE) {
            i = R.string.offer_use_code;
        } else {
            i = R.string.offer_use_deal;
        }
        textView.setText(i);
        this.f730r.setOnClickListener(new C2080d(this, offer));
    }
}
