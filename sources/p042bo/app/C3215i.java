package p042bo.app;

import kotlin.jvm.internal.C12775o;
import p057d0.C7213c;

/* renamed from: bo.app.i */
public final class C3215i implements C7213c<String> {

    /* renamed from: b */
    private final String f1817b;

    public C3215i(String str) {
        C12775o.m28639i(str, "apiKey");
        this.f1817b = str;
    }

    /* renamed from: e */
    public String forJsonPut() {
        return this.f1817b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3215i) && C12775o.m28634d(this.f1817b, ((C3215i) obj).f1817b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f1817b.hashCode();
    }

    public String toString() {
        return this.f1817b;
    }
}
