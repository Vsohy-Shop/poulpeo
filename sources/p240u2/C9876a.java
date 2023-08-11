package p240u2;

import android.util.Log;
import androidx.annotation.RestrictTo;
import com.appboy.Constants;
import com.facebook.C4555l;
import com.facebook.C4574o;
import com.facebook.FacebookSdk;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C12703l0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p198q2.C9138d0;
import p218s2.C9447a;
import p218s2.C9449b;
import p218s2.C9459f;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: u2.a */
/* compiled from: CrashHandler.kt */
public final class C9876a implements Thread.UncaughtExceptionHandler {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String f14768b = C9876a.class.getCanonicalName();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static C9876a f14769c;

    /* renamed from: d */
    public static final C9877a f14770d = new C9877a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Thread.UncaughtExceptionHandler f14771a;

    /* renamed from: u2.a$a */
    /* compiled from: CrashHandler.kt */
    public static final class C9877a {

        /* renamed from: u2.a$a$a */
        /* compiled from: CrashHandler.kt */
        static final class C9878a implements C4555l.C4557b {

            /* renamed from: a */
            final /* synthetic */ List f14772a;

            C9878a(List list) {
                this.f14772a = list;
            }

            public final void onCompleted(C4574o oVar) {
                JSONObject d;
                C12775o.m28639i(oVar, "response");
                try {
                    if (oVar.mo31709b() == null && (d = oVar.mo31711d()) != null && d.getBoolean("success")) {
                        for (C9449b a : this.f14772a) {
                            a.mo43893a();
                        }
                    }
                } catch (JSONException unused) {
                }
            }
        }

        /* renamed from: u2.a$a$b */
        /* compiled from: CrashHandler.kt */
        static final class C9879b<T> implements Comparator {

            /* renamed from: b */
            public static final C9879b f14773b = new C9879b();

            C9879b() {
            }

            /* renamed from: a */
            public final int compare(C9449b bVar, C9449b bVar2) {
                C12775o.m28638h(bVar2, "o2");
                return bVar.mo43894b(bVar2);
            }
        }

        private C9877a() {
        }

        public /* synthetic */ C9877a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        private final void m20516b() {
            if (!C9138d0.m18616R()) {
                File[] j = C9459f.m19586j();
                ArrayList arrayList = new ArrayList(j.length);
                for (File d : j) {
                    arrayList.add(C9449b.C9450a.m19569d(d));
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object next : arrayList) {
                    if (((C9449b) next).mo43895f()) {
                        arrayList2.add(next);
                    }
                }
                List v0 = C12686e0.m28243v0(arrayList2, C9879b.f14773b);
                JSONArray jSONArray = new JSONArray();
                Iterator it = C13537l.m30893t(0, Math.min(v0.size(), 5)).iterator();
                while (it.hasNext()) {
                    jSONArray.put(v0.get(((C12703l0) it).nextInt()));
                }
                C9459f.m19588l("crash_reports", jSONArray, new C9878a(v0));
            }
        }

        /* renamed from: a */
        public final synchronized void mo44405a() {
            if (FacebookSdk.getAutoLogAppEventsEnabled()) {
                m20516b();
            }
            if (C9876a.f14769c != null) {
                Log.w(C9876a.f14768b, "Already enabled!");
                return;
            }
            C9876a.f14769c = new C9876a(Thread.getDefaultUncaughtExceptionHandler(), (DefaultConstructorMarker) null);
            Thread.setDefaultUncaughtExceptionHandler(C9876a.f14769c);
        }
    }

    public /* synthetic */ C9876a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, DefaultConstructorMarker defaultConstructorMarker) {
        this(uncaughtExceptionHandler);
    }

    public void uncaughtException(Thread thread, Throwable th) {
        C12775o.m28639i(thread, Constants.APPBOY_PUSH_TITLE_KEY);
        C12775o.m28639i(th, "e");
        if (C9459f.m19582f(th)) {
            C9447a.m19556b(th);
            C9449b.C9450a.m19567b(th, C9449b.C9452c.CrashReport).mo43896g();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f14771a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    private C9876a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f14771a = uncaughtExceptionHandler;
    }
}
