package okhttp3.internal.http1;

import com.rmn.apiclient.impl.api.call.APIParams;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Headers;
import okio.C13130e;

/* compiled from: HeadersReader.kt */
public final class HeadersReader {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final int HEADER_LIMIT = 262144;
    private long headerLimit = 262144;
    private final C13130e source;

    /* compiled from: HeadersReader.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public HeadersReader(C13130e eVar) {
        C12775o.m28639i(eVar, APIParams.SOURCE);
        this.source = eVar;
    }

    public final C13130e getSource() {
        return this.source;
    }

    public final Headers readHeaders() {
        boolean z;
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String readLine = readLine();
            if (readLine.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return builder.build();
            }
            builder.addLenient$okhttp(readLine);
        }
    }

    public final String readLine() {
        String B = this.source.mo52481B(this.headerLimit);
        this.headerLimit -= (long) B.length();
        return B;
    }
}
