package p042bo.app;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import p126j0.C8278g;

/* renamed from: bo.app.o3 */
public final class C3503o3 {

    /* renamed from: d */
    public static final C3504a f2292d = new C3504a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Integer f2293a;

    /* renamed from: b */
    private final Integer f2294b;

    /* renamed from: c */
    private final Integer f2295c;

    /* renamed from: bo.app.o3$a */
    public static final class C3504a {
        public /* synthetic */ C3504a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3504a() {
        }
    }

    private C3503o3(Integer num, Integer num2, Integer num3) {
        this.f2293a = num;
        this.f2294b = num2;
        this.f2295c = num3;
    }

    /* renamed from: a */
    public final Integer mo29441a() {
        return this.f2293a;
    }

    /* renamed from: b */
    public final Integer mo29442b() {
        return this.f2295c;
    }

    /* renamed from: c */
    public final Integer mo29443c() {
        return this.f2294b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3503o3)) {
            return false;
        }
        C3503o3 o3Var = (C3503o3) obj;
        if (C12775o.m28634d(this.f2293a, o3Var.f2293a) && C12775o.m28634d(this.f2294b, o3Var.f2294b) && C12775o.m28634d(this.f2295c, o3Var.f2295c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        Integer num = this.f2293a;
        int i3 = 0;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        int i4 = i * 31;
        Integer num2 = this.f2294b;
        if (num2 == null) {
            i2 = 0;
        } else {
            i2 = num2.hashCode();
        }
        int i5 = (i4 + i2) * 31;
        Integer num3 = this.f2295c;
        if (num3 != null) {
            i3 = num3.hashCode();
        }
        return i5 + i3;
    }

    public String toString() {
        return "MessageButtonTheme(backgroundColor=" + this.f2293a + ", textColor=" + this.f2294b + ", borderColor=" + this.f2295c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C3503o3(JSONObject jSONObject) {
        this(C8278g.m16453g(jSONObject, "bg_color"), C8278g.m16453g(jSONObject, "text_color"), C8278g.m16453g(jSONObject, "border_color"));
        C12775o.m28639i(jSONObject, "buttonThemeJson");
    }
}
