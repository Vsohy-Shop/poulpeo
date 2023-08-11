package p470zd;

import java.io.IOException;

/* renamed from: zd.g */
/* compiled from: Protocol */
public enum C14102g {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");
    

    /* renamed from: b */
    private final String f23164b;

    private C14102g(String str) {
        this.f23164b = str;
    }

    /* renamed from: a */
    public static C14102g m32739a(String str) {
        C14102g gVar = HTTP_1_0;
        if (str.equals(gVar.f23164b)) {
            return gVar;
        }
        C14102g gVar2 = HTTP_1_1;
        if (str.equals(gVar2.f23164b)) {
            return gVar2;
        }
        C14102g gVar3 = HTTP_2;
        if (str.equals(gVar3.f23164b)) {
            return gVar3;
        }
        C14102g gVar4 = SPDY_3;
        if (str.equals(gVar4.f23164b)) {
            return gVar4;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    public String toString() {
        return this.f23164b;
    }
}
