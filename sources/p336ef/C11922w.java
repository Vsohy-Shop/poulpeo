package p336ef;

import java.io.Serializable;
import kotlin.Lazy;
import kotlin.jvm.internal.C12775o;
import p404of.C13074a;

/* renamed from: ef.w */
/* compiled from: Lazy.kt */
public final class C11922w<T> implements Lazy<T>, Serializable {

    /* renamed from: b */
    private C13074a<? extends T> f18619b;

    /* renamed from: c */
    private Object f18620c = C11918t.f18615a;

    public C11922w(C13074a<? extends T> aVar) {
        C12775o.m28639i(aVar, "initializer");
        this.f18619b = aVar;
    }

    private final Object writeReplace() {
        return new C11896d(getValue());
    }

    /* renamed from: a */
    public boolean mo49140a() {
        if (this.f18620c != C11918t.f18615a) {
            return true;
        }
        return false;
    }

    public T getValue() {
        if (this.f18620c == C11918t.f18615a) {
            C13074a<? extends T> aVar = this.f18619b;
            C12775o.m28636f(aVar);
            this.f18620c = aVar.invoke();
            this.f18619b = null;
        }
        return this.f18620c;
    }

    public String toString() {
        if (mo49140a()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
