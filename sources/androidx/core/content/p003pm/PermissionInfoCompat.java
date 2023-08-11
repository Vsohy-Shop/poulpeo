package androidx.core.content.p003pm;

import android.content.pm.PermissionInfo;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: androidx.core.content.pm.PermissionInfoCompat */
public final class PermissionInfoCompat {

    @RequiresApi(28)
    /* renamed from: androidx.core.content.pm.PermissionInfoCompat$Api28Impl */
    static class Api28Impl {
        private Api28Impl() {
        }

        @DoNotInline
        static int getProtection(PermissionInfo permissionInfo) {
            return permissionInfo.getProtection();
        }

        @DoNotInline
        static int getProtectionFlags(PermissionInfo permissionInfo) {
            return permissionInfo.getProtectionFlags();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.content.pm.PermissionInfoCompat$Protection */
    public @interface Protection {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.content.pm.PermissionInfoCompat$ProtectionFlags */
    public @interface ProtectionFlags {
    }

    private PermissionInfoCompat() {
    }

    public static int getProtection(@NonNull PermissionInfo permissionInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.getProtection(permissionInfo);
        }
        return permissionInfo.protectionLevel & 15;
    }

    public static int getProtectionFlags(@NonNull PermissionInfo permissionInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.getProtectionFlags(permissionInfo);
        }
        return permissionInfo.protectionLevel & -16;
    }
}
