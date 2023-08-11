package p239u1;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p058d1.C7224i;

/* renamed from: u1.e */
/* compiled from: ResourceDecoderRegistry */
public class C9872e {

    /* renamed from: a */
    private final List<String> f14760a = new ArrayList();

    /* renamed from: b */
    private final Map<String, List<C9873a<?, ?>>> f14761b = new HashMap();

    /* renamed from: u1.e$a */
    /* compiled from: ResourceDecoderRegistry */
    private static class C9873a<T, R> {

        /* renamed from: a */
        private final Class<T> f14762a;

        /* renamed from: b */
        final Class<R> f14763b;

        /* renamed from: c */
        final C7224i<T, R> f14764c;

        public C9873a(@NonNull Class<T> cls, @NonNull Class<R> cls2, C7224i<T, R> iVar) {
            this.f14762a = cls;
            this.f14763b = cls2;
            this.f14764c = iVar;
        }

        /* renamed from: a */
        public boolean mo44400a(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            if (!this.f14762a.isAssignableFrom(cls) || !cls2.isAssignableFrom(this.f14763b)) {
                return false;
            }
            return true;
        }
    }

    @NonNull
    /* renamed from: c */
    private synchronized List<C9873a<?, ?>> m20504c(@NonNull String str) {
        List<C9873a<?, ?>> list;
        if (!this.f14760a.contains(str)) {
            this.f14760a.add(str);
        }
        list = this.f14761b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f14761b.put(str, list);
        }
        return list;
    }

    /* renamed from: a */
    public synchronized <T, R> void mo44396a(@NonNull String str, @NonNull C7224i<T, R> iVar, @NonNull Class<T> cls, @NonNull Class<R> cls2) {
        m20504c(str).add(new C9873a(cls, cls2, iVar));
    }

    @NonNull
    /* renamed from: b */
    public synchronized <T, R> List<C7224i<T, R>> mo44397b(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f14760a) {
            List<C9873a> list = this.f14761b.get(str);
            if (list != null) {
                for (C9873a aVar : list) {
                    if (aVar.mo44400a(cls, cls2)) {
                        arrayList.add(aVar.f14764c);
                    }
                }
            }
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: d */
    public synchronized <T, R> List<Class<R>> mo44398d(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f14760a) {
            List<C9873a> list = this.f14761b.get(str);
            if (list != null) {
                for (C9873a aVar : list) {
                    if (aVar.mo44400a(cls, cls2) && !arrayList.contains(aVar.f14763b)) {
                        arrayList.add(aVar.f14763b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public synchronized void mo44399e(@NonNull List<String> list) {
        ArrayList<String> arrayList = new ArrayList<>(this.f14760a);
        this.f14760a.clear();
        for (String add : list) {
            this.f14760a.add(add);
        }
        for (String str : arrayList) {
            if (!list.contains(str)) {
                this.f14760a.add(str);
            }
        }
    }
}
