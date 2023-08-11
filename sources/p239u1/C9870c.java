package p239u1;

import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.core.util.Pools;
import com.bumptech.glide.load.engine.C4405i;
import com.bumptech.glide.load.engine.C4426q;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p207r1.C9367g;
import p294z1.C10790i;

/* renamed from: u1.c */
/* compiled from: LoadPathCache */
public class C9870c {

    /* renamed from: c */
    private static final C4426q<?, ?, ?> f14755c = new C4426q(Object.class, Object.class, Object.class, Collections.singletonList(new C4405i(Object.class, Object.class, Object.class, Collections.emptyList(), new C9367g(), (Pools.Pool<List<Throwable>>) null)), (Pools.Pool<List<Throwable>>) null);

    /* renamed from: a */
    private final ArrayMap<C10790i, C4426q<?, ?, ?>> f14756a = new ArrayMap<>();

    /* renamed from: b */
    private final AtomicReference<C10790i> f14757b = new AtomicReference<>();

    /* renamed from: b */
    private C10790i m20498b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        C10790i andSet = this.f14757b.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new C10790i();
        }
        andSet.mo45709a(cls, cls2, cls3);
        return andSet;
    }

    @Nullable
    /* renamed from: a */
    public <Data, TResource, Transcode> C4426q<Data, TResource, Transcode> mo44391a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C4426q<Data, TResource, Transcode> qVar;
        C10790i b = m20498b(cls, cls2, cls3);
        synchronized (this.f14756a) {
            qVar = this.f14756a.get(b);
        }
        this.f14757b.set(b);
        return qVar;
    }

    /* renamed from: c */
    public boolean mo44392c(@Nullable C4426q<?, ?, ?> qVar) {
        return f14755c.equals(qVar);
    }

    /* renamed from: d */
    public void mo44393d(Class<?> cls, Class<?> cls2, Class<?> cls3, @Nullable C4426q<?, ?, ?> qVar) {
        synchronized (this.f14756a) {
            ArrayMap<C10790i, C4426q<?, ?, ?>> arrayMap = this.f14756a;
            C10790i iVar = new C10790i(cls, cls2, cls3);
            if (qVar == null) {
                qVar = f14755c;
            }
            arrayMap.put(iVar, qVar);
        }
    }
}
