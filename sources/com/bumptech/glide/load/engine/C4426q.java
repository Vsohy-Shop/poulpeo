package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.load.engine.C4405i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p058d1.C7222g;
import p070e1.C7424e;
import p094g1.C7744c;
import p294z1.C10791j;

/* renamed from: com.bumptech.glide.load.engine.q */
/* compiled from: LoadPath */
public class C4426q<Data, ResourceType, Transcode> {

    /* renamed from: a */
    private final Class<Data> f3948a;

    /* renamed from: b */
    private final Pools.Pool<List<Throwable>> f3949b;

    /* renamed from: c */
    private final List<? extends C4405i<Data, ResourceType, Transcode>> f3950c;

    /* renamed from: d */
    private final String f3951d;

    public C4426q(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<C4405i<Data, ResourceType, Transcode>> list, Pools.Pool<List<Throwable>> pool) {
        this.f3948a = cls;
        this.f3949b = pool;
        this.f3950c = (List) C10791j.m22947c(list);
        this.f3951d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: b */
    private C7744c<Transcode> m5284b(C7424e<Data> eVar, @NonNull C7222g gVar, int i, int i2, C4405i.C4406a<ResourceType> aVar, List<Throwable> list) {
        List<Throwable> list2 = list;
        int size = this.f3950c.size();
        C7744c<Transcode> cVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                cVar = ((C4405i) this.f3950c.get(i3)).mo31325a(eVar, i, i2, gVar, aVar);
            } catch (GlideException e) {
                list2.add(e);
            }
            if (cVar != null) {
                break;
            }
        }
        if (cVar != null) {
            return cVar;
        }
        throw new GlideException(this.f3951d, (List<Throwable>) new ArrayList(list2));
    }

    /* renamed from: a */
    public C7744c<Transcode> mo31377a(C7424e<Data> eVar, @NonNull C7222g gVar, int i, int i2, C4405i.C4406a<ResourceType> aVar) {
        List list = (List) C10791j.m22948d(this.f3949b.acquire());
        try {
            return m5284b(eVar, gVar, i, i2, aVar, list);
        } finally {
            this.f3949b.release(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f3950c.toArray()) + '}';
    }
}
