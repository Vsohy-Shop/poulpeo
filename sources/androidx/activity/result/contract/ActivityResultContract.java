package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.C12775o;

/* compiled from: ActivityResultContract.kt */
public abstract class ActivityResultContract<I, O> {

    /* compiled from: ActivityResultContract.kt */
    public static final class SynchronousResult<T> {
        private final T value;

        public SynchronousResult(T t) {
            this.value = t;
        }

        public final T getValue() {
            return this.value;
        }
    }

    public abstract Intent createIntent(Context context, I i);

    public SynchronousResult<O> getSynchronousResult(Context context, I i) {
        C12775o.m28639i(context, "context");
        return null;
    }

    public abstract O parseResult(int i, Intent intent);
}
