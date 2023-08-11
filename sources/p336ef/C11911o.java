package p336ef;

import androidx.concurrent.futures.C1248a;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Lazy;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p404of.C13074a;

/* renamed from: ef.o */
/* compiled from: LazyJVM.kt */
final class C11911o<T> implements Lazy<T>, Serializable {

    /* renamed from: e */
    public static final C11912a f18602e = new C11912a((DefaultConstructorMarker) null);

    /* renamed from: f */
    private static final AtomicReferenceFieldUpdater<C11911o<?>, Object> f18603f = AtomicReferenceFieldUpdater.newUpdater(C11911o.class, Object.class, "c");

    /* renamed from: b */
    private volatile C13074a<? extends T> f18604b;

    /* renamed from: c */
    private volatile Object f18605c;

    /* renamed from: d */
    private final Object f18606d;

    /* renamed from: ef.o$a */
    /* compiled from: LazyJVM.kt */
    public static final class C11912a {
        private C11912a() {
        }

        public /* synthetic */ C11912a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C11911o(C13074a<? extends T> aVar) {
        C12775o.m28639i(aVar, "initializer");
        this.f18604b = aVar;
        C11918t tVar = C11918t.f18615a;
        this.f18605c = tVar;
        this.f18606d = tVar;
    }

    private final Object writeReplace() {
        return new C11896d(getValue());
    }

    /* renamed from: a */
    public boolean mo49119a() {
        if (this.f18605c != C11918t.f18615a) {
            return true;
        }
        return false;
    }

    public T getValue() {
        T t = this.f18605c;
        T t2 = C11918t.f18615a;
        if (t != t2) {
            return t;
        }
        C13074a<? extends T> aVar = this.f18604b;
        if (aVar != null) {
            T invoke = aVar.invoke();
            if (C1248a.m719a(f18603f, this, t2, invoke)) {
                this.f18604b = null;
                return invoke;
            }
        }
        return this.f18605c;
    }

    public String toString() {
        if (mo49119a()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
