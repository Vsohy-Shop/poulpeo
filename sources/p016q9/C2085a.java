package p016q9;

import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import kotlin.jvm.internal.C12775o;
import p432tb.C13485e;
import p463yc.C13867a;
import p469zc.C14080a;

@StabilityInferred(parameters = 0)
/* renamed from: q9.a */
/* compiled from: ReviewMerchantHeaderViewHolder.kt */
public final class C2085a extends C14080a {

    /* renamed from: g */
    private final TextView f736g;

    /* renamed from: h */
    private final RatingBar f737h;

    /* renamed from: i */
    private final TextView f738i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2085a(View view, C13867a.C13868a aVar) {
        super(view, aVar);
        C12775o.m28639i(view, "itemView");
        View findViewById = view.findViewById(R.id.textViewTitle);
        C12775o.m28638h(findViewById, "itemView.findViewById(R.id.textViewTitle)");
        this.f736g = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.ratingBar);
        C12775o.m28638h(findViewById2, "itemView.findViewById(R.id.ratingBar)");
        this.f737h = (RatingBar) findViewById2;
        View findViewById3 = view.findViewById(R.id.textViewNumberReviews);
        C12775o.m28638h(findViewById3, "itemView.findViewById(R.id.textViewNumberReviews)");
        this.f738i = (TextView) findViewById3;
    }

    /* renamed from: m2 */
    public void mo23234m2(C13867a aVar, Object obj) {
        if (obj == null || !(obj instanceof C13485e)) {
            throw new IllegalStateException();
        }
        C13485e eVar = (C13485e) obj;
        this.f736g.setText(eVar.mo53084a());
        this.f737h.setRating((float) eVar.mo53086c());
        this.f738i.setText(mo53843t0().getResources().getQuantityString(R.plurals.cashback_number_reviews, eVar.mo53085b(), new Object[]{Integer.valueOf(eVar.mo53085b())}));
    }
}
