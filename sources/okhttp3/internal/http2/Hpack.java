package okhttp3.internal.http2;

import androidx.autofill.HintConstants;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.webkit.ProxyConfig;
import com.rmn.apiclient.impl.api.call.APIParams;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.Util;
import okio.C13121c;
import okio.C13130e;
import okio.C13133f;
import okio.C13145j0;
import okio.C13179y0;

/* compiled from: Hpack.kt */
public final class Hpack {
    public static final Hpack INSTANCE;
    private static final Map<C13133f, Integer> NAME_TO_FIRST_INDEX;
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
    private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;
    private static final Header[] STATIC_HEADER_TABLE;

    /* compiled from: Hpack.kt */
    public static final class Reader {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        public int headerCount;
        private final List<Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final C13130e source;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Reader(C13179y0 y0Var, int i) {
            this(y0Var, i, 0, 4, (DefaultConstructorMarker) null);
            C12775o.m28639i(y0Var, APIParams.SOURCE);
        }

        private final void adjustDynamicTableByteCount() {
            int i = this.maxDynamicTableByteCount;
            int i2 = this.dynamicTableByteCount;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                clearDynamicTable();
            } else {
                evictToRecoverBytes(i2 - i);
            }
        }

        private final void clearDynamicTable() {
            C12708o.m28355v(this.dynamicTable, (Object) null, 0, 0, 6, (Object) null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int dynamicTableIndex(int i) {
            return this.nextHeaderIndex + 1 + i;
        }

        private final int evictToRecoverBytes(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i2 = this.nextHeaderIndex;
                    if (length < i2 || i <= 0) {
                        Header[] headerArr = this.dynamicTable;
                        System.arraycopy(headerArr, i2 + 1, headerArr, i2 + 1 + i3, this.headerCount);
                        this.nextHeaderIndex += i3;
                    } else {
                        Header header = this.dynamicTable[length];
                        C12775o.m28636f(header);
                        int i4 = header.hpackSize;
                        i -= i4;
                        this.dynamicTableByteCount -= i4;
                        this.headerCount--;
                        i3++;
                    }
                }
                Header[] headerArr2 = this.dynamicTable;
                System.arraycopy(headerArr2, i2 + 1, headerArr2, i2 + 1 + i3, this.headerCount);
                this.nextHeaderIndex += i3;
            }
            return i3;
        }

        private final C13133f getName(int i) {
            if (isStaticHeader(i)) {
                return Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i].name;
            }
            int dynamicTableIndex = dynamicTableIndex(i - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (dynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (dynamicTableIndex < headerArr.length) {
                    Header header = headerArr[dynamicTableIndex];
                    C12775o.m28636f(header);
                    return header.name;
                }
            }
            throw new IOException(C12775o.m28647q("Header index too large ", Integer.valueOf(i + 1)));
        }

        private final void insertIntoDynamicTable(int i, Header header) {
            this.headerList.add(header);
            int i2 = header.hpackSize;
            if (i != -1) {
                Header header2 = this.dynamicTable[dynamicTableIndex(i)];
                C12775o.m28636f(header2);
                i2 -= header2.hpackSize;
            }
            int i3 = this.maxDynamicTableByteCount;
            if (i2 > i3) {
                clearDynamicTable();
                return;
            }
            int evictToRecoverBytes = evictToRecoverBytes((this.dynamicTableByteCount + i2) - i3);
            if (i == -1) {
                int i4 = this.headerCount + 1;
                Header[] headerArr = this.dynamicTable;
                if (i4 > headerArr.length) {
                    Header[] headerArr2 = new Header[(headerArr.length * 2)];
                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = headerArr2;
                }
                int i5 = this.nextHeaderIndex;
                this.nextHeaderIndex = i5 - 1;
                this.dynamicTable[i5] = header;
                this.headerCount++;
            } else {
                this.dynamicTable[i + dynamicTableIndex(i) + evictToRecoverBytes] = header;
            }
            this.dynamicTableByteCount += i2;
        }

        private final boolean isStaticHeader(int i) {
            if (i < 0 || i > Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length - 1) {
                return false;
            }
            return true;
        }

        private final int readByte() {
            return Util.and(this.source.readByte(), 255);
        }

        private final void readIndexedHeader(int i) {
            if (isStaticHeader(i)) {
                this.headerList.add(Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i]);
                return;
            }
            int dynamicTableIndex = dynamicTableIndex(i - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (dynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (dynamicTableIndex < headerArr.length) {
                    Header header = headerArr[dynamicTableIndex];
                    C12775o.m28636f(header);
                    this.headerList.add(header);
                    return;
                }
            }
            throw new IOException(C12775o.m28647q("Header index too large ", Integer.valueOf(i + 1)));
        }

