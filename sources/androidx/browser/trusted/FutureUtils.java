package androidx.browser.trusted;

import androidx.annotation.NonNull;
import androidx.concurrent.futures.ResolvableFuture;
import com.google.common.util.concurrent.C6906d;

class FutureUtils {
    private FutureUtils() {
    }

    @NonNull
    static <T> C6906d<T> immediateFailedFuture(@NonNull Throwable th) {
        ResolvableFuture create = ResolvableFuture.create();
        create.setException(th);
        return create;
    }
}
