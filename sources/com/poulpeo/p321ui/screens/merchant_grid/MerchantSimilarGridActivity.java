package com.poulpeo.p321ui.screens.merchant_grid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.p321ui.screens.merchant_grid.C11173a;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.p324ui.views.listview.BaseListView;
import com.rmn.p324ui.views.listview.C11654c;
import com.rmn.utils.IntentDelegate;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12764h0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12783v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import p311bd.C10930a;
import p432tb.C13479c;
import p449wa.C13672b;
import p449wa.C13687n;
import p450wb.C13689a;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.merchant_grid.MerchantSimilarGridActivity */
/* compiled from: MerchantSimilarGridActivity.kt */
public final class MerchantSimilarGridActivity extends C11173a {

    /* renamed from: v */
    public static final C11172a f17530v = new C11172a((DefaultConstructorMarker) null);

    /* renamed from: w */
    public static final int f17531w = 8;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public static final IntentDelegate.String f17532x = new IntentDelegate.String("merchantId");

    /* renamed from: t */
    private C11173a.C11175b f17533t = C11173a.C11175b.SIMILAR;

    /* renamed from: u */
    public Map<Integer, View> f17534u = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.merchant_grid.MerchantSimilarGridActivity$a */
    /* compiled from: MerchantSimilarGridActivity.kt */
    public static final class C11172a {

        /* renamed from: a */
        static final /* synthetic */ KProperty<Object>[] f17535a = {C12764h0.m28590f(new C12783v(C11172a.class, "merchantId", "getMerchantId(Landroid/content/Intent;)Ljava/lang/String;", 0))};

        private C11172a() {
        }

        public /* synthetic */ C11172a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final String m24430b(Intent intent) {
            return MerchantSimilarGridActivity.f17532x.getValue(intent, (KProperty<?>) f17535a[0]);
        }
    }

    /* renamed from: B2 */
    public View mo46381B2(int i) {
        Map<Integer, View> map = this.f17534u;
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
    /* renamed from: E2 */
    public C11173a.C11175b mo46382E2() {
        return this.f17533t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G2 */
    public C13672b mo46383G2() {
        ContextContainer o2 = mo47878o2();
        C13689a aVar = new C13689a(mo47878o2());
        C10930a baseListViewController = ((BaseListView) mo46381B2(C13865f.merchantGridView)).getBaseListViewController();
        C11654c g = C13479c.f21636k.mo53083a(this).mo53077g();
        C11172a aVar2 = f17530v;
        Intent intent = getIntent();
        C12775o.m28638h(intent, "intent");
        return new C13687n(this, new C13687n.C13688a(o2, aVar, baseListViewController, g, aVar2.m24430b(intent)));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C11172a aVar = f17530v;
        Intent intent = getIntent();
        C12775o.m28638h(intent, "intent");
        String a = aVar.m24430b(intent);
        mo50358x2("MerchantSimilarGridActivity - " + a, true);
    }
}
