package p311bd;

import com.poulpeo.R;
import p440ud.C13564j;

/* renamed from: bd.b */
/* compiled from: BaseListViewMessageState */
public class C10932b {

    /* renamed from: b */
    public static final C10932b f16860b;

    /* renamed from: c */
    public static final C10932b f16861c;

    /* renamed from: d */
    public static final C10932b f16862d;

    /* renamed from: e */
    private static C10932b[] f16863e;

    /* renamed from: a */
    public final C13564j f16864a;

    static {
        C10932b bVar = new C10932b(m23540a());
        f16860b = bVar;
        C10932b bVar2 = new C10932b(m23540a());
        f16861c = bVar2;
        C10932b bVar3 = new C10932b(m23541b());
        f16862d = bVar3;
        f16863e = new C10932b[]{bVar, bVar2, bVar3};
    }

    public C10932b(C13564j jVar) {
        if (jVar != null) {
            this.f16864a = jVar;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    protected static C13564j m23540a() {
        return new C13564j(R.drawable.picto_erreur);
    }

    /* renamed from: b */
    protected static C13564j m23541b() {
        return new C13564j(R.drawable.no_result);
    }
}
