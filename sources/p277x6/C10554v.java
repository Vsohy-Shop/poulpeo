package p277x6;

import androidx.annotation.NonNull;
import p277x6.C10450a0;

/* renamed from: x6.v */
/* compiled from: AutoValue_CrashlyticsReport_Session_User */
final class C10554v extends C10450a0.C10460e.C10489f {

    /* renamed from: a */
    private final String f16049a;

    /* renamed from: x6.v$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session_User */
    static final class C10556b extends C10450a0.C10460e.C10489f.C10490a {

        /* renamed from: a */
        private String f16050a;

        C10556b() {
        }

        /* renamed from: a */
        public C10450a0.C10460e.C10489f mo45359a() {
            String str = "";
            if (this.f16050a == null) {
                str = str + " identifier";
            }
            if (str.isEmpty()) {
                return new C10554v(this.f16050a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C10450a0.C10460e.C10489f.C10490a mo45360b(String str) {
            if (str != null) {
                this.f16050a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }
    }

    @NonNull
    /* renamed from: b */
    public String mo45358b() {
        return this.f16049a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10450a0.C10460e.C10489f) {
            return this.f16049a.equals(((C10450a0.C10460e.C10489f) obj).mo45358b());
        }
        return false;
    }

    public int hashCode() {
        return this.f16049a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f16049a + "}";
    }

    private C10554v(String str) {
        this.f16049a = str;
    }
}
