package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.gtm.e */
public final class C5316e extends C5407k {

    /* renamed from: i */
    private static boolean f5935i;

    /* renamed from: d */
    private AdvertisingIdClient.Info f5936d;

    /* renamed from: e */
    private final C5487p1 f5937e;

    /* renamed from: f */
    private String f5938f;

    /* renamed from: g */
    private boolean f5939g = false;

    /* renamed from: h */
    private final Object f5940h = new Object();

    C5316e(C5437m mVar) {
        super(mVar);
        this.f5937e = new C5487p1(mVar.mo33329d());
    }

    /* renamed from: R0 */
    private final boolean m7866R0(AdvertisingIdClient.Info info, AdvertisingIdClient.Info info2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6 = null;
        if (info2 == null) {
            str = null;
        } else {
            str = info2.getId();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        String U0 = mo33258A0().mo33207U0();
        synchronized (this.f5940h) {
            if (!this.f5939g) {
                this.f5938f = m7869W0();
                this.f5939g = true;
            } else if (TextUtils.isEmpty(this.f5938f)) {
                if (info != null) {
                    str6 = info.getId();
                }
                if (str6 == null) {
                    String valueOf = String.valueOf(str);
                    String valueOf2 = String.valueOf(U0);
                    if (valueOf2.length() != 0) {
                        str5 = valueOf.concat(valueOf2);
                    } else {
                        str5 = new String(valueOf);
                    }
                    boolean Y0 = m7871Y0(str5);
                    return Y0;
                }
                String valueOf3 = String.valueOf(U0);
                if (valueOf3.length() != 0) {
                    str4 = str6.concat(valueOf3);
                } else {
                    str4 = new String(str6);
                }
                this.f5938f = m7870X0(str4);
            }
            String valueOf4 = String.valueOf(str);
            String valueOf5 = String.valueOf(U0);
            if (valueOf5.length() != 0) {
                str2 = valueOf4.concat(valueOf5);
            } else {
                str2 = new String(valueOf4);
            }
            String X0 = m7870X0(str2);
            if (TextUtils.isEmpty(X0)) {
                return false;
            }
            if (X0.equals(this.f5938f)) {
                return true;
            }
            if (!TextUtils.isEmpty(this.f5938f)) {
                mo33266I0("Resetting the client id because Advertising Id changed.");
                U0 = mo33258A0().mo33208V0();
                mo33257A("New client Id", U0);
            }
            String valueOf6 = String.valueOf(str);
            String valueOf7 = String.valueOf(U0);
            if (valueOf7.length() != 0) {
                str3 = valueOf6.concat(valueOf7);
            } else {
                str3 = new String(valueOf6);
            }
            boolean Y02 = m7871Y0(str3);
            return Y02;
        }
    }

    /* renamed from: U0 */
    private final synchronized AdvertisingIdClient.Info m7867U0() {
        if (this.f5937e.mo33444c(1000)) {
            this.f5937e.mo33443b();
            AdvertisingIdClient.Info V0 = m7868V0();
            if (m7866R0(this.f5936d, V0)) {
                this.f5936d = V0;
            } else {
                mo33270M0("Failed to reset client id on adid change. Not using adid");
                this.f5936d = new AdvertisingIdClient.Info("", false);
            }
        }
        return this.f5936d;
    }

    /* renamed from: V0 */
    private final AdvertisingIdClient.Info m7868V0() {
        try {
            return AdvertisingIdClient.getAdvertisingIdInfo(mo33276c());
        } catch (IllegalStateException unused) {
            mo33269L0("IllegalStateException getting Ad Id Info. If you would like to see Audience reports, please ensure that you have added '<meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />' to your application manifest file. See http://goo.gl/naFqQk for details.");
            return null;
        } catch (Exception e) {
            if (!f5935i) {
                f5935i = true;
                mo33262E0("Error getting advertiser id", e);
            }
            return null;
        }
    }

    /* renamed from: W0 */
    private final String m7869W0() {
        String str = null;
        try {
            FileInputStream openFileInput = mo33276c().openFileInput("gaClientIdData");
            byte[] bArr = new byte[128];
            int read = openFileInput.read(bArr, 0, 128);
            if (openFileInput.available() > 0) {
                mo33269L0("Hash file seems corrupted, deleting it.");
                openFileInput.close();
                mo33276c().deleteFile("gaClientIdData");
                return null;
            } else if (read <= 0) {
                mo33266I0("Hash file is empty.");
                openFileInput.close();
                return null;
            } else {
                String str2 = new String(bArr, 0, read);
                try {
                    openFileInput.close();
                } catch (FileNotFoundException unused) {
                } catch (IOException e) {
                    e = e;
                    str = str2;
                    mo33262E0("Error reading Hash file, deleting it", e);
                    mo33276c().deleteFile("gaClientIdData");
                    return str;
                }
                return str2;
            }
        } catch (FileNotFoundException unused2) {
            return null;
        } catch (IOException e2) {
            e = e2;
            mo33262E0("Error reading Hash file, deleting it", e);
            mo33276c().deleteFile("gaClientIdData");
            return str;
        }
    }

    /* renamed from: X0 */
    private static String m7870X0(String str) {
        MessageDigest h = C5502q1.m8401h(Constants.MD5);
        if (h == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, h.digest(str.getBytes()))});
    }

    /* renamed from: Y0 */
    private final boolean m7871Y0(String str) {
        try {
            String X0 = m7870X0(str);
            mo33266I0("Storing hashed adid.");
            FileOutputStream openFileOutput = mo33276c().openFileOutput("gaClientIdData", 0);
            openFileOutput.write(X0.getBytes());
            openFileOutput.close();
            this.f5938f = X0;
            return true;
        } catch (IOException e) {
            mo33265H0("Error creating hash file", e);
            return false;
        }
    }

    /* renamed from: S0 */
    public final boolean mo33182S0() {
        mo33310Q0();
        AdvertisingIdClient.Info U0 = m7867U0();
        if (U0 == null || U0.isLimitAdTrackingEnabled()) {
            return false;
        }
        return true;
    }

    /* renamed from: T0 */
    public final String mo33183T0() {
        String str;
        mo33310Q0();
        AdvertisingIdClient.Info U0 = m7867U0();
        if (U0 != null) {
            str = U0.getId();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P0 */
    public final void mo33181P0() {
    }
}
