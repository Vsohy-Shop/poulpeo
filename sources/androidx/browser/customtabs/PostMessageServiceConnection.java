package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.C0003a;
import android.support.customtabs.C0009c;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

public abstract class PostMessageServiceConnection implements PostMessageBackend, ServiceConnection {
    private static final String TAG = "PostMessageServConn";
    private final Object mLock = new Object();
    private boolean mMessageChannelCreated;
    @Nullable
    private String mPackageName;
    @Nullable
    private C0009c mService;
    private final C0003a mSessionBinder;

    public PostMessageServiceConnection(@NonNull CustomTabsSessionToken customTabsSessionToken) {
        IBinder callbackBinder = customTabsSessionToken.getCallbackBinder();
        if (callbackBinder != null) {
            this.mSessionBinder = C0003a.C0004a.asInterface(callbackBinder);
            return;
        }
        throw new IllegalArgumentException("Provided session must have binder.");
    }

    private boolean isBoundToService() {
        if (this.mService != null) {
            return true;
        }
        return false;
    }

    private boolean notifyMessageChannelReadyInternal(@Nullable Bundle bundle) {
        if (this.mService == null) {
            return false;
        }
        synchronized (this.mLock) {
            try {
                this.mService.onMessageChannelReady(this.mSessionBinder, bundle);
            } catch (RemoteException unused) {
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    public boolean bindSessionToPostMessageService(@NonNull Context context, @NonNull String str) {
        Intent intent = new Intent();
        intent.setClassName(str, PostMessageService.class.getName());
        boolean bindService = context.bindService(intent, this, 1);
        if (!bindService) {
            Log.w(TAG, "Could not bind to PostMessageService in client.");
        }
        return bindService;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void cleanup(@NonNull Context context) {
        if (isBoundToService()) {
            unbindFromContext(context);
        }
    }

    public final boolean notifyMessageChannelReady(@Nullable Bundle bundle) {
        this.mMessageChannelCreated = true;
        return notifyMessageChannelReadyInternal(bundle);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void onDisconnectChannel(@NonNull Context context) {
        unbindFromContext(context);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final boolean onNotifyMessageChannelReady(@Nullable Bundle bundle) {
        return notifyMessageChannelReady(bundle);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final boolean onPostMessage(@NonNull String str, @Nullable Bundle bundle) {
        return postMessage(str, bundle);
    }

    public void onPostMessageServiceConnected() {
        if (this.mMessageChannelCreated) {
            notifyMessageChannelReadyInternal((Bundle) null);
        }
    }

    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        this.mService = C0009c.C0010a.asInterface(iBinder);
        onPostMessageServiceConnected();
    }

    public final void onServiceDisconnected(@NonNull ComponentName componentName) {
        this.mService = null;
        onPostMessageServiceDisconnected();
    }

    public final boolean postMessage(@NonNull String str, @Nullable Bundle bundle) {
        if (this.mService == null) {
            return false;
        }
        synchronized (this.mLock) {
            try {
                this.mService.onPostMessage(this.mSessionBinder, str, bundle);
            } catch (RemoteException unused) {
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setPackageName(@NonNull String str) {
        this.mPackageName = str;
    }

    public void unbindFromContext(@NonNull Context context) {
        if (isBoundToService()) {
            context.unbindService(this);
            this.mService = null;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean bindSessionToPostMessageService(@NonNull Context context) {
        String str = this.mPackageName;
        if (str != null) {
            return bindSessionToPostMessageService(context, str);
        }
        throw new IllegalStateException("setPackageName must be called before bindSessionToPostMessageService.");
    }

    public void onPostMessageServiceDisconnected() {
    }
}
