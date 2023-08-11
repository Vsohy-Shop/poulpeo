package android.support.p001v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.MediaDescription;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.VolumeProvider;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.p001v4.media.MediaDescriptionCompat;
import android.support.p001v4.media.MediaMetadataCompat;
import android.support.p001v4.media.RatingCompat;
import android.support.p001v4.media.session.C0084b;
import android.support.p001v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.annotation.DoNotInline;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.media.MediaSessionManager;
import androidx.media.VolumeProviderCompat;
import androidx.media.session.MediaButtonReceiver;
import androidx.mediarouter.media.MediaItemMetadata;
import androidx.versionedparcelable.VersionedParcelable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaSessionCompat */
public class MediaSessionCompat {

    /* renamed from: d */
    static int f85d;

    /* renamed from: a */
    private final C0067c f86a;

    /* renamed from: b */
    private final MediaControllerCompat f87b;

    /* renamed from: c */
    private final ArrayList<C0073h> f88c;

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper */
    static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new C0061a();

        /* renamed from: b */
        ResultReceiver f92b;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$a */
        class C0061a implements Parcelable.Creator<ResultReceiverWrapper> {
            C0061a() {
            }

            /* renamed from: a */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            /* renamed from: b */
            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f92b = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f92b.writeToParcel(parcel, i);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new C0062a();

        /* renamed from: b */
        private final Object f93b;

        /* renamed from: c */
        private final Object f94c;
        @GuardedBy("mLock")

        /* renamed from: d */
        private C0084b f95d;
        @GuardedBy("mLock")

        /* renamed from: e */
        private VersionedParcelable f96e;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token$a */
        class C0062a implements Parcelable.Creator<Token> {
            C0062a() {
            }

            /* renamed from: a */
            public Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable((ClassLoader) null));
            }

