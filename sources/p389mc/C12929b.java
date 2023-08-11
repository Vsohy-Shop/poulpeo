package p389mc;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.C12775o;
import p445vc.C13618g;
import p446vd.C13633n;

@StabilityInferred(parameters = 0)
/* renamed from: mc.b */
/* compiled from: DeviceSecurityStatusChecker.kt */
public final class C12929b {

    /* renamed from: a */
    public static final C12929b f20701a = new C12929b();

    private C12929b() {
    }

    /* renamed from: a */
    private final C12930c m29178a(Context context) {
        try {
            if (C12928a.m29176a(context)) {
                return C12930c.EMULATOR;
            }
            if (C12928a.m29177b(context)) {
                return C12930c.ROOTED;
            }
            return C12930c.OK;
        } catch (Throwable th) {
            C13633n.m31164t(this, "An error occurred during security detection", th);
            return C12930c.UNDEFINED;
        }
    }

    /* renamed from: b */
    public final void mo50839b(Context context) {
        C12775o.m28639i(context, "context");
        C12930c a = m29178a(context);
        FirebaseAnalytics.getInstance(context).mo39758d("deviceSecurityStatus", a.mo50840b());
        C13618g.f21930b.mo53279c("device-security", "detect", a.mo50840b());
    }
}
