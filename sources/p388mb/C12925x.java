package p388mb;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.api.p322v2.common.model.BaseMerchant;
import com.rmn.api.p322v2.common.model.PinnedObject;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.main.proxy.IProxyListener;
import com.rmn.api.p322v2.main.proxy.IProxyMethodType;
import com.rmn.api.p322v2.main.proxy.ProxyActionsPool;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleWrapper;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.model.PLPUser;
import com.rmn.api.p322v2.poulpeo.notifications.PLPPushNotificationManager;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsPLPMerchant;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsPLPPinnedObject;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsPLPPushNotification;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsPLPUser;
import com.rmn.api.p322v2.poulpeo.user.PLPPinnedObjectsManager;
import com.rmn.apiclient.core.data_access.base.call.CallException;
import com.rmn.apiclient.core.data_access.base.call.CallManager;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyOutput;
import com.rmn.apiclient.core.data_access.proxy.strategy.ProxyStrategy;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.iosadapters.android.p323os.AndroidOsHandler;
import com.rmn.iosadapters.android.p323os.AndroidOsMessage;
import com.rmn.utils_common.IListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import p305ad.C10865d;
import p382lc.C12822d;
import p399oa.C13020a;
import p399oa.C13029h;
import p428sd.C13396a;
import p428sd.C13397b;
import p428sd.C13399d;
import p440ud.C13548a;
import p440ud.C13572p;
import p440ud.C13574r;
import p445vc.C13615d;
import p445vc.C13617f;
import p445vc.C13618g;
import p446vd.C13636q;

/* renamed from: mb.x */
/* compiled from: WelcomeController */
public class C12925x extends C10865d implements IProxyListener, IListener<ProxyBundleWrapper> {
    @NonNull

    /* renamed from: d */
    private final ProxyActionsPool f20677d = new ProxyActionsPool();
    @NonNull

    /* renamed from: e */
    private final CallManager f20678e = new CallManager(mo45820l2());

    /* renamed from: f */
    private final boolean f20679f = (!PLPPushNotificationManager.getInstance(mo45820l2()).hasPassedPushNotificationConsent());

    /* renamed from: g */
    private List<Integer> f20680g;

    /* renamed from: h */
    private final List<BaseMerchant> f20681h = new ArrayList();

    /* renamed from: i */
    private int f20682i;

    /* renamed from: j */
    private double f20683j = 0.0d;

    /* renamed from: k */
    private String f20684k = "";

    /* renamed from: l */
    private boolean f20685l = false;

    /* renamed from: m */
    private boolean f20686m = false;

    /* renamed from: n */
    private boolean f20687n = false;

    /* renamed from: o */
    private boolean f20688o = false;

    /* renamed from: p */
    private boolean f20689p = false;

    /* renamed from: q */
    private AndroidOsHandler f20690q;

    /* renamed from: r */
    private int f20691r;

    /* renamed from: s */
    private boolean f20692s;

    /* renamed from: mb.x$a */
    /* compiled from: WelcomeController */
    public static class C12926a extends C10865d.C10866a {
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final boolean f20693d;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: e */
        public final C13399d f20694e;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: f */
        public final C13572p f20695f;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: g */
        public final C13548a f20696g;
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: h */
        public final Integer f20697h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public final boolean f20698i;

        public C12926a(@NonNull ContextContainer contextContainer, @NonNull LogoutListener logoutListener, boolean z, @NonNull C13399d dVar, @NonNull C13572p pVar, @NonNull C13548a aVar, @Nullable Integer num, boolean z2) {
            super(contextContainer, logoutListener);
            this.f20693d = z;
            this.f20694e = dVar;
            this.f20695f = pVar;
            this.f20696g = aVar;
            this.f20697h = num;
            this.f20698i = z2;
        }
    }

    public C12925x(@NonNull C12927y yVar, @NonNull C12926a aVar) {
        super(yVar, aVar);
        if (aVar.f20697h != null) {
            this.f20691r = aVar.f20697h.intValue();
        } else {
            this.f20691r = 0;
        }
    }

