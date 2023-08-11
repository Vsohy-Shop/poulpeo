package okhttp3;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.authenticator.JavaNetAuthenticator;

/* compiled from: Authenticator.kt */
public interface Authenticator {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final Authenticator JAVA_NET_AUTHENTICATOR = new JavaNetAuthenticator((Dns) null, 1, (DefaultConstructorMarker) null);
    public static final Authenticator NONE = new Companion.AuthenticatorNone();

    /* compiled from: Authenticator.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* compiled from: Authenticator.kt */
        private static final class AuthenticatorNone implements Authenticator {
            public Request authenticate(Route route, Response response) {
                C12775o.m28639i(response, "response");
                return null;
            }
        }

        private Companion() {
        }
    }

    Request authenticate(Route route, Response response);
}
