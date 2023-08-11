package p344gb;

import android.content.Context;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.apiclient.core.data.structure.IDocument;
import com.rmn.apiclient.core.data.structure.IResource;
import com.rmn.apiclient.core.data_access.base.call.CallException;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyOutput;
import com.rmn.apiclient.core.data_access.proxy.strategy.ProxyStrategy;
import com.rmn.apiclient.core.model.IModel;
import com.rmn.apiclient.impl.api.methods.MerchantBonusApi;
import com.rmn.apiclient.impl.api.models.CashbackObject;
import com.rmn.apiclient.impl.api.models.Merchant;
import com.rmn.apiclient.impl.api.models.MerchantBonus;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.text.NumberFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p360id.C12139g;
import p404of.C13074a;
import p440ud.C13565k;
import p446vd.C13629j;
import p446vd.C13633n;
import p450wb.C13690b;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: gb.c */
/* compiled from: PurchaseCashbackContentView.kt */
public final class C12007c extends ScrollView {

    /* renamed from: b */
    private final Lazy f18770b;

    /* renamed from: c */
    public Map<Integer, View> f18771c = new LinkedHashMap();

    /* renamed from: gb.c$a */
    /* compiled from: PurchaseCashbackContentView.kt */
    static final class C12008a extends C12777p implements C13074a<TextView> {

        /* renamed from: g */
        final /* synthetic */ C12007c f18772g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12008a(C12007c cVar) {
            super(0);
            this.f18772g = cVar;
        }

        /* renamed from: b */
        public final TextView invoke() {
            return (TextView) this.f18772g.findViewById(R.id.textViewConditions);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12007c(Context context) {
        super(context);
        C12775o.m28639i(context, "context");
        this.f18770b = C11901h.m25690b(new C12008a(this));
        LayoutInflater.from(context).inflate(R.layout.layout_cashback_content, this);
        getTextViewConditions().setMovementMethod(new ScrollingMovementMethod());
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final void m26084e(C12007c cVar, CallException callException) {
        C12775o.m28639i(cVar, "this$0");
        C12775o.m28639i(callException, "it");
        C13633n.m31164t(cVar, "ERROR", callException);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final void m26085f(C12007c cVar, ProxyOutput proxyOutput) {
        IModel iModel;
        IResource firstDataResource;
        C12775o.m28639i(cVar, "this$0");
        C12775o.m28639i(proxyOutput, "it");
        if (proxyOutput.getDocument() != null) {
            String string = cVar.getContext().getString(R.string.poulpeo_plus);
            C12775o.m28638h(string, "context.getString(R.string.poulpeo_plus)");
            try {
                IDocument document = proxyOutput.getDocument();
                if (document == null || (firstDataResource = document.getFirstDataResource()) == null) {
                    iModel = null;
                } else {
                    iModel = firstDataResource.getModel();
                }
                C12775o.m28637g(iModel, "null cannot be cast to non-null type com.rmn.apiclient.impl.api.models.MerchantBonus");
                ((TextView) cVar.mo49438c(C13865f.textViewBonusPoulpeoPlus)).setText(cVar.getContext().getString(R.string.merchant_bonus_no_poulpeo_plus, new Object[]{((MerchantBonus) iModel).getAmountText(NumberFormat.getInstance()), string}));
            } catch (Exception e) {
                C13633n.m31166v(e.getMessage());
            }
        }
    }

    /* renamed from: g */
    private final void m26086g(CashbackObject cashbackObject) {
        NumberFormat d = C13629j.m31134d();
        String previousCashbackText = cashbackObject.getPreviousCashbackText(d, " (%s)");
        C12775o.m28638h(previousCashbackText, "cashbackObject.getPreviousCashbackText(f, \" (%s)\")");
        String cashbackText = cashbackObject.getCashbackText(d, getContext().getString(R.string.cashback_amount_variable), C13565k.m30968b(new ContextContainer(getContext()), R.plurals.cashback_refund, (double) cashbackObject.getRate(), "%s" + previousCashbackText));
        C12775o.m28638h(cashbackText, "cashbackObject.getCashba…ount_variable), endTitle)");
        C13690b bVar = C13690b.f22034a;
        TextView textView = (TextView) mo49438c(C13865f.textViewTitle);
        C12775o.m28638h(textView, "textViewTitle");
        Context context = getContext();
        C12775o.m28638h(context, "context");
        bVar.mo53353k(textView, cashbackText, bVar.mo53347e(context, C13755w.m31561N0(previousCashbackText).toString()));
    }

    private final TextView getTextViewConditions() {
        return (TextView) this.f18770b.getValue();
    }

    /* renamed from: c */
    public View mo49438c(int i) {
        Map<Integer, View> map = this.f18771c;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: d */
    public final void mo49439d(Merchant merchant, boolean z) {
        C12775o.m28639i(merchant, "merchant");
        int i = C13865f.textViewCashbackIncrease;
        TextView textView = (TextView) mo49438c(i);
        C12775o.m28638h(textView, "textViewCashbackIncrease");
        String str = null;
        C12139g.m26475d(textView, false, 0, 2, (Object) null);
        CashbackObject cashbackObject = merchant.getCashbackObject();
        if (cashbackObject != null) {
            TextView textView2 = (TextView) mo49438c(i);
            C12775o.m28638h(textView2, "textViewCashbackIncrease");
            C12139g.m26475d(textView2, cashbackObject.hasIncrease(), 0, 2, (Object) null);
            m26086g(cashbackObject);
        }
        new MerchantBonusApi.GetMerchantBonuses(merchant.f18063id, ProxyStrategy.getFromCache().orThenCallService().thenAddInCache()).call(new ContextContainer(getContext())).onFailure(new C12005a(this)).onSuccess(new C12006b(this));
        TextView textView3 = (TextView) mo49438c(C13865f.textViewNoSupport);
        C12775o.m28638h(textView3, "textViewNoSupport");
        boolean z2 = true;
        C12139g.m26475d(textView3, !merchant.support, 0, 2, (Object) null);
        CashbackObject cashbackObject2 = merchant.getCashbackObject();
        if (cashbackObject2 != null) {
            str = cashbackObject2.getPlainTextConditions();
        }
        if (!(str == null || str.length() == 0)) {
            z2 = false;
        }
        if (!z2) {
            getTextViewConditions().setText(str);
        }
        setScrollY(0);
    }
}
