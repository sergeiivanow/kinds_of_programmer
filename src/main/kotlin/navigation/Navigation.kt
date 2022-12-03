import csstype.*
import pages.home.Home
import pages.test.Test
import react.FC
import react.Props
import react.create
import react.css.css
import react.dom.html.ReactHTML.div
import react.router.Route
import react.router.Routes
import react.router.dom.BrowserRouter

val Navigation = FC<Props> {
    div {
        css {
            display = Display.flex
            height = 100.vh
            paddingLeft = 24.px
            paddingRight = 24.px
            flexDirection = FlexDirection.column
        }
        Header()
        BrowserRouter {
            Routes {
                Route {
                    path = "/test"
                    element = Test.create()
                }
                Route {
                    path = "/"
                    element = Home.create()
                }
            }
        }
        Footer()
    }
}
