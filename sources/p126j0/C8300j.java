package p126j0;

import android.content.Context;
import android.content.SharedPreferences;
import com.adjust.sdk.Constants;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12770k0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p126j0.C8266c;
import p336ef.C11921v;
import p404of.C13074a;
import p454wf.C13726d;

/* renamed from: j0.j */
public final class C8300j {

    /* renamed from: a */
    private static final String f11687a = C8266c.f11641a.mo42215o("StringUtils");

    /* renamed from: j0.j$a */
    static final class C8301a extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C8301a f11688g = new C8301a();

        C8301a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "The saved user id hash was null or empty.";
        }
    }

    /* renamed from: j0.j$b */
    static final class C8302b extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f11689g;

        /* renamed from: h */
        final /* synthetic */ String f11690h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8302b(String str, String str2) {
            super(0);
            this.f11689g = str;
            this.f11690h = str2;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Generating MD5 for user id: " + this.f11689g + " apiKey: " + this.f11690h;
        }
    }

    /* renamed from: a */
    public static final long m16487a(String str) {
        C12775o.m28639i(str, "<this>");
        byte[] bytes = str.getBytes(C13726d.f22152b);
        C12775o.m28638h(bytes, "this as java.lang.String).getBytes(charset)");
        return (long) bytes.length;
    }

    /* renamed from: b */
    public static final String m16488b(Context context, String str) {
        C12775o.m28639i(context, "context");
        return m16489c(context, str, (String) null);
    }

    /* renamed from: c */
    public static final String m16489c(Context context, String str, String str2) {
        String str3;
        Context context2 = context;
        String str4 = str2;
        C12775o.m28639i(context2, "context");
        if (str == null) {
            str3 = "null";
        } else {
            str3 = str;
        }
        if (C12775o.m28634d(str3, "null")) {
            return m16491e("37a6259cc0c1dae299a7866489dff0bd", str4);
        }
        boolean z = false;
        SharedPreferences sharedPreferences = context2.getSharedPreferences("com.appboy.support.stringutils.cachefilesuffix", 0);
        String string = sharedPreferences.getString("user_id_key", (String) null);
        if (string != null && C12775o.m28634d(string, str3)) {
            String string2 = sharedPreferences.getString("user_id_hash_value", (String) null);
            if (string2 == null || string2.length() == 0) {
                z = true;
            }
            if (!z) {
                return m16491e(string2, str4);
            }
            C8266c.m16397f(C8266c.f11641a, f11687a, (C8266c.C8267a) null, (Throwable) null, false, C8301a.f11688g, 14, (Object) null);
        }
        C8266c.m16397f(C8266c.f11641a, f11687a, C8266c.C8267a.f11650f, (Throwable) null, false, new C8302b(str3, str4), 12, (Object) null);
        String d = m16490d(str3);
        sharedPreferences.edit().putString("user_id_key", str3).putString("user_id_hash_value", d).apply();
        return m16491e(d, str4);
    }

    /* renamed from: d */
    public static final String m16490d(String str) {
        C12775o.m28639i(str, "<this>");
        MessageDigest instance = MessageDigest.getInstance(Constants.MD5);
        byte[] bytes = str.getBytes(C13726d.f22152b);
        C12775o.m28638h(bytes, "this as java.lang.String).getBytes(charset)");
        BigInteger bigInteger = new BigInteger(1, instance.digest(bytes));
        C12770k0 k0Var = C12770k0.f20423a;
        String format = String.format(Locale.US, "%032x", Arrays.copyOf(new Object[]{bigInteger}, 1));
        C12775o.m28638h(format, "format(locale, format, *args)");
        return format;
    }

    /* renamed from: e */
    private static final String m16491e(String str, String str2) {
        boolean z;
        if (str2 == null || C13754v.m31532t(str2)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C12775o.m28647q(".", str);
        }
        return '.' + str + '.' + str2;
    }

    /* renamed from: f */
    public static final void m16492f(String str, Function1<? super String, C11921v> function1) {
        boolean z;
        C12775o.m28639i(function1, "block");
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            function1.invoke(str);
        }
    }

    /* renamed from: g */
    public static final boolean m16493g(String str) {
        if (str == null || C13754v.m31532t(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static final String m16494h(String str, int i) {
        C12775o.m28639i(str, "<this>");
        if (m16487a(str) <= ((long) i)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        C12775o.m28638h(charArray, "this as java.lang.String).toCharArray()");
        int length = charArray.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            char c = charArray[i2];
            i2++;
            i3 += (int) m16487a(String.valueOf(c));
            if (i3 > i) {
                break;
            }
            sb.append(c);
        }
        String sb2 = sb.toString();
        C12775o.m28638h(sb2, "truncatedStringBuilder.toString()");
        return sb2;
    }
}
