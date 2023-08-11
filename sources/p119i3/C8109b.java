package p119i3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: i3.b */
/* compiled from: Encoding */
public final class C8109b {

    /* renamed from: a */
    private final String f11414a;

    private C8109b(@NonNull String str) {
        if (str != null) {
            this.f11414a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    /* renamed from: b */
    public static C8109b m15970b(@NonNull String str) {
        return new C8109b(str);
    }

    /* renamed from: a */
    public String mo41963a() {
        return this.f11414a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8109b)) {
            return false;
        }
        return this.f11414a.equals(((C8109b) obj).f11414a);
    }

    public int hashCode() {
        return this.f11414a.hashCode() ^ 1000003;
    }

    @NonNull
    public String toString() {
        return "Encoding{name=\"" + this.f11414a + "\"}";
    }
}
