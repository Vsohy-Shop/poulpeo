package p462yb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.api.p322v2.cloud.general.CloudApiType;
import com.rmn.api.p322v2.cloud.general.CloudUtil;
import com.rmn.api.p322v2.cloud.notifications.BasePushNotificationManager;
import com.rmn.api.p322v2.main.proxy.ProxyActionsPool;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.utils.AndroidUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p184o8.C9013a;
import p194p8.C9075a;
import p333ec.C11883a;
import p336ef.C11921v;
import p360id.C12136d;
import p404of.C13074a;
import p409pc.C13200d;
import p415qc.C13240e;
import p415qc.C13242g;
import p427sc.C13391g;
import p427sc.C13392h;
import p427sc.C13393i;
import p439uc.C13545b;
import p445vc.C13618g;
import p446vd.C13621b;
import p446vd.C13623d;
import p446vd.C13633n;
import p446vd.C13636q;
import p451wc.C13692b;
import p451wc.C13693c;

@StabilityInferred(parameters = 0)
/* renamed from: yb.e */
/* compiled from: MainApplication.kt */
public abstract class C13861e extends C13858b {

    /* renamed from: e */
    public static final C13862a f22396e = new C13862a((DefaultConstructorMarker) null);

    /* renamed from: f */
    public static final int f22397f = 8;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static C13861e f22398g;

    /* renamed from: b */
    private final Lazy f22399b = C11901h.m25690b(new C13863b(this));

    /* renamed from: c */
    protected ProxyActionsPool f22400c;

    /* renamed from: d */
    private List<C13074a<C11921v>> f22401d = new ArrayList();

    /* renamed from: yb.e$a */
    /* compiled from: MainApplication.kt */
    public static final class C13862a {
        private C13862a() {
        }

        public /* synthetic */ C13862a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C13861e mo53556a() {
            C13861e b = C13861e.f22398g;
            if (b != null) {
                return b;
            }
            C12775o.m28656z("INSTANCE");
            return null;
        }

        /* renamed from: b */
        public final void mo53557b(ContextContainer contextContainer) {
            C12775o.m28639i(contextContainer, "context");
            C13636q b = C13636q.m31181b(contextContainer);
            String d = C13621b.m31090d(contextContainer);
            if (!b.mo53294e("tracking_install_tracked", false)) {
                new C13240e(contextContainer).mo52889g(new C13391g());
                b.mo53299j("tracking_install_tracked", true);
                if (d != null && !C12775o.m28634d(d, "")) {
                    b.mo53303n("tracking_app_version", d);
                }
            } else {
                String i = b.mo53298i("tracking_app_version", (String) null);
                if (i != null && !C12775o.m28634d(i, "") && !C12775o.m28634d(i, d)) {
                    new C13240e(contextContainer).mo52889g(new C13393i());
                    b.mo53303n("tracking_app_version", d);
                }
            }
            new C13240e(contextContainer).mo52889g(new C13392h());
        }
    }

    /* renamed from: yb.e$b */
    /* compiled from: MainApplication.kt */
    static final class C13863b extends C12777p implements C13074a<ContextContainer> {

        /* renamed from: g */
        final /* synthetic */ C13861e f22402g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13863b(C13861e eVar) {
            super(0);
            this.f22402g = eVar;
        }

        /* renamed from: b */
        public final ContextContainer invoke() {
            return new ContextContainer(this.f22402g);
        }
    }

    /* renamed from: yb.e$c */
    /* compiled from: MainApplication.kt */
    static final class C13864c extends C12777p implements C13074a<C11921v> {

        /* renamed from: g */
        final /* synthetic */ C13861e f22403g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13864c(C13861e eVar) {
            super(0);
            this.f22403g = eVar;
        }

        public final void invoke() {
            C13861e.f22396e.mo53557b(this.f22403g.mo53549c());
        }
    }

