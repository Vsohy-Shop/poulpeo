package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.adjust.sdk.Constants;
import com.google.android.gms.internal.measurement.C5963t0;
import p275x4.C10393b;

/* renamed from: com.google.android.gms.measurement.internal.a4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
final class C6085a4 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C5963t0 f7620b;

    /* renamed from: c */
    final /* synthetic */ ServiceConnection f7621c;

    /* renamed from: d */
    final /* synthetic */ C6097b4 f7622d;

    C6085a4(C6097b4 b4Var, C5963t0 t0Var, ServiceConnection serviceConnection) {
        this.f7622d = b4Var;
        this.f7620b = t0Var;
        this.f7621c = serviceConnection;
    }

    public final void run() {
        String str;
        C6097b4 b4Var = this.f7622d;
        C6108c4 c4Var = b4Var.f7643c;
        String a = b4Var.f7642b;
        C5963t0 t0Var = this.f7620b;
        ServiceConnection serviceConnection = this.f7621c;
        c4Var.f7668a.mo34919a().mo34778h();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", a);
        Bundle bundle2 = null;
        try {
            Bundle r = t0Var.mo34312r(bundle);
            if (r == null) {
                c4Var.f7668a.mo34920b().mo35075r().mo35037a("Install Referrer Service returned a null response");
            } else {
                bundle2 = r;
            }
        } catch (Exception e) {
            c4Var.f7668a.mo34920b().mo35075r().mo35038b("Exception occurred while retrieving the Install Referrer", e.getMessage());
        }
        c4Var.f7668a.mo34919a().mo34778h();
        C6251p4.m10990t();
        if (bundle2 != null) {
            long j = bundle2.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j == 0) {
                c4Var.f7668a.mo34920b().mo35080w().mo35037a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle2.getString(Constants.INSTALL_REFERRER);
                if (string == null || string.isEmpty()) {
                    c4Var.f7668a.mo34920b().mo35075r().mo35037a("No referrer defined in Install Referrer response");
                } else {
                    c4Var.f7668a.mo34920b().mo35079v().mo35038b("InstallReferrer API result", string);
                    C6234n9 N = c4Var.f7668a.mo35191N();
                    if (string.length() != 0) {
                        str = "?".concat(string);
                    } else {
                        str = new String("?");
                    }
                    Bundle t0 = N.mo35152t0(Uri.parse(str));
                    if (t0 == null) {
                        c4Var.f7668a.mo34920b().mo35075r().mo35037a("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = t0.getString(Constants.MEDIUM);
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = bundle2.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j2 == 0) {
                                c4Var.f7668a.mo34920b().mo35075r().mo35037a("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                t0.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == c4Var.f7668a.mo35184F().f8436f.mo35384a()) {
                            c4Var.f7668a.mo34920b().mo35079v().mo35037a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (c4Var.f7668a.mo35204o()) {
                            c4Var.f7668a.mo35184F().f8436f.mo35385b(j);
                            c4Var.f7668a.mo34920b().mo35079v().mo35038b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            t0.putString("_cis", "referrer API v2");
                            c4Var.f7668a.mo35186I().mo35256t("auto", "_cmp", t0, a);
                        }
                    }
                }
            }
        }
        C10393b.m21775b().mo45088c(c4Var.f7668a.mo34927f(), serviceConnection);
    }
}
