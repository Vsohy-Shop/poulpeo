package com.poulpeo.p321ui.screens.poulpeo_plus;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.sponsorship.SponsorshipActivity;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p315cb.C11034a;
import p368jd.C12616b;
import p445vc.C13615d;
import p445vc.C13617f;
import p445vc.C13618g;
import p450wb.C13690b;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.poulpeo_plus.PoulpeoPlusActivity */
/* compiled from: PoulpeoPlusActivity.kt */
public final class PoulpeoPlusActivity extends C12616b {

    /* renamed from: o */
    public static final C11199a f17634o = new C11199a((DefaultConstructorMarker) null);

    /* renamed from: p */
    public static final int f17635p = 8;

    /* renamed from: m */
    private final int f17636m = -1;

    /* renamed from: n */
    public Map<Integer, View> f17637n = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.poulpeo_plus.PoulpeoPlusActivity$a */
    /* compiled from: PoulpeoPlusActivity.kt */
    public static final class C11199a {
        private C11199a() {
        }

        public /* synthetic */ C11199a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent mo46445a(Context context) {
            C12775o.m28639i(context, "context");
            return new Intent(context, PoulpeoPlusActivity.class);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public static final void m24589C2(PoulpeoPlusActivity poulpeoPlusActivity, View view) {
        C12775o.m28639i(poulpeoPlusActivity, "this$0");
        C13618g.f21930b.mo53279c("poulpeo-plus", "click", "sponsor-code");
        poulpeoPlusActivity.startActivity(SponsorshipActivity.f17717p.mo46494a(poulpeoPlusActivity));
    }

    /* renamed from: B2 */
    public View mo46444B2(int i) {
        Map<Integer, View> map = this.f17637n;
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

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo50358x2("PoulpeoPlusActivity", false);
        C13618g.f21930b.mo53280e(new C13615d("poulpeo-plus", C13617f.POULPEO_PLUS));
        setContentView(R.layout.activity_poulpeo_plus);
        String string = getString(R.string.poulpeo_plus);
        C12775o.m28638h(string, "getString(R.string.poulpeo_plus)");
        C13690b bVar = C13690b.f22034a;
        TextView textView = (TextView) mo46444B2(C13865f.textViewBonusPoulpeoPlus);
        C12775o.m28638h(textView, "textViewBonusPoulpeoPlus");
        String string2 = getString(R.string.poulpeo_plus_1_title, new Object[]{string});
        C12775o.m28638h(string2, "getString(R.string.poulp…_1_title, strPoulpeoPlus)");
        bVar.mo53353k(textView, string2, bVar.mo53348f(this, string, 20, Integer.valueOf(R.color.poulpeo_plus)));
        ((Button) mo46444B2(C13865f.buttonSponsorship)).setOnClickListener(new C11034a(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public int mo46199y2() {
        return this.f17636m;
    }
}
