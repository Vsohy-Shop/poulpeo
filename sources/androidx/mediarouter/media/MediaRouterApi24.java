package androidx.mediarouter.media;

import android.media.MediaRouter;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(24)
final class MediaRouterApi24 {

    public static final class RouteInfo {
        private RouteInfo() {
        }

        public static int getDeviceType(@NonNull Object obj) {
            return ((MediaRouter.RouteInfo) obj).getDeviceType();
        }
    }

    private MediaRouterApi24() {
    }
}
