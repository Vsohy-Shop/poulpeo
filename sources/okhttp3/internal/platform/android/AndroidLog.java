package okhttp3.internal.platform.android;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.C12775o;
import okhttp3.OkHttpClient;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2;

@SuppressSignatureCheck
/* compiled from: AndroidLog.kt */
public final class AndroidLog {
    public static final AndroidLog INSTANCE = new AndroidLog();
    private static final int MAX_LOG_LENGTH = 4000;
    private static final CopyOnWriteArraySet<Logger> configuredLoggers = new CopyOnWriteArraySet<>();
    private static final Map<String, String> knownLoggers;

    static {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Class<OkHttpClient> cls = OkHttpClient.class;
        Package packageR = cls.getPackage();
        if (packageR == null) {
            str = null;
        } else {
            str = packageR.getName();
        }
        if (str != null) {
            linkedHashMap.put(str, "OkHttp");
        }
        String name = cls.getName();
        C12775o.m28638h(name, "OkHttpClient::class.java.name");
        linkedHashMap.put(name, "okhttp.OkHttpClient");
        String name2 = Http2.class.getName();
        C12775o.m28638h(name2, "Http2::class.java.name");
        linkedHashMap.put(name2, "okhttp.Http2");
        String name3 = TaskRunner.class.getName();
        C12775o.m28638h(name3, "TaskRunner::class.java.name");
        linkedHashMap.put(name3, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        knownLoggers = C12716r0.m28427r(linkedHashMap);
    }

    private AndroidLog() {
    }

    private final void enableLogging(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (configuredLoggers.add(logger)) {
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else if (Log.isLoggable(str2, 4)) {
                level = Level.INFO;
            } else {
                level = Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(AndroidLogHandler.INSTANCE);
        }
    }

    private final String loggerTag(String str) {
        String str2 = knownLoggers.get(str);
        if (str2 == null) {
            return C13760y.m31607S0(str, 23);
        }
        return str2;
    }

    public final void androidLog$okhttp(String str, int i, String str2, Throwable th) {
        int min;
        C12775o.m28639i(str, "loggerName");
        C12775o.m28639i(str2, "message");
        String loggerTag = loggerTag(str);
        if (Log.isLoggable(loggerTag, i)) {
            if (th != null) {
                str2 = str2 + 10 + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i2 = 0;
            while (i2 < length) {
                int V = C13755w.m31570V(str2, 10, i2, false, 4, (Object) null);
                if (V == -1) {
                    V = length;
                }
                while (true) {
                    min = Math.min(V, i2 + MAX_LOG_LENGTH);
                    String substring = str2.substring(i2, min);
                    C12775o.m28638h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i, loggerTag, substring);
                    if (min >= V) {
                        break;
                    }
                    i2 = min;
                }
                i2 = min + 1;
            }
        }
    }

    public final void enable() {
        for (Map.Entry next : knownLoggers.entrySet()) {
            enableLogging((String) next.getKey(), (String) next.getValue());
        }
    }
}
