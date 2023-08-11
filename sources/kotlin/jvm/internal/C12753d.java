package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import p398nf.C13019b;
import p442uf.C13590b;
import p442uf.C13592d;
import p442uf.C13603l;
import p442uf.C13604m;

/* renamed from: kotlin.jvm.internal.d */
/* compiled from: CallableReference */
public abstract class C12753d implements C13590b, Serializable {
    public static final Object NO_RECEIVER = C12754a.f20406b;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient C13590b reflected;
    private final String signature;

    /* renamed from: kotlin.jvm.internal.d$a */
    /* compiled from: CallableReference */
    private static class C12754a implements Serializable {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public static final C12754a f20406b = new C12754a();

        private C12754a() {
        }

        private Object readResolve() {
            return f20406b;
        }
    }

    public C12753d() {
        this(NO_RECEIVER);
    }

    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public C13590b compute() {
        C13590b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        C13590b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    /* access modifiers changed from: protected */
    public abstract C13590b computeReflected();

    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public C13592d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            return C12764h0.m28587c(cls);
        }
        return C12764h0.m28586b(cls);
    }

    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    /* access modifiers changed from: protected */
    public C13590b getReflected() {
        C13590b compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new C13019b();
    }

    public C13603l getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    public C13604m getVisibility() {
        return getReflected().getVisibility();
    }

    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    public boolean isFinal() {
        return getReflected().isFinal();
    }

    public boolean isOpen() {
        return getReflected().isOpen();
    }

    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    protected C12753d(Object obj) {
        this(obj, (Class) null, (String) null, (String) null, false);
    }

    protected C12753d(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }
}
