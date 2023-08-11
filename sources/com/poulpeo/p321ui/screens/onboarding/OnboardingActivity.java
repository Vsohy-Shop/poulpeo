package com.poulpeo.p321ui.screens.onboarding;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Scroller;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.viewpager.widget.ViewPager;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.login.PLPMainSignUpActivity;
import com.poulpeo.p321ui.screens.login.PLPSignInActivity;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.viewpagerindicator.CirclePageIndicator;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12760f0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p309bb.C10918a;
import p309bb.C10919b;
import p368jd.C12616b;
import p409pc.C13200d;
import p439uc.C13545b;
import p439uc.C13547c;
import p445vc.C13615d;
import p445vc.C13617f;
import p445vc.C13618g;
import p446vd.C13633n;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.onboarding.OnboardingActivity */
/* compiled from: OnboardingActivity.kt */
public final class OnboardingActivity extends C12616b implements View.OnClickListener {

    /* renamed from: s */
    public static final C11194a f17619s = new C11194a((DefaultConstructorMarker) null);

    /* renamed from: t */
    public static final int f17620t = 8;

    /* renamed from: u */
    private static final Integer[] f17621u = {Integer.valueOf(R.color.background_activated), Integer.valueOf(R.color.background_theme), Integer.valueOf(R.color.background_new)};

    /* renamed from: m */
    private final int f17622m = R.string.menu_onboarding;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C11195b f17623n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final long f17624o = 5000;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public Handler f17625p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public Runnable f17626q;

    /* renamed from: r */
    public Map<Integer, View> f17627r = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.onboarding.OnboardingActivity$a */
    /* compiled from: OnboardingActivity.kt */
    public static final class C11194a {
        private C11194a() {
        }

        public /* synthetic */ C11194a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo46438a(ContextContainer contextContainer) {
            C12775o.m28639i(contextContainer, "contextContainer");
            int b = mo46439b(contextContainer);
            if (b == 0) {
                return 3;
            }
            if (b == 1) {
                return 4;
            }
            throw new UnsupportedOperationException("Not supported");
        }

        /* renamed from: b */
        public final int mo46439b(ContextContainer contextContainer) {
            Map<String, String> a;
            String str;
            C12775o.m28639i(contextContainer, "contextContainer");
            C13545b.C13546a c = C13545b.m30929c(contextContainer, "onboarding_version");
            if (!(c == null || (a = c.mo53188a()) == null || (str = a.get("onboarding_version")) == null)) {
                try {
                    return Integer.parseInt(str);
                } catch (Exception e) {
                    C13633n.m31165u(this, e);
                }
            }
            return 0;
        }

        /* renamed from: c */
        public final Intent mo46440c(Context context) {
            C12775o.m28639i(context, "context");
            return new Intent(context, OnboardingActivity.class);
        }
    }

    /* renamed from: com.poulpeo.ui.screens.onboarding.OnboardingActivity$b */
    /* compiled from: OnboardingActivity.kt */
    private final class C11195b extends FragmentPagerAdapter {

        /* renamed from: a */
        private final Fragment[] f17628a;

        /* renamed from: b */
        final /* synthetic */ OnboardingActivity f17629b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11195b(OnboardingActivity onboardingActivity, FragmentManager fragmentManager) {
            super(fragmentManager);
            C12775o.m28639i(fragmentManager, "fm");
            this.f17629b = onboardingActivity;
            this.f17628a = new Fragment[OnboardingActivity.f17619s.mo46438a(onboardingActivity.mo47878o2())];
        }

        public int getCount() {
            return this.f17628a.length;
        }

        public Fragment getItem(int i) {
            Fragment fragment = this.f17628a[i];
            if (fragment != null) {
                return fragment;
            }
            C10919b o = C10919b.f16834d.mo45940o(i, OnboardingActivity.f17619s.mo46439b(this.f17629b.mo47878o2()));
            this.f17628a[i] = o;
            return o;
        }
    }

    /* renamed from: com.poulpeo.ui.screens.onboarding.OnboardingActivity$c */
    /* compiled from: OnboardingActivity.kt */
    public static final class C11196c extends Scroller {

