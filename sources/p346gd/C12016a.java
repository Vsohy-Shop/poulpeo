package p346gd;

import android.content.Context;
import com.rmn.iosadapters.android.content.ContextContainer;
import org.json.JSONException;
import org.json.JSONObject;
import p446vd.C13620a;
import p446vd.C13621b;
import p446vd.C13633n;
import p446vd.C13636q;

/* renamed from: gd.a */
/* compiled from: NewFeatureDialogWrapper */
public class C12016a {

    /* renamed from: a */
    private static JSONObject f18781a;

    /* renamed from: a */
    public static boolean m26090a(Context context) {
        return C13636q.m31181b(new ContextContainer(context)).mo53294e("display_new_features", false);
    }

    /* renamed from: b */
    public static void m26091b(Context context) {
        int i;
        String d = m26093d(context);
        if (d != null && f18781a == null) {
            try {
                JSONObject jSONObject = new JSONObject(d);
                f18781a = jSONObject;
                i = jSONObject.getInt("version");
            } catch (JSONException e) {
                C13633n.m31145a(e, "");
            }
            ContextContainer contextContainer = new ContextContainer(context);
            boolean z = false;
            boolean z2 = !C13636q.m31181b(contextContainer).mo53294e("MR_onboarding_already_opened", false);
            boolean z3 = C13620a.m31086a(contextContainer).f21935b;
            boolean j = C13621b.m31096j(String.valueOf(i), C13620a.m31086a(contextContainer).f21934a);
            if (!z2 && z3 && j) {
                z = true;
            }
            C13636q.m31181b(contextContainer).mo53299j("display_new_features", z);
        }
        i = -1;
        ContextContainer contextContainer2 = new ContextContainer(context);
        boolean z4 = false;
        boolean z22 = !C13636q.m31181b(contextContainer2).mo53294e("MR_onboarding_already_opened", false);
        boolean z32 = C13620a.m31086a(contextContainer2).f21935b;
        boolean j2 = C13621b.m31096j(String.valueOf(i), C13620a.m31086a(contextContainer2).f21934a);
        z4 = true;
        C13636q.m31181b(contextContainer2).mo53299j("display_new_features", z4);
    }

    /* renamed from: c */
    protected static JSONObject m26092c() {
        return f18781a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003a A[SYNTHETIC, Splitter:B:18:0x003a] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0046 A[SYNTHETIC, Splitter:B:24:0x0046] */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m26093d(android.content.Context r6) {
        /*
            java.lang.Class<gd.a> r0 = p346gd.C12016a.class
            r1 = 0
            android.content.res.AssetManager r2 = r6.getAssets()     // Catch:{ IOException -> 0x0033, all -> 0x002e }
            r3 = 2131951619(0x7f130003, float:1.9539658E38)
            java.lang.String r6 = r6.getString(r3)     // Catch:{ IOException -> 0x0033, all -> 0x002e }
            java.io.InputStream r6 = r2.open(r6)     // Catch:{ IOException -> 0x0033, all -> 0x002e }
            int r2 = r6.available()     // Catch:{ IOException -> 0x002c }
            byte[] r2 = new byte[r2]     // Catch:{ IOException -> 0x002c }
            r6.read(r2)     // Catch:{ IOException -> 0x002c }
            java.lang.String r3 = new java.lang.String     // Catch:{ IOException -> 0x002c }
            java.lang.String r4 = "UTF-8"
            r3.<init>(r2, r4)     // Catch:{ IOException -> 0x002c }
            r6.close()     // Catch:{ IOException -> 0x0026 }
            goto L_0x002a
        L_0x0026:
            r6 = move-exception
            p446vd.C13633n.m31147c(r0, r6)
        L_0x002a:
            r1 = r3
            goto L_0x0042
        L_0x002c:
            r2 = move-exception
            goto L_0x0035
        L_0x002e:
            r6 = move-exception
            r5 = r1
            r1 = r6
            r6 = r5
            goto L_0x0044
        L_0x0033:
            r2 = move-exception
            r6 = r1
        L_0x0035:
            p446vd.C13633n.m31147c(r0, r2)     // Catch:{ all -> 0x0043 }
            if (r6 == 0) goto L_0x0042
            r6.close()     // Catch:{ IOException -> 0x003e }
            goto L_0x0042
        L_0x003e:
            r6 = move-exception
            p446vd.C13633n.m31147c(r0, r6)
        L_0x0042:
            return r1
        L_0x0043:
            r1 = move-exception
        L_0x0044:
            if (r6 == 0) goto L_0x004e
            r6.close()     // Catch:{ IOException -> 0x004a }
            goto L_0x004e
        L_0x004a:
            r6 = move-exception
            p446vd.C13633n.m31147c(r0, r6)
        L_0x004e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p346gd.C12016a.m26093d(android.content.Context):java.lang.String");
    }
}
