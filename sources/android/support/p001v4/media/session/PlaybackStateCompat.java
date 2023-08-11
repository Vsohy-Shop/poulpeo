package android.support.p001v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0077a();

    /* renamed from: b */
    final int f126b;

    /* renamed from: c */
    final long f127c;

    /* renamed from: d */
    final long f128d;

    /* renamed from: e */
    final float f129e;

    /* renamed from: f */
    final long f130f;

    /* renamed from: g */
    final int f131g;

    /* renamed from: h */
    final CharSequence f132h;

    /* renamed from: i */
    final long f133i;

    /* renamed from: j */
    List<CustomAction> f134j;

    /* renamed from: k */
    final long f135k;

    /* renamed from: l */
    final Bundle f136l;

    /* renamed from: m */
    private PlaybackState f137m;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    class C0077a implements Parcelable.Creator<PlaybackStateCompat> {
        C0077a() {
        }

        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    @RequiresApi(21)
    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$b */
    private static class C0078b {
        @DoNotInline
        /* renamed from: a */
        static void m330a(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
            builder.addCustomAction(customAction);
        }

        @DoNotInline
        /* renamed from: b */
        static PlaybackState.CustomAction m331b(PlaybackState.CustomAction.Builder builder) {
            return builder.build();
        }

        @DoNotInline
        /* renamed from: c */
        static PlaybackState m332c(PlaybackState.Builder builder) {
            return builder.build();
        }

        @DoNotInline
        /* renamed from: d */
        static PlaybackState.Builder m333d() {
            return new PlaybackState.Builder();
        }

        @DoNotInline
        /* renamed from: e */
        static PlaybackState.CustomAction.Builder m334e(String str, CharSequence charSequence, int i) {
            return new PlaybackState.CustomAction.Builder(str, charSequence, i);
        }

        @DoNotInline
        /* renamed from: f */
        static String m335f(PlaybackState.CustomAction customAction) {
            return customAction.getAction();
        }

        @DoNotInline
        /* renamed from: g */
        static long m336g(PlaybackState playbackState) {
            return playbackState.getActions();
        }

        @DoNotInline
        /* renamed from: h */
        static long m337h(PlaybackState playbackState) {
            return playbackState.getActiveQueueItemId();
        }

        @DoNotInline
        /* renamed from: i */
        static long m338i(PlaybackState playbackState) {
            return playbackState.getBufferedPosition();
        }

        @DoNotInline
        /* renamed from: j */
        static List<PlaybackState.CustomAction> m339j(PlaybackState playbackState) {
            return playbackState.getCustomActions();
        }

        @DoNotInline
        /* renamed from: k */
        static CharSequence m340k(PlaybackState playbackState) {
            return playbackState.getErrorMessage();
        }

        @DoNotInline
        /* renamed from: l */
        static Bundle m341l(PlaybackState.CustomAction customAction) {
            return customAction.getExtras();
        }

        @DoNotInline
        /* renamed from: m */
        static int m342m(PlaybackState.CustomAction customAction) {
            return customAction.getIcon();
        }

        @DoNotInline
        /* renamed from: n */
        static long m343n(PlaybackState playbackState) {
            return playbackState.getLastPositionUpdateTime();
        }

        @DoNotInline
        /* renamed from: o */
        static CharSequence m344o(PlaybackState.CustomAction customAction) {
            return customAction.getName();
        }

        @DoNotInline
        /* renamed from: p */
        static float m345p(PlaybackState playbackState) {
            return playbackState.getPlaybackSpeed();
        }

        @DoNotInline
        /* renamed from: q */
        static long m346q(PlaybackState playbackState) {
            return playbackState.getPosition();
        }

        @DoNotInline
        /* renamed from: r */
        static int m347r(PlaybackState playbackState) {
            return playbackState.getState();
        }

        @DoNotInline
        /* renamed from: s */
        static void m348s(PlaybackState.Builder builder, long j) {
            builder.setActions(j);
        }

        @DoNotInline
        /* renamed from: t */
        static void m349t(PlaybackState.Builder builder, long j) {
            builder.setActiveQueueItemId(j);
        }

        @DoNotInline
        /* renamed from: u */
        static void m350u(PlaybackState.Builder builder, long j) {
            builder.setBufferedPosition(j);
        }

        @DoNotInline
        /* renamed from: v */
        static void m351v(PlaybackState.Builder builder, CharSequence charSequence) {
            builder.setErrorMessage(charSequence);
        }

        @DoNotInline
        /* renamed from: w */
        static void m352w(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        @DoNotInline
        /* renamed from: x */
        static void m353x(PlaybackState.Builder builder, int i, long j, float f, long j2) {
            builder.setState(i, j, f, j2);
        }
    }

    @RequiresApi(22)
    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$c */
    private static class C0079c {
        @DoNotInline
        /* renamed from: a */
        static Bundle m354a(PlaybackState playbackState) {
            return playbackState.getExtras();
        }

        @DoNotInline
        /* renamed from: b */
        static void m355b(PlaybackState.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f126b = i;
        this.f127c = j;
        this.f128d = j2;
        this.f129e = f;
        this.f130f = j3;
        this.f131g = i2;
        this.f132h = charSequence;
        this.f133i = j4;
        this.f134j = new ArrayList(list);
        this.f135k = j5;
        this.f136l = bundle;
    }

    /* renamed from: a */
    public static PlaybackStateCompat m315a(Object obj) {
        ArrayList arrayList = null;
        if (obj == null) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> j = C0078b.m339j(playbackState);
        if (j != null) {
            arrayList = new ArrayList(j.size());
            for (PlaybackState.CustomAction a : j) {
                arrayList.add(CustomAction.m323a(a));
            }
        }
        Bundle a2 = C0079c.m354a(playbackState);
        MediaSessionCompat.m163a(a2);
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(C0078b.m347r(playbackState), C0078b.m346q(playbackState), C0078b.m338i(playbackState), C0078b.m345p(playbackState), C0078b.m336g(playbackState), 0, C0078b.m340k(playbackState), C0078b.m343n(playbackState), arrayList, C0078b.m337h(playbackState), a2);
        playbackStateCompat.f137m = playbackState;
        return playbackStateCompat;
    }

    /* renamed from: h */
    public static int m316h(long j) {
        if (j == 4) {
            return 126;
        }
        if (j == 2) {
            return 127;
        }
        if (j == 32) {
            return 87;
        }
        if (j == 16) {
            return 88;
        }
        if (j == 1) {
            return 86;
        }
        if (j == 64) {
            return 90;
        }
        if (j == 8) {
            return 89;
        }
        if (j == 512) {
            return 85;
        }
        return 0;
    }

    /* renamed from: b */
    public long mo370b() {
        return this.f130f;
    }

    /* renamed from: c */
    public long mo371c() {
        return this.f133i;
    }

    /* renamed from: d */
    public float mo372d() {
        return this.f129e;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public Object mo374e() {
        if (this.f137m == null) {
            PlaybackState.Builder d = C0078b.m333d();
            C0078b.m353x(d, this.f126b, this.f127c, this.f129e, this.f133i);
            C0078b.m350u(d, this.f128d);
            C0078b.m348s(d, this.f130f);
            C0078b.m351v(d, this.f132h);
            for (CustomAction b : this.f134j) {
                C0078b.m330a(d, (PlaybackState.CustomAction) b.mo379b());
            }
            C0078b.m349t(d, this.f135k);
            C0079c.m355b(d, this.f136l);
            this.f137m = C0078b.m332c(d);
        }
        return this.f137m;
    }

    /* renamed from: f */
    public long mo375f() {
        return this.f127c;
    }

    /* renamed from: g */
    public int mo376g() {
        return this.f126b;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.f126b + ", position=" + this.f127c + ", buffered position=" + this.f128d + ", speed=" + this.f129e + ", updated=" + this.f133i + ", actions=" + this.f130f + ", error code=" + this.f131g + ", error message=" + this.f132h + ", custom actions=" + this.f134j + ", active item id=" + this.f135k + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f126b);
        parcel.writeLong(this.f127c);
        parcel.writeFloat(this.f129e);
        parcel.writeLong(this.f133i);
        parcel.writeLong(this.f128d);
        parcel.writeLong(this.f130f);
        TextUtils.writeToParcel(this.f132h, parcel, i);
        parcel.writeTypedList(this.f134j);
        parcel.writeLong(this.f135k);
        parcel.writeBundle(this.f136l);
        parcel.writeInt(this.f131g);
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$d */
    public static final class C0080d {

        /* renamed from: a */
        private final List<CustomAction> f147a;

        /* renamed from: b */
        private int f148b;

        /* renamed from: c */
        private long f149c;

        /* renamed from: d */
        private long f150d;

        /* renamed from: e */
        private float f151e;

        /* renamed from: f */
        private long f152f;

        /* renamed from: g */
        private int f153g;

        /* renamed from: h */
        private CharSequence f154h;

        /* renamed from: i */
        private long f155i;

        /* renamed from: j */
        private long f156j;

        /* renamed from: k */
        private Bundle f157k;

        public C0080d() {
            this.f147a = new ArrayList();
            this.f156j = -1;
        }

        /* renamed from: a */
        public C0080d mo392a(CustomAction customAction) {
            if (customAction != null) {
                this.f147a.add(customAction);
                return this;
            }
            throw new IllegalArgumentException("You may not add a null CustomAction to PlaybackStateCompat");
        }

        /* renamed from: b */
        public PlaybackStateCompat mo393b() {
            return new PlaybackStateCompat(this.f148b, this.f149c, this.f150d, this.f151e, this.f152f, this.f153g, this.f154h, this.f155i, this.f147a, this.f156j, this.f157k);
        }

        /* renamed from: c */
        public C0080d mo394c(long j) {
            this.f152f = j;
            return this;
        }

        /* renamed from: d */
        public C0080d mo395d(int i, long j, float f) {
            return mo396e(i, j, f, SystemClock.elapsedRealtime());
        }

        /* renamed from: e */
        public C0080d mo396e(int i, long j, float f, long j2) {
            this.f148b = i;
            this.f149c = j;
            this.f155i = j2;
            this.f151e = f;
            return this;
        }

        public C0080d(PlaybackStateCompat playbackStateCompat) {
            ArrayList arrayList = new ArrayList();
            this.f147a = arrayList;
            this.f156j = -1;
            this.f148b = playbackStateCompat.f126b;
            this.f149c = playbackStateCompat.f127c;
            this.f151e = playbackStateCompat.f129e;
            this.f155i = playbackStateCompat.f133i;
            this.f150d = playbackStateCompat.f128d;
            this.f152f = playbackStateCompat.f130f;
            this.f153g = playbackStateCompat.f131g;
            this.f154h = playbackStateCompat.f132h;
            List<CustomAction> list = playbackStateCompat.f134j;
            if (list != null) {
                arrayList.addAll(list);
            }
            this.f156j = playbackStateCompat.f135k;
            this.f157k = playbackStateCompat.f136l;
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0075a();

        /* renamed from: b */
        private final String f138b;

        /* renamed from: c */
        private final CharSequence f139c;

        /* renamed from: d */
        private final int f140d;

        /* renamed from: e */
        private final Bundle f141e;

        /* renamed from: f */
        private PlaybackState.CustomAction f142f;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$a */
        class C0075a implements Parcelable.Creator<CustomAction> {
            C0075a() {
            }

            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* renamed from: b */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$b */
        public static final class C0076b {

            /* renamed from: a */
            private final String f143a;

            /* renamed from: b */
            private final CharSequence f144b;

            /* renamed from: c */
            private final int f145c;

            /* renamed from: d */
            private Bundle f146d;

            public C0076b(String str, CharSequence charSequence, int i) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                } else if (TextUtils.isEmpty(charSequence)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                } else if (i != 0) {
                    this.f143a = str;
                    this.f144b = charSequence;
                    this.f145c = i;
                } else {
                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                }
            }

            /* renamed from: a */
            public CustomAction mo387a() {
                return new CustomAction(this.f143a, this.f144b, this.f145c, this.f146d);
            }
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f138b = str;
            this.f139c = charSequence;
            this.f140d = i;
            this.f141e = bundle;
        }

        /* renamed from: a */
        public static CustomAction m323a(Object obj) {
            if (obj == null) {
                return null;
            }
            PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
            Bundle l = C0078b.m341l(customAction);
            MediaSessionCompat.m163a(l);
            CustomAction customAction2 = new CustomAction(C0078b.m335f(customAction), C0078b.m344o(customAction), C0078b.m342m(customAction), l);
            customAction2.f142f = customAction;
            return customAction2;
        }

        /* renamed from: b */
        public Object mo379b() {
            PlaybackState.CustomAction customAction = this.f142f;
            if (customAction != null) {
                return customAction;
            }
            PlaybackState.CustomAction.Builder e = C0078b.m334e(this.f138b, this.f139c, this.f140d);
            C0078b.m352w(e, this.f141e);
            return C0078b.m331b(e);
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + this.f139c + ", mIcon=" + this.f140d + ", mExtras=" + this.f141e;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f138b);
            TextUtils.writeToParcel(this.f139c, parcel, i);
            parcel.writeInt(this.f140d);
            parcel.writeBundle(this.f141e);
        }

        CustomAction(Parcel parcel) {
            this.f138b = parcel.readString();
            this.f139c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f140d = parcel.readInt();
            this.f141e = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f126b = parcel.readInt();
        this.f127c = parcel.readLong();
        this.f129e = parcel.readFloat();
        this.f133i = parcel.readLong();
        this.f128d = parcel.readLong();
        this.f130f = parcel.readLong();
        this.f132h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f134j = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f135k = parcel.readLong();
        this.f136l = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f131g = parcel.readInt();
    }
}
