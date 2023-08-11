package p255v6;

import android.app.ApplicationExitInfo;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import p025a7.C2216e;
import p025a7.C2217f;
import p038b7.C2939c;
import p050c7.C3894e;
import p088f7.C7609d;
import p222s6.C9511f;
import p266w6.C10116c;
import p266w6.C10128g;
import p276x5.C10410i;
import p277x6.C10450a0;
import p277x6.C10494b0;

/* renamed from: v6.m0 */
/* compiled from: SessionReportingCoordinator */
public class C10005m0 {

    /* renamed from: a */
    private final C10008o f15045a;

    /* renamed from: b */
    private final C2216e f15046b;

    /* renamed from: c */
    private final C2939c f15047c;

    /* renamed from: d */
    private final C10116c f15048d;

    /* renamed from: e */
    private final C10128g f15049e;

    C10005m0(C10008o oVar, C2216e eVar, C2939c cVar, C10116c cVar2, C10128g gVar) {
        this.f15045a = oVar;
        this.f15046b = eVar;
        this.f15047c = cVar;
        this.f15048d = cVar2;
        this.f15049e = gVar;
    }

    /* renamed from: c */
    private C10450a0.C10460e.C10467d m20936c(C10450a0.C10460e.C10467d dVar) {
        return m20937d(dVar, this.f15048d, this.f15049e);
    }

    /* renamed from: d */
    private C10450a0.C10460e.C10467d m20937d(C10450a0.C10460e.C10467d dVar, C10116c cVar, C10128g gVar) {
        C10450a0.C10460e.C10467d.C10482b g = dVar.mo45256g();
        String c = cVar.mo44703c();
        if (c != null) {
            g.mo45330d(C10450a0.C10460e.C10467d.C10485d.m22137a().mo45348b(c).mo45347a());
        } else {
            C9511f.m19696f().mo43971i("No log data to include with this event.");
        }
        List<C10450a0.C10454c> k = m20942k(gVar.mo44725a());
        List<C10450a0.C10454c> k2 = m20942k(gVar.mo44726b());
        if (!k.isEmpty() || !k2.isEmpty()) {
            g.mo45328b(dVar.mo45251b().mo45262g().mo45265c(C10494b0.m22173b(k)).mo45267e(C10494b0.m22173b(k2)).mo45263a());
        }
        return g.mo45327a();
    }

