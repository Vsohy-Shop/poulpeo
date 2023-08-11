package p033b2;

import android.content.Context;
import com.facebook.FacebookSdk;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C12775o;
import p198q2.C9114a;

/* renamed from: b2.d */
/* compiled from: AppEventCollection.kt */
public final class C2838d {

    /* renamed from: a */
    private final HashMap<C2828a, C2873o> f1191a = new HashMap<>();

    /* renamed from: e */
    private final synchronized C2873o m2166e(C2828a aVar) {
        C2873o oVar = this.f1191a.get(aVar);
        if (oVar == null) {
            Context applicationContext = FacebookSdk.getApplicationContext();
            C9114a e = C9114a.f13292h.mo43379e(applicationContext);
            if (e != null) {
                oVar = new C2873o(e, C2849g.f1214c.mo28351b(applicationContext));
            } else {
                oVar = null;
            }
        }
        if (oVar == null) {
            return null;
        }
        this.f1191a.put(aVar, oVar);
        return oVar;
    }

    /* renamed from: a */
    public final synchronized void mo28337a(C2828a aVar, C2834c cVar) {
        C12775o.m28639i(aVar, "accessTokenAppIdPair");
        C12775o.m28639i(cVar, "appEvent");
        C2873o e = m2166e(aVar);
        if (e != null) {
            e.mo28403a(cVar);
        }
    }

    /* renamed from: b */
    public final synchronized void mo28338b(C2869n nVar) {
        if (nVar != null) {
            for (C2828a next : nVar.mo28402c()) {
                C2873o e = m2166e(next);
                if (e != null) {
                    List<C2834c> b = nVar.mo28401b(next);
                    if (b != null) {
                        for (C2834c a : b) {
                            e.mo28403a(a);
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final synchronized C2873o mo28339c(C2828a aVar) {
        C12775o.m28639i(aVar, "accessTokenAppIdPair");
        return this.f1191a.get(aVar);
    }

    /* renamed from: d */
    public final synchronized int mo28340d() {
        int i;
        i = 0;
        for (C2873o c : this.f1191a.values()) {
            i += c.mo28405c();
        }
        return i;
    }

    /* renamed from: f */
    public final synchronized Set<C2828a> mo28341f() {
        Set<C2828a> keySet;
        keySet = this.f1191a.keySet();
        C12775o.m28638h(keySet, "stateMap.keys");
        return keySet;
    }
}
