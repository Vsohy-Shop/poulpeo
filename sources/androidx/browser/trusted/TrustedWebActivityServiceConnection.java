package androidx.browser.trusted;

import android.app.Notification;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.support.customtabs.trusted.C0012a;
import android.support.customtabs.trusted.C0015b;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

public final class TrustedWebActivityServiceConnection {
    private static final String KEY_ACTIVE_NOTIFICATIONS = "android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS";
    private static final String KEY_CHANNEL_NAME = "android.support.customtabs.trusted.CHANNEL_NAME";
    private static final String KEY_NOTIFICATION = "android.support.customtabs.trusted.NOTIFICATION";
    private static final String KEY_NOTIFICATION_SUCCESS = "android.support.customtabs.trusted.NOTIFICATION_SUCCESS";
    private static final String KEY_PLATFORM_ID = "android.support.customtabs.trusted.PLATFORM_ID";
    private static final String KEY_PLATFORM_TAG = "android.support.customtabs.trusted.PLATFORM_TAG";
    private final ComponentName mComponentName;
    private final C0015b mService;

    static class ActiveNotificationsArgs {
        public final Parcelable[] notifications;

        ActiveNotificationsArgs(Parcelable[] parcelableArr) {
            this.notifications = parcelableArr;
        }

        public static ActiveNotificationsArgs fromBundle(Bundle bundle) {
            TrustedWebActivityServiceConnection.ensureBundleContains(bundle, TrustedWebActivityServiceConnection.KEY_ACTIVE_NOTIFICATIONS);
            return new ActiveNotificationsArgs(bundle.getParcelableArray(TrustedWebActivityServiceConnection.KEY_ACTIVE_NOTIFICATIONS));
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelableArray(TrustedWebActivityServiceConnection.KEY_ACTIVE_NOTIFICATIONS, this.notifications);
            return bundle;
        }
    }

    static class CancelNotificationArgs {
        public final int platformId;
        public final String platformTag;

        CancelNotificationArgs(String str, int i) {
            this.platformTag = str;
            this.platformId = i;
        }

        public static CancelNotificationArgs fromBundle(Bundle bundle) {
            TrustedWebActivityServiceConnection.ensureBundleContains(bundle, TrustedWebActivityServiceConnection.KEY_PLATFORM_TAG);
            TrustedWebActivityServiceConnection.ensureBundleContains(bundle, TrustedWebActivityServiceConnection.KEY_PLATFORM_ID);
            return new CancelNotificationArgs(bundle.getString(TrustedWebActivityServiceConnection.KEY_PLATFORM_TAG), bundle.getInt(TrustedWebActivityServiceConnection.KEY_PLATFORM_ID));
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putString(TrustedWebActivityServiceConnection.KEY_PLATFORM_TAG, this.platformTag);
            bundle.putInt(TrustedWebActivityServiceConnection.KEY_PLATFORM_ID, this.platformId);
            return bundle;
        }
    }

    static class NotificationsEnabledArgs {
        public final String channelName;

        NotificationsEnabledArgs(String str) {
            this.channelName = str;
        }

        public static NotificationsEnabledArgs fromBundle(Bundle bundle) {
            TrustedWebActivityServiceConnection.ensureBundleContains(bundle, TrustedWebActivityServiceConnection.KEY_CHANNEL_NAME);
            return new NotificationsEnabledArgs(bundle.getString(TrustedWebActivityServiceConnection.KEY_CHANNEL_NAME));
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putString(TrustedWebActivityServiceConnection.KEY_CHANNEL_NAME, this.channelName);
            return bundle;
        }
    }

    static class NotifyNotificationArgs {
        public final String channelName;
        public final Notification notification;
        public final int platformId;
        public final String platformTag;

        NotifyNotificationArgs(String str, int i, Notification notification2, String str2) {
            this.platformTag = str;
            this.platformId = i;
            this.notification = notification2;
            this.channelName = str2;
        }

