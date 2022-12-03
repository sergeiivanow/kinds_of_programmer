import csstype.Color
import csstype.Display
import csstype.JustifyContent
import csstype.px
import react.FC
import react.Props
import react.css.css
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.div

val Footer = FC<Props> {
    div {
        css {
            display = Display.flex
            padding = 24.px
            justifyContent = JustifyContent.center
        }
        a {
            href = "https://github.com/sergeiivanow/kinds_of_programmer"
            +"исходник тут"
        }
    }
}