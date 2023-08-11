package p101g8;

import androidx.annotation.Nullable;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;

/* renamed from: g8.i */
/* compiled from: InAppMessage */
public abstract class C7817i {
    @Deprecated

    /* renamed from: a */
    C7812g f10886a;

    /* renamed from: b */
    MessageType f10887b;

    /* renamed from: c */
    C7808e f10888c;
    @Nullable

    /* renamed from: d */
    private Map<String, String> f10889d;

    public C7817i(C7808e eVar, MessageType messageType, Map<String, String> map) {
        this.f10888c = eVar;
        this.f10887b = messageType;
        this.f10889d = map;
    }

    @Nullable
    /* renamed from: a */
    public C7808e mo41514a() {
        return this.f10888c;
    }

    @Deprecated
    @Nullable
    /* renamed from: b */
    public C7812g mo41463b() {
        return this.f10886a;
    }

    @Nullable
    /* renamed from: c */
    public MessageType mo41515c() {
        return this.f10887b;
    }
}
