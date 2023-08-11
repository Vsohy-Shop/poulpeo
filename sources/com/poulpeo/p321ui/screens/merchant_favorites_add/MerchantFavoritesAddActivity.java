package com.poulpeo.p321ui.screens.merchant_favorites_add;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.merchant_search_old.MerchantSearchActivityOld;
import com.rmn.api.p322v2.common.model.BaseMerchant;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.p324ui.views.listview.BaseListView;
import com.rmn.utils.IntentDelegate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.C12764h0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.C12783v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import p008i9.C2020e;
import p360id.C12136d;
import p360id.C12139g;
import p404of.C13074a;
import p415qc.C13240e;
import p415qc.C13242g;
import p427sc.C13390f;
import p432tb.C13479c;
import p437ua.C13538a;
import p437ua.C13539b;
import p437ua.C13541c;
import p440ud.C13548a;
import p440ud.C13564j;
import p440ud.C13574r;
import p450wb.C13689a;
import p457xc.C13771a;
import p462yb.C13865f;
import p463yc.C13867a;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.merchant_favorites_add.MerchantFavoritesAddActivity */
/* compiled from: MerchantFavoritesAddActivity.kt */
public final class MerchantFavoritesAddActivity extends MerchantSearchActivityOld implements C13541c {

    /* renamed from: K */
    public static final C11164a f17499K = new C11164a((DefaultConstructorMarker) null);

    /* renamed from: M */
    public static final int f17500M = 8;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public static final IntentDelegate.Boolean f17501X = new IntentDelegate.Boolean("isOnboardingFunnel");

    /* renamed from: C */
    private final int f17502C = R.layout.activity_merchant_favorite_add;

    /* renamed from: D */
    private final String f17503D = "MerchantFavoritesAddActivity";

    /* renamed from: E */
    private final boolean f17504E;

    /* renamed from: F */
    private final Lazy f17505F = C11901h.m25690b(C11165b.f17511g);

    /* renamed from: G */
    private final Lazy f17506G = C11901h.m25690b(new C11167d(this));

    /* renamed from: H */
    private final Lazy f17507H = C11901h.m25690b(new C11168e(this));

    /* renamed from: I */
    private final Lazy f17508I = C11901h.m25690b(new C11166c(this));

    /* renamed from: J */
    public Map<Integer, View> f17509J = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.merchant_favorites_add.MerchantFavoritesAddActivity$a */
    /* compiled from: MerchantFavoritesAddActivity.kt */
    public static final class C11164a {

        /* renamed from: a */
        static final /* synthetic */ KProperty<Object>[] f17510a = {C12764h0.m28590f(new C12783v(C11164a.class, "isOnboardingFunnel", "isOnboardingFunnel(Landroid/content/Intent;)Z", 0))};

        private C11164a() {
        }

        public /* synthetic */ C11164a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final boolean m24399b(Intent intent) {
            return MerchantFavoritesAddActivity.f17501X.getValue(intent, (KProperty<?>) f17510a[0]).booleanValue();
        }

        /* renamed from: d */
        private final void m24400d(Intent intent, boolean z) {
            MerchantFavoritesAddActivity.f17501X.setValue(intent, (KProperty<?>) f17510a[0], z);
        }

        /* renamed from: c */
        public final Intent mo46374c(Context context, boolean z) {
            C12775o.m28639i(context, "context");
            Intent intent = new Intent(context, MerchantFavoritesAddActivity.class);
            MerchantFavoritesAddActivity.f17499K.m24400d(intent, z);
            return intent;
        }
    }

    /* renamed from: com.poulpeo.ui.screens.merchant_favorites_add.MerchantFavoritesAddActivity$b */
    /* compiled from: MerchantFavoritesAddActivity.kt */
    static final class C11165b extends C12777p implements C13074a<C13771a<BaseMerchant>> {

        /* renamed from: g */
        public static final C11165b f17511g = new C11165b();

        C11165b() {
            super(0);
        }

        /* renamed from: b */
        public final C13771a<BaseMerchant> invoke() {
            return new C13771a<>(true, true, new C13564j(R.drawable.action_like_theme_selector));
        }
    }

