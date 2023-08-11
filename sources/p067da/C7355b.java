package p067da;

import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.web.WebActivity;
import kotlin.jvm.internal.C12775o;
import p463yc.C13867a;
import p469zc.C14080a;

@StabilityInferred(parameters = 0)
/* renamed from: da.b */
/* compiled from: OfferRankedViewHolder.kt */
public final class C7355b extends C14080a {

    /* renamed from: g */
    private final LinearLayout f10153g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7355b(View view, C13867a.C13868a aVar) {
        super(view, aVar);
        C12775o.m28639i(view, "itemView");
        View findViewById = view.findViewById(R.id.layoutOfferRanking);
        C12775o.m28638h(findViewById, "itemView.findViewById(R.id.layoutOfferRanking)");
        this.f10153g = (LinearLayout) findViewById;
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public static final void m14307o2(C7355b bVar, View view) {
        C12775o.m28639i(bVar, "this$0");
        bVar.mo53843t0().startActivity(WebActivity.f17745z.mo46523b(bVar.mo53843t0()));
    }

    /* renamed from: m2 */
    public void mo23234m2(C13867a aVar, Object obj) {
        this.f10153g.setOnClickListener(new C7354a(this));
    }
}
