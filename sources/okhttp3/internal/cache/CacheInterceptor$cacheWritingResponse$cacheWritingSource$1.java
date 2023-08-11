package okhttp3.internal.cache;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C12775o;
import okhttp3.internal.Util;
import okio.C13121c;
import okio.C13127d;
import okio.C13130e;
import okio.C13179y0;
import okio.C13181z0;

/* compiled from: CacheInterceptor.kt */
public final class CacheInterceptor$cacheWritingResponse$cacheWritingSource$1 implements C13179y0 {
    final /* synthetic */ C13127d $cacheBody;
    final /* synthetic */ CacheRequest $cacheRequest;
    final /* synthetic */ C13130e $source;
    private boolean cacheRequestClosed;

    CacheInterceptor$cacheWritingResponse$cacheWritingSource$1(C13130e eVar, CacheRequest cacheRequest, C13127d dVar) {
        this.$source = eVar;
        this.$cacheRequest = cacheRequest;
        this.$cacheBody = dVar;
    }

    public void close() {
        if (!this.cacheRequestClosed && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
            this.cacheRequestClosed = true;
            this.$cacheRequest.abort();
        }
        this.$source.close();
    }

    public long read(C13121c cVar, long j) {
        C12775o.m28639i(cVar, "sink");
        try {
            long read = this.$source.read(cVar, j);
            if (read == -1) {
                if (!this.cacheRequestClosed) {
                    this.cacheRequestClosed = true;
                    this.$cacheBody.close();
                }
                return -1;
            }
            cVar.mo52512Y(this.$cacheBody.mo52524f(), cVar.size() - read, read);
            this.$cacheBody.mo52566y();
            return read;
        } catch (IOException e) {
            if (!this.cacheRequestClosed) {
                this.cacheRequestClosed = true;
                this.$cacheRequest.abort();
            }
            throw e;
        }
    }

    public C13181z0 timeout() {
        return this.$source.timeout();
    }
}
