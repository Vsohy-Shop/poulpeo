package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.C5472o4;

/* renamed from: com.google.android.gms.internal.gtm.a5 */
final class C5262a5 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ boolean f5813b;

    /* renamed from: c */
    private final /* synthetic */ String f5814c;

    /* renamed from: d */
    private final /* synthetic */ C5472o4.C5474b f5815d;

    C5262a5(C5472o4.C5474b bVar, boolean z, String str) {
        this.f5815d = bVar;
        this.f5813b = z;
        this.f5814c = str;
    }

    public final void run() {
        String str;
        if (C5472o4.this.f6206l == 2) {
            if (this.f5813b) {
                int unused = C5472o4.this.f6206l = 3;
                String str2 = this.f5814c;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 18);
                sb.append("Container ");
                sb.append(str2);
                sb.append(" loaded.");
                C5426l3.m8133c(sb.toString());
            } else {
                int unused2 = C5472o4.this.f6206l = 4;
                String valueOf = String.valueOf(this.f5814c);
                if (valueOf.length() != 0) {
                    str = "Error loading container:".concat(valueOf);
                } else {
                    str = new String("Error loading container:");
                }
                C5426l3.m8135e(str);
            }
            while (!C5472o4.this.f6207m.isEmpty()) {
                C5472o4.this.f6199e.execute((Runnable) C5472o4.this.f6207m.remove());
            }
            return;
        }
        C5426l3.m8134d("Container load callback completed after timeout");
    }
}
