package p198q2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p021a3.C2140c;
import p021a3.C2190s;
import p251v2.C9925a;

/* renamed from: q2.w */
/* compiled from: NativeProtocol.kt */
public final class C9196w {

    /* renamed from: a */
    private static final String f13509a;

    /* renamed from: b */
    private static final List<C9203f> f13510b;

    /* renamed from: c */
    private static final List<C9203f> f13511c;

    /* renamed from: d */
    private static final Map<String, List<C9203f>> f13512d;

    /* renamed from: e */
    private static final AtomicBoolean f13513e = new AtomicBoolean(false);

    /* renamed from: f */
    private static final Integer[] f13514f = {20170417, 20160327, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140204, 20131107, 20130618, 20130502, 20121101};

    /* renamed from: g */
    public static final C9196w f13515g;

    /* renamed from: q2.w$a */
    /* compiled from: NativeProtocol.kt */
    private static final class C9197a extends C9203f {
        /* renamed from: c */
        public /* bridge */ /* synthetic */ String mo43486c() {
            return (String) mo43488g();
        }

        /* renamed from: d */
        public String mo43487d() {
            return "com.facebook.arstudio.player";
        }

        /* renamed from: g */
        public Void mo43488g() {
            return null;
        }
    }

    /* renamed from: q2.w$b */
    /* compiled from: NativeProtocol.kt */
    private static final class C9198b extends C9203f {

        /* renamed from: b */
        public static final C9199a f13516b = new C9199a((DefaultConstructorMarker) null);

        /* renamed from: q2.w$b$a */
        /* compiled from: NativeProtocol.kt */
        public static final class C9199a {
            private C9199a() {
            }

            public /* synthetic */ C9199a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: c */
        public String mo43486c() {
            return "com.facebook.lite.platform.LoginGDPDialogActivity";
        }

        /* renamed from: d */
        public String mo43487d() {
            return "com.facebook.lite";
        }
    }

    /* renamed from: q2.w$c */
    /* compiled from: NativeProtocol.kt */
    private static final class C9200c extends C9203f {
        /* renamed from: c */
        public String mo43486c() {
            return "com.instagram.platform.AppAuthorizeActivity";
        }

        /* renamed from: d */
        public String mo43487d() {
            return "com.instagram.android";
        }

        /* renamed from: e */
        public String mo43489e() {
            return "token,signed_request,graph_domain,granted_scopes";
        }
    }

    /* renamed from: q2.w$d */
    /* compiled from: NativeProtocol.kt */
    private static final class C9201d extends C9203f {
        /* renamed from: g */
        private final boolean m18878g() {
            if (FacebookSdk.getApplicationContext().getApplicationInfo().targetSdkVersion >= 30) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public String mo43486c() {
            return "com.facebook.katana.ProxyAuth";
        }

        /* renamed from: d */
        public String mo43487d() {
            return "com.facebook.katana";
        }

        /* renamed from: f */
        public void mo43490f() {
            if (m18878g()) {
                Log.w(C9196w.m18847d(C9196w.f13515g), "Apps that target Android API 30+ (Android 11+) cannot call Facebook native apps unless the package visibility needs are declared. Please follow https://developers.facebook.com/docs/android/troubleshooting/#faq_267321845055988 to make the declaration.");
            }
        }
    }

    /* renamed from: q2.w$e */
    /* compiled from: NativeProtocol.kt */
    private static final class C9202e extends C9203f {
        /* renamed from: c */
        public /* bridge */ /* synthetic */ String mo43486c() {
            return (String) mo43491g();
        }

        /* renamed from: d */
        public String mo43487d() {
            return "com.facebook.orca";
        }

        /* renamed from: g */
        public Void mo43491g() {
            return null;
        }
    }

    /* renamed from: q2.w$g */
    /* compiled from: NativeProtocol.kt */
    public static final class C9204g {

        /* renamed from: c */
        public static final C9205a f13518c = new C9205a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C9203f f13519a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f13520b;

        /* renamed from: q2.w$g$a */
        /* compiled from: NativeProtocol.kt */
        public static final class C9205a {
            private C9205a() {
            }

            public /* synthetic */ C9205a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C9204g mo43495a(C9203f fVar, int i) {
                C9204g gVar = new C9204g((DefaultConstructorMarker) null);
                gVar.f13519a = fVar;
                gVar.f13520b = i;
                return gVar;
            }

