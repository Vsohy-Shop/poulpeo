package androidx.concurrent.futures;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.C6906d;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class ResolvableFuture<V> extends AbstractResolvableFuture<V> {
    private ResolvableFuture() {
    }

    public static <V> ResolvableFuture<V> create() {
        return new ResolvableFuture<>();
    }

    public boolean set(@Nullable V v) {
        return super.set(v);
    }

    public boolean setException(Throwable th) {
        return super.setException(th);
    }

    public boolean setFuture(C6906d<? extends V> dVar) {
        return super.setFuture(dVar);
    }
}
