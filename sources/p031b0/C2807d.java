package p031b0;

import com.appboy.models.cards.Card;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p126j0.C8273e;

/* renamed from: b0.d */
public final class C2807d {

    /* renamed from: e */
    public static final C2808a f1110e = new C2808a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final List<Card> f1111a;

    /* renamed from: b */
    private final String f1112b;

    /* renamed from: c */
    private final long f1113c;

    /* renamed from: d */
    private final boolean f1114d;

    /* renamed from: b0.d$a */
    public static final class C2808a {
        public /* synthetic */ C2808a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C2807d mo28289a() {
            return new C2807d(C12726w.m28524k(), (String) null, C8273e.m16436i(), true);
        }

        private C2808a() {
        }
    }

    public C2807d(List<? extends Card> list, String str, long j, boolean z) {
        C12775o.m28639i(list, "contentCards");
        this.f1111a = list;
        this.f1112b = str;
        this.f1113c = j;
        this.f1114d = z;
    }

    /* renamed from: a */
    public final List<Card> mo28284a() {
        return C12686e0.m28207D0(this.f1111a);
    }

    /* renamed from: b */
    public final int mo28285b() {
        return this.f1111a.size();
    }

    /* renamed from: c */
    public final boolean mo28286c() {
        return this.f1114d;
    }

    /* renamed from: d */
    public final boolean mo28287d(long j) {
        if (TimeUnit.SECONDS.toMillis(this.f1113c + j) < System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "ContentCardsUpdatedEvent{userId='" + this.f1112b + "', timestampSeconds=" + this.f1113c + ", isFromOfflineStorage=" + this.f1114d + ", card count=" + mo28285b() + '}';
    }
}
