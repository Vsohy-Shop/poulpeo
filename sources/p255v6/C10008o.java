package p255v6;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p088f7.C7609d;
import p088f7.C7610e;
import p277x6.C10450a0;
import p277x6.C10494b0;

/* renamed from: v6.o */
/* compiled from: CrashlyticsReportDataCapture */
public class C10008o {

    /* renamed from: e */
    private static final Map<String, Integer> f15052e;

    /* renamed from: f */
    static final String f15053f = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{"18.2.7"});

    /* renamed from: a */
    private final Context f15054a;

    /* renamed from: b */
    private final C10026w f15055b;

    /* renamed from: c */
    private final C9960a f15056c;

    /* renamed from: d */
    private final C7609d f15057d;

    static {
        HashMap hashMap = new HashMap();
        f15052e = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
    }

    public C10008o(Context context, C10026w wVar, C9960a aVar, C7609d dVar) {
        this.f15054a = context;
        this.f15055b = wVar;
        this.f15056c = aVar;
        this.f15057d = dVar;
    }

    /* renamed from: a */
    private C10450a0.C10453b m20961a() {
        return C10450a0.m21910b().mo45172h("18.2.7").mo45168d(this.f15056c.f14937a).mo45169e(this.f15055b.mo44604a()).mo45166b(this.f15056c.f14941e).mo45167c(this.f15056c.f14942f).mo45171g(4);
    }

    /* renamed from: e */
    private static int m20962e() {
        Integer num;
        String str = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str) && (num = f15052e.get(str.toLowerCase(Locale.US))) != null) {
            return num.intValue();
        }
        return 7;
    }

    /* renamed from: f */
    private C10450a0.C10460e.C10467d.C10468a.C10470b.C10471a m20963f() {
        return C10450a0.C10460e.C10467d.C10468a.C10470b.C10471a.m22059a().mo45280b(0).mo45282d(0).mo45281c(this.f15056c.f14940d).mo45283e(this.f15056c.f14938b).mo45279a();
    }

    /* renamed from: g */
    private C10494b0<C10450a0.C10460e.C10467d.C10468a.C10470b.C10471a> m20964g() {
        return C10494b0.m22174d(m20963f());
    }

    /* renamed from: h */
    private C10450a0.C10460e.C10467d.C10468a m20965h(int i, C7610e eVar, Thread thread, int i2, int i3, boolean z) {
        Boolean bool;
        boolean z2;
        ActivityManager.RunningAppProcessInfo j = C9972g.m20820j(this.f15056c.f14940d, this.f15054a);
        if (j != null) {
            if (j.importance != 100) {
                z2 = true;
            } else {
                z2 = false;
            }
            bool = Boolean.valueOf(z2);
        } else {
            bool = null;
        }
        return C10450a0.C10460e.C10467d.C10468a.m22040a().mo45264b(bool).mo45268f(i).mo45266d(m20970m(eVar, thread, i2, i3, z)).mo45263a();
    }

    /* renamed from: i */
    private C10450a0.C10460e.C10467d.C10468a m20966i(int i, C10450a0.C10451a aVar) {
        boolean z;
        if (aVar.mo45148b() != 100) {
            z = true;
        } else {
            z = false;
        }
        return C10450a0.C10460e.C10467d.C10468a.m22040a().mo45264b(Boolean.valueOf(z)).mo45268f(i).mo45266d(m20971n(aVar)).mo45263a();
    }

    /* renamed from: j */
    private C10450a0.C10460e.C10467d.C10483c m20967j(int i) {
        Double d;
        C9966d a = C9966d.m20792a(this.f15054a);
        Float b = a.mo44518b();
        if (b != null) {
            d = Double.valueOf(b.doubleValue());
        } else {
            d = null;
        }
        int c = a.mo44519c();
        boolean o = C9972g.m20825o(this.f15054a);
        long s = C9972g.m20829s() - C9972g.m20811a(this.f15054a);
        return C10450a0.C10460e.C10467d.C10483c.m22123a().mo45340b(d).mo45341c(c).mo45344f(o).mo45343e(i).mo45345g(s).mo45342d(C9972g.m20812b(Environment.getDataDirectory().getPath())).mo45339a();
    }

    /* renamed from: k */
    private C10450a0.C10460e.C10467d.C10468a.C10470b.C10474c m20968k(C7610e eVar, int i, int i2) {
        return m20969l(eVar, i, i2, 0);
    }

    /* renamed from: l */
    private C10450a0.C10460e.C10467d.C10468a.C10470b.C10474c m20969l(C7610e eVar, int i, int i2, int i3) {
        String str = eVar.f10583b;
        String str2 = eVar.f10582a;
        StackTraceElement[] stackTraceElementArr = eVar.f10584c;
        int i4 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        C7610e eVar2 = eVar.f10585d;
        if (i3 >= i2) {
            C7610e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.f10585d;
                i4++;
            }
        }
        C10450a0.C10460e.C10467d.C10468a.C10470b.C10474c.C10475a d = C10450a0.C10460e.C10467d.C10468a.C10470b.C10474c.m22077a().mo45301f(str).mo45300e(str2).mo45298c(C10494b0.m22173b(m20973p(stackTraceElementArr, i))).mo45299d(i4);
        if (eVar2 != null && i4 == 0) {
            d.mo45297b(m20969l(eVar2, i, i2, i3 + 1));
        }
        return d.mo45296a();
    }

    /* renamed from: m */
    private C10450a0.C10460e.C10467d.C10468a.C10470b m20970m(C7610e eVar, Thread thread, int i, int i2, boolean z) {
        return C10450a0.C10460e.C10467d.C10468a.C10470b.m22053a().mo45290f(m20981x(eVar, thread, i, z)).mo45288d(m20968k(eVar, i, i2)).mo45289e(m20978u()).mo45287c(m20964g()).mo45285a();
    }

    /* renamed from: n */
    private C10450a0.C10460e.C10467d.C10468a.C10470b m20971n(C10450a0.C10451a aVar) {
        return C10450a0.C10460e.C10467d.C10468a.C10470b.m22053a().mo45286b(aVar).mo45289e(m20978u()).mo45287c(m20964g()).mo45285a();
    }

    /* renamed from: o */
    private C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e.C10480b m20972o(StackTraceElement stackTraceElement, C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e.C10480b.C10481a aVar) {
        long j;
        long j2 = 0;
        if (stackTraceElement.isNativeMethod()) {
            j = Math.max((long) stackTraceElement.getLineNumber(), 0);
        } else {
            j = 0;
        }
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            j2 = (long) stackTraceElement.getLineNumber();
        }
        return aVar.mo45325e(j).mo45326f(str).mo45322b(fileName).mo45324d(j2).mo45321a();
    }

    /* renamed from: p */
    private C10494b0<C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e.C10480b> m20973p(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement o : stackTraceElementArr) {
            arrayList.add(m20972o(o, C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e.C10480b.m22105a().mo45323c(i)));
        }
        return C10494b0.m22173b(arrayList);
    }

    /* renamed from: q */
    private C10450a0.C10460e.C10461a m20974q() {
        return C10450a0.C10460e.C10461a.m21984a().mo45215e(this.f15055b.mo44605f()).mo45217g(this.f15056c.f14941e).mo45214d(this.f15056c.f14942f).mo45216f(this.f15055b.mo44604a()).mo45212b(this.f15056c.f14943g.mo43963d()).mo45213c(this.f15056c.f14943g.mo43964e()).mo45211a();
    }

    /* renamed from: r */
    private C10450a0.C10460e m20975r(String str, long j) {
        return C10450a0.C10460e.m21968a().mo45230l(j).mo45227i(str).mo45225g(f15053f).mo45220b(m20974q()).mo45229k(m20977t()).mo45222d(m20976s()).mo45226h(3).mo45219a();
    }

    /* renamed from: s */
    private C10450a0.C10460e.C10465c m20976s() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int e = m20962e();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long s = C9972g.m20829s();
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean x = C9972g.m20834x(this.f15054a);
        int m = C9972g.m20823m(this.f15054a);
        String str = Build.MANUFACTURER;
        return C10450a0.C10460e.C10465c.m22013a().mo45242b(e).mo45246f(Build.MODEL).mo45243c(availableProcessors).mo45248h(s).mo45244d(blockCount).mo45249i(x).mo45250j(m).mo45245e(str).mo45247g(Build.PRODUCT).mo45241a();
    }

    /* renamed from: t */
    private C10450a0.C10460e.C10487e m20977t() {
        return C10450a0.C10460e.C10487e.m22141a().mo45356d(3).mo45357e(Build.VERSION.RELEASE).mo45354b(Build.VERSION.CODENAME).mo45355c(C9972g.m20835y(this.f15054a)).mo45353a();
    }

    /* renamed from: u */
    private C10450a0.C10460e.C10467d.C10468a.C10470b.C10476d m20978u() {
        return C10450a0.C10460e.C10467d.C10468a.C10470b.C10476d.m22089a().mo45308d("0").mo45307c("0").mo45306b(0).mo45305a();
    }

    /* renamed from: v */
    private C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e m20979v(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return m20980w(thread, stackTraceElementArr, 0);
    }

    /* renamed from: w */
    private C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e m20980w(Thread thread, StackTraceElement[] stackTraceElementArr, int i) {
        return C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e.m22097a().mo45315d(thread.getName()).mo45314c(i).mo45313b(C10494b0.m22173b(m20973p(stackTraceElementArr, i))).mo45312a();
    }

    /* renamed from: x */
    private C10494b0<C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e> m20981x(C7610e eVar, Thread thread, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m20980w(thread, eVar.f10584c, i));
        if (z) {
            for (Map.Entry next : Thread.getAllStackTraces().entrySet()) {
                Thread thread2 = (Thread) next.getKey();
                if (!thread2.equals(thread)) {
                    arrayList.add(m20979v(thread2, this.f15057d.mo41354a((StackTraceElement[]) next.getValue())));
                }
            }
        }
        return C10494b0.m22173b(arrayList);
    }

    /* renamed from: b */
    public C10450a0.C10460e.C10467d mo44590b(C10450a0.C10451a aVar) {
        int i = this.f15054a.getResources().getConfiguration().orientation;
        return C10450a0.C10460e.C10467d.m22033a().mo45332f("anr").mo45331e(aVar.mo45154h()).mo45328b(m20966i(i, aVar)).mo45329c(m20967j(i)).mo45327a();
    }

    /* renamed from: c */
    public C10450a0.C10460e.C10467d mo44591c(Throwable th, Thread thread, String str, long j, int i, int i2, boolean z) {
        int i3 = this.f15054a.getResources().getConfiguration().orientation;
        Throwable th2 = th;
        String str2 = str;
        long j2 = j;
        return C10450a0.C10460e.C10467d.m22033a().mo45332f(str).mo45331e(j).mo45328b(m20965h(i3, new C7610e(th, this.f15057d), thread, i, i2, z)).mo45329c(m20967j(i3)).mo45327a();
    }

    /* renamed from: d */
    public C10450a0 mo44592d(String str, long j) {
        return m20961a().mo45173i(m20975r(str, j)).mo45165a();
    }
}
