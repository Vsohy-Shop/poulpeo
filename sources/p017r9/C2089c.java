package p017r9;

import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.api.p322v2.poulpeo.model.SupportTicketStatusFilter;
import kotlin.jvm.internal.C12775o;
import p009j9.C2038c;
import p360id.C12139g;
import p463yc.C13867a;
import p469zc.C14080a;

@StabilityInferred(parameters = 0)
/* renamed from: r9.c */
/* compiled from: SupportTicketHeaderViewHolder.kt */
public final class C2089c extends C14080a {

    /* renamed from: g */
    private final TextView f745g;

    /* renamed from: h */
    private final ImageButton f746h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2089c(View view, C13867a.C13868a aVar) {
        super(view, aVar);
        C12775o.m28639i(view, "itemView");
        C12775o.m28639i(aVar, "listener");
        View findViewById = view.findViewById(R.id.textViewTitle);
        C12775o.m28638h(findViewById, "itemView.findViewById(R.id.textViewTitle)");
        this.f745g = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.imageButtonFilter);
        C12775o.m28638h(findViewById2, "itemView.findViewById(R.id.imageButtonFilter)");
        ImageButton imageButton = (ImageButton) findViewById2;
        this.f746h = imageButton;
        imageButton.setOnClickListener(new C2087a(this, aVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public static final void m1441p2(C2089c cVar, C13867a.C13868a aVar, View view) {
        C12775o.m28639i(cVar, "this$0");
        C12775o.m28639i(aVar, "$listener");
        PopupMenu popupMenu = new PopupMenu(cVar.mo53843t0(), cVar.f746h);
        popupMenu.setOnMenuItemClickListener(new C2088b(aVar));
        popupMenu.getMenuInflater().inflate(R.menu.support_ticket_list_filter_menu, popupMenu.getMenu());
        popupMenu.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public static final boolean m1442q2(C13867a.C13868a aVar, MenuItem menuItem) {
        SupportTicketStatusFilter supportTicketStatusFilter;
        C12775o.m28639i(aVar, "$listener");
        switch (menuItem.getItemId()) {
            case R.id.action_filter_accepted /*2131361863*/:
                supportTicketStatusFilter = SupportTicketStatusFilter.ACCEPTED;
                break;
            case R.id.action_filter_all /*2131361864*/:
                supportTicketStatusFilter = SupportTicketStatusFilter.ALL;
                break;
            case R.id.action_filter_pending /*2131361865*/:
                supportTicketStatusFilter = SupportTicketStatusFilter.PENDING;
                break;
            case R.id.action_filter_refused /*2131361866*/:
                supportTicketStatusFilter = SupportTicketStatusFilter.REFUSED;
                break;
            default:
                return false;
        }
        aVar.mo46342E(supportTicketStatusFilter);
        return true;
    }

    /* renamed from: m2 */
    public void mo23234m2(C13867a aVar, Object obj) {
        C2038c cVar;
        if (obj instanceof C2038c) {
            cVar = (C2038c) obj;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            this.f745g.setText(cVar.mo23233b());
            C12139g.m26475d(this.f746h, cVar.mo23232a(), 0, 2, (Object) null);
        }
    }
}
