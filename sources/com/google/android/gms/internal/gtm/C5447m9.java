package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.m9 */
public final class C5447m9 implements C5491p5 {

    /* renamed from: a */
    private final Context f6128a;

    public C5447m9(Context context) {
        this.f6128a = (Context) C9713p.m20275j(context);
    }

    /* renamed from: a */
    public final C5528rc<?> mo33133a(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        String networkOperatorName;
        boolean z2 = true;
        if (rcVarArr != null) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        if (rcVarArr.length != 0) {
            z2 = false;
        }
        C9713p.m20266a(z2);
        TelephonyManager telephonyManager = (TelephonyManager) this.f6128a.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        C5618xc xcVar = C5618xc.f6732h;
        if (telephonyManager == null || (networkOperatorName = telephonyManager.getNetworkOperatorName()) == null) {
            return xcVar;
        }
        return new C5315dd(networkOperatorName);
    }
}
