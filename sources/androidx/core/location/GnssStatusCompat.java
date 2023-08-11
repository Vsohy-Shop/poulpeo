package androidx.core.location;

import android.location.GnssStatus;
import android.location.GpsStatus;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class GnssStatusCompat {
    public static final int CONSTELLATION_BEIDOU = 5;
    public static final int CONSTELLATION_GALILEO = 6;
    public static final int CONSTELLATION_GLONASS = 3;
    public static final int CONSTELLATION_GPS = 1;
    public static final int CONSTELLATION_IRNSS = 7;
    public static final int CONSTELLATION_QZSS = 4;
    public static final int CONSTELLATION_SBAS = 2;
    public static final int CONSTELLATION_UNKNOWN = 0;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ConstellationType {
    }

    GnssStatusCompat() {
    }

    @RequiresApi(24)
    @NonNull
    public static GnssStatusCompat wrap(@NonNull GnssStatus gnssStatus) {
        return new GnssStatusWrapper(gnssStatus);
    }

    @FloatRange(from = 0.0d, mo636to = 360.0d)
    public abstract float getAzimuthDegrees(@IntRange(from = 0) int i);

    @FloatRange(from = 0.0d, mo636to = 63.0d)
    public abstract float getBasebandCn0DbHz(@IntRange(from = 0) int i);

    @FloatRange(from = 0.0d)
    public abstract float getCarrierFrequencyHz(@IntRange(from = 0) int i);

    @FloatRange(from = 0.0d, mo636to = 63.0d)
    public abstract float getCn0DbHz(@IntRange(from = 0) int i);

    public abstract int getConstellationType(@IntRange(from = 0) int i);

    @FloatRange(from = -90.0d, mo636to = 90.0d)
    public abstract float getElevationDegrees(@IntRange(from = 0) int i);

    @IntRange(from = 0)
    public abstract int getSatelliteCount();

    @IntRange(from = 1, mo654to = 200)
    public abstract int getSvid(@IntRange(from = 0) int i);

    public abstract boolean hasAlmanacData(@IntRange(from = 0) int i);

    public abstract boolean hasBasebandCn0DbHz(@IntRange(from = 0) int i);

    public abstract boolean hasCarrierFrequencyHz(@IntRange(from = 0) int i);

    public abstract boolean hasEphemerisData(@IntRange(from = 0) int i);

    public abstract boolean usedInFix(@IntRange(from = 0) int i);

    @NonNull
    public static GnssStatusCompat wrap(@NonNull GpsStatus gpsStatus) {
        return new GpsStatusWrapper(gpsStatus);
    }

    public static abstract class Callback {
        public void onStarted() {
        }

        public void onStopped() {
        }

        public void onFirstFix(@IntRange(from = 0) int i) {
        }

        public void onSatelliteStatusChanged(@NonNull GnssStatusCompat gnssStatusCompat) {
        }
    }
}
