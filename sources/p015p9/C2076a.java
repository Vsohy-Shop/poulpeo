package p015p9;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.apiclient.impl.api.models.CashbackObject;
import com.rmn.apiclient.impl.api.models.Merchant;
import com.rmn.apiclient.impl.api.models.Offer;
import com.rmn.apiclient.impl.api.models.submodels.offer.OfferType;
import java.text.NumberFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p360id.C12139g;
import p463yc.C13867a;
import p469zc.C14080a;

@StabilityInferred(parameters = 0)
/* renamed from: p9.a */
/* compiled from: BaseOfferViewHolder.kt */
public abstract class C2076a extends C14080a {

    /* renamed from: l */
    public static final C2077a f709l = new C2077a((DefaultConstructorMarker) null);

    /* renamed from: m */
    public static final int f710m = 8;

    /* renamed from: g */
    private final TextView f711g;

    /* renamed from: h */
    private final TextView f712h;

    /* renamed from: i */
    private final TextView f713i;

    /* renamed from: j */
    private final TextView f714j;

    /* renamed from: k */
    private final TextView f715k;

    /* renamed from: p9.a$a */
    /* compiled from: BaseOfferViewHolder.kt */
    public static final class C2077a {
        private C2077a() {
        }

        public /* synthetic */ C2077a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2076a(View view, C13867a.C13868a aVar) {
        super(view, aVar);
        C12775o.m28639i(view, "itemView");
        View findViewById = view.findViewById(R.id.textViewOfferType);
        C12775o.m28638h(findViewById, "itemView.findViewById(R.id.textViewOfferType)");
        this.f711g = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.textViewTypeCashback);
        C12775o.m28638h(findViewById2, "itemView.findViewById(R.id.textViewTypeCashback)");
        this.f712h = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.textViewTitle);
        C12775o.m28638h(findViewById3, "itemView.findViewById(R.id.textViewTitle)");
        this.f713i = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.textViewExpiration);
        C12775o.m28638h(findViewById4, "itemView.findViewById(R.id.textViewExpiration)");
        this.f714j = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.textViewCashback);
        C12775o.m28638h(findViewById5, "itemView.findViewById(R.id.textViewCashback)");
        this.f715k = (TextView) findViewById5;
    }

    /* renamed from: n2 */
    private final void m1423n2(Offer offer) {
        CashbackObject cashbackObject;
        C12139g.m26475d(this.f715k, false, 0, 2, (Object) null);
        if (offer.canCombineCashbackAndOffersCodes && (cashbackObject = offer.getCashbackObject()) != null) {
            C12139g.m26475d(this.f715k, true, 0, 2, (Object) null);
            this.f715k.setText(cashbackObject.getCashbackText(NumberFormat.getInstance(), mo53840J0().mo47843a().getString(R.string.cashback_amount_variable), mo53840J0().mo47843a().getString(R.string.offer_cumulative_cashback)));
        }
    }

    /* renamed from: o2 */
    private final void m1424o2(Offer offer) {
        C12139g.m26475d(this.f714j, false, 0, 2, (Object) null);
        if (offer.isValidityEndingSoon(TimeUnit.DAYS.toMillis(7))) {
            C12139g.m26475d(this.f714j, true, 0, 2, (Object) null);
            Date dateEndValidity = offer.getDateEndValidity();
            C12775o.m28636f(dateEndValidity);
            long time = dateEndValidity.getTime() - new Date().getTime();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            int days = (int) timeUnit.toDays(time);
            if (days > 0) {
                this.f714j.setText(this.itemView.getContext().getResources().getQuantityString(R.plurals.offer_expiration_days, days, new Object[]{Integer.valueOf(days)}));
                return;
            }
            int hours = (int) timeUnit.toHours(time);
            this.f714j.setText(this.itemView.getContext().getResources().getQuantityString(R.plurals.offer_expiration_hours, hours, new Object[]{Integer.valueOf(hours)}));
        }
    }

    /* renamed from: m2 */
    public void mo23234m2(C13867a aVar, Object obj) {
        boolean z;
        C12775o.m28637g(obj, "null cannot be cast to non-null type com.rmn.apiclient.impl.api.models.Offer");
        Offer offer = (Offer) obj;
        TextView textView = this.f711g;
        OfferType offerType = offer.getOfferType();
        OfferType offerType2 = OfferType.CODE;
        int i = R.string.offer_type_deal;
        textView.setText(offerType == offerType2 ? R.string.offer_type_code : R.string.offer_type_deal);
        C12139g.m26475d(this.f712h, false, 0, 2, (Object) null);
        this.f712h.setTextSize(14.0f);
        this.f712h.setText(R.string.offer_type_plus_cashback);
        this.f712h.setTextColor(mo53843t0().getColor(R.color.text_theme));
        Merchant merchant = offer.getMerchant();
        if (merchant != null) {
            z = merchant.hasCashback();
        } else {
            z = false;
        }
        if (z) {
            if (!offer.canCombineCashbackAndOffersCodes) {
                TextView textView2 = this.f711g;
                if (offer.getOfferType() == offerType2) {
                    i = R.string.title_code_type_with_cashback;
                }
                textView2.setText(i);
                this.f712h.setTextSize(10.0f);
                this.f712h.setText(R.string.no_cashback_with_offer);
                this.f712h.setTextColor(mo53843t0().getColor(R.color.text_condition_not_validated));
            }
            C12139g.m26475d(this.f712h, true, 0, 2, (Object) null);
        }
        this.f713i.setText(offer.shortTitle);
        m1423n2(offer);
        m1424o2(offer);
    }
}
