package com.rmn.api.p322v2.cloud.notifications;

import androidx.annotation.NonNull;

/* renamed from: com.rmn.api.v2.cloud.notifications.PushNotificationSender */
public enum PushNotificationSender {
    FCM("fcm"),
    APNS("apns");
    
    @NonNull
    public final String tag;

    private PushNotificationSender(@NonNull String str) {
        this.tag = str;
    }
}
