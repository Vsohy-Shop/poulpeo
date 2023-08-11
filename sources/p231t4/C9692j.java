package p231t4;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;
import p141k5.C8564b;

/* renamed from: t4.j */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public interface C9692j extends IInterface {

    /* renamed from: t4.j$a */
    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public static abstract class C9693a extends C8564b implements C9692j {
        @NonNull
        /* renamed from: G */
        public static C9692j m20236G(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (queryLocalInterface instanceof C9692j) {
                return (C9692j) queryLocalInterface;
            }
            return new C9727t1(iBinder);
        }
    }

    @NonNull
    Account zzb();
}
