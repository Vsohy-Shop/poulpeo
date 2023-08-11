package p112h7;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import com.google.firebase.C6922c;

/* renamed from: h7.b */
/* compiled from: FirebaseDynamicLinks */
public abstract class C8025b {
    @NonNull
    /* renamed from: c */
    public static synchronized C8025b m15793c() {
        C8025b d;
        synchronized (C8025b.class) {
            d = m15794d(C6922c.m12057i());
        }
        return d;
    }

    @NonNull
    /* renamed from: d */
    public static synchronized C8025b m15794d(@NonNull C6922c cVar) {
        C8025b bVar;
        synchronized (C8025b.class) {
            bVar = (C8025b) cVar.mo39765g(C8025b.class);
        }
        return bVar;
    }

    @NonNull
    /* renamed from: a */
    public abstract C8024a mo41855a();

    @NonNull
    /* renamed from: b */
    public abstract Task<C8026c> mo41856b(@Nullable Intent intent);
}
