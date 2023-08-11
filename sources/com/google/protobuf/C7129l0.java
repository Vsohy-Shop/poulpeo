package com.google.protobuf;

import com.google.protobuf.C7115i0;
import java.util.Map;

/* renamed from: com.google.protobuf.l0 */
/* compiled from: MapFieldSchemaLite */
class C7129l0 implements C7126k0 {
    C7129l0() {
    }

    /* renamed from: i */
    private static <K, V> int m13421i(int i, Object obj, Object obj2) {
        C7120j0 j0Var = (C7120j0) obj;
        C7115i0 i0Var = (C7115i0) obj2;
        int i2 = 0;
        if (j0Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : j0Var.entrySet()) {
            i2 += i0Var.mo40440a(i, entry.getKey(), entry.getValue());
        }
        return i2;
    }

    /* renamed from: j */
    private static <K, V> C7120j0<K, V> m13422j(Object obj, Object obj2) {
        C7120j0<K, V> j0Var = (C7120j0) obj;
        C7120j0 j0Var2 = (C7120j0) obj2;
        if (!j0Var2.isEmpty()) {
            if (!j0Var.mo40449i()) {
                j0Var = j0Var.mo40452m();
            }
            j0Var.mo40451l(j0Var2);
        }
        return j0Var;
    }

    /* renamed from: a */
    public Object mo40499a(Object obj, Object obj2) {
        return m13422j(obj, obj2);
    }

    /* renamed from: b */
    public Object mo40500b(Object obj) {
        ((C7120j0) obj).mo40450j();
        return obj;
    }

    /* renamed from: c */
    public C7115i0.C7116a<?, ?> mo40501c(Object obj) {
        return ((C7115i0) obj).mo40441c();
    }

    /* renamed from: d */
    public Map<?, ?> mo40502d(Object obj) {
        return (C7120j0) obj;
    }

    /* renamed from: e */
    public Object mo40503e(Object obj) {
        return C7120j0.m13319e().mo40452m();
    }

    /* renamed from: f */
    public int mo40504f(int i, Object obj, Object obj2) {
        return m13421i(i, obj, obj2);
    }

    /* renamed from: g */
    public boolean mo40505g(Object obj) {
        return !((C7120j0) obj).mo40449i();
    }

    /* renamed from: h */
    public Map<?, ?> mo40506h(Object obj) {
        return (C7120j0) obj;
    }
}
