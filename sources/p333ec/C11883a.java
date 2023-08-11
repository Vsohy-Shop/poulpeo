package p333ec;

import android.app.Application;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.messaging.C7011s0;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import java.util.Set;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p093g0.C7620b;
import p270x.C10285c;

@StabilityInferred(parameters = 0)
/* renamed from: ec.a */
/* compiled from: BrazeManager.kt */
public final class C11883a {

    /* renamed from: a */
    public static final C11883a f18564a = new C11883a();

    private C11883a() {
    }

    /* renamed from: a */
    public final void mo49086a(Application application) {
        C12775o.m28639i(application, APIResourceDescriptors.RESOURCE_TYPE_APPLICATION);
        application.registerActivityLifecycleCallbacks(new C10285c(true, true, (Set) null, (Set) null, 12, (DefaultConstructorMarker) null));
    }

    /* renamed from: b */
    public final boolean mo49087b(Context context, C7011s0 s0Var) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(s0Var, "message");
        return C7620b.f10593h.mo41359a(context, s0Var);
    }
}
