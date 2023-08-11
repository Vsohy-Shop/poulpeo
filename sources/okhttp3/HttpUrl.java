package okhttp3;

import androidx.autofill.HintConstants;
import androidx.webkit.ProxyConfig;
import com.appboy.Constants;
import com.rmn.api.p322v2.main.oauth.OAuthErrorCodes;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okio.C13121c;
import p370jf.C12624c;
import p436tf.C13525d;
import p454wf.C13735j;

/* compiled from: HttpUrl.kt */
public final class HttpUrl {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    public static final String FRAGMENT_ENCODE_SET = "";
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    /* access modifiers changed from: private */
    public static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";
    public static final String QUERY_ENCODE_SET = " \"'<>#";
    public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    private final String fragment;
    private final String host;
    private final boolean isHttps;
    private final String password;
    private final List<String> pathSegments;
    private final int port;
    private final List<String> queryNamesAndValues;
    private final String scheme;
    private final String url;
    private final String username;

    /* compiled from: HttpUrl.kt */
    public static final class Builder {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        public static final String INVALID_HOST = "Invalid URL host";
        private String encodedFragment;
        private String encodedPassword = "";
        private final List<String> encodedPathSegments;
        private List<String> encodedQueryNamesAndValues;
        private String encodedUsername = "";
        private String host;
        private int port = -1;
        private String scheme;

        /* compiled from: HttpUrl.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* access modifiers changed from: private */
            public final int parsePort(String str, int i, int i2) {
                try {
                    int parseInt = Integer.parseInt(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i, i2, "", false, false, false, false, (Charset) null, 248, (Object) null));
                    boolean z = false;
                    if (1 <= parseInt && parseInt < 65536) {
                        z = true;
                    }
                    if (z) {
                        return parseInt;
                    }
                    return -1;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            /* access modifiers changed from: private */
            public final int portColonOffset(String str, int i, int i2) {
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt == '[') {
                        do {
                            i++;
                            if (i >= i2) {
                                break;
                            }
                        } while (str.charAt(i) == ']');
                    } else if (charAt == ':') {
                        return i;
                    }
                    i++;
                }
                return i2;
            }

            /* access modifiers changed from: private */
            public final int schemeDelimiterOffset(String str, int i, int i2) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                boolean z5;
                if (i2 - i < 2) {
                    return -1;
                }
                char charAt = str.charAt(i);
                if ((C12775o.m28641k(charAt, 97) < 0 || C12775o.m28641k(charAt, 122) > 0) && (C12775o.m28641k(charAt, 65) < 0 || C12775o.m28641k(charAt, 90) > 0)) {
                    return -1;
                }
                int i3 = i + 1;
                while (i3 < i2) {
                    int i4 = i3 + 1;
                    char charAt2 = str.charAt(i3);
                    boolean z6 = false;
                    if ('a' > charAt2 || charAt2 >= '{') {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z && ('A' > charAt2 || charAt2 >= '[')) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!z2 && ('0' > charAt2 || charAt2 >= ':')) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (!z3 && charAt2 != '+') {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (!z4 && charAt2 != '-') {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    if (z5 || charAt2 == '.') {
                        z6 = true;
                    }
                    if (z6) {
                        i3 = i4;
                    } else if (charAt2 == ':') {
                        return i3;
                    } else {
                        return -1;
                    }
                }
                return -1;
            }

