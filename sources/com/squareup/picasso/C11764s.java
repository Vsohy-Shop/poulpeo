package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.C0127Px;
import com.squareup.picasso.C11751p;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p452wd.C13697d;

/* renamed from: com.squareup.picasso.s */
/* compiled from: Request */
public final class C11764s {

    /* renamed from: u */
    private static final long f18335u = TimeUnit.SECONDS.toNanos(5);

    /* renamed from: a */
    int f18336a;

    /* renamed from: b */
    long f18337b;

    /* renamed from: c */
    int f18338c;

    /* renamed from: d */
    public final Uri f18339d;

    /* renamed from: e */
    public final int f18340e;

    /* renamed from: f */
    public final String f18341f;

    /* renamed from: g */
    public final List<C13697d> f18342g;

    /* renamed from: h */
    public final int f18343h;

    /* renamed from: i */
    public final int f18344i;

    /* renamed from: j */
    public final boolean f18345j;

    /* renamed from: k */
    public final int f18346k;

    /* renamed from: l */
    public final boolean f18347l;

    /* renamed from: m */
    public final boolean f18348m;

    /* renamed from: n */
    public final float f18349n;

    /* renamed from: o */
    public final float f18350o;

    /* renamed from: p */
    public final float f18351p;

    /* renamed from: q */
    public final boolean f18352q;

    /* renamed from: r */
    public final boolean f18353r;

    /* renamed from: s */
    public final Bitmap.Config f18354s;

    /* renamed from: t */
    public final C11751p.C11758f f18355t;

    /* renamed from: com.squareup.picasso.s$b */
    /* compiled from: Request */
    public static final class C11766b {

        /* renamed from: a */
        private Uri f18356a;

        /* renamed from: b */
        private int f18357b;

        /* renamed from: c */
        private String f18358c;

        /* renamed from: d */
        private int f18359d;

        /* renamed from: e */
        private int f18360e;

        /* renamed from: f */
        private boolean f18361f;

        /* renamed from: g */
        private int f18362g;

        /* renamed from: h */
        private boolean f18363h;

        /* renamed from: i */
        private boolean f18364i;

        /* renamed from: j */
        private float f18365j;

        /* renamed from: k */
        private float f18366k;

        /* renamed from: l */
        private float f18367l;

        /* renamed from: m */
        private boolean f18368m;

        /* renamed from: n */
        private boolean f18369n;

        /* renamed from: o */
        private List<C13697d> f18370o;

        /* renamed from: p */
        private Bitmap.Config f18371p;

        /* renamed from: q */
        private C11751p.C11758f f18372q;

        C11766b(Uri uri, int i, Bitmap.Config config) {
            this.f18356a = uri;
            this.f18357b = i;
            this.f18371p = config;
        }

        /* renamed from: a */
        public C11764s mo48769a() {
            boolean z = this.f18363h;
            if (z && this.f18361f) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            } else if (this.f18361f && this.f18359d == 0 && this.f18360e == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            } else if (z && this.f18359d == 0 && this.f18360e == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            } else {
                if (this.f18372q == null) {
                    this.f18372q = C11751p.C11758f.NORMAL;
                }
                C11764s sVar = r2;
                C11764s sVar2 = new C11764s(this.f18356a, this.f18357b, this.f18358c, this.f18370o, this.f18359d, this.f18360e, this.f18361f, this.f18363h, this.f18362g, this.f18364i, this.f18365j, this.f18366k, this.f18367l, this.f18368m, this.f18369n, this.f18371p, this.f18372q);
                return sVar;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo48770b() {
            if (this.f18356a == null && this.f18357b == 0) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo48771c() {
            if (this.f18359d == 0 && this.f18360e == 0) {
                return false;
            }
            return true;
        }

        /* renamed from: d */
        public C11766b mo48772d(@C0127Px int i, @C0127Px int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            } else if (i2 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            } else if (i2 == 0 && i == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            } else {
                this.f18359d = i;
                this.f18360e = i2;
                return this;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo48761a() {
        Uri uri = this.f18339d;
        if (uri != null) {
            return String.valueOf(uri.getPath());
        }
        return Integer.toHexString(this.f18340e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo48762b() {
        if (this.f18342g != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo48763c() {
        if (this.f18343h == 0 && this.f18344i == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo48764d() {
        long nanoTime = System.nanoTime() - this.f18337b;
        if (nanoTime > f18335u) {
            return mo48767g() + '+' + TimeUnit.NANOSECONDS.toSeconds(nanoTime) + 's';
        }
        return mo48767g() + '+' + TimeUnit.NANOSECONDS.toMillis(nanoTime) + "ms";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo48765e() {
        if (mo48763c() || this.f18349n != 0.0f) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo48766f() {
        if (mo48765e() || mo48762b()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo48767g() {
        return "[R" + this.f18336a + ']';
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i = this.f18340e;
        if (i > 0) {
            sb.append(i);
        } else {
            sb.append(this.f18339d);
        }
        List<C13697d> list = this.f18342g;
        if (list != null && !list.isEmpty()) {
            for (C13697d key : this.f18342g) {
                sb.append(' ');
                sb.append(key.key());
            }
        }
        if (this.f18341f != null) {
            sb.append(" stableKey(");
            sb.append(this.f18341f);
            sb.append(')');
        }
        if (this.f18343h > 0) {
            sb.append(" resize(");
            sb.append(this.f18343h);
            sb.append(',');
            sb.append(this.f18344i);
            sb.append(')');
        }
        if (this.f18345j) {
            sb.append(" centerCrop");
        }
        if (this.f18347l) {
            sb.append(" centerInside");
        }
        if (this.f18349n != 0.0f) {
            sb.append(" rotation(");
            sb.append(this.f18349n);
            if (this.f18352q) {
                sb.append(" @ ");
                sb.append(this.f18350o);
                sb.append(',');
                sb.append(this.f18351p);
            }
            sb.append(')');
        }
        if (this.f18353r) {
            sb.append(" purgeable");
        }
        if (this.f18354s != null) {
            sb.append(' ');
            sb.append(this.f18354s);
        }
        sb.append('}');
        return sb.toString();
    }

    private C11764s(Uri uri, int i, String str, List<C13697d> list, int i2, int i3, boolean z, boolean z2, int i4, boolean z3, float f, float f2, float f3, boolean z4, boolean z5, Bitmap.Config config, C11751p.C11758f fVar) {
        this.f18339d = uri;
        this.f18340e = i;
        this.f18341f = str;
        if (list == null) {
            this.f18342g = null;
        } else {
            this.f18342g = Collections.unmodifiableList(list);
        }
        this.f18343h = i2;
        this.f18344i = i3;
        this.f18345j = z;
        this.f18347l = z2;
        this.f18346k = i4;
        this.f18348m = z3;
        this.f18349n = f;
        this.f18350o = f2;
        this.f18351p = f3;
        this.f18352q = z4;
        this.f18353r = z5;
        this.f18354s = config;
        this.f18355t = fVar;
    }
}
