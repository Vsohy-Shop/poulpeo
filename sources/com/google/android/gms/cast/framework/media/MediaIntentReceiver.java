package com.google.android.gms.cast.framework.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONObject;
import p120i4.C8125d;
import p120i4.C8156o;
import p150l4.C8675b;
import p231t4.C9713p;

@Keep
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public class MediaIntentReceiver extends BroadcastReceiver {
    @NonNull
    public static final String ACTION_DISCONNECT = "com.google.android.gms.cast.framework.action.DISCONNECT";
    @NonNull
    public static final String ACTION_FORWARD = "com.google.android.gms.cast.framework.action.FORWARD";
    @NonNull
    public static final String ACTION_REWIND = "com.google.android.gms.cast.framework.action.REWIND";
    @NonNull
    public static final String ACTION_SKIP_NEXT = "com.google.android.gms.cast.framework.action.SKIP_NEXT";
    @NonNull
    public static final String ACTION_SKIP_PREV = "com.google.android.gms.cast.framework.action.SKIP_PREV";
    @NonNull
    public static final String ACTION_STOP_CASTING = "com.google.android.gms.cast.framework.action.STOP_CASTING";
    @NonNull
    public static final String ACTION_TOGGLE_PLAYBACK = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK";
    @NonNull
    public static final String EXTRA_SKIP_STEP_MS = "googlecast-extra_skip_step_ms";
    private static final String TAG = "MediaIntentReceiver";
    private static final C8675b log = new C8675b(TAG);

    @Nullable
    private static C4648h getRemoteMediaClient(C8125d dVar) {
        if (dVar == null || !dVar.mo42048c()) {
            return null;
        }
        return dVar.mo42005p();
    }

    private void seek(C8125d dVar, long j) {
        C4648h remoteMediaClient;
        if (j != 0 && (remoteMediaClient = getRemoteMediaClient(dVar)) != null && !remoteMediaClient.mo32172l() && !remoteMediaClient.mo32176p()) {
            remoteMediaClient.mo32185y(remoteMediaClient.mo32162b() + j);
        }
    }

    private void togglePlayback(C8125d dVar) {
        C4648h remoteMediaClient = getRemoteMediaClient(dVar);
        if (remoteMediaClient != null) {
            remoteMediaClient.mo32149B();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(@androidx.annotation.NonNull android.content.Context r10, @androidx.annotation.NonNull android.content.Intent r11) {
        /*
            r9 = this;
            java.lang.String r0 = r11.getAction()
            l4.b r1 = log
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r0
            java.lang.String r5 = "onReceive action: %s"
            r1.mo42754a(r5, r3)
            if (r0 != 0) goto L_0x0014
            return
        L_0x0014:
            i4.a r1 = p120i4.C8116a.m15986d(r10)
            i4.p r1 = r1.mo41972b()
            i4.o r3 = r1.mo42058d()
            if (r3 != 0) goto L_0x0023
            return
        L_0x0023:
            int r5 = r0.hashCode()
            switch(r5) {
                case -1699820260: goto L_0x0071;
                case -945151566: goto L_0x0067;
                case -945080078: goto L_0x005d;
                case -668151673: goto L_0x0053;
                case -124479363: goto L_0x0049;
                case 235550565: goto L_0x003f;
                case 1362116196: goto L_0x0035;
                case 1997055314: goto L_0x002b;
                default: goto L_0x002a;
            }
        L_0x002a:
            goto L_0x007b
        L_0x002b:
            java.lang.String r5 = "android.intent.action.MEDIA_BUTTON"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x007b
            r5 = 7
            goto L_0x007c
        L_0x0035:
            java.lang.String r5 = "com.google.android.gms.cast.framework.action.FORWARD"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x007b
            r5 = 3
            goto L_0x007c
        L_0x003f:
            java.lang.String r5 = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x007b
            r5 = r4
            goto L_0x007c
        L_0x0049:
            java.lang.String r5 = "com.google.android.gms.cast.framework.action.DISCONNECT"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x007b
            r5 = 6
            goto L_0x007c
        L_0x0053:
            java.lang.String r5 = "com.google.android.gms.cast.framework.action.STOP_CASTING"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x007b
            r5 = 5
            goto L_0x007c
        L_0x005d:
            java.lang.String r5 = "com.google.android.gms.cast.framework.action.SKIP_PREV"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x007b
            r5 = 2
            goto L_0x007c
        L_0x0067:
            java.lang.String r5 = "com.google.android.gms.cast.framework.action.SKIP_NEXT"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x007b
            r5 = r2
            goto L_0x007c
        L_0x0071:
            java.lang.String r5 = "com.google.android.gms.cast.framework.action.REWIND"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x007b
            r5 = 4
            goto L_0x007c
        L_0x007b:
            r5 = -1
        L_0x007c:
            r6 = 0
            java.lang.String r8 = "googlecast-extra_skip_step_ms"
            switch(r5) {
                case 0: goto L_0x00ab;
                case 1: goto L_0x00a7;
                case 2: goto L_0x00a3;
                case 3: goto L_0x009b;
                case 4: goto L_0x0093;
                case 5: goto L_0x008f;
                case 6: goto L_0x008b;
                case 7: goto L_0x0087;
                default: goto L_0x0083;
            }
        L_0x0083:
            r9.onReceiveOtherAction(r10, r0, r11)
            return
        L_0x0087:
            r9.onReceiveActionMediaButton(r3, r11)
            return
        L_0x008b:
            r1.mo42056b(r4)
            return
        L_0x008f:
            r1.mo42056b(r2)
            return
        L_0x0093:
            long r10 = r11.getLongExtra(r8, r6)
            r9.onReceiveActionRewind(r3, r10)
            return
        L_0x009b:
            long r10 = r11.getLongExtra(r8, r6)
            r9.onReceiveActionForward(r3, r10)
            return
        L_0x00a3:
            r9.onReceiveActionSkipPrev(r3)
            return
        L_0x00a7:
            r9.onReceiveActionSkipNext(r3)
            return
        L_0x00ab:
            r9.onReceiveActionTogglePlayback(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.media.MediaIntentReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }

    /* access modifiers changed from: protected */
    public void onReceiveActionForward(@NonNull C8156o oVar, long j) {
        if (oVar instanceof C8125d) {
            seek((C8125d) oVar, j);
        }
    }

    /* access modifiers changed from: protected */
    public void onReceiveActionMediaButton(@NonNull C8156o oVar, @NonNull Intent intent) {
        KeyEvent keyEvent;
        if ((oVar instanceof C8125d) && intent.hasExtra("android.intent.extra.KEY_EVENT") && (keyEvent = (KeyEvent) ((Bundle) C9713p.m20275j(intent.getExtras())).get("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 85) {
            togglePlayback((C8125d) oVar);
        }
    }

    /* access modifiers changed from: protected */
    public void onReceiveActionRewind(@NonNull C8156o oVar, long j) {
        if (oVar instanceof C8125d) {
            seek((C8125d) oVar, -j);
        }
    }

    /* access modifiers changed from: protected */
    public void onReceiveActionSkipNext(@NonNull C8156o oVar) {
        C4648h remoteMediaClient;
        if ((oVar instanceof C8125d) && (remoteMediaClient = getRemoteMediaClient((C8125d) oVar)) != null && !remoteMediaClient.mo32176p()) {
            remoteMediaClient.mo32181u((JSONObject) null);
        }
    }

    /* access modifiers changed from: protected */
    public void onReceiveActionSkipPrev(@NonNull C8156o oVar) {
        C4648h remoteMediaClient;
        if ((oVar instanceof C8125d) && (remoteMediaClient = getRemoteMediaClient((C8125d) oVar)) != null && !remoteMediaClient.mo32176p()) {
            remoteMediaClient.mo32182v((JSONObject) null);
        }
    }

    /* access modifiers changed from: protected */
    public void onReceiveActionTogglePlayback(@NonNull C8156o oVar) {
        if (oVar instanceof C8125d) {
            togglePlayback((C8125d) oVar);
        }
    }

    /* access modifiers changed from: protected */
    public void onReceiveOtherAction(@Nullable Context context, @NonNull String str, @NonNull Intent intent) {
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void onReceiveOtherAction(@NonNull String str, @NonNull Intent intent) {
        onReceiveOtherAction((Context) null, str, intent);
    }
}
