package com.google.firebase.messaging;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.firebase.messaging.a */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
public final class C6954a {

    /* renamed from: a */
    private static final AtomicInteger f9234a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* renamed from: com.google.firebase.messaging.a$a */
    /* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
    public static class C6955a {
        @NonNull

        /* renamed from: a */
        public final NotificationCompat.Builder f9235a;
        @NonNull

        /* renamed from: b */
        public final String f9236b;

        /* renamed from: c */
        public final int f9237c = 0;

        C6955a(NotificationCompat.Builder builder, String str, int i) {
            this.f9235a = builder;
            this.f9236b = str;
        }
    }

    @Nullable
    /* renamed from: a */
    private static PendingIntent m12200a(Context context, C6994l0 l0Var, String str, PackageManager packageManager) {
        Intent f = m12205f(str, l0Var, packageManager);
        if (f == null) {
            return null;
        }
        f.addFlags(67108864);
        f.putExtras(l0Var.mo39961y());
        if (m12216q(l0Var)) {
            f.putExtra("gcm.n.analytics_data", l0Var.mo39960x());
        }
        return PendingIntent.getActivity(context, m12206g(), f, m12211l(BasicMeasure.EXACTLY));
    }

    @Nullable
    /* renamed from: b */
    private static PendingIntent m12201b(Context context, C6994l0 l0Var) {
        if (!m12216q(l0Var)) {
            return null;
        }
        return m12202c(context, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(l0Var.mo39960x()));
    }

    /* renamed from: c */
    private static PendingIntent m12202c(Context context, Intent intent) {
        return PendingIntent.getBroadcast(context, m12206g(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), m12211l(BasicMeasure.EXACTLY));
    }

    /* renamed from: d */
    static C6955a m12203d(Context context, C6994l0 l0Var) {
        Bundle j = m12209j(context.getPackageManager(), context.getPackageName());
        return m12204e(context, context.getPackageName(), l0Var, m12210k(context, l0Var.mo39952k(), j), context.getResources(), context.getPackageManager(), j);
    }

    @NonNull
    /* renamed from: e */
    public static C6955a m12204e(@NonNull Context context, @NonNull String str, @NonNull C6994l0 l0Var, @NonNull String str2, @NonNull Resources resources, @NonNull PackageManager packageManager, @NonNull Bundle bundle) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, str2);
        String n = l0Var.mo39955n(resources, str, "gcm.n.title");
        if (!TextUtils.isEmpty(n)) {
            builder.setContentTitle(n);
        }
        String n2 = l0Var.mo39955n(resources, str, "gcm.n.body");
        if (!TextUtils.isEmpty(n2)) {
            builder.setContentText(n2);
            builder.setStyle(new NotificationCompat.BigTextStyle().bigText(n2));
        }
        builder.setSmallIcon(m12212m(packageManager, resources, str, l0Var.mo39957p("gcm.n.icon"), bundle));
        Uri n3 = m12213n(str, l0Var, resources);
        if (n3 != null) {
            builder.setSound(n3);
        }
        builder.setContentIntent(m12200a(context, l0Var, str, packageManager));
        PendingIntent b = m12201b(context, l0Var);
        if (b != null) {
            builder.setDeleteIntent(b);
        }
        Integer h = m12207h(context, l0Var.mo39957p("gcm.n.color"), bundle);
        if (h != null) {
            builder.setColor(h.intValue());
        }
        builder.setAutoCancel(!l0Var.mo39943a("gcm.n.sticky"));
        builder.setLocalOnly(l0Var.mo39943a("gcm.n.local_only"));
        String p = l0Var.mo39957p("gcm.n.ticker");
        if (p != null) {
            builder.setTicker(p);
        }
        Integer m = l0Var.mo39954m();
        if (m != null) {
            builder.setPriority(m.intValue());
        }
        Integer r = l0Var.mo39959r();
        if (r != null) {
            builder.setVisibility(r.intValue());
        }
        Integer l = l0Var.mo39953l();
        if (l != null) {
            builder.setNumber(l.intValue());
        }
        Long j = l0Var.mo39951j("gcm.n.event_time");
        if (j != null) {
            builder.setShowWhen(true);
            builder.setWhen(j.longValue());
        }
        long[] q = l0Var.mo39958q();
        if (q != null) {
            builder.setVibrate(q);
        }
        int[] e = l0Var.mo39946e();
        if (e != null) {
            builder.setLights(e[0], e[1], e[2]);
        }
        builder.setDefaults(m12208i(l0Var));
        return new C6955a(builder, m12214o(l0Var), 0);
    }

    /* renamed from: f */
    private static Intent m12205f(String str, C6994l0 l0Var, PackageManager packageManager) {
        String p = l0Var.mo39957p("gcm.n.click_action");
        if (!TextUtils.isEmpty(p)) {
            Intent intent = new Intent(p);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri f = l0Var.mo39947f();
        if (f != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(f);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    /* renamed from: g */
    private static int m12206g() {
        return f9234a.incrementAndGet();
    }

    /* renamed from: h */
    private static Integer m12207h(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56);
                sb.append("Color is invalid: ");
                sb.append(str);
                sb.append(". Notification will use default color.");
                Log.w("FirebaseMessaging", sb.toString());
            }
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i == 0) {
            return null;
        }
        try {
            return Integer.valueOf(ContextCompat.getColor(context, i));
        } catch (Resources.NotFoundException unused2) {
            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            return null;
        }
    }

    /* renamed from: i */
    private static int m12208i(C6994l0 l0Var) {
        boolean a = l0Var.mo39943a("gcm.n.default_sound");
        if (l0Var.mo39943a("gcm.n.default_vibrate_timings")) {
            a |= true;
        }
        return l0Var.mo39943a("gcm.n.default_light_settings") ? a | true ? 1 : 0 : a ? 1 : 0;
    }

    /* renamed from: j */
    private static Bundle m12209j(PackageManager packageManager, String str) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (!(applicationInfo == null || (bundle = applicationInfo.metaData) == null)) {
                return bundle;
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: ".concat(e.toString()));
        }
        return Bundle.EMPTY;
    }

    @VisibleForTesting
    @NonNull
    /* renamed from: k */
    public static String m12210k(@NonNull Context context, @NonNull String str, @NonNull Bundle bundle) {
        String str2;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion >= 26) {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (!TextUtils.isEmpty(str)) {
                    if (notificationManager.getNotificationChannel(str) != null) {
                        return str;
                    }
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 122);
                    sb.append("Notification Channel requested (");
                    sb.append(str);
                    sb.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
                    Log.w("FirebaseMessaging", sb.toString());
                }
                String string = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
                if (TextUtils.isEmpty(string)) {
                    Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                } else if (notificationManager.getNotificationChannel(string) != null) {
                    return string;
                } else {
                    Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                }
                if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                    int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", TypedValues.Custom.S_STRING, context.getPackageName());
                    if (identifier == 0) {
                        Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                        str2 = "Misc";
                    } else {
                        str2 = context.getString(identifier);
                    }
                    notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", str2, 3));
                }
                return "fcm_fallback_notification_channel";
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    /* renamed from: l */
    private static int m12211l(int i) {
        return 1140850688;
    }

    /* renamed from: m */
    private static int m12212m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && m12215p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && m12215p(resources, identifier2)) {
                return identifier2;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 61);
            sb.append("Icon resource ");
            sb.append(str2);
            sb.append(" not found. Notification will use default icon.");
            Log.w("FirebaseMessaging", sb.toString());
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i == 0 || !m12215p(resources, i)) {
            try {
                i = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: ".concat(e.toString()));
            }
        }
        if (i == 0) {
            return 17301651;
        }
        if (!m12215p(resources, i)) {
            return 17301651;
        }
        return i;
    }

    /* renamed from: n */
    private static Uri m12213n(String str, C6994l0 l0Var, Resources resources) {
        String o = l0Var.mo39956o();
        if (TextUtils.isEmpty(o)) {
            return null;
        }
        if ("default".equals(o) || resources.getIdentifier(o, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 24 + String.valueOf(o).length());
        sb.append("android.resource://");
        sb.append(str);
        sb.append("/raw/");
        sb.append(o);
        return Uri.parse(sb.toString());
    }

    /* renamed from: o */
    private static String m12214o(C6994l0 l0Var) {
        String p = l0Var.mo39957p("gcm.n.tag");
        if (!TextUtils.isEmpty(p)) {
            return p;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        StringBuilder sb = new StringBuilder(37);
        sb.append("FCM-Notification:");
        sb.append(uptimeMillis);
        return sb.toString();
    }

    /* renamed from: p */
    private static boolean m12215p(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i, (Resources.Theme) null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            StringBuilder sb = new StringBuilder(77);
            sb.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
            sb.append(i);
            Log.e("FirebaseMessaging", sb.toString());
            return false;
        } catch (Resources.NotFoundException unused) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Couldn't find resource ");
            sb2.append(i);
            sb2.append(", treating it as an invalid icon");
            Log.e("FirebaseMessaging", sb2.toString());
            return false;
        }
    }

    /* renamed from: q */
    static boolean m12216q(@NonNull C6994l0 l0Var) {
        return l0Var.mo39943a("google.c.a.e");
    }
}
