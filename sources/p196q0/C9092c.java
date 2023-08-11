package p196q0;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.annotation.VisibleForTesting;
import com.appboy.enums.CardType;
import com.appboy.models.cards.Card;
import com.braze.p055ui.contentcards.view.C4316a;
import com.braze.p055ui.contentcards.view.C4319c;
import com.braze.p055ui.contentcards.view.C4320d;
import com.braze.p055ui.contentcards.view.C4322e;
import com.braze.p055ui.contentcards.view.C4323f;
import com.braze.p055ui.contentcards.view.C4324g;
import com.braze.p055ui.contentcards.view.C4327h;
import com.rmn.apiclient.impl.api.call.APIParams;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: q0.c */
/* compiled from: DefaultContentCardsViewBindingHandler.kt */
public final class C9092c implements C9097e {
    public static final Parcelable.Creator<C9092c> CREATOR = new C9093a();

    /* renamed from: c */
    public static final C9094b f13235c = new C9094b((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final Map<CardType, C4319c<?>> f13236b = new LinkedHashMap();

    /* renamed from: q0.c$a */
    /* compiled from: DefaultContentCardsViewBindingHandler.kt */
    public static final class C9093a implements Parcelable.Creator<C9092c> {
        C9093a() {
        }

        /* renamed from: a */
        public C9092c createFromParcel(Parcel parcel) {
            C12775o.m28639i(parcel, APIParams.SOURCE);
            return new C9092c();
        }

        /* renamed from: b */
        public C9092c[] newArray(int i) {
            return new C9092c[i];
        }
    }

    /* renamed from: q0.c$b */
    /* compiled from: DefaultContentCardsViewBindingHandler.kt */
    public static final class C9094b {
        private C9094b() {
        }

        public /* synthetic */ C9094b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: q0.c$c */
    /* compiled from: DefaultContentCardsViewBindingHandler.kt */
    public /* synthetic */ class C9095c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f13237a;

        static {
            int[] iArr = new int[CardType.values().length];
            iArr[CardType.BANNER.ordinal()] = 1;
            iArr[CardType.CAPTIONED_IMAGE.ordinal()] = 2;
            iArr[CardType.SHORT_NEWS.ordinal()] = 3;
            iArr[CardType.TEXT_ANNOUNCEMENT.ordinal()] = 4;
            f13237a = iArr;
        }
    }

    /* renamed from: B */
    public int mo43314B(Context context, List<? extends Card> list, int i) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(list, "cards");
        if (i < 0 || i >= list.size()) {
            return -1;
        }
        return ((Card) list.get(i)).getCardType().getValue();
    }

    @VisibleForTesting
    /* renamed from: a */
    public final C4319c<?> mo43315a(Context context, CardType cardType) {
        Object obj;
        C12775o.m28639i(context, "context");
        C12775o.m28639i(cardType, "cardType");
        if (!this.f13236b.containsKey(cardType) || this.f13236b.get(cardType) == null) {
            int i = C9095c.f13237a[cardType.ordinal()];
            if (i == 1) {
                obj = new C4316a(context);
            } else if (i == 2) {
                obj = new C4320d(context);
            } else if (i == 3) {
                obj = new C4324g(context);
            } else if (i != 4) {
                obj = new C4323f(context);
            } else {
                obj = new C4327h(context);
            }
            this.f13236b.put(cardType, obj);
        }
        C4319c<?> cVar = this.f13236b.get(cardType);
        if (cVar == null) {
            return new C4323f(context);
        }
        return cVar;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: j */
    public C4322e mo43317j(Context context, List<? extends Card> list, ViewGroup viewGroup, int i) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(list, "cards");
        C12775o.m28639i(viewGroup, "viewGroup");
        return mo43315a(context, CardType.Companion.fromValue(i)).mo31062d(viewGroup);
    }

    /* renamed from: t */
    public void mo43318t(Context context, List<? extends Card> list, C4322e eVar, int i) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(list, "cards");
        C12775o.m28639i(eVar, "viewHolder");
        if (i >= 0 && i < list.size()) {
            Card card = (Card) list.get(i);
            mo43315a(context, card.getCardType()).mo31061b(eVar, card);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        C12775o.m28639i(parcel, "dest");
    }
}
