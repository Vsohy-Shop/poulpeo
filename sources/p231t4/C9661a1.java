package p231t4;

import android.os.Looper;
import android.os.Message;
import p141k5.C8567e;

/* renamed from: t4.a1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
final class C9661a1 extends C8567e {

    /* renamed from: a */
    final /* synthetic */ C9665c f14373a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9661a1(C9665c cVar, Looper looper) {
        super(looper);
        this.f14373a = cVar;
    }

    /* renamed from: a */
    private static final void m20100a(Message message) {
        C9664b1 b1Var = (C9664b1) message.obj;
        b1Var.mo44118b();
        b1Var.mo44121e();
    }

    /* renamed from: b */
    private static final boolean m20101b(Message message) {
        int i = message.what;
        if (i == 2 || i == 1 || i == 7) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.app.PendingIntent} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r8) {
        /*
            r7 = this;
            t4.c r0 = r7.f14373a
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f14384D
            int r0 = r0.get()
            int r1 = r8.arg1
            if (r0 == r1) goto L_0x0016
            boolean r0 = m20101b(r8)
            if (r0 == 0) goto L_0x0015
            m20100a(r8)
        L_0x0015:
            return
        L_0x0016:
            int r0 = r8.what
            r1 = 4
            r2 = 1
            r3 = 5
            if (r0 == r2) goto L_0x002e
            r4 = 7
            if (r0 == r4) goto L_0x002e
            if (r0 != r1) goto L_0x002a
            t4.c r0 = r7.f14373a
            boolean r0 = r0.mo44150t()
            if (r0 == 0) goto L_0x002e
        L_0x002a:
            int r0 = r8.what
            if (r0 != r3) goto L_0x0036
        L_0x002e:
            t4.c r0 = r7.f14373a
            boolean r0 = r0.mo44138d()
            if (r0 == 0) goto L_0x0122
        L_0x0036:
            int r0 = r8.what
            r4 = 8
            r5 = 3
            r6 = 0
            if (r0 != r1) goto L_0x007e
            t4.c r0 = r7.f14373a
            com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult
            int r8 = r8.arg2
            r1.<init>(r8)
            r0.f14381A = r1
            t4.c r8 = r7.f14373a
            boolean r8 = p231t4.C9665c.m20129i0(r8)
            if (r8 == 0) goto L_0x005f
            t4.c r8 = r7.f14373a
            boolean r0 = r8.f14382B
            if (r0 == 0) goto L_0x005b
            goto L_0x005f
        L_0x005b:
            r8.m20130j0(r5, null)
            return
        L_0x005f:
            t4.c r8 = r7.f14373a
            com.google.android.gms.common.ConnectionResult r0 = r8.f14381A
            if (r0 == 0) goto L_0x006c
            com.google.android.gms.common.ConnectionResult r8 = r8.f14381A
            goto L_0x0071
        L_0x006c:
            com.google.android.gms.common.ConnectionResult r8 = new com.google.android.gms.common.ConnectionResult
            r8.<init>(r4)
        L_0x0071:
            t4.c r0 = r7.f14373a
            t4.c$c r0 = r0.f14400q
            r0.mo32571a(r8)
            t4.c r0 = r7.f14373a
            r0.mo42809M(r8)
            return
        L_0x007e:
            if (r0 != r3) goto L_0x009f
            t4.c r8 = r7.f14373a
            com.google.android.gms.common.ConnectionResult r0 = r8.f14381A
            if (r0 == 0) goto L_0x008d
            com.google.android.gms.common.ConnectionResult r8 = r8.f14381A
            goto L_0x0092
        L_0x008d:
            com.google.android.gms.common.ConnectionResult r8 = new com.google.android.gms.common.ConnectionResult
            r8.<init>(r4)
        L_0x0092:
            t4.c r0 = r7.f14373a
            t4.c$c r0 = r0.f14400q
            r0.mo32571a(r8)
            t4.c r0 = r7.f14373a
            r0.mo42809M(r8)
            return
        L_0x009f:
            if (r0 != r5) goto L_0x00be
            java.lang.Object r0 = r8.obj
            boolean r1 = r0 instanceof android.app.PendingIntent
            if (r1 == 0) goto L_0x00aa
            r6 = r0
            android.app.PendingIntent r6 = (android.app.PendingIntent) r6
        L_0x00aa:
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            int r8 = r8.arg2
            r0.<init>(r8, r6)
            t4.c r8 = r7.f14373a
            t4.c$c r8 = r8.f14400q
            r8.mo32571a(r0)
            t4.c r8 = r7.f14373a
            r8.mo42809M(r0)
            return
        L_0x00be:
            r1 = 6
            if (r0 != r1) goto L_0x00e4
            t4.c r0 = r7.f14373a
            r0.m20130j0(r3, null)
            t4.c r0 = r7.f14373a
            t4.c$a r1 = r0.f14405v
            if (r1 == 0) goto L_0x00d7
            t4.c$a r0 = r0.f14405v
            int r1 = r8.arg2
            r0.mo34794E(r1)
        L_0x00d7:
            t4.c r0 = r7.f14373a
            int r8 = r8.arg2
            r0.mo44131N(r8)
            t4.c r8 = r7.f14373a
            p231t4.C9665c.m20128h0(r8, r3, r2, r6)
            return
        L_0x00e4:
            r1 = 2
            if (r0 != r1) goto L_0x00f4
            t4.c r0 = r7.f14373a
            boolean r0 = r0.mo44141g()
            if (r0 == 0) goto L_0x00f0
            goto L_0x00f4
        L_0x00f0:
            m20100a(r8)
            return
        L_0x00f4:
            boolean r0 = m20101b(r8)
            if (r0 == 0) goto L_0x0102
            java.lang.Object r8 = r8.obj
            t4.b1 r8 = (p231t4.C9664b1) r8
            r8.mo44119c()
            return
        L_0x0102:
            int r8 = r8.what
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 45
            r0.<init>(r1)
            java.lang.String r1 = "Don't know how to handle message: "
            r0.append(r1)
            r0.append(r8)
            java.lang.Exception r8 = new java.lang.Exception
            r8.<init>()
            java.lang.String r1 = "GmsClient"
            java.lang.String r0 = r0.toString()
            android.util.Log.wtf(r1, r0, r8)
            return
        L_0x0122:
            m20100a(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p231t4.C9661a1.handleMessage(android.os.Message):void");
    }
}
