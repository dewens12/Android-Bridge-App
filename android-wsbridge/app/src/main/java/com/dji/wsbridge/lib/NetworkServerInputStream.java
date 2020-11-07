/*
 * Copyright (c) 2016, DJI.  All rights reserved.
 */
package com.dji.wsbridge.lib;

import com.dji.wsbridge.lib.connection.WSConnectionManager;

import java.io.InputStream;
import java.nio.ByteBuffer;

public class NetworkServerInputStream extends InputStream {
    private final WSConnectionManager mServer;

    public NetworkServerInputStream(WSConnectionManager server) {
        mServer = server;
    }

    @Override
    public int read() {
        ByteBuffer buffer = mServer.read();
        return buffer.get();
    }

    @Override
    public int read(byte[] b) {
        ByteBuffer buffer = mServer.read();
        int len = Math.min(buffer.remaining(), b.length);
        buffer.get(b, 0, len);
        return len;
    }

    @Override
    public int read(byte[] b, int off, int len) {
        ByteBuffer buffer = mServer.read();
        len = Math.min(buffer.remaining(), b.length);
        buffer.get(b, off, len);
        return len;
    }
}
