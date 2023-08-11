package okhttp3.internal.p406ws;

import androidx.core.location.LocationRequestCompat;
import java.io.Closeable;
import java.util.zip.Inflater;
import kotlin.jvm.internal.C12775o;
import okio.C13121c;
import okio.C13157p;
import okio.C13179y0;

/* renamed from: okhttp3.internal.ws.MessageInflater */
/* compiled from: MessageInflater.kt */
public final class MessageInflater implements Closeable {
    private final C13121c deflatedBytes;
    private final Inflater inflater;
    private final C13157p inflaterSource;
    private final boolean noContextTakeover;

    public MessageInflater(boolean z) {
        this.noContextTakeover = z;
        C13121c cVar = new C13121c();
        this.deflatedBytes = cVar;
        Inflater inflater2 = new Inflater(true);
        this.inflater = inflater2;
        this.inflaterSource = new C13157p((C13179y0) cVar, inflater2);
    }

    public void close() {
        this.inflaterSource.close();
    }

    public final void inflate(C13121c cVar) {
        boolean z;
        C12775o.m28639i(cVar, "buffer");
        if (this.deflatedBytes.size() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.noContextTakeover) {
                this.inflater.reset();
            }
            this.deflatedBytes.mo52494K(cVar);
            this.deflatedBytes.writeInt(65535);
            long bytesRead = this.inflater.getBytesRead() + this.deflatedBytes.size();
            do {
                this.inflaterSource.mo52678a(cVar, LocationRequestCompat.PASSIVE_INTERVAL);
            } while (this.inflater.getBytesRead() < bytesRead);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
