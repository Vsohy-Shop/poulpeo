package p326db;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.impl.api.models.Merchant;
import java.util.Date;

/* renamed from: db.e */
/* compiled from: PurchaseNavigationData */
public class C11800e {
    @NonNull

    /* renamed from: h */
    private static final C11800e f18430h = new C11800e();

    /* renamed from: a */
    private boolean f18431a = false;
    @Nullable

    /* renamed from: b */
    private String f18432b;

    /* renamed from: c */
    private boolean f18433c;
    @Nullable

    /* renamed from: d */
    private Date f18434d;

    /* renamed from: e */
    private int f18435e;
    @Nullable

    /* renamed from: f */
    private String f18436f;
    @Nullable

    /* renamed from: g */
    private Merchant f18437g;

    private C11800e() {
    }

    @NonNull
    /* renamed from: a */
    public static C11800e m25362a() {
        return f18430h;
    }

    @Nullable
    /* renamed from: b */
    public Merchant mo48936b() {
        return this.f18437g;
    }

    @NonNull
    /* renamed from: c */
    public String mo48937c() {
        return this.f18436f;
    }

    /* renamed from: d */
    public int mo48938d(@NonNull String str) {
        String str2 = this.f18432b;
        if (str2 == null || !str.equals(str2)) {
            return 0;
        }
        if (this.f18434d != null) {
            return this.f18435e + ((int) (((float) (new Date().getTime() - this.f18434d.getTime())) / 1000.0f));
        }
        return this.f18435e;
    }

    /* renamed from: e */
    public boolean mo48939e() {
        if (this.f18436f != null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo48940f(@NonNull String str) {
        String str2 = this.f18432b;
        if (str2 != null && str.equals(str2)) {
            return this.f18433c;
        }
        return false;
    }

    /* renamed from: g */
    public boolean mo48941g() {
        return this.f18431a;
    }

    /* renamed from: h */
    public void mo48942h() {
        if (this.f18434d != null) {
            this.f18435e = (int) (((float) this.f18435e) + (((float) (new Date().getTime() - this.f18434d.getTime())) / 1000.0f));
            this.f18434d = null;
        }
    }

    /* renamed from: i */
    public void mo48943i() {
        this.f18434d = new Date();
    }

    /* renamed from: j */
    public void mo48944j() {
        this.f18432b = null;
        this.f18433c = false;
        this.f18434d = null;
        this.f18435e = 0;
        this.f18436f = null;
    }

    /* renamed from: k */
    public boolean mo48945k(@NonNull String str) {
        if (!mo48940f(str) || mo48938d(str) <= 300) {
            return false;
        }
        mo48944j();
        return true;
    }

    /* renamed from: l */
    public void mo48946l() {
        this.f18431a = false;
    }

    /* renamed from: m */
    public void mo48947m(@NonNull String str, boolean z) {
        this.f18432b = str;
        this.f18433c = z;
    }

    /* renamed from: n */
    public void mo48948n(@Nullable String str) {
        this.f18436f = str;
    }

    /* renamed from: o */
    public void mo48949o(@Nullable Merchant merchant) {
        this.f18437g = merchant;
    }
}
