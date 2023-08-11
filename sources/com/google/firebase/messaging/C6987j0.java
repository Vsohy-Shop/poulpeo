package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.adjust.sdk.Constants;
import com.google.firebase.C6922c;
import com.google.firebase.installations.C6944c;
import com.rmn.apiclient.impl.api.call.APIParams;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import java.util.concurrent.ExecutionException;
import p119i3.C8109b;
import p119i3.C8110c;
import p119i3.C8113f;
import p119i3.C8114g;
import p192p6.C9063a;
import p204q8.C9325a;
import p204q8.C9330b;
import p276x5.C10410i;

/* renamed from: com.google.firebase.messaging.j0 */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
public class C6987j0 {
    /* renamed from: A */
    public static boolean m12312A(@NonNull Intent intent) {
        if (intent == null || m12332r(intent)) {
            return false;
        }
        return m12315a();
    }

    /* renamed from: B */
    public static boolean m12313B(@NonNull Intent intent) {
        if (intent == null || m12332r(intent)) {
            return false;
        }
        return m12314C(intent.getExtras());
    }

    /* renamed from: C */
    public static boolean m12314C(@NonNull Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    /* renamed from: a */
    static boolean m12315a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            C6922c.m12057i();
            Context h = C6922c.m12057i().mo39766h();
            SharedPreferences sharedPreferences = h.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = h.getPackageManager();
                if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(h.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("delivery_metrics_exported_to_big_query_enabled"))) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    /* renamed from: b */
    static C9325a m12316b(C9325a.C9327b bVar, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        C9325a.C9326a p = C9325a.m19194p();
        p.mo43642m(m12330p(extras));
        p.mo43634e(bVar);
        p.mo43635f(m12320f(extras));
        p.mo43638i(m12327m());
        p.mo43640k(C9325a.C9329d.ANDROID);
        p.mo43637h(m12325k(extras));
        String h = m12322h(extras);
        if (h != null) {
            p.mo43636g(h);
        }
        String o = m12329o(extras);
        if (o != null) {
            p.mo43641l(o);
        }
        String c = m12317c(extras);
        if (c != null) {
            p.mo43632c(c);
        }
        String i = m12323i(extras);
        if (i != null) {
            p.mo43631b(i);
        }
        String e = m12319e(extras);
        if (e != null) {
            p.mo43633d(e);
        }
        long n = m12328n(extras);
        if (n > 0) {
            p.mo43639j(n);
        }
        return p.mo43630a();
    }

    @Nullable
    /* renamed from: c */
    static String m12317c(Bundle bundle) {
        return bundle.getString("collapse_key");
    }

    @Nullable
    /* renamed from: d */
    static String m12318d(Bundle bundle) {
        return bundle.getString("google.c.a.c_id");
    }

    @Nullable
    /* renamed from: e */
    static String m12319e(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    @NonNull
    /* renamed from: f */
    static String m12320f(Bundle bundle) {
        String string = bundle.getString("google.to");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) C10410i.m21827a(C6944c.m12140o(C6922c.m12057i()).getId());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    @Nullable
    /* renamed from: g */
    static String m12321g(Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }

    @Nullable
    /* renamed from: h */
    static String m12322h(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        if (string == null) {
            return bundle.getString("message_id");
        }
        return string;
    }

    @Nullable
    /* renamed from: i */
    static String m12323i(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    @Nullable
    /* renamed from: j */
    static String m12324j(Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }

    @NonNull
    /* renamed from: k */
    static C9325a.C9328c m12325k(Bundle bundle) {
        if (bundle == null || !C6994l0.m12355t(bundle)) {
            return C9325a.C9328c.DATA_MESSAGE;
        }
        return C9325a.C9328c.DISPLAY_NOTIFICATION;
    }

    @NonNull
    /* renamed from: l */
    static String m12326l(Bundle bundle) {
        if (true != C6994l0.m12355t(bundle)) {
            return "data";
        }
        return "display";
    }

    @NonNull
    /* renamed from: m */
    static String m12327m() {
        return C6922c.m12057i().mo39766h().getPackageName();
    }

    @Nullable
    /* renamed from: n */
    static long m12328n(Bundle bundle) {
        if (bundle.containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong(bundle.getString("google.c.sender.id"));
            } catch (NumberFormatException e) {
                Log.w("FirebaseMessaging", "error parsing project number", e);
            }
        }
        C6922c i = C6922c.m12057i();
        String d = i.mo39769k().mo39786d();
        if (d != null) {
            try {
                return Long.parseLong(d);
            } catch (NumberFormatException e2) {
                Log.w("FirebaseMessaging", "error parsing sender ID", e2);
            }
        }
        String c = i.mo39769k().mo39785c();
        if (!c.startsWith("1:")) {
            try {
                return Long.parseLong(c);
            } catch (NumberFormatException e3) {
                Log.w("FirebaseMessaging", "error parsing app ID", e3);
                return 0;
            }
        } else {
            String[] split = c.split(":");
            if (split.length < 2) {
                return 0;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return 0;
            }
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e4) {
                Log.w("FirebaseMessaging", "error parsing app ID", e4);
                return 0;
            }
        }
    }

