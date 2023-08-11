package okhttp3;

import androidx.autofill.HintConstants;
import androidx.browser.trusted.sharing.ShareTarget;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okio.C13121c;
import okio.C13127d;

/* compiled from: FormBody.kt */
public final class FormBody extends RequestBody {
    private static final MediaType CONTENT_TYPE = MediaType.Companion.get(ShareTarget.ENCODING_TYPE_URL_ENCODED);
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final List<String> encodedNames;
    private final List<String> encodedValues;

    /* compiled from: FormBody.kt */
    public static final class Builder {
        private final Charset charset;
        private final List<String> names;
        private final List<String> values;

        public Builder() {
            this((Charset) null, 1, (DefaultConstructorMarker) null);
        }

        public final Builder add(String str, String str2) {
            String str3 = str;
            C12775o.m28639i(str3, HintConstants.AUTOFILL_HINT_NAME);
            C12775o.m28639i(str2, "value");
            HttpUrl.Companion companion = HttpUrl.Companion;
            this.names.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, str3, 0, 0, HttpUrl.FORM_ENCODE_SET, false, false, true, false, this.charset, 91, (Object) null));
            this.values.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, str2, 0, 0, HttpUrl.FORM_ENCODE_SET, false, false, true, false, this.charset, 91, (Object) null));
            return this;
        }

        public final Builder addEncoded(String str, String str2) {
            String str3 = str;
            C12775o.m28639i(str3, HintConstants.AUTOFILL_HINT_NAME);
            C12775o.m28639i(str2, "value");
            HttpUrl.Companion companion = HttpUrl.Companion;
            this.names.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, str3, 0, 0, HttpUrl.FORM_ENCODE_SET, true, false, true, false, this.charset, 83, (Object) null));
            this.values.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, str2, 0, 0, HttpUrl.FORM_ENCODE_SET, true, false, true, false, this.charset, 83, (Object) null));
            return this;
        }

        public final FormBody build() {
            return new FormBody(this.names, this.values);
        }

        public Builder(Charset charset2) {
            this.charset = charset2;
            this.names = new ArrayList();
            this.values = new ArrayList();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Builder(Charset charset2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : charset2);
        }
    }

    /* compiled from: FormBody.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public FormBody(List<String> list, List<String> list2) {
        C12775o.m28639i(list, "encodedNames");
        C12775o.m28639i(list2, "encodedValues");
        this.encodedNames = Util.toImmutableList(list);
        this.encodedValues = Util.toImmutableList(list2);
    }

    private final long writeOrCountBytes(C13127d dVar, boolean z) {
        C13121c cVar;
        if (z) {
            cVar = new C13121c();
        } else {
            C12775o.m28636f(dVar);
            cVar = dVar.mo52524f();
        }
        int size = this.encodedNames.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (i > 0) {
                cVar.writeByte(38);
            }
            cVar.mo52486F(this.encodedNames.get(i));
            cVar.writeByte(61);
            cVar.mo52486F(this.encodedValues.get(i));
            i = i2;
        }
        if (!z) {
            return 0;
        }
        long size2 = cVar.size();
        cVar.mo52514a();
        return size2;
    }

    /* renamed from: -deprecated_size  reason: not valid java name */
    public final int m38781deprecated_size() {
        return size();
    }

    public long contentLength() {
        return writeOrCountBytes((C13127d) null, true);
    }

    public MediaType contentType() {
        return CONTENT_TYPE;
    }

    public final String encodedName(int i) {
        return this.encodedNames.get(i);
    }

    public final String encodedValue(int i) {
        return this.encodedValues.get(i);
    }

    public final String name(int i) {
        return HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.Companion, encodedName(i), 0, 0, true, 3, (Object) null);
    }

    public final int size() {
        return this.encodedNames.size();
    }

    public final String value(int i) {
        return HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.Companion, encodedValue(i), 0, 0, true, 3, (Object) null);
    }

    public void writeTo(C13127d dVar) {
        C12775o.m28639i(dVar, "sink");
        writeOrCountBytes(dVar, false);
    }
}
