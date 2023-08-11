package p036b5;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;
import p141k5.C8564b;

/* renamed from: b5.a */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public interface C2888a extends IInterface {

    /* renamed from: b5.a$a */
    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public static abstract class C2889a extends C8564b implements C2888a {
        public C2889a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        @NonNull
        /* renamed from: G */
        public static C2888a m2295G(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof C2888a) {
                return (C2888a) queryLocalInterface;
            }
            return new C2891c(iBinder);
        }
    }
}
