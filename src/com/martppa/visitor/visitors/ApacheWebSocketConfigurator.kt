package com.martppa.visitor.visitors

import com.martppa.visitor.servers.websocket.ApacheWebSocketServer

open interface ApacheWebSocketConfigurator {

    fun visit(apacheWebSocketServer: ApacheWebSocketServer)
}