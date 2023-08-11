package com.rmn.apiclient.core.data.serializer;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SpecificParserList implements Iterable<ISpecificParser> {
    @NonNull
    private final List<ISpecificParser> parsers = new ArrayList();

    public SpecificParserList(@NonNull ISpecificParser... iSpecificParserArr) {
        int length = iSpecificParserArr.length;
        int i = 0;
        while (i < length) {
            ISpecificParser iSpecificParser = iSpecificParserArr[i];
            if (iSpecificParser != null) {
                this.parsers.add(iSpecificParser);
                i++;
            } else {
                throw new IllegalArgumentException("A parser in parameters is null");
            }
        }
    }

    @NonNull
    public Iterator<ISpecificParser> iterator() {
        return this.parsers.iterator();
    }
}
