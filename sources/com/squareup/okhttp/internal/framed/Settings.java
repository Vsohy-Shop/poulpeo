package com.squareup.okhttp.internal.framed;

import java.util.Arrays;

public final class Settings {
    static final int CLIENT_CERTIFICATE_VECTOR_SIZE = 8;
    static final int COUNT = 10;
    static final int CURRENT_CWND = 5;
    static final int DEFAULT_INITIAL_WINDOW_SIZE = 65536;
    static final int DOWNLOAD_BANDWIDTH = 2;
    static final int DOWNLOAD_RETRANS_RATE = 6;
    static final int ENABLE_PUSH = 2;
    static final int FLAG_CLEAR_PREVIOUSLY_PERSISTED_SETTINGS = 1;
    static final int FLOW_CONTROL_OPTIONS = 10;
    static final int FLOW_CONTROL_OPTIONS_DISABLED = 1;
    static final int HEADER_TABLE_SIZE = 1;
    static final int INITIAL_WINDOW_SIZE = 7;
    static final int MAX_CONCURRENT_STREAMS = 4;
    static final int MAX_FRAME_SIZE = 5;
    static final int MAX_HEADER_LIST_SIZE = 6;
    static final int PERSISTED = 2;
    static final int PERSIST_VALUE = 1;
    static final int ROUND_TRIP_TIME = 3;
    static final int UPLOAD_BANDWIDTH = 1;
    private int persistValue;
    private int persisted;
    private int set;
    private final int[] values = new int[10];

    /* access modifiers changed from: package-private */
    public void clear() {
        this.persisted = 0;
        this.persistValue = 0;
        this.set = 0;
        Arrays.fill(this.values, 0);
    }

    /* access modifiers changed from: package-private */
    public int flags(int i) {
        int i2;
        if (isPersisted(i)) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        if (persistValue(i)) {
            return i2 | 1;
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    public int get(int i) {
        return this.values[i];
    }

    /* access modifiers changed from: package-private */
    public int getClientCertificateVectorSize(int i) {
        if ((this.set & 256) != 0) {
            return this.values[8];
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public int getCurrentCwnd(int i) {
        if ((this.set & 32) != 0) {
            return this.values[5];
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public int getDownloadBandwidth(int i) {
        if ((this.set & 4) != 0) {
            return this.values[2];
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public int getDownloadRetransRate(int i) {
        if ((this.set & 64) != 0) {
            return this.values[6];
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public boolean getEnablePush(boolean z) {
        int i;
        if ((this.set & 4) != 0) {
            i = this.values[2];
        } else if (z) {
            i = 1;
        } else {
            i = 0;
        }
        if (i == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public int getHeaderTableSize() {
        if ((this.set & 2) != 0) {
            return this.values[1];
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public int getInitialWindowSize(int i) {
        if ((this.set & 128) != 0) {
            return this.values[7];
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public int getMaxConcurrentStreams(int i) {
        if ((this.set & 16) != 0) {
            return this.values[4];
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public int getMaxFrameSize(int i) {
        if ((this.set & 32) != 0) {
            return this.values[5];
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public int getMaxHeaderListSize(int i) {
        if ((this.set & 64) != 0) {
            return this.values[6];
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public int getRoundTripTime(int i) {
        if ((this.set & 8) != 0) {
            return this.values[3];
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public int getUploadBandwidth(int i) {
        if ((this.set & 2) != 0) {
            return this.values[1];
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public boolean isFlowControlDisabled() {
        int i;
        if ((this.set & 1024) != 0) {
            i = this.values[10];
        } else {
            i = 0;
        }
        if ((i & 1) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean isPersisted(int i) {
        if (((1 << i) & this.persisted) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean isSet(int i) {
        if (((1 << i) & this.set) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void merge(Settings settings) {
        for (int i = 0; i < 10; i++) {
            if (settings.isSet(i)) {
                set(i, settings.flags(i), settings.get(i));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean persistValue(int i) {
        if (((1 << i) & this.persistValue) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public Settings set(int i, int i2, int i3) {
        int[] iArr = this.values;
        if (i >= iArr.length) {
            return this;
        }
        int i4 = 1 << i;
        this.set |= i4;
        if ((i2 & 1) != 0) {
            this.persistValue |= i4;
        } else {
            this.persistValue &= ~i4;
        }
        if ((i2 & 2) != 0) {
            this.persisted |= i4;
        } else {
            this.persisted &= ~i4;
        }
        iArr[i] = i3;
        return this;
    }

    /* access modifiers changed from: package-private */
    public int size() {
        return Integer.bitCount(this.set);
    }
}
