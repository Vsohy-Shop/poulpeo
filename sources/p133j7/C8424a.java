package p133j7;

import com.google.android.gms.tasks.Task;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p112h7.C8024a;
import p112h7.C8025b;
import p112h7.C8027d;
import p184o8.C9013a;
import p336ef.C11921v;

/* renamed from: j7.a */
/* compiled from: FirebaseDynamicLinks.kt */
public final class C8424a {
    /* renamed from: a */
    public static final C8025b m16847a(C9013a aVar) {
        C12775o.m28640j(aVar, "$this$dynamicLinks");
        C8025b c = C8025b.m15793c();
        C12775o.m28635e(c, "FirebaseDynamicLinks.getInstance()");
        return c;
    }

    /* renamed from: b */
    public static final Task<C8027d> m16848b(C8025b bVar, Function1<? super C8024a, C11921v> function1) {
        C12775o.m28640j(bVar, "$this$shortLinkAsync");
        C12775o.m28640j(function1, "init");
        C8024a a = C8025b.m15793c().mo41855a();
        C12775o.m28635e(a, "FirebaseDynamicLinks.get…nce().createDynamicLink()");
        function1.invoke(a);
        Task<C8027d> a2 = a.mo41853a();
        C12775o.m28635e(a2, "builder.buildShortDynamicLink()");
        return a2;
    }
}
