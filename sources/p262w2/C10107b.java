package p262w2;

import androidx.annotation.RestrictTo;
import androidx.autofill.HintConstants;
import com.facebook.C4555l;
import com.facebook.C4574o;
import com.facebook.FacebookSdk;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import kotlin.jvm.internal.C12770k0;
import kotlin.jvm.internal.C12775o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p198q2.C9138d0;
import p218s2.C9459f;
import p454wf.C13735j;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: w2.b */
/* compiled from: ErrorReportHandler.kt */
public final class C10107b {

    /* renamed from: a */
    public static final C10107b f15268a = new C10107b();

    /* renamed from: w2.b$a */
    /* compiled from: ErrorReportHandler.kt */
    static final class C10108a implements FilenameFilter {

        /* renamed from: a */
        public static final C10108a f15269a = new C10108a();

        C10108a() {
        }

        public final boolean accept(File file, String str) {
            C12775o.m28638h(str, HintConstants.AUTOFILL_HINT_NAME);
            C12770k0 k0Var = C12770k0.f20423a;
            String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"error_log_"}, 1));
            C12775o.m28638h(format, "java.lang.String.format(format, *args)");
            return new C13735j(format).mo53412e(str);
        }
    }

    /* renamed from: w2.b$b */
    /* compiled from: ErrorReportHandler.kt */
    static final class C10109b<T> implements Comparator {

        /* renamed from: b */
        public static final C10109b f15270b = new C10109b();

        C10109b() {
        }

        /* renamed from: a */
        public final int compare(C10105a aVar, C10105a aVar2) {
            C12775o.m28638h(aVar2, "o2");
            return aVar.mo44682b(aVar2);
        }
    }

    /* renamed from: w2.b$c */
    /* compiled from: ErrorReportHandler.kt */
    static final class C10110c implements C4555l.C4557b {

        /* renamed from: a */
        final /* synthetic */ ArrayList f15271a;

        C10110c(ArrayList arrayList) {
            this.f15271a = arrayList;
        }

        public final void onCompleted(C4574o oVar) {
            JSONObject d;
            C12775o.m28639i(oVar, "response");
            try {
                if (oVar.mo31709b() == null && (d = oVar.mo31711d()) != null && d.getBoolean("success")) {
                    for (C10105a a : this.f15271a) {
                        a.mo44681a();
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }

    private C10107b() {
    }

    /* renamed from: a */
    public static final void m21235a() {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            m21238d();
        }
    }

    /* renamed from: b */
    public static final File[] m21236b() {
        File c = C9459f.m19579c();
        if (c == null) {
            return new File[0];
        }
        File[] listFiles = c.listFiles(C10108a.f15269a);
        C12775o.m28638h(listFiles, "reportDir.listFiles { di…OR_REPORT_PREFIX)))\n    }");
        return listFiles;
    }

    /* renamed from: c */
    public static final void m21237c(String str) {
        try {
            new C10105a(str).mo44685e();
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public static final void m21238d() {
        if (!C9138d0.m18616R()) {
            File[] b = m21236b();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (File aVar : b) {
                C10105a aVar2 = new C10105a(aVar);
                if (aVar2.mo44684d()) {
                    arrayList.add(aVar2);
                }
            }
            C12664a0.m28170A(arrayList, C10109b.f15270b);
            JSONArray jSONArray = new JSONArray();
            while (i < arrayList.size() && i < 1000) {
                jSONArray.put(arrayList.get(i));
                i++;
            }
            C9459f.m19588l("error_reports", jSONArray, new C10110c(arrayList));
        }
    }
}
