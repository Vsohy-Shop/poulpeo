package p115i;

import java.io.Closeable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.C13130e;
import okio.C13143j;
import okio.C13145j0;
import okio.C13158p0;
import p115i.C8056p;
import p259w.C10070i;

@SourceDebugExtension({"SMAP\nImageSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageSource.kt\ncoil/decode/FileImageSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,310:1\n1#2:311\n*E\n"})
/* renamed from: i.o */
/* compiled from: ImageSource.kt */
public final class C8055o extends C8056p {

    /* renamed from: b */
    private final C13158p0 f11304b;

    /* renamed from: c */
    private final C13143j f11305c;

    /* renamed from: d */
    private final String f11306d;

    /* renamed from: e */
    private final Closeable f11307e;

    /* renamed from: f */
    private final C8056p.C8057a f11308f;

    /* renamed from: g */
    private boolean f11309g;

    /* renamed from: h */
    private C13130e f11310h;

    public C8055o(C13158p0 p0Var, C13143j jVar, String str, Closeable closeable, C8056p.C8057a aVar) {
        super((DefaultConstructorMarker) null);
        this.f11304b = p0Var;
        this.f11305c = jVar;
        this.f11306d = str;
        this.f11307e = closeable;
        this.f11308f = aVar;
    }

    /* renamed from: c */
    private final void m15831c() {
        if (!(!this.f11309g)) {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* renamed from: A */
    public C13143j mo41883A() {
        return this.f11305c;
    }

    /* renamed from: a */
    public C8056p.C8057a mo41884a() {
        return this.f11308f;
    }

    /* renamed from: b */
    public synchronized C13130e mo41885b() {
        m15831c();
        C13130e eVar = this.f11310h;
        if (eVar != null) {
            return eVar;
        }
        C13130e d = C13145j0.m29739d(mo41883A().mo50374q(this.f11304b));
        this.f11310h = d;
        return d;
    }

    public synchronized void close() {
        this.f11309g = true;
        C13130e eVar = this.f11310h;
        if (eVar != null) {
            C10070i.m21144d(eVar);
        }
        Closeable closeable = this.f11307e;
        if (closeable != null) {
            C10070i.m21144d(closeable);
        }
    }

    /* renamed from: k */
    public final String mo41887k() {
        return this.f11306d;
    }
}