            /* renamed from: b */
            public final C9204g mo43496b() {
                C9204g gVar = new C9204g((DefaultConstructorMarker) null);
                gVar.f13520b = -1;
                return gVar;
            }
        }

        private C9204g() {
        }

        public /* synthetic */ C9204g(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public final int mo43494c() {
            return this.f13520b;
        }
    }

    /* renamed from: q2.w$h */
    /* compiled from: NativeProtocol.kt */
    private static final class C9206h extends C9203f {
        /* renamed from: c */
        public String mo43486c() {
            return "com.facebook.katana.ProxyAuth";
        }

        /* renamed from: d */
        public String mo43487d() {
            return "com.facebook.wakizashi";
        }
    }

    /* renamed from: q2.w$i */
    /* compiled from: NativeProtocol.kt */
    static final class C9207i implements Runnable {

        /* renamed from: b */
        public static final C9207i f13521b = new C9207i();

        C9207i() {
        }

        public final void run() {
            if (!C9925a.m20734d(this)) {
                try {
                    if (!C9925a.m20734d(this)) {
                        try {
                            for (C9203f a : C9196w.m18845b(C9196w.f13515g)) {
                                a.mo43492a(true);
                            }
                            C9196w.m18846c(C9196w.f13515g).set(false);
                        } catch (Throwable th) {
                            C9925a.m20732b(th, this);
                        }
                    }
                } catch (Throwable th2) {
                    C9925a.m20732b(th2, this);
                }
            }
        }
    }

    static {
        C9196w wVar = new C9196w();
        f13515g = wVar;
        String name = C9196w.class.getName();
        C12775o.m28638h(name, "NativeProtocol::class.java.name");
        f13509a = name;
        f13510b = wVar.m18850g();
        f13511c = wVar.m18849f();
        f13512d = wVar.m18848e();
    }

    private C9196w() {
    }

