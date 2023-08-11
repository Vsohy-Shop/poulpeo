package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.C4842bd;
import com.google.android.gms.internal.cast.C4878dd;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.cast.dd */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public abstract class C4878dd<MessageType extends C4878dd<MessageType, BuilderType>, BuilderType extends C4842bd<MessageType, BuilderType>> extends C5200wb<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    protected C5017lf zzc = C5017lf.m7167c();
    private int zzd = -1;

    /* renamed from: c */
    protected static C5015ld m6903c() {
        return C5135se.m7487d();
    }

    /* renamed from: d */
    protected static C5015ld m6904d(C5015ld ldVar) {
        int i;
        int size = ldVar.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        return ldVar.mo32765a(i);
    }

    /* renamed from: e */
    static Object m6905e(Method method, Object obj, Object... objArr) {
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

    /* renamed from: f */
    protected static Object m6906f(C4982je jeVar, String str, Object[] objArr) {
        return new C5152te(jeVar, str, objArr);
    }

    /* renamed from: i */
    protected static void m6907i(Class cls, C4878dd ddVar) {
        zzb.put(cls, ddVar);
        ddVar.mo32734g();
    }

    /* renamed from: q */
    private final int m6908q(C5169ue ueVar) {
        if (ueVar == null) {
            return C5118re.m7436a().mo32992b(getClass()).mo32894b(this);
        }
        return ueVar.mo32894b(this);
    }

    /* renamed from: u */
    static C4878dd m6909u(Class cls) {
        Map map = zzb;
        C4878dd ddVar = (C4878dd) map.get(cls);
        if (ddVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                ddVar = (C4878dd) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (ddVar == null) {
            ddVar = (C4878dd) ((C4878dd) C5187vf.m7584j(cls)).mo32613r(6, (Object) null, (Object) null);
            if (ddVar != null) {
                map.put(cls, ddVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return ddVar;
    }

    /* renamed from: w */
    protected static C4964id m6910w() {
        return C4896ed.m6949j();
    }

    /* renamed from: x */
    protected static C4998kd m6911x() {
        return C5236yd.m7705j();
    }

    /* renamed from: a */
    public final /* synthetic */ C4982je mo32731a() {
        return (C4878dd) mo32613r(6, (Object) null, (Object) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo32732b(C5169ue ueVar) {
        if (mo32741p()) {
            int q = m6908q(ueVar);
            if (q >= 0) {
                return q;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + q);
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int q2 = m6908q(ueVar);
        if (q2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | q2;
            return q2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + q2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C5118re.m7436a().mo32992b(getClass()).mo32895c(this, (C4878dd) obj);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo32734g() {
        C5118re.m7436a().mo32992b(getClass()).mo32896d(this);
        mo32735h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo32735h() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (mo32741p()) {
            return mo32742s();
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int s = mo32742s();
        this.zza = s;
        return s;
    }

    /* renamed from: l */
    public final int mo32737l() {
        int i;
        if (mo32741p()) {
            i = m6908q((C5169ue) null);
            if (i < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i);
            }
        } else {
            i = this.zzd & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                i = m6908q((C5169ue) null);
                if (i >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | i;
                } else {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i);
                }
            }
        }
        return i;
    }

    /* renamed from: m */
    public final /* synthetic */ C4965ie mo32738m() {
        return (C4842bd) mo32613r(5, (Object) null, (Object) null);
    }

    /* renamed from: n */
    public final void mo32739n(C5099qc qcVar) {
        C5118re.m7436a().mo32992b(getClass()).mo32898f(this, C5133sc.m7452I(qcVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo32740o(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final boolean mo32741p() {
        if ((this.zzd & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract Object mo32613r(int i, Object obj, Object obj2);

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final int mo32742s() {
        return C5118re.m7436a().mo32992b(getClass()).mo32893a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final C4842bd mo32743t() {
        return (C4842bd) mo32613r(5, (Object) null, (Object) null);
    }

    public final String toString() {
        return C5016le.m7163a(this, super.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final C4878dd mo32745v() {
        return (C4878dd) mo32613r(4, (Object) null, (Object) null);
    }
}
