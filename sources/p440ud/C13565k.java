package p440ud;

import com.rmn.iosadapters.android.content.ContextContainer;

/* renamed from: ud.k */
/* compiled from: ResourcePluralWrapper */
public class C13565k {

    /* renamed from: a */
    public int f21821a;

    public C13565k() {
    }

    /* renamed from: a */
    public static String m30967a(ContextContainer contextContainer, int i, double d) {
        return contextContainer.mo47843a().getResources().getQuantityString(i, (int) Math.ceil(d));
    }

    /* renamed from: b */
    public static String m30968b(ContextContainer contextContainer, int i, double d, Object... objArr) {
        return contextContainer.mo47843a().getResources().getQuantityString(i, (int) Math.ceil(d), objArr);
    }

    /* renamed from: c */
    public String mo53217c(ContextContainer contextContainer, double d, Object... objArr) {
        return m30968b(contextContainer, this.f21821a, d, objArr);
    }

    public C13565k(int i) {
        this.f21821a = i;
    }
}
