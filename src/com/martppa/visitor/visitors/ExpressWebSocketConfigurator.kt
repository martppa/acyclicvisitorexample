package com.martppa.visitor.visitors

import com.martppa.visitor.servers.websocket.ExpressWebSocketServer

open interface ExpressWebSocketConfigurator {

    fun visit(expressWebSocketServer: ExpressWebSocketServer)
}