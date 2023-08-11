package p229t2;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.facebook.C4555l;
import com.facebook.C4574o;
import com.facebook.FacebookSdk;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.C12703l0;
import kotlin.jvm.internal.C12775o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p198q2.C9138d0;
import p218s2.C9449b;
import p218s2.C9459f;
import p251v2.C9925a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: t2.b */
/* compiled from: ANRHandler.kt */
public final class C9598b {

    /* renamed from: a */
    private static final AtomicBoolean f14289a = new AtomicBoolean(false);

    /* renamed from: b */
    public static final C9598b f14290b = new C9598b();

    /* renamed from: t2.b$a */
    /* compiled from: ANRHandler.kt */
    static final class C9599a implements C4555l.C4557b {

        /* renamed from: a */
        final /* synthetic */ List f14291a;

        C9599a(List list) {
            this.f14291a = list;
        }

        public final void onCompleted(C4574o oVar) {
            JSONObject d;
            C12775o.m28639i(oVar, "response");
            try {
                if (oVar.mo31709b() == null && (d = oVar.mo31711d()) != null && d.getBoolean("success")) {
                    for (C9449b a : this.f14291a) {
                        a.mo43893a();
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: t2.b$b */
    /* compiled from: ANRHandler.kt */
    static final class C9600b<T> implements Comparator {

        /* renamed from: b */
        public static final C9600b f14292b = new C9600b();

        C9600b() {
        }

        /* renamed from: a */
        public final int compare(C9449b bVar, C9449b bVar2) {
            C12775o.m28638h(bVar2, "o2");
            return bVar.mo43894b(bVar2);
        }
    }

    private C9598b() {
    }

    /* renamed from: a */
    public static final synchronized void m19922a() {
        synchronized (C9598b.class) {
            if (!C9925a.m20734d(C9598b.class)) {
                try {
                    if (!f14289a.getAndSet(true)) {
                        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
                            m19923b();
                        }
                        C9596a.m19921b();
                    }
                } catch (Throwable th) {
                    C9925a.m20732b(th, C9598b.class);
                }
            }
        }
    }

    @VisibleForTesting
    /* renamed from: b */
    public static final void m19923b() {
        Class<C9598b> cls = C9598b.class;
        if (!C9925a.m20734d(cls)) {
            try {
                if (!C9138d0.m18616R()) {
                    File[] h = C9459f.m19584h();
                    ArrayList arrayList = new ArrayList(h.length);
                    for (File d : h) {
                        arrayList.add(C9449b.C9450a.m19569d(d));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object next : arrayList) {
                        if (((C9449b) next).mo43895f()) {
                            arrayList2.add(next);
                        }
                    }
                    List v0 = C12686e0.m28243v0(arrayList2, C9600b.f14292b);
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = C13537l.m30893t(0, Math.min(v0.size(), 5)).iterator();
                    while (it.hasNext()) {
                        jSONArray.put(v0.get(((C12703l0) it).nextInt()));
                    }
                    C9459f.m19588l("anr_reports", jSONArray, new C9599a(v0));
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }
}
