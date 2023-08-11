package p099g6;

import androidx.annotation.NonNull;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p037b6.C2922p;

/* renamed from: g6.e */
public final class C7783e {
    /* renamed from: a */
    public static <ResultT> C7781c<ResultT> m15174a(Exception exc) {
        C7793o oVar = new C7793o();
        oVar.mo41441j(exc);
        return oVar;
    }

    /* renamed from: b */
    public static <ResultT> C7781c<ResultT> m15175b(ResultT resultt) {
        C7793o oVar = new C7793o();
        oVar.mo41442k(resultt);
        return oVar;
    }

    /* renamed from: c */
    private static <ResultT> ResultT m15176c(C7781c<ResultT> cVar) {
        if (cVar.mo41428h()) {
            return cVar.mo41426f();
        }
        throw new ExecutionException(cVar.mo41425e());
    }

    /* renamed from: d */
    private static void m15177d(C7781c<?> cVar, C7794p pVar) {
        Executor executor = C7782d.f10815b;
        cVar.mo41424d(executor, pVar);
        cVar.mo41422b(executor, pVar);
    }

    /* renamed from: e */
    public static <ResultT> ResultT m15178e(@NonNull C7781c<ResultT> cVar) {
        C2922p.m2382b(cVar, "Task must not be null");
        if (cVar.mo41427g()) {
            return m15176c(cVar);
        }
        C7794p pVar = new C7794p((byte[]) null);
        m15177d(cVar, pVar);
        pVar.mo41445c();
        return m15176c(cVar);
    }
}
