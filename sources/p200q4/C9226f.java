package p200q4;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: q4.f */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public interface C9226f {
    @Nullable
    /* renamed from: b0 */
    <T extends LifecycleCallback> T mo43518b0(@NonNull String str, @NonNull Class<T> cls);

    void startActivityForResult(@NonNull Intent intent, int i);

    @Nullable
    /* renamed from: t0 */
    Activity mo43520t0();

    /* renamed from: v */
    void mo43521v(@NonNull String str, @NonNull LifecycleCallback lifecycleCallback);
}
