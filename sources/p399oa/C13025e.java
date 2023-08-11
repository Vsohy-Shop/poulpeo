package p399oa;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.internal.view.SupportMenu;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.account.AccountActivity;
import com.poulpeo.p321ui.screens.main_menu.MainMenuActivity;
import com.poulpeo.p321ui.screens.sponsorship.SponsorshipActivity;
import com.rmn.apiclient.core.data_access.base.call.CallManager;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.p324ui.views.listview.BaseListView;
import com.rmn.p324ui.views.listview.C11654c;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import p008i9.C2025i;
import p102g9.C7834c;
import p258v9.C10058c;
import p311bd.C10930a;
import p360id.C12136d;
import p360id.C12139g;
import p368jd.C12619e;
import p399oa.C13020a;
import p419ra.C13274e;
import p432tb.C13479c;
import p445vc.C13616e;
import p445vc.C13617f;
import p445vc.C13618g;
import p450wb.C13689a;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: oa.e */
/* compiled from: HomeFragment.kt */
public final class C13025e extends C12619e implements C13031i, C13274e {

    /* renamed from: d */
    private C13020a f20821d;

    /* renamed from: e */
    private C10058c f20822e;

    /* renamed from: f */
    public Map<Integer, View> f20823f = new LinkedHashMap();

    /* renamed from: oa.e$a */
    /* compiled from: HomeFragment.kt */
    public static final class C13026a extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ C13025e f20824a;

