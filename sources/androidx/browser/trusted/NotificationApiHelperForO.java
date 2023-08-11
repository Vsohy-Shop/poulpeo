package androidx.browser.trusted;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
class NotificationApiHelperForO {
    private NotificationApiHelperForO() {
    }

    @RequiresApi(26)
    @Nullable
    static Notification copyNotificationOntoChannel(Context context, NotificationManager notificationManager, Notification notification, String str, String str2) {
        notificationManager.createNotificationChannel(new NotificationChannel(str, str2, 3));
        if (notificationManager.getNotificationChannel(str).getImportance() == 0) {
            return null;
        }
        Notification.Builder recoverBuilder = Notification.Builder.recoverBuilder(context, notification);
        Notification.Builder unused = recoverBuilder.setChannelId(str);
        return recoverBuilder.build();
    }

    @RequiresApi(26)
    static boolean isChannelEnabled(NotificationManager notificationManager, String str) {
        NotificationChannel a = notificationManager.getNotificationChannel(str);
        if (a == null || a.getImportance() != 0) {
            return true;
        }
        return false;
    }
}
