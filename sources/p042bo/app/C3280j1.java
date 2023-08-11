package p042bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.enums.CardKey;
import com.appboy.events.FeedUpdatedEvent;
import com.appboy.models.cards.Card;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONObject;
import p116i0.C8063a;
import p126j0.C8266c;
import p126j0.C8273e;
import p126j0.C8300j;
import p404of.C13074a;

/* renamed from: bo.app.j1 */
public final class C3280j1 implements C8063a<FeedUpdatedEvent> {

    /* renamed from: f */
    public static final C3282b f1929f = new C3282b((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C3023b2 f1930a;

    /* renamed from: b */
    private final SharedPreferences f1931b;

    /* renamed from: c */
    private final Set<String> f1932c;

    /* renamed from: d */
    private final Set<String> f1933d;

    /* renamed from: e */
    private final C3096d2 f1934e = new C3220i1();

    /* renamed from: bo.app.j1$a */
    public enum C3281a {
        READ_CARDS("read_cards_set", "read_cards_flat"),
        VIEWED_CARDS("viewed_cards_set", "viewed_cards_flat");
        

        /* renamed from: b */
        private final String f1938b;

        /* renamed from: c */
        private final String f1939c;

        private C3281a(String str, String str2) {
            this.f1938b = str;
            this.f1939c = str2;
        }

        /* renamed from: b */
        public final String mo29145b() {
            return this.f1939c;
        }

        /* renamed from: c */
        public final String mo29146c() {
            return this.f1938b;
        }
    }

    /* renamed from: bo.app.j1$b */
    public static final class C3282b {
        public /* synthetic */ C3282b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Set<String> mo29147a(String str) {
            C12775o.m28639i(str, "input");
            HashSet hashSet = new HashSet();
            Object[] array = C13755w.m31594t0(str, new String[]{";"}, false, 0, 6, (Object) null).toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                Collections.addAll(hashSet, Arrays.copyOf(strArr, strArr.length));
                return hashSet;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        private C3282b() {
        }

        /* renamed from: a */
        public final Set<String> mo29148a(JSONArray jSONArray) {
            C12775o.m28639i(jSONArray, "cardsArray");
            HashSet hashSet = new HashSet();
            int length = jSONArray.length();
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                CardKey cardKey = CardKey.ID;
                if (jSONObject.has(cardKey.getFeedKey())) {
                    String string = jSONObject.getString(cardKey.getFeedKey());
                    C12775o.m28638h(string, "card.getString(CardKey.ID.feedKey)");
                    hashSet.add(string);
                }
                i = i2;
            }
            return hashSet;
        }
    }

    /* renamed from: bo.app.j1$c */
    static final class C3283c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f1940b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3283c(String str) {
            super(0);
            this.f1940b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Updating offline feed for user with id: ", this.f1940b);
        }
    }

    /* renamed from: bo.app.j1$d */
    static final class C3284d extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f1941b;

        /* renamed from: c */
        final /* synthetic */ String f1942c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3284d(String str, String str2) {
            super(0);
            this.f1941b = str;
            this.f1942c = str2;
        }

        /* renamed from: a */
        public final String invoke() {
            return "The received cards are for user " + this.f1941b + " and the current user is " + this.f1942c + ", the cards will be discarded and no changes will be made.";
        }
    }

    public C3280j1(Context context, String str, C3023b2 b2Var) {
        String str2;
        C12775o.m28639i(context, "context");
        C12775o.m28639i(b2Var, "brazeManager");
        this.f1930a = b2Var;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(C12775o.m28647q("com.appboy.storage.feedstorageprovider", C8300j.m16488b(context, str2)), 0);
        C12775o.m28638h(sharedPreferences, "context.getSharedPrefere…Id, Context.MODE_PRIVATE)");
        this.f1931b = sharedPreferences;
        this.f1932c = m3169a(C3281a.VIEWED_CARDS);
        this.f1933d = m3169a(C3281a.READ_CARDS);
        m3170a(str);
    }

    /* renamed from: a */
    public FeedUpdatedEvent getCachedCardsAsEvent() {
        return m3168a(new JSONArray(this.f1931b.getString("cards", HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)), this.f1931b.getString("uid", ""), true, this.f1931b.getLong("cards_timestamp", -1));
    }

