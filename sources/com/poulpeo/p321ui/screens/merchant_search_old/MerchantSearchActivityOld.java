package com.poulpeo.p321ui.screens.merchant_search_old;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.merchant.MerchantActivity;
import com.poulpeo.p321ui.screens.merchant_grid.C11173a;
import com.rmn.p324ui.toolbar.ToolbarBehavior;
import com.rmn.p324ui.views.listview.BaseListView;
import com.rmn.utils.AndroidUtil;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p008i9.C2024h;
import p236t9.C9772d;
import p360id.C12139g;
import p365ja.C12606d;
import p404of.C13074a;
import p415qc.C13240e;
import p427sc.C13394j;
import p432tb.C13479c;
import p440ud.C13574r;
import p450wb.C13689a;
import p461ya.C13852a;
import p461ya.C13853b;
import p462yb.C13865f;
import p463yc.C13867a;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.merchant_search_old.MerchantSearchActivityOld */
/* compiled from: MerchantSearchActivityOld.kt */
public class MerchantSearchActivityOld extends C12606d implements C13852a {

    /* renamed from: A */
    public static final C11178a f17564A = new C11178a((DefaultConstructorMarker) null);

    /* renamed from: B */
    public static final int f17565B = 8;

    /* renamed from: o */
    private final int f17566o = R.anim.fade_out;

    /* renamed from: p */
    private final int f17567p = R.anim.fade_in;

    /* renamed from: q */
    private final int f17568q = R.layout.activity_merchant_search;

    /* renamed from: r */
    private final String f17569r = "MerchantSearchActivity";

    /* renamed from: s */
    private final int f17570s = R.string.menu_merchant_search;

    /* renamed from: t */
    private final Lazy f17571t = C11901h.m25690b(new C11180c(this));

    /* renamed from: u */
    private final Lazy f17572u = C11901h.m25690b(new C11183f(this));

    /* renamed from: v */
    protected ToolbarBehavior f17573v;

    /* renamed from: w */
    protected ToolbarBehavior f17574w;

    /* renamed from: x */
    private AppBarLayout f17575x;

    /* renamed from: y */
    private final Lazy f17576y = C11901h.m25690b(new C11179b(this));

    /* renamed from: z */
    public Map<Integer, View> f17577z = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.merchant_search_old.MerchantSearchActivityOld$a */
    /* compiled from: MerchantSearchActivityOld.kt */
    public static final class C11178a {
        private C11178a() {
        }

        public /* synthetic */ C11178a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent mo46411a(Context context) {
            C12775o.m28639i(context, "context");
            return new Intent(context, MerchantSearchActivityOld.class);
        }
    }

    /* renamed from: com.poulpeo.ui.screens.merchant_search_old.MerchantSearchActivityOld$b */
    /* compiled from: MerchantSearchActivityOld.kt */
    static final class C11179b extends C12777p implements C13074a<C13853b> {

        /* renamed from: g */
        final /* synthetic */ MerchantSearchActivityOld f17578g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11179b(MerchantSearchActivityOld merchantSearchActivityOld) {
            super(0);
            this.f17578g = merchantSearchActivityOld;
        }

        /* renamed from: b */
        public final C13853b invoke() {
            MerchantSearchActivityOld merchantSearchActivityOld = this.f17578g;
            return new C13853b(merchantSearchActivityOld, new C13853b.C13856c(merchantSearchActivityOld.mo47878o2(), new C13689a(this.f17578g.mo47878o2()), new C13574r(this.f17578g.mo46369Q2()), this.f17578g.mo46369Q2().getBaseListViewController(), C13479c.f21636k.mo53083a(this.f17578g).mo53080j(), new C13574r(this.f17578g.mo46366L2()), this.f17578g.mo46366L2().getBaseListViewController()));
        }
    }

    /* renamed from: com.poulpeo.ui.screens.merchant_search_old.MerchantSearchActivityOld$c */
    /* compiled from: MerchantSearchActivityOld.kt */
    static final class C11180c extends C12777p implements C13074a<C9772d> {

