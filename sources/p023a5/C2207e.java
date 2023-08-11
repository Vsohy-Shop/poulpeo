package p023a5;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: a5.e */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C2207e {

    /* renamed from: b */
    private static C2207e f985b = new C2207e();
    @Nullable

    /* renamed from: a */
    private C2206d f986a = null;

    @NonNull
    /* renamed from: a */
    public static C2206d m1805a(@NonNull Context context) {
        return f985b.mo23533b(context);
    }

    @NonNull
    /* renamed from: b */
    public final synchronized C2206d mo23533b(@NonNull Context context) {
        if (this.f986a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f986a = new C2206d(context);
        }
        return this.f986a;
    }
}
