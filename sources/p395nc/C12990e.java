package p395nc;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.fragment.app.DialogFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12771l;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;
import p395nc.C12994g;

/* renamed from: nc.e */
/* compiled from: SignInWebViewDialogFragment.kt */
public final class C12990e extends DialogFragment {

    /* renamed from: e */
    public static final C12991a f20790e = new C12991a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private C12982a f20791b;

    /* renamed from: c */
    private Function1<? super C12994g, C11921v> f20792c;

    /* renamed from: d */
    public Map<Integer, View> f20793d = new LinkedHashMap();

    /* renamed from: nc.e$a */
    /* compiled from: SignInWebViewDialogFragment.kt */
    public static final class C12991a {
        private C12991a() {
        }

        public /* synthetic */ C12991a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C12990e mo50909a(C12982a aVar) {
            C12775o.m28639i(aVar, "authenticationAttempt");
            C12990e eVar = new C12990e();
            Bundle bundle = new Bundle();
            bundle.putParcelable("authenticationAttempt", aVar);
            eVar.setArguments(bundle);
            return eVar;
        }
    }

    /* renamed from: nc.e$b */
    /* compiled from: SignInWebViewDialogFragment.kt */
    /* synthetic */ class C12992b extends C12771l implements Function1<C12994g, C11921v> {
        C12992b(Object obj) {
            super(1, obj, C12990e.class, "onCallback", "onCallback(Lcom/rmn/signinwithapple/SignInWithAppleResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo50910b(C12994g gVar) {
            C12775o.m28639i(gVar, "p0");
            ((C12990e) this.receiver).m29358l2(gVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo50910b((C12994g) obj);
            return C11921v.f18618a;
        }
    }

    /* renamed from: R0 */
    private final WebView m29357R0() {
        View view = getView();
        if (view instanceof WebView) {
            return (WebView) view;
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public final void m29358l2(C12994g gVar) {
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
        Function1<? super C12994g, C11921v> function1 = this.f20792c;
        if (function1 != null) {
            function1.invoke(gVar);
        }
    }

    /* renamed from: N0 */
    public final void mo50908N0(Function1<? super C12994g, C11921v> function1) {
        C12775o.m28639i(function1, "callback");
        this.f20792c = function1;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C12775o.m28639i(dialogInterface, "dialog");
        super.onCancel(dialogInterface);
        m29358l2(C12994g.C12995a.f20797a);
    }

    public void onCreate(Bundle bundle) {
        C12982a aVar;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            aVar = (C12982a) arguments.getParcelable("authenticationAttempt");
        } else {
            aVar = null;
        }
        C12775o.m28636f(aVar);
        this.f20791b = aVar;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        C12775o.m28639i(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        WebView webView = new WebView(requireContext());
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        C12982a aVar = this.f20791b;
        C12982a aVar2 = null;
        if (aVar == null) {
            C12775o.m28656z("authenticationAttempt");
            aVar = null;
        }
        webView.setWebViewClient(new C12988d(aVar, new C12992b(this)));
        if (bundle == null || (bundle2 = bundle.getBundle("webView")) == null) {
            bundle2 = null;
        } else {
            webView.restoreState(bundle2);
        }
        if (bundle2 == null) {
            C12982a aVar3 = this.f20791b;
            if (aVar3 == null) {
                C12775o.m28656z("authenticationAttempt");
            } else {
                aVar2 = aVar3;
            }
            webView.loadUrl(aVar2.mo50888a());
        }
        return webView;
    }

    public void onSaveInstanceState(Bundle bundle) {
        C12775o.m28639i(bundle, "outState");
        super.onSaveInstanceState(bundle);
        Bundle bundle2 = new Bundle();
        WebView R0 = m29357R0();
        if (R0 != null) {
            R0.saveState(bundle2);
        }
        C11921v vVar = C11921v.f18618a;
        bundle.putBundle("webView", bundle2);
    }

    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
    }
}
