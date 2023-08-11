package p059d2;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import androidx.annotation.RestrictTo;
import com.facebook.FacebookSdk;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C12775o;
import p033b2.C2849g;
import p071e2.C7443a;
import p071e2.C7454f;
import p118i2.C8093b;
import p251v2.C9925a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: d2.a */
/* compiled from: CodelessLoggingEventListener.kt */
public final class C7227a {

    /* renamed from: a */
    public static final C7227a f9922a = new C7227a();

    /* renamed from: d2.a$a */
    /* compiled from: CodelessLoggingEventListener.kt */
    public static final class C7228a implements View.OnClickListener {

        /* renamed from: b */
        private C7443a f9923b;

        /* renamed from: c */
        private WeakReference<View> f9924c;

        /* renamed from: d */
        private WeakReference<View> f9925d;

        /* renamed from: e */
        private View.OnClickListener f9926e;

        /* renamed from: f */
        private boolean f9927f = true;

        public C7228a(C7443a aVar, View view, View view2) {
            C12775o.m28639i(aVar, "mapping");
            C12775o.m28639i(view, "rootView");
            C12775o.m28639i(view2, "hostView");
            this.f9923b = aVar;
            this.f9924c = new WeakReference<>(view2);
            this.f9925d = new WeakReference<>(view);
            this.f9926e = C7454f.m14604g(view2);
        }

        /* renamed from: a */
        public final boolean mo40784a() {
            return this.f9927f;
        }

        public void onClick(View view) {
            if (!C9925a.m20734d(this)) {
                try {
                    if (!C9925a.m20734d(this)) {
                        C12775o.m28639i(view, "view");
                        View.OnClickListener onClickListener = this.f9926e;
                        if (onClickListener != null) {
                            onClickListener.onClick(view);
                        }
                        View view2 = this.f9925d.get();
                        View view3 = this.f9924c.get();
                        if (view2 != null && view3 != null) {
                            C7443a aVar = this.f9923b;
                            if (aVar != null) {
                                C7227a.m14004c(aVar, view2, view3);
                                return;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.internal.EventBinding");
                        }
                    }
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    /* renamed from: d2.a$b */
    /* compiled from: CodelessLoggingEventListener.kt */
    public static final class C7229b implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        private C7443a f9928b;

        /* renamed from: c */
        private WeakReference<AdapterView<?>> f9929c;

        /* renamed from: d */
        private WeakReference<View> f9930d;

        /* renamed from: e */
        private AdapterView.OnItemClickListener f9931e;

        /* renamed from: f */
        private boolean f9932f = true;

        public C7229b(C7443a aVar, View view, AdapterView<?> adapterView) {
            C12775o.m28639i(aVar, "mapping");
            C12775o.m28639i(view, "rootView");
            C12775o.m28639i(adapterView, "hostView");
            this.f9928b = aVar;
            this.f9929c = new WeakReference<>(adapterView);
            this.f9930d = new WeakReference<>(view);
            this.f9931e = adapterView.getOnItemClickListener();
        }

        /* renamed from: a */
        public final boolean mo40786a() {
            return this.f9932f;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C12775o.m28639i(view, "view");
            AdapterView.OnItemClickListener onItemClickListener = this.f9931e;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i, j);
            }
            View view2 = this.f9930d.get();
            AdapterView adapterView2 = this.f9929c.get();
            if (view2 != null && adapterView2 != null) {
                C7227a.m14004c(this.f9928b, view2, adapterView2);
            }
        }
    }

    /* renamed from: d2.a$c */
    /* compiled from: CodelessLoggingEventListener.kt */
    static final class C7230c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f9933b;

        /* renamed from: c */
        final /* synthetic */ Bundle f9934c;

        C7230c(String str, Bundle bundle) {
            this.f9933b = str;
            this.f9934c = bundle;
        }

        public final void run() {
            if (!C9925a.m20734d(this)) {
                try {
                    if (!C9925a.m20734d(this)) {
                        C2849g.f1214c.mo28355f(FacebookSdk.getApplicationContext()).mo28349c(this.f9933b, this.f9934c);
                    }
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    private C7227a() {
    }

    /* renamed from: a */
    public static final C7228a m14002a(C7443a aVar, View view, View view2) {
        Class<C7227a> cls = C7227a.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            C12775o.m28639i(aVar, "mapping");
            C12775o.m28639i(view, "rootView");
            C12775o.m28639i(view2, "hostView");
            return new C7228a(aVar, view, view2);
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    public static final C7229b m14003b(C7443a aVar, View view, AdapterView<?> adapterView) {
        Class<C7227a> cls = C7227a.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            C12775o.m28639i(aVar, "mapping");
            C12775o.m28639i(view, "rootView");
            C12775o.m28639i(adapterView, "hostView");
            return new C7229b(aVar, view, adapterView);
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    public static final void m14004c(C7443a aVar, View view, View view2) {
        Class<C7227a> cls = C7227a.class;
        if (!C9925a.m20734d(cls)) {
            try {
                C12775o.m28639i(aVar, "mapping");
                C12775o.m28639i(view, "rootView");
                C12775o.m28639i(view2, "hostView");
                String b = aVar.mo41113b();
                Bundle b2 = C7234c.f9948h.mo40795b(aVar, view, view2);
                f9922a.mo40783d(b2);
                FacebookSdk.getExecutor().execute(new C7230c(b, b2));
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: d */
    public final void mo40783d(Bundle bundle) {
        if (!C9925a.m20734d(this)) {
            try {
                C12775o.m28639i(bundle, "parameters");
                String string = bundle.getString("_valueToSum");
                if (string != null) {
                    bundle.putDouble("_valueToSum", C8093b.m15925g(string));
                }
                bundle.putString("_is_fb_codeless", "1");
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }
}
