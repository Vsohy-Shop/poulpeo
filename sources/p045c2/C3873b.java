package p045c2;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import p071e2.C7454f;
import p251v2.C9925a;
import p454wf.C13735j;

/* renamed from: c2.b */
/* compiled from: MetadataMatcher.kt */
public final class C3873b {

    /* renamed from: a */
    public static final C3873b f2948a = new C3873b();

    private C3873b() {
    }

    /* renamed from: a */
    public static final List<String> m4335a(View view) {
        Class<C3873b> cls = C3873b.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            C12775o.m28639i(view, "view");
            ArrayList arrayList = new ArrayList();
            ViewGroup j = C7454f.m14607j(view);
            if (j != null) {
                for (View next : C7454f.m14599b(j)) {
                    if (view != next) {
                        arrayList.addAll(f2948a.m4337c(next));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(15:3|4|5|(1:7)|8|(1:10)|11|12|13|(2:15|(2:17|(1:19))(2:20|21))|22|23|(5:26|(1:28)(1:29)|(2:33|42)|38|24)|39|34) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0078 */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0087 A[Catch:{ all -> 0x00ae }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<java.lang.String> m4336b(android.view.View r8) {
        /*
            java.lang.Class<c2.b> r0 = p045c2.C3873b.class
            boolean r1 = p251v2.C9925a.m20734d(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            java.lang.String r1 = "view"
            kotlin.jvm.internal.C12775o.m28639i(r8, r1)     // Catch:{ all -> 0x00ae }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00ae }
            r1.<init>()     // Catch:{ all -> 0x00ae }
            java.lang.String r3 = p071e2.C7454f.m14606i(r8)     // Catch:{ all -> 0x00ae }
            r1.add(r3)     // Catch:{ all -> 0x00ae }
            java.lang.Object r3 = r8.getTag()     // Catch:{ all -> 0x00ae }
            if (r3 == 0) goto L_0x0028
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00ae }
            r1.add(r3)     // Catch:{ all -> 0x00ae }
        L_0x0028:
            java.lang.CharSequence r3 = r8.getContentDescription()     // Catch:{ all -> 0x00ae }
            if (r3 == 0) goto L_0x0035
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00ae }
            r1.add(r3)     // Catch:{ all -> 0x00ae }
        L_0x0035:
            r3 = 1
            r4 = 0
            int r5 = r8.getId()     // Catch:{ NotFoundException -> 0x0078 }
            r6 = -1
            if (r5 == r6) goto L_0x0078
            android.content.res.Resources r5 = r8.getResources()     // Catch:{ NotFoundException -> 0x0078 }
            int r8 = r8.getId()     // Catch:{ NotFoundException -> 0x0078 }
            java.lang.String r8 = r5.getResourceName(r8)     // Catch:{ NotFoundException -> 0x0078 }
            java.lang.String r5 = "resourceName"
            kotlin.jvm.internal.C12775o.m28638h(r8, r5)     // Catch:{ NotFoundException -> 0x0078 }
            java.lang.String r5 = "/"
            wf.j r6 = new wf.j     // Catch:{ NotFoundException -> 0x0078 }
            r6.<init>((java.lang.String) r5)     // Catch:{ NotFoundException -> 0x0078 }
            java.util.List r8 = r6.mo53415h(r8, r4)     // Catch:{ NotFoundException -> 0x0078 }
            java.util.Collection r8 = (java.util.Collection) r8     // Catch:{ NotFoundException -> 0x0078 }
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ NotFoundException -> 0x0078 }
            java.lang.Object[] r8 = r8.toArray(r5)     // Catch:{ NotFoundException -> 0x0078 }
            if (r8 == 0) goto L_0x0070
            java.lang.String[] r8 = (java.lang.String[]) r8     // Catch:{ NotFoundException -> 0x0078 }
            int r5 = r8.length     // Catch:{ NotFoundException -> 0x0078 }
            r6 = 2
            if (r5 != r6) goto L_0x0078
            r8 = r8[r3]     // Catch:{ NotFoundException -> 0x0078 }
            r1.add(r8)     // Catch:{ NotFoundException -> 0x0078 }
            goto L_0x0078
        L_0x0070:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException     // Catch:{ NotFoundException -> 0x0078 }
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T>"
            r8.<init>(r5)     // Catch:{ NotFoundException -> 0x0078 }
            throw r8     // Catch:{ NotFoundException -> 0x0078 }
        L_0x0078:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x00ae }
            r8.<init>()     // Catch:{ all -> 0x00ae }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00ae }
        L_0x0081:
            boolean r5 = r1.hasNext()     // Catch:{ all -> 0x00ae }
            if (r5 == 0) goto L_0x00ad
            java.lang.Object r5 = r1.next()     // Catch:{ all -> 0x00ae }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x00ae }
            int r6 = r5.length()     // Catch:{ all -> 0x00ae }
            if (r6 <= 0) goto L_0x0095
            r6 = r3
            goto L_0x0096
        L_0x0095:
            r6 = r4
        L_0x0096:
            if (r6 == 0) goto L_0x0081
            int r6 = r5.length()     // Catch:{ all -> 0x00ae }
            r7 = 100
            if (r6 > r7) goto L_0x0081
            java.lang.String r5 = r5.toLowerCase()     // Catch:{ all -> 0x00ae }
            java.lang.String r6 = "(this as java.lang.String).toLowerCase()"
            kotlin.jvm.internal.C12775o.m28638h(r5, r6)     // Catch:{ all -> 0x00ae }
            r8.add(r5)     // Catch:{ all -> 0x00ae }
            goto L_0x0081
        L_0x00ad:
            return r8
        L_0x00ae:
            r8 = move-exception
            p251v2.C9925a.m20732b(r8, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p045c2.C3873b.m4336b(android.view.View):java.util.List");
    }

    /* renamed from: c */
    private final List<String> m4337c(View view) {
        boolean z;
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (view instanceof TextView) {
                String obj = ((TextView) view).getText().toString();
                if (obj.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && obj.length() < 100) {
                    String lowerCase = obj.toLowerCase();
                    C12775o.m28638h(lowerCase, "(this as java.lang.String).toLowerCase()");
                    arrayList.add(lowerCase);
                }
                return arrayList;
            }
            for (View c : C7454f.m14599b(view)) {
                arrayList.addAll(m4337c(c));
            }
            return arrayList;
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }

    /* renamed from: d */
    private final boolean m4338d(String str, List<String> list) {
        if (C9925a.m20734d(this)) {
            return false;
        }
        try {
            for (String J : list) {
                if (C13755w.m31552J(str, J, false, 2, (Object) null)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return false;
        }
    }

    /* renamed from: e */
    public static final boolean m4339e(List<String> list, List<String> list2) {
        Class<C3873b> cls = C3873b.class;
        if (C9925a.m20734d(cls)) {
            return false;
        }
        try {
            C12775o.m28639i(list, "indicators");
            C12775o.m28639i(list2, "keys");
            for (String d : list) {
                if (f2948a.m4338d(d, list2)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return false;
        }
    }

    /* renamed from: f */
    public static final boolean m4340f(String str, String str2) {
        Class<C3873b> cls = C3873b.class;
        if (C9925a.m20734d(cls)) {
            return false;
        }
        try {
            C12775o.m28639i(str, "text");
            C12775o.m28639i(str2, "rule");
            return new C13735j(str2).mo53412e(str);
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return false;
        }
    }
}
