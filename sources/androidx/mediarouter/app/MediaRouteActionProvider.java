package androidx.mediarouter.app;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ActionProvider;
import androidx.mediarouter.media.MediaRouteSelector;
import androidx.mediarouter.media.MediaRouter;
import androidx.mediarouter.media.MediaRouterParams;
import java.lang.ref.WeakReference;

public class MediaRouteActionProvider extends ActionProvider {
    private static final String TAG = "MRActionProvider";
    private boolean mAlwaysVisible;
    private MediaRouteButton mButton;
    private final MediaRouterCallback mCallback;
    private MediaRouteDialogFactory mDialogFactory = MediaRouteDialogFactory.getDefault();
    private final MediaRouter mRouter;
    private MediaRouteSelector mSelector = MediaRouteSelector.EMPTY;

    private static final class MediaRouterCallback extends MediaRouter.Callback {
        private final WeakReference<MediaRouteActionProvider> mProviderWeak;

        public MediaRouterCallback(MediaRouteActionProvider mediaRouteActionProvider) {
            this.mProviderWeak = new WeakReference<>(mediaRouteActionProvider);
        }

        private void refreshRoute(MediaRouter mediaRouter) {
            MediaRouteActionProvider mediaRouteActionProvider = this.mProviderWeak.get();
            if (mediaRouteActionProvider != null) {
                mediaRouteActionProvider.refreshRoute();
            } else {
                mediaRouter.removeCallback(this);
            }
        }

        public void onProviderAdded(MediaRouter mediaRouter, MediaRouter.ProviderInfo providerInfo) {
            refreshRoute(mediaRouter);
        }

        public void onProviderChanged(MediaRouter mediaRouter, MediaRouter.ProviderInfo providerInfo) {
            refreshRoute(mediaRouter);
        }

        public void onProviderRemoved(MediaRouter mediaRouter, MediaRouter.ProviderInfo providerInfo) {
            refreshRoute(mediaRouter);
        }

        public void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            refreshRoute(mediaRouter);
        }

        public void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            refreshRoute(mediaRouter);
        }

        public void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            refreshRoute(mediaRouter);
        }
    }

    public MediaRouteActionProvider(@NonNull Context context) {
        super(context);
        this.mRouter = MediaRouter.getInstance(context);
        this.mCallback = new MediaRouterCallback(this);
    }

    @Deprecated
    public void enableDynamicGroup() {
        MediaRouterParams.Builder builder;
        MediaRouterParams routerParams = this.mRouter.getRouterParams();
        if (routerParams == null) {
            builder = new MediaRouterParams.Builder();
        } else {
            builder = new MediaRouterParams.Builder(routerParams);
        }
        builder.setDialogType(2);
        this.mRouter.setRouterParams(builder.build());
    }

    @NonNull
    public MediaRouteDialogFactory getDialogFactory() {
        return this.mDialogFactory;
    }

    @Nullable
    public MediaRouteButton getMediaRouteButton() {
        return this.mButton;
    }

    @NonNull
    public MediaRouteSelector getRouteSelector() {
        return this.mSelector;
    }

    public boolean isVisible() {
        if (this.mAlwaysVisible || this.mRouter.isRouteAvailable(this.mSelector, 1)) {
            return true;
        }
        return false;
    }

    @NonNull
    public View onCreateActionView() {
        if (this.mButton != null) {
            Log.e(TAG, "onCreateActionView: this ActionProvider is already associated with a menu item. Don't reuse MediaRouteActionProvider instances! Abandoning the old menu item...");
        }
        MediaRouteButton onCreateMediaRouteButton = onCreateMediaRouteButton();
        this.mButton = onCreateMediaRouteButton;
        onCreateMediaRouteButton.setCheatSheetEnabled(true);
        this.mButton.setRouteSelector(this.mSelector);
        this.mButton.setAlwaysVisible(this.mAlwaysVisible);
        this.mButton.setDialogFactory(this.mDialogFactory);
        this.mButton.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        return this.mButton;
    }

    @NonNull
    public MediaRouteButton onCreateMediaRouteButton() {
        return new MediaRouteButton(getContext());
    }

    public boolean onPerformDefaultAction() {
        MediaRouteButton mediaRouteButton = this.mButton;
        if (mediaRouteButton != null) {
            return mediaRouteButton.showDialog();
        }
        return false;
    }

    public boolean overridesItemVisibility() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public void refreshRoute() {
        refreshVisibility();
    }

    public void setAlwaysVisible(boolean z) {
        if (this.mAlwaysVisible != z) {
            this.mAlwaysVisible = z;
            refreshVisibility();
            MediaRouteButton mediaRouteButton = this.mButton;
            if (mediaRouteButton != null) {
                mediaRouteButton.setAlwaysVisible(this.mAlwaysVisible);
            }
        }
    }

    public void setDialogFactory(@NonNull MediaRouteDialogFactory mediaRouteDialogFactory) {
        if (mediaRouteDialogFactory == null) {
            throw new IllegalArgumentException("factory must not be null");
        } else if (this.mDialogFactory != mediaRouteDialogFactory) {
            this.mDialogFactory = mediaRouteDialogFactory;
            MediaRouteButton mediaRouteButton = this.mButton;
            if (mediaRouteButton != null) {
                mediaRouteButton.setDialogFactory(mediaRouteDialogFactory);
            }
        }
    }

    public void setRouteSelector(@NonNull MediaRouteSelector mediaRouteSelector) {
        if (mediaRouteSelector == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (!this.mSelector.equals(mediaRouteSelector)) {
            if (!this.mSelector.isEmpty()) {
                this.mRouter.removeCallback(this.mCallback);
            }
            if (!mediaRouteSelector.isEmpty()) {
                this.mRouter.addCallback(mediaRouteSelector, this.mCallback);
            }
            this.mSelector = mediaRouteSelector;
            refreshRoute();
            MediaRouteButton mediaRouteButton = this.mButton;
            if (mediaRouteButton != null) {
                mediaRouteButton.setRouteSelector(mediaRouteSelector);
            }
        }
    }
}
