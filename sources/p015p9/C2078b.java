package p015p9;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import com.rmn.apiclient.impl.api.models.CashbackObject;
import com.rmn.apiclient.impl.api.models.Merchant;
import com.rmn.apiclient.impl.api.models.MerchantBonus;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.text.NumberFormat;
import kotlin.jvm.internal.C12775o;
import p360id.C12139g;
import p431ta.C13476y;
import p440ud.C13565k;
import p446vd.C13629j;
import p450wb.C13690b;
import p463yc.C13867a;
import p469zc.C14080a;

@StabilityInferred(parameters = 0)
/* renamed from: p9.b */
/* compiled from: CashbackViewHolder.kt */
public final class C2078b extends C14080a implements C13476y {

    /* renamed from: g */
    private final TextView f716g;

    /* renamed from: h */
    private final TextView f717h;

    /* renamed from: i */
    private final Button f718i;

    /* renamed from: j */
    private final Button f719j;

    /* renamed from: k */
    private final TextView f720k;

    /* renamed from: l */
    private final TextView f721l;

    /* renamed from: m */
    private Merchant f722m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2078b(View view, C13867a.C13868a aVar, View.OnClickListener onClickListener) {
        super(view, aVar);
        C12775o.m28639i(view, "itemView");
        C12775o.m28639i(aVar, "listener");
        C12775o.m28639i(onClickListener, "conditionsClickListener");
        View findViewById = view.findViewById(R.id.textViewCashbackIncrease);
        C12775o.m28638h(findViewById, "itemView.findViewById(R.…textViewCashbackIncrease)");
        this.f716g = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.textViewTitle);
        C12775o.m28638h(findViewById2, "itemView.findViewById(R.id.textViewTitle)");
        this.f717h = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.buttonSeeConditions);
        C12775o.m28638h(findViewById3, "itemView.findViewById(R.id.buttonSeeConditions)");
        Button button = (Button) findViewById3;
        this.f718i = button;
        View findViewById4 = view.findViewById(R.id.buttonActivateCashback);
        C12775o.m28638h(findViewById4, "itemView.findViewById(R.id.buttonActivateCashback)");
        Button button2 = (Button) findViewById4;
        this.f719j = button2;
        View findViewById5 = view.findViewById(R.id.textViewAppToApp);
        C12775o.m28638h(findViewById5, "itemView.findViewById(R.id.textViewAppToApp)");
        this.f720k = (TextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.textViewPoulpeoPlusBonus);
        C12775o.m28638h(findViewById6, "itemView.findViewById(R.…textViewPoulpeoPlusBonus)");
        TextView textView = (TextView) findViewById6;
        this.f721l = textView;
        button.setOnClickListener(onClickListener);
        button2.setOnClickListener(this);
        C12139g.m26475d(textView, false, 0, 2, (Object) null);
    }

    /* renamed from: n2 */
    private final void m1426n2(CashbackObject cashbackObject) {
        NumberFormat d = C13629j.m31134d();
        String previousCashbackText = cashbackObject.getPreviousCashbackText(d, " (%s)");
        C12775o.m28638h(previousCashbackText, "cashbackObject.getPreviousCashbackText(f, \" (%s)\")");
        String cashbackText = cashbackObject.getCashbackText(d, mo53843t0().getString(R.string.cashback_amount_variable), C13565k.m30968b(new ContextContainer(mo53843t0()), R.plurals.cashback_refund, (double) cashbackObject.getRate(), "%s" + previousCashbackText));
        C12775o.m28638h(cashbackText, "cashbackObject.getCashba…ount_variable), endTitle)");
        if (!cashbackObject.hasIncrease()) {
            cashbackText = cashbackText + "\n" + mo53843t0().getString(R.string.cashback_label_end);
        }
        C13690b bVar = C13690b.f22034a;
        bVar.mo53353k(this.f717h, cashbackText, bVar.mo53347e(mo53843t0(), C13755w.m31561N0(previousCashbackText).toString()));
    }

    /* renamed from: a */
    public void mo23259a(MerchantBonus merchantBonus, boolean z) {
        C12775o.m28639i(merchantBonus, APIResourceDescriptors.RESOURCE_TYPE_MERCHANT_BONUS);
        String string = mo53843t0().getString(R.string.poulpeo_plus);
        C12775o.m28638h(string, "getContext().getString(R.string.poulpeo_plus)");
        this.f721l.setText(mo53843t0().getString(R.string.merchant_bonus_no_poulpeo_plus, new Object[]{merchantBonus.getAmountText(NumberFormat.getInstance()), string}));
        C12139g.m26475d(this.f721l, z, 0, 2, (Object) null);
    }

    /* renamed from: m2 */
    public void mo23234m2(C13867a aVar, Object obj) {
        C12775o.m28637g(obj, "null cannot be cast to non-null type com.rmn.apiclient.impl.api.models.Merchant");
        Merchant merchant = (Merchant) obj;
        this.f722m = merchant;
        if (merchant == null) {
            C12775o.m28656z("merchant");
            merchant = null;
        }
        CashbackObject cashbackObject = merchant.getCashbackObject();
        if (cashbackObject != null) {
            C12139g.m26475d(this.f716g, cashbackObject.hasIncrease(), 0, 2, (Object) null);
            m1426n2(cashbackObject);
            TextView textView = this.f720k;
            Context t0 = mo53843t0();
            Object[] objArr = new Object[1];
            Merchant merchant2 = this.f722m;
            if (merchant2 == null) {
                C12775o.m28656z("merchant");
                merchant2 = null;
            }
            objArr[0] = merchant2.name;
            textView.setText(t0.getString(R.string.cashback_tag_app_to_app, objArr));
            TextView textView2 = this.f720k;
            Merchant merchant3 = this.f722m;
            if (merchant3 == null) {
                C12775o.m28656z("merchant");
                merchant3 = null;
            }
            C12139g.m26475d(textView2, merchant3.hasAppToAppTracking(), 0, 2, (Object) null);
        }
    }
}
