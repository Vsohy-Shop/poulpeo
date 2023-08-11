package com.bumptech.glide;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.C4405i;
import com.bumptech.glide.load.engine.C4426q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p020a2.C2125a;
import p058d1.C7217d;
import p058d1.C7224i;
import p058d1.C7225j;
import p070e1.C7424e;
import p070e1.C7426f;
import p094g1.C7744c;
import p137k1.C8476n;
import p137k1.C8478o;
import p137k1.C8479p;
import p207r1.C9364e;
import p207r1.C9365f;
import p239u1.C9867a;
import p239u1.C9869b;
import p239u1.C9870c;
import p239u1.C9871d;
import p239u1.C9872e;
import p239u1.C9874f;

public class Registry {

    /* renamed from: a */
    private final C8479p f3652a;

    /* renamed from: b */
    private final C9867a f3653b;

    /* renamed from: c */
    private final C9872e f3654c;

    /* renamed from: d */
    private final C9874f f3655d;

    /* renamed from: e */
    private final C7426f f3656e;

    /* renamed from: f */
    private final C9365f f3657f;

    /* renamed from: g */
    private final C9869b f3658g;

    /* renamed from: h */
    private final C9871d f3659h = new C9871d();

    /* renamed from: i */
    private final C9870c f3660i = new C9870c();

    /* renamed from: j */
    private final Pools.Pool<List<Throwable>> f3661j;

    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(@NonNull String str) {
            super(str);
        }
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(@NonNull Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> NoModelLoaderAvailableException(@NonNull M m, @NonNull List<C8476n<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m);
        }

        public NoModelLoaderAvailableException(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(@NonNull Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(@NonNull Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public Registry() {
        Pools.Pool<List<Throwable>> e = C2125a.m1479e();
        this.f3661j = e;
        this.f3652a = new C8479p(e);
        this.f3653b = new C9867a();
        this.f3654c = new C9872e();
        this.f3655d = new C9874f();
        this.f3656e = new C7426f();
        this.f3657f = new C9365f();
        this.f3658g = new C9869b();
        mo31174r(Arrays.asList(new String[]{"Gif", "Bitmap", "BitmapDrawable"}));
    }

    @NonNull
    /* renamed from: f */
    private <Data, TResource, Transcode> List<C4405i<Data, TResource, Transcode>> m5022f(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class next : this.f3654c.mo44398d(cls, cls2)) {
            for (Class next2 : this.f3657f.mo43789b(next, cls3)) {
                arrayList.add(new C4405i(cls, next, next2, this.f3654c.mo44397b(cls, next), this.f3657f.mo43788a(next, next2), this.f3661j));
            }
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: a */
    public <Data> Registry mo31158a(@NonNull Class<Data> cls, @NonNull C7217d<Data> dVar) {
        this.f3653b.mo44386a(cls, dVar);
        return this;
    }

    @NonNull
    /* renamed from: b */
    public <TResource> Registry mo31159b(@NonNull Class<TResource> cls, @NonNull C7225j<TResource> jVar) {
        this.f3655d.mo44401a(cls, jVar);
        return this;
    }

    @NonNull
    /* renamed from: c */
    public <Data, TResource> Registry mo31160c(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull C7224i<Data, TResource> iVar) {
        mo31162e("legacy_append", cls, cls2, iVar);
        return this;
    }

    @NonNull
    /* renamed from: d */
    public <Model, Data> Registry mo31161d(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull C8478o<Model, Data> oVar) {
        this.f3652a.mo42511a(cls, cls2, oVar);
        return this;
    }

    @NonNull
    /* renamed from: e */
    public <Data, TResource> Registry mo31162e(@NonNull String str, @NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull C7224i<Data, TResource> iVar) {
        this.f3654c.mo44396a(str, iVar, cls, cls2);
        return this;
    }

    @NonNull
    /* renamed from: g */
    public List<ImageHeaderParser> mo31163g() {
        List<ImageHeaderParser> b = this.f3658g.mo44390b();
        if (!b.isEmpty()) {
            return b;
        }
        throw new NoImageHeaderParserException();
    }

    @Nullable
    /* renamed from: h */
    public <Data, TResource, Transcode> C4426q<Data, TResource, Transcode> mo31164h(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        C4426q<Data, TResource, Transcode> a = this.f3660i.mo44391a(cls, cls2, cls3);
        if (this.f3660i.mo44392c(a)) {
            return null;
        }
        if (a == null) {
            List<C4405i<Data, TResource, Transcode>> f = m5022f(cls, cls2, cls3);
            if (f.isEmpty()) {
                a = null;
            } else {
                a = new C4426q<>(cls, cls2, cls3, f, this.f3661j);
            }
            this.f3660i.mo44393d(cls, cls2, cls3, a);
        }
        return a;
    }

    @NonNull
    /* renamed from: i */
    public <Model> List<C8476n<Model, ?>> mo31165i(@NonNull Model model) {
        return this.f3652a.mo42513d(model);
    }

    @NonNull
    /* renamed from: j */
    public <Model, TResource, Transcode> List<Class<?>> mo31166j(@NonNull Class<Model> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        List<Class<?>> a = this.f3659h.mo44394a(cls, cls2, cls3);
        if (a == null) {
            a = new ArrayList<>();
            for (Class<?> d : this.f3652a.mo42512c(cls)) {
                for (Class next : this.f3654c.mo44398d(d, cls2)) {
                    if (!this.f3657f.mo43789b(next, cls3).isEmpty() && !a.contains(next)) {
                        a.add(next);
                    }
                }
            }
            this.f3659h.mo44395b(cls, cls2, cls3, Collections.unmodifiableList(a));
        }
        return a;
    }

    @NonNull
    /* renamed from: k */
    public <X> C7225j<X> mo31167k(@NonNull C7744c<X> cVar) {
        C7225j<X> b = this.f3655d.mo44402b(cVar.mo31365a());
        if (b != null) {
            return b;
        }
        throw new NoResultEncoderAvailableException(cVar.mo31365a());
    }

    @NonNull
    /* renamed from: l */
    public <X> C7424e<X> mo31168l(@NonNull X x) {
        return this.f3656e.mo41089a(x);
    }

    @NonNull
    /* renamed from: m */
    public <X> C7217d<X> mo31169m(@NonNull X x) {
        C7217d<X> b = this.f3653b.mo44387b(x.getClass());
        if (b != null) {
            return b;
        }
        throw new NoSourceEncoderAvailableException(x.getClass());
    }

    /* renamed from: n */
    public boolean mo31170n(@NonNull C7744c<?> cVar) {
        if (this.f3655d.mo44402b(cVar.mo31365a()) != null) {
            return true;
        }
        return false;
    }

    @NonNull
    /* renamed from: o */
    public Registry mo31171o(@NonNull ImageHeaderParser imageHeaderParser) {
        this.f3658g.mo44389a(imageHeaderParser);
        return this;
    }

    @NonNull
    /* renamed from: p */
    public Registry mo31172p(@NonNull C7424e.C7425a<?> aVar) {
        this.f3656e.mo41090b(aVar);
        return this;
    }

    @NonNull
    /* renamed from: q */
    public <TResource, Transcode> Registry mo31173q(@NonNull Class<TResource> cls, @NonNull Class<Transcode> cls2, @NonNull C9364e<TResource, Transcode> eVar) {
        this.f3657f.mo43790c(cls, cls2, eVar);
        return this;
    }

    @NonNull
    /* renamed from: r */
    public final Registry mo31174r(@NonNull List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        this.f3654c.mo44399e(arrayList);
        return this;
    }
}
