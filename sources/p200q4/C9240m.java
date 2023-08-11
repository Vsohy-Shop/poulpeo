package p200q4;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import p276x5.C10406g;

/* renamed from: q4.m */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C9240m {
    /* renamed from: a */
    public static <TResult> void m18979a(@NonNull Status status, @Nullable TResult tresult, @NonNull C10406g<TResult> gVar) {
        if (status.mo32381I()) {
            gVar.mo45098c(tresult);
        } else {
            gVar.mo45097b(new ApiException(status));
        }
    }
}
