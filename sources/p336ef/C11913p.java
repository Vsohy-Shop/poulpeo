package p336ef;

import java.io.Serializable;
import kotlin.Lazy;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p404of.C13074a;

/* renamed from: ef.p */
/* compiled from: LazyJVM.kt */
final class C11913p<T> implements Lazy<T>, Serializable {

    /* renamed from: b */
    private C13074a<? extends T> f18607b;

    /* renamed from: c */
    private volatile Object f18608c;

    /* renamed from: d */
    private final Object f18609d;

    public C11913p(C13074a<? extends T> aVar, Object obj) {
        C12775o.m28639i(aVar, "initializer");
        this.f18607b = aVar;
        this.f18608c = C11918t.f18615a;
        this.f18609d = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new C11896d(getValue());
    }

    /* renamed from: a */
    public boolean mo49121a() {
        if (this.f18608c != C11918t.f18615a) {
            return true;
        }
        return false;
    }

    public T getValue() {
        T t;
        T t2 = this.f18608c;
        T t3 = C11918t.f18615a;
        if (t2 != t3) {
            return t2;
        }
        synchronized (this.f18609d) {
            t = this.f18608c;
            if (t == t3) {
                C13074a aVar = this.f18607b;
                C12775o.m28636f(aVar);
                t = aVar.invoke();
                this.f18608c = t;
                this.f18607b = null;
            }
        }
        return t;
    }

    public String toString() {
        if (mo49121a()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11913p(C13074a aVar, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i & 2) != 0 ? null : obj);
    }
}
