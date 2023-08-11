package p284y2;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.rmn.api.p322v2.main.debug.AbstractDebugRequestMapper;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C12770k0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: y2.d */
/* compiled from: WebViewDumpHelper.kt */
public final class C10661d {

    /* renamed from: c */
    public static final C10662a f16236c = new C10662a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Set<C10663b> f16237a = new LinkedHashSet();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map<String, String> f16238b = new LinkedHashMap();

    /* renamed from: y2.d$a */
    /* compiled from: WebViewDumpHelper.kt */
    public static final class C10662a {
        private C10662a() {
        }

        public /* synthetic */ C10662a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final String m22656b(C10663b bVar, String str) {
            String A = C13754v.m31521A(C13754v.m31521A(C13754v.m31521A(str, "\\u003C", "<", false, 4, (Object) null), "\\n", "", false, 4, (Object) null), "\\\"", AbstractDebugRequestMapper.QUOTE, false, 4, (Object) null);
            C12770k0 k0Var = C12770k0.f20423a;
            String substring = A.substring(1, A.length() - 1);
            C12775o.m28638h(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String format = String.format("<html id=\"%s\" data-rect=\"%d,%d,%d,%d\">%s</html>", Arrays.copyOf(new Object[]{bVar.mo45606b(), Integer.valueOf(bVar.mo45607c()), Integer.valueOf(bVar.mo45608d()), Integer.valueOf(bVar.mo45609e()), Integer.valueOf(bVar.mo45605a()), substring}, 6));
            C12775o.m28638h(format, "java.lang.String.format(format, *args)");
            return format;
        }
    }

    /* renamed from: y2.d$b */
    /* compiled from: WebViewDumpHelper.kt */
    private static final class C10663b {

        /* renamed from: f */
        private static final int[] f16239f = new int[2];

        /* renamed from: g */
        public static final C10664a f16240g = new C10664a((DefaultConstructorMarker) null);

        /* renamed from: a */
        private final String f16241a;

        /* renamed from: b */
        private final int f16242b;

        /* renamed from: c */
        private final int f16243c;

        /* renamed from: d */
        private final int f16244d;

        /* renamed from: e */
        private final int f16245e;

        /* renamed from: y2.d$b$a */
        /* compiled from: WebViewDumpHelper.kt */
        public static final class C10664a {
            private C10664a() {
            }

            public /* synthetic */ C10664a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C10663b(WebView webView) {
            C12775o.m28639i(webView, "webView");
            C12770k0 k0Var = C12770k0.f20423a;
            String format = String.format("%s{%s}", Arrays.copyOf(new Object[]{webView.getClass().getName(), Integer.toHexString(webView.hashCode())}, 2));
            C12775o.m28638h(format, "java.lang.String.format(format, *args)");
            this.f16241a = format;
            int[] iArr = f16239f;
            webView.getLocationOnScreen(iArr);
            this.f16242b = iArr[0];
            this.f16243c = iArr[1];
            this.f16244d = webView.getWidth();
            this.f16245e = webView.getHeight();
        }

        /* renamed from: a */
        public final int mo45605a() {
            return this.f16245e;
        }

        /* renamed from: b */
        public final String mo45606b() {
            return this.f16241a;
        }

        /* renamed from: c */
        public final int mo45607c() {
            return this.f16242b;
        }

        /* renamed from: d */
        public final int mo45608d() {
            return this.f16243c;
        }

        /* renamed from: e */
        public final int mo45609e() {
            return this.f16244d;
        }
    }

    /* renamed from: y2.d$c */
    /* compiled from: WebViewDumpHelper.kt */
    static final class C10665c<T> implements ValueCallback {

        /* renamed from: a */
        final /* synthetic */ C10661d f16246a;

        /* renamed from: b */
        final /* synthetic */ C10663b f16247b;

        C10665c(C10661d dVar, C10663b bVar) {
            this.f16246a = dVar;
            this.f16247b = bVar;
        }

        /* renamed from: a */
        public final void onReceiveValue(String str) {
            Map a = this.f16246a.f16238b;
            String b = this.f16247b.mo45606b();
            C12775o.m28638h(str, "html");
            a.put(b, str);
        }
    }

    /* renamed from: b */
    public final void mo45603b(PrintWriter printWriter) {
        C12775o.m28639i(printWriter, "writer");
        try {
            for (C10663b next : this.f16237a) {
                String str = this.f16238b.get(next.mo45606b());
                if (str != null) {
                    printWriter.print("WebView HTML for ");
                    printWriter.print(next);
                    printWriter.println(":");
                    printWriter.println(f16236c.m22656b(next, str));
                }
            }
        } catch (Exception unused) {
        }
        this.f16237a.clear();
        this.f16238b.clear();
    }

    /* renamed from: c */
    public final void mo45604c(WebView webView) {
        C12775o.m28639i(webView, "view");
        C10663b bVar = new C10663b(webView);
        this.f16237a.add(bVar);
        Resources resources = webView.getResources();
        C12775o.m28638h(resources, "view.resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        C12770k0 k0Var = C12770k0.f20423a;
        String format = String.format("(function() {  try {    const leftOf = %d;    const topOf = %d;    const density = %f;    const elements = Array.from(document.querySelectorAll('body, body *'));    for (const el of elements) {      const rect = el.getBoundingClientRect();      const left = Math.round(leftOf + rect.left * density);      const top = Math.round(topOf + rect.top * density);      const width = Math.round(rect.width * density);      const height = Math.round(rect.height * density);      el.setAttribute('data-rect', `${left},${top},${width},${height}`);      const style = window.getComputedStyle(el);      const hidden = style.display === 'none' || style.visibility !== 'visible' || el.getAttribute('hidden') === 'true';      const disabled = el.disabled || el.getAttribute('aria-disabled') === 'true';      const focused = el === document.activeElement;      if (hidden || disabled || focused) {        el.setAttribute('data-flag', `${hidden ? 'H' : ''}${disabled ? 'D' : ''}${focused ? 'F' : ''}`);      } else {        el.removeAttribute('data-flag');      }    }    document.activeElement.setAttribute('focused', 'true');    const doc = document.cloneNode(true);    for (const el of Array.from(doc.querySelectorAll('script, link'))) {      el.remove();    }    for (const el of Array.from(doc.querySelectorAll('*'))) {      el.removeAttribute('class');    }    return doc.getElementsByTagName('body')[0].outerHTML.trim();  } catch (e) {    return 'Failed: ' + e;  }})();", Arrays.copyOf(new Object[]{Integer.valueOf(bVar.mo45607c()), Integer.valueOf(bVar.mo45608d()), Float.valueOf(displayMetrics.scaledDensity)}, 3));
        C12775o.m28638h(format, "java.lang.String.format(format, *args)");
        webView.evaluateJavascript(format, new C10665c(this, bVar));
    }
}
