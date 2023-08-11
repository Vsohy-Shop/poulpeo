package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.C0003a;
import android.support.customtabs.C0006b;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.browser.customtabs.CustomTabsSessionToken;
import java.util.List;

public final class CustomTabsSession {
    private static final String TAG = "CustomTabsSession";
    private final C0003a mCallback;
    private final ComponentName mComponentName;
    @Nullable
    private final PendingIntent mId;
    private final Object mLock = new Object();
    private final C0006b mService;

    static class MockSession extends C0006b.C0007a {
        MockSession() {
        }

        public Bundle extraCommand(String str, Bundle bundle) {
            return null;
        }

        public boolean mayLaunchUrl(C0003a aVar, Uri uri, Bundle bundle, List<Bundle> list) {
            return false;
        }

        public boolean newSession(C0003a aVar) {
            return false;
        }

        public boolean newSessionWithExtras(C0003a aVar, Bundle bundle) {
            return false;
        }

        public int postMessage(C0003a aVar, String str, Bundle bundle) {
            return 0;
        }

        public boolean receiveFile(C0003a aVar, Uri uri, int i, Bundle bundle) {
            return false;
        }

        public boolean requestPostMessageChannel(C0003a aVar, Uri uri) {
            return false;
        }

        public boolean requestPostMessageChannelWithExtras(C0003a aVar, Uri uri, Bundle bundle) {
            return false;
        }

        public boolean updateVisuals(C0003a aVar, Bundle bundle) {
            return false;
        }

        public boolean validateRelationship(C0003a aVar, int i, Uri uri, Bundle bundle) {
            return false;
        }

        public boolean warmup(long j) {
            return false;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class PendingSession {
        @Nullable
        private final CustomTabsCallback mCallback;
        @Nullable
        private final PendingIntent mId;

        PendingSession(@Nullable CustomTabsCallback customTabsCallback, @Nullable PendingIntent pendingIntent) {
            this.mCallback = customTabsCallback;
            this.mId = pendingIntent;
        }

        /* access modifiers changed from: package-private */
        @Nullable
        public CustomTabsCallback getCallback() {
            return this.mCallback;
        }

        /* access modifiers changed from: package-private */
        @Nullable
        public PendingIntent getId() {
            return this.mId;
        }
    }

    CustomTabsSession(C0006b bVar, C0003a aVar, ComponentName componentName, @Nullable PendingIntent pendingIntent) {
        this.mService = bVar;
        this.mCallback = aVar;
        this.mComponentName = componentName;
        this.mId = pendingIntent;
    }

    private void addIdToBundle(Bundle bundle) {
        PendingIntent pendingIntent = this.mId;
        if (pendingIntent != null) {
            bundle.putParcelable(CustomTabsIntent.EXTRA_SESSION_ID, pendingIntent);
        }
    }

    private Bundle createBundleWithId(@Nullable Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        addIdToBundle(bundle2);
        return bundle2;
    }

    @VisibleForTesting
    @NonNull
    public static CustomTabsSession createMockSessionForTesting(@NonNull ComponentName componentName) {
        return new CustomTabsSession(new MockSession(), new CustomTabsSessionToken.MockCallback(), componentName, (PendingIntent) null);
    }

    /* access modifiers changed from: package-private */
    public IBinder getBinder() {
        return this.mCallback.asBinder();
    }

    /* access modifiers changed from: package-private */
    public ComponentName getComponentName() {
        return this.mComponentName;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public PendingIntent getId() {
        return this.mId;
    }

    public boolean mayLaunchUrl(@Nullable Uri uri, @Nullable Bundle bundle, @Nullable List<Bundle> list) {
        try {
            return this.mService.mayLaunchUrl(this.mCallback, uri, createBundleWithId(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public int postMessage(@NonNull String str, @Nullable Bundle bundle) {
        int postMessage;
        Bundle createBundleWithId = createBundleWithId(bundle);
        synchronized (this.mLock) {
            try {
                postMessage = this.mService.postMessage(this.mCallback, str, createBundleWithId);
            } catch (RemoteException unused) {
                return -2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return postMessage;
    }

    public boolean receiveFile(@NonNull Uri uri, int i, @Nullable Bundle bundle) {
        try {
            return this.mService.receiveFile(this.mCallback, uri, i, createBundleWithId(bundle));
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean requestPostMessageChannel(@NonNull Uri uri) {
        try {
            if (this.mId != null) {
                return this.mService.requestPostMessageChannelWithExtras(this.mCallback, uri, createBundleWithId((Bundle) null));
            }
            return this.mService.requestPostMessageChannel(this.mCallback, uri);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean setActionButton(@NonNull Bitmap bitmap, @NonNull String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(CustomTabsIntent.KEY_ICON, bitmap);
        bundle.putString(CustomTabsIntent.KEY_DESCRIPTION, str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(CustomTabsIntent.EXTRA_ACTION_BUTTON_BUNDLE, bundle);
        addIdToBundle(bundle);
        try {
            return this.mService.updateVisuals(this.mCallback, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean setSecondaryToolbarViews(@Nullable RemoteViews remoteViews, @Nullable int[] iArr, @Nullable PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(CustomTabsIntent.EXTRA_REMOTEVIEWS, remoteViews);
        bundle.putIntArray(CustomTabsIntent.EXTRA_REMOTEVIEWS_VIEW_IDS, iArr);
        bundle.putParcelable(CustomTabsIntent.EXTRA_REMOTEVIEWS_PENDINGINTENT, pendingIntent);
        addIdToBundle(bundle);
        try {
            return this.mService.updateVisuals(this.mCallback, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Deprecated
    public boolean setToolbarItem(int i, @NonNull Bitmap bitmap, @NonNull String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(CustomTabsIntent.KEY_ID, i);
        bundle.putParcelable(CustomTabsIntent.KEY_ICON, bitmap);
        bundle.putString(CustomTabsIntent.KEY_DESCRIPTION, str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(CustomTabsIntent.EXTRA_ACTION_BUTTON_BUNDLE, bundle);
        addIdToBundle(bundle2);
        try {
            return this.mService.updateVisuals(this.mCallback, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean validateRelationship(int i, @NonNull Uri uri, @Nullable Bundle bundle) {
        if (i >= 1 && i <= 2) {
            try {
                return this.mService.validateRelationship(this.mCallback, i, uri, createBundleWithId(bundle));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }
}
