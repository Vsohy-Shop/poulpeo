package androidx.browser.trusted;

import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;

public interface TokenStore {
    @BinderThread
    @Nullable
    Token load();

    @WorkerThread
    void store(@Nullable Token token);
}