    /* renamed from: com.poulpeo.ui.screens.merchant_favorites_add.MerchantFavoritesAddActivity$c */
    /* compiled from: MerchantFavoritesAddActivity.kt */
    static final class C11166c extends C12777p implements C13074a<C13539b> {

        /* renamed from: g */
        final /* synthetic */ MerchantFavoritesAddActivity f17512g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11166c(MerchantFavoritesAddActivity merchantFavoritesAddActivity) {
            super(0);
            this.f17512g = merchantFavoritesAddActivity;
        }

        /* renamed from: b */
        public final C13539b invoke() {
            MerchantFavoritesAddActivity merchantFavoritesAddActivity = this.f17512g;
            ContextContainer o2 = merchantFavoritesAddActivity.mo47878o2();
            C13689a aVar = new C13689a(this.f17512g.mo47878o2());
            C11164a aVar2 = MerchantFavoritesAddActivity.f17499K;
            Intent intent = this.f17512g.getIntent();
            C12775o.m28638h(intent, "intent");
            return new C13539b(merchantFavoritesAddActivity, new C13539b.C13540a(o2, aVar, aVar2.m24399b(intent), new C13574r(this.f17512g.mo46369Q2()), this.f17512g.mo46369Q2().getBaseListViewController(), C13479c.f21636k.mo53083a(this.f17512g).mo53080j(), new C13574r(this.f17512g.mo46366L2()), this.f17512g.mo46366L2().getBaseListViewController(), this.f17512g.m24383Y2(), new C13548a((Button) this.f17512g.mo46363I2(C13865f.buttonValidate))));
        }
    }

    /* renamed from: com.poulpeo.ui.screens.merchant_favorites_add.MerchantFavoritesAddActivity$d */
    /* compiled from: MerchantFavoritesAddActivity.kt */
    static final class C11167d extends C12777p implements C13074a<C2020e> {

        /* renamed from: g */
        final /* synthetic */ MerchantFavoritesAddActivity f17513g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11167d(MerchantFavoritesAddActivity merchantFavoritesAddActivity) {
            super(0);
            this.f17513g = merchantFavoritesAddActivity;
        }

        /* renamed from: b */
        public final C2020e invoke() {
            BaseListView baseListView = (BaseListView) this.f17513g.mo46363I2(C13865f.merchantGridView);
            C12775o.m28638h(baseListView, "merchantGridView");
            return new C2020e(baseListView, 1, this.f17513g.m24383Y2(), R.layout.view_merchant_favorite_add_title);
        }
    }

    /* renamed from: com.poulpeo.ui.screens.merchant_favorites_add.MerchantFavoritesAddActivity$e */
    /* compiled from: MerchantFavoritesAddActivity.kt */
    static final class C11168e extends C12777p implements C13074a<C2020e> {

        /* renamed from: g */
        final /* synthetic */ MerchantFavoritesAddActivity f17514g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11168e(MerchantFavoritesAddActivity merchantFavoritesAddActivity) {
            super(0);
            this.f17514g = merchantFavoritesAddActivity;
        }

