package p077e8;

import com.google.firebase.C6922c;
import p245u7.C9896b;
import p245u7.C9898d;

/* renamed from: e8.g */
/* compiled from: ApiClientModule_ProvidesFirebaseAppFactory */
public final class C7494g implements C9896b<C6922c> {

    /* renamed from: a */
    private final C7488d f10386a;

    public C7494g(C7488d dVar) {
        this.f10386a = dVar;
    }

    /* renamed from: a */
    public static C7494g m14705a(C7488d dVar) {
        return new C7494g(dVar);
    }

    /* renamed from: c */
    public static C6922c m14706c(C7488d dVar) {
        return (C6922c) C9898d.m20567c(dVar.mo41202c(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C6922c get() {
        return m14706c(this.f10386a);
    }
}
