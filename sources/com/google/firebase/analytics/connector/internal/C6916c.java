package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import androidx.autofill.HintConstants;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p192p6.C9063a;
import p201q5.C9266m;
import p201q5.C9267n;
import p201q5.C9269p;
import p201q5.C9274u;
import p231t4.C9713p;
import p286y4.C10668b;

/* renamed from: com.google.firebase.analytics.connector.internal.c */
/* compiled from: com.google.android.gms:play-services-measurement-api@@20.0.0 */
public final class C6916c {

    /* renamed from: a */
    private static final Set<String> f9115a = new HashSet(Arrays.asList(new String[]{"_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}));

    /* renamed from: b */
    private static final List<String> f9116b = Arrays.asList(new String[]{"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"});

    /* renamed from: c */
    private static final List<String> f9117c = Arrays.asList(new String[]{"auto", "app", "am"});

    /* renamed from: d */
    private static final List<String> f9118d = Arrays.asList(new String[]{"_r", "_dbg"});

    /* renamed from: e */
    private static final List<String> f9119e = Arrays.asList((String[]) C10668b.m22666a(C9269p.f13615a, C9269p.f13616b));

    /* renamed from: f */
    private static final List<String> f9120f = Arrays.asList(new String[]{"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"});

    /* renamed from: a */
    public static Bundle m12032a(C9063a.C9066c cVar) {
        Bundle bundle = new Bundle();
        String str = cVar.f13184a;
        if (str != null) {
            bundle.putString("origin", str);
        }
        String str2 = cVar.f13185b;
        if (str2 != null) {
            bundle.putString(HintConstants.AUTOFILL_HINT_NAME, str2);
        }
        Object obj = cVar.f13186c;
        if (obj != null) {
            C9266m.m19028b(bundle, obj);
        }
        String str3 = cVar.f13187d;
        if (str3 != null) {
            bundle.putString("trigger_event_name", str3);
        }
        bundle.putLong("trigger_timeout", cVar.f13188e);
        String str4 = cVar.f13189f;
        if (str4 != null) {
            bundle.putString("timed_out_event_name", str4);
        }
        Bundle bundle2 = cVar.f13190g;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str5 = cVar.f13191h;
        if (str5 != null) {
            bundle.putString("triggered_event_name", str5);
        }
        Bundle bundle3 = cVar.f13192i;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", cVar.f13193j);
        String str6 = cVar.f13194k;
        if (str6 != null) {
            bundle.putString("expired_event_name", str6);
        }
        Bundle bundle4 = cVar.f13195l;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", cVar.f13196m);
        bundle.putBoolean("active", cVar.f13197n);
        bundle.putLong("triggered_timestamp", cVar.f13198o);
        return bundle;
    }

    /* renamed from: b */
    public static C9063a.C9066c m12033b(Bundle bundle) {
        C9713p.m20275j(bundle);
        C9063a.C9066c cVar = new C9063a.C9066c();
        Class cls = String.class;
        cVar.f13184a = (String) C9713p.m20275j((String) C9266m.m19027a(bundle, "origin", cls, null));
        cVar.f13185b = (String) C9713p.m20275j((String) C9266m.m19027a(bundle, HintConstants.AUTOFILL_HINT_NAME, cls, null));
        cVar.f13186c = C9266m.m19027a(bundle, "value", Object.class, null);
        cVar.f13187d = (String) C9266m.m19027a(bundle, "trigger_event_name", cls, null);
        Class cls2 = Long.class;
        cVar.f13188e = ((Long) C9266m.m19027a(bundle, "trigger_timeout", cls2, 0L)).longValue();
        cVar.f13189f = (String) C9266m.m19027a(bundle, "timed_out_event_name", cls, null);
        Class cls3 = Bundle.class;
        cVar.f13190g = (Bundle) C9266m.m19027a(bundle, "timed_out_event_params", cls3, null);
        cVar.f13191h = (String) C9266m.m19027a(bundle, "triggered_event_name", cls, null);
        cVar.f13192i = (Bundle) C9266m.m19027a(bundle, "triggered_event_params", cls3, null);
        cVar.f13193j = ((Long) C9266m.m19027a(bundle, "time_to_live", cls2, 0L)).longValue();
        cVar.f13194k = (String) C9266m.m19027a(bundle, "expired_event_name", cls, null);
        cVar.f13195l = (Bundle) C9266m.m19027a(bundle, "expired_event_params", cls3, null);
        cVar.f13197n = ((Boolean) C9266m.m19027a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
        cVar.f13196m = ((Long) C9266m.m19027a(bundle, "creation_timestamp", cls2, 0L)).longValue();
        cVar.f13198o = ((Long) C9266m.m19027a(bundle, "triggered_timestamp", cls2, 0L)).longValue();
        return cVar;
    }

    /* renamed from: c */
    public static String m12034c(String str) {
        String a = C9267n.m19029a(str);
        if (a != null) {
            return a;
        }
        return str;
    }

    /* renamed from: d */
    public static String m12035d(String str) {
        String b = C9267n.m19030b(str);
        if (b != null) {
            return b;
        }
        return str;
    }

    /* renamed from: e */
    public static void m12036e(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1);
        }
    }

    /* renamed from: f */
    public static boolean m12037f(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int codePointAt = str.codePointAt(0);
        if (!Character.isLetter(codePointAt) && codePointAt != 95) {
            return false;
        }
        int length = str.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m12038g(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int codePointAt = str.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            return false;
        }
        int length = str.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0077  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m12039h(java.lang.String r4, java.lang.String r5, android.os.Bundle r6) {
        /*
            java.lang.String r0 = "_cmp"
            boolean r5 = r0.equals(r5)
            r0 = 1
            if (r5 != 0) goto L_0x000a
            return r0
        L_0x000a:
            boolean r5 = m12043l(r4)
            r1 = 0
            if (r5 != 0) goto L_0x0012
            return r1
        L_0x0012:
            if (r6 != 0) goto L_0x0015
            return r1
        L_0x0015:
            java.util.List<java.lang.String> r5 = f9118d
            java.util.Iterator r5 = r5.iterator()
        L_0x001b:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x002e
            java.lang.Object r2 = r5.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r6.containsKey(r2)
            if (r2 == 0) goto L_0x001b
            return r1
        L_0x002e:
            int r5 = r4.hashCode()
            r2 = 101200(0x18b50, float:1.41811E-40)
            r3 = 2
            if (r5 == r2) goto L_0x0057
            r2 = 101230(0x18b6e, float:1.41853E-40)
            if (r5 == r2) goto L_0x004d
            r2 = 3142703(0x2ff42f, float:4.403865E-39)
            if (r5 == r2) goto L_0x0043
            goto L_0x0061
        L_0x0043:
            java.lang.String r5 = "fiam"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0061
            r4 = r3
            goto L_0x0062
        L_0x004d:
            java.lang.String r5 = "fdl"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0061
            r4 = r0
            goto L_0x0062
        L_0x0057:
            java.lang.String r5 = "fcm"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0061
            r4 = r1
            goto L_0x0062
        L_0x0061:
            r4 = -1
        L_0x0062:
            java.lang.String r5 = "_cis"
            if (r4 == 0) goto L_0x0077
            if (r4 == r0) goto L_0x0071
            if (r4 == r3) goto L_0x006b
            return r1
        L_0x006b:
            java.lang.String r4 = "fiam_integration"
            r6.putString(r5, r4)
            return r0
        L_0x0071:
            java.lang.String r4 = "fdl_integration"
            r6.putString(r5, r4)
            return r0
        L_0x0077:
            java.lang.String r4 = "fcm_integration"
            r6.putString(r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.analytics.connector.internal.C6916c.m12039h(java.lang.String, java.lang.String, android.os.Bundle):boolean");
    }

    /* renamed from: i */
    public static boolean m12040i(C9063a.C9066c cVar) {
        String str;
        if (cVar == null || (str = cVar.f13184a) == null || str.isEmpty()) {
            return false;
        }
        Object obj = cVar.f13186c;
        if ((obj != null && C9274u.m19048a(obj) == null) || !m12043l(str) || !m12044m(str, cVar.f13185b)) {
            return false;
        }
        String str2 = cVar.f13194k;
        if (str2 != null && (!m12041j(str2, cVar.f13195l) || !m12039h(str, cVar.f13194k, cVar.f13195l))) {
            return false;
        }
        String str3 = cVar.f13191h;
        if (str3 != null && (!m12041j(str3, cVar.f13192i) || !m12039h(str, cVar.f13191h, cVar.f13192i))) {
            return false;
        }
        String str4 = cVar.f13189f;
        if (str4 == null) {
            return true;
        }
        if (m12041j(str4, cVar.f13190g) && m12039h(str, cVar.f13189f, cVar.f13190g)) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m12041j(String str, Bundle bundle) {
        if (f9116b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        for (String containsKey : f9118d) {
            if (bundle.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public static boolean m12042k(String str) {
        if (!f9115a.contains(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public static boolean m12043l(String str) {
        if (!f9117c.contains(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public static boolean m12044m(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            if (str.equals("fcm") || str.equals("frc")) {
                return true;
            }
            return false;
        } else if ("_ln".equals(str2)) {
            if (str.equals("fcm") || str.equals("fiam")) {
                return true;
            }
            return false;
        } else if (f9119e.contains(str2)) {
            return false;
        } else {
            for (String matches : f9120f) {
                if (str2.matches(matches)) {
                    return false;
                }
            }
            return true;
        }
    }
}