        /* renamed from: b */
        public final C2020e invoke() {
            BaseListView baseListView = (BaseListView) this.f17514g.mo46363I2(C13865f.merchantGridView);
            C12775o.m28638h(baseListView, "merchantGridView");
            return new C2020e(baseListView, 1, this.f17514g.m24383Y2(), 0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y2 */
    public final C13771a<BaseMerchant> m24383Y2() {
        return (C13771a) this.f17505F.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public static final void m24384a3(MerchantFavoritesAddActivity merchantFavoritesAddActivity, View view) {
        C12775o.m28639i(merchantFavoritesAddActivity, "this$0");
        ArrayList<Integer> R2 = merchantFavoritesAddActivity.mo46364J2().mo53175R2();
        Intent intent = new Intent();
        intent.putExtra("selectedMerchantsIds", R2);
        merchantFavoritesAddActivity.setResult(42, intent);
        merchantFavoritesAddActivity.finish();
        HashSet<BaseMerchant> Q2 = merchantFavoritesAddActivity.mo46364J2().mo53174Q2();
        ArrayList arrayList = new ArrayList(R2.size());
        C12775o.m28638h(Q2, "selectedMerchants");
        for (BaseMerchant trackingMerchantId : Q2) {
            arrayList.add(trackingMerchantId.getTrackingMerchantId());
        }
        new C13240e(new ContextContainer(merchantFavoritesAddActivity)).mo52888c(C13242g.f21083N, merchantFavoritesAddActivity.mo50357w2()).mo52889g(new C13390f("merchant_favorite_add", (List<String>) arrayList, (String) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: D2 */
    public boolean mo46361D2() {
        return this.f17504E;
    }

    /* renamed from: I2 */
    public View mo46363I2(int i) {
        Map<Integer, View> map = this.f17509J;
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
    /* renamed from: K2 */
    public C13867a mo46365K2() {
        return (C13867a) this.f17506G.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: L2 */
    public BaseListView mo46366L2() {
        BaseListView baseListView = (BaseListView) mo46363I2(C13865f.merchantGridView);
        C12775o.m28638h(baseListView, "merchantGridView");
        return baseListView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: N2 */
    public int mo46367N2() {
        return this.f17502C;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O2 */
    public C13867a mo46368O2() {
        return (C13867a) this.f17507H.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q2 */
    public BaseListView mo46369Q2() {
        BaseListView baseListView = (BaseListView) mo46363I2(C13865f.searchResultGridView);
        C12775o.m28638h(baseListView, "searchResultGridView");
        return baseListView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: R2 */
    public String mo46370R2() {
        return this.f17503D;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z2 */
    public C13539b mo46364J2() {
        return (C13539b) this.f17508I.getValue();
    }

    /* renamed from: a0 */
    public String mo46372a0(int i) {
        int i2;
        if (i == 1) {
            i2 = R.string.merchant_favorites_add_1;
        } else if (i == 2) {
            i2 = R.string.merchant_favorites_add_2;
        } else if (i != 3) {
            i2 = R.string.merchant_favorites_validate;
        } else {
            i2 = R.string.merchant_favorites_add_3;
        }
        String string = getString(i2);
        C12775o.m28638h(string, "when (remainingMandatory…  }.let { getString(it) }");
        return string;
    }

    public void onBackPressed() {
        C11164a aVar = f17499K;
        Intent intent = getIntent();
        C12775o.m28638h(intent, "intent");
        if (!aVar.m24399b(intent)) {
            super.onBackPressed();
        } else if (!mo46364J2().mo53176S2()) {
            C12136d.m26468j(this, getString(R.string.merchant_favorites_add_toast_message_add_one, new Object[]{Integer.valueOf(mo46364J2().mo53173P2())}));
        } else {
            C12136d.m26467i(this, R.string.merchant_favorites_add_toast_message_validate);
        }
    }

    public void onCreate(Bundle bundle) {
        ActionBar supportActionBar;
        View customView;
        View findViewById;
        super.onCreate(bundle);
        C11164a aVar = f17499K;
        Intent intent = getIntent();
        C12775o.m28638h(intent, "intent");
        if (!(!aVar.m24399b(intent) || (supportActionBar = getSupportActionBar()) == null || (customView = supportActionBar.getCustomView()) == null || (findViewById = customView.findViewById(R.id.imageButtonBack)) == null)) {
            C12139g.m26475d(findViewById, false, 0, 2, (Object) null);
        }
        int i = C13865f.buttonValidate;
        Button button = (Button) mo46363I2(i);
        C12775o.m28638h(button, "buttonValidate");
        Intent intent2 = getIntent();
        C12775o.m28638h(intent2, "intent");
        C12139g.m26475d(button, aVar.m24399b(intent2), 0, 2, (Object) null);
        ((Button) mo46363I2(i)).setOnClickListener(new C13538a(this));
    }

    /* renamed from: F */
    public void mo46362F() {
    }

    /* renamed from: s1 */
    public void mo46373s1(int i) {
    }
}
