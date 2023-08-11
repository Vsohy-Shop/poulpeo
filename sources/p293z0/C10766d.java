package p293z0;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.appboy.Constants;
import com.braze.configuration.C4218b;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p019a1.C2113b;
import p069e0.C7358a;
import p126j0.C8233a;
import p126j0.C8266c;
import p238u0.C9783d;
import p281y.C10606a;
import p282y0.C10642h;
import p282y0.C10643i;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13074a;
import p404of.C13088o;
import p466yf.C13933b1;
import p466yf.C13970h;
import p466yf.C13988j2;
import p466yf.C13995l0;
import p466yf.C14054y1;

/* renamed from: z0.d */
/* compiled from: InAppMessageWebViewClient.kt */
public class C10766d extends WebViewClient {

    /* renamed from: i */
    public static final C10767a f16465i = new C10767a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Context f16466a;

    /* renamed from: b */
    private final C7358a f16467b;

    /* renamed from: c */
    private final C10642h f16468c;

    /* renamed from: d */
    private C10643i f16469d;

    /* renamed from: e */
    private boolean f16470e;

    /* renamed from: f */
    private final AtomicBoolean f16471f = new AtomicBoolean(false);

    /* renamed from: g */
    private C14054y1 f16472g;

    /* renamed from: h */
    private final int f16473h;

    /* renamed from: z0.d$a */
    /* compiled from: InAppMessageWebViewClient.kt */
    public static final class C10767a {
        private C10767a() {
        }

        public /* synthetic */ C10767a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @VisibleForTesting
        /* renamed from: a */
        public final Bundle mo45669a(String str) {
            C12775o.m28639i(str, "url");
            Bundle bundle = new Bundle();
            if (C13754v.m31532t(str)) {
                return bundle;
            }
            Uri parse = Uri.parse(str);
            C12775o.m28638h(parse, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
            for (Map.Entry next : C2113b.m1460b(parse).entrySet()) {
                bundle.putString((String) next.getKey(), (String) next.getValue());
            }
            return bundle;
        }
    }

    /* renamed from: z0.d$b */
    /* compiled from: InAppMessageWebViewClient.kt */
    static final class C10768b extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10768b f16474g = new C10768b();

        C10768b() {
            super(0);
        }

        public final String invoke() {
            return "Failed to get HTML in-app message javascript additions";
        }
    }

    /* renamed from: z0.d$c */
    /* compiled from: InAppMessageWebViewClient.kt */
    static final class C10769c extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10769c f16475g = new C10769c();

        C10769c() {
            super(0);
        }

