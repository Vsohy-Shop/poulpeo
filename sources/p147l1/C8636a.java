package p147l1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.InputStream;
import p058d1.C7219f;
import p058d1.C7222g;
import p070e1.C7432j;
import p137k1.C8462g;
import p137k1.C8473m;
import p137k1.C8476n;
import p137k1.C8478o;
import p137k1.C8484r;

/* renamed from: l1.a */
/* compiled from: HttpGlideUrlLoader */
public class C8636a implements C8476n<C8462g, InputStream> {

    /* renamed from: b */
    public static final C7219f<Integer> f12342b = C7219f.m13988f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);
    @Nullable

    /* renamed from: a */
    private final C8473m<C8462g, C8462g> f12343a;

    /* renamed from: l1.a$a */
    /* compiled from: HttpGlideUrlLoader */
    public static class C8637a implements C8478o<C8462g, InputStream> {

        /* renamed from: a */
        private final C8473m<C8462g, C8462g> f12344a = new C8473m<>(500);

        @NonNull
        /* renamed from: b */
        public C8476n<C8462g, InputStream> mo42462b(C8484r rVar) {
            return new C8636a(this.f12344a);
        }
    }

    public C8636a(@Nullable C8473m<C8462g, C8462g> mVar) {
        this.f12343a = mVar;
    }

    /* renamed from: c */
    public C8476n.C8477a<InputStream> mo42458b(@NonNull C8462g gVar, int i, int i2, @NonNull C7222g gVar2) {
        C8473m<C8462g, C8462g> mVar = this.f12343a;
        if (mVar != null) {
            C8462g a = mVar.mo42505a(gVar, 0, 0);
            if (a == null) {
                this.f12343a.mo42506b(gVar, 0, 0, gVar);
            } else {
                gVar = a;
            }
        }
        return new C8476n.C8477a<>(gVar, new C7432j(gVar, ((Integer) gVar2.mo40779c(f12342b)).intValue()));
    }

    /* renamed from: d */
    public boolean mo42457a(@NonNull C8462g gVar) {
        return true;
    }
}
