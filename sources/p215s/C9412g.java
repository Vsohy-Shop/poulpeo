package p215s;

import android.view.View;
import kotlin.jvm.internal.C12775o;

/* renamed from: s.g */
/* compiled from: RealViewSizeResolver.kt */
public final class C9412g<T extends View> implements C9418l<T> {

    /* renamed from: b */
    private final T f13989b;

    /* renamed from: c */
    private final boolean f13990c;

    public C9412g(T t, boolean z) {
        this.f13989b = t;
        this.f13990c = z;
    }

    /* renamed from: e */
    public boolean mo43830e() {
        return this.f13990c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9412g) {
            C9412g gVar = (C9412g) obj;
            if (!C12775o.m28634d(getView(), gVar.getView()) || mo43830e() != gVar.mo43830e()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public T getView() {
        return this.f13989b;
    }

    public int hashCode() {
        return (getView().hashCode() * 31) + Boolean.hashCode(mo43830e());
    }
}
