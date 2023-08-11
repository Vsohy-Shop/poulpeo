package p381lb;

import android.content.DialogInterface;
import com.poulpeo.p321ui.screens.support_ticket.SupportTicketDetailActivity;
import com.rmn.api.p322v2.poulpeo.model.Invoice;

/* renamed from: lb.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12795a implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ SupportTicketDetailActivity f20437b;

    /* renamed from: c */
    public final /* synthetic */ Invoice[] f20438c;

    public /* synthetic */ C12795a(SupportTicketDetailActivity supportTicketDetailActivity, Invoice[] invoiceArr) {
        this.f20437b = supportTicketDetailActivity;
        this.f20438c = invoiceArr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        SupportTicketDetailActivity.m24801H2(this.f20437b, this.f20438c, dialogInterface, i);
    }
}
