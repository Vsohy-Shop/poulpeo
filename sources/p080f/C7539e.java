package p080f;

import android.content.Context;
import kotlin.Lazy;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import p080f.C7533c;
import p115i.C8051l;
import p125j.C8216a;
import p185p.C9016c;
import p205r.C9333b;
import p205r.C9335d;
import p205r.C9339g;
import p205r.C9342h;
import p259w.C10068h;
import p259w.C10076n;
import p259w.C10080q;
import p259w.C10081r;
import p355hf.C12074d;
import p404of.C13074a;

/* renamed from: f.e */
/* compiled from: ImageLoader.kt */
public interface C7539e {

    @SourceDebugExtension({"SMAP\nImageLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageLoader.kt\ncoil/ImageLoader$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,595:1\n1#2:596\n*E\n"})
    /* renamed from: f.e$a */
    /* compiled from: ImageLoader.kt */
    public static final class C7540a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final Context f10448a;

        /* renamed from: b */
        private C9333b f10449b = C10068h.m21138b();

        /* renamed from: c */
        private Lazy<? extends C9016c> f10450c = null;

        /* renamed from: d */
        private Lazy<? extends C8216a> f10451d = null;

        /* renamed from: e */
        private Lazy<? extends Call.Factory> f10452e = null;

        /* renamed from: f */
        private C7533c.C7536c f10453f = null;

        /* renamed from: g */
        private C7531b f10454g = null;

        /* renamed from: h */
        private C10076n f10455h = new C10076n(false, false, false, 0, (C8051l) null, 31, (DefaultConstructorMarker) null);

        /* renamed from: f.e$a$a */
        /* compiled from: ImageLoader.kt */
        static final class C7541a extends C12777p implements C13074a<C9016c> {

            /* renamed from: g */
            final /* synthetic */ C7540a f10456g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C7541a(C7540a aVar) {
                super(0);
                this.f10456g = aVar;
            }

            /* renamed from: b */
            public final C9016c invoke() {
                return new C9016c.C9017a(this.f10456g.f10448a).mo43212a();
            }
        }

        /* renamed from: f.e$a$b */
        /* compiled from: ImageLoader.kt */
        static final class C7542b extends C12777p implements C13074a<C8216a> {

            /* renamed from: g */
            final /* synthetic */ C7540a f10457g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C7542b(C7540a aVar) {
                super(0);
                this.f10457g = aVar;
            }

            /* renamed from: b */
            public final C8216a invoke() {
                return C10081r.f15235a.mo44658a(this.f10457g.f10448a);
            }
        }

        /* renamed from: f.e$a$c */
        /* compiled from: ImageLoader.kt */
        static final class C7543c extends C12777p implements C13074a<OkHttpClient> {

            /* renamed from: g */
            public static final C7543c f10458g = new C7543c();

            C7543c() {
                super(0);
            }

            /* renamed from: b */
            public final OkHttpClient invoke() {
                return new OkHttpClient();
            }
        }

        public C7540a(Context context) {
            this.f10448a = context.getApplicationContext();
        }

        /* renamed from: b */
        public final C7539e mo41288b() {
            Context context = this.f10448a;
            C9333b bVar = this.f10449b;
            Lazy<? extends C9016c> lazy = this.f10450c;
            if (lazy == null) {
                lazy = C11901h.m25690b(new C7541a(this));
            }
            Lazy<? extends C9016c> lazy2 = lazy;
            Lazy<? extends C8216a> lazy3 = this.f10451d;
            if (lazy3 == null) {
                lazy3 = C11901h.m25690b(new C7542b(this));
            }
            Lazy<? extends C8216a> lazy4 = lazy3;
            Lazy<? extends Call.Factory> lazy5 = this.f10452e;
            if (lazy5 == null) {
                lazy5 = C11901h.m25690b(C7543c.f10458g);
            }
            Lazy<? extends Call.Factory> lazy6 = lazy5;
            C7533c.C7536c cVar = this.f10453f;
            if (cVar == null) {
                cVar = C7533c.C7536c.f10446b;
            }
            C7533c.C7536c cVar2 = cVar;
            C7531b bVar2 = this.f10454g;
            if (bVar2 == null) {
                bVar2 = new C7531b();
            }
            return new C7546h(context, bVar, lazy2, lazy4, lazy6, cVar2, bVar2, this.f10455h, (C10080q) null);
        }
    }

    /* renamed from: a */
    Object mo41283a(C9339g gVar, C12074d<? super C9342h> dVar);

    /* renamed from: b */
    C9333b mo41284b();

    /* renamed from: c */
    C9335d mo41285c(C9339g gVar);

    /* renamed from: d */
    C9016c mo41286d();

    C7531b getComponents();
}
