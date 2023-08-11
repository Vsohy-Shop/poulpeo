package p042bo.app;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: bo.app.u0 */
public final class C3724u0 {

    /* renamed from: a */
    public static final C3724u0 f2650a = new C3724u0();

    /* renamed from: bo.app.u0$a */
    static final class C3725a extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f2651b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3725a(String str) {
            super(0);
            this.f2651b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Failed to create valid enum from string: ", this.f2651b);
        }
    }

    private C3724u0() {
    }

    /* renamed from: a */
    public static final <TargetEnum extends Enum<TargetEnum>> TargetEnum m3968a(String str, Class<TargetEnum> cls) {
        C12775o.m28639i(str, "enumValue");
        C12775o.m28639i(cls, "targetEnumClass");
        return Enum.valueOf(cls, str);
    }

    /* renamed from: a */
    public static final <TargetEnum extends Enum<TargetEnum>> EnumSet<TargetEnum> m3969a(Class<TargetEnum> cls, Set<String> set) {
        C12775o.m28639i(cls, "targetEnumClass");
        C12775o.m28639i(set, "sourceStringSet");
        EnumSet<TargetEnum> noneOf = EnumSet.noneOf(cls);
        for (String str : set) {
            try {
                Locale locale = Locale.US;
                C12775o.m28638h(locale, "US");
                String upperCase = str.toUpperCase(locale);
                C12775o.m28638h(upperCase, "this as java.lang.String).toUpperCase(locale)");
                noneOf.add(m3968a(upperCase, cls));
            } catch (Exception e) {
                C8266c.m16396e(C8266c.f11641a, f2650a, C8266c.C8267a.f11649e, e, false, new C3725a(str), 4, (Object) null);
            }
        }
        C12775o.m28638h(noneOf, "result");
        return noneOf;
    }

    /* renamed from: a */
    public static final Set<String> m3970a(EnumSet<?> enumSet) {
        C12775o.m28639i(enumSet, "sourceEnumSet");
        ArrayList arrayList = new ArrayList(C12728x.m28544v(enumSet, 10));
        Iterator<T> it = enumSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((Enum) it.next()).name());
        }
        return C12686e0.m28209F0(arrayList);
    }
}
