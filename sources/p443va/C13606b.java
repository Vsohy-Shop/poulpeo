package p443va;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.merchant.MerchantActivity;
import com.poulpeo.p321ui.screens.merchant_favorites_add.MerchantFavoritesAddActivity;
import com.rmn.api.p322v2.common.model.BaseMerchant;
import com.rmn.p324ui.views.listview.BaseListView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p008i9.C2020e;
import p368jd.C12615a;
import p390md.C12931a;
import p390md.C12934b;
import p415qc.C13240e;
import p415qc.C13242g;
import p419ra.C13274e;
import p427sc.C13390f;
import p432tb.C13479c;
import p440ud.C13564j;
import p445vc.C13618g;
import p445vc.C13619h;
import p450wb.C13689a;
import p457xc.C13771a;
import p462yb.C13865f;
import p463yc.C13867a;

@StabilityInferred(parameters = 0)
/* renamed from: va.b */
/* compiled from: MerchantFavoritesFragment.kt */
public final class C13606b extends C12615a implements C12934b, C13274e {

    /* renamed from: d */
    private C12931a f21859d;

    /* renamed from: e */
    private C2020e f21860e;

    /* renamed from: f */
    private Menu f21861f;

    /* renamed from: g */
    public Map<Integer, View> f21862g = new LinkedHashMap();

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public static final void m31042q2(C13606b bVar, View view) {
        C12775o.m28639i(bVar, "this$0");
        C13618g.f21930b.mo53278b("favorite-merchant", "find-merchant");
        bVar.startActivity(MerchantFavoritesAddActivity.f17499K.mo46374c(bVar.mo50355M0(), false));
    }

    /* renamed from: D */
    public void mo46396D(BaseMerchant baseMerchant) {
        C12775o.m28639i(baseMerchant, "merchant");
        C13619h.f21932a.mo53281b("favorite-merchant", "click", baseMerchant);
        startActivity(MerchantActivity.C11159a.m24356i(MerchantActivity.f17469w, mo50355M0(), String.valueOf(baseMerchant.getMerchantId()), false, (String) null, 8, (Object) null));
    }

    /* renamed from: E0 */
    public void mo50856E0(Set<? extends BaseMerchant> set) {
        C12775o.m28639i(set, "merchants");
        ArrayList arrayList = new ArrayList(set.size());
        for (BaseMerchant trackingMerchantId : set) {
            arrayList.add(trackingMerchantId.getTrackingMerchantId());
        }
        new C13240e(mo50355M0().mo47878o2()).mo52888c(C13242g.f21083N, mo50360R0()).mo52889g(new C13390f("merchant_favorite_remove", (List<String>) arrayList, (String) null));
        for (BaseMerchant b : set) {
            C13619h.f21932a.mo53281b("favorite-merchant", "delete-merchant", b);
        }
    }

