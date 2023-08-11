package p137k1;

import java.io.InputStream;
import p058d1.C7217d;
import p106h1.C7883b;

/* renamed from: k1.t */
/* compiled from: StreamEncoder */
public class C8493t implements C7217d<InputStream> {

    /* renamed from: a */
    private final C7883b f12102a;

    public C8493t(C7883b bVar) {
        this.f12102a = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x003d A[Catch:{ all -> 0x0033 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0044 A[SYNTHETIC, Splitter:B:24:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004f A[SYNTHETIC, Splitter:B:29:0x004f] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo31397a(@androidx.annotation.NonNull java.io.InputStream r5, @androidx.annotation.NonNull java.io.File r6, @androidx.annotation.NonNull p058d1.C7222g r7) {
        /*
            r4 = this;
            java.lang.String r7 = "StreamEncoder"
            h1.b r0 = r4.f12102a
            r1 = 65536(0x10000, float:9.18355E-41)
            java.lang.Class<byte[]> r2 = byte[].class
            java.lang.Object r0 = r0.mo41595d(r1, r2)
            byte[] r0 = (byte[]) r0
            r1 = 0
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0035 }
            r3.<init>(r6)     // Catch:{ IOException -> 0x0035 }
        L_0x0015:
            int r6 = r5.read(r0)     // Catch:{ IOException -> 0x0030, all -> 0x002d }
            r2 = -1
            if (r6 == r2) goto L_0x0020
            r3.write(r0, r1, r6)     // Catch:{ IOException -> 0x0030, all -> 0x002d }
            goto L_0x0015
        L_0x0020:
            r3.close()     // Catch:{ IOException -> 0x0030, all -> 0x002d }
            r3.close()     // Catch:{ IOException -> 0x0026 }
        L_0x0026:
            h1.b r5 = r4.f12102a
            r5.put(r0)
            r1 = 1
            goto L_0x004c
        L_0x002d:
            r5 = move-exception
            r2 = r3
            goto L_0x004d
        L_0x0030:
            r5 = move-exception
            r2 = r3
            goto L_0x0036
        L_0x0033:
            r5 = move-exception
            goto L_0x004d
        L_0x0035:
            r5 = move-exception
        L_0x0036:
            r6 = 3
            boolean r6 = android.util.Log.isLoggable(r7, r6)     // Catch:{ all -> 0x0033 }
            if (r6 == 0) goto L_0x0042
            java.lang.String r6 = "Failed to encode data onto the OutputStream"
            android.util.Log.d(r7, r6, r5)     // Catch:{ all -> 0x0033 }
        L_0x0042:
            if (r2 == 0) goto L_0x0047
            r2.close()     // Catch:{ IOException -> 0x0047 }
        L_0x0047:
            h1.b r5 = r4.f12102a
            r5.put(r0)
        L_0x004c:
            return r1
        L_0x004d:
            if (r2 == 0) goto L_0x0052
            r2.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            h1.b r6 = r4.f12102a
            r6.put(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p137k1.C8493t.mo31397a(java.io.InputStream, java.io.File, d1.g):boolean");
    }
}
