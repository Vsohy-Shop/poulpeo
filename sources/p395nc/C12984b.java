package p395nc;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;
import p368jd.C12616b;

@StabilityInferred(parameters = 0)
/* renamed from: nc.b */
/* compiled from: BaseSignInWithApple.kt */
public abstract class C12984b {

    /* renamed from: d */
    public static final C12985a f20780d = new C12985a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final int f20781e = 8;

    /* renamed from: a */
    private final String f20782a = "";

    /* renamed from: b */
    private final String f20783b = "";
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Function1<? super C12994g, C11921v> f20784c;

    /* renamed from: nc.b$a */
    /* compiled from: BaseSignInWithApple.kt */
    public static final class C12985a {
        private C12985a() {
        }

        public /* synthetic */ C12985a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: nc.b$b */
    /* compiled from: BaseSignInWithApple.kt */
    static final class C12986b extends C12777p implements Function1<C12994g, C11921v> {

        /* renamed from: g */
        final /* synthetic */ C12984b f20785g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12986b(C12984b bVar) {
            super(1);
            this.f20785g = bVar;
        }

        /* renamed from: a */
        public final void mo50905a(C12994g gVar) {
            C12775o.m28639i(gVar, "it");
            Function1 a = this.f20785g.f20784c;
            if (a != null) {
                a.invoke(gVar);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo50905a((C12994g) obj);
            return C11921v.f18618a;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo50901b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract String mo50902c();

    /* renamed from: d */
    public void mo50903d(C12616b bVar, Function1<? super C12994g, C11921v> function1) {
        C12775o.m28639i(bVar, "activity");
        this.f20784c = function1;
        C12990e a = C12990e.f20790e.mo50909a(C12982a.CREATOR.mo50896a(mo50902c(), mo50901b()));
        a.mo50908N0(new C12986b(this));
        a.show(bVar.getSupportFragmentManager(), "SignInWithAppleService");
    }

    /* renamed from: e */
    public void mo50904e() {
    }
}
