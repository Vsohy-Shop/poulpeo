package com.poulpeo.p321ui.screens.main_menu;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.consent.TermsConsentActivity;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.api.p322v2.poulpeo.model.EarningAmount;
import com.rmn.api.p322v2.poulpeo.model.PLPUser;
import com.rmn.api.p322v2.poulpeo.model.PLPUserGrade;
import com.rmn.utils.IntentDelegate;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12764h0;
import kotlin.jvm.internal.C12772l0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.C12783v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import p066d9.C7311c;
import p103ga.C7839d;
import p346gd.C12016a;
import p351hb.C12047o;
import p357ia.C12104a;
import p357ia.C12107b;
import p360id.C12134b;
import p368jd.C12616b;
import p380la.C12793e;
import p399oa.C13025e;
import p404of.C13074a;
import p407pa.C13192g;
import p407pa.C13194h;
import p419ra.C13266a;
import p419ra.C13267b;
import p419ra.C13268c;
import p419ra.C13269d;
import p419ra.C13274e;
import p419ra.C13275f;
import p419ra.C13276g;
import p440ud.C13566l;
import p445vc.C13618g;
import p446vd.C13636q;
import p450wb.C13689a;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.main_menu.MainMenuActivity */
/* compiled from: MainMenuActivity.kt */
public final class MainMenuActivity extends C12616b implements C13275f, C13194h, C12107b {

    /* renamed from: w */
    public static final C11152a f17407w = new C11152a((DefaultConstructorMarker) null);

    /* renamed from: x */
    public static final int f17408x = 8;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public static final IntentDelegate.Int f17409y = new IntentDelegate.Int("tabToShowFirst");
    /* access modifiers changed from: private */

    /* renamed from: z */
    public static final IntentDelegate.Boolean f17410z = new IntentDelegate.Boolean("initDataFromNetwork");

    /* renamed from: m */
    private final int f17411m = R.string.main_activity_title;

    /* renamed from: n */
    private String f17412n;

    /* renamed from: o */
    private final ArrayList<WeakReference<C13276g>> f17413o = new ArrayList<>();

    /* renamed from: p */
    private final HashMap<String, WeakReference<C13274e>> f17414p = new HashMap<>();

    /* renamed from: q */
    private BottomNavigationView.OnNavigationItemSelectedListener f17415q;

    /* renamed from: r */
    private int f17416r = -1;

    /* renamed from: s */
    private HashSet<String> f17417s = new HashSet<>();

    /* renamed from: t */
    private final Lazy f17418t = C11901h.m25690b(new C11154c(this));

    /* renamed from: u */
    private final Lazy f17419u = C11901h.m25690b(new C11153b(this));

    /* renamed from: v */
    public Map<Integer, View> f17420v = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.main_menu.MainMenuActivity$a */
    /* compiled from: MainMenuActivity.kt */
    public static final class C11152a {

        /* renamed from: a */
        static final /* synthetic */ KProperty<Object>[] f17421a;

        static {
            Class<C11152a> cls = C11152a.class;
            f17421a = new KProperty[]{C12764h0.m28590f(new C12783v(cls, "tabIdToShowFirst", "getTabIdToShowFirst(Landroid/content/Intent;)I", 0)), C12764h0.m28590f(new C12783v(cls, "initDataFromNetwork", "getInitDataFromNetwork(Landroid/content/Intent;)Z", 0))};
        }

        private C11152a() {
        }

