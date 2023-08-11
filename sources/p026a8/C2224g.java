package p026a8;

import android.app.Application;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.firebase.inappmessaging.model.MessageType;
import p278x7.C10582l;

/* renamed from: a8.g */
/* compiled from: InflaterConfigModule */
public class C2224g {

    /* renamed from: b */
    public static int f1013b = 327938;

    /* renamed from: c */
    public static int f1014c = 327970;

    /* renamed from: a */
    private int f1015a = 65824;

    /* renamed from: a8.g$a */
    /* compiled from: InflaterConfigModule */
    static /* synthetic */ class C2225a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1016a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.google.firebase.inappmessaging.model.MessageType[] r0 = com.google.firebase.inappmessaging.model.MessageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1016a = r0
                com.google.firebase.inappmessaging.model.MessageType r1 = com.google.firebase.inappmessaging.model.MessageType.MODAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1016a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.inappmessaging.model.MessageType r1 = com.google.firebase.inappmessaging.model.MessageType.CARD     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1016a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.inappmessaging.model.MessageType r1 = com.google.firebase.inappmessaging.model.MessageType.IMAGE_ONLY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1016a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.firebase.inappmessaging.model.MessageType r1 = com.google.firebase.inappmessaging.model.MessageType.BANNER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p026a8.C2224g.C2225a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static String m1879a(MessageType messageType, int i) {
        if (i == 1) {
            int i2 = C2225a.f1016a[messageType.ordinal()];
            if (i2 == 1) {
                return "MODAL_PORTRAIT";
            }
            if (i2 == 2) {
                return "CARD_PORTRAIT";
            }
            if (i2 == 3) {
                return "IMAGE_ONLY_PORTRAIT";
            }
            if (i2 != 4) {
                return null;
            }
            return "BANNER_PORTRAIT";
        }
        int i3 = C2225a.f1016a[messageType.ordinal()];
        if (i3 == 1) {
            return "MODAL_LANDSCAPE";
        }
        if (i3 == 2) {
            return "CARD_LANDSCAPE";
        }
        if (i3 == 3) {
            return "IMAGE_ONLY_LANDSCAPE";
        }
        if (i3 != 4) {
            return null;
        }
        return "BANNER_LANDSCAPE";
    }

    /* renamed from: b */
    public C10582l mo23571b(DisplayMetrics displayMetrics) {
        C10582l.C10583a q = C10582l.m22487q();
        Float valueOf = Float.valueOf(0.3f);
        C10582l.C10583a m = q.mo45533i(valueOf).mo45534j(valueOf).mo45531g(Integer.valueOf((int) (((float) displayMetrics.heightPixels) * 0.5f))).mo45532h(Integer.valueOf((int) (((float) displayMetrics.widthPixels) * 0.9f))).mo45535k(48).mo45536l(Integer.valueOf(this.f1015a)).mo45538n(-1).mo45537m(-2);
        Boolean bool = Boolean.TRUE;
        return m.mo45528d(bool).mo45526b(bool).mo45527c(bool).mo45525a();
    }

    /* renamed from: c */
    public C10582l mo23572c(DisplayMetrics displayMetrics) {
        C10582l.C10583a q = C10582l.m22487q();
        Float valueOf = Float.valueOf(0.3f);
        C10582l.C10583a m = q.mo45533i(valueOf).mo45534j(valueOf).mo45531g(Integer.valueOf((int) (((float) displayMetrics.heightPixels) * 0.5f))).mo45532h(Integer.valueOf((int) (((float) displayMetrics.widthPixels) * 0.9f))).mo45535k(48).mo45536l(Integer.valueOf(this.f1015a)).mo45538n(-1).mo45537m(-2);
        Boolean bool = Boolean.TRUE;
        return m.mo45528d(bool).mo45526b(bool).mo45527c(bool).mo45525a();
    }

    /* renamed from: d */
    public C10582l mo23573d(DisplayMetrics displayMetrics) {
        C10582l.C10583a m = C10582l.m22487q().mo45531g(Integer.valueOf((int) (((double) displayMetrics.heightPixels) * 0.8d))).mo45532h(Integer.valueOf(displayMetrics.widthPixels)).mo45533i(Float.valueOf(1.0f)).mo45534j(Float.valueOf(0.5f)).mo45535k(17).mo45536l(Integer.valueOf(f1014c)).mo45538n(-2).mo45537m(-2);
        Boolean bool = Boolean.FALSE;
        return m.mo45528d(bool).mo45526b(bool).mo45527c(bool).mo45525a();
    }

