package p019a1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.Ref$ObjectRef;
import p126j0.C8266c;
import p136k0.C8429a;
import p270x.C10347i;
import p404of.C13074a;

/* renamed from: a1.b */
/* compiled from: UriUtils.kt */
public final class C2113b {

    /* renamed from: a */
    private static final String f798a = C8266c.f11641a.mo42215o("UriUtils");

    /* renamed from: a1.b$a */
    /* compiled from: UriUtils.kt */
    static final class C2114a extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Ref$ObjectRef<Uri> f799g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2114a(Ref$ObjectRef<Uri> ref$ObjectRef) {
            super(0);
            this.f799g = ref$ObjectRef;
        }

        public final String invoke() {
            return "Encoded query is null for Uri: " + this.f799g.f20403b + " Returning empty map for query parameters";
        }
    }

    /* renamed from: a1.b$b */
    /* compiled from: UriUtils.kt */
    static final class C2115b extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Ref$ObjectRef<Uri> f800g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2115b(Ref$ObjectRef<Uri> ref$ObjectRef) {
            super(0);
            this.f800g = ref$ObjectRef;
        }

        public final String invoke() {
            return C12775o.m28647q("Failed to map the query parameters of Uri: ", this.f800g.f20403b);
        }
    }

    /* renamed from: a1.b$c */
    /* compiled from: UriUtils.kt */
    static final class C2116c extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f801g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2116c(String str) {
            super(0);
            this.f801g = str;
        }

        public final String invoke() {
            return C12775o.m28647q("Could not find activity info for class with name: ", this.f801g);
        }
    }

    /* renamed from: a */
    public static final Intent m1459a(Context context, Bundle bundle) {
        C12775o.m28639i(context, "context");
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setFlags(C8429a.f12015a.mo42456a().mo42451a(C10347i.C10348a.URI_UTILS_GET_MAIN_ACTIVITY_INTENT));
        }
        if (!(bundle == null || launchIntentForPackage == null)) {
            launchIntentForPackage.putExtras(bundle);
        }
        return launchIntentForPackage;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ad A[Catch:{ Exception -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008b A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Map<java.lang.String, java.lang.String> m1460b(android.net.Uri r10) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C12775o.m28639i(r10, r0)
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            r0.f20403b = r10
            java.lang.String r10 = r10.getEncodedQuery()
            if (r10 != 0) goto L_0x002a
            j0.c r1 = p126j0.C8266c.f11641a
            java.lang.String r2 = f798a
            j0.c$a r3 = p126j0.C8266c.C8267a.f11650f
            r4 = 0
            r5 = 0
            a1.b$a r6 = new a1.b$a
            r6.<init>(r0)
            r7 = 12
            r8 = 0
            p126j0.C8266c.m16397f(r1, r2, r3, r4, r5, r6, r7, r8)
            java.util.Map r10 = kotlin.collections.C12716r0.m28416g()
            return r10
        L_0x002a:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            T r2 = r0.f20403b     // Catch:{ Exception -> 0x00b6 }
            android.net.Uri r2 = (android.net.Uri) r2     // Catch:{ Exception -> 0x00b6 }
            boolean r2 = r2.isOpaque()     // Catch:{ Exception -> 0x00b6 }
            if (r2 == 0) goto L_0x0052
            java.lang.String r2 = "://"
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ Exception -> 0x00b6 }
            android.net.Uri$Builder r2 = r2.buildUpon()     // Catch:{ Exception -> 0x00b6 }
            android.net.Uri$Builder r10 = r2.encodedQuery(r10)     // Catch:{ Exception -> 0x00b6 }
            android.net.Uri r10 = r10.build()     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r2 = "parse(\"://\")\n           …\n                .build()"
            kotlin.jvm.internal.C12775o.m28638h(r10, r2)     // Catch:{ Exception -> 0x00b6 }
            r0.f20403b = r10     // Catch:{ Exception -> 0x00b6 }
        L_0x0052:
            T r10 = r0.f20403b     // Catch:{ Exception -> 0x00b6 }
            android.net.Uri r10 = (android.net.Uri) r10     // Catch:{ Exception -> 0x00b6 }
            java.util.Set r10 = r10.getQueryParameterNames()     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r2 = "uri.queryParameterNames"
            kotlin.jvm.internal.C12775o.m28638h(r10, r2)     // Catch:{ Exception -> 0x00b6 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x00b6 }
            r2.<init>()     // Catch:{ Exception -> 0x00b6 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ Exception -> 0x00b6 }
        L_0x0068:
            boolean r3 = r10.hasNext()     // Catch:{ Exception -> 0x00b6 }
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0087
            java.lang.Object r3 = r10.next()     // Catch:{ Exception -> 0x00b6 }
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x00b6 }
            if (r6 == 0) goto L_0x007f
            int r6 = r6.length()     // Catch:{ Exception -> 0x00b6 }
            if (r6 != 0) goto L_0x0080
        L_0x007f:
            r4 = r5
        L_0x0080:
            r4 = r4 ^ r5
            if (r4 == 0) goto L_0x0068
            r2.add(r3)     // Catch:{ Exception -> 0x00b6 }
            goto L_0x0068
        L_0x0087:
            java.util.Iterator r10 = r2.iterator()     // Catch:{ Exception -> 0x00b6 }
        L_0x008b:
            boolean r2 = r10.hasNext()     // Catch:{ Exception -> 0x00b6 }
            if (r2 == 0) goto L_0x00ca
            java.lang.Object r2 = r10.next()     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b6 }
            T r3 = r0.f20403b     // Catch:{ Exception -> 0x00b6 }
            android.net.Uri r3 = (android.net.Uri) r3     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r3 = r3.getQueryParameter(r2)     // Catch:{ Exception -> 0x00b6 }
            if (r3 == 0) goto L_0x00aa
            int r6 = r3.length()     // Catch:{ Exception -> 0x00b6 }
            if (r6 != 0) goto L_0x00a8
            goto L_0x00aa
        L_0x00a8:
            r6 = r4
            goto L_0x00ab
        L_0x00aa:
            r6 = r5
        L_0x00ab:
            if (r6 != 0) goto L_0x008b
            java.lang.String r6 = "queryParameterKey"
            kotlin.jvm.internal.C12775o.m28638h(r2, r6)     // Catch:{ Exception -> 0x00b6 }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x00b6 }
            goto L_0x008b
        L_0x00b6:
            r10 = move-exception
            r5 = r10
            j0.c r2 = p126j0.C8266c.f11641a
            java.lang.String r3 = f798a
            j0.c$a r4 = p126j0.C8266c.C8267a.f11649e
            r6 = 0
            a1.b$b r7 = new a1.b$b
            r7.<init>(r0)
            r8 = 8
            r9 = 0
            p126j0.C8266c.m16397f(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x00ca:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p019a1.C2113b.m1460b(android.net.Uri):java.util.Map");
    }

    /* renamed from: c */
    public static final boolean m1461c(Context context, String str) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(str, "className");
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                context.getPackageManager().getActivityInfo(new ComponentName(context, str), PackageManager.ComponentInfoFlags.of(0));
            } else {
                context.getPackageManager().getActivityInfo(new ComponentName(context, str), 0);
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            C8266c.m16397f(C8266c.f11641a, f798a, C8266c.C8267a.f11651g, e, false, new C2116c(str), 8, (Object) null);
            return false;
        }
    }
}
