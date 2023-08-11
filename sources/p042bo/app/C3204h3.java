package p042bo.app;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import p126j0.C8278g;

/* renamed from: bo.app.h3 */
public final class C3204h3 {

    /* renamed from: h */
    public static final C3205a f1794h = new C3205a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Integer f1795a;

    /* renamed from: b */
    private final Integer f1796b;

    /* renamed from: c */
    private final Integer f1797c;

    /* renamed from: d */
    private final Integer f1798d;

    /* renamed from: e */
    private final Integer f1799e;

    /* renamed from: f */
    private final Integer f1800f;

    /* renamed from: g */
    private final Integer f1801g;

    /* renamed from: bo.app.h3$a */
    public static final class C3205a {
        public /* synthetic */ C3205a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3205a() {
        }
    }

    private C3204h3(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7) {
        this.f1795a = num;
        this.f1796b = num2;
        this.f1797c = num3;
        this.f1798d = num4;
        this.f1799e = num5;
        this.f1800f = num6;
        this.f1801g = num7;
    }

    /* renamed from: a */
    public final Integer mo28991a() {
        return this.f1795a;
    }

    /* renamed from: b */
    public final Integer mo28992b() {
        return this.f1797c;
    }

    /* renamed from: c */
    public final Integer mo28993c() {
        return this.f1801g;
    }

    /* renamed from: d */
    public final Integer mo28994d() {
        return this.f1800f;
    }

    /* renamed from: e */
    public final Integer mo28995e() {
        return this.f1799e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3204h3)) {
            return false;
        }
        C3204h3 h3Var = (C3204h3) obj;
        if (C12775o.m28634d(this.f1795a, h3Var.f1795a) && C12775o.m28634d(this.f1796b, h3Var.f1796b) && C12775o.m28634d(this.f1797c, h3Var.f1797c) && C12775o.m28634d(this.f1798d, h3Var.f1798d) && C12775o.m28634d(this.f1799e, h3Var.f1799e) && C12775o.m28634d(this.f1800f, h3Var.f1800f) && C12775o.m28634d(this.f1801g, h3Var.f1801g)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final Integer mo28997f() {
        return this.f1798d;
    }

    /* renamed from: g */
    public final Integer mo28998g() {
        return this.f1796b;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Integer num = this.f1795a;
        int i7 = 0;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        int i8 = i * 31;
        Integer num2 = this.f1796b;
        if (num2 == null) {
            i2 = 0;
        } else {
            i2 = num2.hashCode();
        }
        int i9 = (i8 + i2) * 31;
        Integer num3 = this.f1797c;
        if (num3 == null) {
            i3 = 0;
        } else {
            i3 = num3.hashCode();
        }
        int i10 = (i9 + i3) * 31;
        Integer num4 = this.f1798d;
        if (num4 == null) {
            i4 = 0;
        } else {
            i4 = num4.hashCode();
        }
        int i11 = (i10 + i4) * 31;
        Integer num5 = this.f1799e;
        if (num5 == null) {
            i5 = 0;
        } else {
            i5 = num5.hashCode();
        }
        int i12 = (i11 + i5) * 31;
        Integer num6 = this.f1800f;
        if (num6 == null) {
            i6 = 0;
        } else {
            i6 = num6.hashCode();
        }
        int i13 = (i12 + i6) * 31;
        Integer num7 = this.f1801g;
        if (num7 != null) {
            i7 = num7.hashCode();
        }
        return i13 + i7;
    }

    public String toString() {
        return "InAppMessageTheme(backgroundColor=" + this.f1795a + ", textColor=" + this.f1796b + ", closeButtonColor=" + this.f1797c + ", iconColor=" + this.f1798d + ", iconBackgroundColor=" + this.f1799e + ", headerTextColor=" + this.f1800f + ", frameColor=" + this.f1801g + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C3204h3(JSONObject jSONObject) {
        this(C8278g.m16453g(jSONObject, "bg_color"), C8278g.m16453g(jSONObject, "text_color"), C8278g.m16453g(jSONObject, "close_btn_color"), C8278g.m16453g(jSONObject, "icon_color"), C8278g.m16453g(jSONObject, "icon_bg_color"), C8278g.m16453g(jSONObject, "header_text_color"), C8278g.m16453g(jSONObject, "frame_color"));
        C12775o.m28639i(jSONObject, "messageThemeJson");
    }
}
