package p042bo.app;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: bo.app.l6 */
public final class C3401l6 {

    /* renamed from: b */
    public static final C3402a f2113b = new C3402a((DefaultConstructorMarker) null);

    /* renamed from: c */
    private static final Comparator<C3024b3> f2114c = new C3238i7();

    /* renamed from: a */
    private final PriorityQueue<C3024b3> f2115a;

    /* renamed from: bo.app.l6$a */
    public static final class C3402a {
        public /* synthetic */ C3402a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3402a() {
        }
    }

    public C3401l6(List<? extends C3024b3> list) {
        C12775o.m28639i(list, "fallbackActions");
        PriorityQueue<C3024b3> priorityQueue = new PriorityQueue<>(12, f2114c);
        this.f2115a = priorityQueue;
        priorityQueue.addAll(list);
    }

    /* renamed from: a */
    public final C3024b3 mo29316a() {
        return this.f2115a.poll();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final int m3366a(C3024b3 b3Var, C3024b3 b3Var2) {
        C12775o.m28639i(b3Var, "actionA");
        C12775o.m28639i(b3Var2, "actionB");
        int u = b3Var.mo28657f().mo29600u();
        int u2 = b3Var2.mo28657f().mo29600u();
        if (u > u2) {
            return -1;
        }
        if (u < u2) {
            return 1;
        }
        return b3Var.getId().compareTo(b3Var2.getId());
    }
}
