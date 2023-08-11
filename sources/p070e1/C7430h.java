package p070e1;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;

/* renamed from: e1.h */
/* compiled from: FileDescriptorAssetPathFetcher */
public class C7430h extends C7420b<ParcelFileDescriptor> {
    public C7430h(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @NonNull
    /* renamed from: a */
    public Class<ParcelFileDescriptor> mo41069a() {
        return ParcelFileDescriptor.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo41075c(ParcelFileDescriptor parcelFileDescriptor) {
        parcelFileDescriptor.close();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public ParcelFileDescriptor mo41079f(AssetManager assetManager, String str) {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }
}
