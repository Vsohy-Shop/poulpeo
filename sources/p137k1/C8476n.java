package p137k1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;
import p058d1.C7218e;
import p058d1.C7222g;
import p070e1.C7422d;
import p294z1.C10791j;

/* renamed from: k1.n */
/* compiled from: ModelLoader */
public interface C8476n<Model, Data> {

    /* renamed from: k1.n$a */
    /* compiled from: ModelLoader */
    public static class C8477a<Data> {

        /* renamed from: a */
        public final C7218e f12071a;

        /* renamed from: b */
        public final List<C7218e> f12072b;

        /* renamed from: c */
        public final C7422d<Data> f12073c;

        public C8477a(@NonNull C7218e eVar, @NonNull C7422d<Data> dVar) {
            this(eVar, Collections.emptyList(), dVar);
        }

        public C8477a(@NonNull C7218e eVar, @NonNull List<C7218e> list, @NonNull C7422d<Data> dVar) {
            this.f12071a = (C7218e) C10791j.m22948d(eVar);
            this.f12072b = (List) C10791j.m22948d(list);
            this.f12073c = (C7422d) C10791j.m22948d(dVar);
        }
    }

    /* renamed from: a */
    boolean mo42457a(@NonNull Model model);

    @Nullable
    /* renamed from: b */
    C8477a<Data> mo42458b(@NonNull Model model, int i, int i2, @NonNull C7222g gVar);
}
