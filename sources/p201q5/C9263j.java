package p201q5;

import com.google.android.gms.internal.measurement.C5748ff;
import com.google.android.gms.measurement.internal.C6141f4;
import com.google.android.gms.measurement.internal.C6185j4;
import java.util.concurrent.Callable;

/* renamed from: q5.j */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final /* synthetic */ class C9263j implements Callable {

    /* renamed from: b */
    public final /* synthetic */ C6185j4 f13604b;

    /* renamed from: c */
    public final /* synthetic */ String f13605c;

    public /* synthetic */ C9263j(C6185j4 j4Var, String str) {
        this.f13604b = j4Var;
        this.f13605c = str;
    }

    public final Object call() {
        return new C5748ff("internal.appMetadata", new C6141f4(this.f13604b, this.f13605c));
    }
}