            /* renamed from: b */
            public Token[] newArray(int i) {
                return new Token[i];
            }
        }

        Token(Object obj) {
            this(obj, (C0084b) null, (VersionedParcelable) null);
        }

        /* renamed from: a */
        public static Token m191a(Object obj) {
            return m192b(obj, (C0084b) null);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        /* renamed from: b */
        public static Token m192b(Object obj, C0084b bVar) {
            if (obj == null) {
                return null;
            }
            if (obj instanceof MediaSession.Token) {
                return new Token(obj, bVar);
            }
            throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        /* renamed from: c */
        public C0084b mo227c() {
            C0084b bVar;
            synchronized (this.f93b) {
                bVar = this.f95d;
            }
            return bVar;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: d */
        public VersionedParcelable mo228d() {
            VersionedParcelable versionedParcelable;
            synchronized (this.f93b) {
                versionedParcelable = this.f96e;
            }
            return versionedParcelable;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public Object mo230e() {
            return this.f94c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f94c;
            if (obj2 != null) {
                Object obj3 = token.f94c;
                if (obj3 == null) {
                    return false;
                }
                return obj2.equals(obj3);
            } else if (token.f94c == null) {
                return true;
            } else {
                return false;
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        /* renamed from: f */
        public void mo232f(C0084b bVar) {
            synchronized (this.f93b) {
                this.f95d = bVar;
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: g */
        public void mo233g(VersionedParcelable versionedParcelable) {
            synchronized (this.f93b) {
                this.f96e = versionedParcelable;
            }
        }

        public int hashCode() {
            Object obj = this.f94c;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable((Parcelable) this.f94c, i);
        }

        Token(Object obj, C0084b bVar) {
            this(obj, bVar, (VersionedParcelable) null);
        }

        Token(Object obj, C0084b bVar, VersionedParcelable versionedParcelable) {
            this.f93b = new Object();
            this.f94c = obj;
            this.f95d = bVar;
            this.f96e = versionedParcelable;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$a */
    class C0063a extends C0064b {
        C0063a() {
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$c */
    interface C0067c {
        /* renamed from: a */
        boolean mo292a();

        /* renamed from: b */
        Token mo293b();

        /* renamed from: c */
        String mo294c();

        /* renamed from: d */
        void mo295d(PendingIntent pendingIntent);

        /* renamed from: e */
        void mo296e(C0064b bVar, Handler handler);

        /* renamed from: f */
        void mo297f(int i);

        /* renamed from: g */
        C0064b mo298g();

        /* renamed from: h */
        void mo299h(MediaMetadataCompat mediaMetadataCompat);

        /* renamed from: i */
        void mo300i(PendingIntent pendingIntent);

        /* renamed from: j */
        Object mo301j();

        /* renamed from: k */
        void mo302k(boolean z);

        /* renamed from: l */
        PlaybackStateCompat mo303l();

        /* renamed from: m */
        void mo304m(MediaSessionManager.RemoteUserInfo remoteUserInfo);

        /* renamed from: n */
        void mo305n(PlaybackStateCompat playbackStateCompat);

        /* renamed from: o */
        void mo306o(VolumeProviderCompat volumeProviderCompat);

        /* renamed from: p */
        MediaSessionManager.RemoteUserInfo mo307p();

        void release();

        void setExtras(Bundle bundle);
    }

    @RequiresApi(22)
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$e */
    static class C0070e extends C0068d {
        C0070e(Context context, String str, VersionedParcelable versionedParcelable, Bundle bundle) {
            super(context, str, versionedParcelable, bundle);
        }

        C0070e(Object obj) {
            super(obj);
        }
    }

    @RequiresApi(28)
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$f */
    static class C0071f extends C0070e {
        C0071f(Context context, String str, VersionedParcelable versionedParcelable, Bundle bundle) {
            super(context, str, versionedParcelable, bundle);
        }

        @NonNull
        /* renamed from: p */
        public final MediaSessionManager.RemoteUserInfo mo307p() {
            return new MediaSessionManager.RemoteUserInfo(this.f105a.getCurrentControllerInfo());
        }

        C0071f(Object obj) {
            super(obj);
        }

        /* renamed from: m */
        public void mo304m(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        }
    }

    @RequiresApi(29)
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$g */
    static class C0072g extends C0071f {
        C0072g(Context context, String str, VersionedParcelable versionedParcelable, Bundle bundle) {
            super(context, str, versionedParcelable, bundle);
        }

        /* renamed from: q */
        public MediaSession mo310q(Context context, String str, Bundle bundle) {
            return new MediaSession(context, str, bundle);
        }

        C0072g(Object obj) {
            super(obj);
            this.f108d = ((MediaSession) obj).getController().getSessionInfo();
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$h */
    public interface C0073h {
        void onActiveChanged();
    }

    public MediaSessionCompat(@NonNull Context context, @NonNull String str, @Nullable ComponentName componentName, @Nullable PendingIntent pendingIntent) {
        this(context, str, componentName, pendingIntent, (Bundle) null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: a */
    public static void m163a(@Nullable Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    /* renamed from: b */
    public static MediaSessionCompat m164b(Context context, Object obj) {
        C0067c cVar;
        int i = Build.VERSION.SDK_INT;
        if (context == null || obj == null) {
            return null;
        }
        if (i >= 29) {
            cVar = new C0072g(obj);
        } else if (i >= 28) {
            cVar = new C0071f(obj);
        } else {
            cVar = new C0068d(obj);
        }
        return new MediaSessionCompat(context, cVar);
    }

    /* renamed from: f */
    static PlaybackStateCompat m165f(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        long j;
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j2 = -1;
        if (playbackStateCompat.mo375f() == -1) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.mo376g() != 3 && playbackStateCompat.mo376g() != 4 && playbackStateCompat.mo376g() != 5) {
            return playbackStateCompat;
        }
        long c = playbackStateCompat.mo371c();
        if (c <= 0) {
            return playbackStateCompat;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long d = ((long) (playbackStateCompat.mo372d() * ((float) (elapsedRealtime - c)))) + playbackStateCompat.mo375f();
        if (mediaMetadataCompat != null && mediaMetadataCompat.mo115a(MediaItemMetadata.KEY_DURATION)) {
            j2 = mediaMetadataCompat.mo119e(MediaItemMetadata.KEY_DURATION);
        }
        if (j2 >= 0 && d > j2) {
            j = j2;
        } else if (d < 0) {
            j = 0;
        } else {
            j = d;
        }
        return new PlaybackStateCompat.C0080d(playbackStateCompat).mo396e(playbackStateCompat.mo376g(), j, playbackStateCompat.mo372d(), elapsedRealtime).mo393b();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: r */
    public static Bundle m166r(@Nullable Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        m163a(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    /* renamed from: c */
    public MediaControllerCompat mo199c() {
        return this.f87b;
    }

    /* renamed from: d */
    public Object mo200d() {
        return this.f86a.mo301j();
    }

    /* renamed from: e */
    public Token mo201e() {
        return this.f86a.mo293b();
    }

    /* renamed from: g */
    public boolean mo202g() {
        return this.f86a.mo292a();
    }

    /* renamed from: h */
    public void mo203h() {
        this.f86a.release();
    }

    /* renamed from: i */
    public void mo204i(boolean z) {
        this.f86a.mo302k(z);
        Iterator<C0073h> it = this.f88c.iterator();
        while (it.hasNext()) {
            it.next().onActiveChanged();
        }
    }

    /* renamed from: j */
    public void mo205j(C0064b bVar) {
        mo206k(bVar, (Handler) null);
    }

    /* renamed from: k */
    public void mo206k(C0064b bVar, Handler handler) {
        if (bVar == null) {
            this.f86a.mo296e((C0064b) null, (Handler) null);
            return;
        }
        C0067c cVar = this.f86a;
        if (handler == null) {
            handler = new Handler();
        }
        cVar.mo296e(bVar, handler);
    }

    /* renamed from: l */
    public void mo207l(Bundle bundle) {
        this.f86a.setExtras(bundle);
    }

    /* renamed from: m */
    public void mo208m(MediaMetadataCompat mediaMetadataCompat) {
        this.f86a.mo299h(mediaMetadataCompat);
    }

    /* renamed from: n */
    public void mo209n(PlaybackStateCompat playbackStateCompat) {
        this.f86a.mo305n(playbackStateCompat);
    }

    /* renamed from: o */
    public void mo210o(int i) {
        this.f86a.mo297f(i);
    }

    /* renamed from: p */
    public void mo211p(VolumeProviderCompat volumeProviderCompat) {
        if (volumeProviderCompat != null) {
            this.f86a.mo306o(volumeProviderCompat);
            return;
        }
        throw new IllegalArgumentException("volumeProvider may not be null!");
    }

    /* renamed from: q */
    public void mo212q(PendingIntent pendingIntent) {
        this.f86a.mo295d(pendingIntent);
    }

    public MediaSessionCompat(@NonNull Context context, @NonNull String str, @Nullable ComponentName componentName, @Nullable PendingIntent pendingIntent, @Nullable Bundle bundle) {
        this(context, str, componentName, pendingIntent, bundle, (VersionedParcelable) null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public MediaSessionCompat(@NonNull Context context, @NonNull String str, @Nullable ComponentName componentName, @Nullable PendingIntent pendingIntent, @Nullable Bundle bundle, @Nullable VersionedParcelable versionedParcelable) {
        this.f88c = new ArrayList<>();
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        } else if (!TextUtils.isEmpty(str)) {
            if (componentName == null && (componentName = MediaButtonReceiver.getMediaButtonReceiverComponent(context)) == null) {
                Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
            }
            if (componentName != null && pendingIntent == null) {
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setComponent(componentName);
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                this.f86a = new C0072g(context, str, versionedParcelable, bundle);
            } else if (i >= 28) {
                this.f86a = new C0071f(context, str, versionedParcelable, bundle);
            } else {
                this.f86a = new C0070e(context, str, versionedParcelable, bundle);
            }
            mo206k(new C0063a(), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
            this.f86a.mo300i(pendingIntent);
            this.f87b = new MediaControllerCompat(context, this);
            if (f85d == 0) {
                f85d = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
            }
        } else {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new C0059a();

        /* renamed from: b */
        private final MediaDescriptionCompat f89b;

        /* renamed from: c */
        private final long f90c;

        /* renamed from: d */
        private MediaSession.QueueItem f91d;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$a */
        class C0059a implements Parcelable.Creator<QueueItem> {
            C0059a() {
            }

            /* renamed from: a */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            /* renamed from: b */
            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        @RequiresApi(21)
        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$b */
        private static class C0060b {
            @DoNotInline
            /* renamed from: a */
            static MediaSession.QueueItem m186a(MediaDescription mediaDescription, long j) {
                return new MediaSession.QueueItem(mediaDescription, j);
            }

            @DoNotInline
            /* renamed from: b */
            static MediaDescription m187b(MediaSession.QueueItem queueItem) {
                return queueItem.getDescription();
            }

            @DoNotInline
            /* renamed from: c */
            static long m188c(MediaSession.QueueItem queueItem) {
                return queueItem.getQueueId();
            }
        }

        private QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            } else if (j != -1) {
                this.f89b = mediaDescriptionCompat;
                this.f90c = j;
                this.f91d = queueItem;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }

        /* renamed from: a */
        public static QueueItem m181a(Object obj) {
            if (obj == null) {
                return null;
            }
            MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
            return new QueueItem(queueItem, MediaDescriptionCompat.m49a(C0060b.m187b(queueItem)), C0060b.m188c(queueItem));
        }

        /* renamed from: b */
        public static List<QueueItem> m182b(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object a : list) {
                arrayList.add(m181a(a));
            }
            return arrayList;
        }

        /* renamed from: c */
        public MediaDescriptionCompat mo213c() {
            return this.f89b;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f89b + ", Id=" + this.f90c + " }";
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f89b.writeToParcel(parcel, i);
            parcel.writeLong(this.f90c);
        }

        QueueItem(Parcel parcel) {
            this.f89b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f90c = parcel.readLong();
        }
    }

    @RequiresApi(21)
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$d */
    static class C0068d implements C0067c {

        /* renamed from: a */
        final MediaSession f105a;

        /* renamed from: b */
        final Token f106b;

        /* renamed from: c */
        final Object f107c = new Object();

        /* renamed from: d */
        Bundle f108d;

        /* renamed from: e */
        boolean f109e = false;

        /* renamed from: f */
        final RemoteCallbackList<C0081a> f110f = new RemoteCallbackList<>();

        /* renamed from: g */
        PlaybackStateCompat f111g;

        /* renamed from: h */
        List<QueueItem> f112h;

        /* renamed from: i */
        MediaMetadataCompat f113i;

        /* renamed from: j */
        int f114j;

        /* renamed from: k */
        boolean f115k;

        /* renamed from: l */
        int f116l;

        /* renamed from: m */
        int f117m;
        @GuardedBy("mLock")

        /* renamed from: n */
        C0064b f118n;
        @GuardedBy("mLock")

        /* renamed from: o */
        MediaSessionManager.RemoteUserInfo f119o;

        C0068d(Context context, String str, VersionedParcelable versionedParcelable, Bundle bundle) {
            MediaSession q = mo310q(context, str, bundle);
            this.f105a = q;
            this.f106b = new Token(q.getSessionToken(), new C0069a(), versionedParcelable);
            this.f108d = bundle;
            mo311r(3);
        }

        /* renamed from: a */
        public boolean mo292a() {
            return this.f105a.isActive();
        }

        /* renamed from: b */
        public Token mo293b() {
            return this.f106b;
        }

        /* renamed from: c */
        public String mo294c() {
            try {
                return (String) this.f105a.getClass().getMethod("getCallingPackage", new Class[0]).invoke(this.f105a, new Object[0]);
            } catch (Exception e) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e);
                return null;
            }
        }

        /* renamed from: d */
        public void mo295d(PendingIntent pendingIntent) {
            this.f105a.setSessionActivity(pendingIntent);
        }

        /* renamed from: e */
        public void mo296e(C0064b bVar, Handler handler) {
            MediaSession.Callback callback;
            synchronized (this.f107c) {
                this.f118n = bVar;
                MediaSession mediaSession = this.f105a;
                if (bVar == null) {
                    callback = null;
                } else {
                    callback = bVar.f99b;
                }
                mediaSession.setCallback(callback, handler);
                if (bVar != null) {
                    bVar.mo243D(this, handler);
                }
            }
        }

        /* renamed from: f */
        public void mo297f(int i) {
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i);
            this.f105a.setPlaybackToLocal(builder.build());
        }

        /* renamed from: g */
        public C0064b mo298g() {
            C0064b bVar;
            synchronized (this.f107c) {
                bVar = this.f118n;
            }
            return bVar;
        }

        /* renamed from: h */
        public void mo299h(MediaMetadataCompat mediaMetadataCompat) {
            MediaMetadata mediaMetadata;
            this.f113i = mediaMetadataCompat;
            MediaSession mediaSession = this.f105a;
            if (mediaMetadataCompat == null) {
                mediaMetadata = null;
            } else {
                mediaMetadata = (MediaMetadata) mediaMetadataCompat.mo120f();
            }
            mediaSession.setMetadata(mediaMetadata);
        }

        /* renamed from: i */
        public void mo300i(PendingIntent pendingIntent) {
            this.f105a.setMediaButtonReceiver(pendingIntent);
        }

        /* renamed from: j */
        public Object mo301j() {
            return null;
        }

        /* renamed from: k */
        public void mo302k(boolean z) {
            this.f105a.setActive(z);
        }

        /* renamed from: l */
        public PlaybackStateCompat mo303l() {
            return this.f111g;
        }

        /* renamed from: m */
        public void mo304m(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            synchronized (this.f107c) {
                this.f119o = remoteUserInfo;
            }
        }

        /* renamed from: n */
        public void mo305n(PlaybackStateCompat playbackStateCompat) {
            PlaybackState playbackState;
            this.f111g = playbackStateCompat;
            synchronized (this.f107c) {
                for (int beginBroadcast = this.f110f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f110f.getBroadcastItem(beginBroadcast).mo193T2(playbackStateCompat);
                    } catch (RemoteException unused) {
                    }
                }
                this.f110f.finishBroadcast();
            }
            MediaSession mediaSession = this.f105a;
            if (playbackStateCompat == null) {
                playbackState = null;
            } else {
                playbackState = (PlaybackState) playbackStateCompat.mo374e();
            }
            mediaSession.setPlaybackState(playbackState);
        }

        /* renamed from: o */
        public void mo306o(VolumeProviderCompat volumeProviderCompat) {
            this.f105a.setPlaybackToRemote((VolumeProvider) volumeProviderCompat.getVolumeProvider());
        }

        /* renamed from: p */
        public MediaSessionManager.RemoteUserInfo mo307p() {
            MediaSessionManager.RemoteUserInfo remoteUserInfo;
            synchronized (this.f107c) {
                remoteUserInfo = this.f119o;
            }
            return remoteUserInfo;
        }

        /* renamed from: q */
        public MediaSession mo310q(Context context, String str, Bundle bundle) {
            return new MediaSession(context, str);
        }

        /* renamed from: r */
        public void mo311r(int i) {
            this.f105a.setFlags(i | 1 | 2);
        }

        public void release() {
            this.f109e = true;
            this.f110f.kill();
            if (Build.VERSION.SDK_INT == 27) {
                try {
                    Field declaredField = this.f105a.getClass().getDeclaredField("mCallback");
                    declaredField.setAccessible(true);
                    Handler handler = (Handler) declaredField.get(this.f105a);
                    if (handler != null) {
                        handler.removeCallbacksAndMessages((Object) null);
                    }
                } catch (Exception e) {
                    Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e);
                }
            }
            this.f105a.setCallback((MediaSession.Callback) null);
            this.f105a.release();
        }

        public void setExtras(Bundle bundle) {
            this.f105a.setExtras(bundle);
        }

        C0068d(Object obj) {
            if (obj instanceof MediaSession) {
                MediaSession mediaSession = (MediaSession) obj;
                this.f105a = mediaSession;
                this.f106b = new Token(mediaSession.getSessionToken(), new C0069a());
                this.f108d = null;
                mo311r(3);
                return;
            }
            throw new IllegalArgumentException("mediaSession is not a valid MediaSession object");
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$d$a */
        class C0069a extends C0084b.C0085a {
            C0069a() {
            }

            /* renamed from: A1 */
            public boolean mo312A1(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            /* renamed from: B2 */
            public int mo313B2() {
                return C0068d.this.f116l;
            }

            /* renamed from: C2 */
            public void mo314C2(long j) {
                throw new AssertionError();
            }

            /* renamed from: F1 */
            public void mo316F1(int i, int i2, String str) {
                throw new AssertionError();
            }

            /* renamed from: F2 */
            public ParcelableVolumeInfo mo317F2() {
                throw new AssertionError();
            }

            /* renamed from: I1 */
            public void mo318I1(RatingCompat ratingCompat, Bundle bundle) {
                throw new AssertionError();
            }

            /* renamed from: K2 */
            public void mo319K2(int i) {
                throw new AssertionError();
            }

            /* renamed from: M0 */
            public CharSequence mo320M0() {
                throw new AssertionError();
            }

            /* renamed from: M1 */
            public void mo321M1(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                throw new AssertionError();
            }

            /* renamed from: N */
            public void mo322N(String str, Bundle bundle) {
                throw new AssertionError();
            }

            /* renamed from: Q */
            public void mo323Q(C0081a aVar) {
                if (!C0068d.this.f109e) {
                    C0068d.this.f110f.register(aVar, new MediaSessionManager.RemoteUserInfo(MediaSessionManager.RemoteUserInfo.LEGACY_CONTROLLER, Binder.getCallingPid(), Binder.getCallingUid()));
                    synchronized (C0068d.this.f107c) {
                        C0068d.this.getClass();
                    }
                }
            }

            /* renamed from: Q1 */
            public void mo324Q1(boolean z) {
                throw new AssertionError();
            }

            /* renamed from: T0 */
            public void mo325T0(String str, Bundle bundle) {
                throw new AssertionError();
            }

            /* renamed from: U0 */
            public Bundle mo326U0() {
                if (C0068d.this.f108d == null) {
                    return null;
                }
                return new Bundle(C0068d.this.f108d);
            }

            /* renamed from: V */
            public boolean mo327V() {
                return false;
            }

            /* renamed from: V0 */
            public void mo328V0(C0081a aVar) {
                C0068d.this.f110f.unregister(aVar);
                Binder.getCallingPid();
                Binder.getCallingUid();
                synchronized (C0068d.this.f107c) {
                    C0068d.this.getClass();
                }
            }

            /* renamed from: W */
            public void mo329W(RatingCompat ratingCompat) {
                throw new AssertionError();
            }

            /* renamed from: Y1 */
            public int mo330Y1() {
                return C0068d.this.f117m;
            }

            /* renamed from: Z0 */
            public void mo331Z0(String str, Bundle bundle) {
                throw new AssertionError();
            }

            /* renamed from: a0 */
            public void mo332a0(int i, int i2, String str) {
                throw new AssertionError();
            }

            /* renamed from: a2 */
            public void mo333a2(int i) {
                throw new AssertionError();
            }

            /* renamed from: b1 */
            public void mo334b1(String str, Bundle bundle) {
                throw new AssertionError();
            }

            /* renamed from: d0 */
            public void mo335d0(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            /* renamed from: e2 */
            public boolean mo336e2() {
                return C0068d.this.f115k;
            }

            /* renamed from: f1 */
            public void mo337f1() {
                throw new AssertionError();
            }

            /* renamed from: g */
            public MediaMetadataCompat mo338g() {
                throw new AssertionError();
            }

            public Bundle getExtras() {
                throw new AssertionError();
            }

            public long getFlags() {
                throw new AssertionError();
            }

            public String getPackageName() {
                throw new AssertionError();
            }

            public String getTag() {
                throw new AssertionError();
            }

            /* renamed from: h1 */
            public void mo343h1(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            /* renamed from: j0 */
            public void mo344j0(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            /* renamed from: l */
            public PlaybackStateCompat mo345l() {
                C0068d dVar = C0068d.this;
                return MediaSessionCompat.m165f(dVar.f111g, dVar.f113i);
            }

            /* renamed from: l0 */
            public boolean mo346l0() {
                throw new AssertionError();
            }

            /* renamed from: l1 */
            public void mo347l1(long j) {
                throw new AssertionError();
            }

            /* renamed from: l2 */
            public void mo348l2() {
                throw new AssertionError();
            }

            /* renamed from: n0 */
            public void mo349n0(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            public void next() {
                throw new AssertionError();
            }

            /* renamed from: p0 */
            public PendingIntent mo351p0() {
                throw new AssertionError();
            }

            public void pause() {
                throw new AssertionError();
            }

            public void previous() {
                throw new AssertionError();
            }

            /* renamed from: q0 */
            public int mo354q0() {
                return C0068d.this.f114j;
            }

            /* renamed from: r2 */
            public void mo355r2(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            /* renamed from: s0 */
            public void mo356s0(String str, Bundle bundle) {
                throw new AssertionError();
            }

            /* renamed from: s2 */
            public List<QueueItem> mo357s2() {
                return null;
            }

            public void stop() {
                throw new AssertionError();
            }

            /* renamed from: u2 */
            public void mo359u2(int i) {
                throw new AssertionError();
            }

            /* renamed from: w1 */
            public void mo360w1(float f) {
                throw new AssertionError();
            }

            /* renamed from: w2 */
            public void mo361w2() {
                throw new AssertionError();
            }

            /* renamed from: y0 */
            public void mo362y0() {
                throw new AssertionError();
            }

            /* renamed from: D2 */
            public void mo315D2(boolean z) {
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$b */
    public static abstract class C0064b {

        /* renamed from: a */
        final Object f98a = new Object();

        /* renamed from: b */
        final MediaSession.Callback f99b = new C0066b();

        /* renamed from: c */
        private boolean f100c;
        @GuardedBy("mLock")

        /* renamed from: d */
        WeakReference<C0067c> f101d = new WeakReference<>((Object) null);
        @GuardedBy("mLock")

        /* renamed from: e */
        C0065a f102e;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$b$a */
        private class C0065a extends Handler {
            C0065a(Looper looper) {
                super(looper);
            }

            public void handleMessage(Message message) {
                C0067c cVar;
                C0064b bVar;
                C0065a aVar;
                if (message.what == 1) {
                    synchronized (C0064b.this.f98a) {
                        cVar = C0064b.this.f101d.get();
                        bVar = C0064b.this;
                        aVar = bVar.f102e;
                    }
                    if (cVar != null && bVar == cVar.mo298g() && aVar != null) {
                        cVar.mo304m((MediaSessionManager.RemoteUserInfo) message.obj);
                        C0064b.this.mo244a(cVar, aVar);
                        cVar.mo304m((MediaSessionManager.RemoteUserInfo) null);
                    }
                }
            }
        }

        @RequiresApi(21)
        /* renamed from: android.support.v4.media.session.MediaSessionCompat$b$b */
        private class C0066b extends MediaSession.Callback {
            C0066b() {
            }

            /* renamed from: a */
            private void m230a(C0067c cVar) {
                cVar.mo304m((MediaSessionManager.RemoteUserInfo) null);
            }

            /* renamed from: b */
            private C0068d m231b() {
                C0068d dVar;
                synchronized (C0064b.this.f98a) {
                    dVar = (C0068d) C0064b.this.f101d.get();
                }
                if (dVar == null || C0064b.this != dVar.mo298g()) {
                    return null;
                }
                return dVar;
            }

            /* renamed from: c */
            private void m232c(C0067c cVar) {
                if (Build.VERSION.SDK_INT < 28) {
                    String c = cVar.mo294c();
                    if (TextUtils.isEmpty(c)) {
                        c = MediaSessionManager.RemoteUserInfo.LEGACY_CONTROLLER;
                    }
                    cVar.mo304m(new MediaSessionManager.RemoteUserInfo(c, -1, -1));
                }
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: android.support.v4.media.session.MediaSessionCompat$QueueItem} */
            /* JADX WARNING: type inference failed for: r2v0 */
            /* JADX WARNING: type inference failed for: r2v4, types: [android.os.IBinder] */
            /* JADX WARNING: type inference failed for: r2v6 */
            /* JADX WARNING: type inference failed for: r2v7 */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onCommand(java.lang.String r6, android.os.Bundle r7, android.os.ResultReceiver r8) {
                /*
                    r5 = this;
                    android.support.v4.media.session.MediaSessionCompat$d r0 = r5.m231b()
                    if (r0 != 0) goto L_0x0007
                    return
                L_0x0007:
                    android.support.p001v4.media.session.MediaSessionCompat.m163a(r7)
                    r5.m232c(r0)
                    java.lang.String r1 = "android.support.v4.media.session.command.GET_EXTRA_BINDER"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b8 }
                    r2 = 0
                    if (r1 == 0) goto L_0x003e
                    android.os.Bundle r6 = new android.os.Bundle     // Catch:{ BadParcelableException -> 0x00b8 }
                    r6.<init>()     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.support.v4.media.session.MediaSessionCompat$Token r7 = r0.mo293b()     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.support.v4.media.session.b r1 = r7.mo227c()     // Catch:{ BadParcelableException -> 0x00b8 }
                    java.lang.String r3 = "android.support.v4.media.session.EXTRA_BINDER"
                    if (r1 != 0) goto L_0x0028
                    goto L_0x002c
                L_0x0028:
                    android.os.IBinder r2 = r1.asBinder()     // Catch:{ BadParcelableException -> 0x00b8 }
                L_0x002c:
                    androidx.core.app.BundleCompat.putBinder(r6, r3, r2)     // Catch:{ BadParcelableException -> 0x00b8 }
                    java.lang.String r1 = "android.support.v4.media.session.SESSION_TOKEN2"
                    androidx.versionedparcelable.VersionedParcelable r7 = r7.mo228d()     // Catch:{ BadParcelableException -> 0x00b8 }
                    androidx.versionedparcelable.ParcelUtils.putVersionedParcelable(r6, r1, r7)     // Catch:{ BadParcelableException -> 0x00b8 }
                    r7 = 0
                    r8.send(r7, r6)     // Catch:{ BadParcelableException -> 0x00b8 }
                    goto L_0x00bf
                L_0x003e:
                    java.lang.String r1 = "android.support.v4.media.session.command.ADD_QUEUE_ITEM"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b8 }
                    java.lang.String r3 = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"
                    if (r1 == 0) goto L_0x0054
                    android.support.v4.media.session.MediaSessionCompat$b r6 = android.support.p001v4.media.session.MediaSessionCompat.C0064b.this     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.os.Parcelable r7 = r7.getParcelable(r3)     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.support.v4.media.MediaDescriptionCompat r7 = (android.support.p001v4.media.MediaDescriptionCompat) r7     // Catch:{ BadParcelableException -> 0x00b8 }
                    r6.mo245b(r7)     // Catch:{ BadParcelableException -> 0x00b8 }
                    goto L_0x00bf
                L_0x0054:
                    java.lang.String r1 = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b8 }
                    java.lang.String r4 = "android.support.v4.media.session.command.ARGUMENT_INDEX"
                    if (r1 == 0) goto L_0x006e
                    android.support.v4.media.session.MediaSessionCompat$b r6 = android.support.p001v4.media.session.MediaSessionCompat.C0064b.this     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.os.Parcelable r8 = r7.getParcelable(r3)     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.support.v4.media.MediaDescriptionCompat r8 = (android.support.p001v4.media.MediaDescriptionCompat) r8     // Catch:{ BadParcelableException -> 0x00b8 }
                    int r7 = r7.getInt(r4)     // Catch:{ BadParcelableException -> 0x00b8 }
                    r6.mo246c(r8, r7)     // Catch:{ BadParcelableException -> 0x00b8 }
                    goto L_0x00bf
                L_0x006e:
                    java.lang.String r1 = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b8 }
                    if (r1 == 0) goto L_0x0082
                    android.support.v4.media.session.MediaSessionCompat$b r6 = android.support.p001v4.media.session.MediaSessionCompat.C0064b.this     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.os.Parcelable r7 = r7.getParcelable(r3)     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.support.v4.media.MediaDescriptionCompat r7 = (android.support.p001v4.media.MediaDescriptionCompat) r7     // Catch:{ BadParcelableException -> 0x00b8 }
                    r6.mo260q(r7)     // Catch:{ BadParcelableException -> 0x00b8 }
                    goto L_0x00bf
                L_0x0082:
                    java.lang.String r1 = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b8 }
                    if (r1 == 0) goto L_0x00b2
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r6 = r0.f112h     // Catch:{ BadParcelableException -> 0x00b8 }
                    if (r6 == 0) goto L_0x00bf
                    r6 = -1
                    int r6 = r7.getInt(r4, r6)     // Catch:{ BadParcelableException -> 0x00b8 }
                    if (r6 < 0) goto L_0x00a6
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r7 = r0.f112h     // Catch:{ BadParcelableException -> 0x00b8 }
                    int r7 = r7.size()     // Catch:{ BadParcelableException -> 0x00b8 }
                    if (r6 >= r7) goto L_0x00a6
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r7 = r0.f112h     // Catch:{ BadParcelableException -> 0x00b8 }
                    java.lang.Object r6 = r7.get(r6)     // Catch:{ BadParcelableException -> 0x00b8 }
                    r2 = r6
                    android.support.v4.media.session.MediaSessionCompat$QueueItem r2 = (android.support.p001v4.media.session.MediaSessionCompat.QueueItem) r2     // Catch:{ BadParcelableException -> 0x00b8 }
                L_0x00a6:
                    if (r2 == 0) goto L_0x00bf
                    android.support.v4.media.session.MediaSessionCompat$b r6 = android.support.p001v4.media.session.MediaSessionCompat.C0064b.this     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.support.v4.media.MediaDescriptionCompat r7 = r2.mo213c()     // Catch:{ BadParcelableException -> 0x00b8 }
                    r6.mo260q(r7)     // Catch:{ BadParcelableException -> 0x00b8 }
                    goto L_0x00bf
                L_0x00b2:
                    android.support.v4.media.session.MediaSessionCompat$b r1 = android.support.p001v4.media.session.MediaSessionCompat.C0064b.this     // Catch:{ BadParcelableException -> 0x00b8 }
                    r1.mo247d(r6, r7, r8)     // Catch:{ BadParcelableException -> 0x00b8 }
                    goto L_0x00bf
                L_0x00b8:
                    java.lang.String r6 = "MediaSessionCompat"
                    java.lang.String r7 = "Could not unparcel the extra data."
                    android.util.Log.e(r6, r7)
                L_0x00bf:
                    r5.m230a(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.p001v4.media.session.MediaSessionCompat.C0064b.C0066b.onCommand(java.lang.String, android.os.Bundle, android.os.ResultReceiver):void");
            }

            public void onCustomAction(String str, Bundle bundle) {
                C0068d b = m231b();
                if (b != null) {
                    MediaSessionCompat.m163a(bundle);
                    m232c(b);
                    try {
                        if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                            Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.m163a(bundle2);
                            C0064b.this.mo255l((Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), bundle2);
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                            C0064b.this.mo256m();
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                            String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                            Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.m163a(bundle3);
                            C0064b.this.mo257n(string, bundle3);
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                            String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                            Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.m163a(bundle4);
                            C0064b.this.mo258o(string2, bundle4);
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                            Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.m163a(bundle5);
                            C0064b.this.mo259p((Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), bundle5);
                        } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                            C0064b.this.mo263t(bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"));
                        } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                            C0064b.this.mo267x(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                        } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                            C0064b.this.mo268y(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                        } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                            Bundle bundle6 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.m163a(bundle6);
                            C0064b.this.mo266w((RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING"), bundle6);
                        } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                            C0064b.this.mo264u(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                        } else {
                            C0064b.this.mo248e(str, bundle);
                        }
                    } catch (BadParcelableException unused) {
                        Log.e("MediaSessionCompat", "Could not unparcel the data.");
                    }
                    m230a(b);
                }
            }

            public void onFastForward() {
                C0068d b = m231b();
                if (b != null) {
                    m232c(b);
                    C0064b.this.mo249f();
                    m230a(b);
                }
            }

            public boolean onMediaButtonEvent(Intent intent) {
                C0068d b = m231b();
                if (b == null) {
                    return false;
                }
                m232c(b);
                boolean g = C0064b.this.mo250g(intent);
                m230a(b);
                if (g || super.onMediaButtonEvent(intent)) {
                    return true;
                }
                return false;
            }

            public void onPause() {
                C0068d b = m231b();
                if (b != null) {
                    m232c(b);
                    C0064b.this.mo251h();
                    m230a(b);
                }
            }

            public void onPlay() {
                C0068d b = m231b();
                if (b != null) {
                    m232c(b);
                    C0064b.this.mo252i();
                    m230a(b);
                }
            }

            public void onPlayFromMediaId(String str, Bundle bundle) {
                C0068d b = m231b();
                if (b != null) {
                    MediaSessionCompat.m163a(bundle);
                    m232c(b);
                    C0064b.this.mo253j(str, bundle);
                    m230a(b);
                }
            }

            public void onPlayFromSearch(String str, Bundle bundle) {
                C0068d b = m231b();
                if (b != null) {
                    MediaSessionCompat.m163a(bundle);
                    m232c(b);
                    C0064b.this.mo254k(str, bundle);
                    m230a(b);
                }
            }

            @RequiresApi(23)
            public void onPlayFromUri(Uri uri, Bundle bundle) {
                C0068d b = m231b();
                if (b != null) {
                    MediaSessionCompat.m163a(bundle);
                    m232c(b);
                    C0064b.this.mo255l(uri, bundle);
                    m230a(b);
                }
            }

            @RequiresApi(24)
            public void onPrepare() {
                C0068d b = m231b();
                if (b != null) {
                    m232c(b);
                    C0064b.this.mo256m();
                    m230a(b);
                }
            }

            @RequiresApi(24)
            public void onPrepareFromMediaId(String str, Bundle bundle) {
                C0068d b = m231b();
                if (b != null) {
                    MediaSessionCompat.m163a(bundle);
                    m232c(b);
                    C0064b.this.mo257n(str, bundle);
                    m230a(b);
                }
            }

            @RequiresApi(24)
            public void onPrepareFromSearch(String str, Bundle bundle) {
                C0068d b = m231b();
                if (b != null) {
                    MediaSessionCompat.m163a(bundle);
                    m232c(b);
                    C0064b.this.mo258o(str, bundle);
                    m230a(b);
                }
            }

            @RequiresApi(24)
            public void onPrepareFromUri(Uri uri, Bundle bundle) {
                C0068d b = m231b();
                if (b != null) {
                    MediaSessionCompat.m163a(bundle);
                    m232c(b);
                    C0064b.this.mo259p(uri, bundle);
                    m230a(b);
                }
            }

            public void onRewind() {
                C0068d b = m231b();
                if (b != null) {
                    m232c(b);
                    C0064b.this.mo261r();
                    m230a(b);
                }
            }

            public void onSeekTo(long j) {
                C0068d b = m231b();
                if (b != null) {
                    m232c(b);
                    C0064b.this.mo262s(j);
                    m230a(b);
                }
            }

            @RequiresApi(29)
            public void onSetPlaybackSpeed(float f) {
                C0068d b = m231b();
                if (b != null) {
                    m232c(b);
                    C0064b.this.mo264u(f);
                    m230a(b);
                }
            }

            public void onSetRating(Rating rating) {
                C0068d b = m231b();
                if (b != null) {
                    m232c(b);
                    C0064b.this.mo265v(RatingCompat.m99a(rating));
                    m230a(b);
                }
            }

            public void onSkipToNext() {
                C0068d b = m231b();
                if (b != null) {
                    m232c(b);
                    C0064b.this.mo269z();
                    m230a(b);
                }
            }

            public void onSkipToPrevious() {
                C0068d b = m231b();
                if (b != null) {
                    m232c(b);
                    C0064b.this.mo240A();
                    m230a(b);
                }
            }

            public void onSkipToQueueItem(long j) {
                C0068d b = m231b();
                if (b != null) {
                    m232c(b);
                    C0064b.this.mo241B(j);
                    m230a(b);
                }
            }

            public void onStop() {
                C0068d b = m231b();
                if (b != null) {
                    m232c(b);
                    C0064b.this.mo242C();
                    m230a(b);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: D */
        public void mo243D(C0067c cVar, Handler handler) {
            synchronized (this.f98a) {
                this.f101d = new WeakReference<>(cVar);
                C0065a aVar = this.f102e;
                C0065a aVar2 = null;
                if (aVar != null) {
                    aVar.removeCallbacksAndMessages((Object) null);
                }
                if (cVar != null) {
                    if (handler != null) {
                        aVar2 = new C0065a(handler.getLooper());
                    }
                }
                this.f102e = aVar2;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo244a(C0067c cVar, Handler handler) {
            long j;
            boolean z;
            boolean z2;
            if (this.f100c) {
                boolean z3 = false;
                this.f100c = false;
                handler.removeMessages(1);
                PlaybackStateCompat l = cVar.mo303l();
                if (l == null) {
                    j = 0;
                } else {
                    j = l.mo370b();
                }
                if (l == null || l.mo376g() != 3) {
                    z = false;
                } else {
                    z = true;
                }
                if ((516 & j) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((j & 514) != 0) {
                    z3 = true;
                }
                if (z && z3) {
                    mo251h();
                } else if (!z && z2) {
                    mo252i();
                }
            }
        }

        /* renamed from: g */
        public boolean mo250g(Intent intent) {
            C0067c cVar;
            C0065a aVar;
            KeyEvent keyEvent;
            long j;
            if (Build.VERSION.SDK_INT >= 27) {
                return false;
            }
            synchronized (this.f98a) {
                cVar = this.f101d.get();
                aVar = this.f102e;
            }
            if (cVar == null || aVar == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            MediaSessionManager.RemoteUserInfo p = cVar.mo307p();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 79 || keyCode == 85) {
                if (keyEvent.getRepeatCount() != 0) {
                    mo244a(cVar, aVar);
                } else if (this.f100c) {
                    aVar.removeMessages(1);
                    this.f100c = false;
                    PlaybackStateCompat l = cVar.mo303l();
                    if (l == null) {
                        j = 0;
                    } else {
                        j = l.mo370b();
                    }
                    if ((j & 32) != 0) {
                        mo269z();
                    }
                } else {
                    this.f100c = true;
                    aVar.sendMessageDelayed(aVar.obtainMessage(1, p), (long) ViewConfiguration.getDoubleTapTimeout());
                }
                return true;
            }
            mo244a(cVar, aVar);
            return false;
        }

        /* renamed from: A */
        public void mo240A() {
        }

        /* renamed from: C */
        public void mo242C() {
        }

        /* renamed from: f */
        public void mo249f() {
        }

        /* renamed from: h */
        public void mo251h() {
        }

        /* renamed from: i */
        public void mo252i() {
        }

        /* renamed from: m */
        public void mo256m() {
        }

        /* renamed from: r */
        public void mo261r() {
        }

        /* renamed from: z */
        public void mo269z() {
        }

        /* renamed from: B */
        public void mo241B(long j) {
        }

        /* renamed from: b */
        public void mo245b(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        /* renamed from: q */
        public void mo260q(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        /* renamed from: s */
        public void mo262s(long j) {
        }

        /* renamed from: t */
        public void mo263t(boolean z) {
        }

        /* renamed from: u */
        public void mo264u(float f) {
        }

        /* renamed from: v */
        public void mo265v(RatingCompat ratingCompat) {
        }

        /* renamed from: x */
        public void mo267x(int i) {
        }

        /* renamed from: y */
        public void mo268y(int i) {
        }

        /* renamed from: c */
        public void mo246c(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        }

        /* renamed from: e */
        public void mo248e(String str, Bundle bundle) {
        }

        /* renamed from: j */
        public void mo253j(String str, Bundle bundle) {
        }

        /* renamed from: k */
        public void mo254k(String str, Bundle bundle) {
        }

        /* renamed from: l */
        public void mo255l(Uri uri, Bundle bundle) {
        }

        /* renamed from: n */
        public void mo257n(String str, Bundle bundle) {
        }

        /* renamed from: o */
        public void mo258o(String str, Bundle bundle) {
        }

        /* renamed from: p */
        public void mo259p(Uri uri, Bundle bundle) {
        }

        /* renamed from: w */
        public void mo266w(RatingCompat ratingCompat, Bundle bundle) {
        }

        /* renamed from: d */
        public void mo247d(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }
    }

    private MediaSessionCompat(Context context, C0067c cVar) {
        this.f88c = new ArrayList<>();
        this.f86a = cVar;
        this.f87b = new MediaControllerCompat(context, this);
    }
}
