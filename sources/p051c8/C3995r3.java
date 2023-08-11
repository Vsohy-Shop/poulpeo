package p051c8;

import p257v8.C10050c;
import p268w8.C10146e;

/* renamed from: c8.r3 */
/* compiled from: TestDeviceHelper */
public class C3995r3 {

    /* renamed from: a */
    private final C3989q3 f3164a;

    /* renamed from: b */
    private boolean f3165b;

    /* renamed from: c */
    private boolean f3166c;

    /* renamed from: d */
    private int f3167d = 0;

    public C3995r3(C3989q3 q3Var) {
        this.f3164a = q3Var;
        this.f3166c = m4681d();
        this.f3165b = m4682e();
    }

    /* renamed from: d */
    private boolean m4681d() {
        return this.f3164a.mo30009a("fresh_install", true);
    }

    /* renamed from: e */
    private boolean m4682e() {
        return this.f3164a.mo30009a("test_device", false);
    }

    /* renamed from: f */
    private void m4683f(boolean z) {
        this.f3166c = z;
        this.f3164a.mo30014f("fresh_install", z);
    }

    /* renamed from: g */
    private void m4684g(boolean z) {
        this.f3165b = z;
        this.f3164a.mo30014f("test_device", z);
    }

    /* renamed from: h */
    private void m4685h() {
        if (this.f3166c) {
            int i = this.f3167d + 1;
            this.f3167d = i;
            if (i >= 5) {
                m4683f(false);
            }
        }
    }

    /* renamed from: a */
    public boolean mo30017a() {
        return this.f3166c;
    }

    /* renamed from: b */
    public boolean mo30018b() {
        return this.f3165b;
    }

    /* renamed from: c */
    public void mo30019c(C10146e eVar) {
        if (!this.f3165b) {
            m4685h();
            for (C10050c M : eVar.mo44743M()) {
                if (M.mo44630M()) {
                    m4684g(true);
                    C3961l2.m4604c("Setting this device as a test device");
                    return;
                }
            }
        }
    }
}
