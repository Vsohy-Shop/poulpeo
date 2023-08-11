package okhttp3.internal.platform.android;

import java.util.logging.Level;
import java.util.logging.LogRecord;

/* compiled from: AndroidLog.kt */
public final class AndroidLogKt {
    /* access modifiers changed from: private */
    public static final int getAndroidLevel(LogRecord logRecord) {
        if (logRecord.getLevel().intValue() > Level.INFO.intValue()) {
            return 5;
        }
        if (logRecord.getLevel().intValue() == Level.INFO.intValue()) {
            return 4;
        }
        return 3;
    }
}
