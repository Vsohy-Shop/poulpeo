package com.poulpeo.p321ui.screens.merchant_grid;

import android.content.Context;
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
import p445vc.C13616e;
import p445vc.C13617f;
import p445vc.C13618g;
import p449wa.C13672b;
import p449wa.C13683k;
import p450wb.C13689a;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.merchant_grid.MerchantListGridActivity */
/* compiled from: MerchantListGridActivity.kt */
public final class MerchantListGridActivity extends C11173a {

    /* renamed from: v */
    public static final C11171a f17524v = new C11171a((DefaultConstructorMarker) null);

    /* renamed from: w */
    public static final int f17525w = 8;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public static final IntentDelegate.String f17526x = new IntentDelegate.String("listTechName");

    /* renamed from: t */
    private C11173a.C11175b f17527t = C11173a.C11175b.CONTAINER;

    /* renamed from: u */
    public Map<Integer, View> f17528u = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.merchant_grid.MerchantListGridActivity$a */
    /* compiled from: MerchantListGridActivity.kt */
    public static final class C11171a {

        /* renamed from: a */
        static final /* synthetic */ KProperty<Object>[] f17529a = {C12764h0.m28590f(new C12783v(C11171a.class, "listTechName", "getListTechName(Landroid/content/Intent;)Ljava/lang/String;", 0))};

        private C11171a() {
        }

        public /* synthetic */ C11171a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final String m24422b(Intent intent) {
            return MerchantListGridActivity.f17526x.getValue(intent, (KProperty<?>) f17529a[0]);
        }

        /* renamed from: d */
        private final void m24423d(Intent intent, String str) {
            MerchantListGridActivity.f17526x.setValue(intent, (KProperty<?>) f17529a[0], str);
        }

        /* renamed from: c */
        public final Intent mo46385c(Context context, String str, String str2) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(str, "title");
            C12775o.m28639i(str2, "listTechName");
            Intent c = C11173a.f17536p.mo46392c(context, MerchantListGridActivity.class, str, str2);
            MerchantListGridActivity.f17524v.m24423d(c, str2);
            return c;
        }
    }

    /* renamed from: B2 */
    public View mo46381B2(int i) {
        Map<Integer, View> map = this.f17528u;
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
        return this.f17527t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G2 */
    public C13672b mo46383G2() {
        ContextContainer o2 = mo47878o2();
        C13689a aVar = new C13689a(mo47878o2());
        C10930a baseListViewController = ((BaseListView) mo46381B2(C13865f.merchantGridView)).getBaseListViewController();
        C11654c g = C13479c.f21636k.mo53083a(this).mo53077g();
        C11171a aVar2 = f17524v;
        Intent intent = getIntent();
        C12775o.m28638h(intent, "intent");
        return new C13683k(this, new C13683k.C13684a(o2, aVar, baseListViewController, g, aVar2.m24422b(intent)));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C11171a aVar = f17524v;
        Intent intent = getIntent();
        C12775o.m28638h(intent, "intent");
        String a = aVar.m24422b(intent);
        mo50358x2("MerchantListGridActivity - " + a, true);
        C13618g gVar = C13618g.f21930b;
        Intent intent2 = getIntent();
        C12775o.m28638h(intent2, "intent");
        String a2 = aVar.m24422b(intent2);
        gVar.mo53280e(new C13616e("grid-" + a2, C13617f.MERCHANT_LIST));
    }
}
