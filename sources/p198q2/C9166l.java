package p198q2;

import androidx.annotation.RestrictTo;
import androidx.core.internal.view.SupportMenu;
import androidx.core.p004os.EnvironmentCompat;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.FacebookSdk;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p198q2.C9173o;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: q2.l */
/* compiled from: FeatureManager.kt */
public final class C9166l {

    /* renamed from: a */
    private static final Map<C9168b, String[]> f13402a = new HashMap();

    /* renamed from: b */
    public static final C9166l f13403b = new C9166l();

    /* renamed from: q2.l$a */
    /* compiled from: FeatureManager.kt */
    public interface C9167a {
        /* renamed from: a */
        void mo28381a(boolean z);
    }

    /* renamed from: q2.l$b */
    /* compiled from: FeatureManager.kt */
    public enum C9168b {
        Unknown(-1),
        Core(0),
        AppEvents(65536),
        CodelessEvents(65792),
        RestrictiveDataFiltering(66048),
        AAM(66304),
        PrivacyProtection(66560),
        SuggestedEvents(66561),
        IntelligentIntegrity(66562),
        ModelRequest(66563),
        EventDeactivation(66816),
        OnDeviceEventProcessing(67072),
        OnDevicePostInstallEventProcessing(67073),
        IapLogging(67328),
        IapLoggingLib2(67329),
        Instrument(131072),
        CrashReport(131328),
        CrashShield(131329),
        ThreadCheck(131330),
        ErrorReport(131584),
        AnrReport(131840),
        Monitoring(ProfileVerifier.CompilationStatus.f1069xf2722a21),
        Login(16777216),
        ChromeCustomTabsPrefetching(16842752),
        IgnoreAppSwitchToLoggedOut(16908288),
        BypassAppSwitch(16973824),
        Share(33554432),
        Places(50331648);
        

        /* renamed from: F */
        public static final C9169a f13409F = null;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final int f13434b;

        /* renamed from: q2.l$b$a */
        /* compiled from: FeatureManager.kt */
        public static final class C9169a {
            private C9169a() {
            }

            public /* synthetic */ C9169a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C9168b mo43447a(int i) {
                for (C9168b bVar : C9168b.values()) {
                    if (bVar.f13434b == i) {
                        return bVar;
                    }
                }
                return C9168b.Unknown;
            }
        }

        static {
            f13409F = new C9169a((DefaultConstructorMarker) null);
        }

        private C9168b(int i) {
            this.f13434b = i;
        }

        /* renamed from: b */
        public final C9168b mo43444b() {
            int i = this.f13434b;
            if ((i & 255) > 0) {
                return f13409F.mo43447a(i & InputDeviceCompat.SOURCE_ANY);
            }
            if ((65280 & i) > 0) {
                return f13409F.mo43447a(i & SupportMenu.CATEGORY_MASK);
            }
            if ((16711680 & i) > 0) {
                return f13409F.mo43447a(i & ViewCompat.MEASURED_STATE_MASK);
            }
            return f13409F.mo43447a(0);
        }

        /* renamed from: c */
        public final String mo43445c() {
            return "FBSDKFeature" + this;
        }

        public String toString() {
            switch (C9171m.f13437a[ordinal()]) {
                case 1:
                    return "CoreKit";
                case 2:
                    return "AppEvents";
                case 3:
                    return "CodelessEvents";
                case 4:
                    return "RestrictiveDataFiltering";
                case 5:
                    return "Instrument";
                case 6:
                    return "CrashReport";
                case 7:
                    return "CrashShield";
                case 8:
                    return "ThreadCheck";
                case 9:
                    return "ErrorReport";
                case 10:
                    return "AnrReport";
                case 11:
                    return "AAM";
                case 12:
                    return "PrivacyProtection";
                case 13:
                    return "SuggestedEvents";
                case 14:
                    return "IntelligentIntegrity";
                case 15:
                    return "ModelRequest";
                case 16:
                    return "EventDeactivation";
                case 17:
                    return "OnDeviceEventProcessing";
                case 18:
                    return "OnDevicePostInstallEventProcessing";
                case 19:
                    return "IAPLogging";
                case 20:
                    return "IAPLoggingLib2";
                case 21:
                    return "Monitoring";
                case 22:
                    return "LoginKit";
                case 23:
                    return "ChromeCustomTabsPrefetching";
                case 24:
                    return "IgnoreAppSwitchToLoggedOut";
                case 25:
                    return "BypassAppSwitch";
                case 26:
                    return "ShareKit";
                case 27:
                    return "PlacesKit";
                default:
                    return EnvironmentCompat.MEDIA_UNKNOWN;
            }
        }
    }

