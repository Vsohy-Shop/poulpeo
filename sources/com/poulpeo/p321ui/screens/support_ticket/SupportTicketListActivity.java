package com.poulpeo.p321ui.screens.support_ticket;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.web.WebActivity;
import com.rmn.api.p322v2.poulpeo.model.SupportTicket;
import com.rmn.p324ui.views.listview.BaseListView;
import com.rmn.p324ui.wrappers.ResourceStringWrapper;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p008i9.C2034m;
import p368jd.C12616b;
import p381lb.C12809i;
import p381lb.C12813j;
import p432tb.C13479c;
import p434td.C13487a;
import p440ud.C13556e;
import p450wb.C13689a;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.support_ticket.SupportTicketListActivity */
/* compiled from: SupportTicketListActivity.kt */
public final class SupportTicketListActivity extends C12616b implements C12813j {

    /* renamed from: p */
    public static final C11220a f17735p = new C11220a((DefaultConstructorMarker) null);

    /* renamed from: q */
    public static final int f17736q = 8;

    /* renamed from: m */
    private final int f17737m = R.string.support_list_title;

    /* renamed from: n */
    private C12809i f17738n;

    /* renamed from: o */
    public Map<Integer, View> f17739o = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.support_ticket.SupportTicketListActivity$a */
    /* compiled from: SupportTicketListActivity.kt */
    public static final class C11220a {
        private C11220a() {
        }

        public /* synthetic */ C11220a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent mo46516a(Context context) {
            C12775o.m28639i(context, "context");
            return new Intent(context, SupportTicketListActivity.class);
        }
    }

    /* renamed from: com.poulpeo.ui.screens.support_ticket.SupportTicketListActivity$b */
    /* compiled from: SupportTicketListActivity.kt */
    public static final class C11221b extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ C13487a f17740a;

        C11221b(C13487a aVar) {
            this.f17740a = aVar;
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C12775o.m28639i(recyclerView, "recyclerView");
            if (i2 > 1) {
                this.f17740a.mo53092c();
            } else if (i2 < 0) {
                this.f17740a.mo53093g();
            }
        }
    }

    /* renamed from: A2 */
    public View mo46512A2(int i) {
        Map<Integer, View> map = this.f17739o;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: C */
    public void mo46513C() {
        startActivity(SupportTicketHelpActivity.f17730p.mo46511a(this));
    }

    /* renamed from: G1 */
    public void mo46514G1(SupportTicket supportTicket) {
        if (supportTicket != null) {
            startActivity(SupportTicketDetailActivity.f17722p.mo46505c(this, supportTicket.getSupportTicketId()));
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo50358x2("SupportTicketListActivity", true);
        setContentView(R.layout.activity_support_ticket_list);
        int i = C13865f.listViewSupportTicket;
        BaseListView baseListView = (BaseListView) mo46512A2(i);
        C12775o.m28638h(baseListView, "listViewSupportTicket");
        ((BaseListView) mo46512A2(i)).setAdapter(new C2034m(baseListView));
        int i2 = C13865f.buttonAddSupportTicket;
        ImageButton imageButton = (ImageButton) mo46512A2(i2);
        C12775o.m28638h(imageButton, "buttonAddSupportTicket");
        ((BaseListView) mo46512A2(i)).setOnScrollListener(new C11221b(new C13487a(imageButton)));
        C12809i iVar = new C12809i(this, new C12809i.C12812c(mo47878o2(), new C13689a(mo47878o2()), ((BaseListView) mo46512A2(i)).getBaseListViewController(), C13479c.f21636k.mo53083a(this).mo53082l(), new C13556e((ImageButton) mo46512A2(i2)), new ResourceStringWrapper(R.string.support_ticket_list_no_result_message)));
        this.f17738n = iVar;
        iVar.mo45812o2();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C12775o.m28639i(menu, "menu");
        getMenuInflater().inflate(R.menu.support_ticket_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C12809i iVar = this.f17738n;
        if (iVar == null) {
            C12775o.m28656z("controller");
            iVar = null;
        }
        iVar.mo45814q2();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C12775o.m28639i(menuItem, "item");
        if (menuItem.getItemId() != R.id.action_ask) {
            return super.onOptionsItemSelected(menuItem);
        }
        WebActivity.f17745z.mo46529h(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C12809i iVar = this.f17738n;
        if (iVar == null) {
            C12775o.m28656z("controller");
            iVar = null;
        }
        iVar.mo45816s2();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C12809i iVar = this.f17738n;
        if (iVar == null) {
            C12775o.m28656z("controller");
            iVar = null;
        }
        iVar.mo45818u2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public int mo46199y2() {
        return this.f17737m;
    }
}