        C13026a(C13025e eVar) {
            this.f20824a = eVar;
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            float f;
            C12775o.m28639i(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            AppBarLayout appBarLayout = (AppBarLayout) this.f20824a.mo50938p2(C13865f.appbar);
            if (recyclerView.computeVerticalScrollOffset() > 0) {
                f = (float) C12136d.m26463e(this.f20824a.mo50355M0(), 4);
            } else {
                f = 0.0f;
            }
            appBarLayout.setElevation(f);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public static final void m29400r2(C13025e eVar, View view) {
        C12775o.m28639i(eVar, "this$0");
        C13020a.f20817g = !C13020a.f20817g;
        Intent f = MainMenuActivity.f17407w.mo46323f(eVar.mo50355M0());
        f.setFlags(268468224);
        eVar.mo50355M0().startActivity(f);
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public static final void m29401s2(C13025e eVar, View view) {
        C12775o.m28639i(eVar, "this$0");
        C13618g.f21930b.mo53278b("home", "click-account");
        eVar.startActivity(AccountActivity.f17242p.mo46185a(eVar.mo50355M0()));
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public static final void m29402t2(C13025e eVar, View view) {
        C12775o.m28639i(eVar, "this$0");
        C13618g.f21930b.mo53278b("home", "click-sponsorship");
        eVar.startActivity(SponsorshipActivity.f17717p.mo46494a(eVar.mo50355M0()));
    }

    /* renamed from: x2 */
    private final void m29403x2() {
        if (!isHidden()) {
            C7834c.m15322b(this).mo50959a(mo50355M0().mo47878o2());
            C13618g.f21930b.mo53280e(new C13616e("home-poulpeo", C13617f.HOME));
        }
    }

    /* renamed from: a */
    public void mo49558a() {
        ((BaseListView) mo50938p2(C13865f.homeListView)).mo47890R0();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C12775o.m28639i(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_home, viewGroup, false);
        C12775o.m28638h(inflate, "inflater.inflate(R.layou…t_home, container, false)");
        return inflate;
    }

    public void onDestroy() {
        super.onDestroy();
        C13020a aVar = this.f20821d;
        if (aVar == null) {
            C12775o.m28656z("controller");
            aVar = null;
        }
        aVar.mo45814q2();
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        C13020a aVar = null;
        if (z) {
            C13020a aVar2 = this.f20821d;
            if (aVar2 == null) {
                C12775o.m28656z("controller");
            } else {
                aVar = aVar2;
            }
            aVar.mo45816s2();
        } else {
            C13020a aVar3 = this.f20821d;
            if (aVar3 == null) {
                C12775o.m28656z("controller");
            } else {
                aVar = aVar3;
            }
            aVar.mo45818u2();
        }
        m29403x2();
    }

    public void onPause() {
        super.onPause();
        C13020a aVar = this.f20821d;
        if (aVar == null) {
            C12775o.m28656z("controller");
            aVar = null;
        }
        aVar.mo45816s2();
    }

    public void onResume() {
        super.onResume();
        C13020a aVar = this.f20821d;
        if (aVar == null) {
            C12775o.m28656z("controller");
            aVar = null;
        }
        aVar.mo45818u2();
        m29403x2();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C10058c cVar;
        C12775o.m28639i(view, "view");
        super.onViewCreated(view, bundle);
        mo50361l2("HomeFragment", true);
        mo50355M0().setTitle((CharSequence) "");
        ((Button) mo50938p2(C13865f.buttonAccount)).setOnClickListener(new C13022b(this));
        ((Button) mo50938p2(C13865f.buttonSponsorshipAd)).setOnClickListener(new C13023c(this));
        this.f20822e = new C10058c("");
        ContextContainer o2 = mo50355M0().mo47878o2();
        C13689a aVar = new C13689a(mo50355M0().mo47878o2());
        int i = C13865f.homeListView;
        C10930a baseListViewController = ((BaseListView) mo50938p2(i)).getBaseListViewController();
        C11654c f = C13479c.f21636k.mo53083a(mo50355M0()).mo53076f();
        String I2 = C13020a.m29394I2();
        C10058c cVar2 = this.f20822e;
        if (cVar2 == null) {
            C12775o.m28656z("pageReload");
            cVar = null;
        } else {
            cVar = cVar2;
        }
        C13020a aVar2 = new C13020a(this, new C13020a.C13021a(o2, aVar, baseListViewController, f, I2, cVar));
        this.f20821d = aVar2;
        aVar2.mo45812o2();
        BaseListView baseListView = (BaseListView) mo50938p2(i);
        BaseListView baseListView2 = (BaseListView) mo50938p2(i);
        C12775o.m28638h(baseListView2, "homeListView");
        C13020a aVar3 = this.f20821d;
        if (aVar3 == null) {
            C12775o.m28656z("controller");
            aVar3 = null;
        }
        CallManager A2 = aVar3.mo50943A2();
        C12775o.m28638h(A2, "controller.callManager");
        C10058c cVar3 = this.f20822e;
        if (cVar3 == null) {
            C12775o.m28656z("pageReload");
            cVar3 = null;
        }
        baseListView.setAdapter(new C2025i(baseListView2, A2, cVar3, "home"));
        ((BaseListView) mo50938p2(i)).getRecyclerView().setVerticalScrollBarEnabled(false);
        ((BaseListView) mo50938p2(i)).getRecyclerView().setItemAnimator((RecyclerView.ItemAnimator) null);
        ((BaseListView) mo50938p2(i)).getRecyclerView().addOnScrollListener(new C13026a(this));
    }

    /* renamed from: p2 */
    public View mo50938p2(int i) {
        View findViewById;
        Map<Integer, View> map = this.f20823f;
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

    /* renamed from: q2 */
    public final void mo50939q2() {
        int i;
        int i2 = C13865f.buttonSwapProdAndTest;
        FloatingActionButton floatingActionButton = (FloatingActionButton) mo50938p2(i2);
        C12775o.m28638h(floatingActionButton, "buttonSwapProdAndTest");
        C12139g.m26475d(floatingActionButton, true, 0, 2, (Object) null);
        FloatingActionButton floatingActionButton2 = (FloatingActionButton) mo50938p2(i2);
        if (C13020a.f20817g) {
            i = SupportMenu.CATEGORY_MASK;
        } else {
            i = -16711936;
        }
        floatingActionButton2.setBackgroundTintList(ColorStateList.valueOf(i));
        ((FloatingActionButton) mo50938p2(i2)).setOnClickListener(new C13024d(this));
    }

    /* renamed from: u2 */
    public final void mo50940u2() {
        C13020a aVar = this.f20821d;
        if (aVar == null) {
            C12775o.m28656z("controller");
            aVar = null;
        }
        aVar.mo50944H2();
    }

    /* renamed from: v2 */
    public final void mo50941v2(String str) {
        C12775o.m28639i(str, "title");
        ((Button) mo50938p2(C13865f.buttonAccount)).setText(str);
    }

    /* renamed from: w2 */
    public final void mo50942w2(String str) {
        C12775o.m28639i(str, "title");
        ((Button) mo50938p2(C13865f.buttonSponsorshipAd)).setText(str);
    }
}