        public static NotifyNotificationArgs fromBundle(Bundle bundle) {
            TrustedWebActivityServiceConnection.ensureBundleContains(bundle, TrustedWebActivityServiceConnection.KEY_PLATFORM_TAG);
            TrustedWebActivityServiceConnection.ensureBundleContains(bundle, TrustedWebActivityServiceConnection.KEY_PLATFORM_ID);
            TrustedWebActivityServiceConnection.ensureBundleContains(bundle, TrustedWebActivityServiceConnection.KEY_NOTIFICATION);
            TrustedWebActivityServiceConnection.ensureBundleContains(bundle, TrustedWebActivityServiceConnection.KEY_CHANNEL_NAME);
            return new NotifyNotificationArgs(bundle.getString(TrustedWebActivityServiceConnection.KEY_PLATFORM_TAG), bundle.getInt(TrustedWebActivityServiceConnection.KEY_PLATFORM_ID), (Notification) bundle.getParcelable(TrustedWebActivityServiceConnection.KEY_NOTIFICATION), bundle.getString(TrustedWebActivityServiceConnection.KEY_CHANNEL_NAME));
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putString(TrustedWebActivityServiceConnection.KEY_PLATFORM_TAG, this.platformTag);
            bundle.putInt(TrustedWebActivityServiceConnection.KEY_PLATFORM_ID, this.platformId);
            bundle.putParcelable(TrustedWebActivityServiceConnection.KEY_NOTIFICATION, this.notification);
            bundle.putString(TrustedWebActivityServiceConnection.KEY_CHANNEL_NAME, this.channelName);
            return bundle;
        }
    }

    static class ResultArgs {
        public final boolean success;

        ResultArgs(boolean z) {
            this.success = z;
        }

        public static ResultArgs fromBundle(Bundle bundle) {
            TrustedWebActivityServiceConnection.ensureBundleContains(bundle, TrustedWebActivityServiceConnection.KEY_NOTIFICATION_SUCCESS);
            return new ResultArgs(bundle.getBoolean(TrustedWebActivityServiceConnection.KEY_NOTIFICATION_SUCCESS));
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putBoolean(TrustedWebActivityServiceConnection.KEY_NOTIFICATION_SUCCESS, this.success);
            return bundle;
        }
    }

    TrustedWebActivityServiceConnection(@NonNull C0015b bVar, @NonNull ComponentName componentName) {
        this.mService = bVar;
        this.mComponentName = componentName;
    }

    static void ensureBundleContains(Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            throw new IllegalArgumentException("Bundle must contain " + str);
        }
    }

    @Nullable
    private static C0012a wrapCallback(@Nullable final TrustedWebActivityCallback trustedWebActivityCallback) {
        if (trustedWebActivityCallback == null) {
            return null;
        }
        return new C0012a.C0013a() {
            public void onExtraCallback(String str, Bundle bundle) {
                TrustedWebActivityCallback.this.onExtraCallback(str, bundle);
            }
        };
    }

    public boolean areNotificationsEnabled(@NonNull String str) {
        return ResultArgs.fromBundle(this.mService.areNotificationsEnabled(new NotificationsEnabledArgs(str).toBundle())).success;
    }

    public void cancel(@NonNull String str, int i) {
        this.mService.cancelNotification(new CancelNotificationArgs(str, i).toBundle());
    }

    @RequiresApi(23)
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Parcelable[] getActiveNotifications() {
        return ActiveNotificationsArgs.fromBundle(this.mService.getActiveNotifications()).notifications;
    }

    @NonNull
    public ComponentName getComponentName() {
        return this.mComponentName;
    }

    @Nullable
    public Bitmap getSmallIconBitmap() {
        return (Bitmap) this.mService.getSmallIconBitmap().getParcelable(TrustedWebActivityService.KEY_SMALL_ICON_BITMAP);
    }

    public int getSmallIconId() {
        return this.mService.getSmallIconId();
    }

    public boolean notify(@NonNull String str, int i, @NonNull Notification notification, @NonNull String str2) {
        return ResultArgs.fromBundle(this.mService.notifyNotificationWithChannel(new NotifyNotificationArgs(str, i, notification, str2).toBundle())).success;
    }

    @Nullable
    public Bundle sendExtraCommand(@NonNull String str, @NonNull Bundle bundle, @Nullable TrustedWebActivityCallback trustedWebActivityCallback) {
        IBinder iBinder;
        C0012a wrapCallback = wrapCallback(trustedWebActivityCallback);
        if (wrapCallback == null) {
            iBinder = null;
        } else {
            iBinder = wrapCallback.asBinder();
        }
        return this.mService.extraCommand(str, bundle, iBinder);
    }
}
