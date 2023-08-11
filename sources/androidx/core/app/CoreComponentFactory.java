package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

@RequiresApi(api = 28)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class CoreComponentFactory extends AppComponentFactory {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface CompatWrapped {
        Object getWrapper();
    }

    static <T> T checkCompatWrapper(T t) {
        T wrapper;
        if (!(t instanceof CompatWrapped) || (wrapper = ((CompatWrapped) t).getWrapper()) == null) {
            return t;
        }
        return wrapper;
    }

    @NonNull
    public Activity instantiateActivity(@NonNull ClassLoader classLoader, @NonNull String str, @Nullable Intent intent) {
        return (Activity) checkCompatWrapper(super.instantiateActivity(classLoader, str, intent));
    }

    @NonNull
    public Application instantiateApplication(@NonNull ClassLoader classLoader, @NonNull String str) {
        return (Application) checkCompatWrapper(super.instantiateApplication(classLoader, str));
    }

    @NonNull
    public ContentProvider instantiateProvider(@NonNull ClassLoader classLoader, @NonNull String str) {
        return (ContentProvider) checkCompatWrapper(super.instantiateProvider(classLoader, str));
    }

    @NonNull
    public BroadcastReceiver instantiateReceiver(@NonNull ClassLoader classLoader, @NonNull String str, @Nullable Intent intent) {
        return (BroadcastReceiver) checkCompatWrapper(super.instantiateReceiver(classLoader, str, intent));
    }

    @NonNull
    public Service instantiateService(@NonNull ClassLoader classLoader, @NonNull String str, @Nullable Intent intent) {
        return (Service) checkCompatWrapper(super.instantiateService(classLoader, str, intent));
    }
}
