/** Program main */
package com.martppa.visitor

import com.martppa.visitor.servers.WebSocketServer
import com.martppa.visitor.servers.websocket.ApacheWebSocketServer
import com.martppa.visitor.servers.websocket.ExpressWebSocketServer
import com.martppa.visitor.servers.websocket.NginxWebSocketServer
import com.martppa.visitor.visitors.WebSocketConfigurator

fun main(args: Array<String>) {
    val webSocketConfigurator = WebSocketConfigurator()

    val apacheWebSocketServer: WebSocketServer = ApacheWebSocketServer()
    apacheWebSocketServer.accept(webSocketConfigurator)

    val nginxWebSocketServer: WebSocketServer = NginxWebSocketServer()
    nginxWebSocketServer.accept(webSocketConfigurator)

    val expressWebSocketServer: WebSocketServer = ExpressWebSocketServer()
    expressWebSocketServer.accept(webSocketConfigurator)
}