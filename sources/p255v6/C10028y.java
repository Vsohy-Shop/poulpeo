package p255v6;

import android.content.Context;

/* renamed from: v6.y */
/* compiled from: InstallerPackageNameProvider */
class C10028y {

    /* renamed from: a */
    private String f15103a;

    C10028y() {
    }

    /* renamed from: b */
    private static String m21043b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName == null) {
            return "";
        }
        return installerPackageName;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized String mo44610a(Context context) {
        String str;
        if (this.f15103a == null) {
            this.f15103a = m21043b(context);
        }
        if ("".equals(this.f15103a)) {
            str = null;
        } else {
            str = this.f15103a;
        }
        return str;
    }
}
