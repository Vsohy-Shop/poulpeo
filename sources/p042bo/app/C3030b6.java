package p042bo.app;

import androidx.core.app.NotificationCompat;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p126j0.C8266c;
import p126j0.C8273e;
import p292z.C10730a;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: bo.app.b6 */
public class C3030b6 {

    /* renamed from: f */
    public static final C3031a f1484f = new C3031a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final List<String> f1485a = new ArrayList(32);

    /* renamed from: b */
    private long f1486b;

    /* renamed from: c */
    private final Object f1487c = new Object();

    /* renamed from: d */
    public C3023b2 f1488d;

    /* renamed from: e */
    private boolean f1489e;

    /* renamed from: bo.app.b6$a */
    public static final class C3031a {
        public /* synthetic */ C3031a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String mo28676a(String str, String str2, Throwable th) {
            C12775o.m28639i(str, APIResourceDescriptors.RESOURCE_TYPE_TAG);
            C12775o.m28639i(str2, NotificationCompat.CATEGORY_MESSAGE);
            String str3 = C8273e.m16433f(C10730a.ANDROID_LOGCAT) + ' ' + str + ": " + str2;
            if (th != null) {
                str3 = str3 + ": " + th.getMessage();
            }
            String substring = str3.substring(0, Math.min(str3.length(), 1000));
            C12775o.m28638h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        private C3031a() {
        }
    }

    /* renamed from: bo.app.b6$b */
    static final class C3032b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3032b f1490b = new C3032b();

        C3032b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Test user device logging is enabled.";
        }
    }

    /* renamed from: a */
    public final void mo28668a(C3023b2 b2Var) {
        C12775o.m28639i(b2Var, "<set-?>");
        this.f1488d = b2Var;
    }

    /* renamed from: b */
    public final void mo28672b() {
        synchronized (this.f1487c) {
            if (this.f1488d != null) {
                mo28673c().mo28639a((List<String>) C12686e0.m28207D0(mo28674d()), this.f1486b);
            }
            mo28674d().clear();
            this.f1486b = 0;
            C11921v vVar = C11921v.f18618a;
        }
    }

    /* renamed from: c */
    public final C3023b2 mo28673c() {
        C3023b2 b2Var = this.f1488d;
        if (b2Var != null) {
            return b2Var;
        }
        C12775o.m28656z("brazeManager");
        return null;
    }

    /* renamed from: d */
    public final List<String> mo28674d() {
        return this.f1485a;
    }

    /* renamed from: e */
    public final boolean mo28675e() {
        return this.f1489e;
    }

    /* renamed from: a */
    public final void mo28671a(boolean z) {
        synchronized (this.f1487c) {
            if (!z) {
                mo28674d().clear();
            } else {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, C3032b.f1490b, 2, (Object) null);
            }
            C11921v vVar = C11921v.f18618a;
        }
        this.f1489e = z;
    }

    /* renamed from: a */
    public void mo28670a(String str, String str2, Throwable th) {
        C12775o.m28639i(str, APIResourceDescriptors.RESOURCE_TYPE_TAG);
        C12775o.m28639i(str2, NotificationCompat.CATEGORY_MESSAGE);
        if (this.f1489e && !C13755w.m31552J(str2, "device_logs", false, 2, (Object) null) && !C13755w.m31552J(str2, "test_user_data", false, 2, (Object) null) && !m2632a()) {
            synchronized (this.f1487c) {
                if (mo28674d().size() >= 32) {
                    mo28672b();
                }
                if ((!C13754v.m31532t(str)) && (!C13754v.m31532t(str2))) {
                    if (this.f1486b == 0) {
                        this.f1486b = C8273e.m16436i();
                    }
                    mo28674d().add(f1484f.mo28676a(str, str2, th));
                }
                C11921v vVar = C11921v.f18618a;
            }
        }
    }

    /* renamed from: a */
    public final void mo28669a(C3046c5 c5Var) {
        C12775o.m28639i(c5Var, "serverConfig");
        mo28671a(c5Var.mo28750n());
    }

    /* renamed from: a */
    private final boolean m2632a() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        C12775o.m28638h(stackTrace, "stack");
        if (stackTrace.length == 0) {
            return true;
        }
        StackTraceElement stackTraceElement = stackTrace[1];
        String methodName = stackTraceElement.getMethodName();
        String className = stackTraceElement.getClassName();
        int length = stackTrace.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            StackTraceElement stackTraceElement2 = stackTrace[i];
            i++;
            if (C12775o.m28634d(stackTraceElement2.getClassName(), className) && C12775o.m28634d(stackTraceElement2.getMethodName(), methodName)) {
                i2++;
            }
        }
        if (i2 != 1) {
            return true;
        }
        return false;
    }
}