    @NonNull
    /* renamed from: G2 */
    private C12927y m29093G2() {
        return (C12927y) this.f16655b;
    }

    /* renamed from: H2 */
    private void m29094H2() {
        int i;
        this.f20691r = 3;
        C13029h.m29417z2(C13020a.m29394I2(), ProxyStrategy.getFromCache().orThenCallService().thenAddInCache(), this.f20678e).onFailure(new C12917p(this)).onSuccess(new C12918q(this));
        m29136t3().f20695f.mo53248h(false);
        m29139u3(new C12919r(this), 800);
        C12920s sVar = new C12920s(this);
        if (this.f20692s) {
            i = 1200;
        } else {
            i = 2500;
        }
        m29139u3(sVar, i);
    }

    /* renamed from: K2 */
    private void m29095K2() {
        this.f20691r = 2;
        ProxyActionsPool proxyActionsPool = this.f20677d;
        IProxyMethodType iProxyMethodType = ProxyMethodsPLPPushNotification.CONFIGURE;
        proxyActionsPool.cancelAndRemoveAllActionsWithMethod(iProxyMethodType);
        this.f20677d.executeProxyAction(this, new ProxyBundleInput(mo45820l2(), iProxyMethodType, ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_ONLY, ProxyBundleInput.ProxyNetworkOption.NO_CACHE, mo45821m2()));
        m29136t3().f20695f.mo53248h(false);
        m29139u3(new C12909h(this), 800);
    }

    /* renamed from: L2 */
    private String m29096L2() {
        int i = this.f20691r;
        if (i == 0) {
            return "user-data";
        }
        if (i == 1) {
            return "pinned-objects";
        }
        if (i == 2) {
            return "push-config";
        }
        if (i != 3) {
            return "undefined";
        }
        return "home-data";
    }

    /* renamed from: M2 */
    private void m29097M2() {
        this.f20691r = 0;
        this.f20677d.cancelAndRemoveAllActions();
        this.f20677d.executeProxyAction(this, new ProxyBundleInput(mo45820l2(), ProxyMethodsPLPUser.PLP_USER_GET_DETAILS, ProxyBundleInput.ProxySourcesOption.GET_FROM_CACHE_THEN_NETWORK, ProxyBundleInput.ProxyNetworkOption.ADD_IN_CACHE, mo45821m2()));
        m29136t3().f20695f.mo53248h(false);
        m29139u3(new C12908g(this), 800);
    }