            /* access modifiers changed from: private */
            public final int slashCount(String str, int i, int i2) {
                int i3 = 0;
                while (i < i2) {
                    int i4 = i + 1;
                    char charAt = str.charAt(i);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i3++;
                    i = i4;
                }
                return i3;
            }
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add("");
        }

        private final int effectivePort() {
            int i = this.port;
            if (i != -1) {
                return i;
            }
            Companion companion = HttpUrl.Companion;
            String str = this.scheme;
            C12775o.m28636f(str);
            return companion.defaultPort(str);
        }

        private final boolean isDot(String str) {
            if (C12775o.m28634d(str, ".") || C13754v.m31530r(str, "%2e", true)) {
                return true;
            }
            return false;
        }

        private final boolean isDotDot(String str) {
            if (C12775o.m28634d(str, "..") || C13754v.m31530r(str, "%2e.", true) || C13754v.m31530r(str, ".%2e", true) || C13754v.m31530r(str, "%2e%2e", true)) {
                return true;
            }
            return false;
        }

        private final void pop() {
            boolean z;
            List<String> list = this.encodedPathSegments;
            if (list.remove(list.size() - 1).length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z || !(!this.encodedPathSegments.isEmpty())) {
                this.encodedPathSegments.add("");
                return;
            }
            List<String> list2 = this.encodedPathSegments;
            list2.set(list2.size() - 1, "");
        }

        private final void push(String str, int i, int i2, boolean z, boolean z2) {
            boolean z3;
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i, i2, HttpUrl.PATH_SEGMENT_ENCODE_SET, z2, false, false, false, (Charset) null, OAuthErrorCodes.ERR_OAUTH_HEADERS, (Object) null);
            if (!isDot(canonicalize$okhttp$default)) {
                if (isDotDot(canonicalize$okhttp$default)) {
                    pop();
                    return;
                }
                List<String> list = this.encodedPathSegments;
                if (list.get(list.size() - 1).length() == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    List<String> list2 = this.encodedPathSegments;
                    list2.set(list2.size() - 1, canonicalize$okhttp$default);
                } else {
                    this.encodedPathSegments.add(canonicalize$okhttp$default);
                }
                if (z) {
                    this.encodedPathSegments.add("");
                }
            }
        }

        private final void removeAllCanonicalQueryParameters(String str) {
            List<String> list = this.encodedQueryNamesAndValues;
            C12775o.m28636f(list);
            int size = list.size() - 2;
            int c = C12624c.m28013c(size, 0, -2);
            if (c <= size) {
                while (true) {
                    int i = size - 2;
                    List<String> list2 = this.encodedQueryNamesAndValues;
                    C12775o.m28636f(list2);
                    if (C12775o.m28634d(str, list2.get(size))) {
                        List<String> list3 = this.encodedQueryNamesAndValues;
                        C12775o.m28636f(list3);
                        list3.remove(size + 1);
                        List<String> list4 = this.encodedQueryNamesAndValues;
                        C12775o.m28636f(list4);
                        list4.remove(size);
                        List<String> list5 = this.encodedQueryNamesAndValues;
                        C12775o.m28636f(list5);
                        if (list5.isEmpty()) {
                            this.encodedQueryNamesAndValues = null;
                            return;
                        }
                    }
                    if (size != c) {
                        size = i;
                    } else {
                        return;
                    }
                }
            }
        }

        private final void resolvePath(String str, int i, int i2) {
            boolean z;
            if (i != i2) {
                char charAt = str.charAt(i);
                if (charAt == '/' || charAt == '\\') {
                    this.encodedPathSegments.clear();
                    this.encodedPathSegments.add("");
                    i++;
                } else {
                    List<String> list = this.encodedPathSegments;
                    list.set(list.size() - 1, "");
                }
                while (true) {
                    int i3 = i;
                    while (true) {
                        if (i3 < i2) {
                            i = Util.delimiterOffset(str, "/\\", i3, i2);
                            if (i < i2) {
                                z = true;
                            } else {
                                z = false;
                            }
                            push(str, i3, i, z, true);
                            if (z) {
                                i3 = i + 1;
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
        }

        public final Builder addEncodedPathSegment(String str) {
            C12775o.m28639i(str, "encodedPathSegment");
            push(str, 0, str.length(), false, true);
            return this;
        }

        public final Builder addEncodedPathSegments(String str) {
            C12775o.m28639i(str, "encodedPathSegments");
            return addPathSegments(str, true);
        }

        public final Builder addEncodedQueryParameter(String str, String str2) {
            String str3;
            C12775o.m28639i(str, "encodedName");
            if (getEncodedQueryNamesAndValues$okhttp() == null) {
                setEncodedQueryNamesAndValues$okhttp(new ArrayList());
            }
            List<String> encodedQueryNamesAndValues$okhttp = getEncodedQueryNamesAndValues$okhttp();
            C12775o.m28636f(encodedQueryNamesAndValues$okhttp);
            Companion companion = HttpUrl.Companion;
            encodedQueryNamesAndValues$okhttp.add(Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, (Charset) null, 211, (Object) null));
            List<String> encodedQueryNamesAndValues$okhttp2 = getEncodedQueryNamesAndValues$okhttp();
            C12775o.m28636f(encodedQueryNamesAndValues$okhttp2);
            if (str2 == null) {
                str3 = null;
            } else {
                str3 = Companion.canonicalize$okhttp$default(companion, str2, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, (Charset) null, 211, (Object) null);
            }
            encodedQueryNamesAndValues$okhttp2.add(str3);
            return this;
        }

        public final Builder addPathSegment(String str) {
            C12775o.m28639i(str, "pathSegment");
            push(str, 0, str.length(), false, false);
            return this;
        }

        public final Builder addPathSegments(String str) {
            C12775o.m28639i(str, "pathSegments");
            return addPathSegments(str, false);
        }

        public final Builder addQueryParameter(String str, String str2) {
            String str3;
            C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
            if (getEncodedQueryNamesAndValues$okhttp() == null) {
                setEncodedQueryNamesAndValues$okhttp(new ArrayList());
            }
            List<String> encodedQueryNamesAndValues$okhttp = getEncodedQueryNamesAndValues$okhttp();
            C12775o.m28636f(encodedQueryNamesAndValues$okhttp);
            Companion companion = HttpUrl.Companion;
            encodedQueryNamesAndValues$okhttp.add(Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, (Charset) null, 219, (Object) null));
            List<String> encodedQueryNamesAndValues$okhttp2 = getEncodedQueryNamesAndValues$okhttp();
            C12775o.m28636f(encodedQueryNamesAndValues$okhttp2);
            if (str2 == null) {
                str3 = null;
            } else {
                str3 = Companion.canonicalize$okhttp$default(companion, str2, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, (Charset) null, 219, (Object) null);
            }
            encodedQueryNamesAndValues$okhttp2.add(str3);
            return this;
        }

        public final HttpUrl build() {
            ArrayList arrayList;
            String str;
            String str2;
            String str3 = this.scheme;
            if (str3 != null) {
                Companion companion = HttpUrl.Companion;
                String percentDecode$okhttp$default = Companion.percentDecode$okhttp$default(companion, this.encodedUsername, 0, 0, false, 7, (Object) null);
                String percentDecode$okhttp$default2 = Companion.percentDecode$okhttp$default(companion, this.encodedPassword, 0, 0, false, 7, (Object) null);
                String str4 = this.host;
                if (str4 != null) {
                    int effectivePort = effectivePort();
                    Iterable<String> iterable = this.encodedPathSegments;
                    ArrayList arrayList2 = new ArrayList(C12728x.m28544v(iterable, 10));
                    for (String percentDecode$okhttp$default3 : iterable) {
                        arrayList2.add(Companion.percentDecode$okhttp$default(HttpUrl.Companion, percentDecode$okhttp$default3, 0, 0, false, 7, (Object) null));
                    }
                    List<String> list = this.encodedQueryNamesAndValues;
                    if (list == null) {
                        arrayList = null;
                    } else {
                        Iterable<String> iterable2 = list;
                        arrayList = new ArrayList(C12728x.m28544v(iterable2, 10));
                        for (String str5 : iterable2) {
                            if (str5 == null) {
                                str2 = null;
                            } else {
                                str2 = Companion.percentDecode$okhttp$default(HttpUrl.Companion, str5, 0, 0, true, 3, (Object) null);
                            }
                            arrayList.add(str2);
                        }
                    }
                    String str6 = this.encodedFragment;
                    if (str6 == null) {
                        str = null;
                    } else {
                        str = Companion.percentDecode$okhttp$default(HttpUrl.Companion, str6, 0, 0, false, 7, (Object) null);
                    }
                    return new HttpUrl(str3, percentDecode$okhttp$default, percentDecode$okhttp$default2, str4, effectivePort, arrayList2, arrayList, str, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        public final Builder encodedFragment(String str) {
            String str2;
            if (str == null) {
                str2 = null;
            } else {
                str2 = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "", true, false, false, true, (Charset) null, 179, (Object) null);
            }
            setEncodedFragment$okhttp(str2);
            return this;
        }

        public final Builder encodedPassword(String str) {
            C12775o.m28639i(str, "encodedPassword");
            setEncodedPassword$okhttp(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 243, (Object) null));
            return this;
        }

        public final Builder encodedPath(String str) {
            C12775o.m28639i(str, "encodedPath");
            if (C13754v.m31525E(str, "/", false, 2, (Object) null)) {
                resolvePath(str, 0, str.length());
                return this;
            }
            throw new IllegalArgumentException(C12775o.m28647q("unexpected encodedPath: ", str).toString());
        }

        public final Builder encodedQuery(String str) {
            List<String> list = null;
            if (str != null) {
                Companion companion = HttpUrl.Companion;
                String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, (Charset) null, 211, (Object) null);
                if (canonicalize$okhttp$default != null) {
                    list = companion.toQueryNamesAndValues$okhttp(canonicalize$okhttp$default);
                }
            }
            setEncodedQueryNamesAndValues$okhttp(list);
            return this;
        }

        public final Builder encodedUsername(String str) {
            C12775o.m28639i(str, "encodedUsername");
            setEncodedUsername$okhttp(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 243, (Object) null));
            return this;
        }

        public final Builder fragment(String str) {
            String str2;
            if (str == null) {
                str2 = null;
            } else {
                str2 = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "", false, false, false, true, (Charset) null, 187, (Object) null);
            }
            setEncodedFragment$okhttp(str2);
            return this;
        }

        public final String getEncodedFragment$okhttp() {
            return this.encodedFragment;
        }

        public final String getEncodedPassword$okhttp() {
            return this.encodedPassword;
        }

        public final List<String> getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        public final String getEncodedUsername$okhttp() {
            return this.encodedUsername;
        }

        public final String getHost$okhttp() {
            return this.host;
        }

        public final int getPort$okhttp() {
            return this.port;
        }

        public final String getScheme$okhttp() {
            return this.scheme;
        }

        public final Builder host(String str) {
            C12775o.m28639i(str, "host");
            String canonicalHost = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, str, 0, 0, false, 7, (Object) null));
            if (canonicalHost != null) {
                setHost$okhttp(canonicalHost);
                return this;
            }
            throw new IllegalArgumentException(C12775o.m28647q("unexpected host: ", str));
        }

        public final Builder parse$okhttp(HttpUrl httpUrl, String str) {
            int i;
            int delimiterOffset;
            char c;
            int i2;
            String str2;
            boolean z;
            boolean z2;
            int i3;
            boolean z3;
            String str3;
            int i4;
            boolean z4;
            String str4 = str;
            C12775o.m28639i(str4, "input");
            int indexOfFirstNonAsciiWhitespace$default = Util.indexOfFirstNonAsciiWhitespace$default(str4, 0, 0, 3, (Object) null);
            int indexOfLastNonAsciiWhitespace$default = Util.indexOfLastNonAsciiWhitespace$default(str4, indexOfFirstNonAsciiWhitespace$default, 0, 2, (Object) null);
            Companion companion = Companion;
            int access$schemeDelimiterOffset = companion.schemeDelimiterOffset(str4, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            String str5 = "this as java.lang.String…ing(startIndex, endIndex)";
            boolean z5 = true;
            char c2 = 65535;
            if (access$schemeDelimiterOffset != -1) {
                if (C13754v.m31522B(str4, "https:", indexOfFirstNonAsciiWhitespace$default, true)) {
                    this.scheme = "https";
                    indexOfFirstNonAsciiWhitespace$default += 6;
                } else if (C13754v.m31522B(str4, "http:", indexOfFirstNonAsciiWhitespace$default, true)) {
                    this.scheme = ProxyConfig.MATCH_HTTP;
                    indexOfFirstNonAsciiWhitespace$default += 5;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expected URL scheme 'http' or 'https' but was '");
                    String substring = str4.substring(0, access$schemeDelimiterOffset);
                    C12775o.m28638h(substring, str5);
                    sb.append(substring);
                    sb.append('\'');
                    throw new IllegalArgumentException(sb.toString());
                }
            } else if (httpUrl != null) {
                this.scheme = httpUrl.scheme();
            } else {
                if (str.length() > 6) {
                    str4 = C12775o.m28647q(C13760y.m31607S0(str4, 6), "...");
                }
                throw new IllegalArgumentException(C12775o.m28647q("Expected URL scheme 'http' or 'https' but no scheme was found for ", str4));
            }
            int access$slashCount = companion.slashCount(str4, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            char c3 = '?';
            char c4 = '#';
            if (access$slashCount >= 2 || httpUrl == null || !C12775o.m28634d(httpUrl.scheme(), this.scheme)) {
                int i5 = indexOfFirstNonAsciiWhitespace$default + access$slashCount;
                boolean z6 = false;
                boolean z7 = false;
                while (true) {
                    delimiterOffset = Util.delimiterOffset(str4, "@/\\?#", i5, indexOfLastNonAsciiWhitespace$default);
                    if (delimiterOffset != indexOfLastNonAsciiWhitespace$default) {
                        c = str4.charAt(delimiterOffset);
                    } else {
                        c = c2;
                    }
                    if (c == c2 || c == c4 || c == '/' || c == '\\' || c == c3) {
                        boolean z8 = z5;
                        String str6 = str5;
                        i = indexOfLastNonAsciiWhitespace$default;
                        int i6 = delimiterOffset;
                        Companion companion2 = Companion;
                        int access$portColonOffset = companion2.portColonOffset(str4, i5, i6);
                        int i7 = access$portColonOffset + 1;
                    } else if (c == '@') {
                        if (!z6) {
                            int delimiterOffset2 = Util.delimiterOffset(str4, ':', i5, delimiterOffset);
                            Companion companion3 = HttpUrl.Companion;
                            String str7 = "%40";
                            int i8 = delimiterOffset;
                            int i9 = delimiterOffset2;
                            z3 = z5;
                            i3 = indexOfLastNonAsciiWhitespace$default;
                            String str8 = str5;
                            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion3, str, i5, delimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, OAuthErrorCodes.ERR_OAUTH_HEADERS, (Object) null);
                            if (z7) {
                                canonicalize$okhttp$default = this.encodedUsername + str7 + canonicalize$okhttp$default;
                            }
                            this.encodedUsername = canonicalize$okhttp$default;
                            int i10 = i8;
                            int i11 = i9;
                            if (i11 != i10) {
                                this.encodedPassword = Companion.canonicalize$okhttp$default(companion3, str, i11 + 1, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, OAuthErrorCodes.ERR_OAUTH_HEADERS, (Object) null);
                                z4 = z3;
                            } else {
                                z4 = z6;
                            }
                            z6 = z4;
                            str3 = str8;
                            z7 = z3;
                            i4 = i10;
                        } else {
                            z3 = z5;
                            i3 = indexOfLastNonAsciiWhitespace$default;
                            String str9 = str5;
                            int i12 = delimiterOffset;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.encodedPassword);
                            sb2.append("%40");
                            StringBuilder sb3 = sb2;
                            str3 = str9;
                            i4 = i12;
                            sb3.append(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i5, i12, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, OAuthErrorCodes.ERR_OAUTH_HEADERS, (Object) null));
                            this.encodedPassword = sb3.toString();
                        }
                        i5 = i4 + 1;
                        str5 = str3;
                        z5 = z3;
                        indexOfLastNonAsciiWhitespace$default = i3;
                        c4 = '#';
                        c3 = '?';
                        c2 = 65535;
                    }
                }
                boolean z82 = z5;
                String str62 = str5;
                i = indexOfLastNonAsciiWhitespace$default;
                int i62 = delimiterOffset;
                Companion companion22 = Companion;
                int access$portColonOffset2 = companion22.portColonOffset(str4, i5, i62);
                int i72 = access$portColonOffset2 + 1;
                if (i72 < i62) {
                    i2 = i5;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, str, i5, access$portColonOffset2, false, 4, (Object) null));
                    int access$parsePort = companion22.parsePort(str4, i72, i62);
                    this.port = access$parsePort;
                    if (access$parsePort != -1) {
                        z2 = z82;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        str2 = str62;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        String substring2 = str4.substring(i72, i62);
                        C12775o.m28638h(substring2, str62);
                        sb4.append(substring2);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                } else {
                    i2 = i5;
                    str2 = str62;
                    Companion companion4 = HttpUrl.Companion;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(companion4, str, i2, access$portColonOffset2, false, 4, (Object) null));
                    String str10 = this.scheme;
                    C12775o.m28636f(str10);
                    this.port = companion4.defaultPort(str10);
                }
                if (this.host != null) {
                    z = z82;
                } else {
                    z = false;
                }
                if (z) {
                    indexOfFirstNonAsciiWhitespace$default = i62;
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    String substring3 = str4.substring(i2, access$portColonOffset2);
                    C12775o.m28638h(substring3, str2);
                    sb5.append(substring3);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
            } else {
                this.encodedUsername = httpUrl.encodedUsername();
                this.encodedPassword = httpUrl.encodedPassword();
                this.host = httpUrl.host();
                this.port = httpUrl.port();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(httpUrl.encodedPathSegments());
                if (indexOfFirstNonAsciiWhitespace$default == indexOfLastNonAsciiWhitespace$default || str4.charAt(indexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(httpUrl.encodedQuery());
                }
                i = indexOfLastNonAsciiWhitespace$default;
            }
            int i13 = i;
            int delimiterOffset3 = Util.delimiterOffset(str4, "?#", indexOfFirstNonAsciiWhitespace$default, i13);
            resolvePath(str4, indexOfFirstNonAsciiWhitespace$default, delimiterOffset3);
            if (delimiterOffset3 < i13 && str4.charAt(delimiterOffset3) == '?') {
                int delimiterOffset4 = Util.delimiterOffset(str4, '#', delimiterOffset3, i13);
                Companion companion5 = HttpUrl.Companion;
                this.encodedQueryNamesAndValues = companion5.toQueryNamesAndValues$okhttp(Companion.canonicalize$okhttp$default(companion5, str, delimiterOffset3 + 1, delimiterOffset4, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, (Charset) null, 208, (Object) null));
                delimiterOffset3 = delimiterOffset4;
            }
            if (delimiterOffset3 < i13 && str4.charAt(delimiterOffset3) == '#') {
                this.encodedFragment = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, delimiterOffset3 + 1, i13, "", true, false, false, true, (Charset) null, 176, (Object) null);
            }
            return this;
        }

        public final Builder password(String str) {
            C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_PASSWORD);
            setEncodedPassword$okhttp(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251, (Object) null));
            return this;
        }

        public final Builder port(int i) {
            boolean z = false;
            if (1 <= i && i < 65536) {
                z = true;
            }
            if (z) {
                setPort$okhttp(i);
                return this;
            }
            throw new IllegalArgumentException(C12775o.m28647q("unexpected port: ", Integer.valueOf(i)).toString());
        }

        public final Builder query(String str) {
            List<String> list = null;
            if (str != null) {
                Companion companion = HttpUrl.Companion;
                String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_ENCODE_SET, false, false, true, false, (Charset) null, 219, (Object) null);
                if (canonicalize$okhttp$default != null) {
                    list = companion.toQueryNamesAndValues$okhttp(canonicalize$okhttp$default);
                }
            }
            setEncodedQueryNamesAndValues$okhttp(list);
            return this;
        }

        public final Builder reencodeForUri$okhttp() {
            String str;
            String str2;
            String host$okhttp = getHost$okhttp();
            String str3 = null;
            if (host$okhttp == null) {
                str = null;
            } else {
                str = new C13735j("[\"<>^`{|}]").mo53413f(host$okhttp, "");
            }
            setHost$okhttp(str);
            int size = getEncodedPathSegments$okhttp().size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                getEncodedPathSegments$okhttp().set(i2, Companion.canonicalize$okhttp$default(HttpUrl.Companion, getEncodedPathSegments$okhttp().get(i2), 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, (Charset) null, OAuthErrorCodes.ERR_OAUTH_MISSING_SIG_METHOD, (Object) null));
            }
            List<String> encodedQueryNamesAndValues$okhttp = getEncodedQueryNamesAndValues$okhttp();
            if (encodedQueryNamesAndValues$okhttp != null) {
                int size2 = encodedQueryNamesAndValues$okhttp.size();
                while (i < size2) {
                    int i3 = i + 1;
                    String str4 = encodedQueryNamesAndValues$okhttp.get(i);
                    if (str4 == null) {
                        str2 = null;
                    } else {
                        str2 = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str4, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, (Charset) null, 195, (Object) null);
                    }
                    encodedQueryNamesAndValues$okhttp.set(i, str2);
                    i = i3;
                }
            }
            String encodedFragment$okhttp = getEncodedFragment$okhttp();
            if (encodedFragment$okhttp != null) {
                str3 = Companion.canonicalize$okhttp$default(HttpUrl.Companion, encodedFragment$okhttp, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, true, (Charset) null, 163, (Object) null);
            }
            setEncodedFragment$okhttp(str3);
            return this;
        }

        public final Builder removeAllEncodedQueryParameters(String str) {
            C12775o.m28639i(str, "encodedName");
            if (getEncodedQueryNamesAndValues$okhttp() == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, (Charset) null, 211, (Object) null));
            return this;
        }

        public final Builder removeAllQueryParameters(String str) {
            C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
            if (getEncodedQueryNamesAndValues$okhttp() == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, (Charset) null, 219, (Object) null));
            return this;
        }

        public final Builder removePathSegment(int i) {
            getEncodedPathSegments$okhttp().remove(i);
            if (getEncodedPathSegments$okhttp().isEmpty()) {
                getEncodedPathSegments$okhttp().add("");
            }
            return this;
        }

        public final Builder scheme(String str) {
            C12775o.m28639i(str, "scheme");
            if (C13754v.m31530r(str, ProxyConfig.MATCH_HTTP, true)) {
                setScheme$okhttp(ProxyConfig.MATCH_HTTP);
            } else if (C13754v.m31530r(str, "https", true)) {
                setScheme$okhttp("https");
            } else {
                throw new IllegalArgumentException(C12775o.m28647q("unexpected scheme: ", str));
            }
            return this;
        }

        public final void setEncodedFragment$okhttp(String str) {
            this.encodedFragment = str;
        }

        public final void setEncodedPassword$okhttp(String str) {
            C12775o.m28639i(str, "<set-?>");
            this.encodedPassword = str;
        }

        public final Builder setEncodedPathSegment(int i, String str) {
            boolean z;
            C12775o.m28639i(str, "encodedPathSegment");
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, true, false, false, false, (Charset) null, 243, (Object) null);
            getEncodedPathSegments$okhttp().set(i, canonicalize$okhttp$default);
            if (isDot(canonicalize$okhttp$default) || isDotDot(canonicalize$okhttp$default)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return this;
            }
            throw new IllegalArgumentException(C12775o.m28647q("unexpected path segment: ", str).toString());
        }

        public final void setEncodedQueryNamesAndValues$okhttp(List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        public final Builder setEncodedQueryParameter(String str, String str2) {
            C12775o.m28639i(str, "encodedName");
            removeAllEncodedQueryParameters(str);
            addEncodedQueryParameter(str, str2);
            return this;
        }

        public final void setEncodedUsername$okhttp(String str) {
            C12775o.m28639i(str, "<set-?>");
            this.encodedUsername = str;
        }

        public final void setHost$okhttp(String str) {
            this.host = str;
        }

        public final Builder setPathSegment(int i, String str) {
            boolean z;
            C12775o.m28639i(str, "pathSegment");
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, false, false, false, false, (Charset) null, 251, (Object) null);
            if (isDot(canonicalize$okhttp$default) || isDotDot(canonicalize$okhttp$default)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                getEncodedPathSegments$okhttp().set(i, canonicalize$okhttp$default);
                return this;
            }
            throw new IllegalArgumentException(C12775o.m28647q("unexpected path segment: ", str).toString());
        }

        public final void setPort$okhttp(int i) {
            this.port = i;
        }

        public final Builder setQueryParameter(String str, String str2) {
            C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
            removeAllQueryParameters(str);
            addQueryParameter(str, str2);
            return this;
        }

        public final void setScheme$okhttp(String str) {
            this.scheme = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
            if (r1 != false) goto L_0x003f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b5, code lost:
            if (r1 != r2.defaultPort(r3)) goto L_0x00b7;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.getScheme$okhttp()
                if (r1 == 0) goto L_0x0018
                java.lang.String r1 = r6.getScheme$okhttp()
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L_0x001d
            L_0x0018:
                java.lang.String r1 = "//"
                r0.append(r1)
            L_0x001d:
                java.lang.String r1 = r6.getEncodedUsername$okhttp()
                int r1 = r1.length()
                r2 = 1
                r3 = 0
                if (r1 <= 0) goto L_0x002b
                r1 = r2
                goto L_0x002c
            L_0x002b:
                r1 = r3
            L_0x002c:
                r4 = 58
                if (r1 != 0) goto L_0x003f
                java.lang.String r1 = r6.getEncodedPassword$okhttp()
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x003c
                r1 = r2
                goto L_0x003d
            L_0x003c:
                r1 = r3
            L_0x003d:
                if (r1 == 0) goto L_0x0063
            L_0x003f:
                java.lang.String r1 = r6.getEncodedUsername$okhttp()
                r0.append(r1)
                java.lang.String r1 = r6.getEncodedPassword$okhttp()
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0051
                goto L_0x0052
            L_0x0051:
                r2 = r3
            L_0x0052:
                if (r2 == 0) goto L_0x005e
                r0.append(r4)
                java.lang.String r1 = r6.getEncodedPassword$okhttp()
                r0.append(r1)
            L_0x005e:
                r1 = 64
                r0.append(r1)
            L_0x0063:
                java.lang.String r1 = r6.getHost$okhttp()
                if (r1 == 0) goto L_0x0091
                java.lang.String r1 = r6.getHost$okhttp()
                kotlin.jvm.internal.C12775o.m28636f(r1)
                r2 = 2
                r5 = 0
                boolean r1 = p454wf.C13755w.m31550I(r1, r4, r3, r2, r5)
                if (r1 == 0) goto L_0x008a
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.getHost$okhttp()
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L_0x0091
            L_0x008a:
                java.lang.String r1 = r6.getHost$okhttp()
                r0.append(r1)
            L_0x0091:
                int r1 = r6.getPort$okhttp()
                r2 = -1
                if (r1 != r2) goto L_0x009e
                java.lang.String r1 = r6.getScheme$okhttp()
                if (r1 == 0) goto L_0x00bd
            L_0x009e:
                int r1 = r6.effectivePort()
                java.lang.String r2 = r6.getScheme$okhttp()
                if (r2 == 0) goto L_0x00b7
                okhttp3.HttpUrl$Companion r2 = okhttp3.HttpUrl.Companion
                java.lang.String r3 = r6.getScheme$okhttp()
                kotlin.jvm.internal.C12775o.m28636f(r3)
                int r2 = r2.defaultPort(r3)
                if (r1 == r2) goto L_0x00bd
            L_0x00b7:
                r0.append(r4)
                r0.append(r1)
            L_0x00bd:
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                java.util.List r2 = r6.getEncodedPathSegments$okhttp()
                r1.toPathString$okhttp(r2, r0)
                java.util.List r2 = r6.getEncodedQueryNamesAndValues$okhttp()
                if (r2 == 0) goto L_0x00db
                r2 = 63
                r0.append(r2)
                java.util.List r2 = r6.getEncodedQueryNamesAndValues$okhttp()
                kotlin.jvm.internal.C12775o.m28636f(r2)
                r1.toQueryString$okhttp(r2, r0)
            L_0x00db:
                java.lang.String r1 = r6.getEncodedFragment$okhttp()
                if (r1 == 0) goto L_0x00ed
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.getEncodedFragment$okhttp()
                r0.append(r1)
            L_0x00ed:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                kotlin.jvm.internal.C12775o.m28638h(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.toString():java.lang.String");
        }

        public final Builder username(String str) {
            C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_USERNAME);
            setEncodedUsername$okhttp(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251, (Object) null));
            return this;
        }

        private final Builder addPathSegments(String str, boolean z) {
            int i = 0;
            do {
                int delimiterOffset = Util.delimiterOffset(str, "/\\", i, str.length());
                push(str, i, delimiterOffset, delimiterOffset < str.length(), z);
                i = delimiterOffset + 1;
            } while (i <= str.length());
            return this;
        }
    }

    /* compiled from: HttpUrl.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ String canonicalize$okhttp$default(Companion companion, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3, Object obj) {
            int i4 = i3;
            return companion.canonicalize$okhttp(str, (i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? str.length() : i2, str2, (i4 & 8) != 0 ? false : z, (i4 & 16) != 0 ? false : z2, (i4 & 32) != 0 ? false : z3, (i4 & 64) != 0 ? false : z4, (i4 & 128) != 0 ? null : charset);
        }

        private final boolean isPercentEncoded(String str, int i, int i2) {
            int i3 = i + 2;
            if (i3 >= i2 || str.charAt(i) != '%' || Util.parseHexDigit(str.charAt(i + 1)) == -1 || Util.parseHexDigit(str.charAt(i3)) == -1) {
                return false;
            }
            return true;
        }

        public static /* synthetic */ String percentDecode$okhttp$default(Companion companion, String str, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            return companion.percentDecode$okhttp(str, i, i2, z);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:33:0x005f, code lost:
            if (isPercentEncoded(r1, r5, r2) == false) goto L_0x006c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void writeCanonicalized(okio.C13121c r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) {
            /*
                r14 = this;
                r0 = r15
                r1 = r16
                r2 = r18
                r3 = r24
                r4 = 0
                r5 = r17
                r6 = r4
            L_0x000b:
                if (r5 >= r2) goto L_0x00b9
                int r7 = r1.codePointAt(r5)
                if (r20 == 0) goto L_0x0028
                r8 = 9
                if (r7 == r8) goto L_0x0023
                r8 = 10
                if (r7 == r8) goto L_0x0023
                r8 = 12
                if (r7 == r8) goto L_0x0023
                r8 = 13
                if (r7 != r8) goto L_0x0028
            L_0x0023:
                r8 = r14
                r12 = r19
                goto L_0x00b2
            L_0x0028:
                r8 = 43
                if (r7 != r8) goto L_0x0039
                if (r22 == 0) goto L_0x0039
                if (r20 == 0) goto L_0x0033
                java.lang.String r8 = "+"
                goto L_0x0035
            L_0x0033:
                java.lang.String r8 = "%2B"
            L_0x0035:
                r15.mo52486F(r8)
                goto L_0x0023
            L_0x0039:
                r8 = 32
                r9 = 37
                if (r7 < r8) goto L_0x0069
                r8 = 127(0x7f, float:1.78E-43)
                if (r7 == r8) goto L_0x0069
                r8 = 128(0x80, float:1.794E-43)
                if (r7 < r8) goto L_0x0049
                if (r23 == 0) goto L_0x0069
            L_0x0049:
                char r8 = (char) r7
                r10 = 0
                r11 = 2
                r12 = r19
                boolean r8 = p454wf.C13755w.m31550I(r12, r8, r10, r11, r4)
                if (r8 != 0) goto L_0x0067
                if (r7 != r9) goto L_0x0062
                if (r20 == 0) goto L_0x0067
                if (r21 == 0) goto L_0x0062
                r8 = r14
                boolean r10 = r14.isPercentEncoded(r1, r5, r2)
                if (r10 != 0) goto L_0x0063
                goto L_0x006c
            L_0x0062:
                r8 = r14
            L_0x0063:
                r15.mo52509V0(r7)
                goto L_0x00b2
            L_0x0067:
                r8 = r14
                goto L_0x006c
            L_0x0069:
                r8 = r14
                r12 = r19
            L_0x006c:
                if (r6 != 0) goto L_0x0073
                okio.c r6 = new okio.c
                r6.<init>()
            L_0x0073:
                if (r3 == 0) goto L_0x0087
                java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
                boolean r10 = kotlin.jvm.internal.C12775o.m28634d(r3, r10)
                if (r10 == 0) goto L_0x007e
                goto L_0x0087
            L_0x007e:
                int r10 = java.lang.Character.charCount(r7)
                int r10 = r10 + r5
                r6.mo52503Q0(r1, r5, r10, r3)
                goto L_0x008a
            L_0x0087:
                r6.mo52509V0(r7)
            L_0x008a:
                boolean r10 = r6.mo52552t()
                if (r10 != 0) goto L_0x00b2
                byte r10 = r6.readByte()
                r10 = r10 & 255(0xff, float:3.57E-43)
                r15.writeByte(r9)
                char[] r11 = okhttp3.HttpUrl.HEX_DIGITS
                int r13 = r10 >> 4
                r13 = r13 & 15
                char r11 = r11[r13]
                r15.writeByte(r11)
                char[] r11 = okhttp3.HttpUrl.HEX_DIGITS
                r10 = r10 & 15
                char r10 = r11[r10]
                r15.writeByte(r10)
                goto L_0x008a
            L_0x00b2:
                int r7 = java.lang.Character.charCount(r7)
                int r5 = r5 + r7
                goto L_0x000b
            L_0x00b9:
                r8 = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Companion.writeCanonicalized(okio.c, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        private final void writePercentDecoded(C13121c cVar, String str, int i, int i2, boolean z) {
            int i3;
            while (i < i2) {
                int codePointAt = str.codePointAt(i);
                if (codePointAt == 37 && (i3 = i + 2) < i2) {
                    int parseHexDigit = Util.parseHexDigit(str.charAt(i + 1));
                    int parseHexDigit2 = Util.parseHexDigit(str.charAt(i3));
                    if (!(parseHexDigit == -1 || parseHexDigit2 == -1)) {
                        cVar.writeByte((parseHexDigit << 4) + parseHexDigit2);
                        i = Character.charCount(codePointAt) + i3;
                    }
                } else if (codePointAt == 43 && z) {
                    cVar.writeByte(32);
                    i++;
                }
                cVar.mo52509V0(codePointAt);
                i += Character.charCount(codePointAt);
            }
        }

        /* renamed from: -deprecated_get  reason: not valid java name */
        public final HttpUrl m38811deprecated_get(String str) {
            C12775o.m28639i(str, "url");
            return get(str);
        }

        /* renamed from: -deprecated_parse  reason: not valid java name */
        public final HttpUrl m38814deprecated_parse(String str) {
            C12775o.m28639i(str, "url");
            return parse(str);
        }

        public final String canonicalize$okhttp(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
            String str3 = str;
            int i3 = i2;
            String str4 = str2;
            C12775o.m28639i(str, "<this>");
            C12775o.m28639i(str4, "encodeSet");
            int i4 = i;
            while (i4 < i3) {
                int codePointAt = str.codePointAt(i4);
                if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || z4) && !C13755w.m31550I(str4, (char) codePointAt, false, 2, (Object) null))) {
                    if (codePointAt == 37) {
                        if (z) {
                            if (z2) {
                                if (!isPercentEncoded(str, i4, i3)) {
                                    C13121c cVar = new C13121c();
                                    int i5 = i;
                                    cVar.mo52508U0(str, i, i4);
                                    writeCanonicalized(cVar, str, i4, i2, str2, z, z2, z3, z4, charset);
                                    return cVar.mo52482B0();
                                }
                                if (codePointAt == 43 || !z3) {
                                    i4 += Character.charCount(codePointAt);
                                } else {
                                    C13121c cVar2 = new C13121c();
                                    int i52 = i;
                                    cVar2.mo52508U0(str, i, i4);
                                    writeCanonicalized(cVar2, str, i4, i2, str2, z, z2, z3, z4, charset);
                                    return cVar2.mo52482B0();
                                }
                            }
                        }
                    }
                    if (codePointAt == 43) {
                    }
                    i4 += Character.charCount(codePointAt);
                }
                C13121c cVar22 = new C13121c();
                int i522 = i;
                cVar22.mo52508U0(str, i, i4);
                writeCanonicalized(cVar22, str, i4, i2, str2, z, z2, z3, z4, charset);
                return cVar22.mo52482B0();
            }
            int i6 = i;
            String substring = str.substring(i, i2);
            C12775o.m28638h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        public final int defaultPort(String str) {
            C12775o.m28639i(str, "scheme");
            if (C12775o.m28634d(str, ProxyConfig.MATCH_HTTP)) {
                return 80;
            }
            if (C12775o.m28634d(str, "https")) {
                return 443;
            }
            return -1;
        }

        public final HttpUrl get(String str) {
            C12775o.m28639i(str, "<this>");
            return new Builder().parse$okhttp((HttpUrl) null, str).build();
        }

        public final HttpUrl parse(String str) {
            C12775o.m28639i(str, "<this>");
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final String percentDecode$okhttp(String str, int i, int i2, boolean z) {
            C12775o.m28639i(str, "<this>");
            int i3 = i;
            while (i3 < i2) {
                int i4 = i3 + 1;
                char charAt = str.charAt(i3);
                if (charAt == '%' || (charAt == '+' && z)) {
                    C13121c cVar = new C13121c();
                    cVar.mo52508U0(str, i, i3);
                    writePercentDecoded(cVar, str, i3, i2, z);
                    return cVar.mo52482B0();
                }
                i3 = i4;
            }
            String substring = str.substring(i, i2);
            C12775o.m28638h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        public final void toPathString$okhttp(List<String> list, StringBuilder sb) {
            C12775o.m28639i(list, "<this>");
            C12775o.m28639i(sb, "out");
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append('/');
                sb.append(list.get(i));
            }
        }

        public final List<String> toQueryNamesAndValues$okhttp(String str) {
            C12775o.m28639i(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int V = C13755w.m31570V(str, '&', i, false, 4, (Object) null);
                if (V == -1) {
                    V = str.length();
                }
                int i2 = V;
                int V2 = C13755w.m31570V(str, '=', i, false, 4, (Object) null);
                if (V2 == -1 || V2 > i2) {
                    String substring = str.substring(i, i2);
                    C12775o.m28638h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    arrayList.add((Object) null);
                } else {
                    String substring2 = str.substring(i, V2);
                    C12775o.m28638h(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    String substring3 = str.substring(V2 + 1, i2);
                    C12775o.m28638h(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                }
                i = i2 + 1;
            }
            return arrayList;
        }

        public final void toQueryString$okhttp(List<String> list, StringBuilder sb) {
            C12775o.m28639i(list, "<this>");
            C12775o.m28639i(sb, "out");
            C13525d s = C13537l.m30892s(C13537l.m30893t(0, list.size()), 2);
            int j = s.mo53147j();
            int k = s.mo53148k();
            int q = s.mo53149q();
            if ((q > 0 && j <= k) || (q < 0 && k <= j)) {
                while (true) {
                    int i = j + q;
                    String str = list.get(j);
                    String str2 = list.get(j + 1);
                    if (j > 0) {
                        sb.append('&');
                    }
                    sb.append(str);
                    if (str2 != null) {
                        sb.append('=');
                        sb.append(str2);
                    }
                    if (j != k) {
                        j = i;
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: -deprecated_get  reason: not valid java name */
        public final HttpUrl m38813deprecated_get(URL url) {
            C12775o.m28639i(url, "url");
            return get(url);
        }

        public final HttpUrl get(URL url) {
            C12775o.m28639i(url, "<this>");
            String url2 = url.toString();
            C12775o.m28638h(url2, "toString()");
            return parse(url2);
        }

        /* renamed from: -deprecated_get  reason: not valid java name */
        public final HttpUrl m38812deprecated_get(URI uri) {
            C12775o.m28639i(uri, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
            return get(uri);
        }

        public final HttpUrl get(URI uri) {
            C12775o.m28639i(uri, "<this>");
            String uri2 = uri.toString();
            C12775o.m28638h(uri2, "toString()");
            return parse(uri2);
        }
    }

    public HttpUrl(String str, String str2, String str3, String str4, int i, List<String> list, List<String> list2, String str5, String str6) {
        C12775o.m28639i(str, "scheme");
        C12775o.m28639i(str2, HintConstants.AUTOFILL_HINT_USERNAME);
        C12775o.m28639i(str3, HintConstants.AUTOFILL_HINT_PASSWORD);
        C12775o.m28639i(str4, "host");
        C12775o.m28639i(list, "pathSegments");
        C12775o.m28639i(str6, "url");
        this.scheme = str;
        this.username = str2;
        this.password = str3;
        this.host = str4;
        this.port = i;
        this.pathSegments = list;
        this.queryNamesAndValues = list2;
        this.fragment = str5;
        this.url = str6;
        this.isHttps = C12775o.m28634d(str, "https");
    }

    public static final int defaultPort(String str) {
        return Companion.defaultPort(str);
    }

    public static final HttpUrl get(String str) {
        return Companion.get(str);
    }

    public static final HttpUrl parse(String str) {
        return Companion.parse(str);
    }

    /* renamed from: -deprecated_encodedFragment  reason: not valid java name */
    public final String m38792deprecated_encodedFragment() {
        return encodedFragment();
    }

    /* renamed from: -deprecated_encodedPassword  reason: not valid java name */
    public final String m38793deprecated_encodedPassword() {
        return encodedPassword();
    }

    /* renamed from: -deprecated_encodedPath  reason: not valid java name */
    public final String m38794deprecated_encodedPath() {
        return encodedPath();
    }

    /* renamed from: -deprecated_encodedPathSegments  reason: not valid java name */
    public final List<String> m38795deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    /* renamed from: -deprecated_encodedQuery  reason: not valid java name */
    public final String m38796deprecated_encodedQuery() {
        return encodedQuery();
    }

    /* renamed from: -deprecated_encodedUsername  reason: not valid java name */
    public final String m38797deprecated_encodedUsername() {
        return encodedUsername();
    }

    /* renamed from: -deprecated_fragment  reason: not valid java name */
    public final String m38798deprecated_fragment() {
        return this.fragment;
    }

    /* renamed from: -deprecated_host  reason: not valid java name */
    public final String m38799deprecated_host() {
        return this.host;
    }

    /* renamed from: -deprecated_password  reason: not valid java name */
    public final String m38800deprecated_password() {
        return this.password;
    }

    /* renamed from: -deprecated_pathSegments  reason: not valid java name */
    public final List<String> m38801deprecated_pathSegments() {
        return this.pathSegments;
    }

    /* renamed from: -deprecated_pathSize  reason: not valid java name */
    public final int m38802deprecated_pathSize() {
        return pathSize();
    }

    /* renamed from: -deprecated_port  reason: not valid java name */
    public final int m38803deprecated_port() {
        return this.port;
    }

    /* renamed from: -deprecated_query  reason: not valid java name */
    public final String m38804deprecated_query() {
        return query();
    }

    /* renamed from: -deprecated_queryParameterNames  reason: not valid java name */
    public final Set<String> m38805deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    /* renamed from: -deprecated_querySize  reason: not valid java name */
    public final int m38806deprecated_querySize() {
        return querySize();
    }

    /* renamed from: -deprecated_scheme  reason: not valid java name */
    public final String m38807deprecated_scheme() {
        return this.scheme;
    }

    /* renamed from: -deprecated_uri  reason: not valid java name */
    public final URI m38808deprecated_uri() {
        return uri();
    }

    /* renamed from: -deprecated_url  reason: not valid java name */
    public final URL m38809deprecated_url() {
        return url();
    }

    /* renamed from: -deprecated_username  reason: not valid java name */
    public final String m38810deprecated_username() {
        return this.username;
    }

    public final String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        String substring = this.url.substring(C13755w.m31570V(this.url, '#', 0, false, 6, (Object) null) + 1);
        C12775o.m28638h(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public final String encodedPassword() {
        boolean z;
        if (this.password.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        String substring = this.url.substring(C13755w.m31570V(this.url, ':', this.scheme.length() + 3, false, 4, (Object) null) + 1, C13755w.m31570V(this.url, '@', 0, false, 6, (Object) null));
        C12775o.m28638h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String encodedPath() {
        int V = C13755w.m31570V(this.url, '/', this.scheme.length() + 3, false, 4, (Object) null);
        String str = this.url;
        String substring = this.url.substring(V, Util.delimiterOffset(str, "?#", V, str.length()));
        C12775o.m28638h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final List<String> encodedPathSegments() {
        int V = C13755w.m31570V(this.url, '/', this.scheme.length() + 3, false, 4, (Object) null);
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, "?#", V, str.length());
        ArrayList arrayList = new ArrayList();
        while (V < delimiterOffset) {
            int i = V + 1;
            int delimiterOffset2 = Util.delimiterOffset(this.url, '/', i, delimiterOffset);
            String substring = this.url.substring(i, delimiterOffset2);
            C12775o.m28638h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            V = delimiterOffset2;
        }
        return arrayList;
    }

    public final String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int V = C13755w.m31570V(this.url, '?', 0, false, 6, (Object) null) + 1;
        String str = this.url;
        String substring = this.url.substring(V, Util.delimiterOffset(str, '#', V, str.length()));
        C12775o.m28638h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String encodedUsername() {
        boolean z;
        if (this.username.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        String substring = this.url.substring(length, Util.delimiterOffset(str, ":@", length, str.length()));
        C12775o.m28638h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof HttpUrl) || !C12775o.m28634d(((HttpUrl) obj).url, this.url)) {
            return false;
        }
        return true;
    }

    public final String fragment() {
        return this.fragment;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public final String host() {
        return this.host;
    }

    public final boolean isHttps() {
        return this.isHttps;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.setScheme$okhttp(this.scheme);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        builder.setPort$okhttp(this.port != Companion.defaultPort(this.scheme) ? this.port : -1);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    public final String password() {
        return this.password;
    }

    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    public final int pathSize() {
        return this.pathSegments.size();
    }

    public final int port() {
        return this.port;
    }

    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Companion.toQueryString$okhttp(this.queryNamesAndValues, sb);
        return sb.toString();
    }

    public final String queryParameter(String str) {
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        C13525d s = C13537l.m30892s(C13537l.m30893t(0, list.size()), 2);
        int j = s.mo53147j();
        int k = s.mo53148k();
        int q = s.mo53149q();
        if ((q > 0 && j <= k) || (q < 0 && k <= j)) {
            while (true) {
                int i = j + q;
                if (C12775o.m28634d(str, this.queryNamesAndValues.get(j))) {
                    return this.queryNamesAndValues.get(j + 1);
                }
                if (j == k) {
                    break;
                }
                j = i;
            }
        }
        return null;
    }

    public final String queryParameterName(int i) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            String str = list.get(i * 2);
            C12775o.m28636f(str);
            return str;
        }
        throw new IndexOutOfBoundsException();
    }

    public final Set<String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return C12731y0.m28551e();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C13525d s = C13537l.m30892s(C13537l.m30893t(0, this.queryNamesAndValues.size()), 2);
        int j = s.mo53147j();
        int k = s.mo53148k();
        int q = s.mo53149q();
        if ((q > 0 && j <= k) || (q < 0 && k <= j)) {
            while (true) {
                int i = j + q;
                String str = this.queryNamesAndValues.get(j);
                C12775o.m28636f(str);
                linkedHashSet.add(str);
                if (j == k) {
                    break;
                }
                j = i;
            }
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        C12775o.m28638h(unmodifiableSet, "unmodifiableSet(result)");
        return unmodifiableSet;
    }

    public final String queryParameterValue(int i) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get((i * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List<String> queryParameterValues(String str) {
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        if (this.queryNamesAndValues == null) {
            return C12726w.m28524k();
        }
        ArrayList arrayList = new ArrayList();
        C13525d s = C13537l.m30892s(C13537l.m30893t(0, this.queryNamesAndValues.size()), 2);
        int j = s.mo53147j();
        int k = s.mo53148k();
        int q = s.mo53149q();
        if ((q > 0 && j <= k) || (q < 0 && k <= j)) {
            while (true) {
                int i = j + q;
                if (C12775o.m28634d(str, this.queryNamesAndValues.get(j))) {
                    arrayList.add(this.queryNamesAndValues.get(j + 1));
                }
                if (j == k) {
                    break;
                }
                j = i;
            }
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        C12775o.m28638h(unmodifiableList, "unmodifiableList(result)");
        return unmodifiableList;
    }

    public final int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public final String redact() {
        Builder newBuilder = newBuilder("/...");
        C12775o.m28636f(newBuilder);
        return newBuilder.username("").password("").build().toString();
    }

    public final HttpUrl resolve(String str) {
        C12775o.m28639i(str, "link");
        Builder newBuilder = newBuilder(str);
        if (newBuilder == null) {
            return null;
        }
        return newBuilder.build();
    }

    public final String scheme() {
        return this.scheme;
    }

    public String toString() {
        return this.url;
    }

    public final String topPrivateDomain() {
        if (Util.canParseAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(this.host);
    }

    public final URI uri() {
        String builder = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new URI(builder);
        } catch (URISyntaxException e) {
            try {
                URI create = URI.create(new C13735j("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").mo53413f(builder, ""));
                C12775o.m28638h(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public final String username() {
        return this.username;
    }

    public static final HttpUrl get(URI uri) {
        return Companion.get(uri);
    }

    public static final HttpUrl get(URL url2) {
        return Companion.get(url2);
    }

    public final Builder newBuilder(String str) {
        C12775o.m28639i(str, "link");
        try {
            return new Builder().parse$okhttp(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
