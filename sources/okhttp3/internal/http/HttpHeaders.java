package okhttp3.internal.http;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import okio.C13121c;
import okio.C13133f;

/* compiled from: HttpHeaders.kt */
public final class HttpHeaders {
    private static final C13133f QUOTED_STRING_DELIMITERS;
    private static final C13133f TOKEN_DELIMITERS;

    static {
        C13133f.C13134a aVar = C13133f.f20903e;
        QUOTED_STRING_DELIMITERS = aVar.mo52622d("\"\\");
        TOKEN_DELIMITERS = aVar.mo52622d("\t ,=");
    }

    public static final boolean hasBody(Response response) {
        C12775o.m28639i(response, "response");
        return promisesBody(response);
    }

    public static final List<Challenge> parseChallenges(Headers headers, String str) {
        C12775o.m28639i(headers, "<this>");
        C12775o.m28639i(str, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (C13754v.m31530r(str, headers.name(i), true)) {
                try {
                    readChallengeHeader(new C13121c().mo52486F(headers.value(i)), arrayList);
                } catch (EOFException e) {
                    Platform.Companion.get().log("Unable to parse challenge", 5, e);
                }
            }
            i = i2;
        }
        return arrayList;
    }

    public static final boolean promisesBody(Response response) {
        C12775o.m28639i(response, "<this>");
        if (C12775o.m28634d(response.request().method(), "HEAD")) {
            return false;
        }
        int code = response.code();
        if (((code >= 100 && code < 200) || code == 204 || code == 304) && Util.headersContentLength(response) == -1 && !C13754v.m31530r("chunked", Response.header$default(response, "Transfer-Encoding", (String) null, 2, (Object) null), true)) {
            return false;
        }
        return true;
    }

    private static final void readChallengeHeader(C13121c cVar, List<Challenge> list) {
        String readToken;
        int skipAll;
        String str;
        while (true) {
            String str2 = null;
            while (true) {
                if (str2 == null) {
                    skipCommasAndWhitespace(cVar);
                    str2 = readToken(cVar);
                    if (str2 == null) {
                        return;
                    }
                }
                boolean skipCommasAndWhitespace = skipCommasAndWhitespace(cVar);
                readToken = readToken(cVar);
                if (readToken != null) {
                    skipAll = Util.skipAll(cVar, (byte) 61);
                    boolean skipCommasAndWhitespace2 = skipCommasAndWhitespace(cVar);
                    if (skipCommasAndWhitespace || (!skipCommasAndWhitespace2 && !cVar.mo52552t())) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        int skipAll2 = skipAll + Util.skipAll(cVar, (byte) 61);
                        while (true) {
                            if (readToken == null) {
                                readToken = readToken(cVar);
                                if (skipCommasAndWhitespace(cVar)) {
                                    continue;
                                    break;
                                }
                                skipAll2 = Util.skipAll(cVar, (byte) 61);
                            }
                            if (skipAll2 == 0) {
                                continue;
                                break;
                            } else if (skipAll2 <= 1 && !skipCommasAndWhitespace(cVar)) {
                                if (startsWith(cVar, (byte) 34)) {
                                    str = readQuotedString(cVar);
                                } else {
                                    str = readToken(cVar);
                                }
                                if (str == null || ((String) linkedHashMap.put(readToken, str)) != null) {
                                    return;
                                }
                                if (skipCommasAndWhitespace(cVar) || cVar.mo52552t()) {
                                    readToken = null;
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        list.add(new Challenge(str2, (Map<String, String>) linkedHashMap));
                        str2 = readToken;
                    }
                } else if (cVar.mo52552t()) {
                    list.add(new Challenge(str2, (Map<String, String>) C12716r0.m28416g()));
                    return;
                } else {
                    return;
                }
            }
            Map singletonMap = Collections.singletonMap((Object) null, C12775o.m28647q(readToken, C13754v.m31535w("=", skipAll)));
            C12775o.m28638h(singletonMap, "singletonMap<String, Str…ek + \"=\".repeat(eqCount))");
            list.add(new Challenge(str2, (Map<String, String>) singletonMap));
        }
    }

    private static final String readQuotedString(C13121c cVar) {
        boolean z;
        if (cVar.readByte() == 34) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C13121c cVar2 = new C13121c();
            while (true) {
                long u0 = cVar.mo52555u0(QUOTED_STRING_DELIMITERS);
                if (u0 == -1) {
                    return null;
                }
                if (cVar.mo52530j0(u0) == 34) {
                    cVar2.write(cVar, u0);
                    cVar.readByte();
                    return cVar2.mo52482B0();
                } else if (cVar.size() == u0 + 1) {
                    return null;
                } else {
                    cVar2.write(cVar, u0);
                    cVar.readByte();
                    cVar2.write(cVar, 1);
                }
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    private static final String readToken(C13121c cVar) {
        long u0 = cVar.mo52555u0(TOKEN_DELIMITERS);
        if (u0 == -1) {
            u0 = cVar.size();
        }
        if (u0 != 0) {
            return cVar.mo52532l(u0);
        }
        return null;
    }

    public static final void receiveHeaders(CookieJar cookieJar, HttpUrl httpUrl, Headers headers) {
        C12775o.m28639i(cookieJar, "<this>");
        C12775o.m28639i(httpUrl, "url");
        C12775o.m28639i(headers, "headers");
        if (cookieJar != CookieJar.NO_COOKIES) {
            List<Cookie> parseAll = Cookie.Companion.parseAll(httpUrl, headers);
            if (!parseAll.isEmpty()) {
                cookieJar.saveFromResponse(httpUrl, parseAll);
            }
        }
    }

    private static final boolean skipCommasAndWhitespace(C13121c cVar) {
        boolean z = false;
        while (!cVar.mo52552t()) {
            byte j0 = cVar.mo52530j0(0);
            boolean z2 = true;
            if (j0 != 44) {
                if (!(j0 == 32 || j0 == 9)) {
                    z2 = false;
                }
                if (!z2) {
                    break;
                }
                cVar.readByte();
            } else {
                cVar.readByte();
                z = true;
            }
        }
        return z;
    }

    private static final boolean startsWith(C13121c cVar, byte b) {
        if (cVar.mo52552t() || cVar.mo52530j0(0) != b) {
            return false;
        }
        return true;
    }
}
