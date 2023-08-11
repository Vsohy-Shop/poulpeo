package p101g8;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;

/* renamed from: g8.c */
/* compiled from: BannerMessage */
public class C7802c extends C7817i {
    @NonNull

    /* renamed from: e */
    private final C7828n f10847e;

    /* renamed from: f */
    private final C7828n f10848f;

    /* renamed from: g */
    private final C7812g f10849g;

    /* renamed from: h */
    private final C7796a f10850h;
    @NonNull

    /* renamed from: i */
    private final String f10851i;

    /* renamed from: g8.c$b */
    /* compiled from: BannerMessage */
    public static class C7804b {

        /* renamed from: a */
        C7828n f10852a;

        /* renamed from: b */
        C7828n f10853b;

        /* renamed from: c */
        C7812g f10854c;

        /* renamed from: d */
        C7796a f10855d;

        /* renamed from: e */
        String f10856e;

        /* renamed from: a */
        public C7802c mo41470a(C7808e eVar, Map<String, String> map) {
            if (this.f10852a == null) {
                throw new IllegalArgumentException("Banner model must have a title");
            } else if (!TextUtils.isEmpty(this.f10856e)) {
                return new C7802c(eVar, this.f10852a, this.f10853b, this.f10854c, this.f10855d, this.f10856e, map);
            } else {
                throw new IllegalArgumentException("Banner model must have a background color");
            }
        }

        /* renamed from: b */
        public C7804b mo41471b(C7796a aVar) {
            this.f10855d = aVar;
            return this;
        }

        /* renamed from: c */
        public C7804b mo41472c(String str) {
            this.f10856e = str;
            return this;
        }

        /* renamed from: d */
        public C7804b mo41473d(C7828n nVar) {
            this.f10853b = nVar;
            return this;
        }

        /* renamed from: e */
        public C7804b mo41474e(C7812g gVar) {
            this.f10854c = gVar;
            return this;
        }

        /* renamed from: f */
        public C7804b mo41475f(C7828n nVar) {
            this.f10852a = nVar;
            return this;
        }
    }

    /* renamed from: d */
    public static C7804b m15225d() {
        return new C7804b();
    }

    /* renamed from: b */
    public C7812g mo41463b() {
        return this.f10849g;
    }

    /* renamed from: e */
    public C7796a mo41464e() {
        return this.f10850h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7802c)) {
            return false;
        }
        C7802c cVar = (C7802c) obj;
        if (hashCode() != cVar.hashCode()) {
            return false;
        }
        C7828n nVar = this.f10848f;
        if ((nVar == null && cVar.f10848f != null) || (nVar != null && !nVar.equals(cVar.f10848f))) {
            return false;
        }
        C7812g gVar = this.f10849g;
        if ((gVar == null && cVar.f10849g != null) || (gVar != null && !gVar.equals(cVar.f10849g))) {
            return false;
        }
        C7796a aVar = this.f10850h;
        if ((aVar != null || cVar.f10850h == null) && ((aVar == null || aVar.equals(cVar.f10850h)) && this.f10847e.equals(cVar.f10847e) && this.f10851i.equals(cVar.f10851i))) {
            return true;
        }
        return false;
    }

    @NonNull
    /* renamed from: f */
    public String mo41466f() {
        return this.f10851i;
    }

    /* renamed from: g */
    public C7828n mo41467g() {
        return this.f10848f;
    }

    @NonNull
    /* renamed from: h */
    public C7828n mo41468h() {
        return this.f10847e;
    }

    public int hashCode() {
        int i;
        int i2;
        C7828n nVar = this.f10848f;
        int i3 = 0;
        if (nVar != null) {
            i = nVar.hashCode();
        } else {
            i = 0;
        }
        C7812g gVar = this.f10849g;
        if (gVar != null) {
            i2 = gVar.hashCode();
        } else {
            i2 = 0;
        }
        C7796a aVar = this.f10850h;
        if (aVar != null) {
            i3 = aVar.hashCode();
        }
        return this.f10847e.hashCode() + i + i2 + i3 + this.f10851i.hashCode();
    }

    private C7802c(@NonNull C7808e eVar, @NonNull C7828n nVar, C7828n nVar2, C7812g gVar, C7796a aVar, @NonNull String str, Map<String, String> map) {
        super(eVar, MessageType.BANNER, map);
        this.f10847e = nVar;
        this.f10848f = nVar2;
        this.f10849g = gVar;
        this.f10850h = aVar;
        this.f10851i = str;
    }
}
