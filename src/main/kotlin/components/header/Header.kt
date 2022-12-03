import csstype.*
import react.FC
import react.Props
import react.css.css
import react.dom.html.AnchorTarget
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.img

val Header = FC<Props> {
  div {
      css {
          display = Display.flex
          paddingTop = 24.px
          justifyContent = JustifyContent.spaceBetween
          alignItems = AlignItems.center
      }
      img {
          src = "img/twopeople.svg"
      }
      a {
          target = AnchorTarget._blank
          href = "https://www.youtube.com/watch?v=lOkecH37sAs&t=704s"
          +"вдохновлен - Как пройти в IT?"
      }
  }
}