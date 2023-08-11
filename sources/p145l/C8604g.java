package p145l;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p115i.C8042f;

/* renamed from: l.g */
/* compiled from: FetchResult.kt */
public final class C8604g extends C8605h {

    /* renamed from: a */
    private final Drawable f12291a;

    /* renamed from: b */
    private final boolean f12292b;

    /* renamed from: c */
    private final C8042f f12293c;

    public C8604g(Drawable drawable, boolean z, C8042f fVar) {
        super((DefaultConstructorMarker) null);
        this.f12291a = drawable;
        this.f12292b = z;
        this.f12293c = fVar;
    }

    /* renamed from: a */
    public final C8042f mo42689a() {
        return this.f12293c;
    }

    /* renamed from: b */
    public final Drawable mo42690b() {
        return this.f12291a;
    }

    /* renamed from: c */
    public final boolean mo42691c() {
        return this.f12292b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8604g) {
            C8604g gVar = (C8604g) obj;
            if (C12775o.m28634d(this.f12291a, gVar.f12291a) && this.f12292b == gVar.f12292b && this.f12293c == gVar.f12293c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f12291a.hashCode() * 31) + Boolean.hashCode(this.f12292b)) * 31) + this.f12293c.hashCode();
    }
}
