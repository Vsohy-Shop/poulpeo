package p101g8;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;

/* renamed from: g8.f */
/* compiled from: CardMessage */
public class C7809f extends C7817i {
    @NonNull

    /* renamed from: e */
    private final C7828n f10864e;
    @Nullable

    /* renamed from: f */
    private final C7828n f10865f;
    @NonNull

    /* renamed from: g */
    private final String f10866g;
    @NonNull

    /* renamed from: h */
    private final C7796a f10867h;
    @Nullable

    /* renamed from: i */
    private final C7796a f10868i;
    @Nullable

    /* renamed from: j */
    private final C7812g f10869j;
    @Nullable

    /* renamed from: k */
    private final C7812g f10870k;

    /* renamed from: g8.f$b */
    /* compiled from: CardMessage */
    public static class C7811b {
        @Nullable

        /* renamed from: a */
        C7812g f10871a;
        @Nullable

        /* renamed from: b */
        C7812g f10872b;
        @Nullable

        /* renamed from: c */
        String f10873c;
        @Nullable

        /* renamed from: d */
        C7796a f10874d;
        @Nullable

        /* renamed from: e */
        C7828n f10875e;
        @Nullable

        /* renamed from: f */
        C7828n f10876f;
        @Nullable

        /* renamed from: g */
        C7796a f10877g;

        /* renamed from: a */
        public C7809f mo41495a(C7808e eVar, @Nullable Map<String, String> map) {
            C7796a aVar = this.f10874d;
            if (aVar == null) {
                throw new IllegalArgumentException("Card model must have a primary action");
            } else if (aVar.mo41447c() != null) {
                C7796a aVar2 = this.f10877g;
                if (aVar2 != null && aVar2.mo41447c() == null) {
                    throw new IllegalArgumentException("Card model secondary action must be null or have a button");
                } else if (this.f10875e == null) {
                    throw new IllegalArgumentException("Card model must have a title");
                } else if (this.f10871a == null && this.f10872b == null) {
                    throw new IllegalArgumentException("Card model must have at least one image");
                } else if (!TextUtils.isEmpty(this.f10873c)) {
                    return new C7809f(eVar, this.f10875e, this.f10876f, this.f10871a, this.f10872b, this.f10873c, this.f10874d, this.f10877g, map);
                } else {
                    throw new IllegalArgumentException("Card model must have a background color");
                }
            } else {
                throw new IllegalArgumentException("Card model must have a primary action button");
            }
        }

        /* renamed from: b */
        public C7811b mo41496b(@Nullable String str) {
            this.f10873c = str;
            return this;
        }

        /* renamed from: c */
        public C7811b mo41497c(@Nullable C7828n nVar) {
            this.f10876f = nVar;
            return this;
        }

        /* renamed from: d */
        public C7811b mo41498d(@Nullable C7812g gVar) {
            this.f10872b = gVar;
            return this;
        }

        /* renamed from: e */
        public C7811b mo41499e(@Nullable C7812g gVar) {
            this.f10871a = gVar;
            return this;
        }

        /* renamed from: f */
        public C7811b mo41500f(@Nullable C7796a aVar) {
            this.f10874d = aVar;
            return this;
        }

        /* renamed from: g */
        public C7811b mo41501g(@Nullable C7796a aVar) {
            this.f10877g = aVar;
            return this;
        }

        /* renamed from: h */
        public C7811b mo41502h(@Nullable C7828n nVar) {
            this.f10875e = nVar;
            return this;
        }
    }

    /* renamed from: d */
    public static C7811b m15246d() {
        return new C7811b();
    }

    @Deprecated
    @Nullable
    /* renamed from: b */
    public C7812g mo41463b() {
        return this.f10869j;
    }

    @NonNull
    /* renamed from: e */
    public String mo41486e() {
        return this.f10866g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7809f)) {
            return false;
        }
        C7809f fVar = (C7809f) obj;
        if (hashCode() != fVar.hashCode()) {
            return false;
        }
        C7828n nVar = this.f10865f;
        if ((nVar == null && fVar.f10865f != null) || (nVar != null && !nVar.equals(fVar.f10865f))) {
            return false;
        }
        C7796a aVar = this.f10868i;
        if ((aVar == null && fVar.f10868i != null) || (aVar != null && !aVar.equals(fVar.f10868i))) {
            return false;
        }
        C7812g gVar = this.f10869j;
        if ((gVar == null && fVar.f10869j != null) || (gVar != null && !gVar.equals(fVar.f10869j))) {
            return false;
        }
        C7812g gVar2 = this.f10870k;
        if ((gVar2 != null || fVar.f10870k == null) && ((gVar2 == null || gVar2.equals(fVar.f10870k)) && this.f10864e.equals(fVar.f10864e) && this.f10867h.equals(fVar.f10867h) && this.f10866g.equals(fVar.f10866g))) {
            return true;
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public C7828n mo41488f() {
        return this.f10865f;
    }

    @Nullable
    /* renamed from: g */
    public C7812g mo41489g() {
        return this.f10870k;
    }

    @Nullable
    /* renamed from: h */
    public C7812g mo41490h() {
        return this.f10869j;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        C7828n nVar = this.f10865f;
        int i4 = 0;
        if (nVar != null) {
            i = nVar.hashCode();
        } else {
            i = 0;
        }
        C7796a aVar = this.f10868i;
        if (aVar != null) {
            i2 = aVar.hashCode();
        } else {
            i2 = 0;
        }
        C7812g gVar = this.f10869j;
        if (gVar != null) {
            i3 = gVar.hashCode();
        } else {
            i3 = 0;
        }
        C7812g gVar2 = this.f10870k;
        if (gVar2 != null) {
            i4 = gVar2.hashCode();
        }
        return this.f10864e.hashCode() + i + this.f10866g.hashCode() + this.f10867h.hashCode() + i2 + i3 + i4;
    }

    @NonNull
    /* renamed from: i */
    public C7796a mo41492i() {
        return this.f10867h;
    }

    @Nullable
    /* renamed from: j */
    public C7796a mo41493j() {
        return this.f10868i;
    }

    @NonNull
    /* renamed from: k */
    public C7828n mo41494k() {
        return this.f10864e;
    }

    private C7809f(@NonNull C7808e eVar, @NonNull C7828n nVar, @Nullable C7828n nVar2, @Nullable C7812g gVar, @Nullable C7812g gVar2, @NonNull String str, @NonNull C7796a aVar, @Nullable C7796a aVar2, @Nullable Map<String, String> map) {
        super(eVar, MessageType.CARD, map);
        this.f10864e = nVar;
        this.f10865f = nVar2;
        this.f10869j = gVar;
        this.f10870k = gVar2;
        this.f10866g = str;
        this.f10867h = aVar;
        this.f10868i = aVar2;
    }
}
