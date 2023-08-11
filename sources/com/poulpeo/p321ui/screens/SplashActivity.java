package com.poulpeo.p321ui.screens;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.app_updater.AppUpdaterActivity;
import com.poulpeo.p321ui.screens.onboarding.OnboardingActivity;
import com.poulpeo.p321ui.screens.welcome.WelcomeActivity;
import com.rmn.api.p322v2.main.oauth.OAuthAccountManager;
import com.rmn.api.p322v2.poulpeo.general.PLPApiType;
import com.rmn.api.p322v2.poulpeo.notifications.PLPPushNotificationManager;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.utils.AndroidUtil;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p066d9.C7310b;
import p066d9.C7311c;
import p336ef.C11921v;
import p339fc.C11933b;
import p339fc.C11939d;
import p350ha.C12031a;
import p350ha.C12032b;
import p352hc.C12055b;
import p368jd.C12618d;
import p389mc.C12929b;
import p404of.C13074a;
import p409pc.C13200d;
import p445vc.C13618g;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.SplashActivity */
/* compiled from: SplashActivity.kt */
public final class SplashActivity extends C12618d {

    /* renamed from: p */
    public static final C11094a f17227p = new C11094a((DefaultConstructorMarker) null);

    /* renamed from: q */
    public static final int f17228q = 8;

    /* renamed from: m */
    private final Lazy f17229m = C11901h.m25690b(new C11095b(this));

    /* renamed from: n */
    private final Handler f17230n = new Handler();

    /* renamed from: o */
    public Map<Integer, View> f17231o = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.SplashActivity$a */
    /* compiled from: SplashActivity.kt */
    public static final class C11094a {
        private C11094a() {
        }

        public /* synthetic */ C11094a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent mo46181a(Context context) {
            C12775o.m28639i(context, "context");
            return new Intent(context, SplashActivity.class);
        }
    }

    /* renamed from: com.poulpeo.ui.screens.SplashActivity$b */
    /* compiled from: SplashActivity.kt */
    static final class C11095b extends C12777p implements C13074a<C11933b> {

        /* renamed from: g */
        final /* synthetic */ SplashActivity f17232g;

        /* renamed from: com.poulpeo.ui.screens.SplashActivity$b$a */
        /* compiled from: SplashActivity.kt */
        static final class C11096a extends C12777p implements Function1<Bundle, C11939d> {

            /* renamed from: g */
            public static final C11096a f17233g = new C11096a();

            C11096a() {
                super(1);
            }

            /* renamed from: a */
            public final C11939d invoke(Bundle bundle) {
                return new C7310b(bundle);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11095b(SplashActivity splashActivity) {
            super(0);
            this.f17232g = splashActivity;
        }

        /* renamed from: b */
        public final C11933b invoke() {
            SplashActivity splashActivity = this.f17232g;
            C7311c cVar = C7311c.f10128c;
            C12775o.m28638h(cVar, "instance");
            return new C11933b(splashActivity, cVar, C11096a.f17233g);
        }
    }

    /* renamed from: com.poulpeo.ui.screens.SplashActivity$c */
    /* compiled from: SplashActivity.kt */
    static final class C11097c extends C12777p implements C13074a<C11921v> {

        /* renamed from: g */
        final /* synthetic */ SplashActivity f17234g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11097c(SplashActivity splashActivity) {
            super(0);
            this.f17234g = splashActivity;
        }

        public final void invoke() {
            if (AndroidUtil.isNotificationEnabled(this.f17234g)) {
                PLPPushNotificationManager.getInstance(this.f17234g.mo47878o2()).retrieveUserThenRegisterDevice();
            }
        }
    }

    /* renamed from: com.poulpeo.ui.screens.SplashActivity$d */
    /* compiled from: SplashActivity.kt */
    static final class C11098d extends C12777p implements C13074a<C11921v> {

        /* renamed from: g */
        final /* synthetic */ SplashActivity f17235g;

        /* renamed from: com.poulpeo.ui.screens.SplashActivity$d$a */
        /* compiled from: SplashActivity.kt */
        static final class C11099a extends C12777p implements C13074a<C11921v> {

            /* renamed from: g */
            public static final C11099a f17236g = new C11099a();

            C11099a() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: com.poulpeo.ui.screens.SplashActivity$d$b */
        /* compiled from: SplashActivity.kt */
        static final class C11100b extends C12777p implements C13074a<C11921v> {

            /* renamed from: g */
            final /* synthetic */ SplashActivity f17237g;

