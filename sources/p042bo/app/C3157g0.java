package p042bo.app;

import android.content.Context;
import com.braze.configuration.C4218b;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: bo.app.g0 */
public final class C3157g0 extends C4218b {

    /* renamed from: a */
    public static final C3158a f1718a = new C3158a((DefaultConstructorMarker) null);

    /* renamed from: bo.app.g0$a */
    public static final class C3158a {
        public /* synthetic */ C3158a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3158a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3157g0(Context context) {
        super(context);
        C12775o.m28639i(context, "context");
    }

    /* renamed from: a */
    public final long mo28927a() {
        return ((long) getIntValue(C4218b.C4220b.DATA_SYNC_BAD_NETWORK_INTERVAL_KEY.mo30938b(), 60)) * 1000;
    }

    /* renamed from: b */
    public final long mo28928b() {
        return ((long) getIntValue(C4218b.C4220b.DATA_SYNC_GOOD_NETWORK_INTERVAL_KEY.mo30938b(), 30)) * 1000;
    }

    /* renamed from: c */
    public final long mo28929c() {
        return ((long) getIntValue(C4218b.C4220b.DATA_SYNC_GREAT_NETWORK_INTERVAL_KEY.mo30938b(), 10)) * 1000;
    }
}
