package p166n0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p031b0.C2812g;
import p126j0.C8266c;
import p270x.C10156b;
import p270x.C10300f;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: n0.c */
/* compiled from: BaseBrazeActionStep.kt */
public abstract class C8842c implements C8849e {

    /* renamed from: a */
    public static final C8843a f12811a = new C8843a((DefaultConstructorMarker) null);

    /* renamed from: n0.c$a */
    /* compiled from: BaseBrazeActionStep.kt */
    public static final class C8843a {

        /* renamed from: n0.c$a$a */
        /* compiled from: BaseBrazeActionStep.kt */
        public static final class C8844a implements C2812g<C10300f> {

            /* renamed from: a */
            final /* synthetic */ Function1<C10300f, C11921v> f12812a;

            /* renamed from: n0.c$a$a$a */
            /* compiled from: BaseBrazeActionStep.kt */
            static final class C8845a extends C12777p implements C13074a<String> {

                /* renamed from: g */
                public static final C8845a f12813g = new C8845a();

                C8845a() {
                    super(0);
                }

                public final String invoke() {
                    return "Failed to run on Braze user object";
                }
            }

            C8844a(Function1<? super C10300f, C11921v> function1) {
                this.f12812a = function1;
            }

            /* renamed from: b */
            public void mo28292a(C10300f fVar) {
                C12775o.m28639i(fVar, "value");
                this.f12812a.invoke(fVar);
            }

            /* renamed from: d */
            public void mo28293d() {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C8845a.f12813g, 7, (Object) null);
            }
        }

        private C8843a() {
        }

        public /* synthetic */ C8843a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo42976a(C10156b bVar, Function1<? super C10300f, C11921v> function1) {
            C12775o.m28639i(bVar, "<this>");
            C12775o.m28639i(function1, "block");
            bVar.mo44769M(new C8844a(function1));
        }
    }

    private C8842c() {
    }

    public /* synthetic */ C8842c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
