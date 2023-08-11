package p158m2;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.RestrictTo;
import com.facebook.C4509a;
import com.facebook.C4555l;
import com.facebook.FacebookSdk;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.C12770k0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import p033b2.C2867m;
import p071e2.C7454f;
import p128j2.C8343d;
import p198q2.C9138d0;
import p251v2.C9925a;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: m2.f */
/* compiled from: ViewOnClickListener.kt */
public final class C8817f implements View.OnClickListener {

    /* renamed from: f */
    private static final Set<Integer> f12785f = new HashSet();

    /* renamed from: g */
    public static final C8818a f12786g = new C8818a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final View.OnClickListener f12787b;

    /* renamed from: c */
    private final WeakReference<View> f12788c;

    /* renamed from: d */
    private final WeakReference<View> f12789d;

    /* renamed from: e */
    private final String f12790e;

    /* renamed from: m2.f$a */
    /* compiled from: ViewOnClickListener.kt */
    public static final class C8818a {

        /* renamed from: m2.f$a$a */
        /* compiled from: ViewOnClickListener.kt */
        static final class C8819a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ String f12791b;

            /* renamed from: c */
            final /* synthetic */ String f12792c;

            C8819a(String str, String str2) {
                this.f12791b = str;
                this.f12792c = str2;
            }

            public final void run() {
                if (!C9925a.m20734d(this)) {
                    try {
                        if (!C9925a.m20734d(this)) {
                            C8817f.f12786g.m17876d(this.f12791b, this.f12792c, new float[0]);
                        }
                    } catch (Throwable th) {
                        C9925a.m20732b(th, this);
                    }
                }
            }
        }

        private C8818a() {
        }

        public /* synthetic */ C8818a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final void m17876d(String str, String str2, float[] fArr) {
            if (C8812d.m17858f(str)) {
                new C2867m(FacebookSdk.getApplicationContext()).mo28390e(str, str2);
            } else if (C8812d.m17857e(str)) {
                m17878f(str, str2, fArr);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public final boolean m17877e(String str, String str2) {
            String d = C8810b.m17847d(str);
            if (d == null) {
                return false;
            }
            if (!C12775o.m28634d(d, "other")) {
                C9138d0.m18660r0(new C8819a(d, str2));
            }
            return true;
        }

        /* renamed from: f */
        private final void m17878f(String str, String str2, float[] fArr) {
            Bundle bundle = new Bundle();
            try {
                bundle.putString("event_name", str);
                JSONObject jSONObject = new JSONObject();
                StringBuilder sb = new StringBuilder();
                for (float append : fArr) {
                    sb.append(append);
                    sb.append(",");
                }
                jSONObject.put("dense", sb.toString());
                jSONObject.put("button_text", str2);
                bundle.putString("metadata", jSONObject.toString());
                C4555l.C4558c cVar = C4555l.f4241t;
                C12770k0 k0Var = C12770k0.f20423a;
                String format = String.format(Locale.US, "%s/suggested_events", Arrays.copyOf(new Object[]{FacebookSdk.getApplicationId()}, 1));
                C12775o.m28638h(format, "java.lang.String.format(locale, format, *args)");
                C4555l w = cVar.mo31649w((C4509a) null, format, (JSONObject) null, (C4555l.C4557b) null);
                w.mo31617G(bundle);
                w.mo31620i();
            } catch (JSONException unused) {
            }
        }

        /* renamed from: c */
        public final void mo42957c(View view, View view2, String str) {
            C12775o.m28639i(view, "hostView");
            C12775o.m28639i(view2, "rootView");
            C12775o.m28639i(str, "activityName");
            int hashCode = view.hashCode();
            if (!C8817f.m17871b().contains(Integer.valueOf(hashCode))) {
                C7454f.m14614r(view, new C8817f(view, view2, str, (DefaultConstructorMarker) null));
                C8817f.m17871b().add(Integer.valueOf(hashCode));
            }
        }
    }

    /* renamed from: m2.f$b */
    /* compiled from: ViewOnClickListener.kt */
    static final class C8820b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C8817f f12793b;

        /* renamed from: c */
        final /* synthetic */ JSONObject f12794c;

        /* renamed from: d */
        final /* synthetic */ String f12795d;

        /* renamed from: e */
        final /* synthetic */ String f12796e;

        C8820b(C8817f fVar, JSONObject jSONObject, String str, String str2) {
            this.f12793b = fVar;
            this.f12794c = jSONObject;
            this.f12795d = str;
            this.f12796e = str2;
        }

        public final void run() {
            String[] o;
            if (!C9925a.m20734d(this)) {
                try {
                    if (!C9925a.m20734d(this)) {
                        String r = C9138d0.m18659r(FacebookSdk.getApplicationContext());
                        if (r != null) {
                            String lowerCase = r.toLowerCase();
                            C12775o.m28638h(lowerCase, "(this as java.lang.String).toLowerCase()");
                            float[] a = C8809a.m17830a(this.f12794c, lowerCase);
                            String c = C8809a.m17832c(this.f12795d, C8817f.m17870a(this.f12793b), lowerCase);
                            if (a != null && (o = C8343d.m16574o(C8343d.C8344a.MTML_APP_EVENT_PREDICTION, new float[][]{a}, new String[]{c})) != null) {
                                String str = o[0];
                                C8810b.m17844a(this.f12796e, str);
                                if (!C12775o.m28634d(str, "other")) {
                                    C8817f.f12786g.m17876d(str, this.f12795d, a);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                } catch (Exception unused) {
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    public /* synthetic */ C8817f(View view, View view2, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, view2, str);
    }

    /* renamed from: a */
    public static final /* synthetic */ String m17870a(C8817f fVar) {
        Class<C8817f> cls = C8817f.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return fVar.f12790e;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ Set m17871b() {
        Class<C8817f> cls = C8817f.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return f12785f;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    private final void m17872c(String str, String str2, JSONObject jSONObject) {
        if (!C9925a.m20734d(this)) {
            try {
                C9138d0.m18660r0(new C8820b(this, jSONObject, str2, str));
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: d */
    private final void m17873d() {
        if (!C9925a.m20734d(this)) {
            try {
                View view = this.f12788c.get();
                View view2 = this.f12789d.get();
                if (view != null && view2 != null) {
                    try {
                        String d = C8811c.m17851d(view2);
                        String b = C8810b.m17845b(view2, d);
                        if (b != null && !f12786g.m17877e(b, d)) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("view", C8811c.m17849b(view, view2));
                            jSONObject.put("screenname", this.f12790e);
                            m17872c(b, d, jSONObject);
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    public void onClick(View view) {
        if (!C9925a.m20734d(this)) {
            try {
                if (!C9925a.m20734d(this)) {
                    C12775o.m28639i(view, "view");
                    View.OnClickListener onClickListener = this.f12787b;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                    m17873d();
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    private C8817f(View view, View view2, String str) {
        this.f12787b = C7454f.m14604g(view);
        this.f12788c = new WeakReference<>(view2);
        this.f12789d = new WeakReference<>(view);
        if (str != null) {
            String lowerCase = str.toLowerCase();
            C12775o.m28638h(lowerCase, "(this as java.lang.String).toLowerCase()");
            this.f12790e = C13754v.m31521A(lowerCase, "activity", "", false, 4, (Object) null);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }
}
