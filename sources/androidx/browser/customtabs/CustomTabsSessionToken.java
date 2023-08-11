package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.C0003a;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.app.BundleCompat;

public class CustomTabsSessionToken {
    private static final String TAG = "CustomTabsSessionToken";
    @Nullable
    private final CustomTabsCallback mCallback;
    @Nullable
    final C0003a mCallbackBinder;
    @Nullable
    private final PendingIntent mSessionId;

    CustomTabsSessionToken(@Nullable C0003a aVar, @Nullable PendingIntent pendingIntent) {
        C02951 r1;
        if (aVar == null && pendingIntent == null) {
            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        this.mCallbackBinder = aVar;
        this.mSessionId = pendingIntent;
        if (aVar == null) {
            r1 = null;
        } else {
            r1 = new CustomTabsCallback() {
                public void extraCallback(@NonNull String str, @Nullable Bundle bundle) {
                    try {
                        CustomTabsSessionToken.this.mCallbackBinder.extraCallback(str, bundle);
                    } catch (RemoteException unused) {
                        Log.e(CustomTabsSessionToken.TAG, "RemoteException during ICustomTabsCallback transaction");
                    }
                }

                @NonNull
                public Bundle extraCallbackWithResult(@NonNull String str, @Nullable Bundle bundle) {
                    try {
                        return CustomTabsSessionToken.this.mCallbackBinder.extraCallbackWithResult(str, bundle);
                    } catch (RemoteException unused) {
                        Log.e(CustomTabsSessionToken.TAG, "RemoteException during ICustomTabsCallback transaction");
                        return null;
                    }
                }

                public void onMessageChannelReady(@Nullable Bundle bundle) {
                    try {
                        CustomTabsSessionToken.this.mCallbackBinder.onMessageChannelReady(bundle);
                    } catch (RemoteException unused) {
                        Log.e(CustomTabsSessionToken.TAG, "RemoteException during ICustomTabsCallback transaction");
                    }
                }

                public void onNavigationEvent(int i, @Nullable Bundle bundle) {
                    try {
                        CustomTabsSessionToken.this.mCallbackBinder.onNavigationEvent(i, bundle);
                    } catch (RemoteException unused) {
                        Log.e(CustomTabsSessionToken.TAG, "RemoteException during ICustomTabsCallback transaction");
                    }
                }

                public void onPostMessage(@NonNull String str, @Nullable Bundle bundle) {
                    try {
                        CustomTabsSessionToken.this.mCallbackBinder.onPostMessage(str, bundle);
                    } catch (RemoteException unused) {
                        Log.e(CustomTabsSessionToken.TAG, "RemoteException during ICustomTabsCallback transaction");
                    }
                }

                public void onRelationshipValidationResult(int i, @NonNull Uri uri, boolean z, @Nullable Bundle bundle) {
                    try {
                        CustomTabsSessionToken.this.mCallbackBinder.onRelationshipValidationResult(i, uri, z, bundle);
                    } catch (RemoteException unused) {
                        Log.e(CustomTabsSessionToken.TAG, "RemoteException during ICustomTabsCallback transaction");
                    }
                }
            };
        }
        this.mCallback = r1;
    }

    @NonNull
    public static CustomTabsSessionToken createMockSessionTokenForTesting() {
        return new CustomTabsSessionToken(new MockCallback(), (PendingIntent) null);
    }

    private IBinder getCallbackBinderAssertNotNull() {
        C0003a aVar = this.mCallbackBinder;
        if (aVar != null) {
            return aVar.asBinder();
        }
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }

    @Nullable
    public static CustomTabsSessionToken getSessionTokenFromIntent(@NonNull Intent intent) {
        Bundle extras = intent.getExtras();
        C0003a aVar = null;
        if (extras == null) {
            return null;
        }
        IBinder binder = BundleCompat.getBinder(extras, CustomTabsIntent.EXTRA_SESSION);
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(CustomTabsIntent.EXTRA_SESSION_ID);
        if (binder == null && pendingIntent == null) {
            return null;
        }
        if (binder != null) {
            aVar = C0003a.C0004a.asInterface(binder);
        }
        return new CustomTabsSessionToken(aVar, pendingIntent);
    }

    public boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof CustomTabsSessionToken)) {
            return false;
        }
        CustomTabsSessionToken customTabsSessionToken = (CustomTabsSessionToken) obj;
        PendingIntent id = customTabsSessionToken.getId();
        PendingIntent pendingIntent = this.mSessionId;
        boolean z2 = true;
        if (pendingIntent == null) {
            z = true;
        } else {
            z = false;
        }
        if (id != null) {
            z2 = false;
        }
        if (z != z2) {
            return false;
        }
        if (pendingIntent != null) {
            return pendingIntent.equals(id);
        }
        return getCallbackBinderAssertNotNull().equals(customTabsSessionToken.getCallbackBinderAssertNotNull());
    }

    @Nullable
    public CustomTabsCallback getCallback() {
        return this.mCallback;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public IBinder getCallbackBinder() {
        C0003a aVar = this.mCallbackBinder;
        if (aVar == null) {
            return null;
        }
        return aVar.asBinder();
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public PendingIntent getId() {
        return this.mSessionId;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean hasCallback() {
        if (this.mCallbackBinder != null) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean hasId() {
        if (this.mSessionId != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        PendingIntent pendingIntent = this.mSessionId;
        if (pendingIntent != null) {
            return pendingIntent.hashCode();
        }
        return getCallbackBinderAssertNotNull().hashCode();
    }

    public boolean isAssociatedWith(@NonNull CustomTabsSession customTabsSession) {
        return customTabsSession.getBinder().equals(this.mCallbackBinder);
    }

    static class MockCallback extends C0003a.C0004a {
        MockCallback() {
        }

        public Bundle extraCallbackWithResult(String str, Bundle bundle) {
            return null;
        }

        public IBinder asBinder() {
            return this;
        }

        public void onMessageChannelReady(Bundle bundle) {
        }

        public void extraCallback(String str, Bundle bundle) {
        }

        public void onNavigationEvent(int i, Bundle bundle) {
        }

        public void onPostMessage(String str, Bundle bundle) {
        }

        public void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
        }
    }
}
