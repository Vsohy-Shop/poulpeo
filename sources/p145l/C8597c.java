package p145l;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.C13121c;
import p080f.C7539e;
import p115i.C8042f;
import p115i.C8058q;
import p145l.C8606i;
import p205r.C9345k;
import p355hf.C12074d;

@SourceDebugExtension({"SMAP\nByteBufferFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteBufferFetcher.kt\ncoil/fetch/ByteBufferFetcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n1#2:37\n*E\n"})
/* renamed from: l.c */
/* compiled from: ByteBufferFetcher.kt */
public final class C8597c implements C8606i {

    /* renamed from: a */
    private final ByteBuffer f12285a;

    /* renamed from: b */
    private final C9345k f12286b;

    /* renamed from: l.c$a */
    /* compiled from: ByteBufferFetcher.kt */
    public static final class C8598a implements C8606i.C8607a<ByteBuffer> {
        /* renamed from: b */
        public C8606i mo42681a(ByteBuffer byteBuffer, C9345k kVar, C7539e eVar) {
            return new C8597c(byteBuffer, kVar);
        }
    }

    public C8597c(ByteBuffer byteBuffer, C9345k kVar) {
        this.f12285a = byteBuffer;
        this.f12286b = kVar;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public Object mo42680a(C12074d<? super C8605h> dVar) {
        try {
            C13121c cVar = new C13121c();
            cVar.write(this.f12285a);
            this.f12285a.position(0);
            return new C8618m(C8058q.m15838a(cVar, this.f12286b.mo43742g()), (String) null, C8042f.MEMORY);
        } catch (Throwable th) {
            this.f12285a.position(0);
            throw th;
        }
    }
}
