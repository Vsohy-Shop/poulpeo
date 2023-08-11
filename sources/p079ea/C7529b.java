package p079ea;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.merchant_search_old.MerchantSearchActivityOld;
import kotlin.jvm.internal.C12775o;
import p445vc.C13618g;
import p463yc.C13867a;
import p469zc.C14080a;

@StabilityInferred(parameters = 0)
/* renamed from: ea.b */
/* compiled from: SearchSectionViewHolder.kt */
public final class C7529b extends C14080a {

    /* renamed from: g */
    private final String f10426g;

    /* renamed from: h */
    private final TextView f10427h;

    /* renamed from: i */
    private final LinearLayout f10428i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7529b(View view, C13867a.C13868a aVar, String str) {
        super(view, aVar);
        C12775o.m28639i(view, "itemView");
        C12775o.m28639i(str, "trackingPageName");
        this.f10426g = str;
        View findViewById = view.findViewById(R.id.search_textview);
        C12775o.m28638h(findViewById, "itemView.findViewById(R.id.search_textview)");
        this.f10427h = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.search_layout);
        C12775o.m28638h(findViewById2, "itemView.findViewById(R.id.search_layout)");
        this.f10428i = (LinearLayout) findViewById2;
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public static final void m14787o2(C7529b bVar, View view) {
        C12775o.m28639i(bVar, "this$0");
        C13618g.f21930b.mo53278b(bVar.f10426g, "search-bar");
        bVar.mo53843t0().startActivity(MerchantSearchActivityOld.f17564A.mo46411a(bVar.mo53843t0()));
    }

    /* renamed from: m2 */
    public void mo23234m2(C13867a aVar, Object obj) {
        this.f10427h.getPaint().setShader(new LinearGradient(0.0f, 0.0f, 0.0f, (float) this.f10427h.getLineHeight(), mo53843t0().getColor(R.color.background_theme_gradient), mo53843t0().getColor(R.color.background_theme), Shader.TileMode.REPEAT));
        this.f10427h.setTextColor(mo53843t0().getColor(R.color.background_theme_gradient));
        this.f10428i.setOnClickListener(new C7528a(this));
    }
}
