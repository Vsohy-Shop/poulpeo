package p012m9;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.support_ticket.SupportTicketListActivity;
import com.poulpeo.p321ui.screens.web.WebActivity;
import com.rmn.api.p322v2.poulpeo.model.EarningEvent;
import com.rmn.api.p322v2.poulpeo.model.EarningStatus;
import com.rmn.api.p322v2.poulpeo.model.EarningType;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.jvm.internal.C12775o;
import p360id.C12139g;
import p393na.C12968g;
import p445vc.C13618g;
import p446vd.C13629j;
import p463yc.C13867a;
import p469zc.C14080a;

@StabilityInferred(parameters = 0)
/* renamed from: m9.f */
/* compiled from: EarningsEventViewHolder.kt */
public final class C2061f extends C14080a {

    /* renamed from: g */
    private final View f661g;

    /* renamed from: h */
    private final TextView f662h;

    /* renamed from: i */
    private final TextView f663i;

    /* renamed from: j */
    private final View f664j;

    /* renamed from: k */
    private final View f665k;

    /* renamed from: l */
    private final RelativeLayout f666l;

    /* renamed from: m */
    private final TextView f667m;

    /* renamed from: n */
    private final TextView f668n;

    /* renamed from: o */
    private final SimpleDateFormat f669o = C13629j.m31131a("dd MMM yyyy");

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2061f(View view, C13867a.C13868a aVar) {
        super(view, aVar);
        C12775o.m28639i(view, "itemView");
        C12775o.m28639i(aVar, "listener");
        View findViewById = view.findViewById(R.id.statusColorView);
        C12775o.m28638h(findViewById, "itemView.findViewById(R.id.statusColorView)");
        this.f661g = findViewById;
        View findViewById2 = view.findViewById(R.id.dateTextView);
        C12775o.m28638h(findViewById2, "itemView.findViewById(R.id.dateTextView)");
        this.f662h = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.descriptionTextView);
        C12775o.m28638h(findViewById3, "itemView.findViewById(R.id.descriptionTextView)");
        this.f663i = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.viewAlphaTop);
        C12775o.m28638h(findViewById4, "itemView.findViewById(R.id.viewAlphaTop)");
        this.f664j = findViewById4;
        View findViewById5 = view.findViewById(R.id.viewAlphaBottom);
        C12775o.m28638h(findViewById5, "itemView.findViewById(R.id.viewAlphaBottom)");
        this.f665k = findViewById5;
        View findViewById6 = view.findViewById(R.id.layoutTextViewHelp);
        C12775o.m28638h(findViewById6, "itemView.findViewById(R.id.layoutTextViewHelp)");
        this.f666l = (RelativeLayout) findViewById6;
        View findViewById7 = view.findViewById(R.id.faq);
        C12775o.m28638h(findViewById7, "itemView.findViewById(R.id.faq)");
        TextView textView = (TextView) findViewById7;
        this.f667m = textView;
        View findViewById8 = view.findViewById(R.id.client_service);
        C12775o.m28638h(findViewById8, "itemView.findViewById(R.id.client_service)");
        TextView textView2 = (TextView) findViewById8;
        this.f668n = textView2;
        textView.setOnClickListener(new C2059d(this));
        textView2.setOnClickListener(new C2060e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public static final void m1389p2(C2061f fVar, View view) {
        C12775o.m28639i(fVar, "this$0");
        C13618g.f21930b.mo53278b("earnings", "faq-canceled-cashback");
        WebActivity.f17745z.mo46530i(fVar.mo53843t0());
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public static final void m1390q2(C2061f fVar, View view) {
        C12775o.m28639i(fVar, "this$0");
        C13618g.f21930b.mo53278b("earnings", "support");
        fVar.mo53843t0().startActivity(SupportTicketListActivity.f17735p.mo46516a(fVar.mo53843t0()));
    }

    /* renamed from: m2 */
    public void mo23234m2(C13867a aVar, Object obj) {
        int i;
        int i2;
        C12139g.m26475d(this.f666l, false, 0, 2, (Object) null);
        C12775o.m28637g(obj, "null cannot be cast to non-null type com.rmn.api.v2.poulpeo.model.EarningEvent");
        EarningEvent earningEvent = (EarningEvent) obj;
        EarningStatus status = earningEvent.getEarning().getStatus();
        this.f661g.setBackgroundColor(C12968g.m29292a(status, mo53840J0()).f21807a);
        if (earningEvent.getDate() != null) {
            C12139g.m26475d(this.f662h, true, 0, 2, (Object) null);
            this.f662h.setText(this.f669o.format(earningEvent.getDate()));
        } else {
            C12139g.m26474c(this.f662h, false, 4);
        }
        this.f663i.setText(earningEvent.getDescription());
        EarningStatus earningStatus = EarningStatus.REFUSED;
        if (status == earningStatus) {
            i = C12968g.m29292a(status, mo53840J0()).f21807a;
        } else {
            Context t0 = mo53843t0();
            if (earningEvent.isLast()) {
                i2 = R.color.text_title_default;
            } else {
                i2 = R.color.text_subtitle_default;
            }
            i = ContextCompat.getColor(t0, i2);
        }
        this.f662h.setTextColor(i);
        this.f663i.setTextColor(i);
        C12139g.m26475d(this.f664j, false, 0, 2, (Object) null);
        C12139g.m26475d(this.f665k, false, 0, 2, (Object) null);
        if (earningEvent.isFirst()) {
            this.f663i.setPadding(0, 0, 0, 0);
            C12139g.m26475d(this.f664j, true, 0, 2, (Object) null);
        }
        if (earningEvent.isLast()) {
            ViewGroup.LayoutParams layoutParams = this.f662h.getLayoutParams();
            C12775o.m28637g(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            this.f663i.setPadding(0, 0, 0, ((RelativeLayout.LayoutParams) layoutParams).topMargin);
            if (earningEvent.getEarning().getType() == EarningType.CASHBACK && earningEvent.getEarning().getStatus() == earningStatus && (new Date().getTime() - earningEvent.getEarning().getDate().getTime()) / ((long) 86400000) <= 45) {
                C12139g.m26475d(this.f666l, true, 0, 2, (Object) null);
            }
            if (!earningEvent.groupIsLast()) {
                C12139g.m26475d(this.f665k, true, 0, 2, (Object) null);
            }
        }
        if (!earningEvent.isFirst() && !earningEvent.isLast()) {
            this.f663i.setPadding(0, 0, 0, 0);
        }
    }
}
