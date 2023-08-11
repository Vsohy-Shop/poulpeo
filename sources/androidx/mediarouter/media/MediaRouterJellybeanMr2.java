package androidx.mediarouter.media;

import android.media.MediaRouter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(18)
final class MediaRouterJellybeanMr2 {

    public static final class RouteInfo {
        private RouteInfo() {
        }

        @Nullable
        public static CharSequence getDescription(@NonNull Object obj) {
            return ((MediaRouter.RouteInfo) obj).getDescription();
        }

        public static boolean isConnecting(@NonNull Object obj) {
            return ((MediaRouter.RouteInfo) obj).isConnecting();
        }
    }

    public static final class UserRouteInfo {
        private UserRouteInfo() {
        }

        public static void setDescription(@NonNull Object obj, @Nullable CharSequence charSequence) {
            ((MediaRouter.UserRouteInfo) obj).setDescription(charSequence);
        }
    }

    private MediaRouterJellybeanMr2() {
    }

    public static void addCallback(Object obj, int i, Object obj2, int i2) {
        ((MediaRouter) obj).addCallback(i, (MediaRouter.Callback) obj2, i2);
    }

    public static Object getDefaultRoute(Object obj) {
        return ((MediaRouter) obj).getDefaultRoute();
    }
}
