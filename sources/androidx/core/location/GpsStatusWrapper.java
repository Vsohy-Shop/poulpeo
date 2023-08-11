package androidx.core.location;

import android.location.GpsSatellite;
import android.location.GpsStatus;
import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import java.util.Iterator;

@RestrictTo({RestrictTo.Scope.LIBRARY})
class GpsStatusWrapper extends GnssStatusCompat {
    private static final int BEIDOU_PRN_COUNT = 35;
    private static final int BEIDOU_PRN_OFFSET = 200;
    private static final int GLONASS_PRN_COUNT = 24;
    private static final int GLONASS_PRN_OFFSET = 64;
    private static final int GPS_PRN_COUNT = 32;
    private static final int GPS_PRN_OFFSET = 0;
    private static final int QZSS_SVID_MAX = 200;
    private static final int QZSS_SVID_MIN = 193;
    private static final int SBAS_PRN_MAX = 64;
    private static final int SBAS_PRN_MIN = 33;
    private static final int SBAS_PRN_OFFSET = -87;
    @GuardedBy("mWrapped")
    private Iterator<GpsSatellite> mCachedIterator;
    @GuardedBy("mWrapped")
    private int mCachedIteratorPosition;
    @GuardedBy("mWrapped")
    private GpsSatellite mCachedSatellite;
    @GuardedBy("mWrapped")
    private int mCachedSatelliteCount = -1;
    private final GpsStatus mWrapped;

    GpsStatusWrapper(GpsStatus gpsStatus) {
        GpsStatus gpsStatus2 = (GpsStatus) Preconditions.checkNotNull(gpsStatus);
        this.mWrapped = gpsStatus2;
        this.mCachedIterator = gpsStatus2.getSatellites().iterator();
        this.mCachedIteratorPosition = -1;
        this.mCachedSatellite = null;
    }

    private static int getConstellationFromPrn(int i) {
        if (i > 0 && i <= 32) {
            return 1;
        }
        if (i >= 33 && i <= 64) {
            return 2;
        }
        if (i > 64 && i <= 88) {
            return 3;
        }
        if (i > 200 && i <= 235) {
            return 5;
        }
        if (i < QZSS_SVID_MIN || i > 200) {
            return 0;
        }
        return 4;
    }

    private GpsSatellite getSatellite(int i) {
        GpsSatellite gpsSatellite;
        synchronized (this.mWrapped) {
            if (i < this.mCachedIteratorPosition) {
                this.mCachedIterator = this.mWrapped.getSatellites().iterator();
                this.mCachedIteratorPosition = -1;
            }
            while (true) {
                int i2 = this.mCachedIteratorPosition;
                if (i2 >= i) {
                    break;
                }
                this.mCachedIteratorPosition = i2 + 1;
                if (!this.mCachedIterator.hasNext()) {
                    this.mCachedSatellite = null;
                    break;
                }
                this.mCachedSatellite = this.mCachedIterator.next();
            }
            gpsSatellite = this.mCachedSatellite;
        }
        return (GpsSatellite) Preconditions.checkNotNull(gpsSatellite);
    }

    private static int getSvidFromPrn(int i) {
        int constellationFromPrn = getConstellationFromPrn(i);
        if (constellationFromPrn == 2) {
            return i + 87;
        }
        if (constellationFromPrn == 3) {
            return i - 64;
        }
        if (constellationFromPrn != 5) {
            return i;
        }
        return i - 200;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GpsStatusWrapper)) {
            return false;
        }
        return this.mWrapped.equals(((GpsStatusWrapper) obj).mWrapped);
    }

    public float getAzimuthDegrees(int i) {
        return getSatellite(i).getAzimuth();
    }

    public float getBasebandCn0DbHz(int i) {
        throw new UnsupportedOperationException();
    }

    public float getCarrierFrequencyHz(int i) {
        throw new UnsupportedOperationException();
    }

    public float getCn0DbHz(int i) {
        return getSatellite(i).getSnr();
    }

    public int getConstellationType(int i) {
        return getConstellationFromPrn(getSatellite(i).getPrn());
    }

    public float getElevationDegrees(int i) {
        return getSatellite(i).getElevation();
    }

    public int getSatelliteCount() {
        int i;
        synchronized (this.mWrapped) {
            if (this.mCachedSatelliteCount == -1) {
                for (GpsSatellite next : this.mWrapped.getSatellites()) {
                    this.mCachedSatelliteCount++;
                }
                this.mCachedSatelliteCount++;
            }
            i = this.mCachedSatelliteCount;
        }
        return i;
    }

    public int getSvid(int i) {
        return getSvidFromPrn(getSatellite(i).getPrn());
    }

    public boolean hasAlmanacData(int i) {
        return getSatellite(i).hasAlmanac();
    }

    public boolean hasBasebandCn0DbHz(int i) {
        return false;
    }

    public boolean hasCarrierFrequencyHz(int i) {
        return false;
    }

    public boolean hasEphemerisData(int i) {
        return getSatellite(i).hasEphemeris();
    }

    public int hashCode() {
        return this.mWrapped.hashCode();
    }

    public boolean usedInFix(int i) {
        return getSatellite(i).usedInFix();
    }
}
