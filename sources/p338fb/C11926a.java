package p338fb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.poulpeo.R;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* renamed from: fb.a */
/* compiled from: ChromeCustomTabs.kt */
public class C11926a {

    /* renamed from: g */
    public static final C11927a f18621g = new C11927a((DefaultConstructorMarker) null);

    /* renamed from: h */
    public static final int f18622h = 8;

    /* renamed from: b */
    private final Context f18623b;

    /* renamed from: c */
    private final String f18624c;

    /* renamed from: d */
    private CustomTabsSession f18625d;

    /* renamed from: e */
    private CustomTabsClient f18626e;

    /* renamed from: f */
    private CustomTabsServiceConnection f18627f;

    /* renamed from: fb.a$a */
    /* compiled from: ChromeCustomTabs.kt */
    public static final class C11927a {
        private C11927a() {
        }

        public /* synthetic */ C11927a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: fb.a$b */
    /* compiled from: ChromeCustomTabs.kt */
    public static final class C11928b extends CustomTabsServiceConnection {

        /* renamed from: b */
        final /* synthetic */ C11926a f18628b;

        /* renamed from: c */
        final /* synthetic */ Context f18629c;

        C11928b(C11926a aVar, Context context) {
            this.f18628b = aVar;
            this.f18629c = context;
        }

        public void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
            C12775o.m28639i(componentName, "pName");
            C12775o.m28639i(customTabsClient, "pClient");
            this.f18628b.mo49145N0(customTabsClient);
            customTabsClient.warmup(0);
            if (this.f18628b.mo49147b0() == null) {
                C11926a aVar = this.f18628b;
                aVar.mo49146R0(customTabsClient.newSession(aVar.mo49143J0()));
                CustomTabsSession b0 = this.f18628b.mo49147b0();
                if (b0 != null) {
                    b0.mayLaunchUrl(Uri.parse(this.f18628b.mo49149t0()), (Bundle) null, (List<Bundle>) null);
                }
                this.f18628b.mo49148l2(this.f18629c);
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            this.f18628b.mo49145N0((CustomTabsClient) null);
        }
    }

    public C11926a(Context context, String str) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(str, "url");
        this.f18623b = context;
        this.f18624c = str;
        m25732a(context);
    }

    /* renamed from: a */
    private final void m25732a(Context context) {
        if (this.f18626e == null) {
            C11928b bVar = new C11928b(this, context);
            this.f18627f = bVar;
            C12775o.m28636f(bVar);
            if (!CustomTabsClient.bindCustomTabsService(context, "com.android.chrome", bVar)) {
                this.f18627f = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Context mo49142E() {
        return this.f18623b;
    }

    /* renamed from: J0 */
    public CustomTabsCallback mo49143J0() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: N0 */
    public final void mo49145N0(CustomTabsClient customTabsClient) {
        this.f18626e = customTabsClient;
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public final void mo49146R0(CustomTabsSession customTabsSession) {
        this.f18625d = customTabsSession;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b0 */
    public final CustomTabsSession mo49147b0() {
        return this.f18625d;
    }

    /* renamed from: l2 */
    public final void mo49148l2(Context context) {
        C12775o.m28639i(context, "context");
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder(this.f18625d);
        mo49150v(builder);
        CustomTabsIntent build = builder.build();
        Intent intent = build.intent;
        intent.setPackage("com.android.chrome");
        String packageName = context.getPackageName();
        intent.putExtra("android.intent.extra.REFERRER", Uri.parse("android-app://" + packageName));
        intent.addFlags(67108864);
        build.launchUrl(context, Uri.parse(this.f18624c));
    }

    /* access modifiers changed from: protected */
    /* renamed from: t0 */
    public final String mo49149t0() {
        return this.f18624c;
    }

    /* renamed from: v */
    public void mo49150v(CustomTabsIntent.Builder builder) {
        C12775o.m28639i(builder, "builder");
        CustomTabColorSchemeParams.Builder builder2 = new CustomTabColorSchemeParams.Builder();
        builder2.setToolbarColor(ContextCompat.getColor(this.f18623b, R.color.background_theme));
        builder.setDefaultColorSchemeParams(builder2.build());
    }

    /* renamed from: M0 */
    public void mo49144M0() {
    }
}