    /* renamed from: k */
    private final void m31884k() {
        AndroidUtil.retrieveAdvertisingIdAsync(this, new C13860d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final void m31885l(C13861e eVar, String str) {
        C12775o.m28639i(eVar, "this$0");
        if (!TextUtils.isEmpty(str)) {
            C13240e.m30073a(new ContextContainer(eVar), C13242g.f21110v, str);
            C13693c.m31357c(C13692b.APPLICATION_ADVERTISER_ID, str);
        }
        eVar.mo53551h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final ContextContainer mo53549c() {
        return (ContextContainer) this.f22399b.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final ProxyActionsPool mo53550d() {
        ProxyActionsPool proxyActionsPool = this.f22400c;
        if (proxyActionsPool != null) {
            return proxyActionsPool;
        }
        C12775o.m28656z("globalProxyActionPool");
        return null;
    }

    /* renamed from: e */
    public abstract BasePushNotificationManager mo40745e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo40746f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo40747g();

    /* renamed from: h */
    public final void mo53551h() {
        List<C13074a<C11921v>> list = this.f22401d;
        if (list != null) {
            for (C13074a invoke : list) {
                invoke.invoke();
            }
            this.f22401d = null;
        }
    }

    /* renamed from: i */
    public final boolean mo53552i(Context context) {
        C12775o.m28639i(context, "context");
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.poulpeo")));
            return true;
        } catch (Exception unused) {
            C12136d.m26467i(this, R.string.google_play_app_unavailable);
            return false;
        }
    }

    /* renamed from: j */
    public abstract void mo40748j(String str);

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo53553m(ProxyActionsPool proxyActionsPool) {
        C12775o.m28639i(proxyActionsPool, "<set-?>");
        this.f22400c = proxyActionsPool;
    }

    /* renamed from: n */
    public abstract void mo40749n();

    /* renamed from: o */
    public final void mo53554o(C13074a<C11921v> aVar) {
        C12775o.m28639i(aVar, "listener");
        List<C13074a<C11921v>> list = this.f22401d;
        if (list != null) {
            list.add(aVar);
        } else {
            aVar.invoke();
        }
    }

    public void onCreate() {
        super.onCreate();
        f22398g = this;
        mo53553m(new ProxyActionsPool());
        CloudApiType cloudApiType = CloudApiType.CLOUD;
        if (!cloudApiType.hasClientSecret()) {
            cloudApiType.setClientKeys(CloudUtil.CLOUD_ALIAS_POULPEO_ANDROID_CLIENT_ID, "a617bffe5b3f2dcef649f7cc1949a9b5ae6e5d19");
        }
        C13633n.f21948a = false;
        C13633n.f21949b = true;
        C13618g.f21930b.mo53277a(this);
        C13200d dVar = C13200d.f21007a;
        Long l = C13859c.f22389a;
        C12775o.m28638h(l, "ADJUST_SECRET_ID");
        long longValue = l.longValue();
        Long l2 = C13859c.f22390b;
        C12775o.m28638h(l2, "ADJUST_SECRET_INFO_1");
        long longValue2 = l2.longValue();
        Long l3 = C13859c.f22391c;
        C12775o.m28638h(l3, "ADJUST_SECRET_INFO_2");
        long longValue3 = l3.longValue();
        Long l4 = C13859c.f22392d;
        C12775o.m28638h(l4, "ADJUST_SECRET_INFO_3");
        long longValue4 = l4.longValue();
        Long l5 = C13859c.f22393e;
        C12775o.m28638h(l5, "ADJUST_SECRET_INFO_4");
        dVar.mo52830f(this, "rt9h5jj7tbeo", longValue, longValue2, longValue3, longValue4, l5.longValue());
        C13693c.m31357c(C13692b.CLIENT_ID, cloudApiType.getClientId());
        C13240e.m30073a(mo53549c(), C13242g.f21095g, cloudApiType.getClientId());
        C13240e.m30073a(mo53549c(), C13242g.f21105q, C13623d.m31108h(mo53549c()));
        C13545b.m30930d(mo53549c());
        String d = C13240e.m30075d(mo53549c(), "eu.fr.plp");
        if (d != null && !C12775o.m28634d(d, "")) {
            C13240e.m30073a(mo53549c(), C13242g.f21108t, d);
        }
        m31884k();
        C9075a.m18433a(C9013a.f13126a).setAutoInitEnabled(true);
        C11883a.f18564a.mo49086a(this);
        mo40746f();
        mo40747g();
        mo53554o(new C13864c(this));
    }

    public void onTerminate() {
        super.onTerminate();
        mo53550d().cancelAndRemoveAllActions();
    }
}
