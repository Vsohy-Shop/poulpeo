package com.poulpeo.p321ui.screens.welcome;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.text.style.SuperscriptSpan;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import com.mikhaellopez.circularprogressbar.CircularProgressBar;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.consent.PushNotificationConsentActivity;
import com.poulpeo.p321ui.screens.main_menu.MainMenuActivity;
import com.poulpeo.p321ui.screens.merchant_favorites_add.MerchantFavoritesAddActivity;
import com.rmn.api.p322v2.common.model.BaseMerchant;
import com.rmn.utils_common.IListener;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;
import p360id.C12134b;
import p360id.C12136d;
import p368jd.C12618d;
import p388mb.C12902a;
import p388mb.C12903b;
import p388mb.C12904c;
import p388mb.C12905d;
import p388mb.C12906e;
import p388mb.C12925x;
import p388mb.C12927y;
import p409pc.C13200d;
import p433tc.C13486a;
import p438ub.C13542a;
import p440ud.C13548a;
import p440ud.C13572p;
import p446vd.C13633n;
import p450wb.C13689a;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.welcome.WelcomeActivity */
/* compiled from: WelcomeActivity.kt */
public final class WelcomeActivity extends C12618d implements C12927y {

    /* renamed from: s */
    public static final C11224a f17749s = new C11224a((DefaultConstructorMarker) null);

    /* renamed from: t */
    public static final int f17750t = 8;

    /* renamed from: m */
    private C12925x f17751m;

    /* renamed from: n */
    private boolean f17752n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f17753o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public float f17754p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public AlertDialog f17755q;

    /* renamed from: r */
    public Map<Integer, View> f17756r = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.welcome.WelcomeActivity$a */
    /* compiled from: WelcomeActivity.kt */
    public static final class C11224a {
        private C11224a() {
        }

        public /* synthetic */ C11224a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ Intent m24875b(C11224a aVar, Context context, boolean z, boolean z2, int i, Object obj) {
            if ((i & 4) != 0) {
                z2 = false;
            }
            return aVar.mo46546a(context, z, z2);
        }

        /* renamed from: a */
        public final Intent mo46546a(Context context, boolean z, boolean z2) {
            C12775o.m28639i(context, "context");
            Intent intent = new Intent(context, WelcomeActivity.class);
            intent.putExtra("fetch_favorites", z);
            intent.putExtra("from_login", z2);
            return intent;
        }
    }

    /* renamed from: com.poulpeo.ui.screens.welcome.WelcomeActivity$b */
    /* compiled from: WelcomeActivity.kt */
    static final class C11225b extends C12777p implements Function1<AlertDialog, C11921v> {

        /* renamed from: g */
        final /* synthetic */ WelcomeActivity f17757g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11225b(WelcomeActivity welcomeActivity) {
            super(1);
            this.f17757g = welcomeActivity;
        }

        /* renamed from: a */
        public final void mo46547a(AlertDialog alertDialog) {
            C12775o.m28639i(alertDialog, "it");
            this.f17757g.f17755q = alertDialog;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo46547a((AlertDialog) obj);
            return C11921v.f18618a;
        }
    }

    /* renamed from: com.poulpeo.ui.screens.welcome.WelcomeActivity$c */
    /* compiled from: WelcomeActivity.kt */
    static final class C11226c extends C12777p implements Function1<AlertDialog, C11921v> {

        /* renamed from: g */
        final /* synthetic */ WelcomeActivity f17758g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11226c(WelcomeActivity welcomeActivity) {
            super(1);
            this.f17758g = welcomeActivity;
        }

        /* renamed from: a */
        public final void mo46548a(AlertDialog alertDialog) {
            C12775o.m28639i(alertDialog, "it");
            this.f17758g.f17755q = alertDialog;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo46548a((AlertDialog) obj);
            return C11921v.f18618a;
        }
    }

    /* renamed from: com.poulpeo.ui.screens.welcome.WelcomeActivity$d */
    /* compiled from: WelcomeActivity.kt */
    public static final class C11227d implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ WelcomeActivity f17759a;

