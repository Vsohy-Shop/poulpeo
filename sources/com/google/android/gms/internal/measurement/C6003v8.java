package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C5955s8;
import com.google.android.gms.internal.measurement.C6003v8;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.measurement.v8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
public abstract class C6003v8<MessageType extends C6003v8<MessageType, BuilderType>, BuilderType extends C5955s8<MessageType, BuilderType>> extends C5757g7<MessageType, BuilderType> {
    private static final Map<Object, C6003v8<?, ?>> zza = new ConcurrentHashMap();
    protected C6053ya zzc = C6053ya.m10311c();
    protected int zzd = -1;

    /* renamed from: k */
    protected static <E> C5691c9<E> m10154k() {
        return C5777ha.m9342d();
    }

    /* renamed from: l */
    protected static <E> C5691c9<E> m10155l(C5691c9<E> c9Var) {
        int i;
        int size = c9Var.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        return c9Var.mo33773m(i);
    }

    /* renamed from: m */
    static Object m10156m(Method method, Object obj, Object... objArr) {
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

    /* renamed from: n */
    protected static Object m10157n(C6052y9 y9Var, String str, Object[] objArr) {
        return new C5794ia(y9Var, str, objArr);
    }

    /* renamed from: o */
    protected static <T extends C6003v8> void m10158o(Class<T> cls, T t) {
        zza.put(cls, t);
    }

    /* renamed from: r */
    static <T extends C6003v8> T m10159r(Class<T> cls) {
        Map<Object, C6003v8<?, ?>> map = zza;
        T t = (C6003v8) map.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (C6003v8) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (C6003v8) ((C6003v8) C5778hb.m9360j(cls)).mo33646v(6, (Object) null, (Object) null);
            if (t != null) {
                map.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: s */
    protected static C5657a9 m10160s() {
        return C6019w8.m10215j();
    }

    /* renamed from: t */
    protected static C5674b9 m10161t() {
        return C5860m9.m9632d();
    }

    /* renamed from: u */
    protected static C5674b9 m10162u(C5674b9 b9Var) {
        int i;
        int size = b9Var.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        return b9Var.mo33703i(i);
    }

    /* renamed from: a */
    public final void mo34550a(C5707d8 d8Var) {
        C5760ga.m9295a().mo34052b(getClass()).mo33713i(this, C5724e8.m9107l(d8Var));
    }

    /* renamed from: b */
    public final int mo34551b() {
        int i = this.zzd;
        if (i != -1) {
            return i;
        }
        int b = C5760ga.m9295a().mo34052b(getClass()).mo33706b(this);
        this.zzd = b;
        return b;
    }

    /* renamed from: c */
    public final /* synthetic */ C6036x9 mo34552c() {
        C5955s8 s8Var = (C5955s8) mo33646v(5, (Object) null, (Object) null);
        s8Var.mo34358p(this);
        return s8Var;
    }

    /* renamed from: e */
    public final /* synthetic */ C6052y9 mo34353e() {
        return (C6003v8) mo33646v(6, (Object) null, (Object) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C5760ga.m9295a().mo34052b(getClass()).mo33712h(this, (C6003v8) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final /* synthetic */ C6036x9 mo34554f() {
        return (C5955s8) mo33646v(5, (Object) null, (Object) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo34042g() {
        return this.zzd;
    }

    public final int hashCode() {
        int i = this.zzb;
        if (i != 0) {
            return i;
        }
        int a = C5760ga.m9295a().mo34052b(getClass()).mo33705a(this);
        this.zzb = a;
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo34043i(int i) {
        this.zzd = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final <MessageType extends C6003v8<MessageType, BuilderType>, BuilderType extends C5955s8<MessageType, BuilderType>> BuilderType mo34556p() {
        return (C5955s8) mo33646v(5, (Object) null, (Object) null);
    }

    /* renamed from: q */
    public final BuilderType mo34557q() {
        BuilderType buildertype = (C5955s8) mo33646v(5, (Object) null, (Object) null);
        buildertype.mo34358p(this);
        return buildertype;
    }

    public final String toString() {
        return C5658aa.m8764a(this, super.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public abstract Object mo33646v(int i, Object obj, Object obj2);
}