        public final String invoke() {
            return "InAppMessageWebViewClient was given null IInAppMessageWebViewClientListener listener. Returning true.";
        }
    }

    /* renamed from: z0.d$d */
    /* compiled from: InAppMessageWebViewClient.kt */
    static final class C10770d extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10770d f16476g = new C10770d();

        C10770d() {
            super(0);
        }

        public final String invoke() {
            return "InAppMessageWebViewClient.shouldOverrideUrlLoading was given blank url. Returning true.";
        }
    }

    /* renamed from: z0.d$e */
    /* compiled from: InAppMessageWebViewClient.kt */
    static final class C10771e extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Uri f16477g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10771e(Uri uri) {
            super(0);
            this.f16477g = uri;
        }

        public final String invoke() {
            return C12775o.m28647q("Uri authority was null. Uri: ", this.f16477g);
        }
    }

    /* renamed from: z0.d$f */
    /* compiled from: InAppMessageWebViewClient.kt */
    static final class C10772f extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Uri f16478g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10772f(Uri uri) {
            super(0);
            this.f16478g = uri;
        }

        public final String invoke() {
            return C12775o.m28647q("Uri scheme was null or not an appboy url. Uri: ", this.f16478g);
        }
    }

    /* renamed from: z0.d$g */
    /* compiled from: InAppMessageWebViewClient.kt */
    static final class C10773g extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10773g f16479g = new C10773g();

        C10773g() {
            super(0);
        }

        public final String invoke() {
            return "Page may not have finished loading, but max wait time has expired. Calling onPageFinished on listener.";
        }
    }

    /* renamed from: z0.d$h */
    /* compiled from: InAppMessageWebViewClient.kt */
    static final class C10774h extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10774h f16480g = new C10774h();

        C10774h() {
            super(0);
        }

        public final String invoke() {
            return "Page has finished loading. Calling onPageFinished on listener";
        }
    }

    /* renamed from: z0.d$i */
    /* compiled from: InAppMessageWebViewClient.kt */
    static final class C10775i extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10775i f16481g = new C10775i();

        C10775i() {
            super(0);
        }

        public final String invoke() {
            return "The webview rendering process crashed, returning true";
        }
    }

    @C12739f(mo50609c = "com.braze.ui.inappmessage.utils.InAppMessageWebViewClient$setWebViewClientStateListener$1", mo50610f = "InAppMessageWebViewClient.kt", mo50611l = {106}, mo50612m = "invokeSuspend")
    /* renamed from: z0.d$j */
    /* compiled from: InAppMessageWebViewClient.kt */
    static final class C10776j extends C12746l implements Function1<C12074d<? super C11921v>, Object> {

        /* renamed from: h */
        int f16482h;

        /* renamed from: i */
        final /* synthetic */ C10766d f16483i;

        @C12739f(mo50609c = "com.braze.ui.inappmessage.utils.InAppMessageWebViewClient$setWebViewClientStateListener$1$1", mo50610f = "InAppMessageWebViewClient.kt", mo50611l = {}, mo50612m = "invokeSuspend")
        /* renamed from: z0.d$j$a */
        /* compiled from: InAppMessageWebViewClient.kt */
        static final class C10777a extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {

            /* renamed from: h */
            int f16484h;

            /* renamed from: i */
            final /* synthetic */ C10766d f16485i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10777a(C10766d dVar, C12074d<? super C10777a> dVar2) {
                super(2, dVar2);
                this.f16485i = dVar;
            }

            public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
                return new C10777a(this.f16485i, dVar);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C12150d.m26492c();
                if (this.f16484h == 0) {
                    C11910n.m25701b(obj);
                    this.f16485i.m22914d();
                    return C11921v.f18618a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
                return ((C10777a) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10776j(C10766d dVar, C12074d<? super C10776j> dVar2) {
            super(1, dVar2);
            this.f16483i = dVar;
        }

        public final C12074d<C11921v> create(C12074d<?> dVar) {
            return new C10776j(this.f16483i, dVar);
        }

        public final Object invoke(C12074d<? super C11921v> dVar) {
            return ((C10776j) create(dVar)).invokeSuspend(C11921v.f18618a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.f16482h;
            if (i == 0) {
                C11910n.m25701b(obj);
                C13988j2 c2 = C13933b1.m32212c();
                C10777a aVar = new C10777a(this.f16483i, (C12074d<? super C10777a>) null);
                this.f16482h = 1;
                if (C13970h.m32378g(c2, aVar, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C11910n.m25701b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C11921v.f18618a;
        }
    }

    public C10766d(Context context, C7358a aVar, C10642h hVar) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(aVar, "inAppMessage");
        this.f16466a = context;
        this.f16467b = aVar;
        this.f16468c = hVar;
        this.f16473h = new C4218b(context).getInAppMessageWebViewClientOnPageFinishedMaxWaitMs();
    }

    /* renamed from: b */
    private final void m22912b(WebView webView) {
        try {
            AssetManager assets = this.f16466a.getAssets();
            C12775o.m28638h(assets, "context.assets");
            webView.loadUrl(C12775o.m28647q("javascript:", C8233a.m16342d(assets, "braze-html-in-app-message-bridge.js")));
        } catch (Exception e) {
            C9783d.f14623G.mo44312a().mo44302B(false);
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C10768b.f16474g, 4, (Object) null);
        }
    }

    /* renamed from: c */
    private final boolean m22913c(String str) {
        if (this.f16468c == null) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, C10769c.f16475g, 6, (Object) null);
            return true;
        } else if (C13754v.m31532t(str)) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, C10770d.f16476g, 6, (Object) null);
            return true;
        } else {
            Uri parse = Uri.parse(str);
            Bundle a = f16465i.mo45669a(str);
            if (parse.getScheme() == null || !C12775o.m28634d(parse.getScheme(), "appboy")) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C10772f(parse), 7, (Object) null);
                this.f16468c.onOtherUrlAction(this.f16467b, str, a);
                return true;
            }
            String authority = parse.getAuthority();
            if (authority != null) {
                int hashCode = authority.hashCode();
                if (hashCode != -1801488983) {
                    if (hashCode != 3138974) {
                        if (hashCode == 94756344 && authority.equals("close")) {
                            this.f16468c.onCloseAction(this.f16467b, str, a);
                        }
                    } else if (authority.equals("feed")) {
                        this.f16468c.onNewsfeedAction(this.f16467b, str, a);
                    }
                } else if (authority.equals("customEvent")) {
                    this.f16468c.onCustomEventAction(this.f16467b, str, a);
                }
            } else {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C10771e(parse), 7, (Object) null);
            }
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m22914d() {
        C10643i iVar = this.f16469d;
        if (iVar != null && this.f16471f.compareAndSet(false, true)) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, C10773g.f16479g, 6, (Object) null);
            iVar.mo44301a();
        }
    }

    /* renamed from: e */
    public final void mo45664e(C10643i iVar) {
        if (iVar == null || !this.f16470e || !this.f16471f.compareAndSet(false, true)) {
            this.f16472g = C10606a.m22557b(C10606a.f16162b, Integer.valueOf(this.f16473h), (C12079g) null, new C10776j(this, (C12074d<? super C10776j>) null), 2, (Object) null);
        } else {
            iVar.mo44301a();
        }
        this.f16469d = iVar;
    }

    public void onPageFinished(WebView webView, String str) {
        C12775o.m28639i(webView, "view");
        C12775o.m28639i(str, "url");
        m22912b(webView);
        C10643i iVar = this.f16469d;
        if (iVar != null && this.f16471f.compareAndSet(false, true)) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, C10774h.f16480g, 6, (Object) null);
            iVar.mo44301a();
        }
        this.f16470e = true;
        C14054y1 y1Var = this.f16472g;
        if (y1Var != null) {
            C14054y1.C14055a.m32600a(y1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f16472g = null;
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        C12775o.m28639i(webView, "view");
        C12775o.m28639i(renderProcessGoneDetail, "detail");
        C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, C10775i.f16481g, 6, (Object) null);
        return true;
    }

    @RequiresApi(api = 21)
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        C12775o.m28639i(webView, "view");
        C12775o.m28639i(webResourceRequest, "request");
        String uri = webResourceRequest.getUrl().toString();
        C12775o.m28638h(uri, "request.url.toString()");
        return m22913c(uri);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C12775o.m28639i(webView, "view");
        C12775o.m28639i(str, "url");
        return m22913c(str);
    }
}
