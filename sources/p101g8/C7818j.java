package p101g8;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;

/* renamed from: g8.j */
/* compiled from: ModalMessage */
public class C7818j extends C7817i {
    @NonNull

    /* renamed from: e */
    private final C7828n f10890e;

    /* renamed from: f */
    private final C7828n f10891f;

    /* renamed from: g */
    private final C7812g f10892g;

    /* renamed from: h */
    private final C7796a f10893h;
    @NonNull

    /* renamed from: i */
    private final String f10894i;

    /* renamed from: g8.j$b */
    /* compiled from: ModalMessage */
    public static class C7820b {

        /* renamed from: a */
        C7828n f10895a;

        /* renamed from: b */
        C7828n f10896b;

        /* renamed from: c */
        C7812g f10897c;

        /* renamed from: d */
        C7796a f10898d;

        /* renamed from: e */
        String f10899e;

        /* renamed from: a */
        public C7818j mo41522a(C7808e eVar, Map<String, String> map) {
            if (this.f10895a != null) {
                C7796a aVar = this.f10898d;
                if (aVar != null && aVar.mo41447c() == null) {
                    throw new IllegalArgumentException("Modal model action must be null or have a button");
                } else if (!TextUtils.isEmpty(this.f10899e)) {
                    return new C7818j(eVar, this.f10895a, this.f10896b, this.f10897c, this.f10898d, this.f10899e, map);
                } else {
                    throw new IllegalArgumentException("Modal model must have a background color");
                }
            } else {
                throw new IllegalArgumentException("Modal model must have a title");
            }
        }

        /* renamed from: b */
        public C7820b mo41523b(C7796a aVar) {
            this.f10898d = aVar;
            return this;
        }

        /* renamed from: c */
        public C7820b mo41524c(String str) {
            this.f10899e = str;
            return this;
        }

        /* renamed from: d */
        public C7820b mo41525d(C7828n nVar) {
            this.f10896b = nVar;
            return this;
        }

        /* renamed from: e */
        public C7820b mo41526e(C7812g gVar) {
            this.f10897c = gVar;
            return this;
        }

        /* renamed from: f */
        public C7820b mo41527f(C7828n nVar) {
            this.f10895a = nVar;
            return this;
        }
    }

    /* renamed from: d */
    public static C7820b m15276d() {
        return new C7820b();
    }

    /* renamed from: b */
    public C7812g mo41463b() {
        return this.f10892g;
    }

    /* renamed from: e */
    public C7796a mo41516e() {
        return this.f10893h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7818j)) {
            return false;
        }
        C7818j jVar = (C7818j) obj;
        if (hashCode() != jVar.hashCode()) {
            return false;
        }
        C7828n nVar = this.f10891f;
        if ((nVar == null && jVar.f10891f != null) || (nVar != null && !nVar.equals(jVar.f10891f))) {
            return false;
        }
        C7796a aVar = this.f10893h;
        if ((aVar == null && jVar.f10893h != null) || (aVar != null && !aVar.equals(jVar.f10893h))) {
            return false;
        }
        C7812g gVar = this.f10892g;
        if ((gVar != null || jVar.f10892g == null) && ((gVar == null || gVar.equals(jVar.f10892g)) && this.f10890e.equals(jVar.f10890e) && this.f10894i.equals(jVar.f10894i))) {
            return true;
        }
        return false;
    }

    @NonNull
    /* renamed from: f */
    public String mo41518f() {
        return this.f10894i;
    }

    /* renamed from: g */
    public C7828n mo41519g() {
        return this.f10891f;
    }

    @NonNull
    /* renamed from: h */
    public C7828n mo41520h() {
        return this.f10890e;
    }

    public int hashCode() {
        int i;
        int i2;
        C7828n nVar = this.f10891f;
        int i3 = 0;
        if (nVar != null) {
            i = nVar.hashCode();
        } else {
            i = 0;
        }
        C7796a aVar = this.f10893h;
        if (aVar != null) {
            i2 = aVar.hashCode();
        } else {
            i2 = 0;
        }
        C7812g gVar = this.f10892g;
        if (gVar != null) {
            i3 = gVar.hashCode();
        }
        return this.f10890e.hashCode() + i + this.f10894i.hashCode() + i2 + i3;
    }

    private C7818j(@NonNull C7808e eVar, @NonNull C7828n nVar, C7828n nVar2, C7812g gVar, C7796a aVar, @NonNull String str, Map<String, String> map) {
        super(eVar, MessageType.MODAL, map);
        this.f10890e = nVar;
        this.f10891f = nVar2;
        this.f10892g = gVar;
        this.f10893h = aVar;
        this.f10894i = str;
    }
}
