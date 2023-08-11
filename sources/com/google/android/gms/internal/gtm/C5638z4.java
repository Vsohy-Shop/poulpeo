package com.google.android.gms.internal.gtm;

import android.net.Uri;

/* renamed from: com.google.android.gms.internal.gtm.z4 */
final class C5638z4 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ Uri f6758b;

    /* renamed from: c */
    private final /* synthetic */ C5472o4 f6759c;

    C5638z4(C5472o4 o4Var, Uri uri) {
        this.f6759c = o4Var;
        this.f6758b = uri;
    }

    public final void run() {
        String valueOf = String.valueOf(this.f6758b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 25);
        sb.append("Preview requested to uri ");
        sb.append(valueOf);
        C5426l3.m8133c(sb.toString());
        synchronized (this.f6759c.f6203i) {
            if (this.f6759c.f6206l == 2) {
                C5426l3.m8133c("Still initializing. Defer preview container loading.");
                this.f6759c.f6207m.add(this);
                return;
            }
            String str = (String) this.f6759c.m8295j((String[]) null).first;
            if (str == null) {
                C5426l3.m8134d("Preview failed (no container found)");
            } else if (!this.f6759c.f6201g.mo33533c(str, this.f6758b)) {
                String valueOf2 = String.valueOf(this.f6758b);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 73);
                sb2.append("Cannot preview the app with the uri: ");
                sb2.append(valueOf2);
                sb2.append(". Launching current version instead.");
                C5426l3.m8134d(sb2.toString());
            } else if (!this.f6759c.f6208n) {
                String valueOf3 = String.valueOf(this.f6758b);
                StringBuilder sb3 = new StringBuilder(valueOf3.length() + 84);
                sb3.append("Deferring container loading for preview uri: ");
                sb3.append(valueOf3);
                sb3.append("(Tag Manager has not been initialized).");
                C5426l3.m8133c(sb3.toString());
            } else {
                String valueOf4 = String.valueOf(this.f6758b);
                StringBuilder sb4 = new StringBuilder(valueOf4.length() + 36);
                sb4.append("Starting to load preview container: ");
                sb4.append(valueOf4);
                C5426l3.m8136f(sb4.toString());
                if (!this.f6759c.f6198d.mo33298f()) {
                    C5426l3.m8134d("Failed to reset TagManager service for preview");
                    return;
                }
                boolean unused = this.f6759c.f6208n = false;
                int unused2 = this.f6759c.f6206l = 1;
                this.f6759c.mo33420f();
            }
        }
    }
}
