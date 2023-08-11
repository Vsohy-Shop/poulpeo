package p130j4;

import android.content.Intent;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;
import com.google.android.gms.cast.framework.media.C4648h;
import org.json.JSONObject;
import p109h4.C7935h;

/* renamed from: j4.o */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
final class C8409o extends MediaSessionCompat.C0064b {

    /* renamed from: f */
    final /* synthetic */ C8412r f11961f;

    C8409o(C8412r rVar) {
        this.f11961f = rVar;
    }

    /* renamed from: E */
    private final void m16792E(long j) {
        C4648h f = this.f11961f.f11976m;
        if (f != null) {
            m16793F(Math.min(f.mo32169i(), Math.max(0, f.mo32162b() + j)));
        }
    }

    /* renamed from: F */
    private final void m16793F(long j) {
        C4648h f = this.f11961f.f11976m;
        if (f != null) {
            C7935h.C7936a aVar = new C7935h.C7936a();
            aVar.mo41727c(j);
            f.mo32148A(aVar.mo41725a());
        }
    }

    /* renamed from: A */
    public final void mo240A() {
        C8412r.f11963v.mo42754a("onSkipToPrevious", new Object[0]);
        C8412r rVar = this.f11961f;
        if (rVar.f11976m != null) {
            rVar.f11976m.mo32182v((JSONObject) null);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo248e(java.lang.String r5, android.os.Bundle r6) {
        /*
            r4 = this;
            l4.b r6 = p130j4.C8412r.f11963v
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r5
            java.lang.String r3 = "onCustomAction with action = %s"
            r6.mo42754a(r3, r1)
            int r6 = r5.hashCode()
            r1 = 3
            r3 = 2
            switch(r6) {
                case -1699820260: goto L_0x0037;
                case -668151673: goto L_0x002d;
                case -124479363: goto L_0x0023;
                case 1362116196: goto L_0x0019;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x0041
        L_0x0019:
            java.lang.String r6 = "com.google.android.gms.cast.framework.action.FORWARD"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x0041
            r6 = r2
            goto L_0x0042
        L_0x0023:
            java.lang.String r6 = "com.google.android.gms.cast.framework.action.DISCONNECT"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x0041
            r6 = r1
            goto L_0x0042
        L_0x002d:
            java.lang.String r6 = "com.google.android.gms.cast.framework.action.STOP_CASTING"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x0041
            r6 = r3
            goto L_0x0042
        L_0x0037:
            java.lang.String r6 = "com.google.android.gms.cast.framework.action.REWIND"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x0041
            r6 = r0
            goto L_0x0042
        L_0x0041:
            r6 = -1
        L_0x0042:
            if (r6 == 0) goto L_0x0091
            if (r6 == r0) goto L_0x0082
            if (r6 == r3) goto L_0x0072
            if (r6 == r1) goto L_0x0062
            android.content.Intent r6 = new android.content.Intent
            r6.<init>(r5)
            j4.r r5 = r4.f11961f
            android.content.ComponentName r5 = r5.f11970g
            r6.setComponent(r5)
            j4.r r5 = r4.f11961f
            android.content.Context r5 = r5.f11964a
            r5.sendBroadcast(r6)
            return
        L_0x0062:
            j4.r r5 = r4.f11961f
            i4.p r6 = r5.f11967d
            if (r6 == 0) goto L_0x0081
            i4.p r5 = r5.f11967d
            r5.mo42056b(r2)
            return
        L_0x0072:
            j4.r r5 = r4.f11961f
            i4.p r6 = r5.f11967d
            if (r6 == 0) goto L_0x0081
            i4.p r5 = r5.f11967d
            r5.mo42056b(r0)
        L_0x0081:
            return
        L_0x0082:
            j4.r r5 = r4.f11961f
            com.google.android.gms.cast.framework.media.g r5 = r5.f11968e
            long r5 = r5.mo32126S()
            long r5 = -r5
            r4.m16792E(r5)
            return
        L_0x0091:
            j4.r r5 = r4.f11961f
            com.google.android.gms.cast.framework.media.g r5 = r5.f11968e
            long r5 = r5.mo32126S()
            r4.m16792E(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p130j4.C8409o.mo248e(java.lang.String, android.os.Bundle):void");
    }

    /* renamed from: g */
    public final boolean mo250g(Intent intent) {
        C8412r.f11963v.mo42754a("onMediaButtonEvent", new Object[0]);
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null) {
            return true;
        }
        if (keyEvent.getKeyCode() != 127 && keyEvent.getKeyCode() != 126) {
            return true;
        }
        C8412r rVar = this.f11961f;
        if (rVar.f11976m == null) {
            return true;
        }
        rVar.f11976m.mo32149B();
        return true;
    }

    /* renamed from: h */
    public final void mo251h() {
        C8412r.f11963v.mo42754a("onPause", new Object[0]);
        C8412r rVar = this.f11961f;
        if (rVar.f11976m != null) {
            rVar.f11976m.mo32149B();
        }
    }

    /* renamed from: i */
    public final void mo252i() {
        C8412r.f11963v.mo42754a("onPlay", new Object[0]);
        C8412r rVar = this.f11961f;
        if (rVar.f11976m != null) {
            rVar.f11976m.mo32149B();
        }
    }

    /* renamed from: s */
    public final void mo262s(long j) {
        C8412r.f11963v.mo42754a("onSeekTo %d", Long.valueOf(j));
        m16793F(j);
    }

    /* renamed from: z */
    public final void mo269z() {
        C8412r.f11963v.mo42754a("onSkipToNext", new Object[0]);
        C8412r rVar = this.f11961f;
        if (rVar.f11976m != null) {
            rVar.f11976m.mo32181u((JSONObject) null);
        }
    }
}
