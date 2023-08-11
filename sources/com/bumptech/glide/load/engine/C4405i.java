package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p058d1.C7222g;
import p058d1.C7224i;
import p070e1.C7424e;
import p094g1.C7744c;
import p207r1.C9364e;
import p294z1.C10791j;

/* renamed from: com.bumptech.glide.load.engine.i */
/* compiled from: DecodePath */
public class C4405i<DataType, ResourceType, Transcode> {

    /* renamed from: a */
    private final Class<DataType> f3867a;

    /* renamed from: b */
    private final List<? extends C7224i<DataType, ResourceType>> f3868b;

    /* renamed from: c */
    private final C9364e<ResourceType, Transcode> f3869c;

    /* renamed from: d */
    private final Pools.Pool<List<Throwable>> f3870d;

    /* renamed from: e */
    private final String f3871e;

    /* renamed from: com.bumptech.glide.load.engine.i$a */
    /* compiled from: DecodePath */
    interface C4406a<ResourceType> {
        @NonNull
        /* renamed from: a */
        C7744c<ResourceType> mo31315a(@NonNull C7744c<ResourceType> cVar);
    }

    public C4405i(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends C7224i<DataType, ResourceType>> list, C9364e<ResourceType, Transcode> eVar, Pools.Pool<List<Throwable>> pool) {
        this.f3867a = cls;
        this.f3868b = list;
        this.f3869c = eVar;
        this.f3870d = pool;
        this.f3871e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    @NonNull
    /* renamed from: b */
    private C7744c<ResourceType> m5221b(C7424e<DataType> eVar, int i, int i2, @NonNull C7222g gVar) {
        List list = (List) C10791j.m22948d(this.f3870d.acquire());
        try {
            return m5222c(eVar, i, i2, gVar, list);
        } finally {
            this.f3870d.release(list);
        }
    }

    @NonNull
    /* renamed from: c */
    private C7744c<ResourceType> m5222c(C7424e<DataType> eVar, int i, int i2, @NonNull C7222g gVar, List<Throwable> list) {
        int size = this.f3868b.size();
        C7744c<ResourceType> cVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            C7224i iVar = (C7224i) this.f3868b.get(i3);
            try {
                if (iVar.mo31396b(eVar.mo41085a(), gVar)) {
                    cVar = iVar.mo31395a(eVar.mo41085a(), i, i2, gVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + iVar, e);
                }
                list.add(e);
            }
            if (cVar != null) {
                break;
            }
        }
        if (cVar != null) {
            return cVar;
        }
        throw new GlideException(this.f3871e, (List<Throwable>) new ArrayList(list));
    }

    /* renamed from: a */
    public C7744c<Transcode> mo31325a(C7424e<DataType> eVar, int i, int i2, @NonNull C7222g gVar, C4406a<ResourceType> aVar) {
        return this.f3869c.mo43787a(aVar.mo31315a(m5221b(eVar, i, i2, gVar)), gVar);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f3867a + ", decoders=" + this.f3868b + ", transcoder=" + this.f3869c + '}';
    }
}
