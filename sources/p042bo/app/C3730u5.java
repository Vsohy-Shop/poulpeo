package p042bo.app;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p126j0.C8266c;
import p404of.C13074a;
import p454wf.C13726d;

/* renamed from: bo.app.u5 */
public final class C3730u5 {

    /* renamed from: a */
    public static final C3730u5 f2656a = new C3730u5();

    /* renamed from: bo.app.u5$a */
    static final class C3731a extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3731a f2657b = new C3731a();

        C3731a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Caught exception while trying to read BrazeLogger tag from system properties.";
        }
    }

    private C3730u5() {
    }

    /* renamed from: a */
    public static final String m3975a(String str) {
        BufferedReader bufferedReader;
        C12775o.m28639i(str, "key");
        try {
            InputStream inputStream = Runtime.getRuntime().exec(new String[]{"/system/bin/getprop", str}).getInputStream();
            C12775o.m28638h(inputStream, "getRuntime()\n           …             .inputStream");
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, C13726d.f22152b);
            if (inputStreamReader instanceof BufferedReader) {
                bufferedReader = (BufferedReader) inputStreamReader;
            } else {
                bufferedReader = new BufferedReader(inputStreamReader, 8192);
            }
            String readLine = bufferedReader.readLine();
            C12775o.m28638h(readLine, "{\n            Runtime.ge…er().readLine()\n        }");
            return readLine;
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, f2656a, C8266c.C8267a.f11649e, e, false, C3731a.f2657b, 4, (Object) null);
            return "";
        }
    }
}
