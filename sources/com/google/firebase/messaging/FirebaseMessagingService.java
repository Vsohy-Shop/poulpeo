package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
public class FirebaseMessagingService extends C6976g {

    /* renamed from: g */
    private static final Queue<String> f9232g = new ArrayDeque(10);

    /* renamed from: j */
    private boolean m12187j(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = f9232g;
        if (!queue.contains(str)) {
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(str);
            return false;
        } else if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        } else {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "Received duplicate message: ".concat(valueOf);
            } else {
                str2 = new String("Received duplicate message: ");
            }
            Log.d("FirebaseMessaging", str2);
            return true;
        }
    }

    /* renamed from: k */
    private void m12188k(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (C6994l0.m12355t(extras)) {
            C6994l0 l0Var = new C6994l0(extras);
            ExecutorService c = C7000n.m12399c();
            try {
                if (!new C6963c(this, l0Var, c).mo39894a()) {
                    c.shutdown();
                    if (C6987j0.m12313B(intent)) {
                        C6987j0.m12334t(intent);
                    }
                } else {
                    return;
                }
            } finally {
                c.shutdown();
            }
        }
        mo39878o(new C7011s0(extras));
    }

    /* renamed from: l */
    private String m12189l(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        if (stringExtra == null) {
            return intent.getStringExtra("message_id");
        }
        return stringExtra;
    }

    /* renamed from: m */
    private void m12190m(Intent intent) {
        if (!m12187j(intent.getStringExtra("google.message_id"))) {
            m12191s(intent);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m12191s(android.content.Intent r7) {
        /*
            r6 = this;
            java.lang.String r0 = "message_type"
            java.lang.String r0 = r7.getStringExtra(r0)
            java.lang.String r1 = "gcm"
            if (r0 != 0) goto L_0x000b
            r0 = r1
        L_0x000b:
            int r2 = r0.hashCode()
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r2) {
                case -2062414158: goto L_0x0032;
                case 102161: goto L_0x002a;
                case 814694033: goto L_0x0020;
                case 814800675: goto L_0x0016;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x003c
        L_0x0016:
            java.lang.String r1 = "send_event"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x003c
            r1 = r4
            goto L_0x003d
        L_0x0020:
            java.lang.String r1 = "send_error"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x003c
            r1 = r3
            goto L_0x003d
        L_0x002a:
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x003c
            r1 = 0
            goto L_0x003d
        L_0x0032:
            java.lang.String r1 = "deleted_messages"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x003c
            r1 = r5
            goto L_0x003d
        L_0x003c:
            r1 = -1
        L_0x003d:
            if (r1 == 0) goto L_0x007e
            if (r1 == r5) goto L_0x007a
            if (r1 == r4) goto L_0x0070
            if (r1 == r3) goto L_0x005d
            int r7 = r0.length()
            java.lang.String r1 = "Received message with unknown type: "
            if (r7 == 0) goto L_0x0052
            java.lang.String r7 = r1.concat(r0)
            goto L_0x0057
        L_0x0052:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1)
        L_0x0057:
            java.lang.String r0 = "FirebaseMessaging"
            android.util.Log.w(r0, r7)
            return
        L_0x005d:
            java.lang.String r0 = r6.m12189l(r7)
            com.google.firebase.messaging.SendException r1 = new com.google.firebase.messaging.SendException
            java.lang.String r2 = "error"
            java.lang.String r7 = r7.getStringExtra(r2)
            r1.<init>(r7)
            r6.mo39881r(r0, r1)
            return
        L_0x0070:
            java.lang.String r0 = "google.message_id"
            java.lang.String r7 = r7.getStringExtra(r0)
            r6.mo39879p(r7)
            return
        L_0x007a:
            r6.mo39877n()
            return
        L_0x007e:
            com.google.firebase.messaging.C6987j0.m12336v(r7)
            r6.m12188k(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.m12191s(android.content.Intent):void");
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: c */
    public Intent mo39875c(@NonNull Intent intent) {
        return C7020w0.m12426b().mo39994c();
    }

    /* renamed from: d */
    public void mo39876d(@NonNull Intent intent) {
        String str;
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            m12190m(intent);
        } else if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
            mo39880q(intent.getStringExtra("token"));
        } else {
            String valueOf = String.valueOf(intent.getAction());
            if (valueOf.length() != 0) {
                str = "Unknown intent action: ".concat(valueOf);
            } else {
                str = new String("Unknown intent action: ");
            }
            Log.d("FirebaseMessaging", str);
        }
    }

    @WorkerThread
    /* renamed from: n */
    public void mo39877n() {
    }

    @WorkerThread
    /* renamed from: o */
    public void mo39878o(@NonNull C7011s0 s0Var) {
    }

    @WorkerThread
    /* renamed from: p */
    public void mo39879p(@NonNull String str) {
    }

    @WorkerThread
    /* renamed from: q */
    public void mo39880q(@NonNull String str) {
    }

    @WorkerThread
    /* renamed from: r */
    public void mo39881r(@NonNull String str, @NonNull Exception exc) {
    }
}
