package okhttp3;

import java.io.IOException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Protocol.kt */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    
    public static final Companion Companion = null;
    /* access modifiers changed from: private */
    public final String protocol;

    /* compiled from: Protocol.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Protocol get(String str) {
            C12775o.m28639i(str, "protocol");
            Protocol protocol = Protocol.HTTP_1_0;
            if (!C12775o.m28634d(str, protocol.protocol)) {
                protocol = Protocol.HTTP_1_1;
                if (!C12775o.m28634d(str, protocol.protocol)) {
                    protocol = Protocol.H2_PRIOR_KNOWLEDGE;
                    if (!C12775o.m28634d(str, protocol.protocol)) {
                        protocol = Protocol.HTTP_2;
                        if (!C12775o.m28634d(str, protocol.protocol)) {
                            protocol = Protocol.SPDY_3;
                            if (!C12775o.m28634d(str, protocol.protocol)) {
                                protocol = Protocol.QUIC;
                                if (!C12775o.m28634d(str, protocol.protocol)) {
                                    throw new IOException(C12775o.m28647q("Unexpected protocol: ", str));
                                }
                            }
                        }
                    }
                }
            }
            return protocol;
        }
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    private Protocol(String str) {
        this.protocol = str;
    }

    public static final Protocol get(String str) {
        return Companion.get(str);
    }

    public String toString() {
        return this.protocol;
    }
}
