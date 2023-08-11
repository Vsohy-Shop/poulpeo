package p042bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.Constants;
import com.appboy.enums.CardKey;
import com.appboy.models.cards.Card;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p031b0.C2807d;
import p116i0.C8063a;
import p126j0.C8266c;
import p126j0.C8273e;
import p126j0.C8300j;
import p336ef.C11906l;
import p404of.C13074a;

/* renamed from: bo.app.a0 */
public final class C2962a0 implements C8063a<C2807d> {

    /* renamed from: f */
    public static final C2963a f1386f = new C2963a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final Set<String> f1387g = C12731y0.m28555i(CardKey.VIEWED.getContentCardsKey(), CardKey.DISMISSED.getContentCardsKey());
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f1388a;

    /* renamed from: b */
    private final C3023b2 f1389b;

    /* renamed from: c */
    private final SharedPreferences f1390c;

    /* renamed from: d */
    private final SharedPreferences f1391d;

    /* renamed from: e */
    private final C3096d2 f1392e;

    /* renamed from: bo.app.a0$a */
    public static final class C2963a {
        public /* synthetic */ C2963a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final JSONObject mo28547a(JSONObject jSONObject, JSONObject jSONObject2) {
            C12775o.m28639i(jSONObject2, "serverCard");
            if (jSONObject == null) {
                return jSONObject2;
            }
            JSONObject jSONObject3 = new JSONObject();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject3.put(next, jSONObject.get(next));
            }
            Iterator<String> keys2 = jSONObject2.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                if (C2962a0.f1387g.contains(next2)) {
                    jSONObject3.put(next2, jSONObject.getBoolean(next2) || jSONObject2.getBoolean(next2));
                } else {
                    jSONObject3.put(next2, jSONObject2.get(next2));
                }
            }
            return jSONObject3;
        }

        /* renamed from: b */
        public final boolean mo28549b(JSONObject jSONObject, JSONObject jSONObject2) {
            C12775o.m28639i(jSONObject2, "serverCard");
            if (jSONObject == null) {
                return false;
            }
            String contentCardsKey = CardKey.CREATED.getContentCardsKey();
            if (!jSONObject.has(contentCardsKey) || !jSONObject2.has(contentCardsKey) || jSONObject.getLong(contentCardsKey) <= jSONObject2.getLong(contentCardsKey)) {
                return false;
            }
            return true;
        }

        private C2963a() {
        }

        /* renamed from: a */
        public final boolean mo28548a(JSONObject jSONObject, CardKey cardKey) {
            C12775o.m28639i(jSONObject, "json");
            C12775o.m28639i(cardKey, "cardKey");
            String contentCardsKey = cardKey.getContentCardsKey();
            if (jSONObject.has(contentCardsKey)) {
                return jSONObject.getBoolean(contentCardsKey);
            }
            return false;
        }
    }

    /* renamed from: bo.app.a0$b */
    static final class C2964b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f1393b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2964b(String str) {
            super(0);
            this.f1393b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Adding card to test cache: ", this.f1393b);
        }
    }

    /* renamed from: bo.app.a0$c */
    static final class C2965c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f1394b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2965c(String str) {
            super(0);
            this.f1394b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Deleting expired card from storage with id: ", this.f1394b);
        }
    }

    /* renamed from: bo.app.a0$d */
    static final class C2966d extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f1395b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2966d(String str) {
            super(0);
            this.f1395b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Card not present in storage for id: ", this.f1395b);
        }
    }

    /* renamed from: bo.app.a0$e */
    static final class C2967e extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f1396b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2967e(String str) {
            super(0);
            this.f1396b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Failed to read card json from storage. Json: ", this.f1396b);
        }
    }

    /* renamed from: bo.app.a0$f */
    static final class C2968f extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f1397b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2968f(String str) {
            super(0);
            this.f1397b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Removing card from test cache: ", this.f1397b);
        }
    }

    /* renamed from: bo.app.a0$g */
    static final class C2969g extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f1398b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2969g(String str) {
            super(0);
            this.f1398b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Removing card from storage with id: ", this.f1398b);
        }
    }

    /* renamed from: bo.app.a0$h */
    static final class C2970h extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C2970h f1399b = new C2970h();

        C2970h() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "The server card received is older than the cached card. Discarding the server card.";
        }
    }

    /* renamed from: bo.app.a0$i */
    static final class C2971i extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ JSONObject f1400b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2971i(JSONObject jSONObject) {
            super(0);
            this.f1400b = jSONObject;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Server card json: ", this.f1400b);
        }
    }

    /* renamed from: bo.app.a0$j */
    static final class C2972j extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ JSONObject f1401b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2972j(JSONObject jSONObject) {
            super(0);
            this.f1401b = jSONObject;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Cached card json: ", this.f1401b);
        }
    }

    /* renamed from: bo.app.a0$k */
    static final class C2973k extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f1402b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2973k(String str) {
            super(0);
            this.f1402b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Server card is marked as removed. Removing from card storage with id: ", this.f1402b);
        }
    }

    /* renamed from: bo.app.a0$l */
    static final class C2974l extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ JSONObject f1403b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2974l(JSONObject jSONObject) {
            super(0);
            this.f1403b = jSONObject;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Server card was locally dismissed already. Not adding card to storage. Server card: ", this.f1403b);
        }
    }

    /* renamed from: bo.app.a0$m */
    static final class C2975m extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ JSONObject f1404b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2975m(JSONObject jSONObject) {
            super(0);
            this.f1404b = jSONObject;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Server card has expired already. Not adding card to storage. Server card: ", this.f1404b);
        }
    }

    /* renamed from: bo.app.a0$n */
    static final class C2976n extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f1405b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2976n(String str) {
            super(0);
            this.f1405b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Server card is marked as dismissed. Adding to dismissed cached and removing from card storage with id: ", this.f1405b);
        }
    }

    /* renamed from: bo.app.a0$o */
    static final class C2977o extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f1406b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2977o(String str) {
            super(0);
            this.f1406b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Can't update card field. Json cannot be parsed from disk or is not present. Id: ", this.f1406b);
        }
    }

    /* renamed from: bo.app.a0$p */
    static final class C2978p extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ Object f1407b;

        /* renamed from: c */
        final /* synthetic */ CardKey f1408c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2978p(Object obj, CardKey cardKey) {
            super(0);
            this.f1407b = obj;
            this.f1408c = cardKey;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to update card json field to " + this.f1407b + " with key: " + this.f1408c;
        }
    }

    /* renamed from: bo.app.a0$q */
    public static final class C2979q extends C12777p implements Function1<Integer, Boolean> {

        /* renamed from: b */
        final /* synthetic */ JSONArray f1409b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2979q(JSONArray jSONArray) {
            super(1);
            this.f1409b = jSONArray;
        }

        /* renamed from: a */
        public final Boolean mo28565a(int i) {
            return Boolean.valueOf(this.f1409b.opt(i) instanceof JSONObject);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo28565a(((Number) obj).intValue());
        }
    }

    /* renamed from: bo.app.a0$r */
    public static final class C2980r extends C12777p implements Function1<Integer, JSONObject> {

        /* renamed from: b */
        final /* synthetic */ JSONArray f1410b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2980r(JSONArray jSONArray) {
            super(1);
            this.f1410b = jSONArray;
        }

        /* renamed from: a */
        public final JSONObject mo28566a(int i) {
            Object obj = this.f1410b.get(i);
            if (obj != null) {
                return (JSONObject) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo28566a(((Number) obj).intValue());
        }
    }

    /* renamed from: bo.app.a0$s */
    static final class C2981s extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C2981s f1411b = new C2981s();

        C2981s() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Input user id was null. Defaulting to the empty user id";
        }
    }

    /* renamed from: bo.app.a0$t */
    static final class C2982t extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ Ref$ObjectRef<String> f1412b;

        /* renamed from: c */
        final /* synthetic */ C2962a0 f1413c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2982t(Ref$ObjectRef<String> ref$ObjectRef, C2962a0 a0Var) {
            super(0);
            this.f1412b = ref$ObjectRef;
            this.f1413c = a0Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return "The received cards are for user " + this.f1412b.f20403b + " and the current user is " + this.f1413c.f1388a + " , the cards will be discarded and no changes will be made.";
        }
    }

    /* renamed from: bo.app.a0$u */
    static final class C2983u extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ Ref$ObjectRef<String> f1414b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2983u(Ref$ObjectRef<String> ref$ObjectRef) {
            super(0);
            this.f1414b = ref$ObjectRef;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Updating offline Content Cards for user with id: ", this.f1414b.f20403b);
        }
    }

    public C2962a0(Context context, String str, String str2, C3023b2 b2Var, String str3) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(str, "userId");
        C12775o.m28639i(str2, "apiKey");
        C12775o.m28639i(b2Var, "brazeManager");
        C12775o.m28639i(str3, "currentSdkVersion");
        this.f1388a = str;
        this.f1389b = b2Var;
        String c = C8300j.m16489c(context, str, str2);
        this.f1391d = C3587q5.m3684a(context, C12775o.m28647q("com.braze.storage.content_cards_storage_provider.metadata", c), str3);
        SharedPreferences sharedPreferences = context.getSharedPreferences(C12775o.m28647q("com.appboy.storage.content_cards_storage_provider.cards", c), 0);
        C12775o.m28638h(sharedPreferences, "context.getSharedPrefere…ix, Context.MODE_PRIVATE)");
        this.f1390c = sharedPreferences;
        this.f1392e = new C3800y();
    }

    /* renamed from: g */
    private final long m2478g() {
        return this.f1391d.getLong("last_storage_update_timestamp", 0);
    }

    /* renamed from: i */
    private final void m2479i() {
        this.f1391d.edit().putLong("last_storage_update_timestamp", C8273e.m16436i()).apply();
    }

    /* renamed from: b */
    public C2807d getCachedCardsAsEvent() {
        return mo28521a(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        r0 = kotlin.collections.C12686e0.m28218W(r0);
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Set<java.lang.String> mo28532c() {
        /*
            r3 = this;
            android.content.SharedPreferences r0 = r3.f1391d
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.lang.String r2 = "dismissed"
            java.util.Set r0 = r0.getStringSet(r2, r1)
            if (r0 != 0) goto L_0x0010
            goto L_0x0016
        L_0x0010:
            java.util.List r0 = kotlin.collections.C12686e0.m28218W(r0)
            if (r0 != 0) goto L_0x0018
        L_0x0016:
            r0 = 0
            goto L_0x001c
        L_0x0018:
            java.util.Set r0 = kotlin.collections.C12686e0.m28208E0(r0)
        L_0x001c:
            if (r0 != 0) goto L_0x0026
            java.util.Set r0 = kotlin.collections.C12731y0.m28551e()
            java.util.Set r0 = kotlin.collections.C12686e0.m28208E0(r0)
        L_0x0026:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C2962a0.mo28532c():java.util.Set");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        r0 = kotlin.collections.C12686e0.m28218W(r0);
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Set<java.lang.String> mo28535d() {
        /*
            r3 = this;
            android.content.SharedPreferences r0 = r3.f1391d
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.lang.String r2 = "expired"
            java.util.Set r0 = r0.getStringSet(r2, r1)
            if (r0 != 0) goto L_0x0010
            goto L_0x0016
        L_0x0010:
            java.util.List r0 = kotlin.collections.C12686e0.m28218W(r0)
            if (r0 != 0) goto L_0x0018
        L_0x0016:
            r0 = 0
            goto L_0x001c
        L_0x0018:
            java.util.Set r0 = kotlin.collections.C12686e0.m28208E0(r0)
        L_0x001c:
            if (r0 != 0) goto L_0x0026
            java.util.Set r0 = kotlin.collections.C12731y0.m28551e()
            java.util.Set r0 = kotlin.collections.C12686e0.m28208E0(r0)
        L_0x0026:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C2962a0.mo28535d():java.util.Set");
    }

    /* renamed from: e */
    public final long mo28537e() {
        return this.f1391d.getLong("last_card_updated_at", 0);
    }

    /* renamed from: f */
    public final long mo28539f() {
        return this.f1391d.getLong("last_full_sync_at", 0);
    }

    /* renamed from: h */
    public final Set<String> mo28542h() {
        Set<String> set;
        List W;
        Set<String> stringSet = this.f1391d.getStringSet("test", new HashSet());
        if (stringSet == null || (W = C12686e0.m28218W(stringSet)) == null) {
            set = null;
        } else {
            set = C12686e0.m28208E0(W);
        }
        if (set == null) {
            return C12686e0.m28208E0(C12731y0.m28551e());
        }
        return set;
    }

    public void markCardAsClicked(String str) {
        C12775o.m28639i(str, "cardId");
        mo28526a(str, CardKey.CLICKED, Boolean.TRUE);
    }

    public void markCardAsDismissed(String str) {
        C12775o.m28639i(str, "cardId");
        mo28525a(str);
        mo28527a(str, (JSONObject) null);
    }

    public void markCardAsViewed(String str) {
        C12775o.m28639i(str, "cardId");
        mo28526a(str, CardKey.VIEWED, Boolean.TRUE);
    }

    public void markCardAsVisuallyRead(String str) {
        C12775o.m28639i(str, "cardId");
        mo28526a(str, CardKey.READ, Boolean.TRUE);
    }

    /* renamed from: b */
    private final boolean m2477b(JSONObject jSONObject) {
        Set<String> c = mo28532c();
        Set<String> d = mo28535d();
        String string = jSONObject.getString(CardKey.ID.getContentCardsKey());
        C12775o.m28638h(string, "serverCardId");
        JSONObject d2 = mo28536d(string);
        C2963a aVar = f1386f;
        if (aVar.mo28549b(d2, jSONObject)) {
            C8266c cVar = C8266c.f11641a;
            C8266c.m16396e(cVar, this, C8266c.C8267a.I, (Throwable) null, false, C2970h.f1399b, 6, (Object) null);
            C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, new C2971i(jSONObject), 7, (Object) null);
            C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, new C2972j(jSONObject), 7, (Object) null);
            return false;
        } else if (aVar.mo28548a(jSONObject, CardKey.REMOVED)) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C2973k(string), 7, (Object) null);
            mo28538e(string);
            mo28540f(string);
            mo28527a(string, (JSONObject) null);
            return true;
        } else if (c.contains(string)) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C2974l(jSONObject), 7, (Object) null);
            return true;
        } else if (d.contains(string)) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C2975m(jSONObject), 7, (Object) null);
            return true;
        } else if (aVar.mo28548a(jSONObject, CardKey.DISMISSED)) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C2976n(string), 7, (Object) null);
            mo28525a(string);
            mo28527a(string, (JSONObject) null);
            return true;
        } else {
            mo28527a(string, aVar.mo28547a(d2, jSONObject));
            if (aVar.mo28548a(jSONObject, CardKey.IS_TEST)) {
                mo28533c(string);
            }
            return true;
        }
    }

    /* renamed from: e */
    public final void mo28538e(String str) {
        C12775o.m28639i(str, "cardId");
        Set<String> c = mo28532c();
        c.remove(str);
        this.f1391d.edit().putStringSet("dismissed", c).apply();
    }

    /* renamed from: f */
    public final void mo28540f(String str) {
        C12775o.m28639i(str, "cardId");
        C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C2968f(str), 6, (Object) null);
        Set<String> h = mo28542h();
        h.remove(str);
        this.f1391d.edit().putStringSet("test", h).apply();
    }

    /* renamed from: a */
    public final C2807d mo28520a(C3820z zVar, String str) {
        C12775o.m28639i(zVar, "contentCardsResponse");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f20403b = str;
        if (str == null) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C2981s.f1411b, 7, (Object) null);
            ref$ObjectRef.f20403b = "";
        }
        if (!C12775o.m28634d(this.f1388a, ref$ObjectRef.f20403b)) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, new C2982t(ref$ObjectRef, this), 6, (Object) null);
            return null;
        }
        C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, new C2983u(ref$ObjectRef), 6, (Object) null);
        mo28523a(zVar);
        m2479i();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        JSONArray a = zVar.mo29835a();
        if (!(a == null || a.length() == 0)) {
            for (JSONObject jSONObject : C13662o.m31287t(C13662o.m31280m(C12686e0.m28213R(C13537l.m30893t(0, a.length())), new C2979q(a)), new C2980r(a))) {
                if (m2477b(jSONObject)) {
                    String string = jSONObject.getString(CardKey.ID.getContentCardsKey());
                    C12775o.m28638h(string, "serverCardJson.getString…rdKey.ID.contentCardsKey)");
                    linkedHashSet.add(string);
                }
            }
        }
        if (zVar.mo29838d()) {
            mo28531b((Set<String>) linkedHashSet);
            mo28534c((Set<String>) linkedHashSet);
            linkedHashSet.addAll(mo28542h());
            mo28528a((Set<String>) linkedHashSet);
        }
        return mo28521a(false);
    }

    /* renamed from: c */
    public final void mo28533c(String str) {
        C12775o.m28639i(str, "cardId");
        C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C2964b(str), 6, (Object) null);
        Set<String> h = mo28542h();
        h.add(str);
        this.f1391d.edit().putStringSet("test", h).apply();
    }

    /* renamed from: d */
    public final JSONObject mo28536d(String str) {
        C12775o.m28639i(str, "cardId");
        String string = this.f1390c.getString(str, (String) null);
        if (string == null) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C2966d(str), 7, (Object) null);
            return null;
        }
        try {
            return new JSONObject(string);
        } catch (JSONException e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, new C2967e(string), 4, (Object) null);
            return null;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2962a0(Context context, String str, String str2, C3023b2 b2Var, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2, b2Var, (i & 16) != 0 ? Constants.APPBOY_SDK_VERSION : str3);
    }

    /* renamed from: c */
    public final void mo28534c(Set<String> set) {
        C12775o.m28639i(set, "cardIdsToRetain");
        Set<String> d = mo28535d();
        d.retainAll(set);
        this.f1391d.edit().putStringSet("expired", d).apply();
    }

    /* renamed from: b */
    public final void mo28531b(Set<String> set) {
        C12775o.m28639i(set, "cardIdsToRetain");
        Set<String> c = mo28532c();
        c.retainAll(set);
        this.f1391d.edit().putStringSet("dismissed", c).apply();
    }

    /* renamed from: a */
    public final Card mo28522a(JSONObject jSONObject) {
        C12775o.m28639i(jSONObject, "cardJson");
        return C3718u.m3962a(jSONObject, CardKey.Provider.CONTENT_CARDS, this.f1389b, (C8063a<?>) this, this.f1392e);
    }

    /* renamed from: a */
    public final C2807d mo28521a(boolean z) {
        CardKey.Provider provider = CardKey.Provider.CONTENT_CARDS;
        Map<String, ?> all = this.f1390c.getAll();
        JSONArray jSONArray = new JSONArray();
        Iterator<?> it = all.values().iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        List<Card> a = C3718u.m3963a(jSONArray, provider, this.f1389b, (C8063a<?>) this, this.f1392e);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T next : a) {
            if (((Card) next).isExpired()) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        C11906l lVar = new C11906l(arrayList, arrayList2);
        List list = (List) lVar.mo49110b();
        for (Card a2 : (List) lVar.mo49109a()) {
            mo28524a(a2);
        }
        return new C2807d(list, this.f1388a, m2478g(), z);
    }

    /* renamed from: b */
    public final void mo28530b(String str) {
        C12775o.m28639i(str, "cardId");
        Set<String> d = mo28535d();
        d.add(str);
        this.f1391d.edit().putStringSet("expired", d).apply();
    }

    /* renamed from: a */
    public final void mo28524a(Card card) {
        C12775o.m28639i(card, "card");
        String id = card.getId();
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C2965c(id), 7, (Object) null);
        mo28527a(id, (JSONObject) null);
        mo28530b(id);
        mo28540f(id);
    }

    /* renamed from: a */
    public final void mo28526a(String str, CardKey cardKey, Object obj) {
        C12775o.m28639i(str, "cardId");
        C12775o.m28639i(cardKey, "cardKey");
        C12775o.m28639i(obj, "value");
        JSONObject d = mo28536d(str);
        if (d == null) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C2977o(str), 7, (Object) null);
            return;
        }
        try {
            d.put(cardKey.getContentCardsKey(), obj);
            mo28527a(str, d);
        } catch (JSONException e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, new C2978p(obj, cardKey), 4, (Object) null);
        }
    }

    /* renamed from: a */
    public final void mo28523a(C3820z zVar) {
        C12775o.m28639i(zVar, "contentCardsResponse");
        SharedPreferences.Editor edit = this.f1391d.edit();
        if (zVar.mo29836b() != -1) {
            edit.putLong("last_card_updated_at", zVar.mo29836b());
        }
        if (zVar.mo29837c() != -1) {
            edit.putLong("last_full_sync_at", zVar.mo29837c());
        }
        edit.apply();
    }

    /* renamed from: a */
    public final void mo28527a(String str, JSONObject jSONObject) {
        C12775o.m28639i(str, "cardId");
        SharedPreferences.Editor edit = this.f1390c.edit();
        if (jSONObject != null) {
            edit.putString(str, jSONObject.toString());
        } else {
            edit.remove(str);
        }
        edit.apply();
    }

    /* renamed from: a */
    public final void mo28525a(String str) {
        C12775o.m28639i(str, "cardId");
        Set<String> c = mo28532c();
        c.add(str);
        this.f1391d.edit().putStringSet("dismissed", c).apply();
    }

    /* renamed from: a */
    public final void mo28528a(Set<String> set) {
        C12775o.m28639i(set, "cardIdsToRetain");
        Set<String> keySet = this.f1390c.getAll().keySet();
        SharedPreferences.Editor edit = this.f1390c.edit();
        for (String next : keySet) {
            if (!set.contains(next)) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C2969g(next), 7, (Object) null);
                edit.remove(next);
            }
        }
        edit.apply();
    }
}
