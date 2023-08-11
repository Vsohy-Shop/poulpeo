package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.squareup.picasso.C11751p;
import com.squareup.picasso.C11764s;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.squareup.picasso.t */
/* compiled from: RequestCreator */
public class C11767t {

    /* renamed from: m */
    private static final AtomicInteger f18373m = new AtomicInteger();

    /* renamed from: a */
    private final C11751p f18374a;

    /* renamed from: b */
    private final C11764s.C11766b f18375b;

    /* renamed from: c */
    private boolean f18376c;

    /* renamed from: d */
    private boolean f18377d;

    /* renamed from: e */
    private boolean f18378e = true;

    /* renamed from: f */
    private int f18379f;

    /* renamed from: g */
    private int f18380g;

    /* renamed from: h */
    private int f18381h;

    /* renamed from: i */
    private int f18382i;

    /* renamed from: j */
    private Drawable f18383j;

    /* renamed from: k */
    private Drawable f18384k;

    /* renamed from: l */
    private Object f18385l;

    C11767t(C11751p pVar, Uri uri, int i) {
        if (!pVar.f18302n) {
            this.f18374a = pVar;
            this.f18375b = new C11764s.C11766b(uri, i, pVar.f18299k);
            return;
        }
        throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
    }

    /* renamed from: b */
    private C11764s m25259b(long j) {
        int andIncrement = f18373m.getAndIncrement();
        C11764s a = this.f18375b.mo48769a();
        a.f18336a = andIncrement;
        a.f18337b = j;
        boolean z = this.f18374a.f18301m;
        if (z) {
            C11774x.m25314t("Main", "created", a.mo48767g(), a.toString());
        }
        C11764s n = this.f18374a.mo48747n(a);
        if (n != a) {
            n.f18336a = andIncrement;
            n.f18337b = j;
            if (z) {
                String d = n.mo48764d();
                C11774x.m25314t("Main", "changed", d, "into " + n);
            }
        }
        return n;
    }

    /* renamed from: c */
    private Drawable m25260c() {
        int i = this.f18379f;
        if (i != 0) {
            return this.f18374a.f18292d.getDrawable(i);
        }
        return this.f18383j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C11767t mo48773a() {
        this.f18385l = null;
        return this;
    }

    /* renamed from: d */
    public void mo48774d(ImageView imageView, Callback callback) {
        Bitmap k;
        ImageView imageView2 = imageView;
        Callback callback2 = callback;
        long nanoTime = System.nanoTime();
        C11774x.m25297c();
        if (imageView2 == null) {
            throw new IllegalArgumentException("Target must not be null.");
        } else if (!this.f18375b.mo48770b()) {
            this.f18374a.mo48737b(imageView2);
            if (this.f18378e) {
                C11761q.m25244d(imageView2, m25260c());
            }
        } else {
            if (this.f18377d) {
                if (!this.f18375b.mo48771c()) {
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    if (width == 0 || height == 0) {
                        if (this.f18378e) {
                            C11761q.m25244d(imageView2, m25260c());
                        }
                        this.f18374a.mo48739d(imageView2, new C11732f(this, imageView2, callback2));
                        return;
                    }
                    this.f18375b.mo48772d(width, height);
                } else {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
            }
            C11764s b = m25259b(nanoTime);
            String f = C11774x.m25300f(b);
            if (!C11746m.m25215a(this.f18381h) || (k = this.f18374a.mo48744k(f)) == null) {
                if (this.f18378e) {
                    C11761q.m25244d(imageView2, m25260c());
                }
                this.f18374a.mo48740f(new C11739i(this.f18374a, imageView, b, this.f18381h, this.f18382i, this.f18380g, this.f18384k, f, this.f18385l, callback, this.f18376c));
                return;
            }
            this.f18374a.mo48737b(imageView2);
            C11751p pVar = this.f18374a;
            Context context = pVar.f18292d;
            C11751p.C11757e eVar = C11751p.C11757e.MEMORY;
            C11761q.m25243c(imageView, context, k, eVar, this.f18376c, pVar.f18300l);
            if (this.f18374a.f18301m) {
                String g = b.mo48767g();
                C11774x.m25314t("Main", "completed", g, "from " + eVar);
            }
            if (callback2 != null) {
                callback.onSuccess();
            }
        }
    }

    /* renamed from: e */
    public C11767t mo48775e(@NonNull NetworkPolicy networkPolicy, @NonNull NetworkPolicy... networkPolicyArr) {
        if (networkPolicy != null) {
            this.f18382i = networkPolicy.f18183b | this.f18382i;
            if (networkPolicyArr != null) {
                if (networkPolicyArr.length > 0) {
                    int length = networkPolicyArr.length;
                    int i = 0;
                    while (i < length) {
                        NetworkPolicy networkPolicy2 = networkPolicyArr[i];
                        if (networkPolicy2 != null) {
                            this.f18382i = networkPolicy2.f18183b | this.f18382i;
                            i++;
                        } else {
                            throw new IllegalArgumentException("Network policy cannot be null.");
                        }
                    }
                }
                return this;
            }
            throw new IllegalArgumentException("Network policy cannot be null.");
        }
        throw new IllegalArgumentException("Network policy cannot be null.");
    }

    /* renamed from: f */
    public C11767t mo48776f(int i, int i2) {
        this.f18375b.mo48772d(i, i2);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C11767t mo48777g() {
        this.f18377d = false;
        return this;
    }
}
