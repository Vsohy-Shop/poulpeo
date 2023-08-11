package p205r;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: r.e */
/* compiled from: ImageResult.kt */
public final class C9336e extends C9342h {

    /* renamed from: a */
    private final Drawable f13788a;

    /* renamed from: b */
    private final C9339g f13789b;

    /* renamed from: c */
    private final Throwable f13790c;

    public C9336e(Drawable drawable, C9339g gVar, Throwable th) {
        super((DefaultConstructorMarker) null);
        this.f13788a = drawable;
        this.f13789b = gVar;
        this.f13790c = th;
    }

    /* renamed from: a */
    public Drawable mo43683a() {
        return this.f13788a;
    }

    /* renamed from: b */
    public C9339g mo43684b() {
        return this.f13789b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9336e) {
            C9336e eVar = (C9336e) obj;
            if (!C12775o.m28634d(mo43683a(), eVar.mo43683a()) || !C12775o.m28634d(mo43684b(), eVar.mo43684b()) || !C12775o.m28634d(this.f13790c, eVar.f13790c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        Drawable a = mo43683a();
        if (a != null) {
            i = a.hashCode();
        } else {
            i = 0;
        }
        return (((i * 31) + mo43684b().hashCode()) * 31) + this.f13790c.hashCode();
    }
}
