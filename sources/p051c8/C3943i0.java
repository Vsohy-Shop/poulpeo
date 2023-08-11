package p051c8;

import android.os.Bundle;
import p192p6.C9063a;
import p341fe.C11950g;

/* renamed from: c8.i0 */
/* compiled from: FiamAnalyticsConnectorListener */
final class C3943i0 implements C9063a.C9065b {

    /* renamed from: a */
    private C11950g<String> f3052a;

    C3943i0(C11950g<String> gVar) {
        this.f3052a = gVar;
    }

    /* renamed from: a */
    public void mo29975a(int i, Bundle bundle) {
        if (i == 2) {
            this.f3052a.mo49191d(bundle.getString("events"));
        }
    }
}
