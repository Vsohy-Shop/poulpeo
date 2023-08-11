package p454wf;

import java.util.Iterator;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.collections.C12662a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p436tf.C13528f;

/* renamed from: wf.i */
/* compiled from: Regex.kt */
final class C13732i implements C13731h {

    /* renamed from: a */
    private final Matcher f22172a;

    /* renamed from: b */
    private final CharSequence f22173b;

    /* renamed from: c */
    private final C13730g f22174c = new C13733a(this);

    /* renamed from: wf.i$a */
    /* compiled from: Regex.kt */
    public static final class C13733a extends C12662a<C13729f> implements C13730g {

        /* renamed from: b */
        final /* synthetic */ C13732i f22175b;

        /* renamed from: wf.i$a$a */
        /* compiled from: Regex.kt */
        static final class C13734a extends C12777p implements Function1<Integer, C13729f> {

            /* renamed from: g */
            final /* synthetic */ C13733a f22176g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13734a(C13733a aVar) {
                super(1);
                this.f22176g = aVar;
            }

            /* renamed from: b */
            public final C13729f mo53409b(int i) {
                return this.f22176g.mo53408j(i);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return mo53409b(((Number) obj).intValue());
            }
        }

        C13733a(C13732i iVar) {
            this.f22175b = iVar;
        }

        /* renamed from: b */
        public /* bridge */ boolean mo53407b(C13729f fVar) {
            return super.contains(fVar);
        }

        public final /* bridge */ boolean contains(Object obj) {
            boolean z;
            if (obj == null) {
                z = true;
            } else {
                z = obj instanceof C13729f;
            }
            if (!z) {
                return false;
            }
            return mo53407b((C13729f) obj);
        }

        public int getSize() {
            return this.f22175b.m31433c().groupCount() + 1;
        }

        public boolean isEmpty() {
            return false;
        }

        public Iterator<C13729f> iterator() {
            return C13662o.m31287t(C12686e0.m28213R(C12726w.m28525l(this)), new C13734a(this)).iterator();
        }

        /* renamed from: j */
        public C13729f mo53408j(int i) {
            C13528f c = C13741k.m31453f(this.f22175b.m31433c(), i);
            if (c.getStart().intValue() < 0) {
                return null;
            }
            String group = this.f22175b.m31433c().group(i);
            C12775o.m28638h(group, "matchResult.group(index)");
            return new C13729f(group, c);
        }
    }

    public C13732i(Matcher matcher, CharSequence charSequence) {
        C12775o.m28639i(matcher, "matcher");
        C12775o.m28639i(charSequence, "input");
        this.f22172a = matcher;
        this.f22173b = charSequence;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final MatchResult m31433c() {
        return this.f22172a;
    }

    /* renamed from: a */
    public C13528f mo53404a() {
        return C13741k.m31452e(m31433c());
    }

    public String getValue() {
        String group = m31433c().group();
        C12775o.m28638h(group, "matchResult.group()");
        return group;
    }

    public C13731h next() {
        int i;
        int end = m31433c().end();
        if (m31433c().end() == m31433c().start()) {
            i = 1;
        } else {
            i = 0;
        }
        int i2 = end + i;
        if (i2 > this.f22173b.length()) {
            return null;
        }
        Matcher matcher = this.f22172a.pattern().matcher(this.f22173b);
        C12775o.m28638h(matcher, "matcher.pattern().matcher(input)");
        return C13741k.m31451d(matcher, i2, this.f22173b);
    }
}
