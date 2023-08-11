package p218s2;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.facebook.C4509a;
import com.facebook.C4555l;
import com.facebook.C4570n;
import com.facebook.C4574o;
import com.facebook.FacebookSdk;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import kotlin.jvm.internal.C12770k0;
import kotlin.jvm.internal.C12775o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p198q2.C9138d0;
import p198q2.C9166l;
import p218s2.C9449b;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: s2.a */
/* compiled from: ExceptionAnalyzer.kt */
public final class C9447a {

    /* renamed from: a */
    private static boolean f14045a;

    /* renamed from: b */
    public static final C9447a f14046b = new C9447a();

    /* renamed from: s2.a$a */
    /* compiled from: ExceptionAnalyzer.kt */
    static final class C9448a implements C4555l.C4557b {

        /* renamed from: a */
        final /* synthetic */ C9449b f14047a;

        C9448a(C9449b bVar) {
            this.f14047a = bVar;
        }

        public final void onCompleted(C4574o oVar) {
            JSONObject d;
            C12775o.m28639i(oVar, "response");
            try {
                if (oVar.mo31709b() == null && (d = oVar.mo31711d()) != null && d.getBoolean("success")) {
                    this.f14047a.mo43893a();
                }
            } catch (JSONException unused) {
            }
        }
    }

    private C9447a() {
    }

    /* renamed from: a */
    public static final void m19555a() {
        f14045a = true;
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            f14046b.mo43892d();
        }
    }

    /* renamed from: b */
    public static final void m19556b(Throwable th) {
        if (f14045a && !m19557c() && th != null) {
            HashSet hashSet = new HashSet();
            StackTraceElement[] stackTrace = th.getStackTrace();
            C12775o.m28638h(stackTrace, "e.stackTrace");
            for (StackTraceElement stackTraceElement : stackTrace) {
                C12775o.m28638h(stackTraceElement, "it");
                String className = stackTraceElement.getClassName();
                C12775o.m28638h(className, "it.className");
                C9166l.C9168b d = C9166l.m18757d(className);
                if (d != C9166l.C9168b.Unknown) {
                    C9166l.m18756c(d);
                    hashSet.add(d.toString());
                }
            }
            if (FacebookSdk.getAutoLogAppEventsEnabled() && (!hashSet.isEmpty())) {
                C9449b.C9450a.m19568c(new JSONArray(hashSet)).mo43896g();
            }
        }
    }

    @VisibleForTesting(otherwise = 2)
    /* renamed from: c */
    public static final boolean m19557c() {
        return false;
    }

    @VisibleForTesting(otherwise = 2)
    /* renamed from: d */
    public final void mo43892d() {
        if (!C9138d0.m18616R()) {
            File[] i = C9459f.m19585i();
            ArrayList arrayList = new ArrayList();
            for (File d : i) {
                C9449b d2 = C9449b.C9450a.m19569d(d);
                if (d2.mo43895f()) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("crash_shield", d2.toString());
                        C4555l.C4558c cVar = C4555l.f4241t;
                        C12770k0 k0Var = C12770k0.f20423a;
                        String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{FacebookSdk.getApplicationId()}, 1));
                        C12775o.m28638h(format, "java.lang.String.format(format, *args)");
                        arrayList.add(cVar.mo31649w((C4509a) null, format, jSONObject, new C9448a(d2)));
                    } catch (JSONException unused) {
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                new C4570n((Collection<C4555l>) arrayList).mo31702s();
            }
        }
    }
}
