package okhttp3;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.C12775o;

/* compiled from: Challenge.kt */
public final class Challenge {
    private final Map<String, String> authParams;
    private final String scheme;

    public Challenge(String str, Map<String, String> map) {
        String str2;
        C12775o.m28639i(str, "scheme");
        C12775o.m28639i(map, "authParams");
        this.scheme = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            String str3 = (String) next.getKey();
            String str4 = (String) next.getValue();
            if (str3 == null) {
                str2 = null;
            } else {
                Locale locale = Locale.US;
                C12775o.m28638h(locale, "US");
                str2 = str3.toLowerCase(locale);
                C12775o.m28638h(str2, "this as java.lang.String).toLowerCase(locale)");
            }
            linkedHashMap.put(str2, str4);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        C12775o.m28638h(unmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.authParams = unmodifiableMap;
    }

    /* renamed from: -deprecated_authParams  reason: not valid java name */
    public final Map<String, String> m38763deprecated_authParams() {
        return this.authParams;
    }

    /* renamed from: -deprecated_charset  reason: not valid java name */
    public final Charset m38764deprecated_charset() {
        return charset();
    }

    /* renamed from: -deprecated_realm  reason: not valid java name */
    public final String m38765deprecated_realm() {
        return realm();
    }

    /* renamed from: -deprecated_scheme  reason: not valid java name */
    public final String m38766deprecated_scheme() {
        return this.scheme;
    }

    public final Map<String, String> authParams() {
        return this.authParams;
    }

    public final Charset charset() {
        String str = this.authParams.get("charset");
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                C12775o.m28638h(forName, "forName(charset)");
                return forName;
            } catch (Exception unused) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        C12775o.m28638h(charset, "ISO_8859_1");
        return charset;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Challenge) {
            Challenge challenge = (Challenge) obj;
            if (!C12775o.m28634d(challenge.scheme, this.scheme) || !C12775o.m28634d(challenge.authParams, this.authParams)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((899 + this.scheme.hashCode()) * 31) + this.authParams.hashCode();
    }

    public final String realm() {
        return this.authParams.get("realm");
    }

    public final String scheme() {
        return this.scheme;
    }

    public String toString() {
        return this.scheme + " authParams=" + this.authParams;
    }

    public final Challenge withCharset(Charset charset) {
        C12775o.m28639i(charset, "charset");
        Map u = C12716r0.m28430u(this.authParams);
        String name = charset.name();
        C12775o.m28638h(name, "charset.name()");
        u.put("charset", name);
        return new Challenge(this.scheme, (Map<String, String>) u);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Challenge(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "scheme"
            kotlin.jvm.internal.C12775o.m28639i(r2, r0)
            java.lang.String r0 = "realm"
            kotlin.jvm.internal.C12775o.m28639i(r3, r0)
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r0 = "singletonMap(\"realm\", realm)"
            kotlin.jvm.internal.C12775o.m28638h(r3, r0)
            r1.<init>((java.lang.String) r2, (java.util.Map<java.lang.String, java.lang.String>) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.Challenge.<init>(java.lang.String, java.lang.String):void");
    }
}