        /* renamed from: a */
        final /* synthetic */ int f17630a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11196c(OnboardingActivity onboardingActivity, int i, DecelerateInterpolator decelerateInterpolator) {
            super(onboardingActivity, decelerateInterpolator);
            this.f17630a = i;
        }

        public void startScroll(int i, int i2, int i3, int i4) {
            super.startScroll(i, i2, i3, i4, this.f17630a);
        }

        public void startScroll(int i, int i2, int i3, int i4, int i5) {
            super.startScroll(i, i2, i3, i4, this.f17630a);
        }
    }

    /* renamed from: com.poulpeo.ui.screens.onboarding.OnboardingActivity$d */
    /* compiled from: OnboardingActivity.kt */
    public static final class C11197d implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C12760f0 f17631b;

        /* renamed from: c */
        final /* synthetic */ OnboardingActivity f17632c;

        C11197d(C12760f0 f0Var, OnboardingActivity onboardingActivity) {
            this.f17631b = f0Var;
            this.f17632c = onboardingActivity;
        }

        public void run() {
            int i = this.f17631b.f20416b;
            C11195b C2 = this.f17632c.f17623n;
            if (C2 == null) {
                C12775o.m28656z("adapter");
                C2 = null;
            }
            if (i >= C2.getCount() - 1) {
                this.f17631b.f20416b = 0;
            } else {
                this.f17631b.f20416b++;
            }
            ((ViewPager) this.f17632c.mo46436B2(C13865f.pager)).setCurrentItem(this.f17631b.f20416b, true);
            Handler F2 = this.f17632c.f17625p;
            if (F2 != null) {
                F2.postDelayed(this, this.f17632c.f17624o);
            }
        }
    }

    /* renamed from: com.poulpeo.ui.screens.onboarding.OnboardingActivity$e */
    /* compiled from: OnboardingActivity.kt */
    public static final class C11198e implements ViewPager.OnPageChangeListener {

        /* renamed from: b */
        final /* synthetic */ OnboardingActivity f17633b;

        C11198e(OnboardingActivity onboardingActivity) {
            this.f17633b = onboardingActivity;
        }

        public void onPageScrollStateChanged(int i) {
            Handler F2;
            if (i == 1 && (F2 = this.f17633b.f17625p) != null) {
                Runnable G2 = this.f17633b.f17626q;
                if (G2 == null) {
                    C12775o.m28656z("pageChangeRunnable");
                    G2 = null;
                }
                F2.removeCallbacks(G2);
            }
        }

        public void onPageScrolled(int i, float f, int i2) {
            float f2 = ((float) i) + f;
            if (f2 >= 0.0f && f2 <= ((float) (OnboardingActivity.f17619s.mo46438a(this.f17633b.mo47878o2()) - 1))) {
                ((LinearLayout) this.f17633b.mo46436B2(C13865f.viewButtonsContainer)).setBackgroundColor(this.f17633b.m24577I2(i, f));
            }
        }

        public void onPageSelected(int i) {
            this.f17633b.m24582N2(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public final int m24577I2(int i, float f) {
        boolean z;
        int b = f17619s.mo46439b(mo47878o2());
        if (b == 0) {
            if (f == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return ContextCompat.getColor(this, f17621u[i].intValue());
            }
            ArgbEvaluator argbEvaluator = new ArgbEvaluator();
            Integer[] numArr = f17621u;
            Object evaluate = argbEvaluator.evaluate(f, Integer.valueOf(ContextCompat.getColor(this, numArr[i].intValue())), Integer.valueOf(ContextCompat.getColor(this, numArr[i + 1].intValue())));
            C12775o.m28637g(evaluate, "null cannot be cast to non-null type kotlin.Int");
            return ((Integer) evaluate).intValue();
        } else if (b == 1) {
            return ContextCompat.getColor(this, f17621u[1].intValue());
        } else {
            throw new UnsupportedOperationException("Not supported");
        }
    }

    /* renamed from: J2 */
    private final void m24578J2() {
        m24582N2(0);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C12775o.m28638h(supportFragmentManager, "supportFragmentManager");
        this.f17623n = new C11195b(this, supportFragmentManager);
        int i = C13865f.pager;
        ViewPager viewPager = (ViewPager) mo46436B2(i);
        C11195b bVar = this.f17623n;
        if (bVar == null) {
            C12775o.m28656z("adapter");
            bVar = null;
        }
        viewPager.setAdapter(bVar);
        ((ViewPager) mo46436B2(i)).setClipToPadding(false);
        ((ViewPager) mo46436B2(i)).setClipChildren(false);
        ((ViewPager) mo46436B2(i)).setOffscreenPageLimit(2);
        m24581M2();
        m24580L2();
        ((CirclePageIndicator) mo46436B2(C13865f.indicator)).setViewPager((ViewPager) mo46436B2(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: K2 */
    public static final void m24579K2(OnboardingActivity onboardingActivity, C13545b.C13546a aVar) {
        C12775o.m28639i(onboardingActivity, "this$0");
        onboardingActivity.m24578J2();
    }

    /* renamed from: L2 */
    private final void m24580L2() {
        try {
            int i = C13865f.pager;
            Field declaredField = ((ViewPager) mo46436B2(i)).getClass().getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            declaredField.set((ViewPager) mo46436B2(i), new C11196c(this, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, new DecelerateInterpolator()));
        } catch (Exception e) {
            C13633n.m31147c(this, e);
        }
    }

    /* renamed from: M2 */
    private final void m24581M2() {
        this.f17625p = new Handler();
        C11197d dVar = new C11197d(new C12760f0(), this);
        this.f17626q = dVar;
        Handler handler = this.f17625p;
        if (handler != null) {
            handler.postDelayed(dVar, this.f17624o);
        }
        ((ViewPager) mo46436B2(C13865f.pager)).addOnPageChangeListener(new C11198e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: N2 */
    public final void m24582N2(int i) {
        String str;
        C13545b.C13546a c = C13545b.m30929c(mo47878o2(), "onboarding_version");
        C13618g gVar = C13618g.f21930b;
        int i2 = i + 1;
        String str2 = null;
        if (c != null) {
            str = c.f21804a;
        } else {
            str = null;
        }
        if (c != null) {
            str2 = c.f21805b;
        }
        gVar.mo53279c("onboarding", "see-slider", i2 + " - abTest=" + str + "-" + str2);
    }

    /* renamed from: B2 */
    public View mo46436B2(int i) {
        Map<Integer, View> map = this.f17627r;
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

    public void onClick(View view) {
        C12775o.m28639i(view, "v");
        int i = C13865f.buttonSignUp;
        if (C12775o.m28634d(view, (Button) mo46436B2(i)) || C12775o.m28634d(view, (Button) mo46436B2(C13865f.buttonSignIn))) {
            C13200d.f21007a.mo52834l(this);
        }
        if (C12775o.m28634d(view, (Button) mo46436B2(i))) {
            C13618g.f21930b.mo53278b("onboarding", "signup");
            startActivity(PLPMainSignUpActivity.C11136a.m24136d(PLPMainSignUpActivity.f17354f0, this, (String) null, 2, (Object) null));
        } else if (C12775o.m28634d(view, (Button) mo46436B2(C13865f.buttonSignIn))) {
            C13618g.f21930b.mo53278b("onboarding", "login");
            startActivity(PLPSignInActivity.f17367g0.mo46289a(this));
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_onboarding);
        mo50358x2("OnboardingActivity", true);
        C13547c.m30933a(mo47878o2(), "on_onboarding");
        ((Button) mo46436B2(C13865f.buttonSignUp)).setOnClickListener(this);
        ((Button) mo46436B2(C13865f.buttonSignIn)).setOnClickListener(this);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setTitle((CharSequence) "");
        }
        ((LinearLayout) mo46436B2(C13865f.viewButtonsContainer)).setBackgroundColor(getColor(R.color.background_theme));
        C13545b.m30928b(mo47878o2(), new C10918a(this), "onboarding_version");
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f17625p = null;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        Handler handler = this.f17625p;
        if (handler != null) {
            Runnable runnable = this.f17626q;
            if (runnable == null) {
                C12775o.m28656z("pageChangeRunnable");
                runnable = null;
            }
            handler.removeCallbacks(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C13618g.f21930b.mo53280e(new C13615d("onboarding", C13617f.ONBOARDING));
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public int mo46199y2() {
        return this.f17622m;
    }
}
