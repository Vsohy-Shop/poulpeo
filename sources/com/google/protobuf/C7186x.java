package com.google.protobuf;

import com.google.protobuf.C7056a;
import com.google.protobuf.C7149p0;
import com.google.protobuf.C7160q1;
import com.google.protobuf.C7174t;
import com.google.protobuf.C7186x;
import com.google.protobuf.C7186x.C7187a;
import com.google.protobuf.C7196z;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.protobuf.x */
/* compiled from: GeneratedMessageLite */
public abstract class C7186x<MessageType extends C7186x<MessageType, BuilderType>, BuilderType extends C7187a<MessageType, BuilderType>> extends C7056a<MessageType, BuilderType> {
    private static Map<Object, C7186x<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize = -1;
    protected C7130l1 unknownFields = C7130l1.m13432c();

    /* renamed from: com.google.protobuf.x$a */
    /* compiled from: GeneratedMessageLite */
    public static abstract class C7187a<MessageType extends C7186x<MessageType, BuilderType>, BuilderType extends C7187a<MessageType, BuilderType>> extends C7056a.C7057a<MessageType, BuilderType> {

        /* renamed from: b */
        private final MessageType f9838b;

        /* renamed from: c */
        protected MessageType f9839c;

        /* renamed from: d */
        protected boolean f9840d = false;

        protected C7187a(MessageType messagetype) {
            this.f9838b = messagetype;
            this.f9839c = (C7186x) messagetype.mo40688t(C7192f.NEW_MUTABLE_INSTANCE);
        }

        /* renamed from: y */
        private void m13897y(MessageType messagetype, MessageType messagetype2) {
            C7059a1.m12782a().mo40163e(messagetype).mo40274a(messagetype, messagetype2);
        }

        /* renamed from: q */
        public final MessageType build() {
            MessageType r = mo40630Q();
            if (r.mo40637j()) {
                return r;
            }
            throw C7056a.C7057a.m12777p(r);
        }

        /* renamed from: r */
        public MessageType mo40630Q() {
            if (this.f9840d) {
                return this.f9839c;
            }
            this.f9839c.mo40680B();
            this.f9840d = true;
            return this.f9839c;
        }

        /* renamed from: s */
        public BuilderType clone() {
            BuilderType D = mo40636a().mo40628h();
            D.mo40700x(mo40630Q());
            return D;
        }

