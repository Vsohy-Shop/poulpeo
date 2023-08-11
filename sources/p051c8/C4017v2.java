package p051c8;

import android.app.Application;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import p211r5.C9385a;

/* renamed from: c8.v2 */
/* compiled from: ProviderInstaller */
public class C4017v2 {

    /* renamed from: a */
    private final Application f3207a;

    C4017v2(Application application) {
        this.f3207a = application;
    }

    /* renamed from: a */
    public void mo30037a() {
        try {
            C9385a.m19410a(this.f3207a);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException e) {
            e.printStackTrace();
        }
    }
}