        /* renamed from: b */
        final /* synthetic */ boolean f17760b;

        C11227d(WelcomeActivity welcomeActivity, boolean z) {
            this.f17759a = welcomeActivity;
            this.f17760b = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static final void m24880b(WelcomeActivity welcomeActivity, ValueAnimator valueAnimator) {
            C12775o.m28639i(welcomeActivity, "this$0");
            C12775o.m28639i(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            C12775o.m28637g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            welcomeActivity.m24858L2(((Float) animatedValue).floatValue());
        }

        public void onTransitionCancel(Transition transition) {
            C12775o.m28639i(transition, "transition");
        }

        public void onTransitionEnd(Transition transition) {
            C12775o.m28639i(transition, "transition");
            if (!this.f17760b) {
                ValueAnimator valueAnimator = new ValueAnimator();
                WelcomeActivity welcomeActivity = this.f17759a;
                valueAnimator.setFloatValues(new float[]{0.0f, welcomeActivity.f17754p});
                valueAnimator.setDuration((long) 800);
                valueAnimator.addUpdateListener(new C12906e(welcomeActivity));
                valueAnimator.start();
                ((CircularProgressBar) this.f17759a.mo46535C2(C13865f.circleProgress)).mo40730b(100.0f, 800);
            }
        }

        public void onTransitionPause(Transition transition) {
            C12775o.m28639i(transition, "transition");
        }

        public void onTransitionResume(Transition transition) {
            C12775o.m28639i(transition, "transition");
        }

        public void onTransitionStart(Transition transition) {
            C12775o.m28639i(transition, "transition");
            this.f17759a.f17753o = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H2 */
    public static final void m24854H2(IListener iListener, DialogInterface dialogInterface, int i) {
        C12775o.m28639i(iListener, "$replayAction");
        iListener.mo40744J0(null);
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public static final void m24855I2(IListener iListener, DialogInterface dialogInterface, int i) {
        C12775o.m28639i(iListener, "$replayAction");
        iListener.mo40744J0(null);
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public static final void m24856J2(IListener iListener, DialogInterface dialogInterface, int i) {
        iListener.mo40744J0(null);
    }

    /* access modifiers changed from: private */
    /* renamed from: K2 */
    public static final void m24857K2(WelcomeActivity welcomeActivity, boolean z) {
        C12775o.m28639i(welcomeActivity, "this$0");
        welcomeActivity.m24859M2(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public final void m24858L2(float f) {
        SpannableString spannableString = new SpannableString(getString(R.string.welcome_pending_amount, new Object[]{Float.valueOf(f)}));
        spannableString.setSpan(new SuperscriptSpan(), spannableString.length() - 1, spannableString.length(), 33);
        spannableString.setSpan(new RelativeSizeSpan(0.5f), spannableString.length() - 1, spannableString.length(), 33);
        ((TextView) mo46535C2(C13865f.textViewPendingAmount)).setText(spannableString);
    }

    /* renamed from: M2 */
    private final void m24859M2(boolean z) {
        if (z) {
            ((CircularProgressBar) mo46535C2(C13865f.circleProgress)).setProgress(100.0f);
            m24858L2(this.f17754p);
        }
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.addListener(new C11227d(this, z));
        int i = C13865f.layoutUserInfo;
        ViewParent parent = ((LinearLayout) mo46535C2(i)).getParent();
        C12775o.m28637g(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        TransitionManager.beginDelayedTransition((ViewGroup) parent, autoTransition);
        ((LinearLayout) mo46535C2(i)).setVisibility(0);
        this.f17752n = true;
    }

    /* renamed from: A */
    public void mo46533A(String str) {
        if (str != null) {
            C13486a.f21657a.mo53090c(str);
        }
    }

    /* renamed from: A0 */
    public void mo46534A0() {
        startActivityForResult(MerchantFavoritesAddActivity.f17499K.mo46374c(this, true), 101);
    }

    /* renamed from: C2 */
    public View mo46535C2(int i) {
        Map<Integer, View> map = this.f17756r;
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

    /* renamed from: I1 */
    public void mo46536I1() {
        ((TextView) mo46535C2(C13865f.textViewLoadingMessage)).setText(getString(R.string.welcome_loading_message_send_favorites));
    }

    /* renamed from: P0 */
    public void mo46537P0(double d, String str, boolean z, boolean z2, boolean z3) {
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        if (this.f17752n) {
            ((CircularProgressBar) mo46535C2(C13865f.circleProgress)).setProgress(0.0f);
            ((TextView) mo46535C2(C13865f.textViewPendingAmount)).setText("");
        }
        this.f17754p = (float) d;
        ((TextView) mo46535C2(C13865f.textViewName)).setText(str);
        if (z) {
            ((TextView) mo46535C2(C13865f.textViewLoadingMessage)).setText(getString(R.string.welcome_loading_message_get_favorites));
        } else if (z2) {
            ((TextView) mo46535C2(C13865f.textViewLoadingMessage)).setText(getString(R.string.welcome_loading_message_get_push_notif));
        } else {
            ((TextView) mo46535C2(C13865f.textViewLoadingMessage)).setText(getString(R.string.welcome_loading_message_get_home_data));
        }
        new Handler().postDelayed(new C12902a(this, z3), (long) getResources().getInteger(R.integer.activity_transition_duration_medium));
    }

    /* renamed from: S1 */
    public void mo46538S1(IListener<Void> iListener, IListener<Void> iListener2) {
        C12775o.m28639i(iListener, "replayAction");
        AlertDialog.Builder cancelable = new AlertDialog.Builder(this).setMessage((int) R.string.loading_send_error_message).setPositiveButton((int) R.string.loading_error_retry, (DialogInterface.OnClickListener) new C12904c(iListener)).setCancelable(false);
        if (iListener2 != null) {
            cancelable.setNegativeButton((int) R.string.loading_error_ignore, (DialogInterface.OnClickListener) new C12905d(iListener2));
        }
        C12775o.m28638h(cancelable, "builder");
        C12134b.m26456b(cancelable, this, new C11226c(this));
    }

    /* renamed from: W */
    public void mo46539W() {
        mo47877n2();
        Intent f = MainMenuActivity.f17407w.mo46323f(this);
        f.setFlags(268468224);
        startActivity(f);
    }

    /* renamed from: d1 */
    public void mo46540d1() {
        ((TextView) mo46535C2(C13865f.textViewLoadingMessage)).setText(getString(R.string.welcome_loading_message_get_push_notif));
    }

    /* renamed from: f0 */
    public void mo46541f0() {
        ((TextView) mo46535C2(C13865f.textViewLoadingMessage)).setText(getString(R.string.welcome_loading_message_send_push_notif));
    }

    /* renamed from: g0 */
    public void mo46542g0() {
        startActivityForResult(PushNotificationConsentActivity.f17263n.mo46202a(this), 102);
    }

    /* renamed from: h2 */
    public void mo46543h2() {
        ((TextView) mo46535C2(C13865f.textViewLoadingMessage)).setText(getString(R.string.welcome_loading_message_get_home_data));
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        ArrayList<Integer> arrayList;
        super.onActivityResult(i, i2, intent);
        C12925x xVar = null;
        if (i == 101 && i2 == 42) {
            if (intent != null) {
                arrayList = intent.getIntegerArrayListExtra("selectedMerchantsIds");
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                C12925x xVar2 = this.f17751m;
                if (xVar2 == null) {
                    C12775o.m28656z("controller");
                    xVar2 = null;
                }
                xVar2.mo50838x3(arrayList);
            }
        }
        if (i != 102) {
            return;
        }
        if (i2 == 43) {
            C13200d.f21007a.mo52836n(this);
            C12925x xVar3 = this.f17751m;
            if (xVar3 == null) {
                C12775o.m28656z("controller");
            } else {
                xVar = xVar3;
            }
            xVar.mo50829F2();
            return;
        }
        C12925x xVar4 = this.f17751m;
        if (xVar4 == null) {
            C12775o.m28656z("controller");
        } else {
            xVar = xVar4;
        }
        xVar.mo50837v3();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        Integer num;
        Integer num2;
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_welcome);
        mo50358x2("WelcomeActivity", true);
        boolean booleanExtra = getIntent().getBooleanExtra("fetch_favorites", true);
        boolean booleanExtra2 = getIntent().getBooleanExtra("from_login", false);
        int i = C13865f.textViewLoadingMessage;
        ((TextView) mo46535C2(i)).startAnimation(AnimationUtils.loadAnimation(this, R.anim.blink));
        if (bundle != null) {
            num = Integer.valueOf(bundle.getInt("loading_state", -1));
        } else {
            num = null;
        }
        if (num == null || num.intValue() >= 0) {
            num2 = num;
        } else {
            num2 = null;
        }
        C12925x xVar = new C12925x(this, new C12925x.C12926a(mo47878o2(), new C13689a(mo47878o2()), booleanExtra, C13542a.f21790p.mo53187a(this).mo53186k(), new C13572p((TextView) mo46535C2(i)), new C13548a((Button) mo46535C2(C13865f.buttonRetry)), num2, booleanExtra2));
        this.f17751m = xVar;
        xVar.mo50833h3();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C12925x xVar = null;
        this.f17755q = null;
        C12925x xVar2 = this.f17751m;
        if (xVar2 == null) {
            C12775o.m28656z("controller");
        } else {
            xVar = xVar2;
        }
        xVar.mo50834i3();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        AlertDialog alertDialog = this.f17755q;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        C12925x xVar = this.f17751m;
        if (xVar == null) {
            C12775o.m28656z("controller");
            xVar = null;
        }
        xVar.mo50835k3();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f17752n && !this.f17753o) {
            m24858L2(this.f17754p);
            ((CircularProgressBar) mo46535C2(C13865f.circleProgress)).setProgress(100.0f);
        }
        AlertDialog alertDialog = this.f17755q;
        if (alertDialog != null) {
            alertDialog.show();
        }
        C12925x xVar = this.f17751m;
        if (xVar == null) {
            C12775o.m28656z("controller");
            xVar = null;
        }
        xVar.mo50836r3();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        C12775o.m28639i(bundle, "outState");
        C12925x xVar = this.f17751m;
        if (xVar == null) {
            C12775o.m28656z("controller");
            xVar = null;
        }
        bundle.putInt("loading_state", xVar.mo50830I2());
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: p1 */
    public void mo46544p1(IListener<Void> iListener, String str) {
        C12775o.m28639i(iListener, "replayAction");
        C12775o.m28639i(str, "errorMessage");
        AlertDialog.Builder cancelable = new AlertDialog.Builder(this).setMessage((CharSequence) str).setNegativeButton((int) R.string.loading_error_retry, (DialogInterface.OnClickListener) new C12903b(iListener)).setCancelable(false);
        C12775o.m28638h(cancelable, "Builder(this)\n          …    .setCancelable(false)");
        C12134b.m26456b(cancelable, this, new C11225b(this));
    }

    /* renamed from: u0 */
    public void mo46545u0(List<? extends BaseMerchant> list) {
        String str;
        C12775o.m28639i(list, "merchantsError");
        if (list.isEmpty()) {
            C13633n.m31145a(this, "Can't throw errors if there are no merchants specified");
            return;
        }
        if (list.size() == 1) {
            BaseMerchant baseMerchant = (BaseMerchant) list.get(0);
            if (baseMerchant == null) {
                C13633n.m31145a(this, "Merchant on error is null");
                return;
            }
            str = getString(R.string.welcome_loading_favorites_send_error_one, new Object[]{baseMerchant.getName()});
            C12775o.m28638h(str, "getString(R.string.welco…error_one, merchant.name)");
        } else {
            str = getString(R.string.welcome_loading_favorites_send_error_multiple, new Object[]{String.valueOf(list.size())});
            C12775o.m28638h(str, "getString(R.string.welco…ntsError.size.toString())");
        }
        C12136d.m26468j(this, str);
    }
}
