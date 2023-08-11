package p149l3;

import android.content.Context;
import androidx.annotation.NonNull;
import p252v3.C9927a;

/* renamed from: l3.c */
/* compiled from: AutoValue_CreationContext */
final class C8659c extends C8666h {

    /* renamed from: a */
    private final Context f12382a;

    /* renamed from: b */
    private final C9927a f12383b;

    /* renamed from: c */
    private final C9927a f12384c;

    /* renamed from: d */
    private final String f12385d;

    C8659c(Context context, C9927a aVar, C9927a aVar2, String str) {
        if (context != null) {
            this.f12382a = context;
            if (aVar != null) {
                this.f12383b = aVar;
                if (aVar2 != null) {
                    this.f12384c = aVar2;
                    if (str != null) {
                        this.f12385d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    /* renamed from: b */
    public Context mo42742b() {
        return this.f12382a;
    }

    @NonNull
    /* renamed from: c */
    public String mo42743c() {
        return this.f12385d;
    }

    /* renamed from: d */
    public C9927a mo42744d() {
        return this.f12384c;
    }

    /* renamed from: e */
    public C9927a mo42745e() {
        return this.f12383b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8666h)) {
            return false;
        }
        C8666h hVar = (C8666h) obj;
        if (!this.f12382a.equals(hVar.mo42742b()) || !this.f12383b.equals(hVar.mo42745e()) || !this.f12384c.equals(hVar.mo42744d()) || !this.f12385d.equals(hVar.mo42743c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.f12382a.hashCode() ^ 1000003) * 1000003) ^ this.f12383b.hashCode()) * 1000003) ^ this.f12384c.hashCode()) * 1000003) ^ this.f12385d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f12382a + ", wallClock=" + this.f12383b + ", monotonicClock=" + this.f12384c + ", backendName=" + this.f12385d + "}";
    }
}