    public void markCardAsClicked(String str) {
        C12775o.m28639i(str, "cardId");
    }

    public void markCardAsDismissed(String str) {
        C12775o.m28639i(str, "cardId");
    }

    public void markCardAsViewed(String str) {
        C12775o.m28639i(str, "cardId");
        if (!this.f1932c.contains(str)) {
            this.f1932c.add(str);
            mo29143a(this.f1932c, C3281a.VIEWED_CARDS);
        }
    }

    public void markCardAsVisuallyRead(String str) {
        C12775o.m28639i(str, "cardId");
        if (!this.f1933d.contains(str)) {
            this.f1933d.add(str);
            mo29143a(this.f1933d, C3281a.READ_CARDS);
        }
    }

    /* renamed from: a */
    public final FeedUpdatedEvent mo29142a(JSONArray jSONArray, String str) {
        C12775o.m28639i(jSONArray, "cardsArray");
        String str2 = str == null ? "" : str;
        String string = this.f1931b.getString("uid", "");
        if (C12775o.m28634d(string, str2)) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, new C3283c(str), 6, (Object) null);
            long i = C8273e.m16436i();
            m3171a(jSONArray, i);
            Set<String> set = this.f1932c;
            C3282b bVar = f1929f;
            set.retainAll(bVar.mo29148a(jSONArray));
            mo29143a(this.f1932c, C3281a.VIEWED_CARDS);
            this.f1933d.retainAll(bVar.mo29148a(jSONArray));
            mo29143a(this.f1933d, C3281a.READ_CARDS);
            return m3168a(jSONArray, str, false, i);
        }
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3284d(str, string), 7, (Object) null);
        return null;
    }

    /* renamed from: a */
    private final FeedUpdatedEvent m3168a(JSONArray jSONArray, String str, boolean z, long j) {
        List list;
        if (jSONArray.length() == 0) {
            list = new ArrayList();
        } else {
            list = C3718u.m3963a(jSONArray, new CardKey.Provider(false), this.f1930a, (C8063a<?>) this, this.f1934e);
        }
        List<Card> list2 = list;
        for (Card card : list2) {
            if (this.f1932c.contains(card.getId())) {
                card.setViewed(true);
                card.setIndicatorHighlighted(true);
            }
            if (this.f1933d.contains(card.getId())) {
                card.setIndicatorHighlighted(true);
            }
        }
        return new FeedUpdatedEvent(list2, str, z, j);
    }

    /* renamed from: a */
    private final Set<String> m3169a(C3281a aVar) {
        String b = aVar.mo29145b();
        if (this.f1931b.contains(b)) {
            Set<String> set = null;
            String string = this.f1931b.getString(b, (String) null);
            if (string != null) {
                set = f1929f.mo29147a(string);
            }
            SharedPreferences.Editor edit = this.f1931b.edit();
            edit.remove(b);
            edit.apply();
            if (set != null) {
                mo29143a(set, aVar);
                return set;
            }
        }
        return new ConcurrentSkipListSet(this.f1931b.getStringSet(aVar.mo29146c(), new HashSet()));
    }

    /* renamed from: a */
    private final void m3171a(JSONArray jSONArray, long j) {
        SharedPreferences.Editor edit = this.f1931b.edit();
        if (jSONArray.length() == 0) {
            edit.remove("cards");
        } else {
            edit.putString("cards", jSONArray.toString());
        }
        edit.putLong("cards_timestamp", j);
        edit.apply();
    }

    /* renamed from: a */
    private final void m3170a(String str) {
        SharedPreferences.Editor edit = this.f1931b.edit();
        edit.putString("uid", str);
        edit.apply();
    }

    /* renamed from: a */
    public final void mo29143a(Set<String> set, C3281a aVar) {
        C12775o.m28639i(set, "cardIds");
        C12775o.m28639i(aVar, "property");
        String c = aVar.mo29146c();
        SharedPreferences.Editor edit = this.f1931b.edit();
        if (set.isEmpty()) {
            edit.remove(c);
        } else {
            edit.putStringSet(c, set);
        }
        edit.apply();
    }
}
