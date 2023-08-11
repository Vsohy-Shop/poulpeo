package p218s2;

import androidx.annotation.RestrictTo;
import androidx.autofill.HintConstants;
import com.facebook.C4509a;
import com.facebook.C4555l;
import com.facebook.FacebookSdk;
import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.Arrays;
import kotlin.jvm.internal.C12770k0;
import kotlin.jvm.internal.C12775o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p198q2.C9138d0;
import p454wf.C13726d;
import p454wf.C13735j;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: s2.f */
/* compiled from: InstrumentUtility.kt */
public final class C9459f {

    /* renamed from: a */
    public static final C9459f f14072a = new C9459f();

    /* renamed from: s2.f$a */
    /* compiled from: InstrumentUtility.kt */
    static final class C9460a implements FilenameFilter {

        /* renamed from: a */
        public static final C9460a f14073a = new C9460a();

        C9460a() {
        }

        public final boolean accept(File file, String str) {
            C12775o.m28638h(str, HintConstants.AUTOFILL_HINT_NAME);
            C12770k0 k0Var = C12770k0.f20423a;
            String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"anr_log_"}, 1));
            C12775o.m28638h(format, "java.lang.String.format(format, *args)");
            return new C13735j(format).mo53412e(str);
        }
    }

    /* renamed from: s2.f$b */
    /* compiled from: InstrumentUtility.kt */
    static final class C9461b implements FilenameFilter {

        /* renamed from: a */
        public static final C9461b f14074a = new C9461b();

        C9461b() {
        }

        public final boolean accept(File file, String str) {
            C12775o.m28638h(str, HintConstants.AUTOFILL_HINT_NAME);
            C12770k0 k0Var = C12770k0.f20423a;
            String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"analysis_log_"}, 1));
            C12775o.m28638h(format, "java.lang.String.format(format, *args)");
            return new C13735j(format).mo53412e(str);
        }
    }

    /* renamed from: s2.f$c */
    /* compiled from: InstrumentUtility.kt */
    static final class C9462c implements FilenameFilter {

        /* renamed from: a */
        public static final C9462c f14075a = new C9462c();

        C9462c() {
        }

        public final boolean accept(File file, String str) {
            C12775o.m28638h(str, HintConstants.AUTOFILL_HINT_NAME);
            C12770k0 k0Var = C12770k0.f20423a;
            String format = String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3));
            C12775o.m28638h(format, "java.lang.String.format(format, *args)");
            return new C13735j(format).mo53412e(str);
        }
    }

    private C9459f() {
    }

    /* renamed from: a */
    public static final boolean m19577a(String str) {
        File c = m19579c();
        if (c == null || str == null) {
            return false;
        }
        return new File(c, str).delete();
    }

    /* renamed from: b */
    public static final String m19578b(Throwable th) {
        if (th == null) {
            return null;
        }
        if (th.getCause() == null) {
            return th.toString();
        }
        return String.valueOf(th.getCause());
    }

    /* renamed from: c */
    public static final File m19579c() {
        File file = new File(FacebookSdk.getApplicationContext().getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    /* renamed from: d */
    public static final String m19580d(Thread thread) {
        C12775o.m28639i(thread, "thread");
        StackTraceElement[] stackTrace = thread.getStackTrace();
        JSONArray jSONArray = new JSONArray();
        for (StackTraceElement stackTraceElement : stackTrace) {
            jSONArray.put(stackTraceElement.toString());
        }
        return jSONArray.toString();
    }

    /* renamed from: e */
    public static final String m19581e(Throwable th) {
        Throwable th2 = null;
        if (th == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        while (th != null && th != th2) {
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                jSONArray.put(stackTraceElement.toString());
            }
            th2 = th;
            th = th.getCause();
        }
        return jSONArray.toString();
    }

    /* renamed from: f */
    public static final boolean m19582f(Throwable th) {
        if (th == null) {
            return false;
        }
        Throwable th2 = null;
        while (th != null && th != th2) {
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                C12775o.m28638h(stackTraceElement, CloudMethodReturns.RETURN_KEYNAME_ELEMENT);
                String className = stackTraceElement.getClassName();
                C12775o.m28638h(className, "element.className");
                if (C13754v.m31525E(className, "com.facebook", false, 2, (Object) null)) {
                    return true;
                }
            }
            th2 = th;
            th = th.getCause();
        }
        return false;
    }

    /* renamed from: g */
    public static final boolean m19583g(Thread thread) {
        StackTraceElement[] stackTrace;
        if (!(thread == null || (stackTrace = thread.getStackTrace()) == null)) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                C12775o.m28638h(stackTraceElement, CloudMethodReturns.RETURN_KEYNAME_ELEMENT);
                String className = stackTraceElement.getClassName();
                C12775o.m28638h(className, "element.className");
                if (C13754v.m31525E(className, "com.facebook", false, 2, (Object) null)) {
                    String className2 = stackTraceElement.getClassName();
                    C12775o.m28638h(className2, "element.className");
                    if (!C13754v.m31525E(className2, "com.facebook.appevents.codeless", false, 2, (Object) null)) {
                        String className3 = stackTraceElement.getClassName();
                        C12775o.m28638h(className3, "element.className");
                        if (!C13754v.m31525E(className3, "com.facebook.appevents.suggestedevents", false, 2, (Object) null)) {
                            return true;
                        }
                    }
                    String methodName = stackTraceElement.getMethodName();
                    C12775o.m28638h(methodName, "element.methodName");
                    if (!C13754v.m31525E(methodName, "onClick", false, 2, (Object) null)) {
                        String methodName2 = stackTraceElement.getMethodName();
                        C12775o.m28638h(methodName2, "element.methodName");
                        if (!C13754v.m31525E(methodName2, "onItemClick", false, 2, (Object) null)) {
                            String methodName3 = stackTraceElement.getMethodName();
                            C12775o.m28638h(methodName3, "element.methodName");
                            if (!C13754v.m31525E(methodName3, "onTouch", false, 2, (Object) null)) {
                                return true;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: h */
    public static final File[] m19584h() {
        File c = m19579c();
        if (c == null) {
            return new File[0];
        }
        File[] listFiles = c.listFiles(C9460a.f14073a);
        if (listFiles != null) {
            return listFiles;
        }
        return new File[0];
    }

    /* renamed from: i */
    public static final File[] m19585i() {
        File c = m19579c();
        if (c == null) {
            return new File[0];
        }
        File[] listFiles = c.listFiles(C9461b.f14074a);
        if (listFiles != null) {
            return listFiles;
        }
        return new File[0];
    }

    /* renamed from: j */
    public static final File[] m19586j() {
        File c = m19579c();
        if (c == null) {
            return new File[0];
        }
        File[] listFiles = c.listFiles(C9462c.f14075a);
        if (listFiles != null) {
            return listFiles;
        }
        return new File[0];
    }

    /* renamed from: k */
    public static final JSONObject m19587k(String str, boolean z) {
        File c = m19579c();
        if (!(c == null || str == null)) {
            try {
                return new JSONObject(C9138d0.m18644j0(new FileInputStream(new File(c, str))));
            } catch (Exception unused) {
                if (z) {
                    m19577a(str);
                }
            }
        }
        return null;
    }

    /* renamed from: l */
    public static final void m19588l(String str, JSONArray jSONArray, C4555l.C4557b bVar) {
        C12775o.m28639i(jSONArray, "reports");
        if (jSONArray.length() != 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(str, jSONArray.toString());
                C4555l.C4558c cVar = C4555l.f4241t;
                C12770k0 k0Var = C12770k0.f20423a;
                String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{FacebookSdk.getApplicationId()}, 1));
                C12775o.m28638h(format, "java.lang.String.format(format, *args)");
                cVar.mo31649w((C4509a) null, format, jSONObject, bVar).mo31621j();
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: m */
    public static final void m19589m(String str, String str2) {
        File c = m19579c();
        if (c != null && str != null && str2 != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(c, str));
                byte[] bytes = str2.getBytes(C13726d.f22152b);
                C12775o.m28638h(bytes, "(this as java.lang.String).getBytes(charset)");
                fileOutputStream.write(bytes);
                fileOutputStream.close();
            } catch (Exception unused) {
            }
        }
    }
}
