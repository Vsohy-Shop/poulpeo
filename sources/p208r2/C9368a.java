package p208r2;

import androidx.autofill.HintConstants;
import kotlin.jvm.internal.C12775o;

/* renamed from: r2.a */
/* compiled from: GateKeeper.kt */
public final class C9368a {

    /* renamed from: a */
    private final String f13929a;

    /* renamed from: b */
    private final boolean f13930b;

    public C9368a(String str, boolean z) {
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        this.f13929a = str;
        this.f13930b = z;
    }

    /* renamed from: a */
    public final String mo43792a() {
        return this.f13929a;
    }

    /* renamed from: b */
    public final boolean mo43793b() {
        return this.f13930b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9368a)) {
            return false;
        }
        C9368a aVar = (C9368a) obj;
        if (!C12775o.m28634d(this.f13929a, aVar.f13929a) || this.f13930b != aVar.f13930b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        String str = this.f13929a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i2 = i * 31;
        boolean z = this.f13930b;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public String toString() {
        return "GateKeeper(name=" + this.f13929a + ", value=" + this.f13930b + ")";
    }
}
