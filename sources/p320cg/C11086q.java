package p320cg;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p331dg.C11820c0;
import p355hf.C12079g;
import p404of.C13088o;
import p466yf.C14054y1;

/* renamed from: cg.q */
/* compiled from: SafeCollector.common.kt */
public final class C11086q {

    /* renamed from: cg.q$a */
    /* compiled from: SafeCollector.common.kt */
    static final class C11087a extends C12777p implements C13088o<Integer, C12079g.C12082b, Integer> {

        /* renamed from: g */
        final /* synthetic */ C11082o<?> f17214g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11087a(C11082o<?> oVar) {
            super(2);
            this.f17214g = oVar;
        }

        /* renamed from: a */
        public final Integer mo46174a(int i, C12079g.C12082b bVar) {
            int i2;
            C12079g.C12084c key = bVar.getKey();
            C12079g.C12082b bVar2 = this.f17214g.f17207i.get(key);
            if (key != C14054y1.f22970b0) {
                if (bVar != bVar2) {
                    i2 = Integer.MIN_VALUE;
                } else {
                    i2 = i + 1;
                }
                return Integer.valueOf(i2);
            }
            C14054y1 y1Var = (C14054y1) bVar2;
            C12775o.m28637g(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
            C14054y1 b = C11086q.m23907b((C14054y1) bVar, y1Var);
            if (b == y1Var) {
                if (y1Var != null) {
                    i++;
                }
                return Integer.valueOf(i);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b + ", expected child of " + y1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return mo46174a(((Number) obj).intValue(), (C12079g.C12082b) obj2);
        }
    }

    /* renamed from: a */
    public static final void m23906a(C11082o<?> oVar, C12079g gVar) {
        if (((Number) gVar.fold(0, new C11087a(oVar))).intValue() != oVar.f17208j) {
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + oVar.f17207i + ",\n\t\tbut emission happened in " + gVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
        }
    }

    /* renamed from: b */
    public static final C14054y1 m23907b(C14054y1 y1Var, C14054y1 y1Var2) {
        while (y1Var != null) {
            if (y1Var == y1Var2 || !(y1Var instanceof C11820c0)) {
                return y1Var;
            }
            y1Var = y1Var.getParent();
        }
        return null;
    }
}
