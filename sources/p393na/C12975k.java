package p393na;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.notification_admin.NotificationAdminActivity;
import com.poulpeo.p321ui.screens.web.WebActivity;
import com.poulpeo.p321ui.views.listview.ExpandableListView;
import com.rmn.api.p322v2.poulpeo.model.EarningAmount;
import com.rmn.p324ui.screens.AnimatedActivity;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p008i9.C2017c;
import p102g9.C7834c;
import p360id.C12134b;
import p368jd.C12615a;
import p393na.C12970h;
import p419ra.C13269d;
import p419ra.C13274e;
import p419ra.C13275f;
import p419ra.C13276g;
import p432tb.C13477a;
import p432tb.C13479c;
import p445vc.C13616e;
import p445vc.C13617f;
import p445vc.C13618g;
import p446vd.C13629j;
import p450wb.C13689a;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: na.k */
/* compiled from: EarningsFragment.kt */
public final class C12975k extends C12615a implements C12973i, C13276g, C13274e {

    /* renamed from: d */
    private C12970h f20760d;

    /* renamed from: e */
    private boolean f20761e;

    /* renamed from: f */
    private boolean f20762f;

    /* renamed from: g */
    public Map<Integer, View> f20763g = new LinkedHashMap();

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public static final void m29325q2(C12975k kVar, String str, DialogInterface dialogInterface, int i) {
        C12775o.m28639i(kVar, "this$0");
        C12775o.m28639i(str, "$url");
        WebActivity.f17745z.mo46532k(kVar.mo50355M0(), str);
    }

    /* renamed from: r2 */
    private final void m29326r2() {
        if (!isHidden()) {
            C7834c.m15322b(this).mo50959a(mo50355M0().mo47878o2());
            C13618g.f21930b.mo53280e(new C13616e("my-pot", C13617f.POT));
        }
    }

    /* renamed from: B0 */
    public void mo50876B0(double d) {
        AlertDialog.Builder positiveButton = new AlertDialog.Builder(mo50355M0()).setTitle((int) R.string.minimum_payment_dialog_title).setMessage((CharSequence) mo50355M0().getString(R.string.minimum_payment_dialog_message, new Object[]{C13629j.m31134d().format(d)})).setPositiveButton(17039370, (DialogInterface.OnClickListener) null);
        C12775o.m28638h(positiveButton, "Builder(retainedActivity…ndroid.R.string.ok, null)");
        C12134b.m26457c(positiveButton, mo50355M0(), (Function1) null, 2, (Object) null);
    }

    /* renamed from: E */
    public void mo49556E() {
        this.f20762f = true;
    }

    /* renamed from: J0 */
    public void mo49557J0() {
        this.f20761e = true;
    }

    /* renamed from: a */
    public void mo49558a() {
        ((ExpandableListView) mo50880p2(C13865f.earningsListView)).mo47890R0();
    }

    /* renamed from: d2 */
    public void mo50877d2(EarningAmount earningAmount, boolean z) {
        C12775o.m28639i(earningAmount, "earningAmount");
        AnimatedActivity M0 = mo50355M0();
        if (M0 instanceof C13275f) {
            ((C13275f) M0).mo46321v(earningAmount, z, C13269d.f21165g.mo52910c());
        }
    }

    /* renamed from: g1 */
    public void mo50878g1(String str) {
        C12775o.m28639i(str, "url");
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(mo50355M0()).setTitle((int) R.string.open_earnings_in_browser_dialog_title).setMessage((int) R.string.open_earnings_in_browser_dialog_message).setPositiveButton((int) R.string.open_earnings_in_browser_dialog_ok, (DialogInterface.OnClickListener) new C12974j(this, str)).setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        C12775o.m28638h(negativeButton, "Builder(retainedActivity…id.R.string.cancel, null)");
        C12134b.m26457c(negativeButton, mo50355M0(), (Function1) null, 2, (Object) null);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        C12775o.m28639i(menu, "menu");
        C12775o.m28639i(menuInflater, "inflater");
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(R.menu.earnings_menu, menu);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C12775o.m28639i(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_earnings, viewGroup, false);
    }

    public void onDestroy() {
        super.onDestroy();
        C12970h hVar = this.f20760d;
        if (hVar == null) {
            C12775o.m28656z("controller");
            hVar = null;
        }
        hVar.mo45814q2();
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        m29326r2();
        if (!z && this.f20761e) {
            C12970h hVar = this.f20760d;
            if (hVar == null) {
                C12775o.m28656z("controller");
                hVar = null;
            }
            hVar.mo50875F2(true);
            this.f20761e = false;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C12775o.m28639i(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId == R.id.action_reminder) {
            startActivity(NotificationAdminActivity.f17590p.mo46421a(mo50355M0()));
            return true;
        } else if (itemId != R.id.action_ask) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            C13618g.f21930b.mo53278b("earnings", "faq");
            WebActivity.f17745z.mo46529h(mo50355M0());
            return true;
        }
    }

    public void onPause() {
        super.onPause();
        C12970h hVar = this.f20760d;
        if (hVar == null) {
            C12775o.m28656z("controller");
            hVar = null;
        }
        hVar.mo45816s2();
    }

    public void onResume() {
        super.onResume();
        C12970h hVar = this.f20760d;
        if (hVar == null) {
            C12775o.m28656z("controller");
            hVar = null;
        }
        hVar.mo45818u2();
        m29326r2();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C12775o.m28639i(view, "view");
        super.onViewCreated(view, bundle);
        mo50361l2("EarningsFragment", false);
        mo50355M0().setTitle((CharSequence) getString(R.string.earnings_title));
        ActionBar m2 = mo50352m2();
        if (m2 != null) {
            m2.setDisplayHomeAsUpEnabled(false);
        }
        setHasOptionsMenu(true);
        int i = C13865f.earningsListView;
        C13477a expandableListViewController = ((ExpandableListView) mo50880p2(i)).getExpandableListViewController();
        ExpandableListView expandableListView = (ExpandableListView) mo50880p2(i);
        C12775o.m28638h(expandableListView, "earningsListView");
        ((ExpandableListView) mo50880p2(i)).setAdapter(new C2017c(expandableListView, expandableListViewController));
        C12970h hVar = new C12970h(this, new C12970h.C12972b(mo50355M0().mo47878o2(), new C13689a(mo50355M0().mo47878o2()), expandableListViewController, C13479c.f21636k.mo53083a(mo50355M0()).mo53074d(), this.f20762f));
        this.f20760d = hVar;
        hVar.mo45812o2();
    }

    /* renamed from: p2 */
    public View mo50880p2(int i) {
        View findViewById;
        Map<Integer, View> map = this.f20763g;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }
}
