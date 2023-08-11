package p011l9;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.api.p322v2.poulpeo.model.Country;
import kotlin.jvm.internal.C12775o;
import p463yc.C13867a;
import p469zc.C14080a;

@StabilityInferred(parameters = 0)
/* renamed from: l9.b */
/* compiled from: CountryViewHolder.kt */
public final class C2041b extends C14080a {

    /* renamed from: g */
    private final TextView f613g;

    /* renamed from: h */
    private Country f614h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2041b(View view, C13867a.C13868a aVar) {
        super(view, aVar);
        C12775o.m28639i(view, "itemView");
        C12775o.m28639i(aVar, "listener");
        View findViewById = view.findViewById(R.id.textViewName);
        C12775o.m28638h(findViewById, "itemView.findViewById(R.id.textViewName)");
        this.f613g = (TextView) findViewById;
        view.setOnClickListener(new C2040a(aVar, this));
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public static final void m1354o2(C13867a.C13868a aVar, C2041b bVar, View view) {
        C12775o.m28639i(aVar, "$listener");
        C12775o.m28639i(bVar, "this$0");
        Country country = bVar.f614h;
        if (country == null) {
            C12775o.m28656z("country");
            country = null;
        }
        aVar.mo46342E(country);
    }

    /* renamed from: m2 */
    public void mo23234m2(C13867a aVar, Object obj) {
        C12775o.m28637g(obj, "null cannot be cast to non-null type com.rmn.api.v2.poulpeo.model.Country");
        Country country = (Country) obj;
        this.f614h = country;
        TextView textView = this.f613g;
        if (country == null) {
            C12775o.m28656z("country");
            country = null;
        }
        textView.setText(country.getLabel());
    }
}
