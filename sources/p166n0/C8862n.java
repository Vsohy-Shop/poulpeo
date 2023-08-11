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

/* renamed from: n0.n */
/* compiled from: SetPushNotificationSubscriptionStep.kt */
public final class C8862n extends C8842c {

    /* renamed from: b */
    public static final C8862n f12832b;

    /* renamed from: c */
    private static final String f12833c;

    /* renamed from: n0.n$a */
    /* compiled from: SetPushNotificationSubscriptionStep.kt */
    static final class C8863a extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ C8865o f12834g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8863a(C8865o oVar) {
            super(0);
            this.f12834g = oVar;
        }

        public final String invoke() {
            return C12775o.m28647q("Could not parse subscription type from data ", this.f12834g);
        }
    }

    /* renamed from: n0.n$b */
    /* compiled from: SetPushNotificationSubscriptionStep.kt */
    static final class C8864b extends C12777p implements Function1<C10300f, C11921v> {

        /* renamed from: g */
        final /* synthetic */ NotificationSubscriptionType f12835g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8864b(NotificationSubscriptionType notificationSubscriptionType) {
            super(1);
            this.f12835g = notificationSubscriptionType;
        }

        /* renamed from: a */
        public final void mo42984a(C10300f fVar) {
            C12775o.m28639i(fVar, "it");
            fVar.mo44986z(this.f12835g);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42984a((C10300f) obj);
            return C11921v.f18618a;
        }
    }

    static {
        C8862n nVar = new C8862n();
        f12832b = nVar;
        f12833c = C8266c.f11641a.mo42212b(nVar);
    }

    private C8862n() {
        super((DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public void mo42972a(Context context, C8865o oVar) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(oVar, "data");
        NotificationSubscriptionType fromValue = NotificationSubscriptionType.Companion.fromValue(String.valueOf(oVar.mo42990h()));
        if (fromValue == null) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C8863a(oVar), 7, (Object) null);
            return;
        }
        C8842c.f12811a.mo42976a(C10156b.f15345m.mo44811g(context), new C8864b(fromValue));
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
