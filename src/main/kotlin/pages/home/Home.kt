package pages.home
import csstype.*
import react.FC
import react.Props
import react.css.css
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.img
import react.router.dom.Link


external interface HomeProps : Props {
}

val Home = FC<HomeProps> {
    div {
        css {
            display = Display.flex
            flexDirection = FlexDirection.column
            alignItems = AlignItems.center
            flex = Flex.maxContent
        }
        img {
            css {
                backgroundSize = BackgroundSize.contain
                height = 400.px
            }
            src = "img/areyou.png"
        }
        Link {
            css {
                display = Display.flex
                justifyContent = JustifyContent.center
                width = 150.px
                padding = 10.px
                marginTop = 30.px
                borderRadius = 8.px
                textAlign = TextAlign.center
                border = Border(2.px, LineStyle.solid, Color("black"))
                textDecoration = TextDecoration.none
                fontFamily = FontFamily.sansSerif
                fontWeight = FontWeight.bold
                fontSize = FontSize.large
                color = Color("black")
            }
            to = "/test"
            +"Начать тест"
        }
    }
}