    /* renamed from: q2.l$c */
    /* compiled from: FeatureManager.kt */
    public static final class C9170c implements C9173o.C9174a {

        /* renamed from: a */
        final /* synthetic */ C9167a f13435a;

        /* renamed from: b */
        final /* synthetic */ C9168b f13436b;

        C9170c(C9167a aVar, C9168b bVar) {
            this.f13435a = aVar;
            this.f13436b = bVar;
        }

        /* renamed from: a */
        public void mo43448a() {
            this.f13435a.mo28381a(C9166l.m18760g(this.f13436b));
        }
    }

    private C9166l() {
    }

    /* renamed from: a */
    public static final void m18754a(C9168b bVar, C9167a aVar) {
        C12775o.m28639i(bVar, "feature");
        C12775o.m28639i(aVar, "callback");
        C9173o.m18774j(new C9170c(aVar, bVar));
    }

    /* renamed from: b */
    private final boolean m18755b(C9168b bVar) {
        switch (C9172n.f13438a[bVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                return false;
            default:
                return true;
        }
    }

    /* renamed from: c */
    public static final void m18756c(C9168b bVar) {
        C12775o.m28639i(bVar, "feature");
        FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString(bVar.mo43445c(), FacebookSdk.getSdkVersion()).apply();
    }

    /* renamed from: d */
    public static final C9168b m18757d(String str) {
        C12775o.m28639i(str, "className");
        f13403b.m18759f();
        for (Map.Entry next : f13402a.entrySet()) {
            C9168b bVar = (C9168b) next.getKey();
            String[] strArr = (String[]) next.getValue();
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (C13754v.m31525E(str, strArr[i], false, 2, (Object) null)) {
                        return bVar;
                    }
                    i++;
                }
            }
        }
        return C9168b.Unknown;
    }

    /* renamed from: e */
    private final boolean m18758e(C9168b bVar) {
        return C9173o.m18772f(bVar.mo43445c(), FacebookSdk.getApplicationId(), m18755b(bVar));
    }

    /* renamed from: f */
    private final synchronized void m18759f() {
        Map<C9168b, String[]> map = f13402a;
        if (map.isEmpty()) {
            map.put(C9168b.AAM, new String[]{"com.facebook.appevents.aam."});
            map.put(C9168b.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
            map.put(C9168b.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
            map.put(C9168b.AnrReport, new String[]{"com.facebook.internal.instrument.anrreport."});
            map.put(C9168b.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
            map.put(C9168b.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
            map.put(C9168b.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
            map.put(C9168b.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
            map.put(C9168b.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
            map.put(C9168b.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
            map.put(C9168b.IapLogging, new String[]{"com.facebook.appevents.iap."});
            map.put(C9168b.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
        }
    }

    /* renamed from: g */
    public static final boolean m18760g(C9168b bVar) {
        C12775o.m28639i(bVar, "feature");
        if (C9168b.Unknown == bVar) {
            return false;
        }
        if (C9168b.Core == bVar) {
            return true;
        }
        String string = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString(bVar.mo43445c(), (String) null);
        if (string != null && C12775o.m28634d(string, FacebookSdk.getSdkVersion())) {
            return false;
        }
        C9168b b = bVar.mo43444b();
        if (b == bVar) {
            return f13403b.m18758e(bVar);
        }
        if (!m18760g(b) || !f13403b.m18758e(bVar)) {
            return false;
        }
        return true;
    }
}
