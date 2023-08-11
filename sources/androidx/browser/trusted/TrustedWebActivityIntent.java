package androidx.browser.trusted;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import java.util.List;

public final class TrustedWebActivityIntent {
    @NonNull
    private final Intent mIntent;
    @NonNull
    private final List<Uri> mSharedFileUris;

    TrustedWebActivityIntent(@NonNull Intent intent, @NonNull List<Uri> list) {
        this.mIntent = intent;
        this.mSharedFileUris = list;
    }

    private void grantUriPermissionToProvider(Context context) {
        for (Uri grantUriPermission : this.mSharedFileUris) {
            context.grantUriPermission(this.mIntent.getPackage(), grantUriPermission, 1);
        }
    }

    @NonNull
    public Intent getIntent() {
        return this.mIntent;
    }

    public void launchTrustedWebActivity(@NonNull Context context) {
        grantUriPermissionToProvider(context);
        ContextCompat.startActivity(context, this.mIntent, (Bundle) null);
    }
}
