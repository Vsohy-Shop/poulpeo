package okhttp3.internal;

import androidx.autofill.HintConstants;
import androidx.core.location.LocationRequestCompat;
import com.rmn.apiclient.impl.api.call.APIParams;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.collections.C12703l0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12751c;
import kotlin.jvm.internal.C12770k0;
import kotlin.jvm.internal.C12772l0;
import kotlin.jvm.internal.C12773m;
import kotlin.jvm.internal.C12775o;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http2.Header;
import okio.C13121c;
import okio.C13127d;
import okio.C13130e;
import okio.C13133f;
import okio.C13151m0;
import okio.C13179y0;
import p336ef.C11921v;
import p363ig.C12151a;
import p363ig.C12152b;
import p404of.C13074a;
import p436tf.C13528f;
import p454wf.C13726d;
import p454wf.C13735j;

/* compiled from: Util.kt */
public final class Util {
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final Headers EMPTY_HEADERS = Headers.Companion.mo51311of(new String[0]);
    public static final RequestBody EMPTY_REQUEST;
    public static final ResponseBody EMPTY_RESPONSE;
    private static final C13151m0 UNICODE_BOMS;
    public static final TimeZone UTC;
    private static final C13735j VERIFY_AS_IP_ADDRESS = new C13735j("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    public static final boolean assertionsEnabled = false;
    public static final String okHttpName;
    public static final String userAgent = "okhttp/4.11.0";

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_RESPONSE = ResponseBody.Companion.create$default(ResponseBody.Companion, bArr, (MediaType) null, 1, (Object) null);
        EMPTY_REQUEST = RequestBody.Companion.create$default(RequestBody.Companion, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        C13151m0.C13152a aVar = C13151m0.f20932d;
        C13133f.C13134a aVar2 = C13133f.f20903e;
        UNICODE_BOMS = aVar.mo52666d(aVar2.mo52620b("efbbbf"), aVar2.mo52620b("feff"), aVar2.mo52620b("fffe"), aVar2.mo52620b("0000ffff"), aVar2.mo52620b("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        C12775o.m28636f(timeZone);
        UTC = timeZone;
        String name = OkHttpClient.class.getName();
        C12775o.m28638h(name, "OkHttpClient::class.java.name");
        okHttpName = C13755w.m31586l0(C13755w.m31585k0(name, "okhttp3."), "Client");
    }

    public static final <E> void addIfAbsent(List<E> list, E e) {
        C12775o.m28639i(list, "<this>");
        if (!list.contains(e)) {
            list.add(e);
        }
    }

    public static final int and(byte b, int i) {
        return b & i;
    }

    public static final EventListener.Factory asFactory(EventListener eventListener) {
        C12775o.m28639i(eventListener, "<this>");
        return new C12152b(eventListener);
    }

    /* access modifiers changed from: private */
    /* renamed from: asFactory$lambda-8  reason: not valid java name */
    public static final EventListener m38875asFactory$lambda8(EventListener eventListener, Call call) {
        C12775o.m28639i(eventListener, "$this_asFactory");
        C12775o.m28639i(call, "it");
        return eventListener;
    }

    public static final void assertThreadDoesntHoldLock(Object obj) {
        C12775o.m28639i(obj, "<this>");
        if (assertionsEnabled && Thread.holdsLock(obj)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + obj);
        }
    }

    public static final void assertThreadHoldsLock(Object obj) {
        C12775o.m28639i(obj, "<this>");
        if (assertionsEnabled && !Thread.holdsLock(obj)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + obj);
        }
    }

    public static final boolean canParseAsIpAddress(String str) {
        C12775o.m28639i(str, "<this>");
        return VERIFY_AS_IP_ADDRESS.mo53412e(str);
    }

    public static final boolean canReuseConnectionFor(HttpUrl httpUrl, HttpUrl httpUrl2) {
        C12775o.m28639i(httpUrl, "<this>");
        C12775o.m28639i(httpUrl2, "other");
        if (!C12775o.m28634d(httpUrl.host(), httpUrl2.host()) || httpUrl.port() != httpUrl2.port() || !C12775o.m28634d(httpUrl.scheme(), httpUrl2.scheme())) {
            return false;
        }
        return true;
    }

    public static final int checkDuration(String str, long j, TimeUnit timeUnit) {
        boolean z;
        boolean z2;
        boolean z3;
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        boolean z4 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (timeUnit != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                long millis = timeUnit.toMillis(j);
                if (millis <= 2147483647L) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (millis == 0 && i > 0) {
                        z4 = false;
                    }
                    if (z4) {
                        return (int) millis;
                    }
                    throw new IllegalArgumentException(C12775o.m28647q(str, " too small.").toString());
                }
                throw new IllegalArgumentException(C12775o.m28647q(str, " too large.").toString());
            }
            throw new IllegalStateException("unit == null".toString());
        }
        throw new IllegalStateException(C12775o.m28647q(str, " < 0").toString());
    }

    public static final void checkOffsetAndCount(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void closeQuietly(Closeable closeable) {
        C12775o.m28639i(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final String[] concat(String[] strArr, String str) {
        C12775o.m28639i(strArr, "<this>");
        C12775o.m28639i(str, "value");
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        C12775o.m28638h(copyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) copyOf;
        strArr2[C12710p.m28385M(strArr2)] = str;
        return strArr2;
    }

    public static final int delimiterOffset(String str, String str2, int i, int i2) {
        C12775o.m28639i(str, "<this>");
        C12775o.m28639i(str2, "delimiters");
        while (i < i2) {
            int i3 = i + 1;
            if (C13755w.m31550I(str2, str.charAt(i), false, 2, (Object) null)) {
                return i;
            }
            i = i3;
        }
        return i2;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return delimiterOffset(str, str2, i, i2);
    }

    public static final boolean discard(C13179y0 y0Var, int i, TimeUnit timeUnit) {
        C12775o.m28639i(y0Var, "<this>");
        C12775o.m28639i(timeUnit, "timeUnit");
        try {
            return skipAll(y0Var, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final <T> List<T> filterList(Iterable<? extends T> iterable, Function1<? super T, Boolean> function1) {
        C12775o.m28639i(iterable, "<this>");
        C12775o.m28639i(function1, "predicate");
        List<T> k = C12726w.m28524k();
        for (Object next : iterable) {
            if (function1.invoke(next).booleanValue()) {
                if (k.isEmpty()) {
                    k = new ArrayList<>();
                }
                C12772l0.m28611c(k).add(next);
            }
        }
        return k;
    }

    public static final String format(String str, Object... objArr) {
        C12775o.m28639i(str, "format");
        C12775o.m28639i(objArr, "args");
        C12770k0 k0Var = C12770k0.f20423a;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        C12775o.m28638h(format, "format(locale, format, *args)");
        return format;
    }

    public static final boolean hasIntersection(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        boolean z;
        boolean z2;
        C12775o.m28639i(strArr, "<this>");
        C12775o.m28639i(comparator, "comparator");
        if (strArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && strArr2 != null) {
            if (strArr2.length == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    String str = strArr[i];
                    i++;
                    Iterator a = C12751c.m28576a(strArr2);
                    while (true) {
                        if (a.hasNext()) {
                            if (comparator.compare(str, (String) a.next()) == 0) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long headersContentLength(Response response) {
        C12775o.m28639i(response, "<this>");
        String str = response.headers().get("Content-Length");
        if (str == null) {
            return -1;
        }
        return toLongOrDefault(str, -1);
    }

    public static final void ignoreIoExceptions(C13074a<C11921v> aVar) {
        C12775o.m28639i(aVar, "block");
        try {
            aVar.invoke();
        } catch (IOException unused) {
        }
    }

    @SafeVarargs
    public static final <T> List<T> immutableListOf(T... tArr) {
        C12775o.m28639i(tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(C12726w.m28527n(Arrays.copyOf(objArr, objArr.length)));
        C12775o.m28638h(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int indexOf(String[] strArr, String str, Comparator<String> comparator) {
        boolean z;
        C12775o.m28639i(strArr, "<this>");
        C12775o.m28639i(str, "value");
        C12775o.m28639i(comparator, "comparator");
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfControlOrNonAscii(String str) {
        C12775o.m28639i(str, "<this>");
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (C12775o.m28641k(charAt, 31) <= 0 || C12775o.m28641k(charAt, 127) >= 0) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    public static final int indexOfFirstNonAsciiWhitespace(String str, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        C12775o.m28639i(str, "<this>");
        while (i < i2) {
            int i3 = i + 1;
            char charAt = str.charAt(i);
            boolean z4 = false;
            if (charAt == 9 || charAt == 10) {
                z = true;
            } else {
                z = false;
            }
            if (!z && charAt != 12) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2 && charAt != 13) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3 || charAt == ' ') {
                z4 = true;
            }
            if (!z4) {
                return i;
            }
            i = i3;
        }
        return i2;
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return indexOfFirstNonAsciiWhitespace(str, i, i2);
    }

    public static final int indexOfLastNonAsciiWhitespace(String str, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        C12775o.m28639i(str, "<this>");
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                int i4 = i3 - 1;
                char charAt = str.charAt(i3);
                boolean z4 = false;
                if (charAt == 9 || charAt == 10) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && charAt != 12) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2 && charAt != 13) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3 || charAt == ' ') {
                    z4 = true;
                }
                if (!z4) {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3 = i4;
            }
        }
        return i;
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return indexOfLastNonAsciiWhitespace(str, i, i2);
    }

    public static final int indexOfNonWhitespace(String str, int i) {
        C12775o.m28639i(str, "<this>");
        int length = str.length();
        while (i < length) {
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != 9) {
                return i;
            }
            i = i2;
        }
        return str.length();
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return indexOfNonWhitespace(str, i);
    }

    public static final String[] intersect(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        C12775o.m28639i(strArr, "<this>");
        C12775o.m28639i(strArr2, "other");
        C12775o.m28639i(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            i++;
            int length2 = strArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    break;
                }
                String str2 = strArr2[i2];
                i2++;
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        p392mf.C12941b.m29245a(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r2 = p336ef.C11921v.f18618a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        p392mf.C12941b.m29245a(r0, (java.lang.Throwable) null);
        r3.delete(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0019 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean isCivilized(okhttp3.internal.p405io.FileSystem r3, java.io.File r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C12775o.m28639i(r3, r0)
            java.lang.String r0 = "file"
            kotlin.jvm.internal.C12775o.m28639i(r4, r0)
            okio.w0 r0 = r3.sink(r4)
            r1 = 0
            r3.delete(r4)     // Catch:{ IOException -> 0x0019 }
            p392mf.C12941b.m29245a(r0, r1)
            r3 = 1
            return r3
        L_0x0017:
            r3 = move-exception
            goto L_0x0023
        L_0x0019:
            ef.v r2 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x0017 }
            p392mf.C12941b.m29245a(r0, r1)
            r3.delete(r4)
            r3 = 0
            return r3
        L_0x0023:
            throw r3     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r4 = move-exception
            p392mf.C12941b.m29245a(r0, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.Util.isCivilized(okhttp3.internal.io.FileSystem, java.io.File):boolean");
    }

    public static final boolean isHealthy(Socket socket, C13130e eVar) {
        int soTimeout;
        C12775o.m28639i(socket, "<this>");
        C12775o.m28639i(eVar, APIParams.SOURCE);
        try {
            soTimeout = socket.getSoTimeout();
            socket.setSoTimeout(1);
            boolean z = !eVar.mo52552t();
            socket.setSoTimeout(soTimeout);
            return z;
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        } catch (Throwable th) {
            socket.setSoTimeout(soTimeout);
            throw th;
        }
    }

    public static final boolean isSensitiveHeader(String str) {
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        if (C13754v.m31530r(str, "Authorization", true) || C13754v.m31530r(str, "Cookie", true) || C13754v.m31530r(str, "Proxy-Authorization", true) || C13754v.m31530r(str, "Set-Cookie", true)) {
            return true;
        }
        return false;
    }

    public static final void notify(Object obj) {
        C12775o.m28639i(obj, "<this>");
        obj.notify();
    }

    public static final void notifyAll(Object obj) {
        C12775o.m28639i(obj, "<this>");
        obj.notifyAll();
    }

    public static final int parseHexDigit(char c) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if ('0' > c || c >= ':') {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return c - '0';
        }
        char c2 = 'a';
        if ('a' > c || c >= 'g') {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            c2 = 'A';
            if ('A' > c || c >= 'G') {
                z3 = false;
            }
            if (!z3) {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    public static final String peerName(Socket socket) {
        C12775o.m28639i(socket, "<this>");
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        if (!(remoteSocketAddress instanceof InetSocketAddress)) {
            return remoteSocketAddress.toString();
        }
        String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
        C12775o.m28638h(hostName, "address.hostName");
        return hostName;
    }

    public static final Charset readBomAsCharset(C13130e eVar, Charset charset) {
        C12775o.m28639i(eVar, "<this>");
        C12775o.m28639i(charset, "default");
        int s0 = eVar.mo52549s0(UNICODE_BOMS);
        if (s0 == -1) {
            return charset;
        }
        if (s0 == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            C12775o.m28638h(charset2, "UTF_8");
            return charset2;
        } else if (s0 == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            C12775o.m28638h(charset3, "UTF_16BE");
            return charset3;
        } else if (s0 == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            C12775o.m28638h(charset4, "UTF_16LE");
            return charset4;
        } else if (s0 == 3) {
            return C13726d.f22151a.mo53395a();
        } else {
            if (s0 == 4) {
                return C13726d.f22151a.mo53396b();
            }
            throw new AssertionError();
        }
    }

    public static final <T> T readFieldOrNull(Object obj, Class<T> cls, String str) {
        Object readFieldOrNull;
        C12775o.m28639i(obj, "instance");
        C12775o.m28639i(cls, "fieldType");
        C12775o.m28639i(str, "fieldName");
        Class cls2 = obj.getClass();
        while (true) {
            Class<Object> cls3 = Object.class;
            if (!C12775o.m28634d(cls2, cls3)) {
                try {
                    Field declaredField = cls2.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(obj);
                    if (!cls.isInstance(obj2)) {
                        return null;
                    }
                    return cls.cast(obj2);
                } catch (NoSuchFieldException unused) {
                    cls2 = cls2.getSuperclass();
                    C12775o.m28638h(cls2, "c.superclass");
                }
            } else if (C12775o.m28634d(str, "delegate") || (readFieldOrNull = readFieldOrNull(obj, cls3, "delegate")) == null) {
                return null;
            } else {
                return readFieldOrNull(readFieldOrNull, cls, str);
            }
        }
    }

    public static final int readMedium(C13130e eVar) {
        C12775o.m28639i(eVar, "<this>");
        return and(eVar.readByte(), 255) | (and(eVar.readByte(), 255) << 16) | (and(eVar.readByte(), 255) << 8);
    }

    public static final boolean skipAll(C13179y0 y0Var, int i, TimeUnit timeUnit) {
        C12775o.m28639i(y0Var, "<this>");
        C12775o.m28639i(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long deadlineNanoTime = y0Var.timeout().hasDeadline() ? y0Var.timeout().deadlineNanoTime() - nanoTime : Long.MAX_VALUE;
        y0Var.timeout().deadlineNanoTime(Math.min(deadlineNanoTime, timeUnit.toNanos((long) i)) + nanoTime);
        try {
            C13121c cVar = new C13121c();
            while (y0Var.read(cVar, 8192) != -1) {
                cVar.mo52514a();
            }
            if (deadlineNanoTime == LocationRequestCompat.PASSIVE_INTERVAL) {
                y0Var.timeout().clearDeadline();
            } else {
                y0Var.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (deadlineNanoTime == LocationRequestCompat.PASSIVE_INTERVAL) {
                y0Var.timeout().clearDeadline();
            } else {
                y0Var.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            return false;
        } catch (Throwable th) {
            if (deadlineNanoTime == LocationRequestCompat.PASSIVE_INTERVAL) {
                y0Var.timeout().clearDeadline();
            } else {
                y0Var.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            throw th;
        }
    }

    public static final ThreadFactory threadFactory(String str, boolean z) {
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        return new C12151a(str, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: threadFactory$lambda-1  reason: not valid java name */
    public static final Thread m38876threadFactory$lambda1(String str, boolean z, Runnable runnable) {
        C12775o.m28639i(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z);
        return thread;
    }

    public static final void threadName(String str, C13074a<C11921v> aVar) {
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        C12775o.m28639i(aVar, "block");
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            aVar.invoke();
        } finally {
            C12773m.m28629b(1);
            currentThread.setName(name);
            C12773m.m28628a(1);
        }
    }

    public static final List<Header> toHeaderList(Headers headers) {
        C12775o.m28639i(headers, "<this>");
        C13528f t = C13537l.m30893t(0, headers.size());
        ArrayList arrayList = new ArrayList(C12728x.m28544v(t, 10));
        Iterator it = t.iterator();
        while (it.hasNext()) {
            int nextInt = ((C12703l0) it).nextInt();
            arrayList.add(new Header(headers.name(nextInt), headers.value(nextInt)));
        }
        return arrayList;
    }

    public static final Headers toHeaders(List<Header> list) {
        C12775o.m28639i(list, "<this>");
        Headers.Builder builder = new Headers.Builder();
        for (Header next : list) {
            builder.addLenient$okhttp(next.component1().mo52595N(), next.component2().mo52595N());
        }
        return builder.build();
    }

    public static final String toHexString(long j) {
        String hexString = Long.toHexString(j);
        C12775o.m28638h(hexString, "toHexString(this)");
        return hexString;
    }

    public static final String toHostHeader(HttpUrl httpUrl, boolean z) {
        String str;
        C12775o.m28639i(httpUrl, "<this>");
        if (C13755w.m31552J(httpUrl.host(), ":", false, 2, (Object) null)) {
            str = '[' + httpUrl.host() + ']';
        } else {
            str = httpUrl.host();
        }
        if (!z && httpUrl.port() == HttpUrl.Companion.defaultPort(httpUrl.scheme())) {
            return str;
        }
        return str + ':' + httpUrl.port();
    }

    public static /* synthetic */ String toHostHeader$default(HttpUrl httpUrl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toHostHeader(httpUrl, z);
    }

    public static final <T> List<T> toImmutableList(List<? extends T> list) {
        C12775o.m28639i(list, "<this>");
        List<T> unmodifiableList = Collections.unmodifiableList(C12686e0.m28207D0(list));
        C12775o.m28638h(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final <K, V> Map<K, V> toImmutableMap(Map<K, ? extends V> map) {
        C12775o.m28639i(map, "<this>");
        if (map.isEmpty()) {
            return C12716r0.m28416g();
        }
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        C12775o.m28638h(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return unmodifiableMap;
    }

    public static final long toLongOrDefault(String str, long j) {
        C12775o.m28639i(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static final int toNonNegativeInt(String str, int i) {
        Long l;
        if (str == null) {
            l = null;
        } else {
            try {
                l = Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                return i;
            }
        }
        if (l == null) {
            return i;
        }
        long longValue = l.longValue();
        if (longValue > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (longValue < 0) {
            return 0;
        }
        return (int) longValue;
    }

    public static final String trimSubstring(String str, int i, int i2) {
        C12775o.m28639i(str, "<this>");
        int indexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(str, i, i2);
        String substring = str.substring(indexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(str, indexOfFirstNonAsciiWhitespace, i2));
        C12775o.m28638h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String trimSubstring$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return trimSubstring(str, i, i2);
    }

    public static final void wait(Object obj) {
        C12775o.m28639i(obj, "<this>");
        obj.wait();
    }

    public static final Throwable withSuppressed(Exception exc, List<? extends Exception> list) {
        C12775o.m28639i(exc, "<this>");
        C12775o.m28639i(list, "suppressed");
        if (list.size() > 1) {
            System.out.println(list);
        }
        for (Exception a : list) {
            C11894b.m25683a(exc, a);
        }
        return exc;
    }

    public static final void writeMedium(C13127d dVar, int i) {
        C12775o.m28639i(dVar, "<this>");
        dVar.writeByte((i >>> 16) & 255);
        dVar.writeByte((i >>> 8) & 255);
        dVar.writeByte(i & 255);
    }

    public static final int and(short s, int i) {
        return s & i;
    }

    public static final int delimiterOffset(String str, char c, int i, int i2) {
        C12775o.m28639i(str, "<this>");
        while (i < i2) {
            int i3 = i + 1;
            if (str.charAt(i) == c) {
                return i;
            }
            i = i3;
        }
        return i2;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, char c, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return delimiterOffset(str, c, i, i2);
    }

    public static final String toHexString(int i) {
        String hexString = Integer.toHexString(i);
        C12775o.m28638h(hexString, "toHexString(this)");
        return hexString;
    }

    public static final long and(int i, long j) {
        return ((long) i) & j;
    }

    public static final void closeQuietly(Socket socket) {
        C12775o.m28639i(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!C12775o.m28634d(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(ServerSocket serverSocket) {
        C12775o.m28639i(serverSocket, "<this>");
        try {
            serverSocket.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final int skipAll(C13121c cVar, byte b) {
        C12775o.m28639i(cVar, "<this>");
        int i = 0;
        while (!cVar.mo52552t() && cVar.mo52530j0(0) == b) {
            i++;
            cVar.readByte();
        }
        return i;
    }
}
