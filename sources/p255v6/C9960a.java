package p255v6;

import android.content.Context;
import android.content.pm.PackageInfo;
import p222s6.C9508e;

/* renamed from: v6.a */
/* compiled from: AppData */
public class C9960a {

    /* renamed from: a */
    public final String f14937a;

    /* renamed from: b */
    public final String f14938b;

    /* renamed from: c */
    public final String f14939c;

    /* renamed from: d */
    public final String f14940d;

    /* renamed from: e */
    public final String f14941e;

    /* renamed from: f */
    public final String f14942f;

    /* renamed from: g */
    public final C9508e f14943g;

    public C9960a(String str, String str2, String str3, String str4, String str5, String str6, C9508e eVar) {
        this.f14937a = str;
        this.f14938b = str2;
        this.f14939c = str3;
        this.f14940d = str4;
        this.f14941e = str5;
        this.f14942f = str6;
        this.f14943g = eVar;
    }

    /* renamed from: a */
    public static C9960a m20783a(Context context, C10026w wVar, String str, String str2, C9508e eVar) {
        String packageName = context.getPackageName();
        String g = wVar.mo44606g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String num = Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new C9960a(str, str2, g, packageName, num, str3, eVar);
    }
}
