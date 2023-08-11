package p085f4;

import android.content.Context;
import android.util.Log;
import androidx.loader.content.AsyncTaskLoader;
import com.google.android.gms.common.api.C4733c;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import p200q4.C9234j;

/* renamed from: f4.f */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C7576f extends AsyncTaskLoader<Void> implements C9234j {

    /* renamed from: a */
    private Semaphore f10555a = new Semaphore(0);

    /* renamed from: b */
    private Set<C4733c> f10556b;

    public C7576f(Context context, Set<C4733c> set) {
        super(context);
        this.f10556b = set;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Void loadInBackground() {
        int i = 0;
        for (C4733c d : this.f10556b) {
            if (d.mo32429d(this)) {
                i++;
            }
        }
        try {
            this.f10555a.tryAcquire(i, 5, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        this.f10555a.drainPermits();
        forceLoad();
    }
}
