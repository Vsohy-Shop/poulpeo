package android.support.p001v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.p001v4.media.MediaMetadataCompat;
import android.support.p001v4.media.session.MediaSessionCompat;
import java.util.List;

/* renamed from: android.support.v4.media.session.a */
/* compiled from: IMediaControllerCallback */
public interface C0081a extends IInterface {
    /* renamed from: A0 */
    void mo189A0();

    /* renamed from: B0 */
    void mo158B0(Bundle bundle);

    /* renamed from: B1 */
    void mo190B1(boolean z);

    /* renamed from: C1 */
    void mo159C1(CharSequence charSequence);

    /* renamed from: G0 */
    void mo160G0(List<MediaSessionCompat.QueueItem> list);

    /* renamed from: I */
    void mo191I(String str, Bundle bundle);

    /* renamed from: L1 */
    void mo161L1();

    /* renamed from: O1 */
    void mo162O1(MediaMetadataCompat mediaMetadataCompat);

    /* renamed from: T1 */
    void mo192T1(int i);

    /* renamed from: T2 */
    void mo193T2(PlaybackStateCompat playbackStateCompat);

    /* renamed from: a3 */
    void mo163a3(ParcelableVolumeInfo parcelableVolumeInfo);

    /* renamed from: g2 */
    void mo194g2(int i);

    /* renamed from: n1 */
    void mo195n1(boolean z);

    /* renamed from: android.support.v4.media.session.a$a */
    /* compiled from: IMediaControllerCallback */
    public static abstract class C0082a extends Binder implements C0081a {

        /* renamed from: android.support.v4.media.session.a$a$a */
        /* compiled from: IMediaControllerCallback */
        private static class C0083a implements C0081a {

            /* renamed from: b */
            public static C0081a f158b;

            /* renamed from: a */
            private IBinder f159a;

            C0083a(IBinder iBinder) {
                this.f159a = iBinder;
            }

            /* renamed from: B0 */
            public void mo158B0(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f159a.transact(7, obtain, (Parcel) null, 1) || C0082a.m375G() == null) {
                        obtain.recycle();
                    } else {
                        C0082a.m375G().mo158B0(bundle);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: L1 */
            public void mo161L1() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (this.f159a.transact(2, obtain, (Parcel) null, 1) || C0082a.m375G() == null) {
                        obtain.recycle();
                    } else {
                        C0082a.m375G().mo161L1();
                    }
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: O1 */
            public void mo162O1(MediaMetadataCompat mediaMetadataCompat) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (mediaMetadataCompat != null) {
                        obtain.writeInt(1);
                        mediaMetadataCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f159a.transact(4, obtain, (Parcel) null, 1) || C0082a.m375G() == null) {
                        obtain.recycle();
                    } else {
                        C0082a.m375G().mo162O1(mediaMetadataCompat);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: T2 */
            public void mo193T2(PlaybackStateCompat playbackStateCompat) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (playbackStateCompat != null) {
                        obtain.writeInt(1);
                        playbackStateCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f159a.transact(3, obtain, (Parcel) null, 1) || C0082a.m375G() == null) {
                        obtain.recycle();
                    } else {
                        C0082a.m375G().mo193T2(playbackStateCompat);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a3 */
            public void mo163a3(ParcelableVolumeInfo parcelableVolumeInfo) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcelableVolumeInfo != null) {
                        obtain.writeInt(1);
                        parcelableVolumeInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f159a.transact(8, obtain, (Parcel) null, 1) || C0082a.m375G() == null) {
                        obtain.recycle();
                    } else {
                        C0082a.m375G().mo163a3(parcelableVolumeInfo);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f159a;
            }
        }

        public C0082a() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        /* renamed from: E */
        public static C0081a m374E(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0081a)) {
                return new C0083a(iBinder);
            }
            return (C0081a) queryLocalInterface;
        }

