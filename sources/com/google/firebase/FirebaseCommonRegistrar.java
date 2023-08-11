package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import p202q6.C9284d;
import p202q6.C9294i;
import p203q7.C9320d;
import p214r8.C9396c;
import p214r8.C9398e;
import p214r8.C9401h;

public class FirebaseCommonRegistrar implements C9294i {
    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ String m12003e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null) {
            return String.valueOf(applicationInfo.targetSdkVersion);
        }
        return "";
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ String m12004f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null) {
            return String.valueOf(applicationInfo.minSdkVersion);
        }
        return "";
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ String m12005g(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return "auto";
        }
        if (i < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
            return "";
        }
        return "embedded";
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ String m12006h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName != null) {
            return m12007i(installerPackageName);
        }
        return "";
    }

    /* renamed from: i */
    private static String m12007i(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    public List<C9284d<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C9396c.m19440c());
        arrayList.add(C9320d.m19183e());
        arrayList.add(C9401h.m19452b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(C9401h.m19452b("fire-core", "20.0.0"));
        arrayList.add(C9401h.m19452b("device-name", m12007i(Build.PRODUCT)));
        arrayList.add(C9401h.m19452b("device-model", m12007i(Build.DEVICE)));
        arrayList.add(C9401h.m19452b("device-brand", m12007i(Build.BRAND)));
        arrayList.add(C9401h.m19453c("android-target-sdk", new C6931d()));
        arrayList.add(C9401h.m19453c("android-min-sdk", new C6932e()));
        arrayList.add(C9401h.m19453c("android-platform", new C6933f()));
        arrayList.add(C9401h.m19453c("android-installer", new C6934g()));
        String a = C9398e.m19446a();
        if (a != null) {
            arrayList.add(C9401h.m19452b("kotlin", a));
        }
        return arrayList;
    }
}
