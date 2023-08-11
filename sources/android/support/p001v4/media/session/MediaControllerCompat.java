package android.support.p001v4.media.session;

import android.app.PendingIntent;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.p001v4.media.MediaMetadataCompat;
import android.support.p001v4.media.session.C0081a;
import android.support.p001v4.media.session.C0084b;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.util.Log;
import android.view.KeyEvent;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.app.BundleCompat;
import androidx.media.AudioAttributesCompat;
import androidx.versionedparcelable.ParcelUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: android.support.v4.media.session.MediaControllerCompat */
public final class MediaControllerCompat {

    /* renamed from: a */
    private final C0051b f66a;

    /* renamed from: b */
    private final MediaSessionCompat.Token f67b;

    /* renamed from: c */
    private final ConcurrentHashMap<C0047a, Boolean> f68c = new ConcurrentHashMap<>();

    @RequiresApi(21)
    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 */
    static class MediaControllerImplApi21 implements C0051b {

        /* renamed from: a */
        protected final MediaController f69a;

        /* renamed from: b */
        final Object f70b = new Object();
        @GuardedBy("mLock")

        /* renamed from: c */
        private final List<C0047a> f71c = new ArrayList();

        /* renamed from: d */
        private HashMap<C0047a, C0046a> f72d = new HashMap<>();

        /* renamed from: e */
        final MediaSessionCompat.Token f73e;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: b */
            private WeakReference<MediaControllerImplApi21> f74b;

            ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super((Handler) null);
                this.f74b = new WeakReference<>(mediaControllerImplApi21);
            }

