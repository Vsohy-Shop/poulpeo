package android.support.p001v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.p001v4.media.MediaDescriptionCompat;
import android.support.p001v4.media.MediaMetadataCompat;
import android.support.p001v4.media.RatingCompat;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;
import java.util.List;

/* renamed from: android.support.v4.media.session.b */
/* compiled from: IMediaSession */
public interface C0084b extends IInterface {
    /* renamed from: A1 */
    boolean mo312A1(KeyEvent keyEvent);

    /* renamed from: B2 */
    int mo313B2();

    /* renamed from: C2 */
    void mo314C2(long j);

    /* renamed from: D2 */
    void mo315D2(boolean z);

    /* renamed from: F1 */
    void mo316F1(int i, int i2, String str);

    /* renamed from: F2 */
    ParcelableVolumeInfo mo317F2();

    /* renamed from: I1 */
    void mo318I1(RatingCompat ratingCompat, Bundle bundle);

    /* renamed from: K2 */
    void mo319K2(int i);

    /* renamed from: M0 */
    CharSequence mo320M0();

    /* renamed from: M1 */
    void mo321M1(MediaDescriptionCompat mediaDescriptionCompat, int i);

    /* renamed from: N */
    void mo322N(String str, Bundle bundle);

    /* renamed from: Q */
    void mo323Q(C0081a aVar);

    /* renamed from: Q1 */
    void mo324Q1(boolean z);

    /* renamed from: T0 */
    void mo325T0(String str, Bundle bundle);

    /* renamed from: U0 */
    Bundle mo326U0();

    /* renamed from: V */
    boolean mo327V();

    /* renamed from: V0 */
    void mo328V0(C0081a aVar);

    /* renamed from: W */
    void mo329W(RatingCompat ratingCompat);

    /* renamed from: Y1 */
    int mo330Y1();

    /* renamed from: Z0 */
    void mo331Z0(String str, Bundle bundle);

    /* renamed from: a0 */
    void mo332a0(int i, int i2, String str);

    /* renamed from: a2 */
    void mo333a2(int i);

    /* renamed from: b1 */
    void mo334b1(String str, Bundle bundle);

    /* renamed from: d0 */
    void mo335d0(Uri uri, Bundle bundle);

    /* renamed from: e2 */
    boolean mo336e2();

    /* renamed from: f1 */
    void mo337f1();

    /* renamed from: g */
    MediaMetadataCompat mo338g();

    Bundle getExtras();

    long getFlags();

    String getPackageName();

    String getTag();

    /* renamed from: h1 */
    void mo343h1(Uri uri, Bundle bundle);

    /* renamed from: j0 */
    void mo344j0(MediaDescriptionCompat mediaDescriptionCompat);

    /* renamed from: l */
    PlaybackStateCompat mo345l();

    /* renamed from: l0 */
    boolean mo346l0();

    /* renamed from: l1 */
    void mo347l1(long j);

    /* renamed from: l2 */
    void mo348l2();

    /* renamed from: n0 */
    void mo349n0(MediaDescriptionCompat mediaDescriptionCompat);

    void next();

    /* renamed from: p0 */
    PendingIntent mo351p0();

    void pause();

    void previous();

    /* renamed from: q0 */
    int mo354q0();

    /* renamed from: r2 */
    void mo355r2(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper);

    /* renamed from: s0 */
    void mo356s0(String str, Bundle bundle);

    /* renamed from: s2 */
    List<MediaSessionCompat.QueueItem> mo357s2();

    void stop();

    /* renamed from: u2 */
    void mo359u2(int i);

    /* renamed from: w1 */
    void mo360w1(float f);

    /* renamed from: w2 */
    void mo361w2();

    /* renamed from: y0 */
    void mo362y0();

    /* renamed from: android.support.v4.media.session.b$a */
    /* compiled from: IMediaSession */
    public static abstract class C0085a extends Binder implements C0084b {

        /* renamed from: android.support.v4.media.session.b$a$a */
        /* compiled from: IMediaSession */
        private static class C0086a implements C0084b {

            /* renamed from: b */
            public static C0084b f160b;

            /* renamed from: a */
            private IBinder f161a;

            C0086a(IBinder iBinder) {
                this.f161a = iBinder;
            }

