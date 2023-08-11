package p284y2;

import android.content.res.Resources;
import kotlin.jvm.internal.C12775o;

/* renamed from: y2.c */
/* compiled from: ResourcesUtil.kt */
public final class C10660c {

    /* renamed from: a */
    public static final C10660c f16235a = new C10660c();

    private C10660c() {
    }

    /* renamed from: a */
    private final String m22648a(int i) {
        return "#" + Integer.toHexString(i);
    }

    /* renamed from: b */
    public static final String m22649b(Resources resources, int i) {
        String str;
        String str2;
        if (resources == null) {
            return f16235a.m22648a(i);
        }
        if (f16235a.m22651d(i) != 127) {
            str2 = resources.getResourcePackageName(i);
            C12775o.m28638h(str2, "r.getResourcePackageName(resourceId)");
            str = ":";
        } else {
            str2 = "";
            str = str2;
        }
        String resourceTypeName = resources.getResourceTypeName(i);
        String resourceEntryName = resources.getResourceEntryName(i);
        StringBuilder sb = new StringBuilder(str2.length() + 1 + str.length() + resourceTypeName.length() + 1 + resourceEntryName.length());
        sb.append("@");
        sb.append(str2);
        sb.append(str);
        sb.append(resourceTypeName);
        sb.append("/");
        sb.append(resourceEntryName);
        String sb2 = sb.toString();
        C12775o.m28638h(sb2, "sb.toString()");
        return sb2;
    }

    /* renamed from: c */
    public static final String m22650c(Resources resources, int i) {
        try {
            return m22649b(resources, i);
        } catch (Resources.NotFoundException unused) {
            return f16235a.m22648a(i);
        }
    }

    /* renamed from: d */
    private final int m22651d(int i) {
        return (i >>> 24) & 255;
    }
}
