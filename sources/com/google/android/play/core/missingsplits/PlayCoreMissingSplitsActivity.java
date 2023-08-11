package com.google.android.play.core.missingsplits;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import p037b6.C2900e;
import p037b6.C2926r;

public class PlayCoreMissingSplitsActivity extends Activity implements DialogInterface.OnClickListener {
    /* renamed from: a */
    private final String m11606a() {
        return getApplicationInfo().loadLabel(getPackageManager()).toString();
    }

    /* renamed from: b */
    private final void m11607b(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 66);
        sb.append("market://details?id=");
        sb.append(str);
        sb.append("&referrer=utm_source%3Dplay.core.missingsplits");
        try {
            startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(sb.toString())).setPackage("com.android.vending"));
        } catch (ActivityNotFoundException e) {
            new C2900e(getClass().getName()).mo28422d(e, "Couldn't start missing splits activity for %s", str);
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            m11607b(getPackageName());
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AlertDialog.Builder neutralButton = new AlertDialog.Builder(this).setTitle("Installation failed").setCancelable(false).setNeutralButton("Close", this);
        if (C2926r.m2396a(this)) {
            String a = m11606a();
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 91);
            sb.append("The app ");
            sb.append(a);
            sb.append(" is missing required components and must be reinstalled from the Google Play Store.");
            neutralButton.setMessage(sb.toString()).setPositiveButton("Reinstall", this);
        } else {
            String a2 = m11606a();
            StringBuilder sb2 = new StringBuilder(String.valueOf(a2).length() + 87);
            sb2.append("The app ");
            sb2.append(a2);
            sb2.append(" is missing required components and must be reinstalled from an official store.");
            neutralButton.setMessage(sb2.toString());
        }
        neutralButton.create().show();
    }
}
