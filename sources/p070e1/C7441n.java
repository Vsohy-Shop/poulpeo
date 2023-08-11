package p070e1;

import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import java.io.InputStream;

/* renamed from: e1.n */
/* compiled from: StreamAssetPathFetcher */
public class C7441n extends C7420b<InputStream> {
    public C7441n(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @NonNull
    /* renamed from: a */
    public Class<InputStream> mo41069a() {
        return InputStream.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo41075c(InputStream inputStream) {
        inputStream.close();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public InputStream mo41079f(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}
