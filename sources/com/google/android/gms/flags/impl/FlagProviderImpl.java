package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.util.DynamiteApi;
import p036b5.C2888a;
import p036b5.C2890b;
import p062d5.C7265b;
import p074e5.C7478b;
import p161m5.C8827d;

@DynamiteApi
/* compiled from: com.google.android.gms:play-services-flags@@17.0.1 */
public class FlagProviderImpl extends C7265b {

    /* renamed from: a */
    private boolean f5093a = false;

    /* renamed from: b */
    private SharedPreferences f5094b;

    public boolean getBooleanFlagValue(@NonNull String str, boolean z, int i) {
        String str2;
        if (!this.f5093a) {
            return z;
        }
        SharedPreferences sharedPreferences = this.f5094b;
        Boolean valueOf = Boolean.valueOf(z);
        try {
            valueOf = (Boolean) C8827d.m17890a(new C4806a(sharedPreferences, str, valueOf));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            if (valueOf2.length() != 0) {
                str2 = "Flag value not available, returning default: ".concat(valueOf2);
            } else {
                str2 = new String("Flag value not available, returning default: ");
            }
            Log.w("FlagDataUtils", str2);
        }
        return valueOf.booleanValue();
    }

    public int getIntFlagValue(@NonNull String str, int i, int i2) {
        String str2;
        if (!this.f5093a) {
            return i;
        }
        SharedPreferences sharedPreferences = this.f5094b;
        Integer valueOf = Integer.valueOf(i);
        try {
            valueOf = (Integer) C8827d.m17890a(new C4807b(sharedPreferences, str, valueOf));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            if (valueOf2.length() != 0) {
                str2 = "Flag value not available, returning default: ".concat(valueOf2);
            } else {
                str2 = new String("Flag value not available, returning default: ");
            }
            Log.w("FlagDataUtils", str2);
        }
        return valueOf.intValue();
    }

    public long getLongFlagValue(@NonNull String str, long j, int i) {
        String str2;
        if (!this.f5093a) {
            return j;
        }
        SharedPreferences sharedPreferences = this.f5094b;
        Long valueOf = Long.valueOf(j);
        try {
            valueOf = (Long) C8827d.m17890a(new C4808c(sharedPreferences, str, valueOf));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            if (valueOf2.length() != 0) {
                str2 = "Flag value not available, returning default: ".concat(valueOf2);
            } else {
                str2 = new String("Flag value not available, returning default: ");
            }
            Log.w("FlagDataUtils", str2);
        }
        return valueOf.longValue();
    }

    @NonNull
    public String getStringFlagValue(@NonNull String str, @NonNull String str2, int i) {
        String str3;
        if (!this.f5093a) {
            return str2;
        }
        try {
            return (String) C8827d.m17890a(new C4809d(this.f5094b, str, str2));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                str3 = "Flag value not available, returning default: ".concat(valueOf);
            } else {
                str3 = new String("Flag value not available, returning default: ");
            }
            Log.w("FlagDataUtils", str3);
            return str2;
        }
    }

    public void init(@NonNull C2888a aVar) {
        String str;
        Context context = (Context) C2890b.m2296J(aVar);
        if (!this.f5093a) {
            try {
                this.f5094b = C7478b.m14654a(context.createPackageContext("com.google.android.gms", 0));
                this.f5093a = true;
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (Exception e) {
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() != 0) {
                    str = "Could not retrieve sdk flags, continuing with defaults: ".concat(valueOf);
                } else {
                    str = new String("Could not retrieve sdk flags, continuing with defaults: ");
                }
                Log.w("FlagProviderImpl", str);
            }
        }
    }
}
