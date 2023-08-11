package com.google.android.gms.cast.framework.media;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.core.app.TaskStackBuilder;
import androidx.media.app.NotificationCompat;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.internal.cast.C4951i0;
import com.google.android.gms.internal.cast.C5009l7;
import com.google.android.gms.internal.cast.C5066od;
import java.util.ArrayList;
import java.util.List;
import p109h4.C7931g;
import p120i4.C8116a;
import p120i4.C8119b;
import p120i4.C8149l;
import p130j4.C8396b;
import p130j4.C8413s;
import p150l4.C8673a;
import p150l4.C8675b;
import p220s4.C9493a;
import p231t4.C9713p;
import p286y4.C10680n;

/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public class MediaNotificationService extends Service {

    /* renamed from: q */
    private static final C8675b f4633q = new C8675b("MediaNotificationService");
    @Nullable

    /* renamed from: r */
    private static Runnable f4634r;

    /* renamed from: b */
    private C4646g f4635b;
    @Nullable

    /* renamed from: c */
    private C4637c f4636c;

    /* renamed from: d */
    private ComponentName f4637d;
    @Nullable

    /* renamed from: e */
    private ComponentName f4638e;

    /* renamed from: f */
    private List f4639f = new ArrayList();
    @Nullable

    /* renamed from: g */
    private int[] f4640g;

    /* renamed from: h */
    private long f4641h;

    /* renamed from: i */
    private C8396b f4642i;

    /* renamed from: j */
    private C4635b f4643j;

    /* renamed from: k */
    private Resources f4644k;

    /* renamed from: l */
    private C4670p0 f4645l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C4672q0 f4646m;

    /* renamed from: n */
    private NotificationManager f4647n;

    /* renamed from: o */
    private Notification f4648o;

    /* renamed from: p */
    private C8116a f4649p;

    /* renamed from: a */
    public static boolean m6075a(@NonNull C8119b bVar) {
        C4646g I;
        int i;
        int length;
        C4633a A = bVar.mo41983A();
        if (A == null || (I = A.mo32067I()) == null) {
            return false;
        }
        C4658j0 j0 = I.mo32143j0();
        if (j0 == null) {
            return true;
        }
        List e = C8413s.m16834e(j0);
        int[] f = C8413s.m16835f(j0);
        if (e == null) {
            i = 0;
        } else {
            i = e.size();
        }
        Class<C4644f> cls = C4644f.class;
        if (e == null || e.isEmpty()) {
            f4633q.mo42756c(cls.getSimpleName().concat(" doesn't provide any action."), new Object[0]);
        } else if (e.size() > 5) {
            f4633q.mo42756c(cls.getSimpleName().concat(" provides more than 5 actions."), new Object[0]);
        } else if (f == null || (length = f.length) == 0) {
            f4633q.mo42756c(cls.getSimpleName().concat(" doesn't provide any actions for compact view."), new Object[0]);
        } else {
            int i2 = 0;
            while (i2 < length) {
                int i3 = f[i2];
                if (i3 < 0 || i3 >= i) {
                    f4633q.mo42756c(cls.getSimpleName().concat("provides a compact view action whose index is out of bounds."), new Object[0]);
                } else {
                    i2++;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static void m6078d() {
        Runnable runnable = f4634r;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    @androidx.annotation.Nullable
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final androidx.core.app.NotificationCompat.Action m6079e(java.lang.String r15) {
        /*
            r14 = this;
            int r0 = r15.hashCode()
            r1 = 2
            java.lang.String r2 = "com.google.android.gms.cast.framework.action.FORWARD"
            java.lang.String r3 = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK"
            java.lang.String r4 = "com.google.android.gms.cast.framework.action.DISCONNECT"
            java.lang.String r5 = "com.google.android.gms.cast.framework.action.STOP_CASTING"
            java.lang.String r6 = "com.google.android.gms.cast.framework.action.SKIP_PREV"
            java.lang.String r7 = "com.google.android.gms.cast.framework.action.SKIP_NEXT"
            java.lang.String r8 = "com.google.android.gms.cast.framework.action.REWIND"
            r9 = 1
            r10 = 0
            switch(r0) {
                case -1699820260: goto L_0x0049;
                case -945151566: goto L_0x0041;
                case -945080078: goto L_0x0039;
                case -668151673: goto L_0x0031;
                case -124479363: goto L_0x0029;
                case 235550565: goto L_0x0021;
                case 1362116196: goto L_0x0019;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x0051
        L_0x0019:
            boolean r0 = r15.equals(r2)
            if (r0 == 0) goto L_0x0051
            r0 = 3
            goto L_0x0052
        L_0x0021:
            boolean r0 = r15.equals(r3)
            if (r0 == 0) goto L_0x0051
            r0 = r10
            goto L_0x0052
        L_0x0029:
            boolean r0 = r15.equals(r4)
            if (r0 == 0) goto L_0x0051
            r0 = 6
            goto L_0x0052
        L_0x0031:
            boolean r0 = r15.equals(r5)
            if (r0 == 0) goto L_0x0051
            r0 = 5
            goto L_0x0052
        L_0x0039:
            boolean r0 = r15.equals(r6)
            if (r0 == 0) goto L_0x0051
            r0 = r1
            goto L_0x0052
        L_0x0041:
            boolean r0 = r15.equals(r7)
            if (r0 == 0) goto L_0x0051
            r0 = r9
            goto L_0x0052
        L_0x0049:
            boolean r0 = r15.equals(r8)
            if (r0 == 0) goto L_0x0051
            r0 = 4
            goto L_0x0052
        L_0x0051:
            r0 = -1
        L_0x0052:
            r11 = 134217728(0x8000000, float:3.85186E-34)
            java.lang.String r12 = "googlecast-extra_skip_step_ms"
            r13 = 0
            switch(r0) {
                case 0: goto L_0x018c;
                case 1: goto L_0x015a;
                case 2: goto L_0x0128;
                case 3: goto L_0x00f6;
                case 4: goto L_0x00c4;
                case 5: goto L_0x0098;
                case 6: goto L_0x0066;
                default: goto L_0x005a;
            }
        L_0x005a:
            l4.b r0 = f4633q
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r10] = r15
            java.lang.String r15 = "Action: %s is not a pre-defined action."
            r0.mo42756c(r15, r1)
            return r13
        L_0x0066:
            android.content.Intent r15 = new android.content.Intent
            r15.<init>(r4)
            android.content.ComponentName r0 = r14.f4637d
            r15.setComponent(r0)
            int r0 = com.google.android.gms.internal.cast.C4951i0.f5249a
            android.app.PendingIntent r15 = android.app.PendingIntent.getBroadcast(r14, r10, r15, r0)
            androidx.core.app.NotificationCompat$Action$Builder r0 = new androidx.core.app.NotificationCompat$Action$Builder
            com.google.android.gms.cast.framework.media.g r1 = r14.f4635b
            int r1 = r1.mo32115H()
            android.content.res.Resources r2 = r14.f4644k
            com.google.android.gms.cast.framework.media.g r3 = r14.f4635b
            int r3 = r3.mo32131X()
            java.lang.Object[] r4 = new java.lang.Object[r9]
            java.lang.String r5 = ""
            r4[r10] = r5
            java.lang.String r2 = r2.getString(r3, r4)
            r0.<init>((int) r1, (java.lang.CharSequence) r2, (android.app.PendingIntent) r15)
            androidx.core.app.NotificationCompat$Action r15 = r0.build()
            return r15
        L_0x0098:
            android.content.Intent r15 = new android.content.Intent
            r15.<init>(r5)
            android.content.ComponentName r0 = r14.f4637d
            r15.setComponent(r0)
            int r0 = com.google.android.gms.internal.cast.C4951i0.f5249a
            android.app.PendingIntent r15 = android.app.PendingIntent.getBroadcast(r14, r10, r15, r0)
            androidx.core.app.NotificationCompat$Action$Builder r0 = new androidx.core.app.NotificationCompat$Action$Builder
            com.google.android.gms.cast.framework.media.g r1 = r14.f4635b
            int r1 = r1.mo32115H()
            android.content.res.Resources r2 = r14.f4644k
            com.google.android.gms.cast.framework.media.g r3 = r14.f4635b
            int r3 = r3.mo32131X()
            java.lang.String r2 = r2.getString(r3)
            r0.<init>((int) r1, (java.lang.CharSequence) r2, (android.app.PendingIntent) r15)
            androidx.core.app.NotificationCompat$Action r15 = r0.build()
            return r15
        L_0x00c4:
            long r0 = r14.f4641h
            android.content.Intent r15 = new android.content.Intent
            r15.<init>(r8)
            android.content.ComponentName r2 = r14.f4637d
            r15.setComponent(r2)
            r15.putExtra(r12, r0)
            int r2 = com.google.android.gms.internal.cast.C4951i0.f5249a
            r2 = r2 | r11
            android.app.PendingIntent r15 = android.app.PendingIntent.getBroadcast(r14, r10, r15, r2)
            com.google.android.gms.cast.framework.media.g r2 = r14.f4635b
            int r2 = p130j4.C8413s.m16832c(r2, r0)
            com.google.android.gms.cast.framework.media.g r3 = r14.f4635b
            int r0 = p130j4.C8413s.m16833d(r3, r0)
            androidx.core.app.NotificationCompat$Action$Builder r1 = new androidx.core.app.NotificationCompat$Action$Builder
            android.content.res.Resources r3 = r14.f4644k
            java.lang.String r0 = r3.getString(r0)
            r1.<init>((int) r2, (java.lang.CharSequence) r0, (android.app.PendingIntent) r15)
            androidx.core.app.NotificationCompat$Action r15 = r1.build()
            return r15
        L_0x00f6:
            long r0 = r14.f4641h
            android.content.Intent r15 = new android.content.Intent
            r15.<init>(r2)
            android.content.ComponentName r2 = r14.f4637d
            r15.setComponent(r2)
            r15.putExtra(r12, r0)
            int r2 = com.google.android.gms.internal.cast.C4951i0.f5249a
            r2 = r2 | r11
            android.app.PendingIntent r15 = android.app.PendingIntent.getBroadcast(r14, r10, r15, r2)
            com.google.android.gms.cast.framework.media.g r2 = r14.f4635b
            int r2 = p130j4.C8413s.m16830a(r2, r0)
            com.google.android.gms.cast.framework.media.g r3 = r14.f4635b
            int r0 = p130j4.C8413s.m16831b(r3, r0)
            androidx.core.app.NotificationCompat$Action$Builder r1 = new androidx.core.app.NotificationCompat$Action$Builder
            android.content.res.Resources r3 = r14.f4644k
            java.lang.String r0 = r3.getString(r0)
            r1.<init>((int) r2, (java.lang.CharSequence) r0, (android.app.PendingIntent) r15)
            androidx.core.app.NotificationCompat$Action r15 = r1.build()
            return r15
        L_0x0128:
            com.google.android.gms.cast.framework.media.p0 r15 = r14.f4645l
            boolean r15 = r15.f4760g
            if (r15 == 0) goto L_0x013e
            android.content.Intent r15 = new android.content.Intent
            r15.<init>(r6)
            android.content.ComponentName r0 = r14.f4637d
            r15.setComponent(r0)
            int r0 = com.google.android.gms.internal.cast.C4951i0.f5249a
            android.app.PendingIntent r13 = android.app.PendingIntent.getBroadcast(r14, r10, r15, r0)
        L_0x013e:
            androidx.core.app.NotificationCompat$Action$Builder r15 = new androidx.core.app.NotificationCompat$Action$Builder
            com.google.android.gms.cast.framework.media.g r0 = r14.f4635b
            int r0 = r0.mo32125R()
            android.content.res.Resources r1 = r14.f4644k
            com.google.android.gms.cast.framework.media.g r2 = r14.f4635b
            int r2 = r2.mo32142i0()
            java.lang.String r1 = r1.getString(r2)
            r15.<init>((int) r0, (java.lang.CharSequence) r1, (android.app.PendingIntent) r13)
            androidx.core.app.NotificationCompat$Action r15 = r15.build()
            return r15
        L_0x015a:
            com.google.android.gms.cast.framework.media.p0 r15 = r14.f4645l
            boolean r15 = r15.f4759f
            if (r15 == 0) goto L_0x0170
            android.content.Intent r15 = new android.content.Intent
            r15.<init>(r7)
            android.content.ComponentName r0 = r14.f4637d
            r15.setComponent(r0)
            int r0 = com.google.android.gms.internal.cast.C4951i0.f5249a
            android.app.PendingIntent r13 = android.app.PendingIntent.getBroadcast(r14, r10, r15, r0)
        L_0x0170:
            androidx.core.app.NotificationCompat$Action$Builder r15 = new androidx.core.app.NotificationCompat$Action$Builder
            com.google.android.gms.cast.framework.media.g r0 = r14.f4635b
            int r0 = r0.mo32124Q()
            android.content.res.Resources r1 = r14.f4644k
            com.google.android.gms.cast.framework.media.g r2 = r14.f4635b
            int r2 = r2.mo32141h0()
            java.lang.String r1 = r1.getString(r2)
            r15.<init>((int) r0, (java.lang.CharSequence) r1, (android.app.PendingIntent) r13)
            androidx.core.app.NotificationCompat$Action r15 = r15.build()
            return r15
        L_0x018c:
            com.google.android.gms.cast.framework.media.p0 r15 = r14.f4645l
            int r0 = r15.f4756c
            boolean r15 = r15.f4755b
            if (r0 != r1) goto L_0x01a1
            com.google.android.gms.cast.framework.media.g r0 = r14.f4635b
            int r0 = r0.mo32128U()
            com.google.android.gms.cast.framework.media.g r1 = r14.f4635b
            int r1 = r1.mo32129V()
            goto L_0x01ad
        L_0x01a1:
            com.google.android.gms.cast.framework.media.g r0 = r14.f4635b
            int r0 = r0.mo32119L()
            com.google.android.gms.cast.framework.media.g r1 = r14.f4635b
            int r1 = r1.mo32136c0()
        L_0x01ad:
            if (r15 != 0) goto L_0x01b5
            com.google.android.gms.cast.framework.media.g r0 = r14.f4635b
            int r0 = r0.mo32120M()
        L_0x01b5:
            if (r15 != 0) goto L_0x01bd
            com.google.android.gms.cast.framework.media.g r15 = r14.f4635b
            int r1 = r15.mo32137d0()
        L_0x01bd:
            android.content.Intent r15 = new android.content.Intent
            r15.<init>(r3)
            android.content.ComponentName r2 = r14.f4637d
            r15.setComponent(r2)
            int r2 = com.google.android.gms.internal.cast.C4951i0.f5249a
            android.app.PendingIntent r15 = android.app.PendingIntent.getBroadcast(r14, r10, r15, r2)
            androidx.core.app.NotificationCompat$Action$Builder r2 = new androidx.core.app.NotificationCompat$Action$Builder
            android.content.res.Resources r3 = r14.f4644k
            java.lang.String r1 = r3.getString(r1)
            r2.<init>((int) r0, (java.lang.CharSequence) r1, (android.app.PendingIntent) r15)
            androidx.core.app.NotificationCompat$Action r15 = r2.build()
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.media.MediaNotificationService.m6079e(java.lang.String):androidx.core.app.NotificationCompat$Action");
    }

    /* renamed from: f */
    private final void m6080f(C4658j0 j0Var) {
        int[] iArr;
        NotificationCompat.Action action;
        int[] f = C8413s.m16835f(j0Var);
        if (f == null) {
            iArr = null;
        } else {
            iArr = (int[]) f.clone();
        }
        this.f4640g = iArr;
        List<C4642e> e = C8413s.m16834e(j0Var);
        this.f4639f = new ArrayList();
        if (e != null) {
            for (C4642e eVar : e) {
                String A = eVar.mo32092A();
                if (A.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || A.equals(MediaIntentReceiver.ACTION_SKIP_NEXT) || A.equals(MediaIntentReceiver.ACTION_SKIP_PREV) || A.equals(MediaIntentReceiver.ACTION_FORWARD) || A.equals(MediaIntentReceiver.ACTION_REWIND) || A.equals(MediaIntentReceiver.ACTION_STOP_CASTING) || A.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    action = m6079e(eVar.mo32092A());
                } else {
                    Intent intent = new Intent(eVar.mo32092A());
                    intent.setComponent(this.f4637d);
                    action = new NotificationCompat.Action.Builder(eVar.mo32094G(), (CharSequence) eVar.mo32093F(), PendingIntent.getBroadcast(this, 0, intent, C4951i0.f5249a)).build();
                }
                if (action != null) {
                    this.f4639f.add(action);
                }
            }
        }
    }

    /* renamed from: g */
    private final void m6081g() {
        this.f4639f = new ArrayList();
        for (String e : this.f4635b.mo32112A()) {
            NotificationCompat.Action e2 = m6079e(e);
            if (e2 != null) {
                this.f4639f.add(e2);
            }
        }
        this.f4640g = (int[]) this.f4635b.mo32114G().clone();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m6082h() {
        Bitmap bitmap;
        if (this.f4645l != null) {
            C4672q0 q0Var = this.f4646m;
            PendingIntent pendingIntent = null;
            if (q0Var == null) {
                bitmap = null;
            } else {
                bitmap = q0Var.f4764b;
            }
            NotificationCompat.Builder visibility = new NotificationCompat.Builder((Context) this, "cast_media_notification").setLargeIcon(bitmap).setSmallIcon(this.f4635b.mo32127T()).setContentTitle(this.f4645l.f4757d).setContentText(this.f4644k.getString(this.f4635b.mo32113F(), new Object[]{this.f4645l.f4758e})).setOngoing(true).setShowWhen(false).setVisibility(1);
            ComponentName componentName = this.f4638e;
            if (componentName != null) {
                Intent intent = new Intent();
                intent.putExtra("targetActivity", componentName);
                intent.setAction(componentName.flattenToString());
                intent.setComponent(componentName);
                TaskStackBuilder create = TaskStackBuilder.create(this);
                create.addNextIntentWithParentStack(intent);
                pendingIntent = create.getPendingIntent(1, C4951i0.f5249a | 134217728);
            }
            if (pendingIntent != null) {
                visibility.setContentIntent(pendingIntent);
            }
            C4658j0 j0 = this.f4635b.mo32143j0();
            if (j0 != null) {
                f4633q.mo42758e("actionsProvider != null", new Object[0]);
                m6080f(j0);
            } else {
                f4633q.mo42758e("actionsProvider == null", new Object[0]);
                m6081g();
            }
            for (NotificationCompat.Action addAction : this.f4639f) {
                visibility.addAction(addAction);
            }
            NotificationCompat.MediaStyle mediaStyle = new NotificationCompat.MediaStyle();
            int[] iArr = this.f4640g;
            if (iArr != null) {
                mediaStyle.setShowActionsInCompactView(iArr);
            }
            MediaSessionCompat.Token token = this.f4645l.f4754a;
            if (token != null) {
                mediaStyle.setMediaSession(token);
            }
            visibility.setStyle(mediaStyle);
            Notification build = visibility.build();
            this.f4648o = build;
            startForeground(1, build);
        }
    }

    @Nullable
    public IBinder onBind(@NonNull Intent intent) {
        return null;
    }

    public void onCreate() {
        this.f4647n = (NotificationManager) getSystemService("notification");
        C8116a d = C8116a.m15986d(this);
        this.f4649p = d;
        C4633a aVar = (C4633a) C9713p.m20275j(d.mo41971a().mo41983A());
        this.f4635b = (C4646g) C9713p.m20275j(aVar.mo32067I());
        this.f4636c = aVar.mo32064F();
        this.f4644k = getResources();
        this.f4637d = new ComponentName(getApplicationContext(), aVar.mo32065G());
        if (!TextUtils.isEmpty(this.f4635b.mo32130W())) {
            this.f4638e = new ComponentName(getApplicationContext(), this.f4635b.mo32130W());
        } else {
            this.f4638e = null;
        }
        this.f4641h = this.f4635b.mo32126S();
        int dimensionPixelSize = this.f4644k.getDimensionPixelSize(this.f4635b.mo32135b0());
        this.f4643j = new C4635b(1, dimensionPixelSize, dimensionPixelSize);
        this.f4642i = new C8396b(getApplicationContext(), this.f4643j);
        if (C10680n.m22704h()) {
            NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", getResources().getString(C8149l.media_notification_channel_name), 2);
            notificationChannel.setShowBadge(false);
            this.f4647n.createNotificationChannel(notificationChannel);
        }
        C5066od.m7339d(C5009l7.CAF_NOTIFICATION_SERVICE);
    }

    public void onDestroy() {
        C8396b bVar = this.f4642i;
        if (bVar != null) {
            bVar.mo42414a();
        }
        f4634r = null;
        this.f4647n.cancel(1);
    }

    public int onStartCommand(@NonNull Intent intent, int i, int i2) {
        boolean z;
        C9493a aVar;
        C4670p0 p0Var;
        Intent intent2 = intent;
        MediaInfo mediaInfo = (MediaInfo) C9713p.m20275j((MediaInfo) intent2.getParcelableExtra("extra_media_info"));
        C7931g gVar = (C7931g) C9713p.m20275j(mediaInfo.mo31925N());
        int intExtra = intent2.getIntExtra("extra_remote_media_client_player_state", 0);
        CastDevice castDevice = (CastDevice) C9713p.m20275j((CastDevice) intent2.getParcelableExtra("extra_cast_device"));
        if (intExtra == 2) {
            z = true;
        } else {
            z = false;
        }
        C4670p0 p0Var2 = new C4670p0(z, mediaInfo.mo31928Q(), gVar.mo41710G("com.google.android.gms.cast.metadata.TITLE"), castDevice.mo31898G(), (MediaSessionCompat.Token) intent2.getParcelableExtra("extra_media_session_token"), intent2.getBooleanExtra("extra_can_skip_next", false), intent2.getBooleanExtra("extra_can_skip_prev", false));
        if (intent2.getBooleanExtra("extra_media_notification_force_update", false) || (p0Var = this.f4645l) == null || p0Var2.f4755b != p0Var.f4755b || p0Var2.f4756c != p0Var.f4756c || !C8673a.m17455n(p0Var2.f4757d, p0Var.f4757d) || !C8673a.m17455n(p0Var2.f4758e, p0Var.f4758e) || p0Var2.f4759f != p0Var.f4759f || p0Var2.f4760g != p0Var.f4760g) {
            this.f4645l = p0Var2;
            m6082h();
        }
        C4637c cVar = this.f4636c;
        if (cVar != null) {
            aVar = cVar.mo32080b(gVar, this.f4643j);
        } else if (gVar.mo41711H()) {
            aVar = gVar.mo41708A().get(0);
        } else {
            aVar = null;
        }
        C4672q0 q0Var = new C4672q0(aVar);
        C4672q0 q0Var2 = this.f4646m;
        if (q0Var2 == null || !C8673a.m17455n(q0Var.f4763a, q0Var2.f4763a)) {
            this.f4642i.mo42416c(new C4668o0(this, q0Var));
            this.f4642i.mo42417d(q0Var.f4763a);
        }
        startForeground(1, this.f4648o);
        f4634r = new C4666n0(this, i2);
        return 2;
    }
}
