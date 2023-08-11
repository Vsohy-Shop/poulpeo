package androidx.core.p004os;

import android.content.Context;
import android.os.UserManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* renamed from: androidx.core.os.UserManagerCompat */
public class UserManagerCompat {

    @RequiresApi(24)
    /* renamed from: androidx.core.os.UserManagerCompat$Api24Impl */
    static class Api24Impl {
        private Api24Impl() {
        }

        @DoNotInline
        static boolean isUserUnlocked(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    private UserManagerCompat() {
    }

    public static boolean isUserUnlocked(@NonNull Context context) {
        return Api24Impl.isUserUnlocked(context);
    }
}
