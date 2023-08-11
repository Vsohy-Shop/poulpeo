package com.poulpeo.p321ui.screens.marketing_events.activity;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.apiclient.impl.api.models.Merchant;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p425sa.C13371e;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.marketing_events.activity.SuperCashbackActivity */
/* compiled from: SuperCashbackActivity.kt */
public final class SuperCashbackActivity extends C13371e {

    /* renamed from: v */
    public static final C11157a f17442v = new C11157a((DefaultConstructorMarker) null);

    /* renamed from: w */
    public static final int f17443w = 8;

    /* renamed from: o */
    private final int f17444o = R.string.super_cashback_title_collapsed;

    /* renamed from: p */
    private final String f17445p = "app-super-cashback";

    /* renamed from: q */
    private final String f17446q = "SuperCashbackActivity";

    /* renamed from: r */
    private final String f17447r = "on_super_cashback";

    /* renamed from: s */
    private final boolean f17448s;

    /* renamed from: t */
    private final String f17449t = "super-cashback";

    /* renamed from: u */
    public Map<Integer, View> f17450u = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.marketing_events.activity.SuperCashbackActivity$a */
    /* compiled from: SuperCashbackActivity.kt */
    public static final class C11157a {
        private C11157a() {
        }

        public /* synthetic */ C11157a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent mo46338a(Context context) {
            C12775o.m28639i(context, "context");
            return new Intent(context, SuperCashbackActivity.class);
        }
    }

    /* renamed from: E2 */
    public View mo46328E2(int i) {
        Map<Integer, View> map = this.f17450u;
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
    public String mo46329K2() {
        return this.f17445p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: N2 */
    public boolean mo46330N2() {
        return this.f17448s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O2 */
    public String mo46331O2() {
        return this.f17447r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P2 */
    public String mo46332P2() {
        return this.f17449t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q2 */
    public String mo46333Q2() {
        return this.f17446q;
    }

    /* renamed from: U */
    public boolean mo46334U(Merchant merchant) {
        C12775o.m28639i(merchant, "merchant");
        return merchant.hasCashback();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public int mo46199y2() {
        return this.f17444o;
    }
}
