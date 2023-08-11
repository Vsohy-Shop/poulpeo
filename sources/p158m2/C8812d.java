package p158m2;

import android.app.Activity;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import com.facebook.FacebookSdk;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C12775o;
import org.json.JSONArray;
import org.json.JSONObject;
import p118i2.C8086a;
import p128j2.C8343d;
import p198q2.C9177p;
import p198q2.C9181q;
import p251v2.C9925a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: m2.d */
/* compiled from: SuggestedEventsManager.kt */
public final class C8812d {

    /* renamed from: a */
    private static final AtomicBoolean f12774a = new AtomicBoolean(false);

    /* renamed from: b */
    private static final Set<String> f12775b = new LinkedHashSet();

    /* renamed from: c */
    private static final Set<String> f12776c = new LinkedHashSet();

    /* renamed from: d */
    public static final C8812d f12777d = new C8812d();

    /* renamed from: m2.d$a */
    /* compiled from: SuggestedEventsManager.kt */
    static final class C8813a implements Runnable {

        /* renamed from: b */
        public static final C8813a f12778b = new C8813a();

        C8813a() {
        }

        public final void run() {
            if (!C9925a.m20734d(this)) {
                try {
                    if (!C9925a.m20734d(this)) {
                        C8812d dVar = C8812d.f12777d;
                        if (!C8812d.m17853a(dVar).get()) {
                            C8812d.m17853a(dVar).set(true);
                            C8812d.m17854b(dVar);
                        }
                    }
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    private C8812d() {
    }

    /* renamed from: a */
    public static final /* synthetic */ AtomicBoolean m17853a(C8812d dVar) {
        Class<C8812d> cls = C8812d.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return f12774a;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ void m17854b(C8812d dVar) {
        Class<C8812d> cls = C8812d.class;
        if (!C9925a.m20734d(cls)) {
            try {
                dVar.m17856d();
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: c */
    public static final synchronized void m17855c() {
        synchronized (C8812d.class) {
            if (!C9925a.m20734d(C8812d.class)) {
                try {
                    FacebookSdk.getExecutor().execute(C8813a.f12778b);
                } catch (Throwable th) {
                    C9925a.m20732b(th, C8812d.class);
                }
            }
        }
    }

    /* renamed from: d */
    private final void m17856d() {
        String k;
        File j;
        if (!C9925a.m20734d(this)) {
            try {
                C9177p o = C9181q.m18810o(FacebookSdk.getApplicationId(), false);
                if (o != null && (k = o.mo43463k()) != null) {
                    mo42950g(k);
                    if (((!f12775b.isEmpty()) || (!f12776c.isEmpty())) && (j = C8343d.m16569j(C8343d.C8344a.MTML_APP_EVENT_PREDICTION)) != null) {
                        C8809a.m17833d(j);
                        Activity p = C8086a.m15909p();
                        if (p != null) {
                            m17859h(p);
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: e */
    public static final boolean m17857e(String str) {
        Class<C8812d> cls = C8812d.class;
        if (C9925a.m20734d(cls)) {
            return false;
        }
        try {
            C12775o.m28639i(str, NotificationCompat.CATEGORY_EVENT);
            return f12776c.contains(str);
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return false;
        }
    }

    /* renamed from: f */
    public static final boolean m17858f(String str) {
        Class<C8812d> cls = C8812d.class;
        if (C9925a.m20734d(cls)) {
            return false;
        }
        try {
            C12775o.m28639i(str, NotificationCompat.CATEGORY_EVENT);
            return f12775b.contains(str);
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return false;
        }
    }

    /* renamed from: h */
    public static final void m17859h(Activity activity) {
        Class<C8812d> cls = C8812d.class;
        if (!C9925a.m20734d(cls)) {
            try {
                C12775o.m28639i(activity, "activity");
                try {
                    if (!f12774a.get() || !C8809a.m17835f() || (f12775b.isEmpty() && f12776c.isEmpty())) {
                        C8814e.f12780f.mo42954b(activity);
                    } else {
                        C8814e.f12780f.mo42953a(activity);
                    }
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    @VisibleForTesting(otherwise = 2)
    /* renamed from: g */
    public final void mo42950g(String str) {
        if (!C9925a.m20734d(this)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("production_events")) {
                    JSONArray jSONArray = jSONObject.getJSONArray("production_events");
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        Set<String> set = f12775b;
                        String string = jSONArray.getString(i);
                        C12775o.m28638h(string, "jsonArray.getString(i)");
                        set.add(string);
                    }
                }
                if (jSONObject.has("eligible_for_prediction_events")) {
                    JSONArray jSONArray2 = jSONObject.getJSONArray("eligible_for_prediction_events");
                    int length2 = jSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        Set<String> set2 = f12776c;
                        String string2 = jSONArray2.getString(i2);
                        C12775o.m28638h(string2, "jsonArray.getString(i)");
                        set2.add(string2);
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }
}
