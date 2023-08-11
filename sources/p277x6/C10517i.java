package p277x6;

import androidx.annotation.NonNull;
import p277x6.C10450a0;

/* renamed from: x6.i */
/* compiled from: AutoValue_CrashlyticsReport_Session_Application_Organization */
final class C10517i extends C10450a0.C10460e.C10461a.C10463b {

    /* renamed from: a */
    private final String f15938a;

    @NonNull
    /* renamed from: a */
    public String mo45218a() {
        return this.f15938a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10450a0.C10460e.C10461a.C10463b) {
            return this.f15938a.equals(((C10450a0.C10460e.C10461a.C10463b) obj).mo45218a());
        }
        return false;
    }

    public int hashCode() {
        return this.f15938a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Organization{clsId=" + this.f15938a + "}";
    }
}
