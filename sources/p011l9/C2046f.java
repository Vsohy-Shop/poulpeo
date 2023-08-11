package p011l9;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.poulpeo.R;
import com.rmn.api.p322v2.poulpeo.model.SponsorshipEvent;
import java.text.SimpleDateFormat;
import kotlin.jvm.internal.C12775o;
import p360id.C12139g;
import p446vd.C13629j;
import p463yc.C13867a;
import p469zc.C14080a;

@StabilityInferred(parameters = 0)
/* renamed from: l9.f */
/* compiled from: SponsorshipEventViewHolder.kt */
public final class C2046f extends C14080a {

    /* renamed from: g */
    private final TextView f627g;

    /* renamed from: h */
    private final TextView f628h;

    /* renamed from: i */
    private final View f629i;

    /* renamed from: j */
    private final View f630j;

    /* renamed from: k */
    private final SimpleDateFormat f631k = C13629j.m31131a("dd MMM yyyy");

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2046f(View view, C13867a.C13868a aVar) {
        super(view, aVar);
        C12775o.m28639i(view, "itemView");
        C12775o.m28639i(aVar, "listener");
        View findViewById = view.findViewById(R.id.dateTextView);
        C12775o.m28638h(findViewById, "itemView.findViewById(R.id.dateTextView)");
        this.f627g = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.descriptionTextView);
        C12775o.m28638h(findViewById2, "itemView.findViewById(R.id.descriptionTextView)");
        this.f628h = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.viewAlphaTop);
        C12775o.m28638h(findViewById3, "itemView.findViewById(R.id.viewAlphaTop)");
        this.f629i = findViewById3;
        View findViewById4 = view.findViewById(R.id.viewAlphaBottom);
        C12775o.m28638h(findViewById4, "itemView.findViewById(R.id.viewAlphaBottom)");
        this.f630j = findViewById4;
    }

    /* renamed from: m2 */
    public void mo23234m2(C13867a aVar, Object obj) {
        int i;
        C12775o.m28637g(obj, "null cannot be cast to non-null type com.rmn.api.v2.poulpeo.model.SponsorshipEvent");
        SponsorshipEvent sponsorshipEvent = (SponsorshipEvent) obj;
        if (sponsorshipEvent.getDate() != null) {
            C12139g.m26475d(this.f627g, true, 0, 2, (Object) null);
            this.f627g.setText(this.f631k.format(sponsorshipEvent.getDate()));
        } else {
            C12139g.m26475d(this.f627g, false, 0, 2, (Object) null);
        }
        this.f628h.setText(sponsorshipEvent.getDescription());
        if (sponsorshipEvent.isLast()) {
            i = R.color.text_title_default;
        } else {
            i = R.color.text_subtitle_default;
        }
        this.f627g.setTextColor(ContextCompat.getColor(mo53843t0(), i));
        this.f628h.setTextColor(ContextCompat.getColor(mo53843t0(), i));
        C12139g.m26475d(this.f629i, false, 0, 2, (Object) null);
        C12139g.m26475d(this.f630j, false, 0, 2, (Object) null);
        if (sponsorshipEvent.isFirst()) {
            this.f628h.setPadding(0, 0, 0, 0);
            C12139g.m26475d(this.f629i, true, 0, 2, (Object) null);
        }
        if (sponsorshipEvent.isLast()) {
            ViewGroup.LayoutParams layoutParams = this.f627g.getLayoutParams();
            C12775o.m28637g(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            this.f628h.setPadding(0, 0, 0, ((RelativeLayout.LayoutParams) layoutParams).topMargin);
            if (!sponsorshipEvent.groupIsLast()) {
                C12139g.m26475d(this.f630j, true, 0, 2, (Object) null);
            }
        }
        if (!sponsorshipEvent.isFirst() && !sponsorshipEvent.isLast()) {
            this.f628h.setPadding(0, 0, 0, 0);
        }
    }
}
