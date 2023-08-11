package p259w;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p205r.C9332a;
import p205r.C9333b;
import p205r.C9339g;
import p215s.C9409d;
import p215s.C9410e;
import p215s.C9418l;
import p226t.C9588b;
import p248v.C9909c;
import p466yf.C13971h0;

/* renamed from: w.h */
/* compiled from: Requests.kt */
public final class C10068h {

    /* renamed from: a */
    private static final C9333b f15212a = new C9333b((C13971h0) null, (C13971h0) null, (C13971h0) null, (C13971h0) null, (C9909c.C9910a) null, (C9410e) null, (Bitmap.Config) null, false, false, (Drawable) null, (Drawable) null, (Drawable) null, (C9332a) null, (C9332a) null, (C9332a) null, 32767, (DefaultConstructorMarker) null);

    /* renamed from: w.h$a */
    /* compiled from: Requests.kt */
    public /* synthetic */ class C10069a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15213a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                s.e[] r0 = p215s.C9410e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                s.e r1 = p215s.C9410e.EXACT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                s.e r1 = p215s.C9410e.INEXACT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                s.e r1 = p215s.C9410e.AUTOMATIC     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f15213a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p259w.C10068h.C10069a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static final boolean m21137a(C9339g gVar) {
        int i = C10069a.f15213a[gVar.mo43696H().ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            } else if ((gVar.mo43718q().mo43680m() != null || !(gVar.mo43699K() instanceof C9409d)) && (!(gVar.mo43701M() instanceof C9588b) || !(gVar.mo43699K() instanceof C9418l) || !(((C9588b) gVar.mo43701M()).getView() instanceof ImageView) || ((C9588b) gVar.mo43701M()).getView() != ((C9418l) gVar.mo43699K()).getView())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final C9333b m21138b() {
        return f15212a;
    }

    /* renamed from: c */
    public static final Drawable m21139c(C9339g gVar, Drawable drawable, @DrawableRes Integer num, Drawable drawable2) {
        if (drawable != null) {
            return drawable;
        }
        if (num == null) {
            return drawable2;
        }
        if (num.intValue() == 0) {
            return null;
        }
        return C10064d.m21128a(gVar.mo43713l(), num.intValue());
    }
}
