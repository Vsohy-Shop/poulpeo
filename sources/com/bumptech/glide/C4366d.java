package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.C4362b;
import com.bumptech.glide.load.engine.C4407j;
import java.util.List;
import java.util.Map;
import p106h1.C7883b;
import p250v1.C9919e;
import p250v1.C9920f;
import p261w1.C10102b;

/* renamed from: com.bumptech.glide.d */
/* compiled from: GlideContext */
public class C4366d extends ContextWrapper {
    @VisibleForTesting

    /* renamed from: k */
    static final C4374i<?, ?> f3694k = new C4361a();

    /* renamed from: a */
    private final C7883b f3695a;

    /* renamed from: b */
    private final Registry f3696b;

    /* renamed from: c */
    private final C10102b f3697c;

    /* renamed from: d */
    private final C4362b.C4363a f3698d;

    /* renamed from: e */
    private final List<C9919e<Object>> f3699e;

    /* renamed from: f */
    private final Map<Class<?>, C4374i<?, ?>> f3700f;

    /* renamed from: g */
    private final C4407j f3701g;

    /* renamed from: h */
    private final boolean f3702h;

    /* renamed from: i */
    private final int f3703i;
    @GuardedBy("this")
    @Nullable

    /* renamed from: j */
    private C9920f f3704j;

    public C4366d(@NonNull Context context, @NonNull C7883b bVar, @NonNull Registry registry, @NonNull C10102b bVar2, @NonNull C4362b.C4363a aVar, @NonNull Map<Class<?>, C4374i<?, ?>> map, @NonNull List<C9919e<Object>> list, @NonNull C4407j jVar, boolean z, int i) {
        super(context.getApplicationContext());
        this.f3695a = bVar;
        this.f3696b = registry;
        this.f3697c = bVar2;
        this.f3698d = aVar;
        this.f3699e = list;
        this.f3700f = map;
        this.f3701g = jVar;
        this.f3702h = z;
        this.f3703i = i;
    }

    @NonNull
    /* renamed from: a */
    public C7883b mo31193a() {
        return this.f3695a;
    }

    /* renamed from: b */
    public List<C9919e<Object>> mo31194b() {
        return this.f3699e;
    }

    /* renamed from: c */
    public synchronized C9920f mo31195c() {
        if (this.f3704j == null) {
            this.f3704j = (C9920f) this.f3698d.build().mo44443J();
        }
        return this.f3704j;
    }

    @NonNull
    /* renamed from: d */
    public <T> C4374i<?, T> mo31196d(@NonNull Class<T> cls) {
        C4374i<?, T> iVar = this.f3700f.get(cls);
        if (iVar == null) {
            for (Map.Entry next : this.f3700f.entrySet()) {
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    iVar = (C4374i) next.getValue();
                }
            }
        }
        if (iVar == null) {
            return f3694k;
        }
        return iVar;
    }

    @NonNull
    /* renamed from: e */
    public C4407j mo31197e() {
        return this.f3701g;
    }

    /* renamed from: f */
    public int mo31198f() {
        return this.f3703i;
    }

    @NonNull
    /* renamed from: g */
    public Registry mo31199g() {
        return this.f3696b;
    }

    /* renamed from: h */
    public boolean mo31200h() {
        return this.f3702h;
    }
}
