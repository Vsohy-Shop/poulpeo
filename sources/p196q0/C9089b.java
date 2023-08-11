package p196q0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.appboy.models.cards.Card;
import com.rmn.apiclient.impl.api.call.APIParams;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p031b0.C2807d;
import p156m0.C8794b;

/* renamed from: q0.b */
/* compiled from: DefaultContentCardsUpdateHandler.kt */
public final class C9089b implements C9096d {
    public static final Parcelable.Creator<C9089b> CREATOR = new C9090a();

    /* renamed from: b */
    public static final C9091b f13234b = new C9091b((DefaultConstructorMarker) null);

    /* renamed from: q0.b$a */
    /* compiled from: DefaultContentCardsUpdateHandler.kt */
    public static final class C9090a implements Parcelable.Creator<C9089b> {
        C9090a() {
        }

        /* renamed from: a */
        public C9089b createFromParcel(Parcel parcel) {
            C12775o.m28639i(parcel, APIParams.SOURCE);
            return new C9089b();
        }

        /* renamed from: b */
        public C9089b[] newArray(int i) {
            return new C9089b[i];
        }
    }

    /* renamed from: q0.b$b */
    /* compiled from: DefaultContentCardsUpdateHandler.kt */
    public static final class C9091b {
        private C9091b() {
        }

        public /* synthetic */ C9091b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final int m18463b(Card card, Card card2) {
        C12775o.m28639i(card, "cardA");
        C12775o.m28639i(card2, "cardB");
        if (card.isPinned() && !card2.isPinned()) {
            return -1;
        }
        if (card.isPinned() || !card2.isPinned()) {
            if (card.getUpdated() > card2.getUpdated()) {
                return -1;
            }
            if (card.getUpdated() >= card2.getUpdated()) {
                return 0;
            }
        }
        return 1;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: r */
    public List<Card> mo43308r(C2807d dVar) {
        C12775o.m28639i(dVar, NotificationCompat.CATEGORY_EVENT);
        C9088a aVar = new C9088a();
        ArrayList arrayList = new ArrayList();
        for (Object next : dVar.mo28284a()) {
            if (!C8794b.m17808b((Card) next)) {
                arrayList.add(next);
            }
        }
        return C12686e0.m28243v0(arrayList, aVar);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C12775o.m28639i(parcel, "dest");
    }
}
