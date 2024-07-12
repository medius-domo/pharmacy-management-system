import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.cio.*
import io.ktor.server.engine.*
import io.ktor.server.html.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.html.*

fun main() {
    println("http://localhost:8080")
    embeddedServer(CIO, 8080) {
        routing {
            get("/") {
                call.respondHtml {
                    head {
                        title { +"Pharmacy Management System" }
                        link(rel = "stylesheet", href = "/style")
                    }
                    body {
                        NavigationBar()
                        div("content") {
                            h1 { +"Welcome to the Pharmacy Management System" }
                            p { +"Select an option from the navigation bar to get started." }
                        }
                    }
                }
            }
            // Define routes for other pages here
            get("/dashboard") {
                call.respondHtml {
                    head {
                        title { +"Dashboard" }
                        link(rel = "stylesheet", href = "/style")
                    }
                    body {
                        NavigationBar()
                        div("content") {
                            h1 { +"Dashboard" }
                            p { +"This is the dashboard page." }
                            a(href = "/", classes = "back-to-home") { +"Back to Home" }
                        }
                    }
                }
            }
            get("/inventory") {
                call.respondHtml {
                    head {
                        title { +"Inventory Management" }
                        link(rel = "stylesheet", href = "/style")
                    }
                    body {
                        NavigationBar()
                        div("content") {
                            h1 { +"Inventory Management" }
                            p { +"This is the inventory management page." }
                            a(href = "/", classes = "back-to-home") { +"Back to Home" }
                        }
                    }
                }
            }
            get("/sales") {
                call.respondHtml {
                    head {
                        title { +"Sales" }
                        link(rel = "stylesheet", href = "/style")
                    }
                    body {
                        NavigationBar()
                        div("content") {
                            h1 { +"Sales" }
                            p { +"This is the sales page." }
                            a(href = "/", classes = "back-to-home") { +"Back to Home" }
                        }
                    }
                }
            }
            get("/purchasing") {
                call.respondHtml {
                    head {
                        title { +"Purchasing" }
                        link(rel = "stylesheet", href = "/style")
                    }
                    body {
                        NavigationBar()
                        div("content") {
                            h1 { +"Purchasing" }
                            p { +"This is the purchasing page." }
                            a(href = "/", classes = "back-to-home") { +"Back to Home" }
                        }
                    }
                }
            }
            get("/prescriptions") {
                call.respondHtml {
                    head {
                        title { +"Prescriptions" }
                        link(rel = "stylesheet", href = "/style")
                    }
                    body {
                        NavigationBar()
                        div("content") {
                            h1 { +"Prescriptions" }
                            p { +"This is the prescriptions page." }
                            a(href = "/", classes = "back-to-home") { +"Back to Home" }
                        }
                    }
                }
            }
            get("/customers") {
                call.respondHtml {
                    head {
                        title { +"Customers" }
                        link(rel = "stylesheet", href = "/style")
                    }
                    body {
                        NavigationBar()
                        div("content") {
                            h1 { +"Customers" }
                            p { +"This is the customers page." }
                            a(href = "/", classes = "back-to-home") { +"Back to Home" }
                        }
                    }
                }
            }
            get("/reports") {
                call.respondHtml {
                    head {
                        title { +"Reports" }
                        link(rel = "stylesheet", href = "/style")
                    }
                    body {
                        NavigationBar()
                        div("content") {
                            h1 { +"Reports" }
                            p { +"This is the reports page." }
                            a(href = "/", classes = "back-to-home") { +"Back to Home" }
                        }
                    }
                }
            }
            get("/user-management") {
                call.respondHtml {
                    head {
                        title { +"User Management" }
                        link(rel = "stylesheet", href = "/style")
                    }
                    body {
                        NavigationBar()
                        div("content") {
                            h1 { +"User Management" }
                            p { +"This is the user management page." }
                            a(href = "/", classes = "back-to-home") { +"Back to Home" }
                        }
                    }
                }
            }
            get("/settings") {
                call.respondHtml {
                    head {
                        title { +"Settings" }
                        link(rel = "stylesheet", href = "/style")
                    }
                    body {
                        NavigationBar()
                        div("content") {
                            h1 { +"Settings" }
                            p { +"This is the settings page." }
                            a(href = "/", classes = "back-to-home") { +"Back to Home" }
                        }
                    }
                }
            }
            get("/help") {
                call.respondHtml {
                    head {
                        title { +"Help/Support" }
                        link(rel = "stylesheet", href = "/style")
                    }
                    body {
                        NavigationBar()
                        div("content") {
                            h1 { +"Help/Support" }
                            p { +"This is the help/support page." }
                            a(href = "/", classes = "back-to-home") { +"Back to Home" }
                        }
                    }
                }
            }
            get("style") {
                call.respondText(contentType = ContentType.Text.CSS) {
                    """
                        body {
                                background-color: #f4f4f9;
                                font-family: Arial, sans-serif;
                            }
                            .navbar {
                                overflow: hidden;
                                background-color: #333;
                            }
                            .navbar-list {
                                list-style-type: none;
                                margin: 0;
                                padding: 0;
                            }
                            .navbar-item {
                                float: left;
                            }
                            .navbar-link {
                                display: block;
                                color: white;
                                text-align: center;
                                padding: 14px 20px;
                                text-decoration: none;
                            }
                            .navbar-link:hover {
                                background-color: #575757;
                            }
                            .content {
                                padding: 20px;
                            }
                            .back-to-home {
                                display: block;
                                margin-top: 20px;
                                color: #333;
                                text-align: center;
                                padding: 10px;
                                text-decoration: none;
                                font-weight: bold;
                            }
                            .back-to-home:hover {
                                color: #575757;
                            }
                    """.trimIndent()
                }
            }
        }
    }.start(wait = true)

}

fun BODY.NavigationBar() = nav("navbar") {
    ul("navbar-list") {
        li("navbar-item") { a(href = "/", classes = "navbar-link") { +"Home" } }
        li("navbar-item") { a(href = "/dashboard", classes = "navbar-link") { +"Dashboard" } }
        li("navbar-item") { a(href = "/inventory", classes = "navbar-link") { +"Inventory Management" } }
        li("navbar-item") { a(href = "/sales", classes = "navbar-link") { +"Sales" } }
        li("navbar-item") { a(href = "/purchasing", classes = "navbar-link") { +"Purchasing" } }
        li("navbar-item") { a(href = "/prescriptions", classes = "navbar-link") { +"Prescriptions" } }
        li("navbar-item") { a(href = "/customers", classes = "navbar-link") { +"Customers" } }
        li("navbar-item") { a(href = "/reports", classes = "navbar-link") { +"Reports" } }
        li("navbar-item") { a(href = "/user-management", classes = "navbar-link") { +"User Management" } }
        li("navbar-item") { a(href = "/settings", classes = "navbar-link") { +"Settings" } }
        li("navbar-item") { a(href = "/help", classes = "navbar-link") { +"Help/Support" } }
    }
}
