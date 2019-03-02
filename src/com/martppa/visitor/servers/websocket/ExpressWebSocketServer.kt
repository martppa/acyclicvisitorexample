package com.martppa.visitor.servers.websocket

import com.martppa.visitor.servers.WebSocketServer
import com.martppa.visitor.servers.rest.ExpressServer
import com.martppa.visitor.visitors.ExpressWebSocketConfigurator
import com.martppa.visitor.visitors.Visitor


open class ExpressWebSocketServer : WebSocketServer {

    override fun init() {
        // Whatever a server needs to start
    }

    override fun accept(visitor: Visitor) {
        try {
            val expressWebSocketConfigurator = visitor as ExpressWebSocketConfigurator
            expressWebSocketConfigurator.visit(this)
        } catch (e: ClassCastException) {}
    }

    fun wrap(expressServer: ExpressServer) {
        println("Using express server to power web socket")
    }
}