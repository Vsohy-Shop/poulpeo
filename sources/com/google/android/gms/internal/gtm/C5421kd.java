package com.google.android.gms.internal.gtm;

import java.io.PrintStream;
import java.util.List;

/* renamed from: com.google.android.gms.internal.gtm.kd */
final class C5421kd extends C5376hd {

    /* renamed from: b */
    private final C5391id f6099b = new C5391id();

    C5421kd() {
    }

    /* renamed from: a */
    public final void mo33224a(Throwable th, PrintStream printStream) {
        th.printStackTrace(printStream);
        List<Throwable> a = this.f6099b.mo33256a(th, false);
        if (a != null) {
            synchronized (a) {
                for (Throwable printStackTrace : a) {
                    printStream.print("Suppressed: ");
                    printStackTrace.printStackTrace(printStream);
                }
            }
        }
    }
}
