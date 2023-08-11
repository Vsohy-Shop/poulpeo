package p014o9;

import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.poulpeo.R;
import com.rmn.api.p322v2.common.model.BaseMerchant;
import com.rmn.api.p322v2.common.model.Cashback;
import kotlin.jvm.internal.C12775o;
import p336ef.C11915r;
import p336ef.C11921v;
import p446vd.C13629j;
import p450wb.C13690b;
import p463yc.C13867a;
import p469zc.C14080a;

@StabilityInferred(parameters = 0)
/* renamed from: o9.d */
/* compiled from: MerchantSearchViewHolderOld.kt */
public final class C2075d extends C14080a {

    /* renamed from: g */
    private final TextView f707g;

    /* renamed from: h */
    private final TextView f708h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2075d(View view, C13867a.C13868a aVar) {
        super(view, aVar);
        C12775o.m28639i(view, "itemView");
        C12775o.m28639i(aVar, "listener");
        View findViewById = view.findViewById(R.id.textViewMerchantName);
        C12775o.m28638h(findViewById, "itemView.findViewById(R.id.textViewMerchantName)");
        this.f707g = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.textViewCashback);
        C12775o.m28638h(findViewById2, "itemView.findViewById(R.id.textViewCashback)");
        this.f708h = (TextView) findViewById2;
        view.setOnClickListener(this);
    }

    /* renamed from: m2 */
    public void mo23234m2(C13867a aVar, Object obj) {
        C11921v vVar;
        String str;
        C12775o.m28637g(obj, "null cannot be cast to non-null type com.rmn.api.v2.common.model.BaseMerchant");
        BaseMerchant baseMerchant = (BaseMerchant) obj;
        this.f707g.setText(baseMerchant.getName());
        Cashback cashback = baseMerchant.getCashback();
        if (cashback != null) {
            String str2 = C13629j.m31134d().format(cashback.getValue()) + cashback.getType().getDisplay();
            Cashback lastCashback = baseMerchant.getLastCashback();
            if (lastCashback != null) {
                C12775o.m28638h(lastCashback, "lastCashback");
                str = C13629j.m31134d().format(lastCashback.getValue()) + lastCashback.getType().getDisplay();
            } else {
                str = "";
            }
            C13690b.f22034a.mo53353k(this.f708h, str + "  " + str2, C12726w.m28527n(C11915r.m25707a(str2, new ForegroundColorSpan(ContextCompat.getColor(mo53843t0(), R.color.theme))), C11915r.m25707a(str, new ForegroundColorSpan(ContextCompat.getColor(mo53843t0(), R.color.text_subtitle_default))), C11915r.m25707a(str, new StrikethroughSpan())));
            vVar = C11921v.f18618a;
        } else {
            vVar = null;
        }
        if (vVar == null) {
            String string = mo53843t0().getString(R.string.cell_no_cashback);
            C12775o.m28638h(string, "getContext().getString(R.string.cell_no_cashback)");
            C13690b.f22034a.mo53353k(this.f708h, string, C12723v.m28509d(C11915r.m25707a(string, new ForegroundColorSpan(ContextCompat.getColor(mo53843t0(), R.color.text_subtitle_default)))));
        }
    }
}
