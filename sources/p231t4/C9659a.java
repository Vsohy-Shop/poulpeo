package p231t4;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p231t4.C9692j;

/* renamed from: t4.a */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C9659a extends C9692j.C9693a {
    @Nullable
    /* renamed from: J */
    public static Account m20099J(@NonNull C9692j jVar) {
        Account account = null;
        if (jVar != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                account = jVar.zzb();
            } catch (RemoteException unused) {
                Log.w("AccountAccessor", "Remote account accessor probably died");
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(clearCallingIdentity);
                throw th;
            }
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
        return account;
    }
}
