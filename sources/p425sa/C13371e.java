package p425sa;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.merchant.MerchantActivity;
import com.rmn.apiclient.impl.api.models.Merchant;
import com.rmn.p324ui.wrappers.ResourceStringWrapper;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p360id.C12134b;
import p368jd.C12616b;
import p425sa.C13376i;
import p440ud.C13558g;
import p440ud.C13566l;
import p440ud.C13572p;
import p440ud.C13574r;
import p445vc.C13619h;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: sa.e */
/* compiled from: BaseMarketingEventsActivity.kt */
public abstract class C13371e extends C12616b implements C13378j {

    /* renamed from: m */
    protected C13376i f21420m;

    /* renamed from: n */
    public Map<Integer, View> f21421n = new LinkedHashMap();

    /* renamed from: sa.e$a */
    /* compiled from: BaseMarketingEventsActivity.kt */
    public static final class C13372a implements AppBarLayout.OnOffsetChangedListener {

        /* renamed from: a */
        private boolean f21422a;

        /* renamed from: b */
        private int f21423b = -1;

        /* renamed from: c */
        final /* synthetic */ C13371e f21424c;

        C13372a(C13371e eVar) {
            this.f21424c = eVar;
        }

        public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            C12775o.m28639i(appBarLayout, "appBarLayout");
            if (this.f21423b == -1) {
                this.f21423b = appBarLayout.getTotalScrollRange();
            }
            if (this.f21423b + i < 10) {
                C13371e eVar = this.f21424c;
                ((CollapsingToolbarLayout) this.f21424c.mo46328E2(C13865f.collapsingLayout)).setTitle(eVar.getString(eVar.mo46199y2()));
                this.f21422a = true;
            } else if (this.f21422a) {
                ((CollapsingToolbarLayout) this.f21424c.mo46328E2(C13865f.collapsingLayout)).setTitle("");
                this.f21422a = false;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G2 */
    public static final void m30405G2(C13371e eVar, DialogInterface dialogInterface, int i) {
        C12775o.m28639i(eVar, "this$0");
        eVar.mo52991L2().mo52995s2();
    }

    /* access modifiers changed from: private */
    /* renamed from: H2 */
    public static final void m30406H2(C13371e eVar, DialogInterface dialogInterface, int i) {
        C12775o.m28639i(eVar, "this$0");
        eVar.finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public static final void m30407I2(C13371e eVar, DialogInterface dialogInterface, int i) {
        C12775o.m28639i(eVar, "this$0");
        eVar.finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public static final void m30408J2(C13371e eVar, Merchant merchant, View view) {
        C12775o.m28639i(eVar, "this$0");
        C12775o.m28639i(merchant, "$merchant");
        C13619h.f21932a.mo53282c(eVar.mo46332P2(), "click", merchant);
        MerchantActivity.C11159a aVar = MerchantActivity.f17469w;
        String str = merchant.f18063id;
        C12775o.m28638h(str, "merchant.id");
        eVar.startActivity(MerchantActivity.C11159a.m24356i(aVar, eVar, str, false, (String) null, 8, (Object) null));
    }

    /* renamed from: E2 */
    public View mo46328E2(int i) {
        Map<Integer, View> map = this.f21421n;
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

    /* renamed from: J1 */
    public void mo52990J1() {
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(this).setMessage((int) R.string.marketing_event_data_fetch_error).setCancelable(false).setPositiveButton((int) R.string.marketing_event_data_fetch_error_positive_button_text, (DialogInterface.OnClickListener) new C13369c(this)).setNegativeButton((int) R.string.marketing_event_data_fetch_error_negative_button_text, (DialogInterface.OnClickListener) new C13370d(this));
        C12775o.m28638h(negativeButton, "Builder(this)\n          …{ _, _ -> this.finish() }");
        C12134b.m26457c(negativeButton, this, (Function1) null, 2, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: K2 */
    public abstract String mo46329K2();

    /* renamed from: L2 */
    public final C13376i mo52991L2() {
        C13376i iVar = this.f21420m;
        if (iVar != null) {
            return iVar;
        }
        C12775o.m28656z("controller");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M2 */
    public int mo46336M2() {
        throw new UnsupportedOperationException("Implement if necessary");
    }

    /* access modifiers changed from: protected */
    /* renamed from: N2 */
    public abstract boolean mo46330N2();

    /* access modifiers changed from: protected */
    /* renamed from: O2 */
    public abstract String mo46331O2();

    /* access modifiers changed from: protected */
    /* renamed from: P2 */
    public abstract String mo46332P2();

    /* access modifiers changed from: protected */
    /* renamed from: Q2 */
    public abstract String mo46333Q2();

    /* access modifiers changed from: protected */
    /* renamed from: R2 */
    public final void mo52992R2(C13376i iVar) {
        C12775o.m28639i(iVar, "<set-?>");
        this.f21420m = iVar;
    }

    /* renamed from: g2 */
    public void mo52993g2(List<? extends Merchant> list) {
        C12775o.m28639i(list, "merchants");
        for (Merchant merchant : list) {
            int i = C13865f.layoutMerchants;
            LinearLayout linearLayout = (LinearLayout) mo46328E2(i);
            C12775o.m28638h(linearLayout, "layoutMerchants");
            View a = new C13379k(this, linearLayout, merchant).mo53000a();
            a.setOnClickListener(new C13367a(this, merchant));
            ((LinearLayout) mo46328E2(i)).addView(a);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_marketing_events);
        mo50358x2(mo46333Q2(), false);
        FirebaseAnalytics.getInstance(this).mo39755a(mo46331O2(), (Bundle) null);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setTitle((CharSequence) "");
        }
        ((TextView) mo46328E2(C13865f.textViewHeaderTitle)).setText(getString(mo46199y2()));
        int i = C13865f.appbar;
        if (!(((AppBarLayout) mo46328E2(i)) == null || ((CollapsingToolbarLayout) mo46328E2(C13865f.collapsingLayout)) == null)) {
            ((AppBarLayout) mo46328E2(i)).addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) new C13372a(this));
        }
        mo52992R2(new C13376i(this, new C13376i.C13377a(mo47878o2(), mo46329K2(), mo46330N2(), mo46332P2(), new C13558g((ProgressBar) mo46328E2(C13865f.progressBarLoader)), new C13574r((LinearLayout) mo46328E2(C13865f.layoutMerchants)), new C13572p((TextView) mo46328E2(C13865f.textViewTitle)), new C13572p((TextView) mo46328E2(C13865f.textViewCountdownLabel)), new C13572p((TextView) mo46328E2(C13865f.textViewCountdown)), new C13566l(this), new ResourceStringWrapper(R.string.marketing_event_countdown_content))));
        mo52991L2().mo52996w2();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        mo52991L2().mo52997x2();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        mo52991L2().mo52998y2();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        mo52991L2().mo52999z2();
    }

    /* renamed from: z */
    public void mo52994z() {
        AlertDialog.Builder positiveButton = new AlertDialog.Builder(this).setMessage(mo46336M2()).setCancelable(false).setPositiveButton(17039370, (DialogInterface.OnClickListener) new C13368b(this));
        C12775o.m28638h(positiveButton, "Builder(this)\n          …{ _, _ -> this.finish() }");
        C12134b.m26457c(positiveButton, this, (Function1) null, 2, (Object) null);
    }
}
