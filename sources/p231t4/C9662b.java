package p231t4;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;

/* renamed from: t4.b */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C9662b {
    @NonNull
    /* renamed from: a */
    public static ApiException m20102a(@NonNull Status status) {
        if (status.mo32380H()) {
            return new ResolvableApiException(status);
        }
        return new ApiException(status);
    }
}
