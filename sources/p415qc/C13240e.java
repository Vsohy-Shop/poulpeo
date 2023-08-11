package p415qc;

import android.content.Context;
import android.text.TextUtils;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.util.HashMap;
import java.util.Map;
import p446vd.C13621b;
import p446vd.C13623d;
import p446vd.C13633n;

/* renamed from: qc.e */
/* compiled from: CTTracking */
public class C13240e {

    /* renamed from: c */
    public static boolean f21065c = false;

    /* renamed from: d */
    private static Map<C13238c, Object> f21066d;

    /* renamed from: a */
    private Map<C13238c, Object> f21067a;

    /* renamed from: b */
    private boolean f21068b;

    public C13240e(Context context) {
        this(new ContextContainer(context));
        f21065c = false;
    }

    /* renamed from: a */
    public static void m30073a(ContextContainer contextContainer, C13238c cVar, Object obj) {
        if (cVar == null) {
            throw new IllegalArgumentException();
        } else if (obj != null) {
            synchronized (C13240e.class) {
                m30076e(contextContainer);
                f21066d.put(cVar, obj);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: d */
    public static String m30075d(ContextContainer contextContainer, String str) {
        if (contextContainer == null) {
            throw new IllegalArgumentException();
        } else if (!TextUtils.isEmpty(str)) {
            String d = C13621b.m31090d(contextContainer);
            if (TextUtils.isEmpty(d)) {
                return null;
            }
            return str + ".app." + SystemMediaRouteProvider.PACKAGE_NAME + ".v" + d.replaceAll("\\.", "-");
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: e */
    private static void m30076e(ContextContainer contextContainer) {
        if (contextContainer == null) {
            throw new IllegalArgumentException();
        } else if (f21066d == null) {
            synchronized (C13240e.class) {
                if (f21066d == null) {
                    f21066d = new HashMap();
                    if (!TextUtils.isEmpty("15.13")) {
                        f21066d.put(C13242g.f21096h, "15.13");
                        String i = C13623d.m31109i(contextContainer);
                        if (!TextUtils.isEmpty(i)) {
                            f21066d.put(C13242g.f21103o, i);
                        }
                        String g = C13623d.m31107g(contextContainer);
                        if (!TextUtils.isEmpty(g)) {
                            f21066d.put(C13242g.f21104p, g);
                        }
                        String j = C13623d.m31110j(contextContainer);
                        if (j != null) {
                            f21066d.put(C13242g.f21106r, j);
                        }
                        String d = C13621b.m31090d(contextContainer);
                        if (!TextUtils.isEmpty(d)) {
                            f21066d.put(C13242g.f21109u, d);
                        }
                    } else {
                        throw new IllegalStateException("The opendata version is missing");
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public static void m30077f(ContextContainer contextContainer, C13238c cVar) {
        if (cVar != null) {
            synchronized (C13240e.class) {
                m30076e(contextContainer);
                f21066d.remove(cVar);
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public synchronized C13240e mo52888c(C13238c cVar, Object obj) {
        synchronized (C13240e.class) {
            if (this.f21068b) {
                C13633n.m31163s(this, "Try to init tracking but the tracking has already been sent");
                return this;
            } else if (cVar == null) {
                throw new IllegalArgumentException();
            } else if (obj == null) {
                return this;
            } else {
                this.f21067a.put(cVar, obj);
                return this;
            }
        }
    }

    /* renamed from: g */
    public synchronized void mo52889g(C13241f fVar) {
        synchronized (C13240e.class) {
            if (this.f21068b) {
                C13633n.m31163s(this, "Try to send " + fVar.mo52892c() + " data but the tracking has already been sent");
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.putAll(f21066d);
            hashMap.putAll(this.f21067a);
            m30074b(hashMap);
            this.f21068b = true;
            try {
                fVar.mo52891b(hashMap).mo52896g("https://col.retailmenot.fr/__rmn.gif", f21065c);
            } catch (Exception e) {
                C13633n.m31164t(this, "The " + fVar.mo52892c() + " tracking has failed", e);
            }
        }
    }

    public C13240e(ContextContainer contextContainer) {
        this.f21067a = new HashMap();
        this.f21068b = false;
        m30076e(contextContainer);
    }

    /* renamed from: b */
    private void m30074b(Map<C13238c, Object> map) {
    }
}
