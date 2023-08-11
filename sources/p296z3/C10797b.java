package p296z3;

import android.content.Context;
import android.util.Log;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.internal.gtm.C5318e1;
import com.google.android.gms.internal.gtm.C5333f1;
import com.google.android.gms.internal.gtm.C5437m;
import com.google.android.gms.internal.gtm.C5517r1;
import com.google.android.gms.internal.gtm.C5592w0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: z3.b */
public final class C10797b extends C10803g {

    /* renamed from: k */
    private static List<Runnable> f16517k = new ArrayList();

    /* renamed from: f */
    private boolean f16518f;

    /* renamed from: g */
    private Set<Object> f16519g = new HashSet();

    /* renamed from: h */
    private boolean f16520h;

    /* renamed from: i */
    private volatile boolean f16521i;

    /* renamed from: j */
    private boolean f16522j;

    public C10797b(C5437m mVar) {
        super(mVar);
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    /* renamed from: i */
    public static C10797b m22974i(Context context) {
        return C5437m.m8150c(context).mo33341p();
    }

    /* renamed from: p */
    public static void m22975p() {
        synchronized (C10797b.class) {
            List<Runnable> list = f16517k;
            if (list != null) {
                for (Runnable run : list) {
                    run.run();
                }
                f16517k = null;
            }
        }
    }

    /* renamed from: h */
    public final boolean mo45713h() {
        return this.f16521i;
    }

    /* renamed from: j */
    public final boolean mo45714j() {
        return this.f16520h;
    }

    /* renamed from: k */
    public final boolean mo45715k() {
        if (this.f16518f) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final C10801f mo45716l(String str) {
        C10801f fVar;
        synchronized (this) {
            fVar = new C10801f(mo45735g(), str, (C5318e1) null);
            fVar.mo33309O0();
        }
        return fVar;
    }

    /* renamed from: m */
    public final void mo45717m(boolean z) {
        this.f16520h = z;
    }

    @Deprecated
    /* renamed from: n */
    public final void mo45718n(C10800e eVar) {
        C5333f1.m7923b(eVar);
        if (!this.f16522j) {
            String a = C5592w0.f6420c.mo33605a();
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 112);
            sb.append("GoogleAnalytics.setLogger() is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.");
            sb.append(a);
            sb.append(" DEBUG");
            Log.i(C5592w0.f6420c.mo33605a(), sb.toString());
            this.f16522j = true;
        }
    }

    /* renamed from: o */
    public final void mo45719o() {
        C5517r1 j = mo45735g().mo33335j();
        j.mo33493T0();
        if (j.mo33494U0()) {
            mo45717m(j.mo33495V0());
        }
        j.mo33493T0();
        this.f16518f = true;
    }
}
