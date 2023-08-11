package androidx.mediarouter.media;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.MediaRouter;
import android.media.RemoteControlClient;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@RequiresApi(16)
final class MediaRouterJellybean {
    public static final int ALL_ROUTE_TYPES = 8388611;
    public static final int DEVICE_OUT_BLUETOOTH = 896;
    public static final int ROUTE_TYPE_LIVE_AUDIO = 1;
    public static final int ROUTE_TYPE_LIVE_VIDEO = 2;
    public static final int ROUTE_TYPE_USER = 8388608;
    private static final String TAG = "MediaRouterJellybean";

    public interface Callback {
        void onRouteAdded(@NonNull Object obj);

        void onRouteChanged(@NonNull Object obj);

        void onRouteGrouped(@NonNull Object obj, @NonNull Object obj2, int i);

        void onRouteRemoved(@NonNull Object obj);

        void onRouteSelected(int i, @NonNull Object obj);

        void onRouteUngrouped(@NonNull Object obj, @NonNull Object obj2);

        void onRouteUnselected(int i, @NonNull Object obj);

        void onRouteVolumeChanged(@NonNull Object obj);
    }

    static class CallbackProxy<T extends Callback> extends MediaRouter.Callback {
        protected final T mCallback;

        public CallbackProxy(T t) {
            this.mCallback = t;
        }

        public void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            this.mCallback.onRouteAdded(routeInfo);
        }

