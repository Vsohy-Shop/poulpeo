package android.support.p001v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* renamed from: android.support.v4.media.MediaDescriptionCompat */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0038a();

    /* renamed from: b */
    private final String f38b;

    /* renamed from: c */
    private final CharSequence f39c;

    /* renamed from: d */
    private final CharSequence f40d;

    /* renamed from: e */
    private final CharSequence f41e;

    /* renamed from: f */
    private final Bitmap f42f;

    /* renamed from: g */
    private final Uri f43g;

    /* renamed from: h */
    private final Bundle f44h;

    /* renamed from: i */
    private final Uri f45i;

    /* renamed from: j */
    private MediaDescription f46j;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    class C0038a implements Parcelable.Creator<MediaDescriptionCompat> {
        C0038a() {
        }

        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.m49a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    @RequiresApi(21)
    /* renamed from: android.support.v4.media.MediaDescriptionCompat$b */
    private static class C0039b {
        @DoNotInline
        /* renamed from: a */
        static MediaDescription m58a(MediaDescription.Builder builder) {
            return builder.build();
        }

        @DoNotInline
        /* renamed from: b */
        static MediaDescription.Builder m59b() {
            return new MediaDescription.Builder();
        }

        @DoNotInline
        @Nullable
        /* renamed from: c */
        static CharSequence m60c(MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }

        @DoNotInline
        @Nullable
        /* renamed from: d */
        static Bundle m61d(MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }

        @DoNotInline
        @Nullable
        /* renamed from: e */
        static Bitmap m62e(MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        @DoNotInline
        @Nullable
        /* renamed from: f */
        static Uri m63f(MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        @DoNotInline
        @Nullable
        /* renamed from: g */
        static String m64g(MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        @DoNotInline
        @Nullable
        /* renamed from: h */
        static CharSequence m65h(MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        @DoNotInline
        @Nullable
        /* renamed from: i */
        static CharSequence m66i(MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        @DoNotInline
        /* renamed from: j */
        static void m67j(MediaDescription.Builder builder, @Nullable CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        @DoNotInline
        /* renamed from: k */
        static void m68k(MediaDescription.Builder builder, @Nullable Bundle bundle) {
            builder.setExtras(bundle);
        }

        @DoNotInline
        /* renamed from: l */
        static void m69l(MediaDescription.Builder builder, @Nullable Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        @DoNotInline
        /* renamed from: m */
        static void m70m(MediaDescription.Builder builder, @Nullable Uri uri) {
            builder.setIconUri(uri);
        }

        @DoNotInline
        /* renamed from: n */
        static void m71n(MediaDescription.Builder builder, @Nullable String str) {
            builder.setMediaId(str);
        }

        @DoNotInline
        /* renamed from: o */
        static void m72o(MediaDescription.Builder builder, @Nullable CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        @DoNotInline
        /* renamed from: p */
        static void m73p(MediaDescription.Builder builder, @Nullable CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    @RequiresApi(23)
    /* renamed from: android.support.v4.media.MediaDescriptionCompat$c */
    private static class C0040c {
        @DoNotInline
        @Nullable
        /* renamed from: a */
        static Uri m74a(MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }

        @DoNotInline
        /* renamed from: b */
        static void m75b(MediaDescription.Builder builder, @Nullable Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$d */
    public static final class C0041d {

        /* renamed from: a */
        private String f47a;

        /* renamed from: b */
        private CharSequence f48b;

        /* renamed from: c */
        private CharSequence f49c;

        /* renamed from: d */
        private CharSequence f50d;

        /* renamed from: e */
        private Bitmap f51e;

        /* renamed from: f */
        private Uri f52f;

        /* renamed from: g */
        private Bundle f53g;

        /* renamed from: h */
        private Uri f54h;

        /* renamed from: a */
        public MediaDescriptionCompat mo106a() {
            return new MediaDescriptionCompat(this.f47a, this.f48b, this.f49c, this.f50d, this.f51e, this.f52f, this.f53g, this.f54h);
        }

        /* renamed from: b */
        public C0041d mo107b(@Nullable CharSequence charSequence) {
            this.f50d = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0041d mo108c(@Nullable Bundle bundle) {
            this.f53g = bundle;
            return this;
        }

        /* renamed from: d */
        public C0041d mo109d(@Nullable Bitmap bitmap) {
            this.f51e = bitmap;
            return this;
        }

        /* renamed from: e */
        public C0041d mo110e(@Nullable Uri uri) {
            this.f52f = uri;
            return this;
        }

        /* renamed from: f */
        public C0041d mo111f(@Nullable String str) {
            this.f47a = str;
            return this;
        }

        /* renamed from: g */
        public C0041d mo112g(@Nullable Uri uri) {
            this.f54h = uri;
            return this;
        }

        /* renamed from: h */
        public C0041d mo113h(@Nullable CharSequence charSequence) {
            this.f49c = charSequence;
            return this;
        }

        /* renamed from: i */
        public C0041d mo114i(@Nullable CharSequence charSequence) {
            this.f48b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f38b = str;
        this.f39c = charSequence;
        this.f40d = charSequence2;
        this.f41e = charSequence3;
        this.f42f = bitmap;
        this.f43g = uri;
        this.f44h = bundle;
        this.f45i = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p001v4.media.MediaDescriptionCompat m49a(java.lang.Object r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x0079
            android.support.v4.media.MediaDescriptionCompat$d r1 = new android.support.v4.media.MediaDescriptionCompat$d
            r1.<init>()
            android.media.MediaDescription r8 = (android.media.MediaDescription) r8
            java.lang.String r2 = android.support.p001v4.media.MediaDescriptionCompat.C0039b.m64g(r8)
            r1.mo111f(r2)
            java.lang.CharSequence r2 = android.support.p001v4.media.MediaDescriptionCompat.C0039b.m66i(r8)
            r1.mo114i(r2)
            java.lang.CharSequence r2 = android.support.p001v4.media.MediaDescriptionCompat.C0039b.m65h(r8)
            r1.mo113h(r2)
            java.lang.CharSequence r2 = android.support.p001v4.media.MediaDescriptionCompat.C0039b.m60c(r8)
            r1.mo107b(r2)
            android.graphics.Bitmap r2 = android.support.p001v4.media.MediaDescriptionCompat.C0039b.m62e(r8)
            r1.mo109d(r2)
            android.net.Uri r2 = android.support.p001v4.media.MediaDescriptionCompat.C0039b.m63f(r8)
            r1.mo110e(r2)
            android.os.Bundle r2 = android.support.p001v4.media.MediaDescriptionCompat.C0039b.m61d(r8)
            if (r2 == 0) goto L_0x003e
            android.os.Bundle r2 = android.support.p001v4.media.session.MediaSessionCompat.m166r(r2)
        L_0x003e:
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L_0x0049
            android.os.Parcelable r4 = r2.getParcelable(r3)
            android.net.Uri r4 = (android.net.Uri) r4
            goto L_0x004a
        L_0x0049:
            r4 = r0
        L_0x004a:
            if (r4 == 0) goto L_0x0062
            java.lang.String r5 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r6 = r2.containsKey(r5)
            if (r6 == 0) goto L_0x005c
            int r6 = r2.size()
            r7 = 2
            if (r6 != r7) goto L_0x005c
            goto L_0x0063
        L_0x005c:
            r2.remove(r3)
            r2.remove(r5)
        L_0x0062:
            r0 = r2
        L_0x0063:
            r1.mo108c(r0)
            if (r4 == 0) goto L_0x006c
            r1.mo112g(r4)
            goto L_0x0073
        L_0x006c:
            android.net.Uri r0 = android.support.p001v4.media.MediaDescriptionCompat.C0040c.m74a(r8)
            r1.mo112g(r0)
        L_0x0073:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.mo106a()
            r0.f46j = r8
        L_0x0079:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p001v4.media.MediaDescriptionCompat.m49a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    @Nullable
    /* renamed from: b */
    public Bitmap mo93b() {
        return this.f42f;
    }

    @Nullable
    /* renamed from: c */
    public Uri mo94c() {
        return this.f43g;
    }

    /* renamed from: d */
    public Object mo95d() {
        MediaDescription mediaDescription = this.f46j;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder b = C0039b.m59b();
        C0039b.m71n(b, this.f38b);
        C0039b.m73p(b, this.f39c);
        C0039b.m72o(b, this.f40d);
        C0039b.m67j(b, this.f41e);
        C0039b.m69l(b, this.f42f);
        C0039b.m70m(b, this.f43g);
        C0039b.m68k(b, this.f44h);
        C0040c.m75b(b, this.f45i);
        MediaDescription a = C0039b.m58a(b);
        this.f46j = a;
        return a;
    }

    public int describeContents() {
        return 0;
    }

    @Nullable
    /* renamed from: e */
    public String mo97e() {
        return this.f38b;
    }

    @Nullable
    /* renamed from: f */
    public CharSequence mo98f() {
        return this.f40d;
    }

    @Nullable
    /* renamed from: g */
    public CharSequence mo99g() {
        return this.f39c;
    }

    public String toString() {
        return this.f39c + ", " + this.f40d + ", " + this.f41e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((MediaDescription) mo95d()).writeToParcel(parcel, i);
    }
}
