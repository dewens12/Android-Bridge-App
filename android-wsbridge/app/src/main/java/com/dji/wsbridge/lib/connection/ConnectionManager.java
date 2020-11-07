package com.dji.wsbridge.lib.connection;

import java.util.ArrayList;

interface ConnectionManager {

// --Commented out by Inspection START (12/11/2018 11:21 AM):
//// --Commented out // --Commented out by Inspection (12/11/2018 11:21 AM):by Inspection START (12/11/2018 11:21 AM):
////    interface ConnectionCallback {
// --Commented out by Inspection STOP (12/11/2018 11:21 AM)
// --Commented out by Inspection START (12/11/2018 11:21 AM):
////        void onConnect(String message);
////        void onDisconnect(String message);
////    }
//// --Commented out by Inspection STOP (12/11/2018 11:21 AM)
// --Commented out by Inspection STOP (12/11/2018 11:21 AM)

    ArrayList<Object> getStreams(); // returns [InputStream, OutputStream]

    void closeStreams();
    // --Commented out by Inspection (12/11/2018 11:21 AM):void closeStreams();


}
