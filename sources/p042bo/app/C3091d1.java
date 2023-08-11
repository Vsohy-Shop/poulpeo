package p042bo.app;

import androidx.recyclerview.widget.ItemTouchHelper;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C12760f0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: bo.app.d1 */
public final class C3091d1 implements C3765w1 {

    /* renamed from: e */
    public static final C3092a f1619e = new C3092a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final int f1620a;

    /* renamed from: b */
    private final int f1621b;

    /* renamed from: c */
    private final Random f1622c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f1623d;

    /* renamed from: bo.app.d1$a */
    public static final class C3092a {
        public /* synthetic */ C3092a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo28815a(Random random, int i, int i2) {
            C12775o.m28639i(random, "random");
            return random.nextInt(Math.abs(i - i2) + 1) + Math.min(i, i2);
        }

        private C3092a() {
        }
    }

    /* renamed from: bo.app.d1$b */
    static final class C3093b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C12760f0 f1624b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3093b(C12760f0 f0Var) {
            super(0);
            this.f1624b = f0Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Sleep time too small: " + this.f1624b.f20416b + " increasing to 250";
        }
    }

    /* renamed from: bo.app.d1$c */
    static final class C3094c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3091d1 f1625b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3094c(C3091d1 d1Var) {
            super(0);
            this.f1625b = d1Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Computing new sleep delay. Previous sleep delay: ", Integer.valueOf(this.f1625b.f1623d));
        }
    }

    /* renamed from: bo.app.d1$d */
    static final class C3095d extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3091d1 f1626b;

        /* renamed from: c */
        final /* synthetic */ C12760f0 f1627c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3095d(C3091d1 d1Var, C12760f0 f0Var) {
            super(0);
            this.f1626b = d1Var;
            this.f1627c = f0Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return "New sleep duration: " + this.f1626b.f1623d + " ms. Default sleep duration: " + this.f1627c.f20416b + " ms. Max sleep: " + this.f1626b.f1620a + " ms.";
        }
    }

    public C3091d1(int i, int i2) {
        this.f1620a = i;
        this.f1621b = i2;
        this.f1622c = new Random();
    }

    /* renamed from: c */
    public void mo28814c() {
        this.f1623d = 0;
    }

    /* renamed from: a */
    public int mo28811a() {
        return mo28812a(this.f1621b);
    }

    /* renamed from: b */
    public boolean mo28813b() {
        return this.f1623d != 0;
    }

    /* renamed from: a */
    public int mo28812a(int i) {
        C12760f0 f0Var = new C12760f0();
        f0Var.f20416b = i;
        if (i < 250) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3093b(f0Var), 7, (Object) null);
            f0Var.f20416b = ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION;
        }
        if (this.f1623d == 0) {
            this.f1623d = ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION;
        }
        C8266c cVar = C8266c.f11641a;
        C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, new C3094c(this), 7, (Object) null);
        this.f1623d = Math.min(this.f1620a, f1619e.mo28815a(this.f1622c, Math.max(f0Var.f20416b, this.f1623d), this.f1623d * 3));
        C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, new C3095d(this, f0Var), 7, (Object) null);
        return this.f1623d;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3091d1(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? (int) TimeUnit.SECONDS.toMillis(1) : i2);
    }
}