    @RequiresApi(api = 30)
    /* renamed from: e */
    private static C10450a0.C10451a m20938e(ApplicationExitInfo applicationExitInfo) {
        String str = null;
        try {
            InputStream a = applicationExitInfo.getTraceInputStream();
            if (a != null) {
                str = m20939f(a);
            }
        } catch (IOException e) {
            C9511f f = C9511f.m19696f();
            f.mo43973k("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e);
        }
        return C10450a0.C10451a.m21923a().mo45157b(applicationExitInfo.getImportance()).mo45159d(applicationExitInfo.getProcessName()).mo45161f(applicationExitInfo.getReason()).mo45163h(applicationExitInfo.getTimestamp()).mo45158c(applicationExitInfo.getPid()).mo45160e(applicationExitInfo.getPss()).mo45162g(applicationExitInfo.getRss()).mo45164i(str).mo45156a();
    }

    @RequiresApi(api = 19)
    @VisibleForTesting
    /* renamed from: f */
    public static String m20939f(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: g */
    public static C10005m0 m20940g(Context context, C10026w wVar, C2217f fVar, C9960a aVar, C10116c cVar, C10128g gVar, C7609d dVar, C3894e eVar) {
        return new C10005m0(new C10008o(context, wVar, aVar, dVar), new C2216e(fVar, eVar), C2939c.m2415c(context), cVar, gVar);
    }

    @RequiresApi(api = 30)
    @Nullable
    /* renamed from: j */
    private ApplicationExitInfo m20941j(String str, List<ApplicationExitInfo> list) {
        long q = this.f15046b.mo23545q(str);
        for (ApplicationExitInfo next : list) {
            if (next.getTimestamp() < q) {
                return null;
            }
            if (next.getReason() == 6) {
                return next;
            }
        }
        return null;
    }

    @NonNull
    /* renamed from: k */
    private static List<C10450a0.C10454c> m20942k(@NonNull Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry next : map.entrySet()) {
            arrayList.add(C10450a0.C10454c.m21950a().mo45177b((String) next.getKey()).mo45178c((String) next.getValue()).mo45176a());
        }
        Collections.sort(arrayList, new C9999l0());
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public boolean m20944p(@NonNull Task<C10010p> task) {
        if (task.mo35465p()) {
            C10010p l = task.mo35461l();
            C9511f f = C9511f.m19696f();
            f.mo43965b("Crashlytics report successfully enqueued to DataTransport: " + l.mo44512d());
            File c = l.mo44511c();
            if (c.delete()) {
                C9511f f2 = C9511f.m19696f();
                f2.mo43965b("Deleted report file: " + c.getPath());
                return true;
            }
            C9511f f3 = C9511f.m19696f();
            f3.mo43973k("Crashlytics could not delete report file: " + c.getPath());
            return true;
        }
        C9511f.m19696f().mo43974l("Crashlytics report could not be enqueued to DataTransport", task.mo35460k());
        return false;
    }

    /* renamed from: q */
    private void m20945q(@NonNull Throwable th, @NonNull Thread thread, @NonNull String str, @NonNull String str2, long j, boolean z) {
        boolean equals = str2.equals("crash");
        C10450a0.C10460e.C10467d c = this.f15045a.mo44591c(th, thread, str2, j, 4, 8, z);
        String str3 = str;
        this.f15046b.mo23548y(m20936c(c), str, equals);
    }

    /* renamed from: h */
    public void mo44576h(@NonNull String str, @NonNull List<C10029z> list) {
        C9511f.m19696f().mo43965b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        for (C10029z c : list) {
            C10450a0.C10456d.C10458b c2 = c.mo44522c();
            if (c2 != null) {
                arrayList.add(c2);
            }
        }
        this.f15046b.mo23543l(str, C10450a0.C10456d.m21956a().mo45182b(C10494b0.m22173b(arrayList)).mo45181a());
    }

    /* renamed from: i */
    public void mo44577i(long j, @Nullable String str) {
        this.f15046b.mo23542k(str, j);
    }

    /* renamed from: l */
    public boolean mo44578l() {
        return this.f15046b.mo23546r();
    }

    /* renamed from: n */
    public SortedSet<String> mo44579n() {
        return this.f15046b.mo23544p();
    }

    /* renamed from: o */
    public void mo44580o(@NonNull String str, long j) {
        this.f15046b.mo23549z(this.f15045a.mo44592d(str, j));
    }

    /* renamed from: r */
    public void mo44581r(@NonNull Throwable th, @NonNull Thread thread, @NonNull String str, long j) {
        C9511f f = C9511f.m19696f();
        f.mo43971i("Persisting fatal event for session " + str);
        m20945q(th, thread, str, "crash", j, true);
    }

    /* renamed from: s */
    public void mo44582s(@NonNull Throwable th, @NonNull Thread thread, @NonNull String str, long j) {
        C9511f f = C9511f.m19696f();
        f.mo43971i("Persisting non-fatal event for session " + str);
        m20945q(th, thread, str, MediaRouteProviderProtocol.SERVICE_DATA_ERROR, j, false);
    }

    @RequiresApi(api = 30)
    /* renamed from: t */
    public void mo44583t(String str, List<ApplicationExitInfo> list, C10116c cVar, C10128g gVar) {
        ApplicationExitInfo j = m20941j(str, list);
        if (j == null) {
            C9511f f = C9511f.m19696f();
            f.mo43971i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        C10450a0.C10460e.C10467d b = this.f15045a.mo44590b(m20938e(j));
        C9511f f2 = C9511f.m19696f();
        f2.mo43965b("Persisting anr for session " + str);
        this.f15046b.mo23548y(m20937d(b, cVar, gVar), str, true);
    }

    /* renamed from: u */
    public void mo44584u() {
        this.f15046b.mo23541i();
    }

    /* renamed from: v */
    public Task<Void> mo44585v(@NonNull Executor executor) {
        List<C10010p> w = this.f15046b.mo23547w();
        ArrayList arrayList = new ArrayList();
        for (C10010p g : w) {
            arrayList.add(this.f15047c.mo28478g(g).mo35457h(executor, new C9997k0(this)));
        }
        return C10410i.m21832f(arrayList);
    }
}
