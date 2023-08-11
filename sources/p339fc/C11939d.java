package p339fc;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;

/* renamed from: fc.d */
/* compiled from: CommonDeepLinkData */
public abstract class C11939d extends C11940e {
    @Nullable

    /* renamed from: b */
    private C11941f f18656b;

    public C11939d() {
    }

    @Nullable
    /* renamed from: d */
    public C11941f mo49168d() {
        return this.f18656b;
    }

    @NonNull
    /* renamed from: e */
    public String mo49169e() {
        return mo49174b("redirect", "");
    }

    @Nullable
    /* renamed from: f */
    public String mo49170f() {
        return mo49173a(JSONAPIResourceIdSerializer.FIELD_TYPE);
    }

    /* renamed from: g */
    public void mo49171g(@Nullable C11941f fVar) {
        this.f18656b = fVar;
    }

    @NonNull
    /* renamed from: h */
    public C11939d mo49172h(@Nullable String str) {
        mo49175c("redirect", str);
        return this;
    }

    public C11939d(@Nullable Bundle bundle) {
        super(bundle);
    }
}
