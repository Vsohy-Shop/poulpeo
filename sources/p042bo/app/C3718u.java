package p042bo.app;

import com.appboy.enums.CardKey;
import com.appboy.enums.CardType;
import com.appboy.models.cards.Card;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import org.json.JSONArray;
import org.json.JSONObject;
import p116i0.C8063a;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: bo.app.u */
public final class C3718u {

    /* renamed from: a */
    public static final C3718u f2639a = new C3718u();

    /* renamed from: bo.app.u$a */
    public /* synthetic */ class C3719a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2640a;

        static {
            int[] iArr = new int[CardType.values().length];
            iArr[CardType.BANNER.ordinal()] = 1;
            iArr[CardType.CAPTIONED_IMAGE.ordinal()] = 2;
            iArr[CardType.SHORT_NEWS.ordinal()] = 3;
            iArr[CardType.TEXT_ANNOUNCEMENT.ordinal()] = 4;
            iArr[CardType.CONTROL.ordinal()] = 5;
            f2640a = iArr;
        }
    }

    /* renamed from: bo.app.u$b */
    public static final class C3720b extends C12777p implements Function1<Integer, Boolean> {

        /* renamed from: b */
        final /* synthetic */ JSONArray f2641b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3720b(JSONArray jSONArray) {
            super(1);
            this.f2641b = jSONArray;
        }

        /* renamed from: a */
        public final Boolean mo29721a(int i) {
            return Boolean.valueOf(this.f2641b.opt(i) instanceof Object);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo29721a(((Number) obj).intValue());
        }
    }

    /* renamed from: bo.app.u$c */
    public static final class C3721c extends C12777p implements Function1<Integer, Object> {

        /* renamed from: b */
        final /* synthetic */ JSONArray f2642b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3721c(JSONArray jSONArray) {
            super(1);
            this.f2642b = jSONArray;
        }

        /* renamed from: a */
        public final Object mo29722a(int i) {
            Object obj = this.f2642b.get(i);
            if (obj != null) {
                return obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo29722a(((Number) obj).intValue());
        }
    }

    /* renamed from: bo.app.u$d */
    static final class C3722d extends C12777p implements Function1<Object, Card> {

        /* renamed from: b */
        final /* synthetic */ CardKey.Provider f2643b;

        /* renamed from: c */
        final /* synthetic */ C3023b2 f2644c;

        /* renamed from: d */
        final /* synthetic */ C8063a<?> f2645d;

        /* renamed from: e */
        final /* synthetic */ C3096d2 f2646e;

        /* renamed from: f */
        final /* synthetic */ JSONArray f2647f;

        /* renamed from: bo.app.u$d$a */
        static final class C3723a extends C12777p implements C13074a<String> {

            /* renamed from: b */
            final /* synthetic */ Object f2648b;

            /* renamed from: c */
            final /* synthetic */ JSONArray f2649c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3723a(Object obj, JSONArray jSONArray) {
                super(0);
                this.f2648b = obj;
                this.f2649c = jSONArray;
            }

            /* renamed from: a */
            public final String invoke() {
                return "Unable to create Card JSON in array. Ignoring. Was on element: " + this.f2648b + " of json array: " + this.f2649c;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3722d(CardKey.Provider provider, C3023b2 b2Var, C8063a<?> aVar, C3096d2 d2Var, JSONArray jSONArray) {
            super(1);
            this.f2643b = provider;
            this.f2644c = b2Var;
            this.f2645d = aVar;
            this.f2646e = d2Var;
            this.f2647f = jSONArray;
        }

        /* renamed from: a */
        public final Card invoke(Object obj) {
            C12775o.m28639i(obj, "it");
            try {
                return C3718u.f2639a.m3961a(obj.toString(), this.f2643b, this.f2644c, this.f2645d, this.f2646e);
            } catch (Exception e) {
                C8266c.m16396e(C8266c.f11641a, C3718u.f2639a, C8266c.C8267a.f11649e, e, false, new C3723a(obj, this.f2647f), 4, (Object) null);
                return null;
            }
        }
    }

    private C3718u() {
    }

    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r0v15, types: [com.appboy.models.cards.BannerImageCard] */
    /* JADX WARNING: type inference failed for: r0v16, types: [com.appboy.models.cards.CaptionedImageCard] */
    /* JADX WARNING: type inference failed for: r0v17, types: [com.appboy.models.cards.ShortNewsCard] */
    /* JADX WARNING: type inference failed for: r0v18, types: [com.appboy.models.cards.TextAnnouncementCard] */
    /* JADX WARNING: type inference failed for: r0v19, types: [com.appboy.models.cards.ControlCard] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.appboy.models.cards.Card m3962a(org.json.JSONObject r7, com.appboy.enums.CardKey.Provider r8, p042bo.app.C3023b2 r9, p116i0.C8063a<?> r10, p042bo.app.C3096d2 r11) {
        /*
            java.lang.String r0 = "jsonObject"
            kotlin.jvm.internal.C12775o.m28639i(r7, r0)
            java.lang.String r0 = "cardKeyProvider"
            kotlin.jvm.internal.C12775o.m28639i(r8, r0)
            java.lang.String r0 = "brazeManager"
            kotlin.jvm.internal.C12775o.m28639i(r9, r0)
            java.lang.String r0 = "cardStorageProvider"
            kotlin.jvm.internal.C12775o.m28639i(r10, r0)
            java.lang.String r0 = "cardAnalyticsProvider"
            kotlin.jvm.internal.C12775o.m28639i(r11, r0)
            com.appboy.enums.CardType r0 = r8.getCardTypeFromJson(r7)
            if (r0 != 0) goto L_0x0021
            r0 = -1
            goto L_0x0029
        L_0x0021:
            int[] r1 = p042bo.app.C3718u.C3719a.f2640a
            int r0 = r0.ordinal()
            r0 = r1[r0]
        L_0x0029:
            r1 = 1
            if (r0 == r1) goto L_0x006b
            r1 = 2
            if (r0 == r1) goto L_0x005f
            r1 = 3
            if (r0 == r1) goto L_0x0053
            r1 = 4
            if (r0 == r1) goto L_0x0047
            r1 = 5
            if (r0 == r1) goto L_0x003b
            r7 = 0
            goto L_0x0077
        L_0x003b:
            com.appboy.models.cards.ControlCard r6 = new com.appboy.models.cards.ControlCard
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x0076
        L_0x0047:
            com.appboy.models.cards.TextAnnouncementCard r6 = new com.appboy.models.cards.TextAnnouncementCard
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x0076
        L_0x0053:
            com.appboy.models.cards.ShortNewsCard r6 = new com.appboy.models.cards.ShortNewsCard
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x0076
        L_0x005f:
            com.appboy.models.cards.CaptionedImageCard r6 = new com.appboy.models.cards.CaptionedImageCard
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x0076
        L_0x006b:
            com.appboy.models.cards.BannerImageCard r6 = new com.appboy.models.cards.BannerImageCard
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
        L_0x0076:
            r7 = r6
        L_0x0077:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3718u.m3962a(org.json.JSONObject, com.appboy.enums.CardKey$Provider, bo.app.b2, i0.a, bo.app.d2):com.appboy.models.cards.Card");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Card m3961a(String str, CardKey.Provider provider, C3023b2 b2Var, C8063a<?> aVar, C3096d2 d2Var) {
        return m3962a(new JSONObject(str), provider, b2Var, aVar, d2Var);
    }

    /* renamed from: a */
    public static final List<Card> m3963a(JSONArray jSONArray, CardKey.Provider provider, C3023b2 b2Var, C8063a<?> aVar, C3096d2 d2Var) {
        C12775o.m28639i(jSONArray, "cardJsonStringArray");
        C12775o.m28639i(provider, "cardKeyProvider");
        C12775o.m28639i(b2Var, "brazeManager");
        C12775o.m28639i(aVar, "cardStorageProvider");
        C12775o.m28639i(d2Var, "cardAnalyticsProvider");
        return C13662o.m31293z(C13662o.m31288u(C13657m.m31269c(C13662o.m31287t(C13662o.m31280m(C12686e0.m28213R(C13537l.m30893t(0, jSONArray.length())), new C3720b(jSONArray)), new C3721c(jSONArray)).iterator()), new C3722d(provider, b2Var, aVar, d2Var, jSONArray)));
    }
}