            /* renamed from: A1 */
            public boolean mo312A1(KeyEvent keyEvent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    boolean z = true;
                    if (keyEvent != null) {
                        obtain.writeInt(1);
                        keyEvent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f161a.transact(2, obtain, obtain2, 0) && C0085a.m425G() != null) {
                        return C0085a.m425G().mo312A1(keyEvent);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Q */
            public void mo323Q(C0081a aVar) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (aVar != null) {
                        iBinder = aVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (this.f161a.transact(3, obtain, obtain2, 0) || C0085a.m425G() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    C0085a.m425G().mo323Q(aVar);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: V0 */
            public void mo328V0(C0081a aVar) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (aVar != null) {
                        iBinder = aVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (this.f161a.transact(4, obtain, obtain2, 0) || C0085a.m425G() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    C0085a.m425G().mo328V0(aVar);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f161a;
            }

            /* renamed from: g */
            public MediaMetadataCompat mo338g() {
                MediaMetadataCompat mediaMetadataCompat;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.f161a.transact(27, obtain, obtain2, 0) && C0085a.m425G() != null) {
                        return C0085a.m425G().mo338g();
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        mediaMetadataCompat = MediaMetadataCompat.CREATOR.createFromParcel(obtain2);
                    } else {
                        mediaMetadataCompat = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return mediaMetadataCompat;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: l */
            public PlaybackStateCompat mo345l() {
                PlaybackStateCompat playbackStateCompat;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.f161a.transact(28, obtain, obtain2, 0) && C0085a.m425G() != null) {
                        return C0085a.m425G().mo345l();
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        playbackStateCompat = PlaybackStateCompat.CREATOR.createFromParcel(obtain2);
                    } else {
                        playbackStateCompat = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return playbackStateCompat;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: l2 */
            public void mo348l2() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (this.f161a.transact(13, obtain, obtain2, 0) || C0085a.m425G() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    C0085a.m425G().mo348l2();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: p0 */
            public PendingIntent mo351p0() {
                PendingIntent pendingIntent;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.f161a.transact(8, obtain, obtain2, 0) && C0085a.m425G() != null) {
                        return C0085a.m425G().mo351p0();
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        pendingIntent = (PendingIntent) PendingIntent.CREATOR.createFromParcel(obtain2);
                    } else {
                        pendingIntent = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return pendingIntent;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void pause() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (this.f161a.transact(18, obtain, obtain2, 0) || C0085a.m425G() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    C0085a.m425G().pause();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void stop() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (this.f161a.transact(19, obtain, obtain2, 0) || C0085a.m425G() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    C0085a.m425G().stop();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C0085a() {
            attachInterface(this, "android.support.v4.media.session.IMediaSession");
        }

        /* renamed from: E */
        public static C0084b m424E(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0084b)) {
                return new C0086a(iBinder);
            }
            return (C0084b) queryLocalInterface;
        }

        /* renamed from: G */
        public static C0084b m425G() {
            return C0086a.f160b;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.view.KeyEvent} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: android.support.v4.media.RatingCompat} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: android.support.v4.media.MediaDescriptionCompat} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: android.support.v4.media.MediaDescriptionCompat} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v37, resolved type: android.support.v4.media.MediaDescriptionCompat} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v40, resolved type: android.os.Bundle} */
        /* JADX WARNING: type inference failed for: r3v0 */
        /* JADX WARNING: type inference failed for: r3v43 */
        /* JADX WARNING: type inference failed for: r3v44 */
        /* JADX WARNING: type inference failed for: r3v45 */
        /* JADX WARNING: type inference failed for: r3v46 */
        /* JADX WARNING: type inference failed for: r3v47 */
        /* JADX WARNING: type inference failed for: r3v48 */
        /* JADX WARNING: type inference failed for: r3v49 */
        /* JADX WARNING: type inference failed for: r3v50 */
        /* JADX WARNING: type inference failed for: r3v51 */
        /* JADX WARNING: type inference failed for: r3v52 */
        /* JADX WARNING: type inference failed for: r3v53 */
        /* JADX WARNING: type inference failed for: r3v54 */
        /* JADX WARNING: type inference failed for: r3v55 */
        /* JADX WARNING: type inference failed for: r3v56 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
            /*
                r4 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                if (r5 == r0) goto L_0x0413
                r0 = 0
                r3 = 0
                switch(r5) {
                    case 1: goto L_0x03e6;
                    case 2: goto L_0x03c9;
                    case 3: goto L_0x03b7;
                    case 4: goto L_0x03a5;
                    case 5: goto L_0x0397;
                    case 6: goto L_0x0389;
                    case 7: goto L_0x037b;
                    case 8: goto L_0x0364;
                    case 9: goto L_0x0356;
                    case 10: goto L_0x033f;
                    case 11: goto L_0x0329;
                    case 12: goto L_0x0313;
                    case 13: goto L_0x0309;
                    case 14: goto L_0x02ec;
                    case 15: goto L_0x02cf;
                    case 16: goto L_0x02a6;
                    case 17: goto L_0x0298;
                    case 18: goto L_0x028e;
                    case 19: goto L_0x0284;
                    case 20: goto L_0x027a;
                    case 21: goto L_0x0270;
                    case 22: goto L_0x0266;
                    case 23: goto L_0x025c;
                    case 24: goto L_0x024e;
                    case 25: goto L_0x0235;
                    case 26: goto L_0x0218;
                    case 27: goto L_0x0201;
                    case 28: goto L_0x01ea;
                    case 29: goto L_0x01dc;
                    case 30: goto L_0x01c5;
                    case 31: goto L_0x01ae;
                    case 32: goto L_0x01a0;
                    case 33: goto L_0x0196;
                    case 34: goto L_0x0179;
                    case 35: goto L_0x015c;
                    case 36: goto L_0x0133;
                    case 37: goto L_0x0125;
                    case 38: goto L_0x0117;
                    case 39: goto L_0x0109;
                    case 40: goto L_0x00f8;
                    case 41: goto L_0x00df;
                    case 42: goto L_0x00c2;
                    case 43: goto L_0x00a9;
                    case 44: goto L_0x009b;
                    case 45: goto L_0x008d;
                    case 46: goto L_0x007c;
                    case 47: goto L_0x006e;
                    case 48: goto L_0x0060;
                    case 49: goto L_0x0052;
                    case 50: goto L_0x003b;
                    case 51: goto L_0x0012;
                    default: goto L_0x000d;
                }
            L_0x000d:
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x0012:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0024
                android.os.Parcelable$Creator<android.support.v4.media.RatingCompat> r5 = android.support.p001v4.media.RatingCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.support.v4.media.RatingCompat r5 = (android.support.p001v4.media.RatingCompat) r5
                goto L_0x0025
            L_0x0024:
                r5 = r3
            L_0x0025:
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0034
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x0034:
                r4.mo318I1(r5, r3)
                r7.writeNoException()
                return r1
            L_0x003b:
                r6.enforceInterface(r2)
                android.os.Bundle r5 = r4.mo326U0()
                r7.writeNoException()
                if (r5 == 0) goto L_0x004e
                r7.writeInt(r1)
                r5.writeToParcel(r7, r1)
                goto L_0x0051
            L_0x004e:
                r7.writeInt(r0)
            L_0x0051:
                return r1
            L_0x0052:
                r6.enforceInterface(r2)
                float r5 = r6.readFloat()
                r4.mo360w1(r5)
                r7.writeNoException()
                return r1
            L_0x0060:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                r4.mo319K2(r5)
                r7.writeNoException()
                return r1
            L_0x006e:
                r6.enforceInterface(r2)
                int r5 = r4.mo330Y1()
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x007c:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0086
                r0 = r1
            L_0x0086:
                r4.mo324Q1(r0)
                r7.writeNoException()
                return r1
            L_0x008d:
                r6.enforceInterface(r2)
                boolean r5 = r4.mo336e2()
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x009b:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                r4.mo333a2(r5)
                r7.writeNoException()
                return r1
            L_0x00a9:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00bb
                android.os.Parcelable$Creator<android.support.v4.media.MediaDescriptionCompat> r5 = android.support.p001v4.media.MediaDescriptionCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.support.v4.media.MediaDescriptionCompat r3 = (android.support.p001v4.media.MediaDescriptionCompat) r3
            L_0x00bb:
                r4.mo344j0(r3)
                r7.writeNoException()
                return r1
            L_0x00c2:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00d4
                android.os.Parcelable$Creator<android.support.v4.media.MediaDescriptionCompat> r5 = android.support.p001v4.media.MediaDescriptionCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.support.v4.media.MediaDescriptionCompat r3 = (android.support.p001v4.media.MediaDescriptionCompat) r3
            L_0x00d4:
                int r5 = r6.readInt()
                r4.mo321M1(r3, r5)
                r7.writeNoException()
                return r1
            L_0x00df:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00f1
                android.os.Parcelable$Creator<android.support.v4.media.MediaDescriptionCompat> r5 = android.support.p001v4.media.MediaDescriptionCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.support.v4.media.MediaDescriptionCompat r3 = (android.support.p001v4.media.MediaDescriptionCompat) r3
            L_0x00f1:
                r4.mo349n0(r3)
                r7.writeNoException()
                return r1
            L_0x00f8:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0102
                r0 = r1
            L_0x0102:
                r4.mo315D2(r0)
                r7.writeNoException()
                return r1
            L_0x0109:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                r4.mo359u2(r5)
                r7.writeNoException()
                return r1
            L_0x0117:
                r6.enforceInterface(r2)
                boolean r5 = r4.mo327V()
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x0125:
                r6.enforceInterface(r2)
                int r5 = r4.mo313B2()
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x0133:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0145
                android.os.Parcelable$Creator r5 = android.net.Uri.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.net.Uri r5 = (android.net.Uri) r5
                goto L_0x0146
            L_0x0145:
                r5 = r3
            L_0x0146:
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0155
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x0155:
                r4.mo335d0(r5, r3)
                r7.writeNoException()
                return r1
            L_0x015c:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0172
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x0172:
                r4.mo356s0(r5, r3)
                r7.writeNoException()
                return r1
            L_0x0179:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x018f
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x018f:
                r4.mo325T0(r5, r3)
                r7.writeNoException()
                return r1
            L_0x0196:
                r6.enforceInterface(r2)
                r4.mo362y0()
                r7.writeNoException()
                return r1
            L_0x01a0:
                r6.enforceInterface(r2)
                int r5 = r4.mo354q0()
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x01ae:
                r6.enforceInterface(r2)
                android.os.Bundle r5 = r4.getExtras()
                r7.writeNoException()
                if (r5 == 0) goto L_0x01c1
                r7.writeInt(r1)
                r5.writeToParcel(r7, r1)
                goto L_0x01c4
            L_0x01c1:
                r7.writeInt(r0)
            L_0x01c4:
                return r1
            L_0x01c5:
                r6.enforceInterface(r2)
                java.lang.CharSequence r5 = r4.mo320M0()
                r7.writeNoException()
                if (r5 == 0) goto L_0x01d8
                r7.writeInt(r1)
                android.text.TextUtils.writeToParcel(r5, r7, r1)
                goto L_0x01db
            L_0x01d8:
                r7.writeInt(r0)
            L_0x01db:
                return r1
            L_0x01dc:
                r6.enforceInterface(r2)
                java.util.List r5 = r4.mo357s2()
                r7.writeNoException()
                r7.writeTypedList(r5)
                return r1
            L_0x01ea:
                r6.enforceInterface(r2)
                android.support.v4.media.session.PlaybackStateCompat r5 = r4.mo345l()
                r7.writeNoException()
                if (r5 == 0) goto L_0x01fd
                r7.writeInt(r1)
                r5.writeToParcel(r7, r1)
                goto L_0x0200
            L_0x01fd:
                r7.writeInt(r0)
            L_0x0200:
                return r1
            L_0x0201:
                r6.enforceInterface(r2)
                android.support.v4.media.MediaMetadataCompat r5 = r4.mo338g()
                r7.writeNoException()
                if (r5 == 0) goto L_0x0214
                r7.writeInt(r1)
                r5.writeToParcel(r7, r1)
                goto L_0x0217
            L_0x0214:
                r7.writeInt(r0)
            L_0x0217:
                return r1
            L_0x0218:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x022e
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x022e:
                r4.mo322N(r5, r3)
                r7.writeNoException()
                return r1
            L_0x0235:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0247
                android.os.Parcelable$Creator<android.support.v4.media.RatingCompat> r5 = android.support.p001v4.media.RatingCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.support.v4.media.RatingCompat r3 = (android.support.p001v4.media.RatingCompat) r3
            L_0x0247:
                r4.mo329W(r3)
                r7.writeNoException()
                return r1
            L_0x024e:
                r6.enforceInterface(r2)
                long r5 = r6.readLong()
                r4.mo347l1(r5)
                r7.writeNoException()
                return r1
            L_0x025c:
                r6.enforceInterface(r2)
                r4.mo361w2()
                r7.writeNoException()
                return r1
            L_0x0266:
                r6.enforceInterface(r2)
                r4.mo337f1()
                r7.writeNoException()
                return r1
            L_0x0270:
                r6.enforceInterface(r2)
                r4.previous()
                r7.writeNoException()
                return r1
            L_0x027a:
                r6.enforceInterface(r2)
                r4.next()
                r7.writeNoException()
                return r1
            L_0x0284:
                r6.enforceInterface(r2)
                r4.stop()
                r7.writeNoException()
                return r1
            L_0x028e:
                r6.enforceInterface(r2)
                r4.pause()
                r7.writeNoException()
                return r1
            L_0x0298:
                r6.enforceInterface(r2)
                long r5 = r6.readLong()
                r4.mo314C2(r5)
                r7.writeNoException()
                return r1
            L_0x02a6:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x02b8
                android.os.Parcelable$Creator r5 = android.net.Uri.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.net.Uri r5 = (android.net.Uri) r5
                goto L_0x02b9
            L_0x02b8:
                r5 = r3
            L_0x02b9:
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x02c8
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x02c8:
                r4.mo343h1(r5, r3)
                r7.writeNoException()
                return r1
            L_0x02cf:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x02e5
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x02e5:
                r4.mo334b1(r5, r3)
                r7.writeNoException()
                return r1
            L_0x02ec:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0302
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x0302:
                r4.mo331Z0(r5, r3)
                r7.writeNoException()
                return r1
            L_0x0309:
                r6.enforceInterface(r2)
                r4.mo348l2()
                r7.writeNoException()
                return r1
            L_0x0313:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                int r8 = r6.readInt()
                java.lang.String r6 = r6.readString()
                r4.mo332a0(r5, r8, r6)
                r7.writeNoException()
                return r1
            L_0x0329:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                int r8 = r6.readInt()
                java.lang.String r6 = r6.readString()
                r4.mo316F1(r5, r8, r6)
                r7.writeNoException()
                return r1
            L_0x033f:
                r6.enforceInterface(r2)
                android.support.v4.media.session.ParcelableVolumeInfo r5 = r4.mo317F2()
                r7.writeNoException()
                if (r5 == 0) goto L_0x0352
                r7.writeInt(r1)
                r5.writeToParcel(r7, r1)
                goto L_0x0355
            L_0x0352:
                r7.writeInt(r0)
            L_0x0355:
                return r1
            L_0x0356:
                r6.enforceInterface(r2)
                long r5 = r4.getFlags()
                r7.writeNoException()
                r7.writeLong(r5)
                return r1
            L_0x0364:
                r6.enforceInterface(r2)
                android.app.PendingIntent r5 = r4.mo351p0()
                r7.writeNoException()
                if (r5 == 0) goto L_0x0377
                r7.writeInt(r1)
                r5.writeToParcel(r7, r1)
                goto L_0x037a
            L_0x0377:
                r7.writeInt(r0)
            L_0x037a:
                return r1
            L_0x037b:
                r6.enforceInterface(r2)
                java.lang.String r5 = r4.getTag()
                r7.writeNoException()
                r7.writeString(r5)
                return r1
            L_0x0389:
                r6.enforceInterface(r2)
                java.lang.String r5 = r4.getPackageName()
                r7.writeNoException()
                r7.writeString(r5)
                return r1
            L_0x0397:
                r6.enforceInterface(r2)
                boolean r5 = r4.mo346l0()
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x03a5:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                android.support.v4.media.session.a r5 = android.support.p001v4.media.session.C0081a.C0082a.m374E(r5)
                r4.mo328V0(r5)
                r7.writeNoException()
                return r1
            L_0x03b7:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                android.support.v4.media.session.a r5 = android.support.p001v4.media.session.C0081a.C0082a.m374E(r5)
                r4.mo323Q(r5)
                r7.writeNoException()
                return r1
            L_0x03c9:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x03db
                android.os.Parcelable$Creator r5 = android.view.KeyEvent.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.view.KeyEvent r3 = (android.view.KeyEvent) r3
            L_0x03db:
                boolean r5 = r4.mo312A1(r3)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x03e6:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x03fc
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r8 = r8.createFromParcel(r6)
                android.os.Bundle r8 = (android.os.Bundle) r8
                goto L_0x03fd
            L_0x03fc:
                r8 = r3
            L_0x03fd:
                int r0 = r6.readInt()
                if (r0 == 0) goto L_0x040c
                android.os.Parcelable$Creator<android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper> r0 = android.support.p001v4.media.session.MediaSessionCompat.ResultReceiverWrapper.CREATOR
                java.lang.Object r6 = r0.createFromParcel(r6)
                r3 = r6
                android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper r3 = (android.support.p001v4.media.session.MediaSessionCompat.ResultReceiverWrapper) r3
            L_0x040c:
                r4.mo355r2(r5, r8, r3)
                r7.writeNoException()
                return r1
            L_0x0413:
                r7.writeString(r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p001v4.media.session.C0084b.C0085a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }

        public IBinder asBinder() {
            return this;
        }
    }
}
