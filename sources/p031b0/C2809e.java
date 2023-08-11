package p031b0;

import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p057d0.C7210b;

/* renamed from: b0.e */
public final class C2809e {

    /* renamed from: b */
    public static final C2810a f1115b = new C2810a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final List<C7210b> f1116a;

    /* renamed from: b0.e$a */
    public static final class C2810a {
        public /* synthetic */ C2810a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2810a() {
        }
    }

    public C2809e(List<C7210b> list) {
        C12775o.m28639i(list, "featureFlags");
        this.f1116a = list;
    }

    public String toString() {
        return "FeatureFlagsUpdatedEvent{flag count=" + this.f1116a.size() + '}';
    }
}
