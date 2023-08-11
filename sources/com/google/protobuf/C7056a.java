package com.google.protobuf;

import com.google.protobuf.C7056a;
import com.google.protobuf.C7056a.C7057a;
import com.google.protobuf.C7086h;
import com.google.protobuf.C7149p0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.protobuf.a */
/* compiled from: AbstractMessageLite */
public abstract class C7056a<MessageType extends C7056a<MessageType, BuilderType>, BuilderType extends C7057a<MessageType, BuilderType>> implements C7149p0 {
    protected int memoizedHashCode = 0;

    /* renamed from: com.google.protobuf.a$a */
    /* compiled from: AbstractMessageLite */
    public static abstract class C7057a<MessageType extends C7056a<MessageType, BuilderType>, BuilderType extends C7057a<MessageType, BuilderType>> implements C7149p0.C7150a {
        /* renamed from: l */
        protected static <T> void m12775l(Iterable<T> iterable, List<? super T> list) {
            C7196z.m13944a(iterable);
            if (iterable instanceof C7075e0) {
                List<?> p = ((C7075e0) iterable).mo40220p();
                C7075e0 e0Var = (C7075e0) list;
                int size = list.size();
                for (Object next : p) {
                    if (next == null) {
                        String str = "Element at index " + (e0Var.size() - size) + " is null.";
                        for (int size2 = e0Var.size() - 1; size2 >= size; size2--) {
                            e0Var.remove(size2);
                        }
                        throw new NullPointerException(str);
                    } else if (next instanceof C7086h) {
                        e0Var.mo40219o((C7086h) next);
                    } else {
                        e0Var.add((String) next);
                    }
                }
            } else if (iterable instanceof C7195y0) {
                list.addAll((Collection) iterable);
            } else {
                m12776m(iterable, list);
            }
        }

        /* renamed from: m */
        private static <T> void m12776m(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (T next : iterable) {
                if (next == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(next);
            }
        }

        /* renamed from: p */
        protected static UninitializedMessageException m12777p(C7149p0 p0Var) {
            return new UninitializedMessageException(p0Var);
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public abstract BuilderType mo40157n(MessageType messagetype);

        /* renamed from: o */
        public BuilderType mo40156O(C7149p0 p0Var) {
            if (mo40636a().getClass().isInstance(p0Var)) {
                return mo40157n((C7056a) p0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    /* renamed from: k */
    protected static <T> void m12766k(Iterable<T> iterable, List<? super T> list) {
        C7057a.m12775l(iterable, list);
    }

    /* renamed from: n */
    private String m12767n(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    /* renamed from: c */
    public void mo40149c(OutputStream outputStream) {
        CodedOutputStream f0 = CodedOutputStream.m12615f0(outputStream, CodedOutputStream.m12591I(mo40627f()));
        mo40626d(f0);
        f0.mo40112c0();
    }

    /* renamed from: e */
    public C7086h mo40150e() {
        try {
            C7086h.C7094h A = C7086h.m13053A(mo40627f());
            mo40626d(A.mo40349b());
            return A.mo40348a();
        } catch (IOException e) {
            throw new RuntimeException(m12767n("ByteString"), e);
        }
    }

    /* renamed from: g */
    public byte[] mo40151g() {
        try {
            byte[] bArr = new byte[mo40627f()];
            CodedOutputStream g0 = CodedOutputStream.m12617g0(bArr);
            mo40626d(g0);
            g0.mo40111c();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(m12767n("byte array"), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo40152l() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int mo40153m(C7076e1 e1Var) {
        int l = mo40152l();
        if (l != -1) {
            return l;
        }
        int g = e1Var.mo40280g(this);
        mo40155p(g);
        return g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public UninitializedMessageException mo40154o() {
        return new UninitializedMessageException(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo40155p(int i) {
        throw new UnsupportedOperationException();
    }
}