            /* access modifiers changed from: protected */
            public void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = this.f74b.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    synchronized (mediaControllerImplApi21.f70b) {
                        mediaControllerImplApi21.f73e.mo232f(C0084b.C0085a.m424E(BundleCompat.getBinder(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                        mediaControllerImplApi21.f73e.mo233g(ParcelUtils.getVersionedParcelable(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                        mediaControllerImplApi21.mo153f();
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
        private static class C0046a extends C0047a.C0050c {
            C0046a(C0047a aVar) {
                super(aVar);
            }

            /* renamed from: B0 */
            public void mo158B0(Bundle bundle) {
                throw new AssertionError();
            }

            /* renamed from: C1 */
            public void mo159C1(CharSequence charSequence) {
                throw new AssertionError();
            }

            /* renamed from: G0 */
            public void mo160G0(List<MediaSessionCompat.QueueItem> list) {
                throw new AssertionError();
            }

            /* renamed from: L1 */
            public void mo161L1() {
                throw new AssertionError();
            }

            /* renamed from: O1 */
            public void mo162O1(MediaMetadataCompat mediaMetadataCompat) {
                throw new AssertionError();
            }

            /* renamed from: a3 */
            public void mo163a3(ParcelableVolumeInfo parcelableVolumeInfo) {
                throw new AssertionError();
            }
        }

        MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.f73e = token;
            this.f69a = new MediaController(context, (MediaSession.Token) token.mo230e());
            if (token.mo227c() == null) {
                m127h();
            }
        }

        /* renamed from: h */
        private void m127h() {
            mo155i("android.support.v4.media.session.command.GET_EXTRA_BINDER", (Bundle) null, new ExtraBinderRequestResultReceiver(this));
        }

        /* renamed from: a */
        public final void mo148a(C0047a aVar) {
            this.f69a.unregisterCallback(aVar.mCallbackFwk);
            synchronized (this.f70b) {
                if (this.f73e.mo227c() != null) {
                    try {
                        C0046a remove = this.f72d.remove(aVar);
                        if (remove != null) {
                            aVar.mIControllerCallback = null;
                            this.f73e.mo227c().mo328V0(remove);
                        }
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e);
                    }
                } else {
                    this.f71c.remove(aVar);
                }
            }
        }

        /* renamed from: b */
        public boolean mo149b(KeyEvent keyEvent) {
            return this.f69a.dispatchMediaButtonEvent(keyEvent);
        }

        /* renamed from: c */
        public PendingIntent mo150c() {
            return this.f69a.getSessionActivity();
        }

        /* renamed from: d */
        public C0054e mo151d() {
            MediaController.TransportControls transportControls = this.f69a.getTransportControls();
            if (Build.VERSION.SDK_INT >= 29) {
                return new C0058i(transportControls);
            }
            return new C0057h(transportControls);
        }

        /* renamed from: e */
        public final void mo152e(C0047a aVar, Handler handler) {
            this.f69a.registerCallback(aVar.mCallbackFwk, handler);
            synchronized (this.f70b) {
                if (this.f73e.mo227c() != null) {
                    C0046a aVar2 = new C0046a(aVar);
                    this.f72d.put(aVar, aVar2);
                    aVar.mIControllerCallback = aVar2;
                    try {
                        this.f73e.mo227c().mo323Q(aVar2);
                        aVar.postToHandler(13, (Object) null, (Bundle) null);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                    }
                } else {
                    aVar.mIControllerCallback = null;
                    this.f71c.add(aVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        @GuardedBy("mLock")
        /* renamed from: f */
        public void mo153f() {
            if (this.f73e.mo227c() != null) {
                for (C0047a next : this.f71c) {
                    C0046a aVar = new C0046a(next);
                    this.f72d.put(next, aVar);
                    next.mIControllerCallback = aVar;
                    try {
                        this.f73e.mo227c().mo323Q(aVar);
                        next.postToHandler(13, (Object) null, (Bundle) null);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                    }
                }
                this.f71c.clear();
            }
        }

        /* renamed from: g */
        public MediaMetadataCompat mo154g() {
            MediaMetadata metadata = this.f69a.getMetadata();
            if (metadata != null) {
                return MediaMetadataCompat.m85b(metadata);
            }
            return null;
        }

        /* renamed from: i */
        public void mo155i(String str, Bundle bundle, ResultReceiver resultReceiver) {
            this.f69a.sendCommand(str, bundle, resultReceiver);
        }

        /* renamed from: l */
        public PlaybackStateCompat mo156l() {
            if (this.f73e.mo227c() != null) {
                try {
                    return this.f73e.mo227c().mo345l();
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e);
                }
            }
            PlaybackState playbackState = this.f69a.getPlaybackState();
            if (playbackState != null) {
                return PlaybackStateCompat.m315a(playbackState);
            }
            return null;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$b */
    interface C0051b {
        /* renamed from: a */
        void mo148a(C0047a aVar);

        /* renamed from: b */
        boolean mo149b(KeyEvent keyEvent);

        /* renamed from: c */
        PendingIntent mo150c();

        /* renamed from: d */
        C0054e mo151d();

        /* renamed from: e */
        void mo152e(C0047a aVar, Handler handler);

        /* renamed from: g */
        MediaMetadataCompat mo154g();

        /* renamed from: l */
        PlaybackStateCompat mo156l();
    }

    @RequiresApi(29)
    /* renamed from: android.support.v4.media.session.MediaControllerCompat$c */
    static class C0052c extends MediaControllerImplApi21 {
        C0052c(Context context, MediaSessionCompat.Token token) {
            super(context, token);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$d */
    public static final class C0053d {

        /* renamed from: a */
        private final int f79a;

        /* renamed from: b */
        private final AudioAttributesCompat f80b;

        /* renamed from: c */
        private final int f81c;

        /* renamed from: d */
        private final int f82d;

        /* renamed from: e */
        private final int f83e;

        C0053d(int i, @NonNull AudioAttributesCompat audioAttributesCompat, int i2, int i3, int i4) {
            this.f79a = i;
            this.f80b = audioAttributesCompat;
            this.f81c = i2;
            this.f82d = i3;
            this.f83e = i4;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$e */
    public static abstract class C0054e {
        C0054e() {
        }

        /* renamed from: a */
        public abstract void mo196a();

        /* renamed from: b */
        public abstract void mo197b();

        /* renamed from: c */
        public abstract void mo198c();
    }

    @RequiresApi(21)
    /* renamed from: android.support.v4.media.session.MediaControllerCompat$f */
    static class C0055f extends C0054e {

        /* renamed from: a */
        protected final MediaController.TransportControls f84a;

        C0055f(MediaController.TransportControls transportControls) {
            this.f84a = transportControls;
        }

        /* renamed from: a */
        public void mo196a() {
            this.f84a.pause();
        }

        /* renamed from: b */
        public void mo197b() {
            this.f84a.play();
        }

        /* renamed from: c */
        public void mo198c() {
            this.f84a.stop();
        }
    }

    @RequiresApi(23)
    /* renamed from: android.support.v4.media.session.MediaControllerCompat$g */
    static class C0056g extends C0055f {
        C0056g(MediaController.TransportControls transportControls) {
            super(transportControls);
        }
    }

    @RequiresApi(24)
    /* renamed from: android.support.v4.media.session.MediaControllerCompat$h */
    static class C0057h extends C0056g {
        C0057h(MediaController.TransportControls transportControls) {
            super(transportControls);
        }
    }

    @RequiresApi(29)
    /* renamed from: android.support.v4.media.session.MediaControllerCompat$i */
    static class C0058i extends C0057h {
        C0058i(MediaController.TransportControls transportControls) {
            super(transportControls);
        }
    }

    public MediaControllerCompat(Context context, @NonNull MediaSessionCompat mediaSessionCompat) {
        if (mediaSessionCompat != null) {
            MediaSessionCompat.Token e = mediaSessionCompat.mo201e();
            this.f67b = e;
            if (Build.VERSION.SDK_INT >= 29) {
                this.f66a = new C0052c(context, e);
            } else {
                this.f66a = new MediaControllerImplApi21(context, e);
            }
        } else {
            throw new IllegalArgumentException("session must not be null");
        }
    }

    /* renamed from: a */
    public boolean mo139a(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.f66a.mo149b(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    /* renamed from: b */
    public MediaMetadataCompat mo140b() {
        return this.f66a.mo154g();
    }

    /* renamed from: c */
    public PlaybackStateCompat mo141c() {
        return this.f66a.mo156l();
    }

    /* renamed from: d */
    public PendingIntent mo142d() {
        return this.f66a.mo150c();
    }

    /* renamed from: e */
    public MediaSessionCompat.Token mo143e() {
        return this.f67b;
    }

    /* renamed from: f */
    public C0054e mo144f() {
        return this.f66a.mo151d();
    }

    /* renamed from: g */
    public void mo145g(@NonNull C0047a aVar) {
        mo146h(aVar, (Handler) null);
    }

    /* renamed from: h */
    public void mo146h(@NonNull C0047a aVar, Handler handler) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        } else if (this.f68c.putIfAbsent(aVar, Boolean.TRUE) != null) {
            Log.w("MediaControllerCompat", "the callback has already been registered");
        } else {
            if (handler == null) {
                handler = new Handler();
            }
            aVar.setHandler(handler);
            this.f66a.mo152e(aVar, handler);
        }
    }

    /* renamed from: i */
    public void mo147i(@NonNull C0047a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        } else if (this.f68c.remove(aVar) == null) {
            Log.w("MediaControllerCompat", "the callback has never been registered");
        } else {
            try {
                this.f66a.mo148a(aVar);
            } finally {
                aVar.setHandler((Handler) null);
            }
        }
    }

    public MediaControllerCompat(Context context, @NonNull MediaSessionCompat.Token token) {
        if (token != null) {
            this.f67b = token;
            this.f66a = new MediaControllerImplApi21(context, token);
            return;
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$a */
    public static abstract class C0047a implements IBinder.DeathRecipient {
        final MediaController.Callback mCallbackFwk = new C0048a(this);
        C0049b mHandler;
        C0081a mIControllerCallback;

        @RequiresApi(21)
        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a */
        private static class C0048a extends MediaController.Callback {

            /* renamed from: a */
            private final WeakReference<C0047a> f75a;

            C0048a(C0047a aVar) {
                this.f75a = new WeakReference<>(aVar);
            }

            public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
                C0047a aVar = this.f75a.get();
                if (aVar != null) {
                    aVar.onAudioInfoChanged(new C0053d(playbackInfo.getPlaybackType(), AudioAttributesCompat.wrap(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
                }
            }

            public void onExtrasChanged(Bundle bundle) {
                MediaSessionCompat.m163a(bundle);
                C0047a aVar = this.f75a.get();
                if (aVar != null) {
                    aVar.onExtrasChanged(bundle);
                }
            }

            public void onMetadataChanged(MediaMetadata mediaMetadata) {
                C0047a aVar = this.f75a.get();
                if (aVar != null) {
                    aVar.onMetadataChanged(MediaMetadataCompat.m85b(mediaMetadata));
                }
            }

            public void onPlaybackStateChanged(PlaybackState playbackState) {
                C0047a aVar = this.f75a.get();
                if (aVar != null && aVar.mIControllerCallback == null) {
                    aVar.onPlaybackStateChanged(PlaybackStateCompat.m315a(playbackState));
                }
            }

            public void onQueueChanged(List<MediaSession.QueueItem> list) {
                C0047a aVar = this.f75a.get();
                if (aVar != null) {
                    aVar.onQueueChanged(MediaSessionCompat.QueueItem.m182b(list));
                }
            }

            public void onQueueTitleChanged(CharSequence charSequence) {
                C0047a aVar = this.f75a.get();
                if (aVar != null) {
                    aVar.onQueueTitleChanged(charSequence);
                }
            }

            public void onSessionDestroyed() {
                C0047a aVar = this.f75a.get();
                if (aVar != null) {
                    aVar.onSessionDestroyed();
                }
            }

            public void onSessionEvent(String str, Bundle bundle) {
                MediaSessionCompat.m163a(bundle);
                C0047a aVar = this.f75a.get();
                if (aVar != null) {
                    C0081a aVar2 = aVar.mIControllerCallback;
                    aVar.onSessionEvent(str, bundle);
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$b */
        private class C0049b extends Handler {

            /* renamed from: a */
            boolean f76a = false;

            C0049b(Looper looper) {
                super(looper);
            }

            public void handleMessage(Message message) {
                if (this.f76a) {
                    switch (message.what) {
                        case 1:
                            Bundle data = message.getData();
                            MediaSessionCompat.m163a(data);
                            C0047a.this.onSessionEvent((String) message.obj, data);
                            return;
                        case 2:
                            C0047a.this.onPlaybackStateChanged((PlaybackStateCompat) message.obj);
                            return;
                        case 3:
                            C0047a.this.onMetadataChanged((MediaMetadataCompat) message.obj);
                            return;
                        case 4:
                            C0047a.this.onAudioInfoChanged((C0053d) message.obj);
                            return;
                        case 5:
                            C0047a.this.onQueueChanged((List) message.obj);
                            return;
                        case 6:
                            C0047a.this.onQueueTitleChanged((CharSequence) message.obj);
                            return;
                        case 7:
                            Bundle bundle = (Bundle) message.obj;
                            MediaSessionCompat.m163a(bundle);
                            C0047a.this.onExtrasChanged(bundle);
                            return;
                        case 8:
                            C0047a.this.onSessionDestroyed();
                            return;
                        case 9:
                            C0047a.this.onRepeatModeChanged(((Integer) message.obj).intValue());
                            return;
                        case 11:
                            C0047a.this.onCaptioningEnabledChanged(((Boolean) message.obj).booleanValue());
                            return;
                        case 12:
                            C0047a.this.onShuffleModeChanged(((Integer) message.obj).intValue());
                            return;
                        case 13:
                            C0047a.this.onSessionReady();
                            return;
                        default:
                            return;
                    }
                }
            }
        }

        public void binderDied() {
            postToHandler(8, (Object) null, (Bundle) null);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public C0081a getIControllerCallback() {
            return this.mIControllerCallback;
        }

        /* access modifiers changed from: package-private */
        public void postToHandler(int i, Object obj, Bundle bundle) {
            C0049b bVar = this.mHandler;
            if (bVar != null) {
                Message obtainMessage = bVar.obtainMessage(i, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }

        /* access modifiers changed from: package-private */
        public void setHandler(Handler handler) {
            if (handler == null) {
                C0049b bVar = this.mHandler;
                if (bVar != null) {
                    bVar.f76a = false;
                    bVar.removeCallbacksAndMessages((Object) null);
                    this.mHandler = null;
                    return;
                }
                return;
            }
            C0049b bVar2 = new C0049b(handler.getLooper());
            this.mHandler = bVar2;
            bVar2.f76a = true;
        }

        public void onSessionDestroyed() {
        }

        public void onSessionReady() {
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$c */
        private static class C0050c extends C0081a.C0082a {

            /* renamed from: a */
            private final WeakReference<C0047a> f78a;

            C0050c(C0047a aVar) {
                this.f78a = new WeakReference<>(aVar);
            }

            /* renamed from: A0 */
            public void mo189A0() {
                C0047a aVar = this.f78a.get();
                if (aVar != null) {
                    aVar.postToHandler(13, (Object) null, (Bundle) null);
                }
            }

            /* renamed from: I */
            public void mo191I(String str, Bundle bundle) {
                C0047a aVar = this.f78a.get();
                if (aVar != null) {
                    aVar.postToHandler(1, str, bundle);
                }
            }

            /* renamed from: T1 */
            public void mo192T1(int i) {
                C0047a aVar = this.f78a.get();
                if (aVar != null) {
                    aVar.postToHandler(9, Integer.valueOf(i), (Bundle) null);
                }
            }

            /* renamed from: T2 */
            public void mo193T2(PlaybackStateCompat playbackStateCompat) {
                C0047a aVar = this.f78a.get();
                if (aVar != null) {
                    aVar.postToHandler(2, playbackStateCompat, (Bundle) null);
                }
            }

            /* renamed from: g2 */
            public void mo194g2(int i) {
                C0047a aVar = this.f78a.get();
                if (aVar != null) {
                    aVar.postToHandler(12, Integer.valueOf(i), (Bundle) null);
                }
            }

            /* renamed from: n1 */
            public void mo195n1(boolean z) {
                C0047a aVar = this.f78a.get();
                if (aVar != null) {
                    aVar.postToHandler(11, Boolean.valueOf(z), (Bundle) null);
                }
            }

            /* renamed from: B1 */
            public void mo190B1(boolean z) {
            }
        }

        public void onAudioInfoChanged(C0053d dVar) {
        }

        public void onCaptioningEnabledChanged(boolean z) {
        }

        public void onExtrasChanged(Bundle bundle) {
        }

        public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
        }

        public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
        }

        public void onQueueChanged(List<MediaSessionCompat.QueueItem> list) {
        }

        public void onQueueTitleChanged(CharSequence charSequence) {
        }

        public void onRepeatModeChanged(int i) {
        }

        public void onShuffleModeChanged(int i) {
        }

        public void onSessionEvent(String str, Bundle bundle) {
        }
    }
}
