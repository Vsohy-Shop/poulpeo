package p419ra;

import androidx.fragment.app.Fragment;
import com.poulpeo.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p393na.C12975k;
import p399oa.C13025e;
import p443va.C13606b;

/* renamed from: ra.d */
/* compiled from: MainMenuItem.kt */
public enum C13269d {
    ;
    

    /* renamed from: e */
    public static final C13270a f21163e = null;

    /* renamed from: b */
    private final int f21168b;

    /* renamed from: c */
    private final String f21169c;

    /* renamed from: d */
    private final String f21170d;

    /* renamed from: ra.d$a */
    /* compiled from: MainMenuItem.kt */
    public static final class C13270a {
        private C13270a() {
        }

        public /* synthetic */ C13270a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C13269d mo52913a(int i) {
            return C13269d.values()[i];
        }

        /* renamed from: b */
        public final C13269d mo52914b(int i) {
            boolean z;
            for (C13269d dVar : C13269d.values()) {
                if (dVar.mo52909b() == i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return dVar;
                }
            }
            return null;
        }
    }

    /* renamed from: ra.d$b */
    /* compiled from: MainMenuItem.kt */
    static final class C13271b extends C13269d {
        C13271b(String str, int i) {
            super(str, i, R.id.main_menu_earnings, "earnings_fragment", "pot", (DefaultConstructorMarker) null);
        }

        /* renamed from: e */
        public Fragment mo52912e() {
            return new C12975k();
        }
    }

    /* renamed from: ra.d$c */
    /* compiled from: MainMenuItem.kt */
    static final class C13272c extends C13269d {
        C13272c(String str, int i) {
            super(str, i, R.id.main_menu_favorites, "favorites_fragment", "favorites", (DefaultConstructorMarker) null);
        }

        /* renamed from: e */
        public Fragment mo52912e() {
            return new C13606b();
        }
    }

    /* renamed from: ra.d$d */
    /* compiled from: MainMenuItem.kt */
    static final class C13273d extends C13269d {
        C13273d(String str, int i) {
            super(str, i, R.id.main_menu_home, "home_fragment", "home", (DefaultConstructorMarker) null);
        }

        /* renamed from: e */
        public Fragment mo52912e() {
            return new C13025e();
        }
    }

    static {
        f21163e = new C13270a((DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public final int mo52909b() {
        return this.f21168b;
    }

    /* renamed from: c */
    public final String mo52910c() {
        return this.f21169c;
    }

    /* renamed from: d */
    public final String mo52911d() {
        return this.f21170d;
    }

    /* renamed from: e */
    public abstract Fragment mo52912e();

    private C13269d(int i, String str, String str2) {
        this.f21168b = i;
        this.f21169c = str;
        this.f21170d = str2;
        if (i <= 0) {
            throw new IllegalArgumentException();
        }
    }
}
