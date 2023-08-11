package p146l0;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import com.appboy.Constants;
import com.appboy.enums.Channel;
import com.braze.configuration.C4218b;
import com.braze.p055ui.BrazeWebViewActivity;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p019a1.C2113b;
import p126j0.C8233a;
import p126j0.C8266c;
import p136k0.C8429a;
import p156m0.C8781a;
import p270x.C10347i;
import p404of.C13074a;

/* renamed from: l0.c */
/* compiled from: UriAction.kt */
public class C8622c implements C8619a {

    /* renamed from: a */
    private final Bundle f12324a;

    /* renamed from: b */
    private final Channel f12325b;

    /* renamed from: c */
    private Uri f12326c;

    /* renamed from: d */
    private boolean f12327d;

    /* renamed from: l0.c$a */
    /* compiled from: UriAction.kt */
    static final class C8623a extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ C8622c f12328g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8623a(C8622c cVar) {
            super(0);
            this.f12328g = cVar;
        }

        public final String invoke() {
            return C12775o.m28647q("Not executing local Uri: ", this.f12328g.mo42707f());
        }
    }

    /* renamed from: l0.c$b */
    /* compiled from: UriAction.kt */
    static final class C8624b extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ C8622c f12329g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8624b(C8622c cVar) {
            super(0);
            this.f12329g = cVar;
        }

        public final String invoke() {
            return "Executing BrazeActions uri:\n'" + this.f12329g.mo42707f() + '\'';
        }
    }

    /* renamed from: l0.c$c */
    /* compiled from: UriAction.kt */
    static final class C8625c extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ C8622c f12330g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8625c(C8622c cVar) {
            super(0);
            this.f12330g = cVar;
        }

        public final String invoke() {
            return "Executing Uri action from channel " + this.f12330g.mo42704c() + ": " + this.f12330g.mo42707f() + ". UseWebView: " + this.f12330g.mo42708g() + ". Extras: " + this.f12330g.mo42705d();
        }
    }

    /* renamed from: l0.c$d */
    /* compiled from: UriAction.kt */
    static final class C8626d extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ ResolveInfo f12331g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8626d(ResolveInfo resolveInfo) {
            super(0);
            this.f12331g = resolveInfo;
        }

        public final String invoke() {
            return "Setting deep link intent package to " + this.f12331g.activityInfo.packageName + '.';
        }
    }

    /* renamed from: l0.c$e */
    /* compiled from: UriAction.kt */
    static final class C8627e extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C8627e f12332g = new C8627e();

        C8627e() {
            super(0);
        }

        public final String invoke() {
            return "Adding main activity intent to back stack while opening uri from push";
        }
    }

    /* renamed from: l0.c$f */
    /* compiled from: UriAction.kt */
    static final class C8628f extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f12333g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8628f(String str) {
            super(0);
            this.f12333g = str;
        }

        public final String invoke() {
            return C12775o.m28647q("Adding custom back stack activity while opening uri from push: ", this.f12333g);
        }
    }

    /* renamed from: l0.c$g */
    /* compiled from: UriAction.kt */
    static final class C8629g extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f12334g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8629g(String str) {
            super(0);
            this.f12334g = str;
        }

        public final String invoke() {
            return C12775o.m28647q("Not adding unregistered activity to the back stack while opening uri from push: ", this.f12334g);
        }
    }

    /* renamed from: l0.c$h */
    /* compiled from: UriAction.kt */
    static final class C8630h extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C8630h f12335g = new C8630h();

        C8630h() {
            super(0);
        }

        public final String invoke() {
            return "Not adding back stack activity while opening uri from push due to disabled configuration setting.";
        }
    }

    /* renamed from: l0.c$i */
    /* compiled from: UriAction.kt */
    static final class C8631i extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f12336g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8631i(String str) {
            super(0);
            this.f12336g = str;
        }

        public final String invoke() {
            return C12775o.m28647q("Launching custom WebView Activity with class name: ", this.f12336g);
        }
    }

    /* renamed from: l0.c$j */
    /* compiled from: UriAction.kt */
    static final class C8632j extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Uri f12337g;

        /* renamed from: h */
        final /* synthetic */ Bundle f12338h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8632j(Uri uri, Bundle bundle) {
            super(0);
            this.f12337g = uri;
            this.f12338h = bundle;
        }

        public final String invoke() {
            return "Failed to handle uri " + this.f12337g + " with extras: " + this.f12338h;
        }
    }

    /* renamed from: l0.c$k */
    /* compiled from: UriAction.kt */
    static final class C8633k extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Uri f12339g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8633k(Uri uri) {
            super(0);
            this.f12339g = uri;
        }

        public final String invoke() {
            return C12775o.m28647q("Could not find appropriate activity to open for deep link ", this.f12339g);
        }
    }

    /* renamed from: l0.c$l */
    /* compiled from: UriAction.kt */
    static final class C8634l extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C8634l f12340g = new C8634l();

        C8634l() {
            super(0);
        }

        public final String invoke() {
            return "BrazeWebViewActivity not opened successfully.";
        }
    }

    /* renamed from: l0.c$m */
    /* compiled from: UriAction.kt */
    static final class C8635m extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C8635m f12341g = new C8635m();

        C8635m() {
            super(0);
        }

        public final String invoke() {
            return "Braze WebView Activity not opened successfully.";
        }
    }

    public C8622c(Uri uri, Bundle bundle, boolean z, Channel channel) {
        C12775o.m28639i(uri, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        C12775o.m28639i(channel, "channel");
        this.f12326c = uri;
        this.f12324a = bundle;
        this.f12327d = z;
        this.f12325b = channel;
    }

    /* renamed from: a */
    public void mo42702a(Context context) {
        C12775o.m28639i(context, "context");
        if (C8233a.m16343e(this.f12326c)) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C8623a(this), 7, (Object) null);
            return;
        }
        C8781a aVar = C8781a.f12718a;
        if (aVar.mo42940d(this.f12326c)) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C8624b(this), 6, (Object) null);
            aVar.mo42937a(context, this.f12326c, mo42704c());
            return;
        }
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C8625c(this), 7, (Object) null);
        if (!this.f12327d || !C12686e0.m28214S(C8233a.f11597b, this.f12326c.getScheme())) {
            if (mo42704c() == Channel.PUSH) {
                mo42711j(context, this.f12326c, this.f12324a);
            } else {
                mo42710i(context, this.f12326c, this.f12324a);
            }
        } else if (mo42704c() == Channel.PUSH) {
            mo42713l(context, this.f12326c, this.f12324a);
        } else {
            mo42712k(context, this.f12326c, this.f12324a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Intent mo42703b(Context context, Uri uri, Bundle bundle) {
        List<ResolveInfo> list;
        C12775o.m28639i(context, "context");
        C12775o.m28639i(uri, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            list = context.getPackageManager().queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0));
        } else {
            list = context.getPackageManager().queryIntentActivities(intent, 0);
        }
        C12775o.m28638h(list, "if (Build.VERSION.SDK_IN…ties(intent, 0)\n        }");
        if (list.size() > 1) {
            Iterator<ResolveInfo> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ResolveInfo next = it.next();
                if (C12775o.m28634d(next.activityInfo.packageName, context.getPackageName())) {
                    C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C8626d(next), 7, (Object) null);
                    intent.setPackage(next.activityInfo.packageName);
                    break;
                }
            }
        }
        return intent;
    }

    /* renamed from: c */
    public Channel mo42704c() {
        return this.f12325b;
    }

    /* renamed from: d */
    public final Bundle mo42705d() {
        return this.f12324a;
    }

    @VisibleForTesting
    /* renamed from: e */
    public final Intent[] mo42706e(Context context, Bundle bundle, Intent intent, C4218b bVar) {
        boolean z;
        Context context2 = context;
        Bundle bundle2 = bundle;
        Intent intent2 = intent;
        C12775o.m28639i(context2, "context");
        C12775o.m28639i(intent2, "targetIntent");
        C12775o.m28639i(bVar, "configurationProvider");
        Intent intent3 = null;
        if (bVar.isPushDeepLinkBackStackActivityEnabled()) {
            String pushDeepLinkBackStackActivityClassName = bVar.getPushDeepLinkBackStackActivityClassName();
            if (pushDeepLinkBackStackActivityClassName == null || C13754v.m31532t(pushDeepLinkBackStackActivityClassName)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, C8627e.f12332g, 6, (Object) null);
                intent3 = C2113b.m1459a(context, bundle);
            } else if (C2113b.m1461c(context2, pushDeepLinkBackStackActivityClassName)) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, new C8628f(pushDeepLinkBackStackActivityClassName), 6, (Object) null);
                if (bundle2 != null) {
                    intent3 = new Intent().setClassName(context2, pushDeepLinkBackStackActivityClassName).setFlags(C8429a.f12015a.mo42456a().mo42451a(C10347i.C10348a.URI_ACTION_BACK_STACK_GET_ROOT_INTENT)).putExtras(bundle2);
                }
            } else {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, new C8629g(pushDeepLinkBackStackActivityClassName), 6, (Object) null);
            }
        } else {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, C8630h.f12335g, 6, (Object) null);
        }
        if (intent3 == null) {
            intent2.setFlags(C8429a.f12015a.mo42456a().mo42451a(C10347i.C10348a.URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT));
            return new Intent[]{intent2};
        }
        return new Intent[]{intent3, intent2};
    }

    /* renamed from: f */
    public final Uri mo42707f() {
        return this.f12326c;
    }

    /* renamed from: g */
    public final boolean mo42708g() {
        return this.f12327d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final Intent mo42709h(Context context, Uri uri, Bundle bundle) {
        boolean z;
        Intent intent;
        C12775o.m28639i(context, "context");
        C12775o.m28639i(uri, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        String customHtmlWebViewActivityClassName = new C4218b(context).getCustomHtmlWebViewActivityClassName();
        if (customHtmlWebViewActivityClassName == null || C13754v.m31532t(customHtmlWebViewActivityClassName)) {
            z = true;
        } else {
            z = false;
        }
        if (z || !C2113b.m1461c(context, customHtmlWebViewActivityClassName)) {
            intent = new Intent(context, BrazeWebViewActivity.class);
        } else {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C8631i(customHtmlWebViewActivityClassName), 7, (Object) null);
            intent = new Intent().setClassName(context, customHtmlWebViewActivityClassName);
            C12775o.m28638h(intent, "val customWebViewActivit…ivityClassName)\n        }");
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.putExtra("url", uri.toString());
        return intent;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo42710i(Context context, Uri uri, Bundle bundle) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(uri, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        Intent b = mo42703b(context, uri, bundle);
        b.setFlags(C8429a.f12015a.mo42456a().mo42451a(C10347i.C10348a.URI_ACTION_OPEN_WITH_ACTION_VIEW));
        try {
            context.startActivity(b);
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, new C8632j(uri, bundle), 4, (Object) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo42711j(Context context, Uri uri, Bundle bundle) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(uri, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        try {
            context.startActivities(mo42706e(context, bundle, mo42703b(context, uri, bundle), new C4218b(context)));
        } catch (ActivityNotFoundException e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, e, false, new C8633k(uri), 4, (Object) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo42712k(Context context, Uri uri, Bundle bundle) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(uri, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        Intent h = mo42709h(context, uri, bundle);
        h.setFlags(C8429a.f12015a.mo42456a().mo42451a(C10347i.C10348a.URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY));
        try {
            context.startActivity(h);
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C8634l.f12340g, 4, (Object) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo42713l(Context context, Uri uri, Bundle bundle) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(uri, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        try {
            context.startActivities(mo42706e(context, bundle, mo42709h(context, uri, bundle), new C4218b(context)));
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C8635m.f12341g, 4, (Object) null);
        }
    }
}
