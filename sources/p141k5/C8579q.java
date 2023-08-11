package p141k5;

/* renamed from: k5.q */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
abstract class C8579q extends C8568f<String> {

    /* renamed from: d */
    final CharSequence f12247d;

    /* renamed from: e */
    final C8573k f12248e;

    /* renamed from: f */
    final boolean f12249f;

    /* renamed from: g */
    int f12250g = 0;

    /* renamed from: h */
    int f12251h;

    protected C8579q(C8580r rVar, CharSequence charSequence) {
        this.f12248e = rVar.f12252a;
        this.f12249f = rVar.f12253b;
        this.f12251h = Integer.MAX_VALUE;
        this.f12247d = charSequence;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo42631a() {
        int e;
        int i;
        int i2 = this.f12250g;
        while (true) {
            int i3 = this.f12250g;
            if (i3 != -1) {
                e = mo42640e(i3);
                if (e == -1) {
                    e = this.f12247d.length();
                    this.f12250g = -1;
                    i = -1;
                } else {
                    i = mo42639d(e);
                    this.f12250g = i;
                }
                if (i == i2) {
                    int i4 = i + 1;
                    this.f12250g = i4;
                    if (i4 > this.f12247d.length()) {
                        this.f12250g = -1;
                    }
                } else {
                    if (i2 < e) {
                        this.f12247d.charAt(i2);
                    }
                    if (i2 < e) {
                        this.f12247d.charAt(e - 1);
                    }
                    if (!this.f12249f || i2 != e) {
                        int i5 = this.f12251h;
                    } else {
                        i2 = this.f12250g;
                    }
                }
            } else {
                mo42632c();
                return null;
            }
        }
        int i52 = this.f12251h;
        if (i52 == 1) {
            e = this.f12247d.length();
            this.f12250g = -1;
            if (e > i2) {
                this.f12247d.charAt(e - 1);
            }
        } else {
            this.f12251h = i52 - 1;
        }
        return this.f12247d.subSequence(i2, e).toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract int mo42639d(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract int mo42640e(int i);
}
