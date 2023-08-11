package p259w;

import kotlin.coroutines.jvm.internal.C12741h;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Call;
import okhttp3.Response;
import p355hf.C12074d;
import p466yf.C14010o;

@SourceDebugExtension({"SMAP\nCalls.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Calls.kt\ncoil/util/-Calls\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,44:1\n314#2,11:45\n*S KotlinDebug\n*F\n+ 1 Calls.kt\ncoil/util/-Calls\n*L\n16#1:45,11\n*E\n"})
/* renamed from: w.b */
/* compiled from: Calls.kt */
public final class C10062b {
    /* renamed from: a */
    public static final Object m21125a(Call call, C12074d<? super Response> dVar) {
        C14010o oVar = new C14010o(C12147c.m26491b(dVar), 1);
        oVar.mo53786B();
        C10072j jVar = new C10072j(call, oVar);
        call.enqueue(jVar);
        oVar.mo49526f(jVar);
        Object y = oVar.mo53797y();
        if (y == C12150d.m26492c()) {
            C12741h.m28573c(dVar);
        }
        return y;
    }
}
