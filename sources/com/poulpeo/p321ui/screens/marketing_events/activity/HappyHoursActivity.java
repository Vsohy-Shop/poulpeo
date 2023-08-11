package com.poulpeo.p321ui.screens.marketing_events.activity;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.apiclient.impl.api.models.CashbackObject;
import com.rmn.apiclient.impl.api.models.Merchant;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p425sa.C13371e;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.marketing_events.activity.HappyHoursActivity */
/* compiled from: HappyHoursActivity.kt */
public final class HappyHoursActivity extends C13371e {

    /* renamed from: v */
    public static final C11156a f17433v = new C11156a((DefaultConstructorMarker) null);

    /* renamed from: w */
    public static final int f17434w = 8;

    /* renamed from: o */
    private final int f17435o = R.string.happy_hours_title_collapsed;

    /* renamed from: p */
    private final String f17436p = "app-happy-hours";

    /* renamed from: q */
    private final String f17437q = "HappyHoursActivity";

    /* renamed from: r */
    private final String f17438r = "on_happy_hours";

    /* renamed from: s */
    private final boolean f17439s = true;

    /* renamed from: t */
    private final String f17440t = "happy-hours";

    /* renamed from: u */
    public Map<Integer, View> f17441u = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.marketing_events.activity.HappyHoursActivity$a */
    /* compiled from: HappyHoursActivity.kt */
    public static final class C11156a {
        private C11156a() {
        }

        public /* synthetic */ C11156a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent mo46337a(Context context) {
            C12775o.m28639i(context, "context");
            return new Intent(context, HappyHoursActivity.class);
        }
    }

    /* renamed from: E2 */
    public View mo46328E2(int i) {
        Map<Integer, View> map = this.f17441u;
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
        return this.f17436p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M2 */
    public int mo46336M2() {
        return R.string.happy_hours_event_expired;
    }

    /* access modifiers changed from: protected */
    /* renamed from: N2 */
    public boolean mo46330N2() {
        return this.f17439s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O2 */
    public String mo46331O2() {
        return this.f17438r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P2 */
    public String mo46332P2() {
        return this.f17440t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q2 */
    public String mo46333Q2() {
        return this.f17437q;
    }

    /* renamed from: U */
    public boolean mo46334U(Merchant merchant) {
        Boolean bool;
        boolean z;
        C12775o.m28639i(merchant, "merchant");
        CashbackObject cashbackObject = merchant.getCashbackObject();
        if (cashbackObject != null) {
            if (cashbackObject.getNonNullPreviousRate() == cashbackObject.getRate()) {
                z = true;
            } else {
                z = false;
            }
            bool = Boolean.valueOf(!z);
        } else {
            bool = null;
        }
        if (!merchant.hasCashback() || !C12775o.m28634d(bool, Boolean.TRUE)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public int mo46199y2() {
        return this.f17435o;
    }
}
