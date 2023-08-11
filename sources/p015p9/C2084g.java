package p015p9;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.apiclient.impl.api.models.Offer;
import com.rmn.apiclient.impl.api.models.submodels.offer.OfferCodeType;
import com.rmn.apiclient.impl.api.models.submodels.offer.OfferType;
import kotlin.jvm.internal.C12775o;
import p360id.C12139g;
import p446vd.C13637r;
import p463yc.C13867a;

@StabilityInferred(parameters = 0)
/* renamed from: p9.g */
/* compiled from: RevealedOfferViewHolder.kt */
public final class C2084g extends C2076a {

    /* renamed from: n */
    private final TextView f734n;

    /* renamed from: o */
    private final TextView f735o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2084g(View view, C13867a.C13868a aVar) {
        super(view, aVar);
        C12775o.m28639i(view, "itemView");
        C12775o.m28639i(aVar, "listener");
        View findViewById = view.findViewById(R.id.textViewCode);
        C12775o.m28638h(findViewById, "itemView.findViewById(R.id.textViewCode)");
        this.f734n = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.buttonCopy);
        C12775o.m28638h(findViewById2, "itemView.findViewById(R.id.buttonCopy)");
        TextView textView = (TextView) findViewById2;
        this.f735o = textView;
        view.setOnClickListener(this);
        textView.setOnClickListener(new C2083f(this, view));
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public static final void m1435q2(C2084g gVar, View view, View view2) {
        C12775o.m28639i(gVar, "this$0");
        C12775o.m28639i(view, "$itemView");
        gVar.onClick(view);
    }

    /* renamed from: m2 */
    public void mo23234m2(C13867a aVar, Object obj) {
        String str;
        boolean z;
        super.mo23234m2(aVar, obj);
        C12775o.m28637g(obj, "null cannot be cast to non-null type com.rmn.apiclient.impl.api.models.Offer");
        Offer offer = (Offer) obj;
        TextView textView = this.f734n;
        if (offer.codeType == OfferCodeType.MULTIPLE) {
            str = C13637r.f21957b.mo53304a(offer.f18063id);
        } else {
            str = offer.code;
        }
        textView.setText(str);
        TextView textView2 = this.f735o;
        if (offer.getOfferType() == OfferType.CODE) {
            z = true;
        } else {
            z = false;
        }
        C12139g.m26475d(textView2, z, 0, 2, (Object) null);
    }
}