    /* renamed from: A */
    public static final Intent m18842A(Context context, Intent intent, C9203f fVar) {
        ResolveInfo resolveActivity;
        Class<C9196w> cls = C9196w.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            C12775o.m28639i(context, "context");
            if (intent == null || (resolveActivity = context.getPackageManager().resolveActivity(intent, 0)) == null) {
                return null;
            }
            String str = resolveActivity.activityInfo.packageName;
            C12775o.m28638h(str, "resolveInfo.activityInfo.packageName");
            if (!C9163j.m18750a(context, str)) {
                return null;
            }
            return intent;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: B */
    public static final Intent m18843B(Context context, Intent intent, C9203f fVar) {
        ResolveInfo resolveService;
        Class<C9196w> cls = C9196w.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            C12775o.m28639i(context, "context");
            if (intent == null || (resolveService = context.getPackageManager().resolveService(intent, 0)) == null) {
                return null;
            }
            String str = resolveService.serviceInfo.packageName;
            C12775o.m28638h(str, "resolveInfo.serviceInfo.packageName");
            if (!C9163j.m18750a(context, str)) {
                return null;
            }
            return intent;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ TreeSet m18844a(C9196w wVar, C9203f fVar) {
        Class<C9196w> cls = C9196w.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return wVar.m18860q(fVar);
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ List m18845b(C9196w wVar) {
        Class<C9196w> cls = C9196w.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return f13510b;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ AtomicBoolean m18846c(C9196w wVar) {
        Class<C9196w> cls = C9196w.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return f13513e;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ String m18847d(C9196w wVar) {
        Class<C9196w> cls = C9196w.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return f13509a;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: e */
    private final Map<String, List<C9203f>> m18848e() {
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C9202e());
            List<C9203f> list = f13510b;
            hashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.FEED_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList);
            hashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList);
            hashMap.put("com.facebook.platform.action.request.CAMERA_EFFECT", f13511c);
            hashMap.put("com.facebook.platform.action.request.SHARE_STORY", list);
            return hashMap;
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }

    /* renamed from: f */
    private final List<C9203f> m18849f() {
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            ArrayList e = C12726w.m28518e(new C9197a());
            e.addAll(m18850g());
            return e;
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }

    /* renamed from: g */
    private final List<C9203f> m18850g() {
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            return C12726w.m28518e(new C9201d(), new C9206h());
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }

    /* renamed from: h */
    private final Uri m18851h(C9203f fVar) {
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            Uri parse = Uri.parse("content://" + fVar.mo43487d() + ".provider.PlatformProvider/versions");
            C12775o.m28638h(parse, "Uri.parse(CONTENT_SCHEME…ATFORM_PROVIDER_VERSIONS)");
            return parse;
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }

    /* renamed from: i */
    public static final int m18852i(TreeSet<Integer> treeSet, int i, int[] iArr) {
        Class<C9196w> cls = C9196w.class;
        if (C9925a.m20734d(cls)) {
            return 0;
        }
        try {
            C12775o.m28639i(iArr, "versionSpec");
            if (treeSet == null) {
                return -1;
            }
            int length = iArr.length - 1;
            Iterator<Integer> descendingIterator = treeSet.descendingIterator();
            int i2 = -1;
            while (descendingIterator.hasNext()) {
                Integer next = descendingIterator.next();
                C12775o.m28638h(next, "fbAppVersion");
                i2 = Math.max(i2, next.intValue());
                while (length >= 0 && iArr[length] > next.intValue()) {
                    length--;
                }
                if (length < 0) {
                    return -1;
                }
                if (iArr[length] == next.intValue()) {
                    if (length % 2 == 0) {
                        return Math.min(i2, i);
                    }
                    return -1;
                }
            }
            return -1;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return 0;
        }
    }

    /* renamed from: j */
    public static final Bundle m18853j(FacebookException facebookException) {
        Class<C9196w> cls = C9196w.class;
        if (C9925a.m20734d(cls) || facebookException == null) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("error_description", facebookException.toString());
            if (facebookException instanceof FacebookOperationCanceledException) {
                bundle.putString("error_type", "UserCanceled");
            }
            return bundle;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: k */
    public static final Intent m18854k(Context context, String str, Collection<String> collection, String str2, boolean z, boolean z2, C2140c cVar, String str3, String str4, String str5, boolean z3, boolean z4, boolean z5) {
        Context context2 = context;
        Class<C9196w> cls = C9196w.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            C12775o.m28639i(context2, "context");
            C12775o.m28639i(str, "applicationId");
            C12775o.m28639i(collection, "permissions");
            C12775o.m28639i(str2, "e2e");
            C12775o.m28639i(cVar, "defaultAudience");
            C12775o.m28639i(str3, "clientState");
            C12775o.m28639i(str4, "authType");
            C9198b bVar = new C9198b();
            return m18842A(context2, f13515g.m18856m(bVar, str, collection, str2, z2, cVar, str3, str4, false, str5, z3, C2190s.FACEBOOK, z4, z5), bVar);
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: l */
    public static final Intent m18855l(Context context, String str, Collection<String> collection, String str2, boolean z, boolean z2, C2140c cVar, String str3, String str4, String str5, boolean z3, boolean z4, boolean z5) {
        Context context2 = context;
        Class<C9196w> cls = C9196w.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            C12775o.m28639i(context2, "context");
            C12775o.m28639i(str, "applicationId");
            C12775o.m28639i(collection, "permissions");
            C12775o.m28639i(str2, "e2e");
            C12775o.m28639i(cVar, "defaultAudience");
            C12775o.m28639i(str3, "clientState");
            C12775o.m28639i(str4, "authType");
            C9200c cVar2 = new C9200c();
            return m18842A(context2, f13515g.m18856m(cVar2, str, collection, str2, z2, cVar, str3, str4, false, str5, z3, C2190s.INSTAGRAM, z4, z5), cVar2);
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: m */
    private final Intent m18856m(C9203f fVar, String str, Collection<String> collection, String str2, boolean z, C2140c cVar, String str3, String str4, boolean z2, String str5, boolean z3, C2190s sVar, boolean z4, boolean z5) {
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            String c = fVar.mo43486c();
            if (c == null) {
                return null;
            }
            String str6 = str;
            Intent putExtra = new Intent().setClassName(fVar.mo43487d(), c).putExtra("client_id", str);
            C12775o.m28638h(putExtra, "Intent()\n            .se…PP_ID_KEY, applicationId)");
            putExtra.putExtra("facebook_sdk_version", FacebookSdk.getSdkVersion());
            if (!C9138d0.m18619U(collection)) {
                putExtra.putExtra("scope", TextUtils.join(",", collection));
            }
            if (!C9138d0.m18618T(str2)) {
                String str7 = str2;
                putExtra.putExtra("e2e", str2);
            }
            String str8 = str3;
            putExtra.putExtra("state", str3);
            putExtra.putExtra("response_type", fVar.mo43489e());
            putExtra.putExtra("return_scopes", "true");
            if (z) {
                putExtra.putExtra("default_audience", cVar.mo23289a());
            }
            putExtra.putExtra("legacy_override", FacebookSdk.getGraphApiVersion());
            String str9 = str4;
            putExtra.putExtra("auth_type", str4);
            if (z2) {
                putExtra.putExtra("fail_on_logged_out", true);
            }
            String str10 = str5;
            putExtra.putExtra("messenger_page_id", str5);
            putExtra.putExtra("reset_messenger_state", z3);
            if (z4) {
                putExtra.putExtra("fx_app", sVar.toString());
            }
            if (z5) {
                putExtra.putExtra("skip_dedupe", true);
            }
            return putExtra;
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }

    /* renamed from: n */
    public static final Intent m18857n(Context context) {
        Class<C9196w> cls = C9196w.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            C12775o.m28639i(context, "context");
            for (C9203f next : f13510b) {
                Intent B = m18843B(context, new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(next.mo43487d()).addCategory("android.intent.category.DEFAULT"), next);
                if (B != null) {
                    return B;
                }
            }
            return null;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: o */
    public static final Intent m18858o(Intent intent, Bundle bundle, FacebookException facebookException) {
        Class<C9196w> cls = C9196w.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            C12775o.m28639i(intent, "requestIntent");
            UUID r = m18861r(intent);
            if (r == null) {
                return null;
            }
            Intent intent2 = new Intent();
            intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", m18867x(intent));
            Bundle bundle2 = new Bundle();
            bundle2.putString("action_id", r.toString());
            if (facebookException != null) {
                bundle2.putBundle(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, m18853j(facebookException));
            }
            intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
            if (bundle != null) {
                intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
            }
            return intent2;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: p */
    public static final List<Intent> m18859p(Context context, String str, Collection<String> collection, String str2, boolean z, boolean z2, C2140c cVar, String str3, String str4, boolean z3, String str5, boolean z4, boolean z5, boolean z6) {
        Class<C9196w> cls = C9196w.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            C12775o.m28639i(str, "applicationId");
            C12775o.m28639i(collection, "permissions");
            C12775o.m28639i(str2, "e2e");
            C12775o.m28639i(cVar, "defaultAudience");
            C12775o.m28639i(str3, "clientState");
            C12775o.m28639i(str4, "authType");
            ArrayList arrayList = new ArrayList();
            for (C9203f m : f13510b) {
                ArrayList arrayList2 = arrayList;
                Intent m2 = f13515g.m18856m(m, str, collection, str2, z2, cVar, str3, str4, z3, str5, z4, C2190s.FACEBOOK, z5, z6);
                if (m2 != null) {
                    arrayList2.add(m2);
                }
                String str6 = str;
                Collection<String> collection2 = collection;
                String str7 = str2;
                C2140c cVar2 = cVar;
                String str8 = str3;
                String str9 = str4;
                arrayList = arrayList2;
            }
            return arrayList;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0055 */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0069 A[LOOP:0: B:26:0x0069->B:29:0x006f, LOOP_START, SYNTHETIC, Splitter:B:26:0x0069] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0087 A[SYNTHETIC, Splitter:B:34:0x0087] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008f A[Catch:{ all -> 0x0093 }] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.TreeSet<java.lang.Integer> m18860q(p198q2.C9196w.C9203f r13) {
        /*
            r12 = this;
            java.lang.String r0 = "version"
            java.lang.String r1 = "Failed to query content resolver."
            boolean r2 = p251v2.C9925a.m20734d(r12)
            r3 = 0
            if (r2 == 0) goto L_0x000c
            return r3
        L_0x000c:
            java.util.TreeSet r2 = new java.util.TreeSet     // Catch:{ all -> 0x0093 }
            r2.<init>()     // Catch:{ all -> 0x0093 }
            android.content.Context r4 = com.facebook.FacebookSdk.getApplicationContext()     // Catch:{ all -> 0x0093 }
            android.content.ContentResolver r5 = r4.getContentResolver()     // Catch:{ all -> 0x0093 }
            java.lang.String[] r7 = new java.lang.String[]{r0}     // Catch:{ all -> 0x0093 }
            android.net.Uri r6 = r12.m18851h(r13)     // Catch:{ all -> 0x0093 }
            android.content.Context r4 = com.facebook.FacebookSdk.getApplicationContext()     // Catch:{ all -> 0x008b }
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ all -> 0x008b }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x008b }
            r8.<init>()     // Catch:{ all -> 0x008b }
            java.lang.String r13 = r13.mo43487d()     // Catch:{ all -> 0x008b }
            r8.append(r13)     // Catch:{ all -> 0x008b }
            java.lang.String r13 = ".provider.PlatformProvider"
            r8.append(r13)     // Catch:{ all -> 0x008b }
            java.lang.String r13 = r8.toString()     // Catch:{ all -> 0x008b }
            r8 = 0
            android.content.pm.ProviderInfo r13 = r4.resolveContentProvider(r13, r8)     // Catch:{ RuntimeException -> 0x0044 }
            goto L_0x004b
        L_0x0044:
            r13 = move-exception
            java.lang.String r4 = f13509a     // Catch:{ all -> 0x008b }
            android.util.Log.e(r4, r1, r13)     // Catch:{ all -> 0x008b }
            r13 = r3
        L_0x004b:
            if (r13 == 0) goto L_0x0084
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r13 = r5.query(r6, r7, r8, r9, r10)     // Catch:{ NullPointerException -> 0x0061, SecurityException -> 0x005b, IllegalArgumentException -> 0x0055 }
            goto L_0x0067
        L_0x0055:
            java.lang.String r13 = f13509a     // Catch:{ all -> 0x008b }
            android.util.Log.e(r13, r1)     // Catch:{ all -> 0x008b }
            goto L_0x0066
        L_0x005b:
            java.lang.String r13 = f13509a     // Catch:{ all -> 0x008b }
            android.util.Log.e(r13, r1)     // Catch:{ all -> 0x008b }
            goto L_0x0066
        L_0x0061:
            java.lang.String r13 = f13509a     // Catch:{ all -> 0x008b }
            android.util.Log.e(r13, r1)     // Catch:{ all -> 0x008b }
        L_0x0066:
            r13 = r3
        L_0x0067:
            if (r13 == 0) goto L_0x0085
        L_0x0069:
            boolean r1 = r13.moveToNext()     // Catch:{ all -> 0x007f }
            if (r1 == 0) goto L_0x0085
            int r1 = r13.getColumnIndex(r0)     // Catch:{ all -> 0x007f }
            int r1 = r13.getInt(r1)     // Catch:{ all -> 0x007f }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x007f }
            r2.add(r1)     // Catch:{ all -> 0x007f }
            goto L_0x0069
        L_0x007f:
            r0 = move-exception
            r11 = r0
            r0 = r13
            r13 = r11
            goto L_0x008d
        L_0x0084:
            r13 = r3
        L_0x0085:
            if (r13 == 0) goto L_0x008a
            r13.close()     // Catch:{ all -> 0x0093 }
        L_0x008a:
            return r2
        L_0x008b:
            r13 = move-exception
            r0 = r3
        L_0x008d:
            if (r0 == 0) goto L_0x0092
            r0.close()     // Catch:{ all -> 0x0093 }
        L_0x0092:
            throw r13     // Catch:{ all -> 0x0093 }
        L_0x0093:
            r13 = move-exception
            p251v2.C9925a.m20732b(r13, r12)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p198q2.C9196w.m18860q(q2.w$f):java.util.TreeSet");
    }

    /* renamed from: r */
    public static final UUID m18861r(Intent intent) {
        String str;
        Class<C9196w> cls = C9196w.class;
        if (C9925a.m20734d(cls) || intent == null) {
            return null;
        }
        try {
            if (m18868y(m18867x(intent))) {
                Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
                if (bundleExtra != null) {
                    str = bundleExtra.getString("action_id");
                } else {
                    str = null;
                }
            } else {
                str = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
            }
            if (str == null) {
                return null;
            }
            try {
                return UUID.fromString(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: s */
    public static final FacebookException m18862s(Bundle bundle) {
        Class<C9196w> cls = C9196w.class;
        if (C9925a.m20734d(cls) || bundle == null) {
            return null;
        }
        try {
            String string = bundle.getString("error_type");
            if (string == null) {
                string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
            }
            String string2 = bundle.getString("error_description");
            if (string2 == null) {
                string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
            }
            if (string == null || !C13754v.m31530r(string, "UserCanceled", true)) {
                return new FacebookException(string2);
            }
            return new FacebookOperationCanceledException(string2);
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: t */
    private final C9204g m18863t(List<? extends C9203f> list, int[] iArr) {
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            m18869z();
            if (list == null) {
                return C9204g.f13518c.mo43496b();
            }
            for (C9203f fVar : list) {
                int i = m18852i(fVar.mo43493b(), m18865v(), iArr);
                if (i != -1) {
                    return C9204g.f13518c.mo43495a(fVar, i);
                }
            }
            return C9204g.f13518c.mo43496b();
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }

    /* renamed from: u */
    public static final int m18864u(int i) {
        Class<C9196w> cls = C9196w.class;
        if (C9925a.m20734d(cls)) {
            return 0;
        }
        try {
            return f13515g.m18863t(f13510b, new int[]{i}).mo43494c();
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return 0;
        }
    }

    /* renamed from: v */
    public static final int m18865v() {
        Class<C9196w> cls = C9196w.class;
        if (C9925a.m20734d(cls)) {
            return 0;
        }
        try {
            return f13514f[0].intValue();
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return 0;
        }
    }

    /* renamed from: w */
    public static final Bundle m18866w(Intent intent) {
        Class<C9196w> cls = C9196w.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            C12775o.m28639i(intent, "intent");
            if (!m18868y(m18867x(intent))) {
                return intent.getExtras();
            }
            return intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: x */
    public static final int m18867x(Intent intent) {
        Class<C9196w> cls = C9196w.class;
        if (C9925a.m20734d(cls)) {
            return 0;
        }
        try {
            C12775o.m28639i(intent, "intent");
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return 0;
        }
    }

    /* renamed from: y */
    public static final boolean m18868y(int i) {
        Class<C9196w> cls = C9196w.class;
        if (C9925a.m20734d(cls)) {
            return false;
        }
        try {
            if (!C12710p.m28377E(f13514f, Integer.valueOf(i)) || i < 20140701) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return false;
        }
    }

    /* renamed from: z */
    public static final void m18869z() {
        Class<C9196w> cls = C9196w.class;
        if (!C9925a.m20734d(cls)) {
            try {
                if (f13513e.compareAndSet(false, true)) {
                    FacebookSdk.getExecutor().execute(C9207i.f13521b);
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: q2.w$f */
    /* compiled from: NativeProtocol.kt */
    public static abstract class C9203f {

        /* renamed from: a */
        private TreeSet<Integer> f13517a;

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
            if (r1.isEmpty() == false) goto L_0x0017;
         */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0027  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized void mo43492a(boolean r1) {
            /*
                r0 = this;
                monitor-enter(r0)
                if (r1 != 0) goto L_0x000f
                java.util.TreeSet<java.lang.Integer> r1 = r0.f13517a     // Catch:{ all -> 0x002c }
                if (r1 == 0) goto L_0x000f
                if (r1 == 0) goto L_0x000f
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002c }
                if (r1 == 0) goto L_0x0017
            L_0x000f:
                q2.w r1 = p198q2.C9196w.f13515g     // Catch:{ all -> 0x002c }
                java.util.TreeSet r1 = p198q2.C9196w.m18844a(r1, r0)     // Catch:{ all -> 0x002c }
                r0.f13517a = r1     // Catch:{ all -> 0x002c }
            L_0x0017:
                java.util.TreeSet<java.lang.Integer> r1 = r0.f13517a     // Catch:{ all -> 0x002c }
                if (r1 == 0) goto L_0x0024
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002c }
                if (r1 == 0) goto L_0x0022
                goto L_0x0024
            L_0x0022:
                r1 = 0
                goto L_0x0025
            L_0x0024:
                r1 = 1
            L_0x0025:
                if (r1 == 0) goto L_0x002a
                r0.mo43490f()     // Catch:{ all -> 0x002c }
            L_0x002a:
                monitor-exit(r0)
                return
            L_0x002c:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p198q2.C9196w.C9203f.mo43492a(boolean):void");
        }

        /* renamed from: b */
        public final TreeSet<Integer> mo43493b() {
            TreeSet<Integer> treeSet = this.f13517a;
            if (treeSet == null || treeSet == null || treeSet.isEmpty()) {
                mo43492a(false);
            }
            return this.f13517a;
        }

        /* renamed from: c */
        public abstract String mo43486c();

        /* renamed from: d */
        public abstract String mo43487d();

        /* renamed from: e */
        public String mo43489e() {
            return "token,signed_request,graph_domain";
        }

        /* renamed from: f */
        public void mo43490f() {
        }
    }
}
