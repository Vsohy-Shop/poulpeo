package p364io.grpc.internal;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import p111h6.C8012n;
import p246u8.C9899a;
import p246u8.C9901b;

/* renamed from: io.grpc.internal.a1 */
/* compiled from: JsonParser */
public final class C12187a1 {

    /* renamed from: a */
    private static final Logger f19138a = Logger.getLogger(C12187a1.class.getName());

    /* renamed from: io.grpc.internal.a1$a */
    /* compiled from: JsonParser */
    static /* synthetic */ class C12188a {

        /* renamed from: a */
        static final /* synthetic */ int[] f19139a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                u8.b[] r0 = p246u8.C9901b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19139a = r0
                u8.b r1 = p246u8.C9901b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f19139a     // Catch:{ NoSuchFieldError -> 0x001d }
                u8.b r1 = p246u8.C9901b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f19139a     // Catch:{ NoSuchFieldError -> 0x0028 }
                u8.b r1 = p246u8.C9901b.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f19139a     // Catch:{ NoSuchFieldError -> 0x0033 }
                u8.b r1 = p246u8.C9901b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f19139a     // Catch:{ NoSuchFieldError -> 0x003e }
                u8.b r1 = p246u8.C9901b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f19139a     // Catch:{ NoSuchFieldError -> 0x0049 }
                u8.b r1 = p246u8.C9901b.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p364io.grpc.internal.C12187a1.C12188a.<clinit>():void");
        }
    }

    private C12187a1() {
    }

    /* renamed from: a */
    public static Object m26634a(String str) {
        C9899a aVar = new C9899a(new StringReader(str));
        try {
            return m26638e(aVar);
        } finally {
            try {
                aVar.close();
            } catch (IOException e) {
                f19138a.log(Level.WARNING, "Failed to close", e);
            }
        }
    }

    /* renamed from: b */
    private static List<?> m26635b(C9899a aVar) {
        boolean z;
        aVar.mo44421a();
        ArrayList arrayList = new ArrayList();
        while (aVar.mo44419V()) {
            arrayList.add(m26638e(aVar));
        }
        if (aVar.mo44430w0() == C9901b.END_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15762u(z, "Bad token: " + aVar.mo44418R());
        aVar.mo44416G();
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: c */
    private static Void m26636c(C9899a aVar) {
        aVar.mo44427p0();
        return null;
    }

    /* renamed from: d */
    private static Map<String, ?> m26637d(C9899a aVar) {
        boolean z;
        aVar.mo44423b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (aVar.mo44419V()) {
            linkedHashMap.put(aVar.mo44426j0(), m26638e(aVar));
        }
        if (aVar.mo44430w0() == C9901b.END_OBJECT) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15762u(z, "Bad token: " + aVar.mo44418R());
        aVar.mo44417O();
        return Collections.unmodifiableMap(linkedHashMap);
    }

    /* renamed from: e */
    private static Object m26638e(C9899a aVar) {
        C8012n.m15762u(aVar.mo44419V(), "unexpected end of JSON");
        switch (C12188a.f19139a[aVar.mo44430w0().ordinal()]) {
            case 1:
                return m26635b(aVar);
            case 2:
                return m26637d(aVar);
            case 3:
                return aVar.mo44429u0();
            case 4:
                return Double.valueOf(aVar.mo44424c0());
            case 5:
                return Boolean.valueOf(aVar.mo44422a0());
            case 6:
                return m26636c(aVar);
            default:
                throw new IllegalStateException("Bad token: " + aVar.mo44418R());
        }
    }
}
