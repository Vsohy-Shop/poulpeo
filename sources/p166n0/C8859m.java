package p166n0;

import android.content.Context;
import com.appboy.enums.NotificationSubscriptionType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p126j0.C8266c;
import p270x.C10156b;
import p270x.C10300f;
import p336ef.C11921v;
import p404of.C13074a;
import p436tf.C13528f;

/* renamed from: n0.m */
/* compiled from: SetEmailSubscriptionStep.kt */
public final class C8859m extends C8842c {

    /* renamed from: b */
    public static final C8859m f12828b;

    /* renamed from: c */
    private static final String f12829c;

    /* renamed from: n0.m$a */
    /* compiled from: SetEmailSubscriptionStep.kt */
    static final class C8860a extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ C8865o f12830g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8860a(C8865o oVar) {
            super(0);
            this.f12830g = oVar;
        }

        public final String invoke() {
            return C12775o.m28647q("Could not parse subscription type from data: ", this.f12830g);
        }
    }

    /* renamed from: n0.m$b */
    /* compiled from: SetEmailSubscriptionStep.kt */
    static final class C8861b extends C12777p implements Function1<C10300f, C11921v> {

        /* renamed from: g */
        final /* synthetic */ NotificationSubscriptionType f12831g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8861b(NotificationSubscriptionType notificationSubscriptionType) {
            super(1);
            this.f12831g = notificationSubscriptionType;
        }

        /* renamed from: a */
        public final void mo42983a(C10300f fVar) {
            C12775o.m28639i(fVar, "it");
            fVar.mo44978r(this.f12831g);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42983a((C10300f) obj);
            return C11921v.f18618a;
        }
    }

    static {
        C8859m mVar = new C8859m();
        f12828b = mVar;
        f12829c = C8266c.f11641a.mo42212b(mVar);
    }

    private C8859m() {
        super((DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public void mo42972a(Context context, C8865o oVar) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(oVar, "data");
        NotificationSubscriptionType fromValue = NotificationSubscriptionType.Companion.fromValue(String.valueOf(oVar.mo42990h()));
        if (fromValue == null) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C8860a(oVar), 7, (Object) null);
            return;
        }
        C8842c.f12811a.mo42976a(C10156b.f15345m.mo44811g(context), new C8861b(fromValue));
    }

    /* renamed from: b */
    public boolean mo42973b(C8865o oVar) {
        C12775o.m28639i(oVar, "data");
        if (!C8865o.m17956l(oVar, 1, (C13528f) null, 2, (Object) null) || !oVar.mo42996n(0)) {
            return false;
        }
        return true;
    }
}
