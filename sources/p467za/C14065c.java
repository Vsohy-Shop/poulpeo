package p467za;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.proxy.IProxyListener;
import com.rmn.api.p322v2.main.proxy.IProxyMethodType;
import com.rmn.api.p322v2.main.proxy.ProxyActionsPool;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.api.p322v2.poulpeo.notifications.PLPPushNotificationManager;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.iosadapters.android.p323os.AndroidOsHandler;
import com.rmn.iosadapters.android.p323os.AndroidOsMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p305ad.C10865d;
import p382lc.C12822d;
import p428sd.C13396a;
import p428sd.C13397b;
import p428sd.C13399d;
import p440ud.C13568n;
import p440ud.C13573q;
import p440ud.C13574r;
import p445vc.C13618g;

/* renamed from: za.c */
/* compiled from: BaseNotificationAdminController */
public abstract class C14065c extends C10865d implements IProxyListener, C13568n.C13570b {
    @NonNull

    /* renamed from: d */
    private final ProxyActionsPool f22980d = new ProxyActionsPool();

    /* renamed from: e */
    private boolean f22981e = true;

    /* renamed from: f */
    private boolean f22982f;
    @Nullable

    /* renamed from: g */
    private AndroidOsHandler f22983g;

    /* renamed from: za.c$a */
    /* compiled from: BaseNotificationAdminController */
    class C14066a implements C12822d {
        C14066a() {
        }

        /* renamed from: a */
        public boolean mo49078a(AndroidOsMessage androidOsMessage) {
            if (androidOsMessage.mo47876a() == 0) {
                C14065c.this.m32617B2().f22986e.mo53230g(C13573q.VISIBLE);
                return false;
            } else if (androidOsMessage.mo47876a() != 1) {
                return false;
            } else {
                C14065c.this.m32623r2().mo46429i();
                return false;
            }
        }
    }

    /* renamed from: za.c$b */
    /* compiled from: BaseNotificationAdminController */
    public static class C14067b extends C10865d.C10866a {
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: d */
        public final List<C14076k> f22985d;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: e */
        public final C13574r f22986e;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: f */
        public final C13574r f22987f;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: g */
        public final C13399d f22988g;

        public C14067b(@NonNull ContextContainer contextContainer, @NonNull LogoutListener logoutListener, @NonNull List<C14076k> list, @NonNull C13574r rVar, @NonNull C13574r rVar2, @NonNull C13399d dVar) {
            super(contextContainer, logoutListener);
            this.f22985d = new ArrayList(list);
            this.f22986e = rVar;
            this.f22987f = rVar2;
            this.f22988g = dVar;
        }
    }

    C14065c(@NonNull C14075j jVar, @NonNull C14067b bVar) {
        super(jVar, bVar);
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: B2 */
    public C14067b m32617B2() {
        return (C14067b) this.f16656c;
    }

    /* renamed from: F2 */
    private void m32618F2(boolean z) {
        if (!this.f22981e) {
            z = false;
        }
        for (C14076k kVar : m32617B2().f22985d) {
            kVar.f22996b.mo53247e(z);
        }
    }

    /* renamed from: p2 */
    private void m32621p2() {
        boolean z;
        Iterator it = m32617B2().f22985d.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            C14076k kVar = (C14076k) it.next();
            if (kVar.f22995a.mo53245c() && kVar.f22996b.mo53224k()) {
                z = true;
                break;
            }
        }
        if (z) {
            PLPPushNotificationManager instance = PLPPushNotificationManager.getInstance(mo45820l2());
            if (!instance.hasAcceptedPushNotifications()) {
                instance.setAcceptedPushNotifications(true);
                instance.retrieveUserThenRegisterDevice();
            }
        }
    }

