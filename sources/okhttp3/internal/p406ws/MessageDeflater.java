package okhttp3.internal.p406ws;

import java.io.Closeable;
import java.util.zip.Deflater;
import okio.C13121c;
import okio.C13133f;
import okio.C13136g;
import okio.C13175w0;

/* renamed from: okhttp3.internal.ws.MessageDeflater */
/* compiled from: MessageDeflater.kt */
public final class MessageDeflater implements Closeable {
    private final C13121c deflatedBytes;
    private final Deflater deflater;
    private final C13136g deflaterSink;
    private final boolean noContextTakeover;

    public MessageDeflater(boolean z) {
        this.noContextTakeover = z;
        C13121c cVar = new C13121c();
        this.deflatedBytes = cVar;
        Deflater deflater2 = new Deflater(-1, true);
        this.deflater = deflater2;
        this.deflaterSink = new C13136g((C13175w0) cVar, deflater2);
    }

    private final boolean endsWith(C13121c cVar, C13133f fVar) {
        return cVar.mo52489H(cVar.size() - ((long) fVar.mo52590H()), fVar);
    }

    public void close() {
        this.deflaterSink.close();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        p392mf.C12941b.m29245a(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0058, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void deflate(okio.C13121c r7) {
        /*
            r6 = this;
            java.lang.String r0 = "buffer"
            kotlin.jvm.internal.C12775o.m28639i(r7, r0)
            okio.c r0 = r6.deflatedBytes
            long r0 = r0.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0015
            r0 = r1
            goto L_0x0016
        L_0x0015:
            r0 = r2
        L_0x0016:
            if (r0 == 0) goto L_0x0068
            boolean r0 = r6.noContextTakeover
            if (r0 == 0) goto L_0x0021
            java.util.zip.Deflater r0 = r6.deflater
            r0.reset()
        L_0x0021:
            okio.g r0 = r6.deflaterSink
            long r3 = r7.size()
            r0.write(r7, r3)
            okio.g r0 = r6.deflaterSink
            r0.flush()
            okio.c r0 = r6.deflatedBytes
            okio.f r3 = okhttp3.internal.p406ws.MessageDeflaterKt.EMPTY_DEFLATE_BLOCK
            boolean r0 = r6.endsWith(r0, r3)
            if (r0 == 0) goto L_0x0059
            okio.c r0 = r6.deflatedBytes
            long r2 = r0.size()
            r0 = 4
            long r4 = (long) r0
            long r2 = r2 - r4
            okio.c r0 = r6.deflatedBytes
            r4 = 0
            okio.c$a r0 = okio.C13121c.m29523z0(r0, r4, r1, r4)
            r0.mo52572c(r2)     // Catch:{ all -> 0x0052 }
            p392mf.C12941b.m29245a(r0, r4)
            goto L_0x005e
        L_0x0052:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r1 = move-exception
            p392mf.C12941b.m29245a(r0, r7)
            throw r1
        L_0x0059:
            okio.c r0 = r6.deflatedBytes
            r0.writeByte(r2)
        L_0x005e:
            okio.c r0 = r6.deflatedBytes
            long r1 = r0.size()
            r7.write(r0, r1)
            return
        L_0x0068:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p406ws.MessageDeflater.deflate(okio.c):void");
    }
}
