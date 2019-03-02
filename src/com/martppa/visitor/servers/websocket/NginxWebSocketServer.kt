package com.martppa.visitor.servers.websocket

import com.martppa.visitor.servers.WebSocketServer
import com.martppa.visitor.servers.rest.NginxServer
import com.martppa.visitor.visitors.ApacheWebSocketConfigurator
import com.martppa.visitor.visitors.NginxWebSocketConfigurator
import com.martppa.visitor.visitors.Visitor


open class NginxWebSocketServer : WebSocketServer {

    override fun init() {
        // Whatever a server needs to start
    }

    override fun accept(visitor: Visitor) {
        try {
            val nginxWebSocketConfigurator = visitor as NginxWebSocketConfigurator
            nginxWebSocketConfigurator.visit(this)
        } catch (e: ClassCastException) {}
    }

    fun wrap(nginxServer: NginxServer) {
        println("Using nginx server to power web socket")
    }
}