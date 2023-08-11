package android.support.p001v4.media;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p001v4.media.MediaDescriptionCompat;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.media.utils.MediaConstants;
import androidx.mediarouter.media.MediaItemMetadata;

/* renamed from: android.support.v4.media.MediaMetadataCompat */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR = new C0042a();

    /* renamed from: e */
    static final ArrayMap<String, Integer> f55e;

    /* renamed from: f */
    private static final String[] f56f = {MediaItemMetadata.KEY_TITLE, MediaItemMetadata.KEY_ARTIST, "android.media.metadata.ALBUM", MediaItemMetadata.KEY_ALBUM_ARTIST, "android.media.metadata.WRITER", MediaItemMetadata.KEY_AUTHOR, MediaItemMetadata.KEY_COMPOSER};

    /* renamed from: g */
    private static final String[] f57g = {"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};

    /* renamed from: h */
    private static final String[] f58h = {"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};

    /* renamed from: b */
    final Bundle f59b;

    /* renamed from: c */
    private MediaMetadata f60c;

    /* renamed from: d */
    private MediaDescriptionCompat f61d;

    /* renamed from: android.support.v4.media.MediaMetadataCompat$a */
    class C0042a implements Parcelable.Creator<MediaMetadataCompat> {
        C0042a() {
        }

        /* renamed from: a */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        /* renamed from: b */
        public MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    }

    static {
        ArrayMap<String, Integer> arrayMap = new ArrayMap<>();
        f55e = arrayMap;
        arrayMap.put(MediaItemMetadata.KEY_TITLE, 1);
        arrayMap.put(MediaItemMetadata.KEY_ARTIST, 1);
        arrayMap.put(MediaItemMetadata.KEY_DURATION, 0);
        arrayMap.put("android.media.metadata.ALBUM", 1);
        arrayMap.put(MediaItemMetadata.KEY_AUTHOR, 1);
        arrayMap.put("android.media.metadata.WRITER", 1);
        arrayMap.put(MediaItemMetadata.KEY_COMPOSER, 1);
        arrayMap.put("android.media.metadata.COMPILATION", 1);
        arrayMap.put("android.media.metadata.DATE", 1);
        arrayMap.put(MediaItemMetadata.KEY_YEAR, 0);
        arrayMap.put("android.media.metadata.GENRE", 1);
        arrayMap.put(MediaItemMetadata.KEY_TRACK_NUMBER, 0);
        arrayMap.put("android.media.metadata.NUM_TRACKS", 0);
        arrayMap.put(MediaItemMetadata.KEY_DISC_NUMBER, 0);
        arrayMap.put(MediaItemMetadata.KEY_ALBUM_ARTIST, 1);
        arrayMap.put("android.media.metadata.ART", 2);
        arrayMap.put("android.media.metadata.ART_URI", 1);
        arrayMap.put("android.media.metadata.ALBUM_ART", 2);
        arrayMap.put("android.media.metadata.ALBUM_ART_URI", 1);
        arrayMap.put("android.media.metadata.USER_RATING", 3);
        arrayMap.put("android.media.metadata.RATING", 3);
        arrayMap.put("android.media.metadata.DISPLAY_TITLE", 1);
        arrayMap.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        arrayMap.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        arrayMap.put("android.media.metadata.DISPLAY_ICON", 2);
        arrayMap.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        arrayMap.put("android.media.metadata.MEDIA_ID", 1);
        arrayMap.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        arrayMap.put("android.media.metadata.MEDIA_URI", 1);
        arrayMap.put(MediaConstants.METADATA_KEY_IS_ADVERTISEMENT, 0);
        arrayMap.put("android.media.metadata.DOWNLOAD_STATUS", 0);
    }

    MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f59b = bundle2;
        MediaSessionCompat.m163a(bundle2);
    }

    /* renamed from: b */
    public static MediaMetadataCompat m85b(Object obj) {
        if (obj == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        mediaMetadata.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        createFromParcel.f60c = mediaMetadata;
        return createFromParcel;
    }

    /* renamed from: a */
    public boolean mo115a(String str) {
        return this.f59b.containsKey(str);
    }

    /* renamed from: c */
    public Bitmap mo116c(String str) {
        try {
            return (Bitmap) this.f59b.getParcelable(str);
        } catch (Exception e) {
            Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", e);
            return null;
        }
    }

    /* renamed from: d */
    public MediaDescriptionCompat mo117d() {
        Uri uri;
        Bitmap bitmap;
        Uri uri2;
        MediaDescriptionCompat mediaDescriptionCompat = this.f61d;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        String g = mo121g("android.media.metadata.MEDIA_ID");
        CharSequence[] charSequenceArr = new CharSequence[3];
        CharSequence h = mo122h("android.media.metadata.DISPLAY_TITLE");
        if (TextUtils.isEmpty(h)) {
            int i = 0;
            int i2 = 0;
            while (i < 3) {
                String[] strArr = f56f;
                if (i2 >= strArr.length) {
                    break;
                }
                int i3 = i2 + 1;
                CharSequence h2 = mo122h(strArr[i2]);
                if (!TextUtils.isEmpty(h2)) {
                    charSequenceArr[i] = h2;
                    i++;
                }
                i2 = i3;
            }
        } else {
            charSequenceArr[0] = h;
            charSequenceArr[1] = mo122h("android.media.metadata.DISPLAY_SUBTITLE");
            charSequenceArr[2] = mo122h("android.media.metadata.DISPLAY_DESCRIPTION");
        }
        int i4 = 0;
        while (true) {
            String[] strArr2 = f57g;
            uri = null;
            if (i4 >= strArr2.length) {
                bitmap = null;
                break;
            }
            bitmap = mo116c(strArr2[i4]);
            if (bitmap != null) {
                break;
            }
            i4++;
        }
        int i5 = 0;
        while (true) {
            String[] strArr3 = f58h;
            if (i5 >= strArr3.length) {
                uri2 = null;
                break;
            }
            String g2 = mo121g(strArr3[i5]);
            if (!TextUtils.isEmpty(g2)) {
                uri2 = Uri.parse(g2);
                break;
            }
            i5++;
        }
        String g3 = mo121g("android.media.metadata.MEDIA_URI");
        if (!TextUtils.isEmpty(g3)) {
            uri = Uri.parse(g3);
        }
        MediaDescriptionCompat.C0041d dVar = new MediaDescriptionCompat.C0041d();
        dVar.mo111f(g);
        dVar.mo114i(charSequenceArr[0]);
        dVar.mo113h(charSequenceArr[1]);
        dVar.mo107b(charSequenceArr[2]);
        dVar.mo109d(bitmap);
        dVar.mo110e(uri2);
        dVar.mo112g(uri);
        Bundle bundle = new Bundle();
        if (this.f59b.containsKey("android.media.metadata.BT_FOLDER_TYPE")) {
            bundle.putLong("android.media.extra.BT_FOLDER_TYPE", mo119e("android.media.metadata.BT_FOLDER_TYPE"));
        }
        if (this.f59b.containsKey("android.media.metadata.DOWNLOAD_STATUS")) {
            bundle.putLong("android.media.extra.DOWNLOAD_STATUS", mo119e("android.media.metadata.DOWNLOAD_STATUS"));
        }
        if (!bundle.isEmpty()) {
            dVar.mo108c(bundle);
        }
        MediaDescriptionCompat a = dVar.mo106a();
        this.f61d = a;
        return a;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public long mo119e(String str) {
        return this.f59b.getLong(str, 0);
    }

    /* renamed from: f */
    public Object mo120f() {
        if (this.f60c == null) {
            Parcel obtain = Parcel.obtain();
            writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            this.f60c = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
            obtain.recycle();
        }
        return this.f60c;
    }

    /* renamed from: g */
    public String mo121g(String str) {
        CharSequence charSequence = this.f59b.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: h */
    public CharSequence mo122h(String str) {
        return this.f59b.getCharSequence(str);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f59b);
    }

    /* renamed from: android.support.v4.media.MediaMetadataCompat$b */
    public static final class C0043b {

        /* renamed from: a */
        private final Bundle f62a;

        public C0043b() {
            this.f62a = new Bundle();
        }

        /* renamed from: a */
        public MediaMetadataCompat mo128a() {
            return new MediaMetadataCompat(this.f62a);
        }

        /* renamed from: b */
        public C0043b mo129b(String str, Bitmap bitmap) {
            ArrayMap<String, Integer> arrayMap = MediaMetadataCompat.f55e;
            if (!arrayMap.containsKey(str) || arrayMap.get(str).intValue() == 2) {
                this.f62a.putParcelable(str, bitmap);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a Bitmap");
        }

        /* renamed from: c */
        public C0043b mo130c(String str, long j) {
            ArrayMap<String, Integer> arrayMap = MediaMetadataCompat.f55e;
            if (!arrayMap.containsKey(str) || arrayMap.get(str).intValue() == 0) {
                this.f62a.putLong(str, j);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a long");
        }

        /* renamed from: d */
        public C0043b mo131d(String str, String str2) {
            ArrayMap<String, Integer> arrayMap = MediaMetadataCompat.f55e;
            if (!arrayMap.containsKey(str) || arrayMap.get(str).intValue() == 1) {
                this.f62a.putCharSequence(str, str2);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a String");
        }

        public C0043b(MediaMetadataCompat mediaMetadataCompat) {
            Bundle bundle = new Bundle(mediaMetadataCompat.f59b);
            this.f62a = bundle;
            MediaSessionCompat.m163a(bundle);
        }
    }

    MediaMetadataCompat(Parcel parcel) {
        this.f59b = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }
}
