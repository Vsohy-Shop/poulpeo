package p059d2;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import androidx.annotation.RestrictTo;
import com.facebook.C4509a;
import com.facebook.C4555l;
import com.facebook.C4574o;
import com.facebook.C4579r;
import com.facebook.FacebookSdk;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import kotlin.jvm.internal.C12770k0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import p118i2.C8093b;
import p198q2.C9138d0;
import p198q2.C9194v;
import p251v2.C9925a;

/* renamed from: d2.e */
/* compiled from: ViewIndexer.kt */
public final class C7242e {

    /* renamed from: e */
    private static final String f9969e;

    /* renamed from: f */
    private static C7242e f9970f;

    /* renamed from: g */
    public static final C7243a f9971g = new C7243a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Handler f9972a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private final WeakReference<Activity> f9973b;

    /* renamed from: c */
    private Timer f9974c;

    /* renamed from: d */
    private String f9975d = null;

    /* renamed from: d2.e$a */
    /* compiled from: ViewIndexer.kt */
    public static final class C7243a {

        /* renamed from: d2.e$a$a */
        /* compiled from: ViewIndexer.kt */
        static final class C7244a implements C4555l.C4557b {

            /* renamed from: a */
            public static final C7244a f9976a = new C7244a();

            C7244a() {
            }

            public final void onCompleted(C4574o oVar) {
                C12775o.m28639i(oVar, "it");
                C9194v.f13504f.mo43482c(C4579r.APP_EVENTS, C7242e.m14050d(), "App index sent to FB!");
            }
        }

        private C7243a() {
        }

