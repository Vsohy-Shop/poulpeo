package p205r;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p115i.C8042f;
import p185p.C9016c;

/* renamed from: r.o */
/* compiled from: ImageResult.kt */
public final class C9352o extends C9342h {

    /* renamed from: a */
    private final Drawable f13899a;

    /* renamed from: b */
    private final C9339g f13900b;

    /* renamed from: c */
    private final C8042f f13901c;

    /* renamed from: d */
    private final C9016c.C9018b f13902d;

    /* renamed from: e */
    private final String f13903e;

    /* renamed from: f */
    private final boolean f13904f;

    /* renamed from: g */
    private final boolean f13905g;

    public C9352o(Drawable drawable, C9339g gVar, C8042f fVar, C9016c.C9018b bVar, String str, boolean z, boolean z2) {
        super((DefaultConstructorMarker) null);
        this.f13899a = drawable;
        this.f13900b = gVar;
        this.f13901c = fVar;
        this.f13902d = bVar;
        this.f13903e = str;
        this.f13904f = z;
        this.f13905g = z2;
    }

    /* renamed from: a */
    public Drawable mo43683a() {
        return this.f13899a;
    }

    /* renamed from: b */
    public C9339g mo43684b() {
        return this.f13900b;
    }

    /* renamed from: c */
    public final C8042f mo43769c() {
        return this.f13901c;
    }

    /* renamed from: d */
    public final boolean mo43770d() {
        return this.f13905g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9352o) {
            C9352o oVar = (C9352o) obj;
            if (!C12775o.m28634d(mo43683a(), oVar.mo43683a()) || !C12775o.m28634d(mo43684b(), oVar.mo43684b()) || this.f13901c != oVar.f13901c || !C12775o.m28634d(this.f13902d, oVar.f13902d) || !C12775o.m28634d(this.f13903e, oVar.f13903e) || this.f13904f != oVar.f13904f || this.f13905g != oVar.f13905g) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = ((((mo43683a().hashCode() * 31) + mo43684b().hashCode()) * 31) + this.f13901c.hashCode()) * 31;
        C9016c.C9018b bVar = this.f13902d;
        int i2 = 0;
        if (bVar != null) {
            i = bVar.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        String str = this.f13903e;
        if (str != null) {
            i2 = str.hashCode();
        }
        return ((((i3 + i2) * 31) + Boolean.hashCode(this.f13904f)) * 31) + Boolean.hashCode(this.f13905g);
    }
}
