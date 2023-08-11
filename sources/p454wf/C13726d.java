package p454wf;

import com.adjust.sdk.Constants;
import java.nio.charset.Charset;
import kotlin.jvm.internal.C12775o;

/* renamed from: wf.d */
/* compiled from: Charsets.kt */
public final class C13726d {

    /* renamed from: a */
    public static final C13726d f22151a = new C13726d();

    /* renamed from: b */
    public static final Charset f22152b;

    /* renamed from: c */
    public static final Charset f22153c;

    /* renamed from: d */
    public static final Charset f22154d;

    /* renamed from: e */
    public static final Charset f22155e;

    /* renamed from: f */
    public static final Charset f22156f;

    /* renamed from: g */
    public static final Charset f22157g;

    /* renamed from: h */
    private static Charset f22158h;

    /* renamed from: i */
    private static Charset f22159i;

    static {
        Charset forName = Charset.forName(Constants.ENCODING);
        C12775o.m28638h(forName, "forName(\"UTF-8\")");
        f22152b = forName;
        Charset forName2 = Charset.forName("UTF-16");
        C12775o.m28638h(forName2, "forName(\"UTF-16\")");
        f22153c = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        C12775o.m28638h(forName3, "forName(\"UTF-16BE\")");
        f22154d = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        C12775o.m28638h(forName4, "forName(\"UTF-16LE\")");
        f22155e = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        C12775o.m28638h(forName5, "forName(\"US-ASCII\")");
        f22156f = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        C12775o.m28638h(forName6, "forName(\"ISO-8859-1\")");
        f22157g = forName6;
    }

    private C13726d() {
    }

    /* renamed from: a */
    public final Charset mo53395a() {
        Charset charset = f22159i;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32BE");
        C12775o.m28638h(forName, "forName(\"UTF-32BE\")");
        f22159i = forName;
        return forName;
    }

    /* renamed from: b */
    public final Charset mo53396b() {
        Charset charset = f22158h;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32LE");
        C12775o.m28638h(forName, "forName(\"UTF-32LE\")");
        f22158h = forName;
        return forName;
    }
}
