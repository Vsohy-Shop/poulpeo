package p277x6;

import androidx.annotation.NonNull;
import p277x6.C10450a0;

/* renamed from: x6.d */
/* compiled from: AutoValue_CrashlyticsReport_CustomAttribute */
final class C10502d extends C10450a0.C10454c {

    /* renamed from: a */
    private final String f15890a;

    /* renamed from: b */
    private final String f15891b;

    /* renamed from: x6.d$b */
    /* compiled from: AutoValue_CrashlyticsReport_CustomAttribute */
    static final class C10504b extends C10450a0.C10454c.C10455a {

        /* renamed from: a */
        private String f15892a;

        /* renamed from: b */
        private String f15893b;

        C10504b() {
        }

        /* renamed from: a */
        public C10450a0.C10454c mo45176a() {
            String str = "";
            if (this.f15892a == null) {
                str = str + " key";
            }
            if (this.f15893b == null) {
                str = str + " value";
            }
            if (str.isEmpty()) {
                return new C10502d(this.f15892a, this.f15893b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C10450a0.C10454c.C10455a mo45177b(String str) {
            if (str != null) {
                this.f15892a = str;
                return this;
            }
            throw new NullPointerException("Null key");
        }

        /* renamed from: c */
        public C10450a0.C10454c.C10455a mo45178c(String str) {
            if (str != null) {
                this.f15893b = str;
                return this;
            }
            throw new NullPointerException("Null value");
        }
    }

    @NonNull
    /* renamed from: b */
    public String mo45174b() {
        return this.f15890a;
    }

    @NonNull
    /* renamed from: c */
    public String mo45175c() {
        return this.f15891b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10450a0.C10454c)) {
            return false;
        }
        C10450a0.C10454c cVar = (C10450a0.C10454c) obj;
        if (!this.f15890a.equals(cVar.mo45174b()) || !this.f15891b.equals(cVar.mo45175c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f15890a.hashCode() ^ 1000003) * 1000003) ^ this.f15891b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f15890a + ", value=" + this.f15891b + "}";
    }

    private C10502d(String str, String str2) {
        this.f15890a = str;
        this.f15891b = str2;
    }
}
