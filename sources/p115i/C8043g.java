package p115i;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.C12775o;

/* renamed from: i.g */
/* compiled from: DecodeResult.kt */
public final class C8043g {

    /* renamed from: a */
    private final Drawable f11286a;

    /* renamed from: b */
    private final boolean f11287b;

    public C8043g(Drawable drawable, boolean z) {
        this.f11286a = drawable;
        this.f11287b = z;
    }

    /* renamed from: a */
    public final Drawable mo41869a() {
        return this.f11286a;
    }

    /* renamed from: b */
    public final boolean mo41870b() {
        return this.f11287b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8043g) {
            C8043g gVar = (C8043g) obj;
            if (!C12775o.m28634d(this.f11286a, gVar.f11286a) || this.f11287b != gVar.f11287b) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f11286a.hashCode() * 31) + Boolean.hashCode(this.f11287b);
    }
}
