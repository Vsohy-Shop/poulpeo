package p074e5;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: e5.a */
/* compiled from: com.google.android.gms:play-services-flags@@17.0.1 */
final class C7477a implements Callable<SharedPreferences> {

    /* renamed from: b */
    final /* synthetic */ Context f10360b;

    C7477a(Context context) {
        this.f10360b = context;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return this.f10360b.getSharedPreferences("google_sdk_flags", 0);
    }
}
