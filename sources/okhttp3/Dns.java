package okhttp3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.jvm.internal.C12775o;

/* compiled from: Dns.kt */
public interface Dns {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final Dns SYSTEM = new Companion.DnsSystem();

    /* compiled from: Dns.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* compiled from: Dns.kt */
        private static final class DnsSystem implements Dns {
            public List<InetAddress> lookup(String str) {
                C12775o.m28639i(str, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    C12775o.m28638h(allByName, "getAllByName(hostname)");
                    return C12710p.m28405g0(allByName);
                } catch (NullPointerException e) {
                    UnknownHostException unknownHostException = new UnknownHostException(C12775o.m28647q("Broken system behaviour for dns lookup of ", str));
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            }
        }

        private Companion() {
        }
    }

    List<InetAddress> lookup(String str);
}
