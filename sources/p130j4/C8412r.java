package p130j4;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p001v4.media.MediaMetadataCompat;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.support.p001v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media.utils.MediaConstants;
import androidx.mediarouter.media.MediaItemMetadata;
import com.google.android.gms.cast.C4689g;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.cast.framework.media.C4633a;
import com.google.android.gms.cast.framework.media.C4637c;
import com.google.android.gms.cast.framework.media.C4642e;
import com.google.android.gms.cast.framework.media.C4646g;
import com.google.android.gms.cast.framework.media.C4648h;
import com.google.android.gms.cast.framework.media.C4658j0;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.google.android.gms.cast.framework.media.MediaNotificationService;
import com.google.android.gms.internal.cast.C4829b0;
import com.google.android.gms.internal.cast.C4951i0;
import com.google.android.gms.internal.cast.C4968j0;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p109h4.C7931g;
import p120i4.C8116a;
import p120i4.C8119b;
import p120i4.C8149l;
import p120i4.C8158p;
import p150l4.C8675b;
import p220s4.C9493a;
import p231t4.C9713p;
import p286y4.C10680n;

/* renamed from: j4.r */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final class C8412r {
    /* access modifiers changed from: private */

    /* renamed from: v */
    public static final C8675b f11963v = new C8675b("MediaSessionManager");
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f11964a;

    /* renamed from: b */
    private final C8119b f11965b;

    /* renamed from: c */
    private final C4829b0 f11966c;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: d */
    public final C8158p f11967d;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: e */
    public final C4646g f11968e;
    @Nullable

    /* renamed from: f */
    private final ComponentName f11969f;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: g */
    public final ComponentName f11970g;

    /* renamed from: h */
    private final C8396b f11971h;

    /* renamed from: i */
    private final C8396b f11972i;

    /* renamed from: j */
    private final Handler f11973j;

    /* renamed from: k */
    private final Runnable f11974k;

    /* renamed from: l */
    private final C4648h.C4649a f11975l;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: m */
    public C4648h f11976m;
    @Nullable

    /* renamed from: n */
    private CastDevice f11977n;
    @Nullable

    /* renamed from: o */
    private MediaSessionCompat f11978o;
    @Nullable

    /* renamed from: p */
    private MediaSessionCompat.C0064b f11979p;

    /* renamed from: q */
    private boolean f11980q;
    @Nullable

    /* renamed from: r */
    private PlaybackStateCompat.CustomAction f11981r;
    @Nullable

    /* renamed from: s */
    private PlaybackStateCompat.CustomAction f11982s;
    @Nullable

    /* renamed from: t */
    private PlaybackStateCompat.CustomAction f11983t;
    @Nullable

    /* renamed from: u */
    private PlaybackStateCompat.CustomAction f11984u;

    public C8412r(Context context, C8119b bVar, C4829b0 b0Var) {
        C8158p pVar;
        C4646g gVar;
        String str;
        ComponentName componentName;
        String str2;
        this.f11964a = context;
        this.f11965b = bVar;
        this.f11966c = b0Var;
        C8116a c = C8116a.m15985c();
        ComponentName componentName2 = null;
        if (c != null) {
            pVar = c.mo41972b();
        } else {
            pVar = null;
        }
        this.f11967d = pVar;
        C4633a A = bVar.mo41983A();
        if (A == null) {
            gVar = null;
        } else {
            gVar = A.mo32067I();
        }
        this.f11968e = gVar;
        this.f11975l = new C8411q(this, (C8410p) null);
        if (A == null) {
            str = null;
        } else {
            str = A.mo32063A();
        }
        if (!TextUtils.isEmpty(str)) {
            componentName = new ComponentName(context, str);
        } else {
            componentName = null;
        }
        this.f11969f = componentName;
        if (A == null) {
            str2 = null;
        } else {
            str2 = A.mo32065G();
        }
        this.f11970g = !TextUtils.isEmpty(str2) ? new ComponentName(context, str2) : componentName2;
        C8396b bVar2 = new C8396b(context);
        this.f11971h = bVar2;
        bVar2.mo42416c(new C8407m(this));
        C8396b bVar3 = new C8396b(context);
        this.f11972i = bVar3;
        bVar3.mo42416c(new C8408n(this));
        this.f11973j = new C4968j0(Looper.getMainLooper());
        this.f11974k = new C8406l(this);
    }

    @Nullable
    /* renamed from: c */
    public static Bitmap m16808c(@Nullable Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f = (float) width;
        int i = (int) (((9.0f * f) / 16.0f) + 0.5f);
        float f2 = ((float) (i - height)) / 2.0f;
        RectF rectF = new RectF(0.0f, f2, f, ((float) height) + f2);
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, i, config);
        new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
        return createBitmap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0064  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long m16814n(java.lang.String r5, int r6, android.os.Bundle r7) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            r1 = -945151566(0xffffffffc7aa21b2, float:-87107.39)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x002a
            r1 = -945080078(0xffffffffc7ab38f2, float:-87665.89)
            if (r0 == r1) goto L_0x0020
            r1 = 235550565(0xe0a3765, float:1.7036485E-30)
            if (r0 == r1) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r0 = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0034
            r5 = 0
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "com.google.android.gms.cast.framework.action.SKIP_PREV"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0034
            r5 = r3
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "com.google.android.gms.cast.framework.action.SKIP_NEXT"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0034
            r5 = r2
            goto L_0x0035
        L_0x0034:
            r5 = -1
        L_0x0035:
            if (r5 == 0) goto L_0x0064
            r0 = 0
            if (r5 == r3) goto L_0x0051
            if (r5 == r2) goto L_0x003e
            goto L_0x0070
        L_0x003e:
            com.google.android.gms.cast.framework.media.h r5 = r4.f11976m
            if (r5 == 0) goto L_0x004b
            boolean r5 = r5.mo32158S()
            if (r5 == 0) goto L_0x004b
            r0 = 32
            goto L_0x0070
        L_0x004b:
            java.lang.String r5 = "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT"
            r7.putBoolean(r5, r3)
            return r0
        L_0x0051:
            com.google.android.gms.cast.framework.media.h r5 = r4.f11976m
            if (r5 == 0) goto L_0x005e
            boolean r5 = r5.mo32159T()
            if (r5 == 0) goto L_0x005e
            r0 = 16
            goto L_0x0070
        L_0x005e:
            java.lang.String r5 = "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS"
            r7.putBoolean(r5, r3)
            return r0
        L_0x0064:
            r5 = 3
            if (r6 != r5) goto L_0x006c
            r6 = 514(0x202, double:2.54E-321)
            r0 = r6
            r6 = r5
            goto L_0x006e
        L_0x006c:
            r0 = 512(0x200, double:2.53E-321)
        L_0x006e:
            if (r6 == r2) goto L_0x0071
        L_0x0070:
            return r0
        L_0x0071:
            r5 = 516(0x204, double:2.55E-321)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p130j4.C8412r.m16814n(java.lang.String, int, android.os.Bundle):long");
    }

    @Nullable
    /* renamed from: o */
    private final Uri m16815o(C7931g gVar, int i) {
        C4637c cVar;
        C9493a aVar;
        C4633a A = this.f11965b.mo41983A();
        if (A == null) {
            cVar = null;
        } else {
            cVar = A.mo32064F();
        }
        if (cVar != null) {
            aVar = cVar.mo32079a(gVar, i);
        } else if (gVar.mo41711H()) {
            aVar = gVar.mo41708A().get(0);
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return null;
        }
        return aVar.mo43938F();
    }

    /* renamed from: p */
    private final MediaMetadataCompat.C0043b m16816p() {
        MediaMetadataCompat mediaMetadataCompat;
        MediaSessionCompat mediaSessionCompat = this.f11978o;
        if (mediaSessionCompat == null) {
            mediaMetadataCompat = null;
        } else {
            mediaMetadataCompat = mediaSessionCompat.mo199c().mo140b();
        }
        if (mediaMetadataCompat == null) {
            return new MediaMetadataCompat.C0043b();
        }
        return new MediaMetadataCompat.C0043b(mediaMetadataCompat);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public final void m16817q(@Nullable Bitmap bitmap, int i) {
        String str;
        MediaSessionCompat mediaSessionCompat = this.f11978o;
        if (mediaSessionCompat != null) {
            if (i == 0) {
                str = "android.media.metadata.DISPLAY_ICON";
            } else {
                str = "android.media.metadata.ALBUM_ART";
            }
            if (bitmap == null) {
                bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                bitmap.eraseColor(0);
            }
            mediaSessionCompat.mo208m(m16816p().mo129b(str, bitmap).mo128a());
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m16818r(android.support.p001v4.media.session.PlaybackStateCompat.C0080d r9, java.lang.String r10, @androidx.annotation.Nullable com.google.android.gms.cast.framework.media.C4642e r11) {
        /*
            r8 = this;
            int r0 = r10.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            java.lang.String r4 = "com.google.android.gms.cast.framework.action.FORWARD"
            java.lang.String r5 = "com.google.android.gms.cast.framework.action.DISCONNECT"
            java.lang.String r6 = "com.google.android.gms.cast.framework.action.STOP_CASTING"
            java.lang.String r7 = "com.google.android.gms.cast.framework.action.REWIND"
            switch(r0) {
                case -1699820260: goto L_0x002b;
                case -668151673: goto L_0x0023;
                case -124479363: goto L_0x001b;
                case 1362116196: goto L_0x0013;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0033
        L_0x0013:
            boolean r0 = r10.equals(r4)
            if (r0 == 0) goto L_0x0033
            r0 = 0
            goto L_0x0034
        L_0x001b:
            boolean r0 = r10.equals(r5)
            if (r0 == 0) goto L_0x0033
            r0 = r1
            goto L_0x0034
        L_0x0023:
            boolean r0 = r10.equals(r6)
            if (r0 == 0) goto L_0x0033
            r0 = r2
            goto L_0x0034
        L_0x002b:
            boolean r0 = r10.equals(r7)
            if (r0 == 0) goto L_0x0033
            r0 = r3
            goto L_0x0034
        L_0x0033:
            r0 = -1
        L_0x0034:
            if (r0 == 0) goto L_0x00dd
            if (r0 == r3) goto L_0x00ad
            if (r0 == r2) goto L_0x0081
            if (r0 == r1) goto L_0x0054
            if (r11 == 0) goto L_0x0051
            android.support.v4.media.session.PlaybackStateCompat$CustomAction$b r0 = new android.support.v4.media.session.PlaybackStateCompat$CustomAction$b
            java.lang.String r1 = r11.mo32093F()
            int r11 = r11.mo32094G()
            r0.<init>(r10, r1, r11)
            android.support.v4.media.session.PlaybackStateCompat$CustomAction r10 = r0.mo387a()
            goto L_0x010c
        L_0x0051:
            r10 = 0
            goto L_0x010c
        L_0x0054:
            android.support.v4.media.session.PlaybackStateCompat$CustomAction r10 = r8.f11984u
            if (r10 != 0) goto L_0x007d
            com.google.android.gms.cast.framework.media.g r10 = r8.f11968e
            if (r10 == 0) goto L_0x007d
            android.support.v4.media.session.PlaybackStateCompat$CustomAction$b r10 = new android.support.v4.media.session.PlaybackStateCompat$CustomAction$b
            android.content.Context r11 = r8.f11964a
            android.content.res.Resources r11 = r11.getResources()
            com.google.android.gms.cast.framework.media.g r0 = r8.f11968e
            int r0 = r0.mo32131X()
            java.lang.String r11 = r11.getString(r0)
            com.google.android.gms.cast.framework.media.g r0 = r8.f11968e
            int r0 = r0.mo32115H()
            r10.<init>(r5, r11, r0)
            android.support.v4.media.session.PlaybackStateCompat$CustomAction r10 = r10.mo387a()
            r8.f11984u = r10
        L_0x007d:
            android.support.v4.media.session.PlaybackStateCompat$CustomAction r10 = r8.f11984u
            goto L_0x010c
        L_0x0081:
            android.support.v4.media.session.PlaybackStateCompat$CustomAction r10 = r8.f11983t
            if (r10 != 0) goto L_0x00aa
            com.google.android.gms.cast.framework.media.g r10 = r8.f11968e
            if (r10 == 0) goto L_0x00aa
            android.support.v4.media.session.PlaybackStateCompat$CustomAction$b r10 = new android.support.v4.media.session.PlaybackStateCompat$CustomAction$b
            android.content.Context r11 = r8.f11964a
            android.content.res.Resources r11 = r11.getResources()
            com.google.android.gms.cast.framework.media.g r0 = r8.f11968e
            int r0 = r0.mo32131X()
            java.lang.String r11 = r11.getString(r0)
            com.google.android.gms.cast.framework.media.g r0 = r8.f11968e
            int r0 = r0.mo32115H()
            r10.<init>(r6, r11, r0)
            android.support.v4.media.session.PlaybackStateCompat$CustomAction r10 = r10.mo387a()
            r8.f11983t = r10
        L_0x00aa:
            android.support.v4.media.session.PlaybackStateCompat$CustomAction r10 = r8.f11983t
            goto L_0x010c
        L_0x00ad:
            android.support.v4.media.session.PlaybackStateCompat$CustomAction r10 = r8.f11982s
            if (r10 != 0) goto L_0x00da
            com.google.android.gms.cast.framework.media.g r10 = r8.f11968e
            if (r10 == 0) goto L_0x00da
            long r10 = r10.mo32126S()
            com.google.android.gms.cast.framework.media.g r0 = r8.f11968e
            int r0 = p130j4.C8413s.m16833d(r0, r10)
            com.google.android.gms.cast.framework.media.g r1 = r8.f11968e
            int r10 = p130j4.C8413s.m16832c(r1, r10)
            android.support.v4.media.session.PlaybackStateCompat$CustomAction$b r11 = new android.support.v4.media.session.PlaybackStateCompat$CustomAction$b
            android.content.Context r1 = r8.f11964a
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r0 = r1.getString(r0)
            r11.<init>(r7, r0, r10)
            android.support.v4.media.session.PlaybackStateCompat$CustomAction r10 = r11.mo387a()
            r8.f11982s = r10
        L_0x00da:
            android.support.v4.media.session.PlaybackStateCompat$CustomAction r10 = r8.f11982s
            goto L_0x010c
        L_0x00dd:
            android.support.v4.media.session.PlaybackStateCompat$CustomAction r10 = r8.f11981r
            if (r10 != 0) goto L_0x010a
            com.google.android.gms.cast.framework.media.g r10 = r8.f11968e
            if (r10 == 0) goto L_0x010a
            long r10 = r10.mo32126S()
            com.google.android.gms.cast.framework.media.g r0 = r8.f11968e
            int r0 = p130j4.C8413s.m16831b(r0, r10)
            com.google.android.gms.cast.framework.media.g r1 = r8.f11968e
            int r10 = p130j4.C8413s.m16830a(r1, r10)
            android.support.v4.media.session.PlaybackStateCompat$CustomAction$b r11 = new android.support.v4.media.session.PlaybackStateCompat$CustomAction$b
            android.content.Context r1 = r8.f11964a
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r0 = r1.getString(r0)
            r11.<init>(r4, r0, r10)
            android.support.v4.media.session.PlaybackStateCompat$CustomAction r10 = r11.mo387a()
            r8.f11981r = r10
        L_0x010a:
            android.support.v4.media.session.PlaybackStateCompat$CustomAction r10 = r8.f11981r
        L_0x010c:
            if (r10 == 0) goto L_0x0111
            r9.mo392a(r10)
        L_0x0111:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p130j4.C8412r.m16818r(android.support.v4.media.session.PlaybackStateCompat$d, java.lang.String, com.google.android.gms.cast.framework.media.e):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a5 A[SYNTHETIC, Splitter:B:30:0x00a5] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b6  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m16819s(boolean r6) {
        /*
            r5 = this;
            com.google.android.gms.cast.CastDevice r0 = r5.f11977n
            if (r0 == 0) goto L_0x00bb
            i4.b r0 = r5.f11965b
            boolean r0 = com.google.android.gms.cast.framework.media.MediaNotificationService.m6075a(r0)
            if (r0 == 0) goto L_0x00bb
            com.google.android.gms.cast.framework.media.h r0 = r5.f11976m
            if (r0 != 0) goto L_0x0012
            goto L_0x00bb
        L_0x0012:
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r5.f11964a
            java.lang.Class<com.google.android.gms.cast.framework.media.MediaNotificationService> r3 = com.google.android.gms.cast.framework.media.MediaNotificationService.class
            r1.<init>(r2, r3)
            java.lang.String r2 = "extra_media_notification_force_update"
            r1.putExtra(r2, r6)
            android.content.Context r6 = r5.f11964a
            java.lang.String r6 = r6.getPackageName()
            r1.setPackage(r6)
            java.lang.String r6 = "com.google.android.gms.cast.framework.action.UPDATE_NOTIFICATION"
            r1.setAction(r6)
            java.lang.String r6 = "extra_media_info"
            com.google.android.gms.cast.MediaInfo r2 = r0.mo32165e()
            r1.putExtra(r6, r2)
            java.lang.String r6 = "extra_remote_media_client_player_state"
            int r2 = r0.mo32168h()
            r1.putExtra(r6, r2)
            java.lang.String r6 = "extra_cast_device"
            com.google.android.gms.cast.CastDevice r2 = r5.f11977n
            r1.putExtra(r6, r2)
            android.support.v4.media.session.MediaSessionCompat r6 = r5.f11978o
            if (r6 == 0) goto L_0x0054
            java.lang.String r2 = "extra_media_session_token"
            android.support.v4.media.session.MediaSessionCompat$Token r6 = r6.mo201e()
            r1.putExtra(r2, r6)
        L_0x0054:
            com.google.android.gms.cast.h r6 = r0.mo32166f()
            r0 = 0
            if (r6 == 0) goto L_0x008a
            int r2 = r6.mo32270U()
            r3 = 1
            if (r2 == r3) goto L_0x008b
            r4 = 2
            if (r2 == r4) goto L_0x008b
            r4 = 3
            if (r2 == r4) goto L_0x008b
            int r2 = r6.mo32256G()
            java.lang.Integer r2 = r6.mo32259J(r2)
            if (r2 == 0) goto L_0x008a
            int r4 = r2.intValue()
            if (r4 <= 0) goto L_0x007a
            r4 = r3
            goto L_0x007b
        L_0x007a:
            r4 = r0
        L_0x007b:
            int r2 = r2.intValue()
            int r6 = r6.mo32269T()
            int r6 = r6 + -1
            if (r2 >= r6) goto L_0x0088
            goto L_0x008c
        L_0x0088:
            r3 = r0
            goto L_0x008c
        L_0x008a:
            r3 = r0
        L_0x008b:
            r4 = r3
        L_0x008c:
            java.lang.String r6 = "extra_can_skip_next"
            r1.putExtra(r6, r3)
            java.lang.String r6 = "extra_can_skip_prev"
            r1.putExtra(r6, r4)
            l4.b r6 = f11963v
            java.lang.String r2 = "Starting notification service."
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r6.mo42754a(r2, r3)
            int r6 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r6 < r2) goto L_0x00b6
            android.content.Context r6 = r5.f11964a     // Catch:{ ForegroundServiceStartNotAllowedException -> 0x00ab }
            android.content.ComponentName unused = r6.startForegroundService(r1)     // Catch:{ ForegroundServiceStartNotAllowedException -> 0x00ab }
            return
        L_0x00ab:
            r6 = move-exception
            l4.b r1 = f11963v
            java.lang.String r2 = "Failed to start CAF media notification because app is in background"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1.mo42757d(r6, r2, r0)
            return
        L_0x00b6:
            android.content.Context r6 = r5.f11964a
            r6.startService(r1)
        L_0x00bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p130j4.C8412r.m16819s(boolean):void");
    }

    @RequiresNonNull({"appContext", "handler", "options"})
    /* renamed from: t */
    private final void m16820t(boolean z) {
        if (this.f11965b.mo41984F()) {
            Runnable runnable = this.f11974k;
            if (runnable != null) {
                this.f11973j.removeCallbacks(runnable);
            }
            Intent intent = new Intent(this.f11964a, ReconnectionService.class);
            intent.setPackage(this.f11964a.getPackageName());
            try {
                this.f11964a.startService(intent);
            } catch (IllegalStateException unused) {
                if (z) {
                    this.f11973j.postDelayed(this.f11974k, 1000);
                }
            }
        }
    }

    /* renamed from: u */
    private final void m16821u() {
        if (this.f11968e != null) {
            f11963v.mo42754a("Stopping notification service.", new Object[0]);
            if (Build.VERSION.SDK_INT >= 26) {
                MediaNotificationService.m6078d();
                return;
            }
            Intent intent = new Intent(this.f11964a, MediaNotificationService.class);
            intent.setPackage(this.f11964a.getPackageName());
            intent.setAction("com.google.android.gms.cast.framework.action.UPDATE_NOTIFICATION");
            this.f11964a.stopService(intent);
        }
    }

    /* renamed from: v */
    private final void m16822v() {
        if (this.f11965b.mo41984F()) {
            this.f11973j.removeCallbacks(this.f11974k);
            Intent intent = new Intent(this.f11964a, ReconnectionService.class);
            intent.setPackage(this.f11964a.getPackageName());
            this.f11964a.stopService(intent);
        }
    }

    /* renamed from: w */
    private final void m16823w(int i, @Nullable MediaInfo mediaInfo) {
        PlaybackStateCompat playbackStateCompat;
        MediaSessionCompat mediaSessionCompat;
        C7931g N;
        PendingIntent pendingIntent;
        long j;
        long j2;
        MediaSessionCompat mediaSessionCompat2 = this.f11978o;
        if (mediaSessionCompat2 != null) {
            Bundle bundle = new Bundle();
            PlaybackStateCompat.C0080d dVar = new PlaybackStateCompat.C0080d();
            long j3 = 0;
            if (this.f11976m == null || this.f11968e == null || !MediaNotificationService.m6075a(this.f11965b)) {
                playbackStateCompat = dVar.mo393b();
            } else {
                C4648h hVar = (C4648h) C9713p.m20275j(this.f11976m);
                if (i == 0 || hVar == null || hVar.mo32172l()) {
                    j = 0;
                } else {
                    j = hVar.mo32162b();
                }
                dVar.mo395d(i, j, 1.0f);
                if (i == 0) {
                    playbackStateCompat = dVar.mo393b();
                } else {
                    C4658j0 j0 = this.f11968e.mo32143j0();
                    C4648h hVar2 = this.f11976m;
                    if (hVar2 == null || hVar2.mo32172l() || this.f11976m.mo32176p()) {
                        j2 = 0;
                    } else {
                        j2 = 256;
                    }
                    if (j0 != null) {
                        List<C4642e> e = C8413s.m16834e(j0);
                        if (e != null) {
                            for (C4642e eVar : e) {
                                String A = eVar.mo32092A();
                                if (m16824x(A)) {
                                    j2 |= m16814n(A, i, bundle);
                                } else {
                                    m16818r(dVar, A, eVar);
                                }
                            }
                        }
                    } else {
                        for (String next : this.f11968e.mo32112A()) {
                            if (m16824x(next)) {
                                j2 |= m16814n(next, i, bundle);
                            } else {
                                m16818r(dVar, next, (C4642e) null);
                            }
                        }
                    }
                    playbackStateCompat = dVar.mo394c(j2).mo393b();
                }
            }
            mediaSessionCompat2.mo209n(playbackStateCompat);
            C4646g gVar = this.f11968e;
            if (gVar != null && gVar.mo32145l0()) {
                bundle.putBoolean(MediaConstants.SESSION_EXTRAS_KEY_SLOT_RESERVATION_SKIP_TO_PREV, true);
            }
            C4646g gVar2 = this.f11968e;
            if (gVar2 != null && gVar2.mo32144k0()) {
                bundle.putBoolean(MediaConstants.SESSION_EXTRAS_KEY_SLOT_RESERVATION_SKIP_TO_NEXT, true);
            }
            if (bundle.containsKey(MediaConstants.SESSION_EXTRAS_KEY_SLOT_RESERVATION_SKIP_TO_PREV) || bundle.containsKey(MediaConstants.SESSION_EXTRAS_KEY_SLOT_RESERVATION_SKIP_TO_NEXT)) {
                mediaSessionCompat2.mo207l(bundle);
            }
            if (i != 0) {
                if (this.f11976m != null) {
                    if (this.f11969f == null) {
                        pendingIntent = null;
                    } else {
                        Intent intent = new Intent();
                        intent.setComponent(this.f11969f);
                        pendingIntent = PendingIntent.getActivity(this.f11964a, 0, intent, C4951i0.f5249a | 134217728);
                    }
                    if (pendingIntent != null) {
                        mediaSessionCompat2.mo212q(pendingIntent);
                    }
                }
                if (this.f11976m != null && (mediaSessionCompat = this.f11978o) != null && mediaInfo != null && (N = mediaInfo.mo31925N()) != null) {
                    C4648h hVar3 = this.f11976m;
                    if (hVar3 == null || !hVar3.mo32172l()) {
                        j3 = mediaInfo.mo31927P();
                    }
                    String G = N.mo41710G("com.google.android.gms.cast.metadata.TITLE");
                    String G2 = N.mo41710G("com.google.android.gms.cast.metadata.SUBTITLE");
                    MediaMetadataCompat.C0043b c = m16816p().mo130c(MediaItemMetadata.KEY_DURATION, j3);
                    if (G != null) {
                        c.mo131d(MediaItemMetadata.KEY_TITLE, G);
                        c.mo131d("android.media.metadata.DISPLAY_TITLE", G);
                    }
                    if (G2 != null) {
                        c.mo131d("android.media.metadata.DISPLAY_SUBTITLE", G2);
                    }
                    mediaSessionCompat.mo208m(c.mo128a());
                    Uri o = m16815o(N, 0);
                    if (o != null) {
                        this.f11971h.mo42417d(o);
                    } else {
                        m16817q((Bitmap) null, 0);
                    }
                    Uri o2 = m16815o(N, 3);
                    if (o2 != null) {
                        this.f11972i.mo42417d(o2);
                    } else {
                        m16817q((Bitmap) null, 3);
                    }
                }
            } else {
                mediaSessionCompat2.mo208m(new MediaMetadataCompat.C0043b().mo128a());
            }
        }
    }

    /* renamed from: x */
    private static final boolean m16824x(String str) {
        if (TextUtils.equals(str, MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_PREV) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_NEXT)) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final void mo42423i(@Nullable C4648h hVar, @Nullable CastDevice castDevice) {
        C4633a aVar;
        AudioManager audioManager;
        C8119b bVar = this.f11965b;
        if (bVar == null) {
            aVar = null;
        } else {
            aVar = bVar.mo41983A();
        }
        if (!this.f11980q && this.f11965b != null && aVar != null && this.f11968e != null && hVar != null && castDevice != null && this.f11970g != null) {
            this.f11976m = hVar;
            hVar.mo32183w(this.f11975l);
            this.f11977n = castDevice;
            if (!C10680n.m22702f() && (audioManager = (AudioManager) this.f11964a.getSystemService("audio")) != null) {
                audioManager.requestAudioFocus((AudioManager.OnAudioFocusChangeListener) null, 3, 3);
            }
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(this.f11970g);
            PendingIntent broadcast = PendingIntent.getBroadcast(this.f11964a, 0, intent, C4951i0.f5249a);
            if (aVar.mo32066H()) {
                MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(this.f11964a, "CastMediaSession", this.f11970g, broadcast);
                this.f11978o = mediaSessionCompat;
                m16823w(0, (MediaInfo) null);
                CastDevice castDevice2 = this.f11977n;
                if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.mo31898G())) {
                    mediaSessionCompat.mo208m(new MediaMetadataCompat.C0043b().mo131d(MediaItemMetadata.KEY_ALBUM_ARTIST, this.f11964a.getResources().getString(C8149l.cast_casting_to_device, new Object[]{this.f11977n.mo31898G()})).mo128a());
                }
                C8409o oVar = new C8409o(this);
                this.f11979p = oVar;
                mediaSessionCompat.mo205j(oVar);
                mediaSessionCompat.mo204i(true);
                this.f11966c.mo32630d3(mediaSessionCompat);
            }
            this.f11980q = true;
            mo42427m(false);
        }
    }

    /* renamed from: j */
    public final void mo42424j(int i) {
        AudioManager audioManager;
        if (this.f11980q) {
            this.f11980q = false;
            C4648h hVar = this.f11976m;
            if (hVar != null) {
                hVar.mo32150C(this.f11975l);
            }
            if (!C10680n.m22702f() && (audioManager = (AudioManager) this.f11964a.getSystemService("audio")) != null) {
                audioManager.abandonAudioFocus((AudioManager.OnAudioFocusChangeListener) null);
            }
            this.f11966c.mo32630d3((MediaSessionCompat) null);
            C8396b bVar = this.f11971h;
            if (bVar != null) {
                bVar.mo42414a();
            }
            C8396b bVar2 = this.f11972i;
            if (bVar2 != null) {
                bVar2.mo42414a();
            }
            MediaSessionCompat mediaSessionCompat = this.f11978o;
            if (mediaSessionCompat != null) {
                mediaSessionCompat.mo205j((MediaSessionCompat.C0064b) null);
                this.f11978o.mo208m(new MediaMetadataCompat.C0043b().mo128a());
                m16823w(0, (MediaInfo) null);
            }
            MediaSessionCompat mediaSessionCompat2 = this.f11978o;
            if (mediaSessionCompat2 != null) {
                mediaSessionCompat2.mo204i(false);
                this.f11978o.mo203h();
                this.f11978o = null;
            }
            this.f11976m = null;
            this.f11977n = null;
            this.f11979p = null;
            m16821u();
            if (i == 0) {
                m16822v();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo42425k() {
        m16820t(false);
    }

    /* renamed from: l */
    public final void mo42426l(CastDevice castDevice) {
        f11963v.mo42754a("update Cast device to %s", castDevice);
        this.f11977n = castDevice;
        mo42427m(false);
    }

    /* renamed from: m */
    public final void mo42427m(boolean z) {
        C4689g d;
        C4648h hVar = this.f11976m;
        if (hVar != null) {
            MediaInfo e = hVar.mo32165e();
            int i = 6;
            int i2 = 0;
            if (!hVar.mo32171k()) {
                if (hVar.mo32175o()) {
                    i = 3;
                } else if (hVar.mo32174n()) {
                    i = 2;
                } else if (!hVar.mo32173m() || (d = hVar.mo32164d()) == null || d.mo32244I() == null) {
                    i = 0;
                } else {
                    e = d.mo32244I();
                }
            }
            if (!(e == null || e.mo31925N() == null)) {
                i2 = i;
            }
            m16823w(i2, e);
            if (!hVar.mo32170j()) {
                m16821u();
                m16822v();
            } else if (i2 != 0) {
                m16819s(z);
                if (!hVar.mo32173m()) {
                    m16820t(true);
                }
            }
        }
    }
}
