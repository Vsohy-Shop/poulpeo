package androidx.browser.trusted;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class TrustedWebActivityCallback {
    public abstract void onExtraCallback(@NonNull String str, @Nullable Bundle bundle);
}
