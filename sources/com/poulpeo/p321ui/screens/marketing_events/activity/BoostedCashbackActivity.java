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
/* renamed from: com.poulpeo.ui.screens.marketing_events.activity.BoostedCashbackActivity */
/* compiled from: BoostedCashbackActivity.kt */
public final class BoostedCashbackActivity extends C13371e {

    /* renamed from: v */
    public static final C11155a f17424v = new C11155a((DefaultConstructorMarker) null);

    /* renamed from: w */
    public static final int f17425w = 8;

    /* renamed from: o */
    private final int f17426o = R.string.boosted_cashback_title_collapsed;

    /* renamed from: p */
    private final String f17427p = "app-boosted-cashback";

    /* renamed from: q */
    private final String f17428q = "BoostedCashbackActivity";

    /* renamed from: r */
    private final String f17429r = "on_boosted_cashback";

    /* renamed from: s */
    private final boolean f17430s;

    /* renamed from: t */
    private final String f17431t = "boosted-cashback";

    /* renamed from: u */
    public Map<Integer, View> f17432u = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.marketing_events.activity.BoostedCashbackActivity$a */
    /* compiled from: BoostedCashbackActivity.kt */
    public static final class C11155a {
        private C11155a() {
        }

        public /* synthetic */ C11155a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent mo46335a(Context context) {
            C12775o.m28639i(context, "context");
            return new Intent(context, BoostedCashbackActivity.class);
        }
    }

    /* renamed from: E2 */
    public View mo46328E2(int i) {
        Map<Integer, View> map = this.f17432u;
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
        return this.f17427p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: N2 */
    public boolean mo46330N2() {
        return this.f17430s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O2 */
    public String mo46331O2() {
        return this.f17429r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P2 */
    public String mo46332P2() {
        return this.f17431t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q2 */
    public String mo46333Q2() {
        return this.f17428q;
    }

    /* renamed from: U */
    public boolean mo46334U(Merchant merchant) {
        C12775o.m28639i(merchant, "merchant");
        return merchant.hasCashback();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public int mo46199y2() {
        return this.f17426o;
    }
}
