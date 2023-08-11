package p259w;

import java.io.IOException;
import kotlin.jvm.functions.Function1;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import p336ef.C11907m;
import p336ef.C11910n;
import p336ef.C11921v;
import p466yf.C14002n;

/* renamed from: w.j */
/* compiled from: Calls.kt */
final class C10072j implements Callback, Function1<Throwable, C11921v> {

    /* renamed from: b */
    private final Call f15220b;

    /* renamed from: c */
    private final C14002n<Response> f15221c;

    public C10072j(Call call, C14002n<? super Response> nVar) {
        this.f15220b = call;
        this.f15221c = nVar;
    }

    /* renamed from: a */
    public void mo44644a(Throwable th) {
        try {
            this.f15220b.cancel();
        } catch (Throwable unused) {
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo44644a((Throwable) obj);
        return C11921v.f18618a;
    }

    public void onFailure(Call call, IOException iOException) {
        if (!call.isCanceled()) {
            C14002n<Response> nVar = this.f15221c;
            C11907m.C11908a aVar = C11907m.f18600b;
            nVar.resumeWith(C11907m.m25696a(C11910n.m25700a(iOException)));
        }
    }

    public void onResponse(Call call, Response response) {
        this.f15221c.resumeWith(C11907m.m25696a(response));
    }
}