        private final void readLiteralHeaderWithIncrementalIndexingIndexedName(int i) {
            insertIntoDynamicTable(-1, new Header(getName(i), readByteString()));
        }

        private final void readLiteralHeaderWithIncrementalIndexingNewName() {
            insertIntoDynamicTable(-1, new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingIndexedName(int i) {
            this.headerList.add(new Header(getName(i), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingNewName() {
            this.headerList.add(new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        public final List<Header> getAndResetHeaderList() {
            List<Header> B0 = C12686e0.m28205B0(this.headerList);
            this.headerList.clear();
            return B0;
        }

        public final int maxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }

        public final C13133f readByteString() {
            boolean z;
            int readByte = readByte();
            if ((readByte & 128) == 128) {
                z = true;
            } else {
                z = false;
            }
            long readInt = (long) readInt(readByte, 127);
            if (!z) {
                return this.source.mo52534o(readInt);
            }
            C13121c cVar = new C13121c();
            Huffman.INSTANCE.decode(this.source, readInt, cVar);
            return cVar.mo52498M();
        }

        public final void readHeaders() {
            while (!this.source.mo52552t()) {
                int and = Util.and(this.source.readByte(), 255);
                if (and == 128) {
                    throw new IOException("index == 0");
                } else if ((and & 128) == 128) {
                    readIndexedHeader(readInt(and, 127) - 1);
                } else if (and == 64) {
                    readLiteralHeaderWithIncrementalIndexingNewName();
                } else if ((and & 64) == 64) {
                    readLiteralHeaderWithIncrementalIndexingIndexedName(readInt(and, 63) - 1);
                } else if ((and & 32) == 32) {
                    int readInt = readInt(and, 31);
                    this.maxDynamicTableByteCount = readInt;
                    if (readInt < 0 || readInt > this.headerTableSizeSetting) {
                        throw new IOException(C12775o.m28647q("Invalid dynamic table size update ", Integer.valueOf(this.maxDynamicTableByteCount)));
                    }
                    adjustDynamicTableByteCount();
                } else if (and == 16 || and == 0) {
                    readLiteralHeaderWithoutIndexingNewName();
                } else {
                    readLiteralHeaderWithoutIndexingIndexedName(readInt(and, 15) - 1);
                }
            }
        }

        public final int readInt(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int readByte = readByte();
                if ((readByte & 128) == 0) {
                    return i2 + (readByte << i4);
                }
                i2 += (readByte & 127) << i4;
                i4 += 7;
            }
        }

        public Reader(C13179y0 y0Var, int i, int i2) {
            C12775o.m28639i(y0Var, APIParams.SOURCE);
            this.headerTableSizeSetting = i;
            this.maxDynamicTableByteCount = i2;
            this.headerList = new ArrayList();
            this.source = C13145j0.m29739d(y0Var);
            Header[] headerArr = new Header[8];
            this.dynamicTable = headerArr;
            this.nextHeaderIndex = headerArr.length - 1;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Reader(C13179y0 y0Var, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(y0Var, i, (i3 & 4) != 0 ? i : i2);
        }
    }

    /* compiled from: Hpack.kt */
    public static final class Writer {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;
        public int headerCount;
        public int headerTableSizeSetting;
        public int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final C13121c out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Writer(int i, C13121c cVar) {
            this(i, false, cVar, 2, (DefaultConstructorMarker) null);
            C12775o.m28639i(cVar, "out");
        }

        private final void adjustDynamicTableByteCount() {
            int i = this.maxDynamicTableByteCount;
            int i2 = this.dynamicTableByteCount;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                clearDynamicTable();
            } else {
                evictToRecoverBytes(i2 - i);
            }
        }

        private final void clearDynamicTable() {
            C12708o.m28355v(this.dynamicTable, (Object) null, 0, 0, 6, (Object) null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int evictToRecoverBytes(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i2 = this.nextHeaderIndex;
                    if (length < i2 || i <= 0) {
                        Header[] headerArr = this.dynamicTable;
                        System.arraycopy(headerArr, i2 + 1, headerArr, i2 + 1 + i3, this.headerCount);
                        Header[] headerArr2 = this.dynamicTable;
                        int i4 = this.nextHeaderIndex;
                        Arrays.fill(headerArr2, i4 + 1, i4 + 1 + i3, (Object) null);
                        this.nextHeaderIndex += i3;
                    } else {
                        Header header = this.dynamicTable[length];
                        C12775o.m28636f(header);
                        i -= header.hpackSize;
                        int i5 = this.dynamicTableByteCount;
                        Header header2 = this.dynamicTable[length];
                        C12775o.m28636f(header2);
                        this.dynamicTableByteCount = i5 - header2.hpackSize;
                        this.headerCount--;
                        i3++;
                    }
                }
                Header[] headerArr3 = this.dynamicTable;
                System.arraycopy(headerArr3, i2 + 1, headerArr3, i2 + 1 + i3, this.headerCount);
                Header[] headerArr22 = this.dynamicTable;
                int i42 = this.nextHeaderIndex;
                Arrays.fill(headerArr22, i42 + 1, i42 + 1 + i3, (Object) null);
                this.nextHeaderIndex += i3;
            }
            return i3;
        }

        private final void insertIntoDynamicTable(Header header) {
            int i = header.hpackSize;
            int i2 = this.maxDynamicTableByteCount;
            if (i > i2) {
                clearDynamicTable();
                return;
            }
            evictToRecoverBytes((this.dynamicTableByteCount + i) - i2);
            int i3 = this.headerCount + 1;
            Header[] headerArr = this.dynamicTable;
            if (i3 > headerArr.length) {
                Header[] headerArr2 = new Header[(headerArr.length * 2)];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr2;
            }
            int i4 = this.nextHeaderIndex;
            this.nextHeaderIndex = i4 - 1;
            this.dynamicTable[i4] = header;
            this.headerCount++;
            this.dynamicTableByteCount += i;
        }

        public final void resizeHeaderTable(int i) {
            this.headerTableSizeSetting = i;
            int min = Math.min(i, 16384);
            int i2 = this.maxDynamicTableByteCount;
            if (i2 != min) {
                if (min < i2) {
                    this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, min);
                }
                this.emitDynamicTableSizeUpdate = true;
                this.maxDynamicTableByteCount = min;
                adjustDynamicTableByteCount();
            }
        }

        public final void writeByteString(C13133f fVar) {
            C12775o.m28639i(fVar, "data");
            if (this.useCompression) {
                Huffman huffman = Huffman.INSTANCE;
                if (huffman.encodedLength(fVar) < fVar.mo52590H()) {
                    C13121c cVar = new C13121c();
                    huffman.encode(fVar, cVar);
                    C13133f M = cVar.mo52498M();
                    writeInt(M.mo52590H(), 127, 128);
                    this.out.mo52517b0(M);
                    return;
                }
            }
            writeInt(fVar.mo52590H(), 127, 0);
            this.out.mo52517b0(fVar);
        }

        public final void writeHeaders(List<Header> list) {
            int i;
            int i2;
            boolean z;
            C12775o.m28639i(list, "headerBlock");
            if (this.emitDynamicTableSizeUpdate) {
                int i3 = this.smallestHeaderTableSizeSetting;
                if (i3 < this.maxDynamicTableByteCount) {
                    writeInt(i3, 31, 32);
                }
                this.emitDynamicTableSizeUpdate = false;
                this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
                writeInt(this.maxDynamicTableByteCount, 31, 32);
            }
            int size = list.size();
            int i4 = 0;
            while (i4 < size) {
                int i5 = i4 + 1;
                Header header = list.get(i4);
                C13133f L = header.name.mo52593L();
                C13133f fVar = header.value;
                Hpack hpack = Hpack.INSTANCE;
                Integer num = hpack.getNAME_TO_FIRST_INDEX().get(L);
                if (num != null) {
                    i = num.intValue() + 1;
                    if (2 > i || i >= 8) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        if (C12775o.m28634d(hpack.getSTATIC_HEADER_TABLE()[i - 1].value, fVar)) {
                            i2 = i;
                        } else if (C12775o.m28634d(hpack.getSTATIC_HEADER_TABLE()[i].value, fVar)) {
                            int i6 = i;
                            i++;
                            i2 = i6;
                        }
                    }
                    i2 = i;
                    i = -1;
                } else {
                    i2 = -1;
                    i = -1;
                }
                if (i == -1) {
                    int i7 = this.nextHeaderIndex + 1;
                    int length = this.dynamicTable.length;
                    while (true) {
                        if (i7 >= length) {
                            break;
                        }
                        int i8 = i7 + 1;
                        Header header2 = this.dynamicTable[i7];
                        C12775o.m28636f(header2);
                        if (C12775o.m28634d(header2.name, L)) {
                            Header header3 = this.dynamicTable[i7];
                            C12775o.m28636f(header3);
                            if (C12775o.m28634d(header3.value, fVar)) {
                                i = Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length + (i7 - this.nextHeaderIndex);
                                break;
                            } else if (i2 == -1) {
                                i2 = Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length + (i7 - this.nextHeaderIndex);
                            }
                        }
                        i7 = i8;
                    }
                }
                if (i != -1) {
                    writeInt(i, 127, 128);
                } else if (i2 == -1) {
                    this.out.writeByte(64);
                    writeByteString(L);
                    writeByteString(fVar);
                    insertIntoDynamicTable(header);
                } else if (!L.mo52591I(Header.PSEUDO_PREFIX) || C12775o.m28634d(Header.TARGET_AUTHORITY, L)) {
                    writeInt(i2, 63, 64);
                    writeByteString(fVar);
                    insertIntoDynamicTable(header);
                } else {
                    writeInt(i2, 15, 0);
                    writeByteString(fVar);
                }
                i4 = i5;
            }
        }

        public final void writeInt(int i, int i2, int i3) {
            if (i < i2) {
                this.out.writeByte(i | i3);
                return;
            }
            this.out.writeByte(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.out.writeByte(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.out.writeByte(i4);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Writer(C13121c cVar) {
            this(0, false, cVar, 3, (DefaultConstructorMarker) null);
            C12775o.m28639i(cVar, "out");
        }

        public Writer(int i, boolean z, C13121c cVar) {
            C12775o.m28639i(cVar, "out");
            this.headerTableSizeSetting = i;
            this.useCompression = z;
            this.out = cVar;
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            this.maxDynamicTableByteCount = i;
            Header[] headerArr = new Header[8];
            this.dynamicTable = headerArr;
            this.nextHeaderIndex = headerArr.length - 1;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Writer(int i, boolean z, C13121c cVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 4096 : i, (i2 & 2) != 0 ? true : z, cVar);
        }
    }

    static {
        Hpack hpack = new Hpack();
        INSTANCE = hpack;
        C13133f fVar = Header.TARGET_METHOD;
        C13133f fVar2 = Header.TARGET_PATH;
        C13133f fVar3 = Header.TARGET_SCHEME;
        C13133f fVar4 = Header.RESPONSE_STATUS;
        STATIC_HEADER_TABLE = new Header[]{new Header(Header.TARGET_AUTHORITY, ""), new Header(fVar, (String) ShareTarget.METHOD_GET), new Header(fVar, (String) ShareTarget.METHOD_POST), new Header(fVar2, "/"), new Header(fVar2, "/index.html"), new Header(fVar3, (String) ProxyConfig.MATCH_HTTP), new Header(fVar3, "https"), new Header(fVar4, "200"), new Header(fVar4, "204"), new Header(fVar4, "206"), new Header(fVar4, "304"), new Header(fVar4, "400"), new Header(fVar4, "404"), new Header(fVar4, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header("etag", ""), new Header("expect", ""), new Header("expires", ""), new Header((String) TypedValues.TransitionType.S_FROM, ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header("location", ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        NAME_TO_FIRST_INDEX = hpack.nameToFirstIndex();
    }

    private Hpack() {
    }

    private final Map<C13133f, Integer> nameToFirstIndex() {
        Header[] headerArr = STATIC_HEADER_TABLE;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length);
        int length = headerArr.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            Header[] headerArr2 = STATIC_HEADER_TABLE;
            if (!linkedHashMap.containsKey(headerArr2[i].name)) {
                linkedHashMap.put(headerArr2[i].name, Integer.valueOf(i));
            }
            i = i2;
        }
        Map<C13133f, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        C12775o.m28638h(unmodifiableMap, "unmodifiableMap(result)");
        return unmodifiableMap;
    }

    public final C13133f checkLowercase(C13133f fVar) {
        boolean z;
        C12775o.m28639i(fVar, HintConstants.AUTOFILL_HINT_NAME);
        int H = fVar.mo52590H();
        int i = 0;
        while (i < H) {
            int i2 = i + 1;
            byte g = fVar.mo52603g(i);
            if (65 > g || g > 90) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                i = i2;
            } else {
                throw new IOException(C12775o.m28647q("PROTOCOL_ERROR response malformed: mixed case name: ", fVar.mo52595N()));
            }
        }
        return fVar;
    }

    public final Map<C13133f, Integer> getNAME_TO_FIRST_INDEX() {
        return NAME_TO_FIRST_INDEX;
    }

    public final Header[] getSTATIC_HEADER_TABLE() {
        return STATIC_HEADER_TABLE;
    }
}
