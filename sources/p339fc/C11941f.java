package p339fc;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.adjust.sdk.Constants;

/* renamed from: fc.f */
/* compiled from: DeepLinkSource */
public enum C11941f {
    PUSH_NOTIFICATION(Constants.PUSH),
    BRAZE_IN_APP_MESSAGE("braze-inapp"),
    DYNAMIC_LINK("dynamic"),
    ADJUST_LINK("adjust"),
    REMINDER(NotificationCompat.CATEGORY_REMINDER);
    
    @NonNull

    /* renamed from: b */
    public final String f18664b;

    private C11941f(@NonNull String str) {
        this.f18664b = str;
    }
}
