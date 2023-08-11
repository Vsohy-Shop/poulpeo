package com.google.android.play.core.assetpacks;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import p037b6.C2900e;

public class AssetPackExtractionService extends Service {

    /* renamed from: b */
    private final C2900e f8551b = new C2900e("AssetPackExtractionService");

    /* renamed from: c */
    Context f8552c;

    /* renamed from: d */
    C6767s2 f8553d;

    /* renamed from: e */
    C6792z f8554e;

    /* renamed from: f */
    private C6784x f8555f;

    /* renamed from: g */
    private NotificationManager f8556g;

    /* renamed from: c */
    private final synchronized void m11319c(Bundle bundle) {
        Notification.Builder builder;
        String string = bundle.getString("notification_title");
        String string2 = bundle.getString("notification_subtext");
        long j = bundle.getLong("notification_timeout");
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("notification_on_click_intent");
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            builder = new Notification.Builder(this.f8552c, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(j);
        } else {
            builder = new Notification.Builder(this.f8552c).setPriority(-2);
        }
        if (pendingIntent != null) {
            builder.setContentIntent(pendingIntent);
        }
        builder.setSmallIcon(17301633).setOngoing(false).setContentTitle(string).setSubText(string2);
        builder.setColor(bundle.getInt("notification_color")).setVisibility(-1);
        Notification build = builder.build();
        this.f8551b.mo28424f("Starting foreground service.", new Object[0]);
        this.f8553d.mo39361b(true);
        if (i >= 26) {
            this.f8556g.createNotificationChannel(new NotificationChannel("playcore-assetpacks-service-notification-channel", bundle.getString("notification_channel_name"), 2));
        }
        startForeground(-1883842196, build);
    }

    /* renamed from: a */
    public final synchronized Bundle mo39248a(Bundle bundle) {
        int i = bundle.getInt("action_type");
        C2900e eVar = this.f8551b;
        Integer valueOf = Integer.valueOf(i);
        eVar.mo28421c("updateServiceState: %d", valueOf);
        if (i == 1) {
            m11319c(bundle);
        } else if (i == 2) {
            mo39249b();
        } else {
            this.f8551b.mo28423e("Unknown action type received: %d", valueOf);
        }
        return new Bundle();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo39249b() {
        this.f8551b.mo28424f("Stopping service.", new Object[0]);
        this.f8553d.mo39361b(false);
        stopForeground(true);
        stopSelf();
    }

    public final IBinder onBind(Intent intent) {
        return this.f8555f;
    }

    public final void onCreate() {
        super.onCreate();
        this.f8551b.mo28421c("onCreate", new Object[0]);
        C6770t1.m11532b(getApplicationContext()).mo39335a(this);
        this.f8555f = new C6784x(this.f8552c, this, this.f8554e);
        this.f8556g = (NotificationManager) this.f8552c.getSystemService("notification");
    }
}
