package p433tc;

import com.google.firebase.crashlytics.C6928a;
import kotlin.jvm.internal.C12775o;

/* renamed from: tc.a */
/* compiled from: CrashlyticsManager.kt */
public final class C13486a {

    /* renamed from: a */
    public static final C13486a f21657a = new C13486a();

    private C13486a() {
    }

    /* renamed from: a */
    private final String m30726a() {
        String className;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        C12775o.m28638h(stackTrace, "elements");
        int i = 0;
        for (StackTraceElement stackTraceElement : stackTrace) {
            i++;
            if (i > 2 && stackTraceElement != null && (className = stackTraceElement.getClassName()) != null && !C12775o.m28634d(className, C13486a.class.getName())) {
                return className + ' ' + stackTraceElement.getMethodName() + " line " + stackTraceElement.getLineNumber();
            }
        }
        return "";
    }

    /* renamed from: b */
    public final void mo53089b(Exception exc) {
        if (exc != null) {
            C6928a.m12081a().mo39779c(exc);
        }
    }

    /* renamed from: c */
    public final void mo53090c(String str) {
        C12775o.m28639i(str, "message");
        String a = m30726a();
        if (C12775o.m28634d(a, "")) {
            C6928a.m12081a().mo39779c(new IllegalArgumentException(str));
            return;
        }
        C6928a a2 = C6928a.m12081a();
        a2.mo39779c(new IllegalArgumentException(a + " => " + str));
    }

    /* renamed from: d */
    public final void mo53091d(String str) {
        C12775o.m28639i(str, "message");
        String a = m30726a();
        if (C12775o.m28634d(a, "")) {
            C6928a.m12081a().mo39779c(new IllegalStateException(str));
            return;
        }
        C6928a a2 = C6928a.m12081a();
        a2.mo39779c(new IllegalStateException(a + " => " + str));
    }
}
