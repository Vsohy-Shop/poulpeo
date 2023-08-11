package com.rmn.firebase;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.messaging.C7011s0;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.rmn.api.p322v2.cloud.notifications.BasePushNotificationManager;
import com.rmn.api.p322v2.cloud.notifications.PushNotificationSender;
import kotlin.jvm.internal.C12775o;
import p333ec.C11883a;
import p409pc.C13200d;
import p433tc.C13486a;
import p446vd.C13633n;
import p462yb.C13861e;

@StabilityInferred(parameters = 0)
/* compiled from: AppMessagingService.kt */
public final class AppMessagingService extends FirebaseMessagingService {
    /* renamed from: o */
    public void mo39878o(C7011s0 s0Var) {
        C12775o.m28639i(s0Var, "message");
        super.mo39878o(s0Var);
        C11883a.f18564a.mo49087b(this, s0Var);
    }

    /* renamed from: q */
    public void mo39880q(String str) {
        C12775o.m28639i(str, "token");
        C13633n.m31158n("FCM Registration Token: " + str);
        try {
            BasePushNotificationManager e = C13861e.f22396e.mo53556a().mo40745e();
            e.saveDeviceToken(str, PushNotificationSender.FCM);
            e.retrieveUserThenRegisterDevice();
            C13200d.f21007a.mo52831i(this, str);
        } catch (Exception e2) {
            C13633n.m31147c("Failed to complete token refresh", e2);
            C13486a.f21657a.mo53089b(e2);
        }
    }
}
