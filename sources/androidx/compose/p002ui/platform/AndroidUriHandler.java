package androidx.compose.p002ui.platform;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.appboy.Constants;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.platform.AndroidUriHandler */
/* compiled from: AndroidUriHandler.android.kt */
public final class AndroidUriHandler implements UriHandler {
    public static final int $stable = 8;
    private final Context context;

    public AndroidUriHandler(Context context2) {
        C12775o.m28639i(context2, "context");
        this.context = context2;
    }

    public void openUri(String str) {
        C12775o.m28639i(str, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        this.context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }
}
