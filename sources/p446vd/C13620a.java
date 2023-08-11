package p446vd;

import com.rmn.iosadapters.android.content.ContextContainer;

/* renamed from: vd.a */
/* compiled from: AppUpdateVersionManager */
public final class C13620a {

    /* renamed from: c */
    private static C13620a f21933c;

    /* renamed from: a */
    public final String f21934a;

    /* renamed from: b */
    public final boolean f21935b;

    private C13620a(ContextContainer contextContainer) {
        String i = C13636q.m31181b(contextContainer).mo53298i("version_code_str", "0");
        this.f21934a = i;
        this.f21935b = C13621b.m31092f(contextContainer, i);
        C13636q.m31181b(contextContainer).mo53303n("version_code_str", C13621b.m31088b(contextContainer));
    }

    /* renamed from: a */
    public static C13620a m31086a(ContextContainer contextContainer) {
        if (f21933c == null) {
            synchronized (C13620a.class) {
                if (f21933c == null) {
                    f21933c = new C13620a(contextContainer);
                }
            }
        }
        return f21933c;
    }
}
