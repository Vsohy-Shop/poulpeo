package p242u4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p231t4.C9713p;

/* renamed from: u4.d */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C9885d {
    @NonNull
    /* renamed from: a */
    public static <T extends C9884c> T m20547a(@NonNull byte[] bArr, @NonNull Parcelable.Creator<T> creator) {
        C9713p.m20275j(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T t = (C9884c) creator.createFromParcel(obtain);
        obtain.recycle();
        return t;
    }

    @Nullable
    /* renamed from: b */
    public static <T extends C9884c> T m20548b(@NonNull Intent intent, @NonNull String str, @NonNull Parcelable.Creator<T> creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return m20547a(byteArrayExtra, creator);
    }
}