        public void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            this.mCallback.onRouteChanged(routeInfo);
        }

        public void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i) {
            this.mCallback.onRouteGrouped(routeInfo, routeGroup, i);
        }

        public void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            this.mCallback.onRouteRemoved(routeInfo);
        }

        public void onRouteSelected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
            this.mCallback.onRouteSelected(i, routeInfo);
        }

        public void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
            this.mCallback.onRouteUngrouped(routeInfo, routeGroup);
        }

        public void onRouteUnselected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
            this.mCallback.onRouteUnselected(i, routeInfo);
        }

        public void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            this.mCallback.onRouteVolumeChanged(routeInfo);
        }
    }

    public static final class GetDefaultRouteWorkaround {
        private Method mGetSystemAudioRouteMethod;

        public GetDefaultRouteWorkaround() {
            throw new UnsupportedOperationException();
        }

        @NonNull
        public Object getDefaultRoute(@NonNull Object obj) {
            MediaRouter mediaRouter = (MediaRouter) obj;
            Method method = this.mGetSystemAudioRouteMethod;
            if (method != null) {
                try {
                    return method.invoke(mediaRouter, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return mediaRouter.getRouteAt(0);
        }
    }

    public static final class RouteCategory {
        private RouteCategory() {
        }

        @Nullable
        public static CharSequence getName(@NonNull Object obj, @NonNull Context context) {
            return ((MediaRouter.RouteCategory) obj).getName(context);
        }

        @NonNull
        public static List getRoutes(@NonNull Object obj) {
            ArrayList arrayList = new ArrayList();
            ((MediaRouter.RouteCategory) obj).getRoutes(arrayList);
            return arrayList;
        }

        public static int getSupportedTypes(@NonNull Object obj) {
            return ((MediaRouter.RouteCategory) obj).getSupportedTypes();
        }

        public static boolean isGroupable(@NonNull Object obj) {
            return ((MediaRouter.RouteCategory) obj).isGroupable();
        }
    }

    public static final class RouteGroup {
        private RouteGroup() {
        }

        @NonNull
        public static List getGroupedRoutes(@NonNull Object obj) {
            MediaRouter.RouteGroup routeGroup = (MediaRouter.RouteGroup) obj;
            int routeCount = routeGroup.getRouteCount();
            ArrayList arrayList = new ArrayList(routeCount);
            for (int i = 0; i < routeCount; i++) {
                arrayList.add(routeGroup.getRouteAt(i));
            }
            return arrayList;
        }
    }

    public static final class RouteInfo {
        private RouteInfo() {
        }

        @Nullable
        public static Object getCategory(@NonNull Object obj) {
            return ((MediaRouter.RouteInfo) obj).getCategory();
        }

        @Nullable
        public static Object getGroup(@NonNull Object obj) {
            return ((MediaRouter.RouteInfo) obj).getGroup();
        }

        @Nullable
        public static Drawable getIconDrawable(@NonNull Object obj) {
            return ((MediaRouter.RouteInfo) obj).getIconDrawable();
        }

        @NonNull
        public static CharSequence getName(@NonNull Object obj, @NonNull Context context) {
            return ((MediaRouter.RouteInfo) obj).getName(context);
        }

        public static int getPlaybackStream(@NonNull Object obj) {
            return ((MediaRouter.RouteInfo) obj).getPlaybackStream();
        }

        public static int getPlaybackType(@NonNull Object obj) {
            return ((MediaRouter.RouteInfo) obj).getPlaybackType();
        }

        @NonNull
        public static CharSequence getStatus(@NonNull Object obj) {
            return ((MediaRouter.RouteInfo) obj).getStatus();
        }

        public static int getSupportedTypes(@NonNull Object obj) {
            return ((MediaRouter.RouteInfo) obj).getSupportedTypes();
        }

        @Nullable
        public static Object getTag(@NonNull Object obj) {
            return ((MediaRouter.RouteInfo) obj).getTag();
        }

        public static int getVolume(@NonNull Object obj) {
            return ((MediaRouter.RouteInfo) obj).getVolume();
        }

        public static int getVolumeHandling(@NonNull Object obj) {
            return ((MediaRouter.RouteInfo) obj).getVolumeHandling();
        }

        public static int getVolumeMax(@NonNull Object obj) {
            return ((MediaRouter.RouteInfo) obj).getVolumeMax();
        }

        public static boolean isGroup(@NonNull Object obj) {
            return obj instanceof MediaRouter.RouteGroup;
        }

        public static void requestSetVolume(@NonNull Object obj, int i) {
            ((MediaRouter.RouteInfo) obj).requestSetVolume(i);
        }

        public static void requestUpdateVolume(@NonNull Object obj, int i) {
            ((MediaRouter.RouteInfo) obj).requestUpdateVolume(i);
        }

        public static void setTag(@NonNull Object obj, @Nullable Object obj2) {
            ((MediaRouter.RouteInfo) obj).setTag(obj2);
        }
    }

    public static final class SelectRouteWorkaround {
        private Method mSelectRouteIntMethod;

        public SelectRouteWorkaround() {
            throw new UnsupportedOperationException();
        }

        public void selectRoute(@NonNull Object obj, int i, @NonNull Object obj2) {
            MediaRouter mediaRouter = (MediaRouter) obj;
            MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) obj2;
            if ((routeInfo.getSupportedTypes() & 8388608) == 0) {
                Method method = this.mSelectRouteIntMethod;
                if (method != null) {
                    try {
                        method.invoke(mediaRouter, new Object[]{Integer.valueOf(i), routeInfo});
                        return;
                    } catch (IllegalAccessException e) {
                        Log.w(MediaRouterJellybean.TAG, "Cannot programmatically select non-user route.  Media routing may not work.", e);
                    } catch (InvocationTargetException e2) {
                        Log.w(MediaRouterJellybean.TAG, "Cannot programmatically select non-user route.  Media routing may not work.", e2);
                    }
                } else {
                    Log.w(MediaRouterJellybean.TAG, "Cannot programmatically select non-user route because the platform is missing the selectRouteInt() method.  Media routing may not work.");
                }
            }
            mediaRouter.selectRoute(i, routeInfo);
        }
    }

    public static final class UserRouteInfo {
        private UserRouteInfo() {
        }

        public static void setIconDrawable(@NonNull Object obj, @Nullable Drawable drawable) {
            ((MediaRouter.UserRouteInfo) obj).setIconDrawable(drawable);
        }

        public static void setName(@NonNull Object obj, @NonNull CharSequence charSequence) {
            ((MediaRouter.UserRouteInfo) obj).setName(charSequence);
        }

        public static void setPlaybackStream(@NonNull Object obj, int i) {
            ((MediaRouter.UserRouteInfo) obj).setPlaybackStream(i);
        }

        public static void setPlaybackType(@NonNull Object obj, int i) {
            ((MediaRouter.UserRouteInfo) obj).setPlaybackType(i);
        }

        public static void setRemoteControlClient(@NonNull Object obj, @Nullable Object obj2) {
            ((MediaRouter.UserRouteInfo) obj).setRemoteControlClient((RemoteControlClient) obj2);
        }

        public static void setStatus(@NonNull Object obj, @NonNull CharSequence charSequence) {
            ((MediaRouter.UserRouteInfo) obj).setStatus(charSequence);
        }

        public static void setVolume(@NonNull Object obj, int i) {
            ((MediaRouter.UserRouteInfo) obj).setVolume(i);
        }

        public static void setVolumeCallback(@NonNull Object obj, @NonNull Object obj2) {
            ((MediaRouter.UserRouteInfo) obj).setVolumeCallback((MediaRouter.VolumeCallback) obj2);
        }

        public static void setVolumeHandling(@NonNull Object obj, int i) {
            ((MediaRouter.UserRouteInfo) obj).setVolumeHandling(i);
        }

        public static void setVolumeMax(@NonNull Object obj, int i) {
            ((MediaRouter.UserRouteInfo) obj).setVolumeMax(i);
        }
    }

    public interface VolumeCallback {
        void onVolumeSetRequest(@NonNull Object obj, int i);

        void onVolumeUpdateRequest(@NonNull Object obj, int i);
    }

    static class VolumeCallbackProxy<T extends VolumeCallback> extends MediaRouter.VolumeCallback {
        protected final T mCallback;

        public VolumeCallbackProxy(T t) {
            this.mCallback = t;
        }

        public void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i) {
            this.mCallback.onVolumeSetRequest(routeInfo, i);
        }

        public void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i) {
            this.mCallback.onVolumeUpdateRequest(routeInfo, i);
        }
    }

    private MediaRouterJellybean() {
    }

    public static void addCallback(Object obj, int i, Object obj2) {
        ((MediaRouter) obj).addCallback(i, (MediaRouter.Callback) obj2);
    }

    public static void addUserRoute(Object obj, Object obj2) {
        ((MediaRouter) obj).addUserRoute((MediaRouter.UserRouteInfo) obj2);
    }

    public static Object createCallback(Callback callback) {
        return new CallbackProxy(callback);
    }

    public static Object createRouteCategory(Object obj, String str, boolean z) {
        return ((MediaRouter) obj).createRouteCategory(str, z);
    }

    public static Object createUserRoute(Object obj, Object obj2) {
        return ((MediaRouter) obj).createUserRoute((MediaRouter.RouteCategory) obj2);
    }

    public static Object createVolumeCallback(VolumeCallback volumeCallback) {
        return new VolumeCallbackProxy(volumeCallback);
    }

    public static List getCategories(Object obj) {
        MediaRouter mediaRouter = (MediaRouter) obj;
        int categoryCount = mediaRouter.getCategoryCount();
        ArrayList arrayList = new ArrayList(categoryCount);
        for (int i = 0; i < categoryCount; i++) {
            arrayList.add(mediaRouter.getCategoryAt(i));
        }
        return arrayList;
    }

    public static Object getMediaRouter(Context context) {
        return context.getSystemService("media_router");
    }

    public static List getRoutes(Object obj) {
        MediaRouter mediaRouter = (MediaRouter) obj;
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        for (int i = 0; i < routeCount; i++) {
            arrayList.add(mediaRouter.getRouteAt(i));
        }
        return arrayList;
    }

    public static Object getSelectedRoute(Object obj, int i) {
        return ((MediaRouter) obj).getSelectedRoute(i);
    }

    public static void removeCallback(Object obj, Object obj2) {
        ((MediaRouter) obj).removeCallback((MediaRouter.Callback) obj2);
    }

    public static void removeUserRoute(Object obj, Object obj2) {
        ((MediaRouter) obj).removeUserRoute((MediaRouter.UserRouteInfo) obj2);
    }

    public static void selectRoute(Object obj, int i, Object obj2) {
        ((MediaRouter) obj).selectRoute(i, (MediaRouter.RouteInfo) obj2);
    }
}
