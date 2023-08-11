package com.google.android.gms.internal.gtm;

import android.content.Context;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.f0 */
public final class C5332f0 extends C5407k {

    /* renamed from: d */
    private volatile String f5984d;

    /* renamed from: e */
    private Future<String> f5985e;

    protected C5332f0(C5437m mVar) {
        super(mVar);
    }

    /* renamed from: S0 */
    private final boolean m7915S0(Context context, String str) {
        C9713p.m20271f(str);
        C9713p.m20274i("ClientId should be saved from worker thread");
        FileOutputStream fileOutputStream = null;
        try {
            mo33257A("Storing clientId", str);
            fileOutputStream = context.openFileOutput("gaClientId", 0);
            fileOutputStream.write(str.getBytes());
            try {
                fileOutputStream.close();
                return true;
            } catch (IOException e) {
                mo33265H0("Failed to close clientId writing stream", e);
                return true;
            }
        } catch (FileNotFoundException e2) {
            mo33265H0("Error creating clientId file", e2);
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e3) {
                    mo33265H0("Failed to close clientId writing stream", e3);
                }
            }
            return false;
        } catch (IOException e4) {
            mo33265H0("Error writing to clientId file", e4);
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e5) {
                    mo33265H0("Failed to close clientId writing stream", e5);
                }
            }
            return false;
        } catch (Throwable th) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e6) {
                    mo33265H0("Failed to close clientId writing stream", e6);
                }
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x006f A[SYNTHETIC, Splitter:B:38:0x006f] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007c A[SYNTHETIC, Splitter:B:46:0x007c] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0088 A[SYNTHETIC, Splitter:B:55:0x0088] */
    /* renamed from: T0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m7916T0(android.content.Context r9) {
        /*
            r8 = this;
            java.lang.String r0 = "gaClientId"
            java.lang.String r1 = "Failed to close client id reading stream"
            java.lang.String r2 = "ClientId should be loaded from worker thread"
            p231t4.C9713p.m20274i(r2)
            r2 = 0
            java.io.FileInputStream r3 = r9.openFileInput(r0)     // Catch:{ FileNotFoundException -> 0x0085, IOException -> 0x0063, all -> 0x0061 }
            r4 = 36
            byte[] r5 = new byte[r4]     // Catch:{ FileNotFoundException -> 0x0086, IOException -> 0x005f }
            r6 = 0
            int r4 = r3.read(r5, r6, r4)     // Catch:{ FileNotFoundException -> 0x0086, IOException -> 0x005f }
            int r7 = r3.available()     // Catch:{ FileNotFoundException -> 0x0086, IOException -> 0x005f }
            if (r7 <= 0) goto L_0x0031
            java.lang.String r4 = "clientId file seems corrupted, deleting it."
            r8.mo33269L0(r4)     // Catch:{ FileNotFoundException -> 0x0086, IOException -> 0x005f }
            r3.close()     // Catch:{ FileNotFoundException -> 0x0086, IOException -> 0x005f }
            r9.deleteFile(r0)     // Catch:{ FileNotFoundException -> 0x0086, IOException -> 0x005f }
            r3.close()     // Catch:{ IOException -> 0x002c }
            goto L_0x0030
        L_0x002c:
            r9 = move-exception
            r8.mo33265H0(r1, r9)
        L_0x0030:
            return r2
        L_0x0031:
            r7 = 14
            if (r4 >= r7) goto L_0x0049
            java.lang.String r4 = "clientId file is empty, deleting it."
            r8.mo33269L0(r4)     // Catch:{ FileNotFoundException -> 0x0086, IOException -> 0x005f }
            r3.close()     // Catch:{ FileNotFoundException -> 0x0086, IOException -> 0x005f }
            r9.deleteFile(r0)     // Catch:{ FileNotFoundException -> 0x0086, IOException -> 0x005f }
            r3.close()     // Catch:{ IOException -> 0x0044 }
            goto L_0x0048
        L_0x0044:
            r9 = move-exception
            r8.mo33265H0(r1, r9)
        L_0x0048:
            return r2
        L_0x0049:
            r3.close()     // Catch:{ FileNotFoundException -> 0x0086, IOException -> 0x005f }
            java.lang.String r7 = new java.lang.String     // Catch:{ FileNotFoundException -> 0x0086, IOException -> 0x005f }
            r7.<init>(r5, r6, r4)     // Catch:{ FileNotFoundException -> 0x0086, IOException -> 0x005f }
            java.lang.String r4 = "Read client id from disk"
            r8.mo33257A(r4, r7)     // Catch:{ FileNotFoundException -> 0x0086, IOException -> 0x005f }
            r3.close()     // Catch:{ IOException -> 0x005a }
            goto L_0x005e
        L_0x005a:
            r9 = move-exception
            r8.mo33265H0(r1, r9)
        L_0x005e:
            return r7
        L_0x005f:
            r4 = move-exception
            goto L_0x0065
        L_0x0061:
            r9 = move-exception
            goto L_0x007a
        L_0x0063:
            r4 = move-exception
            r3 = r2
        L_0x0065:
            java.lang.String r5 = "Error reading client id file, deleting it"
            r8.mo33265H0(r5, r4)     // Catch:{ all -> 0x0078 }
            r9.deleteFile(r0)     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x0077
            r3.close()     // Catch:{ IOException -> 0x0073 }
            goto L_0x0077
        L_0x0073:
            r9 = move-exception
            r8.mo33265H0(r1, r9)
        L_0x0077:
            return r2
        L_0x0078:
            r9 = move-exception
            r2 = r3
        L_0x007a:
            if (r2 == 0) goto L_0x0084
            r2.close()     // Catch:{ IOException -> 0x0080 }
            goto L_0x0084
        L_0x0080:
            r0 = move-exception
            r8.mo33265H0(r1, r0)
        L_0x0084:
            throw r9
        L_0x0085:
            r3 = r2
        L_0x0086:
            if (r3 == 0) goto L_0x0090
            r3.close()     // Catch:{ IOException -> 0x008c }
            goto L_0x0090
        L_0x008c:
            r9 = move-exception
            r8.mo33265H0(r1, r9)
        L_0x0090:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C5332f0.m7916T0(android.content.Context):java.lang.String");
    }

    /* access modifiers changed from: private */
    /* renamed from: X0 */
    public final String m7917X0() {
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        try {
            if (!m7915S0(mo33282u0().mo45756a(), lowerCase)) {
                return "0";
            }
            return lowerCase;
        } catch (Exception e) {
            mo33265H0("Error saving clientId file", e);
            return "0";
        }
    }

    /* renamed from: U0 */
    public final String mo33207U0() {
        String str;
        mo33310Q0();
        synchronized (this) {
            if (this.f5984d == null) {
                this.f5985e = mo33282u0().mo45757c(new C5347g0(this));
            }
            Future<String> future = this.f5985e;
            if (future != null) {
                try {
                    this.f5984d = future.get();
                } catch (InterruptedException e) {
                    mo33262E0("ClientId loading or generation was interrupted", e);
                    this.f5984d = "0";
                } catch (ExecutionException e2) {
                    mo33265H0("Failed to load or generate client id", e2);
                    this.f5984d = "0";
                }
                if (this.f5984d == null) {
                    this.f5984d = "0";
                }
                mo33257A("Loaded clientId", this.f5984d);
                this.f5985e = null;
            }
            str = this.f5984d;
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V0 */
    public final String mo33208V0() {
        synchronized (this) {
            this.f5984d = null;
            this.f5985e = mo33282u0().mo45757c(new C5363h0(this));
        }
        return mo33207U0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W0 */
    public final String mo33209W0() {
        String T0 = m7916T0(mo33282u0().mo45756a());
        if (T0 == null) {
            return m7917X0();
        }
        return T0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P0 */
    public final void mo33181P0() {
    }
}