    /* renamed from: q2 */
    private void m32622q2(int i) {
        AndroidOsHandler androidOsHandler = this.f22983g;
        if (androidOsHandler != null) {
            androidOsHandler.mo47874i(i);
            this.f22983g = null;
        }
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: r2 */
    public C14075j m32623r2() {
        return (C14075j) this.f16655b;
    }

    /* renamed from: s2 */
    private void m32624s2(int i) {
        AndroidOsHandler androidOsHandler = this.f22983g;
        if (androidOsHandler != null) {
            androidOsHandler.mo47874i(0);
            this.f22983g.mo47874i(1);
        }
        AndroidOsHandler androidOsHandler2 = new AndroidOsHandler((C12822d) new C14066a());
        this.f22983g = androidOsHandler2;
        androidOsHandler2.mo47875j(i, 300);
    }

    /* renamed from: t2 */
    private ProxyBundleInput m32625t2() {
        return new ProxyBundleInput(mo45820l2(), mo53828u2(), ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_ONLY, ProxyBundleInput.ProxyNetworkOption.NO_CACHE, mo45821m2());
    }

    /* renamed from: v2 */
    private void m32626v2(ProxyBundleOutput proxyBundleOutput) {
        boolean z;
        m32622q2(0);
        m32617B2().f22986e.mo53230g(C13573q.GONE);
        if (proxyBundleOutput.getStatus() != ProxyBundleOutput.ProxyOutputStatus.OK) {
            m32623r2().mo46428h0(C13396a.m30473a(proxyBundleOutput, m32617B2().f22988g, m32617B2().f22988g.mo53009a(C13397b.f21459c, (String) null)));
            return;
        }
        m32618F2(true);
        for (C14076k kVar : m32617B2().f22985d) {
            Boolean bool = (Boolean) proxyBundleOutput.getResponseObject(kVar.f22998d);
            if (bool == null) {
                kVar.f22995a.mo53230g(C13573q.GONE);
            } else {
                kVar.f22996b.mo53226m((C13568n.C13570b) null);
                C13568n nVar = kVar.f22996b;
                if (!this.f22981e || !bool.booleanValue()) {
                    z = false;
                } else {
                    z = true;
                }
                nVar.mo53225l(z);
                kVar.f22996b.mo53226m(this);
            }
        }
        m32617B2().f22987f.mo53230g(C13573q.VISIBLE);
    }

    /* renamed from: w2 */
    private void m32627w2(ProxyBundleOutput proxyBundleOutput) {
        m32622q2(1);
        m32623r2().mo46432r();
        if (proxyBundleOutput.getStatus() != ProxyBundleOutput.ProxyOutputStatus.OK) {
            m32623r2().mo46430i0();
        } else {
            m32623r2().mo46426Y();
        }
    }

    /* renamed from: A2 */
    public void mo53824A2() {
        mo53825C2();
    }

    /* renamed from: C2 */
    public void mo53825C2() {
        m32624s2(0);
        m32618F2(false);
        this.f22980d.cancelAndRemoveAllActions();
        this.f22980d.executeProxyAction(this, m32625t2());
    }

    /* renamed from: D2 */
    public void mo53826D2() {
        if (!this.f22982f) {
            m32623r2().mo46426Y();
            return;
        }
        m32624s2(1);
        m32618F2(false);
        m32621p2();
        this.f22980d.cancelAndRemoveAllActions();
        ProxyBundleInput t2 = m32625t2();
        for (C14076k kVar : m32617B2().f22985d) {
            if (kVar.f22995a.mo53245c()) {
                t2.addParamValue(kVar.f22997c, Boolean.valueOf(kVar.f22996b.mo53224k()));
            }
        }
        this.f22980d.executeProxyAction(this, t2);
    }

    /* renamed from: E2 */
    public void mo53827E2(boolean z) {
        this.f22981e = z;
    }

    public void onProxyActionExecuted(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
        if (proxyBundleOutput.getStatus() != ProxyBundleOutput.ProxyOutputStatus.REQUEST_CANCELLED) {
            if (proxyBundleInput.hasParams()) {
                m32627w2(proxyBundleOutput);
            } else {
                m32626v2(proxyBundleOutput);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u2 */
    public abstract IProxyMethodType mo53828u2();

    /* renamed from: v */
    public void mo53228v(C13568n nVar, boolean z) {
        String str;
        String str2;
        this.f22982f = true;
        m32623r2().mo46427c1();
        if (z) {
            Iterator it = m32617B2().f22985d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = "";
                    str2 = str;
                    break;
                }
                C14076k kVar = (C14076k) it.next();
                if (kVar.f22996b == nVar) {
                    str = kVar.f22999e;
                    str2 = kVar.f23000f;
                    break;
                }
            }
            C13618g.f21930b.mo53279c(str, "activate", str2);
        }
    }

    /* renamed from: x2 */
    public void mo53829x2() {
        m32617B2().f22987f.mo53230g(C13573q.GONE);
    }

    /* renamed from: y2 */
    public void mo53830y2() {
        this.f22980d.cancelAndRemoveAllActions();
    }

    /* renamed from: z2 */
    public void mo53831z2() {
    }
}
