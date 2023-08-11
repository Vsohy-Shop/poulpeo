package p277x6;

import androidx.annotation.NonNull;
import p277x6.C10450a0;

/* renamed from: x6.t */
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Log */
final class C10548t extends C10450a0.C10460e.C10467d.C10485d {

    /* renamed from: a */
    private final String f16039a;

    /* renamed from: x6.t$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Log */
    static final class C10550b extends C10450a0.C10460e.C10467d.C10485d.C10486a {

        /* renamed from: a */
        private String f16040a;

        C10550b() {
        }

        /* renamed from: a */
        public C10450a0.C10460e.C10467d.C10485d mo45347a() {
            String str = "";
            if (this.f16040a == null) {
                str = str + " content";
            }
            if (str.isEmpty()) {
                return new C10548t(this.f16040a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C10450a0.C10460e.C10467d.C10485d.C10486a mo45348b(String str) {
            if (str != null) {
                this.f16040a = str;
                return this;
            }
            throw new NullPointerException("Null content");
        }
    }

    @NonNull
    /* renamed from: b */
    public String mo45346b() {
        return this.f16039a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10450a0.C10460e.C10467d.C10485d) {
            return this.f16039a.equals(((C10450a0.C10460e.C10467d.C10485d) obj).mo45346b());
        }
        return false;
    }

    public int hashCode() {
        return this.f16039a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f16039a + "}";
    }

    private C10548t(String str) {
        this.f16039a = str;
    }
}