    /* access modifiers changed from: private */
    /* renamed from: N2 */
    public /* synthetic */ void m29098N2(Void voidR) {
        this.f20689p = true;
        m29108W();
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public /* synthetic */ void m29099O2(Void voidR) {
        m29094H2();
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public /* synthetic */ void m29100P2(CallException callException) {
        if (callException.getHttpCodeIfAny() >= 500) {
            m29118g3(new C12914m(this));
            return;
        }
        this.f20688o = true;
        m29108W();
    }

    /* access modifiers changed from: private */
    /* renamed from: Q2 */
    public /* synthetic */ void m29101Q2(ProxyOutput proxyOutput) {
        this.f20688o = true;
        m29108W();
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public /* synthetic */ void m29102R2(Void voidR) {
        if (!this.f20688o) {
            m29136t3().f20695f.mo53248h(true);
        }
    }

    /* renamed from: S1 */
    private void m29103S1(@NonNull IListener<Void> iListener, @Nullable IListener<Void> iListener2) {
        this.f20690q.mo47874i(0);
        m29093G2().mo46538S1(iListener, iListener2);
    }

    /* access modifiers changed from: private */
    /* renamed from: S2 */
    public /* synthetic */ void m29104S2(Void voidR) {
        if (!this.f20686m) {
            m29136t3().f20695f.mo53248h(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: T2 */
    public /* synthetic */ void m29105T2(Void voidR) {
        if (!this.f20687n) {
            m29136t3().f20695f.mo53248h(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public /* synthetic */ void m29106U2(Void voidR) {
        if (!this.f20685l) {
            m29136t3().f20695f.mo53248h(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public /* synthetic */ boolean m29107V2(AndroidOsMessage androidOsMessage) {
        C13618g.f21930b.mo53279c("welcome-pot", "show-retry", m29096L2());
        m29136t3().f20696g.mo53248h(true);
        return true;
    }

    /* renamed from: W */
    private void m29108W() {
        if (this.f20689p && this.f20688o) {
            m29093G2().mo46539W();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public /* synthetic */ void m29109W2(C13574r rVar) {
        C13618g.f21930b.mo53279c("welcome-pot", "click-retry", m29096L2());
        m29136t3().f20696g.mo53248h(false);
        m29097M2();
        this.f20690q.mo47875j(0, 10000);
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public /* synthetic */ void m29110X2(Void voidR) {
        m29145y3();
    }

    /* access modifiers changed from: private */
    /* renamed from: Y2 */
    public /* synthetic */ void m29111Y2(Void voidR) {
        this.f20686m = true;
        m29122m3();
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public /* synthetic */ void m29112Z2(Void voidR) {
        mo50831J2();
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public /* synthetic */ void m29113a3(Void voidR) {
        m29095K2();
    }

    /* access modifiers changed from: private */
    /* renamed from: b3 */
    public /* synthetic */ void m29114b3(Void voidR) {
        mo50829F2();
    }

    /* access modifiers changed from: private */
    /* renamed from: c3 */
    public /* synthetic */ void m29115c3(Void voidR) {
        m29097M2();
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public /* synthetic */ void m29117e3(Void voidR) {
        mo50838x3(this.f20680g);
    }

    /* renamed from: g3 */
    private void m29118g3(IListener<Void> iListener) {
        m29127p1(iListener, m29136t3().f20694e.mo53009a(C13397b.f21459c, (String) null));
    }

    /* renamed from: h2 */
    private void m29119h2() {
        PLPPushNotificationManager.getInstance(mo45820l2()).registerDevice(String.valueOf(this.f20682i));
        m29093G2().mo46543h2();
        m29094H2();
    }

    /* renamed from: j3 */
    private void m29120j3(ProxyBundleOutput proxyBundleOutput) {
        if (proxyBundleOutput.getStatus() != ProxyBundleOutput.ProxyOutputStatus.OK) {
            m29142w3();
            return;
        }
        BaseMerchant baseMerchant = (BaseMerchant) proxyBundleOutput.getResponseObject(PLPMethodReturns.PLP_MERCHANT_DETAIL);
        if (baseMerchant == null) {
            m29142w3();
            return;
        }
        this.f20681h.add(baseMerchant);
        if (this.f20681h.size() == this.f20680g.size()) {
            m29145y3();
        }
    }

    /* renamed from: l3 */
    private void m29121l3(ProxyBundleOutput proxyBundleOutput) {
        if (proxyBundleOutput.getStatus() == ProxyBundleOutput.ProxyOutputStatus.ERROR) {
            JSONArray optJSONArray = proxyBundleOutput.getErrorData().optJSONArray("ids");
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                m29103S1(new C12921t(this), new C12922u(this));
                return;
            }
            ArrayList arrayList = new ArrayList(optJSONArray.length());
            for (int i = 0; i < optJSONArray.length(); i++) {
                int optInt = optJSONArray.optInt(i);
                for (BaseMerchant next : this.f20681h) {
                    if (next.getMerchantId() == optInt) {
                        arrayList.add(next);
                    }
                }
            }
            m29137u0(arrayList);
        }
        this.f20686m = true;
        m29122m3();
    }

    /* renamed from: m3 */
    private void m29122m3() {
        m29093G2().mo46540d1();
        m29095K2();
    }

    /* renamed from: n3 */
    private void m29124n3(ProxyBundleOutput proxyBundleOutput) {
        if (proxyBundleOutput.getStatus() != ProxyBundleOutput.ProxyOutputStatus.OK) {
            m29127p1(new C12924w(this), C13396a.m30473a(proxyBundleOutput, m29136t3().f20694e, m29136t3().f20694e.mo53009a(C13397b.f21459c, (String) null)));
            return;
        }
        List<PinnedObject> merchantsReminders = PLPPinnedObjectsManager.getInstance(mo45820l2()).getMerchantsReminders();
        if (!m29136t3().f20698i || !merchantsReminders.isEmpty()) {
            this.f20686m = true;
            m29122m3();
            return;
        }
        m29093G2().mo46534A0();
    }

    /* renamed from: o3 */
    private void m29126o3(ProxyBundleOutput proxyBundleOutput) {
        if (proxyBundleOutput.getStatus() != ProxyBundleOutput.ProxyOutputStatus.OK) {
            m29127p1(new C12915n(this), C13396a.m30473a(proxyBundleOutput, m29136t3().f20694e, m29136t3().f20694e.mo53009a(C13397b.f21459c, (String) null)));
            return;
        }
        Boolean bool = (Boolean) proxyBundleOutput.getResponseObject(PLPMethodReturns.PLP_PUSH_NOTIFICATION_EARNING);
        Boolean bool2 = (Boolean) proxyBundleOutput.getResponseObject(PLPMethodReturns.PLP_PUSH_NOTIFICATION_CASHBACK_INCREASE);
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        if (bool2 == null) {
            bool2 = Boolean.FALSE;
        }
        if (!m29136t3().f20698i || bool.booleanValue() || bool2.booleanValue()) {
            PLPPushNotificationManager.getInstance(mo45820l2()).setAcceptedPushNotifications(true);
            this.f20687n = true;
            m29119h2();
            return;
        }
        m29093G2().mo46542g0();
    }

    /* renamed from: p1 */
    private void m29127p1(@NonNull IListener<Void> iListener, @NonNull String str) {
        this.f20690q.mo47874i(0);
        m29093G2().mo46544p1(iListener, str);
    }

    /* renamed from: p3 */
    private void m29129p3(ProxyBundleOutput proxyBundleOutput) {
        if (proxyBundleOutput.getStatus() != ProxyBundleOutput.ProxyOutputStatus.OK) {
            m29103S1(new C12912k(this), (IListener<Void>) null);
            return;
        }
        this.f20687n = true;
        m29119h2();
    }

    /* renamed from: q3 */
    private void m29131q3(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
        if (proxyBundleInput.hasParamValue(PLPMethodParameters.PLP_PUSH_NOTIFICATION_EARNING) || proxyBundleInput.hasParamValue(PLPMethodParameters.PLP_PUSH_NOTIFICATION_CASHBACK_INCREASE)) {
            m29129p3(proxyBundleOutput);
        } else {
            m29126o3(proxyBundleOutput);
        }
    }

    /* renamed from: s3 */
    private void m29134s3(ProxyBundleOutput proxyBundleOutput) {
        ProxyBundleOutput.ProxyOutputStatus status = proxyBundleOutput.getStatus();
        C12910i iVar = new C12910i(this);
        if (status != ProxyBundleOutput.ProxyOutputStatus.OK) {
            m29127p1(iVar, C13396a.m30473a(proxyBundleOutput, m29136t3().f20694e, m29136t3().f20694e.mo53009a(C13397b.f21459c, (String) null)));
            return;
        }
        PLPUser pLPUser = (PLPUser) proxyBundleOutput.getResponseObject(PLPMethodReturns.PLP_USER_DETAIL);
        if (pLPUser == null) {
            m29127p1(iVar, m29136t3().f20694e.mo53009a(C13397b.f21459c, (String) null));
            return;
        }
        this.f20682i = pLPUser.getUserId();
        if (!TextUtils.isEmpty(pLPUser.getFirstName())) {
            this.f20684k = pLPUser.getFirstName();
        }
        if (!TextUtils.isEmpty(pLPUser.getLastName())) {
            if (!TextUtils.isEmpty(this.f20684k)) {
                this.f20684k += " ";
            }
            this.f20684k += pLPUser.getLastName();
        }
        if (TextUtils.isEmpty(this.f20684k) && !TextUtils.isEmpty(pLPUser.getLogin())) {
            this.f20684k = pLPUser.getLogin();
        }
        if (!TextUtils.isEmpty(pLPUser.getEmail()) && TextUtils.isEmpty(this.f20684k)) {
            this.f20684k = pLPUser.getEmail();
        }
        if (pLPUser.getEarningAmount() != null) {
            this.f20683j = pLPUser.getEarningAmount().getTotal();
        }
        this.f20685l = true;
        m29093G2().mo46537P0(this.f20683j, this.f20684k, m29136t3().f20693d, this.f20679f, this.f20692s);
        if (m29136t3().f20693d) {
            mo50831J2();
        } else if (this.f20679f) {
            m29095K2();
        } else {
            m29094H2();
        }
    }

    @NonNull
    /* renamed from: t3 */
    private C12926a m29136t3() {
        return (C12926a) this.f16656c;
    }

    /* renamed from: u0 */
    private void m29137u0(@NonNull List<BaseMerchant> list) {
        this.f20690q.mo47874i(0);
        m29093G2().mo46545u0(list);
    }

    /* renamed from: u3 */
    private void m29139u3(IListener<Void> iListener, int i) {
        new AndroidOsHandler().mo47873h(new C12911j(iListener), (long) i);
    }

    /* renamed from: w3 */
    private void m29142w3() {
        this.f20677d.cancelAndRemoveAllActionsWithMethod(ProxyMethodsPLPMerchant.GET_DETAILS);
        this.f20677d.cancelAndRemoveAllActionsWithMethod(ProxyMethodsPLPPinnedObject.PLP_PINNED_OBJECTS_ADD);
        m29127p1(new C12913l(this), m29136t3().f20694e.mo53009a(C13397b.f21459c, (String) null));
    }

    /* renamed from: y3 */
    private void m29145y3() {
        PLPPinnedObjectsManager.getInstance(mo45820l2()).addMerchantReminders(this.f20681h, this, mo45821m2());
    }

    /* renamed from: F2 */
    public void mo50829F2() {
        C13618g.f21930b.mo53278b("push-agreement", "accept");
        m29093G2().mo46541f0();
        PLPPushNotificationManager.getInstance(mo45820l2()).setAcceptedPushNotifications(true);
        ProxyActionsPool proxyActionsPool = this.f20677d;
        IProxyMethodType iProxyMethodType = ProxyMethodsPLPPushNotification.CONFIGURE;
        proxyActionsPool.cancelAndRemoveAllActionsWithMethod(iProxyMethodType);
        ProxyBundleInput proxyBundleInput = new ProxyBundleInput(mo45820l2(), iProxyMethodType, ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_ONLY, ProxyBundleInput.ProxyNetworkOption.NO_CACHE, mo45821m2());
        RMNMethodParam rMNMethodParam = PLPMethodParameters.PLP_PUSH_NOTIFICATION_CASHBACK_INCREASE;
        Boolean bool = Boolean.TRUE;
        proxyBundleInput.addParamValue(rMNMethodParam, bool);
        proxyBundleInput.addParamValue(PLPMethodParameters.PLP_PUSH_NOTIFICATION_EARNING, bool);
        this.f20677d.executeProxyAction(this, proxyBundleInput);
    }

    /* renamed from: I2 */
    public int mo50830I2() {
        return this.f20691r;
    }

    /* renamed from: J2 */
    public void mo50831J2() {
        this.f20691r = 1;
        PLPPinnedObjectsManager.getInstance(mo45820l2()).retrievePinnedObjects(this, ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_ONLY, mo45821m2());
        m29136t3().f20695f.mo53248h(false);
        m29139u3(new C12923v(this), 800);
    }

    /* renamed from: f3 */
    public void mo40744J0(@Nullable ProxyBundleWrapper proxyBundleWrapper) {
        if (proxyBundleWrapper != null) {
            ProxyBundleInput proxyBundleInput = proxyBundleWrapper.input;
            if (proxyBundleInput.getProxyMethod() == ProxyMethodsPLPPinnedObject.PLP_PINNED_OBJECT_GET_LIST) {
                m29124n3(proxyBundleWrapper.output);
            } else if (proxyBundleInput.getProxyMethod() == ProxyMethodsPLPPinnedObject.PLP_PINNED_OBJECTS_ADD) {
                m29121l3(proxyBundleWrapper.output);
            }
        }
    }

    /* renamed from: h3 */
    public void mo50833h3() {
        long h = C13636q.m31181b(mo45820l2()).mo53297h("last_long_loading_date", -1);
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date());
        boolean z = false;
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        if (instance.getTimeInMillis() <= h && !m29136t3().f20698i) {
            z = true;
        }
        this.f20692s = z;
        C13636q.m31181b(mo45820l2()).mo53302m("last_long_loading_date", instance.getTimeInMillis());
        this.f20690q = new AndroidOsHandler((C12822d) new C12907f(this));
        m29136t3().f20696g.mo53229f(new C12916o(this));
        int i = this.f20691r;
        if (i == 0) {
            m29097M2();
        } else if (i == 1) {
            mo50831J2();
        } else if (i == 2) {
            m29095K2();
        } else if (i != 3) {
            m29097M2();
            m29093G2().mo46533A("Loading state not recognized : " + this.f20691r);
        } else {
            m29094H2();
        }
    }

    /* renamed from: i3 */
    public void mo50834i3() {
        this.f20677d.cancelAndRemoveAllActions();
    }

    /* renamed from: k3 */
    public void mo50835k3() {
        this.f20690q.mo47874i(0);
    }

    public void onProxyActionExecuted(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
        if (!ProxyBundleOutput.ProxyOutputStatus.REQUEST_CANCELLED.equals(proxyBundleOutput.getStatus())) {
            IProxyMethodType proxyMethod = proxyBundleInput.getProxyMethod();
            if (proxyMethod == ProxyMethodsPLPUser.PLP_USER_GET_DETAILS) {
                m29134s3(proxyBundleOutput);
            } else if (proxyMethod == ProxyMethodsPLPMerchant.GET_DETAILS) {
                m29120j3(proxyBundleOutput);
            } else if (proxyMethod == ProxyMethodsPLPPushNotification.CONFIGURE) {
                m29131q3(proxyBundleInput, proxyBundleOutput);
            }
        }
    }

    /* renamed from: r3 */
    public void mo50836r3() {
        m29136t3().f20696g.mo53248h(false);
        C13618g.f21930b.mo53280e(new C13615d("welcome-pot", C13617f.WELCOME_POT));
        this.f20690q.mo47875j(0, 10000);
    }

    /* renamed from: v3 */
    public void mo50837v3() {
        C13618g.f21930b.mo53278b("push-agreement", "later");
        PLPPushNotificationManager.getInstance(mo45820l2()).setAcceptedPushNotifications(false);
        m29119h2();
    }

    /* renamed from: x3 */
    public void mo50838x3(List<Integer> list) {
        m29093G2().mo46537P0(this.f20683j, this.f20684k, m29136t3().f20693d, this.f20679f, this.f20692s);
        m29093G2().mo46536I1();
        this.f20680g = new ArrayList(list);
        for (Integer addParamValue : list) {
            ProxyBundleInput proxyBundleInput = new ProxyBundleInput(mo45820l2(), ProxyMethodsPLPMerchant.GET_DETAILS, ProxyBundleInput.ProxySourcesOption.GET_FROM_CACHE_THEN_NETWORK, ProxyBundleInput.ProxyNetworkOption.ADD_IN_CACHE, mo45821m2());
            proxyBundleInput.addParamValue(PLPMethodParameters.ID_PLP_MERCHANT_REQUIRED, addParamValue);
            this.f20677d.executeProxyAction(this, proxyBundleInput);
        }
    }
}