        /* renamed from: G */
        public static C0081a m375G() {
            return C0083a.f158b;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.support.v4.media.session.PlaybackStateCompat} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: android.support.v4.media.MediaMetadataCompat} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: android.support.v4.media.session.ParcelableVolumeInfo} */
        /* JADX WARNING: type inference failed for: r3v0 */
        /* JADX WARNING: type inference failed for: r3v10, types: [java.lang.CharSequence] */
        /* JADX WARNING: type inference failed for: r3v19 */
        /* JADX WARNING: type inference failed for: r3v20 */
        /* JADX WARNING: type inference failed for: r3v21 */
        /* JADX WARNING: type inference failed for: r3v22 */
        /* JADX WARNING: type inference failed for: r3v23 */
        /* JADX WARNING: type inference failed for: r3v24 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
            /*
                r4 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                java.lang.String r2 = "android.support.v4.media.session.IMediaControllerCallback"
                if (r5 == r0) goto L_0x00e7
                r0 = 0
                r3 = 0
                switch(r5) {
                    case 1: goto L_0x00cd;
                    case 2: goto L_0x00c6;
                    case 3: goto L_0x00b0;
                    case 4: goto L_0x009a;
                    case 5: goto L_0x008d;
                    case 6: goto L_0x0077;
                    case 7: goto L_0x0061;
                    case 8: goto L_0x004b;
                    case 9: goto L_0x0040;
                    case 10: goto L_0x0032;
                    case 11: goto L_0x0024;
                    case 12: goto L_0x0019;
                    case 13: goto L_0x0012;
                    default: goto L_0x000d;
                }
            L_0x000d:
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x0012:
                r6.enforceInterface(r2)
                r4.mo189A0()
                return r1
            L_0x0019:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                r4.mo194g2(r5)
                return r1
            L_0x0024:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x002e
                r0 = r1
            L_0x002e:
                r4.mo195n1(r0)
                return r1
            L_0x0032:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x003c
                r0 = r1
            L_0x003c:
                r4.mo190B1(r0)
                return r1
            L_0x0040:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                r4.mo192T1(r5)
                return r1
            L_0x004b:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x005d
                android.os.Parcelable$Creator<android.support.v4.media.session.ParcelableVolumeInfo> r5 = android.support.p001v4.media.session.ParcelableVolumeInfo.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.support.v4.media.session.ParcelableVolumeInfo r3 = (android.support.p001v4.media.session.ParcelableVolumeInfo) r3
            L_0x005d:
                r4.mo163a3(r3)
                return r1
            L_0x0061:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0073
                android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x0073:
                r4.mo158B0(r3)
                return r1
            L_0x0077:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0089
                android.os.Parcelable$Creator r5 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            L_0x0089:
                r4.mo159C1(r3)
                return r1
            L_0x008d:
                r6.enforceInterface(r2)
                android.os.Parcelable$Creator<android.support.v4.media.session.MediaSessionCompat$QueueItem> r5 = android.support.p001v4.media.session.MediaSessionCompat.QueueItem.CREATOR
                java.util.ArrayList r5 = r6.createTypedArrayList(r5)
                r4.mo160G0(r5)
                return r1
            L_0x009a:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00ac
                android.os.Parcelable$Creator<android.support.v4.media.MediaMetadataCompat> r5 = android.support.p001v4.media.MediaMetadataCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.support.v4.media.MediaMetadataCompat r3 = (android.support.p001v4.media.MediaMetadataCompat) r3
            L_0x00ac:
                r4.mo162O1(r3)
                return r1
            L_0x00b0:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00c2
                android.os.Parcelable$Creator<android.support.v4.media.session.PlaybackStateCompat> r5 = android.support.p001v4.media.session.PlaybackStateCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.support.v4.media.session.PlaybackStateCompat r3 = (android.support.p001v4.media.session.PlaybackStateCompat) r3
            L_0x00c2:
                r4.mo193T2(r3)
                return r1
            L_0x00c6:
                r6.enforceInterface(r2)
                r4.mo161L1()
                return r1
            L_0x00cd:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r7 = r6.readInt()
                if (r7 == 0) goto L_0x00e3
                android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r7.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x00e3:
                r4.mo191I(r5, r3)
                return r1
            L_0x00e7:
                r7.writeString(r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p001v4.media.session.C0081a.C0082a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }

        public IBinder asBinder() {
            return this;
        }
    }
}
