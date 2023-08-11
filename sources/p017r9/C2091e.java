package p017r9;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.poulpeo.R;
import com.rmn.api.p322v2.poulpeo.model.SupportTicket;
import com.rmn.api.p322v2.poulpeo.model.SupportTicketStatus;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p381lb.C12816l;
import p446vd.C13629j;
import p463yc.C13867a;
import p469zc.C14080a;

@StabilityInferred(parameters = 0)
/* renamed from: r9.e */
/* compiled from: SupportTicketViewHolder.kt */
public final class C2091e extends C14080a {

    /* renamed from: k */
    public static final C2092a f749k = new C2092a((DefaultConstructorMarker) null);

    /* renamed from: l */
    public static final int f750l = 8;

    /* renamed from: m */
    private static final SupportTicketStatus[] f751m = {SupportTicketStatus.CLOSED, SupportTicketStatus.CANCELED};

    /* renamed from: g */
    private final View f752g;

    /* renamed from: h */
    private final TextView f753h;

    /* renamed from: i */
    private final TextView f754i;

    /* renamed from: j */
    private final ImageView f755j;

    /* renamed from: r9.e$a */
    /* compiled from: SupportTicketViewHolder.kt */
    public static final class C2092a {
        private C2092a() {
        }

        public /* synthetic */ C2092a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2091e(View view, C13867a.C13868a aVar) {
        super(view, aVar);
        C12775o.m28639i(view, "itemView");
        C12775o.m28639i(aVar, "listener");
        View findViewById = view.findViewById(R.id.viewIndicator);
        C12775o.m28638h(findViewById, "itemView.findViewById(R.id.viewIndicator)");
        this.f752g = findViewById;
        View findViewById2 = view.findViewById(R.id.textViewSubtitle);
        C12775o.m28638h(findViewById2, "itemView.findViewById(R.id.textViewSubtitle)");
        this.f753h = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.textViewTitle);
        C12775o.m28638h(findViewById3, "itemView.findViewById(R.id.textViewTitle)");
        this.f754i = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.imageViewIndicator);
        C12775o.m28638h(findViewById4, "itemView.findViewById(R.id.imageViewIndicator)");
        this.f755j = (ImageView) findViewById4;
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public static final void m1445o2(C2091e eVar, SupportTicket supportTicket, View view) {
        C12775o.m28639i(eVar, "this$0");
        C12775o.m28639i(supportTicket, "$supportTicket");
        C13867a.C13868a M0 = eVar.mo53841M0();
        if (M0 != null) {
            M0.mo46342E(supportTicket);
        }
    }

    /* renamed from: m2 */
    public void mo23234m2(C13867a aVar, Object obj) {
        SupportTicket supportTicket;
        if (obj instanceof SupportTicket) {
            supportTicket = (SupportTicket) obj;
        } else {
            supportTicket = null;
        }
        if (supportTicket != null) {
            this.itemView.setOnClickListener(new C2090d(this, supportTicket));
            SupportTicketStatus status = supportTicket.getStatus();
            int i = C12816l.m28750a(status, mo53840J0()).f21807a;
            this.f752g.setBackgroundColor(i);
            String format = C13629j.m31131a("dd MMM yyyy").format(supportTicket.getDate());
            String merchantName = supportTicket.getMerchantName();
            this.f753h.setText(format + " - " + merchantName);
            String reference = supportTicket.getReference();
            this.f754i.setText("Demande [" + reference + "]");
            if (C12710p.m28377E(f751m, supportTicket.getStatus())) {
                this.f753h.setTextColor(i);
                this.f754i.setTextColor(i);
            } else {
                this.f753h.setTextColor(ContextCompat.getColor(mo53843t0(), R.color.text_subtitle_default));
                this.f754i.setTextColor(ContextCompat.getColor(mo53843t0(), R.color.text_title_default));
            }
            this.f755j.setImageDrawable(C12816l.m28758i(status).mo53216a(mo53840J0()));
        }
    }
}