    /* renamed from: e */
    public C10582l mo23574e(DisplayMetrics displayMetrics) {
        C10582l.C10583a m = C10582l.m22487q().mo45531g(Integer.valueOf((int) (((double) displayMetrics.heightPixels) * 0.8d))).mo45532h(Integer.valueOf((int) (((float) displayMetrics.widthPixels) * 0.7f))).mo45533i(Float.valueOf(0.6f)).mo45534j(Float.valueOf(1.0f)).mo45529e(Float.valueOf(0.1f)).mo45530f(Float.valueOf(0.9f)).mo45535k(17).mo45536l(Integer.valueOf(f1014c)).mo45538n(-2).mo45537m(-2);
        Boolean bool = Boolean.FALSE;
        return m.mo45528d(bool).mo45526b(bool).mo45527c(bool).mo45525a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public DisplayMetrics mo23575f(Application application) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) application.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* renamed from: g */
    public C10582l mo23576g(DisplayMetrics displayMetrics) {
        C10582l.C10583a h = C10582l.m22487q().mo45531g(Integer.valueOf((int) (((float) displayMetrics.heightPixels) * 0.9f))).mo45532h(Integer.valueOf((int) (((float) displayMetrics.widthPixels) * 0.9f)));
        Float valueOf = Float.valueOf(0.8f);
        C10582l.C10583a m = h.mo45534j(valueOf).mo45533i(valueOf).mo45535k(17).mo45536l(Integer.valueOf(f1013b)).mo45538n(-2).mo45537m(-2);
        Boolean bool = Boolean.FALSE;
        return m.mo45528d(bool).mo45526b(bool).mo45527c(bool).mo45525a();
    }

    /* renamed from: h */
    public C10582l mo23577h(DisplayMetrics displayMetrics) {
        C10582l.C10583a i = C10582l.m22487q().mo45531g(Integer.valueOf((int) (((double) displayMetrics.heightPixels) * 0.8d))).mo45532h(Integer.valueOf(displayMetrics.widthPixels)).mo45533i(Float.valueOf(1.0f));
        Float valueOf = Float.valueOf(0.4f);
        C10582l.C10583a m = i.mo45534j(valueOf).mo45529e(Float.valueOf(0.6f)).mo45530f(valueOf).mo45535k(17).mo45536l(Integer.valueOf(f1013b)).mo45538n(-1).mo45537m(-1);
        Boolean bool = Boolean.FALSE;
        return m.mo45528d(bool).mo45526b(bool).mo45527c(bool).mo45525a();
    }

    /* renamed from: i */
    public C10582l mo23578i(DisplayMetrics displayMetrics) {
        C10582l.C10583a e = C10582l.m22487q().mo45531g(Integer.valueOf((int) (((double) displayMetrics.heightPixels) * 0.8d))).mo45532h(Integer.valueOf((int) (((float) displayMetrics.widthPixels) * 0.7f))).mo45533i(Float.valueOf(0.6f)).mo45529e(Float.valueOf(0.1f));
        Float valueOf = Float.valueOf(0.9f);
        C10582l.C10583a m = e.mo45534j(valueOf).mo45530f(valueOf).mo45535k(17).mo45536l(Integer.valueOf(f1013b)).mo45538n(-1).mo45537m(-2);
        Boolean bool = Boolean.FALSE;
        return m.mo45528d(bool).mo45526b(bool).mo45527c(bool).mo45525a();
    }

    /* renamed from: j */
    public C10582l mo23579j(DisplayMetrics displayMetrics) {
        C10582l.C10583a h = C10582l.m22487q().mo45531g(Integer.valueOf((int) (((float) displayMetrics.heightPixels) * 0.9f))).mo45532h(Integer.valueOf((int) (((float) displayMetrics.widthPixels) * 0.9f)));
        Float valueOf = Float.valueOf(0.8f);
        C10582l.C10583a m = h.mo45534j(valueOf).mo45533i(valueOf).mo45535k(17).mo45536l(Integer.valueOf(f1013b)).mo45538n(-2).mo45537m(-2);
        Boolean bool = Boolean.FALSE;
        return m.mo45528d(bool).mo45526b(bool).mo45527c(bool).mo45525a();
    }
}
