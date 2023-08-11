package p262w2;

import androidx.annotation.RestrictTo;
import java.io.File;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import p218s2.C9459f;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: w2.a */
/* compiled from: ErrorReportData.kt */
public final class C10105a {

    /* renamed from: d */
    public static final C10106a f15264d = new C10106a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private String f15265a;

    /* renamed from: b */
    private String f15266b;

    /* renamed from: c */
    private Long f15267c;

    /* renamed from: w2.a$a */
    /* compiled from: ErrorReportData.kt */
    public static final class C10106a {
        private C10106a() {
        }

        public /* synthetic */ C10106a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C10105a(String str) {
        this.f15267c = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        this.f15266b = str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("error_log_");
        Long l = this.f15267c;
        if (l != null) {
            stringBuffer.append(l.longValue());
            stringBuffer.append(".json");
            String stringBuffer2 = stringBuffer.toString();
            C12775o.m28638h(stringBuffer2, "StringBuffer()\n         …)\n            .toString()");
            this.f15265a = stringBuffer2;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
    }

    /* renamed from: a */
    public final void mo44681a() {
        C9459f.m19577a(this.f15265a);
    }

    /* renamed from: b */
    public final int mo44682b(C10105a aVar) {
        C12775o.m28639i(aVar, "data");
        Long l = this.f15267c;
        if (l == null) {
            return -1;
        }
        long longValue = l.longValue();
        Long l2 = aVar.f15267c;
        if (l2 != null) {
            return (l2.longValue() > longValue ? 1 : (l2.longValue() == longValue ? 0 : -1));
        }
        return 1;
    }

    /* renamed from: c */
    public final JSONObject mo44683c() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l = this.f15267c;
            if (l != null) {
                jSONObject.put("timestamp", l.longValue());
            }
            jSONObject.put("error_message", this.f15266b);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public final boolean mo44684d() {
        if (this.f15266b == null || this.f15267c == null) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final void mo44685e() {
        if (mo44684d()) {
            C9459f.m19589m(this.f15265a, toString());
        }
    }

    public String toString() {
        JSONObject c = mo44683c();
        if (c == null) {
            return super.toString();
        }
        String jSONObject = c.toString();
        C12775o.m28638h(jSONObject, "params.toString()");
        return jSONObject;
    }

    public C10105a(File file) {
        C12775o.m28639i(file, "file");
        String name = file.getName();
        C12775o.m28638h(name, "file.name");
        this.f15265a = name;
        JSONObject k = C9459f.m19587k(name, true);
        if (k != null) {
            this.f15267c = Long.valueOf(k.optLong("timestamp", 0));
            this.f15266b = k.optString("error_message", (String) null);
        }
    }
}
