package p203q7;

import android.content.Context;
import android.content.SharedPreferences;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: q7.g */
/* compiled from: HeartBeatInfoStorage */
class C9324g {

    /* renamed from: c */
    private static C9324g f13696c;

    /* renamed from: d */
    private static final SimpleDateFormat f13697d = new SimpleDateFormat("dd/MM/yyyy z");

    /* renamed from: a */
    private final SharedPreferences f13698a;

    /* renamed from: b */
    private final SharedPreferences f13699b;

    private C9324g(Context context) {
        this.f13698a = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
        this.f13699b = context.getSharedPreferences("FirebaseAppHeartBeatStorage", 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public static synchronized C9324g m19190a(Context context) {
        C9324g gVar;
        synchronized (C9324g.class) {
            if (f13696c == null) {
                f13696c = new C9324g(context);
            }
            gVar = f13696c;
        }
        return gVar;
    }

    /* renamed from: b */
    static boolean m19191b(long j, long j2) {
        Date date = new Date(j);
        Date date2 = new Date(j2);
        SimpleDateFormat simpleDateFormat = f13697d;
        return !simpleDateFormat.format(date).equals(simpleDateFormat.format(date2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized boolean mo43613c(long j) {
        return mo43614d("fire-global", j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized boolean mo43614d(String str, long j) {
        if (!this.f13698a.contains(str)) {
            this.f13698a.edit().putLong(str, j).apply();
            return true;
        } else if (!m19191b(this.f13698a.getLong(str, -1), j)) {
            return false;
        } else {
            this.f13698a.edit().putLong(str, j).apply();
            return true;
        }
    }
}
