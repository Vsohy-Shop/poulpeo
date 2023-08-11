package p422rd;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.api.p322v2.main.oauth.HttpMethod;
import com.rmn.p324ui.views.webview_reload.WebViewReload;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p328dd.C11804a;
import p328dd.C11806b;
import p368jd.C12618d;

@StabilityInferred(parameters = 0)
/* renamed from: rd.a */
/* compiled from: BaseWebActivity.kt */
public abstract class C13285a extends C12618d implements C11806b {

    /* renamed from: u */
    public static final C13286a f21172u = new C13286a((DefaultConstructorMarker) null);

    /* renamed from: v */
    public static final int f21173v = 8;

    /* renamed from: m */
    private C11804a f21174m;

    /* renamed from: n */
    private WebViewReload f21175n;

    /* renamed from: o */
    private String f21176o;

    /* renamed from: p */
    private String f21177p;

    /* renamed from: q */
    private HttpMethod f21178q;

    /* renamed from: r */
    private boolean f21179r;

    /* renamed from: s */
    private String f21180s;

    /* renamed from: t */
    public Map<Integer, View> f21181t = new LinkedHashMap();

    /* renamed from: rd.a$a */
    /* compiled from: BaseWebActivity.kt */
    public static final class C13286a {
        private C13286a() {
        }

        public /* synthetic */ C13286a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A2 */
    public final String mo52917A2() {
        return this.f21180s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B2 */
    public final HttpMethod mo52918B2() {
        return this.f21178q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C2 */
    public final String mo52919C2() {
        return this.f21177p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D2 */
    public final String mo52920D2() {
        return this.f21176o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E2 */
    public final WebViewReload mo52921E2() {
        WebViewReload webViewReload = this.f21175n;
        if (webViewReload != null) {
            return webViewReload;
        }
        C12775o.m28656z("webViewReload");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F2 */
    public abstract C11804a mo46519F2();

    public void onBackPressed() {
        if (!this.f21179r || !mo52923z2().mo48950n2()) {
            super.onBackPressed();
        } else {
            mo52923z2().mo48952p2();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(mo46521y2());
        this.f21179r = getIntent().getBooleanExtra("internal_back_action", false);
        View findViewById = findViewById(R.id.toolBar);
        C12775o.m28638h(findViewById, "findViewById(R.id.toolBar)");
        setSupportActionBar((Toolbar) findViewById);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        setTitle((CharSequence) getIntent().getStringExtra("title"));
        this.f21176o = getIntent().getStringExtra("url");
        this.f21177p = getIntent().getStringExtra("parameters");
        this.f21180s = getIntent().getStringExtra("html_data");
        int intExtra = getIntent().getIntExtra("http_method", -1);
        if (intExtra >= 0) {
            this.f21178q = HttpMethod.values()[intExtra];
        }
        View findViewById2 = findViewById(R.id.webview_reload);
        C12775o.m28638h(findViewById2, "findViewById(R.id.webview_reload)");
        this.f21175n = (WebViewReload) findViewById2;
        this.f21174m = mo46519F2();
        String[] stringArrayExtra = getIntent().getStringArrayExtra("mandatory_url_parts");
        if (stringArrayExtra != null) {
            mo52923z2().mo48958w2(stringArrayExtra);
        }
        String[] stringArrayExtra2 = getIntent().getStringArrayExtra("forbidden_url_parts");
        if (stringArrayExtra2 != null) {
            mo52923z2().mo48957v2(stringArrayExtra2);
        }
        mo52923z2().mo48953q2();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        mo52923z2().mo48954r2();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C12775o.m28639i(menuItem, "item");
        finish();
        return false;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        mo52923z2().mo48955s2();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        mo52923z2().mo48956t2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public abstract int mo46521y2();

    /* access modifiers changed from: protected */
    /* renamed from: z2 */
    public final C11804a mo52923z2() {
        C11804a aVar = this.f21174m;
        if (aVar != null) {
            return aVar;
        }
        C12775o.m28656z("controller");
        return null;
    }
}
