package androidx.mediarouter.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.ObjectsCompat;
import androidx.mediarouter.media.MediaRouter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

public abstract class MediaRouteProvider {
    static final int MSG_DELIVER_DESCRIPTOR_CHANGED = 1;
    static final int MSG_DELIVER_DISCOVERY_REQUEST_CHANGED = 2;
    private Callback mCallback;
    private final Context mContext;
    private MediaRouteProviderDescriptor mDescriptor;
    private MediaRouteDiscoveryRequest mDiscoveryRequest;
    private final ProviderHandler mHandler;
    private final ProviderMetadata mMetadata;
    private boolean mPendingDescriptorChange;
    private boolean mPendingDiscoveryRequestChange;

    private final class ProviderHandler extends Handler {
        ProviderHandler() {
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                MediaRouteProvider.this.deliverDescriptorChanged();
            } else if (i == 2) {
                MediaRouteProvider.this.deliverDiscoveryRequestChanged();
            }
        }
    }

    public static final class ProviderMetadata {
        private final ComponentName mComponentName;

        ProviderMetadata(ComponentName componentName) {
            if (componentName != null) {
                this.mComponentName = componentName;
                return;
            }
            throw new IllegalArgumentException("componentName must not be null");
        }

        @NonNull
        public ComponentName getComponentName() {
            return this.mComponentName;
        }

        @NonNull
        public String getPackageName() {
            return this.mComponentName.getPackageName();
        }

        public String toString() {
            return "ProviderMetadata{ componentName=" + this.mComponentName.flattenToShortString() + " }";
        }
    }

    public static abstract class RouteController {
        public boolean onControlRequest(@NonNull Intent intent, @Nullable MediaRouter.ControlRequestCallback controlRequestCallback) {
            return false;
        }

        @Deprecated
        public void onUnselect() {
        }

        public void onUnselect(int i) {
            onUnselect();
        }

        public void onRelease() {
        }

        public void onSelect() {
        }

        public void onSetVolume(int i) {
        }

        public void onUpdateVolume(int i) {
        }
    }

    public MediaRouteProvider(@NonNull Context context) {
        this(context, (ProviderMetadata) null);
    }

    /* access modifiers changed from: package-private */
    public void deliverDescriptorChanged() {
        this.mPendingDescriptorChange = false;
        Callback callback = this.mCallback;
        if (callback != null) {
            callback.onDescriptorChanged(this, this.mDescriptor);
        }
    }

    /* access modifiers changed from: package-private */
    public void deliverDiscoveryRequestChanged() {
        this.mPendingDiscoveryRequestChange = false;
        onDiscoveryRequestChanged(this.mDiscoveryRequest);
    }

    @NonNull
    public final Context getContext() {
        return this.mContext;
    }

    @Nullable
    public final MediaRouteProviderDescriptor getDescriptor() {
        return this.mDescriptor;
    }

    @Nullable
    public final MediaRouteDiscoveryRequest getDiscoveryRequest() {
        return this.mDiscoveryRequest;
    }

    @NonNull
    public final Handler getHandler() {
        return this.mHandler;
    }

    @NonNull
    public final ProviderMetadata getMetadata() {
        return this.mMetadata;
    }

    @Nullable
    public DynamicGroupRouteController onCreateDynamicGroupRouteController(@NonNull String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    @Nullable
    public RouteController onCreateRouteController(@NonNull String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    public final void setCallback(@Nullable Callback callback) {
        MediaRouter.checkCallingThread();
        this.mCallback = callback;
    }

    public final void setDescriptor(@Nullable MediaRouteProviderDescriptor mediaRouteProviderDescriptor) {
        MediaRouter.checkCallingThread();
        if (this.mDescriptor != mediaRouteProviderDescriptor) {
            this.mDescriptor = mediaRouteProviderDescriptor;
            if (!this.mPendingDescriptorChange) {
                this.mPendingDescriptorChange = true;
                this.mHandler.sendEmptyMessage(1);
            }
        }
    }

    public final void setDiscoveryRequest(@Nullable MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest) {
        MediaRouter.checkCallingThread();
        if (!ObjectsCompat.equals(this.mDiscoveryRequest, mediaRouteDiscoveryRequest)) {
            setDiscoveryRequestInternal(mediaRouteDiscoveryRequest);
        }
    }

    /* access modifiers changed from: package-private */
    public final void setDiscoveryRequestInternal(@Nullable MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest) {
        this.mDiscoveryRequest = mediaRouteDiscoveryRequest;
        if (!this.mPendingDiscoveryRequestChange) {
            this.mPendingDiscoveryRequestChange = true;
            this.mHandler.sendEmptyMessage(2);
        }
    }

    MediaRouteProvider(Context context, ProviderMetadata providerMetadata) {
        this.mHandler = new ProviderHandler();
        if (context != null) {
            this.mContext = context;
            if (providerMetadata == null) {
                this.mMetadata = new ProviderMetadata(new ComponentName(context, getClass()));
            } else {
                this.mMetadata = providerMetadata;
            }
        } else {
            throw new IllegalArgumentException("context must not be null");
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public RouteController onCreateRouteController(@NonNull String str, @NonNull String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        } else if (str2 != null) {
            return onCreateRouteController(str);
        } else {
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
    }

    public static abstract class DynamicGroupRouteController extends RouteController {
        @GuardedBy("mLock")
        Executor mExecutor;
        @GuardedBy("mLock")
        OnDynamicRoutesChangedListener mListener;
        private final Object mLock = new Object();
        @GuardedBy("mLock")
        MediaRouteDescriptor mPendingGroupRoute;
        @GuardedBy("mLock")
        Collection<DynamicRouteDescriptor> mPendingRoutes;

        interface OnDynamicRoutesChangedListener {
            void onRoutesChanged(DynamicGroupRouteController dynamicGroupRouteController, MediaRouteDescriptor mediaRouteDescriptor, Collection<DynamicRouteDescriptor> collection);
        }

        @Nullable
        public String getGroupableSelectionTitle() {
            return null;
        }

        @Nullable
        public String getTransferableSectionTitle() {
            return null;
        }

        @Deprecated
        public final void notifyDynamicRoutesChanged(@NonNull final Collection<DynamicRouteDescriptor> collection) {
            if (collection != null) {
                synchronized (this.mLock) {
                    Executor executor = this.mExecutor;
                    if (executor != null) {
                        final OnDynamicRoutesChangedListener onDynamicRoutesChangedListener = this.mListener;
                        executor.execute(new Runnable() {
                            public void run() {
                                onDynamicRoutesChangedListener.onRoutesChanged(DynamicGroupRouteController.this, (MediaRouteDescriptor) null, collection);
                            }
                        });
                    } else {
                        this.mPendingRoutes = new ArrayList(collection);
                    }
                }
                return;
            }
            throw new NullPointerException("routes must not be null");
        }

        public abstract void onAddMemberRoute(@NonNull String str);

        public abstract void onRemoveMemberRoute(@NonNull String str);

        public abstract void onUpdateMemberRoutes(@Nullable List<String> list);

        /* access modifiers changed from: package-private */
        public void setOnDynamicRoutesChangedListener(@NonNull Executor executor, @NonNull final OnDynamicRoutesChangedListener onDynamicRoutesChangedListener) {
            synchronized (this.mLock) {
                if (executor == null) {
                    throw new NullPointerException("Executor shouldn't be null");
                } else if (onDynamicRoutesChangedListener != null) {
                    this.mExecutor = executor;
                    this.mListener = onDynamicRoutesChangedListener;
                    Collection<DynamicRouteDescriptor> collection = this.mPendingRoutes;
                    if (collection != null && !collection.isEmpty()) {
                        final MediaRouteDescriptor mediaRouteDescriptor = this.mPendingGroupRoute;
                        final Collection<DynamicRouteDescriptor> collection2 = this.mPendingRoutes;
                        this.mPendingGroupRoute = null;
                        this.mPendingRoutes = null;
                        this.mExecutor.execute(new Runnable() {
                            public void run() {
                                onDynamicRoutesChangedListener.onRoutesChanged(DynamicGroupRouteController.this, mediaRouteDescriptor, collection2);
                            }
                        });
                    }
                } else {
                    throw new NullPointerException("Listener shouldn't be null");
                }
            }
        }

        public static final class DynamicRouteDescriptor {
            static final String KEY_IS_GROUPABLE = "isGroupable";
            static final String KEY_IS_TRANSFERABLE = "isTransferable";
            static final String KEY_IS_UNSELECTABLE = "isUnselectable";
            static final String KEY_MEDIA_ROUTE_DESCRIPTOR = "mrDescriptor";
            static final String KEY_SELECTION_STATE = "selectionState";
            public static final int SELECTED = 3;
            public static final int SELECTING = 2;
            public static final int UNSELECTED = 1;
            public static final int UNSELECTING = 0;
            Bundle mBundle;
            final boolean mIsGroupable;
            final boolean mIsTransferable;
            final boolean mIsUnselectable;
            final MediaRouteDescriptor mMediaRouteDescriptor;
            final int mSelectionState;

            @RestrictTo({RestrictTo.Scope.LIBRARY})
            @Retention(RetentionPolicy.SOURCE)
            public @interface SelectionState {
            }

            DynamicRouteDescriptor(MediaRouteDescriptor mediaRouteDescriptor, int i, boolean z, boolean z2, boolean z3) {
                this.mMediaRouteDescriptor = mediaRouteDescriptor;
                this.mSelectionState = i;
                this.mIsUnselectable = z;
                this.mIsGroupable = z2;
                this.mIsTransferable = z3;
            }

            static DynamicRouteDescriptor fromBundle(Bundle bundle) {
                if (bundle == null) {
                    return null;
                }
                return new DynamicRouteDescriptor(MediaRouteDescriptor.fromBundle(bundle.getBundle(KEY_MEDIA_ROUTE_DESCRIPTOR)), bundle.getInt(KEY_SELECTION_STATE, 1), bundle.getBoolean(KEY_IS_UNSELECTABLE, false), bundle.getBoolean(KEY_IS_GROUPABLE, false), bundle.getBoolean(KEY_IS_TRANSFERABLE, false));
            }

            @NonNull
            public MediaRouteDescriptor getRouteDescriptor() {
                return this.mMediaRouteDescriptor;
            }

            public int getSelectionState() {
                return this.mSelectionState;
            }

            public boolean isGroupable() {
                return this.mIsGroupable;
            }

            public boolean isTransferable() {
                return this.mIsTransferable;
            }

            public boolean isUnselectable() {
                return this.mIsUnselectable;
            }

            /* access modifiers changed from: package-private */
            public Bundle toBundle() {
                if (this.mBundle == null) {
                    Bundle bundle = new Bundle();
                    this.mBundle = bundle;
                    bundle.putBundle(KEY_MEDIA_ROUTE_DESCRIPTOR, this.mMediaRouteDescriptor.asBundle());
                    this.mBundle.putInt(KEY_SELECTION_STATE, this.mSelectionState);
                    this.mBundle.putBoolean(KEY_IS_UNSELECTABLE, this.mIsUnselectable);
                    this.mBundle.putBoolean(KEY_IS_GROUPABLE, this.mIsGroupable);
                    this.mBundle.putBoolean(KEY_IS_TRANSFERABLE, this.mIsTransferable);
                }
                return this.mBundle;
            }

            public static final class Builder {
                private boolean mIsGroupable = false;
                private boolean mIsTransferable = false;
                private boolean mIsUnselectable = false;
                private final MediaRouteDescriptor mRouteDescriptor;
                private int mSelectionState = 1;

                public Builder(@NonNull MediaRouteDescriptor mediaRouteDescriptor) {
                    if (mediaRouteDescriptor != null) {
                        this.mRouteDescriptor = mediaRouteDescriptor;
                        return;
                    }
                    throw new NullPointerException("descriptor must not be null");
                }

                @NonNull
                public DynamicRouteDescriptor build() {
                    return new DynamicRouteDescriptor(this.mRouteDescriptor, this.mSelectionState, this.mIsUnselectable, this.mIsGroupable, this.mIsTransferable);
                }

                @NonNull
                public Builder setIsGroupable(boolean z) {
                    this.mIsGroupable = z;
                    return this;
                }

                @NonNull
                public Builder setIsTransferable(boolean z) {
                    this.mIsTransferable = z;
                    return this;
                }

                @NonNull
                public Builder setIsUnselectable(boolean z) {
                    this.mIsUnselectable = z;
                    return this;
                }

                @NonNull
                public Builder setSelectionState(int i) {
                    this.mSelectionState = i;
                    return this;
                }

                public Builder(@NonNull DynamicRouteDescriptor dynamicRouteDescriptor) {
                    if (dynamicRouteDescriptor != null) {
                        this.mRouteDescriptor = dynamicRouteDescriptor.getRouteDescriptor();
                        this.mSelectionState = dynamicRouteDescriptor.getSelectionState();
                        this.mIsUnselectable = dynamicRouteDescriptor.isUnselectable();
                        this.mIsGroupable = dynamicRouteDescriptor.isGroupable();
                        this.mIsTransferable = dynamicRouteDescriptor.isTransferable();
                        return;
                    }
                    throw new NullPointerException("dynamicRouteDescriptor must not be null");
                }
            }
        }

        public final void notifyDynamicRoutesChanged(@NonNull final MediaRouteDescriptor mediaRouteDescriptor, @NonNull final Collection<DynamicRouteDescriptor> collection) {
            if (mediaRouteDescriptor == null) {
                throw new NullPointerException("groupRoute must not be null");
            } else if (collection != null) {
                synchronized (this.mLock) {
                    Executor executor = this.mExecutor;
                    if (executor != null) {
                        final OnDynamicRoutesChangedListener onDynamicRoutesChangedListener = this.mListener;
                        executor.execute(new Runnable() {
                            public void run() {
                                onDynamicRoutesChangedListener.onRoutesChanged(DynamicGroupRouteController.this, mediaRouteDescriptor, collection);
                            }
                        });
                    } else {
                        this.mPendingGroupRoute = mediaRouteDescriptor;
                        this.mPendingRoutes = new ArrayList(collection);
                    }
                }
            } else {
                throw new NullPointerException("dynamicRoutes must not be null");
            }
        }
    }

    public void onDiscoveryRequestChanged(@Nullable MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest) {
    }

    public static abstract class Callback {
        public void onDescriptorChanged(@NonNull MediaRouteProvider mediaRouteProvider, @Nullable MediaRouteProviderDescriptor mediaRouteProviderDescriptor) {
        }
    }
}
