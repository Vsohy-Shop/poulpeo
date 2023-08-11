package p218s2;

import android.os.Build;
import androidx.annotation.RestrictTo;
import com.appboy.Constants;
import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import java.io.File;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p198q2.C9138d0;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: s2.b */
/* compiled from: InstrumentData.kt */
public final class C9449b {

    /* renamed from: h */
    public static final C9451b f14048h = new C9451b((DefaultConstructorMarker) null);

    /* renamed from: a */
    private String f14049a;

    /* renamed from: b */
    private C9452c f14050b;

    /* renamed from: c */
    private JSONArray f14051c;

    /* renamed from: d */
    private String f14052d;

    /* renamed from: e */
    private String f14053e;

    /* renamed from: f */
    private String f14054f;

    /* renamed from: g */
    private Long f14055g;

    /* renamed from: s2.b$a */
    /* compiled from: InstrumentData.kt */
    public static final class C9450a {

        /* renamed from: a */
        public static final C9450a f14056a = new C9450a();

        private C9450a() {
        }

        /* renamed from: a */
        public static final C9449b m19566a(String str, String str2) {
            return new C9449b(str, str2, (DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public static final C9449b m19567b(Throwable th, C9452c cVar) {
            C12775o.m28639i(cVar, Constants.APPBOY_PUSH_TITLE_KEY);
            return new C9449b(th, cVar, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public static final C9449b m19568c(JSONArray jSONArray) {
            C12775o.m28639i(jSONArray, "features");
            return new C9449b(jSONArray, (DefaultConstructorMarker) null);
        }

        /* renamed from: d */
        public static final C9449b m19569d(File file) {
            C12775o.m28639i(file, "file");
            return new C9449b(file, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: s2.b$b */
    /* compiled from: InstrumentData.kt */
    public static final class C9451b {
        private C9451b() {
        }

        public /* synthetic */ C9451b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final C9452c m19571b(String str) {
            if (C13754v.m31525E(str, "crash_log_", false, 2, (Object) null)) {
                return C9452c.CrashReport;
            }
            if (C13754v.m31525E(str, "shield_log_", false, 2, (Object) null)) {
                return C9452c.CrashShield;
            }
            if (C13754v.m31525E(str, "thread_check_log_", false, 2, (Object) null)) {
                return C9452c.ThreadCheck;
            }
            if (C13754v.m31525E(str, "analysis_log_", false, 2, (Object) null)) {
                return C9452c.Analysis;
            }
            if (C13754v.m31525E(str, "anr_log_", false, 2, (Object) null)) {
                return C9452c.AnrReport;
            }
            return C9452c.Unknown;
        }
    }

    /* renamed from: s2.b$c */
    /* compiled from: InstrumentData.kt */
    public enum C9452c {
        Unknown,
        Analysis,
        AnrReport,
        CrashReport,
        CrashShield,
        ThreadCheck;

        /* renamed from: a */
        public final String mo43898a() {
            int i = C9453c.f14065b[ordinal()];
            if (i == 1) {
                return "analysis_log_";
            }
            if (i == 2) {
                return "anr_log_";
            }
            if (i == 3) {
                return "crash_log_";
            }
            if (i == 4) {
                return "shield_log_";
            }
            if (i != 5) {
                return "Unknown";
            }
            return "thread_check_log_";
        }

        public String toString() {
            int i = C9453c.f14064a[ordinal()];
            if (i == 1) {
                return "Analysis";
            }
            if (i == 2) {
                return "AnrReport";
            }
            if (i == 3) {
                return "CrashReport";
            }
            if (i == 4) {
                return "CrashShield";
            }
            if (i != 5) {
                return "Unknown";
            }
            return "ThreadCheck";
        }
    }

    public /* synthetic */ C9449b(File file, DefaultConstructorMarker defaultConstructorMarker) {
        this(file);
    }

    /* renamed from: c */
    private final JSONObject m19559c() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = this.f14051c;
            if (jSONArray != null) {
                jSONObject.put("feature_names", jSONArray);
            }
            Long l = this.f14055g;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: d */
    private final JSONObject m19560d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_os_version", Build.VERSION.RELEASE);
            jSONObject.put("device_model", Build.MODEL);
            String str = this.f14052d;
            if (str != null) {
                jSONObject.put("app_version", str);
            }
            Long l = this.f14055g;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            String str2 = this.f14053e;
            if (str2 != null) {
                jSONObject.put("reason", str2);
            }
            String str3 = this.f14054f;
            if (str3 != null) {
                jSONObject.put("callstack", str3);
            }
            C9452c cVar = this.f14050b;
            if (cVar != null) {
                jSONObject.put(JSONAPIResourceIdSerializer.FIELD_TYPE, cVar);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    private final JSONObject m19561e() {
        C9452c cVar = this.f14050b;
        if (cVar == null) {
            return null;
        }
        int i = C9454d.f14067b[cVar.ordinal()];
        if (i == 1) {
            return m19559c();
        }
        if (i == 2 || i == 3 || i == 4 || i == 5) {
            return m19560d();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo43893a() {
        C9459f.m19577a(this.f14049a);
    }

    /* renamed from: b */
    public final int mo43894b(C9449b bVar) {
        C12775o.m28639i(bVar, "data");
        Long l = this.f14055g;
        if (l == null) {
            return -1;
        }
        long longValue = l.longValue();
        Long l2 = bVar.f14055g;
        if (l2 != null) {
            return (l2.longValue() > longValue ? 1 : (l2.longValue() == longValue ? 0 : -1));
        }
        return 1;
    }

    /* renamed from: f */
    public final boolean mo43895f() {
        C9452c cVar = this.f14050b;
        if (cVar != null) {
            int i = C9454d.f14066a[cVar.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if ((i != 3 && i != 4 && i != 5) || this.f14054f == null || this.f14055g == null) {
                        return false;
                    }
                    return true;
                } else if (this.f14054f == null || this.f14053e == null || this.f14055g == null) {
                    return false;
                } else {
                    return true;
                }
            } else if (this.f14051c == null || this.f14055g == null) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final void mo43896g() {
        if (mo43895f()) {
            C9459f.m19589m(this.f14049a, toString());
        }
    }

    public String toString() {
        JSONObject e = m19561e();
        if (e != null) {
            String jSONObject = e.toString();
            C12775o.m28638h(jSONObject, "params.toString()");
            return jSONObject;
        }
        String jSONObject2 = new JSONObject().toString();
        C12775o.m28638h(jSONObject2, "JSONObject().toString()");
        return jSONObject2;
    }

    public /* synthetic */ C9449b(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public /* synthetic */ C9449b(Throwable th, C9452c cVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, cVar);
    }

    public /* synthetic */ C9449b(JSONArray jSONArray, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONArray);
    }

    private C9449b(JSONArray jSONArray) {
        this.f14050b = C9452c.Analysis;
        this.f14055g = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        this.f14051c = jSONArray;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("analysis_log_");
        stringBuffer.append(String.valueOf(this.f14055g));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        C12775o.m28638h(stringBuffer2, "StringBuffer()\n         …)\n            .toString()");
        this.f14049a = stringBuffer2;
    }

    private C9449b(Throwable th, C9452c cVar) {
        this.f14050b = cVar;
        this.f14052d = C9138d0.m18661s();
        this.f14053e = C9459f.m19578b(th);
        this.f14054f = C9459f.m19581e(th);
        this.f14055g = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(cVar.mo43898a());
        stringBuffer.append(String.valueOf(this.f14055g));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        C12775o.m28638h(stringBuffer2, "StringBuffer().append(t.…ppend(\".json\").toString()");
        this.f14049a = stringBuffer2;
    }

    private C9449b(String str, String str2) {
        this.f14050b = C9452c.AnrReport;
        this.f14052d = C9138d0.m18661s();
        this.f14053e = str;
        this.f14054f = str2;
        this.f14055g = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("anr_log_");
        stringBuffer.append(String.valueOf(this.f14055g));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        C12775o.m28638h(stringBuffer2, "StringBuffer()\n         …)\n            .toString()");
        this.f14049a = stringBuffer2;
    }

    private C9449b(File file) {
        String name = file.getName();
        C12775o.m28638h(name, "file.name");
        this.f14049a = name;
        this.f14050b = f14048h.m19571b(name);
        JSONObject k = C9459f.m19587k(this.f14049a, true);
        if (k != null) {
            this.f14055g = Long.valueOf(k.optLong("timestamp", 0));
            this.f14052d = k.optString("app_version", (String) null);
            this.f14053e = k.optString("reason", (String) null);
            this.f14054f = k.optString("callstack", (String) null);
            this.f14051c = k.optJSONArray("feature_names");
        }
    }
}
