package p270x;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.appboy.enums.Channel;
import p146l0.C8620b;
import p146l0.C8622c;

/* renamed from: x.i */
/* compiled from: IBrazeDeeplinkHandler.kt */
public interface C10347i {

    /* renamed from: x.i$a */
    /* compiled from: IBrazeDeeplinkHandler.kt */
    public enum C10348a {
        NOTIFICATION_ACTION_WITH_DEEPLINK,
        NOTIFICATION_PUSH_STORY_PAGE_CLICK,
        URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY,
        URI_ACTION_OPEN_WITH_ACTION_VIEW,
        URI_ACTION_BACK_STACK_GET_ROOT_INTENT,
        URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT,
        URI_UTILS_GET_MAIN_ACTIVITY_INTENT
    }

    /* renamed from: a */
    int mo42451a(C10348a aVar);

    /* renamed from: b */
    void mo42452b(Context context, C8620b bVar);

    /* renamed from: c */
    C8622c mo42453c(String str, Bundle bundle, boolean z, Channel channel);

    /* renamed from: d */
    void mo42454d(Context context, C8622c cVar);

    /* renamed from: e */
    C8622c mo42455e(Uri uri, Bundle bundle, boolean z, Channel channel);
}