    /* renamed from: G0 */
    public void mo50857G0() {
        ActionBar supportActionBar = mo50355M0().getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setHomeAsUpIndicator(ContextCompat.getDrawable(mo50355M0(), R.drawable.action_close));
        }
    }

    /* renamed from: Z1 */
    public void mo50858Z1() {
        ActionBar supportActionBar = mo50355M0().getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setHomeAsUpIndicator((Drawable) null);
        }
    }

    /* renamed from: a */
    public void mo49558a() {
        ((BaseListView) mo53263p2(C13865f.merchantGridView)).mo47890R0();
    }

    /* renamed from: k2 */
    public void mo50859k2(boolean z) {
        MenuItem menuItem;
        Menu menu = this.f21861f;
        if (menu != null) {
            menuItem = menu.findItem(R.id.action_edit_validate);
        } else {
            menuItem = null;
        }
        if (menuItem != null) {
            menuItem.setVisible(z);
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        C12775o.m28639i(menu, "menu");
        C12775o.m28639i(menuInflater, "inflater");
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(R.menu.merchant_favorite_grid_menu, menu);
        if (this.f21861f == null) {
            this.f21861f = menu;
        }
        C12931a aVar = this.f21859d;
        if (aVar == null) {
            C12775o.m28656z("controller");
            aVar = null;
        }
        aVar.mo50854Z2();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C12775o.m28639i(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_merchant_favorite_grid, viewGroup, false);
    }

    public void onDestroy() {
        super.onDestroy();
        C12931a aVar = this.f21859d;
        if (aVar == null) {
            C12775o.m28656z("controller");
            aVar = null;
        }
        aVar.mo45814q2();
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        C12931a aVar = null;
        if (z) {
            C12931a aVar2 = this.f21859d;
            if (aVar2 == null) {
                C12775o.m28656z("controller");
            } else {
                aVar = aVar2;
            }
            aVar.mo45816s2();
            return;
        }
        C12931a aVar3 = this.f21859d;
        if (aVar3 == null) {
            C12775o.m28656z("controller");
        } else {
            aVar = aVar3;
        }
        aVar.mo45818u2();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C12775o.m28639i(menuItem, "item");
        int itemId = menuItem.getItemId();
        C12931a aVar = null;
        if (itemId == R.id.action_edit) {
            C12931a aVar2 = this.f21859d;
            if (aVar2 == null) {
                C12775o.m28656z("controller");
                aVar2 = null;
            }
            if (aVar2.mo50850V2()) {
                return true;
            }
            C12931a aVar3 = this.f21859d;
            if (aVar3 == null) {
                C12775o.m28656z("controller");
            } else {
                aVar = aVar3;
            }
            aVar.mo50846Q2();
            return true;
        } else if (itemId != R.id.action_edit_validate) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            C12931a aVar4 = this.f21859d;
            if (aVar4 == null) {
                C12775o.m28656z("controller");
            } else {
                aVar = aVar4;
            }
            aVar.mo50855a3();
            return true;
        }
    }

    public void onPause() {
        super.onPause();
        C12931a aVar = this.f21859d;
        if (aVar == null) {
            C12775o.m28656z("controller");
            aVar = null;
        }
        aVar.mo45816s2();
    }

    public void onResume() {
        super.onResume();
        C12931a aVar = this.f21859d;
        if (aVar == null) {
            C12775o.m28656z("controller");
            aVar = null;
        }
        aVar.mo45818u2();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C12775o.m28639i(view, "view");
        super.onViewCreated(view, bundle);
        mo50361l2("MerchantFavoritesFragment", true);
        mo50355M0().setTitle((CharSequence) getString(R.string.favorites_title));
        ActionBar m2 = mo50352m2();
        if (m2 != null) {
            m2.setDisplayHomeAsUpEnabled(false);
        }
        setHasOptionsMenu(true);
        ((Button) mo53263p2(C13865f.buttonAddMerchants)).setOnClickListener(new C13605a(this));
        C13771a aVar = new C13771a(false, false, new C13564j(R.drawable.action_delete));
        int i = C13865f.merchantGridView;
        BaseListView baseListView = (BaseListView) mo53263p2(i);
        C12775o.m28638h(baseListView, "merchantGridView");
        C2020e eVar = new C2020e(baseListView, 1, aVar, 0, 8, (DefaultConstructorMarker) null);
        this.f21860e = eVar;
        eVar.mo53569v(C13867a.f22581i.mo53574a());
        BaseListView baseListView2 = (BaseListView) mo53263p2(i);
        C2020e eVar2 = this.f21860e;
        if (eVar2 == null) {
            C12775o.m28656z("adapter");
            eVar2 = null;
        }
        baseListView2.setAdapter(eVar2);
        C13607c cVar = new C13607c(this, new C12931a.C12933b(mo50355M0().mo47878o2(), new C13689a(mo50355M0().mo47878o2()), ((BaseListView) mo53263p2(i)).getBaseListViewController(), C13479c.f21636k.mo53083a(mo50355M0()).mo53075e(), aVar));
        this.f21859d = cVar;
        cVar.mo45812o2();
    }

    /* renamed from: p0 */
    public void mo50860p0(boolean z) {
        MenuItem menuItem;
        Menu menu = this.f21861f;
        if (menu != null) {
            menuItem = menu.findItem(R.id.action_edit);
        } else {
            menuItem = null;
        }
        if (menuItem != null) {
            menuItem.setVisible(z);
        }
    }

    /* renamed from: p2 */
    public View mo53263p2(int i) {
        View findViewById;
        Map<Integer, View> map = this.f21862g;
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

    /* renamed from: m */
    public void mo46397m(boolean z) {
    }
}