        public /* synthetic */ C11152a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final boolean m24233d(Intent intent) {
            return MainMenuActivity.f17410z.getValue(intent, (KProperty<?>) f17421a[1]).booleanValue();
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public final int m24234e(Intent intent) {
            return MainMenuActivity.f17409y.getValue(intent, (KProperty<?>) f17421a[0]).intValue();
        }

        /* renamed from: i */
        private final void m24235i(Intent intent, boolean z) {
            MainMenuActivity.f17410z.setValue(intent, (KProperty<?>) f17421a[1], z);
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public final void m24236j(Intent intent, int i) {
            MainMenuActivity.f17409y.setValue(intent, (KProperty<?>) f17421a[0], i);
        }

        /* renamed from: f */
        public final Intent mo46323f(Context context) {
            C12775o.m28639i(context, "context");
            return new Intent(context, MainMenuActivity.class);
        }

        /* renamed from: g */
        public final Intent mo46324g(Context context) {
            C12775o.m28639i(context, "context");
            Intent f = mo46323f(context);
            C11152a aVar = MainMenuActivity.f17407w;
            aVar.m24236j(f, C13269d.f21165g.mo52909b());
            aVar.m24235i(f, true);
            return f;
        }

        /* renamed from: h */
        public final Intent mo46325h(Context context) {
            C12775o.m28639i(context, "context");
            Intent f = mo46323f(context);
            MainMenuActivity.f17407w.m24236j(f, C13269d.f21166h.mo52909b());
            return f;
        }
    }

    /* renamed from: com.poulpeo.ui.screens.main_menu.MainMenuActivity$b */
    /* compiled from: MainMenuActivity.kt */
    static final class C11153b extends C12777p implements C13074a<C12104a> {

        /* renamed from: g */
        final /* synthetic */ MainMenuActivity f17422g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11153b(MainMenuActivity mainMenuActivity) {
            super(0);
            this.f17422g = mainMenuActivity;
        }

        /* renamed from: b */
        public final C12104a invoke() {
            MainMenuActivity mainMenuActivity = this.f17422g;
            return new C12104a(mainMenuActivity, new C12104a.C12106b(mainMenuActivity.mo47878o2(), new C13689a(this.f17422g.mo47878o2()), true));
        }
    }

    /* renamed from: com.poulpeo.ui.screens.main_menu.MainMenuActivity$c */
    /* compiled from: MainMenuActivity.kt */
    static final class C11154c extends C12777p implements C13074a<C13192g> {

        /* renamed from: g */
        final /* synthetic */ MainMenuActivity f17423g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11154c(MainMenuActivity mainMenuActivity) {
            super(0);
            this.f17423g = mainMenuActivity;
        }

        /* renamed from: b */
        public final C13192g invoke() {
            MainMenuActivity mainMenuActivity = this.f17423g;
            return new C13192g(mainMenuActivity, new C13192g.C13193a(mainMenuActivity.mo47878o2(), new C13689a(this.f17423g.mo47878o2())));
        }
    }

    /* renamed from: G2 */
    private final C12104a m24206G2() {
        return (C12104a) this.f17419u.getValue();
    }

    /* renamed from: H2 */
    private final AppBarLayout m24207H2() {
        return (AppBarLayout) findViewById(R.id.appbar);
    }

    /* renamed from: I2 */
    private final C13192g m24208I2() {
        return (C13192g) this.f17418t.getValue();
    }

    /* renamed from: J2 */
    private final void m24209J2(Bundle bundle) {
        C13269d dVar;
        this.f17415q = new C13267b(this);
        ((BottomNavigationView) mo46313D2(C13865f.bottomNavigation)).setOnNavigationItemSelectedListener(this.f17415q);
        C11152a aVar = f17407w;
        Intent intent = getIntent();
        C12775o.m28638h(intent, "intent");
        if (aVar.m24233d(intent)) {
            this.f17417s.add(C13269d.f21165g.mo52910c());
        }
        if (bundle != null) {
            dVar = C13269d.f21163e.mo52914b(bundle.getInt("saved_state_menu_item_id"));
        } else {
            dVar = null;
        }
        if (dVar == null) {
            C13269d.C13270a aVar2 = C13269d.f21163e;
            Intent intent2 = getIntent();
            C12775o.m28638h(intent2, "intent");
            dVar = aVar2.mo52914b(aVar.m24234e(intent2));
            Intent intent3 = getIntent();
            C12775o.m28638h(intent3, "intent");
            aVar.m24236j(intent3, 0);
        }
        if (dVar == null) {
            dVar = C13269d.f21164f;
        }
        m24214P2(dVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: K2 */
    public static final boolean m24210K2(MainMenuActivity mainMenuActivity, MenuItem menuItem) {
        boolean z;
        C12775o.m28639i(mainMenuActivity, "this$0");
        C12775o.m28639i(menuItem, "item");
        if (mainMenuActivity.f17416r == menuItem.getItemId()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            WeakReference weakReference = mainMenuActivity.f17414p.get(mainMenuActivity.f17412n);
            if (weakReference == null) {
                return false;
            }
            C13274e eVar = (C13274e) weakReference.get();
            if (eVar != null) {
                eVar.mo49558a();
                AppBarLayout H2 = mainMenuActivity.m24207H2();
                if (H2 != null) {
                    H2.setExpanded(true);
                }
            } else {
                C12772l0.m28612d(mainMenuActivity.f17414p).remove(mainMenuActivity.f17412n);
            }
        } else {
            C13269d b = C13269d.f21163e.mo52914b(menuItem.getItemId());
            if (b == null) {
                menuItem.setEnabled(false);
                return false;
            }
            mainMenuActivity.m24215Q2(b.ordinal());
            AppBarLayout H22 = mainMenuActivity.m24207H2();
            if (H22 != null) {
                H22.setExpanded(true);
            }
        }
        if (mainMenuActivity.f17416r != -1) {
            ((BottomNavigationView) mainMenuActivity.mo46313D2(C13865f.bottomNavigation)).getMenu().findItem(mainMenuActivity.f17416r).setChecked(false);
            menuItem.setChecked(true);
        }
        int i = mainMenuActivity.f17416r;
        int itemId = menuItem.getItemId();
        mainMenuActivity.f17416r = itemId;
        mainMenuActivity.m24217S2(i, itemId);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public static final void m24211L2(MainMenuActivity mainMenuActivity, DialogInterface dialogInterface, int i) {
        C12775o.m28639i(mainMenuActivity, "this$0");
        super.onBackPressed();
    }

    /* renamed from: N2 */
    private final void m24212N2() {
        C12793e.m28659u2(mo47878o2(), new C13268c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public static final void m24213O2(MainMenuActivity mainMenuActivity, Integer num) {
        C12775o.m28639i(mainMenuActivity, "this$0");
        TermsConsentActivity.C11109a aVar = TermsConsentActivity.f17266o;
        C12775o.m28638h(num, "currentTerms");
        mainMenuActivity.startActivityForResult(aVar.mo46207c(mainMenuActivity, num.intValue()), 4720);
    }

    /* renamed from: P2 */
    private final void m24214P2(C13269d dVar) {
        int i;
        BottomNavigationView bottomNavigationView = (BottomNavigationView) mo46313D2(C13865f.bottomNavigation);
        if (dVar != null) {
            i = dVar.mo52909b();
        } else {
            i = 0;
        }
        bottomNavigationView.setSelectedItemId(i);
    }

    /* renamed from: Q2 */
    private final void m24215Q2(int i) {
        Fragment findFragmentByTag;
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        C12775o.m28638h(beginTransaction, "supportFragmentManager.beginTransaction()");
        beginTransaction.setCustomAnimations(R.anim.fade_in, R.anim.fade_out);
        C13269d a = C13269d.f21163e.mo52913a(i);
        Fragment findFragmentByTag2 = getSupportFragmentManager().findFragmentByTag(a.mo52910c());
        if (!(this.f17412n == null || (findFragmentByTag = getSupportFragmentManager().findFragmentByTag(this.f17412n)) == null)) {
            beginTransaction.hide(findFragmentByTag);
        }
        if (findFragmentByTag2 == null || !findFragmentByTag2.isAdded()) {
            Fragment e = a.mo52912e();
            beginTransaction.add((int) R.id.fragmentContainer, e, a.mo52910c());
            if (e instanceof C13276g) {
                this.f17413o.add(new WeakReference(e));
                if (this.f17417s.contains(a.mo52910c())) {
                    ((C13276g) e).mo49556E();
                    this.f17417s.remove(a.mo52910c());
                }
            }
            if (e instanceof C13274e) {
                this.f17414p.put(a.mo52910c(), new WeakReference(e));
            }
        } else {
            beginTransaction.show(findFragmentByTag2);
        }
        beginTransaction.commitAllowingStateLoss();
        getSupportFragmentManager().executePendingTransactions();
        this.f17412n = a.mo52910c();
        m24216R2(a);
    }

    /* renamed from: R2 */
    private final void m24216R2(C13269d dVar) {
        if (this.f17416r > 0) {
            C13618g.f21930b.mo53278b("tab-bar", dVar.mo52911d());
        }
    }

    /* renamed from: S2 */
    private final void m24217S2(int i, int i2) {
        if (i == C13269d.f21165g.mo52909b() && i2 == C13269d.f21164f.mo52909b()) {
            C12047o.C12048a.m26212n(C12047o.f18841k, this, "home", (Function1) null, 4, (Object) null);
        }
    }

    /* renamed from: T2 */
    private final void m24218T2(Double d, String str, boolean z, String str2) {
        C13025e eVar;
        boolean z2;
        int i = C13865f.bottomNavigation;
        if (((BottomNavigationView) mo46313D2(i)) != null) {
            MenuItem findItem = ((BottomNavigationView) mo46313D2(i)).getMenu().findItem(C13269d.f21165g.mo52909b());
            boolean z3 = false;
            if (d == null) {
                findItem.setTitle(R.string.earnings_title);
            } else {
                findItem.setTitle(getString(R.string.main_menu_earnings_amount, new Object[]{d}));
            }
            if (str != null) {
                Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag(C13269d.f21164f.mo52910c());
                if (findFragmentByTag instanceof C13025e) {
                    eVar = (C13025e) findFragmentByTag;
                } else {
                    eVar = null;
                }
                if (str.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (eVar != null) {
                        String string = getString(R.string.main_menu_account);
                        C12775o.m28638h(string, "getString(R.string.main_menu_account)");
                        eVar.mo50941v2(string);
                    }
                } else if (eVar != null) {
                    eVar.mo50941v2(str);
                }
            }
            if (!z) {
                if (str2 == null || C13754v.m31532t(str2)) {
                    z3 = true;
                }
                if (!z3) {
                    Iterator it = new ArrayList(this.f17413o).iterator();
                    while (it.hasNext()) {
                        WeakReference weakReference = (WeakReference) it.next();
                        C13276g gVar = (C13276g) weakReference.get();
                        if (gVar == null) {
                            this.f17413o.remove(weakReference);
                        } else if (!C12775o.m28634d(str2, gVar.getTag())) {
                            gVar.mo49557J0();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: B1 */
    public void mo46312B1(String str) {
        C12775o.m28639i(str, "appVersion");
    }

    /* renamed from: D2 */
    public View mo46313D2(int i) {
        Map<Integer, View> map = this.f17420v;
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

    /* renamed from: H1 */
    public void mo46314H1(PLPUser pLPUser, String str, String str2, String str3, String str4, String str5, PLPUserGrade pLPUserGrade, boolean z) {
        C12775o.m28639i(pLPUser, "user");
        C12775o.m28639i(str, "initials");
        C12775o.m28639i(str2, HintConstants.AUTOFILL_HINT_NAME);
        C12775o.m28639i(str3, NotificationCompat.CATEGORY_EMAIL);
        C12775o.m28639i(str4, "date");
        C12775o.m28639i(str5, "paidAmount");
        mo46315M2(pLPUser, true, (String) null);
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [androidx.fragment.app.Fragment] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: M2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo46315M2(com.rmn.api.p322v2.poulpeo.model.PLPUser r6, boolean r7, java.lang.String r8) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L_0x0007
            r5.m24218T2(r0, r0, r7, r8)
            return
        L_0x0007:
            com.rmn.api.v2.poulpeo.model.EarningAmount r1 = r6.getEarningAmount()
            if (r1 == 0) goto L_0x0016
            double r1 = r1.getTotal()
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            goto L_0x0017
        L_0x0016:
            r1 = r0
        L_0x0017:
            java.lang.String r2 = r6.getFirstName()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L_0x0025
            java.lang.String r2 = r6.getLogin()
        L_0x0025:
            androidx.fragment.app.FragmentManager r3 = r5.getSupportFragmentManager()
            ra.d r4 = p419ra.C13269d.f21164f
            java.lang.String r4 = r4.mo52910c()
            androidx.fragment.app.Fragment r3 = r3.findFragmentByTag(r4)
            boolean r4 = r3 instanceof p399oa.C13025e
            if (r4 == 0) goto L_0x003a
            r0 = r3
            oa.e r0 = (p399oa.C13025e) r0
        L_0x003a:
            com.rmn.api.v2.poulpeo.model.PLPUserGrade r3 = r6.getGrade()
            com.rmn.api.v2.poulpeo.model.PLPUserGrade r4 = com.rmn.api.p322v2.poulpeo.model.PLPUserGrade.POULPEO_PLUS
            if (r3 != r4) goto L_0x0054
            if (r0 == 0) goto L_0x0065
            r3 = 2131952461(0x7f13034d, float:1.9541365E38)
            java.lang.String r3 = r5.getString(r3)
            java.lang.String r4 = "getString(R.string.sponsorship_ad_poulpeo_plus)"
            kotlin.jvm.internal.C12775o.m28638h(r3, r4)
            r0.mo50942w2(r3)
            goto L_0x0065
        L_0x0054:
            if (r0 == 0) goto L_0x0065
            r3 = 2131952460(0x7f13034c, float:1.9541363E38)
            java.lang.String r3 = r5.getString(r3)
            java.lang.String r4 = "getString(R.string.sponsorship_ad)"
            kotlin.jvm.internal.C12775o.m28638h(r3, r4)
            r0.mo50942w2(r3)
        L_0x0065:
            boolean r6 = r6.isAdmin()
            if (r6 == 0) goto L_0x0070
            if (r0 == 0) goto L_0x0070
            r0.mo50939q2()
        L_0x0070:
            r5.m24218T2(r1, r2, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.poulpeo.p321ui.screens.main_menu.MainMenuActivity.mo46315M2(com.rmn.api.v2.poulpeo.model.PLPUser, boolean, java.lang.String):void");
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        C13025e eVar;
        super.onActivityResult(i, i2, intent);
        if (i == 4720 && i2 == 3601) {
            m24212N2();
        } else if (i == 159 && i2 == 500) {
            Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag(C13269d.f21164f.mo52910c());
            if (findFragmentByTag instanceof C13025e) {
                eVar = (C13025e) findFragmentByTag;
            } else {
                eVar = null;
            }
            if (eVar != null) {
                eVar.mo50940u2();
            }
        }
    }

    public void onBackPressed() {
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(this).setMessage((int) R.string.close_app_dialog_message).setPositiveButton((int) R.string.yes, (DialogInterface.OnClickListener) new C13266a(this)).setNegativeButton((int) R.string.no, (DialogInterface.OnClickListener) null);
        C12775o.m28638h(negativeButton, "Builder(this)\n          …Button(R.string.no, null)");
        C12134b.m26457c(negativeButton, this, (Function1) null, 2, (Object) null);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!C7311c.f10128c.mo49167m(new C13566l(this))) {
            mo50358x2("MainMenuActivity", true);
            m24212N2();
            if (C12016a.m26090a(this)) {
                C7839d.m15330f(this);
            }
            C13636q.m31181b(mo47878o2()).mo53299j("MR_onboarding_already_opened", true);
            setContentView(R.layout.activity_main_menu);
            mo46315M2((PLPUser) null, true, (String) null);
            m24209J2(bundle);
            m24208I2().mo52820o2();
            m24206G2().mo49546q2();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        m24208I2().mo52821p2();
        m24206G2().mo49547r2();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        m24208I2().mo52822q2();
        m24206G2().mo49548s2();
        C7839d.m15329e();
    }

    public void onProxyActionExecuted(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
        C12775o.m28639i(proxyBundleInput, "input");
        C12775o.m28639i(proxyBundleOutput, "output");
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        m24208I2().mo52823r2();
        m24206G2().mo49549t2();
        FirebaseAnalytics.getInstance(this).mo39755a("on_main_screen", (Bundle) null);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        C12775o.m28639i(bundle, "outState");
        bundle.putInt("saved_state_menu_item_id", this.f17416r);
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: v */
    public void mo46321v(EarningAmount earningAmount, boolean z, String str) {
        Double d;
        if (earningAmount != null) {
            d = Double.valueOf(earningAmount.getTotal());
        } else {
            d = null;
        }
        m24218T2(d, (String) null, z, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public int mo46199y2() {
        return this.f17411m;
    }

    /* renamed from: Q0 */
    public void mo46316Q0() {
    }

    /* renamed from: e2 */
    public void mo46317e2() {
    }

    /* renamed from: h1 */
    public void mo46319h1() {
    }

    /* renamed from: x */
    public void mo46322x() {
    }

    /* renamed from: f */
    public void mo46318f(boolean z, boolean z2) {
    }
}
