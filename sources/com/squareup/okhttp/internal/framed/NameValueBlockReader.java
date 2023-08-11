package com.squareup.okhttp.internal.framed;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;
import okio.C13121c;
import okio.C13130e;
import okio.C13133f;
import okio.C13145j0;
import okio.C13150m;
import okio.C13157p;
import okio.C13179y0;

class NameValueBlockReader {
    /* access modifiers changed from: private */
    public int compressedLimit;
    private final C13157p inflaterSource;
    private final C13130e source;

    public NameValueBlockReader(C13130e eVar) {
        C13157p pVar = new C13157p((C13179y0) new C13150m(eVar) {
            public long read(C13121c cVar, long j) {
                if (NameValueBlockReader.this.compressedLimit == 0) {
                    return -1;
                }
                long read = super.read(cVar, Math.min(j, (long) NameValueBlockReader.this.compressedLimit));
                if (read == -1) {
                    return -1;
                }
                NameValueBlockReader.access$022(NameValueBlockReader.this, read);
                return read;
            }
        }, (Inflater) new Inflater() {
            public int inflate(byte[] bArr, int i, int i2) {
                int inflate = super.inflate(bArr, i, i2);
                if (inflate != 0 || !needsDictionary()) {
                    return inflate;
                }
                setDictionary(Spdy3.DICTIONARY);
                return super.inflate(bArr, i, i2);
            }
        });
        this.inflaterSource = pVar;
        this.source = C13145j0.m29739d(pVar);
    }

    static /* synthetic */ int access$022(NameValueBlockReader nameValueBlockReader, long j) {
        int i = (int) (((long) nameValueBlockReader.compressedLimit) - j);
        nameValueBlockReader.compressedLimit = i;
        return i;
    }

    private void doneReading() {
        if (this.compressedLimit > 0) {
            this.inflaterSource.mo52679b();
            if (this.compressedLimit != 0) {
                throw new IOException("compressedLimit > 0: " + this.compressedLimit);
            }
        }
    }

    private C13133f readByteString() {
        return this.source.mo52534o((long) this.source.readInt());
    }

    public void close() {
        this.source.close();
    }

    public List<Header> readNameValueBlock(int i) {
        this.compressedLimit += i;
        int readInt = this.source.readInt();
        if (readInt < 0) {
            throw new IOException("numberOfPairs < 0: " + readInt);
        } else if (readInt <= 1024) {
            ArrayList arrayList = new ArrayList(readInt);
            int i2 = 0;
            while (i2 < readInt) {
                C13133f L = readByteString().mo52593L();
                C13133f readByteString = readByteString();
                if (L.mo52590H() != 0) {
                    arrayList.add(new Header(L, readByteString));
                    i2++;
                } else {
                    throw new IOException("name.size == 0");
                }
            }
            doneReading();
            return arrayList;
        } else {
            throw new IOException("numberOfPairs > 1024: " + readInt);
        }
    }
}
