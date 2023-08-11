package com.squareup.okhttp.internal;

import androidx.core.location.LocationRequestCompat;
import com.adjust.sdk.Constants;
import com.squareup.okhttp.HttpUrl;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import okio.C13121c;
import okio.C13133f;
import okio.C13179y0;

public final class Util {
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    public static final String[] EMPTY_STRING_ARRAY = new String[0];
    public static final Charset UTF_8 = Charset.forName(Constants.ENCODING);

    private Util() {
    }

    public static void checkOffsetAndCount(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static void closeAll(Closeable closeable, Closeable closeable2) {
        try {
            closeable.close();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            closeable2.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            } else if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            } else if (th instanceof Error) {
                throw th;
            } else {
                throw new AssertionError(th);
            }
        }
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static String[] concat(String[] strArr, String str) {
        int length = strArr.length + 1;
        String[] strArr2 = new String[length];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[length - 1] = str;
        return strArr2;
    }

    public static boolean contains(String[] strArr, String str) {
        return Arrays.asList(strArr).contains(str);
    }

    public static boolean discard(C13179y0 y0Var, int i, TimeUnit timeUnit) {
        try {
            return skipAll(y0Var, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean equal(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    public static String hostHeader(HttpUrl httpUrl) {
        if (httpUrl.port() == HttpUrl.defaultPort(httpUrl.scheme())) {
            return httpUrl.host();
        }
        return httpUrl.host() + ":" + httpUrl.port();
    }

    public static <T> List<T> immutableList(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <K, V> Map<K, V> immutableMap(Map<K, V> map) {
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static <T> T[] intersect(Class<T> cls, T[] tArr, T[] tArr2) {
        List intersect = intersect(tArr, tArr2);
        return intersect.toArray((Object[]) Array.newInstance(cls, intersect.size()));
    }

    public static boolean isAndroidGetsocknameError(AssertionError assertionError) {
        if (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) {
            return false;
        }
        return true;
    }

    public static String md5Hex(String str) {
        try {
            return C13133f.m29655v(MessageDigest.getInstance(Constants.MD5).digest(str.getBytes(Constants.ENCODING))).mo52609l();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static C13133f sha1(C13133f fVar) {
        try {
            return C13133f.m29655v(MessageDigest.getInstance(Constants.SHA1).digest(fVar.mo52594M()));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static String shaBase64(String str) {
        try {
            return C13133f.m29655v(MessageDigest.getInstance(Constants.SHA1).digest(str.getBytes(Constants.ENCODING))).mo52597a();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static boolean skipAll(C13179y0 y0Var, int i, TimeUnit timeUnit) {
        long j;
        long nanoTime = System.nanoTime();
        if (y0Var.timeout().hasDeadline()) {
            j = y0Var.timeout().deadlineNanoTime() - nanoTime;
        } else {
            j = Long.MAX_VALUE;
        }
        y0Var.timeout().deadlineNanoTime(Math.min(j, timeUnit.toNanos((long) i)) + nanoTime);
        try {
            C13121c cVar = new C13121c();
            while (y0Var.read(cVar, 2048) != -1) {
                cVar.mo52514a();
            }
            if (j == LocationRequestCompat.PASSIVE_INTERVAL) {
                y0Var.timeout().clearDeadline();
                return true;
            }
            y0Var.timeout().deadlineNanoTime(nanoTime + j);
            return true;
        } catch (InterruptedIOException unused) {
            if (j == LocationRequestCompat.PASSIVE_INTERVAL) {
                y0Var.timeout().clearDeadline();
                return false;
            }
            y0Var.timeout().deadlineNanoTime(nanoTime + j);
            return false;
        } catch (Throwable th) {
            if (j == LocationRequestCompat.PASSIVE_INTERVAL) {
                y0Var.timeout().clearDeadline();
            } else {
                y0Var.timeout().deadlineNanoTime(nanoTime + j);
            }
            throw th;
        }
    }

    public static ThreadFactory threadFactory(final String str, final boolean z) {
        return new ThreadFactory() {
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, str);
                thread.setDaemon(z);
                return thread;
            }
        };
    }

    public static String toHumanReadableAscii(String str) {
        int i;
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int codePointAt = str.codePointAt(i2);
            if (codePointAt <= 31 || codePointAt >= 127) {
                C13121c cVar = new C13121c();
                cVar.mo52508U0(str, 0, i2);
                while (i2 < length) {
                    int codePointAt2 = str.codePointAt(i2);
                    if (codePointAt2 <= 31 || codePointAt2 >= 127) {
                        i = 63;
                    } else {
                        i = codePointAt2;
                    }
                    cVar.mo52509V0(i);
                    i2 += Character.charCount(codePointAt2);
                }
                return cVar.mo52482B0();
            }
            i2 += Character.charCount(codePointAt);
        }
        return str;
    }

    public static <T> List<T> immutableList(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static void closeQuietly(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!isAndroidGetsocknameError(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    private static <T> List<T> intersect(T[] tArr, T[] tArr2) {
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            int length = tArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                T t2 = tArr2[i];
                if (t.equals(t2)) {
                    arrayList.add(t2);
                    break;
                }
                i++;
            }
        }
        return arrayList;
    }

    public static void closeQuietly(ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }
}
