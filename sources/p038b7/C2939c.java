package p038b7;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.datatransport.cct.C4603a;
import com.google.android.gms.tasks.Task;
import p119i3.C8109b;
import p119i3.C8110c;
import p119i3.C8112e;
import p119i3.C8113f;
import p119i3.C8114g;
import p139k3.C8555t;
import p255v6.C10010p;
import p276x5.C10406g;
import p277x6.C10450a0;
import p288y6.C10699g;

/* renamed from: b7.c */
/* compiled from: DataTransportCrashlyticsReportSender */
public class C2939c {

    /* renamed from: c */
    private static final C10699g f1337c = new C10699g();

    /* renamed from: d */
    private static final String f1338d = m2418f("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: e */
    private static final String f1339e = m2418f("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: f */
    private static final C8112e<C10450a0, byte[]> f1340f = new C2937a();

    /* renamed from: a */
    private final C8113f<C10450a0> f1341a;

    /* renamed from: b */
    private final C8112e<C10450a0, byte[]> f1342b;

    C2939c(C8113f<C10450a0> fVar, C8112e<C10450a0, byte[]> eVar) {
        this.f1341a = fVar;
        this.f1342b = eVar;
    }

    /* renamed from: c */
    public static C2939c m2415c(Context context) {
        C8555t.m17186f(context);
        C8114g g = C8555t.m17184c().mo42617g(new C4603a(f1338d, f1339e));
        C8109b b = C8109b.m15970b("json");
        C8112e<C10450a0, byte[]> eVar = f1340f;
        return new C2939c(g.mo41969a("FIREBASE_CRASHLYTICS_REPORT", C10450a0.class, b, eVar), eVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m2416d(C10406g gVar, C10010p pVar, Exception exc) {
        if (exc != null) {
            gVar.mo45099d(exc);
        } else {
            gVar.mo45100e(pVar);
        }
    }

    /* renamed from: f */
    private static String m2418f(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    @NonNull
    /* renamed from: g */
    public Task<C10010p> mo28478g(@NonNull C10010p pVar) {
        C10450a0 b = pVar.mo44510b();
        C10406g gVar = new C10406g();
        this.f1341a.mo41968b(C8110c.m15976h(b), new C2938b(gVar, pVar));
        return gVar.mo45096a();
    }
}