        /* renamed from: g */
        final /* synthetic */ MerchantSearchActivityOld f17579g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11180c(MerchantSearchActivityOld merchantSearchActivityOld) {
            super(0);
            this.f17579g = merchantSearchActivityOld;
        }

        /* renamed from: b */
        public final C9772d invoke() {
            return new C9772d(this.f17579g.mo46366L2(), 1, R.layout.view_merchant_search_default_title, "Boutiques populaires", "app_boutiques_populaires", C11173a.C11175b.SEARCH, "");
        }
    }

    /* renamed from: com.poulpeo.ui.screens.merchant_search_old.MerchantSearchActivityOld$d */
    /* compiled from: MerchantSearchActivityOld.kt */
    public static final class C11181d extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ MerchantSearchActivityOld f17580a;

        C11181d(MerchantSearchActivityOld merchantSearchActivityOld) {
            this.f17580a = merchantSearchActivityOld;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            C12775o.m28639i(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            this.f17580a.mo46408e();
        }
    }

    /* renamed from: com.poulpeo.ui.screens.merchant_search_old.MerchantSearchActivityOld$e */
    /* compiled from: MerchantSearchActivityOld.kt */
    public static final class C11182e extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ MerchantSearchActivityOld f17581a;

        C11182e(MerchantSearchActivityOld merchantSearchActivityOld) {
            this.f17581a = merchantSearchActivityOld;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            C12775o.m28639i(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            this.f17581a.mo46408e();
        }
    }

    /* renamed from: com.poulpeo.ui.screens.merchant_search_old.MerchantSearchActivityOld$f */
    /* compiled from: MerchantSearchActivityOld.kt */
    static final class C11183f extends C12777p implements C13074a<C2024h> {

        /* renamed from: g */
        final /* synthetic */ MerchantSearchActivityOld f17582g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11183f(MerchantSearchActivityOld merchantSearchActivityOld) {
            super(0);
            this.f17582g = merchantSearchActivityOld;
        }

        /* renamed from: b */
        public final C2024h invoke() {
            return new C2024h(this.f17582g.mo46369Q2());
        }
    }

    /* renamed from: A1 */
    public void mo46400A1() {
        mo46404S2(mo46402M2());
        View I2 = mo46363I2(C13865f.viewOffersInfo);
        C12775o.m28638h(I2, "viewOffersInfo");
        C12139g.m26475d(I2, true, 0, 2, (Object) null);
    }

    /* renamed from: C1 */
    public void mo46401C1(String str) {
        boolean z;
        C12775o.m28639i(str, "query");
        String B2 = mo46364J2().mo53534B2();
        if (B2 == null || B2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            new C13240e((Context) this).mo52889g(new C13394j(str));
        }
    }

