package p101g8;

import androidx.annotation.NonNull;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;

/* renamed from: g8.h */
/* compiled from: ImageOnlyMessage */
public class C7814h extends C7817i {
    @NonNull

    /* renamed from: e */
    private C7812g f10882e;

    /* renamed from: f */
    private C7796a f10883f;

    /* renamed from: g8.h$b */
    /* compiled from: ImageOnlyMessage */
    public static class C7816b {

        /* renamed from: a */
        C7812g f10884a;

        /* renamed from: b */
        C7796a f10885b;

        /* renamed from: a */
        public C7814h mo41511a(C7808e eVar, Map<String, String> map) {
            C7812g gVar = this.f10884a;
            if (gVar != null) {
                return new C7814h(eVar, gVar, this.f10885b, map);
            }
            throw new IllegalArgumentException("ImageOnly model must have image data");
        }

        /* renamed from: b */
        public C7816b mo41512b(C7796a aVar) {
            this.f10885b = aVar;
            return this;
        }

        /* renamed from: c */
        public C7816b mo41513c(C7812g gVar) {
            this.f10884a = gVar;
            return this;
        }
    }

    /* renamed from: d */
    public static C7816b m15267d() {
        return new C7816b();
    }

    @NonNull
    /* renamed from: b */
    public C7812g mo41463b() {
        return this.f10882e;
    }

    /* renamed from: e */
    public C7796a mo41508e() {
        return this.f10883f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7814h)) {
            return false;
        }
        C7814h hVar = (C7814h) obj;
        if (hashCode() != hVar.hashCode()) {
            return false;
        }
        C7796a aVar = this.f10883f;
        if ((aVar != null || hVar.f10883f == null) && ((aVar == null || aVar.equals(hVar.f10883f)) && this.f10882e.equals(hVar.f10882e))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        C7796a aVar = this.f10883f;
        if (aVar != null) {
            i = aVar.hashCode();
        } else {
            i = 0;
        }
        return this.f10882e.hashCode() + i;
    }

    private C7814h(@NonNull C7808e eVar, @NonNull C7812g gVar, C7796a aVar, Map<String, String> map) {
        super(eVar, MessageType.IMAGE_ONLY, map);
        this.f10882e = gVar;
        this.f10883f = aVar;
    }
}
