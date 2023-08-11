package p137k1;

import androidx.annotation.NonNull;
import com.bumptech.glide.C4368f;
import p058d1.C7214a;
import p058d1.C7222g;
import p070e1.C7422d;
import p137k1.C8476n;
import p283y1.C10652b;

/* renamed from: k1.v */
/* compiled from: UnitModelLoader */
public class C8498v<Model> implements C8476n<Model, Model> {

    /* renamed from: a */
    private static final C8498v<?> f12104a = new C8498v<>();

    /* renamed from: k1.v$a */
    /* compiled from: UnitModelLoader */
    public static class C8499a<Model> implements C8478o<Model, Model> {

        /* renamed from: a */
        private static final C8499a<?> f12105a = new C8499a<>();

        /* renamed from: a */
        public static <T> C8499a<T> m17031a() {
            return f12105a;
        }

        @NonNull
        /* renamed from: b */
        public C8476n<Model, Model> mo42462b(C8484r rVar) {
            return C8498v.m17028c();
        }
    }

    /* renamed from: c */
    public static <T> C8498v<T> m17028c() {
        return f12104a;
    }

    /* renamed from: a */
    public boolean mo42457a(@NonNull Model model) {
        return true;
    }

    /* renamed from: b */
    public C8476n.C8477a<Model> mo42458b(@NonNull Model model, int i, int i2, @NonNull C7222g gVar) {
        return new C8476n.C8477a<>(new C10652b(model), new C8500b(model));
    }

    /* renamed from: k1.v$b */
    /* compiled from: UnitModelLoader */
    private static class C8500b<Model> implements C7422d<Model> {

        /* renamed from: b */
        private final Model f12106b;

        C8500b(Model model) {
            this.f12106b = model;
        }

        @NonNull
        /* renamed from: a */
        public Class<Model> mo41069a() {
            return this.f12106b.getClass();
        }

        @NonNull
        /* renamed from: d */
        public C7214a mo41077d() {
            return C7214a.LOCAL;
        }

        /* renamed from: e */
        public void mo41078e(@NonNull C4368f fVar, @NonNull C7422d.C7423a<? super Model> aVar) {
            aVar.mo31271f(this.f12106b);
        }

        /* renamed from: b */
        public void mo41074b() {
        }

        public void cancel() {
        }
    }
}