        /* access modifiers changed from: protected */
        /* renamed from: t */
        public final void mo40696t() {
            if (this.f9840d) {
                mo40697u();
                this.f9840d = false;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: u */
        public void mo40697u() {
            MessageType messagetype = (C7186x) this.f9839c.mo40688t(C7192f.NEW_MUTABLE_INSTANCE);
            m13897y(messagetype, this.f9839c);
            this.f9839c = messagetype;
        }

        /* renamed from: v */
        public MessageType mo40636a() {
            return this.f9838b;
        }

        /* access modifiers changed from: protected */
        /* renamed from: w */
        public BuilderType mo40157n(MessageType messagetype) {
            return mo40700x(messagetype);
        }

        /* renamed from: x */
        public BuilderType mo40700x(MessageType messagetype) {
            mo40696t();
            m13897y(this.f9839c, messagetype);
            return this;
        }
    }

    /* renamed from: com.google.protobuf.x$b */
    /* compiled from: GeneratedMessageLite */
    protected static class C7188b<T extends C7186x<T, ?>> extends C7060b<T> {

        /* renamed from: b */
        private final T f9841b;

        public C7188b(T t) {
            this.f9841b = t;
        }

        /* renamed from: m */
        public T mo40701d(C7111i iVar, C7139o oVar) {
            return C7186x.m13873F(this.f9841b, iVar, oVar);
        }
    }

    /* renamed from: com.google.protobuf.x$c */
    /* compiled from: GeneratedMessageLite */
    public static abstract class C7189c<MessageType extends C7189c<MessageType, BuilderType>, BuilderType> extends C7186x<MessageType, BuilderType> implements C7159q0 {
        protected C7174t<C7190d> extensions = C7174t.m13806h();

        /* access modifiers changed from: package-private */
        /* renamed from: I */
        public C7174t<C7190d> mo40703I() {
            if (this.extensions.mo40650o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ C7149p0 mo40636a() {
            return C7186x.super.mo40636a();
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ C7149p0.C7150a mo40625b() {
            return C7186x.super.mo40625b();
        }

        /* renamed from: h */
        public /* bridge */ /* synthetic */ C7149p0.C7150a mo40628h() {
            return C7186x.super.mo40628h();
        }
    }

    /* renamed from: com.google.protobuf.x$d */
    /* compiled from: GeneratedMessageLite */
    static final class C7190d implements C7174t.C7176b<C7190d> {

        /* renamed from: b */
        final C7196z.C7200d<?> f9842b;

        /* renamed from: c */
        final int f9843c;

        /* renamed from: d */
        final C7160q1.C7162b f9844d;

        /* renamed from: e */
        final boolean f9845e;

        /* renamed from: f */
        final boolean f9846f;

        /* renamed from: A */
        public C7160q1.C7162b mo40656A() {
            return this.f9844d;
        }

        /* renamed from: G */
        public C7149p0.C7150a mo40657G(C7149p0.C7150a aVar, C7149p0 p0Var) {
            return ((C7187a) aVar).mo40700x((C7186x) p0Var);
        }

        /* renamed from: Z */
        public C7160q1.C7167c mo40658Z() {
            return this.f9844d.mo40638a();
        }

        /* renamed from: a */
        public int compareTo(C7190d dVar) {
            return this.f9843c - dVar.f9843c;
        }

        /* renamed from: b */
        public C7196z.C7200d<?> mo40705b() {
            return this.f9842b;
        }

        /* renamed from: c0 */
        public boolean mo40659c0() {
            return this.f9846f;
        }

        /* renamed from: y */
        public int mo40660y() {
            return this.f9843c;
        }

        /* renamed from: z */
        public boolean mo40661z() {
            return this.f9845e;
        }
    }

    /* renamed from: com.google.protobuf.x$e */
    /* compiled from: GeneratedMessageLite */
    public static class C7191e<ContainingType extends C7149p0, Type> extends C7131m<ContainingType, Type> {

        /* renamed from: a */
        final C7149p0 f9847a;

        /* renamed from: b */
        final C7190d f9848b;

        /* renamed from: a */
        public C7160q1.C7162b mo40707a() {
            return this.f9848b.mo40656A();
        }

        /* renamed from: b */
        public C7149p0 mo40708b() {
            return this.f9847a;
        }

        /* renamed from: c */
        public int mo40709c() {
            return this.f9848b.mo40660y();
        }

        /* renamed from: d */
        public boolean mo40710d() {
            return this.f9848b.f9845e;
        }
    }

    /* renamed from: com.google.protobuf.x$f */
    /* compiled from: GeneratedMessageLite */
    public enum C7192f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* renamed from: A */
    protected static final <T extends C7186x<T, ?>> boolean m13870A(T t, boolean z) {
        T t2;
        byte byteValue = ((Byte) t.mo40688t(C7192f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d = C7059a1.m12782a().mo40163e(t).mo40277d(t);
        if (z) {
            C7192f fVar = C7192f.SET_MEMOIZED_IS_INITIALIZED;
            if (d) {
                t2 = t;
            } else {
                t2 = null;
            }
            t.mo40690u(fVar, t2);
        }
        return d;
    }

    /* renamed from: C */
    protected static <E> C7196z.C7205i<E> m13871C(C7196z.C7205i<E> iVar) {
        int i;
        int size = iVar.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size * 2;
        }
        return iVar.mo40188n(i);
    }

    /* renamed from: E */
    protected static Object m13872E(C7149p0 p0Var, String str, Object[] objArr) {
        return new C7068c1(p0Var, str, objArr);
    }

    /* renamed from: F */
    static <T extends C7186x<T, ?>> T m13873F(T t, C7111i iVar, C7139o oVar) {
        T t2 = (C7186x) t.mo40688t(C7192f.NEW_MUTABLE_INSTANCE);
        try {
            C7076e1 e = C7059a1.m12782a().mo40163e(t2);
            e.mo40278e(t2, C7118j.m13266P(iVar), oVar);
            e.mo40276c(t2);
            return t2;
        } catch (InvalidProtocolBufferException e2) {
            e = e2;
            if (e.mo40145a()) {
                e = new InvalidProtocolBufferException((IOException) e);
            }
            throw e.mo40147k(t2);
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw new InvalidProtocolBufferException(e3).mo40147k(t2);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw e4;
        }
    }

    /* renamed from: G */
    protected static <T extends C7186x<?, ?>> void m13874G(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    /* renamed from: w */
    protected static <E> C7196z.C7205i<E> m13875w() {
        return C7065b1.m12802j();
    }

    /* renamed from: x */
    static <T extends C7186x<?, ?>> T m13876x(Class<T> cls) {
        T t = (C7186x) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (C7186x) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = ((C7186x) C7142o1.m13536k(cls)).mo40636a();
            if (t != null) {
                defaultInstanceMap.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: z */
    static Object m13877z(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo40680B() {
        C7059a1.m12782a().mo40163e(this).mo40276c(this);
    }

    /* renamed from: D */
    public final BuilderType mo40628h() {
        return (C7187a) mo40688t(C7192f.NEW_BUILDER);
    }

    /* renamed from: H */
    public final BuilderType mo40625b() {
        BuilderType buildertype = (C7187a) mo40688t(C7192f.NEW_BUILDER);
        buildertype.mo40700x(this);
        return buildertype;
    }

    /* renamed from: d */
    public void mo40626d(CodedOutputStream codedOutputStream) {
        C7059a1.m12782a().mo40163e(this).mo40275b(this, C7124k.m13332P(codedOutputStream));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C7059a1.m12782a().mo40163e(this).mo40279f(this, (C7186x) obj);
        }
        return false;
    }

    /* renamed from: f */
    public int mo40627f() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = C7059a1.m12782a().mo40163e(this).mo40280g(this);
        }
        return this.memoizedSerializedSize;
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int i2 = C7059a1.m12782a().mo40163e(this).mo40282i(this);
        this.memoizedHashCode = i2;
        return i2;
    }

    /* renamed from: i */
    public final C7193x0<MessageType> mo40629i() {
        return (C7193x0) mo40688t(C7192f.GET_PARSER);
    }

    /* renamed from: j */
    public final boolean mo40637j() {
        return m13870A(this, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo40152l() {
        return this.memoizedSerializedSize;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo40155p(int i) {
        this.memoizedSerializedSize = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public Object mo40685q() {
        return mo40688t(C7192f.BUILD_MESSAGE_INFO);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final <MessageType extends C7186x<MessageType, BuilderType>, BuilderType extends C7187a<MessageType, BuilderType>> BuilderType mo40686r() {
        return (C7187a) mo40688t(C7192f.NEW_BUILDER);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final <MessageType extends C7186x<MessageType, BuilderType>, BuilderType extends C7187a<MessageType, BuilderType>> BuilderType mo40687s(MessageType messagetype) {
        return mo40686r().mo40700x(messagetype);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public Object mo40688t(C7192f fVar) {
        return mo29952v(fVar, (Object) null, (Object) null);
    }

    public String toString() {
        return C7169r0.m13692e(this, super.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public Object mo40690u(C7192f fVar, Object obj) {
        return mo29952v(fVar, obj, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public abstract Object mo29952v(C7192f fVar, Object obj, Object obj2);

    /* renamed from: y */
    public final MessageType mo40636a() {
        return (C7186x) mo40688t(C7192f.GET_DEFAULT_INSTANCE);
    }
}
