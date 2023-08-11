package com.poulpeo.p321ui.screens.contact_info;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.api.p322v2.poulpeo.model.Country;
import com.rmn.api.p322v2.poulpeo.model.PaymentMethod;
import com.rmn.p324ui.views.listview.BaseListView;
import com.rmn.utils.AndroidUtil;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p008i9.C2016b;
import p365ja.C12606d;
import p387ma.C12878i;
import p387ma.C12882j;
import p432tb.C13479c;
import p440ud.C13574r;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.contact_info.SearchCountryActivity */
/* compiled from: SearchCountryActivity.kt */
public final class SearchCountryActivity extends C12606d implements C12882j {

    /* renamed from: r */
    public static final C11115a f17287r = new C11115a((DefaultConstructorMarker) null);

    /* renamed from: s */
    public static final int f17288s = 8;

    /* renamed from: o */
    private final int f17289o;

    /* renamed from: p */
    private C12878i f17290p;

    /* renamed from: q */
    public Map<Integer, View> f17291q = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.contact_info.SearchCountryActivity$a */
    /* compiled from: SearchCountryActivity.kt */
    public static final class C11115a {
        private C11115a() {
        }

        public /* synthetic */ C11115a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent mo46222a(Context context) {
            C12775o.m28639i(context, "context");
            return new Intent(context, SearchCountryActivity.class);
        }
    }

    /* renamed from: D0 */
    public void mo46219D0(Country country) {
        C12775o.m28639i(country, "country");
        Intent putExtra = new Intent().putExtra("code", country.getCode()).putExtra("label", country.getLabel());
        Set<PaymentMethod> paymentMethods = country.getPaymentMethods();
        C12775o.m28638h(paymentMethods, "country.paymentMethods");
        ArrayList arrayList = new ArrayList(C12728x.m28544v(paymentMethods, 10));
        for (PaymentMethod jSONValue : paymentMethods) {
            Object jSONValue2 = jSONValue.getJSONValue();
            C12775o.m28637g(jSONValue2, "null cannot be cast to non-null type kotlin.String");
            arrayList.add((String) jSONValue2);
        }
        Object[] array = arrayList.toArray(new String[0]);
        C12775o.m28637g(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        setResult(-1, putExtra.putExtra("paymentMethods", (String[]) array));
        finish();
    }

    /* renamed from: I2 */
    public View mo46220I2(int i) {
        Map<Integer, View> map = this.f17291q;
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

    /* renamed from: e */
    public void mo46221e() {
        AndroidUtil.hideSoftKeyboard(this, true);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_search_country);
        mo50358x2("SearchCountryActivity", true);
        mo50330E2(R.string.search_hint_country);
        int i = C13865f.listViewResult;
        BaseListView baseListView = (BaseListView) mo46220I2(i);
        C12775o.m28638h(baseListView, "listViewResult");
        ((BaseListView) mo46220I2(i)).setAdapter(new C2016b(baseListView));
        C12878i iVar = new C12878i(this, new C12878i.C12881c(mo47878o2(), ((BaseListView) mo46220I2(i)).getBaseListViewController(), C13479c.f21636k.mo53083a(this).mo53073c(), new C13574r((BaseListView) mo46220I2(i))));
        this.f17290p = iVar;
        iVar.mo45812o2();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C12878i iVar = this.f17290p;
        if (iVar == null) {
            C12775o.m28656z("controller");
            iVar = null;
        }
        iVar.mo45814q2();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C12878i iVar = this.f17290p;
        if (iVar == null) {
            C12775o.m28656z("controller");
            iVar = null;
        }
        iVar.mo45816s2();
    }

    public boolean onQueryTextChange(String str) {
        C12878i iVar = this.f17290p;
        if (iVar == null) {
            C12775o.m28656z("controller");
            iVar = null;
        }
        iVar.mo50794E2(str);
        return true;
    }

    public boolean onQueryTextSubmit(String str) {
        C12878i iVar = this.f17290p;
        if (iVar == null) {
            C12775o.m28656z("controller");
            iVar = null;
        }
        iVar.mo50795F2(str);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C12878i iVar = this.f17290p;
        if (iVar == null) {
            C12775o.m28656z("controller");
            iVar = null;
        }
        iVar.mo45818u2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public int mo46199y2() {
        return this.f17289o;
    }
}
