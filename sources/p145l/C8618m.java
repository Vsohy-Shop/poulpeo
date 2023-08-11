package p145l;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p115i.C8042f;
import p115i.C8056p;

/* renamed from: l.m */
/* compiled from: FetchResult.kt */
public final class C8618m extends C8605h {

    /* renamed from: a */
    private final C8056p f12318a;

    /* renamed from: b */
    private final String f12319b;

    /* renamed from: c */
    private final C8042f f12320c;

    public C8618m(C8056p pVar, String str, C8042f fVar) {
        super((DefaultConstructorMarker) null);
        this.f12318a = pVar;
        this.f12319b = str;
        this.f12320c = fVar;
    }

    /* renamed from: a */
    public final C8042f mo42698a() {
        return this.f12320c;
    }

    /* renamed from: b */
    public final C8056p mo42699b() {
        return this.f12318a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8618m) {
            C8618m mVar = (C8618m) obj;
            if (!C12775o.m28634d(this.f12318a, mVar.f12318a) || !C12775o.m28634d(this.f12319b, mVar.f12319b) || this.f12320c != mVar.f12320c) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f12318a.hashCode() * 31;
        String str = this.f12319b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return ((hashCode + i) * 31) + this.f12320c.hashCode();
    }
}
