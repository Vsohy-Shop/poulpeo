package com.google.android.gms.internal.gtm;

import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: com.google.android.gms.internal.gtm.s3 */
final class C5534s3 implements DialogInterface.OnClickListener {

    /* renamed from: b */
    private final /* synthetic */ C5519r3 f6306b;

    C5534s3(C5519r3 r3Var) {
        this.f6306b = r3Var;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        String str2;
        String packageName = this.f6306b.f6274a.getPackageName();
        Intent launchIntentForPackage = this.f6306b.f6274a.getPackageManager().getLaunchIntentForPackage(packageName);
        if (launchIntentForPackage != null) {
            String valueOf = String.valueOf(packageName);
            if (valueOf.length() != 0) {
                str2 = "Invoke the launch activity for package name: ".concat(valueOf);
            } else {
                str2 = new String("Invoke the launch activity for package name: ");
            }
            C5426l3.m8136f(str2);
            this.f6306b.f6274a.startActivity(launchIntentForPackage);
            return;
        }
        String valueOf2 = String.valueOf(packageName);
        if (valueOf2.length() != 0) {
            str = "No launch activity found for package name: ".concat(valueOf2);
        } else {
            str = new String("No launch activity found for package name: ");
        }
        C5426l3.m8134d(str);
    }
}
