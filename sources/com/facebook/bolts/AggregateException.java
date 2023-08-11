package com.facebook.bolts;

import androidx.core.app.NotificationCompat;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: AggregateException.kt */
public final class AggregateException extends Exception {

    /* renamed from: c */
    public static final C4523a f4132c = new C4523a((DefaultConstructorMarker) null);
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    private final List<Throwable> f4133b;

    /* renamed from: com.facebook.bolts.AggregateException$a */
    /* compiled from: AggregateException.kt */
    public static final class C4523a {
        private C4523a() {
        }

        public /* synthetic */ C4523a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public void printStackTrace(PrintStream printStream) {
        C12775o.m28639i(printStream, NotificationCompat.CATEGORY_ERROR);
        super.printStackTrace(printStream);
        int i = -1;
        for (Throwable next : this.f4133b) {
            printStream.append("\n");
            printStream.append("  Inner throwable #");
            i++;
            printStream.append(String.valueOf(i));
            printStream.append(": ");
            if (next != null) {
                next.printStackTrace(printStream);
            }
            printStream.append("\n");
        }
    }

    public void printStackTrace(PrintWriter printWriter) {
        C12775o.m28639i(printWriter, NotificationCompat.CATEGORY_ERROR);
        super.printStackTrace(printWriter);
        int i = -1;
        for (Throwable next : this.f4133b) {
            printWriter.append("\n");
            printWriter.append("  Inner throwable #");
            i++;
            printWriter.append(String.valueOf(i));
            printWriter.append(": ");
            if (next != null) {
                next.printStackTrace(printWriter);
            }
            printWriter.append("\n");
        }
    }
}
