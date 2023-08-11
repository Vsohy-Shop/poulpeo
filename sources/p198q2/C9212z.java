package p198q2;

import com.facebook.FacebookSdk;
import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.internal.C12770k0;
import kotlin.jvm.internal.C12775o;

/* renamed from: q2.z */
/* compiled from: ServerProtocol.kt */
public final class C9212z {

    /* renamed from: a */
    private static final String f13534a;

    /* renamed from: b */
    private static final Collection<String> f13535b = C9138d0.m18670w0("service_disabled", "AndroidAuthKillSwitchException");

    /* renamed from: c */
    private static final Collection<String> f13536c = C9138d0.m18670w0("access_denied", "OAuthAccessDeniedException");

    /* renamed from: d */
    private static final String f13537d = "CONNECTION_FAILURE";

    /* renamed from: e */
    public static final C9212z f13538e = new C9212z();

    static {
        String name = C9212z.class.getName();
        C12775o.m28638h(name, "ServerProtocol::class.java.name");
        f13534a = name;
    }

    private C9212z() {
    }

    /* renamed from: a */
    public static final String m18908a() {
        return "v11.0";
    }

    /* renamed from: b */
    public static final String m18909b() {
        C12770k0 k0Var = C12770k0.f20423a;
        String format = String.format("m.%s", Arrays.copyOf(new Object[]{FacebookSdk.getFacebookDomain()}, 1));
        C12775o.m28638h(format, "java.lang.String.format(format, *args)");
        return format;
    }

    /* renamed from: c */
    public static final String m18910c() {
        return f13537d;
    }

    /* renamed from: d */
    public static final Collection<String> m18911d() {
        return f13535b;
    }

    /* renamed from: e */
    public static final Collection<String> m18912e() {
        return f13536c;
    }

    /* renamed from: f */
    public static final String m18913f() {
        C12770k0 k0Var = C12770k0.f20423a;
        String format = String.format("https://graph.%s", Arrays.copyOf(new Object[]{FacebookSdk.getFacebookDomain()}, 1));
        C12775o.m28638h(format, "java.lang.String.format(format, *args)");
        return format;
    }

    /* renamed from: g */
    public static final String m18914g() {
        C12770k0 k0Var = C12770k0.f20423a;
        String format = String.format("https://graph.%s", Arrays.copyOf(new Object[]{FacebookSdk.getGraphDomain()}, 1));
        C12775o.m28638h(format, "java.lang.String.format(format, *args)");
        return format;
    }

    /* renamed from: h */
    public static final String m18915h(String str) {
        C12775o.m28639i(str, "subdomain");
        C12770k0 k0Var = C12770k0.f20423a;
        String format = String.format("https://graph.%s", Arrays.copyOf(new Object[]{str}, 1));
        C12775o.m28638h(format, "java.lang.String.format(format, *args)");
        return format;
    }

    /* renamed from: i */
    public static final String m18916i() {
        C12770k0 k0Var = C12770k0.f20423a;
        String format = String.format("https://graph-video.%s", Arrays.copyOf(new Object[]{FacebookSdk.getGraphDomain()}, 1));
        C12775o.m28638h(format, "java.lang.String.format(format, *args)");
        return format;
    }

    /* renamed from: j */
    public static final String m18917j() {
        C12770k0 k0Var = C12770k0.f20423a;
        String format = String.format("m.%s", Arrays.copyOf(new Object[]{FacebookSdk.getInstagramDomain()}, 1));
        C12775o.m28638h(format, "java.lang.String.format(format, *args)");
        return format;
    }
}
