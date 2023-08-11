package p115i;

import java.io.File;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.C13130e;
import okio.C13143j;
import okio.C13145j0;
import okio.C13158p0;
import p115i.C8056p;
import p259w.C10070i;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nImageSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageSource.kt\ncoil/decode/SourceImageSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 FileSystem.kt\nokio/FileSystem\n+ 4 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,310:1\n1#2:311\n79#3:312\n160#3:313\n80#3:314\n81#3:320\n52#4,5:315\n60#4,7:321\n57#4,13:328\n*S KotlinDebug\n*F\n+ 1 ImageSource.kt\ncoil/decode/SourceImageSource\n*L\n276#1:312\n276#1:313\n276#1:314\n276#1:320\n276#1:315,5\n276#1:321,7\n276#1:328,13\n*E\n"})
/* renamed from: i.s */
/* compiled from: ImageSource.kt */
public final class C8062s extends C8056p {

    /* renamed from: b */
    private final C8056p.C8057a f11316b;

    /* renamed from: c */
    private boolean f11317c;

    /* renamed from: d */
    private C13130e f11318d;

    /* renamed from: e */
    private C13074a<? extends File> f11319e;

    /* renamed from: f */
    private C13158p0 f11320f;

    public C8062s(C13130e eVar, C13074a<? extends File> aVar, C8056p.C8057a aVar2) {
        super((DefaultConstructorMarker) null);
        this.f11316b = aVar2;
        this.f11318d = eVar;
        this.f11319e = aVar;
    }

    /* renamed from: c */
    private final void m15845c() {
        if (!(!this.f11317c)) {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* renamed from: a */
    public C8056p.C8057a mo41884a() {
        return this.f11316b;
    }

    /* renamed from: b */
    public synchronized C13130e mo41885b() {
        m15845c();
        C13130e eVar = this.f11318d;
        if (eVar != null) {
            return eVar;
        }
        C13143j k = mo41892k();
        C13158p0 p0Var = this.f11320f;
        C12775o.m28636f(p0Var);
        C13130e d = C13145j0.m29739d(k.mo50374q(p0Var));
        this.f11318d = d;
        return d;
    }

    public synchronized void close() {
        this.f11317c = true;
        C13130e eVar = this.f11318d;
        if (eVar != null) {
            C10070i.m21144d(eVar);
        }
        C13158p0 p0Var = this.f11320f;
        if (p0Var != null) {
            mo41892k().mo52647h(p0Var);
        }
    }

    /* renamed from: k */
    public C13143j mo41892k() {
        return C13143j.f20927b;
    }
}
