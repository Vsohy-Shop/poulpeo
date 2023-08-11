package p239u1;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* renamed from: u1.b */
/* compiled from: ImageHeaderParserRegistry */
public final class C9869b {

    /* renamed from: a */
    private final List<ImageHeaderParser> f14754a = new ArrayList();

    /* renamed from: a */
    public synchronized void mo44389a(@NonNull ImageHeaderParser imageHeaderParser) {
        this.f14754a.add(imageHeaderParser);
    }

    @NonNull
    /* renamed from: b */
    public synchronized List<ImageHeaderParser> mo44390b() {
        return this.f14754a;
    }
}
