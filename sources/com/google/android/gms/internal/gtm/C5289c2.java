package com.google.android.gms.internal.gtm;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.gtm.c2 */
final class C5289c2 implements C5319e2 {

    /* renamed from: a */
    private final /* synthetic */ C5274b2 f5894a;

    C5289c2(C5274b2 b2Var) {
        this.f5894a = b2Var;
    }

    /* renamed from: a */
    public final AdvertisingIdClient.Info mo33154a() {
        try {
            return AdvertisingIdClient.getAdvertisingIdInfo(this.f5894a.f5858h);
        } catch (IllegalStateException e) {
            C5426l3.m8137g("IllegalStateException getting Advertising Id Info", e);
            return null;
        } catch (GooglePlayServicesRepairableException e2) {
            C5426l3.m8137g("GooglePlayServicesRepairableException getting Advertising Id Info", e2);
            return null;
        } catch (IOException e3) {
            C5426l3.m8137g("IOException getting Ad Id Info", e3);
            return null;
        } catch (GooglePlayServicesNotAvailableException e4) {
            boolean unused = this.f5894a.f5853c = false;
            C5426l3.m8137g("GooglePlayServicesNotAvailableException getting Advertising Id Info", e4);
            return null;
        } catch (Exception e5) {
            C5426l3.m8137g("Unknown exception. Could not get the Advertising Id Info.", e5);
            return null;
        }
    }
}
