package p042bo.app;

import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p126j0.C8266c;
import p126j0.C8303k;
import p404of.C13074a;

/* renamed from: bo.app.c0 */
public final class C3036c0 {

    /* renamed from: a */
    public static final C3036c0 f1493a = new C3036c0();

    /* renamed from: bo.app.c0$a */
    static final class C3037a extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3037a f1494b = new C3037a();

        C3037a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Custom attribute key cannot be null.";
        }
    }

    /* renamed from: bo.app.c0$b */
    static final class C3038b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f1495b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3038b(String str) {
            super(0);
            this.f1495b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Custom attribute key cannot be blocklisted attribute: " + this.f1495b + '.';
        }
    }

    /* renamed from: bo.app.c0$c */
    static final class C3039c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3039c f1496b = new C3039c();

        C3039c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Custom attribute value cannot be null.";
        }
    }

    private C3036c0() {
    }

    /* renamed from: a */
    public static final boolean m2647a(String str, Set<String> set) {
        C12775o.m28639i(set, "blocklistedAttributes");
        if (str == null) {
            C8266c.m16396e(C8266c.f11641a, f1493a, C8266c.C8267a.f11651g, (Throwable) null, false, C3037a.f1494b, 6, (Object) null);
            return false;
        } else if (!set.contains(str)) {
            return true;
        } else {
            C8266c.m16396e(C8266c.f11641a, f1493a, C8266c.C8267a.f11651g, (Throwable) null, false, new C3038b(str), 6, (Object) null);
            return false;
        }
    }

    /* renamed from: a */
    public static final boolean m2646a(String str) {
        if (str != null) {
            return true;
        }
        C8266c.m16396e(C8266c.f11641a, f1493a, C8266c.C8267a.f11651g, (Throwable) null, false, C3039c.f1496b, 6, (Object) null);
        return false;
    }

    /* renamed from: a */
    public static final String[] m2648a(String[] strArr) {
        C12775o.m28639i(strArr, "values");
        ArrayList arrayList = new ArrayList(strArr.length);
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            i++;
            arrayList.add(C8303k.m16497a(str));
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
}