    @Nullable
    /* renamed from: o */
    static String m12329o(Bundle bundle) {
        String string = bundle.getString(TypedValues.TransitionType.S_FROM);
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    @NonNull
    /* renamed from: p */
    static int m12330p(Bundle bundle) {
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid TTL: ".concat(String.valueOf(obj)));
            return 0;
        }
    }

    @Nullable
    /* renamed from: q */
    static String m12331q(Bundle bundle) {
        if (bundle.containsKey("google.c.a.udt")) {
            return bundle.getString("google.c.a.udt");
        }
        return null;
    }

    /* renamed from: r */
    private static boolean m12332r(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    /* renamed from: s */
    public static void m12333s(@NonNull Intent intent) {
        m12338x("_nd", intent.getExtras());
    }

    /* renamed from: t */
    public static void m12334t(@NonNull Intent intent) {
        m12338x("_nf", intent.getExtras());
    }

    /* renamed from: u */
    public static void m12335u(@NonNull Bundle bundle) {
        m12340z(bundle);
        m12338x("_no", bundle);
    }

    /* renamed from: v */
    public static void m12336v(@NonNull Intent intent) {
        if (m12313B(intent)) {
            m12338x("_nr", intent.getExtras());
        }
        if (m12312A(intent)) {
            m12337w(C9325a.C9327b.MESSAGE_DELIVERED, intent, FirebaseMessaging.getTransportFactory());
        }
    }

    /* renamed from: w */
    private static void m12337w(C9325a.C9327b bVar, Intent intent, @Nullable C8114g gVar) {
        if (gVar == null) {
            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        C9325a b = m12316b(bVar, intent);
        if (b != null) {
            try {
                C8113f<C9330b> a = gVar.mo41969a("FCM_CLIENT_EVENT_LOGGING", C9330b.class, C8109b.m15970b("proto"), C6984i0.f9314a);
                C9330b.C9331a b2 = C9330b.m19229b();
                b2.mo43646b(b);
                a.mo41967a(C8110c.m15975g(b2.mo43645a()));
            } catch (RuntimeException e) {
                Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e);
            }
        }
    }

    @VisibleForTesting
    /* renamed from: x */
    static void m12338x(String str, Bundle bundle) {
        try {
            C6922c.m12057i();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String d = m12318d(bundle);
            if (d != null) {
                bundle2.putString("_nmid", d);
            }
            String e = m12319e(bundle);
            if (e != null) {
                bundle2.putString("_nmn", e);
            }
            String i = m12323i(bundle);
            if (!TextUtils.isEmpty(i)) {
                bundle2.putString("label", i);
            }
            String g = m12321g(bundle);
            if (!TextUtils.isEmpty(g)) {
                bundle2.putString("message_channel", g);
            }
            String o = m12329o(bundle);
            if (o != null) {
                bundle2.putString("_nt", o);
            }
            String j = m12324j(bundle);
            if (j != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(j));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e2);
                }
            }
            String q = m12331q(bundle);
            if (q != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(q));
                } catch (NumberFormatException e3) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e3);
                }
            }
            String l = m12326l(bundle);
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", l);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String obj = bundle2.toString();
                StringBuilder sb = new StringBuilder(str.length() + 37 + obj.length());
                sb.append("Logging to scion event=");
                sb.append(str);
                sb.append(" scionPayload=");
                sb.append(obj);
                Log.d("FirebaseMessaging", sb.toString());
            }
            C9063a aVar = (C9063a) C6922c.m12057i().mo39765g(C9063a.class);
            if (aVar != null) {
                aVar.mo30047c("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    /* renamed from: y */
    static void m12339y(boolean z) {
        C6922c.m12057i().mo39766h().getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean("export_to_big_query", z).apply();
    }

    /* renamed from: z */
    private static void m12340z(Bundle bundle) {
        if (bundle != null) {
            if ("1".equals(bundle.getString("google.c.a.tc"))) {
                C9063a aVar = (C9063a) C6922c.m12057i().mo39765g(C9063a.class);
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                }
                if (aVar != null) {
                    String string = bundle.getString("google.c.a.c_id");
                    aVar.mo30052g("fcm", "_ln", string);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(APIParams.SOURCE, "Firebase");
                    bundle2.putString(Constants.MEDIUM, "notification");
                    bundle2.putString(APIResourceDescriptors.RESOURCE_TYPE_CAMPAIGN, string);
                    aVar.mo30047c("fcm", "_cmp", bundle2);
                    return;
                }
                Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
            }
        }
    }
}
