package p129j3;

import android.util.JsonReader;
import android.util.JsonToken;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.Reader;

/* renamed from: j3.n */
/* compiled from: LogResponse */
public abstract class C8389n {
    /* renamed from: a */
    static C8389n m16764a(long j) {
        return new C8377h(j);
    }

    @NonNull
    /* renamed from: b */
    public static C8389n m16765b(@NonNull Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (!jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    jsonReader.skipValue();
                } else if (jsonReader.peek() == JsonToken.STRING) {
                    return m16764a(Long.parseLong(jsonReader.nextString()));
                } else {
                    C8389n a = m16764a(jsonReader.nextLong());
                    jsonReader.close();
                    return a;
                }
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    /* renamed from: c */
    public abstract long mo42398c();
}
