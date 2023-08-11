package p331dg;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.jvm.internal.SourceDebugExtension;
import p466yf.C13988j2;

@SourceDebugExtension({"SMAP\nMainDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MainDispatcherLoader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,134:1\n1963#2,14:135\n*S KotlinDebug\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MainDispatcherLoader\n*L\n38#1:135,14\n*E\n"})
/* renamed from: dg.v */
/* compiled from: MainDispatchers.kt */
public final class C11859v {

    /* renamed from: a */
    public static final C11859v f18523a;

    /* renamed from: b */
    private static final boolean f18524b = C11830h0.m25465f("kotlinx.coroutines.fast.service.loader", true);

    /* renamed from: c */
    public static final C13988j2 f18525c;

    static {
        C11859v vVar = new C11859v();
        f18523a = vVar;
        f18525c = vVar.m25573a();
    }

    private C11859v() {
    }

    /* renamed from: a */
    private final C13988j2 m25573a() {
        List<C11858u> list;
        Object obj;
        C13988j2 e;
        Class<C11858u> cls = C11858u.class;
        try {
            if (f18524b) {
                list = C11835k.f18484a.mo49007c();
            } else {
                list = C13662o.m31293z(C13657m.m31269c(ServiceLoader.load(cls, cls.getClassLoader()).iterator()));
            }
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                obj = null;
            } else {
                obj = it.next();
                if (it.hasNext()) {
                    int c = ((C11858u) obj).mo49058c();
                    do {
                        Object next = it.next();
                        int c2 = ((C11858u) next).mo49058c();
                        if (c < c2) {
                            obj = next;
                            c = c2;
                        }
                    } while (it.hasNext());
                }
            }
            C11858u uVar = (C11858u) obj;
            if (uVar == null || (e = C11860w.m25578e(uVar, list)) == null) {
                return C11860w.m25575b((Throwable) null, (String) null, 3, (Object) null);
            }
            return e;
        } catch (Throwable th) {
            return C11860w.m25575b(th, (String) null, 2, (Object) null);
        }
    }
}