    /* renamed from: I2 */
    public View mo46363I2(int i) {
        Map<Integer, View> map = this.f17577z;
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

    /* access modifiers changed from: protected */
    /* renamed from: J2 */
    public C13853b mo46364J2() {
        return (C13853b) this.f17576y.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: K2 */
    public C13867a mo46365K2() {
        return (C13867a) this.f17571t.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: L2 */
    public BaseListView mo46366L2() {
        BaseListView baseListView = (BaseListView) mo46363I2(C13865f.defaultMerchantsGrid);
        C12775o.m28638h(baseListView, "defaultMerchantsGrid");
        return baseListView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M2 */
    public final ToolbarBehavior mo46402M2() {
        ToolbarBehavior toolbarBehavior = this.f17573v;
        if (toolbarBehavior != null) {
            return toolbarBehavior;
        }
        C12775o.m28656z("defaultMerchantsBehavior");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: N2 */
    public int mo46367N2() {
        return this.f17568q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O2 */
    public C13867a mo46368O2() {
        return (C13867a) this.f17572u.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: P2 */
    public final ToolbarBehavior mo46403P2() {
        ToolbarBehavior toolbarBehavior = this.f17574w;
        if (toolbarBehavior != null) {
            return toolbarBehavior;
        }
        C12775o.m28656z("searchResultBehavior");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q2 */
    public BaseListView mo46369Q2() {
        BaseListView baseListView = (BaseListView) mo46363I2(C13865f.searchResultListView);
        C12775o.m28638h(baseListView, "searchResultListView");
        return baseListView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: R2 */
    public String mo46370R2() {
        return this.f17569r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S2 */
    public final void mo46404S2(ToolbarBehavior toolbarBehavior) {
        C12775o.m28639i(toolbarBehavior, "toolbarBehavior");
        AppBarLayout appBarLayout = this.f17575x;
        AppBarLayout appBarLayout2 = null;
        if (appBarLayout == null) {
            C12775o.m28656z("appBar");
            appBarLayout = null;
        }
        ViewGroup.LayoutParams layoutParams = appBarLayout.getLayoutParams();
        C12775o.m28637g(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        ((CoordinatorLayout.LayoutParams) layoutParams).setBehavior(toolbarBehavior);
        AppBarLayout appBarLayout3 = this.f17575x;
        if (appBarLayout3 == null) {
            C12775o.m28656z("appBar");
        } else {
            appBarLayout2 = appBarLayout3;
        }
        appBarLayout2.requestLayout();
    }

    /* access modifiers changed from: protected */
    /* renamed from: T2 */
    public final void mo46405T2(ToolbarBehavior toolbarBehavior) {
        C12775o.m28639i(toolbarBehavior, "<set-?>");
        this.f17573v = toolbarBehavior;
    }

    /* access modifiers changed from: protected */
    /* renamed from: U2 */
    public final void mo46406U2(ToolbarBehavior toolbarBehavior) {
        C12775o.m28639i(toolbarBehavior, "<set-?>");
        this.f17574w = toolbarBehavior;
    }

    /* renamed from: X1 */
    public void mo46407X1() {
        mo46404S2(mo46403P2());
        View I2 = mo46363I2(C13865f.viewOffersInfo);
        C12775o.m28638h(I2, "viewOffersInfo");
        C12139g.m26475d(I2, false, 0, 2, (Object) null);
    }

    /* renamed from: e */
    public void mo46408e() {
        AndroidUtil.hideSoftKeyboard(this, true);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(mo46367N2());
        mo50358x2(mo46370R2(), true);
        mo50330E2(R.string.search_hint_merchant);
        mo46366L2().setOnScrollListener(new C11181d(this));
        mo46369Q2().setOnScrollListener(new C11182e(this));
        mo46366L2().setAdapter(mo46365K2());
        mo46369Q2().setAdapter(mo46368O2());
        mo46405T2(mo46366L2().mo47889M0());
        mo46406U2(mo46369Q2().mo47889M0());
        View findViewById = findViewById(R.id.appbar);
        C12775o.m28638h(findViewById, "findViewById(R.id.appbar)");
        this.f17575x = (AppBarLayout) findViewById;
        mo46404S2(mo46402M2());
        mo46364J2().mo45812o2();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        mo46364J2().mo45814q2();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        mo46364J2().mo45816s2();
    }

    public boolean onQueryTextChange(String str) {
        C12775o.m28639i(str, "newText");
        mo46364J2().mo53535F2(str);
        return true;
    }

    public boolean onQueryTextSubmit(String str) {
        C12775o.m28639i(str, "query");
        mo46364J2().mo53536G2(str);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        mo46364J2().mo45818u2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p2 */
    public int mo46409p2() {
        return this.f17567p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q2 */
    public int mo46410q2() {
        return this.f17566o;
    }

    /* renamed from: s1 */
    public void mo46373s1(int i) {
        startActivity(MerchantActivity.C11159a.m24356i(MerchantActivity.f17469w, this, String.valueOf(i), false, (String) null, 8, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public int mo46199y2() {
        return this.f17570s;
    }
}
