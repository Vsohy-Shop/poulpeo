package p026a8;

import android.app.Application;
import android.view.LayoutInflater;
import p101g8.C7817i;
import p278x7.C10582l;

/* renamed from: a8.q */
/* compiled from: InflaterModule */
public class C2235q {

    /* renamed from: a */
    private final C7817i f1035a;

    /* renamed from: b */
    private final C10582l f1036b;

    /* renamed from: c */
    private final Application f1037c;

    public C2235q(C7817i iVar, C10582l lVar, Application application) {
        this.f1035a = iVar;
        this.f1036b = lVar;
        this.f1037c = application;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C10582l mo23589a() {
        return this.f1036b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C7817i mo23590b() {
        return this.f1035a;
    }

    /* renamed from: c */
    public LayoutInflater mo23591c() {
        return (LayoutInflater) this.f1037c.getSystemService("layout_inflater");
    }
}
