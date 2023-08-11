package p115i;

import android.content.Context;
import java.io.Closeable;
import java.io.File;
import kotlin.jvm.internal.C12777p;
import okio.C13130e;
import okio.C13143j;
import okio.C13158p0;
import p115i.C8056p;
import p259w.C10070i;
import p404of.C13074a;

/* renamed from: i.q */
/* compiled from: ImageSource.kt */
public final class C8058q {

    /* renamed from: i.q$a */
    /* compiled from: ImageSource.kt */
    static final class C8059a extends C12777p implements C13074a<File> {

        /* renamed from: g */
        final /* synthetic */ Context f11311g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8059a(Context context) {
            super(0);
            this.f11311g = context;
        }

        /* renamed from: b */
        public final File invoke() {
            return C10070i.m21153m(this.f11311g);
        }
    }

    /* renamed from: i.q$b */
    /* compiled from: ImageSource.kt */
    static final class C8060b extends C12777p implements C13074a<File> {

        /* renamed from: g */
        final /* synthetic */ Context f11312g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8060b(Context context) {
            super(0);
            this.f11312g = context;
        }

        /* renamed from: b */
        public final File invoke() {
            return C10070i.m21153m(this.f11312g);
        }
    }

    /* renamed from: a */
    public static final C8056p m15838a(C13130e eVar, Context context) {
        return new C8062s(eVar, new C8059a(context), (C8056p.C8057a) null);
    }

    /* renamed from: b */
    public static final C8056p m15839b(C13130e eVar, Context context, C8056p.C8057a aVar) {
        return new C8062s(eVar, new C8060b(context), aVar);
    }

    /* renamed from: c */
    public static final C8056p m15840c(C13158p0 p0Var, C13143j jVar, String str, Closeable closeable) {
        return new C8055o(p0Var, jVar, str, closeable, (C8056p.C8057a) null);
    }

    /* renamed from: d */
    public static /* synthetic */ C8056p m15841d(C13158p0 p0Var, C13143j jVar, String str, Closeable closeable, int i, Object obj) {
        if ((i & 2) != 0) {
            jVar = C13143j.f20927b;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            closeable = null;
        }
        return m15840c(p0Var, jVar, str, closeable);
    }
}
