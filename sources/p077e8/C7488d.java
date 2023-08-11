package p077e8;

import android.app.Application;
import com.google.firebase.C6922c;
import p051c8.C3917d;
import p051c8.C3959l0;
import p051c8.C3968n;
import p051c8.C3989q3;
import p051c8.C3995r3;
import p051c8.C4017v2;
import p089f8.C7611a;
import p124i8.C8213d;
import p193p7.C9074d;
import p234t7.C9763a;

/* renamed from: e8.d */
/* compiled from: ApiClientModule */
public class C7488d {

    /* renamed from: a */
    private final C6922c f10372a;

    /* renamed from: b */
    private final C8213d f10373b;

    /* renamed from: c */
    private final C7611a f10374c;

    public C7488d(C6922c cVar, C8213d dVar, C7611a aVar) {
        this.f10372a = cVar;
        this.f10373b = dVar;
        this.f10374c = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C3917d mo41200a(C9763a<C3959l0> aVar, Application application, C4017v2 v2Var) {
        return new C3917d(aVar, this.f10372a, application, this.f10374c, v2Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C3968n mo41201b(C3989q3 q3Var, C9074d dVar) {
        return new C3968n(this.f10372a, q3Var, dVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C6922c mo41202c() {
        return this.f10372a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C8213d mo41203d() {
        return this.f10373b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C3989q3 mo41204e() {
        return new C3989q3(this.f10372a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C3995r3 mo41205f(C3989q3 q3Var) {
        return new C3995r3(q3Var);
    }
}