        public /* synthetic */ C7243a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: a */
        public final C4555l mo40808a(String str, C4509a aVar, String str2, String str3) {
            C12775o.m28639i(str3, "requestType");
            if (str == null) {
                return null;
            }
            C4555l.C4558c cVar = C4555l.f4241t;
            C12770k0 k0Var = C12770k0.f20423a;
            String format = String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[]{str2}, 1));
            C12775o.m28638h(format, "java.lang.String.format(locale, format, *args)");
            C4555l w = cVar.mo31649w(aVar, format, (JSONObject) null, (C4555l.C4557b) null);
            Bundle s = w.mo31627s();
            if (s == null) {
                s = new Bundle();
            }
            s.putString("tree", str);
            s.putString("app_version", C8093b.m15922d());
            s.putString("platform", SystemMediaRouteProvider.PACKAGE_NAME);
            s.putString("request_type", str3);
            if (C12775o.m28634d(str3, "app_indexing")) {
                s.putString("device_session_id", C7231b.m14015h());
            }
            w.mo31617G(s);
            w.mo31613C(C7244a.f9976a);
            return w;
        }
    }

    /* renamed from: d2.e$b */
    /* compiled from: ViewIndexer.kt */
    private static final class C7245b implements Callable<String> {

        /* renamed from: b */
        private final WeakReference<View> f9977b;

        public C7245b(View view) {
            C12775o.m28639i(view, "rootView");
            this.f9977b = new WeakReference<>(view);
        }

        /* renamed from: a */
        public String call() {
            View view = this.f9977b.get();
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                return "";
            }
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            view.draw(new Canvas(createBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            C12775o.m28638h(encodeToString, "Base64.encodeToString(ou…eArray(), Base64.NO_WRAP)");
            return encodeToString;
        }
    }

    /* renamed from: d2.e$c */
    /* compiled from: ViewIndexer.kt */
    static final class C7246c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C7242e f9978b;

        /* renamed from: c */
        final /* synthetic */ TimerTask f9979c;

        C7246c(C7242e eVar, TimerTask timerTask) {
            this.f9978b = eVar;
            this.f9979c = timerTask;
        }

        public final void run() {
            if (!C9925a.m20734d(this)) {
                try {
                    if (!C9925a.m20734d(this)) {
                        try {
                            Timer b = C7242e.m14048b(this.f9978b);
                            if (b != null) {
                                b.cancel();
                            }
                            C7242e.m14054h(this.f9978b, (String) null);
                            Timer timer = new Timer();
                            timer.scheduleAtFixedRate(this.f9979c, 0, (long) 1000);
                            C7242e.m14053g(this.f9978b, timer);
                        } catch (Exception e) {
                            Log.e(C7242e.m14050d(), "Error scheduling indexing job", e);
                        }
                    }
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    /* renamed from: d2.e$d */
    /* compiled from: ViewIndexer.kt */
    public static final class C7247d extends TimerTask {

        /* renamed from: b */
        final /* synthetic */ C7242e f9980b;

        C7247d(C7242e eVar) {
            this.f9980b = eVar;
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0080 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r7 = this;
                d2.e r0 = r7.f9980b     // Catch:{ Exception -> 0x0099 }
                java.lang.ref.WeakReference r0 = p059d2.C7242e.m14047a(r0)     // Catch:{ Exception -> 0x0099 }
                java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0099 }
                android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ Exception -> 0x0099 }
                android.view.View r1 = p118i2.C8093b.m15923e(r0)     // Catch:{ Exception -> 0x0099 }
                if (r0 == 0) goto L_0x0098
                if (r1 != 0) goto L_0x0016
                goto L_0x0098
            L_0x0016:
                java.lang.Class r0 = r0.getClass()     // Catch:{ Exception -> 0x0099 }
                java.lang.String r0 = r0.getSimpleName()     // Catch:{ Exception -> 0x0099 }
                java.lang.String r2 = "activity.javaClass.simpleName"
                kotlin.jvm.internal.C12775o.m28638h(r0, r2)     // Catch:{ Exception -> 0x0099 }
                boolean r2 = p059d2.C7231b.m14016i()     // Catch:{ Exception -> 0x0099 }
                if (r2 != 0) goto L_0x002a
                return
            L_0x002a:
                boolean r2 = p198q2.C9191t.m18822b()     // Catch:{ Exception -> 0x0099 }
                if (r2 == 0) goto L_0x0034
                p071e2.C7453e.m14594a()     // Catch:{ Exception -> 0x0099 }
                return
            L_0x0034:
                java.util.concurrent.FutureTask r2 = new java.util.concurrent.FutureTask     // Catch:{ Exception -> 0x0099 }
                d2.e$b r3 = new d2.e$b     // Catch:{ Exception -> 0x0099 }
                r3.<init>(r1)     // Catch:{ Exception -> 0x0099 }
                r2.<init>(r3)     // Catch:{ Exception -> 0x0099 }
                d2.e r3 = r7.f9980b     // Catch:{ Exception -> 0x0099 }
                android.os.Handler r3 = p059d2.C7242e.m14051e(r3)     // Catch:{ Exception -> 0x0099 }
                r3.post(r2)     // Catch:{ Exception -> 0x0099 }
                java.lang.String r3 = ""
                java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ Exception -> 0x0055 }
                r5 = 1
                java.lang.Object r2 = r2.get(r5, r4)     // Catch:{ Exception -> 0x0055 }
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0055 }
                r3 = r2
                goto L_0x005f
            L_0x0055:
                r2 = move-exception
                java.lang.String r4 = p059d2.C7242e.m14050d()     // Catch:{ Exception -> 0x0099 }
                java.lang.String r5 = "Failed to take screenshot."
                android.util.Log.e(r4, r5, r2)     // Catch:{ Exception -> 0x0099 }
            L_0x005f:
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0099 }
                r2.<init>()     // Catch:{ Exception -> 0x0099 }
                java.lang.String r4 = "screenname"
                r2.put(r4, r0)     // Catch:{ JSONException -> 0x0080 }
                java.lang.String r0 = "screenshot"
                r2.put(r0, r3)     // Catch:{ JSONException -> 0x0080 }
                org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0080 }
                r0.<init>()     // Catch:{ JSONException -> 0x0080 }
                org.json.JSONObject r1 = p071e2.C7454f.m14601d(r1)     // Catch:{ JSONException -> 0x0080 }
                r0.put(r1)     // Catch:{ JSONException -> 0x0080 }
                java.lang.String r1 = "view"
                r2.put(r1, r0)     // Catch:{ JSONException -> 0x0080 }
                goto L_0x0089
            L_0x0080:
                java.lang.String r0 = p059d2.C7242e.m14050d()     // Catch:{ Exception -> 0x0099 }
                java.lang.String r1 = "Failed to create JSONObject"
                android.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x0099 }
            L_0x0089:
                java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0099 }
                java.lang.String r1 = "viewTree.toString()"
                kotlin.jvm.internal.C12775o.m28638h(r0, r1)     // Catch:{ Exception -> 0x0099 }
                d2.e r1 = r7.f9980b     // Catch:{ Exception -> 0x0099 }
                p059d2.C7242e.m14052f(r1, r0)     // Catch:{ Exception -> 0x0099 }
                goto L_0x00a3
            L_0x0098:
                return
            L_0x0099:
                r0 = move-exception
                java.lang.String r1 = p059d2.C7242e.m14050d()
                java.lang.String r2 = "UI Component tree indexing failure!"
                android.util.Log.e(r1, r2, r0)
            L_0x00a3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p059d2.C7242e.C7247d.run():void");
        }
    }

    /* renamed from: d2.e$e */
    /* compiled from: ViewIndexer.kt */
    static final class C7248e implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C7242e f9981b;

        /* renamed from: c */
        final /* synthetic */ String f9982c;

        C7248e(C7242e eVar, String str) {
            this.f9981b = eVar;
            this.f9982c = str;
        }

        public final void run() {
            if (!C9925a.m20734d(this)) {
                try {
                    if (!C9925a.m20734d(this)) {
                        String d0 = C9138d0.m18632d0(this.f9982c);
                        C4509a e = C4509a.f4119q.mo31515e();
                        if (d0 == null || !C12775o.m28634d(d0, C7242e.m14049c(this.f9981b))) {
                            this.f9981b.mo40805i(C7242e.f9971g.mo40808a(this.f9982c, e, FacebookSdk.getApplicationId(), "app_indexing"), d0);
                        }
                    }
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    static {
        String canonicalName = C7242e.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        C12775o.m28638h(canonicalName, "ViewIndexer::class.java.canonicalName ?: \"\"");
        f9969e = canonicalName;
    }

    public C7242e(Activity activity) {
        C12775o.m28639i(activity, "activity");
        this.f9973b = new WeakReference<>(activity);
        f9970f = this;
    }

    /* renamed from: a */
    public static final /* synthetic */ WeakReference m14047a(C7242e eVar) {
        Class<C7242e> cls = C7242e.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return eVar.f9973b;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ Timer m14048b(C7242e eVar) {
        Class<C7242e> cls = C7242e.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return eVar.f9974c;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ String m14049c(C7242e eVar) {
        Class<C7242e> cls = C7242e.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return eVar.f9975d;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ String m14050d() {
        Class<C7242e> cls = C7242e.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return f9969e;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: e */
    public static final /* synthetic */ Handler m14051e(C7242e eVar) {
        Class<C7242e> cls = C7242e.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return eVar.f9972a;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: f */
    public static final /* synthetic */ void m14052f(C7242e eVar, String str) {
        Class<C7242e> cls = C7242e.class;
        if (!C9925a.m20734d(cls)) {
            try {
                eVar.m14055k(str);
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: g */
    public static final /* synthetic */ void m14053g(C7242e eVar, Timer timer) {
        Class<C7242e> cls = C7242e.class;
        if (!C9925a.m20734d(cls)) {
            try {
                eVar.f9974c = timer;
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: h */
    public static final /* synthetic */ void m14054h(C7242e eVar, String str) {
        Class<C7242e> cls = C7242e.class;
        if (!C9925a.m20734d(cls)) {
            try {
                eVar.f9975d = str;
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: k */
    private final void m14055k(String str) {
        if (!C9925a.m20734d(this)) {
            try {
                FacebookSdk.getExecutor().execute(new C7248e(this, str));
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: i */
    public final void mo40805i(C4555l lVar, String str) {
        if (!C9925a.m20734d(this) && lVar != null) {
            try {
                C4574o i = lVar.mo31620i();
                JSONObject c = i.mo31710c();
                if (c != null) {
                    if (C12775o.m28634d("true", c.optString("success"))) {
                        C9194v.f13504f.mo43482c(C4579r.APP_EVENTS, f9969e, "Successfully send UI component tree to server");
                        this.f9975d = str;
                    }
                    if (c.has("is_app_indexing_enabled")) {
                        C7231b.m14021n(c.getBoolean("is_app_indexing_enabled"));
                        return;
                    }
                    return;
                }
                String str2 = f9969e;
                Log.e(str2, "Error sending UI component tree to Facebook: " + i.mo31709b());
            } catch (JSONException e) {
                Log.e(f9969e, "Error decoding server response.", e);
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: j */
    public final void mo40806j() {
        if (!C9925a.m20734d(this)) {
            try {
                FacebookSdk.getExecutor().execute(new C7246c(this, new C7247d(this)));
            } catch (RejectedExecutionException e) {
                Log.e(f9969e, "Error scheduling indexing job", e);
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: l */
    public final void mo40807l() {
        if (!C9925a.m20734d(this)) {
            try {
                if (this.f9973b.get() != null) {
                    Timer timer = this.f9974c;
                    if (timer != null) {
                        timer.cancel();
                    }
                    this.f9974c = null;
                }
            } catch (Exception e) {
                Log.e(f9969e, "Error unscheduling indexing job", e);
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }
}
