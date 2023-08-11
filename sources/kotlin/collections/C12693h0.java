package kotlin.collections;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C12775o;
import p412pf.C13212a;

/* renamed from: kotlin.collections.h0 */
/* compiled from: Maps.kt */
final class C12693h0 implements Map, Serializable, C13212a {

    /* renamed from: b */
    public static final C12693h0 f20367b = new C12693h0();
    private static final long serialVersionUID = 8246714829545688274L;

    private C12693h0() {
    }

    private final Object readResolve() {
        return f20367b;
    }

    /* renamed from: a */
    public boolean mo50503a(Void voidR) {
        C12775o.m28639i(voidR, "value");
        return false;
    }

    /* renamed from: b */
    public Void get(Object obj) {
        return null;
    }

    /* renamed from: c */
    public Set<Map.Entry> mo50505c() {
        return C12696i0.f20368b;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return false;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return mo50503a((Void) obj);
    }

    /* renamed from: e */
    public Set<Object> mo50509e() {
        return C12696i0.f20368b;
    }

    public final /* bridge */ Set<Map.Entry> entrySet() {
        return mo50505c();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Map) || !((Map) obj).isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public int mo50512f() {
        return 0;
    }

    /* renamed from: g */
    public Collection mo50513g() {
        return C12691g0.f20366b;
    }

    /* renamed from: h */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public final /* bridge */ Set<Object> keySet() {
        return mo50509e();
    }

    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo50512f();
    }

    public String toString() {
        return "{}";
    }

    public final /* bridge */ Collection values() {
        return mo50513g();
    }
}
