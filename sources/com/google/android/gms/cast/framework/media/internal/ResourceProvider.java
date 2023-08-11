package com.google.android.gms.cast.framework.media.internal;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p120i4.C8140i;
import p120i4.C8143j;
import p120i4.C8149l;

/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final class ResourceProvider {

    /* renamed from: a */
    private static final Map f4740a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("smallIconDrawableResId", Integer.valueOf(C8143j.cast_ic_notification_small_icon));
        hashMap.put("stopLiveStreamDrawableResId", Integer.valueOf(C8143j.cast_ic_notification_stop_live_stream));
        hashMap.put("pauseDrawableResId", Integer.valueOf(C8143j.cast_ic_notification_pause));
        hashMap.put("playDrawableResId", Integer.valueOf(C8143j.cast_ic_notification_play));
        hashMap.put("skipNextDrawableResId", Integer.valueOf(C8143j.cast_ic_notification_skip_next));
        hashMap.put("skipPrevDrawableResId", Integer.valueOf(C8143j.cast_ic_notification_skip_prev));
        hashMap.put("forwardDrawableResId", Integer.valueOf(C8143j.cast_ic_notification_forward));
        hashMap.put("forward10DrawableResId", Integer.valueOf(C8143j.cast_ic_notification_forward10));
        hashMap.put("forward30DrawableResId", Integer.valueOf(C8143j.cast_ic_notification_forward30));
        hashMap.put("rewindDrawableResId", Integer.valueOf(C8143j.cast_ic_notification_rewind));
        hashMap.put("rewind10DrawableResId", Integer.valueOf(C8143j.cast_ic_notification_rewind10));
        hashMap.put("rewind30DrawableResId", Integer.valueOf(C8143j.cast_ic_notification_rewind30));
        hashMap.put("disconnectDrawableResId", Integer.valueOf(C8143j.cast_ic_notification_disconnect));
        hashMap.put("notificationImageSizeDimenResId", Integer.valueOf(C8140i.cast_notification_image_size));
        hashMap.put("castingToDeviceStringResId", Integer.valueOf(C8149l.cast_casting_to_device));
        hashMap.put("stopLiveStreamStringResId", Integer.valueOf(C8149l.cast_stop_live_stream));
        hashMap.put("pauseStringResId", Integer.valueOf(C8149l.cast_pause));
        hashMap.put("playStringResId", Integer.valueOf(C8149l.cast_play));
        hashMap.put("skipNextStringResId", Integer.valueOf(C8149l.cast_skip_next));
        hashMap.put("skipPrevStringResId", Integer.valueOf(C8149l.cast_skip_prev));
        hashMap.put("forwardStringResId", Integer.valueOf(C8149l.cast_forward));
        hashMap.put("forward10StringResId", Integer.valueOf(C8149l.cast_forward_10));
        hashMap.put("forward30StringResId", Integer.valueOf(C8149l.cast_forward_30));
        hashMap.put("rewindStringResId", Integer.valueOf(C8149l.cast_rewind));
        hashMap.put("rewind10StringResId", Integer.valueOf(C8149l.cast_rewind_10));
        hashMap.put("rewind30StringResId", Integer.valueOf(C8149l.cast_rewind_30));
        hashMap.put("disconnectStringResId", Integer.valueOf(C8149l.cast_disconnect));
        f4740a = Collections.unmodifiableMap(hashMap);
    }

    @Keep
    @Nullable
    public static Integer findResourceByName(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return (Integer) f4740a.get(str);
    }
}