            /* renamed from: com.poulpeo.ui.screens.SplashActivity$d$b$a */
            /* compiled from: SplashActivity.kt */
            static final class C11101a extends C12777p implements C13074a<C11921v> {

                /* renamed from: g */
                public static final C11101a f17238g = new C11101a();

                C11101a() {
                    super(0);
                }

                public final void invoke() {
                }
            }

            /* renamed from: com.poulpeo.ui.screens.SplashActivity$d$b$b */
            /* compiled from: SplashActivity.kt */
            static final class C11102b extends C12777p implements C13074a<C11921v> {

                /* renamed from: g */
                final /* synthetic */ SplashActivity f17239g;

                /* renamed from: com.poulpeo.ui.screens.SplashActivity$d$b$b$a */
                /* compiled from: SplashActivity.kt */
                static final class C11103a extends C12777p implements C13074a<C11921v> {

                    /* renamed from: g */
                    public static final C11103a f17240g = new C11103a();

                    C11103a() {
                        super(0);
                    }

                    public final void invoke() {
                    }
                }

                /* renamed from: com.poulpeo.ui.screens.SplashActivity$d$b$b$b */
                /* compiled from: SplashActivity.kt */
                static final class C11104b extends C12777p implements C13074a<C11921v> {

                    /* renamed from: g */
                    final /* synthetic */ SplashActivity f17241g;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C11104b(SplashActivity splashActivity) {
                        super(0);
                        this.f17241g = splashActivity;
                    }

                    public final void invoke() {
                        this.f17241g.m23921G2();
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C11102b(SplashActivity splashActivity) {
                    super(0);
                    this.f17239g = splashActivity;
                }

                public final void invoke() {
                    this.f17239g.m23917C2().mo49158f(C11103a.f17240g, new C11104b(this.f17239g));
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C11100b(SplashActivity splashActivity) {
                super(0);
                this.f17237g = splashActivity;
            }

            public final void invoke() {
                this.f17237g.m23917C2().mo49160h(C11101a.f17238g, new C11102b(this.f17237g));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11098d(SplashActivity splashActivity) {
            super(0);
            this.f17235g = splashActivity;
        }

        public final void invoke() {
            this.f17235g.m23917C2().mo49159g(C11099a.f17236g, new C11100b(this.f17235g));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public final C11933b m23917C2() {
        return (C11933b) this.f17229m.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: D2 */
    public static final void m23918D2(SplashActivity splashActivity, boolean z) {
        C12775o.m28639i(splashActivity, "this$0");
        splashActivity.startActivity(AppUpdaterActivity.f17245c.mo46190c(splashActivity, z));
        splashActivity.finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: E2 */
    public final void m23919E2() {
        Intent intent;
        mo47877n2();
        if (OAuthAccountManager.getInstance().isConnectedToAccount(PLPApiType.PLP)) {
            intent = WelcomeActivity.C11224a.m24875b(WelcomeActivity.f17749s, this, true, false, 4, (Object) null);
        } else {
            intent = OnboardingActivity.f17619s.mo46440c(this);
        }
        intent.setFlags(268468224);
        startActivity(intent);
    }

    /* renamed from: F2 */
    private final void m23920F2() {
        String str;
        String[] strArr = {"com.android.chrome", "com.sec.android.app.sbrowser", "com.opera.browser"};
        String str2 = "default=" + AndroidUtil.getDefaultBrowserPackage(this);
        for (int i = 0; i < 3; i++) {
            String str3 = strArr[i];
            if (AndroidUtil.isBrowserInstalledAndEnabled(this, str3)) {
                str = "installed";
            } else {
                str = "not-installed";
            }
            str2 = str2 + " | " + str3 + "=" + str;
        }
        C13618g.f21930b.mo53279c(NotificationCompat.CATEGORY_REMINDER, "browsers-detect", str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: G2 */
    public final void m23921G2() {
        if (m23917C2().mo49157d()) {
            m23919E2();
        } else {
            this.f17230n.postDelayed(new C12032b(this), 1000);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C12929b.f20701a.mo50839b(this);
        m23920F2();
        setContentView((int) R.layout.activity_splash);
        mo50358x2("SplashActivity", true);
        new C12055b(new ContextContainer(this), new C12031a(this)).mo49497e();
        m23917C2().mo49161j(new C11097c(this), new C11098d(this));
        C13200d.f21007a.mo52829e(this, getIntent());
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        C12775o.m28639i(intent, "intent");
        super.onNewIntent(intent);
        C13200d.f21007a.mo52829e(this, intent);
    }
}
