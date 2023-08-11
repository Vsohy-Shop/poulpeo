package p117i1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p058d1.C7218e;
import p094g1.C7744c;
import p117i1.C8077h;
import p294z1.C10788g;

/* renamed from: i1.g */
/* compiled from: LruResourceCache */
public class C8076g extends C10788g<C7218e, C7744c<?>> implements C8077h {

    /* renamed from: e */
    private C8077h.C8078a f11335e;

    public C8076g(long j) {
        super(j);
    }

    /* renamed from: a */
    public void mo41901a(int i) {
        if (i >= 40) {
            mo45697b();
        } else if (i >= 20 || i == 15) {
            mo45702m(mo45699h() / 2);
        }
    }

    @Nullable
    /* renamed from: c */
    public /* bridge */ /* synthetic */ C7744c mo41902c(@NonNull C7218e eVar, @Nullable C7744c cVar) {
        return (C7744c) super.mo45700k(eVar, cVar);
    }

    @Nullable
    /* renamed from: d */
    public /* bridge */ /* synthetic */ C7744c mo41903d(@NonNull C7218e eVar) {
        return (C7744c) super.mo45701l(eVar);
    }

    /* renamed from: e */
    public void mo41904e(@NonNull C8077h.C8078a aVar) {
        this.f11335e = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int mo41905i(@Nullable C7744c<?> cVar) {
        if (cVar == null) {
            return super.mo41905i(null);
        }
        return cVar.getSize();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo41906j(@NonNull C7218e eVar, @Nullable C7744c<?> cVar) {
        C8077h.C8078a aVar = this.f11335e;
        if (aVar != null && cVar != null) {
            aVar.mo31330d(cVar);
        }
    }
}
