package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import com.appboy.Constants;
import com.google.android.gms.common.api.GoogleApiActivity;
import p023a5.C2204b;
import p097g4.C7772a;
import p097g4.C7773b;
import p121i5.C8184e;
import p180o4.C8972b;
import p180o4.C8978g;
import p200q4.C9226f;
import p200q4.C9245r;
import p200q4.C9246s;
import p231t4.C9663b0;
import p231t4.C9678e0;
import p231t4.C9713p;
import p286y4.C10675i;
import p286y4.C10680n;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class GoogleApiAvailability extends C4718a {

    /* renamed from: d */
    public static final int f4874d = C4718a.f4882a;

    /* renamed from: e */
    private static final Object f4875e = new Object();

    /* renamed from: f */
    private static final GoogleApiAvailability f4876f = new GoogleApiAvailability();
    @GuardedBy("mLock")

    /* renamed from: c */
    private String f4877c;

    @NonNull
    /* renamed from: n */
    public static GoogleApiAvailability m6375n() {
        return f4876f;
    }

    @Nullable
    /* renamed from: b */
    public Intent mo32343b(@Nullable Context context, int i, @Nullable String str) {
        return super.mo32343b(context, i, str);
    }

    @Nullable
    /* renamed from: c */
    public PendingIntent mo32344c(@NonNull Context context, int i, int i2) {
        return super.mo32344c(context, i, i2);
    }

    @NonNull
    /* renamed from: e */
    public final String mo32345e(int i) {
        return super.mo32345e(i);
    }

    /* renamed from: g */
    public int mo32346g(@NonNull Context context) {
        return super.mo32346g(context);
    }

    /* renamed from: h */
    public int mo32347h(@NonNull Context context, int i) {
        return super.mo32347h(context, i);
    }

    /* renamed from: j */
    public final boolean mo32348j(int i) {
        return super.mo32348j(i);
    }

    @Nullable
    /* renamed from: l */
    public Dialog mo32349l(@NonNull Activity activity, int i, int i2, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        return mo32353q(activity, i, C9678e0.m20209b(activity, mo32343b(activity, i, Constants.APPBOY_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE), i2), onCancelListener);
    }

    @Nullable
    /* renamed from: m */
    public PendingIntent mo32350m(@NonNull Context context, @NonNull ConnectionResult connectionResult) {
        if (connectionResult.mo32337H()) {
            return connectionResult.mo32336G();
        }
        return mo32344c(context, connectionResult.mo32334A(), 0);
    }

    /* renamed from: o */
    public boolean mo32351o(@NonNull Activity activity, int i, int i2, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        Dialog l = mo32349l(activity, i, i2, onCancelListener);
        if (l == null) {
            return false;
        }
        mo32356t(activity, l, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: p */
    public void mo32352p(@NonNull Context context, int i) {
        mo32357u(context, i, (String) null, mo32362d(context, i, 0, Constants.APPBOY_PUSH_CUSTOM_NOTIFICATION_ID));
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: q */
    public final Dialog mo32353q(@NonNull Context context, int i, C9678e0 e0Var, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(C9663b0.m20106d(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String c = C9663b0.m20105c(context, i);
        if (c != null) {
            builder.setPositiveButton(c, e0Var);
        }
        String g = C9663b0.m20109g(context, i);
        if (g != null) {
            builder.setTitle(g);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", new Object[]{Integer.valueOf(i)}), new IllegalArgumentException());
        return builder.create();
    }

    @NonNull
    /* renamed from: r */
    public final Dialog mo32354r(@NonNull Activity activity, @NonNull DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, (AttributeSet) null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(C9663b0.m20106d(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        mo32356t(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    @Nullable
    /* renamed from: s */
    public final C9246s mo32355s(Context context, C9245r rVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C9246s sVar = new C9246s(rVar);
        context.registerReceiver(sVar, intentFilter);
        sVar.mo43540a(context);
        if (mo32363i(context, "com.google.android.gms")) {
            return sVar;
        }
        rVar.mo32526a();
        sVar.mo43541b();
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final void mo32356t(Activity activity, Dialog dialog, String str, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                C8978g.m18226M0(dialog, onCancelListener).show(((FragmentActivity) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        C8972b.m18211a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo32357u(Context context, int i, @Nullable String str, @Nullable PendingIntent pendingIntent) {
        int i2;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", new Object[]{Integer.valueOf(i), null}), new IllegalArgumentException());
        if (i == 18) {
            mo32358v(context);
        } else if (pendingIntent != null) {
            String f = C9663b0.m20108f(context, i);
            String e = C9663b0.m20107e(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) C9713p.m20275j(context.getSystemService("notification"));
            NotificationCompat.Builder style = new NotificationCompat.Builder(context).setLocalOnly(true).setAutoCancel(true).setContentTitle(f).setStyle(new NotificationCompat.BigTextStyle().bigText(e));
            if (C10675i.m22685c(context)) {
                C9713p.m20278m(C10680n.m22701e());
                style.setSmallIcon(context.getApplicationInfo().icon).setPriority(2);
                if (C10675i.m22686d(context)) {
                    style.addAction(C7772a.f10795a, resources.getString(C7773b.f10810o), pendingIntent);
                } else {
                    style.setContentIntent(pendingIntent);
                }
            } else {
                style.setSmallIcon(17301642).setTicker(resources.getString(C7773b.f10803h)).setWhen(System.currentTimeMillis()).setContentIntent(pendingIntent).setContentText(e);
            }
            if (C10680n.m22704h()) {
                C9713p.m20278m(C10680n.m22704h());
                synchronized (f4875e) {
                    str2 = this.f4877c;
                }
                if (str2 == null) {
                    str2 = "com.google.android.gms.availability";
                    NotificationChannel a = notificationManager.getNotificationChannel(str2);
                    String b = C9663b0.m20104b(context);
                    if (a == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel(str2, b, 4));
                    } else if (!b.contentEquals(a.getName())) {
                        a.setName(b);
                        notificationManager.createNotificationChannel(a);
                    }
                }
                style.setChannelId(str2);
            }
            Notification build = style.build();
            if (i == 1 || i == 2 || i == 3) {
                C4785c.f5064b.set(false);
                i2 = 10436;
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, build);
        } else if (i == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo32358v(Context context) {
        new C4786d(this, context).sendEmptyMessageDelayed(1, 120000);
    }

    /* renamed from: w */
    public final boolean mo32359w(@NonNull Activity activity, @NonNull C9226f fVar, int i, int i2, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        Dialog q = mo32353q(activity, i, C9678e0.m20210c(fVar, mo32343b(activity, i, Constants.APPBOY_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE), 2), onCancelListener);
        if (q == null) {
            return false;
        }
        mo32356t(activity, q, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: x */
    public final boolean mo32360x(@NonNull Context context, @NonNull ConnectionResult connectionResult, int i) {
        PendingIntent m;
        if (C2204b.m1796a(context) || (m = mo32350m(context, connectionResult)) == null) {
            return false;
        }
        mo32357u(context, connectionResult.mo32334A(), (String) null, C8184e.m16197a(context, 0, GoogleApiActivity.m6407a(context, m, i, true), C8184e.f11507a | 134217728));
        return true;
    }
}
