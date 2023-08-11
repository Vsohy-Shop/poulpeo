package p270x;

import android.content.Context;
import android.content.Intent;
import com.appboy.models.push.BrazeNotificationPayload;
import kotlin.jvm.internal.C12775o;
import p031b0.C2813h;
import p042bo.app.C2993a2;
import p042bo.app.C3501o1;
import p292z.C10731b;

/* renamed from: x.e */
public final class C10299e {

    /* renamed from: a */
    public static final C10299e f15555a = new C10299e();

    private C10299e() {
    }

    /* renamed from: a */
    public static final void m21642a(Context context, String str, String str2) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(str, "serializedCardJson");
        f15555a.m21644c(context).mo44763G(str, str2);
    }

    /* renamed from: b */
    public static final void m21643b(Context context) {
        C12775o.m28639i(context, "context");
        f15555a.m21644c(context).mo44765I();
    }

    /* renamed from: c */
    private final C10156b m21644c(Context context) {
        return C10156b.f15345m.mo44811g(context);
    }

    /* renamed from: d */
    public static final void m21645d(Context context, Intent intent) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(intent, "intent");
        f15555a.m21644c(context).mo44774S(intent);
    }

    /* renamed from: e */
    public static final void m21646e(Context context, C2993a2 a2Var) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(a2Var, "location");
        f15555a.m21644c(context).mo44778X(a2Var);
    }

    /* renamed from: g */
    public static final void m21647g(Context context, String str, C3501o1 o1Var) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(str, "geofenceId");
        C12775o.m28639i(o1Var, "transitionType");
        f15555a.m21644c(context).mo44789f0(str, o1Var);
    }

    /* renamed from: h */
    public static final void m21648h(Context context) {
        C12775o.m28639i(context, "context");
        f15555a.m21644c(context).mo44790g0();
    }

    /* renamed from: i */
    public static final void m21649i(Context context, C2993a2 a2Var) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(a2Var, "location");
        f15555a.m21644c(context).mo44792i0(a2Var);
    }

    /* renamed from: j */
    public static final void m21650j(Context context, boolean z) {
        C12775o.m28639i(context, "context");
        f15555a.m21644c(context).mo44793j0(z);
    }

    /* renamed from: k */
    public static final void m21651k(Context context, C2813h hVar) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(hVar, "inAppMessageEvent");
        f15555a.m21644c(context).mo44798o0(hVar);
    }

    /* renamed from: f */
    public final /* synthetic */ void mo44960f(Context context, C10731b bVar, BrazeNotificationPayload brazeNotificationPayload) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(bVar, "pushActionType");
        C12775o.m28639i(brazeNotificationPayload, "payload");
        m21644c(context).mo44788d0(bVar, brazeNotificationPayload);
    }
}
