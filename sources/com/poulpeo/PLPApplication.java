package com.poulpeo;

import android.os.Build;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.rmn.api.p322v2.cloud.cache.CloudDatabaseHelper;
import com.rmn.api.p322v2.cloud.notifications.BasePushNotificationManager;
import com.rmn.api.p322v2.main.oauth.OAuthAccountManager;
import com.rmn.api.p322v2.poulpeo.cache.PLPDatabaseHelper;
import com.rmn.api.p322v2.poulpeo.general.PLPApiType;
import com.rmn.api.p322v2.poulpeo.general.PLPUtil;
import com.rmn.api.p322v2.poulpeo.model.EarningAmount;
import com.rmn.api.p322v2.poulpeo.model.PLPUser;
import com.rmn.api.p322v2.poulpeo.model.PLPUserGrade;
import com.rmn.api.p322v2.poulpeo.notifications.PLPPushNotificationManager;
import com.rmn.api.p322v2.poulpeo.user.PLPPinnedObjectsManager;
import com.rmn.apiclient.impl.api.descriptors.APIServiceDescriptors;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.utils.shortcut.ShortcutUtil;
import com.rmn.utils_common.IListener;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.C12775o;
import p040b9.C2945a;
import p052c9.C4036a;
import p090f9.C7613a;
import p102g9.C7833b;
import p114h9.C8031a;
import p336ef.C11910n;
import p336ef.C11921v;
import p346gd.C12016a;
import p351hb.C12034b;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13088o;
import p409pc.C13200d;
import p415qc.C13240e;
import p415qc.C13242g;
import p446vd.C13621b;
import p446vd.C13633n;
import p446vd.C13636q;
import p462yb.C13857a;
import p462yb.C13861e;
import p466yf.C13933b1;
import p466yf.C13995l0;
import p466yf.C13999m0;
import p466yf.C14004n0;
import p466yf.C14054y1;

@StabilityInferred(parameters = 0)
/* compiled from: PLPApplication.kt */
public final class PLPApplication extends C13861e implements IListener<PLPUser> {

    @C12739f(mo50609c = "com.poulpeo.PLPApplication$onCreate$scope$1", mo50610f = "PLPApplication.kt", mo50611l = {83}, mo50612m = "invokeSuspend")
    /* renamed from: com.poulpeo.PLPApplication$a */
    /* compiled from: PLPApplication.kt */
    static final class C7207a extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {

        /* renamed from: h */
        int f9877h;

        /* renamed from: i */
        final /* synthetic */ PLPApplication f9878i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7207a(PLPApplication pLPApplication, C12074d<? super C7207a> dVar) {
            super(2, dVar);
            this.f9878i = pLPApplication;
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C7207a(this.f9878i, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.f9877h;
            if (i == 0) {
                C11910n.m25701b(obj);
                C2945a aVar = new C2945a(this.f9878i);
                ContextContainer p = this.f9878i.mo53549c();
                PLPApplication pLPApplication = this.f9878i;
                this.f9877h = 1;
                obj = aVar.mo28494f(p, pLPApplication, this);
                if (obj == c) {
                    return c;
                }
            } else if (i == 1) {
                C11910n.m25701b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (((Boolean) obj).booleanValue()) {
                C13633n.m31149e(this.f9878i, "Error on getUserAndClearCache at start of application");
            }
            return C11921v.f18618a;
        }

        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
            return ((C7207a) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    /* renamed from: e */
    public BasePushNotificationManager mo40745e() {
        PLPPushNotificationManager instance = PLPPushNotificationManager.getInstance(mo53549c());
        C12775o.m28638h(instance, "getInstance(contextContainer)");
        return instance;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo40746f() {
        PLPDatabaseHelper.getInstance(mo53549c()).initDatabase();
        CloudDatabaseHelper.getInstance(mo53549c()).initDatabase();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo40747g() {
        OAuthAccountManager.getInstance().retrieveAccessTokenLocally(mo53549c(), PLPApiType.PLP);
    }

    /* renamed from: j */
    public void mo40748j(String str) {
        C12775o.m28639i(str, "userId");
        if (!TextUtils.isEmpty(str)) {
            C8031a.m15801k(mo53549c(), str);
            C13240e.m30073a(mo53549c(), C13242g.f21107s, str);
            FirebaseAnalytics.getInstance(this).mo39757c(str);
            FirebaseAnalytics.getInstance(this).mo39758d("isLoggedIn", "yes");
            C13200d.f21007a.mo52832j(str);
        }
    }

    /* renamed from: n */
    public void mo40749n() {
        C8031a.m15801k(mo53549c(), (String) null);
        C13240e.m30077f(mo53549c(), C13242g.f21107s);
        FirebaseAnalytics.getInstance(this).mo39757c((String) null);
        FirebaseAnalytics.getInstance(this).mo39758d("isLoggedIn", "no");
        C13200d.f21007a.mo52832j((String) null);
    }

    public void onCreate() {
        super.onCreate();
        C13857a aVar = C13857a.f22382a;
        aVar.mo53546i(R.anim.enter_slide_up);
        aVar.mo53547j(R.anim.scale_out);
        aVar.mo53544g(R.anim.scale_in);
        aVar.mo53545h(R.anim.exit_slide_down);
        aVar.mo53548k(new C7833b());
        APIServiceDescriptors.SERVICE_DESCRIPTOR.init(mo53549c(), C4036a.f3228a, C13621b.m31091e(mo53549c()));
        OAuthAccountManager instance = OAuthAccountManager.getInstance();
        PLPApiType pLPApiType = PLPApiType.PLP;
        if (instance.isConnectedToAccount(pLPApiType)) {
            C13636q.m31181b(mo53549c()).mo53299j("MR_onboarding_already_opened", true);
            if (Build.VERSION.SDK_INT >= 25) {
                ShortcutUtil.INSTANCE.initShortcuts(this);
            }
        }
        C12016a.m26091b(this);
        if (!pLPApiType.hasClientSecret()) {
            pLPApiType.setClientKeys(PLPUtil.PLP_ANDROID_CLIENT_ID, "84dbb79eddc1effe14965db52caeae70636ac31b");
        }
        PLPPinnedObjectsManager.getInstance(mo53549c()).init(new C7613a());
        C12034b.m26139d().mo49467g(mo53549c());
        C14054y1 unused = C13985j.m32422d(C13999m0.m32447a(C13933b1.m32210a()), (C12079g) null, (C14004n0) null, new C7207a(this, (C12074d<? super C7207a>) null), 3, (Object) null);
    }

    /* renamed from: q */
    public void mo40744J0(PLPUser pLPUser) {
        String str;
        if (pLPUser != null) {
            mo40748j(String.valueOf(pLPUser.getUserId()));
            FirebaseAnalytics instance = FirebaseAnalytics.getInstance(this);
            String str2 = "yes";
            if (pLPUser.getGrade() == PLPUserGrade.POULPEO_PLUS) {
                str = str2;
            } else {
                str = "no";
            }
            instance.mo39758d("isPoulpeoPlus", str);
            FirebaseAnalytics instance2 = FirebaseAnalytics.getInstance(this);
            if (pLPUser.getUserPaylead() == null) {
                str2 = "no";
            }
            instance2.mo39758d("hasOptinPaylead", str2);
            EarningAmount earningAmount = pLPUser.getEarningAmount();
            if (earningAmount != null) {
                FirebaseAnalytics.getInstance(this).mo39758d("earningAmount", String.valueOf(earningAmount.getTotal()));
            }
        }
    }
}
